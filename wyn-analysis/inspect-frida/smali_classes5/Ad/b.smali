.class public final synthetic LAd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/services/init/f;Lcom/moloco/sdk/internal/services/F;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/internal/services/w;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput p1, p0, LAd/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LAd/b;->b:Ljava/lang/Object;

    iput-object p3, p0, LAd/b;->c:Ljava/lang/Object;

    iput-object p4, p0, LAd/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljf/h;LFd/d;LMd/c;LQd/d;)V
    .locals 0

    .line 2
    const/4 p3, 0x0

    iput p3, p0, LAd/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAd/b;->b:Ljava/lang/Object;

    iput-object p2, p0, LAd/b;->c:Ljava/lang/Object;

    iput-object p4, p0, LAd/b;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, LAd/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LAd/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LAd/b;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, LAd/b;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, LJd/n;

    .line 13
    .line 14
    const-string v3, "$this$headers"

    .line 15
    .line 16
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast v2, Lcom/moloco/sdk/internal/services/F;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 25
    .line 26
    check-cast v1, Lcom/moloco/sdk/publisher/MediationInfo;

    .line 27
    .line 28
    invoke-static {p1, v1}, Lff/B;->d(LJd/n;Lcom/moloco/sdk/publisher/MediationInfo;)V

    .line 29
    .line 30
    .line 31
    check-cast v0, Lcom/moloco/sdk/internal/services/w;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/w;->a:Ljava/lang/String;

    .line 34
    .line 35
    const-string v1, "com.example.demo2"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    const-string v0, "com.trickytribe.penetrator"

    .line 44
    .line 45
    :cond_0
    const-string v1, "X-Moloco-App-Bundle"

    .line 46
    .line 47
    invoke-virtual {p1, v1, v0}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lef/C;->a:Lef/C;

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_0
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 54
    .line 55
    const-string v3, "current"

    .line 56
    .line 57
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    new-instance v5, LJd/v;

    .line 71
    .line 72
    invoke-direct {v5, v3, v4}, LJd/v;-><init>(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    move-object v7, v5

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    sget-object v4, LJd/v;->p:Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, LJd/v;

    .line 88
    .line 89
    if-nez v4, :cond_2

    .line 90
    .line 91
    new-instance v4, LJd/v;

    .line 92
    .line 93
    const-string v5, "Unknown Status Code"

    .line 94
    .line 95
    invoke-direct {v4, v3, v5}, LJd/v;-><init>(ILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    move-object v5, v4

    .line 99
    goto :goto_0

    .line 100
    :goto_1
    move-object v12, v2

    .line 101
    check-cast v12, Ljf/h;

    .line 102
    .line 103
    const-string v2, "callContext"

    .line 104
    .line 105
    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sget-object v2, LJd/v;->h:LJd/v;

    .line 109
    .line 110
    iget v2, v2, LJd/v;->a:I

    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    sget-object v4, LJd/v;->d:LJd/v;

    .line 117
    .line 118
    iget v4, v4, LJd/v;->a:I

    .line 119
    .line 120
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    const/4 v5, 0x2

    .line 125
    new-array v5, v5, [Ljava/lang/Integer;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    aput-object v2, v5, v6

    .line 129
    .line 130
    const/4 v2, 0x1

    .line 131
    aput-object v4, v5, v2

    .line 132
    .line 133
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_3

    .line 146
    .line 147
    sget-object v2, Lio/ktor/utils/io/t;->a:Lio/ktor/utils/io/s;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object v2, Lio/ktor/utils/io/s;->b:Lio/ktor/utils/io/r;

    .line 153
    .line 154
    :goto_2
    move-object v11, v2

    .line 155
    goto :goto_5

    .line 156
    :cond_3
    const/4 v2, 0x0

    .line 157
    const/16 v3, 0x2000

    .line 158
    .line 159
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    instance-of v5, v4, Ljava/io/BufferedInputStream;

    .line 166
    .line 167
    if-eqz v5, :cond_4

    .line 168
    .line 169
    check-cast v4, Ljava/io/BufferedInputStream;

    .line 170
    .line 171
    :goto_3
    move-object v2, v4

    .line 172
    goto :goto_4

    .line 173
    :cond_4
    new-instance v5, Ljava/io/BufferedInputStream;

    .line 174
    .line 175
    invoke-direct {v5, v4, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    .line 177
    .line 178
    move-object v2, v5

    .line 179
    goto :goto_4

    .line 180
    :catch_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    if-eqz v4, :cond_6

    .line 185
    .line 186
    instance-of v2, v4, Ljava/io/BufferedInputStream;

    .line 187
    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    check-cast v4, Ljava/io/BufferedInputStream;

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 194
    .line 195
    invoke-direct {v2, v4, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 196
    .line 197
    .line 198
    :cond_6
    :goto_4
    if-eqz v2, :cond_7

    .line 199
    .line 200
    sget-object v3, LOd/a;->a:LWd/b;

    .line 201
    .line 202
    const-string v4, "pool"

    .line 203
    .line 204
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v3, LVd/d;

    .line 208
    .line 209
    new-instance v4, LPf/b;

    .line 210
    .line 211
    invoke-direct {v4, v2}, LPf/b;-><init>(Ljava/io/InputStream;)V

    .line 212
    .line 213
    .line 214
    invoke-direct {v3, v4, v12}, LVd/d;-><init>(LPf/b;Ljf/h;)V

    .line 215
    .line 216
    .line 217
    move-object v2, v3

    .line 218
    goto :goto_2

    .line 219
    :cond_7
    sget-object v2, Lio/ktor/utils/io/t;->a:Lio/ktor/utils/io/s;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    sget-object v2, Lio/ktor/utils/io/s;->b:Lio/ktor/utils/io/r;

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :goto_5
    invoke-virtual {p1}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    const-string v2, "getHeaderFields(...)"

    .line 232
    .line 233
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 237
    .line 238
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-static {v3}, Lff/B;->D(I)I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    check-cast p1, Ljava/lang/Iterable;

    .line 254
    .line 255
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_9

    .line 264
    .line 265
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, Ljava/util/Map$Entry;

    .line 270
    .line 271
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, Ljava/lang/String;

    .line 276
    .line 277
    if-eqz v4, :cond_8

    .line 278
    .line 279
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    const-string v6, "getDefault(...)"

    .line 284
    .line 285
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    const-string v5, "toLowerCase(...)"

    .line 293
    .line 294
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_8
    const-string v4, ""

    .line 299
    .line 300
    :goto_7
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_9
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 309
    .line 310
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    :cond_a
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_b

    .line 326
    .line 327
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    check-cast v3, Ljava/util/Map$Entry;

    .line 332
    .line 333
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    check-cast v4, Ljava/lang/CharSequence;

    .line 338
    .line 339
    invoke-static {v4}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-nez v4, :cond_a

    .line 344
    .line 345
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-interface {p1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_b
    new-instance v9, LJd/o;

    .line 358
    .line 359
    invoke-direct {v9, p1}, LNd/l;-><init>(Ljava/util/Map;)V

    .line 360
    .line 361
    .line 362
    check-cast v1, LFd/d;

    .line 363
    .line 364
    iget-object p1, v1, LFd/d;->f:LNd/d;

    .line 365
    .line 366
    sget-object v1, LFd/e;->a:LNd/a;

    .line 367
    .line 368
    invoke-virtual {p1, v1}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    if-nez p1, :cond_c

    .line 373
    .line 374
    new-instance v6, LFd/g;

    .line 375
    .line 376
    move-object v8, v0

    .line 377
    check-cast v8, LQd/d;

    .line 378
    .line 379
    sget-object v10, LJd/u;->d:LJd/u;

    .line 380
    .line 381
    invoke-direct/range {v6 .. v12}, LFd/g;-><init>(LJd/v;LQd/d;LJd/o;LJd/u;Lio/ktor/utils/io/t;Ljf/h;)V

    .line 382
    .line 383
    .line 384
    return-object v6

    .line 385
    :cond_c
    new-instance p1, Ljava/lang/ClassCastException;

    .line 386
    .line 387
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 388
    .line 389
    .line 390
    throw p1

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
