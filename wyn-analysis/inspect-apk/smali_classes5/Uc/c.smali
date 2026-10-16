.class public LUc/c;
.super Luc/w;
.source "SourceFile"


# static fields
.field public static final d:LUc/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LUc/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LUc/c;->d:LUc/c;

    .line 7
    .line 8
    return-void
.end method

.method public static l(Ljava/util/Map;)Lm9/A;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "fieldPath"

    .line 5
    .line 6
    invoke-interface {p0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const-string v5, "Invalid operator"

    .line 11
    .line 12
    const-string v6, "op"

    .line 13
    .line 14
    if-eqz v4, :cond_a

    .line 15
    .line 16
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lm9/r;

    .line 27
    .line 28
    const-string v6, "value"

    .line 29
    .line 30
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/4 v6, -0x1

    .line 38
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    sparse-switch v7, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    :goto_0
    move v0, v6

    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :sswitch_0
    const-string v0, "array-contains-any"

    .line 49
    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/16 v0, 0x9

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :sswitch_1
    const-string v0, "array-contains"

    .line 62
    .line 63
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/16 v0, 0x8

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :sswitch_2
    const-string v0, "in"

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 v0, 0x7

    .line 84
    goto :goto_1

    .line 85
    :sswitch_3
    const-string v0, ">="

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/4 v0, 0x6

    .line 95
    goto :goto_1

    .line 96
    :sswitch_4
    const-string v0, "=="

    .line 97
    .line 98
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    const/4 v0, 0x5

    .line 106
    goto :goto_1

    .line 107
    :sswitch_5
    const-string v0, "<="

    .line 108
    .line 109
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    const/4 v0, 0x4

    .line 117
    goto :goto_1

    .line 118
    :sswitch_6
    const-string v0, "!="

    .line 119
    .line 120
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_6

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    const/4 v0, 0x3

    .line 128
    goto :goto_1

    .line 129
    :sswitch_7
    const-string v1, ">"

    .line 130
    .line 131
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_9

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :sswitch_8
    const-string v0, "<"

    .line 139
    .line 140
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_7

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_7
    move v0, v1

    .line 148
    goto :goto_1

    .line 149
    :sswitch_9
    const-string v0, "not-in"

    .line 150
    .line 151
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_8

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_8
    move v0, v2

    .line 159
    :cond_9
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 160
    .line 161
    .line 162
    new-instance p0, Ljava/lang/Error;

    .line 163
    .line 164
    invoke-direct {p0, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 169
    .line 170
    new-instance v0, Lm9/z;

    .line 171
    .line 172
    sget-object v1, Lp9/i;->i:Lp9/i;

    .line 173
    .line 174
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_1
    new-instance v0, Lm9/z;

    .line 179
    .line 180
    sget-object v1, Lp9/i;->h:Lp9/i;

    .line 181
    .line 182
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_2
    check-cast p0, Ljava/util/List;

    .line 187
    .line 188
    new-instance v0, Lm9/z;

    .line 189
    .line 190
    sget-object v1, Lp9/i;->j:Lp9/i;

    .line 191
    .line 192
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    new-instance v0, Lm9/z;

    .line 197
    .line 198
    sget-object v1, Lp9/i;->g:Lp9/i;

    .line 199
    .line 200
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_4
    new-instance v0, Lm9/z;

    .line 205
    .line 206
    sget-object v1, Lp9/i;->d:Lp9/i;

    .line 207
    .line 208
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_5
    new-instance v0, Lm9/z;

    .line 213
    .line 214
    sget-object v1, Lp9/i;->c:Lp9/i;

    .line 215
    .line 216
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_6
    new-instance v0, Lm9/z;

    .line 221
    .line 222
    sget-object v1, Lp9/i;->e:Lp9/i;

    .line 223
    .line 224
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-object v0

    .line 228
    :pswitch_7
    new-instance v0, Lm9/z;

    .line 229
    .line 230
    sget-object v1, Lp9/i;->f:Lp9/i;

    .line 231
    .line 232
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_8
    new-instance v0, Lm9/z;

    .line 237
    .line 238
    sget-object v1, Lp9/i;->b:Lp9/i;

    .line 239
    .line 240
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_9
    check-cast p0, Ljava/util/List;

    .line 245
    .line 246
    new-instance v0, Lm9/z;

    .line 247
    .line 248
    sget-object v1, Lp9/i;->k:Lp9/i;

    .line 249
    .line 250
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    return-object v0

    .line 254
    :cond_a
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    check-cast v3, Ljava/lang/String;

    .line 259
    .line 260
    const-string v4, "queries"

    .line 261
    .line 262
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    check-cast p0, Ljava/util/List;

    .line 267
    .line 268
    new-instance v4, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-eqz v6, :cond_b

    .line 282
    .line 283
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    check-cast v6, Ljava/util/Map;

    .line 288
    .line 289
    invoke-static {v6}, LUc/c;->l(Ljava/util/Map;)Lm9/A;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_b
    const-string p0, "OR"

    .line 298
    .line 299
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p0

    .line 303
    if-eqz p0, :cond_c

    .line 304
    .line 305
    new-array p0, v2, [Lm9/A;

    .line 306
    .line 307
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, [Lm9/A;

    .line 312
    .line 313
    new-instance v1, Lm9/y;

    .line 314
    .line 315
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-direct {v1, v0, p0}, Lm9/y;-><init>(ILjava/util/List;)V

    .line 320
    .line 321
    .line 322
    return-object v1

    .line 323
    :cond_c
    const-string p0, "AND"

    .line 324
    .line 325
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p0

    .line 329
    if-eqz p0, :cond_d

    .line 330
    .line 331
    new-array p0, v2, [Lm9/A;

    .line 332
    .line 333
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, [Lm9/A;

    .line 338
    .line 339
    new-instance v0, Lm9/y;

    .line 340
    .line 341
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-direct {v0, v1, p0}, Lm9/y;-><init>(ILjava/util/List;)V

    .line 346
    .line 347
    .line 348
    return-object v0

    .line 349
    :cond_d
    new-instance p0, Ljava/lang/Error;

    .line 350
    .line 351
    invoke-direct {p0, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw p0

    .line 355
    :sswitch_data_0
    .sparse-switch
        -0x3df949a1 -> :sswitch_9
        0x3c -> :sswitch_8
        0x3e -> :sswitch_7
        0x43c -> :sswitch_6
        0x781 -> :sswitch_5
        0x7a0 -> :sswitch_4
        0x7bf -> :sswitch_3
        0xd25 -> :sswitch_2
        0x8111b13 -> :sswitch_1
        0x152d4832 -> :sswitch_0
    .end sparse-switch

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    :pswitch_data_0
    .packed-switch 0x0
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

.method public static m(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    new-instance p0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v1, "java.util.List was expected, unable to convert \'"

    .line 35
    .line 36
    const-string v2, "\' to an object array"

    .line 37
    .line 38
    invoke-static {v1, p0, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method


# virtual methods
.method public f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super/range {p0 .. p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :pswitch_0
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/Map;

    .line 19
    .line 20
    new-instance v2, LA7/X;

    .line 21
    .line 22
    invoke-direct {v2}, LA7/X;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v3, "persistenceEnabled"

    .line 26
    .line 27
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_5

    .line 32
    .line 33
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Boolean;

    .line 38
    .line 39
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    const-string v3, "cacheSizeBytes"

    .line 48
    .line 49
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-wide/32 v5, 0x6400000

    .line 54
    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    instance-of v5, v3, Ljava/lang/Long;

    .line 67
    .line 68
    if-eqz v5, :cond_0

    .line 69
    .line 70
    move-object v4, v3

    .line 71
    check-cast v4, Ljava/lang/Long;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    instance-of v5, v3, Ljava/lang/Integer;

    .line 75
    .line 76
    if-eqz v5, :cond_1

    .line 77
    .line 78
    check-cast v3, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    int-to-long v3, v3

    .line 85
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :cond_1
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    const-wide/16 v7, -0x1

    .line 94
    .line 95
    cmp-long v3, v5, v7

    .line 96
    .line 97
    if-nez v3, :cond_2

    .line 98
    .line 99
    move-wide v5, v7

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    :cond_3
    :goto_1
    new-instance v3, Lm9/T;

    .line 106
    .line 107
    invoke-direct {v3, v5, v6}, Lm9/T;-><init>(J)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3}, LA7/X;->b(Lm9/P;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    new-instance v3, Lm9/S;

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    invoke-direct {v3, v4}, Lm9/S;-><init>(I)V

    .line 118
    .line 119
    .line 120
    new-instance v4, Lm9/Q;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v3, v4, Lm9/Q;->a:Lm9/S;

    .line 126
    .line 127
    invoke-virtual {v2, v4}, LA7/X;->b(Lm9/P;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_2
    const-string v3, "host"

    .line 131
    .line 132
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_6

    .line 137
    .line 138
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    check-cast v3, Ljava/lang/String;

    .line 146
    .line 147
    iput-object v3, v2, LA7/X;->a:Ljava/lang/String;

    .line 148
    .line 149
    const-string v3, "sslEnabled"

    .line 150
    .line 151
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    if-eqz v4, :cond_6

    .line 156
    .line 157
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    check-cast v0, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iput-boolean v0, v2, LA7/X;->b:Z

    .line 171
    .line 172
    :cond_6
    invoke-virtual {v2}, LA7/X;->a()Lm9/H;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    return-object v0

    .line 177
    :pswitch_1
    const-string v3, "FLTFirestoreMsgCodec"

    .line 178
    .line 179
    const-string v4, "filters"

    .line 180
    .line 181
    :try_start_0
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/util/Map;

    .line 186
    .line 187
    const-string v5, "firestore"

    .line 188
    .line 189
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-static {v5}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    check-cast v5, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 197
    .line 198
    const-string v6, "path"

    .line 199
    .line 200
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    check-cast v6, Ljava/lang/String;

    .line 208
    .line 209
    const-string v7, "isCollectionGroup"

    .line 210
    .line 211
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    check-cast v7, Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    const-string v8, "parameters"

    .line 222
    .line 223
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/util/Map;

    .line 228
    .line 229
    if-eqz v7, :cond_7

    .line 230
    .line 231
    invoke-virtual {v5, v6}, Lcom/google/firebase/firestore/FirebaseFirestore;->c(Ljava/lang/String;)Lm9/W;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    goto :goto_3

    .line 236
    :catch_0
    move-exception v0

    .line 237
    goto/16 :goto_7

    .line 238
    .line 239
    :cond_7
    invoke-virtual {v5, v6}, Lcom/google/firebase/firestore/FirebaseFirestore;->b(Ljava/lang/String;)Lm9/h;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    :goto_3
    if-nez v0, :cond_8

    .line 244
    .line 245
    return-object v5

    .line 246
    :cond_8
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-eqz v6, :cond_9

    .line 251
    .line 252
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    check-cast v4, Ljava/util/Map;

    .line 260
    .line 261
    invoke-static {v4}, LUc/c;->l(Ljava/util/Map;)Lm9/A;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-virtual {v5, v4}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    :cond_9
    const-string v4, "where"

    .line 270
    .line 271
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    check-cast v4, Ljava/util/List;

    .line 279
    .line 280
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    const/4 v7, 0x2

    .line 289
    const/4 v8, 0x1

    .line 290
    if-eqz v6, :cond_14

    .line 291
    .line 292
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    check-cast v6, Ljava/util/List;

    .line 297
    .line 298
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    check-cast v9, Lm9/r;

    .line 303
    .line 304
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    check-cast v8, Ljava/lang/String;

    .line 309
    .line 310
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    const-string v7, "=="

    .line 315
    .line 316
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-eqz v7, :cond_a

    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v7, Lm9/z;

    .line 326
    .line 327
    sget-object v8, Lp9/i;->d:Lp9/i;

    .line 328
    .line 329
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    goto :goto_4

    .line 337
    :cond_a
    const-string v7, "!="

    .line 338
    .line 339
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-eqz v7, :cond_b

    .line 344
    .line 345
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    new-instance v7, Lm9/z;

    .line 349
    .line 350
    sget-object v8, Lp9/i;->e:Lp9/i;

    .line 351
    .line 352
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    goto :goto_4

    .line 360
    :cond_b
    const-string v7, "<"

    .line 361
    .line 362
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    if-eqz v7, :cond_c

    .line 367
    .line 368
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    new-instance v7, Lm9/z;

    .line 372
    .line 373
    sget-object v8, Lp9/i;->b:Lp9/i;

    .line 374
    .line 375
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    goto :goto_4

    .line 383
    :cond_c
    const-string v7, "<="

    .line 384
    .line 385
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    if-eqz v7, :cond_d

    .line 390
    .line 391
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    new-instance v7, Lm9/z;

    .line 395
    .line 396
    sget-object v8, Lp9/i;->c:Lp9/i;

    .line 397
    .line 398
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    goto :goto_4

    .line 406
    :cond_d
    const-string v7, ">"

    .line 407
    .line 408
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    if-eqz v7, :cond_e

    .line 413
    .line 414
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    new-instance v7, Lm9/z;

    .line 418
    .line 419
    sget-object v8, Lp9/i;->f:Lp9/i;

    .line 420
    .line 421
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    goto/16 :goto_4

    .line 429
    .line 430
    :cond_e
    const-string v7, ">="

    .line 431
    .line 432
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    if-eqz v7, :cond_f

    .line 437
    .line 438
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    new-instance v7, Lm9/z;

    .line 442
    .line 443
    sget-object v8, Lp9/i;->g:Lp9/i;

    .line 444
    .line 445
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    goto/16 :goto_4

    .line 453
    .line 454
    :cond_f
    const-string v7, "array-contains"

    .line 455
    .line 456
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v7

    .line 460
    if-eqz v7, :cond_10

    .line 461
    .line 462
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    new-instance v7, Lm9/z;

    .line 466
    .line 467
    sget-object v8, Lp9/i;->h:Lp9/i;

    .line 468
    .line 469
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    goto/16 :goto_4

    .line 477
    .line 478
    :cond_10
    const-string v7, "array-contains-any"

    .line 479
    .line 480
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v7

    .line 484
    if-eqz v7, :cond_11

    .line 485
    .line 486
    check-cast v6, Ljava/util/List;

    .line 487
    .line 488
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    new-instance v7, Lm9/z;

    .line 492
    .line 493
    sget-object v8, Lp9/i;->i:Lp9/i;

    .line 494
    .line 495
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    goto/16 :goto_4

    .line 503
    .line 504
    :cond_11
    const-string v7, "in"

    .line 505
    .line 506
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v7

    .line 510
    if-eqz v7, :cond_12

    .line 511
    .line 512
    check-cast v6, Ljava/util/List;

    .line 513
    .line 514
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    new-instance v7, Lm9/z;

    .line 518
    .line 519
    sget-object v8, Lp9/i;->j:Lp9/i;

    .line 520
    .line 521
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    goto/16 :goto_4

    .line 529
    .line 530
    :cond_12
    const-string v7, "not-in"

    .line 531
    .line 532
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v7

    .line 536
    if-eqz v7, :cond_13

    .line 537
    .line 538
    check-cast v6, Ljava/util/List;

    .line 539
    .line 540
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    new-instance v7, Lm9/z;

    .line 544
    .line 545
    sget-object v8, Lp9/i;->k:Lp9/i;

    .line 546
    .line 547
    invoke-direct {v7, v9, v8, v6}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v5, v7}, Lm9/W;->j(Lm9/A;)Lm9/W;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    goto/16 :goto_4

    .line 555
    .line 556
    :cond_13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 559
    .line 560
    .line 561
    const-string v7, "An invalid query operator "

    .line 562
    .line 563
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    const-string v7, " was received but not handled."

    .line 570
    .line 571
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v6

    .line 578
    invoke-static {v3, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 579
    .line 580
    .line 581
    goto/16 :goto_4

    .line 582
    .line 583
    :cond_14
    const-string v4, "limit"

    .line 584
    .line 585
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    check-cast v4, Ljava/lang/Number;

    .line 590
    .line 591
    if-eqz v4, :cond_15

    .line 592
    .line 593
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 594
    .line 595
    .line 596
    move-result-wide v9

    .line 597
    invoke-virtual {v5, v9, v10}, Lm9/W;->d(J)Lm9/W;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    :cond_15
    const-string v4, "limitToLast"

    .line 602
    .line 603
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    check-cast v4, Ljava/lang/Number;

    .line 608
    .line 609
    if-eqz v4, :cond_16

    .line 610
    .line 611
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 612
    .line 613
    .line 614
    move-result-wide v9

    .line 615
    invoke-virtual {v5, v9, v10}, Lm9/W;->e(J)Lm9/W;

    .line 616
    .line 617
    .line 618
    move-result-object v5

    .line 619
    :cond_16
    const-string v4, "orderBy"

    .line 620
    .line 621
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    check-cast v4, Ljava/util/List;

    .line 626
    .line 627
    if-nez v4, :cond_17

    .line 628
    .line 629
    return-object v5

    .line 630
    :cond_17
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    if-eqz v6, :cond_19

    .line 639
    .line 640
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    check-cast v6, Ljava/util/List;

    .line 645
    .line 646
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v9

    .line 650
    check-cast v9, Lm9/r;

    .line 651
    .line 652
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    check-cast v6, Ljava/lang/Boolean;

    .line 657
    .line 658
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 659
    .line 660
    .line 661
    move-result v6

    .line 662
    if-eqz v6, :cond_18

    .line 663
    .line 664
    move v6, v7

    .line 665
    goto :goto_6

    .line 666
    :cond_18
    move v6, v8

    .line 667
    :goto_6
    invoke-virtual {v5, v9, v6}, Lm9/W;->f(Lm9/r;I)Lm9/W;

    .line 668
    .line 669
    .line 670
    move-result-object v5

    .line 671
    goto :goto_5

    .line 672
    :cond_19
    const-string v4, "startAt"

    .line 673
    .line 674
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    check-cast v4, Ljava/util/List;

    .line 679
    .line 680
    if-eqz v4, :cond_1a

    .line 681
    .line 682
    invoke-interface {v4}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v4

    .line 686
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    const-string v6, "startAt"

    .line 690
    .line 691
    invoke-virtual {v5, v8, v6, v4}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    .line 692
    .line 693
    .line 694
    move-result-object v17

    .line 695
    new-instance v4, Lm9/W;

    .line 696
    .line 697
    iget-object v6, v5, Lm9/W;->a:Lp9/u;

    .line 698
    .line 699
    new-instance v9, Lp9/u;

    .line 700
    .line 701
    iget v7, v6, Lp9/u;->i:I

    .line 702
    .line 703
    iget-object v10, v6, Lp9/u;->k:Lp9/c;

    .line 704
    .line 705
    move-object/from16 v18, v10

    .line 706
    .line 707
    iget-object v10, v6, Lp9/u;->f:Ls9/m;

    .line 708
    .line 709
    iget-object v11, v6, Lp9/u;->g:Ljava/lang/String;

    .line 710
    .line 711
    iget-object v12, v6, Lp9/u;->e:Ljava/util/List;

    .line 712
    .line 713
    iget-object v13, v6, Lp9/u;->a:Ljava/util/List;

    .line 714
    .line 715
    iget-wide v14, v6, Lp9/u;->h:J

    .line 716
    .line 717
    move/from16 v16, v7

    .line 718
    .line 719
    invoke-direct/range {v9 .. v18}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 720
    .line 721
    .line 722
    iget-object v5, v5, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 723
    .line 724
    invoke-direct {v4, v9, v5}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 725
    .line 726
    .line 727
    move-object v5, v4

    .line 728
    :cond_1a
    const-string v4, "startAfter"

    .line 729
    .line 730
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    check-cast v4, Ljava/util/List;

    .line 735
    .line 736
    if-eqz v4, :cond_1b

    .line 737
    .line 738
    invoke-interface {v4}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    const-string v6, "startAfter"

    .line 746
    .line 747
    invoke-virtual {v5, v2, v6, v4}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    .line 748
    .line 749
    .line 750
    move-result-object v17

    .line 751
    new-instance v4, Lm9/W;

    .line 752
    .line 753
    iget-object v6, v5, Lm9/W;->a:Lp9/u;

    .line 754
    .line 755
    new-instance v9, Lp9/u;

    .line 756
    .line 757
    iget v7, v6, Lp9/u;->i:I

    .line 758
    .line 759
    iget-object v10, v6, Lp9/u;->k:Lp9/c;

    .line 760
    .line 761
    move-object/from16 v18, v10

    .line 762
    .line 763
    iget-object v10, v6, Lp9/u;->f:Ls9/m;

    .line 764
    .line 765
    iget-object v11, v6, Lp9/u;->g:Ljava/lang/String;

    .line 766
    .line 767
    iget-object v12, v6, Lp9/u;->e:Ljava/util/List;

    .line 768
    .line 769
    iget-object v13, v6, Lp9/u;->a:Ljava/util/List;

    .line 770
    .line 771
    iget-wide v14, v6, Lp9/u;->h:J

    .line 772
    .line 773
    move/from16 v16, v7

    .line 774
    .line 775
    invoke-direct/range {v9 .. v18}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 776
    .line 777
    .line 778
    iget-object v5, v5, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 779
    .line 780
    invoke-direct {v4, v9, v5}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 781
    .line 782
    .line 783
    move-object v5, v4

    .line 784
    :cond_1b
    const-string v4, "endAt"

    .line 785
    .line 786
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    check-cast v4, Ljava/util/List;

    .line 791
    .line 792
    if-eqz v4, :cond_1c

    .line 793
    .line 794
    invoke-interface {v4}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v4

    .line 798
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    const-string v6, "endAt"

    .line 802
    .line 803
    invoke-virtual {v5, v8, v6, v4}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    .line 804
    .line 805
    .line 806
    move-result-object v18

    .line 807
    new-instance v4, Lm9/W;

    .line 808
    .line 809
    iget-object v6, v5, Lm9/W;->a:Lp9/u;

    .line 810
    .line 811
    new-instance v9, Lp9/u;

    .line 812
    .line 813
    iget v7, v6, Lp9/u;->i:I

    .line 814
    .line 815
    iget-object v8, v6, Lp9/u;->j:Lp9/c;

    .line 816
    .line 817
    iget-object v10, v6, Lp9/u;->f:Ls9/m;

    .line 818
    .line 819
    iget-object v11, v6, Lp9/u;->g:Ljava/lang/String;

    .line 820
    .line 821
    iget-object v12, v6, Lp9/u;->e:Ljava/util/List;

    .line 822
    .line 823
    iget-object v13, v6, Lp9/u;->a:Ljava/util/List;

    .line 824
    .line 825
    iget-wide v14, v6, Lp9/u;->h:J

    .line 826
    .line 827
    move/from16 v16, v7

    .line 828
    .line 829
    move-object/from16 v17, v8

    .line 830
    .line 831
    invoke-direct/range {v9 .. v18}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 832
    .line 833
    .line 834
    iget-object v5, v5, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 835
    .line 836
    invoke-direct {v4, v9, v5}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 837
    .line 838
    .line 839
    move-object v5, v4

    .line 840
    :cond_1c
    const-string v4, "endBefore"

    .line 841
    .line 842
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    check-cast v0, Ljava/util/List;

    .line 847
    .line 848
    if-eqz v0, :cond_1d

    .line 849
    .line 850
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    const-string v4, "endBefore"

    .line 858
    .line 859
    invoke-virtual {v5, v2, v4, v0}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    .line 860
    .line 861
    .line 862
    move-result-object v15

    .line 863
    new-instance v0, Lm9/W;

    .line 864
    .line 865
    iget-object v2, v5, Lm9/W;->a:Lp9/u;

    .line 866
    .line 867
    new-instance v6, Lp9/u;

    .line 868
    .line 869
    iget v13, v2, Lp9/u;->i:I

    .line 870
    .line 871
    iget-object v14, v2, Lp9/u;->j:Lp9/c;

    .line 872
    .line 873
    iget-object v7, v2, Lp9/u;->f:Ls9/m;

    .line 874
    .line 875
    iget-object v8, v2, Lp9/u;->g:Ljava/lang/String;

    .line 876
    .line 877
    iget-object v9, v2, Lp9/u;->e:Ljava/util/List;

    .line 878
    .line 879
    iget-object v10, v2, Lp9/u;->a:Ljava/util/List;

    .line 880
    .line 881
    iget-wide v11, v2, Lp9/u;->h:J

    .line 882
    .line 883
    invoke-direct/range {v6 .. v15}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 884
    .line 885
    .line 886
    iget-object v2, v5, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 887
    .line 888
    invoke-direct {v0, v6, v2}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 889
    .line 890
    .line 891
    return-object v0

    .line 892
    :cond_1d
    return-object v5

    .line 893
    :goto_7
    const-string v2, "An error occurred while parsing query arguments, this is most likely an error with this SDK."

    .line 894
    .line 895
    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 896
    .line 897
    .line 898
    const/4 v0, 0x0

    .line 899
    return-object v0

    .line 900
    :pswitch_2
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v2

    .line 904
    check-cast v2, Ljava/lang/String;

    .line 905
    .line 906
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v3

    .line 910
    check-cast v3, Ljava/lang/String;

    .line 911
    .line 912
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    check-cast v0, Lm9/H;

    .line 917
    .line 918
    sget-object v4, LUc/f;->h:Ljava/util/HashMap;

    .line 919
    .line 920
    monitor-enter v4

    .line 921
    :try_start_1
    invoke-static {v2, v3}, LUc/f;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 922
    .line 923
    .line 924
    move-result-object v5

    .line 925
    if-eqz v5, :cond_1e

    .line 926
    .line 927
    monitor-exit v4

    .line 928
    return-object v5

    .line 929
    :catchall_0
    move-exception v0

    .line 930
    goto :goto_8

    .line 931
    :cond_1e
    invoke-static {v2}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    invoke-static {v2, v3}, Lcom/google/firebase/firestore/FirebaseFirestore;->e(Ls8/g;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    invoke-virtual {v2, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->h(Lm9/H;)V

    .line 940
    .line 941
    .line 942
    invoke-static {v2, v3}, LUc/f;->i(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    monitor-exit v4

    .line 946
    return-object v2

    .line 947
    :goto_8
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 948
    throw v0

    .line 949
    :pswitch_3
    const-wide/high16 v2, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 950
    .line 951
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    return-object v0

    .line 956
    :pswitch_4
    const-wide/high16 v2, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 957
    .line 958
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    return-object v0

    .line 963
    :pswitch_5
    const-wide/high16 v2, 0x7ff8000000000000L    # Double.NaN

    .line 964
    .line 965
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    return-object v0

    .line 970
    :pswitch_6
    invoke-static {v0}, Luc/w;->d(Ljava/nio/ByteBuffer;)I

    .line 971
    .line 972
    .line 973
    move-result v3

    .line 974
    new-instance v4, Ljava/util/ArrayList;

    .line 975
    .line 976
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 977
    .line 978
    .line 979
    move v5, v2

    .line 980
    :goto_9
    if-ge v5, v3, :cond_1f

    .line 981
    .line 982
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v6

    .line 986
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    add-int/lit8 v5, v5, 0x1

    .line 990
    .line 991
    goto :goto_9

    .line 992
    :cond_1f
    new-array v0, v2, [Ljava/lang/String;

    .line 993
    .line 994
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    check-cast v0, [Ljava/lang/String;

    .line 999
    .line 1000
    invoke-static {v0}, Lm9/r;->b([Ljava/lang/String;)Lm9/r;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    return-object v0

    .line 1005
    :pswitch_7
    sget-object v0, Lm9/r;->c:Lm9/r;

    .line 1006
    .line 1007
    return-object v0

    .line 1008
    :pswitch_8
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    check-cast v0, Ljava/lang/Number;

    .line 1013
    .line 1014
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1015
    .line 1016
    .line 1017
    move-result v0

    .line 1018
    int-to-long v2, v0

    .line 1019
    new-instance v0, Lm9/v;

    .line 1020
    .line 1021
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    invoke-direct {v0, v2}, Lm9/v;-><init>(Ljava/lang/Number;)V

    .line 1026
    .line 1027
    .line 1028
    return-object v0

    .line 1029
    :pswitch_9
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    check-cast v0, Ljava/lang/Number;

    .line 1034
    .line 1035
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 1036
    .line 1037
    .line 1038
    move-result-wide v2

    .line 1039
    new-instance v0, Lm9/v;

    .line 1040
    .line 1041
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v2

    .line 1045
    invoke-direct {v0, v2}, Lm9/v;-><init>(Ljava/lang/Number;)V

    .line 1046
    .line 1047
    .line 1048
    return-object v0

    .line 1049
    :pswitch_a
    new-instance v2, Ls8/q;

    .line 1050
    .line 1051
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v3

    .line 1055
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 1056
    .line 1057
    .line 1058
    move-result v0

    .line 1059
    invoke-direct {v2, v3, v4, v0}, Ls8/q;-><init>(JI)V

    .line 1060
    .line 1061
    .line 1062
    return-object v2

    .line 1063
    :pswitch_b
    sget-object v0, Lm9/x;->b:Lm9/w;

    .line 1064
    .line 1065
    return-object v0

    .line 1066
    :pswitch_c
    sget-object v0, Lm9/x;->a:Lm9/u;

    .line 1067
    .line 1068
    return-object v0

    .line 1069
    :pswitch_d
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    invoke-static {v0}, LUc/c;->m(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    new-instance v2, Lm9/s;

    .line 1078
    .line 1079
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-direct {v2, v0}, Lm9/s;-><init>(Ljava/util/List;)V

    .line 1084
    .line 1085
    .line 1086
    return-object v2

    .line 1087
    :pswitch_e
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    invoke-static {v0}, LUc/c;->m(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    new-instance v2, Lm9/t;

    .line 1096
    .line 1097
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    invoke-direct {v2, v0}, Lm9/t;-><init>(Ljava/util/List;)V

    .line 1102
    .line 1103
    .line 1104
    return-object v2

    .line 1105
    :pswitch_f
    invoke-static {v0}, Luc/w;->d(Ljava/nio/ByteBuffer;)I

    .line 1106
    .line 1107
    .line 1108
    move-result v2

    .line 1109
    new-array v2, v2, [B

    .line 1110
    .line 1111
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 1112
    .line 1113
    .line 1114
    new-instance v0, Lm9/g;

    .line 1115
    .line 1116
    invoke-static {v2}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v2

    .line 1120
    invoke-direct {v0, v2}, Lm9/g;-><init>(Lcom/google/protobuf/ByteString;)V

    .line 1121
    .line 1122
    .line 1123
    return-object v0

    .line 1124
    :pswitch_10
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    check-cast v2, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 1129
    .line 1130
    invoke-virtual {v1, v0}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    check-cast v0, Ljava/lang/String;

    .line 1135
    .line 1136
    invoke-virtual {v2, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    return-object v0

    .line 1141
    :pswitch_11
    const/16 v2, 0x8

    .line 1142
    .line 1143
    invoke-static {v2, v0}, Luc/w;->c(ILjava/nio/ByteBuffer;)V

    .line 1144
    .line 1145
    .line 1146
    new-instance v2, Lm9/J;

    .line 1147
    .line 1148
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getDouble()D

    .line 1149
    .line 1150
    .line 1151
    move-result-wide v3

    .line 1152
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getDouble()D

    .line 1153
    .line 1154
    .line 1155
    move-result-wide v5

    .line 1156
    invoke-direct {v2, v3, v4, v5, v6}, Lm9/J;-><init>(DD)V

    .line 1157
    .line 1158
    .line 1159
    return-object v2

    .line 1160
    :pswitch_12
    new-instance v2, Ljava/util/Date;

    .line 1161
    .line 1162
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 1163
    .line 1164
    .line 1165
    move-result-wide v3

    .line 1166
    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 1167
    .line 1168
    .line 1169
    return-object v2

    .line 1170
    nop

    .line 1171
    :pswitch_data_0
    .packed-switch -0x4c
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

.method public k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 8

    .line 1
    instance-of v0, p2, Ljava/util/Date;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, -0x4c

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 8
    .line 9
    .line 10
    check-cast p2, Ljava/util/Date;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {p1, v0, v1}, Luc/w;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v0, p2, Ls8/q;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/16 v0, -0x44

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 27
    .line 28
    .line 29
    check-cast p2, Ls8/q;

    .line 30
    .line 31
    iget-wide v0, p2, Ls8/q;->a:J

    .line 32
    .line 33
    invoke-static {p1, v0, v1}, Luc/w;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 34
    .line 35
    .line 36
    iget p2, p2, Ls8/q;->b:I

    .line 37
    .line 38
    invoke-static {p1, p2}, Luc/w;->h(Ljava/io/ByteArrayOutputStream;I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    instance-of v0, p2, Lm9/J;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/16 v0, -0x4b

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 49
    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    invoke-static {p1, v0}, Luc/w;->g(Ljava/io/ByteArrayOutputStream;I)V

    .line 54
    .line 55
    .line 56
    check-cast p2, Lm9/J;

    .line 57
    .line 58
    iget-wide v0, p2, Lm9/J;->a:D

    .line 59
    .line 60
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-static {p1, v0, v1}, Luc/w;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 65
    .line 66
    .line 67
    iget-wide v0, p2, Lm9/J;->b:D

    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {p1, v0, v1}, Luc/w;->i(Ljava/io/ByteArrayOutputStream;J)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    instance-of v0, p2, Lm9/m;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    const/16 v0, -0x4a

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 84
    .line 85
    .line 86
    check-cast p2, Lm9/m;

    .line 87
    .line 88
    iget-object v0, p2, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 89
    .line 90
    iget-object v1, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Ls8/g;

    .line 91
    .line 92
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 93
    .line 94
    .line 95
    iget-object v1, v1, Ls8/g;->b:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p0, p1, v1}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Lm9/m;->d()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p0, p1, p2}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object v1, LUc/f;->h:Ljava/util/HashMap;

    .line 108
    .line 109
    monitor-enter v1

    .line 110
    :try_start_0
    invoke-static {v0}, LUc/f;->b(Lcom/google/firebase/firestore/FirebaseFirestore;)LUc/b;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    iget-object p2, p2, LUc/b;->b:Ljava/lang/String;

    .line 115
    .line 116
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    invoke-virtual {p0, p1, p2}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catchall_0
    move-exception p1

    .line 122
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    throw p1

    .line 124
    :cond_3
    instance-of v0, p2, Lm9/o;

    .line 125
    .line 126
    const/4 v1, 0x0

    .line 127
    const/4 v2, 0x1

    .line 128
    const/4 v3, 0x0

    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    check-cast p2, Lm9/o;

    .line 132
    .line 133
    new-instance v0, Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 136
    .line 137
    .line 138
    iget-object v4, p2, Lm9/o;->b:Ls9/h;

    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v4, v4, Ls9/h;->a:Ls9/m;

    .line 144
    .line 145
    invoke-virtual {v4}, Ls9/m;->c()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const-string v5, "path"

    .line 150
    .line 151
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    iget-object v4, p2, Lm9/o;->c:Ls9/k;

    .line 155
    .line 156
    if-eqz v4, :cond_4

    .line 157
    .line 158
    move v1, v2

    .line 159
    :cond_4
    const-string v2, "data"

    .line 160
    .line 161
    if-eqz v1, :cond_6

    .line 162
    .line 163
    sget-object v1, LUc/f;->i:Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-virtual {p2}, Lm9/o;->hashCode()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Lm9/n;

    .line 178
    .line 179
    if-eqz v1, :cond_5

    .line 180
    .line 181
    invoke-virtual {p2, v1}, Lm9/o;->a(Lm9/n;)Ljava/util/HashMap;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_5
    invoke-virtual {p2}, Lm9/o;->b()Ljava/util/Map;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_6
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    :goto_0
    const-string v1, "metadata"

    .line 201
    .line 202
    iget-object v2, p2, Lm9/o;->d:Lm9/b0;

    .line 203
    .line 204
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    sget-object v1, LUc/f;->i:Ljava/util/HashMap;

    .line 208
    .line 209
    invoke-virtual {p2}, Lm9/o;->hashCode()I

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p1, v0}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_7
    instance-of v0, p2, Lm9/Y;

    .line 225
    .line 226
    if-eqz v0, :cond_a

    .line 227
    .line 228
    check-cast p2, Lm9/Y;

    .line 229
    .line 230
    new-instance v0, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    new-instance v1, Ljava/util/HashMap;

    .line 236
    .line 237
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 238
    .line 239
    .line 240
    new-instance v2, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    new-instance v3, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    sget-object v4, LUc/f;->i:Ljava/util/HashMap;

    .line 251
    .line 252
    invoke-virtual {p2}, Lm9/Y;->hashCode()I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    check-cast v4, Lm9/n;

    .line 265
    .line 266
    invoke-virtual {p2}, Lm9/Y;->b()Ljava/util/ArrayList;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_9

    .line 279
    .line 280
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    check-cast v6, Lm9/o;

    .line 285
    .line 286
    iget-object v7, v6, Lm9/o;->b:Ls9/h;

    .line 287
    .line 288
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    iget-object v7, v7, Ls9/h;->a:Ls9/m;

    .line 292
    .line 293
    invoke-virtual {v7}, Ls9/m;->c()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    if-eqz v4, :cond_8

    .line 301
    .line 302
    invoke-virtual {v6, v4}, Lm9/o;->a(Lm9/n;)Ljava/util/HashMap;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    goto :goto_2

    .line 310
    :cond_8
    invoke-virtual {v6}, Lm9/o;->b()Ljava/util/Map;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :goto_2
    iget-object v6, v6, Lm9/o;->d:Lm9/b0;

    .line 318
    .line 319
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_1

    .line 323
    :cond_9
    const-string v4, "paths"

    .line 324
    .line 325
    invoke-virtual {v1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    const-string v0, "documents"

    .line 329
    .line 330
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    const-string v0, "metadatas"

    .line 334
    .line 335
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    const-string v0, "documentChanges"

    .line 339
    .line 340
    invoke-virtual {p2}, Lm9/Y;->a()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    const-string v0, "metadata"

    .line 348
    .line 349
    iget-object v2, p2, Lm9/Y;->f:Lm9/b0;

    .line 350
    .line 351
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    sget-object v0, LUc/f;->i:Ljava/util/HashMap;

    .line 355
    .line 356
    invoke-virtual {p2}, Lm9/Y;->hashCode()I

    .line 357
    .line 358
    .line 359
    move-result p2

    .line 360
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    invoke-virtual {p0, p1, v1}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_a
    instance-of v0, p2, Lm9/i;

    .line 372
    .line 373
    const/4 v4, 0x2

    .line 374
    if-eqz v0, :cond_e

    .line 375
    .line 376
    check-cast p2, Lm9/i;

    .line 377
    .line 378
    new-instance v0, Ljava/util/HashMap;

    .line 379
    .line 380
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 381
    .line 382
    .line 383
    iget v1, p2, Lm9/i;->a:I

    .line 384
    .line 385
    invoke-static {v1}, LA/f;->f(I)I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_d

    .line 390
    .line 391
    if-eq v1, v2, :cond_c

    .line 392
    .line 393
    if-eq v1, v4, :cond_b

    .line 394
    .line 395
    goto :goto_3

    .line 396
    :cond_b
    const-string v3, "DocumentChangeType.removed"

    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_c
    const-string v3, "DocumentChangeType.modified"

    .line 400
    .line 401
    goto :goto_3

    .line 402
    :cond_d
    const-string v3, "DocumentChangeType.added"

    .line 403
    .line 404
    :goto_3
    const-string v1, "type"

    .line 405
    .line 406
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    iget-object v1, p2, Lm9/i;->b:Lm9/X;

    .line 410
    .line 411
    invoke-virtual {v1}, Lm9/X;->b()Ljava/util/Map;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    const-string v3, "data"

    .line 416
    .line 417
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    iget-object v2, v1, Lm9/o;->b:Ls9/h;

    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    iget-object v2, v2, Ls9/h;->a:Ls9/m;

    .line 426
    .line 427
    invoke-virtual {v2}, Ls9/m;->c()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const-string v3, "path"

    .line 432
    .line 433
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    iget v2, p2, Lm9/i;->c:I

    .line 437
    .line 438
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const-string v3, "oldIndex"

    .line 443
    .line 444
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    iget p2, p2, Lm9/i;->d:I

    .line 448
    .line 449
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object p2

    .line 453
    const-string v2, "newIndex"

    .line 454
    .line 455
    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    iget-object p2, v1, Lm9/o;->d:Lm9/b0;

    .line 459
    .line 460
    const-string v1, "metadata"

    .line 461
    .line 462
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    invoke-virtual {p0, p1, v0}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_e
    instance-of v0, p2, Lm9/O;

    .line 470
    .line 471
    if-eqz v0, :cond_12

    .line 472
    .line 473
    check-cast p2, Lm9/O;

    .line 474
    .line 475
    new-instance v0, Ljava/util/HashMap;

    .line 476
    .line 477
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 478
    .line 479
    .line 480
    iget-wide v5, p2, Lm9/O;->c:J

    .line 481
    .line 482
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    const-string v3, "bytesLoaded"

    .line 487
    .line 488
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    iget v1, p2, Lm9/O;->a:I

    .line 492
    .line 493
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    const-string v3, "documentsLoaded"

    .line 498
    .line 499
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    iget-wide v5, p2, Lm9/O;->d:J

    .line 503
    .line 504
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    const-string v3, "totalBytes"

    .line 509
    .line 510
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    iget v1, p2, Lm9/O;->b:I

    .line 514
    .line 515
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    const-string v3, "totalDocuments"

    .line 520
    .line 521
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    iget p2, p2, Lm9/O;->e:I

    .line 525
    .line 526
    invoke-static {p2}, LA/f;->f(I)I

    .line 527
    .line 528
    .line 529
    move-result p2

    .line 530
    if-eqz p2, :cond_10

    .line 531
    .line 532
    const-string v1, "running"

    .line 533
    .line 534
    if-eq p2, v2, :cond_11

    .line 535
    .line 536
    if-eq p2, v4, :cond_f

    .line 537
    .line 538
    goto :goto_4

    .line 539
    :cond_f
    const-string v1, "success"

    .line 540
    .line 541
    goto :goto_4

    .line 542
    :cond_10
    const-string v1, "error"

    .line 543
    .line 544
    :cond_11
    :goto_4
    const-string p2, "taskState"

    .line 545
    .line 546
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    invoke-virtual {p0, p1, v0}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :cond_12
    instance-of v0, p2, Lm9/b0;

    .line 554
    .line 555
    if-eqz v0, :cond_13

    .line 556
    .line 557
    check-cast p2, Lm9/b0;

    .line 558
    .line 559
    new-instance v0, Ljava/util/HashMap;

    .line 560
    .line 561
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 562
    .line 563
    .line 564
    iget-boolean v1, p2, Lm9/b0;->a:Z

    .line 565
    .line 566
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    const-string v2, "hasPendingWrites"

    .line 571
    .line 572
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    iget-boolean p2, p2, Lm9/b0;->b:Z

    .line 576
    .line 577
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 578
    .line 579
    .line 580
    move-result-object p2

    .line 581
    const-string v1, "isFromCache"

    .line 582
    .line 583
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    invoke-virtual {p0, p1, v0}, LUc/c;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :cond_13
    instance-of v0, p2, Lm9/g;

    .line 591
    .line 592
    if-eqz v0, :cond_14

    .line 593
    .line 594
    const/16 v0, -0x49

    .line 595
    .line 596
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 597
    .line 598
    .line 599
    check-cast p2, Lm9/g;

    .line 600
    .line 601
    iget-object p2, p2, Lm9/g;->a:Lcom/google/protobuf/ByteString;

    .line 602
    .line 603
    invoke-virtual {p2}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 604
    .line 605
    .line 606
    move-result-object p2

    .line 607
    array-length v0, p2

    .line 608
    invoke-static {p1, v0}, Luc/w;->j(Ljava/io/ByteArrayOutputStream;I)V

    .line 609
    .line 610
    .line 611
    array-length v0, p2

    .line 612
    invoke-virtual {p1, p2, v1, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 613
    .line 614
    .line 615
    return-void

    .line 616
    :cond_14
    instance-of v0, p2, Ljava/lang/Double;

    .line 617
    .line 618
    if-eqz v0, :cond_18

    .line 619
    .line 620
    move-object v0, p2

    .line 621
    check-cast v0, Ljava/lang/Double;

    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 624
    .line 625
    .line 626
    move-result-wide v1

    .line 627
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    if-eqz v1, :cond_15

    .line 632
    .line 633
    const/16 p2, -0x3f

    .line 634
    .line 635
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 636
    .line 637
    .line 638
    return-void

    .line 639
    :cond_15
    const-wide/high16 v1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 640
    .line 641
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    if-eqz v1, :cond_16

    .line 650
    .line 651
    const/16 p2, -0x3d

    .line 652
    .line 653
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 654
    .line 655
    .line 656
    return-void

    .line 657
    :cond_16
    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 658
    .line 659
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    if-eqz v0, :cond_17

    .line 668
    .line 669
    const/16 p2, -0x3e

    .line 670
    .line 671
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :cond_17
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :cond_18
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-void
.end method
