.class public final synthetic LRc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LRc/e;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(LRc/e;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    .locals 0

    .line 1
    iput p4, p0, LRc/c;->a:I

    iput-object p1, p0, LRc/c;->b:LRc/e;

    iput-object p2, p0, LRc/c;->c:Ljava/util/Map;

    iput-object p3, p0, LRc/c;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LRc/c;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LRc/c;->c:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v2, v1, LRc/c;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 11
    .line 12
    iget-object v3, v1, LRc/c;->b:LRc/e;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :try_start_0
    const-string v4, "enabled"

    .line 18
    .line 19
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    check-cast v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4, v0}, LN8/c;->b(Ljava/lang/Boolean;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, LNc/d;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v3, v4}, LRc/e;->a(LRc/e;Ls8/g;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-string v4, "isCrashlyticsCollectionEnabled"

    .line 53
    .line 54
    invoke-virtual {v0, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void

    .line 66
    :pswitch_0
    iget-object v0, v1, LRc/c;->c:Ljava/util/Map;

    .line 67
    .line 68
    iget-object v2, v1, LRc/c;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 69
    .line 70
    iget-object v3, v1, LRc/c;->b:LRc/e;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    :try_start_1
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v4, "exception"

    .line 80
    .line 81
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    const-string v5, "reason"

    .line 91
    .line 92
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Ljava/lang/String;

    .line 97
    .line 98
    const-string v6, "information"

    .line 99
    .line 100
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-object v11, v6

    .line 108
    check-cast v11, Ljava/lang/String;

    .line 109
    .line 110
    const-string v6, "fatal"

    .line 111
    .line 112
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    check-cast v6, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    const-string v7, "buildId"

    .line 126
    .line 127
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-static {v7}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    check-cast v7, Ljava/lang/String;

    .line 135
    .line 136
    const-string v8, "loadingUnits"

    .line 137
    .line 138
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-static {v8}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    check-cast v8, Ljava/util/List;

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-lez v9, :cond_0

    .line 152
    .line 153
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    iget-object v9, v9, LN8/c;->a:LR8/s;

    .line 158
    .line 159
    const-string v10, "com.crashlytics.flutter.build-id.0"

    .line 160
    .line 161
    iget-object v12, v9, LR8/s;->p:LS8/f;

    .line 162
    .line 163
    iget-object v12, v12, LS8/f;->a:LS8/c;

    .line 164
    .line 165
    new-instance v13, LR8/q;

    .line 166
    .line 167
    const/4 v14, 0x1

    .line 168
    invoke-direct {v13, v9, v10, v7, v14}, LR8/q;-><init>(LR8/s;Ljava/lang/String;Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v13}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 172
    .line 173
    .line 174
    :cond_0
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    const/4 v9, 0x0

    .line 179
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-eqz v10, :cond_1

    .line 184
    .line 185
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    check-cast v10, Ljava/lang/String;

    .line 190
    .line 191
    add-int/lit8 v9, v9, 0x1

    .line 192
    .line 193
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    new-instance v13, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v14, "com.crashlytics.flutter.build-id."

    .line 200
    .line 201
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    iget-object v12, v12, LN8/c;->a:LR8/s;

    .line 212
    .line 213
    iget-object v14, v12, LR8/s;->p:LS8/f;

    .line 214
    .line 215
    iget-object v14, v14, LS8/f;->a:LS8/c;

    .line 216
    .line 217
    new-instance v15, LR8/q;

    .line 218
    .line 219
    const/4 v8, 0x1

    .line 220
    invoke-direct {v15, v12, v13, v10, v8}, LR8/q;-><init>(LR8/s;Ljava/lang/String;Ljava/lang/String;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v14, v15}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_1
    iget-object v8, v3, LN8/c;->a:LR8/s;

    .line 228
    .line 229
    if-eqz v5, :cond_2

    .line 230
    .line 231
    :try_start_2
    const-string v3, "flutter_error_reason"

    .line 232
    .line 233
    new-instance v7, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v9, "thrown "

    .line 239
    .line 240
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    iget-object v9, v8, LR8/s;->p:LS8/f;

    .line 251
    .line 252
    iget-object v9, v9, LS8/f;->a:LS8/c;

    .line 253
    .line 254
    new-instance v10, LR8/q;

    .line 255
    .line 256
    const/4 v12, 0x0

    .line 257
    invoke-direct {v10, v8, v3, v7, v12}, LR8/q;-><init>(LR8/s;Ljava/lang/String;Ljava/lang/String;I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9, v10}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 261
    .line 262
    .line 263
    new-instance v3, Lio/flutter/plugins/firebase/crashlytics/FlutterError;

    .line 264
    .line 265
    new-instance v7, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string v9, ". Error thrown "

    .line 274
    .line 275
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v5, "."

    .line 282
    .line 283
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-direct {v3, v5}, Lio/flutter/plugins/firebase/crashlytics/FlutterError;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :catch_1
    move-exception v0

    .line 295
    goto/16 :goto_5

    .line 296
    .line 297
    :cond_2
    new-instance v3, Lio/flutter/plugins/firebase/crashlytics/FlutterError;

    .line 298
    .line 299
    invoke-direct {v3, v4}, Lio/flutter/plugins/firebase/crashlytics/FlutterError;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :goto_2
    const-string v5, "flutter_error_exception"

    .line 303
    .line 304
    iget-object v7, v8, LR8/s;->p:LS8/f;

    .line 305
    .line 306
    iget-object v7, v7, LS8/f;->a:LS8/c;

    .line 307
    .line 308
    new-instance v9, LR8/q;

    .line 309
    .line 310
    const/4 v10, 0x0

    .line 311
    invoke-direct {v9, v8, v5, v4, v10}, LR8/q;-><init>(LR8/s;Ljava/lang/String;Ljava/lang/String;I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v7, v9}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 315
    .line 316
    .line 317
    new-instance v4, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .line 321
    .line 322
    const-string v5, "stackTraceElements"

    .line 323
    .line 324
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    check-cast v0, Ljava/util/List;

    .line 332
    .line 333
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-eqz v5, :cond_4

    .line 342
    .line 343
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    check-cast v5, Ljava/util/Map;

    .line 348
    .line 349
    invoke-static {v5}, LRc/e;->b(Ljava/util/Map;)Ljava/lang/StackTraceElement;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    if-eqz v5, :cond_3

    .line 354
    .line 355
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_3

    .line 359
    :cond_4
    const/4 v0, 0x0

    .line 360
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 361
    .line 362
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    check-cast v0, [Ljava/lang/StackTraceElement;

    .line 367
    .line 368
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    if-nez v0, :cond_5

    .line 376
    .line 377
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 378
    .line 379
    .line 380
    move-result-wide v4

    .line 381
    iget-wide v9, v8, LR8/s;->d:J

    .line 382
    .line 383
    sub-long v9, v4, v9

    .line 384
    .line 385
    iget-object v0, v8, LR8/s;->p:LS8/f;

    .line 386
    .line 387
    iget-object v0, v0, LS8/f;->a:LS8/c;

    .line 388
    .line 389
    new-instance v7, LR8/o;

    .line 390
    .line 391
    const/4 v12, 0x1

    .line 392
    invoke-direct/range {v7 .. v12}, LR8/o;-><init>(LR8/s;JLjava/lang/String;I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v7}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 396
    .line 397
    .line 398
    :cond_5
    if-eqz v6, :cond_6

    .line 399
    .line 400
    invoke-static {v3}, Lr7/e;->K(Lio/flutter/plugins/firebase/crashlytics/FlutterError;)V

    .line 401
    .line 402
    .line 403
    goto :goto_4

    .line 404
    :cond_6
    iget-object v0, v8, LR8/s;->p:LS8/f;

    .line 405
    .line 406
    iget-object v0, v0, LS8/f;->a:LS8/c;

    .line 407
    .line 408
    new-instance v4, LR8/p;

    .line 409
    .line 410
    const/4 v5, 0x0

    .line 411
    invoke-direct {v4, v8, v3, v5}, LR8/p;-><init>(LR8/s;Lio/flutter/plugins/firebase/crashlytics/FlutterError;I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0, v4}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 415
    .line 416
    .line 417
    :goto_4
    const/4 v0, 0x0

    .line 418
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 419
    .line 420
    .line 421
    goto :goto_6

    .line 422
    :goto_5
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 423
    .line 424
    .line 425
    :goto_6
    return-void

    .line 426
    nop

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
