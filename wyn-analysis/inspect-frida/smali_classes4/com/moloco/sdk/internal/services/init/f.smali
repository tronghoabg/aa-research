.class public final Lcom/moloco/sdk/internal/services/init/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/v;

.field public final b:Lcom/moloco/sdk/internal/services/x;

.field public final c:Lcom/moloco/sdk/internal/services/usertracker/c;

.field public final d:Lwd/c;

.field public final e:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/v;Lcom/moloco/sdk/internal/services/x;Lcom/moloco/sdk/internal/services/usertracker/c;Lwd/c;)V
    .locals 1

    .line 1
    const-string v0, "deviceInfoService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appInfoService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "userTrackerService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "httpClient"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/f;->a:Lcom/moloco/sdk/internal/services/v;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/init/f;->b:Lcom/moloco/sdk/internal/services/x;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/init/f;->c:Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/moloco/sdk/internal/services/init/f;->d:Lwd/c;

    .line 31
    .line 32
    const-string p1, "https://sdkapi.dsp-api.moloco.com/v2/init"

    .line 33
    .line 34
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/f;->e:Landroid/net/Uri;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;Llf/c;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    const-string v2, "SDK Init failed with status code: "

    .line 6
    .line 7
    const-string v3, "http status "

    .line 8
    .line 9
    const-string v4, "Requesting Init with appKey: "

    .line 10
    .line 11
    instance-of v5, v0, Lcom/moloco/sdk/internal/services/init/d;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Lcom/moloco/sdk/internal/services/init/d;

    .line 17
    .line 18
    iget v6, v5, Lcom/moloco/sdk/internal/services/init/d;->j:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, Lcom/moloco/sdk/internal/services/init/d;->j:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v5, Lcom/moloco/sdk/internal/services/init/d;

    .line 31
    .line 32
    invoke-direct {v5, v1, v0}, Lcom/moloco/sdk/internal/services/init/d;-><init>(Lcom/moloco/sdk/internal/services/init/f;Llf/c;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, v5, Lcom/moloco/sdk/internal/services/init/d;->h:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 38
    .line 39
    iget v7, v5, Lcom/moloco/sdk/internal/services/init/d;->j:I

    .line 40
    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x2

    .line 43
    const/4 v10, 0x1

    .line 44
    const-string v11, "reason"

    .line 45
    .line 46
    const-string v12, "failure"

    .line 47
    .line 48
    const-string v13, "result"

    .line 49
    .line 50
    if-eqz v7, :cond_4

    .line 51
    .line 52
    if-eq v7, v10, :cond_3

    .line 53
    .line 54
    if-eq v7, v9, :cond_2

    .line 55
    .line 56
    if-ne v7, v8, :cond_1

    .line 57
    .line 58
    iget-object v2, v5, Lcom/moloco/sdk/internal/services/init/d;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lcom/moloco/sdk/acm/l;

    .line 61
    .line 62
    iget-object v3, v5, Lcom/moloco/sdk/internal/services/init/d;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Lcom/moloco/sdk/acm/recorder/b;

    .line 65
    .line 66
    iget-object v4, v5, Lcom/moloco/sdk/internal/services/init/d;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 69
    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    iget-object v4, v5, Lcom/moloco/sdk/internal/services/init/d;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v4, Lcom/moloco/sdk/acm/l;

    .line 84
    .line 85
    iget-object v7, v5, Lcom/moloco/sdk/internal/services/init/d;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v7, Lcom/moloco/sdk/acm/recorder/b;

    .line 88
    .line 89
    iget-object v9, v5, Lcom/moloco/sdk/internal/services/init/d;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 90
    .line 91
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 92
    .line 93
    .line 94
    move-object/from16 v24, v2

    .line 95
    .line 96
    move-object/from16 v18, v3

    .line 97
    .line 98
    move-object v2, v4

    .line 99
    move-object v3, v7

    .line 100
    move-object v4, v9

    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :catch_0
    move-exception v0

    .line 104
    move-object v2, v4

    .line 105
    move-object v3, v7

    .line 106
    move-object v4, v9

    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :cond_3
    iget-object v7, v5, Lcom/moloco/sdk/internal/services/init/d;->g:Lcom/moloco/sdk/internal/services/w;

    .line 110
    .line 111
    iget-object v10, v5, Lcom/moloco/sdk/internal/services/init/d;->f:Lcom/moloco/sdk/internal/services/F;

    .line 112
    .line 113
    iget-object v15, v5, Lcom/moloco/sdk/internal/services/init/d;->e:Lcom/moloco/sdk/acm/l;

    .line 114
    .line 115
    iget-object v8, v5, Lcom/moloco/sdk/internal/services/init/d;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 116
    .line 117
    iget-object v9, v5, Lcom/moloco/sdk/internal/services/init/d;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v9, Lcom/moloco/sdk/publisher/MediationInfo;

    .line 120
    .line 121
    iget-object v14, v5, Lcom/moloco/sdk/internal/services/init/d;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Ljava/lang/String;

    .line 124
    .line 125
    move-object/from16 p1, v7

    .line 126
    .line 127
    iget-object v7, v5, Lcom/moloco/sdk/internal/services/init/d;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 128
    .line 129
    :try_start_2
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 130
    .line 131
    .line 132
    move-object v1, v15

    .line 133
    move-object v15, v10

    .line 134
    move-object v10, v8

    .line 135
    move-object/from16 v8, p1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catch_1
    move-exception v0

    .line 139
    :goto_1
    move-object v4, v0

    .line 140
    goto/16 :goto_7

    .line 141
    .line 142
    :cond_4
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 146
    .line 147
    move-object/from16 v8, p3

    .line 148
    .line 149
    check-cast v8, Lcom/moloco/sdk/acm/recorder/c;

    .line 150
    .line 151
    const-string v0, "sdk_init_request_time_ms"

    .line 152
    .line 153
    invoke-virtual {v8, v0}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    :try_start_3
    iget-object v0, v1, Lcom/moloco/sdk/internal/services/init/f;->a:Lcom/moloco/sdk/internal/services/v;

    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/services/v;->a()Lcom/moloco/sdk/internal/services/F;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object v7, v1, Lcom/moloco/sdk/internal/services/init/f;->b:Lcom/moloco/sdk/internal/services/x;

    .line 164
    .line 165
    invoke-virtual {v7}, Lcom/moloco/sdk/internal/services/x;->a()Lcom/moloco/sdk/internal/services/w;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    iget-object v9, v1, Lcom/moloco/sdk/internal/services/init/f;->c:Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 170
    .line 171
    iput-object v1, v5, Lcom/moloco/sdk/internal/services/init/d;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 172
    .line 173
    move-object/from16 v14, p1

    .line 174
    .line 175
    iput-object v14, v5, Lcom/moloco/sdk/internal/services/init/d;->b:Ljava/lang/Object;

    .line 176
    .line 177
    move-object/from16 v10, p2

    .line 178
    .line 179
    iput-object v10, v5, Lcom/moloco/sdk/internal/services/init/d;->c:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v8, v5, Lcom/moloco/sdk/internal/services/init/d;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 182
    .line 183
    iput-object v15, v5, Lcom/moloco/sdk/internal/services/init/d;->e:Lcom/moloco/sdk/acm/l;

    .line 184
    .line 185
    iput-object v0, v5, Lcom/moloco/sdk/internal/services/init/d;->f:Lcom/moloco/sdk/internal/services/F;

    .line 186
    .line 187
    iput-object v7, v5, Lcom/moloco/sdk/internal/services/init/d;->g:Lcom/moloco/sdk/internal/services/w;

    .line 188
    .line 189
    move-object/from16 p3, v0

    .line 190
    .line 191
    const/4 v0, 0x1

    .line 192
    iput v0, v5, Lcom/moloco/sdk/internal/services/init/d;->j:I

    .line 193
    .line 194
    invoke-virtual {v9, v5}, Lcom/moloco/sdk/internal/services/usertracker/c;->a(Llf/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    .line 198
    if-ne v0, v6, :cond_5

    .line 199
    .line 200
    goto/16 :goto_4

    .line 201
    .line 202
    :cond_5
    move-object v9, v10

    .line 203
    move-object v10, v8

    .line 204
    move-object v8, v7

    .line 205
    move-object v7, v1

    .line 206
    move-object v1, v15

    .line 207
    move-object/from16 v15, p3

    .line 208
    .line 209
    :goto_2
    :try_start_4
    check-cast v0, Ljava/lang/String;

    .line 210
    .line 211
    sget-object v18, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 212
    .line 213
    const-string v19, "InitApi"

    .line 214
    .line 215
    move-object/from16 v24, v2

    .line 216
    .line 217
    new-instance v2, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v4, ", mref: "

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v4, ", url: "

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    iget-object v4, v7, Lcom/moloco/sdk/internal/services/init/f;->e:Landroid/net/Uri;

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v20

    .line 247
    const/16 v23, 0x0

    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    const/16 v22, 0x4

    .line 252
    .line 253
    invoke-static/range {v18 .. v23}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iget-object v2, v7, Lcom/moloco/sdk/internal/services/init/f;->d:Lwd/c;

    .line 257
    .line 258
    iget-object v4, v7, Lcom/moloco/sdk/internal/services/init/f;->e:Landroid/net/Uri;

    .line 259
    .line 260
    invoke-virtual {v4}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    move-object/from16 v18, v3

    .line 265
    .line 266
    const-string v3, "app_key"

    .line 267
    .line 268
    invoke-virtual {v4, v3, v14}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    const-string v4, "rid"

    .line 273
    .line 274
    invoke-virtual {v3, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    const-string v3, "toString(...)"

    .line 287
    .line 288
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v3, LFd/c;

    .line 292
    .line 293
    invoke-direct {v3}, LFd/c;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-static {v3, v0}, LFd/e;->b(LFd/c;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    new-instance v0, LAd/b;

    .line 300
    .line 301
    invoke-direct {v0, v7, v15, v9, v8}, LAd/b;-><init>(Lcom/moloco/sdk/internal/services/init/f;Lcom/moloco/sdk/internal/services/F;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/internal/services/w;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v3, v0}, LFd/e;->a(LJd/r;Ltf/l;)V

    .line 305
    .line 306
    .line 307
    const-wide/16 v8, 0xbb8

    .line 308
    .line 309
    invoke-static {v3, v8, v9}, LA6/h;->d(LFd/c;J)V

    .line 310
    .line 311
    .line 312
    sget-object v0, LJd/s;->b:LJd/s;

    .line 313
    .line 314
    invoke-virtual {v3, v0}, LFd/c;->c(LJd/s;)V

    .line 315
    .line 316
    .line 317
    new-instance v0, LS3/s;

    .line 318
    .line 319
    invoke-direct {v0, v3, v2}, LS3/s;-><init>(LFd/c;Lwd/c;)V

    .line 320
    .line 321
    .line 322
    iput-object v7, v5, Lcom/moloco/sdk/internal/services/init/d;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 323
    .line 324
    iput-object v10, v5, Lcom/moloco/sdk/internal/services/init/d;->b:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v1, v5, Lcom/moloco/sdk/internal/services/init/d;->c:Ljava/lang/Object;

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    iput-object v2, v5, Lcom/moloco/sdk/internal/services/init/d;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 330
    .line 331
    iput-object v2, v5, Lcom/moloco/sdk/internal/services/init/d;->e:Lcom/moloco/sdk/acm/l;

    .line 332
    .line 333
    iput-object v2, v5, Lcom/moloco/sdk/internal/services/init/d;->f:Lcom/moloco/sdk/internal/services/F;

    .line 334
    .line 335
    iput-object v2, v5, Lcom/moloco/sdk/internal/services/init/d;->g:Lcom/moloco/sdk/internal/services/w;

    .line 336
    .line 337
    const/4 v2, 0x2

    .line 338
    iput v2, v5, Lcom/moloco/sdk/internal/services/init/d;->j:I

    .line 339
    .line 340
    invoke-virtual {v0, v5}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 344
    if-ne v0, v6, :cond_6

    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_6
    move-object v2, v1

    .line 348
    move-object v4, v7

    .line 349
    move-object v3, v10

    .line 350
    :goto_3
    :try_start_5
    check-cast v0, LGd/a;

    .line 351
    .line 352
    invoke-virtual {v0}, LGd/a;->e()LJd/v;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    sget-object v7, LJd/v;->c:LJd/v;

    .line 357
    .line 358
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    if-eqz v7, :cond_8

    .line 363
    .line 364
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 365
    .line 366
    const-string v1, "success"

    .line 367
    .line 368
    invoke-virtual {v2, v13, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    move-object v1, v3

    .line 372
    check-cast v1, Lcom/moloco/sdk/acm/recorder/c;

    .line 373
    .line 374
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 375
    .line 376
    .line 377
    :try_start_6
    sget-object v3, LEf/S;->a:LLf/e;

    .line 378
    .line 379
    sget-object v3, LLf/d;->b:LLf/d;

    .line 380
    .line 381
    new-instance v7, Lcom/moloco/sdk/internal/services/init/e;

    .line 382
    .line 383
    const/4 v8, 0x0

    .line 384
    invoke-direct {v7, v0, v8}, Lcom/moloco/sdk/internal/services/init/e;-><init>(LGd/a;Ljf/c;)V

    .line 385
    .line 386
    .line 387
    iput-object v4, v5, Lcom/moloco/sdk/internal/services/init/d;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 388
    .line 389
    iput-object v1, v5, Lcom/moloco/sdk/internal/services/init/d;->b:Ljava/lang/Object;

    .line 390
    .line 391
    iput-object v2, v5, Lcom/moloco/sdk/internal/services/init/d;->c:Ljava/lang/Object;

    .line 392
    .line 393
    const/4 v0, 0x3

    .line 394
    iput v0, v5, Lcom/moloco/sdk/internal/services/init/d;->j:I

    .line 395
    .line 396
    invoke-static {v3, v7, v5}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 400
    if-ne v0, v6, :cond_7

    .line 401
    .line 402
    :goto_4
    return-object v6

    .line 403
    :cond_7
    move-object v3, v1

    .line 404
    :goto_5
    :try_start_7
    new-instance v1, Lcom/moloco/sdk/internal/z;

    .line 405
    .line 406
    invoke-direct {v1, v0}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    return-object v1

    .line 410
    :catch_2
    move-exception v0

    .line 411
    :goto_6
    move-object v15, v2

    .line 412
    move-object v8, v3

    .line 413
    move-object v7, v4

    .line 414
    goto/16 :goto_1

    .line 415
    .line 416
    :catch_3
    move-exception v0

    .line 417
    move-object v3, v1

    .line 418
    goto :goto_6

    .line 419
    :cond_8
    sget-object v0, LJd/v;->l:LJd/v;

    .line 420
    .line 421
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_9

    .line 426
    .line 427
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 428
    .line 429
    invoke-virtual {v2, v13, v12}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    iget v0, v1, LJd/v;->a:I

    .line 433
    .line 434
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v2, v11, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    move-object v5, v3

    .line 442
    check-cast v5, Lcom/moloco/sdk/acm/recorder/c;

    .line 443
    .line 444
    invoke-virtual {v5, v2}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 445
    .line 446
    .line 447
    :try_start_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    move-object/from16 v3, v18

    .line 450
    .line 451
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    const-string v3, ": App not found or AppKey is not correct"

    .line 458
    .line 459
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v16

    .line 466
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 467
    .line 468
    const-string v15, "InitApi"

    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const/16 v18, 0x0

    .line 473
    .line 474
    const/16 v19, 0xc

    .line 475
    .line 476
    const/16 v20, 0x0

    .line 477
    .line 478
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 482
    .line 483
    new-instance v3, Lcom/moloco/sdk/internal/services/init/m;

    .line 484
    .line 485
    iget v1, v1, LJd/v;->a:I

    .line 486
    .line 487
    invoke-direct {v3, v1}, Lcom/moloco/sdk/internal/services/init/m;-><init>(I)V

    .line 488
    .line 489
    .line 490
    invoke-direct {v0, v3}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 491
    .line 492
    .line 493
    return-object v0

    .line 494
    :catch_4
    move-exception v0

    .line 495
    move-object v3, v5

    .line 496
    goto :goto_6

    .line 497
    :cond_9
    :try_start_9
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 498
    .line 499
    invoke-virtual {v2, v13, v12}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    iget v0, v1, LJd/v;->a:I

    .line 503
    .line 504
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v2, v11, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    move-object v5, v3

    .line 512
    check-cast v5, Lcom/moloco/sdk/acm/recorder/c;

    .line 513
    .line 514
    invoke-virtual {v5, v2}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 515
    .line 516
    .line 517
    :try_start_a
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 518
    .line 519
    const-string v15, "InitApi"

    .line 520
    .line 521
    new-instance v0, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    move-object/from16 v3, v24

    .line 524
    .line 525
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v16

    .line 535
    const/16 v17, 0x0

    .line 536
    .line 537
    const/16 v18, 0x0

    .line 538
    .line 539
    const/16 v19, 0xc

    .line 540
    .line 541
    const/16 v20, 0x0

    .line 542
    .line 543
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 547
    .line 548
    new-instance v3, Lcom/moloco/sdk/internal/services/init/m;

    .line 549
    .line 550
    iget v1, v1, LJd/v;->a:I

    .line 551
    .line 552
    invoke-direct {v3, v1}, Lcom/moloco/sdk/internal/services/init/m;-><init>(I)V

    .line 553
    .line 554
    .line 555
    invoke-direct {v0, v3}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    .line 556
    .line 557
    .line 558
    return-object v0

    .line 559
    :catch_5
    move-exception v0

    .line 560
    move-object v4, v0

    .line 561
    move-object v15, v1

    .line 562
    move-object v8, v10

    .line 563
    goto :goto_7

    .line 564
    :catch_6
    move-exception v0

    .line 565
    move-object/from16 v7, p0

    .line 566
    .line 567
    goto/16 :goto_1

    .line 568
    .line 569
    :goto_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    instance-of v0, v4, LCd/c0;

    .line 573
    .line 574
    if-eqz v0, :cond_a

    .line 575
    .line 576
    sget-object v0, Lcom/moloco/sdk/internal/services/init/b;->a:Lcom/moloco/sdk/internal/services/init/b;

    .line 577
    .line 578
    goto :goto_8

    .line 579
    :cond_a
    instance-of v0, v4, Ljavax/net/ssl/SSLHandshakeException;

    .line 580
    .line 581
    if-eqz v0, :cond_b

    .line 582
    .line 583
    sget-object v0, Lcom/moloco/sdk/internal/services/init/b;->d:Lcom/moloco/sdk/internal/services/init/b;

    .line 584
    .line 585
    goto :goto_8

    .line 586
    :cond_b
    instance-of v0, v4, Ljava/net/SocketException;

    .line 587
    .line 588
    if-eqz v0, :cond_c

    .line 589
    .line 590
    sget-object v0, Lcom/moloco/sdk/internal/services/init/b;->c:Lcom/moloco/sdk/internal/services/init/b;

    .line 591
    .line 592
    goto :goto_8

    .line 593
    :cond_c
    instance-of v0, v4, Ljava/net/UnknownHostException;

    .line 594
    .line 595
    if-eqz v0, :cond_d

    .line 596
    .line 597
    sget-object v0, Lcom/moloco/sdk/internal/services/init/b;->b:Lcom/moloco/sdk/internal/services/init/b;

    .line 598
    .line 599
    goto :goto_8

    .line 600
    :cond_d
    sget-object v0, Lcom/moloco/sdk/internal/services/init/b;->f:Lcom/moloco/sdk/internal/services/init/b;

    .line 601
    .line 602
    :goto_8
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 603
    .line 604
    const/16 v6, 0x8

    .line 605
    .line 606
    const/4 v7, 0x0

    .line 607
    const-string v2, "InitApi"

    .line 608
    .line 609
    const-string v3, "SDK Init failed with client exception"

    .line 610
    .line 611
    const/4 v5, 0x0

    .line 612
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 616
    .line 617
    invoke-virtual {v15, v13, v12}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-virtual {v15, v11, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    check-cast v8, Lcom/moloco/sdk/acm/recorder/c;

    .line 628
    .line 629
    invoke-virtual {v8, v15}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 630
    .line 631
    .line 632
    new-instance v1, Lcom/moloco/sdk/internal/y;

    .line 633
    .line 634
    new-instance v2, Lcom/moloco/sdk/internal/services/init/l;

    .line 635
    .line 636
    invoke-direct {v2, v0}, Lcom/moloco/sdk/internal/services/init/l;-><init>(Lcom/moloco/sdk/internal/services/init/b;)V

    .line 637
    .line 638
    .line 639
    invoke-direct {v1, v2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    return-object v1
.end method
