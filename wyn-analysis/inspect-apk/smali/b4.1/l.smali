.class public final Lb4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/g;


# static fields
.field public static final e:Lokhttp3/CacheControl;

.field public static final f:Lokhttp3/CacheControl;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lh4/l;

.field public final c:Lef/p;

.field public final d:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/CacheControl$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/CacheControl$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lokhttp3/CacheControl$Builder;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lokhttp3/CacheControl$Builder;->b:Z

    .line 10
    .line 11
    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->a()Lokhttp3/CacheControl;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lb4/l;->e:Lokhttp3/CacheControl;

    .line 16
    .line 17
    new-instance v0, Lokhttp3/CacheControl$Builder;

    .line 18
    .line 19
    invoke-direct {v0}, Lokhttp3/CacheControl$Builder;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-boolean v1, v0, Lokhttp3/CacheControl$Builder;->a:Z

    .line 23
    .line 24
    iput-boolean v1, v0, Lokhttp3/CacheControl$Builder;->d:Z

    .line 25
    .line 26
    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->a()Lokhttp3/CacheControl;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lb4/l;->f:Lokhttp3/CacheControl;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lh4/l;Lef/p;Lef/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb4/l;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lb4/l;->b:Lh4/l;

    .line 7
    .line 8
    iput-object p3, p0, Lb4/l;->c:Lef/p;

    .line 9
    .line 10
    iput-object p4, p0, Lb4/l;->d:Lef/p;

    .line 11
    .line 12
    return-void
.end method

.method public static d(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p1, Lokhttp3/MediaType;->a:Ljava/lang/String;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object p1, v0

    .line 8
    :goto_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "text/plain"

    .line 12
    .line 13
    invoke-static {p1, v2, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    :cond_1
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, p0}, Lk4/e;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    if-eqz p1, :cond_3

    .line 31
    .line 32
    const/16 p0, 0x3b

    .line 33
    .line 34
    invoke-static {p1, p0}, LBf/k;->P0(Ljava/lang/String;C)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Ljf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lb4/k;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lb4/k;

    .line 11
    .line 12
    iget v3, v2, Lb4/k;->f:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lb4/k;->f:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lb4/k;

    .line 25
    .line 26
    check-cast v0, Llf/c;

    .line 27
    .line 28
    invoke-direct {v2, v1, v0}, Lb4/k;-><init>(Lb4/l;Llf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v2, Lb4/k;->d:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v4, v2, Lb4/k;->f:I

    .line 36
    .line 37
    const-string v5, "response body == null"

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const-wide/16 v7, 0x0

    .line 41
    .line 42
    const/4 v9, 0x2

    .line 43
    const/4 v10, 0x1

    .line 44
    const/4 v11, 0x4

    .line 45
    const/4 v12, 0x3

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    if-eq v4, v10, :cond_2

    .line 49
    .line 50
    if-ne v4, v9, :cond_1

    .line 51
    .line 52
    iget-object v3, v2, Lb4/k;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lokhttp3/Response;

    .line 55
    .line 56
    iget-object v4, v2, Lb4/k;->b:La4/h;

    .line 57
    .line 58
    iget-object v2, v2, Lb4/k;->a:Lb4/l;

    .line 59
    .line 60
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto/16 :goto_8

    .line 64
    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto/16 :goto_a

    .line 67
    .line 68
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_2
    iget-object v4, v2, Lb4/k;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Lg4/c;

    .line 79
    .line 80
    iget-object v10, v2, Lb4/k;->b:La4/h;

    .line 81
    .line 82
    iget-object v13, v2, Lb4/k;->a:Lb4/l;

    .line 83
    .line 84
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 85
    .line 86
    .line 87
    move-object/from16 v17, v10

    .line 88
    .line 89
    move-object v10, v4

    .line 90
    move-object/from16 v4, v17

    .line 91
    .line 92
    goto/16 :goto_3

    .line 93
    .line 94
    :catch_1
    move-exception v0

    .line 95
    goto/16 :goto_b

    .line 96
    .line 97
    :cond_3
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v1, Lb4/l;->b:Lh4/l;

    .line 101
    .line 102
    iget v4, v0, Lh4/l;->l:I

    .line 103
    .line 104
    invoke-static {v4}, Lcom/google/android/gms/internal/consent_sdk/a;->k(I)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    iget-object v13, v1, Lb4/l;->a:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    iget-object v4, v1, Lb4/l;->d:Lef/p;

    .line 113
    .line 114
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, La4/i;

    .line 119
    .line 120
    if-eqz v4, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object v0, Lcg/j;->d:Lcg/j;

    .line 126
    .line 127
    invoke-static {v13}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v14, "SHA-256"

    .line 132
    .line 133
    invoke-virtual {v0, v14}, Lcg/j;->c(Ljava/lang/String;)Lcg/j;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Lcg/j;->e()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v4, v4, La4/i;->b:La4/f;

    .line 142
    .line 143
    invoke-virtual {v4, v0}, La4/f;->d(Ljava/lang/String;)La4/c;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_4

    .line 148
    .line 149
    new-instance v4, La4/h;

    .line 150
    .line 151
    invoke-direct {v4, v0}, La4/h;-><init>(La4/c;)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    move-object v4, v6

    .line 156
    :goto_1
    if-eqz v4, :cond_8

    .line 157
    .line 158
    :try_start_2
    invoke-virtual {v1}, Lb4/l;->c()Lcg/m;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v14, v4, La4/h;->b:Ljava/io/Closeable;

    .line 163
    .line 164
    check-cast v14, La4/c;

    .line 165
    .line 166
    iget-boolean v15, v14, La4/c;->b:Z

    .line 167
    .line 168
    if-nez v15, :cond_7

    .line 169
    .line 170
    iget-object v14, v14, La4/c;->a:La4/b;

    .line 171
    .line 172
    iget-object v14, v14, La4/b;->c:Ljava/util/ArrayList;

    .line 173
    .line 174
    const/4 v15, 0x0

    .line 175
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    check-cast v14, Lcg/y;

    .line 180
    .line 181
    invoke-virtual {v0, v14}, Lcg/m;->e(Lcg/y;)LR0/e;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-object v0, v0, LR0/e;->e:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Ljava/lang/Long;

    .line 188
    .line 189
    if-nez v0, :cond_5

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 193
    .line 194
    .line 195
    move-result-wide v14

    .line 196
    cmp-long v0, v14, v7

    .line 197
    .line 198
    if-nez v0, :cond_6

    .line 199
    .line 200
    new-instance v0, Lb4/m;

    .line 201
    .line 202
    invoke-virtual {v1, v4}, Lb4/l;->g(La4/h;)LZ3/j;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-static {v13, v6}, Lb4/l;->d(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-direct {v0, v2, v3, v12}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :catch_2
    move-exception v0

    .line 215
    move-object v10, v4

    .line 216
    goto/16 :goto_b

    .line 217
    .line 218
    :cond_6
    :goto_2
    new-instance v0, Lg4/b;

    .line 219
    .line 220
    invoke-virtual {v1}, Lb4/l;->e()Lokhttp3/Request;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    invoke-virtual {v1, v4}, Lb4/l;->f(La4/h;)LA/j;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    invoke-direct {v0, v14, v15}, Lg4/b;-><init>(Lokhttp3/Request;LA/j;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Lg4/b;->a()Lg4/c;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    iget-object v14, v0, Lg4/c;->a:Lokhttp3/Request;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 236
    .line 237
    if-nez v14, :cond_9

    .line 238
    .line 239
    iget-object v14, v0, Lg4/c;->b:LA/j;

    .line 240
    .line 241
    if-eqz v14, :cond_9

    .line 242
    .line 243
    :try_start_3
    new-instance v0, Lb4/m;

    .line 244
    .line 245
    invoke-virtual {v1, v4}, Lb4/l;->g(La4/h;)LZ3/j;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget-object v3, v14, LA/j;->f:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-interface {v3}, Lef/i;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Lokhttp3/MediaType;

    .line 256
    .line 257
    invoke-static {v13, v3}, Lb4/l;->d(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-direct {v0, v2, v3, v12}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 266
    .line 267
    const-string v2, "snapshot is closed"

    .line 268
    .line 269
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :cond_8
    new-instance v0, Lg4/b;

    .line 274
    .line 275
    invoke-virtual {v1}, Lb4/l;->e()Lokhttp3/Request;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-direct {v0, v13, v6}, Lg4/b;-><init>(Lokhttp3/Request;LA/j;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Lg4/b;->a()Lg4/c;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    :cond_9
    iget-object v13, v0, Lg4/c;->a:Lokhttp3/Request;

    .line 287
    .line 288
    invoke-static {v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iput-object v1, v2, Lb4/k;->a:Lb4/l;

    .line 292
    .line 293
    iput-object v4, v2, Lb4/k;->b:La4/h;

    .line 294
    .line 295
    iput-object v0, v2, Lb4/k;->c:Ljava/lang/Object;

    .line 296
    .line 297
    iput v10, v2, Lb4/k;->f:I

    .line 298
    .line 299
    invoke-virtual {v1, v13, v2}, Lb4/l;->b(Lokhttp3/Request;Llf/c;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    if-ne v10, v3, :cond_a

    .line 304
    .line 305
    goto/16 :goto_7

    .line 306
    .line 307
    :cond_a
    move-object v13, v10

    .line 308
    move-object v10, v0

    .line 309
    move-object v0, v13

    .line 310
    move-object v13, v1

    .line 311
    :goto_3
    move-object v14, v0

    .line 312
    check-cast v14, Lokhttp3/Response;

    .line 313
    .line 314
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v0, v14, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 318
    .line 319
    if-eqz v0, :cond_12

    .line 320
    .line 321
    :try_start_4
    iget-object v15, v10, Lg4/c;->a:Lokhttp3/Request;

    .line 322
    .line 323
    iget-object v10, v10, Lg4/c;->b:LA/j;

    .line 324
    .line 325
    invoke-virtual {v13, v4, v15, v14, v10}, Lb4/l;->h(La4/h;Lokhttp3/Request;Lokhttp3/Response;LA/j;)La4/h;

    .line 326
    .line 327
    .line 328
    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 329
    iget-object v10, v13, Lb4/l;->a:Ljava/lang/String;

    .line 330
    .line 331
    if-eqz v4, :cond_c

    .line 332
    .line 333
    :try_start_5
    new-instance v0, Lb4/m;

    .line 334
    .line 335
    invoke-virtual {v13, v4}, Lb4/l;->g(La4/h;)LZ3/j;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v13, v4}, Lb4/l;->f(La4/h;)LA/j;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    if-eqz v3, :cond_b

    .line 344
    .line 345
    iget-object v3, v3, LA/j;->f:Ljava/lang/Object;

    .line 346
    .line 347
    invoke-interface {v3}, Lef/i;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    move-object v6, v3

    .line 352
    check-cast v6, Lokhttp3/MediaType;

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :goto_4
    move-object v3, v14

    .line 356
    goto/16 :goto_a

    .line 357
    .line 358
    :cond_b
    :goto_5
    invoke-static {v10, v6}, Lb4/l;->d(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-direct {v0, v2, v3, v11}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 363
    .line 364
    .line 365
    return-object v0

    .line 366
    :catch_3
    move-exception v0

    .line 367
    goto :goto_4

    .line 368
    :cond_c
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    .line 369
    .line 370
    .line 371
    move-result-wide v15

    .line 372
    cmp-long v7, v15, v7

    .line 373
    .line 374
    if-lez v7, :cond_e

    .line 375
    .line 376
    new-instance v2, Lb4/m;

    .line 377
    .line 378
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    iget-object v5, v13, Lb4/l;->b:Lh4/l;

    .line 383
    .line 384
    iget-object v5, v5, Lh4/l;->a:Landroid/content/Context;

    .line 385
    .line 386
    new-instance v7, LZ3/m;

    .line 387
    .line 388
    sget-object v8, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 389
    .line 390
    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 395
    .line 396
    .line 397
    invoke-direct {v7, v3, v5, v6}, LZ3/m;-><init>(Lcg/i;Ljava/io/File;LA6/c;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-static {v10, v0}, Lb4/l;->d(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    iget-object v3, v14, Lokhttp3/Response;->h:Lokhttp3/Response;

    .line 409
    .line 410
    if-eqz v3, :cond_d

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_d
    move v11, v12

    .line 414
    :goto_6
    invoke-direct {v2, v7, v0, v11}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 415
    .line 416
    .line 417
    return-object v2

    .line 418
    :cond_e
    invoke-static {v14}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v13}, Lb4/l;->e()Lokhttp3/Request;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    iput-object v13, v2, Lb4/k;->a:Lb4/l;

    .line 426
    .line 427
    iput-object v4, v2, Lb4/k;->b:La4/h;

    .line 428
    .line 429
    iput-object v14, v2, Lb4/k;->c:Ljava/lang/Object;

    .line 430
    .line 431
    iput v9, v2, Lb4/k;->f:I

    .line 432
    .line 433
    invoke-virtual {v13, v0, v2}, Lb4/l;->b(Lokhttp3/Request;Llf/c;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 437
    if-ne v0, v3, :cond_f

    .line 438
    .line 439
    :goto_7
    return-object v3

    .line 440
    :cond_f
    move-object v2, v13

    .line 441
    move-object v3, v14

    .line 442
    :goto_8
    :try_start_6
    move-object v7, v0

    .line 443
    check-cast v7, Lokhttp3/Response;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 444
    .line 445
    :try_start_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object v0, v7, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 449
    .line 450
    if-eqz v0, :cond_11

    .line 451
    .line 452
    new-instance v3, Lb4/m;

    .line 453
    .line 454
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    iget-object v8, v2, Lb4/l;->b:Lh4/l;

    .line 459
    .line 460
    iget-object v8, v8, Lh4/l;->a:Landroid/content/Context;

    .line 461
    .line 462
    new-instance v9, LZ3/m;

    .line 463
    .line 464
    sget-object v10, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 465
    .line 466
    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 471
    .line 472
    .line 473
    invoke-direct {v9, v5, v8, v6}, LZ3/m;-><init>(Lcg/i;Ljava/io/File;LA6/c;)V

    .line 474
    .line 475
    .line 476
    iget-object v2, v2, Lb4/l;->a:Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-static {v2, v0}, Lb4/l;->d(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iget-object v2, v7, Lokhttp3/Response;->h:Lokhttp3/Response;

    .line 487
    .line 488
    if-eqz v2, :cond_10

    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_10
    move v11, v12

    .line 492
    :goto_9
    invoke-direct {v3, v9, v0, v11}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 493
    .line 494
    .line 495
    return-object v3

    .line 496
    :catch_4
    move-exception v0

    .line 497
    move-object v3, v7

    .line 498
    goto :goto_a

    .line 499
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 500
    .line 501
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 505
    :goto_a
    :try_start_8
    invoke-static {v3}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 506
    .line 507
    .line 508
    throw v0

    .line 509
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 510
    .line 511
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 515
    :goto_b
    if-eqz v10, :cond_13

    .line 516
    .line 517
    invoke-static {v10}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 518
    .line 519
    .line 520
    :cond_13
    throw v0
.end method

.method public final b(Lokhttp3/Request;Llf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    instance-of v1, p2, Lb4/j;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    move-object v1, p2

    .line 7
    check-cast v1, Lb4/j;

    .line 8
    .line 9
    iget v2, v1, Lb4/j;->c:I

    .line 10
    .line 11
    const/high16 v3, -0x80000000

    .line 12
    .line 13
    and-int v4, v2, v3

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    sub-int/2addr v2, v3

    .line 18
    iput v2, v1, Lb4/j;->c:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Lb4/j;

    .line 22
    .line 23
    invoke-direct {v1, p0, p2}, Lb4/j;-><init>(Lb4/l;Llf/c;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p2, v1, Lb4/j;->a:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 29
    .line 30
    iget v3, v1, Lb4/j;->c:I

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    if-ne v3, v0, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    iget-object v3, p0, Lb4/l;->c:Lef/p;

    .line 66
    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    iget-object p2, p0, Lb4/l;->b:Lh4/l;

    .line 70
    .line 71
    iget p2, p2, Lh4/l;->m:I

    .line 72
    .line 73
    invoke-static {p2}, Lcom/google/android/gms/internal/consent_sdk/a;->k(I)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_3

    .line 78
    .line 79
    invoke-virtual {v3}, Lef/p;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Lokhttp3/Call$Factory;

    .line 84
    .line 85
    invoke-interface {p2, p1}, Lokhttp3/Call$Factory;->a(Lokhttp3/Request;)Lokhttp3/internal/connection/RealCall;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lokhttp3/internal/connection/RealCall;->execute()Lokhttp3/Response;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    .line 95
    .line 96
    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_4
    invoke-virtual {v3}, Lef/p;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lokhttp3/Call$Factory;

    .line 105
    .line 106
    invoke-interface {p2, p1}, Lokhttp3/Call$Factory;->a(Lokhttp3/Request;)Lokhttp3/internal/connection/RealCall;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput v0, v1, Lb4/j;->c:I

    .line 111
    .line 112
    new-instance p2, LEf/n;

    .line 113
    .line 114
    invoke-static {v1}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-direct {p2, v0, v1}, LEf/n;-><init>(ILjf/c;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, LEf/n;->t()V

    .line 122
    .line 123
    .line 124
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/f;

    .line 125
    .line 126
    invoke-direct {v1, v0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v1}, Lokhttp3/internal/connection/RealCall;->B(Lokhttp3/Callback;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v1}, LEf/n;->v(Ltf/l;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, LEf/n;->s()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-ne p2, v2, :cond_5

    .line 140
    .line 141
    return-object v2

    .line 142
    :cond_5
    :goto_1
    move-object p1, p2

    .line 143
    check-cast p1, Lokhttp3/Response;

    .line 144
    .line 145
    :goto_2
    invoke-virtual {p1}, Lokhttp3/Response;->d()Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-nez p2, :cond_7

    .line 150
    .line 151
    const/16 p2, 0x130

    .line 152
    .line 153
    iget v0, p1, Lokhttp3/Response;->d:I

    .line 154
    .line 155
    if-eq v0, p2, :cond_7

    .line 156
    .line 157
    iget-object p2, p1, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 158
    .line 159
    if-eqz p2, :cond_6

    .line 160
    .line 161
    invoke-static {p2}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 162
    .line 163
    .line 164
    :cond_6
    new-instance p2, LE5/Q;

    .line 165
    .line 166
    const-string v1, "HTTP "

    .line 167
    .line 168
    const-string v2, ": "

    .line 169
    .line 170
    invoke-static {v0, v1, v2}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object p1, p1, Lokhttp3/Response;->c:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const/16 v0, 0xa

    .line 184
    .line 185
    invoke-direct {p2, p1, v0}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 186
    .line 187
    .line 188
    throw p2

    .line 189
    :cond_7
    return-object p1
.end method

.method public final c()Lcg/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/l;->d:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, La4/i;

    .line 11
    .line 12
    iget-object v0, v0, La4/i;->a:Lcg/u;

    .line 13
    .line 14
    return-object v0
.end method

.method public final e()Lokhttp3/Request;
    .locals 6

    .line 1
    new-instance v0, Lokhttp3/Request$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lb4/l;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb4/l;->b:Lh4/l;

    .line 12
    .line 13
    iget-object v2, v1, Lh4/l;->h:Lokhttp3/Headers;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lokhttp3/Request$Builder;->e(Lokhttp3/Headers;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, Lh4/l;->i:Lh4/p;

    .line 19
    .line 20
    iget-object v2, v2, Lh4/p;->a:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v5, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>"

    .line 47
    .line 48
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast v4, Ljava/lang/Class;

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v0, v4, v3}, Lokhttp3/Request$Builder;->g(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget v2, v1, Lh4/l;->l:I

    .line 62
    .line 63
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/a;->k(I)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    iget v1, v1, Lh4/l;->m:I

    .line 68
    .line 69
    invoke-static {v1}, Lcom/google/android/gms/internal/consent_sdk/a;->k(I)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    sget-object v1, Lokhttp3/CacheControl;->p:Lokhttp3/CacheControl;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->c(Lokhttp3/CacheControl;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    if-eqz v1, :cond_3

    .line 84
    .line 85
    if-nez v3, :cond_3

    .line 86
    .line 87
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/a;->m(I)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    sget-object v1, Lokhttp3/CacheControl;->o:Lokhttp3/CacheControl;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->c(Lokhttp3/CacheControl;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    sget-object v1, Lb4/l;->e:Lokhttp3/CacheControl;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->c(Lokhttp3/CacheControl;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    if-nez v1, :cond_4

    .line 106
    .line 107
    if-nez v3, :cond_4

    .line 108
    .line 109
    sget-object v1, Lb4/l;->f:Lokhttp3/CacheControl;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->c(Lokhttp3/CacheControl;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0
.end method

.method public final f(La4/h;)LA/j;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lb4/l;->c()Lcg/m;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object p1, p1, La4/h;->b:Ljava/io/Closeable;

    .line 7
    .line 8
    check-cast p1, La4/c;

    .line 9
    .line 10
    iget-boolean v2, p1, La4/c;->b:Z

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    iget-object p1, p1, La4/c;->a:La4/b;

    .line 15
    .line 16
    iget-object p1, p1, La4/b;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcg/y;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lcg/m;->i(Lcg/y;)Lcg/H;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :try_start_1
    new-instance v1, LA/j;

    .line 34
    .line 35
    invoke-direct {v1, p1}, LA/j;-><init>(Lcg/B;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    move-object v2, v1

    .line 39
    move-object v1, v0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    move-object v2, v0

    .line 43
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Lcg/B;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_1
    move-exception p1

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    move-object v1, p1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :try_start_3
    invoke-static {v1, p1}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-nez v1, :cond_1

    .line 56
    .line 57
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_1
    throw v1

    .line 62
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v1, "snapshot is closed"

    .line 65
    .line 66
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 70
    :catch_0
    return-object v0
.end method

.method public final g(La4/h;)LZ3/j;
    .locals 4

    .line 1
    iget-object v0, p1, La4/h;->b:Ljava/io/Closeable;

    .line 2
    .line 3
    check-cast v0, La4/c;

    .line 4
    .line 5
    iget-boolean v1, v0, La4/c;->b:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, La4/c;->a:La4/b;

    .line 10
    .line 11
    iget-object v0, v0, La4/b;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcg/y;

    .line 19
    .line 20
    invoke-virtual {p0}, Lb4/l;->c()Lcg/m;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lb4/l;->b:Lh4/l;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, LZ3/j;

    .line 30
    .line 31
    iget-object v3, p0, Lb4/l;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v2, v0, v1, v3, p1}, LZ3/j;-><init>(Lcg/y;Lcg/m;Ljava/lang/String;La4/h;)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "snapshot is closed"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public final h(La4/h;Lokhttp3/Request;Lokhttp3/Response;LA/j;)La4/h;
    .locals 4

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iget-object v1, p0, Lb4/l;->b:Lh4/l;

    .line 4
    .line 5
    iget v1, v1, Lh4/l;->l:I

    .line 6
    .line 7
    invoke-static {v1}, Lcom/google/android/gms/internal/consent_sdk/a;->m(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_a

    .line 13
    .line 14
    invoke-virtual {p2}, Lokhttp3/Request;->a()Lokhttp3/CacheControl;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-boolean p2, p2, Lokhttp3/CacheControl;->b:Z

    .line 19
    .line 20
    if-nez p2, :cond_a

    .line 21
    .line 22
    invoke-virtual {p3}, Lokhttp3/Response;->a()Lokhttp3/CacheControl;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-boolean p2, p2, Lokhttp3/CacheControl;->b:Z

    .line 27
    .line 28
    if-nez p2, :cond_a

    .line 29
    .line 30
    const-string p2, "Vary"

    .line 31
    .line 32
    iget-object v1, p3, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 33
    .line 34
    invoke-virtual {v1, p2}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string v1, "*"

    .line 39
    .line 40
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_a

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p1, p1, La4/h;->b:Ljava/io/Closeable;

    .line 49
    .line 50
    check-cast p1, La4/c;

    .line 51
    .line 52
    iget-object p2, p1, La4/c;->c:La4/f;

    .line 53
    .line 54
    monitor-enter p2

    .line 55
    :try_start_0
    invoke-virtual {p1}, La4/c;->close()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p1, La4/c;->a:La4/b;

    .line 59
    .line 60
    iget-object p1, p1, La4/b;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p2, p1}, La4/f;->b(Ljava/lang/String;)LA7/b0;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit p2

    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    new-instance p2, Ly3/j;

    .line 70
    .line 71
    invoke-direct {p2, p1, v0}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    monitor-exit p2

    .line 77
    throw p1

    .line 78
    :cond_0
    iget-object p1, p0, Lb4/l;->d:Lef/p;

    .line 79
    .line 80
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, La4/i;

    .line 85
    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    iget-object p2, p0, Lb4/l;->b:Lh4/l;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object p2, p0, Lb4/l;->a:Ljava/lang/String;

    .line 94
    .line 95
    iget-object p1, p1, La4/i;->b:La4/f;

    .line 96
    .line 97
    sget-object v1, Lcg/j;->d:Lcg/j;

    .line 98
    .line 99
    invoke-static {p2}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    const-string v1, "SHA-256"

    .line 104
    .line 105
    invoke-virtual {p2, v1}, Lcg/j;->c(Ljava/lang/String;)Lcg/j;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-virtual {p2}, Lcg/j;->e()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p1, p2}, La4/f;->b(Ljava/lang/String;)LA7/b0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_1

    .line 118
    .line 119
    new-instance p2, Ly3/j;

    .line 120
    .line 121
    invoke-direct {p2, p1, v0}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    move-object p2, v2

    .line 126
    :goto_0
    if-nez p2, :cond_2

    .line 127
    .line 128
    goto/16 :goto_a

    .line 129
    .line 130
    :cond_2
    const/4 p1, 0x0

    .line 131
    :try_start_1
    iget v0, p3, Lokhttp3/Response;->d:I

    .line 132
    .line 133
    const/16 v1, 0x130

    .line 134
    .line 135
    if-ne v0, v1, :cond_5

    .line 136
    .line 137
    if-eqz p4, :cond_5

    .line 138
    .line 139
    invoke-virtual {p3}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object p4, p4, LA/j;->g:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p4, Lokhttp3/Headers;

    .line 146
    .line 147
    iget-object v1, p3, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 148
    .line 149
    invoke-static {p4, v1}, LA6/h;->l(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;

    .line 150
    .line 151
    .line 152
    move-result-object p4

    .line 153
    invoke-virtual {v0, p4}, Lokhttp3/Response$Builder;->c(Lokhttp3/Headers;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    invoke-virtual {p0}, Lb4/l;->c()Lcg/m;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, p2, Ly3/j;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, LA7/b0;

    .line 167
    .line 168
    invoke-virtual {v1, p1}, LA7/b0;->n(I)Lcg/y;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0, v1}, Lcg/m;->h(Lcg/y;)Lcg/F;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 177
    .line 178
    .line 179
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 180
    :try_start_2
    new-instance v1, LA/j;

    .line 181
    .line 182
    invoke-direct {v1, p4}, LA/j;-><init>(Lokhttp3/Response;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v0}, LA/j;->a(Lcg/A;)V

    .line 186
    .line 187
    .line 188
    sget-object p4, Lef/C;->a:Lef/C;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :catchall_1
    move-exception p4

    .line 192
    move-object v3, v2

    .line 193
    move-object v2, p4

    .line 194
    move-object p4, v3

    .line 195
    :goto_1
    :try_start_3
    invoke-virtual {v0}, Lcg/A;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :catchall_2
    move-exception v0

    .line 200
    if-nez v2, :cond_3

    .line 201
    .line 202
    move-object v2, v0

    .line 203
    goto :goto_2

    .line 204
    :cond_3
    :try_start_4
    invoke-static {v2, v0}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    :goto_2
    if-nez v2, :cond_4

    .line 208
    .line 209
    invoke-static {p4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_7

    .line 213
    .line 214
    :catchall_3
    move-exception p1

    .line 215
    goto/16 :goto_9

    .line 216
    .line 217
    :catch_0
    move-exception p4

    .line 218
    goto/16 :goto_8

    .line 219
    .line 220
    :cond_4
    throw v2

    .line 221
    :cond_5
    invoke-virtual {p0}, Lb4/l;->c()Lcg/m;

    .line 222
    .line 223
    .line 224
    move-result-object p4

    .line 225
    iget-object v0, p2, Ly3/j;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, LA7/b0;

    .line 228
    .line 229
    invoke-virtual {v0, p1}, LA7/b0;->n(I)Lcg/y;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {p4, v0}, Lcg/m;->h(Lcg/y;)Lcg/F;

    .line 234
    .line 235
    .line 236
    move-result-object p4

    .line 237
    invoke-static {p4}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 238
    .line 239
    .line 240
    move-result-object p4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 241
    :try_start_5
    new-instance v0, LA/j;

    .line 242
    .line 243
    invoke-direct {v0, p3}, LA/j;-><init>(Lokhttp3/Response;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, p4}, LA/j;->a(Lcg/A;)V

    .line 247
    .line 248
    .line 249
    sget-object v0, Lef/C;->a:Lef/C;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 250
    .line 251
    move-object v1, v0

    .line 252
    move-object v0, v2

    .line 253
    goto :goto_3

    .line 254
    :catchall_4
    move-exception v0

    .line 255
    move-object v1, v2

    .line 256
    :goto_3
    :try_start_6
    invoke-virtual {p4}, Lcg/A;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :catchall_5
    move-exception p4

    .line 261
    if-nez v0, :cond_6

    .line 262
    .line 263
    move-object v0, p4

    .line 264
    goto :goto_4

    .line 265
    :cond_6
    :try_start_7
    invoke-static {v0, p4}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    :goto_4
    if-nez v0, :cond_9

    .line 269
    .line 270
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lb4/l;->c()Lcg/m;

    .line 274
    .line 275
    .line 276
    move-result-object p4

    .line 277
    iget-object v0, p2, Ly3/j;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, LA7/b0;

    .line 280
    .line 281
    const/4 v1, 0x1

    .line 282
    invoke-virtual {v0, v1}, LA7/b0;->n(I)Lcg/y;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {p4, v0}, Lcg/m;->h(Lcg/y;)Lcg/F;

    .line 287
    .line 288
    .line 289
    move-result-object p4

    .line 290
    invoke-static {p4}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 291
    .line 292
    .line 293
    move-result-object p4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 294
    :try_start_8
    iget-object v0, p3, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 295
    .line 296
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-interface {v0, p4}, Lcg/i;->F(Lcg/h;)J

    .line 304
    .line 305
    .line 306
    move-result-wide v0

    .line 307
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 308
    .line 309
    .line 310
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 311
    goto :goto_5

    .line 312
    :catchall_6
    move-exception v0

    .line 313
    move-object v3, v2

    .line 314
    move-object v2, v0

    .line 315
    move-object v0, v3

    .line 316
    :goto_5
    :try_start_9
    invoke-virtual {p4}, Lcg/A;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 317
    .line 318
    .line 319
    goto :goto_6

    .line 320
    :catchall_7
    move-exception p4

    .line 321
    if-nez v2, :cond_7

    .line 322
    .line 323
    move-object v2, p4

    .line 324
    goto :goto_6

    .line 325
    :cond_7
    :try_start_a
    invoke-static {v2, p4}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    :goto_6
    if-nez v2, :cond_8

    .line 329
    .line 330
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :goto_7
    invoke-virtual {p2}, Ly3/j;->i()La4/h;

    .line 334
    .line 335
    .line 336
    move-result-object p1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 337
    invoke-static {p3}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 338
    .line 339
    .line 340
    return-object p1

    .line 341
    :cond_8
    :try_start_b
    throw v2

    .line 342
    :cond_9
    throw v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 343
    :goto_8
    :try_start_c
    sget-object v0, Lk4/e;->a:Landroid/graphics/Bitmap$Config;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 344
    .line 345
    :try_start_d
    iget-object p2, p2, Ly3/j;->b:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast p2, LA7/b0;

    .line 348
    .line 349
    invoke-virtual {p2, p1}, LA7/b0;->l(Z)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 350
    .line 351
    .line 352
    :catch_1
    :try_start_e
    throw p4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 353
    :goto_9
    invoke-static {p3}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 354
    .line 355
    .line 356
    throw p1

    .line 357
    :cond_a
    if-eqz p1, :cond_b

    .line 358
    .line 359
    invoke-static {p1}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 360
    .line 361
    .line 362
    :cond_b
    :goto_a
    return-object v2
.end method
