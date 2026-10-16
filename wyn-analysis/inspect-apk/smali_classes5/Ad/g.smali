.class public final synthetic LAd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LAd/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwd/d;)V
    .locals 0

    .line 2
    const/4 p1, 0x6

    iput p1, p0, LAd/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, LAd/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LCd/w0;

    .line 7
    .line 8
    const-string v0, "$this$install"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/a;->a:Lef/p;

    .line 14
    .line 15
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/b;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/b;->a:Lef/p;

    .line 22
    .line 23
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "<set-?>"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p1, LCd/w0;->a:Ljava/lang/String;

    .line 35
    .line 36
    sget-object p1, Lef/C;->a:Lef/C;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    check-cast p1, Lwd/d;

    .line 40
    .line 41
    const-string v0, "$this$HttpClient"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, LCd/z0;->b:LDd/c;

    .line 47
    .line 48
    new-instance v1, Lcom/moloco/sdk/internal/publisher/d;

    .line 49
    .line 50
    const/16 v2, 0x1c

    .line 51
    .line 52
    invoke-direct {v1, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, LCd/q0;->b:LDd/c;

    .line 59
    .line 60
    new-instance v1, Lcom/moloco/sdk/internal/publisher/d;

    .line 61
    .line 62
    const/16 v2, 0x1c

    .line 63
    .line 64
    invoke-direct {v1, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0, v1}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lef/C;->a:Lef/C;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 74
    .line 75
    const-string v0, "<destruct>"

    .line 76
    .line 77
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lkotlinx/serialization/json/b;

    .line 91
    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1}, LYf/H;->a(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 98
    .line 99
    .line 100
    const/16 v0, 0x3a

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :pswitch_2
    check-cast p1, LUf/a;

    .line 114
    .line 115
    const-string v0, "$this$buildSerialDescriptor"

    .line 116
    .line 117
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, LCd/u;

    .line 121
    .line 122
    const/4 v1, 0x7

    .line 123
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 124
    .line 125
    .line 126
    new-instance v1, LXf/l;

    .line 127
    .line 128
    invoke-direct {v1, v0}, LXf/l;-><init>(Ltf/a;)V

    .line 129
    .line 130
    .line 131
    const-string v0, "JsonPrimitive"

    .line 132
    .line 133
    invoke-static {p1, v0, v1}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 134
    .line 135
    .line 136
    new-instance v0, LCd/u;

    .line 137
    .line 138
    const/16 v1, 0x8

    .line 139
    .line 140
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 141
    .line 142
    .line 143
    new-instance v1, LXf/l;

    .line 144
    .line 145
    invoke-direct {v1, v0}, LXf/l;-><init>(Ltf/a;)V

    .line 146
    .line 147
    .line 148
    const-string v0, "JsonNull"

    .line 149
    .line 150
    invoke-static {p1, v0, v1}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, LCd/u;

    .line 154
    .line 155
    const/16 v1, 0x9

    .line 156
    .line 157
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 158
    .line 159
    .line 160
    new-instance v1, LXf/l;

    .line 161
    .line 162
    invoke-direct {v1, v0}, LXf/l;-><init>(Ltf/a;)V

    .line 163
    .line 164
    .line 165
    const-string v0, "JsonLiteral"

    .line 166
    .line 167
    invoke-static {p1, v0, v1}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, LCd/u;

    .line 171
    .line 172
    const/16 v1, 0xa

    .line 173
    .line 174
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 175
    .line 176
    .line 177
    new-instance v1, LXf/l;

    .line 178
    .line 179
    invoke-direct {v1, v0}, LXf/l;-><init>(Ltf/a;)V

    .line 180
    .line 181
    .line 182
    const-string v0, "JsonObject"

    .line 183
    .line 184
    invoke-static {p1, v0, v1}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 185
    .line 186
    .line 187
    new-instance v0, LCd/u;

    .line 188
    .line 189
    const/16 v1, 0xb

    .line 190
    .line 191
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 192
    .line 193
    .line 194
    new-instance v1, LXf/l;

    .line 195
    .line 196
    invoke-direct {v1, v0}, LXf/l;-><init>(Ltf/a;)V

    .line 197
    .line 198
    .line 199
    const-string v0, "JsonArray"

    .line 200
    .line 201
    invoke-static {p1, v0, v1}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 202
    .line 203
    .line 204
    sget-object p1, Lef/C;->a:Lef/C;

    .line 205
    .line 206
    return-object p1

    .line 207
    :pswitch_3
    check-cast p1, Lkotlin/reflect/KClass;

    .line 208
    .line 209
    const-string v0, "it"

    .line 210
    .line 211
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->o0(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const/4 v1, 0x0

    .line 219
    if-nez v0, :cond_1

    .line 220
    .line 221
    invoke-static {p1}, LWf/b0;->h(Lkotlin/reflect/KClass;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_0

    .line 226
    .line 227
    new-instance v0, LSf/d;

    .line 228
    .line 229
    invoke-direct {v0, p1}, LSf/d;-><init>(Lkotlin/reflect/KClass;)V

    .line 230
    .line 231
    .line 232
    goto :goto_0

    .line 233
    :cond_0
    move-object v0, v1

    .line 234
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 235
    .line 236
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :cond_2
    return-object v1

    .line 241
    :pswitch_4
    check-cast p1, Lkotlin/reflect/KClass;

    .line 242
    .line 243
    const-string v0, "it"

    .line 244
    .line 245
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->o0(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    if-nez v0, :cond_4

    .line 253
    .line 254
    invoke-static {p1}, LWf/b0;->h(Lkotlin/reflect/KClass;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_3

    .line 259
    .line 260
    new-instance v0, LSf/d;

    .line 261
    .line 262
    invoke-direct {v0, p1}, LSf/d;-><init>(Lkotlin/reflect/KClass;)V

    .line 263
    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_3
    const/4 v0, 0x0

    .line 267
    :cond_4
    :goto_1
    return-object v0

    .line 268
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 269
    .line 270
    const-string v0, "$this$DelegatingMutableSet"

    .line 271
    .line 272
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {p1}, LA6/c;->l(Ljava/lang/String;)LNd/c;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    return-object p1

    .line 280
    :pswitch_6
    check-cast p1, LNd/c;

    .line 281
    .line 282
    const-string v0, "$this$DelegatingMutableSet"

    .line 283
    .line 284
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object p1, p1, LNd/c;->a:Ljava/lang/String;

    .line 288
    .line 289
    return-object p1

    .line 290
    :pswitch_7
    check-cast p1, Ljava/util/Map$Entry;

    .line 291
    .line 292
    const-string v0, "$this$DelegatingMutableSet"

    .line 293
    .line 294
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    new-instance v0, LNd/f;

    .line 298
    .line 299
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v1}, LA6/c;->l(Ljava/lang/String;)LNd/c;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-direct {v0, v1, p1}, LNd/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_8
    check-cast p1, Ljava/util/Map$Entry;

    .line 318
    .line 319
    const-string v0, "$this$DelegatingMutableSet"

    .line 320
    .line 321
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-instance v0, LNd/f;

    .line 325
    .line 326
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, LNd/c;

    .line 331
    .line 332
    iget-object v1, v1, LNd/c;->a:Ljava/lang/String;

    .line 333
    .line 334
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-direct {v0, v1, p1}, LNd/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_9
    check-cast p1, LJd/s;

    .line 343
    .line 344
    const-string v0, "it"

    .line 345
    .line 346
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object p1, p1, LJd/s;->a:Ljava/lang/String;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    return-object p1

    .line 360
    :pswitch_a
    check-cast p1, Ljava/lang/CharSequence;

    .line 361
    .line 362
    const-string v0, "it"

    .line 363
    .line 364
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    return-object p1

    .line 376
    :pswitch_b
    check-cast p1, Lef/k;

    .line 377
    .line 378
    const-string v0, "it"

    .line 379
    .line 380
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    iget-object v0, p1, Lef/k;->a:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Ljava/lang/String;

    .line 386
    .line 387
    iget-object p1, p1, Lef/k;->b:Ljava/lang/Object;

    .line 388
    .line 389
    if-nez p1, :cond_5

    .line 390
    .line 391
    goto :goto_2

    .line 392
    :cond_5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    new-instance v1, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    const/16 v0, 0x3d

    .line 405
    .line 406
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    :goto_2
    return-object v0

    .line 417
    :pswitch_c
    check-cast p1, Ljf/f;

    .line 418
    .line 419
    instance-of v0, p1, LEf/A;

    .line 420
    .line 421
    if-eqz v0, :cond_6

    .line 422
    .line 423
    check-cast p1, LEf/A;

    .line 424
    .line 425
    goto :goto_3

    .line 426
    :cond_6
    const/4 p1, 0x0

    .line 427
    :goto_3
    return-object p1

    .line 428
    :pswitch_d
    check-cast p1, LDd/b;

    .line 429
    .line 430
    const-string v0, "$this$createClientPlugin"

    .line 431
    .line 432
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    iget-object v0, p1, LDd/b;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, LCd/w0;

    .line 438
    .line 439
    iget-object v0, v0, LCd/w0;->a:Ljava/lang/String;

    .line 440
    .line 441
    new-instance v1, LCd/y0;

    .line 442
    .line 443
    const/4 v2, 0x0

    .line 444
    invoke-direct {v1, v0, v2}, LCd/y0;-><init>(Ljava/lang/String;Ljf/c;)V

    .line 445
    .line 446
    .line 447
    sget-object v0, LDd/g;->b:LDd/g;

    .line 448
    .line 449
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 450
    .line 451
    .line 452
    sget-object p1, Lef/C;->a:Lef/C;

    .line 453
    .line 454
    return-object p1

    .line 455
    :pswitch_e
    check-cast p1, LDd/b;

    .line 456
    .line 457
    const-string v0, "$this$createClientPlugin"

    .line 458
    .line 459
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    iget-object v0, p1, LDd/b;->b:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, LCd/n0;

    .line 465
    .line 466
    iget-object v1, v0, LCd/n0;->a:Ljava/lang/Long;

    .line 467
    .line 468
    iget-object v2, v0, LCd/n0;->b:Ljava/lang/Long;

    .line 469
    .line 470
    iget-object v0, v0, LCd/n0;->c:Ljava/lang/Long;

    .line 471
    .line 472
    sget-object v3, LDd/g;->c:LDd/g;

    .line 473
    .line 474
    new-instance v4, LCd/r;

    .line 475
    .line 476
    const/4 v5, 0x0

    .line 477
    invoke-direct {v4, v1, v2, v0, v5}, LCd/r;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljf/c;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {p1, v3, v4}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 481
    .line 482
    .line 483
    sget-object p1, Lef/C;->a:Lef/C;

    .line 484
    .line 485
    return-object p1

    .line 486
    :pswitch_f
    move-object v6, p1

    .line 487
    check-cast v6, LDd/b;

    .line 488
    .line 489
    const-string p1, "$this$createClientPlugin"

    .line 490
    .line 491
    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    iget-object p1, v6, LDd/b;->b:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast p1, LCd/Y;

    .line 497
    .line 498
    iget-object v1, p1, LCd/Y;->a:LCd/W;

    .line 499
    .line 500
    const/4 v0, 0x0

    .line 501
    if-eqz v1, :cond_9

    .line 502
    .line 503
    iget-object v2, p1, LCd/Y;->b:LCd/V;

    .line 504
    .line 505
    if-eqz v2, :cond_8

    .line 506
    .line 507
    iget-object v4, p1, LCd/Y;->c:LBf/s;

    .line 508
    .line 509
    if-eqz v4, :cond_7

    .line 510
    .line 511
    iget-object v7, p1, LCd/Y;->d:LCd/X;

    .line 512
    .line 513
    iget v3, p1, LCd/Y;->f:I

    .line 514
    .line 515
    iget-object v5, p1, LCd/Y;->e:Ltf/p;

    .line 516
    .line 517
    sget-object p1, LDd/g;->c:LDd/g;

    .line 518
    .line 519
    new-instance v0, LCd/a0;

    .line 520
    .line 521
    const/4 v8, 0x0

    .line 522
    invoke-direct/range {v0 .. v8}, LCd/a0;-><init>(Ltf/q;Ltf/q;ILtf/p;Ltf/p;LDd/b;LCd/X;Ljf/c;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v6, p1, v0}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 526
    .line 527
    .line 528
    sget-object p1, Lef/C;->a:Lef/C;

    .line 529
    .line 530
    return-object p1

    .line 531
    :cond_7
    const-string p1, "delayMillis"

    .line 532
    .line 533
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    throw v0

    .line 537
    :cond_8
    const-string p1, "shouldRetryOnException"

    .line 538
    .line 539
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    throw v0

    .line 543
    :cond_9
    const-string p1, "shouldRetry"

    .line 544
    .line 545
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    throw v0

    .line 549
    :pswitch_10
    check-cast p1, LDd/b;

    .line 550
    .line 551
    const-string v0, "$this$createClientPlugin"

    .line 552
    .line 553
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    sget-object v0, LCd/b;->g:LCd/b;

    .line 557
    .line 558
    new-instance v1, LCd/a;

    .line 559
    .line 560
    const/4 v2, 0x0

    .line 561
    const/4 v3, 0x4

    .line 562
    invoke-direct {v1, p1, v2, v3}, LCd/a;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 566
    .line 567
    .line 568
    sget-object p1, Lef/C;->a:Lef/C;

    .line 569
    .line 570
    return-object p1

    .line 571
    :pswitch_11
    check-cast p1, LDd/b;

    .line 572
    .line 573
    const-string v0, "$this$createClientPlugin"

    .line 574
    .line 575
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    iget-object v0, p1, LDd/b;->b:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, LCd/O;

    .line 581
    .line 582
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    sget-object v0, LDd/g;->c:LDd/g;

    .line 586
    .line 587
    new-instance v1, LCd/a;

    .line 588
    .line 589
    const/4 v2, 0x0

    .line 590
    const/4 v3, 0x3

    .line 591
    invoke-direct {v1, p1, v2, v3}, LCd/a;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 595
    .line 596
    .line 597
    sget-object p1, Lef/C;->a:Lef/C;

    .line 598
    .line 599
    return-object p1

    .line 600
    :pswitch_12
    check-cast p1, LDd/b;

    .line 601
    .line 602
    const-string v0, "$this$createClientPlugin"

    .line 603
    .line 604
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    iget-object v0, p1, LDd/b;->b:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v0, LCd/I;

    .line 610
    .line 611
    iget-object v1, v0, LCd/I;->b:Ljava/util/LinkedHashMap;

    .line 612
    .line 613
    invoke-static {v1}, Lff/A;->W(Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    check-cast v1, Ljava/lang/Iterable;

    .line 618
    .line 619
    new-instance v2, LCd/M;

    .line 620
    .line 621
    const/4 v3, 0x1

    .line 622
    invoke-direct {v2, v3}, LCd/M;-><init>(I)V

    .line 623
    .line 624
    .line 625
    invoke-static {v2, v1}, Lff/o;->M0(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    iget-object v2, v0, LCd/I;->a:Ljava/util/LinkedHashSet;

    .line 630
    .line 631
    new-instance v3, Ljava/util/ArrayList;

    .line 632
    .line 633
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 634
    .line 635
    .line 636
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    if-eqz v4, :cond_b

    .line 645
    .line 646
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    move-object v5, v4

    .line 651
    check-cast v5, Ljava/nio/charset/Charset;

    .line 652
    .line 653
    iget-object v6, v0, LCd/I;->b:Ljava/util/LinkedHashMap;

    .line 654
    .line 655
    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v5

    .line 659
    if-nez v5, :cond_a

    .line 660
    .line 661
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    goto :goto_4

    .line 665
    :cond_b
    new-instance v2, LCd/M;

    .line 666
    .line 667
    const/4 v4, 0x0

    .line 668
    invoke-direct {v2, v4}, LCd/M;-><init>(I)V

    .line 669
    .line 670
    .line 671
    invoke-static {v2, v3}, Lff/o;->M0(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    new-instance v3, Ljava/lang/StringBuilder;

    .line 676
    .line 677
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 678
    .line 679
    .line 680
    move-object v4, v2

    .line 681
    check-cast v4, Ljava/lang/Iterable;

    .line 682
    .line 683
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    const-string v6, ","

    .line 692
    .line 693
    if-eqz v5, :cond_d

    .line 694
    .line 695
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    check-cast v5, Ljava/nio/charset/Charset;

    .line 700
    .line 701
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 702
    .line 703
    .line 704
    move-result v7

    .line 705
    if-lez v7, :cond_c

    .line 706
    .line 707
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    :cond_c
    invoke-static {v5}, Lp7/b;->A(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v5

    .line 714
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    goto :goto_5

    .line 718
    :cond_d
    move-object v4, v1

    .line 719
    check-cast v4, Ljava/lang/Iterable;

    .line 720
    .line 721
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 722
    .line 723
    .line 724
    move-result-object v4

    .line 725
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 726
    .line 727
    .line 728
    move-result v5

    .line 729
    if-eqz v5, :cond_10

    .line 730
    .line 731
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    check-cast v5, Lef/k;

    .line 736
    .line 737
    iget-object v7, v5, Lef/k;->a:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v7, Ljava/nio/charset/Charset;

    .line 740
    .line 741
    iget-object v5, v5, Lef/k;->b:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v5, Ljava/lang/Number;

    .line 744
    .line 745
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 750
    .line 751
    .line 752
    move-result v8

    .line 753
    if-lez v8, :cond_e

    .line 754
    .line 755
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    :cond_e
    float-to-double v8, v5

    .line 759
    const-wide/16 v10, 0x0

    .line 760
    .line 761
    cmpg-double v10, v10, v8

    .line 762
    .line 763
    if-gtz v10, :cond_f

    .line 764
    .line 765
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 766
    .line 767
    cmpg-double v8, v8, v10

    .line 768
    .line 769
    if-gtz v8, :cond_f

    .line 770
    .line 771
    const/16 v8, 0x64

    .line 772
    .line 773
    int-to-float v8, v8

    .line 774
    mul-float/2addr v8, v5

    .line 775
    invoke-static {v8}, Lvf/a;->H(F)I

    .line 776
    .line 777
    .line 778
    move-result v5

    .line 779
    int-to-double v8, v5

    .line 780
    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    .line 781
    .line 782
    div-double/2addr v8, v10

    .line 783
    new-instance v5, Ljava/lang/StringBuilder;

    .line 784
    .line 785
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 786
    .line 787
    .line 788
    invoke-static {v7}, Lp7/b;->A(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v7

    .line 792
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    const-string v7, ";q="

    .line 796
    .line 797
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    goto :goto_6

    .line 811
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 812
    .line 813
    const-string v0, "Check failed."

    .line 814
    .line 815
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    throw p1

    .line 819
    :cond_10
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    iget-object v0, v0, LCd/I;->c:Ljava/nio/charset/Charset;

    .line 824
    .line 825
    if-nez v4, :cond_11

    .line 826
    .line 827
    invoke-static {v0}, Lp7/b;->A(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    :cond_11
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    invoke-static {v2}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    check-cast v2, Ljava/nio/charset/Charset;

    .line 843
    .line 844
    const/4 v4, 0x0

    .line 845
    if-nez v2, :cond_13

    .line 846
    .line 847
    invoke-static {v1}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    check-cast v1, Lef/k;

    .line 852
    .line 853
    if-eqz v1, :cond_12

    .line 854
    .line 855
    iget-object v1, v1, Lef/k;->a:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v1, Ljava/nio/charset/Charset;

    .line 858
    .line 859
    move-object v2, v1

    .line 860
    goto :goto_7

    .line 861
    :cond_12
    move-object v2, v4

    .line 862
    :goto_7
    if-nez v2, :cond_13

    .line 863
    .line 864
    sget-object v2, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 865
    .line 866
    :cond_13
    sget-object v1, LCd/b;->e:LCd/b;

    .line 867
    .line 868
    new-instance v5, LCd/K;

    .line 869
    .line 870
    invoke-direct {v5, v3, v2, v4}, LCd/K;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljf/c;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {p1, v1, v5}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 874
    .line 875
    .line 876
    new-instance v1, LCd/L;

    .line 877
    .line 878
    invoke-direct {v1, v0, v4}, LCd/L;-><init>(Ljava/nio/charset/Charset;Ljf/c;)V

    .line 879
    .line 880
    .line 881
    sget-object v0, LDd/g;->e:LDd/g;

    .line 882
    .line 883
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 884
    .line 885
    .line 886
    sget-object p1, Lef/C;->a:Lef/C;

    .line 887
    .line 888
    return-object p1

    .line 889
    :pswitch_13
    check-cast p1, LDd/b;

    .line 890
    .line 891
    const-string v0, "$this$createClientPlugin"

    .line 892
    .line 893
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    iget-object v0, p1, LDd/b;->b:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v0, LCd/x;

    .line 899
    .line 900
    iget-object v1, v0, LCd/x;->a:Ljava/util/ArrayList;

    .line 901
    .line 902
    invoke-static {v1}, Lff/o;->G0(Ljava/util/List;)Ljava/util/List;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    iget-object v2, v0, LCd/x;->b:Ljava/util/ArrayList;

    .line 907
    .line 908
    invoke-static {v2}, Lff/o;->G0(Ljava/util/List;)Ljava/util/List;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    iget-boolean v0, v0, LCd/x;->c:Z

    .line 913
    .line 914
    sget-object v3, LDd/g;->d:LDd/g;

    .line 915
    .line 916
    new-instance v4, LCd/A;

    .line 917
    .line 918
    const/4 v5, 0x0

    .line 919
    invoke-direct {v4, v0, v5}, LCd/A;-><init>(ZLjf/c;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {p1, v3, v4}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 923
    .line 924
    .line 925
    sget-object v0, LDd/g;->c:LDd/g;

    .line 926
    .line 927
    new-instance v3, LCd/a;

    .line 928
    .line 929
    const/4 v4, 0x2

    .line 930
    invoke-direct {v3, v1, v5, v4}, LCd/a;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {p1, v0, v3}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 934
    .line 935
    .line 936
    sget-object v0, LCd/b;->f:LCd/b;

    .line 937
    .line 938
    new-instance v1, LCd/B;

    .line 939
    .line 940
    const/4 v3, 0x0

    .line 941
    invoke-direct {v1, v2, v5, v3}, LCd/B;-><init>(Ljava/util/List;Ljf/c;I)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 945
    .line 946
    .line 947
    sget-object v0, LCd/b;->d:LCd/b;

    .line 948
    .line 949
    new-instance v1, LCd/B;

    .line 950
    .line 951
    const/4 v3, 0x1

    .line 952
    invoke-direct {v1, v2, v5, v3}, LCd/B;-><init>(Ljava/util/List;Ljf/c;I)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 956
    .line 957
    .line 958
    sget-object p1, Lef/C;->a:Lef/C;

    .line 959
    .line 960
    return-object p1

    .line 961
    :pswitch_14
    check-cast p1, LDd/b;

    .line 962
    .line 963
    const-string v0, "$this$createClientPlugin"

    .line 964
    .line 965
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    iget-object p1, p1, LDd/b;->b:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast p1, LCd/t0;

    .line 971
    .line 972
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    invoke-static {}, LCd/w;->a()Lvg/b;

    .line 976
    .line 977
    .line 978
    move-result-object p1

    .line 979
    const-string v0, "The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses."

    .line 980
    .line 981
    invoke-interface {p1, v0}, Lvg/b;->warn(Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    sget-object p1, Lef/C;->a:Lef/C;

    .line 985
    .line 986
    return-object p1

    .line 987
    :pswitch_15
    check-cast p1, LDd/b;

    .line 988
    .line 989
    const-string v0, "$this$createClientPlugin"

    .line 990
    .line 991
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    iget-object p1, p1, LDd/b;->a:Lwd/c;

    .line 995
    .line 996
    iget-object p1, p1, Lwd/c;->h:LGd/b;

    .line 997
    .line 998
    new-instance v0, LCd/a;

    .line 999
    .line 1000
    const/4 v1, 0x3

    .line 1001
    const/4 v2, 0x0

    .line 1002
    invoke-direct {v0, v1, v2}, LCd/a;-><init>(ILjf/c;)V

    .line 1003
    .line 1004
    .line 1005
    sget-object v1, LGd/b;->g:LD8/a;

    .line 1006
    .line 1007
    invoke-virtual {p1, v1, v0}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 1008
    .line 1009
    .line 1010
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1011
    .line 1012
    return-object p1

    .line 1013
    :pswitch_16
    check-cast p1, LCd/x;

    .line 1014
    .line 1015
    const-string v0, "$this$HttpResponseValidator"

    .line 1016
    .line 1017
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    const/4 v0, 0x0

    .line 1021
    iput-boolean v0, p1, LCd/x;->c:Z

    .line 1022
    .line 1023
    new-instance v0, LCd/l;

    .line 1024
    .line 1025
    const/4 v1, 0x2

    .line 1026
    const/4 v2, 0x0

    .line 1027
    invoke-direct {v0, v1, v2}, Llf/j;-><init>(ILjf/c;)V

    .line 1028
    .line 1029
    .line 1030
    iget-object p1, p1, LCd/x;->a:Ljava/util/ArrayList;

    .line 1031
    .line 1032
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1036
    .line 1037
    return-object p1

    .line 1038
    :pswitch_17
    check-cast p1, LDd/b;

    .line 1039
    .line 1040
    const-string v0, "$this$createClientPlugin"

    .line 1041
    .line 1042
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    sget-object v0, LCd/b;->c:LCd/b;

    .line 1046
    .line 1047
    new-instance v1, LCd/d;

    .line 1048
    .line 1049
    const/4 v2, 0x3

    .line 1050
    const/4 v3, 0x0

    .line 1051
    invoke-direct {v1, v2, v3}, Llf/j;-><init>(ILjf/c;)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 1055
    .line 1056
    .line 1057
    sget-object v0, LCd/b;->b:LCd/b;

    .line 1058
    .line 1059
    new-instance v1, LCd/e;

    .line 1060
    .line 1061
    const/4 v2, 0x2

    .line 1062
    invoke-direct {v1, v2, v3}, Llf/j;-><init>(ILjf/c;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {p1, v0, v1}, LDd/b;->a(LDd/a;Llf/j;)V

    .line 1066
    .line 1067
    .line 1068
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1069
    .line 1070
    return-object p1

    .line 1071
    :pswitch_18
    if-nez p1, :cond_14

    .line 1072
    .line 1073
    const/4 p1, 0x1

    .line 1074
    goto :goto_8

    .line 1075
    :cond_14
    const/4 p1, 0x0

    .line 1076
    :goto_8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1077
    .line 1078
    .line 1079
    move-result-object p1

    .line 1080
    :pswitch_19
    return-object p1

    .line 1081
    :pswitch_1a
    check-cast p1, LAf/k;

    .line 1082
    .line 1083
    const-string v0, "it"

    .line 1084
    .line 1085
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-interface {p1}, LAf/k;->iterator()Ljava/util/Iterator;

    .line 1089
    .line 1090
    .line 1091
    move-result-object p1

    .line 1092
    return-object p1

    .line 1093
    :pswitch_1b
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 1094
    .line 1095
    const-string v0, "<this>"

    .line 1096
    .line 1097
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1101
    .line 1102
    return-object p1

    .line 1103
    :pswitch_1c
    check-cast p1, Ljavax/net/ssl/HttpsURLConnection;

    .line 1104
    .line 1105
    const-string v0, "it"

    .line 1106
    .line 1107
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1111
    .line 1112
    return-object p1

    .line 1113
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
