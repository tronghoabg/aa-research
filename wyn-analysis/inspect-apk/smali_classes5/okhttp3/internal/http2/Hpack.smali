.class public final Lokhttp3/internal/http2/Hpack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/Hpack$Reader;,
        Lokhttp3/internal/http2/Hpack$Writer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "Lokhttp3/internal/http2/Hpack;",
        "",
        "<init>",
        "()V",
        "Reader",
        "Writer",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lokhttp3/internal/http2/Hpack;

.field public static final b:[Lokhttp3/internal/http2/Header;

.field public static final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 63

    .line 1
    new-instance v0, Lokhttp3/internal/http2/Hpack;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/internal/http2/Hpack;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lokhttp3/internal/http2/Hpack;->a:Lokhttp3/internal/http2/Hpack;

    .line 7
    .line 8
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 9
    .line 10
    sget-object v1, Lokhttp3/internal/http2/Header;->i:Lcg/j;

    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 18
    .line 19
    sget-object v3, Lokhttp3/internal/http2/Header;->f:Lcg/j;

    .line 20
    .line 21
    const-string v4, "GET"

    .line 22
    .line 23
    invoke-direct {v1, v3, v4}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lokhttp3/internal/http2/Header;

    .line 27
    .line 28
    const-string v5, "POST"

    .line 29
    .line 30
    invoke-direct {v4, v3, v5}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lokhttp3/internal/http2/Header;

    .line 34
    .line 35
    sget-object v5, Lokhttp3/internal/http2/Header;->g:Lcg/j;

    .line 36
    .line 37
    const-string v6, "/"

    .line 38
    .line 39
    invoke-direct {v3, v5, v6}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v6, Lokhttp3/internal/http2/Header;

    .line 43
    .line 44
    const-string v7, "/index.html"

    .line 45
    .line 46
    invoke-direct {v6, v5, v7}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Lokhttp3/internal/http2/Header;

    .line 50
    .line 51
    sget-object v7, Lokhttp3/internal/http2/Header;->h:Lcg/j;

    .line 52
    .line 53
    const-string v8, "http"

    .line 54
    .line 55
    invoke-direct {v5, v7, v8}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v8, Lokhttp3/internal/http2/Header;

    .line 59
    .line 60
    const-string v9, "https"

    .line 61
    .line 62
    invoke-direct {v8, v7, v9}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v7, Lokhttp3/internal/http2/Header;

    .line 66
    .line 67
    sget-object v9, Lokhttp3/internal/http2/Header;->e:Lcg/j;

    .line 68
    .line 69
    const-string v10, "200"

    .line 70
    .line 71
    invoke-direct {v7, v9, v10}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v10, Lokhttp3/internal/http2/Header;

    .line 75
    .line 76
    const-string v11, "204"

    .line 77
    .line 78
    invoke-direct {v10, v9, v11}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v11, Lokhttp3/internal/http2/Header;

    .line 82
    .line 83
    const-string v12, "206"

    .line 84
    .line 85
    invoke-direct {v11, v9, v12}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v12, Lokhttp3/internal/http2/Header;

    .line 89
    .line 90
    const-string v13, "304"

    .line 91
    .line 92
    invoke-direct {v12, v9, v13}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v13, Lokhttp3/internal/http2/Header;

    .line 96
    .line 97
    const-string v14, "400"

    .line 98
    .line 99
    invoke-direct {v13, v9, v14}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v14, Lokhttp3/internal/http2/Header;

    .line 103
    .line 104
    const-string v15, "404"

    .line 105
    .line 106
    invoke-direct {v14, v9, v15}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v15, Lokhttp3/internal/http2/Header;

    .line 110
    .line 111
    move-object/from16 v16, v0

    .line 112
    .line 113
    const-string v0, "500"

    .line 114
    .line 115
    invoke-direct {v15, v9, v0}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 119
    .line 120
    const-string v9, "accept-charset"

    .line 121
    .line 122
    invoke-direct {v0, v9, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v9, Lokhttp3/internal/http2/Header;

    .line 126
    .line 127
    move-object/from16 v17, v0

    .line 128
    .line 129
    const-string v0, "accept-encoding"

    .line 130
    .line 131
    move-object/from16 v18, v1

    .line 132
    .line 133
    const-string v1, "gzip, deflate"

    .line 134
    .line 135
    invoke-direct {v9, v0, v1}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 139
    .line 140
    const-string v1, "accept-language"

    .line 141
    .line 142
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 146
    .line 147
    move-object/from16 v19, v0

    .line 148
    .line 149
    const-string v0, "accept-ranges"

    .line 150
    .line 151
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 155
    .line 156
    move-object/from16 v20, v1

    .line 157
    .line 158
    const-string v1, "accept"

    .line 159
    .line 160
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 164
    .line 165
    move-object/from16 v21, v0

    .line 166
    .line 167
    const-string v0, "access-control-allow-origin"

    .line 168
    .line 169
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 173
    .line 174
    move-object/from16 v22, v1

    .line 175
    .line 176
    const-string v1, "age"

    .line 177
    .line 178
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 182
    .line 183
    move-object/from16 v23, v0

    .line 184
    .line 185
    const-string v0, "allow"

    .line 186
    .line 187
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 191
    .line 192
    move-object/from16 v24, v1

    .line 193
    .line 194
    const-string v1, "authorization"

    .line 195
    .line 196
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 200
    .line 201
    move-object/from16 v25, v0

    .line 202
    .line 203
    const-string v0, "cache-control"

    .line 204
    .line 205
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 209
    .line 210
    move-object/from16 v26, v1

    .line 211
    .line 212
    const-string v1, "content-disposition"

    .line 213
    .line 214
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 218
    .line 219
    move-object/from16 v27, v0

    .line 220
    .line 221
    const-string v0, "content-encoding"

    .line 222
    .line 223
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 227
    .line 228
    move-object/from16 v28, v1

    .line 229
    .line 230
    const-string v1, "content-language"

    .line 231
    .line 232
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 236
    .line 237
    move-object/from16 v29, v0

    .line 238
    .line 239
    const-string v0, "content-length"

    .line 240
    .line 241
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 245
    .line 246
    move-object/from16 v30, v1

    .line 247
    .line 248
    const-string v1, "content-location"

    .line 249
    .line 250
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 254
    .line 255
    move-object/from16 v31, v0

    .line 256
    .line 257
    const-string v0, "content-range"

    .line 258
    .line 259
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 263
    .line 264
    move-object/from16 v32, v1

    .line 265
    .line 266
    const-string v1, "content-type"

    .line 267
    .line 268
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 272
    .line 273
    move-object/from16 v33, v0

    .line 274
    .line 275
    const-string v0, "cookie"

    .line 276
    .line 277
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 281
    .line 282
    move-object/from16 v34, v1

    .line 283
    .line 284
    const-string v1, "date"

    .line 285
    .line 286
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 290
    .line 291
    move-object/from16 v35, v0

    .line 292
    .line 293
    const-string v0, "etag"

    .line 294
    .line 295
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 299
    .line 300
    move-object/from16 v36, v1

    .line 301
    .line 302
    const-string v1, "expect"

    .line 303
    .line 304
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 308
    .line 309
    move-object/from16 v37, v0

    .line 310
    .line 311
    const-string v0, "expires"

    .line 312
    .line 313
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 317
    .line 318
    move-object/from16 v38, v1

    .line 319
    .line 320
    const-string v1, "from"

    .line 321
    .line 322
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 326
    .line 327
    move-object/from16 v39, v0

    .line 328
    .line 329
    const-string v0, "host"

    .line 330
    .line 331
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 335
    .line 336
    move-object/from16 v40, v1

    .line 337
    .line 338
    const-string v1, "if-match"

    .line 339
    .line 340
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 344
    .line 345
    move-object/from16 v41, v0

    .line 346
    .line 347
    const-string v0, "if-modified-since"

    .line 348
    .line 349
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 353
    .line 354
    move-object/from16 v42, v1

    .line 355
    .line 356
    const-string v1, "if-none-match"

    .line 357
    .line 358
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 362
    .line 363
    move-object/from16 v43, v0

    .line 364
    .line 365
    const-string v0, "if-range"

    .line 366
    .line 367
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 371
    .line 372
    move-object/from16 v44, v1

    .line 373
    .line 374
    const-string v1, "if-unmodified-since"

    .line 375
    .line 376
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 380
    .line 381
    move-object/from16 v45, v0

    .line 382
    .line 383
    const-string v0, "last-modified"

    .line 384
    .line 385
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 389
    .line 390
    move-object/from16 v46, v1

    .line 391
    .line 392
    const-string v1, "link"

    .line 393
    .line 394
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 398
    .line 399
    move-object/from16 v47, v0

    .line 400
    .line 401
    const-string v0, "location"

    .line 402
    .line 403
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 407
    .line 408
    move-object/from16 v48, v1

    .line 409
    .line 410
    const-string v1, "max-forwards"

    .line 411
    .line 412
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 416
    .line 417
    move-object/from16 v49, v0

    .line 418
    .line 419
    const-string v0, "proxy-authenticate"

    .line 420
    .line 421
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 425
    .line 426
    move-object/from16 v50, v1

    .line 427
    .line 428
    const-string v1, "proxy-authorization"

    .line 429
    .line 430
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 434
    .line 435
    move-object/from16 v51, v0

    .line 436
    .line 437
    const-string v0, "range"

    .line 438
    .line 439
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 443
    .line 444
    move-object/from16 v52, v1

    .line 445
    .line 446
    const-string v1, "referer"

    .line 447
    .line 448
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 452
    .line 453
    move-object/from16 v53, v0

    .line 454
    .line 455
    const-string v0, "refresh"

    .line 456
    .line 457
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 461
    .line 462
    move-object/from16 v54, v1

    .line 463
    .line 464
    const-string v1, "retry-after"

    .line 465
    .line 466
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 470
    .line 471
    move-object/from16 v55, v0

    .line 472
    .line 473
    const-string v0, "server"

    .line 474
    .line 475
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 479
    .line 480
    move-object/from16 v56, v1

    .line 481
    .line 482
    const-string v1, "set-cookie"

    .line 483
    .line 484
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 488
    .line 489
    move-object/from16 v57, v0

    .line 490
    .line 491
    const-string v0, "strict-transport-security"

    .line 492
    .line 493
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 497
    .line 498
    move-object/from16 v58, v1

    .line 499
    .line 500
    const-string v1, "transfer-encoding"

    .line 501
    .line 502
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 506
    .line 507
    move-object/from16 v59, v0

    .line 508
    .line 509
    const-string v0, "user-agent"

    .line 510
    .line 511
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 515
    .line 516
    move-object/from16 v60, v1

    .line 517
    .line 518
    const-string v1, "vary"

    .line 519
    .line 520
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    new-instance v1, Lokhttp3/internal/http2/Header;

    .line 524
    .line 525
    move-object/from16 v61, v0

    .line 526
    .line 527
    const-string v0, "via"

    .line 528
    .line 529
    invoke-direct {v1, v0, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    new-instance v0, Lokhttp3/internal/http2/Header;

    .line 533
    .line 534
    move-object/from16 v62, v1

    .line 535
    .line 536
    const-string v1, "www-authenticate"

    .line 537
    .line 538
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http2/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    const/16 v1, 0x3d

    .line 542
    .line 543
    new-array v1, v1, [Lokhttp3/internal/http2/Header;

    .line 544
    .line 545
    const/4 v2, 0x0

    .line 546
    aput-object v16, v1, v2

    .line 547
    .line 548
    const/16 v16, 0x1

    .line 549
    .line 550
    aput-object v18, v1, v16

    .line 551
    .line 552
    const/16 v18, 0x2

    .line 553
    .line 554
    aput-object v4, v1, v18

    .line 555
    .line 556
    const/4 v4, 0x3

    .line 557
    aput-object v3, v1, v4

    .line 558
    .line 559
    const/4 v3, 0x4

    .line 560
    aput-object v6, v1, v3

    .line 561
    .line 562
    const/4 v3, 0x5

    .line 563
    aput-object v5, v1, v3

    .line 564
    .line 565
    const/4 v3, 0x6

    .line 566
    aput-object v8, v1, v3

    .line 567
    .line 568
    const/4 v3, 0x7

    .line 569
    aput-object v7, v1, v3

    .line 570
    .line 571
    const/16 v3, 0x8

    .line 572
    .line 573
    aput-object v10, v1, v3

    .line 574
    .line 575
    const/16 v3, 0x9

    .line 576
    .line 577
    aput-object v11, v1, v3

    .line 578
    .line 579
    const/16 v3, 0xa

    .line 580
    .line 581
    aput-object v12, v1, v3

    .line 582
    .line 583
    const/16 v3, 0xb

    .line 584
    .line 585
    aput-object v13, v1, v3

    .line 586
    .line 587
    const/16 v3, 0xc

    .line 588
    .line 589
    aput-object v14, v1, v3

    .line 590
    .line 591
    const/16 v3, 0xd

    .line 592
    .line 593
    aput-object v15, v1, v3

    .line 594
    .line 595
    const/16 v3, 0xe

    .line 596
    .line 597
    aput-object v17, v1, v3

    .line 598
    .line 599
    const/16 v3, 0xf

    .line 600
    .line 601
    aput-object v9, v1, v3

    .line 602
    .line 603
    const/16 v3, 0x10

    .line 604
    .line 605
    aput-object v19, v1, v3

    .line 606
    .line 607
    const/16 v3, 0x11

    .line 608
    .line 609
    aput-object v20, v1, v3

    .line 610
    .line 611
    const/16 v3, 0x12

    .line 612
    .line 613
    aput-object v21, v1, v3

    .line 614
    .line 615
    const/16 v3, 0x13

    .line 616
    .line 617
    aput-object v22, v1, v3

    .line 618
    .line 619
    const/16 v3, 0x14

    .line 620
    .line 621
    aput-object v23, v1, v3

    .line 622
    .line 623
    const/16 v3, 0x15

    .line 624
    .line 625
    aput-object v24, v1, v3

    .line 626
    .line 627
    const/16 v3, 0x16

    .line 628
    .line 629
    aput-object v25, v1, v3

    .line 630
    .line 631
    const/16 v3, 0x17

    .line 632
    .line 633
    aput-object v26, v1, v3

    .line 634
    .line 635
    const/16 v3, 0x18

    .line 636
    .line 637
    aput-object v27, v1, v3

    .line 638
    .line 639
    const/16 v3, 0x19

    .line 640
    .line 641
    aput-object v28, v1, v3

    .line 642
    .line 643
    const/16 v3, 0x1a

    .line 644
    .line 645
    aput-object v29, v1, v3

    .line 646
    .line 647
    const/16 v3, 0x1b

    .line 648
    .line 649
    aput-object v30, v1, v3

    .line 650
    .line 651
    const/16 v3, 0x1c

    .line 652
    .line 653
    aput-object v31, v1, v3

    .line 654
    .line 655
    const/16 v3, 0x1d

    .line 656
    .line 657
    aput-object v32, v1, v3

    .line 658
    .line 659
    const/16 v3, 0x1e

    .line 660
    .line 661
    aput-object v33, v1, v3

    .line 662
    .line 663
    const/16 v3, 0x1f

    .line 664
    .line 665
    aput-object v34, v1, v3

    .line 666
    .line 667
    const/16 v3, 0x20

    .line 668
    .line 669
    aput-object v35, v1, v3

    .line 670
    .line 671
    const/16 v3, 0x21

    .line 672
    .line 673
    aput-object v36, v1, v3

    .line 674
    .line 675
    const/16 v3, 0x22

    .line 676
    .line 677
    aput-object v37, v1, v3

    .line 678
    .line 679
    const/16 v3, 0x23

    .line 680
    .line 681
    aput-object v38, v1, v3

    .line 682
    .line 683
    const/16 v3, 0x24

    .line 684
    .line 685
    aput-object v39, v1, v3

    .line 686
    .line 687
    const/16 v3, 0x25

    .line 688
    .line 689
    aput-object v40, v1, v3

    .line 690
    .line 691
    const/16 v3, 0x26

    .line 692
    .line 693
    aput-object v41, v1, v3

    .line 694
    .line 695
    const/16 v3, 0x27

    .line 696
    .line 697
    aput-object v42, v1, v3

    .line 698
    .line 699
    const/16 v3, 0x28

    .line 700
    .line 701
    aput-object v43, v1, v3

    .line 702
    .line 703
    const/16 v3, 0x29

    .line 704
    .line 705
    aput-object v44, v1, v3

    .line 706
    .line 707
    const/16 v3, 0x2a

    .line 708
    .line 709
    aput-object v45, v1, v3

    .line 710
    .line 711
    const/16 v3, 0x2b

    .line 712
    .line 713
    aput-object v46, v1, v3

    .line 714
    .line 715
    const/16 v3, 0x2c

    .line 716
    .line 717
    aput-object v47, v1, v3

    .line 718
    .line 719
    const/16 v3, 0x2d

    .line 720
    .line 721
    aput-object v48, v1, v3

    .line 722
    .line 723
    const/16 v3, 0x2e

    .line 724
    .line 725
    aput-object v49, v1, v3

    .line 726
    .line 727
    const/16 v3, 0x2f

    .line 728
    .line 729
    aput-object v50, v1, v3

    .line 730
    .line 731
    const/16 v3, 0x30

    .line 732
    .line 733
    aput-object v51, v1, v3

    .line 734
    .line 735
    const/16 v3, 0x31

    .line 736
    .line 737
    aput-object v52, v1, v3

    .line 738
    .line 739
    const/16 v3, 0x32

    .line 740
    .line 741
    aput-object v53, v1, v3

    .line 742
    .line 743
    const/16 v3, 0x33

    .line 744
    .line 745
    aput-object v54, v1, v3

    .line 746
    .line 747
    const/16 v3, 0x34

    .line 748
    .line 749
    aput-object v55, v1, v3

    .line 750
    .line 751
    const/16 v3, 0x35

    .line 752
    .line 753
    aput-object v56, v1, v3

    .line 754
    .line 755
    const/16 v3, 0x36

    .line 756
    .line 757
    aput-object v57, v1, v3

    .line 758
    .line 759
    const/16 v3, 0x37

    .line 760
    .line 761
    aput-object v58, v1, v3

    .line 762
    .line 763
    const/16 v3, 0x38

    .line 764
    .line 765
    aput-object v59, v1, v3

    .line 766
    .line 767
    const/16 v3, 0x39

    .line 768
    .line 769
    aput-object v60, v1, v3

    .line 770
    .line 771
    const/16 v3, 0x3a

    .line 772
    .line 773
    aput-object v61, v1, v3

    .line 774
    .line 775
    const/16 v3, 0x3b

    .line 776
    .line 777
    aput-object v62, v1, v3

    .line 778
    .line 779
    const/16 v3, 0x3c

    .line 780
    .line 781
    aput-object v0, v1, v3

    .line 782
    .line 783
    sput-object v1, Lokhttp3/internal/http2/Hpack;->b:[Lokhttp3/internal/http2/Header;

    .line 784
    .line 785
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 786
    .line 787
    array-length v3, v1

    .line 788
    invoke-direct {v0, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 789
    .line 790
    .line 791
    array-length v3, v1

    .line 792
    :goto_0
    if-ge v2, v3, :cond_1

    .line 793
    .line 794
    add-int/lit8 v4, v2, 0x1

    .line 795
    .line 796
    aget-object v5, v1, v2

    .line 797
    .line 798
    iget-object v5, v5, Lokhttp3/internal/http2/Header;->a:Lcg/j;

    .line 799
    .line 800
    invoke-virtual {v0, v5}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v5

    .line 804
    if-nez v5, :cond_0

    .line 805
    .line 806
    aget-object v5, v1, v2

    .line 807
    .line 808
    iget-object v5, v5, Lokhttp3/internal/http2/Header;->a:Lcg/j;

    .line 809
    .line 810
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-interface {v0, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    :cond_0
    move v2, v4

    .line 818
    goto :goto_0

    .line 819
    :cond_1
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    const-string v1, "unmodifiableMap(result)"

    .line 824
    .line 825
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    sput-object v0, Lokhttp3/internal/http2/Hpack;->c:Ljava/util/Map;

    .line 829
    .line 830
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Lcg/j;)V
    .locals 4

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcg/j;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcg/j;->i(I)B

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v3, 0x41

    .line 20
    .line 21
    if-gt v3, v1, :cond_1

    .line 22
    .line 23
    const/16 v3, 0x5a

    .line 24
    .line 25
    if-le v1, v3, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcg/j;->t()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v1, "PROTOCOL_ERROR response malformed: mixed case name: "

    .line 35
    .line 36
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    :goto_1
    move v1, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-void
.end method
