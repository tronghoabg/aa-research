.class public final Lcom/moloco/sdk/internal/publisher/nativead/m;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:J

.field public b:Lcom/moloco/sdk/internal/ortb/model/u;

.field public c:Lcom/moloco/sdk/internal/publisher/nativead/model/h;

.field public d:I

.field public final synthetic e:Lcom/moloco/sdk/internal/publisher/nativead/o;

.field public final synthetic f:Lcom/moloco/sdk/acm/l;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lcom/moloco/sdk/internal/publisher/C;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/acm/l;Ljava/lang/String;Lcom/moloco/sdk/internal/publisher/C;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->e:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->f:Lcom/moloco/sdk/acm/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->g:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->h:Lcom/moloco/sdk/internal/publisher/C;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/m;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->e:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->f:Lcom/moloco/sdk/acm/l;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->g:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/nativead/m;->h:Lcom/moloco/sdk/internal/publisher/C;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/internal/publisher/nativead/m;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/acm/l;Ljava/lang/String;Lcom/moloco/sdk/internal/publisher/C;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/m;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/nativead/m;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->d:I

    .line 6
    .line 7
    iget-object v1, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->h:Lcom/moloco/sdk/internal/publisher/C;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    const/4 v3, 0x3

    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    iget-object v8, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->e:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 14
    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    if-eq v0, v5, :cond_3

    .line 18
    .line 19
    if-eq v0, v4, :cond_2

    .line 20
    .line 21
    if-eq v0, v3, :cond_1

    .line 22
    .line 23
    if-ne v0, v2, :cond_0

    .line 24
    .line 25
    iget-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->c:Lcom/moloco/sdk/internal/publisher/nativead/model/h;

    .line 26
    .line 27
    iget-object v1, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v2, p1

    .line 33
    .line 34
    check-cast v2, Lef/n;

    .line 35
    .line 36
    iget-object v2, v2, Lef/n;->a:Ljava/lang/Object;

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    iget-wide v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->a:J

    .line 49
    .line 50
    iget-object v3, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v4, p1

    .line 56
    .line 57
    check-cast v4, Lef/n;

    .line 58
    .line 59
    iget-object v4, v4, Lef/n;->a:Ljava/lang/Object;

    .line 60
    .line 61
    move-wide/from16 v16, v0

    .line 62
    .line 63
    move-object v1, v4

    .line 64
    move-wide/from16 v4, v16

    .line 65
    .line 66
    move-object v8, v3

    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_2
    iget-wide v4, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->a:J

    .line 70
    .line 71
    iget-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 72
    .line 73
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :cond_3
    iget-wide v9, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->a:J

    .line 79
    .line 80
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object/from16 v0, p1

    .line 84
    .line 85
    check-cast v0, Lef/n;

    .line 86
    .line 87
    iget-object v0, v0, Lef/n;->a:Ljava/lang/Object;

    .line 88
    .line 89
    :cond_4
    move-wide v13, v9

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v8, Lcom/moloco/sdk/internal/publisher/nativead/o;->f:Lcom/moloco/sdk/internal/services/k;

    .line 95
    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    iget-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->f:Lcom/moloco/sdk/acm/l;

    .line 101
    .line 102
    iget-object v11, v0, Lcom/moloco/sdk/acm/l;->a:Lcom/moloco/sdk/acm/services/f;

    .line 103
    .line 104
    iget-object v11, v11, Lcom/moloco/sdk/acm/services/f;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 105
    .line 106
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 107
    .line 108
    .line 109
    move-result-wide v12

    .line 110
    invoke-virtual {v11, v12, v13}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 111
    .line 112
    .line 113
    iget-object v11, v8, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 114
    .line 115
    iget-object v12, v8, Lcom/moloco/sdk/internal/publisher/nativead/o;->h:Lcom/moloco/sdk/acm/l;

    .line 116
    .line 117
    invoke-virtual {v11, v12}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 118
    .line 119
    .line 120
    new-instance v12, Lcom/moloco/sdk/acm/h;

    .line 121
    .line 122
    sget-object v13, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 123
    .line 124
    const-string v13, "load_ad_attempted"

    .line 125
    .line 126
    invoke-direct {v12, v13}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    sget-object v13, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 130
    .line 131
    iget-object v13, v8, Lcom/moloco/sdk/internal/publisher/nativead/o;->g:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 132
    .line 133
    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 138
    .line 139
    invoke-virtual {v13, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    const-string v14, "toLowerCase(...)"

    .line 144
    .line 145
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string v14, "ad_type"

    .line 149
    .line 150
    invoke-virtual {v12, v14, v13}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v11, v12}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 154
    .line 155
    .line 156
    iput-wide v9, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->a:J

    .line 157
    .line 158
    iput v5, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->d:I

    .line 159
    .line 160
    iget-object v5, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->g:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v8, v5, v0, v1, v6}, Lcom/moloco/sdk/internal/publisher/nativead/o;->c(Lcom/moloco/sdk/internal/publisher/nativead/o;Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/C;Llf/c;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-ne v0, v7, :cond_4

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :goto_0
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-nez v5, :cond_b

    .line 174
    .line 175
    move-object v12, v0

    .line 176
    check-cast v12, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 177
    .line 178
    iget-object v0, v8, Lcom/moloco/sdk/internal/publisher/nativead/o;->i:La2/k;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    sget-object v0, LEf/S;->a:LLf/e;

    .line 184
    .line 185
    sget-object v0, LJf/n;->a:LFf/e;

    .line 186
    .line 187
    new-instance v9, Lcom/moloco/sdk/internal/publisher/nativead/l;

    .line 188
    .line 189
    const/4 v15, 0x0

    .line 190
    iget-object v10, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->h:Lcom/moloco/sdk/internal/publisher/C;

    .line 191
    .line 192
    iget-object v11, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->e:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 193
    .line 194
    invoke-direct/range {v9 .. v15}, Lcom/moloco/sdk/internal/publisher/nativead/l;-><init>(Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/internal/ortb/model/u;JLjf/c;)V

    .line 195
    .line 196
    .line 197
    iput-object v12, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 198
    .line 199
    iput-wide v13, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->a:J

    .line 200
    .line 201
    iput v4, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->d:I

    .line 202
    .line 203
    invoke-static {v0, v9, v6}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-ne v0, v7, :cond_6

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_6
    move-object v0, v12

    .line 211
    move-wide v4, v13

    .line 212
    :goto_1
    iget-object v9, v0, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 213
    .line 214
    iget-object v10, v0, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 215
    .line 216
    iget-object v10, v10, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 217
    .line 218
    iput-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 219
    .line 220
    iput-wide v4, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->a:J

    .line 221
    .line 222
    iput v3, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->d:I

    .line 223
    .line 224
    invoke-static {v8, v9, v10, v1, v6}, Lcom/moloco/sdk/internal/publisher/nativead/o;->d(Lcom/moloco/sdk/internal/publisher/nativead/o;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/d;Lcom/moloco/sdk/internal/publisher/C;Llf/c;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    if-ne v1, v7, :cond_7

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_7
    move-object v8, v0

    .line 232
    :goto_2
    invoke-static {v1}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-nez v0, :cond_a

    .line 237
    .line 238
    check-cast v1, Lcom/moloco/sdk/internal/publisher/nativead/model/h;

    .line 239
    .line 240
    iget-object v0, v8, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 241
    .line 242
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 243
    .line 244
    iput-object v8, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 245
    .line 246
    iput-object v1, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->c:Lcom/moloco/sdk/internal/publisher/nativead/model/h;

    .line 247
    .line 248
    iput v2, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->d:I

    .line 249
    .line 250
    move-object v2, v1

    .line 251
    move-object v1, v0

    .line 252
    iget-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->e:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 253
    .line 254
    iget-object v3, v6, Lcom/moloco/sdk/internal/publisher/nativead/m;->h:Lcom/moloco/sdk/internal/publisher/C;

    .line 255
    .line 256
    invoke-virtual/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/nativead/o;->a(Lcom/moloco/sdk/internal/ortb/model/d;Lcom/moloco/sdk/internal/publisher/nativead/model/h;Lcom/moloco/sdk/internal/publisher/C;JLlf/c;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-ne v0, v7, :cond_8

    .line 261
    .line 262
    :goto_3
    return-object v7

    .line 263
    :cond_8
    move-object v1, v2

    .line 264
    move-object v2, v0

    .line 265
    move-object v0, v1

    .line 266
    move-object v1, v8

    .line 267
    :goto_4
    invoke-static {v2}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    if-nez v3, :cond_9

    .line 272
    .line 273
    check-cast v2, Lcom/moloco/sdk/internal/publisher/nativead/model/n;

    .line 274
    .line 275
    new-instance v3, Lcom/moloco/sdk/internal/publisher/nativead/d;

    .line 276
    .line 277
    invoke-direct {v3, v1, v0, v2}, Lcom/moloco/sdk/internal/publisher/nativead/d;-><init>(Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/publisher/nativead/model/h;Lcom/moloco/sdk/internal/publisher/nativead/model/n;)V

    .line 278
    .line 279
    .line 280
    new-instance v0, Lef/n;

    .line 281
    .line 282
    invoke-direct {v0, v3}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    return-object v0

    .line 286
    :cond_9
    invoke-static {v3}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    new-instance v1, Lef/n;

    .line 291
    .line 292
    invoke-direct {v1, v0}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    return-object v1

    .line 296
    :cond_a
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    new-instance v1, Lef/n;

    .line 301
    .line 302
    invoke-direct {v1, v0}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    return-object v1

    .line 306
    :cond_b
    invoke-static {v5}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    new-instance v1, Lef/n;

    .line 311
    .line 312
    invoke-direct {v1, v0}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    return-object v1
.end method
