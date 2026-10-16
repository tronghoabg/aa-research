.class public final Lg5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Luc/o;

.field public final synthetic c:LWa/h;

.field public final synthetic d:Lg5/a;

.field public final synthetic e:Lg5/e;


# direct methods
.method public constructor <init>(Lg5/e;Lg5/a;Luc/o;LWa/h;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lg5/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/b;->e:Lg5/e;

    iput-object p2, p0, Lg5/b;->d:Lg5/a;

    iput-object p3, p0, Lg5/b;->b:Luc/o;

    iput-object p4, p0, Lg5/b;->c:LWa/h;

    return-void
.end method

.method public synthetic constructor <init>(Lg5/e;Luc/o;LWa/h;Lg5/a;I)V
    .locals 0

    .line 1
    iput p5, p0, Lg5/b;->a:I

    iput-object p1, p0, Lg5/b;->e:Lg5/e;

    iput-object p2, p0, Lg5/b;->b:Luc/o;

    iput-object p3, p0, Lg5/b;->c:LWa/h;

    iput-object p4, p0, Lg5/b;->d:Lg5/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lg5/b;->e:Lg5/e;

    .line 3
    .line 4
    iget-object v2, p0, Lg5/b;->d:Lg5/a;

    .line 5
    .line 6
    iget-object v3, p0, Lg5/b;->c:LWa/h;

    .line 7
    .line 8
    iget-object v4, p0, Lg5/b;->b:Luc/o;

    .line 9
    .line 10
    iget v5, p0, Lg5/b;->a:I

    .line 11
    .line 12
    packed-switch v5, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v0, Lh5/d;

    .line 16
    .line 17
    invoke-direct {v0, v4, v3}, Lh5/d;-><init>(Luc/o;Luc/q;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2, v0}, Lg5/e;->d(Lg5/e;Lg5/a;Lh5/a;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    sget-object v5, Lg5/e;->c:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-string v1, "sql"

    .line 30
    .line 31
    invoke-virtual {v4, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    const-string v5, "arguments"

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/util/List;

    .line 44
    .line 45
    new-instance v6, Lg5/f;

    .line 46
    .line 47
    invoke-direct {v6, v1, v5}, Lg5/f;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    const-string v1, "inTransaction"

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/lang/Boolean;

    .line 57
    .line 58
    new-instance v4, Lh5/c;

    .line 59
    .line 60
    invoke-direct {v4, v3, v6, v1}, Lh5/c;-><init>(Luc/q;Lg5/f;Ljava/lang/Boolean;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v4}, Lg5/e;->g(Lg5/a;LU8/v0;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v2, v0

    .line 71
    :goto_0
    if-nez v2, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v3, v0}, LWa/h;->a(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-void

    .line 78
    :pswitch_1
    new-instance v0, Lh5/d;

    .line 79
    .line 80
    invoke-direct {v0, v4, v3}, Lh5/d;-><init>(Luc/o;Luc/q;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2, v0}, Lg5/e;->b(Lg5/e;Lg5/a;Lh5/a;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_2
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    const-string v6, "noResult"

    .line 90
    .line 91
    invoke-virtual {v4, v6}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v5, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 100
    .line 101
    const-string v7, "continueOnError"

    .line 102
    .line 103
    invoke-virtual {v4, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v6, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    const-string v7, "operations"

    .line 112
    .line 113
    invoke-virtual {v4, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Ljava/util/List;

    .line 118
    .line 119
    new-instance v7, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_e

    .line 133
    .line 134
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    check-cast v8, Ljava/util/Map;

    .line 139
    .line 140
    new-instance v9, Lh5/b;

    .line 141
    .line 142
    invoke-direct {v9, v8, v5}, Lh5/b;-><init>(Ljava/util/Map;Z)V

    .line 143
    .line 144
    .line 145
    const-string v10, "method"

    .line 146
    .line 147
    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v10, v9, Lh5/b;->b:LVa/X7;

    .line 157
    .line 158
    const/4 v11, -0x1

    .line 159
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    sparse-switch v12, :sswitch_data_0

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :sswitch_0
    const-string v12, "query"

    .line 168
    .line 169
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-nez v12, :cond_2

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_2
    const/4 v11, 0x3

    .line 177
    goto :goto_3

    .line 178
    :sswitch_1
    const-string v12, "update"

    .line 179
    .line 180
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-nez v12, :cond_3

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_3
    const/4 v11, 0x2

    .line 188
    goto :goto_3

    .line 189
    :sswitch_2
    const-string v12, "insert"

    .line 190
    .line 191
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    if-nez v12, :cond_4

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_4
    const/4 v11, 0x1

    .line 199
    goto :goto_3

    .line 200
    :sswitch_3
    const-string v12, "execute"

    .line 201
    .line 202
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    if-nez v12, :cond_5

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_5
    const/4 v11, 0x0

    .line 210
    :goto_3
    packed-switch v11, :pswitch_data_1

    .line 211
    .line 212
    .line 213
    const-string v1, "Batch method \'"

    .line 214
    .line 215
    const-string v2, "\' not supported"

    .line 216
    .line 217
    invoke-static {v1, v8, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    const-string v2, "bad_param"

    .line 222
    .line 223
    invoke-virtual {v3, v2, v1, v0}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_4

    .line 227
    .line 228
    :pswitch_3
    invoke-static {v1, v2, v9}, Lg5/e;->c(Lg5/e;Lg5/a;Lh5/a;)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_6

    .line 233
    .line 234
    invoke-virtual {v9, v7}, Lh5/b;->v0(Ljava/util/ArrayList;)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_6
    if-eqz v6, :cond_7

    .line 239
    .line 240
    invoke-virtual {v9, v7}, Lh5/b;->u0(Ljava/util/ArrayList;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_7
    iget-object v0, v10, LVa/X7;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Ljava/lang/String;

    .line 247
    .line 248
    iget-object v1, v10, LVa/X7;->c:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v1, Ljava/lang/String;

    .line 251
    .line 252
    iget-object v2, v10, LVa/X7;->d:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v2, Ljava/util/HashMap;

    .line 255
    .line 256
    invoke-virtual {v3, v0, v1, v2}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_4

    .line 260
    .line 261
    :pswitch_4
    invoke-static {v1, v2, v9}, Lg5/e;->d(Lg5/e;Lg5/a;Lh5/a;)Z

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    if-eqz v8, :cond_8

    .line 266
    .line 267
    invoke-virtual {v9, v7}, Lh5/b;->v0(Ljava/util/ArrayList;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_2

    .line 271
    .line 272
    :cond_8
    if-eqz v6, :cond_9

    .line 273
    .line 274
    invoke-virtual {v9, v7}, Lh5/b;->u0(Ljava/util/ArrayList;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_2

    .line 278
    .line 279
    :cond_9
    iget-object v0, v10, LVa/X7;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Ljava/lang/String;

    .line 282
    .line 283
    iget-object v1, v10, LVa/X7;->c:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v1, Ljava/lang/String;

    .line 286
    .line 287
    iget-object v2, v10, LVa/X7;->d:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v2, Ljava/util/HashMap;

    .line 290
    .line 291
    invoke-virtual {v3, v0, v1, v2}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto :goto_4

    .line 295
    :pswitch_5
    invoke-static {v1, v2, v9}, Lg5/e;->b(Lg5/e;Lg5/a;Lh5/a;)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-eqz v8, :cond_a

    .line 300
    .line 301
    invoke-virtual {v9, v7}, Lh5/b;->v0(Ljava/util/ArrayList;)V

    .line 302
    .line 303
    .line 304
    goto/16 :goto_2

    .line 305
    .line 306
    :cond_a
    if-eqz v6, :cond_b

    .line 307
    .line 308
    invoke-virtual {v9, v7}, Lh5/b;->u0(Ljava/util/ArrayList;)V

    .line 309
    .line 310
    .line 311
    goto/16 :goto_2

    .line 312
    .line 313
    :cond_b
    iget-object v0, v10, LVa/X7;->b:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Ljava/lang/String;

    .line 316
    .line 317
    iget-object v1, v10, LVa/X7;->c:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, Ljava/lang/String;

    .line 320
    .line 321
    iget-object v2, v10, LVa/X7;->d:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v2, Ljava/util/HashMap;

    .line 324
    .line 325
    invoke-virtual {v3, v0, v1, v2}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :pswitch_6
    sget-object v8, Lg5/e;->c:Ljava/util/HashMap;

    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {v2, v9}, Lg5/e;->g(Lg5/a;LU8/v0;)Z

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    if-nez v8, :cond_d

    .line 339
    .line 340
    if-eqz v6, :cond_c

    .line 341
    .line 342
    invoke-virtual {v9, v7}, Lh5/b;->u0(Ljava/util/ArrayList;)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_2

    .line 346
    .line 347
    :cond_c
    iget-object v0, v10, LVa/X7;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Ljava/lang/String;

    .line 350
    .line 351
    iget-object v1, v10, LVa/X7;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v1, Ljava/lang/String;

    .line 354
    .line 355
    iget-object v2, v10, LVa/X7;->d:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v2, Ljava/util/HashMap;

    .line 358
    .line 359
    invoke-virtual {v3, v0, v1, v2}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_d
    invoke-virtual {v9, v0}, Lh5/a;->b(Ljava/io/Serializable;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v9, v7}, Lh5/b;->v0(Ljava/util/ArrayList;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_2

    .line 370
    .line 371
    :cond_e
    if-eqz v5, :cond_f

    .line 372
    .line 373
    invoke-virtual {v3, v0}, LWa/h;->a(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_f
    invoke-virtual {v3, v7}, LWa/h;->a(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    :goto_4
    return-void

    .line 381
    :pswitch_7
    new-instance v0, Lh5/d;

    .line 382
    .line 383
    invoke-direct {v0, v4, v3}, Lh5/d;-><init>(Luc/o;Luc/q;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v1, v2, v0}, Lg5/e;->c(Lg5/e;Lg5/a;Lh5/a;)Z

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    nop

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    :sswitch_data_0
    .sparse-switch
        -0x4ea7088b -> :sswitch_3
        -0x468f3d47 -> :sswitch_2
        -0x31ffc737 -> :sswitch_1
        0x66f18c8 -> :sswitch_0
    .end sparse-switch

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
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
