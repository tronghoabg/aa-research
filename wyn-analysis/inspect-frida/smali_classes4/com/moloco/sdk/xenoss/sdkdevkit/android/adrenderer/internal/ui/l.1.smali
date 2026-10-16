.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/c;


# instance fields
.field public final synthetic a:LZ/d;

.field public final synthetic b:LE/F;

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:Lcom/moloco/sdk/internal/ortb/model/D;


# direct methods
.method public constructor <init>(LZ/d;LE/F;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;JJJLcom/moloco/sdk/internal/ortb/model/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->a:LZ/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->b:LE/F;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;

    .line 11
    .line 12
    iput-wide p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->e:J

    .line 13
    .line 14
    iput-wide p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->f:J

    .line 15
    .line 16
    iput-wide p9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->g:J

    .line 17
    .line 18
    iput-object p11, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->h:Lcom/moloco/sdk/internal/ortb/model/D;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, LE/q;->a:LE/q;

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v6

    .line 13
    move-object/from16 v2, p3

    .line 14
    .line 15
    check-cast v2, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    move-object/from16 v11, p4

    .line 22
    .line 23
    check-cast v11, Ltf/a;

    .line 24
    .line 25
    move-object/from16 v5, p5

    .line 26
    .line 27
    check-cast v5, Ltf/l;

    .line 28
    .line 29
    move-object/from16 v3, p6

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    move-object/from16 v3, p7

    .line 38
    .line 39
    check-cast v3, Lef/u;

    .line 40
    .line 41
    move-object/from16 v4, p8

    .line 42
    .line 43
    check-cast v4, Lef/u;

    .line 44
    .line 45
    move-object/from16 v7, p9

    .line 46
    .line 47
    check-cast v7, Ltf/a;

    .line 48
    .line 49
    move-object/from16 v9, p10

    .line 50
    .line 51
    check-cast v9, LN/o;

    .line 52
    .line 53
    move-object/from16 v10, p11

    .line 54
    .line 55
    check-cast v10, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    const-string v12, "onClick"

    .line 62
    .line 63
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v12, "onButtonRendered"

    .line 67
    .line 68
    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v12, "onTimerFinish"

    .line 72
    .line 73
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    and-int/lit8 v12, v10, 0x6

    .line 77
    .line 78
    if-nez v12, :cond_1

    .line 79
    .line 80
    invoke-virtual {v9, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eqz v12, :cond_0

    .line 85
    .line 86
    const/4 v12, 0x4

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    const/4 v12, 0x2

    .line 89
    :goto_0
    or-int/2addr v12, v10

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move v12, v10

    .line 92
    :goto_1
    and-int/lit8 v13, v10, 0x30

    .line 93
    .line 94
    if-nez v13, :cond_3

    .line 95
    .line 96
    invoke-virtual {v9, v6}, LN/o;->f(Z)Z

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_2

    .line 101
    .line 102
    const/16 v13, 0x20

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    const/16 v13, 0x10

    .line 106
    .line 107
    :goto_2
    or-int/2addr v12, v13

    .line 108
    :cond_3
    and-int/lit16 v13, v10, 0x180

    .line 109
    .line 110
    if-nez v13, :cond_5

    .line 111
    .line 112
    invoke-virtual {v9, v2}, LN/o;->f(Z)Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_4

    .line 117
    .line 118
    const/16 v13, 0x100

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    const/16 v13, 0x80

    .line 122
    .line 123
    :goto_3
    or-int/2addr v12, v13

    .line 124
    :cond_5
    and-int/lit16 v13, v10, 0xc00

    .line 125
    .line 126
    if-nez v13, :cond_7

    .line 127
    .line 128
    invoke-virtual {v9, v11}, LN/o;->e(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-eqz v13, :cond_6

    .line 133
    .line 134
    const/16 v13, 0x800

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    const/16 v13, 0x400

    .line 138
    .line 139
    :goto_4
    or-int/2addr v12, v13

    .line 140
    :cond_7
    and-int/lit16 v13, v10, 0x6000

    .line 141
    .line 142
    if-nez v13, :cond_9

    .line 143
    .line 144
    invoke-virtual {v9, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    if-eqz v13, :cond_8

    .line 149
    .line 150
    const/16 v13, 0x4000

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    const/16 v13, 0x2000

    .line 154
    .line 155
    :goto_5
    or-int/2addr v12, v13

    .line 156
    :cond_9
    const/high16 v20, 0x30000

    .line 157
    .line 158
    and-int v13, v10, v20

    .line 159
    .line 160
    if-nez v13, :cond_b

    .line 161
    .line 162
    invoke-virtual {v9, v8}, LN/o;->f(Z)Z

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-eqz v13, :cond_a

    .line 167
    .line 168
    const/high16 v13, 0x20000

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_a
    const/high16 v13, 0x10000

    .line 172
    .line 173
    :goto_6
    or-int/2addr v12, v13

    .line 174
    :cond_b
    const/high16 v13, 0x180000

    .line 175
    .line 176
    and-int/2addr v13, v10

    .line 177
    iget v3, v3, Lef/u;->a:I

    .line 178
    .line 179
    if-nez v13, :cond_d

    .line 180
    .line 181
    invoke-virtual {v9, v3}, LN/o;->c(I)Z

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    if-eqz v13, :cond_c

    .line 186
    .line 187
    const/high16 v13, 0x100000

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_c
    const/high16 v13, 0x80000

    .line 191
    .line 192
    :goto_7
    or-int/2addr v12, v13

    .line 193
    :cond_d
    const/high16 v13, 0xc00000

    .line 194
    .line 195
    and-int/2addr v13, v10

    .line 196
    iget v4, v4, Lef/u;->a:I

    .line 197
    .line 198
    if-nez v13, :cond_f

    .line 199
    .line 200
    invoke-virtual {v9, v4}, LN/o;->c(I)Z

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-eqz v13, :cond_e

    .line 205
    .line 206
    const/high16 v13, 0x800000

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_e
    const/high16 v13, 0x400000

    .line 210
    .line 211
    :goto_8
    or-int/2addr v12, v13

    .line 212
    :cond_f
    const/high16 v13, 0x6000000

    .line 213
    .line 214
    and-int/2addr v10, v13

    .line 215
    if-nez v10, :cond_11

    .line 216
    .line 217
    invoke-virtual {v9, v7}, LN/o;->e(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-eqz v10, :cond_10

    .line 222
    .line 223
    const/high16 v10, 0x4000000

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_10
    const/high16 v10, 0x2000000

    .line 227
    .line 228
    :goto_9
    or-int/2addr v12, v10

    .line 229
    :cond_11
    move/from16 v21, v12

    .line 230
    .line 231
    const v10, 0x12492493

    .line 232
    .line 233
    .line 234
    and-int v10, v21, v10

    .line 235
    .line 236
    const v12, 0x12492492

    .line 237
    .line 238
    .line 239
    if-ne v10, v12, :cond_13

    .line 240
    .line 241
    invoke-virtual {v9}, LN/o;->x()Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-nez v10, :cond_12

    .line 246
    .line 247
    goto :goto_a

    .line 248
    :cond_12
    invoke-virtual {v9}, LN/o;->I()V

    .line 249
    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_13
    :goto_a
    sget-object v10, LZ/i;->a:LZ/i;

    .line 253
    .line 254
    iget-object v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->a:LZ/d;

    .line 255
    .line 256
    invoke-virtual {v1, v10, v12}, LE/q;->a(LZ/k;LZ/d;)LZ/k;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-static {v1}, Lr7/e;->w(LZ/k;)LZ/k;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->b:LE/F;

    .line 265
    .line 266
    invoke-static {v1, v10}, Lcom/moloco/sdk/internal/publisher/H;->e0(LZ/k;LE/F;)LZ/k;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    move-object v10, v9

    .line 271
    move v9, v3

    .line 272
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/k;

    .line 273
    .line 274
    move-object v12, v10

    .line 275
    move v10, v4

    .line 276
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 277
    .line 278
    iget-wide v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->g:J

    .line 279
    .line 280
    iget-object v15, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->h:Lcom/moloco/sdk/internal/ortb/model/D;

    .line 281
    .line 282
    move-object/from16 v19, v7

    .line 283
    .line 284
    iget-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;

    .line 285
    .line 286
    move-wide/from16 v16, v13

    .line 287
    .line 288
    move-object v14, v12

    .line 289
    iget-wide v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->e:J

    .line 290
    .line 291
    move-object/from16 v18, v14

    .line 292
    .line 293
    move-object/from16 v22, v15

    .line 294
    .line 295
    iget-wide v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/l;->f:J

    .line 296
    .line 297
    move-object/from16 v0, v18

    .line 298
    .line 299
    move-object/from16 v18, v22

    .line 300
    .line 301
    invoke-direct/range {v3 .. v19}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/k;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Ltf/l;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;ZIILtf/a;JJJLcom/moloco/sdk/internal/ortb/model/D;Ltf/a;)V

    .line 302
    .line 303
    .line 304
    const v4, 0x2d6c2f1f

    .line 305
    .line 306
    .line 307
    invoke-static {v0, v4, v3}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    shr-int/lit8 v4, v21, 0x6

    .line 312
    .line 313
    and-int/lit8 v4, v4, 0xe

    .line 314
    .line 315
    or-int v4, v4, v20

    .line 316
    .line 317
    const/4 v5, 0x0

    .line 318
    const/4 v6, 0x0

    .line 319
    const/4 v7, 0x0

    .line 320
    move-object/from16 p7, v0

    .line 321
    .line 322
    move-object/from16 p2, v1

    .line 323
    .line 324
    move/from16 p1, v2

    .line 325
    .line 326
    move-object/from16 p6, v3

    .line 327
    .line 328
    move/from16 p8, v4

    .line 329
    .line 330
    move-object/from16 p4, v5

    .line 331
    .line 332
    move-object/from16 p5, v6

    .line 333
    .line 334
    move-object/from16 p3, v7

    .line 335
    .line 336
    invoke-static/range {p1 .. p8}, LFe/c;->b(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;LN/o;I)V

    .line 337
    .line 338
    .line 339
    :goto_b
    sget-object v0, Lef/C;->a:Lef/C;

    .line 340
    .line 341
    return-object v0
.end method
