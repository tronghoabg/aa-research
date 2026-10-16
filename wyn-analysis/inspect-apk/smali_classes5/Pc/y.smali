.class public final synthetic LPc/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LPc/z;


# direct methods
.method public synthetic constructor <init>(LPc/z;I)V
    .locals 0

    .line 1
    iput p2, p0, LPc/y;->a:I

    iput-object p1, p0, LPc/y;->b:LPc/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 8

    .line 1
    iget v0, p0, LPc/y;->a:I

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
    move-result-object p1

    .line 18
    check-cast p1, LPc/m;

    .line 19
    .line 20
    iget-object v2, p0, LPc/y;->b:LPc/z;

    .line 21
    .line 22
    check-cast v2, LPc/k;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-static {p1}, LPc/k;->a(LPc/m;)LK8/h;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch LU9/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    iget-object p1, p1, LK8/h;->a:LK8/e;

    .line 32
    .line 33
    iget-object p1, p1, LK8/e;->l:LK8/w;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v3, p1, LK8/w;->a:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, LJ8/z;

    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget-object p1, p1, LK8/w;->b:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, LJ8/C;

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-static {v2}, Lcom/moloco/sdk/internal/publisher/H;->d0(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catch_0
    move-exception v0

    .line 103
    move-object p1, v0

    .line 104
    invoke-static {p1}, Landroid/support/v4/media/session/b;->w0(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :goto_2
    return-void

    .line 112
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    check-cast p1, Ljava/util/ArrayList;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, LPc/m;

    .line 125
    .line 126
    const/4 v2, 0x1

    .line 127
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    move-object v5, p1

    .line 132
    check-cast v5, Ljava/lang/String;

    .line 133
    .line 134
    new-instance p1, LPc/o;

    .line 135
    .line 136
    const/16 v2, 0xb

    .line 137
    .line 138
    invoke-direct {p1, v0, p2, v2}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p0, LPc/y;->b:LPc/z;

    .line 142
    .line 143
    check-cast p2, LPc/k;

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    :try_start_1
    invoke-static {v1}, LPc/k;->a(LPc/m;)LK8/h;

    .line 149
    .line 150
    .line 151
    move-result-object p2
    :try_end_1
    .catch LU9/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 152
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v4, p2, LK8/h;->a:LK8/e;

    .line 159
    .line 160
    iget-object p2, v4, LK8/e;->c:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {p2}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-static {p2}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object v6, p2, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 177
    .line 178
    new-instance v7, LJ8/h;

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-direct {v7, p2, v0}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 182
    .line 183
    .line 184
    iget-object v2, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 185
    .line 186
    iget-object v3, p2, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 187
    .line 188
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;Ljava/lang/String;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    new-instance v0, Lx9/d;

    .line 193
    .line 194
    const/16 v1, 0x14

    .line 195
    .line 196
    invoke-direct {v0, v1}, Lx9/d;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    new-instance v0, LPc/b;

    .line 204
    .line 205
    const/16 v1, 0x14

    .line 206
    .line 207
    invoke-direct {v0, p1, v1}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :catch_1
    move-exception v0

    .line 215
    move-object p2, v0

    .line 216
    invoke-static {p2}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    invoke-virtual {p1, p2}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 221
    .line 222
    .line 223
    :goto_3
    return-void

    .line 224
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 227
    .line 228
    .line 229
    check-cast p1, Ljava/util/ArrayList;

    .line 230
    .line 231
    const/4 v1, 0x0

    .line 232
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    check-cast p1, LPc/m;

    .line 237
    .line 238
    new-instance v2, LPc/q;

    .line 239
    .line 240
    const/16 v3, 0xa

    .line 241
    .line 242
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 243
    .line 244
    .line 245
    iget-object p2, p0, LPc/y;->b:LPc/z;

    .line 246
    .line 247
    check-cast p2, LPc/k;

    .line 248
    .line 249
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    :try_start_2
    invoke-static {p1}, LPc/k;->a(LPc/m;)LK8/h;

    .line 253
    .line 254
    .line 255
    move-result-object p1
    :try_end_2
    .catch LU9/a; {:try_start_2 .. :try_end_2} :catch_2

    .line 256
    iget-object p2, p1, LK8/h;->a:LK8/e;

    .line 257
    .line 258
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v0, p2, LK8/e;->c:Ljava/lang/String;

    .line 262
    .line 263
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v0, p2, v1}, Lcom/google/firebase/auth/FirebaseAuth;->i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    new-instance v0, LK8/b;

    .line 276
    .line 277
    const/4 v1, 0x1

    .line 278
    invoke-direct {v0, p1, v1}, LK8/b;-><init>(Ljava/lang/Object;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    new-instance p2, LPc/b;

    .line 286
    .line 287
    const/16 v0, 0x12

    .line 288
    .line 289
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 293
    .line 294
    .line 295
    goto :goto_4

    .line 296
    :catch_2
    move-exception v0

    .line 297
    move-object p1, v0

    .line 298
    invoke-virtual {v2, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 299
    .line 300
    .line 301
    :goto_4
    return-void

    .line 302
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 305
    .line 306
    .line 307
    check-cast p1, Ljava/util/ArrayList;

    .line 308
    .line 309
    const/4 v1, 0x0

    .line 310
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    check-cast v1, LPc/m;

    .line 315
    .line 316
    const/4 v2, 0x1

    .line 317
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    check-cast v2, Ljava/lang/String;

    .line 322
    .line 323
    const/4 v3, 0x2

    .line 324
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    check-cast p1, Ljava/lang/String;

    .line 329
    .line 330
    new-instance v3, LPc/p;

    .line 331
    .line 332
    const/16 v4, 0xa

    .line 333
    .line 334
    invoke-direct {v3, v0, p2, v4}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 335
    .line 336
    .line 337
    iget-object p2, p0, LPc/y;->b:LPc/z;

    .line 338
    .line 339
    check-cast p2, LPc/k;

    .line 340
    .line 341
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    :try_start_3
    invoke-static {v1}, LPc/k;->a(LPc/m;)LK8/h;

    .line 345
    .line 346
    .line 347
    move-result-object p2
    :try_end_3
    .catch LU9/a; {:try_start_3 .. :try_end_3} :catch_3

    .line 348
    sget-object v0, LPc/k;->d:Ljava/util/HashMap;

    .line 349
    .line 350
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    check-cast v0, LJ8/s;

    .line 355
    .line 356
    invoke-virtual {p2, v0, p1}, LK8/h;->a(LJ8/s;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    new-instance p2, LPc/b;

    .line 361
    .line 362
    const/16 v0, 0x13

    .line 363
    .line 364
    invoke-direct {p2, v3, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :catch_3
    move-exception v0

    .line 372
    move-object p1, v0

    .line 373
    invoke-virtual {v3, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 374
    .line 375
    .line 376
    :goto_5
    return-void

    .line 377
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    .line 378
    .line 379
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 380
    .line 381
    .line 382
    check-cast p1, Ljava/util/ArrayList;

    .line 383
    .line 384
    const/4 v1, 0x0

    .line 385
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    check-cast v1, LPc/m;

    .line 390
    .line 391
    const/4 v2, 0x1

    .line 392
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    check-cast v2, LPc/J;

    .line 397
    .line 398
    const/4 v3, 0x2

    .line 399
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    check-cast p1, Ljava/lang/String;

    .line 404
    .line 405
    new-instance v3, LPc/o;

    .line 406
    .line 407
    const/16 v4, 0xa

    .line 408
    .line 409
    invoke-direct {v3, v0, p2, v4}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 410
    .line 411
    .line 412
    iget-object p2, p0, LPc/y;->b:LPc/z;

    .line 413
    .line 414
    check-cast p2, LPc/k;

    .line 415
    .line 416
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    :try_start_4
    invoke-static {v1}, LPc/k;->a(LPc/m;)LK8/h;

    .line 420
    .line 421
    .line 422
    move-result-object p2
    :try_end_4
    .catch LU9/a; {:try_start_4 .. :try_end_4} :catch_4

    .line 423
    iget-object v0, v2, LPc/J;->a:Ljava/lang/String;

    .line 424
    .line 425
    iget-object v1, v2, LPc/J;->b:Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v0, v1}, LJ8/u;->Y(Ljava/lang/String;Ljava/lang/String;)LJ8/u;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    new-instance v1, LJ8/y;

    .line 432
    .line 433
    invoke-direct {v1, v0}, LJ8/y;-><init>(LJ8/u;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {p2, v1, p1}, LK8/h;->a(LJ8/s;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    new-instance p2, LPc/b;

    .line 441
    .line 442
    const/16 v0, 0x15

    .line 443
    .line 444
    invoke-direct {p2, v3, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 448
    .line 449
    .line 450
    goto :goto_6

    .line 451
    :catch_4
    move-exception v0

    .line 452
    move-object p1, v0

    .line 453
    invoke-virtual {v3, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 454
    .line 455
    .line 456
    :goto_6
    return-void

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
