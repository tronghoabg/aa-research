.class public final Lcom/moloco/sdk/internal/publisher/o;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lcom/moloco/sdk/internal/publisher/c0;

.field public b:Ljava/lang/String;

.field public c:Lcom/moloco/sdk/acm/l;

.field public d:J

.field public e:I

.field public final synthetic f:Lcom/moloco/sdk/internal/publisher/s;

.field public final synthetic g:Lcom/moloco/sdk/acm/recorder/c;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/s;Lcom/moloco/sdk/acm/recorder/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/o;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/o;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/o;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/o;->i:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/o;->j:Ljava/lang/String;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/o;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/o;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/o;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/o;->h:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/o;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/o;->j:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/o;-><init>(Lcom/moloco/sdk/internal/publisher/s;Lcom/moloco/sdk/acm/recorder/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/o;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/o;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/o;->e:I

    .line 6
    .line 7
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/o;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 8
    .line 9
    iget-object v8, v0, Lcom/moloco/sdk/internal/publisher/o;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 10
    .line 11
    const-string v4, " ad with adUnitId: "

    .line 12
    .line 13
    const-string v5, "initial_sdk_init_state"

    .line 14
    .line 15
    const-string v6, "ad_type"

    .line 16
    .line 17
    iget-object v7, v0, Lcom/moloco/sdk/internal/publisher/o;->h:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    iget-object v10, v3, Lcom/moloco/sdk/internal/publisher/s;->b:Lcom/moloco/sdk/internal/services/k;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    if-ne v2, v9, :cond_0

    .line 25
    .line 26
    iget-wide v1, v0, Lcom/moloco/sdk/internal/publisher/o;->d:J

    .line 27
    .line 28
    iget-object v9, v0, Lcom/moloco/sdk/internal/publisher/o;->c:Lcom/moloco/sdk/acm/l;

    .line 29
    .line 30
    iget-object v11, v0, Lcom/moloco/sdk/internal/publisher/o;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v12, v0, Lcom/moloco/sdk/internal/publisher/o;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v17, v11

    .line 38
    .line 39
    move-object v11, v9

    .line 40
    move-object/from16 v9, p1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v12, Lcom/moloco/sdk/internal/publisher/c0;->e:Lcom/moloco/sdk/internal/publisher/c0;

    .line 55
    .line 56
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v13

    .line 63
    invoke-static {v3}, Lcom/moloco/sdk/internal/publisher/s;->c(Lcom/moloco/sdk/internal/publisher/s;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 68
    .line 69
    const-string v2, "create_ad_time_ms"

    .line 70
    .line 71
    invoke-virtual {v8, v2}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    sget-object v15, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 76
    .line 77
    const-string v15, "INTERSTITIAL"

    .line 78
    .line 79
    invoke-virtual {v2, v6, v15}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v5, v11}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 86
    .line 87
    new-instance v15, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v9, "Creating "

    .line 90
    .line 91
    invoke-direct {v15, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v18

    .line 107
    const/16 v19, 0x0

    .line 108
    .line 109
    const/16 v20, 0x0

    .line 110
    .line 111
    const-string v17, "AdCreator"

    .line 112
    .line 113
    const/16 v21, 0xc

    .line 114
    .line 115
    const/16 v22, 0x0

    .line 116
    .line 117
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object v9, v3, Lcom/moloco/sdk/internal/publisher/s;->d:Ltf/l;

    .line 121
    .line 122
    iput-object v12, v0, Lcom/moloco/sdk/internal/publisher/o;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 123
    .line 124
    iput-object v11, v0, Lcom/moloco/sdk/internal/publisher/o;->b:Ljava/lang/String;

    .line 125
    .line 126
    iput-object v2, v0, Lcom/moloco/sdk/internal/publisher/o;->c:Lcom/moloco/sdk/acm/l;

    .line 127
    .line 128
    iput-wide v13, v0, Lcom/moloco/sdk/internal/publisher/o;->d:J

    .line 129
    .line 130
    const/4 v15, 0x1

    .line 131
    iput v15, v0, Lcom/moloco/sdk/internal/publisher/o;->e:I

    .line 132
    .line 133
    invoke-static {v3, v9, v12, v8, v0}, Lcom/moloco/sdk/internal/publisher/s;->b(Lcom/moloco/sdk/internal/publisher/s;Ltf/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    if-ne v9, v1, :cond_2

    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_2
    move-object/from16 v17, v11

    .line 141
    .line 142
    move-object v11, v2

    .line 143
    move-wide v1, v13

    .line 144
    :goto_0
    check-cast v9, Lcom/moloco/sdk/internal/e;

    .line 145
    .line 146
    if-eqz v9, :cond_3

    .line 147
    .line 148
    const/4 v3, 0x0

    .line 149
    invoke-static {v3}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    move-object v13, v6

    .line 154
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->a()Lcom/moloco/sdk/internal/services/u;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    move-object v14, v10

    .line 159
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    move-object/from16 v16, v14

    .line 168
    .line 169
    new-instance v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 170
    .line 171
    move-object/from16 p1, v3

    .line 172
    .line 173
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/o;->i:Ljava/lang/String;

    .line 174
    .line 175
    invoke-direct {v14, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    new-instance v3, LW1/r;

    .line 179
    .line 180
    move-object/from16 v18, v13

    .line 181
    .line 182
    sget-object v13, Lcom/moloco/sdk/publisher/AdFormatType;->INTERSTITIAL:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 183
    .line 184
    move-object/from16 v19, v4

    .line 185
    .line 186
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/o;->j:Ljava/lang/String;

    .line 187
    .line 188
    move-object/from16 v20, v5

    .line 189
    .line 190
    invoke-static {v4}, Lr7/e;->j(Ljava/lang/String;)J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    invoke-direct {v3, v13, v4, v5}, LW1/r;-><init>(Lcom/moloco/sdk/publisher/AdFormatType;J)V

    .line 195
    .line 196
    .line 197
    const-string v4, "appLifecycleTrackerService"

    .line 198
    .line 199
    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const-string v4, "adUnitId"

    .line 203
    .line 204
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v4, "persistentHttpRequest"

    .line 208
    .line 209
    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    move-object v4, v12

    .line 213
    new-instance v12, LC8/i;

    .line 214
    .line 215
    const/16 v5, 0x8

    .line 216
    .line 217
    invoke-direct {v12, v5}, LC8/i;-><init>(I)V

    .line 218
    .line 219
    .line 220
    iget-object v5, v9, Lcom/moloco/sdk/internal/e;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 221
    .line 222
    new-instance v9, Lcom/moloco/sdk/internal/publisher/c;

    .line 223
    .line 224
    move-object/from16 v21, v4

    .line 225
    .line 226
    new-instance v4, Lcom/moloco/sdk/internal/publisher/l0;

    .line 227
    .line 228
    move-object/from16 v22, v11

    .line 229
    .line 230
    new-instance v11, Lcom/moloco/sdk/internal/publisher/d;

    .line 231
    .line 232
    move-object/from16 v23, v3

    .line 233
    .line 234
    const/4 v3, 0x0

    .line 235
    invoke-direct {v11, v3}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v3, v18

    .line 239
    .line 240
    move-object/from16 v0, v20

    .line 241
    .line 242
    move-object/from16 v18, v16

    .line 243
    .line 244
    move-object/from16 v16, v8

    .line 245
    .line 246
    move-object v8, v7

    .line 247
    move-object v7, v5

    .line 248
    move-object/from16 v5, p1

    .line 249
    .line 250
    move-wide/from16 v24, v1

    .line 251
    .line 252
    move-object v2, v9

    .line 253
    move-object v9, v15

    .line 254
    move-object/from16 v1, v22

    .line 255
    .line 256
    move-object/from16 v15, v23

    .line 257
    .line 258
    move-wide/from16 v22, v24

    .line 259
    .line 260
    invoke-direct/range {v4 .. v16}, Lcom/moloco/sdk/internal/publisher/l0;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Ltf/l;LC8/i;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LW1/r;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 261
    .line 262
    .line 263
    move-object v5, v4

    .line 264
    move-object v4, v8

    .line 265
    move-object/from16 v8, v16

    .line 266
    .line 267
    invoke-direct {v2, v5}, Lcom/moloco/sdk/internal/publisher/c;-><init>(Lcom/moloco/sdk/internal/publisher/l0;)V

    .line 268
    .line 269
    .line 270
    new-instance v5, Lcom/moloco/sdk/acm/h;

    .line 271
    .line 272
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 273
    .line 274
    const-string v6, "create_ad"

    .line 275
    .line 276
    invoke-direct {v5, v6}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 280
    .line 281
    const-string v6, "result"

    .line 282
    .line 283
    const-string v7, "success"

    .line 284
    .line 285
    invoke-virtual {v5, v6, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    invoke-virtual {v5, v3, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-virtual {v5, v0, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8, v5}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1, v6, v7}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v8, v1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 315
    .line 316
    .line 317
    move-result-wide v0

    .line 318
    move-wide/from16 v13, v22

    .line 319
    .line 320
    invoke-virtual {v2, v13, v14, v0, v1}, Lcom/moloco/sdk/internal/publisher/c;->a(JJ)V

    .line 321
    .line 322
    .line 323
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 324
    .line 325
    new-instance v0, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v1, "Created "

    .line 328
    .line 329
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    move-object/from16 v7, v21

    .line 333
    .line 334
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    move-object/from16 v1, v19

    .line 338
    .line 339
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    const/4 v8, 0x0

    .line 350
    const/4 v9, 0x0

    .line 351
    const-string v6, "AdCreator"

    .line 352
    .line 353
    const/16 v10, 0xc

    .line 354
    .line 355
    const/4 v11, 0x0

    .line 356
    invoke-static/range {v5 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 360
    .line 361
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :cond_3
    move-object v1, v11

    .line 366
    move-object v7, v12

    .line 367
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/o;->h:Ljava/lang/String;

    .line 368
    .line 369
    move-object v6, v1

    .line 370
    move-object/from16 v5, v17

    .line 371
    .line 372
    invoke-static/range {v3 .. v8}, Lcom/moloco/sdk/internal/publisher/s;->a(Lcom/moloco/sdk/internal/publisher/s;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;)Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 377
    .line 378
    new-instance v2, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    const-string v3, "Failed to create "

    .line 381
    .line 382
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string v3, " with reason: "

    .line 389
    .line 390
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v10

    .line 400
    const/4 v11, 0x0

    .line 401
    const/4 v12, 0x0

    .line 402
    const-string v9, "AdCreator"

    .line 403
    .line 404
    const/16 v13, 0xc

    .line 405
    .line 406
    const/4 v14, 0x0

    .line 407
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 411
    .line 412
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v2
.end method
