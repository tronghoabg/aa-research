.class public final Lga/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LP9/d;

.field public final b:LG9/e;

.field public final c:Lef/p;

.field public final d:LNf/d;


# direct methods
.method public constructor <init>(Ljf/h;LP9/d;Lea/b;LG9/e;Lu1/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lga/d;->a:LP9/d;

    .line 5
    .line 6
    iput-object p4, p0, Lga/d;->b:LG9/e;

    .line 7
    .line 8
    new-instance p1, LA0/p;

    .line 9
    .line 10
    const/16 p2, 0x15

    .line 11
    .line 12
    invoke-direct {p1, p5, p2}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lga/d;->c:Lef/p;

    .line 20
    .line 21
    invoke-static {}, LNf/e;->a()LNf/d;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lga/d;->d:LNf/d;

    .line 26
    .line 27
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "compile(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, ""

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "replaceAll(...)"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lga/d;->b()Lga/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lga/n;->b:Lga/f;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lga/f;->a:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const-string v0, "sessionConfigs"

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method

.method public final b()Lga/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lga/d;->c:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lga/n;

    .line 8
    .line 9
    return-object v0
.end method

.method public final d(Ljf/c;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    instance-of v6, v0, Lga/a;

    .line 10
    .line 11
    if-eqz v6, :cond_0

    .line 12
    .line 13
    move-object v6, v0

    .line 14
    check-cast v6, Lga/a;

    .line 15
    .line 16
    iget v7, v6, Lga/a;->e:I

    .line 17
    .line 18
    const/high16 v8, -0x80000000

    .line 19
    .line 20
    and-int v9, v7, v8

    .line 21
    .line 22
    if-eqz v9, :cond_0

    .line 23
    .line 24
    sub-int/2addr v7, v8

    .line 25
    iput v7, v6, Lga/a;->e:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v6, Lga/a;

    .line 29
    .line 30
    check-cast v0, Llf/c;

    .line 31
    .line 32
    invoke-direct {v6, v1, v0}, Lga/a;-><init>(Lga/d;Llf/c;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, v6, Lga/a;->c:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 38
    .line 39
    iget v8, v6, Lga/a;->e:I

    .line 40
    .line 41
    sget-object v9, Lef/C;->a:Lef/C;

    .line 42
    .line 43
    const-string v10, "SessionConfigFetcher"

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    if-eqz v8, :cond_4

    .line 47
    .line 48
    if-eq v8, v5, :cond_3

    .line 49
    .line 50
    if-eq v8, v4, :cond_2

    .line 51
    .line 52
    if-ne v8, v3, :cond_1

    .line 53
    .line 54
    iget-object v2, v6, Lga/a;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, LNf/a;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_2
    iget-object v8, v6, Lga/a;->b:LNf/a;

    .line 75
    .line 76
    check-cast v8, LNf/a;

    .line 77
    .line 78
    iget-object v12, v6, Lga/a;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v12, Lga/d;

    .line 81
    .line 82
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    move-object v2, v8

    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_3
    iget-object v8, v6, Lga/a;->b:LNf/a;

    .line 91
    .line 92
    check-cast v8, LNf/a;

    .line 93
    .line 94
    iget-object v12, v6, Lga/a;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v12, Lga/d;

    .line 97
    .line 98
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v1, Lga/d;->d:LNf/d;

    .line 106
    .line 107
    invoke-virtual {v0}, LNf/d;->e()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-nez v8, :cond_5

    .line 112
    .line 113
    invoke-virtual {v1}, Lga/d;->b()Lga/n;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v8}, Lga/n;->b()Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-nez v8, :cond_5

    .line 122
    .line 123
    return-object v9

    .line 124
    :cond_5
    iput-object v1, v6, Lga/a;->a:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v0, v6, Lga/a;->b:LNf/a;

    .line 127
    .line 128
    iput v5, v6, Lga/a;->e:I

    .line 129
    .line 130
    invoke-virtual {v0, v6}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    if-ne v8, v7, :cond_6

    .line 135
    .line 136
    goto/16 :goto_4

    .line 137
    .line 138
    :cond_6
    move-object v8, v0

    .line 139
    move-object v12, v1

    .line 140
    :goto_1
    :try_start_2
    invoke-virtual {v12}, Lga/d;->b()Lga/n;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Lga/n;->b()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    const-string v0, "Remote settings cache not expired. Using cached values."

    .line 151
    .line 152
    invoke-static {v10, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 153
    .line 154
    .line 155
    invoke-interface {v8, v11}, LNf/a;->a(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-object v9

    .line 159
    :cond_7
    :try_start_3
    sget-object v0, Lea/r;->c:Lea/Y;

    .line 160
    .line 161
    iget-object v13, v12, Lga/d;->a:LP9/d;

    .line 162
    .line 163
    iput-object v12, v6, Lga/a;->a:Ljava/lang/Object;

    .line 164
    .line 165
    move-object v14, v8

    .line 166
    check-cast v14, LNf/a;

    .line 167
    .line 168
    iput-object v14, v6, Lga/a;->b:LNf/a;

    .line 169
    .line 170
    iput v4, v6, Lga/a;->e:I

    .line 171
    .line 172
    invoke-virtual {v0, v13, v6}, Lea/Y;->a(LP9/d;Llf/c;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v7, :cond_8

    .line 177
    .line 178
    goto/16 :goto_4

    .line 179
    .line 180
    :cond_8
    :goto_2
    check-cast v0, Lea/r;

    .line 181
    .line 182
    iget-object v0, v0, Lea/r;->a:Ljava/lang/String;

    .line 183
    .line 184
    const-string v13, ""

    .line 185
    .line 186
    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-eqz v13, :cond_9

    .line 191
    .line 192
    const-string v0, "Error getting Firebase Installation ID. Skipping this Session Event."

    .line 193
    .line 194
    invoke-static {v10, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 195
    .line 196
    .line 197
    invoke-interface {v8, v11}, LNf/a;->a(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return-object v9

    .line 201
    :cond_9
    :try_start_4
    const-string v13, "X-Crashlytics-Installation-ID"

    .line 202
    .line 203
    new-instance v14, Lef/k;

    .line 204
    .line 205
    invoke-direct {v14, v13, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    const-string v0, "X-Crashlytics-Device-Model"

    .line 209
    .line 210
    const-string v13, "%s/%s"

    .line 211
    .line 212
    new-array v15, v4, [Ljava/lang/Object;

    .line 213
    .line 214
    sget-object v16, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 215
    .line 216
    aput-object v16, v15, v2

    .line 217
    .line 218
    sget-object v16, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 219
    .line 220
    aput-object v16, v15, v5

    .line 221
    .line 222
    invoke-static {v15, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v15

    .line 226
    invoke-static {v13, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-static {v13}, Lga/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    new-instance v15, Lef/k;

    .line 238
    .line 239
    invoke-direct {v15, v0, v13}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    const-string v0, "X-Crashlytics-OS-Build-Version"

    .line 243
    .line 244
    sget-object v13, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 245
    .line 246
    move/from16 v16, v2

    .line 247
    .line 248
    const-string v2, "INCREMENTAL"

    .line 249
    .line 250
    invoke-static {v13, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v13}, Lga/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    new-instance v13, Lef/k;

    .line 258
    .line 259
    invoke-direct {v13, v0, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    const-string v0, "X-Crashlytics-OS-Display-Version"

    .line 263
    .line 264
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 265
    .line 266
    move/from16 v17, v5

    .line 267
    .line 268
    const-string v5, "RELEASE"

    .line 269
    .line 270
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v2}, Lga/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    new-instance v5, Lef/k;

    .line 278
    .line 279
    invoke-direct {v5, v0, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    const-string v0, "X-Crashlytics-API-Client-Version"

    .line 283
    .line 284
    const-string v2, "2.0.7"

    .line 285
    .line 286
    move/from16 v18, v3

    .line 287
    .line 288
    new-instance v3, Lef/k;

    .line 289
    .line 290
    invoke-direct {v3, v0, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    const/4 v0, 0x5

    .line 294
    new-array v0, v0, [Lef/k;

    .line 295
    .line 296
    aput-object v14, v0, v16

    .line 297
    .line 298
    aput-object v15, v0, v17

    .line 299
    .line 300
    aput-object v13, v0, v4

    .line 301
    .line 302
    aput-object v5, v0, v18

    .line 303
    .line 304
    const/4 v2, 0x4

    .line 305
    aput-object v3, v0, v2

    .line 306
    .line 307
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 308
    .line 309
    .line 310
    move-result-object v21

    .line 311
    const-string v0, "Fetching settings from server."

    .line 312
    .line 313
    invoke-static {v10, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    iget-object v0, v12, Lga/d;->b:LG9/e;

    .line 317
    .line 318
    new-instance v2, Lga/b;

    .line 319
    .line 320
    invoke-direct {v2, v12, v11}, Lga/b;-><init>(Lga/d;Ljf/c;)V

    .line 321
    .line 322
    .line 323
    new-instance v3, Lga/c;

    .line 324
    .line 325
    invoke-direct {v3, v4, v11}, Llf/j;-><init>(ILjf/c;)V

    .line 326
    .line 327
    .line 328
    iput-object v8, v6, Lga/a;->a:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v11, v6, Lga/a;->b:LNf/a;

    .line 331
    .line 332
    move/from16 v4, v18

    .line 333
    .line 334
    iput v4, v6, Lga/a;->e:I

    .line 335
    .line 336
    new-instance v19, Lga/e;

    .line 337
    .line 338
    const/16 v24, 0x0

    .line 339
    .line 340
    move-object/from16 v20, v0

    .line 341
    .line 342
    move-object/from16 v22, v2

    .line 343
    .line 344
    move-object/from16 v23, v3

    .line 345
    .line 346
    invoke-direct/range {v19 .. v24}, Lga/e;-><init>(LG9/e;Ljava/util/Map;Lga/b;Lga/c;Ljf/c;)V

    .line 347
    .line 348
    .line 349
    move-object/from16 v2, v19

    .line 350
    .line 351
    iget-object v0, v0, LG9/e;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Ljf/h;

    .line 354
    .line 355
    invoke-static {v0, v2, v6}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 359
    if-ne v0, v7, :cond_a

    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_a
    move-object v0, v9

    .line 363
    :goto_3
    if-ne v0, v7, :cond_b

    .line 364
    .line 365
    :goto_4
    return-object v7

    .line 366
    :cond_b
    move-object v2, v8

    .line 367
    :goto_5
    invoke-interface {v2, v11}, LNf/a;->a(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    return-object v9

    .line 371
    :goto_6
    invoke-interface {v2, v11}, LNf/a;->a(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    throw v0
.end method
