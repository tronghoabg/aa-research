.class public final synthetic LOc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LOc/b;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(LOc/b;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    .locals 0

    .line 1
    iput p4, p0, LOc/a;->a:I

    iput-object p1, p0, LOc/a;->b:LOc/b;

    iput-object p2, p0, LOc/a;->c:Ljava/util/Map;

    iput-object p3, p0, LOc/a;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, LOc/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LOc/a;->b:LOc/b;

    .line 7
    .line 8
    iget-object v1, p0, LOc/a;->c:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v2, p0, LOc/a;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1}, LOc/b;->a(Ljava/util/Map;)LC8/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v3, "isTokenAutoRefreshEnabled"

    .line 20
    .line 21
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    check-cast v1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v0, v0, LC8/f;->f:LC8/n;

    .line 35
    .line 36
    iput-boolean v1, v0, LC8/n;->f:Z

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, LOc/a;->c:Ljava/util/Map;

    .line 49
    .line 50
    iget-object v1, p0, LOc/a;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 51
    .line 52
    iget-object v2, p0, LOc/a;->b:LOc/b;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    :try_start_1
    const-string v2, "androidProvider"

    .line 58
    .line 59
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const v4, -0x42403695

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    const/4 v6, 0x2

    .line 77
    if-eq v3, v4, :cond_2

    .line 78
    .line 79
    const v4, 0x5b09653

    .line 80
    .line 81
    .line 82
    if-eq v3, v4, :cond_1

    .line 83
    .line 84
    const v4, 0xe74ee79

    .line 85
    .line 86
    .line 87
    if-eq v3, v4, :cond_0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_0
    const-string v3, "playIntegrity"

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_3

    .line 97
    .line 98
    move v2, v6

    .line 99
    goto :goto_2

    .line 100
    :catch_1
    move-exception v0

    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_1
    const-string v3, "debug"

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    goto :goto_2

    .line 113
    :cond_2
    const-string v3, "safetyNet"

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    move v2, v5

    .line 122
    goto :goto_2

    .line 123
    :cond_3
    :goto_1
    const/4 v2, -0x1

    .line 124
    :goto_2
    if-eqz v2, :cond_6

    .line 125
    .line 126
    if-eq v2, v5, :cond_5

    .line 127
    .line 128
    if-eq v2, v6, :cond_4

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_4
    invoke-static {v0}, LOc/b;->a(Ljava/util/Map;)LC8/f;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v2, v0, LC8/f;->a:Ls8/g;

    .line 136
    .line 137
    invoke-virtual {v2}, Ls8/g;->k()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    iget-object v3, v0, LC8/f;->a:Ls8/g;

    .line 142
    .line 143
    const-class v4, LG8/d;

    .line 144
    .line 145
    invoke-virtual {v3, v4}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    check-cast v3, Lz8/a;

    .line 150
    .line 151
    iput-object v3, v0, LC8/f;->l:Lz8/a;

    .line 152
    .line 153
    iget-object v0, v0, LC8/f;->f:LC8/n;

    .line 154
    .line 155
    iput-boolean v2, v0, LC8/n;->f:Z

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    invoke-static {v0}, LOc/b;->a(Ljava/util/Map;)LC8/f;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v2, v0, LC8/f;->a:Ls8/g;

    .line 163
    .line 164
    invoke-virtual {v2}, Ls8/g;->k()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    iget-object v3, v0, LC8/f;->a:Ls8/g;

    .line 169
    .line 170
    const-class v4, LI8/b;

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Lz8/a;

    .line 177
    .line 178
    iput-object v3, v0, LC8/f;->l:Lz8/a;

    .line 179
    .line 180
    iget-object v0, v0, LC8/f;->f:LC8/n;

    .line 181
    .line 182
    iput-boolean v2, v0, LC8/n;->f:Z

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_6
    invoke-static {v0}, LOc/b;->a(Ljava/util/Map;)LC8/f;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object v2, v0, LC8/f;->a:Ls8/g;

    .line 190
    .line 191
    invoke-virtual {v2}, Ls8/g;->k()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    iget-object v3, v0, LC8/f;->a:Ls8/g;

    .line 196
    .line 197
    const-class v4, LB8/d;

    .line 198
    .line 199
    invoke-virtual {v3, v4}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, Lz8/a;

    .line 204
    .line 205
    iput-object v3, v0, LC8/f;->l:Lz8/a;

    .line 206
    .line 207
    iget-object v0, v0, LC8/f;->f:LC8/n;

    .line 208
    .line 209
    iput-boolean v2, v0, LC8/n;->f:Z

    .line 210
    .line 211
    :goto_3
    const/4 v0, 0x0

    .line 212
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :goto_4
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 217
    .line 218
    .line 219
    :goto_5
    return-void

    .line 220
    :pswitch_1
    iget-object v0, p0, LOc/a;->c:Ljava/util/Map;

    .line 221
    .line 222
    iget-object v1, p0, LOc/a;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 223
    .line 224
    iget-object v2, p0, LOc/a;->b:LOc/b;

    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    :try_start_2
    invoke-static {v0}, LOc/b;->a(Ljava/util/Map;)LC8/f;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const-string v3, "forceRefresh"

    .line 234
    .line 235
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    check-cast v0, Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v3, LC8/e;

    .line 252
    .line 253
    const/4 v4, 0x1

    .line 254
    invoke-direct {v3, v4, v2, v0}, LC8/e;-><init>(ILjava/lang/Object;Z)V

    .line 255
    .line 256
    .line 257
    iget-object v0, v2, LC8/f;->j:Lcom/google/android/gms/tasks/Task;

    .line 258
    .line 259
    iget-object v2, v2, LC8/f;->h:Ljava/util/concurrent/Executor;

    .line 260
    .line 261
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, LC8/b;

    .line 270
    .line 271
    iget-object v0, v0, LC8/b;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 274
    .line 275
    .line 276
    goto :goto_6

    .line 277
    :catch_2
    move-exception v0

    .line 278
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 279
    .line 280
    .line 281
    :goto_6
    return-void

    .line 282
    :pswitch_2
    iget-object v0, p0, LOc/a;->c:Ljava/util/Map;

    .line 283
    .line 284
    iget-object v1, p0, LOc/a;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 285
    .line 286
    iget-object v2, p0, LOc/a;->b:LOc/b;

    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    :try_start_3
    invoke-static {v0}, LOc/b;->a(Ljava/util/Map;)LC8/f;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iget-object v0, v0, LC8/f;->l:Lz8/a;

    .line 296
    .line 297
    if-nez v0, :cond_7

    .line 298
    .line 299
    new-instance v0, Ls8/j;

    .line 300
    .line 301
    const-string v2, "No AppCheckProvider installed."

    .line 302
    .line 303
    invoke-direct {v0, v2}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    goto :goto_7

    .line 311
    :cond_7
    invoke-interface {v0}, Lz8/a;->getToken()Lcom/google/android/gms/tasks/Task;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    :goto_7
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, LC8/b;

    .line 320
    .line 321
    iget-object v0, v0, LC8/b;->a:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 324
    .line 325
    .line 326
    goto :goto_8

    .line 327
    :catch_3
    move-exception v0

    .line 328
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 329
    .line 330
    .line 331
    :goto_8
    return-void

    .line 332
    :pswitch_3
    iget-object v0, p0, LOc/a;->c:Ljava/util/Map;

    .line 333
    .line 334
    iget-object v1, p0, LOc/a;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 335
    .line 336
    iget-object v2, p0, LOc/a;->b:LOc/b;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const-string v3, "plugins.flutter.io/firebase_app_check/token/"

    .line 342
    .line 343
    :try_start_4
    const-string v4, "appName"

    .line 344
    .line 345
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    check-cast v4, Ljava/lang/String;

    .line 353
    .line 354
    invoke-static {v0}, LOc/b;->a(Ljava/util/Map;)LC8/f;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    new-instance v5, LOc/d;

    .line 359
    .line 360
    const/4 v6, 0x0

    .line 361
    invoke-direct {v5, v0, v6}, LOc/d;-><init>(Ljava/lang/Object;I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    new-instance v3, Luc/j;

    .line 369
    .line 370
    iget-object v4, v2, LOc/b;->b:Luc/f;

    .line 371
    .line 372
    invoke-direct {v3, v4, v0}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v5}, Luc/j;->a(Luc/i;)V

    .line 376
    .line 377
    .line 378
    iget-object v2, v2, LOc/b;->a:Ljava/util/HashMap;

    .line 379
    .line 380
    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 384
    .line 385
    .line 386
    goto :goto_9

    .line 387
    :catch_4
    move-exception v0

    .line 388
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 389
    .line 390
    .line 391
    :goto_9
    return-void

    .line 392
    nop

    .line 393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
