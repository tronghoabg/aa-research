.class public Lcom/google/firebase/auth/FirebaseAuth;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK8/a;


# instance fields
.field public final A:Ljava/util/concurrent/Executor;

.field public B:Ljava/lang/String;

.field public final a:Ls8/g;

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

.field public f:LJ8/o;

.field public final g:LK8/f;

.field public final h:Ljava/lang/Object;

.field public i:Ljava/lang/String;

.field public final j:Ljava/lang/Object;

.field public k:Ljava/lang/String;

.field public l:LC6/l;

.field public final m:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final n:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final o:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final p:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final q:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final r:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final s:LDd/c;

.field public final t:LK8/F;

.field public final u:LK8/b;

.field public final v:LO9/b;

.field public final w:LO9/b;

.field public x:LK8/z;

.field public final y:Ljava/util/concurrent/Executor;

.field public final z:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ls8/g;LO9/b;LO9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 3
    .line 4
    invoke-direct {v1, p1, p4, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;-><init>(Ls8/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 5
    .line 6
    .line 7
    new-instance p6, LDd/c;

    .line 8
    .line 9
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ls8/g;->g()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x7

    .line 17
    invoke-direct {p6, v3, v0}, LDd/c;-><init>(IZ)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p1, Ls8/g;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iput-object v3, p6, LDd/c;->b:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v4, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v5, "com.google.firebase.auth.api.Store."

    .line 37
    .line 38
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v3, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, p6, LDd/c;->c:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v3, Lh7/a;

    .line 55
    .line 56
    const-string v4, "StorageHelpers"

    .line 57
    .line 58
    new-array v5, v0, [Ljava/lang/String;

    .line 59
    .line 60
    invoke-direct {v3, v4, v5}, Lh7/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object v3, p6, LDd/c;->d:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object v3, LK8/F;->c:LK8/F;

    .line 66
    .line 67
    sget-object v4, LK8/b;->c:LK8/b;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 78
    .line 79
    new-instance v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 85
    .line 86
    new-instance v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 87
    .line 88
    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 92
    .line 93
    new-instance v5, Ljava/lang/Object;

    .line 94
    .line 95
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    .line 99
    .line 100
    new-instance v5, Ljava/lang/Object;

    .line 101
    .line 102
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    .line 106
    .line 107
    const-string v5, "getOobCode"

    .line 108
    .line 109
    invoke-static {v5}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 114
    .line 115
    const-string v5, "signInWithPassword"

    .line 116
    .line 117
    invoke-static {v5}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->n:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 122
    .line 123
    const-string v5, "signUpPassword"

    .line 124
    .line 125
    invoke-static {v5}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->o:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 130
    .line 131
    const-string v5, "sendVerificationCode"

    .line 132
    .line 133
    invoke-static {v5}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->p:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 138
    .line 139
    const-string v5, "mfaSmsEnrollment"

    .line 140
    .line 141
    invoke-static {v5}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->q:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 146
    .line 147
    const-string v5, "mfaSmsSignIn"

    .line 148
    .line 149
    invoke-static {v5}, Lcom/google/android/recaptcha/RecaptchaAction;->custom(Ljava/lang/String;)Lcom/google/android/recaptcha/RecaptchaAction;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    iput-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->r:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 154
    .line 155
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 156
    .line 157
    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 158
    .line 159
    iput-object p6, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:LDd/c;

    .line 160
    .line 161
    new-instance p1, LK8/f;

    .line 162
    .line 163
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    iput-boolean v0, p1, LK8/f;->a:Z

    .line 167
    .line 168
    iput-boolean v0, p1, LK8/f;->b:Z

    .line 169
    .line 170
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 171
    .line 172
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iput-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->t:LK8/F;

    .line 176
    .line 177
    iput-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->u:LK8/b;

    .line 178
    .line 179
    iput-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->v:LO9/b;

    .line 180
    .line 181
    iput-object p3, p0, Lcom/google/firebase/auth/FirebaseAuth;->w:LO9/b;

    .line 182
    .line 183
    iput-object p4, p0, Lcom/google/firebase/auth/FirebaseAuth;->y:Ljava/util/concurrent/Executor;

    .line 184
    .line 185
    iput-object p5, p0, Lcom/google/firebase/auth/FirebaseAuth;->z:Ljava/util/concurrent/Executor;

    .line 186
    .line 187
    iput-object p7, p0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    .line 188
    .line 189
    const-string p1, "type"

    .line 190
    .line 191
    const-string p2, "com.google.firebase.auth.FIREBASE_USER"

    .line 192
    .line 193
    const/4 p3, 0x0

    .line 194
    invoke-interface {v2, p2, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 199
    .line 200
    .line 201
    move-result p4

    .line 202
    if-eqz p4, :cond_1

    .line 203
    .line 204
    :catch_0
    :cond_0
    move-object p1, p3

    .line 205
    goto :goto_0

    .line 206
    :cond_1
    :try_start_0
    new-instance p4, Lorg/json/JSONObject;

    .line 207
    .line 208
    invoke-direct {p4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p4, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_0

    .line 216
    .line 217
    invoke-virtual {p4, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    const-string p2, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    .line 222
    .line 223
    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-eqz p1, :cond_0

    .line 228
    .line 229
    invoke-virtual {p6, p4}, LDd/c;->T(Lorg/json/JSONObject;)LK8/e;

    .line 230
    .line 231
    .line 232
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    :goto_0
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 234
    .line 235
    if-eqz p1, :cond_3

    .line 236
    .line 237
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:LDd/c;

    .line 238
    .line 239
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    iget-object p1, p1, LK8/e;->b:LK8/U;

    .line 243
    .line 244
    iget-object p1, p1, LK8/U;->a:Ljava/lang/String;

    .line 245
    .line 246
    const-string p4, "com.google.firebase.auth.GET_TOKEN_RESPONSE."

    .line 247
    .line 248
    invoke-static {p4, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object p2, p2, LDd/c;->c:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p2, Landroid/content/SharedPreferences;

    .line 255
    .line 256
    invoke-interface {p2, p1, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-eqz p1, :cond_2

    .line 261
    .line 262
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    goto :goto_1

    .line 267
    :cond_2
    move-object p1, p3

    .line 268
    :goto_1
    if-eqz p1, :cond_3

    .line 269
    .line 270
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 271
    .line 272
    invoke-static {p0, p2, p1, v0, v0}, Lcom/google/firebase/auth/FirebaseAuth;->l(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;ZZ)V

    .line 273
    .line 274
    .line 275
    :cond_3
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->t:LK8/F;

    .line 276
    .line 277
    iget-object p1, p1, LK8/F;->a:LK8/x;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 283
    .line 284
    invoke-virtual {p2}, Ls8/g;->a()V

    .line 285
    .line 286
    .line 287
    iget-object p4, p2, Ls8/g;->a:Landroid/content/Context;

    .line 288
    .line 289
    const-string p5, "com.google.firebase.auth.internal.ProcessDeathHelper"

    .line 290
    .line 291
    invoke-virtual {p4, p5, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 292
    .line 293
    .line 294
    move-result-object p4

    .line 295
    const-string p5, "firebaseAppName"

    .line 296
    .line 297
    const-string p6, ""

    .line 298
    .line 299
    invoke-interface {p4, p5, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p5

    .line 303
    invoke-virtual {p2}, Ls8/g;->a()V

    .line 304
    .line 305
    .line 306
    iget-object p2, p2, Ls8/g;->b:Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result p2

    .line 312
    if-nez p2, :cond_4

    .line 313
    .line 314
    goto/16 :goto_7

    .line 315
    .line 316
    :cond_4
    const-string p2, "verifyAssertionRequest"

    .line 317
    .line 318
    invoke-interface {p4, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result p5

    .line 322
    const-string p7, "operation"

    .line 323
    .line 324
    const-wide/16 v1, 0x0

    .line 325
    .line 326
    const-string v3, "timestamp"

    .line 327
    .line 328
    if-eqz p5, :cond_b

    .line 329
    .line 330
    invoke-interface {p4, p2, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    sget-object p5, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 335
    .line 336
    if-nez p2, :cond_5

    .line 337
    .line 338
    move-object p2, p3

    .line 339
    goto :goto_2

    .line 340
    :cond_5
    const/16 v4, 0xa

    .line 341
    .line 342
    invoke-static {p2, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    :goto_2
    invoke-static {p2, p5}, Landroid/support/v4/media/session/b;->c0([BLandroid/os/Parcelable$Creator;)Lf7/c;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;

    .line 351
    .line 352
    invoke-interface {p4, p7, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p5

    .line 356
    const-string p7, "tenantId"

    .line 357
    .line 358
    invoke-interface {p4, p7, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p3

    .line 362
    const-string p7, "firebaseUserUid"

    .line 363
    .line 364
    invoke-interface {p4, p7, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p6

    .line 368
    invoke-interface {p4, v3, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 369
    .line 370
    .line 371
    move-result-wide v1

    .line 372
    iput-wide v1, p1, LK8/x;->b:J

    .line 373
    .line 374
    if-eqz p3, :cond_6

    .line 375
    .line 376
    invoke-virtual {p0, p3}, Lcom/google/firebase/auth/FirebaseAuth;->f(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzahr;

    .line 380
    .line 381
    .line 382
    :cond_6
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    const/4 p1, -0x1

    .line 386
    invoke-virtual {p5}, Ljava/lang/String;->hashCode()I

    .line 387
    .line 388
    .line 389
    move-result p3

    .line 390
    sparse-switch p3, :sswitch_data_0

    .line 391
    .line 392
    .line 393
    :goto_3
    move v0, p1

    .line 394
    goto :goto_4

    .line 395
    :sswitch_0
    const-string p3, "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"

    .line 396
    .line 397
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result p3

    .line 401
    if-nez p3, :cond_7

    .line 402
    .line 403
    goto :goto_3

    .line 404
    :cond_7
    const/4 v0, 0x2

    .line 405
    goto :goto_4

    .line 406
    :sswitch_1
    const-string p3, "com.google.firebase.auth.internal.NONGMSCORE_LINK"

    .line 407
    .line 408
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result p3

    .line 412
    if-nez p3, :cond_8

    .line 413
    .line 414
    goto :goto_3

    .line 415
    :cond_8
    const/4 v0, 0x1

    .line 416
    goto :goto_4

    .line 417
    :sswitch_2
    const-string p3, "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"

    .line 418
    .line 419
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result p3

    .line 423
    if-nez p3, :cond_9

    .line 424
    .line 425
    goto :goto_3

    .line 426
    :cond_9
    :goto_4
    packed-switch v0, :pswitch_data_0

    .line 427
    .line 428
    .line 429
    goto :goto_5

    .line 430
    :pswitch_0
    invoke-static {p2}, LJ8/I;->Y(Lcom/google/android/gms/internal/firebase-auth-api/zzahr;)LJ8/I;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    invoke-virtual {p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->g(LJ8/d;)Lcom/google/android/gms/tasks/Task;

    .line 435
    .line 436
    .line 437
    goto :goto_5

    .line 438
    :pswitch_1
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 439
    .line 440
    check-cast p1, LK8/e;

    .line 441
    .line 442
    iget-object p1, p1, LK8/e;->b:LK8/U;

    .line 443
    .line 444
    iget-object p1, p1, LK8/U;->a:Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {p1, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    if-eqz p1, :cond_a

    .line 451
    .line 452
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 453
    .line 454
    invoke-static {p2}, LJ8/I;->Y(Lcom/google/android/gms/internal/firebase-auth-api/zzahr;)LJ8/I;

    .line 455
    .line 456
    .line 457
    move-result-object p2

    .line 458
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->h(LJ8/o;LJ8/d;)Lcom/google/android/gms/tasks/Task;

    .line 459
    .line 460
    .line 461
    goto :goto_5

    .line 462
    :pswitch_2
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 463
    .line 464
    check-cast p1, LK8/e;

    .line 465
    .line 466
    iget-object p1, p1, LK8/e;->b:LK8/U;

    .line 467
    .line 468
    iget-object p1, p1, LK8/U;->a:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {p1, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result p1

    .line 474
    if-eqz p1, :cond_a

    .line 475
    .line 476
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 477
    .line 478
    invoke-static {p2}, LJ8/I;->Y(Lcom/google/android/gms/internal/firebase-auth-api/zzahr;)LJ8/I;

    .line 479
    .line 480
    .line 481
    move-result-object p2

    .line 482
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->p(LJ8/o;LJ8/d;)Lcom/google/android/gms/tasks/Task;

    .line 483
    .line 484
    .line 485
    :cond_a
    :goto_5
    invoke-static {p4}, LK8/x;->d(Landroid/content/SharedPreferences;)V

    .line 486
    .line 487
    .line 488
    goto :goto_7

    .line 489
    :cond_b
    const-string p2, "recaptchaToken"

    .line 490
    .line 491
    invoke-interface {p4, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 492
    .line 493
    .line 494
    move-result p5

    .line 495
    if-eqz p5, :cond_d

    .line 496
    .line 497
    invoke-interface {p4, p2, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p2

    .line 501
    invoke-interface {p4, p7, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object p5

    .line 505
    invoke-interface {p4, v3, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 506
    .line 507
    .line 508
    move-result-wide p6

    .line 509
    iput-wide p6, p1, LK8/x;->b:J

    .line 510
    .line 511
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    const-string p6, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"

    .line 515
    .line 516
    invoke-virtual {p5, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result p5

    .line 520
    if-nez p5, :cond_c

    .line 521
    .line 522
    iput-object p3, p1, LK8/x;->a:Lcom/google/android/gms/tasks/Task;

    .line 523
    .line 524
    goto :goto_6

    .line 525
    :cond_c
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 526
    .line 527
    .line 528
    move-result-object p2

    .line 529
    iput-object p2, p1, LK8/x;->a:Lcom/google/android/gms/tasks/Task;

    .line 530
    .line 531
    :goto_6
    invoke-static {p4}, LK8/x;->d(Landroid/content/SharedPreferences;)V

    .line 532
    .line 533
    .line 534
    goto :goto_7

    .line 535
    :cond_d
    const-string p2, "statusCode"

    .line 536
    .line 537
    invoke-interface {p4, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 538
    .line 539
    .line 540
    move-result p5

    .line 541
    if-eqz p5, :cond_e

    .line 542
    .line 543
    const/16 p5, 0x42a6

    .line 544
    .line 545
    invoke-interface {p4, p2, p5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 546
    .line 547
    .line 548
    move-result p2

    .line 549
    const-string p5, "statusMessage"

    .line 550
    .line 551
    invoke-interface {p4, p5, p6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object p5

    .line 555
    new-instance p6, Lcom/google/android/gms/common/api/Status;

    .line 556
    .line 557
    invoke-direct {p6, p2, p5, p3, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 558
    .line 559
    .line 560
    invoke-interface {p4, v3, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 561
    .line 562
    .line 563
    move-result-wide p2

    .line 564
    iput-wide p2, p1, LK8/x;->b:J

    .line 565
    .line 566
    invoke-static {p4}, LK8/x;->d(Landroid/content/SharedPreferences;)V

    .line 567
    .line 568
    .line 569
    invoke-static {p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 574
    .line 575
    .line 576
    :cond_e
    :goto_7
    return-void

    .line 577
    :sswitch_data_0
    .sparse-switch
        -0x5df2262 -> :sswitch_2
        0xa6e6490 -> :sswitch_1
        0x56745691 -> :sswitch_0
    .end sparse-switch

    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getInstance()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    invoke-static {}, Ls8/g;->e()Ls8/g;

    move-result-object v0

    .line 2
    const-class v1, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0, v1}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    return-object v0
.end method

.method public static getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 3
    const-class v0, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p0, v0}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/auth/FirebaseAuth;

    return-object p0
.end method

.method public static j(LJ8/v;)V
    .locals 14

    .line 1
    iget-object v0, p0, LJ8/v;->h:LK8/j;

    .line 2
    .line 3
    iget-object v1, p0, LJ8/v;->d:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object v2, p0, LJ8/v;->f:Landroid/app/Activity;

    .line 6
    .line 7
    iget-object v3, p0, LJ8/v;->c:LPc/T;

    .line 8
    .line 9
    iget-object v4, p0, LJ8/v;->g:LJ8/w;

    .line 10
    .line 11
    iget-object v6, p0, LJ8/v;->a:Lcom/google/firebase/auth/FirebaseAuth;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    iget-object v5, v0, LK8/j;->a:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    iget-object v5, p0, LJ8/v;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move-object v7, v5

    .line 25
    move-object v13, v7

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v5, p0, LJ8/v;->i:LJ8/z;

    .line 28
    .line 29
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v7, v5, LJ8/z;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v7}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v5, v5, LJ8/z;->d:Ljava/lang/String;

    .line 38
    .line 39
    move-object v13, v7

    .line 40
    move-object v7, v5

    .line 41
    :goto_0
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-static {v13, v3, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaer;->zza(Ljava/lang/String;LJ8/x;Landroid/app/Activity;Ljava/util/concurrent/Executor;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_5

    .line 48
    .line 49
    :cond_1
    iget-object v0, v0, LK8/j;->a:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, v6, Lcom/google/firebase/auth/FirebaseAuth;->q:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 54
    .line 55
    :goto_1
    move-object v12, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    iget-object v0, v6, Lcom/google/firebase/auth/FirebaseAuth;->r:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :goto_2
    iget-object v5, v6, Lcom/google/firebase/auth/FirebaseAuth;->u:LK8/b;

    .line 61
    .line 62
    invoke-virtual {v6}, Lcom/google/firebase/auth/FirebaseAuth;->r()Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    iget-boolean v10, p0, LJ8/v;->j:Z

    .line 67
    .line 68
    iget-boolean v11, p0, LJ8/v;->k:Z

    .line 69
    .line 70
    iget-object v8, p0, LJ8/v;->f:Landroid/app/Activity;

    .line 71
    .line 72
    invoke-virtual/range {v5 .. v12}, LK8/b;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZZLcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v5, LG9/e;

    .line 77
    .line 78
    move-object v7, v6

    .line 79
    const/4 v6, 0x7

    .line 80
    const/4 v10, 0x0

    .line 81
    move-object v8, p0

    .line 82
    move-object v9, v13

    .line 83
    invoke-direct/range {v5 .. v10}, LG9/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v5}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    iget-object v7, p0, LJ8/v;->e:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v7}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    if-eqz v4, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    invoke-static {v7, v3, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaer;->zza(Ljava/lang/String;LJ8/x;Landroid/app/Activity;Ljava/util/concurrent/Executor;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    :goto_3
    iget-object v5, v6, Lcom/google/firebase/auth/FirebaseAuth;->u:LK8/b;

    .line 105
    .line 106
    invoke-virtual {v6}, Lcom/google/firebase/auth/FirebaseAuth;->r()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    iget-boolean v10, p0, LJ8/v;->j:Z

    .line 111
    .line 112
    iget-boolean v11, p0, LJ8/v;->k:Z

    .line 113
    .line 114
    iget-object v12, v6, Lcom/google/firebase/auth/FirebaseAuth;->p:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 115
    .line 116
    iget-object v8, p0, LJ8/v;->f:Landroid/app/Activity;

    .line 117
    .line 118
    invoke-virtual/range {v5 .. v12}, LK8/b;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZZLcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v1, Lb7/k;

    .line 123
    .line 124
    const/4 v2, 0x7

    .line 125
    invoke-direct {v1, v6, p0, v7, v2}, Lb7/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 129
    .line 130
    .line 131
    :cond_5
    return-void
.end method

.method public static k(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V
    .locals 3

    .line 1
    const-string v0, "FirebaseAuth"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p1, LK8/e;

    .line 6
    .line 7
    iget-object p1, p1, LK8/e;->b:LK8/U;

    .line 8
    .line 9
    iget-object p1, p1, LK8/U;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "Notifying auth state listeners about user ( "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, " )."

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p1, "Notifying auth state listeners about a sign-out event."

    .line 35
    .line 36
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    new-instance v0, LJ8/O;

    .line 42
    .line 43
    invoke-direct {v0, p0}, LJ8/O;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static l(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;ZZ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object v6, v1

    .line 18
    check-cast v6, LK8/e;

    .line 19
    .line 20
    iget-object v6, v6, LK8/e;->b:LK8/U;

    .line 21
    .line 22
    iget-object v6, v6, LK8/U;->a:Ljava/lang/String;

    .line 23
    .line 24
    check-cast v3, LK8/e;

    .line 25
    .line 26
    iget-object v3, v3, LK8/e;->b:LK8/U;

    .line 27
    .line 28
    iget-object v3, v3, LK8/U;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v4

    .line 39
    :goto_0
    if-nez v3, :cond_1

    .line 40
    .line 41
    if-eqz p4, :cond_1

    .line 42
    .line 43
    goto/16 :goto_18

    .line 44
    .line 45
    :cond_1
    iget-object v6, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 46
    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    const/4 v6, 0x1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    check-cast v6, LK8/e;

    .line 53
    .line 54
    iget-object v6, v6, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 55
    .line 56
    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzc()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzc()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    if-eqz v6, :cond_3

    .line 71
    .line 72
    move v6, v4

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/4 v6, 0x1

    .line 75
    :goto_1
    if-nez v3, :cond_4

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move v3, v4

    .line 80
    :goto_2
    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    if-eqz v7, :cond_c

    .line 84
    .line 85
    move-object v9, v1

    .line 86
    check-cast v9, LK8/e;

    .line 87
    .line 88
    iget-object v10, v9, LK8/e;->b:LK8/U;

    .line 89
    .line 90
    iget-object v10, v10, LK8/U;->a:Ljava/lang/String;

    .line 91
    .line 92
    if-nez v7, :cond_5

    .line 93
    .line 94
    move-object v7, v8

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    check-cast v7, LK8/e;

    .line 97
    .line 98
    iget-object v7, v7, LK8/e;->b:LK8/U;

    .line 99
    .line 100
    iget-object v7, v7, LK8/U;->a:Ljava/lang/String;

    .line 101
    .line 102
    :goto_3
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_6

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_6
    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 110
    .line 111
    iget-object v10, v9, LK8/e;->e:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v7, v10}, LJ8/o;->Y(Ljava/util/ArrayList;)LK8/e;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, LJ8/o;->W()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_7

    .line 121
    .line 122
    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 123
    .line 124
    check-cast v7, LK8/e;

    .line 125
    .line 126
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    iput-object v10, v7, LK8/e;->h:Ljava/lang/Boolean;

    .line 129
    .line 130
    :cond_7
    iget-object v7, v9, LK8/e;->l:LK8/w;

    .line 131
    .line 132
    if-eqz v7, :cond_9

    .line 133
    .line 134
    new-instance v10, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    iget-object v11, v7, LK8/w;->a:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_8

    .line 150
    .line 151
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    check-cast v12, LJ8/z;

    .line 156
    .line 157
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    iget-object v7, v7, LK8/w;->b:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_a

    .line 172
    .line 173
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    check-cast v11, LJ8/C;

    .line 178
    .line 179
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_9
    new-instance v10, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    :cond_a
    iget-object v7, v9, LK8/e;->m:Ljava/util/List;

    .line 189
    .line 190
    iget-object v9, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 191
    .line 192
    invoke-virtual {v9, v10}, LJ8/o;->Z(Ljava/util/ArrayList;)V

    .line 193
    .line 194
    .line 195
    iget-object v9, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 196
    .line 197
    check-cast v9, LK8/e;

    .line 198
    .line 199
    if-nez v7, :cond_b

    .line 200
    .line 201
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v7, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    :cond_b
    iput-object v7, v9, LK8/e;->m:Ljava/util/List;

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_c
    :goto_6
    iput-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 213
    .line 214
    :goto_7
    if-eqz p3, :cond_21

    .line 215
    .line 216
    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->s:LDd/c;

    .line 217
    .line 218
    iget-object v9, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 219
    .line 220
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-static {v9}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object v10, v7, LDd/c;->d:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v10, Lh7/a;

    .line 229
    .line 230
    new-instance v11, Lorg/json/JSONObject;

    .line 231
    .line 232
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    const-class v13, LK8/e;

    .line 240
    .line 241
    invoke-virtual {v13, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    if-eqz v12, :cond_20

    .line 246
    .line 247
    check-cast v9, LK8/e;

    .line 248
    .line 249
    :try_start_0
    const-string v8, "cachedTokenState"

    .line 250
    .line 251
    iget-object v12, v9, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 252
    .line 253
    invoke-virtual {v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzf()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    invoke-virtual {v11, v8, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 258
    .line 259
    .line 260
    const-string v8, "applicationName"

    .line 261
    .line 262
    iget-object v12, v9, LK8/e;->c:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v12}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    invoke-virtual {v12}, Ls8/g;->a()V

    .line 269
    .line 270
    .line 271
    iget-object v12, v12, Ls8/g;->b:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v11, v8, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 274
    .line 275
    .line 276
    const-string v8, "type"

    .line 277
    .line 278
    const-string v12, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    .line 279
    .line 280
    invoke-virtual {v11, v8, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 281
    .line 282
    .line 283
    iget-object v8, v9, LK8/e;->e:Ljava/util/ArrayList;

    .line 284
    .line 285
    if-eqz v8, :cond_17

    .line 286
    .line 287
    new-instance v8, Lorg/json/JSONArray;

    .line 288
    .line 289
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 290
    .line 291
    .line 292
    iget-object v12, v9, LK8/e;->e:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 299
    .line 300
    .line 301
    move-result v14
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 302
    const/16 v15, 0x1e

    .line 303
    .line 304
    if-le v14, v15, :cond_d

    .line 305
    .line 306
    :try_start_1
    const-string v13, "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"

    .line 307
    .line 308
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v14

    .line 312
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 313
    .line 314
    .line 315
    move-result v16

    .line 316
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v16

    .line 320
    const/16 v17, 0x1

    .line 321
    .line 322
    new-array v5, v2, [Ljava/lang/Object;

    .line 323
    .line 324
    aput-object v14, v5, v4

    .line 325
    .line 326
    aput-object v16, v5, v17

    .line 327
    .line 328
    invoke-virtual {v10, v13, v5}, Lh7/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 329
    .line 330
    .line 331
    move v13, v15

    .line 332
    goto :goto_8

    .line 333
    :catch_0
    move-exception v0

    .line 334
    goto/16 :goto_13

    .line 335
    .line 336
    :cond_d
    const/16 v17, 0x1

    .line 337
    .line 338
    :goto_8
    move v5, v4

    .line 339
    move v14, v5

    .line 340
    :goto_9
    const-string v15, "firebase"

    .line 341
    .line 342
    if-ge v5, v13, :cond_10

    .line 343
    .line 344
    :try_start_2
    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v16
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 348
    move/from16 v18, v4

    .line 349
    .line 350
    :try_start_3
    move-object/from16 v4, v16

    .line 351
    .line 352
    check-cast v4, LK8/U;

    .line 353
    .line 354
    iget-object v2, v4, LK8/U;->b:Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-eqz v2, :cond_e

    .line 361
    .line 362
    move/from16 v14, v17

    .line 363
    .line 364
    :cond_e
    add-int/lit8 v2, v13, -0x1

    .line 365
    .line 366
    if-ne v5, v2, :cond_f

    .line 367
    .line 368
    if-eqz v14, :cond_11

    .line 369
    .line 370
    :cond_f
    invoke-virtual {v4}, LK8/U;->zzb()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v8, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 375
    .line 376
    .line 377
    add-int/lit8 v5, v5, 0x1

    .line 378
    .line 379
    move/from16 v4, v18

    .line 380
    .line 381
    const/4 v2, 0x2

    .line 382
    goto :goto_9

    .line 383
    :catch_1
    move-exception v0

    .line 384
    move/from16 v4, v18

    .line 385
    .line 386
    goto/16 :goto_13

    .line 387
    .line 388
    :catch_2
    move-exception v0

    .line 389
    move/from16 v18, v4

    .line 390
    .line 391
    goto/16 :goto_13

    .line 392
    .line 393
    :cond_10
    move/from16 v18, v4

    .line 394
    .line 395
    :cond_11
    if-nez v14, :cond_16

    .line 396
    .line 397
    add-int/lit8 v2, v13, -0x1

    .line 398
    .line 399
    :goto_a
    :try_start_4
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 400
    .line 401
    .line 402
    move-result v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 403
    if-ge v2, v4, :cond_14

    .line 404
    .line 405
    if-ltz v2, :cond_14

    .line 406
    .line 407
    :try_start_5
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    check-cast v4, LK8/U;

    .line 412
    .line 413
    iget-object v5, v4, LK8/U;->b:Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    if-eqz v5, :cond_12

    .line 420
    .line 421
    invoke-virtual {v4}, LK8/U;->zzb()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-virtual {v8, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 426
    .line 427
    .line 428
    move/from16 v14, v17

    .line 429
    .line 430
    goto :goto_b

    .line 431
    :cond_12
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    add-int/lit8 v5, v5, -0x1

    .line 436
    .line 437
    if-ne v2, v5, :cond_13

    .line 438
    .line 439
    invoke-virtual {v4}, LK8/U;->zzb()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-virtual {v8, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 444
    .line 445
    .line 446
    :cond_13
    add-int/lit8 v2, v2, 0x1

    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_14
    :goto_b
    if-nez v14, :cond_16

    .line 450
    .line 451
    :try_start_6
    const-string v2, "Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d"

    .line 452
    .line 453
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    const/4 v13, 0x2

    .line 466
    new-array v13, v13, [Ljava/lang/Object;

    .line 467
    .line 468
    aput-object v4, v13, v18

    .line 469
    .line 470
    aput-object v5, v13, v17

    .line 471
    .line 472
    invoke-virtual {v10, v2, v13}, Lh7/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    const/4 v4, 0x5

    .line 480
    if-ge v2, v4, :cond_16

    .line 481
    .line 482
    new-instance v2, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    const-string v4, "Provider user info list:\n"

    .line 485
    .line 486
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 494
    .line 495
    .line 496
    move-result v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 497
    if-eqz v5, :cond_15

    .line 498
    .line 499
    :try_start_7
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    check-cast v5, LK8/U;

    .line 504
    .line 505
    iget-object v5, v5, LK8/U;->b:Ljava/lang/String;

    .line 506
    .line 507
    new-instance v12, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const-string v13, "Provider - "

    .line 513
    .line 514
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    const-string v5, "\n"

    .line 521
    .line 522
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 530
    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_15
    :try_start_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    move/from16 v4, v18

    .line 538
    .line 539
    new-array v5, v4, [Ljava/lang/Object;

    .line 540
    .line 541
    invoke-virtual {v10, v2, v5}, Lh7/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    goto :goto_d

    .line 545
    :catch_3
    move-exception v0

    .line 546
    const/4 v4, 0x0

    .line 547
    goto/16 :goto_13

    .line 548
    .line 549
    :cond_16
    :goto_d
    const-string v2, "userInfos"

    .line 550
    .line 551
    invoke-virtual {v11, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 552
    .line 553
    .line 554
    goto :goto_e

    .line 555
    :cond_17
    const/16 v17, 0x1

    .line 556
    .line 557
    :goto_e
    const-string v2, "anonymous"

    .line 558
    .line 559
    invoke-virtual {v9}, LK8/e;->W()Z

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    invoke-virtual {v11, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 564
    .line 565
    .line 566
    const-string v2, "version"

    .line 567
    .line 568
    const-string v4, "2"

    .line 569
    .line 570
    invoke-virtual {v11, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 571
    .line 572
    .line 573
    iget-object v2, v9, LK8/e;->i:LK8/g;

    .line 574
    .line 575
    if-eqz v2, :cond_18

    .line 576
    .line 577
    const-string v4, "userMetadata"

    .line 578
    .line 579
    new-instance v5, Lorg/json/JSONObject;

    .line 580
    .line 581
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 582
    .line 583
    .line 584
    :try_start_9
    const-string v8, "lastSignInTimestamp"

    .line 585
    .line 586
    iget-wide v12, v2, LK8/g;->a:J

    .line 587
    .line 588
    invoke-virtual {v5, v8, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 589
    .line 590
    .line 591
    const-string v8, "creationTimestamp"

    .line 592
    .line 593
    iget-wide v12, v2, LK8/g;->b:J

    .line 594
    .line 595
    invoke-virtual {v5, v8, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 596
    .line 597
    .line 598
    :catch_4
    :try_start_a
    invoke-virtual {v11, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 599
    .line 600
    .line 601
    :cond_18
    iget-object v2, v9, LK8/e;->l:LK8/w;

    .line 602
    .line 603
    if-eqz v2, :cond_1a

    .line 604
    .line 605
    new-instance v4, Ljava/util/ArrayList;

    .line 606
    .line 607
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 608
    .line 609
    .line 610
    iget-object v5, v2, LK8/w;->a:Ljava/util/List;

    .line 611
    .line 612
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 613
    .line 614
    .line 615
    move-result-object v5

    .line 616
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 617
    .line 618
    .line 619
    move-result v8

    .line 620
    if-eqz v8, :cond_19

    .line 621
    .line 622
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    check-cast v8, LJ8/z;

    .line 627
    .line 628
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    goto :goto_f

    .line 632
    :cond_19
    iget-object v2, v2, LK8/w;->b:Ljava/util/List;

    .line 633
    .line 634
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    if-eqz v5, :cond_1b

    .line 643
    .line 644
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v5

    .line 648
    check-cast v5, LJ8/C;

    .line 649
    .line 650
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    goto :goto_10

    .line 654
    :cond_1a
    new-instance v4, Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 657
    .line 658
    .line 659
    :cond_1b
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    if-nez v2, :cond_1d

    .line 664
    .line 665
    new-instance v2, Lorg/json/JSONArray;

    .line 666
    .line 667
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 668
    .line 669
    .line 670
    const/4 v5, 0x0

    .line 671
    :goto_11
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 672
    .line 673
    .line 674
    move-result v8

    .line 675
    if-ge v5, v8, :cond_1c

    .line 676
    .line 677
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v8

    .line 681
    check-cast v8, LJ8/t;

    .line 682
    .line 683
    invoke-virtual {v8}, LJ8/t;->X()Lorg/json/JSONObject;

    .line 684
    .line 685
    .line 686
    move-result-object v8

    .line 687
    invoke-virtual {v2, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 688
    .line 689
    .line 690
    add-int/lit8 v5, v5, 0x1

    .line 691
    .line 692
    goto :goto_11

    .line 693
    :cond_1c
    const-string v4, "userMultiFactorInfo"

    .line 694
    .line 695
    invoke-virtual {v11, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 696
    .line 697
    .line 698
    :cond_1d
    iget-object v2, v9, LK8/e;->m:Ljava/util/List;

    .line 699
    .line 700
    if-eqz v2, :cond_1f

    .line 701
    .line 702
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 703
    .line 704
    .line 705
    move-result v4

    .line 706
    if-nez v4, :cond_1f

    .line 707
    .line 708
    new-instance v4, Lorg/json/JSONArray;

    .line 709
    .line 710
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 711
    .line 712
    .line 713
    const/4 v5, 0x0

    .line 714
    :goto_12
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 715
    .line 716
    .line 717
    move-result v8

    .line 718
    if-ge v5, v8, :cond_1e

    .line 719
    .line 720
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v8

    .line 724
    check-cast v8, LJ8/H;

    .line 725
    .line 726
    new-instance v9, Lorg/json/JSONObject;

    .line 727
    .line 728
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 729
    .line 730
    .line 731
    iget-object v12, v8, LJ8/H;->a:Ljava/lang/String;

    .line 732
    .line 733
    const-string v13, "credentialId"

    .line 734
    .line 735
    invoke-virtual {v9, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 736
    .line 737
    .line 738
    const-string v12, "name"

    .line 739
    .line 740
    iget-object v13, v8, LJ8/H;->b:Ljava/lang/String;

    .line 741
    .line 742
    invoke-virtual {v9, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 743
    .line 744
    .line 745
    const-string v12, "displayName"

    .line 746
    .line 747
    iget-object v8, v8, LJ8/H;->c:Ljava/lang/String;

    .line 748
    .line 749
    invoke-virtual {v9, v12, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v4, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 753
    .line 754
    .line 755
    add-int/lit8 v5, v5, 0x1

    .line 756
    .line 757
    goto :goto_12

    .line 758
    :cond_1e
    const-string v2, "passkeyInfo"

    .line 759
    .line 760
    invoke-virtual {v11, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 761
    .line 762
    .line 763
    :cond_1f
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v8
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3

    .line 767
    const/4 v4, 0x0

    .line 768
    goto :goto_14

    .line 769
    :goto_13
    new-array v1, v4, [Ljava/lang/Object;

    .line 770
    .line 771
    iget-object v2, v10, Lh7/a;->a:Ljava/lang/String;

    .line 772
    .line 773
    const-string v3, "Failed to turn object into JSON"

    .line 774
    .line 775
    invoke-virtual {v10, v3, v1}, Lh7/a;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    invoke-static {v2, v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 780
    .line 781
    .line 782
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzzh;

    .line 783
    .line 784
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzh;-><init>(Ljava/lang/Throwable;)V

    .line 785
    .line 786
    .line 787
    throw v1

    .line 788
    :cond_20
    const/16 v17, 0x1

    .line 789
    .line 790
    :goto_14
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 791
    .line 792
    .line 793
    move-result v2

    .line 794
    if-nez v2, :cond_22

    .line 795
    .line 796
    iget-object v2, v7, LDd/c;->c:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v2, Landroid/content/SharedPreferences;

    .line 799
    .line 800
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    const-string v5, "com.google.firebase.auth.FIREBASE_USER"

    .line 805
    .line 806
    invoke-interface {v2, v5, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 811
    .line 812
    .line 813
    goto :goto_15

    .line 814
    :cond_21
    const/16 v17, 0x1

    .line 815
    .line 816
    :cond_22
    :goto_15
    if-eqz v6, :cond_24

    .line 817
    .line 818
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 819
    .line 820
    if-eqz v2, :cond_23

    .line 821
    .line 822
    move-object v5, v2

    .line 823
    check-cast v5, LK8/e;

    .line 824
    .line 825
    move-object/from16 v6, p2

    .line 826
    .line 827
    iput-object v6, v5, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 828
    .line 829
    goto :goto_16

    .line 830
    :cond_23
    move-object/from16 v6, p2

    .line 831
    .line 832
    :goto_16
    invoke-static {v0, v2}, Lcom/google/firebase/auth/FirebaseAuth;->o(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V

    .line 833
    .line 834
    .line 835
    goto :goto_17

    .line 836
    :cond_24
    move-object/from16 v6, p2

    .line 837
    .line 838
    :goto_17
    if-eqz v3, :cond_25

    .line 839
    .line 840
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 841
    .line 842
    invoke-static {v0, v2}, Lcom/google/firebase/auth/FirebaseAuth;->k(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V

    .line 843
    .line 844
    .line 845
    :cond_25
    if-eqz p3, :cond_26

    .line 846
    .line 847
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->s:LDd/c;

    .line 848
    .line 849
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    iget-object v2, v2, LDd/c;->c:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v2, Landroid/content/SharedPreferences;

    .line 855
    .line 856
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    check-cast v1, LK8/e;

    .line 861
    .line 862
    iget-object v1, v1, LK8/e;->b:LK8/U;

    .line 863
    .line 864
    iget-object v1, v1, LK8/U;->a:Ljava/lang/String;

    .line 865
    .line 866
    const-string v3, "com.google.firebase.auth.GET_TOKEN_RESPONSE."

    .line 867
    .line 868
    invoke-static {v3, v1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzf()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 881
    .line 882
    .line 883
    :cond_26
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 884
    .line 885
    if-eqz v1, :cond_2b

    .line 886
    .line 887
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 888
    .line 889
    if-nez v2, :cond_27

    .line 890
    .line 891
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 892
    .line 893
    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    new-instance v3, LK8/z;

    .line 897
    .line 898
    invoke-direct {v3, v2}, LK8/z;-><init>(Ls8/g;)V

    .line 899
    .line 900
    .line 901
    iput-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 902
    .line 903
    :cond_27
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 904
    .line 905
    check-cast v1, LK8/e;

    .line 906
    .line 907
    iget-object v1, v1, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 908
    .line 909
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    if-nez v1, :cond_28

    .line 913
    .line 914
    goto :goto_18

    .line 915
    :cond_28
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zza()J

    .line 916
    .line 917
    .line 918
    move-result-wide v2

    .line 919
    const-wide/16 v5, 0x0

    .line 920
    .line 921
    cmp-long v5, v2, v5

    .line 922
    .line 923
    if-gtz v5, :cond_29

    .line 924
    .line 925
    const-wide/16 v2, 0xe10

    .line 926
    .line 927
    :cond_29
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzb()J

    .line 928
    .line 929
    .line 930
    move-result-wide v5

    .line 931
    const-wide/16 v7, 0x3e8

    .line 932
    .line 933
    mul-long/2addr v2, v7

    .line 934
    add-long/2addr v2, v5

    .line 935
    iget-object v1, v0, LK8/z;->b:LK8/l;

    .line 936
    .line 937
    iput-wide v2, v1, LK8/l;->a:J

    .line 938
    .line 939
    const-wide/16 v2, -0x1

    .line 940
    .line 941
    iput-wide v2, v1, LK8/l;->b:J

    .line 942
    .line 943
    iget v1, v0, LK8/z;->a:I

    .line 944
    .line 945
    if-lez v1, :cond_2a

    .line 946
    .line 947
    iget-boolean v1, v0, LK8/z;->c:Z

    .line 948
    .line 949
    if-nez v1, :cond_2a

    .line 950
    .line 951
    move/from16 v4, v17

    .line 952
    .line 953
    :cond_2a
    if-eqz v4, :cond_2b

    .line 954
    .line 955
    iget-object v0, v0, LK8/z;->b:LK8/l;

    .line 956
    .line 957
    invoke-virtual {v0}, LK8/l;->a()V

    .line 958
    .line 959
    .line 960
    :cond_2b
    :goto_18
    return-void
.end method

.method public static m(Ls8/j;LJ8/v;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "Invoking verification failure callback for phone number/uid - "

    .line 2
    .line 3
    const-string v1, "FirebaseAuth"

    .line 4
    .line 5
    invoke-static {v0, p2, v1}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, LJ8/v;->c:LPc/T;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaer;->zza(Ljava/lang/String;LJ8/x;Lcom/google/android/gms/internal/firebase-auth-api/zzady;)LJ8/x;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    new-instance v0, LA7/p;

    .line 16
    .line 17
    const/16 v1, 0x16

    .line 18
    .line 19
    invoke-direct {v0, v1}, LA7/p;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p2, v0, LA7/p;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p0, v0, LA7/p;->c:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object p0, p1, LJ8/v;->d:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static o(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V
    .locals 4

    .line 1
    const-string v0, "FirebaseAuth"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, LK8/e;

    .line 7
    .line 8
    iget-object v1, v1, LK8/e;->b:LK8/U;

    .line 9
    .line 10
    iget-object v1, v1, LK8/U;->a:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "Notifying id token listeners about user ( "

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " )."

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v1, "Notifying id token listeners about a sign-out event."

    .line 36
    .line 37
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    :goto_0
    if-eqz p1, :cond_1

    .line 41
    .line 42
    check-cast p1, LK8/e;

    .line 43
    .line 44
    iget-object p1, p1, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzc()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 p1, 0x0

    .line 52
    :goto_1
    new-instance v0, LT9/b;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, v0, LT9/b;->a:Ljava/lang/String;

    .line 58
    .line 59
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    .line 60
    .line 61
    new-instance v1, LJ8/O;

    .line 62
    .line 63
    invoke-direct {v1, p0, v0}, LJ8/O;-><init>(Lcom/google/firebase/auth/FirebaseAuth;LT9/b;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final c(Ljava/lang/String;LJ8/b;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    new-instance p2, LJ8/b;

    .line 7
    .line 8
    new-instance v0, LG6/m;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LG6/m;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, v0}, LJ8/b;-><init>(LG6/m;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iput-object v0, p2, LJ8/b;->h:Ljava/lang/String;

    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x1

    .line 24
    iput v0, p2, LJ8/b;->i:I

    .line 25
    .line 26
    new-instance v0, LJ8/M;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p1, p2, v1}, LJ8/M;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;LJ8/b;I)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 33
    .line 34
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 35
    .line 36
    invoke-virtual {v0, p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public final d(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "chrome-extension://"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->B:Ljava/lang/String;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v0, "://"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move-object v0, p1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v0, "http://"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->B:Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception v0

    .line 47
    const-string v1, "FirebaseAuth"

    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v3, "Error parsing URL: \'"

    .line 63
    .line 64
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, "\', "

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :cond_2
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->B:Ljava/lang/String;

    .line 86
    .line 87
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public final g(LJ8/d;)Lcom/google/android/gms/tasks/Task;
    .locals 9

    .line 1
    invoke-virtual {p1}, LJ8/d;->X()LJ8/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, LJ8/e;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    check-cast p1, LJ8/e;

    .line 10
    .line 11
    iget-object v0, p1, LJ8/e;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v7, p1, LJ8/e;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v7}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v8, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p1, LJ8/e;->a:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v2, LJ8/P;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    move-object v3, p0

    .line 33
    invoke-direct/range {v2 .. v8}, LJ8/P;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLJ8/o;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v3, Lcom/google/firebase/auth/FirebaseAuth;->n:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 37
    .line 38
    invoke-virtual {v2, p0, v8, p1}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_0
    move-object v3, p0

    .line 44
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object v1, LJ8/c;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzap;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    :try_start_0
    new-instance v2, LJ8/c;

    .line 54
    .line 55
    invoke-direct {v2, v0}, LJ8/c;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-object v2, v1

    .line 60
    :goto_0
    const/4 v0, 0x0

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    iget-object v4, v3, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v2, v2, LJ8/c;->c:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v4, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v2, v0

    .line 76
    :goto_1
    if-eqz v2, :cond_2

    .line 77
    .line 78
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 79
    .line 80
    const/16 v0, 0x42b0

    .line 81
    .line 82
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    :cond_2
    new-instance v2, LJ8/G;

    .line 95
    .line 96
    invoke-direct {v2, p0, v0, v1, p1}, LJ8/G;-><init>(Lcom/google/firebase/auth/FirebaseAuth;ZLJ8/o;LJ8/e;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v3, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v0, v3, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 102
    .line 103
    invoke-virtual {v2, p0, p1, v0}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_3
    move-object v3, p0

    .line 109
    instance-of v0, p1, LJ8/u;

    .line 110
    .line 111
    iget-object v1, v3, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 112
    .line 113
    iget-object v2, v3, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    check-cast p1, LJ8/u;

    .line 118
    .line 119
    iget-object v0, v3, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 120
    .line 121
    new-instance v4, LJ8/g;

    .line 122
    .line 123
    invoke-direct {v4, p0}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v1, p1, v0, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/u;Ljava/lang/String;LK8/J;)Lcom/google/android/gms/tasks/Task;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :cond_4
    iget-object v0, v3, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 132
    .line 133
    new-instance v4, LJ8/g;

    .line 134
    .line 135
    invoke-direct {v4, p0}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v1, p1, v0, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/d;Ljava/lang/String;LK8/J;)Lcom/google/android/gms/tasks/Task;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1
.end method

.method public final h(LJ8/o;LJ8/d;)Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, LJ8/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, LJ8/d;->X()LJ8/d;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, LJ8/e;

    .line 13
    .line 14
    new-instance v0, LJ8/L;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, p1, p2, v1}, LJ8/L;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, LJ8/o;->V()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->o:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_0
    invoke-virtual {p2}, LJ8/d;->X()LJ8/d;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v5, LJ8/h;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-direct {v5, p0, p2}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;LJ8/d;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method

.method public final i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    const/16 v0, 0x4457

    .line 7
    .line 8
    invoke-direct {p1, v0, p2, p2, p2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    move-object v0, p1

    .line 21
    check-cast v0, LK8/e;

    .line 22
    .line 23
    iget-object v0, v0, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzg()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzc()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, LK8/t;->a(Ljava/lang/String;)LJ8/p;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzd()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance v0, LJ8/h;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, p0, v1}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 59
    .line 60
    invoke-virtual {v1, v2, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method public final declared-synchronized n()LC6/l;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:LC6/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final p(LJ8/o;LJ8/d;)Lcom/google/android/gms/tasks/Task;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, LJ8/d;->X()LJ8/d;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    instance-of p2, v4, LJ8/e;

    .line 10
    .line 11
    if-eqz p2, :cond_2

    .line 12
    .line 13
    check-cast v4, LJ8/e;

    .line 14
    .line 15
    invoke-virtual {v4}, LJ8/e;->W()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v0, "password"

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    iget-object v10, v4, LJ8/e;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v10}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, LJ8/o;->V()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    iget-object v7, v4, LJ8/e;->a:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v5, LJ8/P;

    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    move-object v6, p0

    .line 42
    move-object v9, p1

    .line 43
    invoke-direct/range {v5 .. v11}, LJ8/P;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLJ8/o;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object p1, v6

    .line 47
    iget-object p2, p1, Lcom/google/firebase/auth/FirebaseAuth;->n:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 48
    .line 49
    invoke-virtual {v5, p0, v11, p2}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    return-object p2

    .line 54
    :cond_0
    move-object v2, p1

    .line 55
    move-object p1, p0

    .line 56
    iget-object p2, v4, LJ8/e;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, LJ8/c;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzap;

    .line 62
    .line 63
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    :try_start_0
    new-instance v1, LJ8/c;

    .line 68
    .line 69
    invoke-direct {v1, p2}, LJ8/c;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-object v1, v0

    .line 74
    :goto_0
    if-eqz v1, :cond_1

    .line 75
    .line 76
    iget-object p2, p1, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, v1, LJ8/c;->c:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_1

    .line 85
    .line 86
    new-instance p2, Lcom/google/android/gms/common/api/Status;

    .line 87
    .line 88
    const/16 v1, 0x42b0

    .line 89
    .line 90
    invoke-direct {p2, v1, v0, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    return-object p2

    .line 102
    :cond_1
    new-instance p2, LJ8/G;

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    invoke-direct {p2, p0, v0, v2, v4}, LJ8/G;-><init>(Lcom/google/firebase/auth/FirebaseAuth;ZLJ8/o;LJ8/e;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p1, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v1, p1, Lcom/google/firebase/auth/FirebaseAuth;->m:Lcom/google/android/recaptcha/RecaptchaAction;

    .line 111
    .line 112
    invoke-virtual {p2, p0, v0, v1}, Lcom/moloco/sdk/internal/publisher/H;->x0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    return-object p2

    .line 117
    :cond_2
    move-object v2, p1

    .line 118
    move-object p1, p0

    .line 119
    instance-of p2, v4, LJ8/u;

    .line 120
    .line 121
    if-eqz p2, :cond_3

    .line 122
    .line 123
    move-object v3, v4

    .line 124
    check-cast v3, LJ8/u;

    .line 125
    .line 126
    iget-object v4, p1, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v5, LJ8/h;

    .line 129
    .line 130
    invoke-direct {v5, p0, v0}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 134
    .line 135
    iget-object v1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 136
    .line 137
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzb(Ls8/g;LJ8/o;LJ8/u;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    return-object p2

    .line 142
    :cond_3
    invoke-virtual {v2}, LJ8/o;->V()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    new-instance v6, LJ8/h;

    .line 147
    .line 148
    invoke-direct {v6, p0, v0}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 152
    .line 153
    move-object v3, v2

    .line 154
    iget-object v2, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 155
    .line 156
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zzc(Ls8/g;LJ8/o;LJ8/d;Ljava/lang/String;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    return-object p2
.end method

.method public final q()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->s:LDd/c;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v1, LK8/e;

    .line 12
    .line 13
    iget-object v1, v1, LK8/e;->b:LK8/U;

    .line 14
    .line 15
    iget-object v1, v1, LK8/U;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "com.google.firebase.auth.GET_TOKEN_RESPONSE."

    .line 18
    .line 19
    invoke-static {v3, v1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v3, v0, LDd/c;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Landroid/content/SharedPreferences;

    .line 26
    .line 27
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 39
    .line 40
    :cond_0
    iget-object v0, v0, LDd/c;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroid/content/SharedPreferences;

    .line 43
    .line 44
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "com.google.firebase.auth.FIREBASE_USER"

    .line 49
    .line 50
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v2}, Lcom/google/firebase/auth/FirebaseAuth;->o(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2}, Lcom/google/firebase/auth/FirebaseAuth;->k(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Ls8/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadn;->zza(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final declared-synchronized s()LK8/z;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, LK8/z;

    .line 12
    .line 13
    invoke-direct {v1, v0}, LK8/z;-><init>(Ls8/g;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_0
.end method
