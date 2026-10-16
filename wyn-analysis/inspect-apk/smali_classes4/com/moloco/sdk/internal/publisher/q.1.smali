.class public final Lcom/moloco/sdk/internal/publisher/q;
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
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/q;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/q;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/q;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/q;->i:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/q;->j:Ljava/lang/String;

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
    new-instance v0, Lcom/moloco/sdk/internal/publisher/q;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/q;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/q;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/q;->h:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/q;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/q;->j:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/q;-><init>(Lcom/moloco/sdk/internal/publisher/s;Lcom/moloco/sdk/acm/recorder/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/q;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/q;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v3, v0, Lcom/moloco/sdk/internal/publisher/q;->e:I

    .line 6
    .line 7
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/q;->f:Lcom/moloco/sdk/internal/publisher/s;

    .line 8
    .line 9
    iget-object v11, v0, Lcom/moloco/sdk/internal/publisher/q;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 10
    .line 11
    const-string v15, " ad with adUnitId: "

    .line 12
    .line 13
    const-string v13, "initial_sdk_init_state"

    .line 14
    .line 15
    const-string v14, "ad_type"

    .line 16
    .line 17
    iget-object v6, v0, Lcom/moloco/sdk/internal/publisher/q;->h:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    iget-object v7, v4, Lcom/moloco/sdk/internal/publisher/s;->b:Lcom/moloco/sdk/internal/services/k;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    if-ne v3, v5, :cond_0

    .line 25
    .line 26
    iget-wide v2, v0, Lcom/moloco/sdk/internal/publisher/q;->d:J

    .line 27
    .line 28
    iget-object v5, v0, Lcom/moloco/sdk/internal/publisher/q;->c:Lcom/moloco/sdk/acm/l;

    .line 29
    .line 30
    iget-object v8, v0, Lcom/moloco/sdk/internal/publisher/q;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v9, v0, Lcom/moloco/sdk/internal/publisher/q;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v1, v5

    .line 38
    move-object/from16 v16, v8

    .line 39
    .line 40
    move-object/from16 v5, p1

    .line 41
    .line 42
    :goto_0
    move-object v8, v9

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v1

    .line 52
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v9, Lcom/moloco/sdk/internal/publisher/c0;->d:Lcom/moloco/sdk/internal/publisher/c0;

    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-object v3, v2

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-static {v4}, Lcom/moloco/sdk/internal/publisher/s;->c(Lcom/moloco/sdk/internal/publisher/s;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    sget-object v12, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 70
    .line 71
    const-string v12, "create_ad_time_ms"

    .line 72
    .line 73
    invoke-virtual {v11, v12}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    sget-object v16, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 78
    .line 79
    const-string v8, "NATIVE_AD_MEDIATION"

    .line 80
    .line 81
    invoke-virtual {v12, v14, v8}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v13, v10}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 88
    .line 89
    new-instance v8, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v5, "Creating "

    .line 92
    .line 93
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v18

    .line 109
    const/16 v19, 0x0

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    const-string v17, "AdCreator"

    .line 114
    .line 115
    const/16 v21, 0xc

    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v5, v4, Lcom/moloco/sdk/internal/publisher/s;->d:Ltf/l;

    .line 123
    .line 124
    iput-object v9, v0, Lcom/moloco/sdk/internal/publisher/q;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 125
    .line 126
    iput-object v10, v0, Lcom/moloco/sdk/internal/publisher/q;->b:Ljava/lang/String;

    .line 127
    .line 128
    iput-object v12, v0, Lcom/moloco/sdk/internal/publisher/q;->c:Lcom/moloco/sdk/acm/l;

    .line 129
    .line 130
    iput-wide v1, v0, Lcom/moloco/sdk/internal/publisher/q;->d:J

    .line 131
    .line 132
    const/4 v8, 0x1

    .line 133
    iput v8, v0, Lcom/moloco/sdk/internal/publisher/q;->e:I

    .line 134
    .line 135
    invoke-static {v4, v5, v9, v11, v0}, Lcom/moloco/sdk/internal/publisher/s;->b(Lcom/moloco/sdk/internal/publisher/s;Ltf/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    if-ne v5, v3, :cond_2

    .line 140
    .line 141
    return-object v3

    .line 142
    :cond_2
    move-wide v2, v1

    .line 143
    move-object/from16 v16, v10

    .line 144
    .line 145
    move-object v1, v12

    .line 146
    goto :goto_0

    .line 147
    :goto_1
    check-cast v5, Lcom/moloco/sdk/internal/e;

    .line 148
    .line 149
    if-eqz v5, :cond_5

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    invoke-static {v4}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->a()Lcom/moloco/sdk/internal/services/u;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    sget-object v10, Lcom/moloco/sdk/service_locator/e;->c:Lef/p;

    .line 161
    .line 162
    invoke-virtual {v10}, Lef/p;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    check-cast v10, Lcom/moloco/sdk/internal/services/y;

    .line 167
    .line 168
    new-instance v17, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 169
    .line 170
    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    move-object/from16 v18, v4

    .line 178
    .line 179
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    sget-object v19, Lcom/moloco/sdk/service_locator/i;->d:Lef/p;

    .line 184
    .line 185
    invoke-virtual/range {v19 .. v19}, Lef/p;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v19

    .line 189
    move-object/from16 v20, v13

    .line 190
    .line 191
    move-object/from16 v13, v19

    .line 192
    .line 193
    check-cast v13, Lcom/moloco/sdk/internal/b;

    .line 194
    .line 195
    move-object/from16 v19, v14

    .line 196
    .line 197
    new-instance v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 198
    .line 199
    move-object/from16 v21, v5

    .line 200
    .line 201
    iget-object v5, v0, Lcom/moloco/sdk/internal/publisher/q;->i:Ljava/lang/String;

    .line 202
    .line 203
    invoke-direct {v14, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    new-instance v5, LW1/r;

    .line 207
    .line 208
    move-object/from16 v22, v7

    .line 209
    .line 210
    sget-object v7, Lcom/moloco/sdk/publisher/AdFormatType;->NATIVE:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 211
    .line 212
    move-object/from16 v23, v8

    .line 213
    .line 214
    iget-object v8, v0, Lcom/moloco/sdk/internal/publisher/q;->j:Ljava/lang/String;

    .line 215
    .line 216
    move-object/from16 v24, v11

    .line 217
    .line 218
    const-string v11, "MAX"

    .line 219
    .line 220
    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    if-eqz v11, :cond_3

    .line 225
    .line 226
    sget-object v8, LCf/c;->d:LCf/c;

    .line 227
    .line 228
    const/16 v11, 0x8

    .line 229
    .line 230
    invoke-static {v11, v8}, LFe/b;->S(ILCf/c;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v25

    .line 234
    :goto_2
    move-object v8, v12

    .line 235
    move-wide/from16 v11, v25

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_3
    const-string v11, "AdMob"

    .line 239
    .line 240
    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    if-eqz v8, :cond_4

    .line 245
    .line 246
    sget-object v8, LCf/c;->d:LCf/c;

    .line 247
    .line 248
    const/16 v11, 0x3a

    .line 249
    .line 250
    invoke-static {v11, v8}, LFe/b;->S(ILCf/c;)J

    .line 251
    .line 252
    .line 253
    move-result-wide v25

    .line 254
    goto :goto_2

    .line 255
    :cond_4
    sget-object v8, LCf/c;->d:LCf/c;

    .line 256
    .line 257
    const/16 v11, 0x3c

    .line 258
    .line 259
    invoke-static {v11, v8}, LFe/b;->S(ILCf/c;)J

    .line 260
    .line 261
    .line 262
    move-result-wide v25

    .line 263
    goto :goto_2

    .line 264
    :goto_3
    invoke-direct {v5, v7, v11, v12}, LW1/r;-><init>(Lcom/moloco/sdk/publisher/AdFormatType;J)V

    .line 265
    .line 266
    .line 267
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->b()Lcom/moloco/sdk/internal/services/k;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    const-string v7, "appLifecycleTrackerService"

    .line 272
    .line 273
    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v7, "audioService"

    .line 277
    .line 278
    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const-string v7, "adUnitId"

    .line 282
    .line 283
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    const-string v7, "persistentHttpRequest"

    .line 287
    .line 288
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    const-string v7, "viewLifecycleOwnerSingleton"

    .line 292
    .line 293
    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    const-string v7, "timeProvider"

    .line 297
    .line 298
    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    new-instance v7, Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 302
    .line 303
    move-object v11, v8

    .line 304
    new-instance v8, Lcom/moloco/sdk/internal/publisher/a0;

    .line 305
    .line 306
    sget-object v10, Lcom/moloco/sdk/internal/ortb/f;->a:Lef/p;

    .line 307
    .line 308
    invoke-virtual {v10}, Lef/p;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    check-cast v10, Lcom/moloco/sdk/internal/ortb/e;

    .line 313
    .line 314
    move-object/from16 v25, v4

    .line 315
    .line 316
    new-instance v4, Landroidx/fragment/app/X;

    .line 317
    .line 318
    move-object/from16 v26, v5

    .line 319
    .line 320
    const/4 v5, 0x3

    .line 321
    invoke-direct {v4, v5}, Landroidx/fragment/app/X;-><init>(I)V

    .line 322
    .line 323
    .line 324
    invoke-direct {v8, v10, v4}, Lcom/moloco/sdk/internal/publisher/a0;-><init>(Lcom/moloco/sdk/internal/ortb/e;Landroidx/fragment/app/X;)V

    .line 325
    .line 326
    .line 327
    move-object v4, v9

    .line 328
    new-instance v9, Lae/d;

    .line 329
    .line 330
    invoke-direct {v9, v5}, Lae/d;-><init>(I)V

    .line 331
    .line 332
    .line 333
    move-object v5, v7

    .line 334
    move-object/from16 p1, v13

    .line 335
    .line 336
    move-object/from16 v13, v21

    .line 337
    .line 338
    move-object/from16 v10, v26

    .line 339
    .line 340
    move-object v7, v6

    .line 341
    move-object/from16 v21, v14

    .line 342
    .line 343
    move-object/from16 v6, v18

    .line 344
    .line 345
    move-object/from16 v18, v4

    .line 346
    .line 347
    move-object v14, v11

    .line 348
    move-object/from16 v4, v23

    .line 349
    .line 350
    move-object/from16 v11, v24

    .line 351
    .line 352
    invoke-direct/range {v5 .. v12}, Lcom/moloco/sdk/internal/publisher/nativead/o;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/moloco/sdk/internal/publisher/a0;Lae/d;LW1/r;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/services/k;)V

    .line 353
    .line 354
    .line 355
    move-object/from16 v23, v5

    .line 356
    .line 357
    move-object v12, v7

    .line 358
    move-object/from16 v26, v10

    .line 359
    .line 360
    new-instance v5, Lcom/moloco/sdk/internal/publisher/nativead/a;

    .line 361
    .line 362
    new-instance v10, Lcom/moloco/sdk/internal/d;

    .line 363
    .line 364
    invoke-direct {v10, v13, v14, v6}, Lcom/moloco/sdk/internal/d;-><init>(Lcom/moloco/sdk/internal/e;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Landroid/content/Context;)V

    .line 365
    .line 366
    .line 367
    move-object/from16 v8, p1

    .line 368
    .line 369
    move-object/from16 v7, v17

    .line 370
    .line 371
    move-object/from16 v9, v21

    .line 372
    .line 373
    invoke-direct/range {v5 .. v11}, Lcom/moloco/sdk/internal/publisher/nativead/a;-><init>(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Lcom/moloco/sdk/internal/b;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/internal/d;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 374
    .line 375
    .line 376
    new-instance v6, Lcom/moloco/sdk/internal/publisher/nativead/c;

    .line 377
    .line 378
    iget-object v10, v13, Lcom/moloco/sdk/internal/e;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 379
    .line 380
    move-object v0, v14

    .line 381
    move-object v14, v11

    .line 382
    move-object v11, v0

    .line 383
    move-object v8, v5

    .line 384
    move-object v5, v6

    .line 385
    move-object v6, v12

    .line 386
    move-object/from16 v17, v15

    .line 387
    .line 388
    move-object/from16 v9, v18

    .line 389
    .line 390
    move-object/from16 v15, v19

    .line 391
    .line 392
    move-object/from16 v0, v20

    .line 393
    .line 394
    move-object/from16 v7, v23

    .line 395
    .line 396
    move-object/from16 v12, v25

    .line 397
    .line 398
    move-object/from16 v13, v26

    .line 399
    .line 400
    invoke-direct/range {v5 .. v14}, Lcom/moloco/sdk/internal/publisher/nativead/c;-><init>(Ljava/lang/String;Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/internal/publisher/nativead/a;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;LW1/r;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 401
    .line 402
    .line 403
    move-object v11, v14

    .line 404
    new-instance v7, Lcom/moloco/sdk/acm/h;

    .line 405
    .line 406
    sget-object v8, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 407
    .line 408
    const-string v8, "create_ad"

    .line 409
    .line 410
    invoke-direct {v7, v8}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    sget-object v8, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 414
    .line 415
    const-string v8, "result"

    .line 416
    .line 417
    const-string v9, "success"

    .line 418
    .line 419
    invoke-virtual {v7, v8, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    invoke-virtual {v7, v15, v10}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v10

    .line 433
    invoke-virtual {v7, v0, v10}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v11, v7}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1, v8, v9}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v11, v1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 449
    .line 450
    .line 451
    move-result-wide v0

    .line 452
    invoke-virtual {v5, v2, v3, v0, v1}, Lcom/moloco/sdk/internal/publisher/nativead/c;->a(JJ)V

    .line 453
    .line 454
    .line 455
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 456
    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    const-string v1, "Created "

    .line 460
    .line 461
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    move-object/from16 v1, v17

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v9

    .line 479
    const/4 v10, 0x0

    .line 480
    const/4 v11, 0x0

    .line 481
    const-string v8, "AdCreator"

    .line 482
    .line 483
    const/16 v12, 0xc

    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 490
    .line 491
    invoke-direct {v0, v5}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    return-object v0

    .line 495
    :cond_5
    move-object/from16 v23, v8

    .line 496
    .line 497
    iget-object v5, v0, Lcom/moloco/sdk/internal/publisher/q;->h:Ljava/lang/String;

    .line 498
    .line 499
    move-object v7, v1

    .line 500
    move-object v9, v11

    .line 501
    move-object/from16 v6, v16

    .line 502
    .line 503
    invoke-static/range {v4 .. v9}, Lcom/moloco/sdk/internal/publisher/s;->a(Lcom/moloco/sdk/internal/publisher/s;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;)Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    move-object v4, v8

    .line 508
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 509
    .line 510
    new-instance v2, Ljava/lang/StringBuilder;

    .line 511
    .line 512
    const-string v3, "Failed to create "

    .line 513
    .line 514
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    const-string v3, " with reason: "

    .line 521
    .line 522
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v7

    .line 532
    const/4 v8, 0x0

    .line 533
    const/4 v9, 0x0

    .line 534
    const-string v6, "AdCreator"

    .line 535
    .line 536
    const/16 v10, 0xc

    .line 537
    .line 538
    const/4 v11, 0x0

    .line 539
    invoke-static/range {v5 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 543
    .line 544
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    return-object v2
.end method
