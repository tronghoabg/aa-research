.class public Lqd/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/logging/Logger;

.field public static final c:[Ljava/lang/String;

.field public static final d:Lqd/k;


# instance fields
.field public final a:Ljava/security/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    const-string v0, "org.eclipse.jetty.alpn.ALPN"

    .line 2
    .line 3
    const/4 v3, 0x1

    .line 4
    const-class v4, Lqd/k;

    .line 5
    .line 6
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v5

    .line 10
    invoke-static {v5}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    sput-object v5, Lqd/k;->b:Ljava/util/logging/Logger;

    .line 15
    .line 16
    const-string v5, "org.conscrypt.OpenSSLProvider"

    .line 17
    .line 18
    const-string v6, "com.android.org.conscrypt.OpenSSLProvider"

    .line 19
    .line 20
    const-string v7, "com.google.android.gms.org.conscrypt.OpenSSLProvider"

    .line 21
    .line 22
    const-string v8, "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider"

    .line 23
    .line 24
    const-string v9, "com.google.android.libraries.stitch.sslguard.SslGuardProvider"

    .line 25
    .line 26
    filled-new-array {v7, v5, v6, v8, v9}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    sput-object v5, Lqd/k;->c:[Ljava/lang/String;

    .line 31
    .line 32
    const-class v5, Ljava/net/Socket;

    .line 33
    .line 34
    const-class v6, Ljavax/net/ssl/SSLSocket;

    .line 35
    .line 36
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    array-length v8, v7

    .line 41
    const/4 v9, 0x0

    .line 42
    :goto_0
    sget-object v10, Lqd/k;->b:Ljava/util/logging/Logger;

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    if-ge v9, v8, :cond_2

    .line 46
    .line 47
    aget-object v12, v7, v9

    .line 48
    .line 49
    sget-object v13, Lqd/k;->c:[Ljava/lang/String;

    .line 50
    .line 51
    array-length v14, v13

    .line 52
    const/4 v15, 0x0

    .line 53
    :goto_1
    if-ge v15, v14, :cond_1

    .line 54
    .line 55
    aget-object v1, v13, v15

    .line 56
    .line 57
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v16

    .line 61
    const/16 v17, 0x0

    .line 62
    .line 63
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 74
    .line 75
    const-string v7, "Found registered provider {0}"

    .line 76
    .line 77
    invoke-virtual {v10, v2, v7, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object/from16 v23, v12

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_0
    add-int/2addr v15, v3

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/16 v17, 0x0

    .line 86
    .line 87
    add-int/2addr v9, v3

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const/16 v17, 0x0

    .line 90
    .line 91
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 92
    .line 93
    const-string v2, "Unable to find Conscrypt"

    .line 94
    .line 95
    invoke-virtual {v10, v1, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object/from16 v23, v11

    .line 99
    .line 100
    :goto_2
    if-eqz v23, :cond_5

    .line 101
    .line 102
    new-instance v1, Lme/a;

    .line 103
    .line 104
    new-array v0, v3, [Ljava/lang/Class;

    .line 105
    .line 106
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    aput-object v2, v0, v17

    .line 109
    .line 110
    const-string v2, "setUseSessionTickets"

    .line 111
    .line 112
    invoke-direct {v1, v11, v2, v0}, Lme/a;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lme/a;

    .line 116
    .line 117
    new-array v0, v3, [Ljava/lang/Class;

    .line 118
    .line 119
    const-class v6, Ljava/lang/String;

    .line 120
    .line 121
    aput-object v6, v0, v17

    .line 122
    .line 123
    const-string v6, "setHostname"

    .line 124
    .line 125
    invoke-direct {v2, v11, v6, v0}, Lme/a;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 126
    .line 127
    .line 128
    new-instance v6, Lme/a;

    .line 129
    .line 130
    move/from16 v0, v17

    .line 131
    .line 132
    new-array v7, v0, [Ljava/lang/Class;

    .line 133
    .line 134
    const-string v8, "getAlpnSelectedProtocol"

    .line 135
    .line 136
    const-class v9, [B

    .line 137
    .line 138
    invoke-direct {v6, v9, v8, v7}, Lme/a;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 139
    .line 140
    .line 141
    new-instance v7, Lme/a;

    .line 142
    .line 143
    const-string v8, "setAlpnProtocols"

    .line 144
    .line 145
    new-array v12, v3, [Ljava/lang/Class;

    .line 146
    .line 147
    aput-object v9, v12, v0

    .line 148
    .line 149
    invoke-direct {v7, v11, v8, v12}, Lme/a;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 150
    .line 151
    .line 152
    :try_start_0
    const-string v8, "android.net.TrafficStats"

    .line 153
    .line 154
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    const-string v9, "tagSocket"

    .line 159
    .line 160
    new-array v11, v3, [Ljava/lang/Class;

    .line 161
    .line 162
    aput-object v5, v11, v0

    .line 163
    .line 164
    invoke-virtual {v8, v9, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 165
    .line 166
    .line 167
    const-string v9, "untagSocket"

    .line 168
    .line 169
    new-array v11, v3, [Ljava/lang/Class;

    .line 170
    .line 171
    aput-object v5, v11, v0

    .line 172
    .line 173
    invoke-virtual {v8, v9, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    .line 175
    .line 176
    :catch_0
    invoke-virtual/range {v23 .. v23}, Ljava/security/Provider;->getName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    const-string v5, "GmsCore_OpenSSL"

    .line 181
    .line 182
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_4

    .line 187
    .line 188
    invoke-virtual/range {v23 .. v23}, Ljava/security/Provider;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    const-string v5, "Conscrypt"

    .line 193
    .line 194
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-nez v0, :cond_4

    .line 199
    .line 200
    invoke-virtual/range {v23 .. v23}, Ljava/security/Provider;->getName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v5, "Ssl_Guard"

    .line 205
    .line 206
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_3

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_3
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const-string v5, "android.net.Network"

    .line 218
    .line 219
    invoke-virtual {v0, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 220
    .line 221
    .line 222
    :cond_4
    :goto_3
    move/from16 v24, v3

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :catch_1
    move-exception v0

    .line 226
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 227
    .line 228
    const-string v5, "Can\'t find class"

    .line 229
    .line 230
    invoke-virtual {v10, v3, v5, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const-string v3, "android.app.ActivityOptions"

    .line 238
    .line 239
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 240
    .line 241
    .line 242
    const/16 v24, 0x2

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :catch_2
    move-exception v0

    .line 246
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 247
    .line 248
    invoke-virtual {v10, v3, v5, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    const/4 v0, 0x3

    .line 252
    move/from16 v24, v0

    .line 253
    .line 254
    :goto_4
    new-instance v18, Lqd/g;

    .line 255
    .line 256
    move-object/from16 v19, v1

    .line 257
    .line 258
    move-object/from16 v20, v2

    .line 259
    .line 260
    move-object/from16 v21, v6

    .line 261
    .line 262
    move-object/from16 v22, v7

    .line 263
    .line 264
    invoke-direct/range {v18 .. v24}, Lqd/g;-><init>(Lme/a;Lme/a;Lme/a;Lme/a;Ljava/security/Provider;I)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_6

    .line 268
    .line 269
    :cond_5
    :try_start_3
    invoke-static {}, Ljavax/net/ssl/SSLContext;->getDefault()Ljavax/net/ssl/SSLContext;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getProvider()Ljava/security/Provider;

    .line 274
    .line 275
    .line 276
    move-result-object v1
    :try_end_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_6

    .line 277
    :try_start_4
    const-string v2, "TLS"

    .line 278
    .line 279
    invoke-static {v2, v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v2, v11, v11, v11}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->createSSLEngine()Ljavax/net/ssl/SSLEngine;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    new-instance v4, Lqd/f;

    .line 291
    .line 292
    const/4 v5, 0x0

    .line 293
    invoke-direct {v4, v5}, Lqd/f;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-static {v4}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    check-cast v4, Ljava/lang/reflect/Method;

    .line 301
    .line 302
    new-array v7, v5, [Ljava/lang/Object;

    .line 303
    .line 304
    invoke-virtual {v4, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    new-instance v2, Lqd/f;

    .line 308
    .line 309
    invoke-direct {v2, v3}, Lqd/f;-><init>(I)V

    .line 310
    .line 311
    .line 312
    invoke-static {v2}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    check-cast v2, Ljava/lang/reflect/Method;

    .line 317
    .line 318
    new-instance v4, Lqd/f;

    .line 319
    .line 320
    const/4 v5, 0x2

    .line 321
    invoke-direct {v4, v5}, Lqd/f;-><init>(I)V

    .line 322
    .line 323
    .line 324
    invoke-static {v4}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    check-cast v4, Ljava/lang/reflect/Method;

    .line 329
    .line 330
    new-instance v5, Lqd/h;

    .line 331
    .line 332
    invoke-direct {v5, v1, v2, v4}, Lqd/h;-><init>(Ljava/security/Provider;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/security/KeyManagementException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/security/PrivilegedActionException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_3

    .line 333
    .line 334
    .line 335
    move-object/from16 v18, v5

    .line 336
    .line 337
    goto/16 :goto_6

    .line 338
    .line 339
    :catch_3
    :try_start_5
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    new-instance v4, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    const-string v5, "$Provider"

    .line 352
    .line 353
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    new-instance v5, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    const-string v7, "$ClientProvider"

    .line 373
    .line 374
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v22

    .line 385
    new-instance v5, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v0, "$ServerProvider"

    .line 394
    .line 395
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-result-object v23

    .line 406
    const-string v0, "put"

    .line 407
    .line 408
    const/4 v5, 0x2

    .line 409
    new-array v5, v5, [Ljava/lang/Class;

    .line 410
    .line 411
    const/16 v17, 0x0

    .line 412
    .line 413
    aput-object v6, v5, v17

    .line 414
    .line 415
    aput-object v4, v5, v3

    .line 416
    .line 417
    invoke-virtual {v2, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 418
    .line 419
    .line 420
    move-result-object v19

    .line 421
    const-string v0, "get"

    .line 422
    .line 423
    new-array v4, v3, [Ljava/lang/Class;

    .line 424
    .line 425
    aput-object v6, v4, v17

    .line 426
    .line 427
    invoke-virtual {v2, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 428
    .line 429
    .line 430
    move-result-object v20

    .line 431
    const-string v0, "remove"

    .line 432
    .line 433
    new-array v3, v3, [Ljava/lang/Class;

    .line 434
    .line 435
    aput-object v6, v3, v17

    .line 436
    .line 437
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 438
    .line 439
    .line 440
    move-result-object v21

    .line 441
    new-instance v18, Lqd/i;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_5

    .line 442
    .line 443
    move-object/from16 v24, v1

    .line 444
    .line 445
    :try_start_6
    invoke-direct/range {v18 .. v24}, Lqd/i;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;Ljava/security/Provider;)V
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_4

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :catch_4
    move-object/from16 v0, v24

    .line 450
    .line 451
    goto :goto_5

    .line 452
    :catch_5
    move-object v0, v1

    .line 453
    :goto_5
    new-instance v1, Lqd/k;

    .line 454
    .line 455
    invoke-direct {v1, v0}, Lqd/k;-><init>(Ljava/security/Provider;)V

    .line 456
    .line 457
    .line 458
    move-object/from16 v18, v1

    .line 459
    .line 460
    :goto_6
    sput-object v18, Lqd/k;->d:Lqd/k;

    .line 461
    .line 462
    return-void

    .line 463
    :catch_6
    move-exception v0

    .line 464
    new-instance v1, Ljava/lang/RuntimeException;

    .line 465
    .line 466
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 467
    .line 468
    .line 469
    throw v1
.end method

.method public constructor <init>(Ljava/security/Provider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd/k;->a:Ljava/security/Provider;

    .line 5
    .line 6
    return-void
.end method

.method public static b(Ljava/util/List;)[B
    .locals 5

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lqd/l;

    .line 18
    .line 19
    sget-object v4, Lqd/l;->b:Lqd/l;

    .line 20
    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v4, v3, Lqd/l;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v0, v4}, Lcg/g;->X(I)V

    .line 31
    .line 32
    .line 33
    iget-object v3, v3, Lqd/l;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lcg/g;->d0(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-wide v1, v0, Lcg/g;->b:J

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lcg/g;->readByteArray(J)[B

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method


# virtual methods
.method public a(Ljavax/net/ssl/SSLSocket;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public e()I
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    return v0
.end method
