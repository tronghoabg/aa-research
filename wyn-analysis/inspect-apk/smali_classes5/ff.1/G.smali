.class public final Lff/G;
.super Llf/i;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/util/Iterator;

.field public c:I

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lff/G;->g:Ljava/util/Iterator;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/i;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, Lff/G;

    .line 2
    .line 3
    iget-object v1, p0, Lff/G;->g:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lff/G;-><init>(Ljava/util/Iterator;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lff/G;->f:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LAf/m;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lff/G;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lff/G;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lff/G;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, v0, Lff/G;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v2, LAf/m;

    .line 7
    .line 8
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 9
    .line 10
    iget v4, v0, Lff/G;->e:I

    .line 11
    .line 12
    const/16 v5, 0x14

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v4, :cond_c

    .line 17
    .line 18
    if-eq v4, v1, :cond_b

    .line 19
    .line 20
    if-eq v4, v6, :cond_a

    .line 21
    .line 22
    const/4 v6, 0x5

    .line 23
    const/4 v8, 0x4

    .line 24
    const/4 v9, 0x3

    .line 25
    if-eq v4, v9, :cond_2

    .line 26
    .line 27
    if-eq v4, v8, :cond_1

    .line 28
    .line 29
    if-ne v4, v6, :cond_0

    .line 30
    .line 31
    iget-object v1, v0, Lff/G;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lff/E;

    .line 34
    .line 35
    :goto_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :cond_1
    iget v1, v0, Lff/G;->d:I

    .line 49
    .line 50
    iget v4, v0, Lff/G;->c:I

    .line 51
    .line 52
    iget-object v9, v0, Lff/G;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v9, Lff/E;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v9}, Lff/E;->a()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_2
    iget v4, v0, Lff/G;->d:I

    .line 65
    .line 66
    iget v10, v0, Lff/G;->c:I

    .line 67
    .line 68
    iget-object v11, v0, Lff/G;->b:Ljava/util/Iterator;

    .line 69
    .line 70
    check-cast v11, Ljava/util/Iterator;

    .line 71
    .line 72
    iget-object v12, v0, Lff/G;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v12, Lff/E;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12}, Lff/E;->a()V

    .line 80
    .line 81
    .line 82
    :cond_3
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-eqz v13, :cond_8

    .line 87
    .line 88
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    invoke-virtual {v12}, Lff/a;->size()I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    iget v15, v12, Lff/E;->b:I

    .line 97
    .line 98
    if-eq v14, v15, :cond_7

    .line 99
    .line 100
    iget v14, v12, Lff/E;->c:I

    .line 101
    .line 102
    invoke-virtual {v12}, Lff/a;->size()I

    .line 103
    .line 104
    .line 105
    move-result v16

    .line 106
    add-int v16, v16, v14

    .line 107
    .line 108
    rem-int v16, v16, v15

    .line 109
    .line 110
    iget-object v14, v12, Lff/E;->a:[Ljava/lang/Object;

    .line 111
    .line 112
    aput-object v13, v14, v16

    .line 113
    .line 114
    invoke-virtual {v12}, Lff/a;->size()I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    add-int/2addr v13, v1

    .line 119
    iput v13, v12, Lff/E;->d:I

    .line 120
    .line 121
    invoke-virtual {v12}, Lff/a;->size()I

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    if-ne v13, v15, :cond_3

    .line 126
    .line 127
    invoke-virtual {v12}, Lff/a;->size()I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-ge v13, v5, :cond_6

    .line 132
    .line 133
    shr-int/lit8 v13, v15, 0x1

    .line 134
    .line 135
    add-int/2addr v15, v13

    .line 136
    add-int/2addr v15, v1

    .line 137
    if-le v15, v5, :cond_4

    .line 138
    .line 139
    move v15, v5

    .line 140
    :cond_4
    iget v13, v12, Lff/E;->c:I

    .line 141
    .line 142
    if-nez v13, :cond_5

    .line 143
    .line 144
    invoke-static {v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    const-string v14, "copyOf(...)"

    .line 149
    .line 150
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    new-array v13, v15, [Ljava/lang/Object;

    .line 155
    .line 156
    invoke-virtual {v12, v13}, Lff/E;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    :goto_2
    new-instance v14, Lff/E;

    .line 161
    .line 162
    invoke-virtual {v12}, Lff/a;->size()I

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    invoke-direct {v14, v13, v12}, Lff/E;-><init>([Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    move-object v12, v14

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v1, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 174
    .line 175
    .line 176
    iput-object v2, v0, Lff/G;->f:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v12, v0, Lff/G;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v11, Ljava/util/Iterator;

    .line 181
    .line 182
    iput-object v11, v0, Lff/G;->b:Ljava/util/Iterator;

    .line 183
    .line 184
    iput v10, v0, Lff/G;->c:I

    .line 185
    .line 186
    iput v4, v0, Lff/G;->d:I

    .line 187
    .line 188
    iput v9, v0, Lff/G;->e:I

    .line 189
    .line 190
    invoke-virtual {v2, v1, v0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 191
    .line 192
    .line 193
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 194
    .line 195
    return-object v3

    .line 196
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 197
    .line 198
    const-string v2, "ring buffer is full"

    .line 199
    .line 200
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v1

    .line 204
    :cond_8
    move v1, v4

    .line 205
    move v4, v10

    .line 206
    move-object v9, v12

    .line 207
    :goto_3
    invoke-virtual {v9}, Lff/a;->size()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-le v10, v5, :cond_9

    .line 212
    .line 213
    new-instance v5, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 216
    .line 217
    .line 218
    iput-object v2, v0, Lff/G;->f:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v9, v0, Lff/G;->a:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object v7, v0, Lff/G;->b:Ljava/util/Iterator;

    .line 223
    .line 224
    iput v4, v0, Lff/G;->c:I

    .line 225
    .line 226
    iput v1, v0, Lff/G;->d:I

    .line 227
    .line 228
    iput v8, v0, Lff/G;->e:I

    .line 229
    .line 230
    invoke-virtual {v2, v5, v0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 231
    .line 232
    .line 233
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 234
    .line 235
    return-object v3

    .line 236
    :cond_9
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-nez v5, :cond_10

    .line 241
    .line 242
    iput-object v7, v0, Lff/G;->f:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v7, v0, Lff/G;->a:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v7, v0, Lff/G;->b:Ljava/util/Iterator;

    .line 247
    .line 248
    iput v4, v0, Lff/G;->c:I

    .line 249
    .line 250
    iput v1, v0, Lff/G;->d:I

    .line 251
    .line 252
    iput v6, v0, Lff/G;->e:I

    .line 253
    .line 254
    invoke-virtual {v2, v9, v0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 255
    .line 256
    .line 257
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 258
    .line 259
    return-object v3

    .line 260
    :cond_a
    iget-object v1, v0, Lff/G;->a:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v1, Ljava/util/ArrayList;

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_b
    iget v4, v0, Lff/G;->d:I

    .line 267
    .line 268
    iget v8, v0, Lff/G;->c:I

    .line 269
    .line 270
    iget-object v9, v0, Lff/G;->b:Ljava/util/Iterator;

    .line 271
    .line 272
    check-cast v9, Ljava/util/Iterator;

    .line 273
    .line 274
    iget-object v10, v0, Lff/G;->a:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v10, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    new-instance v10, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .line 285
    .line 286
    move-object v11, v10

    .line 287
    move-object v10, v9

    .line 288
    move v9, v8

    .line 289
    move v8, v4

    .line 290
    goto :goto_4

    .line 291
    :cond_c
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iget-object v9, v0, Lff/G;->g:Ljava/util/Iterator;

    .line 295
    .line 296
    new-instance v10, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    .line 300
    .line 301
    const/4 v4, 0x0

    .line 302
    move v8, v4

    .line 303
    move-object v11, v10

    .line 304
    move-object v10, v9

    .line 305
    move v9, v5

    .line 306
    :cond_d
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    if-eqz v12, :cond_f

    .line 311
    .line 312
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    if-lez v4, :cond_e

    .line 317
    .line 318
    add-int/lit8 v4, v4, -0x1

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_e
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    if-ne v12, v5, :cond_d

    .line 329
    .line 330
    iput-object v2, v0, Lff/G;->f:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v11, v0, Lff/G;->a:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v10, Ljava/util/Iterator;

    .line 335
    .line 336
    iput-object v10, v0, Lff/G;->b:Ljava/util/Iterator;

    .line 337
    .line 338
    iput v9, v0, Lff/G;->c:I

    .line 339
    .line 340
    iput v8, v0, Lff/G;->d:I

    .line 341
    .line 342
    iput v1, v0, Lff/G;->e:I

    .line 343
    .line 344
    invoke-virtual {v2, v11, v0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 345
    .line 346
    .line 347
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 348
    .line 349
    return-object v3

    .line 350
    :cond_f
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-nez v1, :cond_10

    .line 355
    .line 356
    iput-object v7, v0, Lff/G;->f:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v7, v0, Lff/G;->a:Ljava/lang/Object;

    .line 359
    .line 360
    iput-object v7, v0, Lff/G;->b:Ljava/util/Iterator;

    .line 361
    .line 362
    iput v9, v0, Lff/G;->c:I

    .line 363
    .line 364
    iput v8, v0, Lff/G;->d:I

    .line 365
    .line 366
    iput v6, v0, Lff/G;->e:I

    .line 367
    .line 368
    invoke-virtual {v2, v11, v0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 369
    .line 370
    .line 371
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 372
    .line 373
    return-object v3

    .line 374
    :cond_10
    :goto_5
    sget-object v1, Lef/C;->a:Lef/C;

    .line 375
    .line 376
    return-object v1
.end method
