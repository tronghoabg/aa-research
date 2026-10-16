.class public final Lo9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Lo9/g;

.field public final b:Ljava/io/ByteArrayInputStream;

.field public c:Lo9/e;

.field public final d:Ljava/nio/ByteBuffer;

.field public e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo9/f;->f:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lo9/g;Ljava/io/ByteArrayInputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo9/f;->a:Lo9/g;

    .line 5
    .line 6
    iput-object p2, p0, Lo9/f;->b:Ljava/io/ByteArrayInputStream;

    .line 7
    .line 8
    new-instance p1, Ljava/io/InputStreamReader;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0x400

    .line 14
    .line 15
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lo9/f;->d:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo9/f;->b:Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "Invalid bundle: "

    .line 9
    .line 10
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final b()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lo9/f;->d:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    add-int/2addr v3, v2

    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v4, p0, Lo9/f;->b:Ljava/io/ByteArrayInputStream;

    .line 24
    .line 25
    invoke-virtual {v4, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-lez v1, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v3, v1

    .line 41
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 45
    .line 46
    .line 47
    return v2
.end method

.method public final c()Lo9/c;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :cond_0
    iget-object v2, v1, Lo9/f;->d:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v3, v0

    .line 10
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, -0x1

    .line 15
    if-ge v3, v4, :cond_2

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->get()B

    .line 18
    .line 19
    .line 20
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    const/16 v6, 0x7b

    .line 22
    .line 23
    if-ne v4, v6, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_e

    .line 34
    .line 35
    :cond_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 36
    .line 37
    .line 38
    move v3, v5

    .line 39
    :goto_1
    if-ne v3, v5, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1}, Lo9/f;->b()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_0

    .line 46
    .line 47
    :cond_3
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v6, 0x0

    .line 52
    sget-object v7, Lo9/f;->f:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    if-nez v4, :cond_4

    .line 55
    .line 56
    move-object v3, v6

    .line 57
    goto :goto_2

    .line 58
    :cond_4
    if-eq v3, v5, :cond_1a

    .line 59
    .line 60
    new-array v3, v3, [B

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v7, v3}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    :goto_2
    if-nez v3, :cond_5

    .line 78
    .line 79
    return-object v6

    .line 80
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    .line 85
    .line 86
    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 87
    .line 88
    .line 89
    move v9, v4

    .line 90
    :goto_3
    if-lez v9, :cond_8

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_7

    .line 97
    .line 98
    invoke-virtual {v1}, Lo9/f;->b()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    const-string v0, "Reached the end of bundle when more data was expected."

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Lo9/f;->a(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v6

    .line 111
    :cond_7
    :goto_4
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    add-int/2addr v13, v12

    .line 132
    invoke-virtual {v8, v11, v13, v10}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    add-int/2addr v11, v10

    .line 140
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 141
    .line 142
    .line 143
    sub-int/2addr v9, v10

    .line 144
    goto :goto_3

    .line 145
    :cond_8
    invoke-virtual {v7}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v8, v2}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-wide v8, v1, Lo9/f;->e:J

    .line 154
    .line 155
    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    array-length v3, v3

    .line 160
    add-int/2addr v3, v4

    .line 161
    int-to-long v3, v3

    .line 162
    add-long/2addr v8, v3

    .line 163
    iput-wide v8, v1, Lo9/f;->e:J

    .line 164
    .line 165
    new-instance v3, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string v4, "metadata"

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    const/4 v8, 0x1

    .line 177
    const-string v9, "BundleElement"

    .line 178
    .line 179
    iget-object v10, v1, Lo9/f;->a:Lo9/g;

    .line 180
    .line 181
    if-eqz v7, :cond_9

    .line 182
    .line 183
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const-string v3, "id"

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    const-string v3, "version"

    .line 197
    .line 198
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    const-string v3, "createTime"

    .line 203
    .line 204
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    new-instance v14, Ls9/o;

    .line 209
    .line 210
    invoke-virtual {v10, v3}, Lo9/g;->e(Ljava/lang/Object;)Ls8/q;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-direct {v14, v3}, Ls9/o;-><init>(Ls8/q;)V

    .line 215
    .line 216
    .line 217
    const-string v3, "totalDocuments"

    .line 218
    .line 219
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    const-string v3, "totalBytes"

    .line 224
    .line 225
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 226
    .line 227
    .line 228
    move-result-wide v16

    .line 229
    new-instance v11, Lo9/e;

    .line 230
    .line 231
    invoke-direct/range {v11 .. v17}, Lo9/e;-><init>(Ljava/lang/String;ILs9/o;IJ)V

    .line 232
    .line 233
    .line 234
    new-array v0, v0, [Ljava/lang/Object;

    .line 235
    .line 236
    const-string v2, "BundleMetadata element loaded"

    .line 237
    .line 238
    invoke-static {v9, v2, v8, v0}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    return-object v11

    .line 242
    :cond_9
    const-string v4, "namedQuery"

    .line 243
    .line 244
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    const-string v11, "readTime"

    .line 249
    .line 250
    const-string v12, "name"

    .line 251
    .line 252
    if-eqz v7, :cond_16

    .line 253
    .line 254
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    const-string v4, "bundledQuery"

    .line 266
    .line 267
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    const-string v7, "structuredQuery"

    .line 272
    .line 273
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    const-string v12, "select"

    .line 278
    .line 279
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 280
    .line 281
    .line 282
    move-result v12

    .line 283
    if-nez v12, :cond_15

    .line 284
    .line 285
    const-string v12, "parent"

    .line 286
    .line 287
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    invoke-virtual {v10, v12}, Lo9/g;->c(Ljava/lang/String;)Ls9/m;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    const-string v13, "from"

    .line 296
    .line 297
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 302
    .line 303
    .line 304
    move-result v14

    .line 305
    if-ne v14, v8, :cond_14

    .line 306
    .line 307
    invoke-virtual {v13, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 308
    .line 309
    .line 310
    move-result-object v13

    .line 311
    const-string v14, "allDescendants"

    .line 312
    .line 313
    invoke-virtual {v13, v14, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 314
    .line 315
    .line 316
    move-result v14

    .line 317
    const-string v15, "collectionId"

    .line 318
    .line 319
    if-eqz v14, :cond_a

    .line 320
    .line 321
    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v13

    .line 325
    move-object v15, v13

    .line 326
    :goto_5
    move-object v14, v12

    .line 327
    goto :goto_6

    .line 328
    :cond_a
    invoke-virtual {v13, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v13

    .line 332
    invoke-virtual {v12, v13}, Ls9/e;->a(Ljava/lang/String;)Ls9/e;

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    check-cast v12, Ls9/m;

    .line 337
    .line 338
    move-object v15, v6

    .line 339
    goto :goto_5

    .line 340
    :goto_6
    const-string v12, "where"

    .line 341
    .line 342
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    new-instance v13, Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 349
    .line 350
    .line 351
    if-eqz v12, :cond_b

    .line 352
    .line 353
    invoke-virtual {v10, v13, v12}, Lo9/g;->a(Ljava/util/ArrayList;Lorg/json/JSONObject;)V

    .line 354
    .line 355
    .line 356
    :cond_b
    const-string v12, "orderBy"

    .line 357
    .line 358
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 359
    .line 360
    .line 361
    move-result-object v12

    .line 362
    move-object/from16 v16, v6

    .line 363
    .line 364
    new-instance v6, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 367
    .line 368
    .line 369
    const/16 v17, 0x2

    .line 370
    .line 371
    move/from16 v23, v8

    .line 372
    .line 373
    if-eqz v12, :cond_d

    .line 374
    .line 375
    move v8, v0

    .line 376
    :goto_7
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    if-ge v8, v5, :cond_d

    .line 381
    .line 382
    invoke-virtual {v12, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    const-string v0, "field"

    .line 387
    .line 388
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    move/from16 v19, v8

    .line 393
    .line 394
    const-string v8, "fieldPath"

    .line 395
    .line 396
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {v0}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    const-string v8, "direction"

    .line 405
    .line 406
    move-object/from16 v20, v12

    .line 407
    .line 408
    const-string v12, "ASCENDING"

    .line 409
    .line 410
    invoke-virtual {v5, v8, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    if-eqz v5, :cond_c

    .line 419
    .line 420
    move/from16 v5, v23

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_c
    move/from16 v5, v17

    .line 424
    .line 425
    :goto_8
    new-instance v8, Lp9/t;

    .line 426
    .line 427
    invoke-direct {v8, v5, v0}, Lp9/t;-><init>(ILs9/j;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    add-int/lit8 v8, v19, 0x1

    .line 434
    .line 435
    move-object/from16 v12, v20

    .line 436
    .line 437
    const/4 v0, 0x0

    .line 438
    goto :goto_7

    .line 439
    :cond_d
    const-string v0, "startAt"

    .line 440
    .line 441
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    const-string v5, "before"

    .line 446
    .line 447
    if-eqz v0, :cond_e

    .line 448
    .line 449
    const/4 v8, 0x0

    .line 450
    invoke-virtual {v0, v5, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 451
    .line 452
    .line 453
    move-result v12

    .line 454
    invoke-virtual {v10, v0}, Lo9/g;->d(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    new-instance v8, Lp9/c;

    .line 459
    .line 460
    invoke-direct {v8, v0, v12}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 461
    .line 462
    .line 463
    move-object/from16 v21, v8

    .line 464
    .line 465
    goto :goto_9

    .line 466
    :cond_e
    move-object/from16 v21, v16

    .line 467
    .line 468
    :goto_9
    const-string v0, "endAt"

    .line 469
    .line 470
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    if-eqz v0, :cond_f

    .line 475
    .line 476
    const/4 v8, 0x0

    .line 477
    invoke-virtual {v0, v5, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    invoke-virtual {v10, v0}, Lo9/g;->d(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    new-instance v8, Lp9/c;

    .line 486
    .line 487
    xor-int/lit8 v5, v5, 0x1

    .line 488
    .line 489
    invoke-direct {v8, v0, v5}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 490
    .line 491
    .line 492
    move-object/from16 v22, v8

    .line 493
    .line 494
    goto :goto_a

    .line 495
    :cond_f
    move-object/from16 v22, v16

    .line 496
    .line 497
    :goto_a
    const-string v0, "offset"

    .line 498
    .line 499
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-nez v0, :cond_13

    .line 504
    .line 505
    const-string v0, "limit"

    .line 506
    .line 507
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    if-eqz v5, :cond_10

    .line 512
    .line 513
    const-string v0, "value"

    .line 514
    .line 515
    const/4 v8, -0x1

    .line 516
    invoke-virtual {v5, v0, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    goto :goto_b

    .line 521
    :cond_10
    const/4 v8, -0x1

    .line 522
    invoke-virtual {v7, v0, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    :goto_b
    const-string v5, "limitType"

    .line 527
    .line 528
    const-string v7, "FIRST"

    .line 529
    .line 530
    invoke-virtual {v4, v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    const/16 v20, 0x1

    .line 539
    .line 540
    if-eqz v5, :cond_11

    .line 541
    .line 542
    move/from16 v4, v20

    .line 543
    .line 544
    goto :goto_c

    .line 545
    :cond_11
    const-string v5, "LAST"

    .line 546
    .line 547
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    if-eqz v5, :cond_12

    .line 552
    .line 553
    move/from16 v4, v17

    .line 554
    .line 555
    :goto_c
    new-instance v5, Lo9/i;

    .line 556
    .line 557
    move-object/from16 v16, v13

    .line 558
    .line 559
    new-instance v13, Lp9/u;

    .line 560
    .line 561
    int-to-long v7, v0

    .line 562
    move-object/from16 v17, v6

    .line 563
    .line 564
    move-wide/from16 v18, v7

    .line 565
    .line 566
    invoke-direct/range {v13 .. v22}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v13}, Lp9/u;->i()Lp9/A;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-direct {v5, v0, v4}, Lo9/i;-><init>(Lp9/A;I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    new-instance v2, Ls9/o;

    .line 581
    .line 582
    invoke-virtual {v10, v0}, Lo9/g;->e(Ljava/lang/Object;)Ls8/q;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-direct {v2, v0}, Ls9/o;-><init>(Ls8/q;)V

    .line 587
    .line 588
    .line 589
    new-instance v0, Lo9/j;

    .line 590
    .line 591
    invoke-direct {v0, v3, v5, v2}, Lo9/j;-><init>(Ljava/lang/String;Lo9/i;Ls9/o;)V

    .line 592
    .line 593
    .line 594
    const-string v2, "Query loaded: "

    .line 595
    .line 596
    invoke-static {v2, v3}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    const/4 v8, 0x0

    .line 601
    new-array v3, v8, [Ljava/lang/Object;

    .line 602
    .line 603
    move/from16 v4, v23

    .line 604
    .line 605
    invoke-static {v9, v2, v4, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    return-object v0

    .line 609
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 610
    .line 611
    const-string v2, "Invalid limit type for bundle query: "

    .line 612
    .line 613
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    throw v0

    .line 621
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 622
    .line 623
    const-string v2, "Queries with offsets are not supported by the Android SDK"

    .line 624
    .line 625
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    throw v0

    .line 629
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 630
    .line 631
    const-string v2, "Only queries with a single \'from\' clause are supported by the Android SDK"

    .line 632
    .line 633
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    throw v0

    .line 637
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 638
    .line 639
    const-string v2, "Queries with \'select\' statements are not supported by the Android SDK"

    .line 640
    .line 641
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    throw v0

    .line 645
    :cond_16
    move-object/from16 v16, v6

    .line 646
    .line 647
    const-string v0, "documentMetadata"

    .line 648
    .line 649
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 650
    .line 651
    .line 652
    move-result v4

    .line 653
    if-eqz v4, :cond_18

    .line 654
    .line 655
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    invoke-virtual {v10, v2}, Lo9/g;->c(Ljava/lang/String;)Ls9/m;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    new-instance v3, Ls9/h;

    .line 671
    .line 672
    invoke-direct {v3, v2}, Ls9/h;-><init>(Ls9/m;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    new-instance v4, Ls9/o;

    .line 680
    .line 681
    invoke-virtual {v10, v2}, Lo9/g;->e(Ljava/lang/Object;)Ls8/q;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    invoke-direct {v4, v2}, Ls9/o;-><init>(Ls8/q;)V

    .line 686
    .line 687
    .line 688
    const-string v2, "exists"

    .line 689
    .line 690
    const/4 v8, 0x0

    .line 691
    invoke-virtual {v0, v2, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    const-string v5, "queries"

    .line 696
    .line 697
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    new-instance v5, Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 704
    .line 705
    .line 706
    if-eqz v0, :cond_17

    .line 707
    .line 708
    const/4 v6, 0x0

    .line 709
    :goto_d
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 710
    .line 711
    .line 712
    move-result v7

    .line 713
    if-ge v6, v7, :cond_17

    .line 714
    .line 715
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    add-int/lit8 v6, v6, 0x1

    .line 723
    .line 724
    goto :goto_d

    .line 725
    :cond_17
    new-instance v0, Lo9/h;

    .line 726
    .line 727
    invoke-direct {v0, v3, v4, v2, v5}, Lo9/h;-><init>(Ls9/h;Ls9/o;ZLjava/util/ArrayList;)V

    .line 728
    .line 729
    .line 730
    new-instance v2, Ljava/lang/StringBuilder;

    .line 731
    .line 732
    const-string v4, "Document metadata loaded: "

    .line 733
    .line 734
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    const/4 v8, 0x0

    .line 745
    new-array v3, v8, [Ljava/lang/Object;

    .line 746
    .line 747
    const/4 v4, 0x1

    .line 748
    invoke-static {v9, v2, v4, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    return-object v0

    .line 752
    :cond_18
    const-string v0, "document"

    .line 753
    .line 754
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 755
    .line 756
    .line 757
    move-result v4

    .line 758
    if-eqz v4, :cond_19

    .line 759
    .line 760
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    invoke-virtual {v10, v2}, Lo9/g;->c(Ljava/lang/String;)Ls9/m;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    new-instance v3, Ls9/h;

    .line 776
    .line 777
    invoke-direct {v3, v2}, Ls9/h;-><init>(Ls9/m;)V

    .line 778
    .line 779
    .line 780
    const-string v2, "updateTime"

    .line 781
    .line 782
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    new-instance v4, Ls9/o;

    .line 787
    .line 788
    invoke-virtual {v10, v2}, Lo9/g;->e(Ljava/lang/Object;)Ls8/q;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    invoke-direct {v4, v2}, Ls9/o;-><init>(Ls8/q;)V

    .line 793
    .line 794
    .line 795
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    const-string v5, "fields"

    .line 800
    .line 801
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v10, v2, v0}, Lo9/g;->b(Lka/B1;Lorg/json/JSONObject;)V

    .line 806
    .line 807
    .line 808
    new-instance v0, Lo9/b;

    .line 809
    .line 810
    invoke-virtual {v2}, Lka/B1;->a()Lka/p0;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-virtual {v2}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    invoke-static {v2}, Ls9/l;->e(Ljava/util/Map;)Ls9/l;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    new-instance v5, Ls9/k;

    .line 823
    .line 824
    invoke-direct {v5, v3}, Ls9/k;-><init>(Ls9/h;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v5, v4, v2}, Ls9/k;->a(Ls9/o;Ls9/l;)V

    .line 828
    .line 829
    .line 830
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 831
    .line 832
    .line 833
    iput-object v5, v0, Lo9/b;->a:Ls9/k;

    .line 834
    .line 835
    new-instance v2, Ljava/lang/StringBuilder;

    .line 836
    .line 837
    const-string v4, "Document loaded: "

    .line 838
    .line 839
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    const/4 v8, 0x0

    .line 850
    new-array v3, v8, [Ljava/lang/Object;

    .line 851
    .line 852
    const/4 v4, 0x1

    .line 853
    invoke-static {v9, v2, v4, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    return-object v0

    .line 857
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 858
    .line 859
    const-string v3, "Cannot decode unknown Bundle element: "

    .line 860
    .line 861
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-virtual {v1, v0}, Lo9/f;->a(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v16

    .line 875
    :cond_1a
    move-object/from16 v16, v6

    .line 876
    .line 877
    const-string v0, "Reached the end of bundle when a length string is expected."

    .line 878
    .line 879
    invoke-virtual {v1, v0}, Lo9/f;->a(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    throw v16

    .line 883
    :goto_e
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 884
    .line 885
    .line 886
    throw v0
.end method
