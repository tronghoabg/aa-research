.class public final Lcom/moloco/sdk/internal/publisher/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lcom/moloco/sdk/publisher/MolocoInitStatus;

.field public static final g:Lcom/moloco/sdk/publisher/MolocoInitStatus;


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/k;

.field public final b:LHf/x0;

.field public final c:LHf/e0;

.field public d:Lcom/moloco/sdk/K0;

.field public final e:LHf/x0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoInitStatus;

    .line 2
    .line 3
    sget-object v1, Lcom/moloco/sdk/publisher/Initialization;->SUCCESS:Lcom/moloco/sdk/publisher/Initialization;

    .line 4
    .line 5
    const-string v2, "Already Initialized"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/publisher/MolocoInitStatus;-><init>(Lcom/moloco/sdk/publisher/Initialization;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/moloco/sdk/internal/publisher/r0;->f:Lcom/moloco/sdk/publisher/MolocoInitStatus;

    .line 11
    .line 12
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoInitStatus;

    .line 13
    .line 14
    const-string v2, "Initialized"

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/publisher/MolocoInitStatus;-><init>(Lcom/moloco/sdk/publisher/Initialization;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/moloco/sdk/internal/publisher/r0;->g:Lcom/moloco/sdk/publisher/MolocoInitStatus;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/internal/services/k;)V
    .locals 2

    .line 1
    const-string v0, "timeProviderService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/r0;->a:Lcom/moloco/sdk/internal/services/k;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/r0;->b:LHf/x0;

    .line 17
    .line 18
    new-instance v1, LHf/e0;

    .line 19
    .line 20
    invoke-direct {v1, v0}, LHf/e0;-><init>(LHf/c0;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/moloco/sdk/internal/publisher/r0;->c:LHf/e0;

    .line 24
    .line 25
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/r0;->e:LHf/x0;

    .line 30
    .line 31
    return-void
.end method

.method public static final a(Lcom/moloco/sdk/internal/publisher/r0;Lcom/moloco/sdk/internal/A;JLcom/moloco/sdk/internal/services/init/u;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/acm/l;Llf/c;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v6, p6

    .line 12
    .line 13
    move-object/from16 v7, p7

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    instance-of v10, v7, Lcom/moloco/sdk/internal/publisher/o0;

    .line 19
    .line 20
    if-eqz v10, :cond_0

    .line 21
    .line 22
    move-object v10, v7

    .line 23
    check-cast v10, Lcom/moloco/sdk/internal/publisher/o0;

    .line 24
    .line 25
    iget v11, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 26
    .line 27
    const/high16 v12, -0x80000000

    .line 28
    .line 29
    and-int v13, v11, v12

    .line 30
    .line 31
    if-eqz v13, :cond_0

    .line 32
    .line 33
    sub-int/2addr v11, v12

    .line 34
    iput v11, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v10, Lcom/moloco/sdk/internal/publisher/o0;

    .line 38
    .line 39
    invoke-direct {v10, v0, v7}, Lcom/moloco/sdk/internal/publisher/o0;-><init>(Lcom/moloco/sdk/internal/publisher/r0;Llf/c;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v7, v10, Lcom/moloco/sdk/internal/publisher/o0;->g:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v11, Lkf/a;->a:Lkf/a;

    .line 45
    .line 46
    iget v12, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 47
    .line 48
    const/4 v14, 0x5

    .line 49
    const/4 v15, 0x4

    .line 50
    const/4 v8, 0x3

    .line 51
    const/4 v9, 0x2

    .line 52
    const/4 v13, 0x1

    .line 53
    if-eqz v12, :cond_6

    .line 54
    .line 55
    if-eq v12, v13, :cond_5

    .line 56
    .line 57
    if-eq v12, v9, :cond_4

    .line 58
    .line 59
    if-eq v12, v8, :cond_3

    .line 60
    .line 61
    if-eq v12, v15, :cond_2

    .line 62
    .line 63
    if-ne v12, v14, :cond_1

    .line 64
    .line 65
    invoke-static {v7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    iget-object v0, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lcom/moloco/sdk/K0;

    .line 81
    .line 82
    iget-object v1, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lcom/moloco/sdk/acm/l;

    .line 85
    .line 86
    iget-object v2, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lcom/moloco/sdk/acm/recorder/b;

    .line 89
    .line 90
    iget-object v3, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Lcom/moloco/sdk/internal/publisher/r0;

    .line 93
    .line 94
    invoke-static {v7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :cond_3
    iget-wide v0, v10, Lcom/moloco/sdk/internal/publisher/o0;->f:J

    .line 100
    .line 101
    iget-object v2, v10, Lcom/moloco/sdk/internal/publisher/o0;->e:Lcom/moloco/sdk/K0;

    .line 102
    .line 103
    iget-object v3, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, Lcom/moloco/sdk/acm/l;

    .line 106
    .line 107
    iget-object v4, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Lcom/moloco/sdk/acm/recorder/b;

    .line 110
    .line 111
    iget-object v5, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v5, Lcom/moloco/sdk/internal/services/init/u;

    .line 114
    .line 115
    iget-object v6, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v6, Lcom/moloco/sdk/internal/publisher/r0;

    .line 118
    .line 119
    invoke-static {v7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object/from16 v23, v5

    .line 123
    .line 124
    move-object v5, v4

    .line 125
    move-object/from16 v4, v23

    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :cond_4
    iget-object v0, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lcom/moloco/sdk/acm/l;

    .line 132
    .line 133
    iget-object v1, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Lcom/moloco/sdk/acm/recorder/b;

    .line 136
    .line 137
    iget-object v2, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Lcom/moloco/sdk/internal/A;

    .line 140
    .line 141
    invoke-static {v7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_2

    .line 145
    .line 146
    :cond_5
    iget-wide v0, v10, Lcom/moloco/sdk/internal/publisher/o0;->f:J

    .line 147
    .line 148
    iget-object v2, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, Lcom/moloco/sdk/acm/l;

    .line 151
    .line 152
    iget-object v3, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, Lcom/moloco/sdk/acm/recorder/b;

    .line 155
    .line 156
    iget-object v4, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v4, Lcom/moloco/sdk/internal/services/init/u;

    .line 159
    .line 160
    iget-object v5, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v5, Lcom/moloco/sdk/internal/A;

    .line 163
    .line 164
    invoke-static {v7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    move-object v6, v2

    .line 168
    move-object/from16 v23, v5

    .line 169
    .line 170
    move-object v5, v3

    .line 171
    move-wide v2, v0

    .line 172
    move-object/from16 v1, v23

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_6
    invoke-static {v7}, LFe/e;->U(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    instance-of v7, v1, Lcom/moloco/sdk/internal/y;

    .line 179
    .line 180
    if-eqz v7, :cond_b

    .line 181
    .line 182
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/r0;->b:LHf/x0;

    .line 183
    .line 184
    sget-object v7, Lcom/moloco/sdk/publisher/Initialization;->FAILURE:Lcom/moloco/sdk/publisher/Initialization;

    .line 185
    .line 186
    iput-object v1, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v4, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v5, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v6, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 193
    .line 194
    iput-wide v2, v10, Lcom/moloco/sdk/internal/publisher/o0;->f:J

    .line 195
    .line 196
    iput v13, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 197
    .line 198
    invoke-virtual {v0, v7, v10}, LHf/x0;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    sget-object v0, Lef/C;->a:Lef/C;

    .line 202
    .line 203
    if-ne v0, v11, :cond_7

    .line 204
    .line 205
    goto/16 :goto_a

    .line 206
    .line 207
    :cond_7
    :goto_1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 208
    .line 209
    const-string v7, "InitializationHandler"

    .line 210
    .line 211
    const-string v8, "sdk init failed"

    .line 212
    .line 213
    const/16 v12, 0xc

    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v14, 0x0

    .line 217
    const/4 v15, 0x0

    .line 218
    move-object/from16 p0, v0

    .line 219
    .line 220
    move-object/from16 p1, v7

    .line 221
    .line 222
    move-object/from16 p2, v8

    .line 223
    .line 224
    move/from16 p5, v12

    .line 225
    .line 226
    move-object/from16 p6, v13

    .line 227
    .line 228
    move-object/from16 p3, v14

    .line 229
    .line 230
    move/from16 p4, v15

    .line 231
    .line 232
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    move-object v0, v1

    .line 236
    check-cast v0, Lcom/moloco/sdk/internal/y;

    .line 237
    .line 238
    iget-object v0, v0, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Lcom/moloco/sdk/internal/services/init/n;

    .line 241
    .line 242
    iput-object v1, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v5, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v6, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    iput-object v7, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 250
    .line 251
    iput v9, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 252
    .line 253
    invoke-virtual {v4, v0, v2, v3}, Lcom/moloco/sdk/internal/services/init/u;->a(Lcom/moloco/sdk/internal/services/init/n;J)V

    .line 254
    .line 255
    .line 256
    sget-object v0, Lef/C;->a:Lef/C;

    .line 257
    .line 258
    if-ne v0, v11, :cond_8

    .line 259
    .line 260
    goto/16 :goto_a

    .line 261
    .line 262
    :cond_8
    move-object v2, v1

    .line 263
    move-object v1, v5

    .line 264
    move-object v0, v6

    .line 265
    :goto_2
    check-cast v2, Lcom/moloco/sdk/internal/y;

    .line 266
    .line 267
    iget-object v2, v2, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v2, Lcom/moloco/sdk/internal/services/init/n;

    .line 270
    .line 271
    instance-of v3, v2, Lcom/moloco/sdk/internal/services/init/l;

    .line 272
    .line 273
    if-eqz v3, :cond_9

    .line 274
    .line 275
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 276
    .line 277
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 278
    .line 279
    const-string v4, "sdk_init_failure"

    .line 280
    .line 281
    invoke-direct {v3, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 285
    .line 286
    const-string v4, "reason"

    .line 287
    .line 288
    check-cast v2, Lcom/moloco/sdk/internal/services/init/l;

    .line 289
    .line 290
    iget-object v5, v2, Lcom/moloco/sdk/internal/services/init/l;->a:Lcom/moloco/sdk/internal/services/init/b;

    .line 291
    .line 292
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-virtual {v3, v4, v5}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    check-cast v1, Lcom/moloco/sdk/acm/recorder/c;

    .line 300
    .line 301
    invoke-virtual {v1, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 302
    .line 303
    .line 304
    const-string v3, "result"

    .line 305
    .line 306
    const-string v4, "failure"

    .line 307
    .line 308
    invoke-virtual {v0, v3, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const-string v3, "reason"

    .line 312
    .line 313
    iget-object v2, v2, Lcom/moloco/sdk/internal/services/init/l;->a:Lcom/moloco/sdk/internal/services/init/b;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v0, v3, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_9

    .line 326
    .line 327
    :cond_9
    instance-of v3, v2, Lcom/moloco/sdk/internal/services/init/m;

    .line 328
    .line 329
    if-eqz v3, :cond_a

    .line 330
    .line 331
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 332
    .line 333
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 334
    .line 335
    const-string v4, "sdk_init_failure"

    .line 336
    .line 337
    invoke-direct {v3, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 341
    .line 342
    const-string v4, "reason"

    .line 343
    .line 344
    check-cast v2, Lcom/moloco/sdk/internal/services/init/m;

    .line 345
    .line 346
    iget v5, v2, Lcom/moloco/sdk/internal/services/init/m;->a:I

    .line 347
    .line 348
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-virtual {v3, v4, v5}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    check-cast v1, Lcom/moloco/sdk/acm/recorder/c;

    .line 356
    .line 357
    invoke-virtual {v1, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 358
    .line 359
    .line 360
    const-string v3, "result"

    .line 361
    .line 362
    const-string v4, "failure"

    .line 363
    .line 364
    invoke-virtual {v0, v3, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    const-string v3, "reason"

    .line 368
    .line 369
    iget v2, v2, Lcom/moloco/sdk/internal/services/init/m;->a:I

    .line 370
    .line 371
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v0, v3, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_9

    .line 382
    .line 383
    :cond_a
    new-instance v0, LE5/Q;

    .line 384
    .line 385
    const/16 v1, 0x9

    .line 386
    .line 387
    const/4 v2, 0x0

    .line 388
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 389
    .line 390
    .line 391
    throw v0

    .line 392
    :cond_b
    instance-of v7, v1, Lcom/moloco/sdk/internal/z;

    .line 393
    .line 394
    if-eqz v7, :cond_11

    .line 395
    .line 396
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 397
    .line 398
    const-string v17, "InitializationHandler"

    .line 399
    .line 400
    const-string v18, "sdk init success"

    .line 401
    .line 402
    const/16 v21, 0xc

    .line 403
    .line 404
    const/16 v22, 0x0

    .line 405
    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    const/16 v20, 0x0

    .line 409
    .line 410
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    check-cast v1, Lcom/moloco/sdk/internal/z;

    .line 414
    .line 415
    iget-object v1, v1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v1, Lcom/moloco/sdk/K0;

    .line 418
    .line 419
    iput-object v1, v0, Lcom/moloco/sdk/internal/publisher/r0;->d:Lcom/moloco/sdk/K0;

    .line 420
    .line 421
    iget-object v7, v0, Lcom/moloco/sdk/internal/publisher/r0;->b:LHf/x0;

    .line 422
    .line 423
    sget-object v9, Lcom/moloco/sdk/publisher/Initialization;->SUCCESS:Lcom/moloco/sdk/publisher/Initialization;

    .line 424
    .line 425
    iput-object v0, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 426
    .line 427
    iput-object v4, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 428
    .line 429
    iput-object v5, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 430
    .line 431
    iput-object v6, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 432
    .line 433
    iput-object v1, v10, Lcom/moloco/sdk/internal/publisher/o0;->e:Lcom/moloco/sdk/K0;

    .line 434
    .line 435
    iput-wide v2, v10, Lcom/moloco/sdk/internal/publisher/o0;->f:J

    .line 436
    .line 437
    iput v8, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 438
    .line 439
    invoke-virtual {v7, v9, v10}, LHf/x0;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    sget-object v7, Lef/C;->a:Lef/C;

    .line 443
    .line 444
    if-ne v7, v11, :cond_c

    .line 445
    .line 446
    goto/16 :goto_a

    .line 447
    .line 448
    :cond_c
    move-object/from16 v23, v6

    .line 449
    .line 450
    move-object v6, v0

    .line 451
    move-wide/from16 v24, v2

    .line 452
    .line 453
    move-object v2, v1

    .line 454
    move-wide/from16 v0, v24

    .line 455
    .line 456
    move-object/from16 v3, v23

    .line 457
    .line 458
    :goto_3
    iput-object v6, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v5, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 461
    .line 462
    iput-object v3, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 463
    .line 464
    iput-object v2, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 465
    .line 466
    const/4 v7, 0x0

    .line 467
    iput-object v7, v10, Lcom/moloco/sdk/internal/publisher/o0;->e:Lcom/moloco/sdk/K0;

    .line 468
    .line 469
    iput v15, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 470
    .line 471
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    :try_start_0
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 475
    .line 476
    const-string v8, "InitTrackingApi"

    .line 477
    .line 478
    const-string v9, "Reporting InitTracking success"

    .line 479
    .line 480
    const/4 v12, 0x4

    .line 481
    const/4 v13, 0x0

    .line 482
    const/4 v15, 0x0

    .line 483
    move-object/from16 p0, v7

    .line 484
    .line 485
    move-object/from16 p1, v8

    .line 486
    .line 487
    move-object/from16 p2, v9

    .line 488
    .line 489
    move/from16 p4, v12

    .line 490
    .line 491
    move-object/from16 p5, v13

    .line 492
    .line 493
    move/from16 p3, v15

    .line 494
    .line 495
    invoke-static/range {p0 .. p5}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    const-string v7, "https://sdkopmetrics-us.dsp-api.moloco.com/v1/tracking/init"

    .line 499
    .line 500
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 501
    .line 502
    .line 503
    move-result-object v7

    .line 504
    invoke-virtual {v7}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v7

    .line 508
    invoke-virtual {v7}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 509
    .line 510
    .line 511
    move-result-object v7

    .line 512
    iget-object v4, v4, Lcom/moloco/sdk/internal/services/init/u;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;

    .line 513
    .line 514
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    const-string v8, "toString(...)"

    .line 519
    .line 520
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-static {}, Lcom/moloco/sdk/c1;->e()Lcom/moloco/sdk/b1;

    .line 524
    .line 525
    .line 526
    move-result-object v8

    .line 527
    invoke-virtual {v8, v0, v1}, Lcom/moloco/sdk/b1;->b(J)V

    .line 528
    .line 529
    .line 530
    invoke-static {}, Lcom/moloco/sdk/a1;->b()Lcom/moloco/sdk/Z0;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, Lcom/moloco/sdk/a1;

    .line 539
    .line 540
    invoke-virtual {v8, v0}, Lcom/moloco/sdk/b1;->c(Lcom/moloco/sdk/a1;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v8}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, Lcom/moloco/sdk/c1;

    .line 548
    .line 549
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    const-string v1, "toByteArray(...)"

    .line 554
    .line 555
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    sget-object v1, LJd/c;->b:LJd/f;

    .line 559
    .line 560
    const/4 v8, 0x0

    .line 561
    invoke-virtual {v4, v7, v0, v1, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;->a(Ljava/lang/String;[BLJd/f;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 562
    .line 563
    .line 564
    goto :goto_4

    .line 565
    :catch_0
    move-exception v0

    .line 566
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 567
    .line 568
    const-string v4, "InitTrackingApi"

    .line 569
    .line 570
    const-string v7, "Failed to send notifySuccess post request"

    .line 571
    .line 572
    const/4 v8, 0x0

    .line 573
    const/4 v9, 0x0

    .line 574
    const/16 v12, 0x8

    .line 575
    .line 576
    move-object/from16 p3, v0

    .line 577
    .line 578
    move-object/from16 p0, v1

    .line 579
    .line 580
    move-object/from16 p1, v4

    .line 581
    .line 582
    move-object/from16 p2, v7

    .line 583
    .line 584
    move-object/from16 p6, v8

    .line 585
    .line 586
    move/from16 p4, v9

    .line 587
    .line 588
    move/from16 p5, v12

    .line 589
    .line 590
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    :goto_4
    sget-object v0, Lef/C;->a:Lef/C;

    .line 594
    .line 595
    if-ne v0, v11, :cond_d

    .line 596
    .line 597
    goto/16 :goto_a

    .line 598
    .line 599
    :cond_d
    move-object v0, v2

    .line 600
    move-object v1, v3

    .line 601
    move-object v2, v5

    .line 602
    move-object v3, v6

    .line 603
    :goto_5
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 604
    .line 605
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 606
    .line 607
    const-string v5, "sdk_init_success"

    .line 608
    .line 609
    invoke-direct {v4, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 613
    .line 614
    const-string v5, "country"

    .line 615
    .line 616
    invoke-virtual {v0}, Lcom/moloco/sdk/K0;->d()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    const-string v7, "getCountryIso2Code(...)"

    .line 621
    .line 622
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v4, v5, v6}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    check-cast v2, Lcom/moloco/sdk/acm/recorder/c;

    .line 629
    .line 630
    invoke-virtual {v2, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 631
    .line 632
    .line 633
    const-string v4, "result"

    .line 634
    .line 635
    const-string v5, "success"

    .line 636
    .line 637
    invoke-virtual {v1, v4, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    const-string v4, "country"

    .line 641
    .line 642
    invoke-virtual {v0}, Lcom/moloco/sdk/K0;->d()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    const-string v6, "getCountryIso2Code(...)"

    .line 647
    .line 648
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1, v4, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 655
    .line 656
    .line 657
    iget-object v1, v3, Lcom/moloco/sdk/internal/publisher/r0;->e:LHf/x0;

    .line 658
    .line 659
    sget-object v2, Lcom/moloco/sdk/service_locator/f;->a:Lcom/moloco/sdk/service_locator/f;

    .line 660
    .line 661
    sget-object v3, Lcom/moloco/sdk/service_locator/f;->b:Lcom/moloco/sdk/internal/e;

    .line 662
    .line 663
    if-nez v3, :cond_f

    .line 664
    .line 665
    monitor-enter v2

    .line 666
    :try_start_1
    sget-object v3, Lcom/moloco/sdk/service_locator/f;->b:Lcom/moloco/sdk/internal/e;

    .line 667
    .line 668
    if-nez v3, :cond_e

    .line 669
    .line 670
    new-instance v3, Lcom/moloco/sdk/internal/e;

    .line 671
    .line 672
    invoke-static {}, Lcom/moloco/sdk/service_locator/l;->a()Lcom/moloco/sdk/internal/services/events/c;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    new-instance v5, Lcom/moloco/sdk/internal/services/B;

    .line 677
    .line 678
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    invoke-static {}, Lcom/moloco/sdk/service_locator/l;->a()Lcom/moloco/sdk/internal/services/events/c;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    invoke-direct {v5, v6, v7}, Lcom/moloco/sdk/internal/services/B;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/internal/services/events/c;)V

    .line 687
    .line 688
    .line 689
    invoke-direct {v3, v0, v4, v5}, Lcom/moloco/sdk/internal/e;-><init>(Lcom/moloco/sdk/K0;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/services/B;)V

    .line 690
    .line 691
    .line 692
    sput-object v3, Lcom/moloco/sdk/service_locator/f;->b:Lcom/moloco/sdk/internal/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 693
    .line 694
    goto :goto_6

    .line 695
    :catchall_0
    move-exception v0

    .line 696
    goto :goto_7

    .line 697
    :cond_e
    :goto_6
    monitor-exit v2

    .line 698
    :cond_f
    const/4 v7, 0x0

    .line 699
    goto :goto_8

    .line 700
    :goto_7
    monitor-exit v2

    .line 701
    throw v0

    .line 702
    :goto_8
    iput-object v7, v10, Lcom/moloco/sdk/internal/publisher/o0;->a:Ljava/lang/Object;

    .line 703
    .line 704
    iput-object v7, v10, Lcom/moloco/sdk/internal/publisher/o0;->b:Ljava/lang/Object;

    .line 705
    .line 706
    iput-object v7, v10, Lcom/moloco/sdk/internal/publisher/o0;->c:Ljava/lang/Object;

    .line 707
    .line 708
    iput-object v7, v10, Lcom/moloco/sdk/internal/publisher/o0;->d:Ljava/lang/Object;

    .line 709
    .line 710
    iput v14, v10, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    .line 711
    .line 712
    invoke-virtual {v1, v3, v10}, LHf/x0;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    sget-object v0, Lef/C;->a:Lef/C;

    .line 716
    .line 717
    if-ne v0, v11, :cond_10

    .line 718
    .line 719
    goto :goto_a

    .line 720
    :cond_10
    :goto_9
    sget-object v11, Lef/C;->a:Lef/C;

    .line 721
    .line 722
    :goto_a
    return-object v11

    .line 723
    :cond_11
    new-instance v0, LE5/Q;

    .line 724
    .line 725
    const/16 v1, 0x9

    .line 726
    .line 727
    const/4 v2, 0x0

    .line 728
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 729
    .line 730
    .line 731
    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/internal/services/init/u;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v0, p5

    .line 6
    .line 7
    instance-of v3, v0, Lcom/moloco/sdk/internal/publisher/p0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lcom/moloco/sdk/internal/publisher/p0;

    .line 13
    .line 14
    iget v4, v3, Lcom/moloco/sdk/internal/publisher/p0;->f:I

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
    iput v4, v3, Lcom/moloco/sdk/internal/publisher/p0;->f:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lcom/moloco/sdk/internal/publisher/p0;

    .line 28
    .line 29
    invoke-direct {v3, v2, v0}, Lcom/moloco/sdk/internal/publisher/p0;-><init>(Lcom/moloco/sdk/internal/publisher/r0;Llf/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v7, Lcom/moloco/sdk/internal/publisher/p0;->d:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v8, Lkf/a;->a:Lkf/a;

    .line 36
    .line 37
    iget v3, v7, Lcom/moloco/sdk/internal/publisher/p0;->f:I

    .line 38
    .line 39
    sget-object v4, Lef/C;->a:Lef/C;

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    const/4 v6, 0x2

    .line 43
    const/4 v9, 0x1

    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    if-eq v3, v9, :cond_3

    .line 47
    .line 48
    if-eq v3, v6, :cond_2

    .line 49
    .line 50
    if-ne v3, v5, :cond_1

    .line 51
    .line 52
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/p0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lcom/moloco/sdk/internal/services/init/l;

    .line 67
    .line 68
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_3
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/p0;->c:Lcom/moloco/sdk/internal/services/init/l;

    .line 74
    .line 75
    iget-object v3, v7, Lcom/moloco/sdk/internal/publisher/p0;->b:Lcom/moloco/sdk/acm/recorder/c;

    .line 76
    .line 77
    iget-object v5, v7, Lcom/moloco/sdk/internal/publisher/p0;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, Lcom/moloco/sdk/internal/publisher/r0;

    .line 80
    .line 81
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object v0, v1

    .line 85
    move-object v1, v3

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    const/4 v14, 0x0

    .line 94
    const-string v11, "InitializationHandler"

    .line 95
    .line 96
    const-string v12, "initialize()"

    .line 97
    .line 98
    const/16 v15, 0xc

    .line 99
    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 106
    .line 107
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 108
    .line 109
    const-string v3, "sdk_init_attempt"

    .line 110
    .line 111
    invoke-direct {v0, v3}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 115
    .line 116
    .line 117
    :try_start_0
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    iput v5, v7, Lcom/moloco/sdk/internal/publisher/p0;->f:I

    .line 121
    .line 122
    sget-object v0, LEf/S;->a:LLf/e;

    .line 123
    .line 124
    sget-object v9, LLf/d;->b:LLf/d;

    .line 125
    .line 126
    new-instance v0, Lcom/moloco/sdk/internal/publisher/q0;

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    move-object/from16 v3, p1

    .line 130
    .line 131
    move-object/from16 v4, p2

    .line 132
    .line 133
    move-object/from16 v5, p3

    .line 134
    .line 135
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/q0;-><init>(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/publisher/r0;Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/internal/services/init/u;Ljf/c;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v9, v0, v7}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-ne v0, v8, :cond_5

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    return-object v0

    .line 146
    :catch_0
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const-string v11, "InitializationHandler"

    .line 149
    .line 150
    const-string v12, "PersistentHttpRequest is not available, failing to initialize"

    .line 151
    .line 152
    const/16 v15, 0xc

    .line 153
    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance v0, Lcom/moloco/sdk/internal/services/init/l;

    .line 160
    .line 161
    sget-object v3, Lcom/moloco/sdk/internal/services/init/b;->e:Lcom/moloco/sdk/internal/services/init/b;

    .line 162
    .line 163
    invoke-direct {v0, v3}, Lcom/moloco/sdk/internal/services/init/l;-><init>(Lcom/moloco/sdk/internal/services/init/b;)V

    .line 164
    .line 165
    .line 166
    iput-object v2, v7, Lcom/moloco/sdk/internal/publisher/p0;->a:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v1, v7, Lcom/moloco/sdk/internal/publisher/p0;->b:Lcom/moloco/sdk/acm/recorder/c;

    .line 169
    .line 170
    iput-object v0, v7, Lcom/moloco/sdk/internal/publisher/p0;->c:Lcom/moloco/sdk/internal/services/init/l;

    .line 171
    .line 172
    iput v9, v7, Lcom/moloco/sdk/internal/publisher/p0;->f:I

    .line 173
    .line 174
    const-wide/16 v9, 0x0

    .line 175
    .line 176
    move-object/from16 v5, p3

    .line 177
    .line 178
    invoke-virtual {v5, v0, v9, v10}, Lcom/moloco/sdk/internal/services/init/u;->a(Lcom/moloco/sdk/internal/services/init/n;J)V

    .line 179
    .line 180
    .line 181
    if-ne v4, v8, :cond_6

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_6
    move-object v5, v2

    .line 185
    :goto_2
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 186
    .line 187
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 188
    .line 189
    const-string v9, "sdk_init_failure"

    .line 190
    .line 191
    invoke-direct {v3, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 195
    .line 196
    iget-object v9, v0, Lcom/moloco/sdk/internal/services/init/l;->a:Lcom/moloco/sdk/internal/services/init/b;

    .line 197
    .line 198
    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    const-string v10, "reason"

    .line 203
    .line 204
    invoke-virtual {v3, v10, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 208
    .line 209
    .line 210
    iget-object v1, v5, Lcom/moloco/sdk/internal/publisher/r0;->b:LHf/x0;

    .line 211
    .line 212
    sget-object v3, Lcom/moloco/sdk/publisher/Initialization;->FAILURE:Lcom/moloco/sdk/publisher/Initialization;

    .line 213
    .line 214
    iput-object v0, v7, Lcom/moloco/sdk/internal/publisher/p0;->a:Ljava/lang/Object;

    .line 215
    .line 216
    const/4 v5, 0x0

    .line 217
    iput-object v5, v7, Lcom/moloco/sdk/internal/publisher/p0;->b:Lcom/moloco/sdk/acm/recorder/c;

    .line 218
    .line 219
    iput-object v5, v7, Lcom/moloco/sdk/internal/publisher/p0;->c:Lcom/moloco/sdk/internal/services/init/l;

    .line 220
    .line 221
    iput v6, v7, Lcom/moloco/sdk/internal/publisher/p0;->f:I

    .line 222
    .line 223
    invoke-virtual {v1, v3, v7}, LHf/x0;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    if-ne v4, v8, :cond_7

    .line 227
    .line 228
    :goto_3
    return-object v8

    .line 229
    :cond_7
    move-object v1, v0

    .line 230
    :goto_4
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 231
    .line 232
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-object v0
.end method

.method public final c(Llf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, Lcom/moloco/sdk/internal/publisher/m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/m0;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/m0;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/m0;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/m0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/moloco/sdk/internal/publisher/m0;-><init>(Lcom/moloco/sdk/internal/publisher/r0;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/moloco/sdk/internal/publisher/m0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/m0;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    const-string v5, "InitializationHandler"

    .line 56
    .line 57
    const-string v6, "Moloco SDK awaiting init to receive AdFactory"

    .line 58
    .line 59
    const/16 v9, 0xc

    .line 60
    .line 61
    const/4 v10, 0x0

    .line 62
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, Lcom/moloco/sdk/internal/publisher/n0;

    .line 66
    .line 67
    const/4 v2, 0x2

    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {p1, v2, v4}, Llf/j;-><init>(ILjf/c;)V

    .line 70
    .line 71
    .line 72
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/m0;->c:I

    .line 73
    .line 74
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/r0;->e:LHf/x0;

    .line 75
    .line 76
    invoke-static {v2, p1, v0}, LHf/k0;->p(LHf/l;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v1, :cond_3

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_3
    :goto_1
    const-string v0, "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory"

    .line 84
    .line 85
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    check-cast p1, Lcom/moloco/sdk/internal/e;

    .line 89
    .line 90
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const-string v1, "InitializationHandler"

    .line 95
    .line 96
    const-string v2, "Moloco SDK init completed, AdFactory received"

    .line 97
    .line 98
    const/16 v5, 0xc

    .line 99
    .line 100
    const/4 v6, 0x0

    .line 101
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object p1
.end method
