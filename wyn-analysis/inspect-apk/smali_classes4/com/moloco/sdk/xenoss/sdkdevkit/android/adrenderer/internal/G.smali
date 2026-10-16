.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LEf/L;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

.field public final synthetic e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

.field public final synthetic f:J


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->f:J

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
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 4
    .line 5
    iget-wide v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->f:J

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->b:I

    .line 6
    .line 7
    sget-object v5, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 10
    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x4

    .line 14
    const/4 v10, 0x2

    .line 15
    const/4 v11, 0x1

    .line 16
    iget-object v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 17
    .line 18
    if-eqz v4, :cond_4

    .line 19
    .line 20
    if-eq v4, v11, :cond_3

    .line 21
    .line 22
    if-eq v4, v10, :cond_2

    .line 23
    .line 24
    if-eq v4, v7, :cond_1

    .line 25
    .line 26
    if-ne v4, v9, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_1
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v2, p1

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_2
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->a:LEf/L;

    .line 53
    .line 54
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v10, Lcom/moloco/sdk/internal/A;

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 v1, p1

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_3
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, LEf/E;

    .line 68
    .line 69
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v11, p1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, LEf/E;

    .line 81
    .line 82
    iget-object v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 83
    .line 84
    instance-of v13, v13, Lcom/moloco/sdk/internal/z;

    .line 85
    .line 86
    if-eqz v13, :cond_5

    .line 87
    .line 88
    invoke-interface {v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->a()V

    .line 89
    .line 90
    .line 91
    return-object v5

    .line 92
    :cond_5
    iget-object v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 93
    .line 94
    iget-object v14, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->a:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 95
    .line 96
    iget-object v15, v14, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v14, v14, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 99
    .line 100
    iget-object v14, v14, Lcom/moloco/sdk/internal/ortb/model/w;->b:Ljava/lang/String;

    .line 101
    .line 102
    if-nez v14, :cond_6

    .line 103
    .line 104
    const-string v14, "UNKNOWN_MTID"

    .line 105
    .line 106
    :cond_6
    iput-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 107
    .line 108
    iput v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->b:I

    .line 109
    .line 110
    invoke-virtual {v13, v15, v14, v11, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->i(Ljava/lang/String;Ljava/lang/String;ZLlf/c;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    if-ne v11, v3, :cond_7

    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_7
    :goto_0
    check-cast v11, Lcom/moloco/sdk/internal/A;

    .line 119
    .line 120
    iget-object v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->a:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 121
    .line 122
    iget-object v13, v13, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 123
    .line 124
    iget-object v13, v13, Lcom/moloco/sdk/internal/ortb/model/w;->a:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 125
    .line 126
    if-eqz v13, :cond_8

    .line 127
    .line 128
    iget-object v13, v13, Lcom/moloco/sdk/internal/ortb/model/h0;->i:Lcom/moloco/sdk/internal/ortb/model/F;

    .line 129
    .line 130
    if-eqz v13, :cond_8

    .line 131
    .line 132
    invoke-static {v13}, Lp7/b;->a(Lcom/moloco/sdk/internal/ortb/model/F;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    move-object/from16 v17, v13

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_8
    move-object/from16 v17, v8

    .line 140
    .line 141
    :goto_1
    new-instance v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F;

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    iget-wide v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->f:J

    .line 146
    .line 147
    iget-object v15, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 148
    .line 149
    move-object/from16 v18, v15

    .line 150
    .line 151
    move-wide v15, v1

    .line 152
    invoke-direct/range {v14 .. v19}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F;-><init>(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Ljf/c;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v4, v8, v14, v7}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    instance-of v1, v11, Lcom/moloco/sdk/internal/z;

    .line 160
    .line 161
    if-eqz v1, :cond_12

    .line 162
    .line 163
    iget-object v1, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 164
    .line 165
    move-object v2, v11

    .line 166
    check-cast v2, Lcom/moloco/sdk/internal/z;

    .line 167
    .line 168
    iget-object v2, v2, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 171
    .line 172
    iput-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->a:LEf/L;

    .line 175
    .line 176
    iput v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->b:I

    .line 177
    .line 178
    iget-wide v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->f:J

    .line 179
    .line 180
    invoke-virtual {v1, v2, v14, v15, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->h(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;JLlf/c;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-ne v1, v3, :cond_9

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_9
    move-object v10, v11

    .line 188
    :goto_2
    check-cast v1, Lcom/moloco/sdk/internal/A;

    .line 189
    .line 190
    instance-of v2, v1, Lcom/moloco/sdk/internal/z;

    .line 191
    .line 192
    if-eqz v2, :cond_e

    .line 193
    .line 194
    check-cast v10, Lcom/moloco/sdk/internal/z;

    .line 195
    .line 196
    iget-object v1, v10, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 199
    .line 200
    iput-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->a:LEf/L;

    .line 203
    .line 204
    iput v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->b:I

    .line 205
    .line 206
    invoke-interface {v4, v0}, LEf/K;->await(Ljf/c;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    if-ne v2, v3, :cond_a

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_a
    :goto_3
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 214
    .line 215
    invoke-static {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    new-instance v2, Lcom/moloco/sdk/internal/z;

    .line 220
    .line 221
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iput-object v2, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 228
    .line 229
    iget-object v2, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->f:Lcom/moloco/sdk/acm/recorder/c;

    .line 230
    .line 231
    if-eqz v2, :cond_b

    .line 232
    .line 233
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 234
    .line 235
    const-string v4, "vast_show_file_not_exists_load_to_show_ms"

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    goto :goto_4

    .line 242
    :cond_b
    move-object v2, v8

    .line 243
    :goto_4
    iput-object v2, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->k:Lcom/moloco/sdk/acm/l;

    .line 244
    .line 245
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->c:Ljava/lang/Object;

    .line 246
    .line 247
    iput v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;->b:I

    .line 248
    .line 249
    sget-object v2, LEf/S;->a:LLf/e;

    .line 250
    .line 251
    sget-object v2, LLf/d;->b:LLf/d;

    .line 252
    .line 253
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y;

    .line 254
    .line 255
    invoke-direct {v4, v12, v1, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;Ljf/c;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v4, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-ne v1, v3, :cond_c

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_c
    move-object v1, v5

    .line 266
    :goto_5
    if-ne v1, v3, :cond_d

    .line 267
    .line 268
    :goto_6
    return-object v3

    .line 269
    :cond_d
    :goto_7
    iget-object v1, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->h:LHf/x0;

    .line 270
    .line 271
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v8, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    invoke-interface {v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->a()V

    .line 280
    .line 281
    .line 282
    return-object v5

    .line 283
    :cond_e
    instance-of v2, v1, Lcom/moloco/sdk/internal/y;

    .line 284
    .line 285
    if-eqz v2, :cond_11

    .line 286
    .line 287
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 288
    .line 289
    const-string v16, "main VAST ad didn\'t load due to failure or timeout"

    .line 290
    .line 291
    const/16 v17, 0x0

    .line 292
    .line 293
    const-string v15, "VastAdLoad"

    .line 294
    .line 295
    const/16 v18, 0x4

    .line 296
    .line 297
    const/16 v19, 0x0

    .line 298
    .line 299
    invoke-static/range {v14 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    check-cast v1, Lcom/moloco/sdk/internal/y;

    .line 303
    .line 304
    iget-object v2, v1, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 312
    .line 313
    iget-object v1, v1, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 314
    .line 315
    if-eq v2, v3, :cond_10

    .line 316
    .line 317
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->y:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 318
    .line 319
    if-eq v2, v3, :cond_10

    .line 320
    .line 321
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->z:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 322
    .line 323
    if-ne v2, v3, :cond_f

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_f
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 327
    .line 328
    invoke-static {v12, v4, v6, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;LEf/K;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 329
    .line 330
    .line 331
    return-object v5

    .line 332
    :cond_10
    :goto_8
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 333
    .line 334
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-interface {v4, v8}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 338
    .line 339
    .line 340
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 341
    .line 342
    new-instance v3, Lcom/moloco/sdk/internal/y;

    .line 343
    .line 344
    invoke-direct {v3, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    iput-object v3, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 348
    .line 349
    invoke-interface {v6, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V

    .line 350
    .line 351
    .line 352
    return-object v5

    .line 353
    :cond_11
    new-instance v1, LE5/Q;

    .line 354
    .line 355
    const/16 v2, 0x9

    .line 356
    .line 357
    const/4 v13, 0x0

    .line 358
    invoke-direct {v1, v13, v2}, LE5/Q;-><init>(BI)V

    .line 359
    .line 360
    .line 361
    throw v1

    .line 362
    :cond_12
    instance-of v1, v11, Lcom/moloco/sdk/internal/y;

    .line 363
    .line 364
    if-eqz v1, :cond_13

    .line 365
    .line 366
    check-cast v11, Lcom/moloco/sdk/internal/y;

    .line 367
    .line 368
    iget-object v1, v11, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 371
    .line 372
    invoke-static {v12, v4, v6, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;LEf/K;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 373
    .line 374
    .line 375
    return-object v5

    .line 376
    :cond_13
    new-instance v1, LE5/Q;

    .line 377
    .line 378
    const/16 v2, 0x9

    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    invoke-direct {v1, v13, v2}, LE5/Q;-><init>(BI)V

    .line 382
    .line 383
    .line 384
    throw v1
.end method
