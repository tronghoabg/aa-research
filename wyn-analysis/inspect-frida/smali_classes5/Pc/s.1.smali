.class public final synthetic LPc/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxa/d;


# direct methods
.method public synthetic constructor <init>(Lxa/d;I)V
    .locals 0

    .line 1
    iput p2, p0, LPc/s;->a:I

    iput-object p1, p0, LPc/s;->b:Lxa/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 7

    .line 1
    iget v0, p0, LPc/s;->a:I

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
    move-result-object v1

    .line 18
    check-cast v1, LPc/m;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LPc/K;

    .line 26
    .line 27
    new-instance v2, LPc/o;

    .line 28
    .line 29
    const/16 v3, 0x8

    .line 30
    .line 31
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p1, LPc/K;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v1}, Lgc/b;->C(Ljava/lang/String;)LS3/s;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v3, p1, LPc/K;->b:Ljava/util/List;

    .line 50
    .line 51
    iget-object v4, v1, LS3/s;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Landroid/os/Bundle;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    new-instance v5, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    const-string v3, "com.google.firebase.auth.KEY_PROVIDER_SCOPES"

    .line 63
    .line 64
    invoke-virtual {v4, v3, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    iget-object p1, p1, LPc/K;->c:Ljava/util/Map;

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1, p1}, LS3/s;->b(Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-object p1, p2, Lxa/d;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Landroid/app/Activity;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object p2, v0

    .line 85
    check-cast p2, LK8/e;

    .line 86
    .line 87
    iget-object p2, p2, LK8/e;->c:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {p2}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p2}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 101
    .line 102
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 103
    .line 104
    .line 105
    iget-object v3, p2, Lcom/google/firebase/auth/FirebaseAuth;->t:LK8/F;

    .line 106
    .line 107
    iget-object v3, v3, LK8/F;->b:LE4/F;

    .line 108
    .line 109
    invoke-virtual {v3, p1, v1, p2, v0}, LE4/F;->y(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_2

    .line 114
    .line 115
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 116
    .line 117
    const/4 p2, 0x0

    .line 118
    const/16 v0, 0x42a1

    .line 119
    .line 120
    invoke-direct {p1, v0, p2, p2, p2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v3, p2, v0}, LK8/x;->c(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V

    .line 137
    .line 138
    .line 139
    new-instance p2, Landroid/content/Intent;

    .line 140
    .line 141
    const-string v0, "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"

    .line 142
    .line 143
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const-class v0, Lcom/google/firebase/auth/internal/GenericIdpActivity;

    .line 147
    .line 148
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :goto_0
    new-instance p2, LPc/b;

    .line 169
    .line 170
    const/16 v0, 0x10

    .line 171
    .line 172
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    check-cast p1, Ljava/util/ArrayList;

    .line 185
    .line 186
    const/4 v1, 0x0

    .line 187
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, LPc/m;

    .line 192
    .line 193
    const/4 v2, 0x1

    .line 194
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Ljava/util/Map;

    .line 199
    .line 200
    new-instance v2, LPc/q;

    .line 201
    .line 202
    const/4 v3, 0x7

    .line 203
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 204
    .line 205
    .line 206
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->W(Ljava/util/Map;)LJ8/d;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-nez p2, :cond_3

    .line 220
    .line 221
    invoke-static {}, La/a;->B()LPc/t;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {v2, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_3
    if-nez p1, :cond_4

    .line 230
    .line 231
    invoke-static {}, La/a;->A()LPc/t;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {v2, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_4
    move-object v0, p2

    .line 240
    check-cast v0, LK8/e;

    .line 241
    .line 242
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0, p2, p1}, Lcom/google/firebase/auth/FirebaseAuth;->p(LJ8/o;LJ8/d;)Lcom/google/android/gms/tasks/Task;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    new-instance p2, LPc/b;

    .line 257
    .line 258
    const/16 v0, 0xc

    .line 259
    .line 260
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 264
    .line 265
    .line 266
    :goto_1
    return-void

    .line 267
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    check-cast p1, Ljava/util/ArrayList;

    .line 273
    .line 274
    const/4 v1, 0x0

    .line 275
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, LPc/m;

    .line 280
    .line 281
    const/4 v2, 0x1

    .line 282
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    check-cast p1, LPc/K;

    .line 287
    .line 288
    new-instance v2, LPc/p;

    .line 289
    .line 290
    const/4 v3, 0x7

    .line 291
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 292
    .line 293
    .line 294
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 295
    .line 296
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget-object v1, p1, LPc/K;->a:Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v1}, Lgc/b;->C(Ljava/lang/String;)LS3/s;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    iget-object v3, p1, LPc/K;->b:Ljava/util/List;

    .line 310
    .line 311
    iget-object v4, v1, LS3/s;->b:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v4, Landroid/os/Bundle;

    .line 314
    .line 315
    if-eqz v3, :cond_5

    .line 316
    .line 317
    new-instance v5, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 320
    .line 321
    .line 322
    const-string v3, "com.google.firebase.auth.KEY_PROVIDER_SCOPES"

    .line 323
    .line 324
    invoke-virtual {v4, v3, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 325
    .line 326
    .line 327
    :cond_5
    iget-object p1, p1, LPc/K;->c:Ljava/util/Map;

    .line 328
    .line 329
    if-eqz p1, :cond_6

    .line 330
    .line 331
    invoke-virtual {v1, p1}, LS3/s;->b(Ljava/util/Map;)V

    .line 332
    .line 333
    .line 334
    :cond_6
    iget-object p1, p2, Lxa/d;->b:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast p1, Landroid/app/Activity;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    move-object p2, v0

    .line 345
    check-cast p2, LK8/e;

    .line 346
    .line 347
    iget-object p2, p2, LK8/e;->c:Ljava/lang/String;

    .line 348
    .line 349
    invoke-static {p2}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-static {p2}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 361
    .line 362
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 363
    .line 364
    .line 365
    iget-object v3, p2, Lcom/google/firebase/auth/FirebaseAuth;->t:LK8/F;

    .line 366
    .line 367
    iget-object v3, v3, LK8/F;->b:LE4/F;

    .line 368
    .line 369
    invoke-virtual {v3, p1, v1, p2, v0}, LE4/F;->y(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-nez v3, :cond_7

    .line 374
    .line 375
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 376
    .line 377
    const/4 p2, 0x0

    .line 378
    const/16 v0, 0x42a1

    .line 379
    .line 380
    invoke-direct {p1, v0, p2, p2, p2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 381
    .line 382
    .line 383
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    goto :goto_2

    .line 392
    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-static {v3, p2, v0}, LK8/x;->c(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V

    .line 397
    .line 398
    .line 399
    new-instance p2, Landroid/content/Intent;

    .line 400
    .line 401
    const-string v0, "com.google.firebase.auth.internal.NONGMSCORE_LINK"

    .line 402
    .line 403
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    const-class v0, Lcom/google/firebase/auth/internal/GenericIdpActivity;

    .line 407
    .line 408
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 409
    .line 410
    .line 411
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 416
    .line 417
    .line 418
    invoke-virtual {p2, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 419
    .line 420
    .line 421
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    :goto_2
    new-instance p2, LPc/b;

    .line 429
    .line 430
    const/16 v0, 0xb

    .line 431
    .line 432
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 442
    .line 443
    .line 444
    check-cast p1, Ljava/util/ArrayList;

    .line 445
    .line 446
    const/4 v1, 0x0

    .line 447
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    check-cast v1, LPc/m;

    .line 452
    .line 453
    const/4 v2, 0x1

    .line 454
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    check-cast p1, Ljava/util/Map;

    .line 459
    .line 460
    new-instance v2, LPc/o;

    .line 461
    .line 462
    const/4 v3, 0x7

    .line 463
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 464
    .line 465
    .line 466
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 467
    .line 468
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 472
    .line 473
    .line 474
    move-result-object p2

    .line 475
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->W(Ljava/util/Map;)LJ8/d;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    if-nez p2, :cond_8

    .line 480
    .line 481
    invoke-static {}, La/a;->B()LPc/t;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    invoke-virtual {v2, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 486
    .line 487
    .line 488
    goto :goto_3

    .line 489
    :cond_8
    if-nez p1, :cond_9

    .line 490
    .line 491
    invoke-static {}, La/a;->A()LPc/t;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    invoke-virtual {v2, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 496
    .line 497
    .line 498
    goto :goto_3

    .line 499
    :cond_9
    move-object v0, p2

    .line 500
    check-cast v0, LK8/e;

    .line 501
    .line 502
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 503
    .line 504
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0, p2, p1}, Lcom/google/firebase/auth/FirebaseAuth;->h(LJ8/o;LJ8/d;)Lcom/google/android/gms/tasks/Task;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    new-instance p2, LPc/b;

    .line 517
    .line 518
    const/16 v0, 0xd

    .line 519
    .line 520
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 524
    .line 525
    .line 526
    :goto_3
    return-void

    .line 527
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 530
    .line 531
    .line 532
    check-cast p1, Ljava/util/ArrayList;

    .line 533
    .line 534
    const/4 v1, 0x0

    .line 535
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    check-cast v1, LPc/m;

    .line 540
    .line 541
    const/4 v2, 0x1

    .line 542
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object p1

    .line 546
    check-cast p1, Ljava/lang/Boolean;

    .line 547
    .line 548
    new-instance v2, LPc/q;

    .line 549
    .line 550
    const/4 v3, 0x6

    .line 551
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 552
    .line 553
    .line 554
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 555
    .line 556
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 560
    .line 561
    new-instance v0, LAb/a;

    .line 562
    .line 563
    const/4 v3, 0x4

    .line 564
    invoke-direct {v0, v1, v2, p1, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 565
    .line 566
    .line 567
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 572
    .line 573
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 574
    .line 575
    .line 576
    check-cast p1, Ljava/util/ArrayList;

    .line 577
    .line 578
    const/4 v1, 0x0

    .line 579
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    check-cast v2, LPc/m;

    .line 584
    .line 585
    const/4 v3, 0x1

    .line 586
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    check-cast v3, Ljava/lang/String;

    .line 591
    .line 592
    const/4 v4, 0x2

    .line 593
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    check-cast p1, LPc/C;

    .line 598
    .line 599
    new-instance v4, LPc/o;

    .line 600
    .line 601
    const/4 v5, 0x6

    .line 602
    invoke-direct {v4, v0, p2, v5}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 603
    .line 604
    .line 605
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 606
    .line 607
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    invoke-static {v2}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 611
    .line 612
    .line 613
    move-result-object p2

    .line 614
    if-nez p2, :cond_a

    .line 615
    .line 616
    invoke-static {}, La/a;->B()LPc/t;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    invoke-virtual {v4, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 621
    .line 622
    .line 623
    goto :goto_4

    .line 624
    :cond_a
    if-nez p1, :cond_b

    .line 625
    .line 626
    move-object p1, p2

    .line 627
    check-cast p1, LK8/e;

    .line 628
    .line 629
    iget-object p1, p1, LK8/e;->c:Ljava/lang/String;

    .line 630
    .line 631
    invoke-static {p1}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 636
    .line 637
    .line 638
    move-result-object p1

    .line 639
    invoke-virtual {p1, p2, v1}, Lcom/google/firebase/auth/FirebaseAuth;->i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    new-instance v0, LDd/c;

    .line 644
    .line 645
    const/4 v1, 0x0

    .line 646
    const/4 v2, 0x6

    .line 647
    invoke-direct {v0, p2, v3, v1, v2}, LDd/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    new-instance p2, LPc/j;

    .line 655
    .line 656
    const/4 v0, 0x0

    .line 657
    invoke-direct {p2, v4, v0}, LPc/j;-><init>(LPc/o;I)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 661
    .line 662
    .line 663
    goto :goto_4

    .line 664
    :cond_b
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->V(LPc/C;)LJ8/b;

    .line 665
    .line 666
    .line 667
    move-result-object p1

    .line 668
    move-object v0, p2

    .line 669
    check-cast v0, LK8/e;

    .line 670
    .line 671
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 672
    .line 673
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v0, p2, v1}, Lcom/google/firebase/auth/FirebaseAuth;->i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    new-instance v1, LDd/c;

    .line 686
    .line 687
    const/4 v2, 0x6

    .line 688
    invoke-direct {v1, p2, v3, p1, v2}, LDd/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    new-instance p2, LPc/j;

    .line 696
    .line 697
    const/4 v0, 0x1

    .line 698
    invoke-direct {p2, v4, v0}, LPc/j;-><init>(LPc/o;I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 702
    .line 703
    .line 704
    :goto_4
    return-void

    .line 705
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    .line 706
    .line 707
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 708
    .line 709
    .line 710
    check-cast p1, Ljava/util/ArrayList;

    .line 711
    .line 712
    const/4 v1, 0x0

    .line 713
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    check-cast v2, LPc/m;

    .line 718
    .line 719
    const/4 v3, 0x1

    .line 720
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object p1

    .line 724
    check-cast p1, LPc/P;

    .line 725
    .line 726
    new-instance v4, LPc/q;

    .line 727
    .line 728
    const/4 v5, 0x5

    .line 729
    invoke-direct {v4, v0, p2, v5}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 730
    .line 731
    .line 732
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 733
    .line 734
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    invoke-static {v2}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 738
    .line 739
    .line 740
    move-result-object p2

    .line 741
    if-nez p2, :cond_c

    .line 742
    .line 743
    invoke-static {}, La/a;->B()LPc/t;

    .line 744
    .line 745
    .line 746
    move-result-object p1

    .line 747
    invoke-virtual {v4, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 748
    .line 749
    .line 750
    goto :goto_8

    .line 751
    :cond_c
    iget-object v0, p1, LPc/P;->c:Ljava/lang/Boolean;

    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 754
    .line 755
    .line 756
    move-result v0

    .line 757
    const/4 v2, 0x0

    .line 758
    if-eqz v0, :cond_e

    .line 759
    .line 760
    iget-object v0, p1, LPc/P;->a:Ljava/lang/String;

    .line 761
    .line 762
    if-nez v0, :cond_d

    .line 763
    .line 764
    move-object v0, v2

    .line 765
    move v5, v3

    .line 766
    goto :goto_5

    .line 767
    :cond_d
    move v5, v1

    .line 768
    goto :goto_5

    .line 769
    :cond_e
    move v5, v1

    .line 770
    move-object v0, v2

    .line 771
    :goto_5
    iget-object v6, p1, LPc/P;->d:Ljava/lang/Boolean;

    .line 772
    .line 773
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 774
    .line 775
    .line 776
    move-result v6

    .line 777
    if-eqz v6, :cond_10

    .line 778
    .line 779
    iget-object p1, p1, LPc/P;->b:Ljava/lang/String;

    .line 780
    .line 781
    if-eqz p1, :cond_f

    .line 782
    .line 783
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 784
    .line 785
    .line 786
    move-result-object p1

    .line 787
    if-nez p1, :cond_11

    .line 788
    .line 789
    :cond_f
    move-object p1, v2

    .line 790
    move v1, v3

    .line 791
    goto :goto_6

    .line 792
    :cond_10
    move-object p1, v2

    .line 793
    :cond_11
    :goto_6
    new-instance v3, LJ8/F;

    .line 794
    .line 795
    if-nez p1, :cond_12

    .line 796
    .line 797
    goto :goto_7

    .line 798
    :cond_12
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    :goto_7
    invoke-direct {v3, v0, v2, v5, v1}, LJ8/F;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 803
    .line 804
    .line 805
    move-object p1, p2

    .line 806
    check-cast p1, LK8/e;

    .line 807
    .line 808
    iget-object p1, p1, LK8/e;->c:Ljava/lang/String;

    .line 809
    .line 810
    invoke-static {p1}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 811
    .line 812
    .line 813
    move-result-object p1

    .line 814
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 815
    .line 816
    .line 817
    move-result-object p1

    .line 818
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    new-instance v0, LJ8/h;

    .line 822
    .line 823
    const/4 v1, 0x0

    .line 824
    invoke-direct {v0, p1, v1}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 825
    .line 826
    .line 827
    iget-object v1, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 828
    .line 829
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 830
    .line 831
    invoke-virtual {v1, p1, p2, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;LJ8/F;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 832
    .line 833
    .line 834
    move-result-object p1

    .line 835
    new-instance v0, LPc/h;

    .line 836
    .line 837
    invoke-direct {v0, p2, v4}, LPc/h;-><init>(LJ8/o;LPc/q;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 841
    .line 842
    .line 843
    :goto_8
    return-void

    .line 844
    :pswitch_6
    new-instance v0, Ljava/util/ArrayList;

    .line 845
    .line 846
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 847
    .line 848
    .line 849
    check-cast p1, Ljava/util/ArrayList;

    .line 850
    .line 851
    const/4 v1, 0x0

    .line 852
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    check-cast v1, LPc/m;

    .line 857
    .line 858
    const/4 v2, 0x1

    .line 859
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object p1

    .line 863
    check-cast p1, Ljava/util/Map;

    .line 864
    .line 865
    new-instance v2, LPc/p;

    .line 866
    .line 867
    const/4 v3, 0x5

    .line 868
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 869
    .line 870
    .line 871
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 872
    .line 873
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 877
    .line 878
    .line 879
    move-result-object p2

    .line 880
    if-nez p2, :cond_13

    .line 881
    .line 882
    invoke-static {}, La/a;->B()LPc/t;

    .line 883
    .line 884
    .line 885
    move-result-object p1

    .line 886
    invoke-virtual {v2, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 887
    .line 888
    .line 889
    goto :goto_9

    .line 890
    :cond_13
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->W(Ljava/util/Map;)LJ8/d;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    check-cast p1, LJ8/u;

    .line 895
    .line 896
    if-nez p1, :cond_14

    .line 897
    .line 898
    invoke-static {}, La/a;->A()LPc/t;

    .line 899
    .line 900
    .line 901
    move-result-object p1

    .line 902
    invoke-virtual {v2, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 903
    .line 904
    .line 905
    goto :goto_9

    .line 906
    :cond_14
    move-object v0, p2

    .line 907
    check-cast v0, LK8/e;

    .line 908
    .line 909
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 910
    .line 911
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-virtual {p1}, LJ8/u;->clone()Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object p1

    .line 926
    check-cast p1, LJ8/u;

    .line 927
    .line 928
    new-instance v1, LJ8/h;

    .line 929
    .line 930
    const/4 v3, 0x0

    .line 931
    invoke-direct {v1, v0, v3}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 932
    .line 933
    .line 934
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 935
    .line 936
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 937
    .line 938
    invoke-virtual {v3, v0, p2, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;LJ8/u;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 939
    .line 940
    .line 941
    move-result-object p1

    .line 942
    new-instance v0, LPc/e;

    .line 943
    .line 944
    invoke-direct {v0, p2, v2}, LPc/e;-><init>(LJ8/o;LPc/p;)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 948
    .line 949
    .line 950
    :goto_9
    return-void

    .line 951
    :pswitch_7
    new-instance v0, Ljava/util/ArrayList;

    .line 952
    .line 953
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 954
    .line 955
    .line 956
    check-cast p1, Ljava/util/ArrayList;

    .line 957
    .line 958
    const/4 v1, 0x0

    .line 959
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    check-cast v1, LPc/m;

    .line 964
    .line 965
    const/4 v2, 0x1

    .line 966
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object p1

    .line 970
    check-cast p1, Ljava/lang/String;

    .line 971
    .line 972
    new-instance v2, LPc/o;

    .line 973
    .line 974
    const/4 v3, 0x5

    .line 975
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 976
    .line 977
    .line 978
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 979
    .line 980
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 984
    .line 985
    .line 986
    move-result-object p2

    .line 987
    if-nez p2, :cond_15

    .line 988
    .line 989
    invoke-static {}, La/a;->B()LPc/t;

    .line 990
    .line 991
    .line 992
    move-result-object p1

    .line 993
    invoke-virtual {v2, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 994
    .line 995
    .line 996
    goto :goto_a

    .line 997
    :cond_15
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    move-object v0, p2

    .line 1001
    check-cast v0, LK8/e;

    .line 1002
    .line 1003
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 1004
    .line 1005
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    new-instance v1, LJ8/h;

    .line 1020
    .line 1021
    const/4 v3, 0x0

    .line 1022
    invoke-direct {v1, v0, v3}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 1023
    .line 1024
    .line 1025
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1026
    .line 1027
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1028
    .line 1029
    invoke-virtual {v3, v0, p2, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzd(Ls8/g;LJ8/o;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 1030
    .line 1031
    .line 1032
    move-result-object p1

    .line 1033
    new-instance v0, LPc/f;

    .line 1034
    .line 1035
    invoke-direct {v0, p2, v2}, LPc/f;-><init>(LJ8/o;LPc/o;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1039
    .line 1040
    .line 1041
    :goto_a
    return-void

    .line 1042
    :pswitch_8
    new-instance v0, Ljava/util/ArrayList;

    .line 1043
    .line 1044
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1045
    .line 1046
    .line 1047
    check-cast p1, Ljava/util/ArrayList;

    .line 1048
    .line 1049
    const/4 v1, 0x0

    .line 1050
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    check-cast v1, LPc/m;

    .line 1055
    .line 1056
    const/4 v2, 0x1

    .line 1057
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object p1

    .line 1061
    check-cast p1, Ljava/lang/String;

    .line 1062
    .line 1063
    new-instance v2, LPc/q;

    .line 1064
    .line 1065
    const/4 v3, 0x4

    .line 1066
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1067
    .line 1068
    .line 1069
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 1070
    .line 1071
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 1075
    .line 1076
    .line 1077
    move-result-object p2

    .line 1078
    if-nez p2, :cond_16

    .line 1079
    .line 1080
    invoke-static {}, La/a;->B()LPc/t;

    .line 1081
    .line 1082
    .line 1083
    move-result-object p1

    .line 1084
    invoke-virtual {v2, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_b

    .line 1088
    :cond_16
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    move-object v0, p2

    .line 1092
    check-cast v0, LK8/e;

    .line 1093
    .line 1094
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 1095
    .line 1096
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    new-instance v1, LJ8/h;

    .line 1111
    .line 1112
    const/4 v3, 0x0

    .line 1113
    invoke-direct {v1, v0, v3}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 1114
    .line 1115
    .line 1116
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1117
    .line 1118
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1119
    .line 1120
    invoke-virtual {v3, v0, p2, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzc(Ls8/g;LJ8/o;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 1121
    .line 1122
    .line 1123
    move-result-object p1

    .line 1124
    new-instance v0, LPc/g;

    .line 1125
    .line 1126
    invoke-direct {v0, p2, v2}, LPc/g;-><init>(LJ8/o;LPc/q;)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1130
    .line 1131
    .line 1132
    :goto_b
    return-void

    .line 1133
    :pswitch_9
    new-instance v0, Ljava/util/ArrayList;

    .line 1134
    .line 1135
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1136
    .line 1137
    .line 1138
    check-cast p1, Ljava/util/ArrayList;

    .line 1139
    .line 1140
    const/4 v1, 0x0

    .line 1141
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    check-cast v1, LPc/m;

    .line 1146
    .line 1147
    const/4 v2, 0x1

    .line 1148
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object p1

    .line 1152
    check-cast p1, Ljava/lang/String;

    .line 1153
    .line 1154
    new-instance v2, LPc/o;

    .line 1155
    .line 1156
    const/16 v3, 0x9

    .line 1157
    .line 1158
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1159
    .line 1160
    .line 1161
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 1162
    .line 1163
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1164
    .line 1165
    .line 1166
    invoke-static {v1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 1167
    .line 1168
    .line 1169
    move-result-object p2

    .line 1170
    if-nez p2, :cond_17

    .line 1171
    .line 1172
    invoke-static {}, La/a;->B()LPc/t;

    .line 1173
    .line 1174
    .line 1175
    move-result-object p1

    .line 1176
    invoke-virtual {v2, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_c

    .line 1180
    :cond_17
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1181
    .line 1182
    .line 1183
    move-object v0, p2

    .line 1184
    check-cast v0, LK8/e;

    .line 1185
    .line 1186
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 1187
    .line 1188
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    new-instance v1, LJ8/h;

    .line 1203
    .line 1204
    const/4 v3, 0x0

    .line 1205
    invoke-direct {v1, v0, v3}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 1206
    .line 1207
    .line 1208
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1209
    .line 1210
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 1211
    .line 1212
    invoke-virtual {v3, v0, p2, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzb(Ls8/g;LJ8/o;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 1213
    .line 1214
    .line 1215
    move-result-object p1

    .line 1216
    new-instance p2, LPc/b;

    .line 1217
    .line 1218
    const/16 v0, 0xe

    .line 1219
    .line 1220
    invoke-direct {p2, v2, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1224
    .line 1225
    .line 1226
    :goto_c
    return-void

    .line 1227
    :pswitch_a
    new-instance v0, Ljava/util/ArrayList;

    .line 1228
    .line 1229
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1230
    .line 1231
    .line 1232
    check-cast p1, Ljava/util/ArrayList;

    .line 1233
    .line 1234
    const/4 v1, 0x0

    .line 1235
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v2

    .line 1239
    check-cast v2, LPc/m;

    .line 1240
    .line 1241
    const/4 v3, 0x1

    .line 1242
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    move-result-object p1

    .line 1246
    check-cast p1, LPc/C;

    .line 1247
    .line 1248
    new-instance v3, LPc/q;

    .line 1249
    .line 1250
    const/16 v4, 0x8

    .line 1251
    .line 1252
    invoke-direct {v3, v0, p2, v4}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1253
    .line 1254
    .line 1255
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 1256
    .line 1257
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1258
    .line 1259
    .line 1260
    invoke-static {v2}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 1261
    .line 1262
    .line 1263
    move-result-object p2

    .line 1264
    if-nez p2, :cond_18

    .line 1265
    .line 1266
    invoke-static {}, La/a;->B()LPc/t;

    .line 1267
    .line 1268
    .line 1269
    move-result-object p1

    .line 1270
    invoke-virtual {v3, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 1271
    .line 1272
    .line 1273
    goto :goto_d

    .line 1274
    :cond_18
    if-nez p1, :cond_19

    .line 1275
    .line 1276
    move-object p1, p2

    .line 1277
    check-cast p1, LK8/e;

    .line 1278
    .line 1279
    iget-object p1, p1, LK8/e;->c:Ljava/lang/String;

    .line 1280
    .line 1281
    invoke-static {p1}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 1282
    .line 1283
    .line 1284
    move-result-object p1

    .line 1285
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1286
    .line 1287
    .line 1288
    move-result-object p1

    .line 1289
    invoke-virtual {p1, p2, v1}, Lcom/google/firebase/auth/FirebaseAuth;->i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;

    .line 1290
    .line 1291
    .line 1292
    move-result-object p1

    .line 1293
    new-instance v0, LY9/c;

    .line 1294
    .line 1295
    const/16 v1, 0xf

    .line 1296
    .line 1297
    invoke-direct {v0, p2, v1}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 1301
    .line 1302
    .line 1303
    move-result-object p1

    .line 1304
    new-instance p2, LPc/i;

    .line 1305
    .line 1306
    const/4 v0, 0x0

    .line 1307
    invoke-direct {p2, v3, v0}, LPc/i;-><init>(LPc/q;I)V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1311
    .line 1312
    .line 1313
    goto :goto_d

    .line 1314
    :cond_19
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->V(LPc/C;)LJ8/b;

    .line 1315
    .line 1316
    .line 1317
    move-result-object p1

    .line 1318
    move-object v0, p2

    .line 1319
    check-cast v0, LK8/e;

    .line 1320
    .line 1321
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 1322
    .line 1323
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    invoke-virtual {v0, p2, v1}, Lcom/google/firebase/auth/FirebaseAuth;->i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v0

    .line 1335
    new-instance v1, LS3/c;

    .line 1336
    .line 1337
    const/16 v2, 0xa

    .line 1338
    .line 1339
    invoke-direct {v1, v2, p2, p1}, LS3/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 1343
    .line 1344
    .line 1345
    move-result-object p1

    .line 1346
    new-instance p2, LPc/i;

    .line 1347
    .line 1348
    const/4 v0, 0x1

    .line 1349
    invoke-direct {p2, v3, v0}, LPc/i;-><init>(LPc/q;I)V

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1353
    .line 1354
    .line 1355
    :goto_d
    return-void

    .line 1356
    :pswitch_b
    new-instance v0, Ljava/util/ArrayList;

    .line 1357
    .line 1358
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1359
    .line 1360
    .line 1361
    check-cast p1, Ljava/util/ArrayList;

    .line 1362
    .line 1363
    const/4 v1, 0x0

    .line 1364
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object p1

    .line 1368
    check-cast p1, LPc/m;

    .line 1369
    .line 1370
    new-instance v1, LPc/p;

    .line 1371
    .line 1372
    const/16 v2, 0x8

    .line 1373
    .line 1374
    invoke-direct {v1, v0, p2, v2}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1375
    .line 1376
    .line 1377
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 1378
    .line 1379
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1380
    .line 1381
    .line 1382
    invoke-static {p1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 1383
    .line 1384
    .line 1385
    move-result-object p1

    .line 1386
    if-nez p1, :cond_1a

    .line 1387
    .line 1388
    invoke-static {}, La/a;->B()LPc/t;

    .line 1389
    .line 1390
    .line 1391
    move-result-object p1

    .line 1392
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 1393
    .line 1394
    .line 1395
    goto :goto_e

    .line 1396
    :cond_1a
    invoke-virtual {p1}, LJ8/o;->X()Lcom/google/android/gms/tasks/Task;

    .line 1397
    .line 1398
    .line 1399
    move-result-object p2

    .line 1400
    new-instance v0, LA5/h;

    .line 1401
    .line 1402
    const/16 v2, 0x12

    .line 1403
    .line 1404
    invoke-direct {v0, v2, v1, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1408
    .line 1409
    .line 1410
    :goto_e
    return-void

    .line 1411
    :pswitch_c
    new-instance v0, Ljava/util/ArrayList;

    .line 1412
    .line 1413
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1414
    .line 1415
    .line 1416
    check-cast p1, Ljava/util/ArrayList;

    .line 1417
    .line 1418
    const/4 v1, 0x0

    .line 1419
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object p1

    .line 1423
    check-cast p1, LPc/m;

    .line 1424
    .line 1425
    new-instance v1, LPc/p;

    .line 1426
    .line 1427
    const/4 v2, 0x6

    .line 1428
    invoke-direct {v1, v0, p2, v2}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1429
    .line 1430
    .line 1431
    iget-object p2, p0, LPc/s;->b:Lxa/d;

    .line 1432
    .line 1433
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1434
    .line 1435
    .line 1436
    invoke-static {p1}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 1437
    .line 1438
    .line 1439
    move-result-object p1

    .line 1440
    if-nez p1, :cond_1b

    .line 1441
    .line 1442
    invoke-static {}, La/a;->B()LPc/t;

    .line 1443
    .line 1444
    .line 1445
    move-result-object p1

    .line 1446
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 1447
    .line 1448
    .line 1449
    goto :goto_f

    .line 1450
    :cond_1b
    move-object p2, p1

    .line 1451
    check-cast p2, LK8/e;

    .line 1452
    .line 1453
    iget-object p2, p2, LK8/e;->c:Ljava/lang/String;

    .line 1454
    .line 1455
    invoke-static {p2}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 1456
    .line 1457
    .line 1458
    move-result-object p2

    .line 1459
    invoke-static {p2}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1460
    .line 1461
    .line 1462
    move-result-object p2

    .line 1463
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1464
    .line 1465
    .line 1466
    new-instance v0, LJ8/N;

    .line 1467
    .line 1468
    invoke-direct {v0, p2, p1}, LJ8/N;-><init>(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V

    .line 1469
    .line 1470
    .line 1471
    iget-object p2, p2, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 1472
    .line 1473
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(LJ8/o;LK8/m;)Lcom/google/android/gms/tasks/Task;

    .line 1474
    .line 1475
    .line 1476
    move-result-object p1

    .line 1477
    new-instance p2, LPc/b;

    .line 1478
    .line 1479
    const/16 v0, 0xf

    .line 1480
    .line 1481
    invoke-direct {p2, v1, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1485
    .line 1486
    .line 1487
    :goto_f
    return-void

    .line 1488
    nop

    .line 1489
    :pswitch_data_0
    .packed-switch 0x0
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
