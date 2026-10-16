.class public final LPc/r;
.super Luc/w;
.source "SourceFile"


# static fields
.field public static final e:LPc/r;

.field public static final f:LPc/r;

.field public static final g:LPc/r;

.field public static final h:LPc/r;

.field public static final i:LPc/r;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LPc/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LPc/r;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LPc/r;->e:LPc/r;

    .line 8
    .line 9
    new-instance v0, LPc/r;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LPc/r;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LPc/r;->f:LPc/r;

    .line 16
    .line 17
    new-instance v0, LPc/r;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, LPc/r;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LPc/r;->g:LPc/r;

    .line 24
    .line 25
    new-instance v0, LPc/r;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, LPc/r;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, LPc/r;->h:LPc/r;

    .line 32
    .line 33
    new-instance v0, LPc/r;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, LPc/r;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LPc/r;->i:LPc/r;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LPc/r;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LPc/r;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    packed-switch p1, :pswitch_data_1

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :pswitch_0
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {p1}, LPc/J;->a(Ljava/util/ArrayList;)LPc/J;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :pswitch_1
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    new-instance p2, LPc/I;

    .line 32
    .line 33
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    iput-object p1, p2, LPc/I;->a:Ljava/lang/String;

    .line 46
    .line 47
    move-object p1, p2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "Nonnull field \"id\" is null."

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :pswitch_2
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {p1}, LPc/H;->a(Ljava/util/ArrayList;)LPc/H;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :pswitch_3
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {p1}, LPc/m;->a(Ljava/util/ArrayList;)LPc/m;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_0
    return-object p1

    .line 79
    :pswitch_4
    const/16 v0, -0x80

    .line 80
    .line 81
    if-eq p1, v0, :cond_1

    .line 82
    .line 83
    invoke-super {p0, p1, p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {p1}, LPc/L;->a(Ljava/util/ArrayList;)LPc/L;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :goto_1
    return-object p1

    .line 99
    :pswitch_5
    packed-switch p1, :pswitch_data_2

    .line 100
    .line 101
    .line 102
    invoke-super {p0, p1, p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    goto :goto_2

    .line 107
    :pswitch_6
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-static {p1}, LPc/O;->a(Ljava/util/ArrayList;)LPc/O;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto :goto_2

    .line 118
    :pswitch_7
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-static {p1}, LPc/N;->a(Ljava/util/ArrayList;)LPc/N;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    goto :goto_2

    .line 129
    :pswitch_8
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-static {p1}, LPc/M;->a(Ljava/util/ArrayList;)LPc/M;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_2

    .line 140
    :pswitch_9
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {p1}, LPc/J;->a(Ljava/util/ArrayList;)LPc/J;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    goto :goto_2

    .line 151
    :pswitch_a
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-static {p1}, LPc/E;->a(Ljava/util/ArrayList;)LPc/E;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    goto :goto_2

    .line 162
    :pswitch_b
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-static {p1}, LPc/D;->a(Ljava/util/ArrayList;)LPc/D;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    :goto_2
    return-object p1

    .line 173
    :pswitch_c
    const/4 v0, 0x0

    .line 174
    packed-switch p1, :pswitch_data_3

    .line 175
    .line 176
    .line 177
    invoke-super {p0, p1, p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    goto/16 :goto_4

    .line 182
    .line 183
    :pswitch_d
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-static {p1}, LPc/Q;->a(Ljava/util/ArrayList;)LPc/Q;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    goto/16 :goto_4

    .line 194
    .line 195
    :pswitch_e
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-static {p1}, LPc/P;->a(Ljava/util/ArrayList;)LPc/P;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    goto/16 :goto_4

    .line 206
    .line 207
    :pswitch_f
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    check-cast p1, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-static {p1}, LPc/O;->a(Ljava/util/ArrayList;)LPc/O;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    goto/16 :goto_4

    .line 218
    .line 219
    :pswitch_10
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-static {p1}, LPc/N;->a(Ljava/util/ArrayList;)LPc/N;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    goto/16 :goto_4

    .line 230
    .line 231
    :pswitch_11
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    check-cast p1, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-static {p1}, LPc/M;->a(Ljava/util/ArrayList;)LPc/M;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    goto/16 :goto_4

    .line 242
    .line 243
    :pswitch_12
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    check-cast p1, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-static {p1}, LPc/L;->a(Ljava/util/ArrayList;)LPc/L;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    goto/16 :goto_4

    .line 254
    .line 255
    :pswitch_13
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    check-cast p1, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-static {p1}, LPc/K;->a(Ljava/util/ArrayList;)LPc/K;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    goto/16 :goto_4

    .line 266
    .line 267
    :pswitch_14
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    check-cast p1, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-static {p1}, LPc/J;->a(Ljava/util/ArrayList;)LPc/J;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    goto/16 :goto_4

    .line 278
    .line 279
    :pswitch_15
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Ljava/util/ArrayList;

    .line 284
    .line 285
    new-instance p2, LPc/I;

    .line 286
    .line 287
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    check-cast p1, Ljava/lang/String;

    .line 295
    .line 296
    if-eqz p1, :cond_2

    .line 297
    .line 298
    iput-object p1, p2, LPc/I;->a:Ljava/lang/String;

    .line 299
    .line 300
    :goto_3
    move-object p1, p2

    .line 301
    goto/16 :goto_4

    .line 302
    .line 303
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 304
    .line 305
    const-string p2, "Nonnull field \"id\" is null."

    .line 306
    .line 307
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw p1

    .line 311
    :pswitch_16
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    check-cast p1, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-static {p1}, LPc/H;->a(Ljava/util/ArrayList;)LPc/H;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    goto :goto_4

    .line 322
    :pswitch_17
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    check-cast p1, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-static {p1}, LPc/G;->a(Ljava/util/ArrayList;)LPc/G;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    goto :goto_4

    .line 333
    :pswitch_18
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    check-cast p1, Ljava/util/ArrayList;

    .line 338
    .line 339
    invoke-static {p1}, LPc/F;->a(Ljava/util/ArrayList;)LPc/F;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    goto :goto_4

    .line 344
    :pswitch_19
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    check-cast p1, Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-static {p1}, LPc/E;->a(Ljava/util/ArrayList;)LPc/E;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    goto :goto_4

    .line 355
    :pswitch_1a
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    check-cast p1, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-static {p1}, LPc/D;->a(Ljava/util/ArrayList;)LPc/D;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    goto :goto_4

    .line 366
    :pswitch_1b
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    check-cast p1, Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-static {p1}, LPc/C;->a(Ljava/util/ArrayList;)LPc/C;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    goto :goto_4

    .line 377
    :pswitch_1c
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    check-cast p1, Ljava/util/ArrayList;

    .line 382
    .line 383
    new-instance p2, LPc/B;

    .line 384
    .line 385
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    check-cast v0, Ljava/lang/String;

    .line 393
    .line 394
    iput-object v0, p2, LPc/B;->a:Ljava/lang/String;

    .line 395
    .line 396
    const/4 v0, 0x1

    .line 397
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    check-cast p1, Ljava/lang/String;

    .line 402
    .line 403
    iput-object p1, p2, LPc/B;->b:Ljava/lang/String;

    .line 404
    .line 405
    goto :goto_3

    .line 406
    :pswitch_1d
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    check-cast p1, Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-static {p1}, LPc/A;->a(Ljava/util/ArrayList;)LPc/A;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    goto :goto_4

    .line 417
    :pswitch_1e
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    check-cast p1, Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-static {p1}, LPc/m;->a(Ljava/util/ArrayList;)LPc/m;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    :goto_4
    return-object p1

    .line 428
    :pswitch_1f
    const/4 v0, 0x0

    .line 429
    packed-switch p1, :pswitch_data_4

    .line 430
    .line 431
    .line 432
    invoke-super {p0, p1, p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    goto/16 :goto_6

    .line 437
    .line 438
    :pswitch_20
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    check-cast p1, Ljava/util/ArrayList;

    .line 443
    .line 444
    invoke-static {p1}, LPc/Q;->a(Ljava/util/ArrayList;)LPc/Q;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    goto/16 :goto_6

    .line 449
    .line 450
    :pswitch_21
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    check-cast p1, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-static {p1}, LPc/P;->a(Ljava/util/ArrayList;)LPc/P;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    goto/16 :goto_6

    .line 461
    .line 462
    :pswitch_22
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    check-cast p1, Ljava/util/ArrayList;

    .line 467
    .line 468
    invoke-static {p1}, LPc/O;->a(Ljava/util/ArrayList;)LPc/O;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    goto/16 :goto_6

    .line 473
    .line 474
    :pswitch_23
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    check-cast p1, Ljava/util/ArrayList;

    .line 479
    .line 480
    invoke-static {p1}, LPc/N;->a(Ljava/util/ArrayList;)LPc/N;

    .line 481
    .line 482
    .line 483
    move-result-object p1

    .line 484
    goto/16 :goto_6

    .line 485
    .line 486
    :pswitch_24
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    check-cast p1, Ljava/util/ArrayList;

    .line 491
    .line 492
    invoke-static {p1}, LPc/M;->a(Ljava/util/ArrayList;)LPc/M;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    goto/16 :goto_6

    .line 497
    .line 498
    :pswitch_25
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    check-cast p1, Ljava/util/ArrayList;

    .line 503
    .line 504
    invoke-static {p1}, LPc/L;->a(Ljava/util/ArrayList;)LPc/L;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    goto/16 :goto_6

    .line 509
    .line 510
    :pswitch_26
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    check-cast p1, Ljava/util/ArrayList;

    .line 515
    .line 516
    invoke-static {p1}, LPc/K;->a(Ljava/util/ArrayList;)LPc/K;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    goto/16 :goto_6

    .line 521
    .line 522
    :pswitch_27
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    check-cast p1, Ljava/util/ArrayList;

    .line 527
    .line 528
    invoke-static {p1}, LPc/J;->a(Ljava/util/ArrayList;)LPc/J;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    goto/16 :goto_6

    .line 533
    .line 534
    :pswitch_28
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    check-cast p1, Ljava/util/ArrayList;

    .line 539
    .line 540
    new-instance p2, LPc/I;

    .line 541
    .line 542
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 543
    .line 544
    .line 545
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    check-cast p1, Ljava/lang/String;

    .line 550
    .line 551
    if-eqz p1, :cond_3

    .line 552
    .line 553
    iput-object p1, p2, LPc/I;->a:Ljava/lang/String;

    .line 554
    .line 555
    :goto_5
    move-object p1, p2

    .line 556
    goto/16 :goto_6

    .line 557
    .line 558
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 559
    .line 560
    const-string p2, "Nonnull field \"id\" is null."

    .line 561
    .line 562
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw p1

    .line 566
    :pswitch_29
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object p1

    .line 570
    check-cast p1, Ljava/util/ArrayList;

    .line 571
    .line 572
    invoke-static {p1}, LPc/H;->a(Ljava/util/ArrayList;)LPc/H;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    goto :goto_6

    .line 577
    :pswitch_2a
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    check-cast p1, Ljava/util/ArrayList;

    .line 582
    .line 583
    invoke-static {p1}, LPc/G;->a(Ljava/util/ArrayList;)LPc/G;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    goto :goto_6

    .line 588
    :pswitch_2b
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    check-cast p1, Ljava/util/ArrayList;

    .line 593
    .line 594
    invoke-static {p1}, LPc/F;->a(Ljava/util/ArrayList;)LPc/F;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    goto :goto_6

    .line 599
    :pswitch_2c
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    check-cast p1, Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-static {p1}, LPc/E;->a(Ljava/util/ArrayList;)LPc/E;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    goto :goto_6

    .line 610
    :pswitch_2d
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object p1

    .line 614
    check-cast p1, Ljava/util/ArrayList;

    .line 615
    .line 616
    invoke-static {p1}, LPc/D;->a(Ljava/util/ArrayList;)LPc/D;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    goto :goto_6

    .line 621
    :pswitch_2e
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object p1

    .line 625
    check-cast p1, Ljava/util/ArrayList;

    .line 626
    .line 627
    invoke-static {p1}, LPc/C;->a(Ljava/util/ArrayList;)LPc/C;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    goto :goto_6

    .line 632
    :pswitch_2f
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    check-cast p1, Ljava/util/ArrayList;

    .line 637
    .line 638
    new-instance p2, LPc/B;

    .line 639
    .line 640
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 641
    .line 642
    .line 643
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    check-cast v0, Ljava/lang/String;

    .line 648
    .line 649
    iput-object v0, p2, LPc/B;->a:Ljava/lang/String;

    .line 650
    .line 651
    const/4 v0, 0x1

    .line 652
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object p1

    .line 656
    check-cast p1, Ljava/lang/String;

    .line 657
    .line 658
    iput-object p1, p2, LPc/B;->b:Ljava/lang/String;

    .line 659
    .line 660
    goto :goto_5

    .line 661
    :pswitch_30
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    check-cast p1, Ljava/util/ArrayList;

    .line 666
    .line 667
    invoke-static {p1}, LPc/A;->a(Ljava/util/ArrayList;)LPc/A;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    goto :goto_6

    .line 672
    :pswitch_31
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object p1

    .line 676
    check-cast p1, Ljava/util/ArrayList;

    .line 677
    .line 678
    invoke-static {p1}, LPc/m;->a(Ljava/util/ArrayList;)LPc/m;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    :goto_6
    return-object p1

    .line 683
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_c
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    :pswitch_data_1
    .packed-switch -0x80
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    :pswitch_data_2
    .packed-switch -0x80
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    :pswitch_data_3
    .packed-switch -0x80
        :pswitch_1e
        :pswitch_1d
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
    .end packed-switch

    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    :pswitch_data_4
    .packed-switch -0x80
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch
.end method

.method public final k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LPc/r;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LPc/m;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x80

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    check-cast p2, LPc/m;

    .line 16
    .line 17
    invoke-virtual {p2}, LPc/m;->b()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of v0, p2, LPc/H;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x81

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 32
    .line 33
    .line 34
    check-cast p2, LPc/H;

    .line 35
    .line 36
    invoke-virtual {p2}, LPc/H;->b()Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    instance-of v0, p2, LPc/I;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const/16 v0, 0x82

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 51
    .line 52
    .line 53
    check-cast p2, LPc/I;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iget-object p2, p2, LPc/I;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    instance-of v0, p2, LPc/J;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    const/16 v0, 0x83

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 80
    .line 81
    .line 82
    check-cast p2, LPc/J;

    .line 83
    .line 84
    invoke-virtual {p2}, LPc/J;->b()Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-void

    .line 96
    :pswitch_0
    instance-of v0, p2, LPc/L;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    const/16 v0, 0x80

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 103
    .line 104
    .line 105
    check-cast p2, LPc/L;

    .line 106
    .line 107
    invoke-virtual {p2}, LPc/L;->b()Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :goto_1
    return-void

    .line 119
    :pswitch_1
    instance-of v0, p2, LPc/D;

    .line 120
    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    const/16 v0, 0x80

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 126
    .line 127
    .line 128
    check-cast p2, LPc/D;

    .line 129
    .line 130
    invoke-virtual {p2}, LPc/D;->b()Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    instance-of v0, p2, LPc/E;

    .line 139
    .line 140
    if-eqz v0, :cond_6

    .line 141
    .line 142
    const/16 v0, 0x81

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 145
    .line 146
    .line 147
    check-cast p2, LPc/E;

    .line 148
    .line 149
    invoke-virtual {p2}, LPc/E;->b()Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    instance-of v0, p2, LPc/J;

    .line 158
    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    const/16 v0, 0x82

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 164
    .line 165
    .line 166
    check-cast p2, LPc/J;

    .line 167
    .line 168
    invoke-virtual {p2}, LPc/J;->b()Ljava/util/ArrayList;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    instance-of v0, p2, LPc/M;

    .line 177
    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    const/16 v0, 0x83

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 183
    .line 184
    .line 185
    check-cast p2, LPc/M;

    .line 186
    .line 187
    invoke-virtual {p2}, LPc/M;->b()Ljava/util/ArrayList;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_8
    instance-of v0, p2, LPc/N;

    .line 196
    .line 197
    if-eqz v0, :cond_9

    .line 198
    .line 199
    const/16 v0, 0x84

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 202
    .line 203
    .line 204
    check-cast p2, LPc/N;

    .line 205
    .line 206
    invoke-virtual {p2}, LPc/N;->b()Ljava/util/ArrayList;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_9
    instance-of v0, p2, LPc/O;

    .line 215
    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    const/16 v0, 0x85

    .line 219
    .line 220
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 221
    .line 222
    .line 223
    check-cast p2, LPc/O;

    .line 224
    .line 225
    invoke-virtual {p2}, LPc/O;->b()Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_a
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :goto_2
    return-void

    .line 237
    :pswitch_2
    instance-of v0, p2, LPc/m;

    .line 238
    .line 239
    if-eqz v0, :cond_b

    .line 240
    .line 241
    const/16 v0, 0x80

    .line 242
    .line 243
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 244
    .line 245
    .line 246
    check-cast p2, LPc/m;

    .line 247
    .line 248
    invoke-virtual {p2}, LPc/m;->b()Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_4

    .line 256
    .line 257
    :cond_b
    instance-of v0, p2, LPc/A;

    .line 258
    .line 259
    const/4 v1, 0x2

    .line 260
    if-eqz v0, :cond_d

    .line 261
    .line 262
    const/16 v0, 0x81

    .line 263
    .line 264
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 265
    .line 266
    .line 267
    check-cast p2, LPc/A;

    .line 268
    .line 269
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    new-instance v0, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 275
    .line 276
    .line 277
    iget v1, p2, LPc/A;->a:I

    .line 278
    .line 279
    if-nez v1, :cond_c

    .line 280
    .line 281
    const/4 v1, 0x0

    .line 282
    goto :goto_3

    .line 283
    :cond_c
    invoke-static {v1}, LA/f;->f(I)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    :goto_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    iget-object p2, p2, LPc/A;->b:LPc/B;

    .line 295
    .line 296
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_4

    .line 303
    .line 304
    :cond_d
    instance-of v0, p2, LPc/B;

    .line 305
    .line 306
    if-eqz v0, :cond_e

    .line 307
    .line 308
    const/16 v0, 0x82

    .line 309
    .line 310
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 311
    .line 312
    .line 313
    check-cast p2, LPc/B;

    .line 314
    .line 315
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    new-instance v0, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 321
    .line 322
    .line 323
    iget-object v1, p2, LPc/B;->a:Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    iget-object p2, p2, LPc/B;->b:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_4

    .line 337
    .line 338
    :cond_e
    instance-of v0, p2, LPc/C;

    .line 339
    .line 340
    if-eqz v0, :cond_f

    .line 341
    .line 342
    const/16 v0, 0x83

    .line 343
    .line 344
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 345
    .line 346
    .line 347
    check-cast p2, LPc/C;

    .line 348
    .line 349
    invoke-virtual {p2}, LPc/C;->b()Ljava/util/ArrayList;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_4

    .line 357
    .line 358
    :cond_f
    instance-of v0, p2, LPc/D;

    .line 359
    .line 360
    if-eqz v0, :cond_10

    .line 361
    .line 362
    const/16 v0, 0x84

    .line 363
    .line 364
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 365
    .line 366
    .line 367
    check-cast p2, LPc/D;

    .line 368
    .line 369
    invoke-virtual {p2}, LPc/D;->b()Ljava/util/ArrayList;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_4

    .line 377
    .line 378
    :cond_10
    instance-of v0, p2, LPc/E;

    .line 379
    .line 380
    if-eqz v0, :cond_11

    .line 381
    .line 382
    const/16 v0, 0x85

    .line 383
    .line 384
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 385
    .line 386
    .line 387
    check-cast p2, LPc/E;

    .line 388
    .line 389
    invoke-virtual {p2}, LPc/E;->b()Ljava/util/ArrayList;

    .line 390
    .line 391
    .line 392
    move-result-object p2

    .line 393
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto/16 :goto_4

    .line 397
    .line 398
    :cond_11
    instance-of v0, p2, LPc/F;

    .line 399
    .line 400
    if-eqz v0, :cond_12

    .line 401
    .line 402
    const/16 v0, 0x86

    .line 403
    .line 404
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 405
    .line 406
    .line 407
    check-cast p2, LPc/F;

    .line 408
    .line 409
    invoke-virtual {p2}, LPc/F;->b()Ljava/util/ArrayList;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_4

    .line 417
    .line 418
    :cond_12
    instance-of v0, p2, LPc/G;

    .line 419
    .line 420
    if-eqz v0, :cond_13

    .line 421
    .line 422
    const/16 v0, 0x87

    .line 423
    .line 424
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 425
    .line 426
    .line 427
    check-cast p2, LPc/G;

    .line 428
    .line 429
    invoke-virtual {p2}, LPc/G;->b()Ljava/util/ArrayList;

    .line 430
    .line 431
    .line 432
    move-result-object p2

    .line 433
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    goto/16 :goto_4

    .line 437
    .line 438
    :cond_13
    instance-of v0, p2, LPc/H;

    .line 439
    .line 440
    if-eqz v0, :cond_14

    .line 441
    .line 442
    const/16 v0, 0x88

    .line 443
    .line 444
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 445
    .line 446
    .line 447
    check-cast p2, LPc/H;

    .line 448
    .line 449
    invoke-virtual {p2}, LPc/H;->b()Ljava/util/ArrayList;

    .line 450
    .line 451
    .line 452
    move-result-object p2

    .line 453
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_4

    .line 457
    .line 458
    :cond_14
    instance-of v0, p2, LPc/I;

    .line 459
    .line 460
    if-eqz v0, :cond_15

    .line 461
    .line 462
    const/16 v0, 0x89

    .line 463
    .line 464
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 465
    .line 466
    .line 467
    check-cast p2, LPc/I;

    .line 468
    .line 469
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    new-instance v0, Ljava/util/ArrayList;

    .line 473
    .line 474
    const/4 v1, 0x1

    .line 475
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 476
    .line 477
    .line 478
    iget-object p2, p2, LPc/I;->a:Ljava/lang/String;

    .line 479
    .line 480
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_4

    .line 487
    .line 488
    :cond_15
    instance-of v0, p2, LPc/J;

    .line 489
    .line 490
    if-eqz v0, :cond_16

    .line 491
    .line 492
    const/16 v0, 0x8a

    .line 493
    .line 494
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 495
    .line 496
    .line 497
    check-cast p2, LPc/J;

    .line 498
    .line 499
    invoke-virtual {p2}, LPc/J;->b()Ljava/util/ArrayList;

    .line 500
    .line 501
    .line 502
    move-result-object p2

    .line 503
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    goto/16 :goto_4

    .line 507
    .line 508
    :cond_16
    instance-of v0, p2, LPc/K;

    .line 509
    .line 510
    if-eqz v0, :cond_17

    .line 511
    .line 512
    const/16 v0, 0x8b

    .line 513
    .line 514
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 515
    .line 516
    .line 517
    check-cast p2, LPc/K;

    .line 518
    .line 519
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    new-instance v0, Ljava/util/ArrayList;

    .line 523
    .line 524
    const/4 v1, 0x3

    .line 525
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 526
    .line 527
    .line 528
    iget-object v1, p2, LPc/K;->a:Ljava/lang/String;

    .line 529
    .line 530
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    iget-object v1, p2, LPc/K;->b:Ljava/util/List;

    .line 534
    .line 535
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    iget-object p2, p2, LPc/K;->c:Ljava/util/Map;

    .line 539
    .line 540
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_4

    .line 547
    .line 548
    :cond_17
    instance-of v0, p2, LPc/L;

    .line 549
    .line 550
    if-eqz v0, :cond_18

    .line 551
    .line 552
    const/16 v0, 0x8c

    .line 553
    .line 554
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 555
    .line 556
    .line 557
    check-cast p2, LPc/L;

    .line 558
    .line 559
    invoke-virtual {p2}, LPc/L;->b()Ljava/util/ArrayList;

    .line 560
    .line 561
    .line 562
    move-result-object p2

    .line 563
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    goto/16 :goto_4

    .line 567
    .line 568
    :cond_18
    instance-of v0, p2, LPc/M;

    .line 569
    .line 570
    if-eqz v0, :cond_19

    .line 571
    .line 572
    const/16 v0, 0x8d

    .line 573
    .line 574
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 575
    .line 576
    .line 577
    check-cast p2, LPc/M;

    .line 578
    .line 579
    invoke-virtual {p2}, LPc/M;->b()Ljava/util/ArrayList;

    .line 580
    .line 581
    .line 582
    move-result-object p2

    .line 583
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    goto :goto_4

    .line 587
    :cond_19
    instance-of v0, p2, LPc/N;

    .line 588
    .line 589
    if-eqz v0, :cond_1a

    .line 590
    .line 591
    const/16 v0, 0x8e

    .line 592
    .line 593
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 594
    .line 595
    .line 596
    check-cast p2, LPc/N;

    .line 597
    .line 598
    invoke-virtual {p2}, LPc/N;->b()Ljava/util/ArrayList;

    .line 599
    .line 600
    .line 601
    move-result-object p2

    .line 602
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    goto :goto_4

    .line 606
    :cond_1a
    instance-of v0, p2, LPc/O;

    .line 607
    .line 608
    if-eqz v0, :cond_1b

    .line 609
    .line 610
    const/16 v0, 0x8f

    .line 611
    .line 612
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 613
    .line 614
    .line 615
    check-cast p2, LPc/O;

    .line 616
    .line 617
    invoke-virtual {p2}, LPc/O;->b()Ljava/util/ArrayList;

    .line 618
    .line 619
    .line 620
    move-result-object p2

    .line 621
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    goto :goto_4

    .line 625
    :cond_1b
    instance-of v0, p2, LPc/P;

    .line 626
    .line 627
    if-eqz v0, :cond_1c

    .line 628
    .line 629
    const/16 v0, 0x90

    .line 630
    .line 631
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 632
    .line 633
    .line 634
    check-cast p2, LPc/P;

    .line 635
    .line 636
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    new-instance v0, Ljava/util/ArrayList;

    .line 640
    .line 641
    const/4 v1, 0x4

    .line 642
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 643
    .line 644
    .line 645
    iget-object v1, p2, LPc/P;->a:Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    iget-object v1, p2, LPc/P;->b:Ljava/lang/String;

    .line 651
    .line 652
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    iget-object v1, p2, LPc/P;->c:Ljava/lang/Boolean;

    .line 656
    .line 657
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    iget-object p2, p2, LPc/P;->d:Ljava/lang/Boolean;

    .line 661
    .line 662
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    goto :goto_4

    .line 669
    :cond_1c
    instance-of v0, p2, LPc/Q;

    .line 670
    .line 671
    if-eqz v0, :cond_1d

    .line 672
    .line 673
    const/16 v0, 0x91

    .line 674
    .line 675
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 676
    .line 677
    .line 678
    check-cast p2, LPc/Q;

    .line 679
    .line 680
    invoke-virtual {p2}, LPc/Q;->b()Ljava/util/ArrayList;

    .line 681
    .line 682
    .line 683
    move-result-object p2

    .line 684
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    goto :goto_4

    .line 688
    :cond_1d
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    :goto_4
    return-void

    .line 692
    :pswitch_3
    instance-of v0, p2, LPc/m;

    .line 693
    .line 694
    if-eqz v0, :cond_1e

    .line 695
    .line 696
    const/16 v0, 0x80

    .line 697
    .line 698
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 699
    .line 700
    .line 701
    check-cast p2, LPc/m;

    .line 702
    .line 703
    invoke-virtual {p2}, LPc/m;->b()Ljava/util/ArrayList;

    .line 704
    .line 705
    .line 706
    move-result-object p2

    .line 707
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    goto/16 :goto_6

    .line 711
    .line 712
    :cond_1e
    instance-of v0, p2, LPc/A;

    .line 713
    .line 714
    const/4 v1, 0x2

    .line 715
    if-eqz v0, :cond_20

    .line 716
    .line 717
    const/16 v0, 0x81

    .line 718
    .line 719
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 720
    .line 721
    .line 722
    check-cast p2, LPc/A;

    .line 723
    .line 724
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    new-instance v0, Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 730
    .line 731
    .line 732
    iget v1, p2, LPc/A;->a:I

    .line 733
    .line 734
    if-nez v1, :cond_1f

    .line 735
    .line 736
    const/4 v1, 0x0

    .line 737
    goto :goto_5

    .line 738
    :cond_1f
    invoke-static {v1}, LA/f;->f(I)I

    .line 739
    .line 740
    .line 741
    move-result v1

    .line 742
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    :goto_5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    iget-object p2, p2, LPc/A;->b:LPc/B;

    .line 750
    .line 751
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    goto/16 :goto_6

    .line 758
    .line 759
    :cond_20
    instance-of v0, p2, LPc/B;

    .line 760
    .line 761
    if-eqz v0, :cond_21

    .line 762
    .line 763
    const/16 v0, 0x82

    .line 764
    .line 765
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 766
    .line 767
    .line 768
    check-cast p2, LPc/B;

    .line 769
    .line 770
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    new-instance v0, Ljava/util/ArrayList;

    .line 774
    .line 775
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 776
    .line 777
    .line 778
    iget-object v1, p2, LPc/B;->a:Ljava/lang/String;

    .line 779
    .line 780
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    iget-object p2, p2, LPc/B;->b:Ljava/lang/String;

    .line 784
    .line 785
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    goto/16 :goto_6

    .line 792
    .line 793
    :cond_21
    instance-of v0, p2, LPc/C;

    .line 794
    .line 795
    if-eqz v0, :cond_22

    .line 796
    .line 797
    const/16 v0, 0x83

    .line 798
    .line 799
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 800
    .line 801
    .line 802
    check-cast p2, LPc/C;

    .line 803
    .line 804
    invoke-virtual {p2}, LPc/C;->b()Ljava/util/ArrayList;

    .line 805
    .line 806
    .line 807
    move-result-object p2

    .line 808
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    goto/16 :goto_6

    .line 812
    .line 813
    :cond_22
    instance-of v0, p2, LPc/D;

    .line 814
    .line 815
    if-eqz v0, :cond_23

    .line 816
    .line 817
    const/16 v0, 0x84

    .line 818
    .line 819
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 820
    .line 821
    .line 822
    check-cast p2, LPc/D;

    .line 823
    .line 824
    invoke-virtual {p2}, LPc/D;->b()Ljava/util/ArrayList;

    .line 825
    .line 826
    .line 827
    move-result-object p2

    .line 828
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    goto/16 :goto_6

    .line 832
    .line 833
    :cond_23
    instance-of v0, p2, LPc/E;

    .line 834
    .line 835
    if-eqz v0, :cond_24

    .line 836
    .line 837
    const/16 v0, 0x85

    .line 838
    .line 839
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 840
    .line 841
    .line 842
    check-cast p2, LPc/E;

    .line 843
    .line 844
    invoke-virtual {p2}, LPc/E;->b()Ljava/util/ArrayList;

    .line 845
    .line 846
    .line 847
    move-result-object p2

    .line 848
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 849
    .line 850
    .line 851
    goto/16 :goto_6

    .line 852
    .line 853
    :cond_24
    instance-of v0, p2, LPc/F;

    .line 854
    .line 855
    if-eqz v0, :cond_25

    .line 856
    .line 857
    const/16 v0, 0x86

    .line 858
    .line 859
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 860
    .line 861
    .line 862
    check-cast p2, LPc/F;

    .line 863
    .line 864
    invoke-virtual {p2}, LPc/F;->b()Ljava/util/ArrayList;

    .line 865
    .line 866
    .line 867
    move-result-object p2

    .line 868
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    goto/16 :goto_6

    .line 872
    .line 873
    :cond_25
    instance-of v0, p2, LPc/G;

    .line 874
    .line 875
    if-eqz v0, :cond_26

    .line 876
    .line 877
    const/16 v0, 0x87

    .line 878
    .line 879
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 880
    .line 881
    .line 882
    check-cast p2, LPc/G;

    .line 883
    .line 884
    invoke-virtual {p2}, LPc/G;->b()Ljava/util/ArrayList;

    .line 885
    .line 886
    .line 887
    move-result-object p2

    .line 888
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    goto/16 :goto_6

    .line 892
    .line 893
    :cond_26
    instance-of v0, p2, LPc/H;

    .line 894
    .line 895
    if-eqz v0, :cond_27

    .line 896
    .line 897
    const/16 v0, 0x88

    .line 898
    .line 899
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 900
    .line 901
    .line 902
    check-cast p2, LPc/H;

    .line 903
    .line 904
    invoke-virtual {p2}, LPc/H;->b()Ljava/util/ArrayList;

    .line 905
    .line 906
    .line 907
    move-result-object p2

    .line 908
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 909
    .line 910
    .line 911
    goto/16 :goto_6

    .line 912
    .line 913
    :cond_27
    instance-of v0, p2, LPc/I;

    .line 914
    .line 915
    if-eqz v0, :cond_28

    .line 916
    .line 917
    const/16 v0, 0x89

    .line 918
    .line 919
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 920
    .line 921
    .line 922
    check-cast p2, LPc/I;

    .line 923
    .line 924
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    new-instance v0, Ljava/util/ArrayList;

    .line 928
    .line 929
    const/4 v1, 0x1

    .line 930
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 931
    .line 932
    .line 933
    iget-object p2, p2, LPc/I;->a:Ljava/lang/String;

    .line 934
    .line 935
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 939
    .line 940
    .line 941
    goto/16 :goto_6

    .line 942
    .line 943
    :cond_28
    instance-of v0, p2, LPc/J;

    .line 944
    .line 945
    if-eqz v0, :cond_29

    .line 946
    .line 947
    const/16 v0, 0x8a

    .line 948
    .line 949
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 950
    .line 951
    .line 952
    check-cast p2, LPc/J;

    .line 953
    .line 954
    invoke-virtual {p2}, LPc/J;->b()Ljava/util/ArrayList;

    .line 955
    .line 956
    .line 957
    move-result-object p2

    .line 958
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    goto/16 :goto_6

    .line 962
    .line 963
    :cond_29
    instance-of v0, p2, LPc/K;

    .line 964
    .line 965
    if-eqz v0, :cond_2a

    .line 966
    .line 967
    const/16 v0, 0x8b

    .line 968
    .line 969
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 970
    .line 971
    .line 972
    check-cast p2, LPc/K;

    .line 973
    .line 974
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    .line 976
    .line 977
    new-instance v0, Ljava/util/ArrayList;

    .line 978
    .line 979
    const/4 v1, 0x3

    .line 980
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 981
    .line 982
    .line 983
    iget-object v1, p2, LPc/K;->a:Ljava/lang/String;

    .line 984
    .line 985
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    iget-object v1, p2, LPc/K;->b:Ljava/util/List;

    .line 989
    .line 990
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    iget-object p2, p2, LPc/K;->c:Ljava/util/Map;

    .line 994
    .line 995
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    goto/16 :goto_6

    .line 1002
    .line 1003
    :cond_2a
    instance-of v0, p2, LPc/L;

    .line 1004
    .line 1005
    if-eqz v0, :cond_2b

    .line 1006
    .line 1007
    const/16 v0, 0x8c

    .line 1008
    .line 1009
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1010
    .line 1011
    .line 1012
    check-cast p2, LPc/L;

    .line 1013
    .line 1014
    invoke-virtual {p2}, LPc/L;->b()Ljava/util/ArrayList;

    .line 1015
    .line 1016
    .line 1017
    move-result-object p2

    .line 1018
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 1019
    .line 1020
    .line 1021
    goto/16 :goto_6

    .line 1022
    .line 1023
    :cond_2b
    instance-of v0, p2, LPc/M;

    .line 1024
    .line 1025
    if-eqz v0, :cond_2c

    .line 1026
    .line 1027
    const/16 v0, 0x8d

    .line 1028
    .line 1029
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1030
    .line 1031
    .line 1032
    check-cast p2, LPc/M;

    .line 1033
    .line 1034
    invoke-virtual {p2}, LPc/M;->b()Ljava/util/ArrayList;

    .line 1035
    .line 1036
    .line 1037
    move-result-object p2

    .line 1038
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_6

    .line 1042
    :cond_2c
    instance-of v0, p2, LPc/N;

    .line 1043
    .line 1044
    if-eqz v0, :cond_2d

    .line 1045
    .line 1046
    const/16 v0, 0x8e

    .line 1047
    .line 1048
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1049
    .line 1050
    .line 1051
    check-cast p2, LPc/N;

    .line 1052
    .line 1053
    invoke-virtual {p2}, LPc/N;->b()Ljava/util/ArrayList;

    .line 1054
    .line 1055
    .line 1056
    move-result-object p2

    .line 1057
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 1058
    .line 1059
    .line 1060
    goto :goto_6

    .line 1061
    :cond_2d
    instance-of v0, p2, LPc/O;

    .line 1062
    .line 1063
    if-eqz v0, :cond_2e

    .line 1064
    .line 1065
    const/16 v0, 0x8f

    .line 1066
    .line 1067
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1068
    .line 1069
    .line 1070
    check-cast p2, LPc/O;

    .line 1071
    .line 1072
    invoke-virtual {p2}, LPc/O;->b()Ljava/util/ArrayList;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p2

    .line 1076
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_6

    .line 1080
    :cond_2e
    instance-of v0, p2, LPc/P;

    .line 1081
    .line 1082
    if-eqz v0, :cond_2f

    .line 1083
    .line 1084
    const/16 v0, 0x90

    .line 1085
    .line 1086
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1087
    .line 1088
    .line 1089
    check-cast p2, LPc/P;

    .line 1090
    .line 1091
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    new-instance v0, Ljava/util/ArrayList;

    .line 1095
    .line 1096
    const/4 v1, 0x4

    .line 1097
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1098
    .line 1099
    .line 1100
    iget-object v1, p2, LPc/P;->a:Ljava/lang/String;

    .line 1101
    .line 1102
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    iget-object v1, p2, LPc/P;->b:Ljava/lang/String;

    .line 1106
    .line 1107
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    iget-object v1, p2, LPc/P;->c:Ljava/lang/Boolean;

    .line 1111
    .line 1112
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1113
    .line 1114
    .line 1115
    iget-object p2, p2, LPc/P;->d:Ljava/lang/Boolean;

    .line 1116
    .line 1117
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {p0, p1, v0}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    goto :goto_6

    .line 1124
    :cond_2f
    instance-of v0, p2, LPc/Q;

    .line 1125
    .line 1126
    if-eqz v0, :cond_30

    .line 1127
    .line 1128
    const/16 v0, 0x91

    .line 1129
    .line 1130
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1131
    .line 1132
    .line 1133
    check-cast p2, LPc/Q;

    .line 1134
    .line 1135
    invoke-virtual {p2}, LPc/Q;->b()Ljava/util/ArrayList;

    .line 1136
    .line 1137
    .line 1138
    move-result-object p2

    .line 1139
    :try_start_0
    invoke-virtual {p0, p1, p2}, LPc/r;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1140
    .line 1141
    .line 1142
    goto :goto_6

    .line 1143
    :catchall_0
    move-exception p1

    .line 1144
    throw p1

    .line 1145
    :cond_30
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 1146
    .line 1147
    .line 1148
    :goto_6
    return-void

    .line 1149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
