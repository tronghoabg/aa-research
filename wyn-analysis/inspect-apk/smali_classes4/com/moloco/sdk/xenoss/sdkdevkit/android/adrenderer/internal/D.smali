.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->e:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 4
    .line 5
    iget-wide v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->e:J

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->b:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->a:I

    .line 6
    .line 7
    sget-object v3, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 16
    .line 17
    if-eqz v2, :cond_3

    .line 18
    .line 19
    if-eq v2, v8, :cond_2

    .line 20
    .line 21
    if-eq v2, v7, :cond_1

    .line 22
    .line 23
    if-ne v2, v5, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :cond_1
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v8, v2

    .line 46
    move-object/from16 v2, p1

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_2
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, LEf/K;

    .line 53
    .line 54
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LEf/L0; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    move-object/from16 v8, p1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, LEf/E;

    .line 66
    .line 67
    iget-object v10, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 68
    .line 69
    instance-of v10, v10, Lcom/moloco/sdk/internal/z;

    .line 70
    .line 71
    if-eqz v10, :cond_4

    .line 72
    .line 73
    invoke-interface {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->a()V

    .line 74
    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_4
    new-instance v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C;

    .line 78
    .line 79
    iget-wide v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->e:J

    .line 80
    .line 81
    invoke-direct {v10, v11, v12, v9, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C;-><init>(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Ljf/c;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v2, v6, v10, v5}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    iget-object v11, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->a:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 89
    .line 90
    iget-object v11, v11, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 91
    .line 92
    iget-object v11, v11, Lcom/moloco/sdk/internal/ortb/model/w;->a:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 93
    .line 94
    if-eqz v11, :cond_5

    .line 95
    .line 96
    iget-object v11, v11, Lcom/moloco/sdk/internal/ortb/model/h0;->i:Lcom/moloco/sdk/internal/ortb/model/F;

    .line 97
    .line 98
    if-eqz v11, :cond_5

    .line 99
    .line 100
    invoke-static {v11}, Lp7/b;->a(Lcom/moloco/sdk/internal/ortb/model/F;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    move-object v15, v11

    .line 105
    goto :goto_0

    .line 106
    :cond_5
    move-object v15, v6

    .line 107
    :goto_0
    new-instance v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A;

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    iget-wide v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->e:J

    .line 112
    .line 113
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 114
    .line 115
    move-object/from16 v16, v11

    .line 116
    .line 117
    invoke-direct/range {v12 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A;-><init>(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Ljf/c;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v6, v12, v5}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :try_start_1
    iput-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->b:Ljava/lang/Object;

    .line 125
    .line 126
    iput v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->a:I

    .line 127
    .line 128
    invoke-virtual {v10, v0}, LEf/z0;->p(Ljf/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    if-ne v8, v1, :cond_6

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_6
    :goto_1
    check-cast v8, Lcom/moloco/sdk/internal/A;
    :try_end_1
    .catch LEf/L0; {:try_start_1 .. :try_end_1} :catch_0

    .line 136
    .line 137
    instance-of v10, v8, Lcom/moloco/sdk/internal/z;

    .line 138
    .line 139
    if-eqz v10, :cond_b

    .line 140
    .line 141
    check-cast v8, Lcom/moloco/sdk/internal/z;

    .line 142
    .line 143
    iget-object v8, v8, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 146
    .line 147
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->b:Ljava/lang/Object;

    .line 148
    .line 149
    iput v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->a:I

    .line 150
    .line 151
    invoke-interface {v2, v0}, LEf/K;->await(Ljf/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-ne v2, v1, :cond_7

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    :goto_2
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 159
    .line 160
    invoke-static {v8, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    new-instance v7, Lcom/moloco/sdk/internal/z;

    .line 165
    .line 166
    invoke-direct {v7, v2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iput-object v7, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 173
    .line 174
    iget-object v7, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->f:Lcom/moloco/sdk/acm/recorder/c;

    .line 175
    .line 176
    if-eqz v7, :cond_8

    .line 177
    .line 178
    sget-object v8, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 179
    .line 180
    const-string v8, "vast_show_file_not_exists_load_to_show_ms"

    .line 181
    .line 182
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    goto :goto_3

    .line 187
    :cond_8
    move-object v7, v6

    .line 188
    :goto_3
    iput-object v7, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->k:Lcom/moloco/sdk/acm/l;

    .line 189
    .line 190
    iput-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->b:Ljava/lang/Object;

    .line 191
    .line 192
    iput v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;->a:I

    .line 193
    .line 194
    sget-object v5, LEf/S;->a:LLf/e;

    .line 195
    .line 196
    sget-object v5, LLf/d;->b:LLf/d;

    .line 197
    .line 198
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y;

    .line 199
    .line 200
    invoke-direct {v7, v9, v2, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;Ljf/c;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v5, v7, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    if-ne v2, v1, :cond_9

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_9
    move-object v2, v3

    .line 211
    :goto_4
    if-ne v2, v1, :cond_a

    .line 212
    .line 213
    :goto_5
    return-object v1

    .line 214
    :cond_a
    :goto_6
    iget-object v1, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->h:LHf/x0;

    .line 215
    .line 216
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v6, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    invoke-interface {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->a()V

    .line 225
    .line 226
    .line 227
    return-object v3

    .line 228
    :cond_b
    instance-of v1, v8, Lcom/moloco/sdk/internal/y;

    .line 229
    .line 230
    if-eqz v1, :cond_c

    .line 231
    .line 232
    check-cast v8, Lcom/moloco/sdk/internal/y;

    .line 233
    .line 234
    iget-object v1, v8, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 237
    .line 238
    invoke-static {v9, v2, v4, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;LEf/K;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 239
    .line 240
    .line 241
    return-object v3

    .line 242
    :cond_c
    new-instance v1, LE5/Q;

    .line 243
    .line 244
    const/16 v2, 0x9

    .line 245
    .line 246
    const/4 v3, 0x0

    .line 247
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 248
    .line 249
    .line 250
    throw v1

    .line 251
    :catch_0
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 252
    .line 253
    const-string v12, "main VAST ad didn\'t load due to timeout"

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const-string v11, "VastAdLoad"

    .line 257
    .line 258
    const/4 v14, 0x4

    .line 259
    const/4 v15, 0x0

    .line 260
    invoke-static/range {v10 .. v15}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v2, v6}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 264
    .line 265
    .line 266
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 267
    .line 268
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 269
    .line 270
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    iput-object v2, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 277
    .line 278
    invoke-interface {v4, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V

    .line 279
    .line 280
    .line 281
    return-object v3
.end method
