.class public final Lcom/moloco/sdk/acm/http/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwd/c;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lwd/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "httpClient"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "apiUrl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/acm/http/g;->a:Lwd/c;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/acm/http/g;->b:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(JLcom/moloco/sdk/acm/http/d;Lcom/moloco/sdk/acm/http/a;Llf/c;)Ljava/io/Serializable;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const-class v4, [B

    .line 9
    .line 10
    const-string v5, "PostMetricsRequest Error: "

    .line 11
    .line 12
    const-string v6, "Post Metrics Request Error: "

    .line 13
    .line 14
    const-string v7, "Post Metrics Request Success: "

    .line 15
    .line 16
    instance-of v8, v2, Lcom/moloco/sdk/acm/http/f;

    .line 17
    .line 18
    if-eqz v8, :cond_0

    .line 19
    .line 20
    move-object v8, v2

    .line 21
    check-cast v8, Lcom/moloco/sdk/acm/http/f;

    .line 22
    .line 23
    iget v9, v8, Lcom/moloco/sdk/acm/http/f;->e:I

    .line 24
    .line 25
    const/high16 v10, -0x80000000

    .line 26
    .line 27
    and-int v11, v9, v10

    .line 28
    .line 29
    if-eqz v11, :cond_0

    .line 30
    .line 31
    sub-int/2addr v9, v10

    .line 32
    iput v9, v8, Lcom/moloco/sdk/acm/http/f;->e:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v8, Lcom/moloco/sdk/acm/http/f;

    .line 36
    .line 37
    invoke-direct {v8, v1, v2}, Lcom/moloco/sdk/acm/http/f;-><init>(Lcom/moloco/sdk/acm/http/g;Llf/c;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object v2, v8, Lcom/moloco/sdk/acm/http/f;->c:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v9, Lkf/a;->a:Lkf/a;

    .line 43
    .line 44
    iget v10, v8, Lcom/moloco/sdk/acm/http/f;->e:I

    .line 45
    .line 46
    const-string v12, "PostMetricsRequest"

    .line 47
    .line 48
    const/4 v13, 0x2

    .line 49
    if-eqz v10, :cond_3

    .line 50
    .line 51
    if-eq v10, v3, :cond_2

    .line 52
    .line 53
    if-ne v10, v13, :cond_1

    .line 54
    .line 55
    iget-object v0, v8, Lcom/moloco/sdk/acm/http/f;->b:LJd/v;

    .line 56
    .line 57
    iget-object v3, v8, Lcom/moloco/sdk/acm/http/f;->a:Lcom/moloco/sdk/acm/http/g;

    .line 58
    .line 59
    :try_start_0
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 60
    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_2
    iget-object v3, v8, Lcom/moloco/sdk/acm/http/f;->a:Lcom/moloco/sdk/acm/http/g;

    .line 73
    .line 74
    :try_start_1
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 75
    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_3
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :try_start_2
    iget-object v2, v1, Lcom/moloco/sdk/acm/http/g;->a:Lwd/c;

    .line 83
    .line 84
    iget-object v10, v1, Lcom/moloco/sdk/acm/http/g;->b:Ljava/lang/String;

    .line 85
    .line 86
    new-instance v14, LFd/c;

    .line 87
    .line 88
    invoke-direct {v14}, LFd/c;-><init>()V

    .line 89
    .line 90
    .line 91
    sget-object v15, LJd/s;->c:LJd/s;

    .line 92
    .line 93
    invoke-virtual {v14, v15}, LFd/c;->c(LJd/s;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v14, v10}, LFd/e;->b(LFd/c;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v10, LCd/n0;

    .line 100
    .line 101
    invoke-direct {v10}, LCd/n0;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    invoke-static {v15}, LCd/n0;->a(Ljava/lang/Long;)V

    .line 109
    .line 110
    .line 111
    iput-object v15, v10, LCd/n0;->a:Ljava/lang/Long;

    .line 112
    .line 113
    sget-object v15, LCd/m0;->a:LCd/m0;

    .line 114
    .line 115
    sget-object v13, Lzd/g;->a:LNd/a;

    .line 116
    .line 117
    new-instance v11, LCd/u;

    .line 118
    .line 119
    invoke-direct {v11, v3}, LCd/u;-><init>(I)V

    .line 120
    .line 121
    .line 122
    iget-object v3, v14, LFd/c;->f:LNd/d;

    .line 123
    .line 124
    invoke-virtual {v3, v13, v11}, LNd/d;->a(LNd/a;Ltf/a;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/util/Map;

    .line 129
    .line 130
    invoke-interface {v3, v15, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    sget-object v3, LJd/c;->b:LJd/f;

    .line 134
    .line 135
    invoke-static {v14, v3}, Lff/B;->j(LFd/c;LJd/f;)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v3, p4

    .line 139
    .line 140
    invoke-static {v14, v3}, LFd/e;->a(LJd/r;Ltf/l;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/moloco/sdk/R0;->d()Lcom/moloco/sdk/M0;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    iget-object v10, v0, Lcom/moloco/sdk/acm/http/d;->a:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v3, v10}, Lcom/moloco/sdk/M0;->a(Ljava/util/ArrayList;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v0, Lcom/moloco/sdk/acm/http/d;->b:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v3, v0}, Lcom/moloco/sdk/M0;->b(Ljava/util/ArrayList;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v3, "build(...)"

    .line 162
    .line 163
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    check-cast v0, Lcom/moloco/sdk/R0;

    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v3, "toByteArray(...)"

    .line 173
    .line 174
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    instance-of v3, v0, LMd/c;

    .line 178
    .line 179
    if-eqz v3, :cond_4

    .line 180
    .line 181
    iput-object v0, v14, LFd/c;->d:Ljava/lang/Object;

    .line 182
    .line 183
    const/4 v0, 0x0

    .line 184
    invoke-virtual {v14, v0}, LFd/c;->b(LSd/a;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catch_0
    move-exception v0

    .line 189
    move-object v3, v1

    .line 190
    goto/16 :goto_6

    .line 191
    .line 192
    :cond_4
    iput-object v0, v14, LFd/c;->d:Ljava/lang/Object;

    .line 193
    .line 194
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 195
    .line 196
    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 197
    .line 198
    .line 199
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 200
    :try_start_3
    invoke-static {v4}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 201
    .line 202
    .line 203
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 204
    goto :goto_1

    .line 205
    :catchall_0
    const/4 v3, 0x0

    .line 206
    :goto_1
    :try_start_4
    new-instance v4, LSd/a;

    .line 207
    .line 208
    invoke-direct {v4, v0, v3}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v14, v4}, LFd/c;->b(LSd/a;)V

    .line 212
    .line 213
    .line 214
    :goto_2
    sget-object v0, LJd/s;->c:LJd/s;

    .line 215
    .line 216
    invoke-virtual {v14, v0}, LFd/c;->c(LJd/s;)V

    .line 217
    .line 218
    .line 219
    new-instance v0, LS3/s;

    .line 220
    .line 221
    invoke-direct {v0, v14, v2}, LS3/s;-><init>(LFd/c;Lwd/c;)V

    .line 222
    .line 223
    .line 224
    iput-object v1, v8, Lcom/moloco/sdk/acm/http/f;->a:Lcom/moloco/sdk/acm/http/g;

    .line 225
    .line 226
    const/4 v2, 0x1

    .line 227
    iput v2, v8, Lcom/moloco/sdk/acm/http/f;->e:I

    .line 228
    .line 229
    invoke-virtual {v0, v8}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 233
    if-ne v2, v9, :cond_5

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_5
    move-object v3, v1

    .line 237
    :goto_3
    :try_start_5
    check-cast v2, LGd/a;

    .line 238
    .line 239
    invoke-virtual {v2}, LGd/a;->e()LJd/v;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iput-object v3, v8, Lcom/moloco/sdk/acm/http/f;->a:Lcom/moloco/sdk/acm/http/g;

    .line 244
    .line 245
    iput-object v0, v8, Lcom/moloco/sdk/acm/http/f;->b:LJd/v;

    .line 246
    .line 247
    const/4 v4, 0x2

    .line 248
    iput v4, v8, Lcom/moloco/sdk/acm/http/f;->e:I

    .line 249
    .line 250
    sget-object v4, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 251
    .line 252
    invoke-static {v2, v4, v8}, Lgc/b;->h(LGd/a;Ljava/nio/charset/Charset;Llf/c;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    if-ne v2, v9, :cond_6

    .line 257
    .line 258
    :goto_4
    return-object v9

    .line 259
    :cond_6
    :goto_5
    check-cast v2, Ljava/lang/String;

    .line 260
    .line 261
    sget-object v4, LJd/v;->c:LJd/v;

    .line 262
    .line 263
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_7

    .line 268
    .line 269
    sget-object v0, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v12, v0}, Lcom/moloco/sdk/acm/services/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    goto :goto_7

    .line 290
    :catch_1
    move-exception v0

    .line 291
    goto :goto_6

    .line 292
    :cond_7
    sget-object v4, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 293
    .line 294
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    new-instance v4, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    const/16 v4, 0xc

    .line 310
    .line 311
    const/4 v6, 0x0

    .line 312
    invoke-static {v4, v6, v12, v2}, Lcom/moloco/sdk/acm/services/e;->b(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v2, Ljava/lang/Exception;

    .line 316
    .line 317
    new-instance v4, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v2}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 333
    .line 334
    .line 335
    move-result-object v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 336
    goto :goto_7

    .line 337
    :goto_6
    sget-object v2, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    const/16 v2, 0x8

    .line 343
    .line 344
    const-string v3, "Post Metrics Request Exception"

    .line 345
    .line 346
    invoke-static {v2, v0, v12, v3}, Lcom/moloco/sdk/acm/services/e;->b(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    :goto_7
    return-object v2
.end method

.method public final b(Lcom/moloco/sdk/acm/http/d;Lcom/moloco/sdk/acm/http/a;Llf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lcom/moloco/sdk/acm/http/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/moloco/sdk/acm/http/e;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/acm/http/e;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/acm/http/e;->c:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/moloco/sdk/acm/http/e;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lcom/moloco/sdk/acm/http/e;-><init>(Lcom/moloco/sdk/acm/http/g;Llf/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, Lcom/moloco/sdk/acm/http/e;->a:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v1, v6, Lcom/moloco/sdk/acm/http/e;->c:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast p3, Lef/n;

    .line 42
    .line 43
    iget-object p1, p3, Lef/n;->a:Ljava/lang/Object;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput v2, v6, Lcom/moloco/sdk/acm/http/e;->c:I

    .line 58
    .line 59
    const-wide/16 v2, 0x1388

    .line 60
    .line 61
    move-object v1, p0

    .line 62
    move-object v4, p1

    .line 63
    move-object v5, p2

    .line 64
    invoke-virtual/range {v1 .. v6}, Lcom/moloco/sdk/acm/http/g;->a(JLcom/moloco/sdk/acm/http/d;Lcom/moloco/sdk/acm/http/a;Llf/c;)Ljava/io/Serializable;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_3

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    return-object p1
.end method
