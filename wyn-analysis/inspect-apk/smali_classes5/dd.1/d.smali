.class public final synthetic Ldd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldd/e;


# direct methods
.method public synthetic constructor <init>(Ldd/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldd/d;->a:I

    iput-object p1, p0, Ldd/d;->b:Ldd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    const/16 v3, 0x13

    .line 7
    .line 8
    const/16 v4, 0x14

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    iget v8, v1, Ldd/d;->a:I

    .line 14
    .line 15
    packed-switch v8, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    check-cast v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/List;

    .line 32
    .line 33
    new-instance v12, LPc/p;

    .line 34
    .line 35
    const/16 v4, 0x15

    .line 36
    .line 37
    invoke-direct {v12, v0, v2, v4}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 38
    .line 39
    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    iget-object v8, v1, Ldd/d;->b:Ldd/e;

    .line 43
    .line 44
    const-string v9, "requestScopes"

    .line 45
    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    invoke-virtual/range {v8 .. v14}, Ldd/e;->a(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v8, Ldd/e;->d:La9/a;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v0, v8, Ldd/e;->a:Landroid/content/Context;

    .line 57
    .line 58
    invoke-static {v0}, Lb7/k;->I(Landroid/content/Context;)Lb7/k;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Lb7/k;->H()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    const-string v0, "sign_in_required"

    .line 69
    .line 70
    const-string v2, "No account to grant scopes."

    .line 71
    .line 72
    invoke-virtual {v8, v0, v2}, Ldd/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Ljava/lang/String;

    .line 97
    .line 98
    new-instance v9, Lcom/google/android/gms/common/api/Scope;

    .line 99
    .line 100
    invoke-direct {v9, v6, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-array v4, v6, [Lcom/google/android/gms/common/api/Scope;

    .line 104
    .line 105
    aput-object v9, v4, v7

    .line 106
    .line 107
    new-instance v10, Ljava/util/HashSet;

    .line 108
    .line 109
    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {v10, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    new-instance v4, Ljava/util/HashSet;

    .line 116
    .line 117
    iget-object v11, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->j:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v4, v11}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v4, v10}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-nez v4, :cond_1

    .line 127
    .line 128
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_3

    .line 137
    .line 138
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 139
    .line 140
    iget-object v2, v8, Ldd/e;->g:LC6/l;

    .line 141
    .line 142
    iget-object v2, v2, LC6/l;->d:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v2, LPc/p;

    .line 145
    .line 146
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0}, LPc/p;->a(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iput-object v5, v8, Ldd/e;->g:LC6/l;

    .line 153
    .line 154
    goto/16 :goto_1

    .line 155
    .line 156
    :cond_3
    iget-object v3, v8, Ldd/e;->b:Landroid/app/Activity;

    .line 157
    .line 158
    new-array v4, v7, [Lcom/google/android/gms/common/api/Scope;

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, [Lcom/google/android/gms/common/api/Scope;

    .line 165
    .line 166
    const-string v4, "Please provide a non-null Activity"

    .line 167
    .line 168
    invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v4, "Please provide at least one scope"

    .line 172
    .line 173
    invoke-static {v2, v4}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Ljava/util/HashSet;

    .line 177
    .line 178
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v17, Ljava/util/HashMap;

    .line 182
    .line 183
    invoke-direct/range {v17 .. v17}, Ljava/util/HashMap;-><init>()V

    .line 184
    .line 185
    .line 186
    array-length v6, v2

    .line 187
    if-lez v6, :cond_4

    .line 188
    .line 189
    aget-object v6, v2, v7

    .line 190
    .line 191
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-interface {v4, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 199
    .line 200
    .line 201
    :cond_4
    iget-object v0, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->d:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_5

    .line 208
    .line 209
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    new-instance v5, Landroid/accounts/Account;

    .line 213
    .line 214
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v2, "com.google"

    .line 218
    .line 219
    invoke-direct {v5, v0, v2}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :cond_5
    move-object v11, v5

    .line 223
    new-instance v0, La7/a;

    .line 224
    .line 225
    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->p:Lcom/google/android/gms/common/api/Scope;

    .line 226
    .line 227
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-eqz v2, :cond_6

    .line 232
    .line 233
    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o:Lcom/google/android/gms/common/api/Scope;

    .line 234
    .line 235
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-eqz v5, :cond_6

    .line 240
    .line 241
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    :cond_6
    new-instance v8, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 245
    .line 246
    new-instance v10, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 249
    .line 250
    .line 251
    const/4 v9, 0x3

    .line 252
    const/4 v12, 0x0

    .line 253
    const/4 v13, 0x0

    .line 254
    const/4 v14, 0x0

    .line 255
    const/4 v15, 0x0

    .line 256
    const/16 v16, 0x0

    .line 257
    .line 258
    const/16 v18, 0x0

    .line 259
    .line 260
    invoke-direct/range {v8 .. v18}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    sget-object v2, LV6/a;->a:Lcom/google/android/gms/common/api/i;

    .line 264
    .line 265
    new-instance v4, Lcom/google/android/gms/common/api/internal/a;

    .line 266
    .line 267
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-direct {v0, v3, v2, v8, v4}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/internal/a;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, La7/a;->c()Landroid/content/Intent;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    const v2, 0xd02f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 281
    .line 282
    .line 283
    :goto_1
    return-void

    .line 284
    :pswitch_0
    new-instance v3, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 287
    .line 288
    .line 289
    move-object/from16 v5, p1

    .line 290
    .line 291
    check-cast v5, Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    check-cast v5, Ljava/lang/String;

    .line 298
    .line 299
    new-instance v7, LPc/o;

    .line 300
    .line 301
    invoke-direct {v7, v3, v2, v4}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 302
    .line 303
    .line 304
    iget-object v2, v1, Ldd/d;->b:Ldd/e;

    .line 305
    .line 306
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    new-instance v3, Ldd/c;

    .line 310
    .line 311
    invoke-direct {v3, v2, v5, v6}, Ldd/c;-><init>(Ldd/e;Ljava/lang/String;I)V

    .line 312
    .line 313
    .line 314
    new-instance v4, Lcom/unity3d/services/core/webview/b;

    .line 315
    .line 316
    invoke-direct {v4, v7, v0}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 317
    .line 318
    .line 319
    iget-object v0, v2, Ldd/e;->c:La2/c;

    .line 320
    .line 321
    invoke-virtual {v0, v3, v4}, La2/c;->J(Ljava/util/concurrent/Callable;Ldd/a;)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :pswitch_1
    iget-object v0, v1, Ldd/d;->b:Ldd/e;

    .line 326
    .line 327
    new-instance v3, Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 330
    .line 331
    .line 332
    :try_start_0
    iget-object v0, v0, Ldd/e;->a:Landroid/content/Context;

    .line 333
    .line 334
    invoke-static {v0}, Lb7/k;->I(Landroid/content/Context;)Lb7/k;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v0}, Lb7/k;->H()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    if-eqz v0, :cond_7

    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_7
    move v6, v7

    .line 346
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v3, v7, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    .line 352
    .line 353
    goto :goto_3

    .line 354
    :catchall_0
    move-exception v0

    .line 355
    invoke-static {v0}, Ltg/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    :goto_3
    invoke-virtual {v2, v3}, Lba/a;->c(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 364
    .line 365
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 366
    .line 367
    .line 368
    new-instance v10, LPc/q;

    .line 369
    .line 370
    invoke-direct {v10, v0, v2, v4}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 371
    .line 372
    .line 373
    const/4 v12, 0x0

    .line 374
    const/4 v13, 0x0

    .line 375
    iget-object v7, v1, Ldd/d;->b:Ldd/e;

    .line 376
    .line 377
    const-string v8, "disconnect"

    .line 378
    .line 379
    const/4 v9, 0x0

    .line 380
    const/4 v11, 0x0

    .line 381
    invoke-virtual/range {v7 .. v13}, Ldd/e;->a(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    iget-object v0, v7, Ldd/e;->e:La7/a;

    .line 385
    .line 386
    invoke-virtual {v0}, La7/a;->d()Lcom/google/android/gms/tasks/Task;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    new-instance v2, Ldd/d;

    .line 391
    .line 392
    invoke-direct {v2, v7, v6}, Ldd/d;-><init>(Ldd/e;I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 402
    .line 403
    .line 404
    new-instance v11, LPc/p;

    .line 405
    .line 406
    invoke-direct {v11, v0, v2, v4}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 407
    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const/4 v14, 0x0

    .line 411
    iget-object v8, v1, Ldd/d;->b:Ldd/e;

    .line 412
    .line 413
    const-string v9, "signOut"

    .line 414
    .line 415
    const/4 v10, 0x0

    .line 416
    const/4 v12, 0x0

    .line 417
    invoke-virtual/range {v8 .. v14}, Ldd/e;->a(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    iget-object v0, v8, Ldd/e;->e:La7/a;

    .line 421
    .line 422
    invoke-virtual {v0}, La7/a;->signOut()Lcom/google/android/gms/tasks/Task;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    new-instance v2, Ldd/d;

    .line 427
    .line 428
    invoke-direct {v2, v8, v7}, Ldd/d;-><init>(Ldd/e;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 438
    .line 439
    .line 440
    move-object/from16 v4, p1

    .line 441
    .line 442
    check-cast v4, Ljava/util/ArrayList;

    .line 443
    .line 444
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    check-cast v5, Ljava/lang/String;

    .line 449
    .line 450
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    check-cast v4, Ljava/lang/Boolean;

    .line 455
    .line 456
    new-instance v6, LPc/o;

    .line 457
    .line 458
    invoke-direct {v6, v0, v2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 459
    .line 460
    .line 461
    iget-object v0, v1, Ldd/d;->b:Ldd/e;

    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    new-instance v2, Ldd/c;

    .line 467
    .line 468
    invoke-direct {v2, v0, v5, v7}, Ldd/c;-><init>(Ldd/e;Ljava/lang/String;I)V

    .line 469
    .line 470
    .line 471
    new-instance v3, Lcom/applovin/impl/Y;

    .line 472
    .line 473
    invoke-direct {v3, v0, v6, v4, v5}, Lcom/applovin/impl/Y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    iget-object v0, v0, Ldd/e;->c:La2/c;

    .line 477
    .line 478
    invoke-virtual {v0, v2, v3}, La2/c;->J(Ljava/util/concurrent/Callable;Ldd/a;)V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    .line 483
    .line 484
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 485
    .line 486
    .line 487
    new-instance v6, LPc/q;

    .line 488
    .line 489
    invoke-direct {v6, v0, v2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 490
    .line 491
    .line 492
    iget-object v4, v1, Ldd/d;->b:Ldd/e;

    .line 493
    .line 494
    iget-object v0, v4, Ldd/e;->b:Landroid/app/Activity;

    .line 495
    .line 496
    if-eqz v0, :cond_8

    .line 497
    .line 498
    const/4 v9, 0x0

    .line 499
    const/4 v10, 0x0

    .line 500
    const-string v5, "signIn"

    .line 501
    .line 502
    const/4 v7, 0x0

    .line 503
    const/4 v8, 0x0

    .line 504
    invoke-virtual/range {v4 .. v10}, Ldd/e;->a(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    iget-object v0, v4, Ldd/e;->e:La7/a;

    .line 508
    .line 509
    invoke-virtual {v0}, La7/a;->c()Landroid/content/Intent;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    iget-object v2, v4, Ldd/e;->b:Landroid/app/Activity;

    .line 514
    .line 515
    const v3, 0xd02d

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 523
    .line 524
    const-string v2, "signIn needs a foreground activity"

    .line 525
    .line 526
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    throw v0

    .line 530
    :pswitch_6
    iget-object v8, v1, Ldd/d;->b:Ldd/e;

    .line 531
    .line 532
    new-instance v4, Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 535
    .line 536
    .line 537
    new-instance v10, LPc/p;

    .line 538
    .line 539
    invoke-direct {v10, v4, v2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 540
    .line 541
    .line 542
    const-string v9, "signInSilently"

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const/4 v14, 0x0

    .line 546
    const/4 v11, 0x0

    .line 547
    const/4 v12, 0x0

    .line 548
    invoke-virtual/range {v8 .. v14}, Ldd/e;->a(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    iget-object v2, v8, Ldd/e;->e:La7/a;

    .line 552
    .line 553
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/l;->asGoogleApiClient()Lcom/google/android/gms/common/api/o;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/l;->getApplicationContext()Landroid/content/Context;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/l;->getApiOptions()Lcom/google/android/gms/common/api/e;

    .line 562
    .line 563
    .line 564
    move-result-object v9

    .line 565
    check-cast v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 566
    .line 567
    invoke-virtual {v2}, La7/a;->e()I

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-ne v2, v0, :cond_9

    .line 572
    .line 573
    move v0, v6

    .line 574
    goto :goto_4

    .line 575
    :cond_9
    move v0, v7

    .line 576
    :goto_4
    sget-object v2, Lb7/j;->a:Lh7/a;

    .line 577
    .line 578
    const-string v10, "silentSignIn()"

    .line 579
    .line 580
    new-array v11, v7, [Ljava/lang/Object;

    .line 581
    .line 582
    invoke-virtual {v2, v10, v11}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    const-string v10, "getEligibleSavedSignInResult()"

    .line 586
    .line 587
    new-array v11, v7, [Ljava/lang/Object;

    .line 588
    .line 589
    invoke-virtual {v2, v10, v11}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    invoke-static {v9}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    invoke-static {v4}, Lb7/k;->I(Landroid/content/Context;)Lb7/k;

    .line 596
    .line 597
    .line 598
    move-result-object v10

    .line 599
    monitor-enter v10

    .line 600
    :try_start_1
    iget-object v11, v10, Lb7/k;->d:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v11, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 603
    .line 604
    monitor-exit v10

    .line 605
    if-nez v11, :cond_b

    .line 606
    .line 607
    :cond_a
    :goto_5
    move-object v11, v5

    .line 608
    goto :goto_7

    .line 609
    :cond_b
    iget-object v10, v11, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 610
    .line 611
    iget-object v12, v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 612
    .line 613
    if-nez v10, :cond_c

    .line 614
    .line 615
    if-nez v12, :cond_a

    .line 616
    .line 617
    goto :goto_6

    .line 618
    :cond_c
    invoke-virtual {v10, v12}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v10

    .line 622
    if-nez v10, :cond_d

    .line 623
    .line 624
    goto :goto_5

    .line 625
    :cond_d
    :goto_6
    iget-boolean v10, v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 626
    .line 627
    if-eqz v10, :cond_e

    .line 628
    .line 629
    goto :goto_5

    .line 630
    :cond_e
    iget-boolean v10, v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 631
    .line 632
    if-eqz v10, :cond_10

    .line 633
    .line 634
    iget-boolean v10, v11, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 635
    .line 636
    if-nez v10, :cond_f

    .line 637
    .line 638
    goto :goto_5

    .line 639
    :cond_f
    iget-object v10, v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->g:Ljava/lang/String;

    .line 640
    .line 641
    iget-object v12, v11, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->g:Ljava/lang/String;

    .line 642
    .line 643
    invoke-static {v10, v12}, Lcom/google/android/gms/common/internal/v;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v10

    .line 647
    if-nez v10, :cond_10

    .line 648
    .line 649
    goto :goto_5

    .line 650
    :cond_10
    new-instance v10, Ljava/util/HashSet;

    .line 651
    .line 652
    invoke-virtual {v11}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->V()Ljava/util/ArrayList;

    .line 653
    .line 654
    .line 655
    move-result-object v11

    .line 656
    invoke-direct {v10, v11}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 657
    .line 658
    .line 659
    new-instance v11, Ljava/util/HashSet;

    .line 660
    .line 661
    invoke-virtual {v9}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->V()Ljava/util/ArrayList;

    .line 662
    .line 663
    .line 664
    move-result-object v12

    .line 665
    invoke-direct {v11, v12}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 666
    .line 667
    .line 668
    invoke-interface {v10, v11}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 669
    .line 670
    .line 671
    move-result v10

    .line 672
    if-nez v10, :cond_11

    .line 673
    .line 674
    goto :goto_5

    .line 675
    :cond_11
    invoke-static {v4}, Lb7/k;->I(Landroid/content/Context;)Lb7/k;

    .line 676
    .line 677
    .line 678
    move-result-object v10

    .line 679
    invoke-virtual {v10}, Lb7/k;->H()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 680
    .line 681
    .line 682
    move-result-object v10

    .line 683
    if-eqz v10, :cond_a

    .line 684
    .line 685
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 686
    .line 687
    .line 688
    move-result-wide v11

    .line 689
    const-wide/16 v13, 0x3e8

    .line 690
    .line 691
    div-long/2addr v11, v13

    .line 692
    iget-wide v13, v10, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->h:J

    .line 693
    .line 694
    const-wide/16 v15, -0x12c

    .line 695
    .line 696
    add-long/2addr v13, v15

    .line 697
    cmp-long v11, v11, v13

    .line 698
    .line 699
    if-ltz v11, :cond_12

    .line 700
    .line 701
    goto :goto_5

    .line 702
    :cond_12
    new-instance v11, La7/b;

    .line 703
    .line 704
    sget-object v12, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 705
    .line 706
    invoke-direct {v11, v10, v12}, La7/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 707
    .line 708
    .line 709
    :goto_7
    if-eqz v11, :cond_13

    .line 710
    .line 711
    new-array v0, v7, [Ljava/lang/Object;

    .line 712
    .line 713
    const-string v4, "Eligible saved sign in result found"

    .line 714
    .line 715
    invoke-virtual {v2, v4, v0}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    new-instance v0, Lcom/google/android/gms/common/api/internal/z;

    .line 719
    .line 720
    invoke-direct {v0, v3, v6}, Lcom/google/android/gms/common/api/internal/z;-><init>(Lcom/google/android/gms/common/api/o;I)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v0, v11}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/t;)V

    .line 724
    .line 725
    .line 726
    new-instance v2, Lcom/google/android/gms/common/api/internal/t;

    .line 727
    .line 728
    invoke-direct {v2, v0}, Lcom/google/android/gms/common/api/internal/t;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    .line 729
    .line 730
    .line 731
    goto :goto_8

    .line 732
    :cond_13
    if-eqz v0, :cond_14

    .line 733
    .line 734
    new-instance v0, La7/b;

    .line 735
    .line 736
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 737
    .line 738
    const/4 v4, 0x4

    .line 739
    invoke-direct {v2, v4, v5, v5, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 740
    .line 741
    .line 742
    invoke-direct {v0, v5, v2}, La7/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 743
    .line 744
    .line 745
    new-instance v2, Lcom/google/android/gms/common/api/internal/z;

    .line 746
    .line 747
    invoke-direct {v2, v3, v6}, Lcom/google/android/gms/common/api/internal/z;-><init>(Lcom/google/android/gms/common/api/o;I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/t;)V

    .line 751
    .line 752
    .line 753
    new-instance v0, Lcom/google/android/gms/common/api/internal/t;

    .line 754
    .line 755
    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/internal/t;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    .line 756
    .line 757
    .line 758
    move-object v2, v0

    .line 759
    goto :goto_8

    .line 760
    :cond_14
    new-array v0, v7, [Ljava/lang/Object;

    .line 761
    .line 762
    const-string v5, "trySilentSignIn()"

    .line 763
    .line 764
    invoke-virtual {v2, v5, v0}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    new-instance v0, Lb7/g;

    .line 768
    .line 769
    invoke-direct {v0, v3, v4, v9}, Lb7/g;-><init>(Lcom/google/android/gms/common/api/o;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 770
    .line 771
    .line 772
    check-cast v3, Lcom/google/android/gms/common/api/internal/J;

    .line 773
    .line 774
    iget-object v2, v3, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 775
    .line 776
    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    new-instance v2, Lcom/google/android/gms/common/api/internal/t;

    .line 781
    .line 782
    invoke-direct {v2, v0}, Lcom/google/android/gms/common/api/internal/t;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;)V

    .line 783
    .line 784
    .line 785
    :goto_8
    sget-object v0, La7/a;->a:La7/e;

    .line 786
    .line 787
    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/v;->o(Lcom/google/android/gms/common/api/r;Lcom/google/android/gms/common/internal/u;)Lcom/google/android/gms/tasks/Task;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    if-eqz v2, :cond_15

    .line 796
    .line 797
    invoke-virtual {v8, v0}, Ldd/e;->e(Lcom/google/android/gms/tasks/Task;)V

    .line 798
    .line 799
    .line 800
    goto :goto_9

    .line 801
    :cond_15
    new-instance v2, Ldd/d;

    .line 802
    .line 803
    const/4 v3, 0x2

    .line 804
    invoke-direct {v2, v8, v3}, Ldd/d;-><init>(Ldd/e;I)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 808
    .line 809
    .line 810
    :goto_9
    return-void

    .line 811
    :goto_a
    :try_start_2
    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 812
    throw v0

    .line 813
    :catchall_1
    move-exception v0

    .line 814
    goto :goto_a

    .line 815
    :pswitch_7
    iget-object v0, v1, Ldd/d;->b:Ldd/e;

    .line 816
    .line 817
    new-instance v3, Ljava/util/ArrayList;

    .line 818
    .line 819
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 820
    .line 821
    .line 822
    move-object/from16 v4, p1

    .line 823
    .line 824
    check-cast v4, Ljava/util/ArrayList;

    .line 825
    .line 826
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    check-cast v4, Ldd/h;

    .line 831
    .line 832
    :try_start_3
    invoke-virtual {v0, v4}, Ldd/e;->c(Ldd/h;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v3, v7, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 836
    .line 837
    .line 838
    goto :goto_b

    .line 839
    :catchall_2
    move-exception v0

    .line 840
    invoke-static {v0}, Ltg/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    :goto_b
    invoke-virtual {v2, v3}, Lba/a;->c(Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    return-void

    .line 848
    nop

    .line 849
    :pswitch_data_0
    .packed-switch 0x3
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

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    .line 1
    iget v0, p0, Ldd/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldd/d;->b:Ldd/e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ldd/e;->e(Lcom/google/android/gms/tasks/Task;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Ldd/d;->b:Ldd/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, v0, Ldd/e;->g:LC6/l;

    .line 24
    .line 25
    iget-object p1, p1, LC6/l;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Ldd/m;

    .line 28
    .line 29
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ldd/m;->success()V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-object p1, v0, Ldd/e;->g:LC6/l;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p1, "status"

    .line 40
    .line 41
    const-string v1, "Failed to disconnect."

    .line 42
    .line 43
    invoke-virtual {v0, p1, v1}, Ldd/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void

    .line 47
    :pswitch_1
    iget-object v0, p0, Ldd/d;->b:Ldd/e;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    iget-object p1, v0, Ldd/e;->g:LC6/l;

    .line 59
    .line 60
    iget-object p1, p1, LC6/l;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Ldd/m;

    .line 63
    .line 64
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ldd/m;->success()V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    iput-object p1, v0, Ldd/e;->g:LC6/l;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const-string p1, "status"

    .line 75
    .line 76
    const-string v1, "Failed to signout."

    .line 77
    .line 78
    invoke-virtual {v0, p1, v1}, Ldd/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
