.class public final Lcom/google/android/gms/common/api/internal/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/common/api/internal/e0;->a:I

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/common/api/internal/q;Lcom/google/android/gms/common/api/internal/p;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/common/api/internal/e0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p0, Lcom/google/android/gms/common/api/internal/e0;->a:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LF7/g;

    .line 11
    .line 12
    iget-object v2, v0, LF7/g;->b:Ld7/b;

    .line 13
    .line 14
    invoke-virtual {v2}, Ld7/b;->V()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Lcom/google/android/gms/common/api/internal/U;

    .line 21
    .line 22
    if-eqz v3, :cond_5

    .line 23
    .line 24
    iget-object v0, v0, LF7/g;->c:Lcom/google/android/gms/common/internal/F;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Lcom/google/android/gms/common/internal/F;->c:Ld7/b;

    .line 30
    .line 31
    invoke-virtual {v2}, Ld7/b;->V()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Ljava/lang/Exception;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v3, "Sign-in succeeded with resolve account failure: "

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v3, "SignInCoordinator"

    .line 53
    .line 54
    invoke-static {v3, v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    iget-object v0, v4, Lcom/google/android/gms/common/api/internal/U;->g:LF6/r;

    .line 58
    .line 59
    invoke-virtual {v0, v2}, LF6/r;->g(Ld7/b;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v4, Lcom/google/android/gms/common/api/internal/U;->f:LF7/a;

    .line 63
    .line 64
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_0
    iget-object v2, v4, Lcom/google/android/gms/common/api/internal/U;->g:LF6/r;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/google/android/gms/common/internal/F;->b:Landroid/os/IBinder;

    .line 71
    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    move-object v5, v1

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    sget v3, Lcom/google/android/gms/common/internal/a;->a:I

    .line 77
    .line 78
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 79
    .line 80
    invoke-interface {v0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    instance-of v6, v5, Lcom/google/android/gms/common/internal/o;

    .line 85
    .line 86
    if-eqz v6, :cond_2

    .line 87
    .line 88
    check-cast v5, Lcom/google/android/gms/common/internal/o;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    new-instance v5, Lcom/google/android/gms/common/internal/Z;

    .line 92
    .line 93
    invoke-direct {v5, v0, v3}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    iget-object v0, v4, Lcom/google/android/gms/common/api/internal/U;->d:Ljava/util/Set;

    .line 102
    .line 103
    if-nez v0, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    iput-object v5, v2, LF6/r;->e:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v0, v2, LF6/r;->f:Ljava/lang/Object;

    .line 109
    .line 110
    iget-boolean v1, v2, LF6/r;->b:Z

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    iget-object v1, v2, LF6/r;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lcom/google/android/gms/common/api/g;

    .line 117
    .line 118
    invoke-interface {v1, v5, v0}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/o;Ljava/util/Set;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/Exception;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v3, "GoogleApiManager"

    .line 128
    .line 129
    const-string v5, "Received null response from onSignInSuccess"

    .line 130
    .line 131
    invoke-static {v3, v5, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 132
    .line 133
    .line 134
    new-instance v0, Ld7/b;

    .line 135
    .line 136
    const/4 v3, 0x4

    .line 137
    invoke-direct {v0, v3, v1, v1}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v0}, LF6/r;->g(Ld7/b;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    iget-object v0, v4, Lcom/google/android/gms/common/api/internal/U;->g:LF6/r;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, LF6/r;->g(Ld7/b;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    :goto_2
    iget-object v0, v4, Lcom/google/android/gms/common/api/internal/U;->f:LF7/a;

    .line 150
    .line 151
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 152
    .line 153
    .line 154
    :goto_3
    return-void

    .line 155
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lcom/google/android/gms/common/api/internal/q;

    .line 158
    .line 159
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Lcom/google/android/gms/common/api/internal/p;

    .line 162
    .line 163
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/q;->b:Ljava/lang/Object;

    .line 164
    .line 165
    if-nez v0, :cond_7

    .line 166
    .line 167
    invoke-interface {v1}, Lcom/google/android/gms/common/api/internal/p;->onNotifyListenerFailed()V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_7
    :try_start_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/common/api/internal/p;->notifyListener(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    .line 174
    :goto_4
    return-void

    .line 175
    :catch_0
    move-exception v0

    .line 176
    invoke-interface {v1}, Lcom/google/android/gms/common/api/internal/p;->onNotifyListenerFailed()V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :pswitch_1
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v2, LF6/r;

    .line 183
    .line 184
    iget-object v3, v2, LF6/r;->g:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v3, Lcom/google/android/gms/common/api/internal/i;

    .line 187
    .line 188
    iget-object v3, v3, Lcom/google/android/gms/common/api/internal/i;->j:Lj$/util/concurrent/ConcurrentHashMap;

    .line 189
    .line 190
    iget-object v4, v2, LF6/r;->d:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v4, Lcom/google/android/gms/common/api/internal/b;

    .line 193
    .line 194
    invoke-virtual {v3, v4}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, Lcom/google/android/gms/common/api/internal/H;

    .line 199
    .line 200
    if-nez v3, :cond_8

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_8
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v4, Ld7/b;

    .line 206
    .line 207
    invoke-virtual {v4}, Ld7/b;->V()Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_a

    .line 212
    .line 213
    iput-boolean v0, v2, LF6/r;->b:Z

    .line 214
    .line 215
    iget-object v0, v2, LF6/r;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lcom/google/android/gms/common/api/g;

    .line 218
    .line 219
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_9

    .line 224
    .line 225
    iget-boolean v1, v2, LF6/r;->b:Z

    .line 226
    .line 227
    if-eqz v1, :cond_b

    .line 228
    .line 229
    iget-object v1, v2, LF6/r;->e:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Lcom/google/android/gms/common/internal/o;

    .line 232
    .line 233
    if-eqz v1, :cond_b

    .line 234
    .line 235
    iget-object v2, v2, LF6/r;->f:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v2, Ljava/util/Set;

    .line 238
    .line 239
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/o;Ljava/util/Set;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_9
    :try_start_1
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->getScopesForConnectionlessNonSignIn()Ljava/util/Set;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/o;Ljava/util/Set;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :catch_1
    move-exception v2

    .line 252
    const-string v4, "GoogleApiManager"

    .line 253
    .line 254
    const-string v5, "Failed to get service from broker. "

    .line 255
    .line 256
    invoke-static {v4, v5, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 257
    .line 258
    .line 259
    const-string v2, "Failed to get service from broker."

    .line 260
    .line 261
    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance v0, Ld7/b;

    .line 265
    .line 266
    const/16 v2, 0xa

    .line 267
    .line 268
    invoke-direct {v0, v2, v1, v1}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v0, v1}, Lcom/google/android/gms/common/api/internal/H;->m(Ld7/b;Ljava/lang/RuntimeException;)V

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_a
    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/common/api/internal/H;->m(Ld7/b;Ljava/lang/RuntimeException;)V

    .line 276
    .line 277
    .line 278
    :cond_b
    :goto_5
    return-void

    .line 279
    :pswitch_2
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v2, Lcom/google/android/gms/common/api/internal/E;

    .line 282
    .line 283
    iget-boolean v2, v2, Lcom/google/android/gms/common/api/internal/E;->a:Z

    .line 284
    .line 285
    if-nez v2, :cond_c

    .line 286
    .line 287
    goto/16 :goto_9

    .line 288
    .line 289
    :cond_c
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v2, Lcom/google/android/gms/common/api/internal/d0;

    .line 292
    .line 293
    iget-object v2, v2, Lcom/google/android/gms/common/api/internal/d0;->b:Ld7/b;

    .line 294
    .line 295
    iget v3, v2, Ld7/b;->b:I

    .line 296
    .line 297
    const/4 v4, 0x0

    .line 298
    if-eqz v3, :cond_d

    .line 299
    .line 300
    iget-object v3, v2, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 301
    .line 302
    if-eqz v3, :cond_d

    .line 303
    .line 304
    move v3, v0

    .line 305
    goto :goto_6

    .line 306
    :cond_d
    move v3, v4

    .line 307
    :goto_6
    if-eqz v3, :cond_e

    .line 308
    .line 309
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v1, Lcom/google/android/gms/common/api/internal/E;

    .line 312
    .line 313
    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/m;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/n;

    .line 314
    .line 315
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/m;->getActivity()Landroid/app/Activity;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    iget-object v2, v2, Ld7/b;->c:Landroid/app/PendingIntent;

    .line 320
    .line 321
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v5, Lcom/google/android/gms/common/api/internal/d0;

    .line 327
    .line 328
    iget v5, v5, Lcom/google/android/gms/common/api/internal/d0;->a:I

    .line 329
    .line 330
    sget v6, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 331
    .line 332
    new-instance v6, Landroid/content/Intent;

    .line 333
    .line 334
    const-class v7, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 335
    .line 336
    invoke-direct {v6, v1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 337
    .line 338
    .line 339
    const-string v1, "pending_intent"

    .line 340
    .line 341
    invoke-virtual {v6, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 342
    .line 343
    .line 344
    const-string v1, "failing_client_id"

    .line 345
    .line 346
    invoke-virtual {v6, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 347
    .line 348
    .line 349
    const-string v1, "notify_manager"

    .line 350
    .line 351
    invoke-virtual {v6, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 352
    .line 353
    .line 354
    invoke-interface {v3, v6, v0}, Lcom/google/android/gms/common/api/internal/n;->startActivityForResult(Landroid/content/Intent;I)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_9

    .line 358
    .line 359
    :cond_e
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v3, Lcom/google/android/gms/common/api/internal/E;

    .line 362
    .line 363
    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/m;->getActivity()Landroid/app/Activity;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    iget v6, v2, Ld7/b;->b:I

    .line 368
    .line 369
    iget-object v3, v3, Lcom/google/android/gms/common/api/internal/E;->d:Ld7/e;

    .line 370
    .line 371
    invoke-virtual {v3, v5, v6, v1}, Ld7/f;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    if-eqz v3, :cond_f

    .line 376
    .line 377
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, Lcom/google/android/gms/common/api/internal/E;

    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/m;->getActivity()Landroid/app/Activity;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/m;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/n;

    .line 386
    .line 387
    iget v2, v2, Ld7/b;->b:I

    .line 388
    .line 389
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v4, Lcom/google/android/gms/common/api/internal/E;

    .line 392
    .line 393
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/E;->d:Ld7/e;

    .line 394
    .line 395
    invoke-virtual {v0, v1, v3, v2, v4}, Ld7/e;->i(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/n;ILandroid/content/DialogInterface$OnCancelListener;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_9

    .line 399
    .line 400
    :cond_f
    iget v3, v2, Ld7/b;->b:I

    .line 401
    .line 402
    const/16 v5, 0x12

    .line 403
    .line 404
    if-ne v3, v5, :cond_12

    .line 405
    .line 406
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v2, Lcom/google/android/gms/common/api/internal/E;

    .line 409
    .line 410
    iget-object v3, v2, Lcom/google/android/gms/common/api/internal/E;->d:Ld7/e;

    .line 411
    .line 412
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/m;->getActivity()Landroid/app/Activity;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    new-instance v3, Landroid/widget/ProgressBar;

    .line 420
    .line 421
    const v7, 0x101007a

    .line 422
    .line 423
    .line 424
    invoke-direct {v3, v6, v1, v7}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 431
    .line 432
    .line 433
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 434
    .line 435
    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 439
    .line 440
    .line 441
    invoke-static {v6, v5}, Lcom/google/android/gms/common/internal/B;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 446
    .line 447
    .line 448
    const-string v3, ""

    .line 449
    .line 450
    invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    const-string v3, "GooglePlayServicesUpdatingDialog"

    .line 458
    .line 459
    invoke-static {v6, v0, v3, v2}, Ld7/e;->g(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 460
    .line 461
    .line 462
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v2, Lcom/google/android/gms/common/api/internal/E;

    .line 465
    .line 466
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/m;->getActivity()Landroid/app/Activity;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    new-instance v4, Lcom/google/android/gms/common/api/internal/D;

    .line 475
    .line 476
    invoke-direct {v4, p0, v0}, Lcom/google/android/gms/common/api/internal/D;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    iget-object v2, v2, Lcom/google/android/gms/common/api/internal/E;->d:Ld7/e;

    .line 480
    .line 481
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    new-instance v2, Landroid/content/IntentFilter;

    .line 485
    .line 486
    const-string v5, "android.intent.action.PACKAGE_ADDED"

    .line 487
    .line 488
    invoke-direct {v2, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    const-string v5, "package"

    .line 492
    .line 493
    invoke-virtual {v2, v5}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    new-instance v5, LK8/r;

    .line 497
    .line 498
    invoke-direct {v5, v4}, LK8/r;-><init>(Lcom/google/android/gms/common/api/internal/D;)V

    .line 499
    .line 500
    .line 501
    invoke-static {v3, v5, v2}, Lcom/google/android/gms/internal/base/zao;->zaa(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 502
    .line 503
    .line 504
    iput-object v3, v5, LK8/r;->b:Ljava/lang/Object;

    .line 505
    .line 506
    invoke-static {v3}, Ld7/i;->c(Landroid/content/Context;)Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-nez v2, :cond_13

    .line 511
    .line 512
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v2, Lcom/google/android/gms/common/api/internal/E;

    .line 515
    .line 516
    iget-object v3, v2, Lcom/google/android/gms/common/api/internal/E;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 517
    .line 518
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    iget-object v2, v2, Lcom/google/android/gms/common/api/internal/E;->f:Lcom/google/android/gms/common/api/internal/i;

    .line 522
    .line 523
    iget-object v2, v2, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 524
    .line 525
    const/4 v3, 0x3

    .line 526
    invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    if-eqz v2, :cond_10

    .line 538
    .line 539
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 540
    .line 541
    .line 542
    :cond_10
    monitor-enter v5

    .line 543
    :try_start_2
    iget-object v0, v5, LK8/r;->b:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v0, Landroid/content/Context;

    .line 546
    .line 547
    if-eqz v0, :cond_11

    .line 548
    .line 549
    invoke-virtual {v0, v5}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 550
    .line 551
    .line 552
    goto :goto_7

    .line 553
    :catchall_0
    move-exception v0

    .line 554
    goto :goto_8

    .line 555
    :cond_11
    :goto_7
    iput-object v1, v5, LK8/r;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 556
    .line 557
    monitor-exit v5

    .line 558
    goto :goto_9

    .line 559
    :goto_8
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 560
    throw v0

    .line 561
    :cond_12
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v0, Lcom/google/android/gms/common/api/internal/E;

    .line 564
    .line 565
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/e0;->b:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v3, Lcom/google/android/gms/common/api/internal/d0;

    .line 568
    .line 569
    iget v3, v3, Lcom/google/android/gms/common/api/internal/d0;->a:I

    .line 570
    .line 571
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/E;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 572
    .line 573
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/E;->f:Lcom/google/android/gms/common/api/internal/i;

    .line 577
    .line 578
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/common/api/internal/i;->j(Ld7/b;I)V

    .line 579
    .line 580
    .line 581
    :cond_13
    :goto_9
    return-void

    .line 582
    nop

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
