.class public final LHf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LHf/m;


# direct methods
.method public synthetic constructor <init>(LHf/m;I)V
    .locals 0

    .line 1
    iput p2, p0, LHf/f;->a:I

    iput-object p1, p0, LHf/f;->b:LHf/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LHf/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lu1/t;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lu1/t;

    .line 12
    .line 13
    iget v1, v0, Lu1/t;->b:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lu1/t;->b:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lu1/t;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lu1/t;-><init>(LHf/f;Ljf/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lu1/t;->a:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    iget v2, v0, Lu1/t;->b:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, Lu1/H;

    .line 57
    .line 58
    instance-of p2, p1, Lu1/l;

    .line 59
    .line 60
    if-nez p2, :cond_7

    .line 61
    .line 62
    instance-of p2, p1, Lu1/k;

    .line 63
    .line 64
    if-nez p2, :cond_6

    .line 65
    .line 66
    instance-of p2, p1, Lu1/c;

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    check-cast p1, Lu1/c;

    .line 71
    .line 72
    iget-object p1, p1, Lu1/c;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iput v3, v0, Lu1/t;->b:I

    .line 75
    .line 76
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 77
    .line 78
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v1, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    :goto_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 86
    .line 87
    :goto_2
    return-object v1

    .line 88
    :cond_4
    instance-of p1, p1, Lu1/I;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 95
    .line 96
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_5
    new-instance p1, LE5/Q;

    .line 101
    .line 102
    const/16 p2, 0x9

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_6
    check-cast p1, Lu1/k;

    .line 110
    .line 111
    iget-object p1, p1, Lu1/k;->a:Ljava/lang/Throwable;

    .line 112
    .line 113
    throw p1

    .line 114
    :cond_7
    check-cast p1, Lu1/l;

    .line 115
    .line 116
    iget-object p1, p1, Lu1/l;->a:Ljava/lang/Throwable;

    .line 117
    .line 118
    throw p1

    .line 119
    :pswitch_0
    instance-of v0, p2, Lfd/y;

    .line 120
    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    move-object v0, p2

    .line 124
    check-cast v0, Lfd/y;

    .line 125
    .line 126
    iget v1, v0, Lfd/y;->b:I

    .line 127
    .line 128
    const/high16 v2, -0x80000000

    .line 129
    .line 130
    and-int v3, v1, v2

    .line 131
    .line 132
    if-eqz v3, :cond_8

    .line 133
    .line 134
    sub-int/2addr v1, v2

    .line 135
    iput v1, v0, Lfd/y;->b:I

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    new-instance v0, Lfd/y;

    .line 139
    .line 140
    invoke-direct {v0, p0, p2}, Lfd/y;-><init>(LHf/f;Ljf/c;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    iget-object p2, v0, Lfd/y;->a:Ljava/lang/Object;

    .line 144
    .line 145
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 146
    .line 147
    iget v2, v0, Lfd/y;->b:I

    .line 148
    .line 149
    const/4 v3, 0x1

    .line 150
    if-eqz v2, :cond_a

    .line 151
    .line 152
    if-ne v2, v3, :cond_9

    .line 153
    .line 154
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 159
    .line 160
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 161
    .line 162
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_a
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    check-cast p1, Lx1/b;

    .line 170
    .line 171
    iget-object p1, p1, Lx1/b;->a:Ljava/util/LinkedHashMap;

    .line 172
    .line 173
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    const-string p2, "unmodifiableMap(preferencesMap)"

    .line 178
    .line 179
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput v3, v0, Lfd/y;->b:I

    .line 187
    .line 188
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 189
    .line 190
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-ne p1, v1, :cond_b

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_b
    :goto_4
    sget-object v1, Lef/C;->a:Lef/C;

    .line 198
    .line 199
    :goto_5
    return-object v1

    .line 200
    :pswitch_1
    instance-of v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;

    .line 201
    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    move-object v0, p2

    .line 205
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;

    .line 206
    .line 207
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;->b:I

    .line 208
    .line 209
    const/high16 v2, -0x80000000

    .line 210
    .line 211
    and-int v3, v1, v2

    .line 212
    .line 213
    if-eqz v3, :cond_c

    .line 214
    .line 215
    sub-int/2addr v1, v2

    .line 216
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;->b:I

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_c
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;

    .line 220
    .line 221
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;-><init>(LHf/f;Ljf/c;)V

    .line 222
    .line 223
    .line 224
    :goto_6
    iget-object p2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;->a:Ljava/lang/Object;

    .line 225
    .line 226
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 227
    .line 228
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;->b:I

    .line 229
    .line 230
    const/4 v3, 0x1

    .line 231
    if-eqz v2, :cond_e

    .line 232
    .line 233
    if-ne v2, v3, :cond_d

    .line 234
    .line 235
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 240
    .line 241
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 242
    .line 243
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_e
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;

    .line 251
    .line 252
    if-eqz p1, :cond_f

    .line 253
    .line 254
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_f
    const/4 p1, 0x0

    .line 258
    :goto_7
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/B;->b:I

    .line 259
    .line 260
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 261
    .line 262
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-ne p1, v1, :cond_10

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_10
    :goto_8
    sget-object v1, Lef/C;->a:Lef/C;

    .line 270
    .line 271
    :goto_9
    return-object v1

    .line 272
    :pswitch_2
    instance-of v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;

    .line 273
    .line 274
    if-eqz v0, :cond_11

    .line 275
    .line 276
    move-object v0, p2

    .line 277
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;

    .line 278
    .line 279
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;->b:I

    .line 280
    .line 281
    const/high16 v2, -0x80000000

    .line 282
    .line 283
    and-int v3, v1, v2

    .line 284
    .line 285
    if-eqz v3, :cond_11

    .line 286
    .line 287
    sub-int/2addr v1, v2

    .line 288
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;->b:I

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_11
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;

    .line 292
    .line 293
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;-><init>(LHf/f;Ljf/c;)V

    .line 294
    .line 295
    .line 296
    :goto_a
    iget-object p2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;->a:Ljava/lang/Object;

    .line 297
    .line 298
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 299
    .line 300
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;->b:I

    .line 301
    .line 302
    const/4 v3, 0x1

    .line 303
    if-eqz v2, :cond_13

    .line 304
    .line 305
    if-ne v2, v3, :cond_12

    .line 306
    .line 307
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto :goto_c

    .line 311
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 312
    .line 313
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 314
    .line 315
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p1

    .line 319
    :cond_13
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    check-cast p1, Lef/u;

    .line 323
    .line 324
    iget p1, p1, Lef/u;->a:I

    .line 325
    .line 326
    if-nez p1, :cond_14

    .line 327
    .line 328
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/c;

    .line 329
    .line 330
    goto :goto_b

    .line 331
    :cond_14
    new-instance p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/d;

    .line 332
    .line 333
    invoke-direct {p2, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/d;-><init>(I)V

    .line 334
    .line 335
    .line 336
    move-object p1, p2

    .line 337
    :goto_b
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/k;->b:I

    .line 338
    .line 339
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 340
    .line 341
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    if-ne p1, v1, :cond_15

    .line 346
    .line 347
    goto :goto_d

    .line 348
    :cond_15
    :goto_c
    sget-object v1, Lef/C;->a:Lef/C;

    .line 349
    .line 350
    :goto_d
    return-object v1

    .line 351
    :pswitch_3
    instance-of v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;

    .line 352
    .line 353
    if-eqz v0, :cond_16

    .line 354
    .line 355
    move-object v0, p2

    .line 356
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;

    .line 357
    .line 358
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;->b:I

    .line 359
    .line 360
    const/high16 v2, -0x80000000

    .line 361
    .line 362
    and-int v3, v1, v2

    .line 363
    .line 364
    if-eqz v3, :cond_16

    .line 365
    .line 366
    sub-int/2addr v1, v2

    .line 367
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;->b:I

    .line 368
    .line 369
    goto :goto_e

    .line 370
    :cond_16
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;

    .line 371
    .line 372
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;-><init>(LHf/f;Ljf/c;)V

    .line 373
    .line 374
    .line 375
    :goto_e
    iget-object p2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;->a:Ljava/lang/Object;

    .line 376
    .line 377
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 378
    .line 379
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;->b:I

    .line 380
    .line 381
    const/4 v3, 0x1

    .line 382
    if-eqz v2, :cond_18

    .line 383
    .line 384
    if-ne v2, v3, :cond_17

    .line 385
    .line 386
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    goto :goto_11

    .line 390
    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 391
    .line 392
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 393
    .line 394
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw p1

    .line 398
    :cond_18
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/D;

    .line 402
    .line 403
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;

    .line 404
    .line 405
    if-eqz p2, :cond_19

    .line 406
    .line 407
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;

    .line 408
    .line 409
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 410
    .line 411
    iget-boolean p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->m:Z

    .line 412
    .line 413
    goto :goto_10

    .line 414
    :cond_19
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;

    .line 415
    .line 416
    if-eqz p2, :cond_1a

    .line 417
    .line 418
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;

    .line 419
    .line 420
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 421
    .line 422
    iget-boolean p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->q:Z

    .line 423
    .line 424
    goto :goto_10

    .line 425
    :cond_1a
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/A;

    .line 426
    .line 427
    if-eqz p2, :cond_1b

    .line 428
    .line 429
    goto :goto_f

    .line 430
    :cond_1b
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/C;

    .line 431
    .line 432
    if-eqz p2, :cond_1c

    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_1c
    if-nez p1, :cond_1e

    .line 436
    .line 437
    :goto_f
    const/4 p1, 0x0

    .line 438
    :goto_10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/p;->b:I

    .line 443
    .line 444
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 445
    .line 446
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    if-ne p1, v1, :cond_1d

    .line 451
    .line 452
    goto :goto_12

    .line 453
    :cond_1d
    :goto_11
    sget-object v1, Lef/C;->a:Lef/C;

    .line 454
    .line 455
    :goto_12
    return-object v1

    .line 456
    :cond_1e
    new-instance p1, LE5/Q;

    .line 457
    .line 458
    const/16 p2, 0x9

    .line 459
    .line 460
    const/4 v0, 0x0

    .line 461
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 462
    .line 463
    .line 464
    throw p1

    .line 465
    :pswitch_4
    instance-of v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;

    .line 466
    .line 467
    if-eqz v0, :cond_1f

    .line 468
    .line 469
    move-object v0, p2

    .line 470
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;

    .line 471
    .line 472
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;->b:I

    .line 473
    .line 474
    const/high16 v2, -0x80000000

    .line 475
    .line 476
    and-int v3, v1, v2

    .line 477
    .line 478
    if-eqz v3, :cond_1f

    .line 479
    .line 480
    sub-int/2addr v1, v2

    .line 481
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;->b:I

    .line 482
    .line 483
    goto :goto_13

    .line 484
    :cond_1f
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;

    .line 485
    .line 486
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;-><init>(LHf/f;Ljf/c;)V

    .line 487
    .line 488
    .line 489
    :goto_13
    iget-object p2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;->a:Ljava/lang/Object;

    .line 490
    .line 491
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 492
    .line 493
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;->b:I

    .line 494
    .line 495
    const/4 v3, 0x1

    .line 496
    if-eqz v2, :cond_21

    .line 497
    .line 498
    if-ne v2, v3, :cond_20

    .line 499
    .line 500
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    goto :goto_14

    .line 504
    :cond_20
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 505
    .line 506
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 507
    .line 508
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    throw p1

    .line 512
    :cond_21
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    move-object p2, p1

    .line 516
    check-cast p2, Lef/u;

    .line 517
    .line 518
    iget p2, p2, Lef/u;->a:I

    .line 519
    .line 520
    if-nez p2, :cond_22

    .line 521
    .line 522
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/G;->b:I

    .line 523
    .line 524
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 525
    .line 526
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    if-ne p1, v1, :cond_22

    .line 531
    .line 532
    goto :goto_15

    .line 533
    :cond_22
    :goto_14
    sget-object v1, Lef/C;->a:Lef/C;

    .line 534
    .line 535
    :goto_15
    return-object v1

    .line 536
    :pswitch_5
    instance-of v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;

    .line 537
    .line 538
    if-eqz v0, :cond_23

    .line 539
    .line 540
    move-object v0, p2

    .line 541
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;

    .line 542
    .line 543
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;->b:I

    .line 544
    .line 545
    const/high16 v2, -0x80000000

    .line 546
    .line 547
    and-int v3, v1, v2

    .line 548
    .line 549
    if-eqz v3, :cond_23

    .line 550
    .line 551
    sub-int/2addr v1, v2

    .line 552
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;->b:I

    .line 553
    .line 554
    goto :goto_16

    .line 555
    :cond_23
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;

    .line 556
    .line 557
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;-><init>(LHf/f;Ljf/c;)V

    .line 558
    .line 559
    .line 560
    :goto_16
    iget-object p2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;->a:Ljava/lang/Object;

    .line 561
    .line 562
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 563
    .line 564
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;->b:I

    .line 565
    .line 566
    const/4 v3, 0x1

    .line 567
    if-eqz v2, :cond_25

    .line 568
    .line 569
    if-ne v2, v3, :cond_24

    .line 570
    .line 571
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    goto :goto_17

    .line 575
    :cond_24
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 576
    .line 577
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 578
    .line 579
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    throw p1

    .line 583
    :cond_25
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    move-object p2, p1

    .line 587
    check-cast p2, Ljava/lang/Number;

    .line 588
    .line 589
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 590
    .line 591
    .line 592
    move-result p2

    .line 593
    if-lez p2, :cond_26

    .line 594
    .line 595
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/q;->b:I

    .line 596
    .line 597
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 598
    .line 599
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    if-ne p1, v1, :cond_26

    .line 604
    .line 605
    goto :goto_18

    .line 606
    :cond_26
    :goto_17
    sget-object v1, Lef/C;->a:Lef/C;

    .line 607
    .line 608
    :goto_18
    return-object v1

    .line 609
    :pswitch_6
    instance-of v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;

    .line 610
    .line 611
    if-eqz v0, :cond_27

    .line 612
    .line 613
    move-object v0, p2

    .line 614
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;

    .line 615
    .line 616
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;->b:I

    .line 617
    .line 618
    const/high16 v2, -0x80000000

    .line 619
    .line 620
    and-int v3, v1, v2

    .line 621
    .line 622
    if-eqz v3, :cond_27

    .line 623
    .line 624
    sub-int/2addr v1, v2

    .line 625
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;->b:I

    .line 626
    .line 627
    goto :goto_19

    .line 628
    :cond_27
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;

    .line 629
    .line 630
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;-><init>(LHf/f;Ljf/c;)V

    .line 631
    .line 632
    .line 633
    :goto_19
    iget-object p2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;->a:Ljava/lang/Object;

    .line 634
    .line 635
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 636
    .line 637
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;->b:I

    .line 638
    .line 639
    const/4 v3, 0x1

    .line 640
    if-eqz v2, :cond_29

    .line 641
    .line 642
    if-ne v2, v3, :cond_28

    .line 643
    .line 644
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    goto :goto_1b

    .line 648
    :cond_28
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 649
    .line 650
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 651
    .line 652
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw p1

    .line 656
    :cond_29
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/C;

    .line 660
    .line 661
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/B;

    .line 662
    .line 663
    if-eqz p2, :cond_2a

    .line 664
    .line 665
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/B;

    .line 666
    .line 667
    goto :goto_1a

    .line 668
    :cond_2a
    const/4 p1, 0x0

    .line 669
    :goto_1a
    if-eqz p1, :cond_2b

    .line 670
    .line 671
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/s;->b:I

    .line 672
    .line 673
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 674
    .line 675
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object p1

    .line 679
    if-ne p1, v1, :cond_2b

    .line 680
    .line 681
    goto :goto_1c

    .line 682
    :cond_2b
    :goto_1b
    sget-object v1, Lef/C;->a:Lef/C;

    .line 683
    .line 684
    :goto_1c
    return-object v1

    .line 685
    :pswitch_7
    instance-of v0, p2, LY3/p;

    .line 686
    .line 687
    if-eqz v0, :cond_2c

    .line 688
    .line 689
    move-object v0, p2

    .line 690
    check-cast v0, LY3/p;

    .line 691
    .line 692
    iget v1, v0, LY3/p;->b:I

    .line 693
    .line 694
    const/high16 v2, -0x80000000

    .line 695
    .line 696
    and-int v3, v1, v2

    .line 697
    .line 698
    if-eqz v3, :cond_2c

    .line 699
    .line 700
    sub-int/2addr v1, v2

    .line 701
    iput v1, v0, LY3/p;->b:I

    .line 702
    .line 703
    goto :goto_1d

    .line 704
    :cond_2c
    new-instance v0, LY3/p;

    .line 705
    .line 706
    invoke-direct {v0, p0, p2}, LY3/p;-><init>(LHf/f;Ljf/c;)V

    .line 707
    .line 708
    .line 709
    :goto_1d
    iget-object p2, v0, LY3/p;->a:Ljava/lang/Object;

    .line 710
    .line 711
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 712
    .line 713
    iget v2, v0, LY3/p;->b:I

    .line 714
    .line 715
    const/4 v3, 0x1

    .line 716
    if-eqz v2, :cond_2e

    .line 717
    .line 718
    if-ne v2, v3, :cond_2d

    .line 719
    .line 720
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    goto :goto_21

    .line 724
    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 725
    .line 726
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 727
    .line 728
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    throw p1

    .line 732
    :cond_2e
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    check-cast p1, LL0/a;

    .line 736
    .line 737
    iget-wide p1, p1, LL0/a;->a:J

    .line 738
    .line 739
    invoke-static {p1, p2}, LL0/a;->e(J)I

    .line 740
    .line 741
    .line 742
    move-result v2

    .line 743
    if-eqz v2, :cond_32

    .line 744
    .line 745
    invoke-static {p1, p2}, LL0/a;->d(J)I

    .line 746
    .line 747
    .line 748
    move-result v2

    .line 749
    if-nez v2, :cond_2f

    .line 750
    .line 751
    goto :goto_1f

    .line 752
    :cond_2f
    new-instance v2, Li4/f;

    .line 753
    .line 754
    invoke-static {p1, p2}, LL0/a;->c(J)Z

    .line 755
    .line 756
    .line 757
    move-result v4

    .line 758
    sget-object v5, Li4/b;->e:Li4/b;

    .line 759
    .line 760
    if-eqz v4, :cond_30

    .line 761
    .line 762
    invoke-static {p1, p2}, LL0/a;->e(J)I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    new-instance v6, Li4/a;

    .line 767
    .line 768
    invoke-direct {v6, v4}, Li4/a;-><init>(I)V

    .line 769
    .line 770
    .line 771
    goto :goto_1e

    .line 772
    :cond_30
    move-object v6, v5

    .line 773
    :goto_1e
    invoke-static {p1, p2}, LL0/a;->b(J)Z

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    if-eqz v4, :cond_31

    .line 778
    .line 779
    invoke-static {p1, p2}, LL0/a;->d(J)I

    .line 780
    .line 781
    .line 782
    move-result p1

    .line 783
    new-instance v5, Li4/a;

    .line 784
    .line 785
    invoke-direct {v5, p1}, Li4/a;-><init>(I)V

    .line 786
    .line 787
    .line 788
    :cond_31
    invoke-direct {v2, v6, v5}, Li4/f;-><init>(Lp7/b;Lp7/b;)V

    .line 789
    .line 790
    .line 791
    goto :goto_20

    .line 792
    :cond_32
    :goto_1f
    const/4 v2, 0x0

    .line 793
    :goto_20
    if-eqz v2, :cond_33

    .line 794
    .line 795
    iput v3, v0, LY3/p;->b:I

    .line 796
    .line 797
    iget-object p1, p0, LHf/f;->b:LHf/m;

    .line 798
    .line 799
    invoke-interface {p1, v2, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object p1

    .line 803
    if-ne p1, v1, :cond_33

    .line 804
    .line 805
    goto :goto_22

    .line 806
    :cond_33
    :goto_21
    sget-object v1, Lef/C;->a:Lef/C;

    .line 807
    .line 808
    :goto_22
    return-object v1

    .line 809
    :pswitch_8
    instance-of v0, p2, LY3/k;

    .line 810
    .line 811
    if-eqz v0, :cond_34

    .line 812
    .line 813
    move-object v0, p2

    .line 814
    check-cast v0, LY3/k;

    .line 815
    .line 816
    iget v1, v0, LY3/k;->b:I

    .line 817
    .line 818
    const/high16 v2, -0x80000000

    .line 819
    .line 820
    and-int v3, v1, v2

    .line 821
    .line 822
    if-eqz v3, :cond_34

    .line 823
    .line 824
    sub-int/2addr v1, v2

    .line 825
    iput v1, v0, LY3/k;->b:I

    .line 826
    .line 827
    goto :goto_23

    .line 828
    :cond_34
    new-instance v0, LY3/k;

    .line 829
    .line 830
    invoke-direct {v0, p0, p2}, LY3/k;-><init>(LHf/f;Ljf/c;)V

    .line 831
    .line 832
    .line 833
    :goto_23
    iget-object p2, v0, LY3/k;->a:Ljava/lang/Object;

    .line 834
    .line 835
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 836
    .line 837
    iget v2, v0, LY3/k;->b:I

    .line 838
    .line 839
    const/4 v3, 0x1

    .line 840
    if-eqz v2, :cond_36

    .line 841
    .line 842
    if-ne v2, v3, :cond_35

    .line 843
    .line 844
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    goto/16 :goto_26

    .line 848
    .line 849
    :cond_35
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 850
    .line 851
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 852
    .line 853
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    throw p1

    .line 857
    :cond_36
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    check-cast p1, Ld0/f;

    .line 861
    .line 862
    iget-wide p1, p1, Ld0/f;->a:J

    .line 863
    .line 864
    sget-wide v4, Ld0/f;->c:J

    .line 865
    .line 866
    cmp-long v2, p1, v4

    .line 867
    .line 868
    if-nez v2, :cond_37

    .line 869
    .line 870
    sget-object p1, Li4/f;->c:Li4/f;

    .line 871
    .line 872
    goto :goto_25

    .line 873
    :cond_37
    invoke-static {p1, p2}, Ld0/f;->d(J)F

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    float-to-double v4, v2

    .line 878
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    .line 879
    .line 880
    cmpl-double v2, v4, v6

    .line 881
    .line 882
    if-ltz v2, :cond_3a

    .line 883
    .line 884
    invoke-static {p1, p2}, Ld0/f;->b(J)F

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    float-to-double v4, v2

    .line 889
    cmpl-double v2, v4, v6

    .line 890
    .line 891
    if-ltz v2, :cond_3a

    .line 892
    .line 893
    new-instance v2, Li4/f;

    .line 894
    .line 895
    invoke-static {p1, p2}, Ld0/f;->d(J)F

    .line 896
    .line 897
    .line 898
    move-result v4

    .line 899
    invoke-static {v4}, Ljava/lang/Float;->isInfinite(F)Z

    .line 900
    .line 901
    .line 902
    move-result v5

    .line 903
    sget-object v6, Li4/b;->e:Li4/b;

    .line 904
    .line 905
    if-nez v5, :cond_38

    .line 906
    .line 907
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 908
    .line 909
    .line 910
    move-result v4

    .line 911
    if-nez v4, :cond_38

    .line 912
    .line 913
    invoke-static {p1, p2}, Ld0/f;->d(J)F

    .line 914
    .line 915
    .line 916
    move-result v4

    .line 917
    invoke-static {v4}, Lvf/a;->H(F)I

    .line 918
    .line 919
    .line 920
    move-result v4

    .line 921
    new-instance v5, Li4/a;

    .line 922
    .line 923
    invoke-direct {v5, v4}, Li4/a;-><init>(I)V

    .line 924
    .line 925
    .line 926
    goto :goto_24

    .line 927
    :cond_38
    move-object v5, v6

    .line 928
    :goto_24
    invoke-static {p1, p2}, Ld0/f;->b(J)F

    .line 929
    .line 930
    .line 931
    move-result v4

    .line 932
    invoke-static {v4}, Ljava/lang/Float;->isInfinite(F)Z

    .line 933
    .line 934
    .line 935
    move-result v7

    .line 936
    if-nez v7, :cond_39

    .line 937
    .line 938
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    if-nez v4, :cond_39

    .line 943
    .line 944
    invoke-static {p1, p2}, Ld0/f;->b(J)F

    .line 945
    .line 946
    .line 947
    move-result p1

    .line 948
    invoke-static {p1}, Lvf/a;->H(F)I

    .line 949
    .line 950
    .line 951
    move-result p1

    .line 952
    new-instance v6, Li4/a;

    .line 953
    .line 954
    invoke-direct {v6, p1}, Li4/a;-><init>(I)V

    .line 955
    .line 956
    .line 957
    :cond_39
    invoke-direct {v2, v5, v6}, Li4/f;-><init>(Lp7/b;Lp7/b;)V

    .line 958
    .line 959
    .line 960
    move-object p1, v2

    .line 961
    goto :goto_25

    .line 962
    :cond_3a
    const/4 p1, 0x0

    .line 963
    :goto_25
    if-eqz p1, :cond_3b

    .line 964
    .line 965
    iput v3, v0, LY3/k;->b:I

    .line 966
    .line 967
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 968
    .line 969
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object p1

    .line 973
    if-ne p1, v1, :cond_3b

    .line 974
    .line 975
    goto :goto_27

    .line 976
    :cond_3b
    :goto_26
    sget-object v1, Lef/C;->a:Lef/C;

    .line 977
    .line 978
    :goto_27
    return-object v1

    .line 979
    :pswitch_9
    instance-of v0, p2, LHf/X;

    .line 980
    .line 981
    if-eqz v0, :cond_3c

    .line 982
    .line 983
    move-object v0, p2

    .line 984
    check-cast v0, LHf/X;

    .line 985
    .line 986
    iget v1, v0, LHf/X;->b:I

    .line 987
    .line 988
    const/high16 v2, -0x80000000

    .line 989
    .line 990
    and-int v3, v1, v2

    .line 991
    .line 992
    if-eqz v3, :cond_3c

    .line 993
    .line 994
    sub-int/2addr v1, v2

    .line 995
    iput v1, v0, LHf/X;->b:I

    .line 996
    .line 997
    goto :goto_28

    .line 998
    :cond_3c
    new-instance v0, LHf/X;

    .line 999
    .line 1000
    invoke-direct {v0, p0, p2}, LHf/X;-><init>(LHf/f;Ljf/c;)V

    .line 1001
    .line 1002
    .line 1003
    :goto_28
    iget-object p2, v0, LHf/X;->a:Ljava/lang/Object;

    .line 1004
    .line 1005
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 1006
    .line 1007
    iget v2, v0, LHf/X;->b:I

    .line 1008
    .line 1009
    const/4 v3, 0x1

    .line 1010
    if-eqz v2, :cond_3e

    .line 1011
    .line 1012
    if-ne v2, v3, :cond_3d

    .line 1013
    .line 1014
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_29

    .line 1018
    :cond_3d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 1019
    .line 1020
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1021
    .line 1022
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    throw p1

    .line 1026
    :cond_3e
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    if-eqz p1, :cond_3f

    .line 1030
    .line 1031
    iput v3, v0, LHf/X;->b:I

    .line 1032
    .line 1033
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 1034
    .line 1035
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object p1

    .line 1039
    if-ne p1, v1, :cond_3f

    .line 1040
    .line 1041
    goto :goto_2a

    .line 1042
    :cond_3f
    :goto_29
    sget-object v1, Lef/C;->a:Lef/C;

    .line 1043
    .line 1044
    :goto_2a
    return-object v1

    .line 1045
    :pswitch_a
    instance-of v0, p2, LHf/e;

    .line 1046
    .line 1047
    if-eqz v0, :cond_40

    .line 1048
    .line 1049
    move-object v0, p2

    .line 1050
    check-cast v0, LHf/e;

    .line 1051
    .line 1052
    iget v1, v0, LHf/e;->c:I

    .line 1053
    .line 1054
    const/high16 v2, -0x80000000

    .line 1055
    .line 1056
    and-int v3, v1, v2

    .line 1057
    .line 1058
    if-eqz v3, :cond_40

    .line 1059
    .line 1060
    sub-int/2addr v1, v2

    .line 1061
    iput v1, v0, LHf/e;->c:I

    .line 1062
    .line 1063
    goto :goto_2b

    .line 1064
    :cond_40
    new-instance v0, LHf/e;

    .line 1065
    .line 1066
    invoke-direct {v0, p0, p2}, LHf/e;-><init>(LHf/f;Ljf/c;)V

    .line 1067
    .line 1068
    .line 1069
    :goto_2b
    iget-object p2, v0, LHf/e;->a:Ljava/lang/Object;

    .line 1070
    .line 1071
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 1072
    .line 1073
    iget v2, v0, LHf/e;->c:I

    .line 1074
    .line 1075
    const/4 v3, 0x1

    .line 1076
    if-eqz v2, :cond_42

    .line 1077
    .line 1078
    if-ne v2, v3, :cond_41

    .line 1079
    .line 1080
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_2c

    .line 1084
    :cond_41
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 1085
    .line 1086
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 1087
    .line 1088
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    throw p1

    .line 1092
    :cond_42
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 1096
    .line 1097
    .line 1098
    move-result-object p2

    .line 1099
    invoke-static {p2}, LEf/H;->p(Ljf/h;)V

    .line 1100
    .line 1101
    .line 1102
    iput v3, v0, LHf/e;->c:I

    .line 1103
    .line 1104
    iget-object p2, p0, LHf/f;->b:LHf/m;

    .line 1105
    .line 1106
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object p1

    .line 1110
    if-ne p1, v1, :cond_43

    .line 1111
    .line 1112
    goto :goto_2d

    .line 1113
    :cond_43
    :goto_2c
    sget-object v1, Lef/C;->a:Lef/C;

    .line 1114
    .line 1115
    :goto_2d
    return-object v1

    .line 1116
    nop

    .line 1117
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
