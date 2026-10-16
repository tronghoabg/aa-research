.class public final Lcom/moloco/sdk/internal/services/bidtoken/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La2/v;

.field public final b:LKd/a;

.field public final c:LG9/e;

.field public d:Z

.field public final e:LNf/d;

.field public f:LEf/H0;


# direct methods
.method public constructor <init>(La2/v;LKd/a;LG9/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/A;->a:La2/v;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/bidtoken/A;->b:LKd/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/bidtoken/A;->c:LG9/e;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/A;->d:Z

    .line 12
    .line 13
    invoke-static {}, LNf/e;->a()LNf/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/A;->e:LNf/d;

    .line 18
    .line 19
    return-void
.end method

.method public static final c(Lcom/moloco/sdk/internal/services/bidtoken/A;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "[Thread: "

    .line 6
    .line 7
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, "] "

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v4, 0x4

    .line 34
    const/4 v5, 0x0

    .line 35
    const-string v1, "ServerBidTokenServiceImpl"

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static/range {v0 .. v5}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "[Thread: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, "][sbt] "

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const-string v1, "ServerBidTokenServiceImpl"

    .line 36
    .line 37
    const/16 v5, 0xc

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/services/bidtoken/m;ZZLlf/c;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/x;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    check-cast v4, Lcom/moloco/sdk/internal/services/bidtoken/x;

    .line 13
    .line 14
    iget v5, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->i:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v5, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v5, v6

    .line 23
    iput v5, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->i:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, Lcom/moloco/sdk/internal/services/bidtoken/x;

    .line 27
    .line 28
    invoke-direct {v4, v0, v2}, Lcom/moloco/sdk/internal/services/bidtoken/x;-><init>(Lcom/moloco/sdk/internal/services/bidtoken/A;Llf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->g:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v6, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->i:I

    .line 36
    .line 37
    const-string v7, "[Thread: "

    .line 38
    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    if-eq v6, v9, :cond_2

    .line 45
    .line 46
    if-ne v6, v8, :cond_1

    .line 47
    .line 48
    iget-object v1, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lcom/moloco/sdk/internal/A;

    .line 51
    .line 52
    iget-object v4, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->a:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 53
    .line 54
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_2
    iget-boolean v1, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->f:Z

    .line 68
    .line 69
    iget-boolean v6, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->e:Z

    .line 70
    .line 71
    iget-object v9, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->d:Lcom/moloco/sdk/acm/l;

    .line 72
    .line 73
    iget-object v11, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->c:Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 74
    .line 75
    iget-object v12, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v12, Lcom/moloco/sdk/acm/recorder/b;

    .line 78
    .line 79
    iget-object v13, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->a:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 80
    .line 81
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 89
    .line 90
    const-string v2, "sbt_fetch_time_ms"

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v6, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-virtual {v11}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v11, "] fetchServerBidToken"

    .line 113
    .line 114
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {v6}, Lcom/moloco/sdk/internal/services/bidtoken/A;->d(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iput-object v0, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->a:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 125
    .line 126
    iput-object v1, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->b:Ljava/lang/Object;

    .line 127
    .line 128
    move-object/from16 v6, p2

    .line 129
    .line 130
    iput-object v6, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->c:Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 131
    .line 132
    iput-object v2, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->d:Lcom/moloco/sdk/acm/l;

    .line 133
    .line 134
    move/from16 v11, p3

    .line 135
    .line 136
    iput-boolean v11, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->e:Z

    .line 137
    .line 138
    move/from16 v12, p4

    .line 139
    .line 140
    iput-boolean v12, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->f:Z

    .line 141
    .line 142
    iput v9, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->i:I

    .line 143
    .line 144
    iget-object v9, v0, Lcom/moloco/sdk/internal/services/bidtoken/A;->a:La2/v;

    .line 145
    .line 146
    sget-object v13, LEf/S;->a:LLf/e;

    .line 147
    .line 148
    sget-object v13, LLf/d;->b:LLf/d;

    .line 149
    .line 150
    new-instance v14, Lcom/moloco/sdk/internal/services/bidtoken/d;

    .line 151
    .line 152
    invoke-direct {v14, v9, v1, v10}, Lcom/moloco/sdk/internal/services/bidtoken/d;-><init>(La2/v;Lcom/moloco/sdk/acm/recorder/c;Ljf/c;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v13, v14, v4}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    if-ne v9, v5, :cond_4

    .line 160
    .line 161
    goto/16 :goto_2

    .line 162
    .line 163
    :cond_4
    move v13, v12

    .line 164
    move-object v12, v1

    .line 165
    move v1, v13

    .line 166
    move-object v13, v9

    .line 167
    move-object v9, v2

    .line 168
    move-object v2, v13

    .line 169
    move v13, v11

    .line 170
    move-object v11, v6

    .line 171
    move v6, v13

    .line 172
    move-object v13, v0

    .line 173
    :goto_1
    check-cast v2, Lcom/moloco/sdk/internal/A;

    .line 174
    .line 175
    instance-of v14, v2, Lcom/moloco/sdk/internal/y;

    .line 176
    .line 177
    const-string v15, "sbt_fetch"

    .line 178
    .line 179
    const-string v3, "was_expiring"

    .line 180
    .line 181
    const-string v8, "async"

    .line 182
    .line 183
    const-string v10, "initial_fetch"

    .line 184
    .line 185
    const-string v0, "result"

    .line 186
    .line 187
    if-eqz v14, :cond_5

    .line 188
    .line 189
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 190
    .line 191
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 192
    .line 193
    invoke-direct {v4, v15}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 197
    .line 198
    const-string v5, "failure"

    .line 199
    .line 200
    invoke-virtual {v4, v0, v5}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    check-cast v2, Lcom/moloco/sdk/internal/y;

    .line 204
    .line 205
    iget-object v7, v2, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v7, Lcom/moloco/sdk/internal/n;

    .line 208
    .line 209
    iget v7, v7, Lcom/moloco/sdk/internal/n;->b:I

    .line 210
    .line 211
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    const-string v14, "reason"

    .line 216
    .line 217
    invoke-virtual {v4, v14, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget-boolean v7, v13, Lcom/moloco/sdk/internal/services/bidtoken/A;->d:Z

    .line 221
    .line 222
    invoke-static {v7}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-virtual {v4, v10, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v4, v3, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v6}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-virtual {v4, v8, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    check-cast v12, Lcom/moloco/sdk/acm/recorder/c;

    .line 244
    .line 245
    invoke-virtual {v12, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v9, v0, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, v2, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lcom/moloco/sdk/internal/n;

    .line 254
    .line 255
    iget v2, v0, Lcom/moloco/sdk/internal/n;->b:I

    .line 256
    .line 257
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v9, v14, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-boolean v2, v13, Lcom/moloco/sdk/internal/services/bidtoken/A;->d:Z

    .line 265
    .line 266
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v9, v10, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v9, v3, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v6}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-virtual {v9, v8, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v9}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 288
    .line 289
    .line 290
    sget-object v13, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 291
    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string v2, "bidtoken request failed: "

    .line 295
    .line 296
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget v2, v0, Lcom/moloco/sdk/internal/n;->b:I

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v2, ", details: "

    .line 305
    .line 306
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    iget-object v0, v0, Lcom/moloco/sdk/internal/n;->a:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    const/16 v16, 0x0

    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const-string v14, "ServerBidTokenServiceImpl"

    .line 323
    .line 324
    const/16 v18, 0xc

    .line 325
    .line 326
    const/16 v19, 0x0

    .line 327
    .line 328
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    return-object v11

    .line 332
    :cond_5
    instance-of v11, v2, Lcom/moloco/sdk/internal/z;

    .line 333
    .line 334
    if-eqz v11, :cond_7

    .line 335
    .line 336
    new-instance v11, Lcom/moloco/sdk/acm/h;

    .line 337
    .line 338
    sget-object v14, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 339
    .line 340
    invoke-direct {v11, v15}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    sget-object v14, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 344
    .line 345
    const-string v14, "success"

    .line 346
    .line 347
    invoke-virtual {v11, v0, v14}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    iget-boolean v15, v13, Lcom/moloco/sdk/internal/services/bidtoken/A;->d:Z

    .line 351
    .line 352
    invoke-static {v15}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    invoke-virtual {v11, v10, v15}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    invoke-virtual {v11, v3, v15}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-static {v6}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v15

    .line 370
    invoke-virtual {v11, v8, v15}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    check-cast v12, Lcom/moloco/sdk/acm/recorder/c;

    .line 374
    .line 375
    invoke-virtual {v12, v11}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v0, v14}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    iget-boolean v11, v13, Lcom/moloco/sdk/internal/services/bidtoken/A;->d:Z

    .line 382
    .line 383
    invoke-static {v11}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v11

    .line 387
    invoke-virtual {v9, v10, v11}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {v9, v3, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-static {v6}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-virtual {v9, v8, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v9}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 405
    .line 406
    .line 407
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 408
    .line 409
    const-string v3, "sbt_cached"

    .line 410
    .line 411
    invoke-direct {v1, v3}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    const-string v3, "false"

    .line 415
    .line 416
    invoke-virtual {v1, v0, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    iget-boolean v0, v13, Lcom/moloco/sdk/internal/services/bidtoken/A;->d:Z

    .line 420
    .line 421
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v1, v10, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-static {v6}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v1, v8, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 436
    .line 437
    .line 438
    new-instance v0, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    const-string v1, "] bidtoken request success"

    .line 455
    .line 456
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-static {v0}, Lcom/moloco/sdk/internal/services/bidtoken/A;->d(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    new-instance v0, Lcom/moloco/sdk/internal/services/bidtoken/y;

    .line 467
    .line 468
    move-object v1, v2

    .line 469
    check-cast v1, Lcom/moloco/sdk/internal/z;

    .line 470
    .line 471
    const/4 v3, 0x0

    .line 472
    invoke-direct {v0, v13, v1, v3}, Lcom/moloco/sdk/internal/services/bidtoken/y;-><init>(Lcom/moloco/sdk/internal/services/bidtoken/A;Lcom/moloco/sdk/internal/z;Ljf/c;)V

    .line 473
    .line 474
    .line 475
    iput-object v13, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->a:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 476
    .line 477
    iput-object v2, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->b:Ljava/lang/Object;

    .line 478
    .line 479
    iput-object v3, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->c:Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 480
    .line 481
    iput-object v3, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->d:Lcom/moloco/sdk/acm/l;

    .line 482
    .line 483
    const/4 v1, 0x2

    .line 484
    iput v1, v4, Lcom/moloco/sdk/internal/services/bidtoken/x;->i:I

    .line 485
    .line 486
    iget-object v1, v13, Lcom/moloco/sdk/internal/services/bidtoken/A;->e:LNf/d;

    .line 487
    .line 488
    invoke-static {v1, v0, v4}, LFe/g;->g(LNf/d;Ltf/l;Llf/c;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    if-ne v0, v5, :cond_6

    .line 493
    .line 494
    :goto_2
    return-object v5

    .line 495
    :cond_6
    move-object v1, v2

    .line 496
    move-object v4, v13

    .line 497
    :goto_3
    check-cast v1, Lcom/moloco/sdk/internal/z;

    .line 498
    .line 499
    iget-object v0, v1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v0, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 502
    .line 503
    const/4 v1, 0x0

    .line 504
    iput-boolean v1, v4, Lcom/moloco/sdk/internal/services/bidtoken/A;->d:Z

    .line 505
    .line 506
    return-object v0

    .line 507
    :cond_7
    const/4 v1, 0x0

    .line 508
    new-instance v0, LE5/Q;

    .line 509
    .line 510
    const/16 v2, 0x9

    .line 511
    .line 512
    invoke-direct {v0, v1, v2}, LE5/Q;-><init>(BI)V

    .line 513
    .line 514
    .line 515
    throw v0
.end method

.method public final b(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/services/bidtoken/n;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[Thread: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "] Fetching bidToken(), acquiring lock"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lcom/moloco/sdk/internal/services/bidtoken/A;->d(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/moloco/sdk/internal/services/bidtoken/w;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, p1, v1}, Lcom/moloco/sdk/internal/services/bidtoken/w;-><init>(Lcom/moloco/sdk/internal/services/bidtoken/A;Lcom/moloco/sdk/acm/recorder/c;Ljf/c;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/A;->e:LNf/d;

    .line 38
    .line 39
    invoke-static {p1, v0, p2}, LFe/g;->g(LNf/d;Ltf/l;Llf/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method
