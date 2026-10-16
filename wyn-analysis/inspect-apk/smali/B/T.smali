.class public final LB/T;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LB/T;->i:I

    iput-object p2, p0, LB/T;->j:Ljava/lang/Object;

    iput-object p3, p0, LB/T;->k:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LB/T;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LZ/k;

    .line 7
    .line 8
    check-cast p2, LN/o;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    const-string p3, "$this$composed"

    .line 16
    .line 17
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const p1, -0x3602df6f

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lu0/M;->e:LN/L0;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, LL0/b;

    .line 33
    .line 34
    sget-object p3, Lu0/M;->o:LN/L0;

    .line 35
    .line 36
    invoke-virtual {p2, p3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, Lu0/p0;

    .line 41
    .line 42
    const v0, 0x44faf204

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    sget-object v0, LN/k;->a:LN/P;

    .line 59
    .line 60
    if-ne v1, v0, :cond_1

    .line 61
    .line 62
    :cond_0
    new-instance v1, Lp0/t;

    .line 63
    .line 64
    invoke-direct {v1, p3, p1}, Lp0/t;-><init>(Lu0/p0;LL0/b;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    const/4 p1, 0x0

    .line 71
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 72
    .line 73
    .line 74
    check-cast v1, Lp0/t;

    .line 75
    .line 76
    new-instance p3, Lp0/u;

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    iget-object v2, p0, LB/T;->k:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Ltf/p;

    .line 82
    .line 83
    invoke-direct {p3, v1, v2, v0}, Lp0/u;-><init>(Lp0/t;Ltf/p;Ljf/c;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, LB/T;->j:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {v1, v0, p3, p2}, LN/d;->f(Ljava/lang/Object;Ljava/lang/Object;Ltf/p;LN/o;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :pswitch_0
    check-cast p1, LZ/k;

    .line 96
    .line 97
    check-cast p2, LN/o;

    .line 98
    .line 99
    check-cast p3, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    const-string p3, "$this$composed"

    .line 105
    .line 106
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const p1, 0x187562b7

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 113
    .line 114
    .line 115
    const p1, 0x2e20b340

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 119
    .line 120
    .line 121
    const p1, -0x1d58f75c

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    sget-object v0, LN/k;->a:LN/P;

    .line 132
    .line 133
    if-ne p3, v0, :cond_2

    .line 134
    .line 135
    sget-object p3, Ljf/i;->a:Ljf/i;

    .line 136
    .line 137
    invoke-static {p3, p2}, LN/d;->x(Ljf/h;LN/o;)LKd/a;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    new-instance v1, LN/t;

    .line 142
    .line 143
    invoke-direct {v1, p3}, LN/t;-><init>(LKd/a;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    move-object p3, v1

    .line 150
    :cond_2
    const/4 v1, 0x0

    .line 151
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 152
    .line 153
    .line 154
    check-cast p3, LN/t;

    .line 155
    .line 156
    iget-object p3, p3, LN/t;->a:LKd/a;

    .line 157
    .line 158
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 159
    .line 160
    .line 161
    const v2, 0x5fd2422

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v2}, LN/o;->M(I)V

    .line 165
    .line 166
    .line 167
    iget-object v2, p0, LB/T;->j:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Lo0/c;

    .line 170
    .line 171
    if-nez v2, :cond_4

    .line 172
    .line 173
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-ne p1, v0, :cond_3

    .line 181
    .line 182
    new-instance p1, Lo0/c;

    .line 183
    .line 184
    invoke-direct {p1}, Lo0/c;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, p1}, LN/o;->U(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_3
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 191
    .line 192
    .line 193
    move-object v2, p1

    .line 194
    check-cast v2, Lo0/c;

    .line 195
    .line 196
    :cond_4
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 197
    .line 198
    .line 199
    const p1, 0x607fb4c4

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, LB/T;->k:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast p1, LM0/n;

    .line 208
    .line 209
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    invoke-virtual {p2, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    or-int/2addr v3, v4

    .line 218
    invoke-virtual {p2, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    or-int/2addr v3, v4

    .line 223
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    if-nez v3, :cond_5

    .line 228
    .line 229
    if-ne v4, v0, :cond_6

    .line 230
    .line 231
    :cond_5
    iput-object p3, v2, Lo0/c;->b:LKd/a;

    .line 232
    .line 233
    new-instance v4, Lo0/f;

    .line 234
    .line 235
    invoke-direct {v4, v2, p1}, Lo0/f;-><init>(Lo0/c;LM0/n;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_6
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 242
    .line 243
    .line 244
    check-cast v4, Lo0/f;

    .line 245
    .line 246
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 247
    .line 248
    .line 249
    return-object v4

    .line 250
    :pswitch_1
    check-cast p1, Lz0/j;

    .line 251
    .line 252
    check-cast p2, Ljava/lang/Number;

    .line 253
    .line 254
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result p2

    .line 258
    check-cast p3, Ljava/lang/Number;

    .line 259
    .line 260
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 261
    .line 262
    .line 263
    move-result p3

    .line 264
    const-string v0, "spanStyle"

    .line 265
    .line 266
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    new-instance v0, LC0/b;

    .line 270
    .line 271
    iget-object v1, p1, Lz0/j;->c:LE0/l;

    .line 272
    .line 273
    if-nez v1, :cond_7

    .line 274
    .line 275
    sget-object v1, LE0/l;->d:LE0/l;

    .line 276
    .line 277
    :cond_7
    iget-object v2, p1, Lz0/j;->d:LE0/j;

    .line 278
    .line 279
    if-eqz v2, :cond_8

    .line 280
    .line 281
    iget v2, v2, LE0/j;->a:I

    .line 282
    .line 283
    goto :goto_0

    .line 284
    :cond_8
    const/4 v2, 0x0

    .line 285
    :goto_0
    iget-object v3, p1, Lz0/j;->e:LE0/k;

    .line 286
    .line 287
    if-eqz v3, :cond_9

    .line 288
    .line 289
    iget v3, v3, LE0/k;->a:I

    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_9
    const/4 v3, 0x1

    .line 293
    :goto_1
    iget-object v4, p0, LB/T;->k:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v4, LH0/b;

    .line 296
    .line 297
    const-string v5, "fontWeight"

    .line 298
    .line 299
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    iget-object v4, v4, LH0/b;->j:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v4, LH0/c;

    .line 305
    .line 306
    iget-object v5, v4, LH0/c;->e:LE0/e;

    .line 307
    .line 308
    check-cast v5, LE0/f;

    .line 309
    .line 310
    iget-object p1, p1, Lz0/j;->f:LE0/o;

    .line 311
    .line 312
    invoke-virtual {v5, p1, v1, v2, v3}, LE0/f;->b(LE0/o;LE0/l;II)LE0/q;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    new-instance v1, LH0/e;

    .line 317
    .line 318
    invoke-direct {v1, p1}, LH0/e;-><init>(LE0/q;)V

    .line 319
    .line 320
    .line 321
    iget-object p1, v4, LH0/c;->j:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    iget-object p1, v1, LH0/e;->b:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast p1, Landroid/graphics/Typeface;

    .line 329
    .line 330
    invoke-direct {v0, p1}, LC0/b;-><init>(Landroid/graphics/Typeface;)V

    .line 331
    .line 332
    .line 333
    iget-object p1, p0, LB/T;->j:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast p1, Landroid/text/SpannableString;

    .line 336
    .line 337
    const/16 v1, 0x21

    .line 338
    .line 339
    invoke-virtual {p1, v0, p2, p3, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 340
    .line 341
    .line 342
    sget-object p1, Lef/C;->a:Lef/C;

    .line 343
    .line 344
    return-object p1

    .line 345
    :pswitch_2
    check-cast p1, LZ/k;

    .line 346
    .line 347
    check-cast p2, LN/o;

    .line 348
    .line 349
    check-cast p3, Ljava/lang/Number;

    .line 350
    .line 351
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 352
    .line 353
    .line 354
    const-string p3, "$this$composed"

    .line 355
    .line 356
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    const p1, -0x15193045

    .line 360
    .line 361
    .line 362
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 363
    .line 364
    .line 365
    iget-object p1, p0, LB/T;->j:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast p1, LB/Q;

    .line 368
    .line 369
    if-nez p1, :cond_a

    .line 370
    .line 371
    sget-object p1, LB/w;->c:LB/w;

    .line 372
    .line 373
    :cond_a
    iget-object p3, p0, LB/T;->k:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast p3, LD/i;

    .line 376
    .line 377
    invoke-interface {p1, p3, p2}, LB/Q;->a(LD/i;LN/o;)LB/S;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    const p3, 0x44faf204

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p3

    .line 391
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-nez p3, :cond_b

    .line 396
    .line 397
    sget-object p3, LN/k;->a:LN/P;

    .line 398
    .line 399
    if-ne v0, p3, :cond_c

    .line 400
    .line 401
    :cond_b
    new-instance v0, LB/V;

    .line 402
    .line 403
    invoke-direct {v0, p1}, LB/V;-><init>(LB/S;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p2, v0}, LN/o;->U(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    :cond_c
    const/4 p1, 0x0

    .line 410
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 411
    .line 412
    .line 413
    check-cast v0, LB/V;

    .line 414
    .line 415
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 416
    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
