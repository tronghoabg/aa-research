.class public final Lcom/moloco/sdk/internal/services/bidtoken/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/internal/services/bidtoken/i;


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/bidtoken/o;

.field public final b:Lcom/moloco/sdk/internal/publisher/r0;

.field public final c:Lcom/moloco/sdk/internal/services/k;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/bidtoken/o;Lcom/moloco/sdk/internal/publisher/r0;Lcom/moloco/sdk/internal/services/k;)V
    .locals 1

    .line 1
    const-string v0, "bidTokenService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "initializationHandler"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "timeProviderService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/k;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/bidtoken/k;->b:Lcom/moloco/sdk/internal/publisher/r0;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/bidtoken/k;->c:Lcom/moloco/sdk/internal/services/k;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/acm/recorder/b;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/publisher/MolocoBidTokenListener;Llf/c;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/j;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/moloco/sdk/internal/services/bidtoken/j;

    .line 13
    .line 14
    iget v4, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->g:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->g:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/moloco/sdk/internal/services/bidtoken/j;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lcom/moloco/sdk/internal/services/bidtoken/j;-><init>(Lcom/moloco/sdk/internal/services/bidtoken/k;Llf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->e:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v5, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->g:I

    .line 36
    .line 37
    sget-object v6, Lef/C;->a:Lef/C;

    .line 38
    .line 39
    const/4 v8, 0x1

    .line 40
    const-string v9, "bid_token_get_response"

    .line 41
    .line 42
    const-string v10, "reason"

    .line 43
    .line 44
    const-string v11, "failure"

    .line 45
    .line 46
    const-string v12, "result"

    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    if-ne v5, v8, :cond_1

    .line 51
    .line 52
    iget-wide v4, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->d:J

    .line 53
    .line 54
    iget-object v1, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->c:Lcom/moloco/sdk/publisher/MolocoBidTokenListener;

    .line 55
    .line 56
    iget-object v13, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->b:Lcom/moloco/sdk/acm/recorder/c;

    .line 57
    .line 58
    iget-object v3, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->a:Lcom/moloco/sdk/internal/services/bidtoken/k;

    .line 59
    .line 60
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_2
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lcom/moloco/sdk/acm/h;

    .line 77
    .line 78
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 79
    .line 80
    const-string v5, "bid_token_get_request"

    .line 81
    .line 82
    invoke-direct {v2, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object/from16 v13, p1

    .line 86
    .line 87
    check-cast v13, Lcom/moloco/sdk/acm/recorder/c;

    .line 88
    .line 89
    invoke-virtual {v13, v2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 90
    .line 91
    .line 92
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/k;->b:Lcom/moloco/sdk/internal/publisher/r0;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :try_start_0
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    .line 100
    move v5, v8

    .line 101
    goto :goto_1

    .line 102
    :catch_0
    const/4 v5, 0x0

    .line 103
    :goto_1
    const-string v14, ""

    .line 104
    .line 105
    if-nez v5, :cond_3

    .line 106
    .line 107
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 108
    .line 109
    sget-object v15, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    const/16 v19, 0x0

    .line 114
    .line 115
    const-string v16, "BidTokenHandlerImpl"

    .line 116
    .line 117
    const-string v17, "Bid token cannot be fetched because SDK initialization cannot happen due to WM issue"

    .line 118
    .line 119
    const/16 v20, 0xc

    .line 120
    .line 121
    const/16 v21, 0x0

    .line 122
    .line 123
    invoke-static/range {v15 .. v21}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 127
    .line 128
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 129
    .line 130
    invoke-direct {v3, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 134
    .line 135
    invoke-virtual {v3, v12, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string v4, "sdk_cannot_initialize"

    .line 139
    .line 140
    invoke-virtual {v3, v10, v4}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1, v14, v2}, Lcom/moloco/sdk/publisher/MolocoBidTokenListener;->onBidTokenResult(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)V

    .line 147
    .line 148
    .line 149
    return-object v6

    .line 150
    :cond_3
    iget-object v2, v2, Lcom/moloco/sdk/internal/publisher/r0;->c:LHf/e0;

    .line 151
    .line 152
    iget-object v2, v2, LHf/e0;->a:LHf/c0;

    .line 153
    .line 154
    check-cast v2, LHf/x0;

    .line 155
    .line 156
    invoke-virtual {v2}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    sget-object v5, Lcom/moloco/sdk/publisher/Initialization;->FAILURE:Lcom/moloco/sdk/publisher/Initialization;

    .line 161
    .line 162
    if-eq v2, v5, :cond_c

    .line 163
    .line 164
    sget-object v2, Lcom/moloco/sdk/publisher/Moloco;->INSTANCE:Lcom/moloco/sdk/publisher/Moloco;

    .line 165
    .line 166
    invoke-virtual {v2}, Lcom/moloco/sdk/publisher/Moloco;->getFailedMediations$moloco_sdk_release()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual/range {p2 .. p2}, Lcom/moloco/sdk/publisher/MediationInfo;->getName()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_4

    .line 179
    .line 180
    goto/16 :goto_5

    .line 181
    .line 182
    :cond_4
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/k;->c:Lcom/moloco/sdk/internal/services/k;

    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 188
    .line 189
    .line 190
    move-result-wide v14

    .line 191
    iput-object v0, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->a:Lcom/moloco/sdk/internal/services/bidtoken/k;

    .line 192
    .line 193
    iput-object v13, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->b:Lcom/moloco/sdk/acm/recorder/c;

    .line 194
    .line 195
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->c:Lcom/moloco/sdk/publisher/MolocoBidTokenListener;

    .line 196
    .line 197
    iput-wide v14, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->d:J

    .line 198
    .line 199
    iput v8, v3, Lcom/moloco/sdk/internal/services/bidtoken/j;->g:I

    .line 200
    .line 201
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/k;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 202
    .line 203
    invoke-virtual {v2, v13, v3}, Lcom/moloco/sdk/internal/services/bidtoken/o;->a(Lcom/moloco/sdk/acm/recorder/b;Llf/c;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    if-ne v2, v4, :cond_5

    .line 208
    .line 209
    return-object v4

    .line 210
    :cond_5
    move-object v3, v0

    .line 211
    move-wide v4, v14

    .line 212
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 213
    .line 214
    iget-object v3, v3, Lcom/moloco/sdk/internal/services/bidtoken/k;->c:Lcom/moloco/sdk/internal/services/k;

    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 220
    .line 221
    .line 222
    move-result-wide v14

    .line 223
    sub-long/2addr v14, v4

    .line 224
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 225
    .line 226
    const-string v3, "Bid token fetched in "

    .line 227
    .line 228
    const-string v4, " ms"

    .line 229
    .line 230
    invoke-static {v14, v15, v3, v4}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v18

    .line 234
    const/16 v19, 0x0

    .line 235
    .line 236
    const/16 v20, 0x0

    .line 237
    .line 238
    const-string v17, "BidTokenHandlerImpl"

    .line 239
    .line 240
    const/16 v21, 0xc

    .line 241
    .line 242
    const/16 v22, 0x0

    .line 243
    .line 244
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    const-string v4, "bid_token_duration_crossed_3s"

    .line 252
    .line 253
    const-string v5, "bid_token_duration_crossed_1s"

    .line 254
    .line 255
    const-wide/16 v7, 0x1

    .line 256
    .line 257
    if-nez v3, :cond_8

    .line 258
    .line 259
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 260
    .line 261
    sget-object v17, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 262
    .line 263
    invoke-direct {v3, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 267
    .line 268
    invoke-virtual {v3, v12, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const-string v9, "bid_token_fetch_failed"

    .line 272
    .line 273
    invoke-virtual {v3, v10, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v13, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 277
    .line 278
    .line 279
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 280
    .line 281
    invoke-virtual {v3, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v7

    .line 285
    cmp-long v7, v14, v7

    .line 286
    .line 287
    if-ltz v7, :cond_6

    .line 288
    .line 289
    new-instance v7, Lcom/moloco/sdk/acm/h;

    .line 290
    .line 291
    invoke-direct {v7, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7, v12, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7, v10, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v13, v7}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 301
    .line 302
    .line 303
    :cond_6
    const-wide/16 v7, 0x3

    .line 304
    .line 305
    invoke-virtual {v3, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 306
    .line 307
    .line 308
    move-result-wide v7

    .line 309
    cmp-long v3, v14, v7

    .line 310
    .line 311
    if-ltz v3, :cond_7

    .line 312
    .line 313
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 314
    .line 315
    invoke-direct {v3, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v12, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3, v10, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v13, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 325
    .line 326
    .line 327
    :cond_7
    sget-object v3, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SIGNAL_COLLECTION_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_8
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 331
    .line 332
    sget-object v10, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 333
    .line 334
    invoke-direct {v3, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 338
    .line 339
    const-string v9, "success"

    .line 340
    .line 341
    invoke-virtual {v3, v12, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v13, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 345
    .line 346
    .line 347
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 348
    .line 349
    invoke-virtual {v3, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 350
    .line 351
    .line 352
    move-result-wide v7

    .line 353
    cmp-long v7, v14, v7

    .line 354
    .line 355
    if-ltz v7, :cond_9

    .line 356
    .line 357
    new-instance v7, Lcom/moloco/sdk/acm/h;

    .line 358
    .line 359
    invoke-direct {v7, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7, v12, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v13, v7}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 366
    .line 367
    .line 368
    :cond_9
    const-wide/16 v7, 0x3

    .line 369
    .line 370
    invoke-virtual {v3, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 371
    .line 372
    .line 373
    move-result-wide v7

    .line 374
    cmp-long v3, v14, v7

    .line 375
    .line 376
    if-ltz v3, :cond_a

    .line 377
    .line 378
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 379
    .line 380
    invoke-direct {v3, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v12, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v13, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 387
    .line 388
    .line 389
    :cond_a
    const/4 v3, 0x0

    .line 390
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    const-string v5, "Returning bid token result, hasError: "

    .line 393
    .line 394
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    if-eqz v3, :cond_b

    .line 398
    .line 399
    const/4 v7, 0x1

    .line 400
    goto :goto_4

    .line 401
    :cond_b
    const/4 v7, 0x0

    .line 402
    :goto_4
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v5, ", SDK init complete: "

    .line 406
    .line 407
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-static {}, Lcom/moloco/sdk/publisher/Moloco;->isInitialized()Z

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v18

    .line 421
    const/16 v19, 0x0

    .line 422
    .line 423
    const/16 v20, 0x0

    .line 424
    .line 425
    const-string v17, "BidTokenHandlerImpl"

    .line 426
    .line 427
    const/16 v21, 0xc

    .line 428
    .line 429
    const/16 v22, 0x0

    .line 430
    .line 431
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    invoke-interface {v1, v2, v3}, Lcom/moloco/sdk/publisher/MolocoBidTokenListener;->onBidTokenResult(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)V

    .line 435
    .line 436
    .line 437
    return-object v6

    .line 438
    :cond_c
    :goto_5
    sget-object v23, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 439
    .line 440
    const/16 v26, 0x0

    .line 441
    .line 442
    const/16 v27, 0x0

    .line 443
    .line 444
    const-string v24, "BidTokenHandlerImpl"

    .line 445
    .line 446
    const-string v25, "Bid token cannot be fetched because SDK initialization has failed"

    .line 447
    .line 448
    const/16 v28, 0xc

    .line 449
    .line 450
    const/16 v29, 0x0

    .line 451
    .line 452
    invoke-static/range {v23 .. v29}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    new-instance v2, Lcom/moloco/sdk/acm/h;

    .line 456
    .line 457
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 458
    .line 459
    invoke-direct {v2, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 463
    .line 464
    invoke-virtual {v2, v12, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    const-string v3, "sdk_init_failed"

    .line 468
    .line 469
    invoke-virtual {v2, v10, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v13, v2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 473
    .line 474
    .line 475
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_INIT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 476
    .line 477
    invoke-interface {v1, v14, v2}, Lcom/moloco/sdk/publisher/MolocoBidTokenListener;->onBidTokenResult(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)V

    .line 478
    .line 479
    .line 480
    return-object v6
.end method
