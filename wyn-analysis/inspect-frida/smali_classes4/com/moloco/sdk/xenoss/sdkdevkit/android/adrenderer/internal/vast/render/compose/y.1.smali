.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    int-to-float v0, v0

    .line 3
    sput v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/y;->a:F

    .line 4
    .line 5
    return-void
.end method

.method public static final a(LZ/k;Ljava/lang/String;JLtf/a;LN/o;I)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v15, p5

    .line 10
    .line 11
    move/from16 v0, p6

    .line 12
    .line 13
    const/16 v6, 0x30

    .line 14
    .line 15
    const-string v7, "onClick"

    .line 16
    .line 17
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const v7, -0x6775caf5

    .line 21
    .line 22
    .line 23
    invoke-virtual {v15, v7}, LN/o;->N(I)LN/o;

    .line 24
    .line 25
    .line 26
    and-int/lit8 v7, v0, 0x6

    .line 27
    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    invoke-virtual {v15, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    const/4 v7, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v7, 0x2

    .line 39
    :goto_0
    or-int/2addr v7, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v7, v0

    .line 42
    :goto_1
    and-int/lit8 v8, v0, 0x30

    .line 43
    .line 44
    if-nez v8, :cond_3

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    invoke-virtual {v15, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_2

    .line 52
    .line 53
    const/16 v8, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v8, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v7, v8

    .line 59
    :cond_3
    and-int/lit16 v8, v0, 0x180

    .line 60
    .line 61
    if-nez v8, :cond_5

    .line 62
    .line 63
    invoke-virtual {v15, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_4

    .line 68
    .line 69
    const/16 v8, 0x100

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const/16 v8, 0x80

    .line 73
    .line 74
    :goto_3
    or-int/2addr v7, v8

    .line 75
    :cond_5
    and-int/lit16 v8, v0, 0xc00

    .line 76
    .line 77
    if-nez v8, :cond_7

    .line 78
    .line 79
    invoke-virtual {v15, v3, v4}, LN/o;->d(J)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_6

    .line 84
    .line 85
    const/16 v8, 0x800

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    const/16 v8, 0x400

    .line 89
    .line 90
    :goto_4
    or-int/2addr v7, v8

    .line 91
    :cond_7
    and-int/lit16 v8, v0, 0x6000

    .line 92
    .line 93
    if-nez v8, :cond_9

    .line 94
    .line 95
    invoke-virtual {v15, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_8

    .line 100
    .line 101
    const/16 v8, 0x4000

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_8
    const/16 v8, 0x2000

    .line 105
    .line 106
    :goto_5
    or-int/2addr v7, v8

    .line 107
    :cond_9
    and-int/lit16 v8, v7, 0x2493

    .line 108
    .line 109
    const/16 v9, 0x2492

    .line 110
    .line 111
    if-ne v8, v9, :cond_b

    .line 112
    .line 113
    invoke-virtual {v15}, LN/o;->x()Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-nez v8, :cond_a

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    invoke-virtual {v15}, LN/o;->I()V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_8

    .line 124
    .line 125
    :cond_b
    :goto_6
    invoke-virtual {v15}, LN/o;->K()V

    .line 126
    .line 127
    .line 128
    and-int/lit8 v8, v0, 0x1

    .line 129
    .line 130
    if-eqz v8, :cond_d

    .line 131
    .line 132
    invoke-virtual {v15}, LN/o;->w()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_c

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    invoke-virtual {v15}, LN/o;->I()V

    .line 140
    .line 141
    .line 142
    :cond_d
    :goto_7
    invoke-virtual {v15}, LN/o;->q()V

    .line 143
    .line 144
    .line 145
    int-to-float v6, v6

    .line 146
    invoke-static {v1, v6}, LE/L;->b(LZ/k;F)LZ/k;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    const/16 v8, 0x9c

    .line 151
    .line 152
    int-to-float v8, v8

    .line 153
    invoke-static {v6, v8}, LE/L;->g(LZ/k;F)LZ/k;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-static {v6}, LFe/e;->j(LZ/k;)LZ/k;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    const/4 v8, 0x0

    .line 162
    int-to-float v9, v8

    .line 163
    new-instance v13, LE/F;

    .line 164
    .line 165
    sget v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/y;->a:F

    .line 166
    .line 167
    invoke-direct {v13, v10, v9, v10, v9}, LE/F;-><init>(FFFF)V

    .line 168
    .line 169
    .line 170
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/x;

    .line 171
    .line 172
    invoke-direct {v9, v2, v3, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/x;-><init>(Ljava/lang/String;J)V

    .line 173
    .line 174
    .line 175
    const v10, 0x5c9927fd

    .line 176
    .line 177
    .line 178
    invoke-static {v15, v10, v9}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    shr-int/lit8 v7, v7, 0xc

    .line 183
    .line 184
    and-int/lit8 v7, v7, 0xe

    .line 185
    .line 186
    const/high16 v9, 0x36000000

    .line 187
    .line 188
    or-int/2addr v7, v9

    .line 189
    const v9, -0x69dda8d6

    .line 190
    .line 191
    .line 192
    invoke-virtual {v15, v9}, LN/o;->M(I)V

    .line 193
    .line 194
    .line 195
    const v9, -0x1d58f75c

    .line 196
    .line 197
    .line 198
    invoke-virtual {v15, v9}, LN/o;->M(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v15}, LN/o;->F()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    sget-object v10, LN/k;->a:LN/P;

    .line 206
    .line 207
    if-ne v9, v10, :cond_e

    .line 208
    .line 209
    new-instance v9, LD/i;

    .line 210
    .line 211
    invoke-direct {v9}, LD/i;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v15, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_e
    invoke-virtual {v15, v8}, LN/o;->p(Z)V

    .line 218
    .line 219
    .line 220
    check-cast v9, LD/i;

    .line 221
    .line 222
    sget-object v10, LK/A;->a:LN/L0;

    .line 223
    .line 224
    invoke-virtual {v15, v10}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    check-cast v10, LK/z;

    .line 229
    .line 230
    iget-object v10, v10, LK/z;->a:LH/d;

    .line 231
    .line 232
    sget-object v11, LK/a;->a:LE/F;

    .line 233
    .line 234
    const v11, -0x7ca6e789

    .line 235
    .line 236
    .line 237
    invoke-virtual {v15, v11}, LN/o;->M(I)V

    .line 238
    .line 239
    .line 240
    sget-object v11, LK/g;->a:LN/L0;

    .line 241
    .line 242
    invoke-virtual {v15, v11}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    check-cast v12, LK/e;

    .line 247
    .line 248
    move-object/from16 v17, v9

    .line 249
    .line 250
    invoke-virtual {v12}, LK/e;->a()J

    .line 251
    .line 252
    .line 253
    move-result-wide v8

    .line 254
    const v12, 0x3df5c28f    # 0.12f

    .line 255
    .line 256
    .line 257
    invoke-static {v8, v9, v12}, Le0/q;->a(JF)J

    .line 258
    .line 259
    .line 260
    move-result-wide v8

    .line 261
    new-instance v12, LB/h;

    .line 262
    .line 263
    new-instance v0, Le0/G;

    .line 264
    .line 265
    invoke-direct {v0, v8, v9}, Le0/G;-><init>(J)V

    .line 266
    .line 267
    .line 268
    sget v8, LK/a;->d:F

    .line 269
    .line 270
    invoke-direct {v12, v8, v0}, LB/h;-><init>(FLe0/m;)V

    .line 271
    .line 272
    .line 273
    const/4 v0, 0x0

    .line 274
    invoke-virtual {v15, v0}, LN/o;->p(Z)V

    .line 275
    .line 276
    .line 277
    const v0, -0x7e9fdd4d

    .line 278
    .line 279
    .line 280
    invoke-virtual {v15, v0}, LN/o;->M(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v15, v11}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, LK/e;

    .line 288
    .line 289
    invoke-virtual {v0}, LK/e;->c()J

    .line 290
    .line 291
    .line 292
    move-result-wide v19

    .line 293
    invoke-virtual {v15, v11}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, LK/e;

    .line 298
    .line 299
    invoke-virtual {v0}, LK/e;->b()J

    .line 300
    .line 301
    .line 302
    move-result-wide v21

    .line 303
    invoke-virtual {v15, v11}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, LK/e;

    .line 308
    .line 309
    invoke-virtual {v0}, LK/e;->a()J

    .line 310
    .line 311
    .line 312
    move-result-wide v8

    .line 313
    invoke-static {v15}, LBa/c;->y(LN/o;)F

    .line 314
    .line 315
    .line 316
    const v0, 0x3ec28f5c    # 0.38f

    .line 317
    .line 318
    .line 319
    invoke-static {v8, v9, v0}, Le0/q;->a(JF)J

    .line 320
    .line 321
    .line 322
    move-result-wide v25

    .line 323
    new-instance v18, LK/j;

    .line 324
    .line 325
    move-wide/from16 v23, v19

    .line 326
    .line 327
    invoke-direct/range {v18 .. v26}, LK/j;-><init>(JJJJ)V

    .line 328
    .line 329
    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-virtual {v15, v0}, LN/o;->p(Z)V

    .line 332
    .line 333
    .line 334
    const v8, 0x7ffffffe

    .line 335
    .line 336
    .line 337
    and-int v16, v7, v8

    .line 338
    .line 339
    const/4 v7, 0x1

    .line 340
    const/4 v9, 0x0

    .line 341
    move-object/from16 v8, v17

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    move-object v11, v12

    .line 346
    move-object/from16 v12, v18

    .line 347
    .line 348
    invoke-static/range {v5 .. v17}, LA6/h;->a(Ltf/a;LZ/k;ZLD/i;LK/n;Le0/E;LB/h;LK/j;LE/F;LV/d;LN/o;II)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v15, v0}, LN/o;->p(Z)V

    .line 352
    .line 353
    .line 354
    :goto_8
    invoke-virtual {v15}, LN/o;->r()LN/i0;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    if-eqz v7, :cond_f

    .line 359
    .line 360
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/w;

    .line 361
    .line 362
    move-object/from16 v5, p4

    .line 363
    .line 364
    move/from16 v6, p6

    .line 365
    .line 366
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/w;-><init>(LZ/k;Ljava/lang/String;JLtf/a;I)V

    .line 367
    .line 368
    .line 369
    iput-object v0, v7, LN/i0;->d:Ltf/p;

    .line 370
    .line 371
    :cond_f
    return-void
.end method
