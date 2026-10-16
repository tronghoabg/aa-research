.class public final LHf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHf/m;Lfd/H;Lx1/e;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LHf/j;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHf/j;->b:Ljava/lang/Object;

    iput-object p2, p0, LHf/j;->c:Ljava/lang/Object;

    iput-object p3, p0, LHf/j;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LHf/m;Ljf/h;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LHf/j;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p2, p0, LHf/j;->c:Ljava/lang/Object;

    .line 7
    invoke-static {p2}, LJf/b;->m(Ljf/h;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LHf/j;->d:Ljava/lang/Object;

    .line 8
    new-instance p2, LIf/F;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, LIf/F;-><init>(LHf/m;Ljf/c;)V

    iput-object p2, p0, LHf/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LHf/j;->a:I

    iput-object p1, p0, LHf/j;->c:Ljava/lang/Object;

    iput-object p2, p0, LHf/j;->d:Ljava/lang/Object;

    iput-object p3, p0, LHf/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/C;LHf/m;Ltf/p;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LHf/j;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHf/j;->c:Ljava/lang/Object;

    iput-object p2, p0, LHf/j;->b:Ljava/lang/Object;

    check-cast p3, Llf/j;

    iput-object p3, p0, LHf/j;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/E;LHf/m;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LHf/j;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHf/j;->c:Ljava/lang/Object;

    iput-object p2, p0, LHf/j;->b:Ljava/lang/Object;

    iput-object p3, p0, LHf/j;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LHf/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lfd/p;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lfd/p;

    .line 12
    .line 13
    iget v1, v0, Lfd/p;->b:I

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
    iput v1, v0, Lfd/p;->b:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lfd/p;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lfd/p;-><init>(LHf/j;Ljf/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lfd/p;->a:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    iget v2, v0, Lfd/p;->b:I

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
    check-cast p1, Lx1/b;

    .line 57
    .line 58
    iget-object p2, p0, LHf/j;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, Lx1/e;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Lx1/b;->b(Lx1/e;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p2, p0, LHf/j;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p2, Lfd/H;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lfd/H;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ljava/lang/Double;

    .line 75
    .line 76
    iput v3, v0, Lfd/p;->b:I

    .line 77
    .line 78
    iget-object p2, p0, LHf/j;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p2, LHf/m;

    .line 81
    .line 82
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v1, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    :goto_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 90
    .line 91
    :goto_2
    return-object v1

    .line 92
    :pswitch_0
    check-cast p1, Lef/u;

    .line 93
    .line 94
    iget p1, p1, Lef/u;->a:I

    .line 95
    .line 96
    iget-object v0, p0, LHf/j;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lkotlin/jvm/internal/E;

    .line 99
    .line 100
    iput p1, v0, Lkotlin/jvm/internal/E;->a:I

    .line 101
    .line 102
    iget-object v0, p0, LHf/j;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Lkotlin/jvm/internal/E;

    .line 105
    .line 106
    iget v1, v0, Lkotlin/jvm/internal/E;->a:I

    .line 107
    .line 108
    sget-object v2, Lef/C;->a:Lef/C;

    .line 109
    .line 110
    if-eq p1, v1, :cond_4

    .line 111
    .line 112
    iput p1, v0, Lkotlin/jvm/internal/E;->a:I

    .line 113
    .line 114
    new-instance v0, Lef/u;

    .line 115
    .line 116
    invoke-direct {v0, p1}, Lef/u;-><init>(I)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, LHf/j;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, LGf/t;

    .line 122
    .line 123
    check-cast p1, LGf/s;

    .line 124
    .line 125
    iget-object p1, p1, LGf/s;->d:LGf/e;

    .line 126
    .line 127
    invoke-interface {p1, v0, p2}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 132
    .line 133
    if-ne p1, p2, :cond_4

    .line 134
    .line 135
    move-object v2, p1

    .line 136
    :cond_4
    return-object v2

    .line 137
    :pswitch_1
    iget-object v0, p0, LHf/j;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Ljf/h;

    .line 140
    .line 141
    iget-object v1, p0, LHf/j;->d:Ljava/lang/Object;

    .line 142
    .line 143
    iget-object v2, p0, LHf/j;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, LIf/F;

    .line 146
    .line 147
    invoke-static {v0, p1, v1, v2, p2}, LIf/c;->b(Ljf/h;Ljava/lang/Object;Ljava/lang/Object;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 152
    .line 153
    if-ne p1, p2, :cond_5

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 157
    .line 158
    :goto_3
    return-object p1

    .line 159
    :pswitch_2
    instance-of v0, p2, LHf/G;

    .line 160
    .line 161
    if-eqz v0, :cond_6

    .line 162
    .line 163
    move-object v0, p2

    .line 164
    check-cast v0, LHf/G;

    .line 165
    .line 166
    iget v1, v0, LHf/G;->c:I

    .line 167
    .line 168
    const/high16 v2, -0x80000000

    .line 169
    .line 170
    and-int v3, v1, v2

    .line 171
    .line 172
    if-eqz v3, :cond_6

    .line 173
    .line 174
    sub-int/2addr v1, v2

    .line 175
    iput v1, v0, LHf/G;->c:I

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    new-instance v0, LHf/G;

    .line 179
    .line 180
    invoke-direct {v0, p0, p2}, LHf/G;-><init>(LHf/j;Ljf/c;)V

    .line 181
    .line 182
    .line 183
    :goto_4
    iget-object p2, v0, LHf/G;->a:Ljava/lang/Object;

    .line 184
    .line 185
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 186
    .line 187
    iget v2, v0, LHf/G;->c:I

    .line 188
    .line 189
    sget-object v3, Lef/C;->a:Lef/C;

    .line 190
    .line 191
    const/4 v4, 0x1

    .line 192
    const/4 v5, 0x2

    .line 193
    if-eqz v2, :cond_a

    .line 194
    .line 195
    if-eq v2, v4, :cond_7

    .line 196
    .line 197
    if-ne v2, v5, :cond_9

    .line 198
    .line 199
    :cond_7
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_8
    move-object v1, v3

    .line 203
    goto :goto_5

    .line 204
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 205
    .line 206
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 207
    .line 208
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_a
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object p2, p0, LHf/j;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p2, Lkotlin/jvm/internal/E;

    .line 218
    .line 219
    iget v2, p2, Lkotlin/jvm/internal/E;->a:I

    .line 220
    .line 221
    add-int/2addr v2, v4

    .line 222
    iput v2, p2, Lkotlin/jvm/internal/E;->a:I

    .line 223
    .line 224
    iget-object p2, p0, LHf/j;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p2, LHf/m;

    .line 227
    .line 228
    if-ge v2, v4, :cond_b

    .line 229
    .line 230
    iput v4, v0, LHf/G;->c:I

    .line 231
    .line 232
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-ne p1, v1, :cond_8

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_b
    iput v5, v0, LHf/G;->c:I

    .line 240
    .line 241
    iget-object v2, p0, LHf/j;->d:Ljava/lang/Object;

    .line 242
    .line 243
    invoke-static {p2, p1, v2, v0}, LHf/k0;->d(LHf/m;Ljava/lang/Object;Ljava/lang/Object;Llf/c;)V

    .line 244
    .line 245
    .line 246
    :goto_5
    return-object v1

    .line 247
    :pswitch_3
    instance-of v0, p2, LHf/C;

    .line 248
    .line 249
    if-eqz v0, :cond_c

    .line 250
    .line 251
    move-object v0, p2

    .line 252
    check-cast v0, LHf/C;

    .line 253
    .line 254
    iget v1, v0, LHf/C;->e:I

    .line 255
    .line 256
    const/high16 v2, -0x80000000

    .line 257
    .line 258
    and-int v3, v1, v2

    .line 259
    .line 260
    if-eqz v3, :cond_c

    .line 261
    .line 262
    sub-int/2addr v1, v2

    .line 263
    iput v1, v0, LHf/C;->e:I

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_c
    new-instance v0, LHf/C;

    .line 267
    .line 268
    invoke-direct {v0, p0, p2}, LHf/C;-><init>(LHf/j;Ljf/c;)V

    .line 269
    .line 270
    .line 271
    :goto_6
    iget-object p2, v0, LHf/C;->c:Ljava/lang/Object;

    .line 272
    .line 273
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 274
    .line 275
    iget v2, v0, LHf/C;->e:I

    .line 276
    .line 277
    sget-object v3, Lef/C;->a:Lef/C;

    .line 278
    .line 279
    const/4 v4, 0x3

    .line 280
    const/4 v5, 0x2

    .line 281
    const/4 v6, 0x1

    .line 282
    if-eqz v2, :cond_11

    .line 283
    .line 284
    if-eq v2, v6, :cond_d

    .line 285
    .line 286
    if-eq v2, v5, :cond_10

    .line 287
    .line 288
    if-ne v2, v4, :cond_f

    .line 289
    .line 290
    :cond_d
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_e
    move-object v1, v3

    .line 294
    goto :goto_8

    .line 295
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 296
    .line 297
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 298
    .line 299
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw p1

    .line 303
    :cond_10
    iget-object p1, v0, LHf/C;->b:Ljava/lang/Object;

    .line 304
    .line 305
    iget-object v2, v0, LHf/C;->a:LHf/j;

    .line 306
    .line 307
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_11
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iget-object p2, p0, LHf/j;->c:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p2, Lkotlin/jvm/internal/C;

    .line 317
    .line 318
    iget-boolean p2, p2, Lkotlin/jvm/internal/C;->a:Z

    .line 319
    .line 320
    if-eqz p2, :cond_12

    .line 321
    .line 322
    iput v6, v0, LHf/C;->e:I

    .line 323
    .line 324
    iget-object p2, p0, LHf/j;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast p2, LHf/m;

    .line 327
    .line 328
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    if-ne p1, v1, :cond_e

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_12
    iput-object p0, v0, LHf/C;->a:LHf/j;

    .line 336
    .line 337
    iput-object p1, v0, LHf/C;->b:Ljava/lang/Object;

    .line 338
    .line 339
    iput v5, v0, LHf/C;->e:I

    .line 340
    .line 341
    iget-object p2, p0, LHf/j;->d:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p2, Llf/j;

    .line 344
    .line 345
    invoke-interface {p2, p1, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object p2

    .line 349
    if-ne p2, v1, :cond_13

    .line 350
    .line 351
    goto :goto_8

    .line 352
    :cond_13
    move-object v2, p0

    .line 353
    :goto_7
    check-cast p2, Ljava/lang/Boolean;

    .line 354
    .line 355
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 356
    .line 357
    .line 358
    move-result p2

    .line 359
    if-nez p2, :cond_e

    .line 360
    .line 361
    iget-object p2, v2, LHf/j;->c:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast p2, Lkotlin/jvm/internal/C;

    .line 364
    .line 365
    iput-boolean v6, p2, Lkotlin/jvm/internal/C;->a:Z

    .line 366
    .line 367
    const/4 p2, 0x0

    .line 368
    iput-object p2, v0, LHf/C;->a:LHf/j;

    .line 369
    .line 370
    iput-object p2, v0, LHf/C;->b:Ljava/lang/Object;

    .line 371
    .line 372
    iput v4, v0, LHf/C;->e:I

    .line 373
    .line 374
    iget-object p2, v2, LHf/j;->b:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast p2, LHf/m;

    .line 377
    .line 378
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    if-ne p1, v1, :cond_e

    .line 383
    .line 384
    :goto_8
    return-object v1

    .line 385
    :pswitch_4
    instance-of v0, p2, LHf/i;

    .line 386
    .line 387
    if-eqz v0, :cond_14

    .line 388
    .line 389
    move-object v0, p2

    .line 390
    check-cast v0, LHf/i;

    .line 391
    .line 392
    iget v1, v0, LHf/i;->c:I

    .line 393
    .line 394
    const/high16 v2, -0x80000000

    .line 395
    .line 396
    and-int v3, v1, v2

    .line 397
    .line 398
    if-eqz v3, :cond_14

    .line 399
    .line 400
    sub-int/2addr v1, v2

    .line 401
    iput v1, v0, LHf/i;->c:I

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_14
    new-instance v0, LHf/i;

    .line 405
    .line 406
    invoke-direct {v0, p0, p2}, LHf/i;-><init>(LHf/j;Ljf/c;)V

    .line 407
    .line 408
    .line 409
    :goto_9
    iget-object p2, v0, LHf/i;->a:Ljava/lang/Object;

    .line 410
    .line 411
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 412
    .line 413
    iget v2, v0, LHf/i;->c:I

    .line 414
    .line 415
    sget-object v3, Lef/C;->a:Lef/C;

    .line 416
    .line 417
    const/4 v4, 0x1

    .line 418
    if-eqz v2, :cond_17

    .line 419
    .line 420
    if-ne v2, v4, :cond_16

    .line 421
    .line 422
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :cond_15
    move-object v1, v3

    .line 426
    goto :goto_a

    .line 427
    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 428
    .line 429
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 430
    .line 431
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw p1

    .line 435
    :cond_17
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    iget-object p2, p0, LHf/j;->c:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast p2, LHf/k;

    .line 441
    .line 442
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    iget-object p2, p0, LHf/j;->d:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast p2, Lkotlin/jvm/internal/G;

    .line 448
    .line 449
    iget-object v2, p2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 450
    .line 451
    sget-object v5, LIf/c;->b:LH6/g;

    .line 452
    .line 453
    if-eq v2, v5, :cond_18

    .line 454
    .line 455
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-nez v2, :cond_15

    .line 460
    .line 461
    :cond_18
    iput-object p1, p2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 462
    .line 463
    iput v4, v0, LHf/i;->c:I

    .line 464
    .line 465
    iget-object p2, p0, LHf/j;->b:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast p2, LHf/m;

    .line 468
    .line 469
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    if-ne p1, v1, :cond_15

    .line 474
    .line 475
    :goto_a
    return-object v1

    .line 476
    nop

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
