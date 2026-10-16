.class public final LA0/e;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA0/e;->i:I

    iput-object p2, p0, LA0/e;->j:Ljava/lang/Object;

    iput-object p3, p0, LA0/e;->k:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, LA0/e;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA0/e;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/content/Context;

    .line 9
    .line 10
    iget-object v1, p0, LA0/e;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lw1/b;

    .line 13
    .line 14
    iget-object v1, v1, Lw1/b;->a:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "name"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, ".preferences_pb"

    .line 22
    .line 23
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "fileName"

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ljava/io/File;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v3, "datastore/"

    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :pswitch_0
    iget-object v0, p0, LA0/e;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lt0/y;

    .line 55
    .line 56
    iget-object v1, v0, Lt0/y;->s:[LX0/E;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    aget-object v1, v1, v2

    .line 60
    .line 61
    check-cast v1, Lt0/f;

    .line 62
    .line 63
    iget-object v2, p0, LA0/e;->k:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Le0/o;

    .line 66
    .line 67
    if-nez v1, :cond_0

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Lt0/y;->Z(Le0/o;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v1, v2}, Lt0/f;->j(Le0/o;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_1
    iget-object v0, p0, LA0/e;->j:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lx/r;

    .line 82
    .line 83
    iget-object v1, v0, Lx/r;->b:[Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v0, v0, Lx/r;->a:[J

    .line 86
    .line 87
    array-length v2, v0

    .line 88
    add-int/lit8 v2, v2, -0x2

    .line 89
    .line 90
    if-ltz v2, :cond_4

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    move v4, v3

    .line 94
    :goto_1
    aget-wide v5, v0, v4

    .line 95
    .line 96
    not-long v7, v5

    .line 97
    const/4 v9, 0x7

    .line 98
    shl-long/2addr v7, v9

    .line 99
    and-long/2addr v7, v5

    .line 100
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v7, v9

    .line 106
    cmp-long v7, v7, v9

    .line 107
    .line 108
    if-eqz v7, :cond_3

    .line 109
    .line 110
    sub-int v7, v4, v2

    .line 111
    .line 112
    not-int v7, v7

    .line 113
    ushr-int/lit8 v7, v7, 0x1f

    .line 114
    .line 115
    const/16 v8, 0x8

    .line 116
    .line 117
    rsub-int/lit8 v7, v7, 0x8

    .line 118
    .line 119
    move v9, v3

    .line 120
    :goto_2
    if-ge v9, v7, :cond_2

    .line 121
    .line 122
    const-wide/16 v10, 0xff

    .line 123
    .line 124
    and-long/2addr v10, v5

    .line 125
    const-wide/16 v12, 0x80

    .line 126
    .line 127
    cmp-long v10, v10, v12

    .line 128
    .line 129
    if-gez v10, :cond_1

    .line 130
    .line 131
    shl-int/lit8 v10, v4, 0x3

    .line 132
    .line 133
    add-int/2addr v10, v9

    .line 134
    aget-object v10, v1, v10

    .line 135
    .line 136
    iget-object v11, p0, LA0/e;->k:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v11, LN/s;

    .line 139
    .line 140
    invoke-virtual {v11, v10}, LN/s;->w(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_1
    shr-long/2addr v5, v8

    .line 144
    add-int/lit8 v9, v9, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_2
    if-ne v7, v8, :cond_4

    .line 148
    .line 149
    :cond_3
    if-eq v4, v2, :cond_4

    .line 150
    .line 151
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    sget-object v0, Lef/C;->a:Lef/C;

    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_2
    iget-object v0, p0, LA0/e;->j:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, LD3/b;

    .line 160
    .line 161
    iget-object v0, v0, LD3/b;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, LE3/a;

    .line 164
    .line 165
    iget-object v1, p0, LA0/e;->k:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, LD3/i;

    .line 168
    .line 169
    invoke-interface {v0, v1}, LE3/a;->a(LD3/i;)V

    .line 170
    .line 171
    .line 172
    sget-object v0, Lef/C;->a:Lef/C;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_3
    iget-object v0, p0, LA0/e;->j:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lc0/o;

    .line 178
    .line 179
    invoke-virtual {v0}, Lc0/o;->a()V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, LA0/e;->k:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, LN/V;

    .line 185
    .line 186
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_4
    iget-object v0, p0, LA0/e;->j:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, LN/V;

    .line 199
    .line 200
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-nez v0, :cond_6

    .line 211
    .line 212
    iget-object v0, p0, LA0/e;->k:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v0, LA0/p;

    .line 215
    .line 216
    invoke-virtual {v0}, LA0/p;->invoke()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_5

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_5
    const/4 v0, 0x0

    .line 230
    goto :goto_4

    .line 231
    :cond_6
    :goto_3
    const/4 v0, 0x1

    .line 232
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    return-object v0

    .line 237
    :pswitch_5
    const-string v0, "text"

    .line 238
    .line 239
    iget-object v1, p0, LA0/e;->j:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, Ljava/lang/CharSequence;

    .line 242
    .line 243
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const-string v0, "paint"

    .line 247
    .line 248
    iget-object v2, p0, LA0/e;->k:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v2, Landroid/text/TextPaint;

    .line 251
    .line 252
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    new-instance v3, LA0/a;

    .line 264
    .line 265
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-direct {v3, v1, v4}, LA0/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v3}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 273
    .line 274
    .line 275
    new-instance v3, Ljava/util/PriorityQueue;

    .line 276
    .line 277
    new-instance v4, LA0/f;

    .line 278
    .line 279
    const/4 v5, 0x0

    .line 280
    invoke-direct {v4, v5}, LA0/f;-><init>(I)V

    .line 281
    .line 282
    .line 283
    const/16 v5, 0xa

    .line 284
    .line 285
    invoke-direct {v3, v5, v4}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    const/4 v6, 0x0

    .line 293
    :goto_5
    const/4 v7, -0x1

    .line 294
    if-eq v4, v7, :cond_9

    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    .line 297
    .line 298
    .line 299
    move-result v7

    .line 300
    if-ge v7, v5, :cond_7

    .line 301
    .line 302
    new-instance v7, Lef/k;

    .line 303
    .line 304
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-direct {v7, v6, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_7
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    check-cast v7, Lef/k;

    .line 324
    .line 325
    if-eqz v7, :cond_8

    .line 326
    .line 327
    iget-object v8, v7, Lef/k;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v8, Ljava/lang/Number;

    .line 330
    .line 331
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    iget-object v7, v7, Lef/k;->a:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v7, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    sub-int/2addr v8, v7

    .line 344
    sub-int v7, v4, v6

    .line 345
    .line 346
    if-ge v8, v7, :cond_8

    .line 347
    .line 348
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    new-instance v7, Lef/k;

    .line 352
    .line 353
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    invoke-direct {v7, v6, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    :cond_8
    :goto_6
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    move v14, v6

    .line 372
    move v6, v4

    .line 373
    move v4, v14

    .line 374
    goto :goto_5

    .line 375
    :cond_9
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const/4 v3, 0x0

    .line 380
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    if-eqz v4, :cond_a

    .line 385
    .line 386
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    check-cast v4, Lef/k;

    .line 391
    .line 392
    iget-object v5, v4, Lef/k;->a:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v5, Ljava/lang/Number;

    .line 395
    .line 396
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 397
    .line 398
    .line 399
    move-result v5

    .line 400
    iget-object v4, v4, Lef/k;->b:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v4, Ljava/lang/Number;

    .line 403
    .line 404
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    invoke-static {v1, v5, v4, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    goto :goto_7

    .line 417
    :cond_a
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    return-object v0

    .line 422
    nop

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
