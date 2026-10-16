.class public final Lcom/moloco/sdk/internal/publisher/r;
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
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/r;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/r;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/r;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/r;->i:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/r;->j:Ljava/lang/String;

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
    new-instance v0, Lcom/moloco/sdk/internal/publisher/r;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/r;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/r;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/r;->h:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/r;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/r;->j:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/r;-><init>(Lcom/moloco/sdk/internal/publisher/s;Lcom/moloco/sdk/acm/recorder/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/r;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/r;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 5
    .line 6
    iget v3, v0, Lcom/moloco/sdk/internal/publisher/r;->e:I

    .line 7
    .line 8
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/r;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 9
    .line 10
    iget-object v9, v0, Lcom/moloco/sdk/internal/publisher/r;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 11
    .line 12
    const-string v5, " ad with adUnitId: "

    .line 13
    .line 14
    const-string v6, "initial_sdk_init_state"

    .line 15
    .line 16
    const-string v7, "ad_type"

    .line 17
    .line 18
    iget-object v8, v0, Lcom/moloco/sdk/internal/publisher/r;->h:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v10, v4, Lcom/moloco/sdk/internal/publisher/s;->b:Lcom/moloco/sdk/internal/services/k;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    if-ne v3, v1, :cond_0

    .line 25
    .line 26
    iget-wide v2, v0, Lcom/moloco/sdk/internal/publisher/r;->d:J

    .line 27
    .line 28
    iget-object v11, v0, Lcom/moloco/sdk/internal/publisher/r;->c:Lcom/moloco/sdk/acm/l;

    .line 29
    .line 30
    iget-object v12, v0, Lcom/moloco/sdk/internal/publisher/r;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v13, v0, Lcom/moloco/sdk/internal/publisher/r;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v13, Lcom/moloco/sdk/internal/publisher/c0;->f:Lcom/moloco/sdk/internal/publisher/c0;

    .line 52
    .line 53
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    invoke-static {v4}, Lcom/moloco/sdk/internal/publisher/s;->c(Lcom/moloco/sdk/internal/publisher/s;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    sget-object v14, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 65
    .line 66
    const-string v14, "create_ad_time_ms"

    .line 67
    .line 68
    invoke-virtual {v9, v14}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    sget-object v15, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 73
    .line 74
    const-string v15, "REWARDED"

    .line 75
    .line 76
    invoke-virtual {v14, v7, v15}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v14, v6, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 83
    .line 84
    new-instance v15, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v1, "Creating "

    .line 87
    .line 88
    invoke-direct {v15, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v18

    .line 104
    const/16 v19, 0x0

    .line 105
    .line 106
    const/16 v20, 0x0

    .line 107
    .line 108
    const-string v17, "AdCreator"

    .line 109
    .line 110
    const/16 v21, 0xc

    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, v4, Lcom/moloco/sdk/internal/publisher/s;->d:Ltf/l;

    .line 118
    .line 119
    iput-object v13, v0, Lcom/moloco/sdk/internal/publisher/r;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 120
    .line 121
    iput-object v3, v0, Lcom/moloco/sdk/internal/publisher/r;->b:Ljava/lang/String;

    .line 122
    .line 123
    iput-object v14, v0, Lcom/moloco/sdk/internal/publisher/r;->c:Lcom/moloco/sdk/acm/l;

    .line 124
    .line 125
    iput-wide v11, v0, Lcom/moloco/sdk/internal/publisher/r;->d:J

    .line 126
    .line 127
    const/4 v15, 0x1

    .line 128
    iput v15, v0, Lcom/moloco/sdk/internal/publisher/r;->e:I

    .line 129
    .line 130
    invoke-static {v4, v1, v13, v9, v0}, Lcom/moloco/sdk/internal/publisher/s;->b(Lcom/moloco/sdk/internal/publisher/s;Ltf/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-ne v1, v2, :cond_2

    .line 135
    .line 136
    return-object v2

    .line 137
    :cond_2
    move-wide/from16 v25, v11

    .line 138
    .line 139
    move-object v12, v3

    .line 140
    move-wide/from16 v2, v25

    .line 141
    .line 142
    move-object v11, v14

    .line 143
    :goto_0
    check-cast v1, Lcom/moloco/sdk/internal/e;

    .line 144
    .line 145
    if-eqz v1, :cond_3

    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    invoke-static {v4}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    move-object v14, v7

    .line 153
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->a()Lcom/moloco/sdk/internal/services/u;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    move-object v15, v11

    .line 158
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    move-object/from16 v16, v10

    .line 163
    .line 164
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    move-object/from16 v17, v15

    .line 169
    .line 170
    new-instance v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 171
    .line 172
    move-object/from16 p1, v4

    .line 173
    .line 174
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/r;->i:Ljava/lang/String;

    .line 175
    .line 176
    invoke-direct {v15, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    new-instance v4, LW1/r;

    .line 180
    .line 181
    move-object/from16 v18, v14

    .line 182
    .line 183
    sget-object v14, Lcom/moloco/sdk/publisher/AdFormatType;->REWARDED:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 184
    .line 185
    move-object/from16 v19, v5

    .line 186
    .line 187
    iget-object v5, v0, Lcom/moloco/sdk/internal/publisher/r;->j:Ljava/lang/String;

    .line 188
    .line 189
    move-object/from16 v20, v6

    .line 190
    .line 191
    invoke-static {v5}, Lr7/e;->j(Ljava/lang/String;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v5

    .line 195
    invoke-direct {v4, v14, v5, v6}, LW1/r;-><init>(Lcom/moloco/sdk/publisher/AdFormatType;J)V

    .line 196
    .line 197
    .line 198
    sget-object v5, Lcom/moloco/sdk/service_locator/c;->a:Lef/p;

    .line 199
    .line 200
    invoke-virtual {v5}, Lef/p;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    check-cast v5, Lcom/moloco/sdk/internal/services/config/a;

    .line 205
    .line 206
    const-string v6, "appLifecycleTrackerService"

    .line 207
    .line 208
    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const-string v6, "adUnitId"

    .line 212
    .line 213
    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string v6, "persistentHttpRequest"

    .line 217
    .line 218
    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const-string v6, "configService"

    .line 222
    .line 223
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    move-object v6, v13

    .line 227
    new-instance v13, LC8/i;

    .line 228
    .line 229
    move-object/from16 v21, v4

    .line 230
    .line 231
    const/16 v4, 0x8

    .line 232
    .line 233
    invoke-direct {v13, v4}, LC8/i;-><init>(I)V

    .line 234
    .line 235
    .line 236
    iget-object v1, v1, Lcom/moloco/sdk/internal/e;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 237
    .line 238
    new-instance v4, Lcom/moloco/sdk/internal/publisher/g;

    .line 239
    .line 240
    move-object/from16 v22, v5

    .line 241
    .line 242
    new-instance v5, Lcom/moloco/sdk/internal/publisher/l0;

    .line 243
    .line 244
    move-object/from16 v23, v12

    .line 245
    .line 246
    new-instance v12, Lcom/moloco/sdk/internal/publisher/d;

    .line 247
    .line 248
    move-object/from16 v24, v1

    .line 249
    .line 250
    const/4 v1, 0x1

    .line 251
    invoke-direct {v12, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 252
    .line 253
    .line 254
    move-object v0, v6

    .line 255
    move-object/from16 v6, p1

    .line 256
    .line 257
    move-object/from16 p1, v0

    .line 258
    .line 259
    move-object/from16 v1, v18

    .line 260
    .line 261
    move-object/from16 v0, v20

    .line 262
    .line 263
    move-object/from16 v18, v16

    .line 264
    .line 265
    move-object/from16 v16, v21

    .line 266
    .line 267
    move-wide/from16 v20, v2

    .line 268
    .line 269
    move-object/from16 v3, v22

    .line 270
    .line 271
    move-object/from16 v2, v23

    .line 272
    .line 273
    move-object/from16 v22, v17

    .line 274
    .line 275
    move-object/from16 v17, v9

    .line 276
    .line 277
    move-object v9, v8

    .line 278
    move-object/from16 v8, v24

    .line 279
    .line 280
    invoke-direct/range {v5 .. v17}, Lcom/moloco/sdk/internal/publisher/l0;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Ltf/l;LC8/i;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LW1/r;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 281
    .line 282
    .line 283
    move-object v6, v5

    .line 284
    move-object v5, v9

    .line 285
    move-object/from16 v9, v17

    .line 286
    .line 287
    invoke-direct {v4, v6, v5, v3, v9}, Lcom/moloco/sdk/internal/publisher/g;-><init>(Lcom/moloco/sdk/internal/publisher/l0;Ljava/lang/String;Lcom/moloco/sdk/internal/services/config/a;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 288
    .line 289
    .line 290
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 291
    .line 292
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 293
    .line 294
    const-string v6, "create_ad"

    .line 295
    .line 296
    invoke-direct {v3, v6}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 300
    .line 301
    const-string v6, "result"

    .line 302
    .line 303
    const-string v7, "success"

    .line 304
    .line 305
    invoke-virtual {v3, v6, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-virtual {v3, v1, v8}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v0, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 319
    .line 320
    .line 321
    move-object/from16 v15, v22

    .line 322
    .line 323
    invoke-virtual {v15, v6, v7}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v9, v15}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 333
    .line 334
    .line 335
    move-result-wide v0

    .line 336
    move-wide/from16 v2, v20

    .line 337
    .line 338
    invoke-virtual {v4, v2, v3, v0, v1}, Lcom/moloco/sdk/internal/publisher/g;->a(JJ)V

    .line 339
    .line 340
    .line 341
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 342
    .line 343
    new-instance v0, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    const-string v1, "Created "

    .line 346
    .line 347
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    move-object/from16 v8, p1

    .line 351
    .line 352
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    move-object/from16 v1, v19

    .line 356
    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    const/4 v9, 0x0

    .line 368
    const/4 v10, 0x0

    .line 369
    const-string v7, "AdCreator"

    .line 370
    .line 371
    const/16 v11, 0xc

    .line 372
    .line 373
    const/4 v12, 0x0

    .line 374
    invoke-static/range {v6 .. v12}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 378
    .line 379
    invoke-direct {v0, v4}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    return-object v0

    .line 383
    :cond_3
    move-object v15, v11

    .line 384
    move-object v2, v12

    .line 385
    move-object v8, v13

    .line 386
    iget-object v5, v0, Lcom/moloco/sdk/internal/publisher/r;->h:Ljava/lang/String;

    .line 387
    .line 388
    move-object v6, v2

    .line 389
    move-object v7, v15

    .line 390
    invoke-static/range {v4 .. v9}, Lcom/moloco/sdk/internal/publisher/s;->a(Lcom/moloco/sdk/internal/publisher/s;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;)Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 395
    .line 396
    new-instance v2, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    const-string v3, "Failed to create "

    .line 399
    .line 400
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    const-string v3, " with reason: "

    .line 407
    .line 408
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    const/4 v12, 0x0

    .line 419
    const/4 v13, 0x0

    .line 420
    const-string v10, "AdCreator"

    .line 421
    .line 422
    const/16 v14, 0xc

    .line 423
    .line 424
    const/4 v15, 0x0

    .line 425
    invoke-static/range {v9 .. v15}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 429
    .line 430
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    return-object v2
.end method
