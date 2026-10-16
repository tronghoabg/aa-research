.class public final Lcom/moloco/sdk/internal/publisher/m;
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
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/m;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/m;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/m;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/m;->i:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/m;->j:Ljava/lang/String;

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
    new-instance v0, Lcom/moloco/sdk/internal/publisher/m;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/m;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/m;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/m;->h:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/m;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/m;->j:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/m;-><init>(Lcom/moloco/sdk/internal/publisher/s;Lcom/moloco/sdk/acm/recorder/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/m;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/m;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/m;->e:I

    .line 6
    .line 7
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/m;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 8
    .line 9
    iget-object v15, v0, Lcom/moloco/sdk/internal/publisher/m;->g:Lcom/moloco/sdk/acm/recorder/c;

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
    iget-object v7, v0, Lcom/moloco/sdk/internal/publisher/m;->h:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    iget-object v9, v3, Lcom/moloco/sdk/internal/publisher/s;->b:Lcom/moloco/sdk/internal/services/k;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    if-ne v2, v8, :cond_0

    .line 25
    .line 26
    iget-wide v1, v0, Lcom/moloco/sdk/internal/publisher/m;->d:J

    .line 27
    .line 28
    iget-object v8, v0, Lcom/moloco/sdk/internal/publisher/m;->c:Lcom/moloco/sdk/acm/l;

    .line 29
    .line 30
    iget-object v10, v0, Lcom/moloco/sdk/internal/publisher/m;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v11, v0, Lcom/moloco/sdk/internal/publisher/m;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v12, v11

    .line 38
    move-object v11, v10

    .line 39
    move-object v10, v8

    .line 40
    move-object/from16 v8, p1

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
    sget-object v11, Lcom/moloco/sdk/internal/publisher/c0;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 55
    .line 56
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v12

    .line 63
    invoke-static {v3}, Lcom/moloco/sdk/internal/publisher/s;->c(Lcom/moloco/sdk/internal/publisher/s;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 68
    .line 69
    const-string v2, "create_ad_time_ms"

    .line 70
    .line 71
    invoke-virtual {v15, v2}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    sget-object v14, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 76
    .line 77
    const-string v14, "BANNER"

    .line 78
    .line 79
    invoke-virtual {v2, v6, v14}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v5, v10}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 86
    .line 87
    new-instance v14, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v8, "Creating "

    .line 90
    .line 91
    invoke-direct {v14, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
    iget-object v8, v3, Lcom/moloco/sdk/internal/publisher/s;->d:Ltf/l;

    .line 121
    .line 122
    iput-object v11, v0, Lcom/moloco/sdk/internal/publisher/m;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 123
    .line 124
    iput-object v10, v0, Lcom/moloco/sdk/internal/publisher/m;->b:Ljava/lang/String;

    .line 125
    .line 126
    iput-object v2, v0, Lcom/moloco/sdk/internal/publisher/m;->c:Lcom/moloco/sdk/acm/l;

    .line 127
    .line 128
    iput-wide v12, v0, Lcom/moloco/sdk/internal/publisher/m;->d:J

    .line 129
    .line 130
    const/4 v14, 0x1

    .line 131
    iput v14, v0, Lcom/moloco/sdk/internal/publisher/m;->e:I

    .line 132
    .line 133
    invoke-static {v3, v8, v11, v15, v0}, Lcom/moloco/sdk/internal/publisher/s;->b(Lcom/moloco/sdk/internal/publisher/s;Ltf/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    if-ne v8, v1, :cond_2

    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_2
    move-object/from16 v27, v10

    .line 141
    .line 142
    move-object v10, v2

    .line 143
    move-wide v1, v12

    .line 144
    move-object v12, v11

    .line 145
    move-object/from16 v11, v27

    .line 146
    .line 147
    :goto_0
    check-cast v8, Lcom/moloco/sdk/internal/e;

    .line 148
    .line 149
    if-eqz v8, :cond_3

    .line 150
    .line 151
    const/4 v3, 0x0

    .line 152
    invoke-static {v3}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    move-object v13, v5

    .line 157
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->a()Lcom/moloco/sdk/internal/services/u;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    new-instance v16, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K0;

    .line 162
    .line 163
    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    move-object v14, v9

    .line 167
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    move-object/from16 v17, v10

    .line 172
    .line 173
    new-instance v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 174
    .line 175
    move-object/from16 p1, v3

    .line 176
    .line 177
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/m;->i:Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {v10, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    move-object v3, v11

    .line 183
    new-instance v11, LW1/r;

    .line 184
    .line 185
    move-object/from16 v18, v3

    .line 186
    .line 187
    sget-object v3, Lcom/moloco/sdk/publisher/AdFormatType;->BANNER:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 188
    .line 189
    move-object/from16 v19, v4

    .line 190
    .line 191
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/m;->j:Ljava/lang/String;

    .line 192
    .line 193
    move-object/from16 v20, v9

    .line 194
    .line 195
    move-object/from16 v21, v10

    .line 196
    .line 197
    invoke-static {v4}, Lr7/e;->a(Ljava/lang/String;)J

    .line 198
    .line 199
    .line 200
    move-result-wide v9

    .line 201
    invoke-direct {v11, v3, v9, v10}, LW1/r;-><init>(Lcom/moloco/sdk/publisher/AdFormatType;J)V

    .line 202
    .line 203
    .line 204
    sget-object v4, Lcom/moloco/sdk/service_locator/i;->d:Lef/p;

    .line 205
    .line 206
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Lcom/moloco/sdk/internal/b;

    .line 211
    .line 212
    move-object v9, v13

    .line 213
    sget-object v13, Lcom/moloco/sdk/internal/l;->d:Lcom/moloco/sdk/internal/l;

    .line 214
    .line 215
    const-string v10, "appLifecycleTrackerService"

    .line 216
    .line 217
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const-string v10, "adUnitId"

    .line 221
    .line 222
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const-string v10, "viewLifecycleOwnerSingleton"

    .line 226
    .line 227
    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v10, v8, Lcom/moloco/sdk/internal/e;->d:Lef/p;

    .line 231
    .line 232
    invoke-virtual {v10}, Lef/p;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    check-cast v10, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    move-object/from16 v22, v14

    .line 243
    .line 244
    iget-object v14, v8, Lcom/moloco/sdk/internal/e;->c:Lcom/moloco/sdk/internal/services/B;

    .line 245
    .line 246
    iget-object v8, v8, Lcom/moloco/sdk/internal/e;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 247
    .line 248
    move-object v0, v4

    .line 249
    move-object/from16 v4, p1

    .line 250
    .line 251
    move-object/from16 p1, v12

    .line 252
    .line 253
    move-object v12, v0

    .line 254
    move-object v0, v9

    .line 255
    move-object/from16 v9, v20

    .line 256
    .line 257
    move-object/from16 v27, v17

    .line 258
    .line 259
    move-object/from16 v17, v3

    .line 260
    .line 261
    move-object v3, v6

    .line 262
    move-object v6, v8

    .line 263
    move v8, v10

    .line 264
    move-object/from16 v10, v21

    .line 265
    .line 266
    move-wide/from16 v20, v1

    .line 267
    .line 268
    move-object/from16 v2, v27

    .line 269
    .line 270
    move-object/from16 v1, v18

    .line 271
    .line 272
    invoke-static/range {v4 .. v17}, Lcom/moloco/sdk/internal/publisher/H;->J(Landroid/content/Context;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ljava/lang/String;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LW1/r;Lcom/moloco/sdk/internal/b;Lcom/moloco/sdk/internal/m;Lcom/moloco/sdk/internal/services/B;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K0;Lcom/moloco/sdk/publisher/AdFormatType;)Lcom/moloco/sdk/internal/publisher/V;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    new-instance v5, Lcom/moloco/sdk/acm/h;

    .line 277
    .line 278
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 279
    .line 280
    const-string v6, "create_ad"

    .line 281
    .line 282
    invoke-direct {v5, v6}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 286
    .line 287
    const-string v6, "result"

    .line 288
    .line 289
    const-string v8, "success"

    .line 290
    .line 291
    invoke-virtual {v5, v6, v8}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-virtual {v5, v3, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5, v0, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v15, v5}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v6, v8}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v15, v2}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 317
    .line 318
    .line 319
    move-result-wide v0

    .line 320
    move-wide/from16 v12, v20

    .line 321
    .line 322
    invoke-interface {v4, v12, v13, v0, v1}, Lcom/moloco/sdk/internal/publisher/b0;->a(JJ)V

    .line 323
    .line 324
    .line 325
    sget-object v20, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 326
    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v1, "Created "

    .line 330
    .line 331
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    move-object/from16 v11, p1

    .line 335
    .line 336
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    move-object/from16 v1, v19

    .line 340
    .line 341
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v22

    .line 351
    const/16 v23, 0x0

    .line 352
    .line 353
    const/16 v24, 0x0

    .line 354
    .line 355
    const-string v21, "AdCreator"

    .line 356
    .line 357
    const/16 v25, 0xc

    .line 358
    .line 359
    const/16 v26, 0x0

    .line 360
    .line 361
    invoke-static/range {v20 .. v26}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 365
    .line 366
    invoke-direct {v0, v4}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :cond_3
    move-object v2, v10

    .line 371
    move-object v1, v11

    .line 372
    move-object v11, v12

    .line 373
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/m;->h:Ljava/lang/String;

    .line 374
    .line 375
    move-object v5, v1

    .line 376
    move-object v6, v2

    .line 377
    move-object v7, v11

    .line 378
    move-object v8, v15

    .line 379
    invoke-static/range {v3 .. v8}, Lcom/moloco/sdk/internal/publisher/s;->a(Lcom/moloco/sdk/internal/publisher/s;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;)Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 384
    .line 385
    new-instance v2, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v3, "Failed to create "

    .line 388
    .line 389
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    const-string v3, " with reason: "

    .line 396
    .line 397
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    const/4 v11, 0x0

    .line 408
    const/4 v12, 0x0

    .line 409
    const-string v9, "AdCreator"

    .line 410
    .line 411
    const/16 v13, 0xc

    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 418
    .line 419
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    return-object v2
.end method
