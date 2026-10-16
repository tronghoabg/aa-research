.class public final synthetic LAb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LAb/a;->a:I

    iput-object p1, p0, LAb/a;->b:Ljava/lang/Object;

    iput-object p2, p0, LAb/a;->c:Ljava/lang/Object;

    iput-object p3, p0, LAb/a;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    iget v5, v1, LAb/a;->a:I

    .line 8
    .line 9
    packed-switch v5, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;

    .line 15
    .line 16
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lcom/applovin/impl/c3;

    .line 19
    .line 20
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lcom/applovin/mediation/MaxAd;

    .line 23
    .line 24
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;->c(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;Lcom/applovin/impl/c3;Lcom/applovin/mediation/MaxAd;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lcom/applovin/impl/mediation/ads/MaxAdViewImpl;

    .line 31
    .line 32
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lcom/applovin/impl/mediation/ads/a$a;

    .line 35
    .line 36
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lcom/applovin/impl/i;

    .line 39
    .line 40
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/mediation/ads/MaxAdViewImpl;->m(Lcom/applovin/impl/mediation/ads/MaxAdViewImpl;Lcom/applovin/impl/mediation/ads/a$a;Lcom/applovin/impl/i;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lcom/applovin/impl/m8;

    .line 47
    .line 48
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lcom/applovin/impl/sdk/network/e;

    .line 51
    .line 52
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lcom/applovin/sdk/AppLovinPostbackListener;

    .line 55
    .line 56
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/m8;->d(Lcom/applovin/impl/m8;Lcom/applovin/impl/sdk/network/e;Lcom/applovin/sdk/AppLovinPostbackListener;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    iget-object v0, v1, LAb/a;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lcom/applovin/impl/sdk/ad/b;

    .line 63
    .line 64
    iget-object v2, v1, LAb/a;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lcom/applovin/impl/sdk/k;

    .line 67
    .line 68
    iget-object v3, v1, LAb/a;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v2, v3, v0}, Lcom/applovin/impl/l7;->b(Lcom/applovin/impl/sdk/k;Ljava/lang/String;Lcom/applovin/impl/sdk/ad/b;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_3
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lcom/applovin/impl/f4;

    .line 79
    .line 80
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Landroid/view/View;

    .line 83
    .line 84
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Ljava/util/List;

    .line 87
    .line 88
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/f4;->f(Lcom/applovin/impl/f4;Landroid/view/View;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lcom/applovin/impl/f4;

    .line 95
    .line 96
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Ljava/lang/Runnable;

    .line 103
    .line 104
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/f4;->d(Lcom/applovin/impl/f4;Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_5
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lcom/applovin/impl/f1;

    .line 111
    .line 112
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Lcom/applovin/impl/g1;

    .line 115
    .line 116
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, Lu/n;

    .line 119
    .line 120
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/f1;->b(Lcom/applovin/impl/f1;Lcom/applovin/impl/g1;Lu/n;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_6
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Ljava/util/List;

    .line 127
    .line 128
    iget-object v2, v1, LAb/a;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v2, Lu/n;

    .line 131
    .line 132
    iget-object v3, v1, LAb/a;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v3, Lcom/applovin/impl/f1;

    .line 135
    .line 136
    invoke-static {v3, v0, v2}, Lcom/applovin/impl/f1;->a(Lcom/applovin/impl/f1;Ljava/util/List;Lu/n;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_7
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lcom/applovin/impl/e2;

    .line 143
    .line 144
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v2, Lcom/applovin/impl/d2;

    .line 147
    .line 148
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v3, Ljava/util/List;

    .line 151
    .line 152
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/e2;->a(Lcom/applovin/impl/e2;Lcom/applovin/impl/d2;Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_8
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lcom/applovin/impl/adview/a;

    .line 159
    .line 160
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Ljava/lang/String;

    .line 163
    .line 164
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v3, Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/adview/a;->o(Lcom/applovin/impl/adview/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_9
    iget-object v0, v1, LAb/a;->d:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Landroidx/fragment/app/m;

    .line 175
    .line 176
    const-string v2, "this$0"

    .line 177
    .line 178
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    iget-object v2, v1, LAb/a;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v2, Landroidx/fragment/app/A0;

    .line 184
    .line 185
    iget-object v2, v2, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 186
    .line 187
    iget-object v3, v1, LAb/a;->c:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v3, Landroidx/fragment/app/A0;

    .line 190
    .line 191
    iget-object v3, v3, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 192
    .line 193
    sget-object v4, Landroidx/fragment/app/o0;->a:Landroidx/fragment/app/t0;

    .line 194
    .line 195
    const-string v4, "inFragment"

    .line 196
    .line 197
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const-string v4, "outFragment"

    .line 201
    .line 202
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-boolean v0, v0, Landroidx/fragment/app/m;->o:Z

    .line 206
    .line 207
    if-eqz v0, :cond_0

    .line 208
    .line 209
    invoke-virtual {v3}, Landroidx/fragment/app/F;->getEnterTransitionCallback()LX0/U;

    .line 210
    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_0
    invoke-virtual {v2}, Landroidx/fragment/app/F;->getEnterTransitionCallback()LX0/U;

    .line 214
    .line 215
    .line 216
    :goto_0
    return-void

    .line 217
    :pswitch_a
    const-string v0, "$container"

    .line 218
    .line 219
    iget-object v2, v1, LAb/a;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v2, Landroid/view/ViewGroup;

    .line 222
    .line 223
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v0, "this$0"

    .line 227
    .line 228
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v3, Landroidx/fragment/app/e;

    .line 231
    .line 232
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Landroid/view/View;

    .line 238
    .line 239
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 240
    .line 241
    .line 242
    iget-object v0, v3, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/f;

    .line 243
    .line 244
    iget-object v0, v0, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 245
    .line 246
    invoke-virtual {v0, v3}, Landroidx/fragment/app/A0;->c(Landroidx/fragment/app/z0;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_b
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, LZ9/i;

    .line 253
    .line 254
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v2, Ljava/lang/String;

    .line 257
    .line 258
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v3, Laa/e;

    .line 261
    .line 262
    iget-object v0, v0, LZ9/i;->a:LX2/j;

    .line 263
    .line 264
    iget-object v5, v0, LX2/j;->b:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v5, LO9/b;

    .line 267
    .line 268
    invoke-interface {v5}, LO9/b;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    check-cast v5, Lw8/d;

    .line 273
    .line 274
    if-nez v5, :cond_1

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_1
    iget-object v6, v3, Laa/e;->e:Lorg/json/JSONObject;

    .line 279
    .line 280
    invoke-virtual {v6}, Lorg/json/JSONObject;->length()I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-ge v7, v4, :cond_2

    .line 285
    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :cond_2
    iget-object v3, v3, Laa/e;->b:Lorg/json/JSONObject;

    .line 289
    .line 290
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    if-ge v7, v4, :cond_3

    .line 295
    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    :cond_3
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    if-nez v4, :cond_4

    .line 303
    .line 304
    goto/16 :goto_1

    .line 305
    .line 306
    :cond_4
    const-string v6, "choiceId"

    .line 307
    .line 308
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-eqz v7, :cond_5

    .line 317
    .line 318
    goto :goto_1

    .line 319
    :cond_5
    iget-object v7, v0, LX2/j;->c:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v7, Ljava/util/Map;

    .line 322
    .line 323
    monitor-enter v7

    .line 324
    :try_start_0
    iget-object v8, v0, LX2/j;->c:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v8, Ljava/util/Map;

    .line 327
    .line 328
    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    if-eqz v8, :cond_6

    .line 337
    .line 338
    monitor-exit v7

    .line 339
    goto :goto_1

    .line 340
    :catchall_0
    move-exception v0

    .line 341
    goto :goto_2

    .line 342
    :cond_6
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Ljava/util/Map;

    .line 345
    .line 346
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    const-string v0, "arm_key"

    .line 351
    .line 352
    invoke-static {v0, v2}, Lka/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    const-string v7, "arm_value"

    .line 357
    .line 358
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v0, v7, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-string v2, "personalization_id"

    .line 366
    .line 367
    const-string v3, "personalizationId"

    .line 368
    .line 369
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    const-string v2, "arm_index"

    .line 377
    .line 378
    const-string v3, "armIndex"

    .line 379
    .line 380
    const/4 v7, -0x1

    .line 381
    invoke-virtual {v4, v3, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 386
    .line 387
    .line 388
    const-string v2, "group"

    .line 389
    .line 390
    const-string v3, "group"

    .line 391
    .line 392
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    const-string v2, "fp"

    .line 400
    .line 401
    const-string v3, "personalization_assignment"

    .line 402
    .line 403
    invoke-interface {v5, v2, v3, v0}, Lw8/d;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 404
    .line 405
    .line 406
    new-instance v0, Landroid/os/Bundle;

    .line 407
    .line 408
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 409
    .line 410
    .line 411
    const-string v2, "_fpid"

    .line 412
    .line 413
    invoke-virtual {v0, v2, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    const-string v2, "fp"

    .line 417
    .line 418
    const-string v3, "_fpc"

    .line 419
    .line 420
    invoke-interface {v5, v2, v3, v0}, Lw8/d;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 421
    .line 422
    .line 423
    :goto_1
    return-void

    .line 424
    :goto_2
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 425
    throw v0

    .line 426
    :pswitch_c
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v0, Ljava/util/Map;

    .line 429
    .line 430
    iget-object v2, v1, LAb/a;->d:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 433
    .line 434
    iget-object v3, v1, LAb/a;->b:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v3, LYc/f;

    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    :try_start_2
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    const-string v4, "enabled"

    .line 446
    .line 447
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    check-cast v0, Ljava/lang/Boolean;

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    invoke-virtual {v3, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->i(Z)V

    .line 461
    .line 462
    .line 463
    new-instance v0, LNc/d;

    .line 464
    .line 465
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 466
    .line 467
    .line 468
    iget-object v3, v3, Lcom/google/firebase/messaging/FirebaseMessaging;->e:LM/y;

    .line 469
    .line 470
    invoke-virtual {v3}, LM/y;->f()Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    const-string v4, "isAutoInitEnabled"

    .line 479
    .line 480
    invoke-virtual {v0, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 484
    .line 485
    .line 486
    goto :goto_3

    .line 487
    :catch_0
    move-exception v0

    .line 488
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 489
    .line 490
    .line 491
    :goto_3
    return-void

    .line 492
    :pswitch_d
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Landroid/content/Intent;

    .line 495
    .line 496
    iget-object v2, v1, LAb/a;->d:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 499
    .line 500
    iget-object v4, v1, LAb/a;->b:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v4, LW9/g;

    .line 503
    .line 504
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    :try_start_3
    invoke-virtual {v4, v0}, LW9/g;->b(Landroid/content/Intent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :catchall_1
    move-exception v0

    .line 515
    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    throw v0

    .line 519
    :pswitch_e
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, LUc/n;

    .line 522
    .line 523
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v2, LUc/j;

    .line 526
    .line 527
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v3, LPc/o;

    .line 530
    .line 531
    :try_start_4
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    iget-object v4, v2, LUc/j;->a:Ljava/lang/String;

    .line 536
    .line 537
    invoke-virtual {v0, v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    iget-object v2, v2, LUc/j;->b:Ljava/util/Map;

    .line 542
    .line 543
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    check-cast v2, Ljava/util/Map;

    .line 547
    .line 548
    new-instance v4, Ljava/util/HashMap;

    .line 549
    .line 550
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 551
    .line 552
    .line 553
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 562
    .line 563
    .line 564
    move-result v6

    .line 565
    if-eqz v6, :cond_9

    .line 566
    .line 567
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v6

    .line 571
    instance-of v7, v6, Ljava/lang/String;

    .line 572
    .line 573
    if-eqz v7, :cond_7

    .line 574
    .line 575
    move-object v7, v6

    .line 576
    check-cast v7, Ljava/lang/String;

    .line 577
    .line 578
    filled-new-array {v7}, [Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v7

    .line 582
    invoke-static {v7}, Lm9/r;->b([Ljava/lang/String;)Lm9/r;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    goto :goto_4

    .line 594
    :catch_1
    move-exception v0

    .line 595
    goto :goto_6

    .line 596
    :cond_7
    instance-of v7, v6, Lm9/r;

    .line 597
    .line 598
    if-eqz v7, :cond_8

    .line 599
    .line 600
    move-object v7, v6

    .line 601
    check-cast v7, Lm9/r;

    .line 602
    .line 603
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    goto :goto_4

    .line 611
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 612
    .line 613
    const-string v2, "Invalid key type in update data. Supported types are String and FieldPath."

    .line 614
    .line 615
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    throw v0

    .line 619
    :cond_9
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    check-cast v2, Lm9/r;

    .line 632
    .line 633
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v5

    .line 637
    new-instance v6, Ljava/util/ArrayList;

    .line 638
    .line 639
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 643
    .line 644
    .line 645
    move-result-object v7

    .line 646
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 651
    .line 652
    .line 653
    move-result v8

    .line 654
    if-eqz v8, :cond_b

    .line 655
    .line 656
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    check-cast v8, Lm9/r;

    .line 661
    .line 662
    invoke-virtual {v8, v2}, Lm9/r;->equals(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v9

    .line 666
    if-eqz v9, :cond_a

    .line 667
    .line 668
    goto :goto_5

    .line 669
    :cond_a
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v8

    .line 676
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    goto :goto_5

    .line 680
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    invoke-virtual {v0, v2, v5, v4}, Lm9/m;->f(Lm9/r;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    check-cast v0, Ljava/lang/Void;

    .line 693
    .line 694
    invoke-virtual {v3, v0}, LPc/o;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 695
    .line 696
    .line 697
    goto :goto_7

    .line 698
    :goto_6
    invoke-static {v3, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 699
    .line 700
    .line 701
    :goto_7
    return-void

    .line 702
    :pswitch_f
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v0, LUc/n;

    .line 705
    .line 706
    iget-object v5, v1, LAb/a;->c:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v5, Ljava/util/List;

    .line 709
    .line 710
    iget-object v6, v1, LAb/a;->d:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v6, LPc/q;

    .line 713
    .line 714
    :try_start_5
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    iget-object v7, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 719
    .line 720
    invoke-virtual {v7}, LDd/c;->C()V

    .line 721
    .line 722
    .line 723
    new-instance v7, LE5/b;

    .line 724
    .line 725
    invoke-direct {v7, v0}, LE5/b;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 726
    .line 727
    .line 728
    iget-object v8, v7, LE5/b;->d:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v8, Ljava/util/ArrayList;

    .line 731
    .line 732
    iget-object v9, v7, LE5/b;->c:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v9, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 735
    .line 736
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 741
    .line 742
    .line 743
    move-result v10

    .line 744
    if-eqz v10, :cond_12

    .line 745
    .line 746
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v10

    .line 750
    check-cast v10, LUc/x;

    .line 751
    .line 752
    iget v11, v10, LUc/x;->a:I

    .line 753
    .line 754
    if-eqz v11, :cond_11

    .line 755
    .line 756
    iget-object v12, v10, LUc/x;->b:Ljava/lang/String;

    .line 757
    .line 758
    invoke-static {v12}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    iget-object v13, v10, LUc/x;->c:Ljava/util/Map;

    .line 762
    .line 763
    invoke-virtual {v0, v12}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 764
    .line 765
    .line 766
    move-result-object v12

    .line 767
    invoke-static {v11}, LA/f;->f(I)I

    .line 768
    .line 769
    .line 770
    move-result v11
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 771
    iget-object v15, v12, Lm9/m;->a:Ls9/h;

    .line 772
    .line 773
    if-eq v11, v4, :cond_10

    .line 774
    .line 775
    if-eq v11, v2, :cond_d

    .line 776
    .line 777
    const/4 v10, 0x3

    .line 778
    if-eq v11, v10, :cond_c

    .line 779
    .line 780
    goto :goto_8

    .line 781
    :cond_c
    :try_start_6
    invoke-virtual {v9, v12}, Lcom/google/firebase/firestore/FirebaseFirestore;->k(Lm9/m;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v7}, LE5/b;->r()V

    .line 785
    .line 786
    .line 787
    new-instance v10, Lt9/e;

    .line 788
    .line 789
    sget-object v11, Lt9/m;->c:Lt9/m;

    .line 790
    .line 791
    invoke-direct {v10, v15, v11}, Lt9/h;-><init>(Ls9/h;Lt9/m;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    goto :goto_8

    .line 798
    :cond_d
    iget-object v10, v10, LUc/x;->d:LUc/q;

    .line 799
    .line 800
    invoke-static {v10}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    iget-object v11, v10, LUc/q;->a:Ljava/lang/Boolean;

    .line 804
    .line 805
    if-eqz v11, :cond_e

    .line 806
    .line 807
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 808
    .line 809
    .line 810
    move-result v11

    .line 811
    if-eqz v11, :cond_e

    .line 812
    .line 813
    invoke-static {v13}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    sget-object v10, Lm9/a0;->d:Lm9/a0;

    .line 817
    .line 818
    check-cast v13, Ljava/util/Map;

    .line 819
    .line 820
    invoke-virtual {v7, v12, v13, v10}, LE5/b;->k(Lm9/m;Ljava/util/Map;Lm9/a0;)V

    .line 821
    .line 822
    .line 823
    goto :goto_8

    .line 824
    :catch_2
    move-exception v0

    .line 825
    goto :goto_9

    .line 826
    :cond_e
    iget-object v10, v10, LUc/q;->b:Ljava/util/List;

    .line 827
    .line 828
    if-eqz v10, :cond_f

    .line 829
    .line 830
    check-cast v10, Ljava/util/List;

    .line 831
    .line 832
    invoke-static {v10}, Lxg/g;->D(Ljava/util/List;)Ljava/util/ArrayList;

    .line 833
    .line 834
    .line 835
    move-result-object v10

    .line 836
    invoke-static {v13}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    invoke-static {v10}, Lm9/a0;->a(Ljava/util/ArrayList;)Lm9/a0;

    .line 840
    .line 841
    .line 842
    move-result-object v10

    .line 843
    check-cast v13, Ljava/util/Map;

    .line 844
    .line 845
    invoke-virtual {v7, v12, v13, v10}, LE5/b;->k(Lm9/m;Ljava/util/Map;Lm9/a0;)V

    .line 846
    .line 847
    .line 848
    goto :goto_8

    .line 849
    :cond_f
    invoke-static {v13}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    sget-object v10, Lm9/a0;->c:Lm9/a0;

    .line 853
    .line 854
    check-cast v13, Ljava/util/Map;

    .line 855
    .line 856
    invoke-virtual {v7, v12, v13, v10}, LE5/b;->k(Lm9/m;Ljava/util/Map;Lm9/a0;)V

    .line 857
    .line 858
    .line 859
    goto :goto_8

    .line 860
    :cond_10
    invoke-static {v13}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    check-cast v13, Ljava/util/Map;

    .line 864
    .line 865
    iget-object v10, v9, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 866
    .line 867
    invoke-virtual {v10, v13}, Lm9/f0;->i(Ljava/util/Map;)Lne/a;

    .line 868
    .line 869
    .line 870
    move-result-object v10

    .line 871
    invoke-virtual {v9, v12}, Lcom/google/firebase/firestore/FirebaseFirestore;->k(Lm9/m;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v7}, LE5/b;->r()V

    .line 875
    .line 876
    .line 877
    invoke-static {v4}, Lt9/m;->a(Z)Lt9/m;

    .line 878
    .line 879
    .line 880
    move-result-object v18

    .line 881
    new-instance v14, Lt9/l;

    .line 882
    .line 883
    iget-object v11, v10, Lne/a;->b:Ljava/lang/Object;

    .line 884
    .line 885
    move-object/from16 v17, v11

    .line 886
    .line 887
    check-cast v17, Lt9/f;

    .line 888
    .line 889
    iget-object v11, v10, Lne/a;->a:Ljava/lang/Object;

    .line 890
    .line 891
    move-object/from16 v16, v11

    .line 892
    .line 893
    check-cast v16, Ls9/l;

    .line 894
    .line 895
    iget-object v10, v10, Lne/a;->c:Ljava/lang/Object;

    .line 896
    .line 897
    move-object/from16 v19, v10

    .line 898
    .line 899
    check-cast v19, Ljava/util/List;

    .line 900
    .line 901
    invoke-direct/range {v14 .. v19}, Lt9/l;-><init>(Ls9/h;Ls9/l;Lt9/f;Lt9/m;Ljava/util/List;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    goto/16 :goto_8

    .line 908
    .line 909
    :cond_11
    throw v3

    .line 910
    :cond_12
    invoke-virtual {v7}, LE5/b;->e()Lcom/google/android/gms/tasks/Task;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v6, v3}, LPc/q;->a(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 918
    .line 919
    .line 920
    goto :goto_a

    .line 921
    :goto_9
    invoke-static {v6, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 922
    .line 923
    .line 924
    :goto_a
    return-void

    .line 925
    :pswitch_10
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v0, LUc/j;

    .line 928
    .line 929
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 930
    .line 931
    check-cast v2, LUc/n;

    .line 932
    .line 933
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v3, LPc/p;

    .line 936
    .line 937
    sget-object v4, LUc/f;->h:Ljava/util/HashMap;

    .line 938
    .line 939
    :try_start_7
    iget v4, v0, LUc/j;->d:I

    .line 940
    .line 941
    invoke-static {v4}, Lxg/g;->H(I)I

    .line 942
    .line 943
    .line 944
    move-result v4

    .line 945
    invoke-static {v2}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    iget-object v5, v0, LUc/j;->a:Ljava/lang/String;

    .line 950
    .line 951
    invoke-virtual {v2, v5}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    invoke-virtual {v2, v4}, Lm9/m;->c(I)Lcom/google/android/gms/tasks/Task;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v2

    .line 963
    check-cast v2, Lm9/o;

    .line 964
    .line 965
    iget v0, v0, LUc/j;->e:I

    .line 966
    .line 967
    invoke-static {v0}, Lxg/g;->G(I)Lm9/n;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    invoke-static {v2, v0}, Lxg/g;->W(Lm9/o;Lm9/n;)LUc/r;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-virtual {v3, v0}, LPc/p;->a(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 976
    .line 977
    .line 978
    goto :goto_b

    .line 979
    :catch_3
    move-exception v0

    .line 980
    invoke-static {v3, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 981
    .line 982
    .line 983
    :goto_b
    return-void

    .line 984
    :pswitch_11
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 985
    .line 986
    check-cast v0, LUc/n;

    .line 987
    .line 988
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v2, LUc/j;

    .line 991
    .line 992
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 993
    .line 994
    check-cast v3, LPc/q;

    .line 995
    .line 996
    :try_start_8
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    iget-object v4, v2, LUc/j;->a:Ljava/lang/String;

    .line 1001
    .line 1002
    invoke-virtual {v0, v4}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    iget-object v4, v2, LUc/j;->b:Ljava/util/Map;

    .line 1007
    .line 1008
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    check-cast v4, Ljava/util/Map;

    .line 1012
    .line 1013
    iget-object v5, v2, LUc/j;->c:LUc/q;

    .line 1014
    .line 1015
    iget-object v5, v5, LUc/q;->a:Ljava/lang/Boolean;

    .line 1016
    .line 1017
    if-eqz v5, :cond_13

    .line 1018
    .line 1019
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v5

    .line 1023
    if-eqz v5, :cond_13

    .line 1024
    .line 1025
    sget-object v2, Lm9/a0;->d:Lm9/a0;

    .line 1026
    .line 1027
    invoke-virtual {v0, v4, v2}, Lm9/m;->e(Ljava/lang/Object;Lm9/a0;)Lcom/google/android/gms/tasks/Task;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    goto :goto_c

    .line 1032
    :catch_4
    move-exception v0

    .line 1033
    goto :goto_d

    .line 1034
    :cond_13
    iget-object v2, v2, LUc/j;->c:LUc/q;

    .line 1035
    .line 1036
    iget-object v2, v2, LUc/q;->b:Ljava/util/List;

    .line 1037
    .line 1038
    if-eqz v2, :cond_14

    .line 1039
    .line 1040
    check-cast v2, Ljava/util/List;

    .line 1041
    .line 1042
    invoke-static {v2}, Lxg/g;->D(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v2

    .line 1046
    invoke-static {v2}, Lm9/a0;->a(Ljava/util/ArrayList;)Lm9/a0;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v2

    .line 1050
    invoke-virtual {v0, v4, v2}, Lm9/m;->e(Ljava/lang/Object;Lm9/a0;)Lcom/google/android/gms/tasks/Task;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    goto :goto_c

    .line 1055
    :cond_14
    sget-object v2, Lm9/a0;->c:Lm9/a0;

    .line 1056
    .line 1057
    invoke-virtual {v0, v4, v2}, Lm9/m;->e(Ljava/lang/Object;Lm9/a0;)Lcom/google/android/gms/tasks/Task;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    :goto_c
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    check-cast v0, Ljava/lang/Void;

    .line 1066
    .line 1067
    invoke-virtual {v3, v0}, LPc/q;->a(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 1068
    .line 1069
    .line 1070
    goto :goto_e

    .line 1071
    :goto_d
    invoke-static {v3, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 1072
    .line 1073
    .line 1074
    :goto_e
    return-void

    .line 1075
    :pswitch_12
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v0, LUc/n;

    .line 1078
    .line 1079
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v2, LUc/j;

    .line 1082
    .line 1083
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast v3, LPc/q;

    .line 1086
    .line 1087
    :try_start_9
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    iget-object v2, v2, LUc/j;->a:Ljava/lang/String;

    .line 1092
    .line 1093
    invoke-virtual {v0, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    invoke-virtual {v0}, Lm9/m;->b()Lcom/google/android/gms/tasks/Task;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    check-cast v0, Ljava/lang/Void;

    .line 1106
    .line 1107
    invoke-virtual {v3, v0}, LPc/q;->a(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 1108
    .line 1109
    .line 1110
    goto :goto_f

    .line 1111
    :catch_5
    move-exception v0

    .line 1112
    invoke-static {v3, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 1113
    .line 1114
    .line 1115
    :goto_f
    return-void

    .line 1116
    :pswitch_13
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v0, LUc/n;

    .line 1119
    .line 1120
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v2, Ljava/lang/String;

    .line 1123
    .line 1124
    iget-object v4, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v4, LPc/p;

    .line 1127
    .line 1128
    :try_start_a
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    invoke-virtual {v0, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->i(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v4, v3}, LPc/p;->a(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    .line 1140
    .line 1141
    .line 1142
    goto :goto_10

    .line 1143
    :catch_6
    move-exception v0

    .line 1144
    invoke-static {v4, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 1145
    .line 1146
    .line 1147
    :goto_10
    return-void

    .line 1148
    :pswitch_14
    iget-object v2, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v2, LU1/G;

    .line 1151
    .line 1152
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    iget-object v3, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1156
    .line 1157
    check-cast v3, Ll8/H;

    .line 1158
    .line 1159
    invoke-virtual {v3}, Ll8/H;->g()Ll8/e0;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v3

    .line 1163
    iget-object v2, v2, LU1/G;->c:LV1/d;

    .line 1164
    .line 1165
    iget-object v4, v2, LV1/d;->g:LU1/u;

    .line 1166
    .line 1167
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1168
    .line 1169
    .line 1170
    iget-object v2, v2, LV1/d;->d:LC6/l;

    .line 1171
    .line 1172
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    invoke-static {v3}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v5

    .line 1179
    iput-object v5, v2, LC6/l;->b:Ljava/lang/Object;

    .line 1180
    .line 1181
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1182
    .line 1183
    .line 1184
    move-result v5

    .line 1185
    if-nez v5, :cond_15

    .line 1186
    .line 1187
    invoke-virtual {v3, v0}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    check-cast v0, Lk2/H;

    .line 1192
    .line 1193
    iput-object v0, v2, LC6/l;->e:Ljava/lang/Object;

    .line 1194
    .line 1195
    iget-object v0, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, Lk2/H;

    .line 1198
    .line 1199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    iput-object v0, v2, LC6/l;->f:Ljava/lang/Object;

    .line 1203
    .line 1204
    :cond_15
    iget-object v0, v2, LC6/l;->d:Ljava/lang/Object;

    .line 1205
    .line 1206
    check-cast v0, Lk2/H;

    .line 1207
    .line 1208
    if-nez v0, :cond_16

    .line 1209
    .line 1210
    iget-object v0, v2, LC6/l;->b:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v0, Ll8/K;

    .line 1213
    .line 1214
    iget-object v3, v2, LC6/l;->e:Ljava/lang/Object;

    .line 1215
    .line 1216
    check-cast v3, Lk2/H;

    .line 1217
    .line 1218
    iget-object v5, v2, LC6/l;->a:Ljava/lang/Object;

    .line 1219
    .line 1220
    check-cast v5, LN1/L;

    .line 1221
    .line 1222
    invoke-static {v4, v0, v3, v5}, LC6/l;->r(LU1/u;Ll8/K;Lk2/H;LN1/L;)Lk2/H;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    iput-object v0, v2, LC6/l;->d:Ljava/lang/Object;

    .line 1227
    .line 1228
    :cond_16
    invoke-virtual {v4}, LU1/u;->o0()LN1/N;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    invoke-virtual {v2, v0}, LC6/l;->F(LN1/N;)V

    .line 1233
    .line 1234
    .line 1235
    return-void

    .line 1236
    :pswitch_15
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v0, Ljava/util/Map;

    .line 1239
    .line 1240
    iget-object v3, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1243
    .line 1244
    iget-object v5, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1245
    .line 1246
    check-cast v5, LSc/b;

    .line 1247
    .line 1248
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    :try_start_b
    invoke-static {v0}, LSc/b;->b(Ljava/util/Map;)Lb7/k;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v5

    .line 1255
    const-string v6, "longDynamicLink"

    .line 1256
    .line 1257
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v6

    .line 1261
    check-cast v6, Ljava/lang/String;

    .line 1262
    .line 1263
    if-eqz v6, :cond_17

    .line 1264
    .line 1265
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v6

    .line 1269
    iget-object v7, v5, Lb7/k;->c:Ljava/lang/Object;

    .line 1270
    .line 1271
    check-cast v7, Landroid/os/Bundle;

    .line 1272
    .line 1273
    const-string v8, "dynamicLink"

    .line 1274
    .line 1275
    invoke-virtual {v7, v8, v6}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_11

    .line 1279
    :catch_7
    move-exception v0

    .line 1280
    goto :goto_14

    .line 1281
    :cond_17
    :goto_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v6

    .line 1285
    const-string v7, "shortLinkType"

    .line 1286
    .line 1287
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    check-cast v0, Ljava/lang/Integer;

    .line 1292
    .line 1293
    if-eqz v0, :cond_1a

    .line 1294
    .line 1295
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1296
    .line 1297
    .line 1298
    move-result v0

    .line 1299
    if-eqz v0, :cond_19

    .line 1300
    .line 1301
    if-eq v0, v4, :cond_18

    .line 1302
    .line 1303
    goto :goto_12

    .line 1304
    :cond_18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v6

    .line 1308
    goto :goto_12

    .line 1309
    :cond_19
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v6

    .line 1313
    :cond_1a
    :goto_12
    new-instance v0, Ljava/util/HashMap;

    .line 1314
    .line 1315
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1319
    .line 1320
    .line 1321
    move-result v2

    .line 1322
    invoke-virtual {v5, v2}, Lb7/k;->n(I)Lcom/google/android/gms/tasks/Task;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v2

    .line 1326
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    check-cast v2, Lf9/n;

    .line 1331
    .line 1332
    new-instance v4, Ljava/util/ArrayList;

    .line 1333
    .line 1334
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1335
    .line 1336
    .line 1337
    iget-object v5, v2, Lf9/n;->c:Ljava/util/List;

    .line 1338
    .line 1339
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v5

    .line 1343
    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v6

    .line 1347
    if-eqz v6, :cond_1b

    .line 1348
    .line 1349
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v6

    .line 1353
    check-cast v6, Lf9/m;

    .line 1354
    .line 1355
    iget-object v6, v6, Lf9/m;->a:Ljava/lang/String;

    .line 1356
    .line 1357
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1358
    .line 1359
    .line 1360
    goto :goto_13

    .line 1361
    :cond_1b
    const-string v5, "url"

    .line 1362
    .line 1363
    iget-object v6, v2, Lf9/n;->a:Landroid/net/Uri;

    .line 1364
    .line 1365
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v6

    .line 1369
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    const-string v5, "warnings"

    .line 1373
    .line 1374
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    const-string v4, "previewLink"

    .line 1378
    .line 1379
    iget-object v2, v2, Lf9/n;->b:Landroid/net/Uri;

    .line 1380
    .line 1381
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v2

    .line 1385
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v3, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7

    .line 1389
    .line 1390
    .line 1391
    goto :goto_15

    .line 1392
    :goto_14
    invoke-virtual {v3, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 1393
    .line 1394
    .line 1395
    :goto_15
    return-void

    .line 1396
    :pswitch_16
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1397
    .line 1398
    move-object v2, v0

    .line 1399
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1400
    .line 1401
    iget-object v0, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v0, Ls8/g;

    .line 1404
    .line 1405
    iget-object v3, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1406
    .line 1407
    check-cast v3, LRc/e;

    .line 1408
    .line 1409
    :try_start_c
    new-instance v4, LNc/d;

    .line 1410
    .line 1411
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 1415
    .line 1416
    .line 1417
    const-string v5, "[DEFAULT]"

    .line 1418
    .line 1419
    iget-object v0, v0, Ls8/g;->b:Ljava/lang/String;

    .line 1420
    .line 1421
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1422
    .line 1423
    .line 1424
    move-result v0

    .line 1425
    if-eqz v0, :cond_1c

    .line 1426
    .line 1427
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    invoke-static {v3, v0}, LRc/e;->a(LRc/e;Ls8/g;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v0

    .line 1435
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v0

    .line 1439
    const-string v3, "isCrashlyticsCollectionEnabled"

    .line 1440
    .line 1441
    invoke-virtual {v4, v3, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    :cond_1c
    invoke-virtual {v2, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8

    .line 1445
    .line 1446
    .line 1447
    goto :goto_16

    .line 1448
    :catch_8
    move-exception v0

    .line 1449
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 1450
    .line 1451
    .line 1452
    :goto_16
    return-void

    .line 1453
    :pswitch_17
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1454
    .line 1455
    check-cast v0, Ls8/g;

    .line 1456
    .line 1457
    iget-object v2, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1458
    .line 1459
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1460
    .line 1461
    sget-object v3, LQc/c;->c:Ljava/util/HashMap;

    .line 1462
    .line 1463
    iget-object v3, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1464
    .line 1465
    check-cast v3, LQc/c;

    .line 1466
    .line 1467
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1468
    .line 1469
    .line 1470
    :try_start_d
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 1471
    .line 1472
    .line 1473
    iget-object v3, v0, Ls8/g;->b:Ljava/lang/String;

    .line 1474
    .line 1475
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 1476
    .line 1477
    .line 1478
    iget-object v4, v0, Ls8/g;->c:Ls8/l;

    .line 1479
    .line 1480
    invoke-static {v4}, LQc/c;->a(Ls8/l;)LQc/f;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v4

    .line 1484
    invoke-virtual {v0}, Ls8/g;->k()Z

    .line 1485
    .line 1486
    .line 1487
    move-result v5

    .line 1488
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v5

    .line 1492
    invoke-static {v0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->getPluginConstantsForFirebaseApp(Ls8/g;)Lcom/google/android/gms/tasks/Task;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v0

    .line 1496
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    check-cast v0, Ljava/util/Map;

    .line 1501
    .line 1502
    new-instance v6, LQc/g;

    .line 1503
    .line 1504
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1505
    .line 1506
    .line 1507
    if-eqz v3, :cond_1e

    .line 1508
    .line 1509
    iput-object v3, v6, LQc/g;->a:Ljava/lang/String;

    .line 1510
    .line 1511
    iput-object v4, v6, LQc/g;->b:LQc/f;

    .line 1512
    .line 1513
    iput-object v5, v6, LQc/g;->c:Ljava/lang/Boolean;

    .line 1514
    .line 1515
    if-eqz v0, :cond_1d

    .line 1516
    .line 1517
    iput-object v0, v6, LQc/g;->d:Ljava/util/Map;

    .line 1518
    .line 1519
    invoke-virtual {v2, v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 1520
    .line 1521
    .line 1522
    goto :goto_18

    .line 1523
    :catch_9
    move-exception v0

    .line 1524
    goto :goto_17

    .line 1525
    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1526
    .line 1527
    const-string v3, "Nonnull field \"pluginConstants\" is null."

    .line 1528
    .line 1529
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1530
    .line 1531
    .line 1532
    throw v0

    .line 1533
    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1534
    .line 1535
    const-string v3, "Nonnull field \"name\" is null."

    .line 1536
    .line 1537
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1538
    .line 1539
    .line 1540
    throw v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    .line 1541
    :goto_17
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 1542
    .line 1543
    .line 1544
    :goto_18
    return-void

    .line 1545
    :pswitch_18
    iget-object v0, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1546
    .line 1547
    check-cast v0, Ljava/lang/Boolean;

    .line 1548
    .line 1549
    iget-object v2, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1550
    .line 1551
    check-cast v2, LPc/m;

    .line 1552
    .line 1553
    invoke-static {v2}, Lxa/d;->s(LPc/m;)LJ8/o;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v2

    .line 1557
    iget-object v3, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1558
    .line 1559
    check-cast v3, LPc/q;

    .line 1560
    .line 1561
    if-nez v2, :cond_1f

    .line 1562
    .line 1563
    invoke-static {}, La/a;->B()LPc/t;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    invoke-virtual {v3, v0}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 1568
    .line 1569
    .line 1570
    goto :goto_19

    .line 1571
    :cond_1f
    :try_start_e
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1572
    .line 1573
    .line 1574
    move-result v0

    .line 1575
    move-object v4, v2

    .line 1576
    check-cast v4, LK8/e;

    .line 1577
    .line 1578
    iget-object v4, v4, LK8/e;->c:Ljava/lang/String;

    .line 1579
    .line 1580
    invoke-static {v4}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v4

    .line 1584
    invoke-static {v4}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v4

    .line 1588
    invoke-virtual {v4, v2, v0}, Lcom/google/firebase/auth/FirebaseAuth;->i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v0

    .line 1596
    check-cast v0, LJ8/p;

    .line 1597
    .line 1598
    invoke-static {v0}, Lcom/moloco/sdk/internal/publisher/H;->k0(LJ8/p;)LPc/G;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    invoke-virtual {v3, v0}, LPc/q;->a(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_a

    .line 1603
    .line 1604
    .line 1605
    goto :goto_19

    .line 1606
    :catch_a
    move-exception v0

    .line 1607
    invoke-static {v0}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    invoke-virtual {v3, v0}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 1612
    .line 1613
    .line 1614
    :goto_19
    return-void

    .line 1615
    :pswitch_19
    iget-object v0, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1616
    .line 1617
    check-cast v0, LFe/h;

    .line 1618
    .line 1619
    const-string v2, "this$0"

    .line 1620
    .line 1621
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1622
    .line 1623
    .line 1624
    iget-object v2, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1625
    .line 1626
    move-object v5, v2

    .line 1627
    check-cast v5, Ljava/lang/String;

    .line 1628
    .line 1629
    iget-object v2, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1630
    .line 1631
    check-cast v2, Ljava/lang/String;

    .line 1632
    .line 1633
    iget-object v3, v0, LFe/h;->d:LX2/j;

    .line 1634
    .line 1635
    if-eqz v3, :cond_20

    .line 1636
    .line 1637
    iget-object v3, v3, LX2/j;->c:Ljava/lang/Object;

    .line 1638
    .line 1639
    check-cast v3, Landroid/webkit/WebView;

    .line 1640
    .line 1641
    const/4 v4, 0x0

    .line 1642
    const-string v6, "text/html"

    .line 1643
    .line 1644
    const-string v7, "UTF-8"

    .line 1645
    .line 1646
    const/4 v8, 0x0

    .line 1647
    invoke-virtual/range {v3 .. v8}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1648
    .line 1649
    .line 1650
    :cond_20
    iget-object v0, v0, LFe/h;->c:Lre/c;

    .line 1651
    .line 1652
    if-eqz v0, :cond_21

    .line 1653
    .line 1654
    invoke-virtual {v0, v2}, Lre/c;->a(Ljava/lang/String;)V

    .line 1655
    .line 1656
    .line 1657
    :cond_21
    return-void

    .line 1658
    :pswitch_1a
    iget-object v2, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1659
    .line 1660
    check-cast v2, LE5/i0;

    .line 1661
    .line 1662
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1663
    .line 1664
    .line 1665
    iget-object v3, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1666
    .line 1667
    check-cast v3, Ll8/H;

    .line 1668
    .line 1669
    invoke-virtual {v3}, Ll8/H;->g()Ll8/e0;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v3

    .line 1673
    iget-object v2, v2, LE5/i0;->c:LF5/f;

    .line 1674
    .line 1675
    iget-object v4, v2, LF5/f;->g:LE5/I;

    .line 1676
    .line 1677
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1678
    .line 1679
    .line 1680
    iget-object v2, v2, LF5/f;->d:LC6/l;

    .line 1681
    .line 1682
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1683
    .line 1684
    .line 1685
    invoke-static {v3}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v5

    .line 1689
    iput-object v5, v2, LC6/l;->b:Ljava/lang/Object;

    .line 1690
    .line 1691
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1692
    .line 1693
    .line 1694
    move-result v5

    .line 1695
    if-nez v5, :cond_22

    .line 1696
    .line 1697
    invoke-virtual {v3, v0}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v0

    .line 1701
    check-cast v0, Lf6/z;

    .line 1702
    .line 1703
    iput-object v0, v2, LC6/l;->e:Ljava/lang/Object;

    .line 1704
    .line 1705
    iget-object v0, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1706
    .line 1707
    check-cast v0, Lf6/z;

    .line 1708
    .line 1709
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1710
    .line 1711
    .line 1712
    iput-object v0, v2, LC6/l;->f:Ljava/lang/Object;

    .line 1713
    .line 1714
    :cond_22
    iget-object v0, v2, LC6/l;->d:Ljava/lang/Object;

    .line 1715
    .line 1716
    check-cast v0, Lf6/z;

    .line 1717
    .line 1718
    if-nez v0, :cond_23

    .line 1719
    .line 1720
    iget-object v0, v2, LC6/l;->b:Ljava/lang/Object;

    .line 1721
    .line 1722
    check-cast v0, Ll8/K;

    .line 1723
    .line 1724
    iget-object v3, v2, LC6/l;->e:Ljava/lang/Object;

    .line 1725
    .line 1726
    check-cast v3, Lf6/z;

    .line 1727
    .line 1728
    iget-object v5, v2, LC6/l;->a:Ljava/lang/Object;

    .line 1729
    .line 1730
    check-cast v5, LE5/H0;

    .line 1731
    .line 1732
    invoke-static {v4, v0, v3, v5}, LC6/l;->q(LE5/I;Ll8/K;Lf6/z;LE5/H0;)Lf6/z;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v0

    .line 1736
    iput-object v0, v2, LC6/l;->d:Ljava/lang/Object;

    .line 1737
    .line 1738
    :cond_23
    invoke-virtual {v4}, LE5/I;->o0()LE5/J0;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    invoke-virtual {v2, v0}, LC6/l;->E(LE5/J0;)V

    .line 1743
    .line 1744
    .line 1745
    return-void

    .line 1746
    :pswitch_1b
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1747
    .line 1748
    check-cast v0, Lcom/vungle/ads/internal/model/i3;

    .line 1749
    .line 1750
    iget-object v2, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1751
    .line 1752
    check-cast v2, Lcom/vungle/ads/internal/network/o;

    .line 1753
    .line 1754
    iget-object v3, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1755
    .line 1756
    check-cast v3, Lcom/vungle/ads/internal/load/j;

    .line 1757
    .line 1758
    invoke-static {v3, v0, v2}, Lcom/vungle/ads/internal/load/i;->a(Lcom/vungle/ads/internal/load/j;Lcom/vungle/ads/internal/model/i3;Lcom/vungle/ads/internal/network/o;)V

    .line 1759
    .line 1760
    .line 1761
    return-void

    .line 1762
    :pswitch_1c
    iget-object v0, v1, LAb/a;->c:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v0, Lcom/vungle/ads/internal/downloader/h;

    .line 1765
    .line 1766
    iget-object v2, v1, LAb/a;->d:Ljava/lang/Object;

    .line 1767
    .line 1768
    check-cast v2, Lcom/vungle/ads/internal/load/c;

    .line 1769
    .line 1770
    iget-object v3, v1, LAb/a;->b:Ljava/lang/Object;

    .line 1771
    .line 1772
    check-cast v3, Lcom/vungle/ads/internal/downloader/k;

    .line 1773
    .line 1774
    invoke-static {v3, v0, v2}, Lcom/vungle/ads/internal/downloader/h;->a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/downloader/h;Lcom/vungle/ads/internal/downloader/d;)V

    .line 1775
    .line 1776
    .line 1777
    return-void

    .line 1778
    nop

    .line 1779
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
