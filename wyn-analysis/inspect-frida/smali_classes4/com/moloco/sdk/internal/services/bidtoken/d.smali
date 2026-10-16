.class public final Lcom/moloco/sdk/internal/services/bidtoken/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lkotlin/jvm/internal/G;

.field public b:La2/v;

.field public c:Lcom/moloco/sdk/acm/recorder/c;

.field public d:Lcom/moloco/sdk/acm/l;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public final synthetic i:La2/v;

.field public final synthetic j:Lcom/moloco/sdk/acm/recorder/c;


# direct methods
.method public constructor <init>(La2/v;Lcom/moloco/sdk/acm/recorder/c;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/d;->i:La2/v;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/bidtoken/d;->j:Lcom/moloco/sdk/acm/recorder/c;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/services/bidtoken/d;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/bidtoken/d;->i:La2/v;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/bidtoken/d;->j:Lcom/moloco/sdk/acm/recorder/c;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/moloco/sdk/internal/services/bidtoken/d;-><init>(La2/v;Lcom/moloco/sdk/acm/recorder/c;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/services/bidtoken/d;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/services/bidtoken/d;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/services/bidtoken/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 5
    .line 6
    iget v4, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->h:I

    .line 7
    .line 8
    const/4 v5, 0x2

    .line 9
    if-eqz v4, :cond_2

    .line 10
    .line 11
    if-eq v4, v2, :cond_1

    .line 12
    .line 13
    if-ne v4, v5, :cond_0

    .line 14
    .line 15
    iget v4, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->f:I

    .line 16
    .line 17
    iget v6, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->e:I

    .line 18
    .line 19
    iget-object v7, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->c:Lcom/moloco/sdk/acm/recorder/c;

    .line 20
    .line 21
    iget-object v8, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->b:La2/v;

    .line 22
    .line 23
    iget-object v9, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->a:Lkotlin/jvm/internal/G;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object v13, v8

    .line 29
    move v8, v6

    .line 30
    move-object v6, v9

    .line 31
    move-object v9, v7

    .line 32
    move-object v7, v13

    .line 33
    move/from16 v20, v2

    .line 34
    .line 35
    move v13, v5

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :cond_1
    iget v4, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->g:I

    .line 47
    .line 48
    iget v6, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->f:I

    .line 49
    .line 50
    iget v7, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->e:I

    .line 51
    .line 52
    iget-object v8, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->d:Lcom/moloco/sdk/acm/l;

    .line 53
    .line 54
    iget-object v9, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->c:Lcom/moloco/sdk/acm/recorder/c;

    .line 55
    .line 56
    iget-object v10, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->b:La2/v;

    .line 57
    .line 58
    iget-object v11, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->a:Lkotlin/jvm/internal/G;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v12, v10

    .line 64
    move-object v10, v8

    .line 65
    move-object v8, v12

    .line 66
    move-object v12, v11

    .line 67
    move-object/from16 v11, p1

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_2
    invoke-static/range {p1 .. p1}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    new-instance v6, Lcom/moloco/sdk/internal/y;

    .line 76
    .line 77
    new-instance v7, Lcom/moloco/sdk/internal/n;

    .line 78
    .line 79
    sget-object v8, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->UNKNOWN:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 80
    .line 81
    invoke-virtual {v8}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->getErrorCode()I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    const-string v9, "retry max parameter is 0"

    .line 86
    .line 87
    invoke-direct {v7, v9, v8}, Lcom/moloco/sdk/internal/n;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v6, v7}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iput-object v6, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 94
    .line 95
    iget-object v6, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->i:La2/v;

    .line 96
    .line 97
    const/4 v7, 0x3

    .line 98
    iget-object v8, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->j:Lcom/moloco/sdk/acm/recorder/c;

    .line 99
    .line 100
    move-object v9, v8

    .line 101
    move v8, v7

    .line 102
    move-object v7, v6

    .line 103
    move-object v6, v4

    .line 104
    const/4 v4, 0x0

    .line 105
    :goto_0
    if-ge v4, v8, :cond_8

    .line 106
    .line 107
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v11, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v12, "Fetching bidtoken, attempt #"

    .line 115
    .line 116
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const-string v11, "BidTokenApi"

    .line 129
    .line 130
    const/16 v15, 0xc

    .line 131
    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    sget-object v10, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 138
    .line 139
    const-string v10, "sbt_api_fetch_time_ms"

    .line 140
    .line 141
    invoke-virtual {v9, v10}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    iput-object v6, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->a:Lkotlin/jvm/internal/G;

    .line 146
    .line 147
    iput-object v7, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->b:La2/v;

    .line 148
    .line 149
    iput-object v9, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->c:Lcom/moloco/sdk/acm/recorder/c;

    .line 150
    .line 151
    iput-object v10, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->d:Lcom/moloco/sdk/acm/l;

    .line 152
    .line 153
    iput v8, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->e:I

    .line 154
    .line 155
    iput v4, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->f:I

    .line 156
    .line 157
    iput v4, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->g:I

    .line 158
    .line 159
    iput v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->h:I

    .line 160
    .line 161
    const-string v11, "https://sdkapi.dsp-api.moloco.com/v3/bidtoken"

    .line 162
    .line 163
    invoke-static {v7, v11, v0}, La2/v;->i(La2/v;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    if-ne v11, v3, :cond_3

    .line 168
    .line 169
    goto/16 :goto_2

    .line 170
    .line 171
    :cond_3
    move v12, v8

    .line 172
    move-object v8, v7

    .line 173
    move v7, v12

    .line 174
    move-object v12, v6

    .line 175
    move v6, v4

    .line 176
    :goto_1
    check-cast v11, Lcom/moloco/sdk/internal/A;

    .line 177
    .line 178
    iput-object v11, v12, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 179
    .line 180
    sget-object v13, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 181
    .line 182
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    new-instance v14, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v15, "Received bidtoken fetch result: "

    .line 188
    .line 189
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const-string v14, "BidTokenApi"

    .line 204
    .line 205
    const/16 v18, 0xc

    .line 206
    .line 207
    const/16 v19, 0x0

    .line 208
    .line 209
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    instance-of v14, v11, Lcom/moloco/sdk/internal/y;

    .line 213
    .line 214
    const-string v15, "sbt_api_fetch"

    .line 215
    .line 216
    move/from16 v20, v2

    .line 217
    .line 218
    const-string v2, "attempt"

    .line 219
    .line 220
    const-string v1, "result"

    .line 221
    .line 222
    if-eqz v14, :cond_6

    .line 223
    .line 224
    move-object v14, v11

    .line 225
    check-cast v14, Lcom/moloco/sdk/internal/y;

    .line 226
    .line 227
    iget-object v14, v14, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v14, Lcom/moloco/sdk/internal/n;

    .line 230
    .line 231
    iget v14, v14, Lcom/moloco/sdk/internal/n;->b:I

    .line 232
    .line 233
    sget-object v16, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 234
    .line 235
    const-string v5, "failure"

    .line 236
    .line 237
    invoke-virtual {v10, v1, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    move/from16 p1, v4

    .line 241
    .line 242
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    move-object/from16 v16, v13

    .line 247
    .line 248
    const-string v13, "reason"

    .line 249
    .line 250
    invoke-virtual {v10, v13, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v10, v2, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9, v10}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 261
    .line 262
    .line 263
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 264
    .line 265
    sget-object v10, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 266
    .line 267
    invoke-direct {v4, v15}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4, v1, v5}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v4, v13, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-virtual {v4, v2, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 288
    .line 289
    .line 290
    const/16 v1, 0x190

    .line 291
    .line 292
    if-gt v1, v14, :cond_4

    .line 293
    .line 294
    const/16 v1, 0x1f4

    .line 295
    .line 296
    if-ge v14, v1, :cond_4

    .line 297
    .line 298
    const/16 v1, 0x1ad

    .line 299
    .line 300
    if-eq v14, v1, :cond_4

    .line 301
    .line 302
    const-string v1, "Received 4xx error: "

    .line 303
    .line 304
    invoke-static {v14, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v15

    .line 308
    move-object/from16 v13, v16

    .line 309
    .line 310
    const/16 v16, 0x0

    .line 311
    .line 312
    const/16 v17, 0x0

    .line 313
    .line 314
    const-string v14, "BidTokenApi"

    .line 315
    .line 316
    const/16 v18, 0xc

    .line 317
    .line 318
    const/16 v19, 0x0

    .line 319
    .line 320
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    return-object v11

    .line 324
    :cond_4
    move-object/from16 v13, v16

    .line 325
    .line 326
    const-string v1, "Received non-4xx or "

    .line 327
    .line 328
    const-string v2, " error: "

    .line 329
    .line 330
    invoke-static {v14, v14, v1, v2}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v15

    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const-string v14, "BidTokenApi"

    .line 339
    .line 340
    const/16 v18, 0xc

    .line 341
    .line 342
    const/16 v19, 0x0

    .line 343
    .line 344
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    add-int/lit8 v4, p1, 0x1

    .line 348
    .line 349
    int-to-long v1, v4

    .line 350
    const-wide/16 v4, 0xc8

    .line 351
    .line 352
    mul-long/2addr v4, v1

    .line 353
    const-string v1, "Retrying after delay: "

    .line 354
    .line 355
    invoke-static {v4, v5, v1}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v15

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const-string v14, "BidTokenApi"

    .line 364
    .line 365
    const/16 v18, 0xc

    .line 366
    .line 367
    const/16 v19, 0x0

    .line 368
    .line 369
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    iput-object v12, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->a:Lkotlin/jvm/internal/G;

    .line 373
    .line 374
    iput-object v8, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->b:La2/v;

    .line 375
    .line 376
    iput-object v9, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->c:Lcom/moloco/sdk/acm/recorder/c;

    .line 377
    .line 378
    const/4 v1, 0x0

    .line 379
    iput-object v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->d:Lcom/moloco/sdk/acm/l;

    .line 380
    .line 381
    iput v7, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->e:I

    .line 382
    .line 383
    iput v6, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->f:I

    .line 384
    .line 385
    const/4 v13, 0x2

    .line 386
    iput v13, v0, Lcom/moloco/sdk/internal/services/bidtoken/d;->h:I

    .line 387
    .line 388
    invoke-static {v4, v5, v0}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    if-ne v1, v3, :cond_5

    .line 393
    .line 394
    :goto_2
    return-object v3

    .line 395
    :cond_5
    move-object v4, v8

    .line 396
    move v8, v7

    .line 397
    move-object v7, v4

    .line 398
    move v4, v6

    .line 399
    move-object v6, v12

    .line 400
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 401
    .line 402
    move v5, v13

    .line 403
    move/from16 v2, v20

    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :cond_6
    move/from16 p1, v4

    .line 408
    .line 409
    instance-of v3, v11, Lcom/moloco/sdk/internal/z;

    .line 410
    .line 411
    if-eqz v3, :cond_7

    .line 412
    .line 413
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 414
    .line 415
    const-string v3, "success"

    .line 416
    .line 417
    invoke-virtual {v10, v1, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    invoke-virtual {v10, v2, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v9, v10}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 428
    .line 429
    .line 430
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 431
    .line 432
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 433
    .line 434
    invoke-direct {v4, v15}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4, v1, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-virtual {v4, v2, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v9, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 448
    .line 449
    .line 450
    return-object v11

    .line 451
    :cond_7
    new-instance v1, LE5/Q;

    .line 452
    .line 453
    const/16 v2, 0x9

    .line 454
    .line 455
    const/4 v3, 0x0

    .line 456
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 457
    .line 458
    .line 459
    throw v1

    .line 460
    :cond_8
    iget-object v1, v6, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 461
    .line 462
    return-object v1
.end method
