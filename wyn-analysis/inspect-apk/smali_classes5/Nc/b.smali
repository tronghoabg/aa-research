.class public final synthetic LNc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LNc/e;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(LNc/e;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    .locals 0

    .line 1
    iput p4, p0, LNc/b;->a:I

    iput-object p1, p0, LNc/b;->b:LNc/e;

    iput-object p2, p0, LNc/b;->c:Ljava/util/Map;

    iput-object p3, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, LNc/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LNc/b;->c:Ljava/util/Map;

    .line 7
    .line 8
    iget-object v1, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 9
    .line 10
    iget-object v2, p0, LNc/b;->b:LNc/e;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :try_start_0
    const-string v3, "enabled"

    .line 16
    .line 17
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    check-cast v0, Ljava/lang/Boolean;

    .line 25
    .line 26
    iget-object v2, v2, LNc/e;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 27
    .line 28
    iget-object v2, v2, Lcom/google/firebase/analytics/FirebaseAnalytics;->a:Lcom/google/android/gms/internal/measurement/zzdy;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zza(Ljava/lang/Boolean;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, p0, LNc/b;->c:Ljava/util/Map;

    .line 44
    .line 45
    iget-object v1, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 46
    .line 47
    iget-object v2, p0, LNc/b;->b:LNc/e;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    :try_start_1
    const-string v3, "milliseconds"

    .line 53
    .line 54
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    check-cast v0, Ljava/lang/Integer;

    .line 62
    .line 63
    iget-object v2, v2, LNc/e;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    int-to-long v3, v0

    .line 70
    iget-object v0, v2, Lcom/google/firebase/analytics/FirebaseAnalytics;->a:Lcom/google/android/gms/internal/measurement/zzdy;

    .line 71
    .line 72
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzdy;->zza(J)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catch_1
    move-exception v0

    .line 81
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-void

    .line 85
    :pswitch_1
    iget-object v0, p0, LNc/b;->c:Ljava/util/Map;

    .line 86
    .line 87
    iget-object v1, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 88
    .line 89
    iget-object v2, p0, LNc/b;->b:LNc/e;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    :try_start_2
    const-string v3, "eventName"

    .line 95
    .line 96
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    const-string v4, "parameters"

    .line 106
    .line 107
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Ljava/util/Map;

    .line 112
    .line 113
    invoke-static {v0}, LNc/e;->a(Ljava/util/Map;)Landroid/os/Bundle;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v2, v2, LNc/e;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 118
    .line 119
    iget-object v2, v2, Lcom/google/firebase/analytics/FirebaseAnalytics;->a:Lcom/google/android/gms/internal/measurement/zzdy;

    .line 120
    .line 121
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zza(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :catch_2
    move-exception v0

    .line 130
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    return-void

    .line 134
    :pswitch_2
    iget-object v0, p0, LNc/b;->c:Ljava/util/Map;

    .line 135
    .line 136
    iget-object v1, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 137
    .line 138
    iget-object v2, p0, LNc/b;->b:LNc/e;

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    :try_start_3
    const-string v3, "name"

    .line 144
    .line 145
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    check-cast v3, Ljava/lang/String;

    .line 153
    .line 154
    const-string v4, "value"

    .line 155
    .line 156
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Ljava/lang/String;

    .line 161
    .line 162
    iget-object v2, v2, LNc/e;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 163
    .line 164
    iget-object v2, v2, Lcom/google/firebase/analytics/FirebaseAnalytics;->a:Lcom/google/android/gms/internal/measurement/zzdy;

    .line 165
    .line 166
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :catch_3
    move-exception v0

    .line 175
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 176
    .line 177
    .line 178
    :goto_3
    return-void

    .line 179
    :pswitch_3
    iget-object v0, p0, LNc/b;->c:Ljava/util/Map;

    .line 180
    .line 181
    iget-object v1, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 182
    .line 183
    iget-object v2, p0, LNc/b;->b:LNc/e;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    :try_start_4
    iget-object v2, v2, LNc/e;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 189
    .line 190
    invoke-static {v0}, LNc/e;->a(Ljava/util/Map;)Landroid/os/Bundle;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_0

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance v3, Landroid/os/Bundle;

    .line 200
    .line 201
    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 202
    .line 203
    .line 204
    move-object v0, v3

    .line 205
    :cond_0
    iget-object v2, v2, Lcom/google/firebase/analytics/FirebaseAnalytics;->a:Lcom/google/android/gms/internal/measurement/zzdy;

    .line 206
    .line 207
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzd(Landroid/os/Bundle;)V

    .line 208
    .line 209
    .line 210
    const/4 v0, 0x0

    .line 211
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :catch_4
    move-exception v0

    .line 216
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 217
    .line 218
    .line 219
    :goto_4
    return-void

    .line 220
    :pswitch_4
    iget-object v0, p0, LNc/b;->c:Ljava/util/Map;

    .line 221
    .line 222
    iget-object v1, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 223
    .line 224
    iget-object v2, p0, LNc/b;->b:LNc/e;

    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    :try_start_5
    const-string v3, "userId"

    .line 230
    .line 231
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Ljava/lang/String;

    .line 236
    .line 237
    iget-object v2, v2, LNc/e;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 238
    .line 239
    iget-object v2, v2, Lcom/google/firebase/analytics/FirebaseAnalytics;->a:Lcom/google/android/gms/internal/measurement/zzdy;

    .line 240
    .line 241
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/zzdy;->zzd(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const/4 v0, 0x0

    .line 245
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :catch_5
    move-exception v0

    .line 250
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 251
    .line 252
    .line 253
    :goto_5
    return-void

    .line 254
    :pswitch_5
    iget-object v0, p0, LNc/b;->c:Ljava/util/Map;

    .line 255
    .line 256
    iget-object v1, p0, LNc/b;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 257
    .line 258
    iget-object v2, p0, LNc/b;->b:LNc/e;

    .line 259
    .line 260
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    :try_start_6
    const-string v3, "adStorageConsentGranted"

    .line 264
    .line 265
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, Ljava/lang/Boolean;

    .line 270
    .line 271
    const-string v4, "analyticsStorageConsentGranted"

    .line 272
    .line 273
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    check-cast v4, Ljava/lang/Boolean;

    .line 278
    .line 279
    const-string v5, "adPersonalizationSignalsConsentGranted"

    .line 280
    .line 281
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    check-cast v5, Ljava/lang/Boolean;

    .line 286
    .line 287
    const-string v6, "adUserDataConsentGranted"

    .line 288
    .line 289
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, Ljava/lang/Boolean;

    .line 294
    .line 295
    new-instance v6, Ljava/util/HashMap;

    .line 296
    .line 297
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 298
    .line 299
    .line 300
    sget-object v7, Lv8/a;->b:Lv8/a;

    .line 301
    .line 302
    sget-object v8, Lv8/a;->a:Lv8/a;

    .line 303
    .line 304
    if-eqz v3, :cond_2

    .line 305
    .line 306
    :try_start_7
    sget-object v9, Lv8/b;->a:Lv8/b;

    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_1

    .line 313
    .line 314
    move-object v3, v8

    .line 315
    goto :goto_6

    .line 316
    :cond_1
    move-object v3, v7

    .line 317
    :goto_6
    invoke-virtual {v6, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :catch_6
    move-exception v0

    .line 322
    goto :goto_a

    .line 323
    :cond_2
    :goto_7
    if-eqz v4, :cond_4

    .line 324
    .line 325
    sget-object v3, Lv8/b;->b:Lv8/b;

    .line 326
    .line 327
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eqz v4, :cond_3

    .line 332
    .line 333
    move-object v4, v8

    .line 334
    goto :goto_8

    .line 335
    :cond_3
    move-object v4, v7

    .line 336
    :goto_8
    invoke-virtual {v6, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :cond_4
    if-eqz v5, :cond_6

    .line 340
    .line 341
    sget-object v3, Lv8/b;->d:Lv8/b;

    .line 342
    .line 343
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_5

    .line 348
    .line 349
    move-object v4, v8

    .line 350
    goto :goto_9

    .line 351
    :cond_5
    move-object v4, v7

    .line 352
    :goto_9
    invoke-virtual {v6, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    :cond_6
    if-eqz v0, :cond_8

    .line 356
    .line 357
    sget-object v3, Lv8/b;->c:Lv8/b;

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_7

    .line 364
    .line 365
    move-object v7, v8

    .line 366
    :cond_7
    invoke-virtual {v6, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    :cond_8
    iget-object v0, v2, LNc/e;->a:Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 370
    .line 371
    invoke-virtual {v0, v6}, Lcom/google/firebase/analytics/FirebaseAnalytics;->a(Ljava/util/HashMap;)V

    .line 372
    .line 373
    .line 374
    const/4 v0, 0x0

    .line 375
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 376
    .line 377
    .line 378
    goto :goto_b

    .line 379
    :goto_a
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 380
    .line 381
    .line 382
    :goto_b
    return-void

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
