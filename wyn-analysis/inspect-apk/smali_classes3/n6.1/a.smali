.class public final Ln6/a;
.super Lh6/e;
.source "SourceFile"


# static fields
.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;


# instance fields
.field public final m:Ljava/lang/StringBuilder;

.field public final n:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ln6/a;->o:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "\\{\\\\.*?\\}"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ln6/a;->p:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lh6/e;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln6/a;->m:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ln6/a;->n:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method

.method public static h(Ljava/util/regex/Matcher;I)J
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/32 v2, 0x36ee80

    .line 14
    .line 15
    .line 16
    mul-long/2addr v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, p1, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/32 v4, 0xea60

    .line 34
    .line 35
    .line 36
    mul-long/2addr v2, v4

    .line 37
    add-long/2addr v2, v0

    .line 38
    add-int/lit8 v0, p1, 0x3

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v4, 0x3e8

    .line 52
    .line 53
    mul-long/2addr v0, v4

    .line 54
    add-long/2addr v0, v2

    .line 55
    add-int/lit8 p1, p1, 0x4

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    add-long/2addr v0, p0

    .line 68
    :cond_1
    mul-long/2addr v0, v4

    .line 69
    return-wide v0
.end method


# virtual methods
.method public final e([BIZ)Lh6/f;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "SubripDecoder"

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v3, 0x20

    .line 11
    .line 12
    new-array v3, v3, [J

    .line 13
    .line 14
    new-instance v4, LY4/b;

    .line 15
    .line 16
    move-object/from16 v5, p1

    .line 17
    .line 18
    move/from16 v6, p2

    .line 19
    .line 20
    invoke-direct {v4, v5, v6}, LY4/b;-><init>([BI)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    move v6, v5

    .line 25
    :goto_0
    invoke-virtual {v4}, LY4/b;->e()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    if-eqz v7, :cond_1

    .line 30
    .line 31
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-nez v8, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    :try_start_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, LY4/b;->e()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    if-nez v7, :cond_2

    .line 46
    .line 47
    const-string v4, "Unexpected end"

    .line 48
    .line 49
    invoke-static {v1, v4}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    move v0, v5

    .line 53
    goto/16 :goto_10

    .line 54
    .line 55
    :cond_2
    sget-object v8, Ln6/a;->o:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    invoke-virtual {v8, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_17

    .line 66
    .line 67
    const/4 v7, 0x1

    .line 68
    invoke-static {v8, v7}, Ln6/a;->h(Ljava/util/regex/Matcher;I)J

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    array-length v11, v3

    .line 73
    if-ne v6, v11, :cond_3

    .line 74
    .line 75
    mul-int/lit8 v11, v6, 0x2

    .line 76
    .line 77
    invoke-static {v3, v11}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    :cond_3
    add-int/lit8 v11, v6, 0x1

    .line 82
    .line 83
    aput-wide v9, v3, v6

    .line 84
    .line 85
    const/4 v9, 0x6

    .line 86
    invoke-static {v8, v9}, Ln6/a;->h(Ljava/util/regex/Matcher;I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v12

    .line 90
    array-length v8, v3

    .line 91
    if-ne v11, v8, :cond_4

    .line 92
    .line 93
    mul-int/lit8 v8, v11, 0x2

    .line 94
    .line 95
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_4
    add-int/lit8 v6, v6, 0x2

    .line 100
    .line 101
    aput-wide v12, v3, v11

    .line 102
    .line 103
    iget-object v8, v0, Ln6/a;->m:Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 106
    .line 107
    .line 108
    iget-object v10, v0, Ln6/a;->n:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, LY4/b;->e()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    :goto_1
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    if-nez v12, :cond_7

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-lez v12, :cond_5

    .line 128
    .line 129
    const-string v12, "<br>"

    .line 130
    .line 131
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    new-instance v12, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sget-object v13, Ln6/a;->p:Ljava/util/regex/Pattern;

    .line 144
    .line 145
    invoke-virtual {v13, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    move v13, v5

    .line 150
    :goto_2
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    if-eqz v14, :cond_6

    .line 155
    .line 156
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->start()I

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    sub-int/2addr v15, v13

    .line 168
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    add-int v9, v15, v14

    .line 173
    .line 174
    const-string v5, ""

    .line 175
    .line 176
    invoke-virtual {v12, v15, v9, v5}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    add-int/2addr v13, v14

    .line 180
    const/4 v5, 0x0

    .line 181
    const/4 v9, 0x6

    .line 182
    goto :goto_2

    .line 183
    :cond_6
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, LY4/b;->e()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    const/4 v5, 0x0

    .line 195
    const/4 v9, 0x6

    .line 196
    goto :goto_1

    .line 197
    :cond_7
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-static {v5}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    const/4 v5, 0x0

    .line 206
    :goto_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    if-ge v5, v8, :cond_9

    .line 211
    .line 212
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    check-cast v8, Ljava/lang/String;

    .line 217
    .line 218
    const-string v9, "\\{\\\\an[1-9]\\}"

    .line 219
    .line 220
    invoke-virtual {v8, v9}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-eqz v9, :cond_8

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_9
    const/4 v8, 0x0

    .line 231
    :goto_4
    const/16 v28, 0x0

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const v16, -0x800001

    .line 235
    .line 236
    .line 237
    const/high16 v17, -0x80000000

    .line 238
    .line 239
    const/16 v25, 0x0

    .line 240
    .line 241
    const/high16 v26, -0x1000000

    .line 242
    .line 243
    if-nez v8, :cond_a

    .line 244
    .line 245
    new-instance v11, Lh6/b;

    .line 246
    .line 247
    move-object v14, v13

    .line 248
    move-object v15, v13

    .line 249
    move/from16 v18, v17

    .line 250
    .line 251
    move/from16 v19, v16

    .line 252
    .line 253
    move/from16 v20, v17

    .line 254
    .line 255
    move/from16 v21, v17

    .line 256
    .line 257
    move/from16 v22, v16

    .line 258
    .line 259
    move/from16 v23, v16

    .line 260
    .line 261
    move/from16 v24, v16

    .line 262
    .line 263
    move/from16 v27, v17

    .line 264
    .line 265
    invoke-direct/range {v11 .. v28}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v29, v3

    .line 269
    .line 270
    move-object/from16 v30, v4

    .line 271
    .line 272
    goto/16 :goto_d

    .line 273
    .line 274
    :cond_a
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    const-string v10, "{\\an1}"

    .line 279
    .line 280
    const-string v11, "{\\an2}"

    .line 281
    .line 282
    const-string v14, "{\\an3}"

    .line 283
    .line 284
    const-string v15, "{\\an4}"

    .line 285
    .line 286
    const/16 v18, 0x7

    .line 287
    .line 288
    move-object/from16 p3, v13

    .line 289
    .line 290
    const-string v13, "{\\an5}"

    .line 291
    .line 292
    const-string v9, "{\\an6}"

    .line 293
    .line 294
    const-string v7, "{\\an7}"

    .line 295
    .line 296
    const/16 v21, 0x8

    .line 297
    .line 298
    const-string v0, "{\\an8}"

    .line 299
    .line 300
    move-object/from16 v29, v3

    .line 301
    .line 302
    const-string v3, "{\\an9}"

    .line 303
    .line 304
    const/16 v22, -0x1

    .line 305
    .line 306
    move-object/from16 v30, v4

    .line 307
    .line 308
    sparse-switch v5, :sswitch_data_0

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :sswitch_0
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eqz v5, :cond_b

    .line 317
    .line 318
    const/4 v5, 0x5

    .line 319
    goto :goto_6

    .line 320
    :sswitch_1
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_b

    .line 325
    .line 326
    move/from16 v5, v21

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :sswitch_2
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-eqz v5, :cond_b

    .line 334
    .line 335
    const/4 v5, 0x2

    .line 336
    goto :goto_6

    .line 337
    :sswitch_3
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-eqz v5, :cond_b

    .line 342
    .line 343
    const/4 v5, 0x4

    .line 344
    goto :goto_6

    .line 345
    :sswitch_4
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_b

    .line 350
    .line 351
    move/from16 v5, v18

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :sswitch_5
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    if-eqz v5, :cond_b

    .line 359
    .line 360
    const/4 v5, 0x1

    .line 361
    goto :goto_6

    .line 362
    :sswitch_6
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-eqz v5, :cond_b

    .line 367
    .line 368
    const/4 v5, 0x3

    .line 369
    goto :goto_6

    .line 370
    :sswitch_7
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-eqz v5, :cond_b

    .line 375
    .line 376
    const/4 v5, 0x6

    .line 377
    goto :goto_6

    .line 378
    :sswitch_8
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-eqz v5, :cond_b

    .line 383
    .line 384
    const/4 v5, 0x0

    .line 385
    goto :goto_6

    .line 386
    :cond_b
    :goto_5
    move/from16 v5, v22

    .line 387
    .line 388
    :goto_6
    if-eqz v5, :cond_d

    .line 389
    .line 390
    const/4 v4, 0x1

    .line 391
    if-eq v5, v4, :cond_d

    .line 392
    .line 393
    const/4 v4, 0x2

    .line 394
    if-eq v5, v4, :cond_d

    .line 395
    .line 396
    const/4 v4, 0x3

    .line 397
    if-eq v5, v4, :cond_c

    .line 398
    .line 399
    const/4 v4, 0x4

    .line 400
    if-eq v5, v4, :cond_c

    .line 401
    .line 402
    const/4 v4, 0x5

    .line 403
    if-eq v5, v4, :cond_c

    .line 404
    .line 405
    const/4 v4, 0x1

    .line 406
    goto :goto_7

    .line 407
    :cond_c
    const/4 v4, 0x2

    .line 408
    goto :goto_7

    .line 409
    :cond_d
    const/4 v4, 0x0

    .line 410
    :goto_7
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    sparse-switch v5, :sswitch_data_1

    .line 415
    .line 416
    .line 417
    goto :goto_8

    .line 418
    :sswitch_9
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_e

    .line 423
    .line 424
    const/4 v9, 0x5

    .line 425
    goto :goto_9

    .line 426
    :sswitch_a
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-eqz v0, :cond_e

    .line 431
    .line 432
    const/4 v9, 0x4

    .line 433
    goto :goto_9

    .line 434
    :sswitch_b
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-eqz v0, :cond_e

    .line 439
    .line 440
    const/4 v9, 0x3

    .line 441
    goto :goto_9

    .line 442
    :sswitch_c
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_e

    .line 447
    .line 448
    move/from16 v9, v21

    .line 449
    .line 450
    goto :goto_9

    .line 451
    :sswitch_d
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_e

    .line 456
    .line 457
    move/from16 v9, v18

    .line 458
    .line 459
    goto :goto_9

    .line 460
    :sswitch_e
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_e

    .line 465
    .line 466
    const/4 v9, 0x6

    .line 467
    goto :goto_9

    .line 468
    :sswitch_f
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-eqz v0, :cond_e

    .line 473
    .line 474
    const/4 v9, 0x2

    .line 475
    goto :goto_9

    .line 476
    :sswitch_10
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_e

    .line 481
    .line 482
    const/4 v9, 0x1

    .line 483
    goto :goto_9

    .line 484
    :sswitch_11
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-eqz v0, :cond_e

    .line 489
    .line 490
    const/4 v9, 0x0

    .line 491
    goto :goto_9

    .line 492
    :cond_e
    :goto_8
    move/from16 v9, v22

    .line 493
    .line 494
    :goto_9
    if-eqz v9, :cond_10

    .line 495
    .line 496
    const/4 v0, 0x1

    .line 497
    if-eq v9, v0, :cond_10

    .line 498
    .line 499
    const/4 v0, 0x2

    .line 500
    if-eq v9, v0, :cond_10

    .line 501
    .line 502
    const/4 v0, 0x3

    .line 503
    if-eq v9, v0, :cond_f

    .line 504
    .line 505
    const/4 v0, 0x4

    .line 506
    if-eq v9, v0, :cond_f

    .line 507
    .line 508
    const/4 v0, 0x5

    .line 509
    if-eq v9, v0, :cond_f

    .line 510
    .line 511
    const/4 v0, 0x1

    .line 512
    goto :goto_a

    .line 513
    :cond_f
    const/4 v0, 0x0

    .line 514
    goto :goto_a

    .line 515
    :cond_10
    const/4 v0, 0x2

    .line 516
    :goto_a
    const v3, 0x3da3d70a    # 0.08f

    .line 517
    .line 518
    .line 519
    const/high16 v5, 0x3f000000    # 0.5f

    .line 520
    .line 521
    const v7, 0x3f6b851f    # 0.92f

    .line 522
    .line 523
    .line 524
    if-eqz v4, :cond_13

    .line 525
    .line 526
    const/4 v8, 0x1

    .line 527
    if-eq v4, v8, :cond_12

    .line 528
    .line 529
    const/4 v9, 0x2

    .line 530
    if-ne v4, v9, :cond_11

    .line 531
    .line 532
    move/from16 v19, v7

    .line 533
    .line 534
    goto :goto_b

    .line 535
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 536
    .line 537
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 538
    .line 539
    .line 540
    throw v0

    .line 541
    :cond_12
    const/4 v9, 0x2

    .line 542
    move/from16 v19, v5

    .line 543
    .line 544
    goto :goto_b

    .line 545
    :cond_13
    const/4 v8, 0x1

    .line 546
    const/4 v9, 0x2

    .line 547
    move/from16 v19, v3

    .line 548
    .line 549
    :goto_b
    if-eqz v0, :cond_16

    .line 550
    .line 551
    if-eq v0, v8, :cond_15

    .line 552
    .line 553
    if-ne v0, v9, :cond_14

    .line 554
    .line 555
    move v3, v7

    .line 556
    goto :goto_c

    .line 557
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 558
    .line 559
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 560
    .line 561
    .line 562
    throw v0

    .line 563
    :cond_15
    move v3, v5

    .line 564
    :cond_16
    :goto_c
    new-instance v11, Lh6/b;

    .line 565
    .line 566
    move/from16 v21, v17

    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    move-object/from16 v14, p3

    .line 571
    .line 572
    move-object/from16 v15, p3

    .line 573
    .line 574
    move/from16 v23, v16

    .line 575
    .line 576
    move/from16 v24, v16

    .line 577
    .line 578
    move/from16 v27, v21

    .line 579
    .line 580
    move-object/from16 v13, p3

    .line 581
    .line 582
    move/from16 v18, v0

    .line 583
    .line 584
    move/from16 v20, v4

    .line 585
    .line 586
    move/from16 v22, v16

    .line 587
    .line 588
    move/from16 v16, v3

    .line 589
    .line 590
    invoke-direct/range {v11 .. v28}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 591
    .line 592
    .line 593
    :goto_d
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    sget-object v0, Lh6/b;->r:Lh6/b;

    .line 597
    .line 598
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-object/from16 v0, p0

    .line 602
    .line 603
    move-object/from16 v3, v29

    .line 604
    .line 605
    move-object/from16 v4, v30

    .line 606
    .line 607
    :goto_e
    const/4 v5, 0x0

    .line 608
    goto/16 :goto_0

    .line 609
    .line 610
    :cond_17
    move-object/from16 v30, v4

    .line 611
    .line 612
    const-string v0, "Skipping invalid timing: "

    .line 613
    .line 614
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-static {v1, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    :goto_f
    move-object/from16 v0, p0

    .line 622
    .line 623
    goto :goto_e

    .line 624
    :catch_0
    move-object/from16 v30, v4

    .line 625
    .line 626
    const-string v0, "Skipping invalid index: "

    .line 627
    .line 628
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-static {v1, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    goto :goto_f

    .line 636
    :goto_10
    new-array v0, v0, [Lh6/b;

    .line 637
    .line 638
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    check-cast v0, [Lh6/b;

    .line 643
    .line 644
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    new-instance v2, LX2/j;

    .line 649
    .line 650
    const/16 v3, 0x16

    .line 651
    .line 652
    invoke-direct {v2, v3, v0, v1}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    return-object v2

    .line 656
    nop

    .line 657
    :sswitch_data_0
    .sparse-switch
        -0x28ddbde6 -> :sswitch_8
        -0x28ddbdc7 -> :sswitch_7
        -0x28ddbda8 -> :sswitch_6
        -0x28ddbd89 -> :sswitch_5
        -0x28ddbd6a -> :sswitch_4
        -0x28ddbd4b -> :sswitch_3
        -0x28ddbd2c -> :sswitch_2
        -0x28ddbd0d -> :sswitch_1
        -0x28ddbcee -> :sswitch_0
    .end sparse-switch

    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
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
    :sswitch_data_1
    .sparse-switch
        -0x28ddbde6 -> :sswitch_11
        -0x28ddbdc7 -> :sswitch_10
        -0x28ddbda8 -> :sswitch_f
        -0x28ddbd89 -> :sswitch_e
        -0x28ddbd6a -> :sswitch_d
        -0x28ddbd4b -> :sswitch_c
        -0x28ddbd2c -> :sswitch_b
        -0x28ddbd0d -> :sswitch_a
        -0x28ddbcee -> :sswitch_9
    .end sparse-switch
.end method
