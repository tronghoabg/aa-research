.class public final synthetic Lfd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfd/H;


# direct methods
.method public synthetic constructor <init>(Lfd/H;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfd/c;->a:I

    iput-object p1, p0, Lfd/c;->b:Lfd/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 6

    .line 1
    iget v0, p0, Lfd/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 33
    .line 34
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Lfd/g;

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {v0, v1, p1}, Lfd/H;->c(Ljava/lang/String;Lfd/g;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 59
    .line 60
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 61
    .line 62
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast p1, Ljava/util/List;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 73
    .line 74
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    const/4 v2, 0x1

    .line 80
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 85
    .line 86
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    check-cast v2, Ljava/util/List;

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 97
    .line 98
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    check-cast p1, Lfd/g;

    .line 102
    .line 103
    :try_start_1
    iget-object p1, v0, Lfd/H;->b:La9/b;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string p1, "list"

    .line 109
    .line 110
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 116
    .line 117
    .line 118
    new-instance v3, Ljava/io/ObjectOutputStream;

    .line 119
    .line 120
    invoke-direct {v3, p1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->flush()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const/4 v2, 0x0

    .line 134
    invoke-static {p1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v2, "encodeToString(...)"

    .line 139
    .line 140
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

    .line 144
    .line 145
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance v2, Lfd/G;

    .line 150
    .line 151
    const/4 v3, 0x0

    .line 152
    invoke-direct {v2, v0, v1, p1, v3}, Lfd/G;-><init>(Lfd/H;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v2}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    goto :goto_1

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    move-object p1, v0

    .line 165
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    :goto_1
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_1
    iget-object v2, p0, Lfd/c;->b:Lfd/H;

    .line 174
    .line 175
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 176
    .line 177
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    check-cast p1, Ljava/util/List;

    .line 181
    .line 182
    const/4 v0, 0x0

    .line 183
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 188
    .line 189
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    move-object v1, v0

    .line 193
    check-cast v1, Ljava/lang/String;

    .line 194
    .line 195
    const/4 v0, 0x1

    .line 196
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const-string v3, "null cannot be cast to non-null type kotlin.Double"

    .line 201
    .line 202
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    check-cast v0, Ljava/lang/Double;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 208
    .line 209
    .line 210
    move-result-wide v3

    .line 211
    const/4 v0, 0x2

    .line 212
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const-string v0, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 217
    .line 218
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    check-cast p1, Lfd/g;

    .line 222
    .line 223
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance v0, Lfd/C;

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    invoke-direct/range {v0 .. v5}, Lfd/C;-><init>(Ljava/lang/String;Lfd/H;DLjf/c;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v0}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    const/4 p1, 0x0

    .line 236
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 240
    goto :goto_2

    .line 241
    :catchall_2
    move-exception v0

    .line 242
    move-object p1, v0

    .line 243
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    :goto_2
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_2
    iget-object v2, p0, Lfd/c;->b:Lfd/H;

    .line 252
    .line 253
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 254
    .line 255
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    check-cast p1, Ljava/util/List;

    .line 259
    .line 260
    const/4 v0, 0x0

    .line 261
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 266
    .line 267
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    move-object v1, v0

    .line 271
    check-cast v1, Ljava/lang/String;

    .line 272
    .line 273
    const/4 v0, 0x1

    .line 274
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    instance-of v3, v0, Ljava/lang/Integer;

    .line 279
    .line 280
    if-eqz v3, :cond_0

    .line 281
    .line 282
    check-cast v0, Ljava/lang/Number;

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    int-to-long v3, v0

    .line 289
    goto :goto_3

    .line 290
    :cond_0
    const-string v3, "null cannot be cast to non-null type kotlin.Long"

    .line 291
    .line 292
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    check-cast v0, Ljava/lang/Long;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 298
    .line 299
    .line 300
    move-result-wide v3

    .line 301
    :goto_3
    const/4 v0, 0x2

    .line 302
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    const-string v0, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 307
    .line 308
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    check-cast p1, Lfd/g;

    .line 312
    .line 313
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    new-instance v0, Lfd/E;

    .line 317
    .line 318
    const/4 v5, 0x0

    .line 319
    invoke-direct/range {v0 .. v5}, Lfd/E;-><init>(Ljava/lang/String;Lfd/H;JLjf/c;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v0}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    const/4 p1, 0x0

    .line 326
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 330
    goto :goto_4

    .line 331
    :catchall_3
    move-exception v0

    .line 332
    move-object p1, v0

    .line 333
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    :goto_4
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :pswitch_3
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 342
    .line 343
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 344
    .line 345
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    check-cast p1, Ljava/util/List;

    .line 349
    .line 350
    const/4 v1, 0x0

    .line 351
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 356
    .line 357
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    check-cast v1, Ljava/lang/String;

    .line 361
    .line 362
    const/4 v3, 0x1

    .line 363
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    check-cast v3, Ljava/lang/String;

    .line 371
    .line 372
    const/4 v2, 0x2

    .line 373
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 378
    .line 379
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    check-cast p1, Lfd/g;

    .line 383
    .line 384
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance p1, Lfd/F;

    .line 388
    .line 389
    const/4 v2, 0x0

    .line 390
    invoke-direct {p1, v0, v1, v3, v2}, Lfd/F;-><init>(Lfd/H;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

    .line 391
    .line 392
    .line 393
    invoke-static {p1}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    invoke-static {v2}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 400
    goto :goto_5

    .line 401
    :catchall_4
    move-exception v0

    .line 402
    move-object p1, v0

    .line 403
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    :goto_5
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :pswitch_4
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 412
    .line 413
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 414
    .line 415
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    check-cast p1, Ljava/util/List;

    .line 419
    .line 420
    const/4 v1, 0x0

    .line 421
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, Ljava/util/List;

    .line 426
    .line 427
    const/4 v2, 0x1

    .line 428
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 433
    .line 434
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    check-cast p1, Lfd/g;

    .line 438
    .line 439
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    new-instance p1, Lfd/t;

    .line 443
    .line 444
    const/4 v2, 0x0

    .line 445
    invoke-direct {p1, v0, v1, v2}, Lfd/t;-><init>(Lfd/H;Ljava/util/List;Ljf/c;)V

    .line 446
    .line 447
    .line 448
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 449
    .line 450
    invoke-static {v0, p1}, LEf/H;->I(Ljf/h;Ltf/p;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    check-cast p1, Ljava/util/Map;

    .line 455
    .line 456
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    check-cast p1, Ljava/lang/Iterable;

    .line 461
    .line 462
    invoke-static {p1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 470
    goto :goto_6

    .line 471
    :catchall_5
    move-exception v0

    .line 472
    move-object p1, v0

    .line 473
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    :goto_6
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_5
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 482
    .line 483
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 484
    .line 485
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    check-cast p1, Ljava/util/List;

    .line 489
    .line 490
    const/4 v1, 0x0

    .line 491
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    check-cast v1, Ljava/util/List;

    .line 496
    .line 497
    const/4 v2, 0x1

    .line 498
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 503
    .line 504
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    check-cast p1, Lfd/g;

    .line 508
    .line 509
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    new-instance p1, Lfd/k;

    .line 513
    .line 514
    const/4 v2, 0x0

    .line 515
    invoke-direct {p1, v0, v1, v2}, Lfd/k;-><init>(Lfd/H;Ljava/util/List;Ljf/c;)V

    .line 516
    .line 517
    .line 518
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 519
    .line 520
    invoke-static {v0, p1}, LEf/H;->I(Ljf/h;Ltf/p;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    check-cast p1, Ljava/util/Map;

    .line 525
    .line 526
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 530
    goto :goto_7

    .line 531
    :catchall_6
    move-exception v0

    .line 532
    move-object p1, v0

    .line 533
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    :goto_7
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :pswitch_6
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 542
    .line 543
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 544
    .line 545
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    check-cast p1, Ljava/util/List;

    .line 549
    .line 550
    const/4 v1, 0x0

    .line 551
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    check-cast v1, Ljava/util/List;

    .line 556
    .line 557
    const/4 v2, 0x1

    .line 558
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 563
    .line 564
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    check-cast p1, Lfd/g;

    .line 568
    .line 569
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    new-instance p1, Lfd/i;

    .line 573
    .line 574
    const/4 v2, 0x0

    .line 575
    invoke-direct {p1, v0, v1, v2}, Lfd/i;-><init>(Lfd/H;Ljava/util/List;Ljf/c;)V

    .line 576
    .line 577
    .line 578
    invoke-static {p1}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    invoke-static {v2}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 585
    goto :goto_8

    .line 586
    :catchall_7
    move-exception v0

    .line 587
    move-object p1, v0

    .line 588
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    :goto_8
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    return-void

    .line 596
    :pswitch_7
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 597
    .line 598
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 599
    .line 600
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    check-cast p1, Ljava/util/List;

    .line 604
    .line 605
    const/4 v1, 0x0

    .line 606
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 611
    .line 612
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    check-cast v1, Ljava/lang/String;

    .line 616
    .line 617
    const/4 v2, 0x1

    .line 618
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 623
    .line 624
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    check-cast v2, Ljava/lang/Boolean;

    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    const/4 v3, 0x2

    .line 634
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object p1

    .line 638
    const-string v3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 639
    .line 640
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    check-cast p1, Lfd/g;

    .line 644
    .line 645
    :try_start_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    new-instance p1, Lfd/A;

    .line 649
    .line 650
    const/4 v3, 0x0

    .line 651
    invoke-direct {p1, v1, v0, v2, v3}, Lfd/A;-><init>(Ljava/lang/String;Lfd/H;ZLjf/c;)V

    .line 652
    .line 653
    .line 654
    invoke-static {p1}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 661
    goto :goto_9

    .line 662
    :catchall_8
    move-exception v0

    .line 663
    move-object p1, v0

    .line 664
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object p1

    .line 668
    :goto_9
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    return-void

    .line 672
    :pswitch_8
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 673
    .line 674
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 675
    .line 676
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    check-cast p1, Ljava/util/List;

    .line 680
    .line 681
    const/4 v1, 0x0

    .line 682
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 687
    .line 688
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    check-cast v1, Ljava/lang/String;

    .line 692
    .line 693
    const/4 v2, 0x1

    .line 694
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object p1

    .line 698
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 699
    .line 700
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    check-cast p1, Lfd/g;

    .line 704
    .line 705
    :try_start_9
    invoke-virtual {v0, v1, p1}, Lfd/H;->c(Ljava/lang/String;Lfd/g;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object p1

    .line 709
    invoke-virtual {v0, p1}, Lfd/H;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object p1

    .line 713
    check-cast p1, Ljava/util/List;

    .line 714
    .line 715
    if-eqz p1, :cond_2

    .line 716
    .line 717
    check-cast p1, Ljava/lang/Iterable;

    .line 718
    .line 719
    new-instance v0, Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 722
    .line 723
    .line 724
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 725
    .line 726
    .line 727
    move-result-object p1

    .line 728
    :cond_1
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    if-eqz v1, :cond_3

    .line 733
    .line 734
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    instance-of v2, v1, Ljava/lang/String;

    .line 739
    .line 740
    if-eqz v2, :cond_1

    .line 741
    .line 742
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    goto :goto_a

    .line 746
    :cond_2
    const/4 v0, 0x0

    .line 747
    :cond_3
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 748
    .line 749
    .line 750
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 751
    goto :goto_b

    .line 752
    :catchall_9
    move-exception v0

    .line 753
    move-object p1, v0

    .line 754
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 755
    .line 756
    .line 757
    move-result-object p1

    .line 758
    :goto_b
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    return-void

    .line 762
    :pswitch_9
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 763
    .line 764
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 765
    .line 766
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    check-cast p1, Ljava/util/List;

    .line 770
    .line 771
    const/4 v1, 0x0

    .line 772
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 777
    .line 778
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    check-cast v1, Ljava/lang/String;

    .line 782
    .line 783
    const/4 v2, 0x1

    .line 784
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 789
    .line 790
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    check-cast p1, Lfd/g;

    .line 794
    .line 795
    :try_start_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    new-instance p1, Lkotlin/jvm/internal/G;

    .line 799
    .line 800
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 801
    .line 802
    .line 803
    new-instance v2, Lfd/s;

    .line 804
    .line 805
    const/4 v3, 0x0

    .line 806
    invoke-direct {v2, v1, v0, p1, v3}, Lfd/s;-><init>(Ljava/lang/String;Lfd/H;Lkotlin/jvm/internal/G;Ljf/c;)V

    .line 807
    .line 808
    .line 809
    invoke-static {v2}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast p1, Ljava/lang/Long;

    .line 815
    .line 816
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 820
    goto :goto_c

    .line 821
    :catchall_a
    move-exception v0

    .line 822
    move-object p1, v0

    .line 823
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object p1

    .line 827
    :goto_c
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    return-void

    .line 831
    :pswitch_a
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 832
    .line 833
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 834
    .line 835
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    check-cast p1, Ljava/util/List;

    .line 839
    .line 840
    const/4 v1, 0x0

    .line 841
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 846
    .line 847
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    check-cast v1, Ljava/lang/String;

    .line 851
    .line 852
    const/4 v2, 0x1

    .line 853
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object p1

    .line 857
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 858
    .line 859
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    check-cast p1, Lfd/g;

    .line 863
    .line 864
    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    new-instance p1, Lkotlin/jvm/internal/G;

    .line 868
    .line 869
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 870
    .line 871
    .line 872
    new-instance v2, Lfd/q;

    .line 873
    .line 874
    const/4 v3, 0x0

    .line 875
    invoke-direct {v2, v1, v0, p1, v3}, Lfd/q;-><init>(Ljava/lang/String;Lfd/H;Lkotlin/jvm/internal/G;Ljf/c;)V

    .line 876
    .line 877
    .line 878
    invoke-static {v2}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast p1, Ljava/lang/Double;

    .line 884
    .line 885
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 886
    .line 887
    .line 888
    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 889
    goto :goto_d

    .line 890
    :catchall_b
    move-exception v0

    .line 891
    move-object p1, v0

    .line 892
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 893
    .line 894
    .line 895
    move-result-object p1

    .line 896
    :goto_d
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    return-void

    .line 900
    :pswitch_b
    iget-object v0, p0, Lfd/c;->b:Lfd/H;

    .line 901
    .line 902
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 903
    .line 904
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    check-cast p1, Ljava/util/List;

    .line 908
    .line 909
    const/4 v1, 0x0

    .line 910
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 915
    .line 916
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    check-cast v1, Ljava/lang/String;

    .line 920
    .line 921
    const/4 v2, 0x1

    .line 922
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object p1

    .line 926
    const-string v2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions"

    .line 927
    .line 928
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    check-cast p1, Lfd/g;

    .line 932
    .line 933
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    new-instance p1, Lkotlin/jvm/internal/G;

    .line 937
    .line 938
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 939
    .line 940
    .line 941
    new-instance v2, Lfd/o;

    .line 942
    .line 943
    const/4 v3, 0x0

    .line 944
    invoke-direct {v2, v1, v0, p1, v3}, Lfd/o;-><init>(Ljava/lang/String;Lfd/H;Lkotlin/jvm/internal/G;Ljf/c;)V

    .line 945
    .line 946
    .line 947
    invoke-static {v2}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast p1, Ljava/lang/Boolean;

    .line 953
    .line 954
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 955
    .line 956
    .line 957
    move-result-object p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 958
    goto :goto_e

    .line 959
    :catchall_c
    move-exception v0

    .line 960
    move-object p1, v0

    .line 961
    invoke-static {p1}, Lka/e0;->f(Ljava/lang/Throwable;)Ljava/util/List;

    .line 962
    .line 963
    .line 964
    move-result-object p1

    .line 965
    :goto_e
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    return-void

    .line 969
    :pswitch_data_0
    .packed-switch 0x0
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
