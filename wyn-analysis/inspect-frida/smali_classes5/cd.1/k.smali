.class public final Lcd/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;


# instance fields
.field public final a:Lcd/c;

.field public final b:Landroid/content/Context;

.field public c:Lcom/google/android/ump/ConsentInformation;

.field public d:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Luc/f;Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcd/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lcd/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcd/k;->a:Lcd/c;

    .line 10
    .line 11
    new-instance v1, Luc/r;

    .line 12
    .line 13
    new-instance v2, Luc/x;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Luc/x;-><init>(Luc/w;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const-string v3, "plugins.flutter.io/google_mobile_ads/ump"

    .line 20
    .line 21
    invoke-direct {v1, p1, v3, v2, v0}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0}, Luc/r;->b(Luc/p;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lcd/k;->b:Landroid/content/Context;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/ump/ConsentInformation;
    .locals 1

    .line 1
    iget-object v0, p0, Lcd/k;->c:Lcom/google/android/ump/ConsentInformation;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcd/k;->b:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/ump/UserMessagingPlatform;->getConsentInformation(Landroid/content/Context;)Lcom/google/android/ump/ConsentInformation;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcd/k;->c:Lcom/google/android/ump/ConsentInformation;

    .line 13
    .line 14
    return-object v0
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 10

    .line 1
    const-string v0, "ConsentForm#show"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p1, Luc/o;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v5, "consentForm"

    .line 12
    .line 13
    const-string v6, "0"

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, -0x1

    .line 17
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    sparse-switch v9, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :sswitch_0
    const-string v9, "ConsentInformation#getConsentStatus"

    .line 27
    .line 28
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    const/16 v8, 0xa

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :sswitch_1
    const-string v9, "ConsentInformation#canRequestAds"

    .line 41
    .line 42
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_1
    const/16 v8, 0x9

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :sswitch_2
    const-string v9, "ConsentInformation#getPrivacyOptionsRequirementStatus"

    .line 55
    .line 56
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :cond_2
    const/16 v8, 0x8

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :sswitch_3
    const-string v9, "UserMessagingPlatform#loadConsentForm"

    .line 69
    .line 70
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    const/4 v8, 0x7

    .line 78
    goto :goto_0

    .line 79
    :sswitch_4
    const-string v9, "ConsentInformation#isConsentFormAvailable"

    .line 80
    .line 81
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    const/4 v8, 0x6

    .line 89
    goto :goto_0

    .line 90
    :sswitch_5
    const-string v9, "UserMessagingPlatform#showPrivacyOptionsForm"

    .line 91
    .line 92
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_5

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    const/4 v8, 0x5

    .line 100
    goto :goto_0

    .line 101
    :sswitch_6
    const-string v9, "ConsentForm#dispose"

    .line 102
    .line 103
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    const/4 v8, 0x4

    .line 111
    goto :goto_0

    .line 112
    :sswitch_7
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_7

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    const/4 v8, 0x3

    .line 120
    goto :goto_0

    .line 121
    :sswitch_8
    const-string v9, "ConsentInformation#requestConsentInfoUpdate"

    .line 122
    .line 123
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_8

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_8
    move v8, v1

    .line 131
    goto :goto_0

    .line 132
    :sswitch_9
    const-string v9, "UserMessagingPlatform#loadAndShowConsentFormIfRequired"

    .line 133
    .line 134
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_9

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_9
    move v8, v2

    .line 142
    goto :goto_0

    .line 143
    :sswitch_a
    const-string v9, "ConsentInformation#reset"

    .line 144
    .line 145
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_a

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_a
    move v8, v3

    .line 153
    :goto_0
    packed-switch v8, :pswitch_data_0

    .line 154
    .line 155
    .line 156
    check-cast p2, Ltc/g;

    .line 157
    .line 158
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_0
    invoke-virtual {p0}, Lcd/k;->a()Lcom/google/android/ump/ConsentInformation;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-interface {p1}, Lcom/google/android/ump/ConsentInformation;->getConsentStatus()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    check-cast p2, Ltc/g;

    .line 175
    .line 176
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_1
    invoke-virtual {p0}, Lcd/k;->a()Lcom/google/android/ump/ConsentInformation;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-interface {p1}, Lcom/google/android/ump/ConsentInformation;->canRequestAds()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p2, Ltc/g;

    .line 193
    .line 194
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_2
    sget-object p1, Lcd/j;->a:[I

    .line 199
    .line 200
    invoke-virtual {p0}, Lcd/k;->a()Lcom/google/android/ump/ConsentInformation;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-interface {v0}, Lcom/google/android/ump/ConsentInformation;->getPrivacyOptionsRequirementStatus()Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    aget p1, p1, v0

    .line 213
    .line 214
    if-eq p1, v2, :cond_c

    .line 215
    .line 216
    if-eq p1, v1, :cond_b

    .line 217
    .line 218
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p2, Ltc/g;

    .line 223
    .line 224
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    check-cast p2, Ltc/g;

    .line 233
    .line 234
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p2, Ltc/g;

    .line 243
    .line 244
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :pswitch_3
    new-instance p1, Lcd/g;

    .line 249
    .line 250
    check-cast p2, Ltc/g;

    .line 251
    .line 252
    invoke-direct {p1, p0, p2}, Lcd/g;-><init>(Lcd/k;Ltc/g;)V

    .line 253
    .line 254
    .line 255
    new-instance v0, Lcd/h;

    .line 256
    .line 257
    invoke-direct {v0, p2}, Lcd/h;-><init>(Ltc/g;)V

    .line 258
    .line 259
    .line 260
    iget-object p2, p0, Lcd/k;->b:Landroid/content/Context;

    .line 261
    .line 262
    invoke-static {p2, p1, v0}, Lcom/google/android/ump/UserMessagingPlatform;->loadConsentForm(Landroid/content/Context;Lcom/google/android/ump/UserMessagingPlatform$OnConsentFormLoadSuccessListener;Lcom/google/android/ump/UserMessagingPlatform$OnConsentFormLoadFailureListener;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :pswitch_4
    invoke-virtual {p0}, Lcd/k;->a()Lcom/google/android/ump/ConsentInformation;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-interface {p1}, Lcom/google/android/ump/ConsentInformation;->isConsentFormAvailable()Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    check-cast p2, Ltc/g;

    .line 279
    .line 280
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_5
    iget-object p1, p0, Lcd/k;->d:Landroid/app/Activity;

    .line 285
    .line 286
    if-nez p1, :cond_d

    .line 287
    .line 288
    const-string p1, "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity."

    .line 289
    .line 290
    check-cast p2, Ltc/g;

    .line 291
    .line 292
    invoke-virtual {p2, v6, p1, v7}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_d
    new-instance v0, Lcd/d;

    .line 297
    .line 298
    check-cast p2, Ltc/g;

    .line 299
    .line 300
    invoke-direct {v0, p2, v2}, Lcd/d;-><init>(Ltc/g;I)V

    .line 301
    .line 302
    .line 303
    invoke-static {p1, v0}, Lcom/google/android/ump/UserMessagingPlatform;->showPrivacyOptionsForm(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_6
    invoke-virtual {p1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, Lcom/google/android/ump/ConsentForm;

    .line 312
    .line 313
    if-nez p1, :cond_e

    .line 314
    .line 315
    const-string p1, "Called dispose on ad that has been freed"

    .line 316
    .line 317
    invoke-static {v6, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    goto :goto_1

    .line 321
    :cond_e
    iget-object v0, p0, Lcd/k;->a:Lcd/c;

    .line 322
    .line 323
    iget-object v0, v0, Lcd/c;->d:Ljava/util/HashMap;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    :goto_1
    check-cast p2, Ltc/g;

    .line 337
    .line 338
    invoke-virtual {p2, v7}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_7
    invoke-virtual {p1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    check-cast p1, Lcom/google/android/ump/ConsentForm;

    .line 347
    .line 348
    if-nez p1, :cond_f

    .line 349
    .line 350
    check-cast p2, Ltc/g;

    .line 351
    .line 352
    invoke-virtual {p2, v6, v0, v7}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :cond_f
    iget-object v0, p0, Lcd/k;->d:Landroid/app/Activity;

    .line 357
    .line 358
    new-instance v1, Lcd/i;

    .line 359
    .line 360
    check-cast p2, Ltc/g;

    .line 361
    .line 362
    invoke-direct {v1, p2}, Lcd/i;-><init>(Ltc/g;)V

    .line 363
    .line 364
    .line 365
    invoke-interface {p1, v0, v1}, Lcom/google/android/ump/ConsentForm;->show(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :pswitch_8
    iget-object v0, p0, Lcd/k;->d:Landroid/app/Activity;

    .line 370
    .line 371
    if-nez v0, :cond_10

    .line 372
    .line 373
    const-string p1, "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity."

    .line 374
    .line 375
    check-cast p2, Ltc/g;

    .line 376
    .line 377
    invoke-virtual {p2, v6, p1, v7}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :cond_10
    const-string v0, "params"

    .line 382
    .line 383
    invoke-virtual {p1, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    check-cast p1, Lcd/b;

    .line 388
    .line 389
    if-nez p1, :cond_11

    .line 390
    .line 391
    new-instance p1, Lcom/google/android/ump/ConsentRequestParameters$Builder;

    .line 392
    .line 393
    invoke-direct {p1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->build()Lcom/google/android/ump/ConsentRequestParameters;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    goto :goto_3

    .line 401
    :cond_11
    iget-object v0, p0, Lcd/k;->d:Landroid/app/Activity;

    .line 402
    .line 403
    new-instance v1, Lcom/google/android/ump/ConsentRequestParameters$Builder;

    .line 404
    .line 405
    invoke-direct {v1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;-><init>()V

    .line 406
    .line 407
    .line 408
    iget-object v2, p1, Lcd/b;->a:Ljava/lang/Boolean;

    .line 409
    .line 410
    if-eqz v2, :cond_12

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-virtual {v1, v2}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->setTagForUnderAgeOfConsent(Z)Lcom/google/android/ump/ConsentRequestParameters$Builder;

    .line 417
    .line 418
    .line 419
    :cond_12
    iget-object p1, p1, Lcd/b;->b:Lcd/a;

    .line 420
    .line 421
    if-eqz p1, :cond_15

    .line 422
    .line 423
    new-instance v2, Lcom/google/android/ump/ConsentDebugSettings$Builder;

    .line 424
    .line 425
    invoke-direct {v2, v0}, Lcom/google/android/ump/ConsentDebugSettings$Builder;-><init>(Landroid/content/Context;)V

    .line 426
    .line 427
    .line 428
    iget-object v0, p1, Lcd/a;->a:Ljava/lang/Integer;

    .line 429
    .line 430
    if-eqz v0, :cond_13

    .line 431
    .line 432
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-virtual {v2, v0}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->setDebugGeography(I)Lcom/google/android/ump/ConsentDebugSettings$Builder;

    .line 437
    .line 438
    .line 439
    :cond_13
    iget-object p1, p1, Lcd/a;->b:Ljava/util/ArrayList;

    .line 440
    .line 441
    if-eqz p1, :cond_14

    .line 442
    .line 443
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_14

    .line 452
    .line 453
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    check-cast v0, Ljava/lang/String;

    .line 458
    .line 459
    invoke-virtual {v2, v0}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->addTestDeviceHashedId(Ljava/lang/String;)Lcom/google/android/ump/ConsentDebugSettings$Builder;

    .line 460
    .line 461
    .line 462
    goto :goto_2

    .line 463
    :cond_14
    invoke-virtual {v2}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->build()Lcom/google/android/ump/ConsentDebugSettings;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    invoke-virtual {v1, p1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->setConsentDebugSettings(Lcom/google/android/ump/ConsentDebugSettings;)Lcom/google/android/ump/ConsentRequestParameters$Builder;

    .line 468
    .line 469
    .line 470
    :cond_15
    invoke-virtual {v1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->build()Lcom/google/android/ump/ConsentRequestParameters;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    :goto_3
    invoke-virtual {p0}, Lcd/k;->a()Lcom/google/android/ump/ConsentInformation;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    iget-object v1, p0, Lcd/k;->d:Landroid/app/Activity;

    .line 479
    .line 480
    new-instance v2, Lcd/e;

    .line 481
    .line 482
    check-cast p2, Ltc/g;

    .line 483
    .line 484
    invoke-direct {v2, p2}, Lcd/e;-><init>(Ltc/g;)V

    .line 485
    .line 486
    .line 487
    new-instance v3, Lcd/f;

    .line 488
    .line 489
    invoke-direct {v3, p2}, Lcd/f;-><init>(Ltc/g;)V

    .line 490
    .line 491
    .line 492
    invoke-interface {v0, v1, p1, v2, v3}, Lcom/google/android/ump/ConsentInformation;->requestConsentInfoUpdate(Landroid/app/Activity;Lcom/google/android/ump/ConsentRequestParameters;Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateSuccessListener;Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateFailureListener;)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :pswitch_9
    iget-object p1, p0, Lcd/k;->d:Landroid/app/Activity;

    .line 497
    .line 498
    if-nez p1, :cond_16

    .line 499
    .line 500
    const-string p1, "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity."

    .line 501
    .line 502
    check-cast p2, Ltc/g;

    .line 503
    .line 504
    invoke-virtual {p2, v6, p1, v7}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :cond_16
    new-instance v0, Lcd/d;

    .line 509
    .line 510
    check-cast p2, Ltc/g;

    .line 511
    .line 512
    invoke-direct {v0, p2, v3}, Lcd/d;-><init>(Ltc/g;I)V

    .line 513
    .line 514
    .line 515
    invoke-static {p1, v0}, Lcom/google/android/ump/UserMessagingPlatform;->loadAndShowConsentFormIfRequired(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    .line 516
    .line 517
    .line 518
    return-void

    .line 519
    :pswitch_a
    invoke-virtual {p0}, Lcd/k;->a()Lcom/google/android/ump/ConsentInformation;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    invoke-interface {p1}, Lcom/google/android/ump/ConsentInformation;->reset()V

    .line 524
    .line 525
    .line 526
    check-cast p2, Ltc/g;

    .line 527
    .line 528
    invoke-virtual {p2, v7}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    nop

    .line 533
    :sswitch_data_0
    .sparse-switch
        -0x7b4ec5a2 -> :sswitch_a
        -0x767ae7dd -> :sswitch_9
        -0x4e173d6d -> :sswitch_8
        -0x39e27f7e -> :sswitch_7
        -0x34642986 -> :sswitch_6
        -0x2914eed2 -> :sswitch_5
        -0x22e9907a -> :sswitch_4
        -0x1da6545f -> :sswitch_3
        -0x12779e26 -> :sswitch_2
        0x1e1845a0 -> :sswitch_1
        0x27a4b087 -> :sswitch_0
    .end sparse-switch

    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    :pswitch_data_0
    .packed-switch 0x0
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
