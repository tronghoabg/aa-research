.class public final synthetic LYc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LYc/f;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(LYc/f;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    .locals 0

    .line 1
    iput p3, p0, LYc/d;->a:I

    iput-object p1, p0, LYc/d;->b:LYc/f;

    iput-object p2, p0, LYc/d;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LYc/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYc/d;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 7
    .line 8
    iget-object v1, p0, LYc/d;->b:LYc/f;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v4, 0x21

    .line 21
    .line 22
    if-lt v3, v4, :cond_1

    .line 23
    .line 24
    sget-object v1, Lka/e0;->h:Landroid/content/Context;

    .line 25
    .line 26
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, v1, LYc/f;->c:Landroid/app/Activity;

    .line 39
    .line 40
    new-instance v3, LX0/N;

    .line 41
    .line 42
    invoke-direct {v3, v1}, LX0/N;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, LX0/N;->a()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    const-string v3, "authorizationStatus"

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception v1

    .line 63
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    return-void

    .line 67
    :pswitch_0
    iget-object v0, p0, LYc/d;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 68
    .line 69
    iget-object v1, p0, LYc/d;->b:LYc/f;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :try_start_1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 82
    .line 83
    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v3, LW9/l;

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-direct {v3, v1, v2, v4}, LW9/l;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v1, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    new-instance v2, LNc/d;

    .line 108
    .line 109
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v3, "token"

    .line 113
    .line 114
    invoke-virtual {v2, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :catch_1
    move-exception v1

    .line 122
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    return-void

    .line 126
    :pswitch_1
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 127
    .line 128
    iget-object v1, p0, LYc/d;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 129
    .line 130
    iget-object v2, p0, LYc/d;->b:LYc/f;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v3, Ljava/util/HashMap;

    .line 136
    .line 137
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 138
    .line 139
    .line 140
    :try_start_2
    sget-object v4, Lka/e0;->h:Landroid/content/Context;

    .line 141
    .line 142
    invoke-virtual {v4, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v6, 0x1

    .line 148
    if-nez v4, :cond_2

    .line 149
    .line 150
    move v4, v6

    .line 151
    goto :goto_3

    .line 152
    :cond_2
    move v4, v5

    .line 153
    :goto_3
    if-nez v4, :cond_5

    .line 154
    .line 155
    iget-object v4, v2, LYc/f;->j:LYc/g;

    .line 156
    .line 157
    iget-object v2, v2, LYc/f;->c:Landroid/app/Activity;

    .line 158
    .line 159
    new-instance v7, LA5/h;

    .line 160
    .line 161
    const/16 v8, 0x1a

    .line 162
    .line 163
    invoke-direct {v7, v8, v3, v1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-boolean v3, v4, LYc/g;->b:Z

    .line 167
    .line 168
    if-eqz v3, :cond_3

    .line 169
    .line 170
    new-instance v0, Ljava/lang/Exception;

    .line 171
    .line 172
    const-string v2, "A request for permissions is already running, please wait for it to finish before doing another request."

    .line 173
    .line 174
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_3
    if-nez v2, :cond_4

    .line 182
    .line 183
    new-instance v0, Ljava/lang/Exception;

    .line 184
    .line 185
    const-string v2, "Unable to detect current Android Activity."

    .line 186
    .line 187
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_4
    iput-object v7, v4, LYc/g;->c:Ljava/lang/Object;

    .line 195
    .line 196
    new-instance v3, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    new-array v0, v5, [Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, [Ljava/lang/String;

    .line 211
    .line 212
    iget-boolean v3, v4, LYc/g;->b:Z

    .line 213
    .line 214
    if-nez v3, :cond_6

    .line 215
    .line 216
    const/16 v3, 0xf0

    .line 217
    .line 218
    invoke-static {v2, v0, v3}, LX0/b;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    iput-boolean v6, v4, LYc/g;->b:Z

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :catch_2
    move-exception v0

    .line 225
    goto :goto_4

    .line 226
    :cond_5
    const-string v0, "authorizationStatus"

    .line 227
    .line 228
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :goto_4
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 240
    .line 241
    .line 242
    :cond_6
    :goto_5
    return-void

    .line 243
    :pswitch_2
    iget-object v0, p0, LYc/d;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 244
    .line 245
    iget-object v1, p0, LYc/d;->b:LYc/f;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    :try_start_3
    iget-object v2, v1, LYc/f;->h:LW9/t;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 251
    .line 252
    const-string v3, "notification"

    .line 253
    .line 254
    const/4 v4, 0x0

    .line 255
    if-eqz v2, :cond_8

    .line 256
    .line 257
    :try_start_4
    invoke-static {v2}, Lp7/b;->N(LW9/t;)Ljava/util/HashMap;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    iget-object v5, v1, LYc/f;->i:Ljava/util/Map;

    .line 262
    .line 263
    if-eqz v5, :cond_7

    .line 264
    .line 265
    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    :cond_7
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iput-object v4, v1, LYc/f;->h:LW9/t;

    .line 272
    .line 273
    iput-object v4, v1, LYc/f;->i:Ljava/util/Map;

    .line 274
    .line 275
    goto/16 :goto_b

    .line 276
    .line 277
    :catch_3
    move-exception v1

    .line 278
    goto/16 :goto_a

    .line 279
    .line 280
    :cond_8
    iget-object v2, v1, LYc/f;->c:Landroid/app/Activity;

    .line 281
    .line 282
    if-nez v2, :cond_9

    .line 283
    .line 284
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_b

    .line 288
    .line 289
    :cond_9
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    if-eqz v2, :cond_12

    .line 294
    .line 295
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    if-nez v5, :cond_a

    .line 300
    .line 301
    goto/16 :goto_9

    .line 302
    .line 303
    :cond_a
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    const-string v6, "google.message_id"

    .line 308
    .line 309
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    if-nez v5, :cond_b

    .line 314
    .line 315
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const-string v5, "message_id"

    .line 320
    .line 321
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 325
    :cond_b
    if-eqz v5, :cond_11

    .line 326
    .line 327
    iget-object v1, v1, LYc/f;->a:Ljava/util/HashMap;

    .line 328
    .line 329
    :try_start_5
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    if-eqz v2, :cond_c

    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_c
    sget-object v2, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    .line 337
    .line 338
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    check-cast v2, LW9/t;

    .line 343
    .line 344
    if-nez v2, :cond_e

    .line 345
    .line 346
    invoke-static {}, LY9/c;->h()LY9/c;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    invoke-virtual {v6, v5}, LY9/c;->g(Ljava/lang/String;)Ljava/util/HashMap;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    if-eqz v6, :cond_d

    .line 355
    .line 356
    invoke-static {v6}, Lp7/b;->F(Ljava/util/Map;)LW9/t;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    if-eqz v7, :cond_d

    .line 365
    .line 366
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    check-cast v6, Ljava/util/Map;

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_d
    move-object v6, v4

    .line 374
    :goto_6
    invoke-static {}, LY9/c;->h()LY9/c;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    invoke-virtual {v7, v5}, LY9/c;->o(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_e
    move-object v6, v4

    .line 383
    :goto_7
    if-nez v2, :cond_f

    .line 384
    .line 385
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    goto :goto_b

    .line 389
    :cond_f
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    invoke-static {v2}, Lp7/b;->N(LW9/t;)Ljava/util/HashMap;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-virtual {v2}, LW9/t;->X()LW9/s;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    if-nez v2, :cond_10

    .line 403
    .line 404
    if-eqz v6, :cond_10

    .line 405
    .line 406
    invoke-virtual {v1, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    :cond_10
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_11
    :goto_8
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    goto :goto_b

    .line 417
    :cond_12
    :goto_9
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 418
    .line 419
    .line 420
    goto :goto_b

    .line 421
    :goto_a
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 422
    .line 423
    .line 424
    :goto_b
    return-void

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
