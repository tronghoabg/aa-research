.class public final Lue/a;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lue/c;

.field public b:I

.field public final synthetic c:LC8/i;

.field public final synthetic d:Lcom/moloco/sdk/internal/publisher/nativead/model/g;

.field public final synthetic e:La9/b;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(LC8/i;Lcom/moloco/sdk/internal/publisher/nativead/model/g;La9/b;ILjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lue/a;->c:LC8/i;

    .line 2
    .line 3
    iput-object p2, p0, Lue/a;->d:Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 4
    .line 5
    iput-object p3, p0, Lue/a;->e:La9/b;

    .line 6
    .line 7
    iput p4, p0, Lue/a;->f:I

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
    new-instance v0, Lue/a;

    .line 2
    .line 3
    iget-object v3, p0, Lue/a;->e:La9/b;

    .line 4
    .line 5
    iget-object v2, p0, Lue/a;->d:Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 6
    .line 7
    iget-object v1, p0, Lue/a;->c:LC8/i;

    .line 8
    .line 9
    iget v4, p0, Lue/a;->f:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lue/a;-><init>(LC8/i;Lcom/moloco/sdk/internal/publisher/nativead/model/g;La9/b;ILjf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lue/a;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lue/a;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lue/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 5
    .line 6
    iget v0, v1, Lue/a;->b:I

    .line 7
    .line 8
    iget-object v7, v1, Lue/a;->e:La9/b;

    .line 9
    .line 10
    iget-object v6, v1, Lue/a;->d:Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 11
    .line 12
    const/4 v4, 0x3

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v8, 0x2

    .line 15
    iget-object v9, v1, Lue/a;->c:LC8/i;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    if-eq v0, v8, :cond_1

    .line 22
    .line 23
    if-ne v0, v4, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    goto/16 :goto_8

    .line 31
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
    iget-object v0, v1, Lue/a;->a:Lue/c;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v12, v9

    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :cond_2
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Lbe/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    move-object/from16 v0, p1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v9, LC8/i;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, LC8/i;

    .line 62
    .line 63
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lk3/p;

    .line 66
    .line 67
    iget-boolean v0, v0, Lk3/p;->b:Z

    .line 68
    .line 69
    if-eqz v0, :cond_10

    .line 70
    .line 71
    :try_start_1
    iget-object v0, v9, LC8/i;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lv6/l;

    .line 74
    .line 75
    iput v2, v1, Lue/a;->b:I

    .line 76
    .line 77
    sget-object v10, LEf/S;->a:LLf/e;

    .line 78
    .line 79
    sget-object v10, LLf/d;->b:LLf/d;

    .line 80
    .line 81
    new-instance v11, Lxe/a;

    .line 82
    .line 83
    invoke-direct {v11, v0, v6, v5}, Lxe/a;-><init>(Lv6/l;Lcom/moloco/sdk/internal/publisher/nativead/model/g;Ljf/c;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v10, v11, v1}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne v0, v3, :cond_4

    .line 91
    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_4
    :goto_0
    check-cast v0, Lve/a;
    :try_end_1
    .catch Lbe/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 95
    .line 96
    move-object v10, v5

    .line 97
    goto :goto_2

    .line 98
    :goto_1
    sget-object v10, Lbe/a;->c:Lbe/a;

    .line 99
    .line 100
    iget-object v11, v0, Lbe/b;->a:Lbe/a;

    .line 101
    .line 102
    if-eq v11, v10, :cond_f

    .line 103
    .line 104
    move-object v10, v0

    .line 105
    move-object v0, v5

    .line 106
    :goto_2
    if-eqz v0, :cond_5

    .line 107
    .line 108
    iget-boolean v11, v0, Lve/a;->c:Z

    .line 109
    .line 110
    if-ne v11, v2, :cond_5

    .line 111
    .line 112
    new-instance v2, Lve/d;

    .line 113
    .line 114
    iget-object v3, v0, Lve/a;->b:Ljava/lang/Object;

    .line 115
    .line 116
    iget v0, v0, Lve/a;->a:I

    .line 117
    .line 118
    invoke-direct {v2, v0, v3}, Lve/d;-><init>(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_9

    .line 122
    .line 123
    :cond_5
    const/4 v11, 0x0

    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    sget-object v12, Lue/b;->a:Ljava/util/List;

    .line 127
    .line 128
    new-instance v13, Ljava/lang/Integer;

    .line 129
    .line 130
    iget v14, v0, Lve/a;->a:I

    .line 131
    .line 132
    invoke-direct {v13, v14}, Ljava/lang/Integer;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v12, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    if-eqz v12, :cond_6

    .line 140
    .line 141
    iget-object v2, v9, LC8/i;->d:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, LC8/i;

    .line 144
    .line 145
    iget-object v2, v2, LC8/i;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lk3/p;

    .line 148
    .line 149
    iput-boolean v11, v2, Lk3/p;->b:Z

    .line 150
    .line 151
    invoke-virtual {v9, v0, v10}, LC8/i;->r(Lve/a;Lbe/b;)Lve/c;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    return-object v0

    .line 156
    :cond_6
    if-eqz v0, :cond_7

    .line 157
    .line 158
    iget-boolean v12, v0, Lve/a;->d:Z

    .line 159
    .line 160
    if-ne v12, v2, :cond_7

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    if-eqz v10, :cond_b

    .line 164
    .line 165
    :goto_3
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget v12, v1, Lue/a;->f:I

    .line 169
    .line 170
    add-int/lit8 v13, v12, 0x1

    .line 171
    .line 172
    if-le v4, v12, :cond_8

    .line 173
    .line 174
    move v11, v2

    .line 175
    :cond_8
    if-eqz v11, :cond_a

    .line 176
    .line 177
    iget-object v12, v9, LC8/i;->c:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v12, Lad/r;

    .line 180
    .line 181
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    const-wide/16 v16, 0x0

    .line 185
    .line 186
    const-wide/16 v14, 0x1f4

    .line 187
    .line 188
    long-to-float v12, v14

    .line 189
    const v14, 0x4019999a    # 2.4f

    .line 190
    .line 191
    .line 192
    float-to-double v14, v14

    .line 193
    int-to-double v4, v13

    .line 194
    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    double-to-float v4, v4

    .line 199
    const-wide/16 v14, 0x3e8

    .line 200
    .line 201
    long-to-float v5, v14

    .line 202
    mul-float/2addr v4, v5

    .line 203
    add-float/2addr v4, v12

    .line 204
    float-to-long v4, v4

    .line 205
    long-to-float v12, v4

    .line 206
    const v14, 0x3ecccccd    # 0.4f

    .line 207
    .line 208
    .line 209
    mul-float/2addr v12, v14

    .line 210
    float-to-double v14, v12

    .line 211
    invoke-static {v14, v15}, Lvf/a;->I(D)J

    .line 212
    .line 213
    .line 214
    move-result-wide v14

    .line 215
    const-wide/16 v18, 0x1

    .line 216
    .line 217
    add-long v14, v14, v18

    .line 218
    .line 219
    sget-object v12, Lxf/d;->a:Lxf/a;

    .line 220
    .line 221
    invoke-virtual {v12, v14, v15}, Lxf/d;->e(J)J

    .line 222
    .line 223
    .line 224
    move-result-wide v14

    .line 225
    add-long/2addr v14, v4

    .line 226
    cmp-long v4, v14, v16

    .line 227
    .line 228
    move-object v12, v9

    .line 229
    const-wide/32 v8, 0xf4240

    .line 230
    .line 231
    .line 232
    if-gez v4, :cond_9

    .line 233
    .line 234
    move-wide v14, v8

    .line 235
    :cond_9
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 236
    .line 237
    .line 238
    move-result-wide v14

    .line 239
    goto :goto_4

    .line 240
    :cond_a
    move-object v12, v9

    .line 241
    const-wide/16 v16, 0x0

    .line 242
    .line 243
    move-wide/from16 v14, v16

    .line 244
    .line 245
    :goto_4
    new-instance v4, Lue/c;

    .line 246
    .line 247
    invoke-direct {v4, v14, v15, v13, v11}, Lue/c;-><init>(JIZ)V

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_b
    move-object v12, v9

    .line 252
    const/4 v4, 0x0

    .line 253
    :goto_5
    if-eqz v4, :cond_e

    .line 254
    .line 255
    iget-boolean v8, v4, Lue/c;->a:Z

    .line 256
    .line 257
    if-ne v8, v2, :cond_e

    .line 258
    .line 259
    iput-object v4, v1, Lue/a;->a:Lue/c;

    .line 260
    .line 261
    const/4 v5, 0x2

    .line 262
    iput v5, v1, Lue/a;->b:I

    .line 263
    .line 264
    iget-wide v8, v4, Lue/c;->c:J

    .line 265
    .line 266
    invoke-static {v8, v9, v1}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-ne v0, v3, :cond_c

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_c
    move-object v0, v4

    .line 274
    :goto_6
    iget v8, v0, Lue/c;->b:I

    .line 275
    .line 276
    const/4 v2, 0x0

    .line 277
    iput-object v2, v1, Lue/a;->a:Lue/c;

    .line 278
    .line 279
    const/4 v2, 0x3

    .line 280
    iput v2, v1, Lue/a;->b:I

    .line 281
    .line 282
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    sget-object v0, LEf/S;->a:LLf/e;

    .line 286
    .line 287
    sget-object v0, LLf/d;->b:LLf/d;

    .line 288
    .line 289
    new-instance v4, Lue/a;

    .line 290
    .line 291
    const/4 v9, 0x0

    .line 292
    move-object v5, v12

    .line 293
    invoke-direct/range {v4 .. v9}, Lue/a;-><init>(LC8/i;Lcom/moloco/sdk/internal/publisher/nativead/model/g;La9/b;ILjf/c;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v4, v1}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-ne v0, v3, :cond_d

    .line 301
    .line 302
    :goto_7
    return-object v3

    .line 303
    :cond_d
    :goto_8
    move-object v2, v0

    .line 304
    check-cast v2, Lve/e;

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_e
    move-object v5, v12

    .line 308
    invoke-virtual {v5, v0, v10}, LC8/i;->r(Lve/a;Lbe/b;)Lve/c;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    :goto_9
    return-object v2

    .line 313
    :cond_f
    throw v0

    .line 314
    :cond_10
    new-instance v0, Lbe/b;

    .line 315
    .line 316
    sget-object v2, Lbe/a;->g:Lbe/a;

    .line 317
    .line 318
    const/4 v3, 0x6

    .line 319
    const/4 v4, 0x0

    .line 320
    invoke-direct {v0, v2, v4, v4, v3}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 321
    .line 322
    .line 323
    throw v0
.end method
