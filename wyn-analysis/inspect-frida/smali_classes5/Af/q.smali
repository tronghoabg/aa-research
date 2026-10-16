.class public final synthetic LAf/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LAf/q;->a:I

    iput-object p1, p0, LAf/q;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, LHf/n0;->a:LHf/p0;

    .line 5
    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Lef/C;->a:Lef/C;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v7, p0, LAf/q;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iget v8, p0, LAf/q;->a:I

    .line 14
    .line 15
    packed-switch v8, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v7, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_0
    check-cast v7, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v7}, Lkotlin/jvm/internal/k;->i([Ljava/lang/Object;)LUf/h;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_1
    check-cast v7, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;

    .line 33
    .line 34
    invoke-static {v7}, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;->a(Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;)LGe/t;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_2
    :try_start_0
    const-string v0, "http.agent"

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-static {v0}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 56
    .line 57
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/b;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    const/4 v11, 0x0

    .line 67
    const/4 v12, 0x0

    .line 68
    const-string v9, "WebBrowserUserAgentService"

    .line 69
    .line 70
    const/16 v13, 0xc

    .line 71
    .line 72
    const/4 v14, 0x0

    .line 73
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    :goto_0
    const-string v0, ""

    .line 77
    .line 78
    :cond_1
    return-object v0

    .line 79
    :pswitch_3
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;

    .line 80
    .line 81
    invoke-virtual {v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->getAdShowListener()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->b()V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-object v5

    .line 91
    :pswitch_4
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 92
    .line 93
    iget-object v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->j:LC8/i;

    .line 94
    .line 95
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, LC8/i;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/a;

    .line 101
    .line 102
    invoke-virtual {v7, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/e;)LEf/H0;

    .line 103
    .line 104
    .line 105
    return-object v5

    .line 106
    :pswitch_5
    check-cast v7, Ltf/l;

    .line 107
    .line 108
    const-string v0, "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html"

    .line 109
    .line 110
    invoke-interface {v7, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-object v5

    .line 114
    :pswitch_6
    check-cast v7, LG9/e;

    .line 115
    .line 116
    iget-object v1, v7, LG9/e;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Ljava/util/Set;

    .line 119
    .line 120
    new-instance v2, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_3

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/a;

    .line 140
    .line 141
    invoke-interface {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/a;->a()Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v3, v2}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 150
    .line 151
    invoke-static {v2, v0}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-static {v0}, Lff/B;->D(I)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/16 v3, 0x10

    .line 160
    .line 161
    if-ge v0, v3, :cond_4

    .line 162
    .line 163
    move v0, v3

    .line 164
    :cond_4
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_7

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    move-object v3, v2

    .line 182
    check-cast v3, Ljava/lang/String;

    .line 183
    .line 184
    new-instance v4, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    iget-object v5, v7, LG9/e;->b:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v5, Ljava/util/Set;

    .line 192
    .line 193
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_6

    .line 202
    .line 203
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    move-object v8, v6

    .line 208
    check-cast v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/a;

    .line 209
    .line 210
    invoke-interface {v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/a;->a()Ljava/util/Set;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    invoke-interface {v8, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-eqz v8, :cond_5

    .line 219
    .line 220
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_6
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_7
    return-object v1

    .line 229
    :pswitch_7
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;

    .line 230
    .line 231
    iget-object v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->f:LHf/x0;

    .line 232
    .line 233
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 234
    .line 235
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;->g:LHf/e0;

    .line 236
    .line 237
    new-instance v4, Lcom/moloco/sdk/internal/publisher/L;

    .line 238
    .line 239
    const/4 v5, 0x5

    .line 240
    invoke-direct {v4, v3, v6, v5}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 241
    .line 242
    .line 243
    new-instance v3, LHf/a0;

    .line 244
    .line 245
    invoke-direct {v3, v0, v1, v4}, LHf/a0;-><init>(LHf/l;LHf/l;Ltf/q;)V

    .line 246
    .line 247
    .line 248
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 249
    .line 250
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->a:LKd/a;

    .line 251
    .line 252
    invoke-static {v3, v1, v2, v0}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    return-object v0

    .line 257
    :pswitch_8
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;

    .line 258
    .line 259
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iput-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->c:LBf/s;

    .line 263
    .line 264
    iput-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/a;

    .line 265
    .line 266
    iput-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/a;

    .line 267
    .line 268
    return-object v5

    .line 269
    :pswitch_9
    check-cast v7, Lkotlin/jvm/internal/G;

    .line 270
    .line 271
    iget-object v0, v7, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, LEf/m0;

    .line 274
    .line 275
    if-eqz v0, :cond_8

    .line 276
    .line 277
    invoke-interface {v0, v6}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 278
    .line 279
    .line 280
    :cond_8
    iput-object v6, v7, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 281
    .line 282
    return-object v5

    .line 283
    :pswitch_a
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 284
    .line 285
    iget-object v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->k:LHf/x0;

    .line 286
    .line 287
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;

    .line 288
    .line 289
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->l()LHf/v0;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    new-instance v4, Lcom/moloco/sdk/internal/publisher/L;

    .line 294
    .line 295
    const/4 v5, 0x4

    .line 296
    invoke-direct {v4, v3, v6, v5}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 297
    .line 298
    .line 299
    new-instance v3, LHf/a0;

    .line 300
    .line 301
    invoke-direct {v3, v0, v1, v4}, LHf/a0;-><init>(LHf/l;LHf/l;Ltf/q;)V

    .line 302
    .line 303
    .line 304
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 305
    .line 306
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->d:LKd/a;

    .line 307
    .line 308
    invoke-static {v3, v1, v2, v0}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    return-object v0

    .line 313
    :pswitch_b
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;

    .line 314
    .line 315
    iget-object v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;->h:LHf/x0;

    .line 316
    .line 317
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;

    .line 318
    .line 319
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;->g:LHf/e0;

    .line 320
    .line 321
    new-instance v4, Lcom/moloco/sdk/internal/publisher/L;

    .line 322
    .line 323
    invoke-direct {v4, v3, v6, v3}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 324
    .line 325
    .line 326
    new-instance v3, LHf/a0;

    .line 327
    .line 328
    invoke-direct {v3, v0, v1, v4}, LHf/a0;-><init>(LHf/l;LHf/l;Ltf/q;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 332
    .line 333
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;->e:LKd/a;

    .line 334
    .line 335
    invoke-static {v3, v1, v2, v0}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0

    .line 340
    :pswitch_c
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l;

    .line 341
    .line 342
    invoke-static {v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l;)LHf/e0;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    return-object v0

    .line 347
    :pswitch_d
    check-cast v7, Lcom/moloco/sdk/internal/services/v;

    .line 348
    .line 349
    iget-object v0, v7, Lcom/moloco/sdk/internal/services/v;->a:Landroid/content/Context;

    .line 350
    .line 351
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 360
    .line 361
    const/16 v2, 0x258

    .line 362
    .line 363
    if-lt v0, v2, :cond_9

    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_9
    move v1, v4

    .line 367
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0

    .line 372
    :pswitch_e
    check-cast v7, Landroid/content/Context;

    .line 373
    .line 374
    invoke-static {v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->b(Landroid/content/Context;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    return-object v0

    .line 379
    :pswitch_f
    check-cast v7, Lcom/moloco/sdk/internal/publisher/nativead/model/n;

    .line 380
    .line 381
    iget-object v0, v7, Lcom/moloco/sdk/internal/publisher/nativead/model/n;->a:Ljava/util/LinkedHashMap;

    .line 382
    .line 383
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/nativead/model/n;->b:Ljava/util/LinkedHashMap;

    .line 384
    .line 385
    invoke-static {v0, v1}, Lff/A;->T(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/nativead/model/n;->c:Ljava/util/LinkedHashMap;

    .line 390
    .line 391
    invoke-static {v0, v1}, Lff/A;->T(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/nativead/model/n;->d:Ljava/util/LinkedHashMap;

    .line 396
    .line 397
    invoke-static {v0, v1}, Lff/A;->T(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    return-object v0

    .line 402
    :pswitch_10
    check-cast v7, LC6/l;

    .line 403
    .line 404
    iget-object v0, v7, LC6/l;->a:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 407
    .line 408
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/u;->c:Ljava/lang/String;

    .line 409
    .line 410
    if-eqz v0, :cond_a

    .line 411
    .line 412
    new-instance v6, Lcom/moloco/sdk/internal/publisher/D;

    .line 413
    .line 414
    invoke-direct {v6, v0}, Lcom/moloco/sdk/internal/publisher/D;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :cond_a
    return-object v6

    .line 418
    :pswitch_11
    check-cast v7, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 419
    .line 420
    iget-object v0, v7, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 421
    .line 422
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 423
    .line 424
    return-object v0

    .line 425
    :pswitch_12
    check-cast v7, Lcom/moloco/sdk/internal/publisher/h;

    .line 426
    .line 427
    iget-boolean v0, v7, Lcom/moloco/sdk/internal/publisher/h;->e:Z

    .line 428
    .line 429
    if-eqz v0, :cond_b

    .line 430
    .line 431
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 432
    .line 433
    const/16 v13, 0xc

    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    const-string v9, "RewardedInterstitialAdShowListenerImpl"

    .line 437
    .line 438
    const-string v10, "onCloseOrSkipButtonShown called - granting reward as skip button is now available (feature flag enabled)"

    .line 439
    .line 440
    const/4 v11, 0x0

    .line 441
    const/4 v12, 0x0

    .line 442
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    iget-object v0, v7, Lcom/moloco/sdk/internal/publisher/h;->d:Ljava/lang/String;

    .line 446
    .line 447
    const/4 v1, 0x6

    .line 448
    invoke-static {v0, v6, v6, v1, v6}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v7, v0}, Lcom/moloco/sdk/internal/publisher/h;->a(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 453
    .line 454
    .line 455
    goto :goto_5

    .line 456
    :cond_b
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 457
    .line 458
    const/16 v13, 0xc

    .line 459
    .line 460
    const/4 v14, 0x0

    .line 461
    const-string v9, "RewardedInterstitialAdShowListenerImpl"

    .line 462
    .line 463
    const-string v10, "onCloseOrSkipButtonShown called - skip button shown but reward requires user click (feature flag disabled)"

    .line 464
    .line 465
    const/4 v11, 0x0

    .line 466
    const/4 v12, 0x0

    .line 467
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    :goto_5
    return-object v5

    .line 471
    :pswitch_13
    check-cast v7, Lcom/moloco/sdk/internal/ilrd/r;

    .line 472
    .line 473
    iget-object v0, v7, Lcom/moloco/sdk/internal/ilrd/r;->b:Lcom/moloco/sdk/internal/ilrd/q;

    .line 474
    .line 475
    if-eqz v0, :cond_c

    .line 476
    .line 477
    iget-object v0, v0, Lcom/moloco/sdk/internal/ilrd/q;->a:Ljava/lang/String;

    .line 478
    .line 479
    if-nez v0, :cond_d

    .line 480
    .line 481
    :cond_c
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    const-string v1, "toString(...)"

    .line 490
    .line 491
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_d
    return-object v0

    .line 495
    :pswitch_14
    check-cast v7, Lcom/moloco/sdk/internal/e;

    .line 496
    .line 497
    iget-object v0, v7, Lcom/moloco/sdk/internal/e;->a:Lcom/moloco/sdk/K0;

    .line 498
    .line 499
    invoke-virtual {v0}, Lcom/moloco/sdk/K0;->j()Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    return-object v0

    .line 508
    :pswitch_15
    check-cast v7, Ls8/b;

    .line 509
    .line 510
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    :try_start_1
    const-string v0, "android.os.SystemProperties"

    .line 514
    .line 515
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    const-string v2, "get"

    .line 520
    .line 521
    new-array v3, v1, [Ljava/lang/Class;

    .line 522
    .line 523
    const-class v8, Ljava/lang/String;

    .line 524
    .line 525
    aput-object v8, v3, v4

    .line 526
    .line 527
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    new-array v1, v1, [Ljava/lang/Object;

    .line 532
    .line 533
    const-string v2, "debug.moloco.internal_logging"

    .line 534
    .line 535
    aput-object v2, v1, v4

    .line 536
    .line 537
    invoke-virtual {v0, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 542
    .line 543
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 547
    .line 548
    :try_start_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 549
    .line 550
    .line 551
    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 552
    if-eqz v1, :cond_e

    .line 553
    .line 554
    goto :goto_6

    .line 555
    :catch_1
    :cond_e
    move-object v6, v0

    .line 556
    :catch_2
    :goto_6
    invoke-static {v6}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    iput-boolean v0, v7, Ls8/b;->b:Z

    .line 561
    .line 562
    return-object v5

    .line 563
    :pswitch_16
    check-cast v7, Lba/a;

    .line 564
    .line 565
    iget-object v0, v7, Lba/a;->b:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, Landroid/content/Context;

    .line 568
    .line 569
    const-string v1, "power"

    .line 570
    .line 571
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    const-string v1, "null cannot be cast to non-null type android.os.PowerManager"

    .line 576
    .line 577
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    check-cast v0, Landroid/os/PowerManager;

    .line 581
    .line 582
    return-object v0

    .line 583
    :pswitch_17
    sget v0, Landroidx/activity/ComponentActivity;->a:I

    .line 584
    .line 585
    check-cast v7, Landroidx/activity/ComponentActivity;

    .line 586
    .line 587
    invoke-virtual {v7}, Landroidx/activity/ComponentActivity;->reportFullyDrawn()V

    .line 588
    .line 589
    .line 590
    return-object v6

    .line 591
    :pswitch_18
    sget-object v1, LUf/j;->s:LUf/j;

    .line 592
    .line 593
    new-array v2, v4, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 594
    .line 595
    new-instance v3, LAf/r;

    .line 596
    .line 597
    check-cast v7, LWf/Y;

    .line 598
    .line 599
    invoke-direct {v3, v7, v0}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 600
    .line 601
    .line 602
    const-string v0, "kotlin.Unit"

    .line 603
    .line 604
    invoke-static {v0, v1, v2, v3}, LFe/g;->s(Ljava/lang/String;LS3/f;[Lkotlinx/serialization/descriptors/SerialDescriptor;Ltf/l;)LUf/g;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    return-object v0

    .line 609
    :pswitch_19
    check-cast v7, LUf/g;

    .line 610
    .line 611
    iget-object v0, v7, LUf/g;->k:[Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 612
    .line 613
    invoke-static {v7, v0}, LWf/b0;->f(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    return-object v0

    .line 622
    :pswitch_1a
    sget-object v0, LUf/c;->p:LUf/c;

    .line 623
    .line 624
    new-array v1, v4, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 625
    .line 626
    new-instance v2, LAf/r;

    .line 627
    .line 628
    check-cast v7, LSf/d;

    .line 629
    .line 630
    const/16 v3, 0x9

    .line 631
    .line 632
    invoke-direct {v2, v7, v3}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 633
    .line 634
    .line 635
    const-string v3, "kotlinx.serialization.Polymorphic"

    .line 636
    .line 637
    invoke-static {v3, v0, v1, v2}, LFe/g;->s(Ljava/lang/String;LS3/f;[Lkotlinx/serialization/descriptors/SerialDescriptor;Ltf/l;)LUf/g;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    iget-object v1, v7, LSf/d;->a:Lkotlin/reflect/KClass;

    .line 642
    .line 643
    const-string v2, "context"

    .line 644
    .line 645
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    new-instance v2, LUf/b;

    .line 649
    .line 650
    invoke-direct {v2, v0, v1}, LUf/b;-><init>(LUf/g;Lkotlin/reflect/KClass;)V

    .line 651
    .line 652
    .line 653
    return-object v2

    .line 654
    :pswitch_1b
    return-object v7

    .line 655
    :pswitch_data_0
    .packed-switch 0x0
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
