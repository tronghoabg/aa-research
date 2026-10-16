.class public final synthetic LPc/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LPc/d;


# direct methods
.method public synthetic constructor <init>(LPc/d;I)V
    .locals 0

    .line 1
    iput p2, p0, LPc/n;->a:I

    iput-object p1, p0, LPc/n;->b:LPc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 13

    .line 1
    iget v0, p0, LPc/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LPc/m;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LPc/F;

    .line 26
    .line 27
    iget-object v3, p0, LPc/n;->b:LPc/d;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-static {v2}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, v2, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 37
    .line 38
    iget-object v4, p1, LPc/F;->a:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iput-boolean v4, v3, LK8/f;->a:Z

    .line 45
    .line 46
    iget-object v3, p1, LPc/F;->e:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    iget-object v2, v2, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iput-boolean v3, v2, LK8/f;->b:Z

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception v0

    .line 60
    move-object p1, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    iget-object v3, p1, LPc/F;->c:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    iget-object p1, p1, LPc/F;->d:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iput-object v3, v2, LK8/f;->c:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object p1, v2, LK8/f;->d:Ljava/lang/Object;

    .line 73
    .line 74
    :cond_1
    const/4 p1, 0x0

    .line 75
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :goto_1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    return-void

    .line 90
    :pswitch_0
    iget-object v0, p0, LPc/n;->b:LPc/d;

    .line 91
    .line 92
    new-instance v1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    check-cast p1, Ljava/util/ArrayList;

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, LPc/m;

    .line 105
    .line 106
    const/4 v4, 0x1

    .line 107
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    :try_start_2
    invoke-static {v3}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez p1, :cond_2

    .line 121
    .line 122
    iget-object p1, v0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    .line 123
    .line 124
    monitor-enter p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 125
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iput-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 130
    .line 131
    monitor-exit p1

    .line 132
    goto :goto_3

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    :try_start_4
    throw v0

    .line 136
    :cond_2
    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->e(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->a()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v1}, Lba/a;->c(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :catch_1
    move-exception v0

    .line 151
    move-object p1, v0

    .line 152
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :goto_4
    return-void

    .line 160
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    check-cast p1, Ljava/util/ArrayList;

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, LPc/m;

    .line 173
    .line 174
    const/4 v2, 0x1

    .line 175
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ljava/lang/String;

    .line 180
    .line 181
    const/4 v3, 0x2

    .line 182
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, LPc/C;

    .line 187
    .line 188
    new-instance v3, LPc/o;

    .line 189
    .line 190
    const/4 v4, 0x2

    .line 191
    invoke-direct {v3, v0, p2, v4}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 192
    .line 193
    .line 194
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->V(LPc/C;)LJ8/b;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-boolean v0, p1, LJ8/b;->g:Z

    .line 214
    .line 215
    if-eqz v0, :cond_4

    .line 216
    .line 217
    iget-object v0, p2, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 218
    .line 219
    if-eqz v0, :cond_3

    .line 220
    .line 221
    iput-object v0, p1, LJ8/b;->h:Ljava/lang/String;

    .line 222
    .line 223
    :cond_3
    new-instance v0, LJ8/M;

    .line 224
    .line 225
    const/4 v1, 0x0

    .line 226
    invoke-direct {v0, p2, v2, p1, v1}, LJ8/M;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;LJ8/b;I)V

    .line 227
    .line 228
    .line 229
    iget-object p1, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v1, p2, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 232
    .line 233
    invoke-virtual {v0, p2, p1, v1}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    new-instance p2, LPc/b;

    .line 238
    .line 239
    const/4 v0, 0x6

    .line 240
    invoke-direct {p2, v3, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 248
    .line 249
    const-string p2, "You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in."

    .line 250
    .line 251
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p1

    .line 255
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    check-cast p1, Ljava/util/ArrayList;

    .line 261
    .line 262
    const/4 v1, 0x0

    .line 263
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, LPc/m;

    .line 268
    .line 269
    const/4 v2, 0x1

    .line 270
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, Ljava/lang/String;

    .line 275
    .line 276
    const/4 v3, 0x2

    .line 277
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    check-cast p1, LPc/C;

    .line 282
    .line 283
    new-instance v3, LPc/q;

    .line 284
    .line 285
    const/4 v4, 0x1

    .line 286
    invoke-direct {v3, v0, p2, v4}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 287
    .line 288
    .line 289
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 290
    .line 291
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    if-nez p1, :cond_5

    .line 299
    .line 300
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    const/4 p1, 0x0

    .line 307
    invoke-virtual {p2, v2, p1}, Lcom/google/firebase/auth/FirebaseAuth;->c(Ljava/lang/String;LJ8/b;)Lcom/google/android/gms/tasks/Task;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    new-instance p2, LPc/c;

    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    invoke-direct {p2, v3, v0}, LPc/c;-><init>(LPc/q;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_5
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->V(LPc/C;)LJ8/b;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {p2, v2, p1}, Lcom/google/firebase/auth/FirebaseAuth;->c(Ljava/lang/String;LJ8/b;)Lcom/google/android/gms/tasks/Task;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    new-instance p2, LPc/c;

    .line 330
    .line 331
    const/4 v0, 0x1

    .line 332
    invoke-direct {p2, v3, v0}, LPc/c;-><init>(LPc/q;I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 336
    .line 337
    .line 338
    :goto_5
    return-void

    .line 339
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    check-cast p1, Ljava/util/ArrayList;

    .line 345
    .line 346
    const/4 v1, 0x0

    .line 347
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    check-cast v1, LPc/m;

    .line 352
    .line 353
    const/4 v2, 0x1

    .line 354
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    check-cast p1, Ljava/lang/String;

    .line 359
    .line 360
    new-instance v2, LPc/p;

    .line 361
    .line 362
    const/4 v3, 0x1

    .line 363
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 364
    .line 365
    .line 366
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 367
    .line 368
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    iget-object v0, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 382
    .line 383
    iget-object v1, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 384
    .line 385
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 386
    .line 387
    invoke-virtual {v1, p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzc(Ls8/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    new-instance p2, LPc/b;

    .line 392
    .line 393
    const/16 v0, 0x8

    .line 394
    .line 395
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 405
    .line 406
    .line 407
    check-cast p1, Ljava/util/ArrayList;

    .line 408
    .line 409
    const/4 v1, 0x0

    .line 410
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    check-cast p1, LPc/m;

    .line 415
    .line 416
    iget-object v2, p0, LPc/n;->b:LPc/d;

    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    :try_start_5
    invoke-static {p1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    iget-object v3, v2, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 426
    .line 427
    if-eqz v3, :cond_6

    .line 428
    .line 429
    sget-object v3, LPc/k;->a:Ljava/util/HashMap;

    .line 430
    .line 431
    iget-object p1, p1, LPc/m;->a:Ljava/lang/String;

    .line 432
    .line 433
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    check-cast p1, Ljava/util/Map;

    .line 438
    .line 439
    if-eqz p1, :cond_6

    .line 440
    .line 441
    iget-object v3, v2, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 442
    .line 443
    check-cast v3, LK8/e;

    .line 444
    .line 445
    iget-object v3, v3, LK8/e;->b:LK8/U;

    .line 446
    .line 447
    iget-object v3, v3, LK8/U;->a:Ljava/lang/String;

    .line 448
    .line 449
    invoke-interface {p1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    goto :goto_6

    .line 453
    :catch_2
    move-exception v0

    .line 454
    move-object p1, v0

    .line 455
    goto :goto_7

    .line 456
    :cond_6
    :goto_6
    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->q()V

    .line 457
    .line 458
    .line 459
    iget-object p1, v2, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 460
    .line 461
    if-eqz p1, :cond_7

    .line 462
    .line 463
    iget-object p1, p1, LK8/z;->b:LK8/l;

    .line 464
    .line 465
    iget-object v2, p1, LK8/l;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 466
    .line 467
    iget-object p1, p1, LK8/l;->e:LA7/p;

    .line 468
    .line 469
    invoke-virtual {v2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 470
    .line 471
    .line 472
    :cond_7
    const/4 p1, 0x0

    .line 473
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 477
    .line 478
    .line 479
    goto :goto_8

    .line 480
    :goto_7
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 481
    .line 482
    .line 483
    move-result-object p1

    .line 484
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    :goto_8
    return-void

    .line 488
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    .line 489
    .line 490
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 491
    .line 492
    .line 493
    check-cast p1, Ljava/util/ArrayList;

    .line 494
    .line 495
    const/4 v1, 0x0

    .line 496
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    check-cast v1, LPc/m;

    .line 501
    .line 502
    const/4 v2, 0x1

    .line 503
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    check-cast p1, LPc/K;

    .line 508
    .line 509
    new-instance v2, LPc/o;

    .line 510
    .line 511
    const/4 v3, 0x1

    .line 512
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 513
    .line 514
    .line 515
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 516
    .line 517
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    iget-object v1, p1, LPc/K;->a:Ljava/lang/String;

    .line 525
    .line 526
    invoke-static {v1}, Lgc/b;->C(Ljava/lang/String;)LS3/s;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    iget-object v3, p1, LPc/K;->b:Ljava/util/List;

    .line 531
    .line 532
    iget-object v4, v1, LS3/s;->b:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v4, Landroid/os/Bundle;

    .line 535
    .line 536
    if-eqz v3, :cond_8

    .line 537
    .line 538
    new-instance v5, Ljava/util/ArrayList;

    .line 539
    .line 540
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 541
    .line 542
    .line 543
    const-string v3, "com.google.firebase.auth.KEY_PROVIDER_SCOPES"

    .line 544
    .line 545
    invoke-virtual {v4, v3, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 546
    .line 547
    .line 548
    :cond_8
    iget-object p1, p1, LPc/K;->c:Ljava/util/Map;

    .line 549
    .line 550
    if-eqz p1, :cond_9

    .line 551
    .line 552
    invoke-virtual {v1, p1}, LS3/s;->b(Ljava/util/Map;)V

    .line 553
    .line 554
    .line 555
    :cond_9
    iget-object p1, p2, LPc/d;->c:Landroid/app/Activity;

    .line 556
    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 564
    .line 565
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 566
    .line 567
    .line 568
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->t:LK8/F;

    .line 569
    .line 570
    iget-object v1, v1, LK8/F;->b:LE4/F;

    .line 571
    .line 572
    const/4 v3, 0x0

    .line 573
    invoke-virtual {v1, p1, p2, v0, v3}, LE4/F;->y(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)Z

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    if-nez v1, :cond_a

    .line 578
    .line 579
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 580
    .line 581
    const/16 p2, 0x42a1

    .line 582
    .line 583
    invoke-direct {p1, p2, v3, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 584
    .line 585
    .line 586
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 587
    .line 588
    .line 589
    move-result-object p1

    .line 590
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    goto :goto_9

    .line 595
    :cond_a
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    invoke-static {v1, v0}, LK8/x;->b(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 600
    .line 601
    .line 602
    new-instance v0, Landroid/content/Intent;

    .line 603
    .line 604
    const-string v1, "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"

    .line 605
    .line 606
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    const-class v1, Lcom/google/firebase/auth/internal/GenericIdpActivity;

    .line 610
    .line 611
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 612
    .line 613
    .line 614
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 622
    .line 623
    .line 624
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    :goto_9
    new-instance p2, LPc/b;

    .line 632
    .line 633
    const/4 v0, 0x4

    .line 634
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :pswitch_6
    new-instance v0, Ljava/util/ArrayList;

    .line 642
    .line 643
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 644
    .line 645
    .line 646
    check-cast p1, Ljava/util/ArrayList;

    .line 647
    .line 648
    const/4 v1, 0x0

    .line 649
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    check-cast v1, LPc/m;

    .line 654
    .line 655
    const/4 v2, 0x1

    .line 656
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    check-cast v2, Ljava/lang/String;

    .line 661
    .line 662
    const/4 v3, 0x2

    .line 663
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object p1

    .line 667
    check-cast p1, Ljava/lang/String;

    .line 668
    .line 669
    new-instance v3, LPc/q;

    .line 670
    .line 671
    const/4 v4, 0x0

    .line 672
    invoke-direct {v3, v0, p2, v4}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 673
    .line 674
    .line 675
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 676
    .line 677
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 681
    .line 682
    .line 683
    move-result-object p2

    .line 684
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-static {v2, p1}, Lcom/moloco/sdk/internal/publisher/H;->X(Ljava/lang/String;Ljava/lang/String;)LJ8/e;

    .line 688
    .line 689
    .line 690
    move-result-object p1

    .line 691
    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/FirebaseAuth;->g(LJ8/d;)Lcom/google/android/gms/tasks/Task;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    new-instance p2, LPc/b;

    .line 696
    .line 697
    const/16 v0, 0xa

    .line 698
    .line 699
    invoke-direct {p2, v3, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 703
    .line 704
    .line 705
    return-void

    .line 706
    :pswitch_7
    new-instance v0, Ljava/util/ArrayList;

    .line 707
    .line 708
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 709
    .line 710
    .line 711
    check-cast p1, Ljava/util/ArrayList;

    .line 712
    .line 713
    const/4 v1, 0x0

    .line 714
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    check-cast v1, LPc/m;

    .line 719
    .line 720
    const/4 v2, 0x1

    .line 721
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object p1

    .line 725
    check-cast p1, Ljava/lang/String;

    .line 726
    .line 727
    new-instance v2, LPc/o;

    .line 728
    .line 729
    const/4 v3, 0x0

    .line 730
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 731
    .line 732
    .line 733
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 734
    .line 735
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 739
    .line 740
    .line 741
    move-result-object p2

    .line 742
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    iget-object v0, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 749
    .line 750
    new-instance v1, LJ8/g;

    .line 751
    .line 752
    invoke-direct {v1, p2}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 753
    .line 754
    .line 755
    iget-object v3, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 756
    .line 757
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 758
    .line 759
    invoke-virtual {v3, p2, p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;Ljava/lang/String;Ljava/lang/String;LK8/J;)Lcom/google/android/gms/tasks/Task;

    .line 760
    .line 761
    .line 762
    move-result-object p1

    .line 763
    new-instance p2, LPc/b;

    .line 764
    .line 765
    const/4 v0, 0x1

    .line 766
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 770
    .line 771
    .line 772
    return-void

    .line 773
    :pswitch_8
    new-instance v0, Ljava/util/ArrayList;

    .line 774
    .line 775
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 776
    .line 777
    .line 778
    check-cast p1, Ljava/util/ArrayList;

    .line 779
    .line 780
    const/4 v1, 0x0

    .line 781
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    check-cast v1, LPc/m;

    .line 786
    .line 787
    const/4 v2, 0x1

    .line 788
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object p1

    .line 792
    check-cast p1, Ljava/util/Map;

    .line 793
    .line 794
    new-instance v2, LPc/p;

    .line 795
    .line 796
    const/4 v3, 0x4

    .line 797
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 798
    .line 799
    .line 800
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 801
    .line 802
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 806
    .line 807
    .line 808
    move-result-object p2

    .line 809
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->W(Ljava/util/Map;)LJ8/d;

    .line 810
    .line 811
    .line 812
    move-result-object p1

    .line 813
    if-eqz p1, :cond_b

    .line 814
    .line 815
    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/FirebaseAuth;->g(LJ8/d;)Lcom/google/android/gms/tasks/Task;

    .line 816
    .line 817
    .line 818
    move-result-object p1

    .line 819
    new-instance p2, LPc/b;

    .line 820
    .line 821
    const/4 v0, 0x3

    .line 822
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 826
    .line 827
    .line 828
    return-void

    .line 829
    :cond_b
    invoke-static {}, La/a;->A()LPc/t;

    .line 830
    .line 831
    .line 832
    move-result-object p1

    .line 833
    throw p1

    .line 834
    :pswitch_9
    new-instance v0, Ljava/util/ArrayList;

    .line 835
    .line 836
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 837
    .line 838
    .line 839
    check-cast p1, Ljava/util/ArrayList;

    .line 840
    .line 841
    const/4 v1, 0x0

    .line 842
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v1

    .line 846
    check-cast v1, LPc/m;

    .line 847
    .line 848
    const/4 v2, 0x1

    .line 849
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    move-object v5, v2

    .line 854
    check-cast v5, Ljava/lang/String;

    .line 855
    .line 856
    const/4 v2, 0x2

    .line 857
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object p1

    .line 861
    move-object v8, p1

    .line 862
    check-cast v8, Ljava/lang/String;

    .line 863
    .line 864
    new-instance p1, LPc/p;

    .line 865
    .line 866
    const/4 v2, 0x0

    .line 867
    invoke-direct {p1, v0, p2, v2}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 868
    .line 869
    .line 870
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 871
    .line 872
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    invoke-static {v8}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    iget-object v9, v4, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 889
    .line 890
    new-instance v3, LJ8/P;

    .line 891
    .line 892
    const/4 v6, 0x0

    .line 893
    const/4 v7, 0x0

    .line 894
    invoke-direct/range {v3 .. v9}, LJ8/P;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLJ8/o;Ljava/lang/String;Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    iget-object p2, v4, Lcom/google/firebase/auth/FirebaseAuth;->n:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 898
    .line 899
    invoke-virtual {v3, v4, v9, p2}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 900
    .line 901
    .line 902
    move-result-object p2

    .line 903
    new-instance v0, LB8/b;

    .line 904
    .line 905
    const/16 v1, 0x1c

    .line 906
    .line 907
    invoke-direct {v0, p1, v1}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 911
    .line 912
    .line 913
    return-void

    .line 914
    :pswitch_a
    new-instance v0, Ljava/util/ArrayList;

    .line 915
    .line 916
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 917
    .line 918
    .line 919
    check-cast p1, Ljava/util/ArrayList;

    .line 920
    .line 921
    const/4 v1, 0x0

    .line 922
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object p1

    .line 926
    check-cast p1, LPc/m;

    .line 927
    .line 928
    new-instance v2, LPc/o;

    .line 929
    .line 930
    const/4 v3, 0x4

    .line 931
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 932
    .line 933
    .line 934
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 935
    .line 936
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    invoke-static {p1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 940
    .line 941
    .line 942
    move-result-object p1

    .line 943
    iget-object p2, p1, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 944
    .line 945
    if-eqz p2, :cond_c

    .line 946
    .line 947
    invoke-virtual {p2}, LJ8/o;->W()Z

    .line 948
    .line 949
    .line 950
    move-result p2

    .line 951
    if-eqz p2, :cond_c

    .line 952
    .line 953
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 954
    .line 955
    check-cast p1, LK8/e;

    .line 956
    .line 957
    iput-boolean v1, p1, LK8/e;->j:Z

    .line 958
    .line 959
    new-instance p2, LK8/T;

    .line 960
    .line 961
    invoke-direct {p2, p1}, LK8/T;-><init>(LK8/e;)V

    .line 962
    .line 963
    .line 964
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 965
    .line 966
    .line 967
    move-result-object p1

    .line 968
    goto :goto_a

    .line 969
    :cond_c
    new-instance p2, LJ8/g;

    .line 970
    .line 971
    invoke-direct {p2, p1}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 972
    .line 973
    .line 974
    iget-object v0, p1, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 975
    .line 976
    iget-object v1, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 977
    .line 978
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 979
    .line 980
    invoke-virtual {v1, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LK8/J;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 981
    .line 982
    .line 983
    move-result-object p1

    .line 984
    :goto_a
    new-instance p2, LPc/b;

    .line 985
    .line 986
    const/4 v0, 0x7

    .line 987
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 988
    .line 989
    .line 990
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 991
    .line 992
    .line 993
    return-void

    .line 994
    :pswitch_b
    new-instance v0, Ljava/util/ArrayList;

    .line 995
    .line 996
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 997
    .line 998
    .line 999
    check-cast p1, Ljava/util/ArrayList;

    .line 1000
    .line 1001
    const/4 v1, 0x0

    .line 1002
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    check-cast v1, LPc/m;

    .line 1007
    .line 1008
    const/4 v2, 0x1

    .line 1009
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    check-cast v2, Ljava/lang/String;

    .line 1014
    .line 1015
    const/4 v3, 0x2

    .line 1016
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object p1

    .line 1020
    check-cast p1, Ljava/lang/String;

    .line 1021
    .line 1022
    new-instance v3, LPc/q;

    .line 1023
    .line 1024
    const/4 v4, 0x3

    .line 1025
    invoke-direct {v3, v0, p2, v4}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1026
    .line 1027
    .line 1028
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 1029
    .line 1030
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1034
    .line 1035
    .line 1036
    move-result-object p2

    .line 1037
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    new-instance v0, LJ8/L;

    .line 1047
    .line 1048
    const/4 v1, 0x0

    .line 1049
    invoke-direct {v0, p2, v2, p1, v1}, LJ8/L;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1050
    .line 1051
    .line 1052
    iget-object p1, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 1053
    .line 1054
    iget-object v1, p2, Lcom/google/firebase/auth/FirebaseAuth;->o:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 1055
    .line 1056
    invoke-virtual {v0, p2, p1, v1}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 1057
    .line 1058
    .line 1059
    move-result-object p1

    .line 1060
    new-instance p2, LPc/b;

    .line 1061
    .line 1062
    const/16 v0, 0x9

    .line 1063
    .line 1064
    invoke-direct {p2, v3, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1068
    .line 1069
    .line 1070
    return-void

    .line 1071
    :pswitch_c
    new-instance v0, Ljava/util/ArrayList;

    .line 1072
    .line 1073
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1074
    .line 1075
    .line 1076
    check-cast p1, Ljava/util/ArrayList;

    .line 1077
    .line 1078
    const/4 v1, 0x0

    .line 1079
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    check-cast v1, LPc/m;

    .line 1084
    .line 1085
    const/4 v2, 0x1

    .line 1086
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v2

    .line 1090
    check-cast v2, Ljava/lang/String;

    .line 1091
    .line 1092
    const/4 v3, 0x2

    .line 1093
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object p1

    .line 1097
    check-cast p1, Ljava/lang/String;

    .line 1098
    .line 1099
    new-instance v3, LPc/p;

    .line 1100
    .line 1101
    const/4 v4, 0x3

    .line 1102
    invoke-direct {v3, v0, p2, v4}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1103
    .line 1104
    .line 1105
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 1106
    .line 1107
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1108
    .line 1109
    .line 1110
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1111
    .line 1112
    .line 1113
    move-result-object p2

    .line 1114
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    iget-object v0, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 1124
    .line 1125
    iget-object v1, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1126
    .line 1127
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1128
    .line 1129
    invoke-virtual {v1, p2, v2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 1130
    .line 1131
    .line 1132
    move-result-object p1

    .line 1133
    new-instance p2, LPc/b;

    .line 1134
    .line 1135
    const/4 v0, 0x5

    .line 1136
    invoke-direct {p2, v3, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1140
    .line 1141
    .line 1142
    return-void

    .line 1143
    :pswitch_d
    new-instance v0, Ljava/util/ArrayList;

    .line 1144
    .line 1145
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    check-cast p1, Ljava/util/ArrayList;

    .line 1149
    .line 1150
    const/4 v1, 0x0

    .line 1151
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v1

    .line 1155
    check-cast v1, LPc/m;

    .line 1156
    .line 1157
    const/4 v2, 0x1

    .line 1158
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object p1

    .line 1162
    check-cast p1, Ljava/lang/String;

    .line 1163
    .line 1164
    new-instance v2, LPc/o;

    .line 1165
    .line 1166
    const/4 v3, 0x3

    .line 1167
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1168
    .line 1169
    .line 1170
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 1171
    .line 1172
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1176
    .line 1177
    .line 1178
    move-result-object p2

    .line 1179
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1183
    .line 1184
    .line 1185
    iget-object v0, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 1186
    .line 1187
    iget-object v1, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1188
    .line 1189
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1190
    .line 1191
    invoke-virtual {v1, p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzb(Ls8/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 1192
    .line 1193
    .line 1194
    move-result-object p1

    .line 1195
    new-instance p2, LPc/b;

    .line 1196
    .line 1197
    const/4 v0, 0x2

    .line 1198
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1202
    .line 1203
    .line 1204
    return-void

    .line 1205
    :pswitch_e
    new-instance v0, Ljava/util/ArrayList;

    .line 1206
    .line 1207
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1208
    .line 1209
    .line 1210
    check-cast p1, Ljava/util/ArrayList;

    .line 1211
    .line 1212
    const/4 v1, 0x0

    .line 1213
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    check-cast v1, LPc/m;

    .line 1218
    .line 1219
    const/4 v2, 0x1

    .line 1220
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object p1

    .line 1224
    check-cast p1, Ljava/lang/String;

    .line 1225
    .line 1226
    new-instance v2, LPc/q;

    .line 1227
    .line 1228
    const/4 v3, 0x2

    .line 1229
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1230
    .line 1231
    .line 1232
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 1233
    .line 1234
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1238
    .line 1239
    .line 1240
    move-result-object p2

    .line 1241
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    iget-object v0, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 1248
    .line 1249
    iget-object v1, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1250
    .line 1251
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1252
    .line 1253
    invoke-virtual {v1, p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 1254
    .line 1255
    .line 1256
    move-result-object p1

    .line 1257
    new-instance p2, LB8/b;

    .line 1258
    .line 1259
    const/16 v0, 0x1d

    .line 1260
    .line 1261
    invoke-direct {p2, v2, v0}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1265
    .line 1266
    .line 1267
    return-void

    .line 1268
    :pswitch_f
    new-instance v0, Ljava/util/ArrayList;

    .line 1269
    .line 1270
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1271
    .line 1272
    .line 1273
    check-cast p1, Ljava/util/ArrayList;

    .line 1274
    .line 1275
    const/4 v1, 0x0

    .line 1276
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v2

    .line 1280
    check-cast v2, LPc/m;

    .line 1281
    .line 1282
    const/4 v3, 0x1

    .line 1283
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v4

    .line 1287
    check-cast v4, Ljava/lang/String;

    .line 1288
    .line 1289
    const/4 v5, 0x2

    .line 1290
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object p1

    .line 1294
    check-cast p1, Ljava/lang/Number;

    .line 1295
    .line 1296
    const/4 v5, 0x0

    .line 1297
    if-nez p1, :cond_d

    .line 1298
    .line 1299
    move-object p1, v5

    .line 1300
    goto :goto_b

    .line 1301
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 1302
    .line 1303
    .line 1304
    move-result-wide v6

    .line 1305
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1306
    .line 1307
    .line 1308
    move-result-object p1

    .line 1309
    :goto_b
    iget-object v6, p0, LPc/n;->b:LPc/d;

    .line 1310
    .line 1311
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    :try_start_6
    invoke-static {v2}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v2

    .line 1318
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 1319
    .line 1320
    .line 1321
    move-result p1

    .line 1322
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1323
    .line 1324
    .line 1325
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    if-ltz p1, :cond_e

    .line 1329
    .line 1330
    const v6, 0xffff

    .line 1331
    .line 1332
    .line 1333
    if-gt p1, v6, :cond_e

    .line 1334
    .line 1335
    goto :goto_c

    .line 1336
    :cond_e
    move v3, v1

    .line 1337
    :goto_c
    const-string v6, "Port number must be in the range 0-65535"

    .line 1338
    .line 1339
    invoke-static {v6, v3}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 1340
    .line 1341
    .line 1342
    iget-object v2, v2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1343
    .line 1344
    invoke-static {v2, v4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza(Ls8/g;Ljava/lang/String;I)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v0, v1, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 1351
    .line 1352
    .line 1353
    goto :goto_d

    .line 1354
    :catch_3
    move-exception v0

    .line 1355
    move-object p1, v0

    .line 1356
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1357
    .line 1358
    .line 1359
    move-result-object p1

    .line 1360
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1361
    .line 1362
    .line 1363
    :goto_d
    return-void

    .line 1364
    :pswitch_10
    new-instance v0, Ljava/util/ArrayList;

    .line 1365
    .line 1366
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1367
    .line 1368
    .line 1369
    check-cast p1, Ljava/util/ArrayList;

    .line 1370
    .line 1371
    const/4 v1, 0x0

    .line 1372
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v2

    .line 1376
    check-cast v2, LPc/m;

    .line 1377
    .line 1378
    const/4 v2, 0x1

    .line 1379
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object p1

    .line 1383
    check-cast p1, Ljava/lang/String;

    .line 1384
    .line 1385
    iget-object p1, p0, LPc/n;->b:LPc/d;

    .line 1386
    .line 1387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1388
    .line 1389
    .line 1390
    const/4 p1, 0x0

    .line 1391
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1395
    .line 1396
    .line 1397
    return-void

    .line 1398
    :pswitch_11
    new-instance v0, Ljava/util/ArrayList;

    .line 1399
    .line 1400
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1401
    .line 1402
    .line 1403
    check-cast p1, Ljava/util/ArrayList;

    .line 1404
    .line 1405
    const/4 v1, 0x0

    .line 1406
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    move-object v5, v2

    .line 1411
    check-cast v5, LPc/m;

    .line 1412
    .line 1413
    const/4 v2, 0x1

    .line 1414
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object p1

    .line 1418
    move-object v6, p1

    .line 1419
    check-cast v6, LPc/Q;

    .line 1420
    .line 1421
    iget-object p1, p0, LPc/n;->b:LPc/d;

    .line 1422
    .line 1423
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1424
    .line 1425
    .line 1426
    const-string v2, "plugins.flutter.io/firebase_auth/phone/"

    .line 1427
    .line 1428
    :try_start_7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1429
    .line 1430
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v2

    .line 1437
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v2

    .line 1441
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v2

    .line 1448
    new-instance v10, Luc/j;

    .line 1449
    .line 1450
    iget-object v3, p1, LPc/d;->a:Luc/f;

    .line 1451
    .line 1452
    invoke-direct {v10, v3, v2}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 1453
    .line 1454
    .line 1455
    iget-object v3, v6, LPc/Q;->f:Ljava/lang/String;

    .line 1456
    .line 1457
    const/4 v4, 0x0

    .line 1458
    if-eqz v3, :cond_f

    .line 1459
    .line 1460
    sget-object v7, LPc/k;->b:Ljava/util/HashMap;

    .line 1461
    .line 1462
    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v3

    .line 1466
    check-cast v3, LK8/j;

    .line 1467
    .line 1468
    move-object v7, v3

    .line 1469
    goto :goto_e

    .line 1470
    :catch_4
    move-exception v0

    .line 1471
    move-object p1, v0

    .line 1472
    goto :goto_10

    .line 1473
    :cond_f
    move-object v7, v4

    .line 1474
    :goto_e
    iget-object v3, v6, LPc/Q;->e:Ljava/lang/String;

    .line 1475
    .line 1476
    if-eqz v3, :cond_12

    .line 1477
    .line 1478
    sget-object v8, LPc/k;->c:Ljava/util/HashMap;

    .line 1479
    .line 1480
    invoke-virtual {v8}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v8

    .line 1484
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v8

    .line 1488
    :cond_10
    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1489
    .line 1490
    .line 1491
    move-result v9

    .line 1492
    if-eqz v9, :cond_12

    .line 1493
    .line 1494
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v9

    .line 1498
    check-cast v9, Ljava/lang/String;

    .line 1499
    .line 1500
    sget-object v11, LPc/k;->c:Ljava/util/HashMap;

    .line 1501
    .line 1502
    invoke-virtual {v11, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v9

    .line 1506
    check-cast v9, LK8/i;

    .line 1507
    .line 1508
    invoke-virtual {v9}, LK8/i;->V()Ljava/util/ArrayList;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v9

    .line 1512
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v9

    .line 1516
    :cond_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1517
    .line 1518
    .line 1519
    move-result v11

    .line 1520
    if-eqz v11, :cond_10

    .line 1521
    .line 1522
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v11

    .line 1526
    check-cast v11, LJ8/t;

    .line 1527
    .line 1528
    invoke-virtual {v11}, LJ8/t;->getUid()Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v12

    .line 1532
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1533
    .line 1534
    .line 1535
    move-result v12

    .line 1536
    if-eqz v12, :cond_11

    .line 1537
    .line 1538
    instance-of v12, v11, LJ8/z;

    .line 1539
    .line 1540
    if-eqz v12, :cond_11

    .line 1541
    .line 1542
    check-cast v11, LJ8/z;

    .line 1543
    .line 1544
    move-object v4, v11

    .line 1545
    goto :goto_f

    .line 1546
    :cond_12
    move-object v8, v4

    .line 1547
    new-instance v3, LPc/U;

    .line 1548
    .line 1549
    iget-object v4, p1, LPc/d;->c:Landroid/app/Activity;

    .line 1550
    .line 1551
    new-instance v9, LJ9/x;

    .line 1552
    .line 1553
    const/16 v11, 0x15

    .line 1554
    .line 1555
    invoke-direct {v9, v11}, LJ9/x;-><init>(I)V

    .line 1556
    .line 1557
    .line 1558
    invoke-direct/range {v3 .. v9}, LPc/U;-><init>(Landroid/app/Activity;LPc/m;LPc/Q;LK8/j;LJ8/z;LJ9/x;)V

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {v10, v3}, Luc/j;->a(Luc/i;)V

    .line 1562
    .line 1563
    .line 1564
    iget-object p1, p1, LPc/d;->d:Ljava/util/HashMap;

    .line 1565
    .line 1566
    invoke-virtual {p1, v10, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 1573
    .line 1574
    .line 1575
    goto :goto_11

    .line 1576
    :goto_10
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1577
    .line 1578
    .line 1579
    move-result-object p1

    .line 1580
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1581
    .line 1582
    .line 1583
    :goto_11
    return-void

    .line 1584
    :pswitch_12
    new-instance v0, Ljava/util/ArrayList;

    .line 1585
    .line 1586
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1587
    .line 1588
    .line 1589
    check-cast p1, Ljava/util/ArrayList;

    .line 1590
    .line 1591
    const/4 v1, 0x0

    .line 1592
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object p1

    .line 1596
    check-cast p1, LPc/m;

    .line 1597
    .line 1598
    iget-object v2, p0, LPc/n;->b:LPc/d;

    .line 1599
    .line 1600
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    const-string v3, "plugins.flutter.io/firebase_auth/auth-state/"

    .line 1604
    .line 1605
    :try_start_8
    invoke-static {p1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1606
    .line 1607
    .line 1608
    move-result-object p1

    .line 1609
    new-instance v4, LOc/d;

    .line 1610
    .line 1611
    const/4 v5, 0x1

    .line 1612
    invoke-direct {v4, p1, v5}, LOc/d;-><init>(Ljava/lang/Object;I)V

    .line 1613
    .line 1614
    .line 1615
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1616
    .line 1617
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1618
    .line 1619
    .line 1620
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1621
    .line 1622
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 1623
    .line 1624
    .line 1625
    iget-object p1, p1, Ls8/g;->b:Ljava/lang/String;

    .line 1626
    .line 1627
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object p1

    .line 1634
    new-instance v3, Luc/j;

    .line 1635
    .line 1636
    iget-object v5, v2, LPc/d;->a:Luc/f;

    .line 1637
    .line 1638
    invoke-direct {v3, v5, p1}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v3, v4}, Luc/j;->a(Luc/i;)V

    .line 1642
    .line 1643
    .line 1644
    iget-object v2, v2, LPc/d;->d:Ljava/util/HashMap;

    .line 1645
    .line 1646
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1650
    .line 1651
    .line 1652
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    .line 1653
    .line 1654
    .line 1655
    goto :goto_12

    .line 1656
    :catch_5
    move-exception v0

    .line 1657
    move-object p1, v0

    .line 1658
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1659
    .line 1660
    .line 1661
    move-result-object p1

    .line 1662
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1663
    .line 1664
    .line 1665
    :goto_12
    return-void

    .line 1666
    :pswitch_13
    new-instance v0, Ljava/util/ArrayList;

    .line 1667
    .line 1668
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1669
    .line 1670
    .line 1671
    check-cast p1, Ljava/util/ArrayList;

    .line 1672
    .line 1673
    const/4 v1, 0x0

    .line 1674
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v1

    .line 1678
    check-cast v1, LPc/m;

    .line 1679
    .line 1680
    const/4 v2, 0x1

    .line 1681
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1682
    .line 1683
    .line 1684
    move-result-object p1

    .line 1685
    check-cast p1, Ljava/lang/String;

    .line 1686
    .line 1687
    new-instance v2, LPc/p;

    .line 1688
    .line 1689
    const/4 v3, 0x2

    .line 1690
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1691
    .line 1692
    .line 1693
    iget-object p2, p0, LPc/n;->b:LPc/d;

    .line 1694
    .line 1695
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1696
    .line 1697
    .line 1698
    invoke-static {v1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1699
    .line 1700
    .line 1701
    move-result-object p2

    .line 1702
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1703
    .line 1704
    .line 1705
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1706
    .line 1707
    .line 1708
    iget-object v0, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 1709
    .line 1710
    iget-object v1, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1711
    .line 1712
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1713
    .line 1714
    invoke-virtual {v1, p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzd(Ls8/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 1715
    .line 1716
    .line 1717
    move-result-object p1

    .line 1718
    new-instance p2, LPc/b;

    .line 1719
    .line 1720
    const/4 v0, 0x0

    .line 1721
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1725
    .line 1726
    .line 1727
    return-void

    .line 1728
    :pswitch_14
    new-instance v0, Ljava/util/ArrayList;

    .line 1729
    .line 1730
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1731
    .line 1732
    .line 1733
    check-cast p1, Ljava/util/ArrayList;

    .line 1734
    .line 1735
    const/4 v1, 0x0

    .line 1736
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1737
    .line 1738
    .line 1739
    move-result-object p1

    .line 1740
    check-cast p1, LPc/m;

    .line 1741
    .line 1742
    iget-object v2, p0, LPc/n;->b:LPc/d;

    .line 1743
    .line 1744
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1745
    .line 1746
    .line 1747
    const-string v3, "plugins.flutter.io/firebase_auth/id-token/"

    .line 1748
    .line 1749
    :try_start_9
    invoke-static {p1}, LPc/d;->a(LPc/m;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1750
    .line 1751
    .line 1752
    move-result-object p1

    .line 1753
    new-instance v4, LOc/d;

    .line 1754
    .line 1755
    const/4 v5, 0x2

    .line 1756
    invoke-direct {v4, p1, v5}, LOc/d;-><init>(Ljava/lang/Object;I)V

    .line 1757
    .line 1758
    .line 1759
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1760
    .line 1761
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1762
    .line 1763
    .line 1764
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1765
    .line 1766
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 1767
    .line 1768
    .line 1769
    iget-object p1, p1, Ls8/g;->b:Ljava/lang/String;

    .line 1770
    .line 1771
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1775
    .line 1776
    .line 1777
    move-result-object p1

    .line 1778
    new-instance v3, Luc/j;

    .line 1779
    .line 1780
    iget-object v5, v2, LPc/d;->a:Luc/f;

    .line 1781
    .line 1782
    invoke-direct {v3, v5, p1}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v3, v4}, Luc/j;->a(Luc/i;)V

    .line 1786
    .line 1787
    .line 1788
    iget-object v2, v2, LPc/d;->d:Ljava/util/HashMap;

    .line 1789
    .line 1790
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1794
    .line 1795
    .line 1796
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    .line 1797
    .line 1798
    .line 1799
    goto :goto_13

    .line 1800
    :catch_6
    move-exception v0

    .line 1801
    move-object p1, v0

    .line 1802
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1803
    .line 1804
    .line 1805
    move-result-object p1

    .line 1806
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1807
    .line 1808
    .line 1809
    :goto_13
    return-void

    .line 1810
    nop

    .line 1811
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
