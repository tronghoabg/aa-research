.class public final Lcom/moloco/sdk/internal/ilrd/c;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lkotlin/jvm/internal/C;

.field public b:LNf/a;

.field public c:Lcom/moloco/sdk/internal/ilrd/m;

.field public d:Lcom/moloco/sdk/internal/ilrd/t;

.field public e:I

.field public final synthetic f:Lcom/moloco/sdk/internal/ilrd/m;

.field public final synthetic g:Lcom/moloco/sdk/internal/ilrd/t;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/ilrd/m;Lcom/moloco/sdk/internal/ilrd/t;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/c;->f:Lcom/moloco/sdk/internal/ilrd/m;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/ilrd/c;->g:Lcom/moloco/sdk/internal/ilrd/t;

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
    new-instance p1, Lcom/moloco/sdk/internal/ilrd/c;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/c;->f:Lcom/moloco/sdk/internal/ilrd/m;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/ilrd/c;->g:Lcom/moloco/sdk/internal/ilrd/t;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/moloco/sdk/internal/ilrd/c;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Lcom/moloco/sdk/internal/ilrd/t;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/ilrd/c;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/ilrd/c;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/ilrd/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "Event id "

    .line 4
    .line 5
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 6
    .line 7
    iget v3, v1, Lcom/moloco/sdk/internal/ilrd/c;->e:I

    .line 8
    .line 9
    iget-object v4, v1, Lcom/moloco/sdk/internal/ilrd/c;->f:Lcom/moloco/sdk/internal/ilrd/m;

    .line 10
    .line 11
    sget-object v5, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x3

    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x1

    .line 18
    if-eqz v3, :cond_4

    .line 19
    .line 20
    if-eq v3, v10, :cond_3

    .line 21
    .line 22
    if-eq v3, v9, :cond_2

    .line 23
    .line 24
    if-eq v3, v8, :cond_1

    .line 25
    .line 26
    if-ne v3, v7, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v5

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    iget-object v0, v1, Lcom/moloco/sdk/internal/ilrd/c;->c:Lcom/moloco/sdk/internal/ilrd/m;

    .line 41
    .line 42
    iget-object v3, v1, Lcom/moloco/sdk/internal/ilrd/c;->b:LNf/a;

    .line 43
    .line 44
    check-cast v3, LNf/a;

    .line 45
    .line 46
    iget-object v8, v1, Lcom/moloco/sdk/internal/ilrd/c;->a:Lkotlin/jvm/internal/C;

    .line 47
    .line 48
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 49
    .line 50
    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :cond_2
    iget-object v3, v1, Lcom/moloco/sdk/internal/ilrd/c;->d:Lcom/moloco/sdk/internal/ilrd/t;

    .line 54
    .line 55
    iget-object v9, v1, Lcom/moloco/sdk/internal/ilrd/c;->c:Lcom/moloco/sdk/internal/ilrd/m;

    .line 56
    .line 57
    iget-object v11, v1, Lcom/moloco/sdk/internal/ilrd/c;->b:LNf/a;

    .line 58
    .line 59
    check-cast v11, LNf/a;

    .line 60
    .line 61
    iget-object v12, v1, Lcom/moloco/sdk/internal/ilrd/c;->a:Lkotlin/jvm/internal/C;

    .line 62
    .line 63
    :try_start_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    .line 66
    move-object v8, v12

    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto/16 :goto_b

    .line 71
    .line 72
    :cond_3
    iget-object v3, v1, Lcom/moloco/sdk/internal/ilrd/c;->d:Lcom/moloco/sdk/internal/ilrd/t;

    .line 73
    .line 74
    iget-object v11, v1, Lcom/moloco/sdk/internal/ilrd/c;->c:Lcom/moloco/sdk/internal/ilrd/m;

    .line 75
    .line 76
    iget-object v12, v1, Lcom/moloco/sdk/internal/ilrd/c;->b:LNf/a;

    .line 77
    .line 78
    check-cast v12, LNf/a;

    .line 79
    .line 80
    iget-object v13, v1, Lcom/moloco/sdk/internal/ilrd/c;->a:Lkotlin/jvm/internal/C;

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v13, Lkotlin/jvm/internal/C;

    .line 90
    .line 91
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v13, v1, Lcom/moloco/sdk/internal/ilrd/c;->a:Lkotlin/jvm/internal/C;

    .line 95
    .line 96
    iget-object v3, v4, Lcom/moloco/sdk/internal/ilrd/m;->p:LNf/d;

    .line 97
    .line 98
    iput-object v3, v1, Lcom/moloco/sdk/internal/ilrd/c;->b:LNf/a;

    .line 99
    .line 100
    iput-object v4, v1, Lcom/moloco/sdk/internal/ilrd/c;->c:Lcom/moloco/sdk/internal/ilrd/m;

    .line 101
    .line 102
    iget-object v11, v1, Lcom/moloco/sdk/internal/ilrd/c;->g:Lcom/moloco/sdk/internal/ilrd/t;

    .line 103
    .line 104
    iput-object v11, v1, Lcom/moloco/sdk/internal/ilrd/c;->d:Lcom/moloco/sdk/internal/ilrd/t;

    .line 105
    .line 106
    iput v10, v1, Lcom/moloco/sdk/internal/ilrd/c;->e:I

    .line 107
    .line 108
    invoke-virtual {v3, v1}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    if-ne v12, v2, :cond_5

    .line 113
    .line 114
    goto/16 :goto_a

    .line 115
    .line 116
    :cond_5
    move-object v12, v3

    .line 117
    move-object v3, v11

    .line 118
    move-object v11, v4

    .line 119
    :goto_0
    :try_start_2
    invoke-virtual {v11}, Lcom/moloco/sdk/internal/ilrd/m;->c()V

    .line 120
    .line 121
    .line 122
    new-instance v14, Lcom/moloco/sdk/internal/ilrd/f;

    .line 123
    .line 124
    invoke-direct {v14, v11, v6}, Lcom/moloco/sdk/internal/ilrd/f;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 125
    .line 126
    .line 127
    iget-object v15, v11, Lcom/moloco/sdk/internal/ilrd/m;->m:LC8/i;

    .line 128
    .line 129
    iget-wide v7, v11, Lcom/moloco/sdk/internal/ilrd/m;->d:J

    .line 130
    .line 131
    invoke-virtual {v15, v7, v8, v14}, LC8/i;->b(JLtf/l;)V

    .line 132
    .line 133
    .line 134
    iget-object v7, v11, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 135
    .line 136
    if-eqz v7, :cond_6

    .line 137
    .line 138
    invoke-virtual {v7, v3}, Lcom/moloco/sdk/internal/ilrd/r;->a(Lcom/moloco/sdk/internal/ilrd/t;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    move-object v11, v12

    .line 144
    goto/16 :goto_b

    .line 145
    .line 146
    :cond_6
    :goto_1
    iput-object v13, v1, Lcom/moloco/sdk/internal/ilrd/c;->a:Lkotlin/jvm/internal/C;

    .line 147
    .line 148
    move-object v7, v12

    .line 149
    check-cast v7, LNf/a;

    .line 150
    .line 151
    iput-object v7, v1, Lcom/moloco/sdk/internal/ilrd/c;->b:LNf/a;

    .line 152
    .line 153
    iput-object v11, v1, Lcom/moloco/sdk/internal/ilrd/c;->c:Lcom/moloco/sdk/internal/ilrd/m;

    .line 154
    .line 155
    iput-object v3, v1, Lcom/moloco/sdk/internal/ilrd/c;->d:Lcom/moloco/sdk/internal/ilrd/t;

    .line 156
    .line 157
    iput v9, v1, Lcom/moloco/sdk/internal/ilrd/c;->e:I

    .line 158
    .line 159
    iget-object v7, v11, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 160
    .line 161
    if-nez v7, :cond_7

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    sget-object v8, LEf/S;->a:LLf/e;

    .line 165
    .line 166
    new-instance v9, Lcom/moloco/sdk/internal/ilrd/l;

    .line 167
    .line 168
    invoke-direct {v9, v7, v11, v6}, Lcom/moloco/sdk/internal/ilrd/l;-><init>(Lcom/moloco/sdk/internal/ilrd/r;Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v8, v9, v1}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 175
    if-ne v7, v2, :cond_8

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_8
    :goto_2
    move-object v7, v5

    .line 179
    :goto_3
    if-ne v7, v2, :cond_9

    .line 180
    .line 181
    goto/16 :goto_a

    .line 182
    .line 183
    :cond_9
    move-object v9, v11

    .line 184
    move-object v11, v12

    .line 185
    move-object v8, v13

    .line 186
    :goto_4
    :try_start_3
    invoke-static {v9, v3}, Lcom/moloco/sdk/internal/ilrd/m;->a(Lcom/moloco/sdk/internal/ilrd/m;Lcom/moloco/sdk/internal/ilrd/t;)Lcom/moloco/sdk/f0;

    .line 187
    .line 188
    .line 189
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    iget-object v7, v9, Lcom/moloco/sdk/internal/ilrd/m;->r:Ljava/util/ArrayList;

    .line 191
    .line 192
    :try_start_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 199
    .line 200
    const-string v17, "IlrdEventsRepository"

    .line 201
    .line 202
    new-instance v12, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Lcom/moloco/sdk/f0;->getEventId()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v0, " added. Count: "

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v0, ", current events in session: "

    .line 227
    .line 228
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    iget-object v0, v9, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 232
    .line 233
    if-eqz v0, :cond_a

    .line 234
    .line 235
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/ilrd/r;->b()Lcom/moloco/sdk/internal/ilrd/o;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    goto :goto_5

    .line 240
    :cond_a
    move-object v0, v6

    .line 241
    :goto_5
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v18

    .line 248
    const/16 v19, 0x0

    .line 249
    .line 250
    const/16 v20, 0x0

    .line 251
    .line 252
    const/16 v21, 0xc

    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    iput-object v8, v1, Lcom/moloco/sdk/internal/ilrd/c;->a:Lkotlin/jvm/internal/C;

    .line 260
    .line 261
    move-object v0, v11

    .line 262
    check-cast v0, LNf/a;

    .line 263
    .line 264
    iput-object v0, v1, Lcom/moloco/sdk/internal/ilrd/c;->b:LNf/a;

    .line 265
    .line 266
    iput-object v9, v1, Lcom/moloco/sdk/internal/ilrd/c;->c:Lcom/moloco/sdk/internal/ilrd/m;

    .line 267
    .line 268
    iput-object v6, v1, Lcom/moloco/sdk/internal/ilrd/c;->d:Lcom/moloco/sdk/internal/ilrd/t;

    .line 269
    .line 270
    const/4 v0, 0x3

    .line 271
    iput v0, v1, Lcom/moloco/sdk/internal/ilrd/c;->e:I

    .line 272
    .line 273
    sget-object v0, LEf/S;->a:LLf/e;

    .line 274
    .line 275
    new-instance v3, Lcom/moloco/sdk/internal/ilrd/k;

    .line 276
    .line 277
    invoke-direct {v3, v9, v6}, Lcom/moloco/sdk/internal/ilrd/k;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v3, v1}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 284
    if-ne v0, v2, :cond_b

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_b
    move-object v0, v5

    .line 288
    :goto_6
    if-ne v0, v2, :cond_c

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_c
    move-object v0, v9

    .line 292
    move-object v3, v11

    .line 293
    :goto_7
    :try_start_5
    iget-object v7, v0, Lcom/moloco/sdk/internal/ilrd/m;->r:Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    iget v0, v0, Lcom/moloco/sdk/internal/ilrd/m;->e:I

    .line 300
    .line 301
    if-lt v7, v0, :cond_d

    .line 302
    .line 303
    move v0, v10

    .line 304
    goto :goto_8

    .line 305
    :cond_d
    const/4 v0, 0x0

    .line 306
    :goto_8
    if-eqz v0, :cond_e

    .line 307
    .line 308
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 309
    .line 310
    const-string v17, "IlrdEventsRepository"

    .line 311
    .line 312
    const-string v18, "batch size reached"

    .line 313
    .line 314
    const/16 v21, 0xc

    .line 315
    .line 316
    const/16 v22, 0x0

    .line 317
    .line 318
    const/16 v19, 0x0

    .line 319
    .line 320
    const/16 v20, 0x0

    .line 321
    .line 322
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    goto :goto_9

    .line 326
    :catchall_2
    move-exception v0

    .line 327
    goto :goto_c

    .line 328
    :cond_e
    :goto_9
    if-eqz v0, :cond_f

    .line 329
    .line 330
    iput-boolean v10, v8, Lkotlin/jvm/internal/C;->a:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 331
    .line 332
    :cond_f
    invoke-interface {v3, v6}, LNf/a;->a(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    iget-boolean v0, v8, Lkotlin/jvm/internal/C;->a:Z

    .line 336
    .line 337
    if-eqz v0, :cond_10

    .line 338
    .line 339
    iput-object v6, v1, Lcom/moloco/sdk/internal/ilrd/c;->a:Lkotlin/jvm/internal/C;

    .line 340
    .line 341
    iput-object v6, v1, Lcom/moloco/sdk/internal/ilrd/c;->b:LNf/a;

    .line 342
    .line 343
    iput-object v6, v1, Lcom/moloco/sdk/internal/ilrd/c;->c:Lcom/moloco/sdk/internal/ilrd/m;

    .line 344
    .line 345
    const/4 v0, 0x4

    .line 346
    iput v0, v1, Lcom/moloco/sdk/internal/ilrd/c;->e:I

    .line 347
    .line 348
    invoke-static {v4, v1}, Lcom/moloco/sdk/internal/ilrd/m;->d(Lcom/moloco/sdk/internal/ilrd/m;Llf/c;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    if-ne v0, v2, :cond_10

    .line 353
    .line 354
    :goto_a
    return-object v2

    .line 355
    :cond_10
    return-object v5

    .line 356
    :goto_b
    move-object v3, v11

    .line 357
    :goto_c
    invoke-interface {v3, v6}, LNf/a;->a(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    throw v0
.end method
