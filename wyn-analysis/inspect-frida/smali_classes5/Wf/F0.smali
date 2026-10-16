.class public final LWf/F0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/KSerializer;


# static fields
.field public static final a:LWf/F0;

.field public static final b:LWf/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LWf/F0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LWf/F0;->a:LWf/F0;

    .line 7
    .line 8
    new-instance v0, LWf/h0;

    .line 9
    .line 10
    sget-object v1, LUf/e;->x:LUf/e;

    .line 11
    .line 12
    const-string v2, "kotlin.uuid.Uuid"

    .line 13
    .line 14
    invoke-direct {v0, v2, v1}, LWf/h0;-><init>(Ljava/lang/String;LUf/f;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LWf/F0;->b:LWf/h0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 25

    .line 1
    invoke-interface/range {p1 .. p1}, Lkotlinx/serialization/encoding/Decoder;->w()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "uuidString"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sget-object v2, LDf/a;->c:LDf/a;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/16 v4, 0x10

    .line 18
    .line 19
    const-string v5, "a hexadecimal digit"

    .line 20
    .line 21
    const/4 v6, 0x4

    .line 22
    const-wide/16 v7, 0x0

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    const/16 v10, 0x20

    .line 26
    .line 27
    if-eq v1, v10, :cond_11

    .line 28
    .line 29
    const/16 v11, 0x24

    .line 30
    .line 31
    if-eq v1, v11, :cond_1

    .line 32
    .line 33
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v3, "Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \""

    .line 38
    .line 39
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/16 v4, 0x40

    .line 47
    .line 48
    if-gt v3, v4, :cond_0

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v0, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v4, "substring(...)"

    .line 57
    .line 58
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v4, "..."

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, "\" of length "

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v1

    .line 90
    :cond_1
    move-wide v12, v7

    .line 91
    :goto_1
    const/16 v1, 0x8

    .line 92
    .line 93
    if-ge v9, v1, :cond_3

    .line 94
    .line 95
    shl-long/2addr v12, v6

    .line 96
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    ushr-int/lit8 v14, v1, 0x8

    .line 101
    .line 102
    if-nez v14, :cond_2

    .line 103
    .line 104
    sget-object v14, LBf/c;->b:[J

    .line 105
    .line 106
    aget-wide v15, v14, v1

    .line 107
    .line 108
    cmp-long v1, v15, v7

    .line 109
    .line 110
    if-ltz v1, :cond_2

    .line 111
    .line 112
    or-long/2addr v12, v15

    .line 113
    add-int/lit8 v9, v9, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    invoke-static {v9, v0, v5}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v3

    .line 120
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    const-string v14, "\'-\' (hyphen)"

    .line 125
    .line 126
    const/16 v15, 0x2d

    .line 127
    .line 128
    if-ne v9, v15, :cond_10

    .line 129
    .line 130
    const/16 v1, 0x9

    .line 131
    .line 132
    move-wide/from16 v16, v7

    .line 133
    .line 134
    :goto_2
    const/16 v9, 0xd

    .line 135
    .line 136
    if-ge v1, v9, :cond_5

    .line 137
    .line 138
    shl-long v16, v16, v6

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    ushr-int/lit8 v18, v9, 0x8

    .line 145
    .line 146
    if-nez v18, :cond_4

    .line 147
    .line 148
    sget-object v18, LBf/c;->b:[J

    .line 149
    .line 150
    aget-wide v19, v18, v9

    .line 151
    .line 152
    cmp-long v9, v19, v7

    .line 153
    .line 154
    if-ltz v9, :cond_4

    .line 155
    .line 156
    or-long v16, v16, v19

    .line 157
    .line 158
    add-int/lit8 v1, v1, 0x1

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    invoke-static {v1, v0, v5}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v3

    .line 165
    :cond_5
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-ne v1, v15, :cond_f

    .line 170
    .line 171
    const/16 v1, 0xe

    .line 172
    .line 173
    move-wide/from16 v18, v7

    .line 174
    .line 175
    :goto_3
    const/16 v9, 0x12

    .line 176
    .line 177
    if-ge v1, v9, :cond_7

    .line 178
    .line 179
    shl-long v18, v18, v6

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    ushr-int/lit8 v20, v9, 0x8

    .line 186
    .line 187
    if-nez v20, :cond_6

    .line 188
    .line 189
    sget-object v20, LBf/c;->b:[J

    .line 190
    .line 191
    aget-wide v21, v20, v9

    .line 192
    .line 193
    cmp-long v9, v21, v7

    .line 194
    .line 195
    if-ltz v9, :cond_6

    .line 196
    .line 197
    or-long v18, v18, v21

    .line 198
    .line 199
    add-int/lit8 v1, v1, 0x1

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_6
    invoke-static {v1, v0, v5}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v3

    .line 206
    :cond_7
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-ne v1, v15, :cond_e

    .line 211
    .line 212
    const/16 v1, 0x13

    .line 213
    .line 214
    move-wide/from16 v20, v7

    .line 215
    .line 216
    :goto_4
    const/16 v9, 0x17

    .line 217
    .line 218
    if-ge v1, v9, :cond_9

    .line 219
    .line 220
    shl-long v20, v20, v6

    .line 221
    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    ushr-int/lit8 v22, v9, 0x8

    .line 227
    .line 228
    if-nez v22, :cond_8

    .line 229
    .line 230
    sget-object v22, LBf/c;->b:[J

    .line 231
    .line 232
    aget-wide v23, v22, v9

    .line 233
    .line 234
    cmp-long v9, v23, v7

    .line 235
    .line 236
    if-ltz v9, :cond_8

    .line 237
    .line 238
    or-long v20, v20, v23

    .line 239
    .line 240
    add-int/lit8 v1, v1, 0x1

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_8
    invoke-static {v1, v0, v5}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v3

    .line 247
    :cond_9
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-ne v1, v15, :cond_d

    .line 252
    .line 253
    const/16 v1, 0x18

    .line 254
    .line 255
    move-wide v14, v7

    .line 256
    :goto_5
    if-ge v1, v11, :cond_b

    .line 257
    .line 258
    shl-long/2addr v14, v6

    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    ushr-int/lit8 v22, v9, 0x8

    .line 264
    .line 265
    if-nez v22, :cond_a

    .line 266
    .line 267
    sget-object v22, LBf/c;->b:[J

    .line 268
    .line 269
    aget-wide v23, v22, v9

    .line 270
    .line 271
    cmp-long v9, v23, v7

    .line 272
    .line 273
    if-ltz v9, :cond_a

    .line 274
    .line 275
    or-long v14, v14, v23

    .line 276
    .line 277
    add-int/lit8 v1, v1, 0x1

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_a
    invoke-static {v1, v0, v5}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v3

    .line 284
    :cond_b
    shl-long v0, v12, v10

    .line 285
    .line 286
    shl-long v3, v16, v4

    .line 287
    .line 288
    or-long/2addr v0, v3

    .line 289
    or-long v0, v0, v18

    .line 290
    .line 291
    const/16 v3, 0x30

    .line 292
    .line 293
    shl-long v3, v20, v3

    .line 294
    .line 295
    or-long/2addr v3, v14

    .line 296
    cmp-long v5, v0, v7

    .line 297
    .line 298
    if-nez v5, :cond_c

    .line 299
    .line 300
    cmp-long v5, v3, v7

    .line 301
    .line 302
    if-nez v5, :cond_c

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_c
    new-instance v2, LDf/a;

    .line 306
    .line 307
    invoke-direct {v2, v0, v1, v3, v4}, LDf/a;-><init>(JJ)V

    .line 308
    .line 309
    .line 310
    return-object v2

    .line 311
    :cond_d
    invoke-static {v9, v0, v14}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v3

    .line 315
    :cond_e
    invoke-static {v9, v0, v14}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v3

    .line 319
    :cond_f
    invoke-static {v9, v0, v14}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v3

    .line 323
    :cond_10
    invoke-static {v1, v0, v14}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v3

    .line 327
    :cond_11
    move-wide v11, v7

    .line 328
    :goto_6
    if-ge v9, v4, :cond_13

    .line 329
    .line 330
    shl-long/2addr v11, v6

    .line 331
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    ushr-int/lit8 v13, v1, 0x8

    .line 336
    .line 337
    if-nez v13, :cond_12

    .line 338
    .line 339
    sget-object v13, LBf/c;->b:[J

    .line 340
    .line 341
    aget-wide v14, v13, v1

    .line 342
    .line 343
    cmp-long v1, v14, v7

    .line 344
    .line 345
    if-ltz v1, :cond_12

    .line 346
    .line 347
    or-long/2addr v11, v14

    .line 348
    add-int/lit8 v9, v9, 0x1

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_12
    invoke-static {v9, v0, v5}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v3

    .line 355
    :cond_13
    move-wide v13, v7

    .line 356
    :goto_7
    if-ge v4, v10, :cond_15

    .line 357
    .line 358
    shl-long/2addr v13, v6

    .line 359
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    ushr-int/lit8 v9, v1, 0x8

    .line 364
    .line 365
    if-nez v9, :cond_14

    .line 366
    .line 367
    sget-object v9, LBf/c;->b:[J

    .line 368
    .line 369
    aget-wide v15, v9, v1

    .line 370
    .line 371
    cmp-long v1, v15, v7

    .line 372
    .line 373
    if-ltz v1, :cond_14

    .line 374
    .line 375
    or-long/2addr v13, v15

    .line 376
    add-int/lit8 v4, v4, 0x1

    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_14
    invoke-static {v4, v0, v5}, La/a;->P(ILjava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v3

    .line 383
    :cond_15
    cmp-long v0, v11, v7

    .line 384
    .line 385
    if-nez v0, :cond_16

    .line 386
    .line 387
    cmp-long v0, v13, v7

    .line 388
    .line 389
    if-nez v0, :cond_16

    .line 390
    .line 391
    :goto_8
    return-object v2

    .line 392
    :cond_16
    new-instance v0, LDf/a;

    .line 393
    .line 394
    invoke-direct {v0, v11, v12, v13, v14}, LDf/a;-><init>(JJ)V

    .line 395
    .line 396
    .line 397
    return-object v0
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    .line 1
    sget-object v0, LWf/F0;->b:LWf/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, LDf/a;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, LDf/a;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p1, p2}, Lkotlinx/serialization/encoding/Encoder;->F(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
