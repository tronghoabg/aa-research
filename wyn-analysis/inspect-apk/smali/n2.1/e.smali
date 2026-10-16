.class public final Ln2/e;
.super Ln2/m;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final e:I

.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:Ln2/i;

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:I

.field public final p:I

.field public final q:Z

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:Z

.field public final w:Z

.field public final x:Z


# direct methods
.method public constructor <init>(ILN1/O;ILn2/i;IZLn2/d;I)V
    .locals 13

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    invoke-direct/range {p0 .. p3}, Ln2/m;-><init>(ILN1/O;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ln2/e;->h:Ln2/i;

    .line 15
    .line 16
    iget-boolean p1, v0, Ln2/i;->u:Z

    .line 17
    .line 18
    const/16 v7, 0x18

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move p1, v7

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 p1, 0x10

    .line 25
    .line 26
    :goto_0
    iput-boolean v5, p0, Ln2/e;->m:Z

    .line 27
    .line 28
    iget-object v8, p0, Ln2/m;->d:LN1/n;

    .line 29
    .line 30
    iget-object v8, v8, LN1/n;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v8}, Ln2/o;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    iput-object v8, p0, Ln2/e;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1, v5}, LR8/v;->c(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    iput-boolean v8, p0, Ln2/e;->i:Z

    .line 43
    .line 44
    move v8, v5

    .line 45
    :goto_1
    iget-object v9, v0, LN1/T;->i:Ll8/e0;

    .line 46
    .line 47
    iget v10, v9, Ll8/e0;->d:I

    .line 48
    .line 49
    const v11, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-ge v8, v10, :cond_2

    .line 53
    .line 54
    iget-object v10, p0, Ln2/m;->d:LN1/n;

    .line 55
    .line 56
    invoke-virtual {v9, v8}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v10, v9, v5}, Ln2/o;->c(LN1/n;Ljava/lang/String;Z)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-lez v9, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    add-int/2addr v8, v6

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move v9, v5

    .line 72
    move v8, v11

    .line 73
    :goto_2
    iput v8, p0, Ln2/e;->k:I

    .line 74
    .line 75
    iput v9, p0, Ln2/e;->j:I

    .line 76
    .line 77
    iget-object v8, p0, Ln2/m;->d:LN1/n;

    .line 78
    .line 79
    iget v8, v8, LN1/n;->f:I

    .line 80
    .line 81
    if-eqz v8, :cond_3

    .line 82
    .line 83
    if-nez v8, :cond_3

    .line 84
    .line 85
    move v8, v11

    .line 86
    goto :goto_3

    .line 87
    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->bitCount(I)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    :goto_3
    iput v8, p0, Ln2/e;->l:I

    .line 92
    .line 93
    iget-object v8, p0, Ln2/m;->d:LN1/n;

    .line 94
    .line 95
    iget v9, v8, LN1/n;->f:I

    .line 96
    .line 97
    if-eqz v9, :cond_5

    .line 98
    .line 99
    and-int/2addr v9, v6

    .line 100
    if-eqz v9, :cond_4

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_4
    move v9, v5

    .line 104
    goto :goto_5

    .line 105
    :cond_5
    :goto_4
    move v9, v6

    .line 106
    :goto_5
    iput-boolean v9, p0, Ln2/e;->n:Z

    .line 107
    .line 108
    iget v9, v8, LN1/n;->e:I

    .line 109
    .line 110
    and-int/2addr v9, v6

    .line 111
    if-eqz v9, :cond_6

    .line 112
    .line 113
    move v9, v6

    .line 114
    goto :goto_6

    .line 115
    :cond_6
    move v9, v5

    .line 116
    :goto_6
    iput-boolean v9, p0, Ln2/e;->q:Z

    .line 117
    .line 118
    iget-object v9, v8, LN1/n;->n:Ljava/lang/String;

    .line 119
    .line 120
    if-nez v9, :cond_7

    .line 121
    .line 122
    goto :goto_9

    .line 123
    :cond_7
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    sparse-switch v10, :sswitch_data_0

    .line 128
    .line 129
    .line 130
    :goto_7
    move v9, v4

    .line 131
    goto :goto_8

    .line 132
    :sswitch_0
    const-string v10, "audio/iamf"

    .line 133
    .line 134
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-nez v9, :cond_8

    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_8
    move v9, v3

    .line 142
    goto :goto_8

    .line 143
    :sswitch_1
    const-string v10, "audio/ac4"

    .line 144
    .line 145
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-nez v9, :cond_9

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_9
    move v9, v6

    .line 153
    goto :goto_8

    .line 154
    :sswitch_2
    const-string v10, "audio/eac3-joc"

    .line 155
    .line 156
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-nez v9, :cond_a

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_a
    move v9, v5

    .line 164
    :goto_8
    packed-switch v9, :pswitch_data_0

    .line 165
    .line 166
    .line 167
    :goto_9
    move v9, v5

    .line 168
    goto :goto_a

    .line 169
    :pswitch_0
    move v9, v6

    .line 170
    :goto_a
    iput-boolean v9, p0, Ln2/e;->x:Z

    .line 171
    .line 172
    iget v9, v8, LN1/n;->C:I

    .line 173
    .line 174
    iput v9, p0, Ln2/e;->r:I

    .line 175
    .line 176
    iget v10, v8, LN1/n;->D:I

    .line 177
    .line 178
    iput v10, p0, Ln2/e;->s:I

    .line 179
    .line 180
    iget v10, v8, LN1/n;->j:I

    .line 181
    .line 182
    iput v10, p0, Ln2/e;->t:I

    .line 183
    .line 184
    if-eq v10, v4, :cond_b

    .line 185
    .line 186
    iget v12, v0, LN1/T;->k:I

    .line 187
    .line 188
    if-gt v10, v12, :cond_d

    .line 189
    .line 190
    :cond_b
    if-eq v9, v4, :cond_c

    .line 191
    .line 192
    iget v10, v0, LN1/T;->j:I

    .line 193
    .line 194
    if-gt v9, v10, :cond_d

    .line 195
    .line 196
    :cond_c
    move-object/from16 v9, p7

    .line 197
    .line 198
    invoke-virtual {v9, v8}, Ln2/d;->apply(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eqz v8, :cond_d

    .line 203
    .line 204
    move v8, v6

    .line 205
    goto :goto_b

    .line 206
    :cond_d
    move v8, v5

    .line 207
    :goto_b
    iput-boolean v8, p0, Ln2/e;->f:Z

    .line 208
    .line 209
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    sget v9, LQ1/x;->a:I

    .line 218
    .line 219
    if-lt v9, v7, :cond_e

    .line 220
    .line 221
    invoke-static {v8}, Ld2/b;->e(Landroid/content/res/Configuration;)Landroid/os/LocaleList;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-static {v7}, Ld2/b;->C(Landroid/os/LocaleList;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    const-string v8, ","

    .line 230
    .line 231
    invoke-virtual {v7, v8, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    goto :goto_c

    .line 236
    :cond_e
    iget-object v7, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 237
    .line 238
    invoke-virtual {v7}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    filled-new-array {v7}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    :goto_c
    move v8, v5

    .line 247
    :goto_d
    array-length v9, v7

    .line 248
    if-ge v8, v9, :cond_f

    .line 249
    .line 250
    aget-object v9, v7, v8

    .line 251
    .line 252
    invoke-static {v9}, LQ1/x;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    aput-object v9, v7, v8

    .line 257
    .line 258
    add-int/2addr v8, v6

    .line 259
    goto :goto_d

    .line 260
    :cond_f
    move v8, v5

    .line 261
    :goto_e
    array-length v9, v7

    .line 262
    if-ge v8, v9, :cond_11

    .line 263
    .line 264
    iget-object v9, p0, Ln2/m;->d:LN1/n;

    .line 265
    .line 266
    aget-object v10, v7, v8

    .line 267
    .line 268
    invoke-static {v9, v10, v5}, Ln2/o;->c(LN1/n;Ljava/lang/String;Z)I

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-lez v9, :cond_10

    .line 273
    .line 274
    goto :goto_f

    .line 275
    :cond_10
    add-int/2addr v8, v6

    .line 276
    goto :goto_e

    .line 277
    :cond_11
    move v9, v5

    .line 278
    move v8, v11

    .line 279
    :goto_f
    iput v8, p0, Ln2/e;->o:I

    .line 280
    .line 281
    iput v9, p0, Ln2/e;->p:I

    .line 282
    .line 283
    move v7, v5

    .line 284
    :goto_10
    iget-object v8, v0, LN1/T;->l:Ll8/e0;

    .line 285
    .line 286
    iget v9, v8, Ll8/e0;->d:I

    .line 287
    .line 288
    if-ge v7, v9, :cond_13

    .line 289
    .line 290
    iget-object v9, p0, Ln2/m;->d:LN1/n;

    .line 291
    .line 292
    iget-object v9, v9, LN1/n;->n:Ljava/lang/String;

    .line 293
    .line 294
    if-eqz v9, :cond_12

    .line 295
    .line 296
    invoke-virtual {v8, v7}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    if-eqz v8, :cond_12

    .line 305
    .line 306
    move v11, v7

    .line 307
    goto :goto_11

    .line 308
    :cond_12
    add-int/2addr v7, v6

    .line 309
    goto :goto_10

    .line 310
    :cond_13
    :goto_11
    iput v11, p0, Ln2/e;->u:I

    .line 311
    .line 312
    and-int/lit16 v0, v1, 0x180

    .line 313
    .line 314
    const/16 v7, 0x80

    .line 315
    .line 316
    if-ne v0, v7, :cond_14

    .line 317
    .line 318
    move v0, v6

    .line 319
    goto :goto_12

    .line 320
    :cond_14
    move v0, v5

    .line 321
    :goto_12
    iput-boolean v0, p0, Ln2/e;->v:Z

    .line 322
    .line 323
    and-int/lit8 v0, v1, 0x40

    .line 324
    .line 325
    if-ne v0, v2, :cond_15

    .line 326
    .line 327
    move v0, v6

    .line 328
    goto :goto_13

    .line 329
    :cond_15
    move v0, v5

    .line 330
    :goto_13
    iput-boolean v0, p0, Ln2/e;->w:Z

    .line 331
    .line 332
    iget-object v0, p0, Ln2/e;->h:Ln2/i;

    .line 333
    .line 334
    iget-boolean v2, v0, Ln2/i;->w:Z

    .line 335
    .line 336
    invoke-static {v1, v2}, LR8/v;->c(IZ)Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-nez v2, :cond_16

    .line 341
    .line 342
    :goto_14
    move v3, v5

    .line 343
    goto :goto_15

    .line 344
    :cond_16
    iget-boolean v2, p0, Ln2/e;->f:Z

    .line 345
    .line 346
    if-nez v2, :cond_17

    .line 347
    .line 348
    iget-boolean v7, v0, Ln2/i;->t:Z

    .line 349
    .line 350
    if-nez v7, :cond_17

    .line 351
    .line 352
    goto :goto_14

    .line 353
    :cond_17
    iget-object v7, v0, LN1/T;->m:LN1/Q;

    .line 354
    .line 355
    iget v8, v7, LN1/Q;->a:I

    .line 356
    .line 357
    iget-object v9, p0, Ln2/m;->d:LN1/n;

    .line 358
    .line 359
    if-ne v8, v3, :cond_18

    .line 360
    .line 361
    invoke-static {v0, v1, v9}, Ln2/o;->h(Ln2/i;ILN1/n;)Z

    .line 362
    .line 363
    .line 364
    move-result v8

    .line 365
    if-nez v8, :cond_18

    .line 366
    .line 367
    goto :goto_14

    .line 368
    :cond_18
    invoke-static {v1, v5}, LR8/v;->c(IZ)Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    if-eqz v5, :cond_1a

    .line 373
    .line 374
    if-eqz v2, :cond_1a

    .line 375
    .line 376
    iget v2, v9, LN1/n;->j:I

    .line 377
    .line 378
    if-eq v2, v4, :cond_1a

    .line 379
    .line 380
    iget-boolean v0, v0, Ln2/i;->x:Z

    .line 381
    .line 382
    if-nez v0, :cond_19

    .line 383
    .line 384
    if-nez p6, :cond_1a

    .line 385
    .line 386
    :cond_19
    iget v0, v7, LN1/Q;->a:I

    .line 387
    .line 388
    if-eq v0, v3, :cond_1a

    .line 389
    .line 390
    and-int/2addr p1, v1

    .line 391
    if-eqz p1, :cond_1a

    .line 392
    .line 393
    goto :goto_15

    .line 394
    :cond_1a
    move v3, v6

    .line 395
    :goto_15
    iput v3, p0, Ln2/e;->e:I

    .line 396
    .line 397
    return-void

    .line 398
    nop

    .line 399
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59afdf4a -> :sswitch_0
    .end sparse-switch

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ln2/e;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final b(Ln2/m;)Z
    .locals 5

    .line 1
    check-cast p1, Ln2/e;

    .line 2
    .line 3
    iget-object v0, p0, Ln2/e;->h:Ln2/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ln2/m;->d:LN1/n;

    .line 9
    .line 10
    iget v1, v0, LN1/n;->C:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v3, p1, Ln2/m;->d:LN1/n;

    .line 16
    .line 17
    iget v4, v3, LN1/n;->C:I

    .line 18
    .line 19
    if-ne v1, v4, :cond_1

    .line 20
    .line 21
    iget-boolean v1, p0, Ln2/e;->m:Z

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, LN1/n;->n:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v4, v3, LN1/n;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :cond_0
    iget v0, v0, LN1/n;->D:I

    .line 38
    .line 39
    if-eq v0, v2, :cond_1

    .line 40
    .line 41
    iget v1, v3, LN1/n;->D:I

    .line 42
    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    iget-boolean v0, p1, Ln2/e;->v:Z

    .line 46
    .line 47
    iget-boolean v1, p0, Ln2/e;->v:Z

    .line 48
    .line 49
    if-ne v1, v0, :cond_1

    .line 50
    .line 51
    iget-boolean v0, p0, Ln2/e;->w:Z

    .line 52
    .line 53
    iget-boolean p1, p1, Ln2/e;->w:Z

    .line 54
    .line 55
    if-ne v0, p1, :cond_1

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_1
    const/4 p1, 0x0

    .line 60
    return p1
.end method

.method public final c(Ln2/e;)I
    .locals 6

    .line 1
    iget-boolean v0, p0, Ln2/e;->i:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Ln2/e;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v2, Ln2/o;->j:Ll8/d0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, Ln2/o;->j:Ll8/d0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ll8/d0;->a()Ll8/d0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    sget-object v3, Ll8/A;->a:Ll8/y;

    .line 19
    .line 20
    iget-boolean v4, p1, Ln2/e;->i:Z

    .line 21
    .line 22
    invoke-virtual {v3, v0, v4}, Ll8/y;->c(ZZ)Ll8/A;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v3, p0, Ln2/e;->k:I

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget v4, p1, Ln2/e;->k:I

    .line 33
    .line 34
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v5, Ll8/c0;->c:Ll8/c0;

    .line 39
    .line 40
    invoke-virtual {v0, v3, v4, v5}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v3, p0, Ln2/e;->j:I

    .line 45
    .line 46
    iget v4, p1, Ln2/e;->j:I

    .line 47
    .line 48
    invoke-virtual {v0, v3, v4}, Ll8/A;->a(II)Ll8/A;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget v3, p0, Ln2/e;->l:I

    .line 53
    .line 54
    iget v4, p1, Ln2/e;->l:I

    .line 55
    .line 56
    invoke-virtual {v0, v3, v4}, Ll8/A;->a(II)Ll8/A;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-boolean v3, p0, Ln2/e;->q:Z

    .line 61
    .line 62
    iget-boolean v4, p1, Ln2/e;->q:Z

    .line 63
    .line 64
    invoke-virtual {v0, v3, v4}, Ll8/A;->c(ZZ)Ll8/A;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-boolean v3, p0, Ln2/e;->n:Z

    .line 69
    .line 70
    iget-boolean v4, p1, Ln2/e;->n:Z

    .line 71
    .line 72
    invoke-virtual {v0, v3, v4}, Ll8/A;->c(ZZ)Ll8/A;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget v3, p0, Ln2/e;->o:I

    .line 77
    .line 78
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iget v4, p1, Ln2/e;->o:I

    .line 83
    .line 84
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v0, v3, v4, v5}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget v3, p0, Ln2/e;->p:I

    .line 93
    .line 94
    iget v4, p1, Ln2/e;->p:I

    .line 95
    .line 96
    invoke-virtual {v0, v3, v4}, Ll8/A;->a(II)Ll8/A;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-boolean v3, p1, Ln2/e;->f:Z

    .line 101
    .line 102
    invoke-virtual {v0, v1, v3}, Ll8/A;->c(ZZ)Ll8/A;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget v1, p0, Ln2/e;->u:I

    .line 107
    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iget v3, p1, Ln2/e;->u:I

    .line 113
    .line 114
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v0, v1, v3, v5}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v1, p0, Ln2/e;->h:Ln2/i;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-boolean v1, p0, Ln2/e;->v:Z

    .line 128
    .line 129
    iget-boolean v3, p1, Ln2/e;->v:Z

    .line 130
    .line 131
    invoke-virtual {v0, v1, v3}, Ll8/A;->c(ZZ)Ll8/A;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-boolean v1, p0, Ln2/e;->w:Z

    .line 136
    .line 137
    iget-boolean v3, p1, Ln2/e;->w:Z

    .line 138
    .line 139
    invoke-virtual {v0, v1, v3}, Ll8/A;->c(ZZ)Ll8/A;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-boolean v1, p0, Ln2/e;->x:Z

    .line 144
    .line 145
    iget-boolean v3, p1, Ln2/e;->x:Z

    .line 146
    .line 147
    invoke-virtual {v0, v1, v3}, Ll8/A;->c(ZZ)Ll8/A;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget v1, p0, Ln2/e;->r:I

    .line 152
    .line 153
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget v3, p1, Ln2/e;->r:I

    .line 158
    .line 159
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v0, v1, v3, v2}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget v1, p0, Ln2/e;->s:I

    .line 168
    .line 169
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iget v3, p1, Ln2/e;->s:I

    .line 174
    .line 175
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v0, v1, v3, v2}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v1, p0, Ln2/e;->g:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v3, p1, Ln2/e;->g:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_1

    .line 192
    .line 193
    iget v1, p0, Ln2/e;->t:I

    .line 194
    .line 195
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    iget p1, p1, Ln2/e;->t:I

    .line 200
    .line 201
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {v0, v1, p1, v2}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :cond_1
    invoke-virtual {v0}, Ll8/A;->e()I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ln2/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln2/e;->c(Ln2/e;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
