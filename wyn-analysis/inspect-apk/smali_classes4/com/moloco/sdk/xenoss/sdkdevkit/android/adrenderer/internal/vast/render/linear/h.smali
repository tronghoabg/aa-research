.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/g;


# instance fields
.field public A:I

.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

.field public final b:Z

.field public final c:Z

.field public final d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

.field public final e:LKd/a;

.field public final f:LHf/j0;

.field public final g:LHf/j0;

.field public final h:Ljava/lang/String;

.field public final i:LHf/x0;

.field public final j:LHf/x0;

.field public final k:LHf/x0;

.field public final l:LHf/e0;

.field public final m:LHf/x0;

.field public n:I

.field public final o:Z

.field public final p:Ljava/lang/String;

.field public final q:Z

.field public final r:Lb7/k;

.field public final s:LR8/a;

.field public final t:LHf/x0;

.field public final u:LHf/e0;

.field public final v:LHf/x0;

.field public final w:LHf/x0;

.field public final x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;

.field public final y:LR1/q;

.field public z:Z


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;ZLjava/lang/Boolean;IZZLandroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, "context"

    .line 11
    .line 12
    move-object/from16 v13, p7

    .line 13
    .line 14
    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v6, "customUserEventBuilderService"

    .line 18
    .line 19
    move-object/from16 v8, p8

    .line 20
    .line 21
    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v6, "externalLinkHandler"

    .line 25
    .line 26
    move-object/from16 v15, p9

    .line 27
    .line 28
    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 35
    .line 36
    move/from16 v6, p5

    .line 37
    .line 38
    iput-boolean v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->b:Z

    .line 39
    .line 40
    move/from16 v6, p6

    .line 41
    .line 42
    iput-boolean v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->c:Z

    .line 43
    .line 44
    move-object/from16 v6, p10

    .line 45
    .line 46
    iput-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 47
    .line 48
    sget-object v6, LEf/S;->a:LLf/e;

    .line 49
    .line 50
    sget-object v6, LJf/n;->a:LFf/e;

    .line 51
    .line 52
    invoke-static {v6}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    iput-object v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->e:LKd/a;

    .line 57
    .line 58
    const/4 v6, 0x7

    .line 59
    invoke-static {v5, v5, v6}, LHf/k0;->b(III)LHf/j0;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    iput-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->f:LHf/j0;

    .line 64
    .line 65
    iput-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->g:LHf/j0;

    .line 66
    .line 67
    iget-object v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->d:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-static {v7}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iput-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->i:LHf/x0;

    .line 80
    .line 81
    iput-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->j:LHf/x0;

    .line 82
    .line 83
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;

    .line 84
    .line 85
    int-to-long v9, v5

    .line 86
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-direct {v7, v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;-><init>(Ljava/lang/Comparable;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v7}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    iput-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->k:LHf/x0;

    .line 98
    .line 99
    new-instance v9, LHf/e0;

    .line 100
    .line 101
    invoke-direct {v9, v7}, LHf/e0;-><init>(LHf/c0;)V

    .line 102
    .line 103
    .line 104
    iput-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->l:LHf/e0;

    .line 105
    .line 106
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-static {v7}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    iput-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->m:LHf/x0;

    .line 113
    .line 114
    invoke-static {}, Lcom/moloco/sdk/service_locator/g;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    iget-boolean v9, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;->b:Z

    .line 119
    .line 120
    iput-boolean v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->o:Z

    .line 121
    .line 122
    if-eqz v9, :cond_0

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    iget-object v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->b:Ljava/io/File;

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    const-string v9, "getAbsolutePath(...)"

    .line 132
    .line 133
    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :goto_0
    iput-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->p:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->e:Ljava/lang/String;

    .line 139
    .line 140
    if-eqz v6, :cond_1

    .line 141
    .line 142
    move v6, v4

    .line 143
    goto :goto_1

    .line 144
    :cond_1
    move v6, v5

    .line 145
    :goto_1
    iput-boolean v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->q:Z

    .line 146
    .line 147
    new-instance v6, Lb7/k;

    .line 148
    .line 149
    iget-object v10, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;

    .line 150
    .line 151
    if-eqz v10, :cond_2

    .line 152
    .line 153
    iget-object v11, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->e:Ljava/util/List;

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_2
    const/4 v11, 0x0

    .line 157
    :goto_2
    if-eqz v10, :cond_3

    .line 158
    .line 159
    iget-object v14, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->f:Ljava/util/List;

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    const/4 v14, 0x0

    .line 163
    :goto_3
    invoke-direct {v6, v11, v14}, Lb7/k;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    iput-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->r:Lb7/k;

    .line 167
    .line 168
    if-eqz v10, :cond_4

    .line 169
    .line 170
    iget-object v6, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_4
    const/4 v6, 0x0

    .line 174
    :goto_4
    if-eqz v10, :cond_5

    .line 175
    .line 176
    iget v11, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->b:I

    .line 177
    .line 178
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    goto :goto_5

    .line 183
    :cond_5
    const/4 v11, 0x0

    .line 184
    :goto_5
    if-eqz v10, :cond_6

    .line 185
    .line 186
    iget v14, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->c:I

    .line 187
    .line 188
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    goto :goto_6

    .line 193
    :cond_6
    const/4 v14, 0x0

    .line 194
    :goto_6
    if-eqz v10, :cond_7

    .line 195
    .line 196
    iget-object v10, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->d:Ljava/lang/String;

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_7
    const/4 v10, 0x0

    .line 200
    :goto_7
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;

    .line 201
    .line 202
    invoke-direct {v9, v0, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;I)V

    .line 203
    .line 204
    .line 205
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;

    .line 206
    .line 207
    invoke-direct {v5, v0, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;I)V

    .line 208
    .line 209
    .line 210
    move-object v4, v7

    .line 211
    new-instance v7, LR8/a;

    .line 212
    .line 213
    move-object/from16 v17, v5

    .line 214
    .line 215
    move-object/from16 v16, v9

    .line 216
    .line 217
    move-object v9, v11

    .line 218
    move-object v5, v4

    .line 219
    move-object v11, v10

    .line 220
    move-object v10, v14

    .line 221
    const/4 v4, 0x0

    .line 222
    move-object v14, v8

    .line 223
    move-object v8, v6

    .line 224
    invoke-direct/range {v7 .. v17}, LR8/a;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;LKd/a;Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;)V

    .line 225
    .line 226
    .line 227
    move-object v6, v12

    .line 228
    iput-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->s:LR8/a;

    .line 229
    .line 230
    invoke-static {v5}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->t:LHf/x0;

    .line 235
    .line 236
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/K;

    .line 237
    .line 238
    invoke-direct {v9, v3, v4, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/K;-><init>(ILjf/c;I)V

    .line 239
    .line 240
    .line 241
    new-instance v3, LHf/a0;

    .line 242
    .line 243
    iget-object v7, v7, LR8/a;->h:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v7, LHf/e0;

    .line 246
    .line 247
    invoke-direct {v3, v8, v7, v9}, LHf/a0;-><init>(LHf/l;LHf/l;Ltf/q;)V

    .line 248
    .line 249
    .line 250
    new-instance v7, LHf/u0;

    .line 251
    .line 252
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-static {v3, v6, v7, v4}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    iput-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->u:LHf/e0;

    .line 260
    .line 261
    invoke-static {v5}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    iput-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->v:LHf/x0;

    .line 266
    .line 267
    iput-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->w:LHf/x0;

    .line 268
    .line 269
    iget-object v7, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;

    .line 270
    .line 271
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;

    .line 272
    .line 273
    iget-object v9, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->a:Ljava/lang/Object;

    .line 274
    .line 275
    iget-object v10, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->b:Ljava/lang/Object;

    .line 276
    .line 277
    iget-object v11, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->c:Ljava/lang/Object;

    .line 278
    .line 279
    iget-object v12, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->d:Ljava/lang/Object;

    .line 280
    .line 281
    iget-object v13, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->e:Ljava/lang/Object;

    .line 282
    .line 283
    iget-object v14, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->f:Ljava/lang/Object;

    .line 284
    .line 285
    iget-object v15, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->g:Ljava/lang/Object;

    .line 286
    .line 287
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->h:Ljava/lang/Object;

    .line 288
    .line 289
    move-object/from16 v16, v4

    .line 290
    .line 291
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->i:Ljava/lang/Object;

    .line 292
    .line 293
    move-object/from16 v17, v4

    .line 294
    .line 295
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->j:Ljava/lang/Object;

    .line 296
    .line 297
    move-object/from16 v18, v4

    .line 298
    .line 299
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->k:Ljava/lang/Object;

    .line 300
    .line 301
    move-object/from16 v19, v4

    .line 302
    .line 303
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->l:Ljava/lang/Object;

    .line 304
    .line 305
    move-object/from16 v20, v4

    .line 306
    .line 307
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->m:Ljava/lang/Object;

    .line 308
    .line 309
    move-object/from16 v21, v4

    .line 310
    .line 311
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->n:Ljava/lang/Object;

    .line 312
    .line 313
    iget-object v7, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;->o:Ljava/lang/Object;

    .line 314
    .line 315
    move-object/from16 v22, v4

    .line 316
    .line 317
    move-object/from16 v23, v7

    .line 318
    .line 319
    move-object v7, v8

    .line 320
    move-object/from16 v8, p8

    .line 321
    .line 322
    invoke-direct/range {v7 .. v23}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;-><init>(Lcom/moloco/sdk/internal/services/events/c;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    iput-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;

    .line 326
    .line 327
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/f;

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    invoke-direct {v4, v0, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/f;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;Ljf/c;)V

    .line 331
    .line 332
    .line 333
    new-instance v8, LHf/Z;

    .line 334
    .line 335
    const/4 v9, 0x0

    .line 336
    invoke-direct {v8, v3, v4, v9}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v8, v6}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 340
    .line 341
    .line 342
    new-instance v3, LR1/q;

    .line 343
    .line 344
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_8

    .line 349
    .line 350
    move-object v9, v7

    .line 351
    goto :goto_8

    .line 352
    :cond_8
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-eqz v4, :cond_9

    .line 359
    .line 360
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;

    .line 361
    .line 362
    move/from16 v1, p4

    .line 363
    .line 364
    int-to-long v1, v1

    .line 365
    const-wide/16 v4, 0x3e8

    .line 366
    .line 367
    mul-long/2addr v1, v4

    .line 368
    invoke-direct {v9, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;-><init>(J)V

    .line 369
    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_9
    if-nez v2, :cond_a

    .line 373
    .line 374
    iget-object v9, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;

    .line 375
    .line 376
    :goto_8
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 377
    .line 378
    .line 379
    iput-object v9, v3, LR1/q;->b:Ljava/lang/Object;

    .line 380
    .line 381
    sget-object v1, LEf/S;->a:LLf/e;

    .line 382
    .line 383
    sget-object v1, LJf/n;->a:LFf/e;

    .line 384
    .line 385
    invoke-static {v1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    iput-object v1, v3, LR1/q;->c:Ljava/lang/Object;

    .line 390
    .line 391
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/e;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/e;

    .line 392
    .line 393
    invoke-static {v1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    iput-object v1, v3, LR1/q;->f:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->y:LR1/q;

    .line 400
    .line 401
    return-void

    .line 402
    :cond_a
    new-instance v1, LE5/Q;

    .line 403
    .line 404
    const/16 v2, 0x9

    .line 405
    .line 406
    const/4 v9, 0x0

    .line 407
    invoke-direct {v1, v9, v2}, LE5/Q;-><init>(BI)V

    .line 408
    .line 409
    .line 410
    throw v1
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/d;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/g;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/d;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->e:LKd/a;

    .line 9
    .line 10
    invoke-static {v2, v1, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final b(ZLcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->e:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->A:I

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v8

    .line 15
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v1, "lastClickPosition"

    .line 21
    .line 22
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->b:Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-object v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->b()Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v5, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string v1, "customUserEventBuilderService"

    .line 41
    .line 42
    iget-object v3, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->a:Lcom/moloco/sdk/internal/services/events/c;

    .line 43
    .line 44
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v11, 0x0

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/K0;

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    iget-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->h:Ljava/lang/String;

    .line 60
    .line 61
    move-object v4, p2

    .line 62
    invoke-direct/range {v1 .. v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/K0;-><init>(Ljava/util/List;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;Ljava/lang/Integer;Ljava/lang/String;Ljf/c;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;->b:LKd/a;

    .line 66
    .line 67
    const/4 v2, 0x3

    .line 68
    invoke-static {p2, v11, v1, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 69
    .line 70
    .line 71
    :goto_0
    iput-object v11, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->b:Ljava/lang/Object;

    .line 72
    .line 73
    :cond_1
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 74
    .line 75
    invoke-interface {p1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/b;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/b;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/d;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public final destroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->e:LKd/a;

    .line 3
    .line 4
    invoke-static {v1, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->s:LR8/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LR8/a;->destroy()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->y:LR1/q;

    .line 2
    .line 3
    iget-object v0, v0, LR1/q;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LHf/x0;

    .line 6
    .line 7
    return-object v0
.end method
