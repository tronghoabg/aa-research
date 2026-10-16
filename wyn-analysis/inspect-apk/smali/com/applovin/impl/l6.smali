.class Lcom/applovin/impl/l6;
.super Lcom/applovin/impl/j5;
.source "SourceFile"


# instance fields
.field private final g:Lcom/applovin/impl/t7;

.field private final h:Lcom/applovin/sdk/AppLovinAdLoadListener;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/t7;Lcom/applovin/sdk/AppLovinAdLoadListener;Lcom/applovin/impl/sdk/k;)V
    .locals 1

    .line 1
    const-string v0, "TaskRenderVastAd"

    .line 2
    .line 3
    invoke-direct {p0, v0, p3}, Lcom/applovin/impl/j5;-><init>(Ljava/lang/String;Lcom/applovin/impl/sdk/k;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/applovin/impl/l6;->h:Lcom/applovin/sdk/AppLovinAdLoadListener;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    .line 1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "Rendering VAST ad..."

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/applovin/impl/t7;->a()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v1, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/applovin/impl/t7;->a()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v3, ""

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    move-object v5, v4

    .line 50
    move-object v6, v5

    .line 51
    move-object v7, v6

    .line 52
    move-object v8, v7

    .line 53
    move-object v4, v3

    .line 54
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-eqz v9, :cond_a

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    check-cast v9, Lcom/applovin/impl/q8;

    .line 65
    .line 66
    invoke-static {v9}, Lcom/applovin/impl/b8;->b(Lcom/applovin/impl/q8;)Z

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    if-eqz v10, :cond_2

    .line 71
    .line 72
    const-string v10, "Wrapper"

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const-string v10, "InLine"

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v9, v10}, Lcom/applovin/impl/q8;->b(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    if-eqz v10, :cond_9

    .line 82
    .line 83
    const-string v9, "AdSystem"

    .line 84
    .line 85
    invoke-virtual {v10, v9}, Lcom/applovin/impl/q8;->b(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    if-eqz v9, :cond_3

    .line 90
    .line 91
    iget-object v11, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 92
    .line 93
    invoke-static {v9, v5, v11}, Lcom/applovin/impl/y7;->a(Lcom/applovin/impl/q8;Lcom/applovin/impl/y7;Lcom/applovin/impl/sdk/k;)Lcom/applovin/impl/y7;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    :cond_3
    const-string v9, "AdTitle"

    .line 98
    .line 99
    invoke-static {v10, v9, v3}, Lcom/applovin/impl/b8;->a(Lcom/applovin/impl/q8;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const-string v9, "Description"

    .line 104
    .line 105
    invoke-static {v10, v9, v4}, Lcom/applovin/impl/b8;->a(Lcom/applovin/impl/q8;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const-string v9, "Impression"

    .line 110
    .line 111
    invoke-virtual {v10, v9}, Lcom/applovin/impl/q8;->a(Ljava/lang/String;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    iget-object v11, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 116
    .line 117
    iget-object v12, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 118
    .line 119
    invoke-static {v9, v1, v11, v12}, Lcom/applovin/impl/b8;->a(Ljava/util/List;Ljava/util/Set;Lcom/applovin/impl/t7;Lcom/applovin/impl/sdk/k;)V

    .line 120
    .line 121
    .line 122
    const-string v9, "ViewableImpression"

    .line 123
    .line 124
    invoke-virtual {v10, v9}, Lcom/applovin/impl/q8;->c(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    if-eqz v9, :cond_4

    .line 129
    .line 130
    const-string v11, "Viewable"

    .line 131
    .line 132
    invoke-virtual {v9, v11}, Lcom/applovin/impl/q8;->a(Ljava/lang/String;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    iget-object v11, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 137
    .line 138
    iget-object v12, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 139
    .line 140
    invoke-static {v9, v1, v11, v12}, Lcom/applovin/impl/b8;->a(Ljava/util/List;Ljava/util/Set;Lcom/applovin/impl/t7;Lcom/applovin/impl/sdk/k;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    const-string v9, "AdVerifications"

    .line 144
    .line 145
    invoke-virtual {v10, v9}, Lcom/applovin/impl/q8;->b(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    if-eqz v9, :cond_5

    .line 150
    .line 151
    iget-object v11, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 152
    .line 153
    iget-object v12, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 154
    .line 155
    invoke-static {v9, v8, v11, v12}, Lcom/applovin/impl/r7;->a(Lcom/applovin/impl/q8;Lcom/applovin/impl/r7;Lcom/applovin/impl/t7;Lcom/applovin/impl/sdk/k;)Lcom/applovin/impl/r7;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    :cond_5
    const-string v9, "Error"

    .line 160
    .line 161
    invoke-virtual {v10, v9}, Lcom/applovin/impl/q8;->a(Ljava/lang/String;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    iget-object v11, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 166
    .line 167
    iget-object v12, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 168
    .line 169
    invoke-static {v9, v2, v11, v12}, Lcom/applovin/impl/b8;->a(Ljava/util/List;Ljava/util/Set;Lcom/applovin/impl/t7;Lcom/applovin/impl/sdk/k;)V

    .line 170
    .line 171
    .line 172
    const-string v9, "Creatives"

    .line 173
    .line 174
    invoke-virtual {v10, v9}, Lcom/applovin/impl/q8;->c(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    if-eqz v9, :cond_1

    .line 179
    .line 180
    invoke-virtual {v9}, Lcom/applovin/impl/q8;->b()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    :cond_6
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-eqz v10, :cond_1

    .line 193
    .line 194
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    check-cast v10, Lcom/applovin/impl/q8;

    .line 199
    .line 200
    const-string v11, "Linear"

    .line 201
    .line 202
    invoke-virtual {v10, v11}, Lcom/applovin/impl/q8;->c(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    if-eqz v11, :cond_7

    .line 207
    .line 208
    iget-object v10, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 209
    .line 210
    iget-object v12, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 211
    .line 212
    invoke-static {v11, v6, v10, v12}, Lcom/applovin/impl/c8;->a(Lcom/applovin/impl/q8;Lcom/applovin/impl/c8;Lcom/applovin/impl/t7;Lcom/applovin/impl/sdk/k;)Lcom/applovin/impl/c8;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    goto :goto_2

    .line 217
    :cond_7
    const-string v11, "CompanionAds"

    .line 218
    .line 219
    invoke-virtual {v10, v11}, Lcom/applovin/impl/q8;->b(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    if-eqz v11, :cond_8

    .line 224
    .line 225
    const-string v10, "Companion"

    .line 226
    .line 227
    invoke-virtual {v11, v10}, Lcom/applovin/impl/q8;->b(Ljava/lang/String;)Lcom/applovin/impl/q8;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    if-eqz v10, :cond_6

    .line 232
    .line 233
    iget-object v11, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 234
    .line 235
    iget-object v12, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 236
    .line 237
    invoke-static {v10, v7, v11, v12}, Lcom/applovin/impl/s7;->a(Lcom/applovin/impl/q8;Lcom/applovin/impl/s7;Lcom/applovin/impl/t7;Lcom/applovin/impl/sdk/k;)Lcom/applovin/impl/s7;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    goto :goto_2

    .line 242
    :cond_8
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    if-eqz v11, :cond_6

    .line 247
    .line 248
    iget-object v11, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 249
    .line 250
    iget-object v12, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 251
    .line 252
    new-instance v13, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    const-string v14, "Received and will skip rendering for an unidentified creative: "

    .line 255
    .line 256
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-virtual {v11, v12, v10}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_9
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    if-eqz v10, :cond_1

    .line 275
    .line 276
    iget-object v10, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 277
    .line 278
    iget-object v11, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 279
    .line 280
    new-instance v12, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v13, "Did not find wrapper or inline response for node: "

    .line 283
    .line 284
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    invoke-virtual {v10, v11, v9}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_a
    new-instance v0, Lcom/applovin/impl/p7$b;

    .line 300
    .line 301
    invoke-direct {v0}, Lcom/applovin/impl/p7$b;-><init>()V

    .line 302
    .line 303
    .line 304
    iget-object v9, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 305
    .line 306
    invoke-virtual {v0, v9}, Lcom/applovin/impl/p7$b;->a(Lcom/applovin/impl/sdk/k;)Lcom/applovin/impl/p7$b;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    iget-object v9, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 311
    .line 312
    invoke-virtual {v9}, Lcom/applovin/impl/t7;->b()Lorg/json/JSONObject;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-virtual {v0, v9}, Lcom/applovin/impl/p7$b;->a(Lorg/json/JSONObject;)Lcom/applovin/impl/p7$b;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v9, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 321
    .line 322
    invoke-virtual {v9}, Lcom/applovin/impl/t7;->e()Lorg/json/JSONObject;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    invoke-virtual {v0, v9}, Lcom/applovin/impl/p7$b;->b(Lorg/json/JSONObject;)Lcom/applovin/impl/p7$b;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    iget-object v9, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 331
    .line 332
    invoke-virtual {v9}, Lcom/applovin/impl/t7;->c()J

    .line 333
    .line 334
    .line 335
    move-result-wide v9

    .line 336
    invoke-virtual {v0, v9, v10}, Lcom/applovin/impl/p7$b;->a(J)Lcom/applovin/impl/p7$b;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0, v3}, Lcom/applovin/impl/p7$b;->b(Ljava/lang/String;)Lcom/applovin/impl/p7$b;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v0, v4}, Lcom/applovin/impl/p7$b;->a(Ljava/lang/String;)Lcom/applovin/impl/p7$b;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {v0, v5}, Lcom/applovin/impl/p7$b;->a(Lcom/applovin/impl/y7;)Lcom/applovin/impl/p7$b;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v0, v6}, Lcom/applovin/impl/p7$b;->a(Lcom/applovin/impl/c8;)Lcom/applovin/impl/p7$b;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0, v7}, Lcom/applovin/impl/p7$b;->a(Lcom/applovin/impl/s7;)Lcom/applovin/impl/p7$b;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v0, v8}, Lcom/applovin/impl/p7$b;->a(Lcom/applovin/impl/r7;)Lcom/applovin/impl/p7$b;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0, v1}, Lcom/applovin/impl/p7$b;->b(Ljava/util/Set;)Lcom/applovin/impl/p7$b;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0, v8}, Lcom/applovin/impl/p7$b;->a(Lcom/applovin/impl/r7;)Lcom/applovin/impl/p7$b;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v0, v2}, Lcom/applovin/impl/p7$b;->a(Ljava/util/Set;)Lcom/applovin/impl/p7$b;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Lcom/applovin/impl/p7$b;->a()Lcom/applovin/impl/p7;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v0}, Lcom/applovin/impl/b8;->c(Lcom/applovin/impl/p7;)Lcom/applovin/impl/u7;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    if-nez v1, :cond_c

    .line 385
    .line 386
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_b

    .line 391
    .line 392
    iget-object v1, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 393
    .line 394
    iget-object v2, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 395
    .line 396
    new-instance v3, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    const-string v4, "Finished rendering VAST ad: "

    .line 399
    .line 400
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-virtual {v1, v2, v3}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    :cond_b
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-virtual {v1}, Lcom/applovin/impl/f4;->e()V

    .line 418
    .line 419
    .line 420
    new-instance v1, Lcom/applovin/impl/o5;

    .line 421
    .line 422
    iget-object v2, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 423
    .line 424
    iget-object v3, p0, Lcom/applovin/impl/l6;->h:Lcom/applovin/sdk/AppLovinAdLoadListener;

    .line 425
    .line 426
    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/o5;-><init>(Lcom/applovin/impl/p7;Lcom/applovin/impl/sdk/k;Lcom/applovin/sdk/AppLovinAdLoadListener;)V

    .line 427
    .line 428
    .line 429
    iget-object v0, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 430
    .line 431
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->r0()Lcom/applovin/impl/e6;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    sget-object v2, Lcom/applovin/impl/e6$b;->b:Lcom/applovin/impl/e6$b;

    .line 436
    .line 437
    invoke-virtual {v0, v1, v2}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :cond_c
    iget-object v0, p0, Lcom/applovin/impl/l6;->g:Lcom/applovin/impl/t7;

    .line 442
    .line 443
    iget-object v2, p0, Lcom/applovin/impl/l6;->h:Lcom/applovin/sdk/AppLovinAdLoadListener;

    .line 444
    .line 445
    iget-object v3, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 446
    .line 447
    const/4 v4, -0x6

    .line 448
    invoke-static {v0, v2, v1, v4, v3}, Lcom/applovin/impl/b8;->a(Lcom/applovin/impl/t7;Lcom/applovin/sdk/AppLovinAdLoadListener;Lcom/applovin/impl/u7;ILcom/applovin/impl/sdk/k;)V

    .line 449
    .line 450
    .line 451
    return-void
.end method
