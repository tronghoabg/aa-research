.class public final Lcom/moloco/sdk/internal/services/bidtoken/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/bidtoken/A;

.field public final b:LR8/a;

.field public final c:LNf/d;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/bidtoken/A;LR8/a;)V
    .locals 1

    .line 1
    const-string v0, "serverBidTokenService"

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
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/o;->a:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/bidtoken/o;->b:LR8/a;

    .line 12
    .line 13
    invoke-static {}, LNf/e;->a()LNf/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/o;->c:LNf/d;

    .line 18
    .line 19
    return-void
.end method

.method public static b(Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/acm/recorder/b;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "bid_token_fetch"

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance v2, Lcom/moloco/sdk/acm/h;

    .line 8
    .line 9
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 15
    .line 16
    const-string v0, "failure"

    .line 17
    .line 18
    invoke-virtual {v2, v1, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "reason"

    .line 22
    .line 23
    invoke-virtual {v2, v3, p2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Lcom/moloco/sdk/acm/recorder/c;

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3, p2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p2, Lcom/moloco/sdk/acm/h;

    .line 42
    .line 43
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 44
    .line 45
    invoke-direct {p2, v0}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 49
    .line 50
    const-string v0, "success"

    .line 51
    .line 52
    invoke-virtual {p2, v1, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast p1, Lcom/moloco/sdk/acm/recorder/c;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/acm/recorder/b;Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/n;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/moloco/sdk/internal/services/bidtoken/n;

    .line 11
    .line 12
    iget v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/moloco/sdk/internal/services/bidtoken/n;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/moloco/sdk/internal/services/bidtoken/n;-><init>(Lcom/moloco/sdk/internal/services/bidtoken/o;Llf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->f:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    const-string v8, ""

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v7, :cond_3

    .line 44
    .line 45
    if-eq v4, v6, :cond_2

    .line 46
    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    iget-object v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->d:Lcom/moloco/sdk/acm/l;

    .line 52
    .line 53
    iget-object v5, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->c:LNf/a;

    .line 54
    .line 55
    check-cast v5, LNf/a;

    .line 56
    .line 57
    iget-object v6, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 58
    .line 59
    iget-object v2, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 60
    .line 61
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast v0, Lef/n;

    .line 65
    .line 66
    iget-object v0, v0, Lef/n;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_8

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
    iget-object v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->d:Lcom/moloco/sdk/acm/l;

    .line 82
    .line 83
    iget-object v6, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->c:LNf/a;

    .line 84
    .line 85
    check-cast v6, LNf/a;

    .line 86
    .line 87
    iget-object v7, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 88
    .line 89
    iget-object v10, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 90
    .line 91
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    goto/16 :goto_9

    .line 97
    .line 98
    :cond_3
    iget-object v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->c:LNf/a;

    .line 99
    .line 100
    check-cast v4, LNf/a;

    .line 101
    .line 102
    iget-object v7, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 103
    .line 104
    iget-object v10, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 105
    .line 106
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v0, v7

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 115
    .line 116
    move-object/from16 v0, p1

    .line 117
    .line 118
    iput-object v0, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 119
    .line 120
    iget-object v4, v1, Lcom/moloco/sdk/internal/services/bidtoken/o;->c:LNf/d;

    .line 121
    .line 122
    iput-object v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->c:LNf/a;

    .line 123
    .line 124
    iput v7, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    .line 125
    .line 126
    invoke-virtual {v4, v2}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    if-ne v7, v3, :cond_5

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    move-object v10, v1

    .line 134
    :goto_1
    :try_start_2
    sget-object v7, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 135
    .line 136
    const-string v7, "bid_token_fetch_time"

    .line 137
    .line 138
    check-cast v0, Lcom/moloco/sdk/acm/recorder/c;

    .line 139
    .line 140
    invoke-virtual {v0, v7}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    iget-object v11, v10, Lcom/moloco/sdk/internal/services/bidtoken/o;->a:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 145
    .line 146
    iput-object v10, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 147
    .line 148
    iput-object v0, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 149
    .line 150
    move-object v12, v4

    .line 151
    check-cast v12, LNf/a;

    .line 152
    .line 153
    iput-object v12, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->c:LNf/a;

    .line 154
    .line 155
    iput-object v7, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->d:Lcom/moloco/sdk/acm/l;

    .line 156
    .line 157
    iput v6, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    .line 158
    .line 159
    invoke-virtual {v11, v0, v2}, Lcom/moloco/sdk/internal/services/bidtoken/A;->b(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/services/bidtoken/n;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 163
    if-ne v6, v3, :cond_6

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    move-object/from16 v17, v7

    .line 167
    .line 168
    move-object v7, v0

    .line 169
    move-object v0, v6

    .line 170
    move-object v6, v4

    .line 171
    move-object/from16 v4, v17

    .line 172
    .line 173
    :goto_2
    :try_start_3
    check-cast v0, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 174
    .line 175
    iget-object v11, v0, Lcom/moloco/sdk/internal/services/bidtoken/m;->a:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    if-lez v12, :cond_a

    .line 182
    .line 183
    iget-object v12, v0, Lcom/moloco/sdk/internal/services/bidtoken/m;->b:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/bidtoken/m;->c:Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 186
    .line 187
    iget-object v13, v10, Lcom/moloco/sdk/internal/services/bidtoken/o;->b:LR8/a;

    .line 188
    .line 189
    iput-object v10, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->a:Lcom/moloco/sdk/internal/services/bidtoken/o;

    .line 190
    .line 191
    iput-object v7, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 192
    .line 193
    move-object v14, v6

    .line 194
    check-cast v14, LNf/a;

    .line 195
    .line 196
    iput-object v14, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->c:LNf/a;

    .line 197
    .line 198
    iput-object v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->d:Lcom/moloco/sdk/acm/l;

    .line 199
    .line 200
    iput-object v11, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->e:Ljava/lang/String;

    .line 201
    .line 202
    iput v5, v2, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    .line 203
    .line 204
    invoke-virtual {v13, v7, v12, v0, v2}, LR8/a;->a(Lcom/moloco/sdk/acm/recorder/b;Ljava/lang/String;Lcom/moloco/sdk/internal/services/bidtoken/g;Llf/c;)Ljava/io/Serializable;

    .line 205
    .line 206
    .line 207
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 208
    if-ne v0, v3, :cond_7

    .line 209
    .line 210
    :goto_3
    return-object v3

    .line 211
    :cond_7
    move-object v5, v6

    .line 212
    move-object v6, v7

    .line 213
    move-object v2, v10

    .line 214
    move-object v3, v11

    .line 215
    :goto_4
    :try_start_4
    instance-of v7, v0, Lef/m;

    .line 216
    .line 217
    if-eqz v7, :cond_8

    .line 218
    .line 219
    move-object v0, v8

    .line 220
    :cond_8
    check-cast v0, Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-nez v7, :cond_9

    .line 227
    .line 228
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    const-string v11, "BidTokenServiceImpl"

    .line 234
    .line 235
    const-string v12, "CBT has error"

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const/4 v14, 0x0

    .line 239
    const/16 v15, 0xc

    .line 240
    .line 241
    const/16 v16, 0x0

    .line 242
    .line 243
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    const-string v0, "client"

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_9
    new-instance v7, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const/16 v3, 0x3a

    .line 258
    .line 259
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 269
    move-object v0, v9

    .line 270
    :goto_5
    move-object v10, v2

    .line 271
    move-object v7, v6

    .line 272
    goto :goto_6

    .line 273
    :cond_a
    :try_start_5
    const-string v0, "server"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 274
    .line 275
    move-object v5, v6

    .line 276
    :goto_6
    :try_start_6
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v4, v7, v0}, Lcom/moloco/sdk/internal/services/bidtoken/o;->b(Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/acm/recorder/b;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 280
    .line 281
    .line 282
    invoke-interface {v5, v9}, LNf/a;->a(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    return-object v8

    .line 286
    :goto_7
    move-object v5, v4

    .line 287
    goto :goto_8

    .line 288
    :catchall_2
    move-exception v0

    .line 289
    goto :goto_7

    .line 290
    :goto_8
    move-object v6, v5

    .line 291
    :goto_9
    invoke-interface {v6, v9}, LNf/a;->a(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    throw v0
.end method
