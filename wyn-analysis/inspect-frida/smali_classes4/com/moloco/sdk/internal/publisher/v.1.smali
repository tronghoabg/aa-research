.class public final Lcom/moloco/sdk/internal/publisher/v;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/B;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;JLjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/v;->b:Lcom/moloco/sdk/internal/publisher/B;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/v;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/v;->d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/moloco/sdk/internal/publisher/v;->e:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/v;

    .line 2
    .line 3
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/v;->d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 4
    .line 5
    iget-wide v4, p0, Lcom/moloco/sdk/internal/publisher/v;->e:J

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/v;->b:Lcom/moloco/sdk/internal/publisher/B;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/v;->c:Ljava/lang/String;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/v;-><init>(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;JLjf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/v;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/v;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/v;->a:I

    .line 6
    .line 7
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/v;->b:Lcom/moloco/sdk/internal/publisher/B;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/v;->a:I

    .line 32
    .line 33
    iget-object v2, v0, Lcom/moloco/sdk/internal/publisher/v;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v4, v2, v0}, Lcom/moloco/sdk/internal/publisher/B;->b(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-ne v2, v1, :cond_2

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_2
    :goto_0
    move-object v5, v2

    .line 43
    check-cast v5, Ljava/lang/String;

    .line 44
    .line 45
    sget-object v1, Lef/C;->a:Lef/C;

    .line 46
    .line 47
    iget-object v9, v4, Lcom/moloco/sdk/internal/publisher/B;->n:Lcom/moloco/sdk/acm/l;

    .line 48
    .line 49
    iget-object v11, v4, Lcom/moloco/sdk/internal/publisher/B;->h:Lcom/moloco/sdk/acm/recorder/c;

    .line 50
    .line 51
    iget-object v2, v4, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v10, v4, Lcom/moloco/sdk/internal/publisher/B;->f:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 54
    .line 55
    iget-object v7, v0, Lcom/moloco/sdk/internal/publisher/v;->d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 56
    .line 57
    if-nez v5, :cond_4

    .line 58
    .line 59
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 60
    .line 61
    const/4 v15, 0x0

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const-string v13, "AdLoadImpl"

    .line 65
    .line 66
    const-string v14, "Could not pre-process the bid response. Failing the load() call."

    .line 67
    .line 68
    const/16 v17, 0xc

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    sget-object v3, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 78
    .line 79
    invoke-static {v2, v3}, Lcom/moloco/sdk/publisher/MolocoAdErrorKt;->createAdErrorInfo(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)Lcom/moloco/sdk/publisher/MolocoAdError;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {v7, v2}, Lcom/moloco/sdk/publisher/AdLoad$Listener;->onAdLoadFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 87
    .line 88
    const-string v2, "failure"

    .line 89
    .line 90
    const-string v3, "result"

    .line 91
    .line 92
    invoke-virtual {v9, v3, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->getErrorCode()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    const-string v4, "reason"

    .line 106
    .line 107
    invoke-virtual {v9, v4, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 115
    .line 116
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const-string v6, "toLowerCase(...)"

    .line 121
    .line 122
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v7, "ad_type"

    .line 126
    .line 127
    invoke-virtual {v9, v7, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v11, v9}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 131
    .line 132
    .line 133
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 134
    .line 135
    sget-object v8, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 136
    .line 137
    const-string v8, "load_ad_failed"

    .line 138
    .line 139
    invoke-direct {v3, v8}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->getErrorCode()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v3, v4, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v7, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v11, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 168
    .line 169
    .line 170
    return-object v1

    .line 171
    :cond_4
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 172
    .line 173
    const/4 v15, 0x0

    .line 174
    const/16 v16, 0x0

    .line 175
    .line 176
    const-string v13, "AdLoad"

    .line 177
    .line 178
    const-string v14, "Processed the bidResponse, proceeding with the load() call."

    .line 179
    .line 180
    const/16 v17, 0xc

    .line 181
    .line 182
    const/16 v18, 0x0

    .line 183
    .line 184
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object v13, v12

    .line 188
    iget-object v12, v4, Lcom/moloco/sdk/internal/publisher/B;->i:Ltf/a;

    .line 189
    .line 190
    const-string v6, "acmLoadTimerEvent"

    .line 191
    .line 192
    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string v6, "adFormatType"

    .line 196
    .line 197
    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    new-instance v6, Lcom/moloco/sdk/internal/publisher/C;

    .line 201
    .line 202
    sget-object v8, Lcom/moloco/sdk/internal/C;->a:Lef/p;

    .line 203
    .line 204
    invoke-virtual {v8}, Lef/p;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    check-cast v8, Lcom/moloco/sdk/internal/B;

    .line 209
    .line 210
    invoke-direct/range {v6 .. v12}, Lcom/moloco/sdk/internal/publisher/C;-><init>(Lcom/moloco/sdk/publisher/AdLoad$Listener;Lcom/moloco/sdk/internal/B;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)V

    .line 211
    .line 212
    .line 213
    iget-object v7, v4, Lcom/moloco/sdk/internal/publisher/B;->l:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    const/4 v11, 0x0

    .line 220
    if-eqz v7, :cond_8

    .line 221
    .line 222
    iget-boolean v7, v4, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 223
    .line 224
    if-eqz v7, :cond_7

    .line 225
    .line 226
    const/4 v3, 0x6

    .line 227
    invoke-static {v2, v11, v11, v3, v11}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    iget-object v3, v4, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 232
    .line 233
    invoke-static {v4, v3}, Lcom/moloco/sdk/internal/publisher/B;->a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    if-eqz v3, :cond_5

    .line 238
    .line 239
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 240
    .line 241
    if-eqz v3, :cond_5

    .line 242
    .line 243
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_5
    move-object v3, v11

    .line 247
    :goto_1
    iget-wide v7, v0, Lcom/moloco/sdk/internal/publisher/v;->e:J

    .line 248
    .line 249
    invoke-virtual {v6, v2, v7, v8, v3}, Lcom/moloco/sdk/internal/publisher/C;->b(Lcom/moloco/sdk/publisher/MolocoAd;JLcom/moloco/sdk/internal/ortb/model/d;)V

    .line 250
    .line 251
    .line 252
    iget-object v3, v4, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 253
    .line 254
    invoke-static {v4, v3}, Lcom/moloco/sdk/internal/publisher/B;->a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    if-eqz v3, :cond_6

    .line 259
    .line 260
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 261
    .line 262
    if-eqz v3, :cond_6

    .line 263
    .line 264
    iget-object v11, v3, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 265
    .line 266
    :cond_6
    invoke-virtual {v6, v2, v11}, Lcom/moloco/sdk/internal/publisher/C;->c(Lcom/moloco/sdk/publisher/MolocoAd;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 267
    .line 268
    .line 269
    return-object v1

    .line 270
    :cond_7
    iget-object v7, v4, Lcom/moloco/sdk/internal/publisher/B;->o:LEf/H0;

    .line 271
    .line 272
    if-eqz v7, :cond_8

    .line 273
    .line 274
    invoke-virtual {v7}, LEf/z0;->isActive()Z

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    if-ne v7, v3, :cond_8

    .line 279
    .line 280
    new-instance v3, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v4, "Already loading ad "

    .line 283
    .line 284
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const/16 v4, 0x20

    .line 291
    .line 292
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v2, ". Returning"

    .line 299
    .line 300
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v14

    .line 307
    const/4 v15, 0x0

    .line 308
    const/16 v16, 0x0

    .line 309
    .line 310
    move-object v12, v13

    .line 311
    const-string v13, "AdLoad"

    .line 312
    .line 313
    const/16 v17, 0xc

    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    return-object v1

    .line 321
    :cond_8
    iget-object v2, v4, Lcom/moloco/sdk/internal/publisher/B;->o:LEf/H0;

    .line 322
    .line 323
    if-eqz v2, :cond_9

    .line 324
    .line 325
    invoke-virtual {v2, v11}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 326
    .line 327
    .line 328
    :cond_9
    new-instance v3, Lcom/moloco/sdk/internal/publisher/A;

    .line 329
    .line 330
    const/4 v9, 0x0

    .line 331
    move-object v8, v6

    .line 332
    iget-wide v6, v0, Lcom/moloco/sdk/internal/publisher/v;->e:J

    .line 333
    .line 334
    invoke-direct/range {v3 .. v9}, Lcom/moloco/sdk/internal/publisher/A;-><init>(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;JLcom/moloco/sdk/internal/publisher/C;Ljf/c;)V

    .line 335
    .line 336
    .line 337
    const/4 v2, 0x3

    .line 338
    iget-object v5, v4, Lcom/moloco/sdk/internal/publisher/B;->j:LKd/a;

    .line 339
    .line 340
    invoke-static {v5, v11, v3, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    iput-object v2, v4, Lcom/moloco/sdk/internal/publisher/B;->o:LEf/H0;

    .line 345
    .line 346
    return-object v1
.end method
