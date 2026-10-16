.class public final Lcom/moloco/sdk/internal/publisher/A;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lcom/moloco/sdk/internal/publisher/C;

.field public b:J

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/moloco/sdk/internal/publisher/B;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:J

.field public final synthetic h:Lcom/moloco/sdk/internal/publisher/C;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;JLcom/moloco/sdk/internal/publisher/C;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/A;->e:Lcom/moloco/sdk/internal/publisher/B;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/A;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/moloco/sdk/internal/publisher/A;->g:J

    .line 6
    .line 7
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/A;->h:Lcom/moloco/sdk/internal/publisher/C;

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
    new-instance v0, Lcom/moloco/sdk/internal/publisher/A;

    .line 2
    .line 3
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/A;->h:Lcom/moloco/sdk/internal/publisher/C;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/A;->e:Lcom/moloco/sdk/internal/publisher/B;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/A;->f:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v3, p0, Lcom/moloco/sdk/internal/publisher/A;->g:J

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/A;-><init>(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;JLcom/moloco/sdk/internal/publisher/C;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/moloco/sdk/internal/publisher/A;->d:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/A;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/A;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 7
    .line 8
    iget v4, v0, Lcom/moloco/sdk/internal/publisher/A;->c:I

    .line 9
    .line 10
    sget-object v5, Lef/C;->a:Lef/C;

    .line 11
    .line 12
    iget-object v9, v0, Lcom/moloco/sdk/internal/publisher/A;->h:Lcom/moloco/sdk/internal/publisher/C;

    .line 13
    .line 14
    iget-object v8, v0, Lcom/moloco/sdk/internal/publisher/A;->e:Lcom/moloco/sdk/internal/publisher/B;

    .line 15
    .line 16
    sget-object v6, Lff/w;->a:Lff/w;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    iget-wide v10, v0, Lcom/moloco/sdk/internal/publisher/A;->g:J

    .line 20
    .line 21
    const/4 v12, 0x1

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    if-ne v4, v12, :cond_0

    .line 25
    .line 26
    iget-wide v3, v0, Lcom/moloco/sdk/internal/publisher/A;->b:J

    .line 27
    .line 28
    iget-object v12, v0, Lcom/moloco/sdk/internal/publisher/A;->a:Lcom/moloco/sdk/internal/publisher/C;

    .line 29
    .line 30
    iget-object v13, v0, Lcom/moloco/sdk/internal/publisher/A;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v13, Lcom/moloco/sdk/internal/publisher/B;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v14, v13

    .line 38
    move-wide/from16 v22, v3

    .line 39
    .line 40
    move-object/from16 v4, p1

    .line 41
    .line 42
    move-object v3, v12

    .line 43
    move-wide/from16 v12, v22

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/A;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, LEf/E;

    .line 60
    .line 61
    iput-boolean v2, v8, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 62
    .line 63
    iget-object v13, v8, Lcom/moloco/sdk/internal/publisher/B;->l:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v14, v0, Lcom/moloco/sdk/internal/publisher/A;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    if-nez v13, :cond_2

    .line 72
    .line 73
    iput-object v14, v8, Lcom/moloco/sdk/internal/publisher/B;->l:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v7, v8, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 76
    .line 77
    :cond_2
    iget-object v13, v8, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 78
    .line 79
    if-nez v13, :cond_12

    .line 80
    .line 81
    invoke-static {v4}, LEf/H;->o(LEf/E;)V

    .line 82
    .line 83
    .line 84
    iput-object v8, v0, Lcom/moloco/sdk/internal/publisher/A;->d:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v9, v0, Lcom/moloco/sdk/internal/publisher/A;->a:Lcom/moloco/sdk/internal/publisher/C;

    .line 87
    .line 88
    iput-wide v10, v0, Lcom/moloco/sdk/internal/publisher/A;->b:J

    .line 89
    .line 90
    iput v12, v0, Lcom/moloco/sdk/internal/publisher/A;->c:I

    .line 91
    .line 92
    iget-object v4, v8, Lcom/moloco/sdk/internal/publisher/B;->d:Lcom/moloco/sdk/internal/ortb/e;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v12, LEf/S;->a:LLf/e;

    .line 98
    .line 99
    sget-object v12, LLf/d;->b:LLf/d;

    .line 100
    .line 101
    new-instance v13, Lcom/moloco/sdk/internal/ortb/d;

    .line 102
    .line 103
    invoke-direct {v13, v4, v14, v7}, Lcom/moloco/sdk/internal/ortb/d;-><init>(Lcom/moloco/sdk/internal/ortb/e;Ljava/lang/String;Ljf/c;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v12, v13, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-ne v4, v3, :cond_3

    .line 111
    .line 112
    return-object v3

    .line 113
    :cond_3
    move-object v14, v8

    .line 114
    move-object v3, v9

    .line 115
    move-wide v12, v10

    .line 116
    :goto_0
    check-cast v4, Lcom/moloco/sdk/internal/A;

    .line 117
    .line 118
    instance-of v15, v4, Lcom/moloco/sdk/internal/z;

    .line 119
    .line 120
    if-eqz v15, :cond_5

    .line 121
    .line 122
    check-cast v4, Lcom/moloco/sdk/internal/z;

    .line 123
    .line 124
    iget-object v1, v4, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Lcom/moloco/sdk/internal/ortb/model/y;

    .line 127
    .line 128
    iput-object v1, v14, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 129
    .line 130
    const/4 v2, 0x6

    .line 131
    iget-object v4, v14, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v4, v7, v7, v2, v7}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v4, v14, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 138
    .line 139
    invoke-static {v14, v4}, Lcom/moloco/sdk/internal/publisher/B;->a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    if-eqz v4, :cond_4

    .line 144
    .line 145
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 146
    .line 147
    if-eqz v4, :cond_4

    .line 148
    .line 149
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_4
    move-object v4, v7

    .line 153
    :goto_1
    invoke-virtual {v3, v2, v12, v13, v4}, Lcom/moloco/sdk/internal/publisher/C;->b(Lcom/moloco/sdk/publisher/MolocoAd;JLcom/moloco/sdk/internal/ortb/model/d;)V

    .line 154
    .line 155
    .line 156
    move-object v13, v1

    .line 157
    goto/16 :goto_9

    .line 158
    .line 159
    :cond_5
    instance-of v8, v4, Lcom/moloco/sdk/internal/y;

    .line 160
    .line 161
    if-eqz v8, :cond_11

    .line 162
    .line 163
    check-cast v4, Lcom/moloco/sdk/internal/y;

    .line 164
    .line 165
    iget-object v8, v4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v8, Lcom/moloco/sdk/internal/ortb/c;

    .line 168
    .line 169
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    instance-of v9, v8, Lcom/moloco/sdk/internal/ortb/a;

    .line 173
    .line 174
    if-eqz v9, :cond_6

    .line 175
    .line 176
    sget-object v1, Lcom/moloco/sdk/internal/o;->b:Lcom/moloco/sdk/internal/o;

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    instance-of v8, v8, Lcom/moloco/sdk/internal/ortb/b;

    .line 180
    .line 181
    if-eqz v8, :cond_10

    .line 182
    .line 183
    sget-object v1, Lcom/moloco/sdk/internal/o;->c:Lcom/moloco/sdk/internal/o;

    .line 184
    .line 185
    :goto_2
    iget-object v2, v4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 186
    .line 187
    instance-of v4, v2, Lcom/moloco/sdk/internal/ortb/a;

    .line 188
    .line 189
    if-eqz v4, :cond_7

    .line 190
    .line 191
    move-object v4, v2

    .line 192
    check-cast v4, Lcom/moloco/sdk/internal/ortb/a;

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    move-object v4, v7

    .line 196
    :goto_3
    if-eqz v4, :cond_8

    .line 197
    .line 198
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/a;->a:Ljava/lang/Exception;

    .line 199
    .line 200
    move-object/from16 v18, v4

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_8
    move-object/from16 v18, v7

    .line 204
    .line 205
    :goto_4
    instance-of v4, v2, Lcom/moloco/sdk/internal/ortb/b;

    .line 206
    .line 207
    if-eqz v4, :cond_9

    .line 208
    .line 209
    check-cast v2, Lcom/moloco/sdk/internal/ortb/b;

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    move-object v2, v7

    .line 213
    :goto_5
    if-eqz v2, :cond_a

    .line 214
    .line 215
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/b;->a:Ljava/util/ArrayList;

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_a
    move-object v2, v7

    .line 219
    :goto_6
    if-eqz v2, :cond_c

    .line 220
    .line 221
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-nez v4, :cond_b

    .line 226
    .line 227
    move-object v8, v2

    .line 228
    goto :goto_7

    .line 229
    :cond_b
    move-object v8, v7

    .line 230
    :goto_7
    if-eqz v8, :cond_c

    .line 231
    .line 232
    const/4 v11, 0x0

    .line 233
    const/4 v12, 0x0

    .line 234
    const-string v9, ","

    .line 235
    .line 236
    const-string v10, " missingFields="

    .line 237
    .line 238
    const/16 v13, 0x3c

    .line 239
    .line 240
    invoke-static/range {v8 .. v13}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-nez v4, :cond_d

    .line 245
    .line 246
    :cond_c
    const-string v4, ""

    .line 247
    .line 248
    :cond_d
    sget-object v15, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 249
    .line 250
    new-instance v8, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    const-string v9, "startLoadJob failed to parse BID json string. subType="

    .line 253
    .line 254
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v17

    .line 267
    const-string v16, "AdLoad"

    .line 268
    .line 269
    const/16 v19, 0x0

    .line 270
    .line 271
    const/16 v20, 0x8

    .line 272
    .line 273
    const/16 v21, 0x0

    .line 274
    .line 275
    invoke-static/range {v15 .. v21}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    if-eqz v2, :cond_f

    .line 279
    .line 280
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-nez v4, :cond_e

    .line 285
    .line 286
    move-object v8, v2

    .line 287
    goto :goto_8

    .line 288
    :cond_e
    move-object v8, v7

    .line 289
    :goto_8
    if-eqz v8, :cond_f

    .line 290
    .line 291
    const/4 v11, 0x0

    .line 292
    const/4 v12, 0x0

    .line 293
    const-string v9, ","

    .line 294
    .line 295
    const/4 v10, 0x0

    .line 296
    const/16 v13, 0x3e

    .line 297
    .line 298
    invoke-static/range {v8 .. v13}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    if-eqz v2, :cond_f

    .line 303
    .line 304
    new-instance v4, Lef/k;

    .line 305
    .line 306
    const-string v6, "missing_fields"

    .line 307
    .line 308
    invoke-direct {v4, v6, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v4}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    :cond_f
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 316
    .line 317
    iget-object v4, v14, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v4, v2, v1, v6}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v3, v1, v7}, Lcom/moloco/sdk/internal/publisher/C;->a(Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 324
    .line 325
    .line 326
    return-object v5

    .line 327
    :cond_10
    new-instance v3, LE5/Q;

    .line 328
    .line 329
    invoke-direct {v3, v2, v1}, LE5/Q;-><init>(BI)V

    .line 330
    .line 331
    .line 332
    throw v3

    .line 333
    :cond_11
    new-instance v3, LE5/Q;

    .line 334
    .line 335
    invoke-direct {v3, v2, v1}, LE5/Q;-><init>(BI)V

    .line 336
    .line 337
    .line 338
    throw v3

    .line 339
    :cond_12
    :goto_9
    if-eqz v13, :cond_13

    .line 340
    .line 341
    invoke-static {v8, v13}, Lcom/moloco/sdk/internal/publisher/B;->a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    goto :goto_a

    .line 346
    :cond_13
    move-object v1, v7

    .line 347
    :goto_a
    if-nez v1, :cond_15

    .line 348
    .line 349
    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 350
    .line 351
    sget-object v2, Lcom/moloco/sdk/internal/o;->d:Lcom/moloco/sdk/internal/o;

    .line 352
    .line 353
    iget-object v3, v8, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v3, v1, v2, v6}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    iget-object v2, v8, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 360
    .line 361
    invoke-static {v8, v2}, Lcom/moloco/sdk/internal/publisher/B;->a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    if-eqz v2, :cond_14

    .line 366
    .line 367
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 368
    .line 369
    if-eqz v2, :cond_14

    .line 370
    .line 371
    iget-object v7, v2, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 372
    .line 373
    :cond_14
    invoke-virtual {v9, v1, v7}, Lcom/moloco/sdk/internal/publisher/C;->a(Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 374
    .line 375
    .line 376
    return-object v5

    .line 377
    :cond_15
    iget-object v2, v8, Lcom/moloco/sdk/internal/publisher/B;->c:Lkotlin/jvm/internal/i;

    .line 378
    .line 379
    invoke-interface {v2, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/h;

    .line 384
    .line 385
    iget-object v3, v8, Lcom/moloco/sdk/internal/publisher/B;->a:Ltf/l;

    .line 386
    .line 387
    new-instance v4, Ljava/lang/Long;

    .line 388
    .line 389
    invoke-direct {v4, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 390
    .line 391
    .line 392
    invoke-interface {v3, v4}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    check-cast v3, LCf/a;

    .line 397
    .line 398
    iget-wide v3, v3, LCf/a;->a:J

    .line 399
    .line 400
    new-instance v6, LDd/c;

    .line 401
    .line 402
    const/16 v7, 0x14

    .line 403
    .line 404
    const/4 v11, 0x0

    .line 405
    move-object v10, v1

    .line 406
    invoke-direct/range {v6 .. v11}, LDd/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 407
    .line 408
    .line 409
    invoke-interface {v2, v3, v4, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/h;->a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V

    .line 410
    .line 411
    .line 412
    return-object v5
.end method
