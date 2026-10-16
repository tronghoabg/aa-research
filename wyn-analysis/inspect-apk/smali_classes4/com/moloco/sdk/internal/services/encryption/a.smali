.class public final synthetic Lcom/moloco/sdk/internal/services/encryption/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/moloco/sdk/internal/services/encryption/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p0, Lcom/moloco/sdk/internal/services/encryption/a;->a:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/moloco/sdk/internal/services/proto/a;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lcom/moloco/sdk/internal/services/k;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_1
    new-instance v2, LVa/X7;

    .line 21
    .line 22
    invoke-static {}, Lcom/moloco/sdk/service_locator/g;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sget-object v4, Lcom/moloco/sdk/service_locator/e;->e:Lef/p;

    .line 27
    .line 28
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lcom/moloco/sdk/internal/services/E;

    .line 33
    .line 34
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->b()Lcom/moloco/sdk/internal/error/b;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->a()Lwd/c;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const-string v8, "mediaConfig"

    .line 43
    .line 44
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v8, "connectivityService"

    .line 48
    .line 49
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v8, "errorReportingService"

    .line 53
    .line 54
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v8, "httpClient"

    .line 58
    .line 59
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v3, v2, LVa/X7;->a:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v5, v2, LVa/X7;->b:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object v6, v2, LVa/X7;->c:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v7, v2, LVa/X7;->d:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 74
    .line 75
    invoke-static {}, Lcom/moloco/sdk/service_locator/g;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    new-instance v6, LDd/c;

    .line 80
    .line 81
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Lcom/moloco/sdk/internal/services/E;

    .line 86
    .line 87
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->b()Lcom/moloco/sdk/internal/error/b;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->a()Lwd/c;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-direct {v6, v4, v7, v8}, LDd/c;-><init>(Lcom/moloco/sdk/internal/services/E;Lcom/moloco/sdk/internal/error/b;Lwd/c;)V

    .line 96
    .line 97
    .line 98
    new-instance v4, LG4/c;

    .line 99
    .line 100
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v4, v1, v0}, LG4/c;-><init>(Landroid/content/Context;B)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v3, v5, v6, v2, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;LDd/c;LVa/X7;LG4/c;)V

    .line 108
    .line 109
    .line 110
    return-object v3

    .line 111
    :pswitch_2
    sget-object v0, Lcom/moloco/sdk/service_locator/c;->a:Lef/p;

    .line 112
    .line 113
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Lcom/moloco/sdk/internal/services/config/a;

    .line 118
    .line 119
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/q;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 120
    .line 121
    const-class v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 122
    .line 123
    invoke-virtual {v0, v2, v1}, Lcom/moloco/sdk/internal/services/config/a;->a(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_3
    new-instance v2, Lcom/moloco/sdk/internal/services/init/s;

    .line 131
    .line 132
    sget-object v3, Lcom/moloco/sdk/service_locator/f;->d:Lef/p;

    .line 133
    .line 134
    invoke-virtual {v3}, Lef/p;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Lcom/moloco/sdk/internal/services/init/f;

    .line 139
    .line 140
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const-string v4, "moloco_sdk_init_cache"

    .line 145
    .line 146
    invoke-virtual {v1, v4, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-string v1, "getSharedPreferences(...)"

    .line 151
    .line 152
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Lcom/moloco/sdk/internal/services/init/k;

    .line 156
    .line 157
    sget-object v4, LEf/S;->a:LLf/e;

    .line 158
    .line 159
    sget-object v4, LLf/d;->b:LLf/d;

    .line 160
    .line 161
    invoke-direct {v1, v0, v4}, Lcom/moloco/sdk/internal/services/init/k;-><init>(Landroid/content/SharedPreferences;LLf/d;)V

    .line 162
    .line 163
    .line 164
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v4, v0}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-direct {v2, v3, v1, v0}, Lcom/moloco/sdk/internal/services/init/s;-><init>(Lcom/moloco/sdk/internal/services/init/f;Lcom/moloco/sdk/internal/services/init/k;LKd/a;)V

    .line 177
    .line 178
    .line 179
    return-object v2

    .line 180
    :pswitch_4
    new-instance v0, Lcom/moloco/sdk/internal/services/init/f;

    .line 181
    .line 182
    invoke-static {}, Lcom/moloco/sdk/service_locator/e;->b()Lcom/moloco/sdk/internal/services/v;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {}, Lcom/moloco/sdk/service_locator/e;->a()Lcom/moloco/sdk/internal/services/x;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    sget-object v3, Lcom/moloco/sdk/service_locator/l;->b:Lef/p;

    .line 191
    .line 192
    invoke-virtual {v3}, Lef/p;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    check-cast v3, Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 197
    .line 198
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->a()Lwd/c;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/internal/services/init/f;-><init>(Lcom/moloco/sdk/internal/services/v;Lcom/moloco/sdk/internal/services/x;Lcom/moloco/sdk/internal/services/usertracker/c;Lwd/c;)V

    .line 203
    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_5
    new-instance v0, Lcom/moloco/sdk/internal/services/init/u;

    .line 207
    .line 208
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/d;->a:Lef/p;

    .line 209
    .line 210
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;

    .line 215
    .line 216
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/init/u;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;)V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_6
    new-instance v0, Lcom/moloco/sdk/internal/services/n;

    .line 221
    .line 222
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/n;-><init>(Landroid/content/Context;)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_7
    new-instance v0, Lcom/moloco/sdk/internal/services/z;

    .line 231
    .line 232
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/z;-><init>(Landroid/content/Context;)V

    .line 237
    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_8
    new-instance v0, Lcom/moloco/sdk/internal/services/E;

    .line 241
    .line 242
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/E;-><init>(Landroid/content/Context;)V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :pswitch_9
    new-instance v0, Lcom/moloco/sdk/internal/services/i;

    .line 251
    .line 252
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/i;-><init>(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_a
    new-instance v0, Lcom/moloco/sdk/internal/services/y;

    .line 261
    .line 262
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/y;-><init>(Landroid/content/Context;)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_b
    new-instance v0, Lcom/moloco/sdk/internal/services/v;

    .line 271
    .line 272
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/v;-><init>(Landroid/content/Context;)V

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_c
    new-instance v0, Lcom/moloco/sdk/internal/services/x;

    .line 281
    .line 282
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/x;-><init>(Landroid/content/Context;)V

    .line 287
    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_d
    new-instance v0, Lcom/moloco/sdk/internal/error/crash/c;

    .line 291
    .line 292
    new-instance v2, Lba/a;

    .line 293
    .line 294
    new-instance v3, Lcom/moloco/sdk/internal/error/crash/filters/a;

    .line 295
    .line 296
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    new-instance v4, LX2/j;

    .line 304
    .line 305
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->b()Lcom/moloco/sdk/internal/services/k;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    sget-object v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/d;->a:Lef/p;

    .line 310
    .line 311
    invoke-virtual {v6}, Lef/p;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;

    .line 316
    .line 317
    invoke-direct {v4, v5, v6}, LX2/j;-><init>(Lcom/moloco/sdk/internal/services/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;)V

    .line 318
    .line 319
    .line 320
    sget-object v5, Lcom/moloco/sdk/acm/recorder/b;->Companion:Lcom/moloco/sdk/acm/recorder/a;

    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v5, Lcom/moloco/sdk/acm/recorder/c;

    .line 326
    .line 327
    invoke-direct {v5, v1}, Lcom/moloco/sdk/acm/recorder/c;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    const/4 v1, 0x4

    .line 331
    invoke-direct {v2, v3, v4, v5, v1}, Lba/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 332
    .line 333
    .line 334
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/error/crash/c;-><init>(Lba/a;)V

    .line 335
    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_e
    new-instance v0, Lcom/moloco/sdk/internal/services/config/a;

    .line 339
    .line 340
    invoke-direct {v0}, Lcom/moloco/sdk/internal/services/config/a;-><init>()V

    .line 341
    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_f
    new-instance v0, Lcom/moloco/sdk/internal/ilrd/s;

    .line 345
    .line 346
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/ilrd/s;-><init>(Landroid/content/Context;)V

    .line 351
    .line 352
    .line 353
    return-object v0

    .line 354
    :pswitch_10
    new-instance v0, Lcom/moloco/sdk/internal/error/b;

    .line 355
    .line 356
    sget-object v1, Lcom/moloco/sdk/service_locator/c;->a:Lef/p;

    .line 357
    .line 358
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, Lcom/moloco/sdk/internal/services/config/a;

    .line 363
    .line 364
    new-instance v2, LX2/j;

    .line 365
    .line 366
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->b()Lcom/moloco/sdk/internal/services/k;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/d;->a:Lef/p;

    .line 371
    .line 372
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;

    .line 377
    .line 378
    invoke-direct {v2, v3, v4}, LX2/j;-><init>(Lcom/moloco/sdk/internal/services/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;)V

    .line 379
    .line 380
    .line 381
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/internal/error/b;-><init>(Lcom/moloco/sdk/internal/services/config/a;LX2/j;)V

    .line 382
    .line 383
    .line 384
    return-object v0

    .line 385
    :pswitch_11
    new-instance v0, Lcom/moloco/sdk/internal/services/u;

    .line 386
    .line 387
    sget-object v1, Landroidx/lifecycle/J;->i:Landroidx/lifecycle/J;

    .line 388
    .line 389
    iget-object v1, v1, Landroidx/lifecycle/J;->f:Landroidx/lifecycle/x;

    .line 390
    .line 391
    sget-object v2, Lcom/moloco/sdk/service_locator/b;->b:Lef/p;

    .line 392
    .line 393
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    check-cast v2, Lcom/moloco/sdk/internal/services/m;

    .line 398
    .line 399
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/internal/services/u;-><init>(Landroidx/lifecycle/o;Lcom/moloco/sdk/internal/services/m;)V

    .line 400
    .line 401
    .line 402
    return-object v0

    .line 403
    :pswitch_12
    new-instance v0, Lcom/moloco/sdk/internal/services/m;

    .line 404
    .line 405
    sget-object v1, Lcom/moloco/sdk/service_locator/b;->a:Lef/p;

    .line 406
    .line 407
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    check-cast v1, Lcom/moloco/sdk/internal/services/analytics/c;

    .line 412
    .line 413
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->b()Lcom/moloco/sdk/internal/services/k;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/internal/services/m;-><init>(Lcom/moloco/sdk/internal/services/analytics/c;Lcom/moloco/sdk/internal/services/k;)V

    .line 418
    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_13
    new-instance v0, Lcom/moloco/sdk/internal/services/analytics/c;

    .line 422
    .line 423
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-static {}, Lcom/moloco/sdk/service_locator/l;->a()Lcom/moloco/sdk/internal/services/events/c;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    sget-object v3, Lcom/moloco/sdk/service_locator/l;->c:Lef/p;

    .line 432
    .line 433
    invoke-virtual {v3}, Lef/p;->getValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    check-cast v3, Lcom/moloco/sdk/internal/services/events/e;

    .line 438
    .line 439
    invoke-direct {v0, v1, v2, v3}, Lcom/moloco/sdk/internal/services/analytics/c;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/services/events/e;)V

    .line 440
    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_14
    new-instance v0, Lcom/moloco/sdk/internal/services/l;

    .line 444
    .line 445
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    sget-object v3, Lcom/moloco/sdk/acm/recorder/b;->Companion:Lcom/moloco/sdk/acm/recorder/a;

    .line 450
    .line 451
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    new-instance v3, Lcom/moloco/sdk/acm/recorder/c;

    .line 455
    .line 456
    invoke-direct {v3, v1}, Lcom/moloco/sdk/acm/recorder/c;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-direct {v0, v2, v3}, Lcom/moloco/sdk/internal/services/l;-><init>(Landroid/content/Context;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 460
    .line 461
    .line 462
    return-object v0

    .line 463
    :pswitch_15
    invoke-static {}, Lcom/moloco/sdk/publisher/Moloco;->d()LEf/E;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0

    .line 468
    :pswitch_16
    invoke-static {}, Lcom/moloco/sdk/publisher/Moloco;->c()Lcom/moloco/sdk/internal/publisher/s;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    return-object v0

    .line 473
    :pswitch_17
    invoke-static {}, Lcom/moloco/sdk/publisher/Moloco;->a()Lcom/moloco/sdk/internal/services/bidtoken/k;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    return-object v0

    .line 478
    :pswitch_18
    invoke-static {}, Lcom/moloco/sdk/publisher/Moloco;->b()Lcom/moloco/sdk/internal/publisher/r0;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    return-object v0

    .line 483
    :pswitch_19
    new-instance v0, Lcom/moloco/sdk/internal/B;

    .line 484
    .line 485
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/B;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;)V

    .line 490
    .line 491
    .line 492
    return-object v0

    .line 493
    :pswitch_1a
    invoke-static {}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityPlugin;->c()Lcom/moloco/sdk/internal/unity_bridge/internal/e;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    return-object v0

    .line 498
    :pswitch_1b
    invoke-static {}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityPlugin;->a()Landroid/content/Context;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    return-object v0

    .line 503
    :pswitch_1c
    const-string v1, "UHJqdF9DaHJvbm9z"

    .line 504
    .line 505
    invoke-static {v1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    .line 510
    .line 511
    invoke-direct {v1, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 512
    .line 513
    .line 514
    return-object v1

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
