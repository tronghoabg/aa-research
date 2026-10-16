.class public final synthetic Lk2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/h;
.implements LQ1/c;
.implements Luc/c;
.implements Luc/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk2/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lk2/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lk2/a0;

    .line 2
    .line 3
    iget-object p1, p1, Lk2/a0;->b:LZ1/f;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lk2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN1/O;

    .line 7
    .line 8
    iget p1, p1, LN1/O;->c:I

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Lk2/F;

    .line 16
    .line 17
    invoke-interface {p1}, Lk2/F;->j()Lk2/n0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lk2/c;

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-direct {v0, v1}, Lk2/c;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Lk2/n0;->b:Ll8/e0;

    .line 28
    .line 29
    invoke-static {p1, v0}, Ll8/s;->v(Ljava/util/List;Lk8/h;)Ljava/util/AbstractList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_1
    check-cast p1, Ls2/m;

    .line 39
    .line 40
    invoke-interface {p1}, Ls2/m;->h()Ls2/m;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v0, "channel-error"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, p0, Lk2/c;->a:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    instance-of v6, p1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le v0, v5, :cond_0

    .line 26
    .line 27
    new-instance v0, Lkd/a;

    .line 28
    .line 29
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 57
    .line 58
    .line 59
    sget p1, Lkd/g;->e:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget p1, Lkd/g;->e:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance\'."

    .line 66
    .line 67
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget p1, Lkd/g;->e:I

    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_1
    instance-of v6, p1, Ljava/util/List;

    .line 74
    .line 75
    if-eqz v6, :cond_3

    .line 76
    .line 77
    check-cast p1, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-le v0, v5, :cond_2

    .line 84
    .line 85
    new-instance v0, Lkd/a;

    .line 86
    .line 87
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast v1, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 115
    .line 116
    .line 117
    sget p1, Lkd/g;->e:I

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    sget p1, Lkd/g;->e:I

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance\'."

    .line 124
    .line 125
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget p1, Lkd/g;->e:I

    .line 129
    .line 130
    :goto_1
    return-void

    .line 131
    :pswitch_2
    instance-of v6, p1, Ljava/util/List;

    .line 132
    .line 133
    if-eqz v6, :cond_5

    .line 134
    .line 135
    check-cast p1, Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-le v0, v5, :cond_4

    .line 142
    .line 143
    new-instance v0, Lkd/a;

    .line 144
    .line 145
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast v1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    check-cast v4, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 173
    .line 174
    .line 175
    sget p1, Lkd/g;->e:I

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_4
    sget p1, Lkd/g;->e:I

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance\'."

    .line 182
    .line 183
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sget p1, Lkd/g;->e:I

    .line 187
    .line 188
    :goto_2
    return-void

    .line 189
    :pswitch_3
    instance-of v6, p1, Ljava/util/List;

    .line 190
    .line 191
    if-eqz v6, :cond_7

    .line 192
    .line 193
    check-cast p1, Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-le v0, v5, :cond_6

    .line 200
    .line 201
    new-instance v0, Lkd/a;

    .line 202
    .line 203
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast v4, Ljava/lang/String;

    .line 220
    .line 221
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 231
    .line 232
    .line 233
    sget p1, Lkd/g;->e:I

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    sget p1, Lkd/g;->e:I

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance\'."

    .line 240
    .line 241
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    sget p1, Lkd/g;->e:I

    .line 245
    .line 246
    :goto_3
    return-void

    .line 247
    :pswitch_4
    instance-of v6, p1, Ljava/util/List;

    .line 248
    .line 249
    if-eqz v6, :cond_9

    .line 250
    .line 251
    check-cast p1, Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-le v0, v5, :cond_8

    .line 258
    .line 259
    new-instance v0, Lkd/a;

    .line 260
    .line 261
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    check-cast v1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    check-cast v4, Ljava/lang/String;

    .line 278
    .line 279
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Ljava/lang/String;

    .line 284
    .line 285
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 289
    .line 290
    .line 291
    sget p1, Lkd/g;->e:I

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_8
    sget p1, Lkd/g;->e:I

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance\'."

    .line 298
    .line 299
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    sget p1, Lkd/g;->e:I

    .line 303
    .line 304
    :goto_4
    return-void

    .line 305
    :pswitch_5
    instance-of v6, p1, Ljava/util/List;

    .line 306
    .line 307
    if-eqz v6, :cond_b

    .line 308
    .line 309
    check-cast p1, Ljava/util/List;

    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-le v0, v5, :cond_a

    .line 316
    .line 317
    new-instance v0, Lkd/a;

    .line 318
    .line 319
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    check-cast v1, Ljava/lang/String;

    .line 327
    .line 328
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    check-cast v4, Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    check-cast p1, Ljava/lang/String;

    .line 342
    .line 343
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 347
    .line 348
    .line 349
    sget p1, Lkd/g;->e:I

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_a
    sget p1, Lkd/g;->e:I

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance\'."

    .line 356
    .line 357
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    sget p1, Lkd/g;->e:I

    .line 361
    .line 362
    :goto_5
    return-void

    .line 363
    :pswitch_6
    instance-of v6, p1, Ljava/util/List;

    .line 364
    .line 365
    if-eqz v6, :cond_c

    .line 366
    .line 367
    check-cast p1, Ljava/util/List;

    .line 368
    .line 369
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-le v0, v5, :cond_d

    .line 374
    .line 375
    new-instance v0, Lkd/a;

    .line 376
    .line 377
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    check-cast v1, Ljava/lang/String;

    .line 385
    .line 386
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    check-cast v4, Ljava/lang/String;

    .line 394
    .line 395
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    check-cast p1, Ljava/lang/String;

    .line 400
    .line 401
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 405
    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_c
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage\'."

    .line 409
    .line 410
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    :cond_d
    :goto_6
    return-void

    .line 414
    :pswitch_7
    instance-of v6, p1, Ljava/util/List;

    .line 415
    .line 416
    if-eqz v6, :cond_f

    .line 417
    .line 418
    check-cast p1, Ljava/util/List;

    .line 419
    .line 420
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-le v0, v5, :cond_e

    .line 425
    .line 426
    new-instance v0, Lkd/a;

    .line 427
    .line 428
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    check-cast v1, Ljava/lang/String;

    .line 436
    .line 437
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    check-cast v4, Ljava/lang/String;

    .line 445
    .line 446
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    check-cast p1, Ljava/lang/String;

    .line 451
    .line 452
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 456
    .line 457
    .line 458
    sget p1, Lkd/g;->e:I

    .line 459
    .line 460
    goto :goto_7

    .line 461
    :cond_e
    sget p1, Lkd/g;->e:I

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_f
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance\'."

    .line 465
    .line 466
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    sget p1, Lkd/g;->e:I

    .line 470
    .line 471
    :goto_7
    return-void

    .line 472
    :pswitch_8
    instance-of v6, p1, Ljava/util/List;

    .line 473
    .line 474
    if-eqz v6, :cond_11

    .line 475
    .line 476
    check-cast p1, Ljava/util/List;

    .line 477
    .line 478
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-le v0, v5, :cond_10

    .line 483
    .line 484
    new-instance v0, Lkd/a;

    .line 485
    .line 486
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    check-cast v1, Ljava/lang/String;

    .line 494
    .line 495
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    check-cast v4, Ljava/lang/String;

    .line 503
    .line 504
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    check-cast p1, Ljava/lang/String;

    .line 509
    .line 510
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 514
    .line 515
    .line 516
    sget p1, Lkd/g;->e:I

    .line 517
    .line 518
    goto :goto_8

    .line 519
    :cond_10
    sget p1, Lkd/g;->e:I

    .line 520
    .line 521
    goto :goto_8

    .line 522
    :cond_11
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance\'."

    .line 523
    .line 524
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    sget p1, Lkd/g;->e:I

    .line 528
    .line 529
    :goto_8
    return-void

    .line 530
    :pswitch_9
    instance-of v6, p1, Ljava/util/List;

    .line 531
    .line 532
    if-eqz v6, :cond_13

    .line 533
    .line 534
    check-cast p1, Ljava/util/List;

    .line 535
    .line 536
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-le v0, v5, :cond_12

    .line 541
    .line 542
    new-instance v0, Lkd/a;

    .line 543
    .line 544
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    check-cast v1, Ljava/lang/String;

    .line 552
    .line 553
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    check-cast v4, Ljava/lang/String;

    .line 561
    .line 562
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    check-cast p1, Ljava/lang/String;

    .line 567
    .line 568
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 572
    .line 573
    .line 574
    sget p1, Lkd/g;->e:I

    .line 575
    .line 576
    goto :goto_9

    .line 577
    :cond_12
    sget p1, Lkd/g;->e:I

    .line 578
    .line 579
    goto :goto_9

    .line 580
    :cond_13
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance\'."

    .line 581
    .line 582
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    sget p1, Lkd/g;->e:I

    .line 586
    .line 587
    :goto_9
    return-void

    .line 588
    :pswitch_a
    instance-of v6, p1, Ljava/util/List;

    .line 589
    .line 590
    if-eqz v6, :cond_15

    .line 591
    .line 592
    check-cast p1, Ljava/util/List;

    .line 593
    .line 594
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-le v0, v5, :cond_14

    .line 599
    .line 600
    new-instance v0, Lkd/a;

    .line 601
    .line 602
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    check-cast v1, Ljava/lang/String;

    .line 610
    .line 611
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    check-cast v4, Ljava/lang/String;

    .line 619
    .line 620
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    check-cast p1, Ljava/lang/String;

    .line 625
    .line 626
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 630
    .line 631
    .line 632
    sget p1, Lkd/g;->e:I

    .line 633
    .line 634
    goto :goto_a

    .line 635
    :cond_14
    sget p1, Lkd/g;->e:I

    .line 636
    .line 637
    goto :goto_a

    .line 638
    :cond_15
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance\'."

    .line 639
    .line 640
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    sget p1, Lkd/g;->e:I

    .line 644
    .line 645
    :goto_a
    return-void

    .line 646
    :pswitch_b
    instance-of v6, p1, Ljava/util/List;

    .line 647
    .line 648
    if-eqz v6, :cond_16

    .line 649
    .line 650
    check-cast p1, Ljava/util/List;

    .line 651
    .line 652
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-le v0, v5, :cond_17

    .line 657
    .line 658
    new-instance v0, Lkd/a;

    .line 659
    .line 660
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    check-cast v1, Ljava/lang/String;

    .line 668
    .line 669
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v4

    .line 673
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    check-cast v4, Ljava/lang/String;

    .line 677
    .line 678
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    check-cast p1, Ljava/lang/String;

    .line 683
    .line 684
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 688
    .line 689
    .line 690
    goto :goto_b

    .line 691
    :cond_16
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart\'."

    .line 692
    .line 693
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    :cond_17
    :goto_b
    return-void

    .line 697
    :pswitch_c
    instance-of v6, p1, Ljava/util/List;

    .line 698
    .line 699
    if-eqz v6, :cond_19

    .line 700
    .line 701
    check-cast p1, Ljava/util/List;

    .line 702
    .line 703
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    if-le v0, v5, :cond_18

    .line 708
    .line 709
    new-instance v0, Lkd/a;

    .line 710
    .line 711
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    check-cast v1, Ljava/lang/String;

    .line 719
    .line 720
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v4

    .line 724
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    check-cast v4, Ljava/lang/String;

    .line 728
    .line 729
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object p1

    .line 733
    check-cast p1, Ljava/lang/String;

    .line 734
    .line 735
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 739
    .line 740
    .line 741
    sget p1, Lkd/g;->e:I

    .line 742
    .line 743
    goto :goto_c

    .line 744
    :cond_18
    sget p1, Lkd/g;->e:I

    .line 745
    .line 746
    goto :goto_c

    .line 747
    :cond_19
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance\'."

    .line 748
    .line 749
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    sget p1, Lkd/g;->e:I

    .line 753
    .line 754
    :goto_c
    return-void

    .line 755
    :pswitch_d
    instance-of v6, p1, Ljava/util/List;

    .line 756
    .line 757
    if-eqz v6, :cond_1b

    .line 758
    .line 759
    check-cast p1, Ljava/util/List;

    .line 760
    .line 761
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-le v0, v5, :cond_1a

    .line 766
    .line 767
    new-instance v0, Lkd/a;

    .line 768
    .line 769
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    check-cast v1, Ljava/lang/String;

    .line 777
    .line 778
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    check-cast v4, Ljava/lang/String;

    .line 786
    .line 787
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object p1

    .line 791
    check-cast p1, Ljava/lang/String;

    .line 792
    .line 793
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 797
    .line 798
    .line 799
    sget p1, Lkd/g;->e:I

    .line 800
    .line 801
    goto :goto_d

    .line 802
    :cond_1a
    sget p1, Lkd/g;->e:I

    .line 803
    .line 804
    goto :goto_d

    .line 805
    :cond_1b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance\'."

    .line 806
    .line 807
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    sget p1, Lkd/g;->e:I

    .line 811
    .line 812
    :goto_d
    return-void

    .line 813
    :pswitch_e
    instance-of v6, p1, Ljava/util/List;

    .line 814
    .line 815
    if-eqz v6, :cond_1d

    .line 816
    .line 817
    check-cast p1, Ljava/util/List;

    .line 818
    .line 819
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 820
    .line 821
    .line 822
    move-result v0

    .line 823
    if-le v0, v5, :cond_1c

    .line 824
    .line 825
    new-instance v0, Lkd/a;

    .line 826
    .line 827
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    check-cast v1, Ljava/lang/String;

    .line 835
    .line 836
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v4

    .line 840
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    check-cast v4, Ljava/lang/String;

    .line 844
    .line 845
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object p1

    .line 849
    check-cast p1, Ljava/lang/String;

    .line 850
    .line 851
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 855
    .line 856
    .line 857
    sget p1, Lkd/g;->e:I

    .line 858
    .line 859
    goto :goto_e

    .line 860
    :cond_1c
    sget p1, Lkd/g;->e:I

    .line 861
    .line 862
    goto :goto_e

    .line 863
    :cond_1d
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance\'."

    .line 864
    .line 865
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    sget p1, Lkd/g;->e:I

    .line 869
    .line 870
    :goto_e
    return-void

    .line 871
    :pswitch_f
    instance-of v6, p1, Ljava/util/List;

    .line 872
    .line 873
    if-eqz v6, :cond_1f

    .line 874
    .line 875
    check-cast p1, Ljava/util/List;

    .line 876
    .line 877
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    if-le v0, v5, :cond_1e

    .line 882
    .line 883
    new-instance v0, Lkd/a;

    .line 884
    .line 885
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    check-cast v1, Ljava/lang/String;

    .line 893
    .line 894
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    check-cast v4, Ljava/lang/String;

    .line 902
    .line 903
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object p1

    .line 907
    check-cast p1, Ljava/lang/String;

    .line 908
    .line 909
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 913
    .line 914
    .line 915
    sget p1, Lkd/g;->e:I

    .line 916
    .line 917
    goto :goto_f

    .line 918
    :cond_1e
    sget p1, Lkd/g;->e:I

    .line 919
    .line 920
    goto :goto_f

    .line 921
    :cond_1f
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance\'."

    .line 922
    .line 923
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    sget p1, Lkd/g;->e:I

    .line 927
    .line 928
    :goto_f
    return-void

    .line 929
    :pswitch_10
    instance-of v6, p1, Ljava/util/List;

    .line 930
    .line 931
    if-eqz v6, :cond_21

    .line 932
    .line 933
    check-cast p1, Ljava/util/List;

    .line 934
    .line 935
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 936
    .line 937
    .line 938
    move-result v0

    .line 939
    if-le v0, v5, :cond_20

    .line 940
    .line 941
    new-instance v0, Lkd/a;

    .line 942
    .line 943
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 948
    .line 949
    .line 950
    check-cast v1, Ljava/lang/String;

    .line 951
    .line 952
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    check-cast v4, Ljava/lang/String;

    .line 960
    .line 961
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object p1

    .line 965
    check-cast p1, Ljava/lang/String;

    .line 966
    .line 967
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 971
    .line 972
    .line 973
    sget p1, Lkd/g;->e:I

    .line 974
    .line 975
    goto :goto_10

    .line 976
    :cond_20
    sget p1, Lkd/g;->e:I

    .line 977
    .line 978
    goto :goto_10

    .line 979
    :cond_21
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance\'."

    .line 980
    .line 981
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    sget p1, Lkd/g;->e:I

    .line 985
    .line 986
    :goto_10
    return-void

    .line 987
    :pswitch_11
    instance-of v6, p1, Ljava/util/List;

    .line 988
    .line 989
    if-eqz v6, :cond_23

    .line 990
    .line 991
    check-cast p1, Ljava/util/List;

    .line 992
    .line 993
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 994
    .line 995
    .line 996
    move-result v0

    .line 997
    if-le v0, v5, :cond_22

    .line 998
    .line 999
    new-instance v0, Lkd/a;

    .line 1000
    .line 1001
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    check-cast v1, Ljava/lang/String;

    .line 1009
    .line 1010
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v4

    .line 1014
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    check-cast v4, Ljava/lang/String;

    .line 1018
    .line 1019
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object p1

    .line 1023
    check-cast p1, Ljava/lang/String;

    .line 1024
    .line 1025
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1029
    .line 1030
    .line 1031
    sget p1, Lkd/g;->e:I

    .line 1032
    .line 1033
    goto :goto_11

    .line 1034
    :cond_22
    sget p1, Lkd/g;->e:I

    .line 1035
    .line 1036
    goto :goto_11

    .line 1037
    :cond_23
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance\'."

    .line 1038
    .line 1039
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    sget p1, Lkd/g;->e:I

    .line 1043
    .line 1044
    :goto_11
    return-void

    .line 1045
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_11
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 11

    .line 1
    const-string v0, "null cannot be cast to non-null type android.webkit.PermissionRequest"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, ", Stacktrace: "

    .line 5
    .line 6
    const-string v3, "Cause: "

    .line 7
    .line 8
    const-string v4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    iget v9, p0, Lk2/c;->a:I

    .line 15
    .line 16
    sparse-switch v9, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 34
    .line 35
    :try_start_0
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    instance-of v0, p1, Lkd/a;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    check-cast p1, Lkd/a;

    .line 49
    .line 50
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 53
    .line 54
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 55
    .line 56
    new-array v2, v6, [Ljava/lang/Object;

    .line 57
    .line 58
    aput-object p1, v2, v8

    .line 59
    .line 60
    aput-object v0, v2, v7

    .line 61
    .line 62
    aput-object v1, v2, v5

    .line 63
    .line 64
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :sswitch_0
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    check-cast p1, Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const-string v0, "null cannot be cast to non-null type android.net.http.SslError"

    .line 115
    .line 116
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    check-cast p1, Landroid/net/http/SslError;

    .line 120
    .line 121
    :try_start_1
    invoke-virtual {p1}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_6

    .line 126
    .line 127
    if-eq p1, v7, :cond_5

    .line 128
    .line 129
    if-eq p1, v5, :cond_4

    .line 130
    .line 131
    if-eq p1, v6, :cond_3

    .line 132
    .line 133
    const/4 v0, 0x4

    .line 134
    if-eq p1, v0, :cond_2

    .line 135
    .line 136
    const/4 v0, 0x5

    .line 137
    if-eq p1, v0, :cond_1

    .line 138
    .line 139
    sget-object p1, Lkd/L;->i:Lkd/L;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    sget-object p1, Lkd/L;->f:Lkd/L;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    sget-object p1, Lkd/L;->c:Lkd/L;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_3
    sget-object p1, Lkd/L;->h:Lkd/L;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    sget-object p1, Lkd/L;->e:Lkd/L;

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    sget-object p1, Lkd/L;->d:Lkd/L;

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_6
    sget-object p1, Lkd/L;->g:Lkd/L;

    .line 158
    .line 159
    :goto_1
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    goto :goto_2

    .line 164
    :catchall_1
    move-exception p1

    .line 165
    instance-of v0, p1, Lkd/a;

    .line 166
    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    check-cast p1, Lkd/a;

    .line 170
    .line 171
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 172
    .line 173
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 174
    .line 175
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 176
    .line 177
    new-array v2, v6, [Ljava/lang/Object;

    .line 178
    .line 179
    aput-object p1, v2, v8

    .line 180
    .line 181
    aput-object v0, v2, v7

    .line 182
    .line 183
    aput-object v1, v2, v5

    .line 184
    .line 185
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    goto :goto_2

    .line 190
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    :goto_2
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :sswitch_1
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    check-cast p1, Ljava/util/List;

    .line 230
    .line 231
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    check-cast p1, Landroid/webkit/PermissionRequest;

    .line 239
    .line 240
    :try_start_2
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    .line 241
    .line 242
    .line 243
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 247
    goto :goto_3

    .line 248
    :catchall_2
    move-exception p1

    .line 249
    instance-of v0, p1, Lkd/a;

    .line 250
    .line 251
    if-eqz v0, :cond_8

    .line 252
    .line 253
    check-cast p1, Lkd/a;

    .line 254
    .line 255
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 256
    .line 257
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 258
    .line 259
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 260
    .line 261
    new-array v2, v6, [Ljava/lang/Object;

    .line 262
    .line 263
    aput-object p1, v2, v8

    .line 264
    .line 265
    aput-object v0, v2, v7

    .line 266
    .line 267
    aput-object v1, v2, v5

    .line 268
    .line 269
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    goto :goto_3

    .line 274
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    :goto_3
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :sswitch_2
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    check-cast p1, Ljava/util/List;

    .line 314
    .line 315
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    check-cast v4, Landroid/webkit/PermissionRequest;

    .line 323
    .line 324
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 329
    .line 330
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    check-cast p1, Ljava/util/List;

    .line 334
    .line 335
    :try_start_3
    new-array v0, v8, [Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    check-cast p1, [Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v4, p1}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 350
    goto :goto_4

    .line 351
    :catchall_3
    move-exception p1

    .line 352
    instance-of v0, p1, Lkd/a;

    .line 353
    .line 354
    if-eqz v0, :cond_9

    .line 355
    .line 356
    check-cast p1, Lkd/a;

    .line 357
    .line 358
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 359
    .line 360
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 361
    .line 362
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 363
    .line 364
    new-array v2, v6, [Ljava/lang/Object;

    .line 365
    .line 366
    aput-object p1, v2, v8

    .line 367
    .line 368
    aput-object v0, v2, v7

    .line 369
    .line 370
    aput-object v1, v2, v5

    .line 371
    .line 372
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    goto :goto_4

    .line 377
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    :goto_4
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    return-void

    .line 413
    :sswitch_3
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    check-cast p1, Ljava/util/List;

    .line 417
    .line 418
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const-string v4, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback"

    .line 423
    .line 424
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    check-cast v0, Landroid/webkit/GeolocationPermissions$Callback;

    .line 428
    .line 429
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    const-string v9, "null cannot be cast to non-null type kotlin.String"

    .line 434
    .line 435
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    check-cast v4, Ljava/lang/String;

    .line 439
    .line 440
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    const-string v10, "null cannot be cast to non-null type kotlin.Boolean"

    .line 445
    .line 446
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    check-cast v9, Ljava/lang/Boolean;

    .line 450
    .line 451
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 452
    .line 453
    .line 454
    move-result v9

    .line 455
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    check-cast p1, Ljava/lang/Boolean;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    :try_start_4
    invoke-interface {v0, v4, v9, p1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 469
    .line 470
    .line 471
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 475
    goto :goto_5

    .line 476
    :catchall_4
    move-exception p1

    .line 477
    instance-of v0, p1, Lkd/a;

    .line 478
    .line 479
    if-eqz v0, :cond_a

    .line 480
    .line 481
    check-cast p1, Lkd/a;

    .line 482
    .line 483
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 484
    .line 485
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 486
    .line 487
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 488
    .line 489
    new-array v2, v6, [Ljava/lang/Object;

    .line 490
    .line 491
    aput-object p1, v2, v8

    .line 492
    .line 493
    aput-object v0, v2, v7

    .line 494
    .line 495
    aput-object v1, v2, v5

    .line 496
    .line 497
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    goto :goto_5

    .line 502
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    :goto_5
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    return-void

    .line 538
    :sswitch_4
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    check-cast p1, Ljava/util/List;

    .line 542
    .line 543
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    const-string v0, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback"

    .line 548
    .line 549
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    check-cast p1, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 553
    .line 554
    :try_start_5
    invoke-interface {p1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 555
    .line 556
    .line 557
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 558
    .line 559
    .line 560
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 561
    goto :goto_6

    .line 562
    :catchall_5
    move-exception p1

    .line 563
    instance-of v0, p1, Lkd/a;

    .line 564
    .line 565
    if-eqz v0, :cond_b

    .line 566
    .line 567
    check-cast p1, Lkd/a;

    .line 568
    .line 569
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 570
    .line 571
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 572
    .line 573
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 574
    .line 575
    new-array v2, v6, [Ljava/lang/Object;

    .line 576
    .line 577
    aput-object p1, v2, v8

    .line 578
    .line 579
    aput-object v0, v2, v7

    .line 580
    .line 581
    aput-object v1, v2, v5

    .line 582
    .line 583
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    goto :goto_6

    .line 588
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object p1

    .line 612
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    :goto_6
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    return-void

    .line 624
    :sswitch_5
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    check-cast p1, Ljava/util/List;

    .line 628
    .line 629
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object p1

    .line 633
    const-string v0, "null cannot be cast to non-null type java.security.cert.Certificate"

    .line 634
    .line 635
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    check-cast p1, Ljava/security/cert/Certificate;

    .line 639
    .line 640
    :try_start_6
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 641
    .line 642
    .line 643
    move-result-object p1
    :try_end_6
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 644
    :try_start_7
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    goto :goto_8

    .line 649
    :catchall_6
    move-exception p1

    .line 650
    goto :goto_7

    .line 651
    :catch_0
    move-exception p1

    .line 652
    new-instance v0, Ljava/lang/RuntimeException;

    .line 653
    .line 654
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 655
    .line 656
    .line 657
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 658
    :goto_7
    instance-of v0, p1, Lkd/a;

    .line 659
    .line 660
    if-eqz v0, :cond_c

    .line 661
    .line 662
    check-cast p1, Lkd/a;

    .line 663
    .line 664
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 665
    .line 666
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 667
    .line 668
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 669
    .line 670
    new-array v2, v6, [Ljava/lang/Object;

    .line 671
    .line 672
    aput-object p1, v2, v8

    .line 673
    .line 674
    aput-object v0, v2, v7

    .line 675
    .line 676
    aput-object v1, v2, v5

    .line 677
    .line 678
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    goto :goto_8

    .line 683
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 696
    .line 697
    .line 698
    move-result-object v4

    .line 699
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object p1

    .line 703
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object p1

    .line 707
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 712
    .line 713
    .line 714
    move-result-object p1

    .line 715
    :goto_8
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    return-void

    .line 719
    :sswitch_6
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    check-cast p1, Ljava/util/List;

    .line 723
    .line 724
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object p1

    .line 728
    const-string v0, "null cannot be cast to non-null type android.os.Message"

    .line 729
    .line 730
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    check-cast p1, Landroid/os/Message;

    .line 734
    .line 735
    :try_start_8
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 736
    .line 737
    .line 738
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 739
    .line 740
    .line 741
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 742
    goto :goto_9

    .line 743
    :catchall_7
    move-exception p1

    .line 744
    instance-of v0, p1, Lkd/a;

    .line 745
    .line 746
    if-eqz v0, :cond_d

    .line 747
    .line 748
    check-cast p1, Lkd/a;

    .line 749
    .line 750
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 751
    .line 752
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 753
    .line 754
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 755
    .line 756
    new-array v2, v6, [Ljava/lang/Object;

    .line 757
    .line 758
    aput-object p1, v2, v8

    .line 759
    .line 760
    aput-object v0, v2, v7

    .line 761
    .line 762
    aput-object v1, v2, v5

    .line 763
    .line 764
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 765
    .line 766
    .line 767
    move-result-object p1

    .line 768
    goto :goto_9

    .line 769
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 782
    .line 783
    .line 784
    move-result-object v4

    .line 785
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object p1

    .line 789
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object p1

    .line 793
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object p1

    .line 797
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object p1

    .line 801
    :goto_9
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    return-void

    .line 805
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_6
        0x7 -> :sswitch_5
        0xc -> :sswitch_4
        0x11 -> :sswitch_3
        0x15 -> :sswitch_2
        0x16 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method
