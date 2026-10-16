.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:J

.field public f:Ljava/lang/String;

.field public g:I

.field public final synthetic h:LVa/X7;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/io/File;

.field public final synthetic k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public constructor <init>(LVa/X7;Ljava/lang/String;Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->h:LVa/X7;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->i:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->j:Ljava/io/File;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->l:Ljava/lang/String;

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
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;

    .line 2
    .line 3
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;

    .line 4
    .line 5
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->l:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->h:LVa/X7;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->j:Ljava/io/File;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;-><init>(LVa/X7;Ljava/lang/String;Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;Ljava/lang/String;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    const-string v0, "Fetching asset from network: "

    .line 4
    .line 5
    const-string v9, "-"

    .line 6
    .line 7
    const-string v10, ": "

    .line 8
    .line 9
    const-string v11, "Content-Range"

    .line 10
    .line 11
    const-string v1, "Previous tmpfile bytes: "

    .line 12
    .line 13
    sget-object v12, Lkf/a;->a:Lkf/a;

    .line 14
    .line 15
    iget v2, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->g:I

    .line 16
    .line 17
    iget-object v3, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->i:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v13, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;

    .line 20
    .line 21
    iget-object v14, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->j:Ljava/io/File;

    .line 22
    .line 23
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->h:LVa/X7;

    .line 24
    .line 25
    const/4 v15, 0x4

    .line 26
    const/4 v5, 0x3

    .line 27
    const-string v16, "/"

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    const/4 v8, 0x1

    .line 31
    if-eqz v2, :cond_4

    .line 32
    .line 33
    if-eq v2, v8, :cond_3

    .line 34
    .line 35
    if-eq v2, v6, :cond_2

    .line 36
    .line 37
    if-eq v2, v5, :cond_1

    .line 38
    .line 39
    if-ne v2, v15, :cond_0

    .line 40
    .line 41
    iget v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I

    .line 42
    .line 43
    iget-wide v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 44
    .line 45
    iget v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 46
    .line 47
    iget v15, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 48
    .line 49
    iget-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 50
    .line 51
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    move/from16 p1, v15

    .line 55
    .line 56
    move v15, v0

    .line 57
    move/from16 v0, p1

    .line 58
    .line 59
    move-object/from16 p1, v3

    .line 60
    .line 61
    move v3, v5

    .line 62
    move/from16 v21, v8

    .line 63
    .line 64
    move-object/from16 v31, v10

    .line 65
    .line 66
    const/16 v20, 0x2

    .line 67
    .line 68
    move-object v8, v6

    .line 69
    move-wide v5, v1

    .line 70
    move-object v2, v4

    .line 71
    move-object v4, v11

    .line 72
    const/4 v1, 0x4

    .line 73
    goto/16 :goto_e

    .line 74
    .line 75
    :catch_0
    move-exception v0

    .line 76
    move-object/from16 v17, v0

    .line 77
    .line 78
    move-object/from16 p1, v3

    .line 79
    .line 80
    goto/16 :goto_11

    .line 81
    .line 82
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 85
    .line 86
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_1
    iget v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->d:I

    .line 91
    .line 92
    iget-wide v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 93
    .line 94
    iget v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I

    .line 95
    .line 96
    iget v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 97
    .line 98
    iget v15, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 99
    .line 100
    iget-object v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 101
    .line 102
    :try_start_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 103
    .line 104
    .line 105
    move/from16 p1, v15

    .line 106
    .line 107
    move v15, v0

    .line 108
    move/from16 v0, p1

    .line 109
    .line 110
    move-object/from16 p1, v3

    .line 111
    .line 112
    move-object/from16 v31, v10

    .line 113
    .line 114
    const/4 v10, 0x3

    .line 115
    const/16 v20, 0x2

    .line 116
    .line 117
    const/16 v21, 0x1

    .line 118
    .line 119
    move-wide/from16 v32, v1

    .line 120
    .line 121
    move-object v2, v4

    .line 122
    move v1, v6

    .line 123
    :goto_0
    move v3, v5

    .line 124
    move-wide/from16 v5, v32

    .line 125
    .line 126
    goto/16 :goto_b

    .line 127
    .line 128
    :cond_2
    iget v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I

    .line 129
    .line 130
    iget-wide v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 131
    .line 132
    iget v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 133
    .line 134
    iget v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 135
    .line 136
    iget-object v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 137
    .line 138
    :try_start_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 139
    .line 140
    .line 141
    move v15, v6

    .line 142
    move-object v6, v8

    .line 143
    const/16 v20, 0x2

    .line 144
    .line 145
    move-object/from16 v8, p1

    .line 146
    .line 147
    move-wide/from16 v32, v1

    .line 148
    .line 149
    move-object v1, v3

    .line 150
    move-object v2, v4

    .line 151
    move-wide/from16 v3, v32

    .line 152
    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_3
    iget v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I

    .line 156
    .line 157
    iget-wide v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 158
    .line 159
    iget v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 160
    .line 161
    iget v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 162
    .line 163
    iget-object v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 164
    .line 165
    :try_start_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 166
    .line 167
    .line 168
    move-object v15, v8

    .line 169
    move v8, v5

    .line 170
    move v5, v6

    .line 171
    move-object v6, v15

    .line 172
    move v15, v0

    .line 173
    move-object/from16 v0, p1

    .line 174
    .line 175
    move-object/from16 p1, v3

    .line 176
    .line 177
    goto/16 :goto_5

    .line 178
    .line 179
    :cond_4
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :try_start_4
    sget-object v22, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 183
    .line 184
    const-string v23, "ChunkedMediaDownloader"

    .line 185
    .line 186
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v24

    .line 190
    const/16 v25, 0x0

    .line 191
    .line 192
    const/16 v26, 0x0

    .line 193
    .line 194
    const/16 v27, 0xc

    .line 195
    .line 196
    const/16 v28, 0x0

    .line 197
    .line 198
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    .line 199
    .line 200
    .line 201
    :try_start_5
    invoke-static {v14}, LVa/X7;->l(Ljava/io/File;)Ljava/io/File;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_5

    .line 210
    .line 211
    invoke-static {v0}, Lqf/i;->W(Ljava/io/File;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    goto :goto_1

    .line 216
    :cond_5
    const/4 v0, 0x0

    .line 217
    :goto_1
    if-eqz v0, :cond_6

    .line 218
    .line 219
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-static {v0, v5}, LBf/k;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Ljava/lang/String;

    .line 232
    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v0
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 239
    goto :goto_2

    .line 240
    :catch_1
    move-exception v0

    .line 241
    move-object/from16 v25, v0

    .line 242
    .line 243
    :try_start_6
    sget-object v22, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 244
    .line 245
    const-string v23, "ChunkedMediaDownloader"

    .line 246
    .line 247
    const-string v24, "Failed to read range file"

    .line 248
    .line 249
    const/16 v28, 0x0

    .line 250
    .line 251
    const/16 v26, 0x0

    .line 252
    .line 253
    const/16 v27, 0x8

    .line 254
    .line 255
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v14}, LVa/X7;->l(Ljava/io/File;)Ljava/io/File;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 263
    .line 264
    .line 265
    :cond_6
    const v0, 0x7fffffff

    .line 266
    .line 267
    .line 268
    :goto_2
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    .line 269
    .line 270
    :try_start_7
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;

    .line 271
    .line 272
    invoke-direct {v6, v14, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;-><init>(Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;)V

    .line 273
    .line 274
    .line 275
    iput-object v6, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;

    .line 276
    .line 277
    iget-object v6, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->c:LBf/s;

    .line 278
    .line 279
    if-eqz v6, :cond_7

    .line 280
    .line 281
    invoke-virtual {v6, v14, v5}, LBf/s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8

    .line 282
    .line 283
    .line 284
    :cond_7
    :try_start_8
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 285
    .line 286
    .line 287
    move-result-wide v5

    .line 288
    sget-object v22, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 289
    .line 290
    const-string v23, "ChunkedMediaDownloader"

    .line 291
    .line 292
    new-instance v8, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v24

    .line 304
    const/16 v25, 0x0

    .line 305
    .line 306
    const/16 v26, 0x0

    .line 307
    .line 308
    const/16 v27, 0xc

    .line 309
    .line 310
    const/16 v28, 0x0

    .line 311
    .line 312
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 313
    .line 314
    .line 315
    move-object v1, v3

    .line 316
    int-to-long v2, v0

    .line 317
    cmp-long v2, v2, v5

    .line 318
    .line 319
    if-nez v2, :cond_8

    .line 320
    .line 321
    :try_start_9
    const-string v23, "ChunkedMediaDownloader"

    .line 322
    .line 323
    const-string v24, "File already downloaded, skipping download"

    .line 324
    .line 325
    const/16 v25, 0x0

    .line 326
    .line 327
    const/16 v26, 0x0

    .line 328
    .line 329
    const/16 v27, 0xc

    .line 330
    .line 331
    const/16 v28, 0x0

    .line 332
    .line 333
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-static {v4, v14, v13}, LVa/X7;->c(LVa/X7;Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    .line 337
    .line 338
    .line 339
    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 340
    return-object v0

    .line 341
    :catch_2
    move-exception v0

    .line 342
    move-object/from16 v17, v0

    .line 343
    .line 344
    move-object/from16 p1, v1

    .line 345
    .line 346
    goto/16 :goto_11

    .line 347
    .line 348
    :cond_8
    :try_start_a
    invoke-static {v14}, LVa/X7;->k(Ljava/io/File;)Ljava/io/File;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_9

    .line 357
    .line 358
    invoke-static {v2}, Lqf/i;->W(Ljava/io/File;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    .line 362
    goto :goto_3

    .line 363
    :cond_9
    const/4 v2, 0x0

    .line 364
    :goto_3
    const/4 v3, -0x1

    .line 365
    move-object v8, v2

    .line 366
    const/4 v2, 0x1

    .line 367
    const/4 v15, 0x0

    .line 368
    :goto_4
    if-eqz v2, :cond_17

    .line 369
    .line 370
    :try_start_b
    iget-object v2, v4, LVa/X7;->b:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v2, Lcom/moloco/sdk/internal/services/E;

    .line 373
    .line 374
    iput-object v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 375
    .line 376
    iput v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 377
    .line 378
    iput v3, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 379
    .line 380
    iput-wide v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 381
    .line 382
    iput v15, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    .line 383
    .line 384
    move-object/from16 p1, v1

    .line 385
    .line 386
    const/4 v1, 0x1

    .line 387
    :try_start_c
    iput v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->g:I

    .line 388
    .line 389
    move/from16 v22, v0

    .line 390
    .line 391
    const-wide/16 v0, 0x1388

    .line 392
    .line 393
    invoke-virtual {v2, v0, v1, v7}, Lcom/moloco/sdk/internal/services/E;->a(JLlf/c;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    if-ne v0, v12, :cond_a

    .line 398
    .line 399
    goto/16 :goto_d

    .line 400
    .line 401
    :cond_a
    move-wide v1, v5

    .line 402
    move-object v6, v8

    .line 403
    move/from16 v5, v22

    .line 404
    .line 405
    move v8, v3

    .line 406
    :goto_5
    check-cast v0, Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 409
    .line 410
    .line 411
    move-result v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    .line 412
    if-nez v0, :cond_b

    .line 413
    .line 414
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;->n:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/f;

    .line 415
    .line 416
    :try_start_d
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 417
    .line 418
    invoke-direct {v1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v13, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;)V

    .line 422
    .line 423
    .line 424
    return-object v0

    .line 425
    :goto_6
    move-object/from16 v17, v0

    .line 426
    .line 427
    goto/16 :goto_11

    .line 428
    .line 429
    :catch_3
    move-exception v0

    .line 430
    goto :goto_6

    .line 431
    :cond_b
    const/16 v21, 0x1

    .line 432
    .line 433
    add-int/lit8 v15, v15, 0x1

    .line 434
    .line 435
    sget-object v22, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 436
    .line 437
    const-string v23, "ChunkedMediaDownloader"

    .line 438
    .line 439
    new-instance v0, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 442
    .line 443
    .line 444
    const-string v3, "Making request to fetch chunk: "

    .line 445
    .line 446
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v3, " for remainingBytes: "

    .line 453
    .line 454
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v24

    .line 464
    const/16 v25, 0x0

    .line 465
    .line 466
    const/16 v26, 0x0

    .line 467
    .line 468
    const/16 v27, 0xc

    .line 469
    .line 470
    const/16 v28, 0x0

    .line 471
    .line 472
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    iput-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 476
    .line 477
    iput v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 478
    .line 479
    iput v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 480
    .line 481
    iput-wide v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 482
    .line 483
    iput v15, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I

    .line 484
    .line 485
    const/4 v3, 0x2

    .line 486
    iput v3, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->g:I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3

    .line 487
    .line 488
    move/from16 v20, v3

    .line 489
    .line 490
    move v0, v8

    .line 491
    move-wide/from16 v32, v1

    .line 492
    .line 493
    move-object/from16 v2, p1

    .line 494
    .line 495
    move-object v1, v4

    .line 496
    move-wide/from16 v3, v32

    .line 497
    .line 498
    :try_start_e
    invoke-static/range {v1 .. v7}, LVa/X7;->g(LVa/X7;Ljava/lang/String;JILjava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v8
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5

    .line 502
    move-object/from16 v32, v2

    .line 503
    .line 504
    move-object v2, v1

    .line 505
    move-object/from16 v1, v32

    .line 506
    .line 507
    if-ne v8, v12, :cond_c

    .line 508
    .line 509
    goto/16 :goto_d

    .line 510
    .line 511
    :cond_c
    move/from16 v32, v5

    .line 512
    .line 513
    move v5, v0

    .line 514
    move v0, v15

    .line 515
    move/from16 v15, v32

    .line 516
    .line 517
    :goto_7
    :try_start_f
    check-cast v8, LGd/a;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    .line 518
    .line 519
    move-object/from16 p1, v1

    .line 520
    .line 521
    :try_start_10
    invoke-static {v2, v14, v8, v13}, LVa/X7;->d(LVa/X7;Ljava/io/File;LGd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/i;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    move-wide/from16 v22, v3

    .line 526
    .line 527
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;

    .line 528
    .line 529
    if-eqz v3, :cond_d

    .line 530
    .line 531
    return-object v1

    .line 532
    :cond_d
    invoke-static {v2, v14, v8}, LVa/X7;->h(LVa/X7;Ljava/io/File;LGd/a;)V

    .line 533
    .line 534
    .line 535
    sget-object v24, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 536
    .line 537
    const-string v25, "ChunkedMediaDownloader"

    .line 538
    .line 539
    new-instance v1, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 542
    .line 543
    .line 544
    const-string v3, "ResponseCode: "

    .line 545
    .line 546
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v8}, LGd/a;->e()LJd/v;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    iget v3, v3, LJd/v;->a:I

    .line 554
    .line 555
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    const-string v3, ", "

    .line 559
    .line 560
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    sget-object v3, LJd/p;->a:Ljava/util/List;

    .line 564
    .line 565
    const-string v3, "Content-Length"

    .line 566
    .line 567
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-static {v8}, Lff/B;->h(LGd/a;)Ljava/lang/Long;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v26

    .line 584
    const/16 v27, 0x0

    .line 585
    .line 586
    const/16 v28, 0x0

    .line 587
    .line 588
    const/16 v29, 0xc

    .line 589
    .line 590
    const/16 v30, 0x0

    .line 591
    .line 592
    invoke-static/range {v24 .. v30}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    invoke-interface {v8}, LJd/q;->a()LJd/m;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    invoke-interface {v1, v11}, LNd/j;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    if-eqz v1, :cond_15

    .line 604
    .line 605
    const-string v25, "ChunkedMediaDownloader"

    .line 606
    .line 607
    new-instance v3, Ljava/lang/StringBuilder;

    .line 608
    .line 609
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 610
    .line 611
    .line 612
    const-string v4, "Content range header is available, "

    .line 613
    .line 614
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v26

    .line 630
    const/16 v27, 0x0

    .line 631
    .line 632
    const/16 v28, 0x0

    .line 633
    .line 634
    const/16 v29, 0xc

    .line 635
    .line 636
    const/16 v30, 0x0

    .line 637
    .line 638
    invoke-static/range {v24 .. v30}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    invoke-static {v14}, LVa/X7;->l(Ljava/io/File;)Ljava/io/File;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    sget-object v4, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 646
    .line 647
    invoke-static {v3, v1, v4}, Lqf/i;->Y(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 648
    .line 649
    .line 650
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    invoke-static {v1, v3}, LBf/k;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    invoke-static {v3}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    check-cast v3, Ljava/lang/String;

    .line 663
    .line 664
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 665
    .line 666
    .line 667
    move-result v15

    .line 668
    invoke-static {v8}, Lff/B;->h(LGd/a;)Ljava/lang/Long;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    if-eqz v3, :cond_e

    .line 673
    .line 674
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 675
    .line 676
    .line 677
    move-result-wide v3

    .line 678
    goto :goto_8

    .line 679
    :cond_e
    const-wide/16 v3, 0x0

    .line 680
    .line 681
    :goto_8
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v5

    .line 685
    invoke-static {v1, v5}, LBf/k;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    invoke-static {v1}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    check-cast v1, Ljava/lang/String;

    .line 694
    .line 695
    move-object/from16 v31, v10

    .line 696
    .line 697
    const/4 v5, 0x0

    .line 698
    invoke-static {v1, v9, v5}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 699
    .line 700
    .line 701
    move-result v10

    .line 702
    if-nez v10, :cond_f

    .line 703
    .line 704
    move v1, v15

    .line 705
    goto :goto_9

    .line 706
    :cond_f
    const/4 v5, 0x1

    .line 707
    if-ne v10, v5, :cond_14

    .line 708
    .line 709
    filled-new-array {v9}, [Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v5

    .line 713
    invoke-static {v1, v5}, LBf/k;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    invoke-static {v1}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    check-cast v1, Ljava/lang/String;

    .line 722
    .line 723
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    :goto_9
    sub-int v1, v15, v1

    .line 728
    .line 729
    const/16 v21, 0x1

    .line 730
    .line 731
    add-int/lit8 v5, v1, -0x1

    .line 732
    .line 733
    const-string v25, "ChunkedMediaDownloader"

    .line 734
    .line 735
    new-instance v1, Ljava/lang/StringBuilder;

    .line 736
    .line 737
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 738
    .line 739
    .line 740
    const-string v10, "maxRange: "

    .line 741
    .line 742
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    const-string v10, ", Response contentLength: "

    .line 749
    .line 750
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v26

    .line 760
    const/16 v27, 0x0

    .line 761
    .line 762
    const/16 v28, 0x0

    .line 763
    .line 764
    const/16 v29, 0xc

    .line 765
    .line 766
    const/16 v30, 0x0

    .line 767
    .line 768
    invoke-static/range {v24 .. v30}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    if-lez v5, :cond_10

    .line 772
    .line 773
    move/from16 v1, v21

    .line 774
    .line 775
    goto :goto_a

    .line 776
    :cond_10
    const/4 v1, 0x0

    .line 777
    :goto_a
    add-long v3, v22, v3

    .line 778
    .line 779
    iput-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 780
    .line 781
    iput v15, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 782
    .line 783
    iput v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 784
    .line 785
    iput v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I

    .line 786
    .line 787
    iput-wide v3, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 788
    .line 789
    iput v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->d:I

    .line 790
    .line 791
    const/4 v10, 0x3

    .line 792
    iput v10, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->g:I

    .line 793
    .line 794
    invoke-static {v2, v14, v8, v7}, LVa/X7;->i(LVa/X7;Ljava/io/File;LGd/a;Llf/c;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v8

    .line 798
    if-ne v8, v12, :cond_11

    .line 799
    .line 800
    goto/16 :goto_d

    .line 801
    .line 802
    :cond_11
    move v8, v15

    .line 803
    move v15, v0

    .line 804
    move v0, v8

    .line 805
    move-object v8, v6

    .line 806
    move-wide/from16 v32, v3

    .line 807
    .line 808
    goto/16 :goto_0

    .line 809
    .line 810
    :goto_b
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;

    .line 811
    .line 812
    move-object/from16 v18, v11

    .line 813
    .line 814
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 815
    .line 816
    .line 817
    move-result-wide v10

    .line 818
    move-wide/from16 v22, v5

    .line 819
    .line 820
    int-to-long v5, v0

    .line 821
    invoke-direct {v4, v10, v11, v5, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;-><init>(JJ)V

    .line 822
    .line 823
    .line 824
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;

    .line 825
    .line 826
    invoke-direct {v5, v14, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;-><init>(Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;)V

    .line 827
    .line 828
    .line 829
    iput-object v5, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;

    .line 830
    .line 831
    iget-object v5, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->c:LBf/s;

    .line 832
    .line 833
    if-eqz v5, :cond_12

    .line 834
    .line 835
    invoke-virtual {v5, v14, v4}, LBf/s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    :cond_12
    if-eqz v1, :cond_13

    .line 839
    .line 840
    sget-object v24, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 841
    .line 842
    const-string v25, "ChunkedMediaDownloader"

    .line 843
    .line 844
    const-string v26, "Server has more data"

    .line 845
    .line 846
    const/16 v27, 0x0

    .line 847
    .line 848
    const/16 v28, 0x0

    .line 849
    .line 850
    const/16 v29, 0xc

    .line 851
    .line 852
    const/16 v30, 0x0

    .line 853
    .line 854
    invoke-static/range {v24 .. v30}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    goto :goto_c

    .line 858
    :cond_13
    sget-object v24, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 859
    .line 860
    const-string v25, "ChunkedMediaDownloader"

    .line 861
    .line 862
    const-string v26, "Server does not have more data to send"

    .line 863
    .line 864
    const/16 v27, 0x0

    .line 865
    .line 866
    const/16 v28, 0x0

    .line 867
    .line 868
    const/16 v29, 0xc

    .line 869
    .line 870
    const/16 v30, 0x0

    .line 871
    .line 872
    invoke-static/range {v24 .. v30}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    :goto_c
    move-object v4, v2

    .line 876
    move-object/from16 v11, v18

    .line 877
    .line 878
    move-wide/from16 v5, v22

    .line 879
    .line 880
    move-object/from16 v10, v31

    .line 881
    .line 882
    move v2, v1

    .line 883
    move-object/from16 v1, p1

    .line 884
    .line 885
    goto/16 :goto_4

    .line 886
    .line 887
    :cond_14
    new-instance v0, LE5/Q;

    .line 888
    .line 889
    const/16 v1, 0x9

    .line 890
    .line 891
    const/4 v3, 0x0

    .line 892
    invoke-direct {v0, v3, v1}, LE5/Q;-><init>(BI)V

    .line 893
    .line 894
    .line 895
    throw v0

    .line 896
    :cond_15
    move-object/from16 v31, v10

    .line 897
    .line 898
    move-object/from16 v18, v11

    .line 899
    .line 900
    const/4 v3, 0x0

    .line 901
    const/16 v21, 0x1

    .line 902
    .line 903
    const-string v25, "ChunkedMediaDownloader"

    .line 904
    .line 905
    new-instance v1, Ljava/lang/StringBuilder;

    .line 906
    .line 907
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 908
    .line 909
    .line 910
    move-object/from16 v4, v18

    .line 911
    .line 912
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    const-string v10, " is not available"

    .line 916
    .line 917
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v26

    .line 924
    const/16 v27, 0x0

    .line 925
    .line 926
    const/16 v28, 0x0

    .line 927
    .line 928
    const/16 v29, 0xc

    .line 929
    .line 930
    const/16 v30, 0x0

    .line 931
    .line 932
    invoke-static/range {v24 .. v30}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    iget-object v1, v2, LVa/X7;->c:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v1, Lcom/moloco/sdk/internal/error/b;

    .line 938
    .line 939
    const-string v10, "CONTENT_RANGE_NOT_AVAILABLE"

    .line 940
    .line 941
    new-instance v11, Lcom/moloco/sdk/internal/error/a;

    .line 942
    .line 943
    iget-object v3, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->l:Ljava/lang/String;

    .line 944
    .line 945
    invoke-direct {v11, v3}, Lcom/moloco/sdk/internal/error/a;-><init>(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v1, v10, v11}, Lcom/moloco/sdk/internal/error/b;->a(Ljava/lang/String;Lcom/moloco/sdk/internal/error/a;)V

    .line 949
    .line 950
    .line 951
    iput-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->f:Ljava/lang/String;

    .line 952
    .line 953
    iput v15, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->a:I

    .line 954
    .line 955
    iput v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->b:I

    .line 956
    .line 957
    move-wide/from16 v10, v22

    .line 958
    .line 959
    iput-wide v10, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->e:J

    .line 960
    .line 961
    iput v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->c:I

    .line 962
    .line 963
    const/4 v1, 0x4

    .line 964
    iput v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/c;->g:I

    .line 965
    .line 966
    invoke-static {v2, v14, v8, v7}, LVa/X7;->f(LVa/X7;Ljava/io/File;LGd/a;Llf/c;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    if-ne v3, v12, :cond_16

    .line 971
    .line 972
    :goto_d
    return-object v12

    .line 973
    :cond_16
    move v3, v15

    .line 974
    move v15, v0

    .line 975
    move v0, v3

    .line 976
    move v3, v5

    .line 977
    move-object v8, v6

    .line 978
    move-wide v5, v10

    .line 979
    :goto_e
    move-object/from16 v1, p1

    .line 980
    .line 981
    move-object v11, v4

    .line 982
    move-object/from16 v10, v31

    .line 983
    .line 984
    move-object v4, v2

    .line 985
    const/4 v2, 0x0

    .line 986
    goto/16 :goto_4

    .line 987
    .line 988
    :catch_4
    move-exception v0

    .line 989
    :goto_f
    move-object/from16 p1, v1

    .line 990
    .line 991
    goto/16 :goto_6

    .line 992
    .line 993
    :catch_5
    move-exception v0

    .line 994
    move-object/from16 p1, v2

    .line 995
    .line 996
    goto/16 :goto_6

    .line 997
    .line 998
    :cond_17
    move-object/from16 p1, v1

    .line 999
    .line 1000
    move-object v2, v4

    .line 1001
    invoke-static {v2, v14, v13}, LVa/X7;->c(LVa/X7;Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3

    .line 1005
    goto :goto_12

    .line 1006
    :catch_6
    move-exception v0

    .line 1007
    goto :goto_f

    .line 1008
    :catch_7
    move-exception v0

    .line 1009
    :goto_10
    move-object/from16 p1, v3

    .line 1010
    .line 1011
    goto/16 :goto_6

    .line 1012
    .line 1013
    :catch_8
    move-exception v0

    .line 1014
    goto :goto_10

    .line 1015
    :goto_11
    invoke-static/range {v17 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/q;->a(Ljava/lang/Exception;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 1020
    .line 1021
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    const-string v2, "Failed to fetch media from url: "

    .line 1024
    .line 1025
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    move-object/from16 v2, p1

    .line 1029
    .line 1030
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    .line 1033
    const-string v2, " due to error: "

    .line 1034
    .line 1035
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v16

    .line 1045
    const-string v15, "ChunkedMediaDownloader"

    .line 1046
    .line 1047
    const/16 v18, 0x0

    .line 1048
    .line 1049
    const/16 v19, 0x8

    .line 1050
    .line 1051
    const/16 v20, 0x0

    .line 1052
    .line 1053
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 1054
    .line 1055
    .line 1056
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 1057
    .line 1058
    invoke-direct {v1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v13, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/c;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;)V

    .line 1062
    .line 1063
    .line 1064
    :goto_12
    return-object v0
.end method
