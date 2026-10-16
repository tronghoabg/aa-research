.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLtf/a;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->c:J

    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;J)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, LE/K;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, LN/o;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const-string v4, "$this$Button"

    .line 25
    .line 26
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    and-int/lit8 v1, v3, 0x11

    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, LN/o;->x()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v2}, LN/o;->I()V

    .line 43
    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_1
    :goto_0
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->b:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Ljava/lang/Integer;

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-static {v3}, LFe/b;->E(I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    new-instance v5, LL0/j;

    .line 63
    .line 64
    invoke-direct {v5, v3, v4}, LL0/j;-><init>(J)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v5, 0x0

    .line 69
    :goto_1
    const v3, -0x4a360fac

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v3}, LN/o;->M(I)V

    .line 73
    .line 74
    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    sget-object v3, LK/M;->a:LN/L0;

    .line 78
    .line 79
    invoke-virtual {v2, v3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, LK/L;

    .line 84
    .line 85
    iget-object v3, v3, LK/L;->k:Lz0/p;

    .line 86
    .line 87
    iget-object v3, v3, Lz0/p;->a:Lz0/j;

    .line 88
    .line 89
    iget-wide v3, v3, Lz0/j;->b:J

    .line 90
    .line 91
    :goto_2
    move-wide v6, v3

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    iget-wide v3, v5, LL0/j;->a:J

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :goto_3
    const/4 v3, 0x0

    .line 97
    invoke-virtual {v2, v3}, LN/o;->p(Z)V

    .line 98
    .line 99
    .line 100
    sget-object v8, LE0/l;->f:LE0/l;

    .line 101
    .line 102
    const/16 v22, 0xc30

    .line 103
    .line 104
    const v23, 0xd7d2

    .line 105
    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    iget-wide v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->c:J

    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    const-wide/16 v10, 0x0

    .line 112
    .line 113
    const/4 v12, 0x0

    .line 114
    const-wide/16 v13, 0x0

    .line 115
    .line 116
    const/4 v15, 0x2

    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    const/16 v17, 0x1

    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const/16 v19, 0x0

    .line 124
    .line 125
    const/high16 v21, 0x30000

    .line 126
    .line 127
    move-object/from16 v20, v2

    .line 128
    .line 129
    move-object v2, v1

    .line 130
    invoke-static/range {v2 .. v23}, LK/I;->b(Ljava/lang/String;LZ/k;JJLE0/l;LE0/o;JLK0/c;JIZILK/B;Lz0/p;LN/o;III)V

    .line 131
    .line 132
    .line 133
    :goto_4
    sget-object v1, Lef/C;->a:Lef/C;

    .line 134
    .line 135
    return-object v1

    .line 136
    :pswitch_0
    move-object/from16 v2, p1

    .line 137
    .line 138
    check-cast v2, LZ/k;

    .line 139
    .line 140
    move-object/from16 v7, p2

    .line 141
    .line 142
    check-cast v7, LN/o;

    .line 143
    .line 144
    move-object/from16 v1, p3

    .line 145
    .line 146
    check-cast v1, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    const-string v3, "it"

    .line 153
    .line 154
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    and-int/lit8 v3, v1, 0x6

    .line 158
    .line 159
    if-nez v3, :cond_5

    .line 160
    .line 161
    invoke-virtual {v7, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_4

    .line 166
    .line 167
    const/4 v3, 0x4

    .line 168
    goto :goto_5

    .line 169
    :cond_4
    const/4 v3, 0x2

    .line 170
    :goto_5
    or-int/2addr v1, v3

    .line 171
    :cond_5
    and-int/lit8 v3, v1, 0x13

    .line 172
    .line 173
    const/16 v4, 0x12

    .line 174
    .line 175
    if-ne v3, v4, :cond_7

    .line 176
    .line 177
    invoke-virtual {v7}, LN/o;->x()Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_6

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_6
    invoke-virtual {v7}, LN/o;->I()V

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_7
    :goto_6
    const v3, -0x58737427

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v3}, LN/o;->M(I)V

    .line 192
    .line 193
    .line 194
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->d:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v3, Ltf/a;

    .line 197
    .line 198
    invoke-virtual {v7, v3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    const/4 v5, 0x0

    .line 203
    invoke-virtual {v7, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    or-int/2addr v4, v5

    .line 208
    invoke-virtual {v7}, LN/o;->F()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    if-nez v4, :cond_8

    .line 213
    .line 214
    sget-object v4, LN/k;->a:LN/P;

    .line 215
    .line 216
    if-ne v5, v4, :cond_9

    .line 217
    .line 218
    :cond_8
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/i;

    .line 219
    .line 220
    const/4 v4, 0x2

    .line 221
    invoke-direct {v5, v3, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/i;-><init>(Ltf/a;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v7, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :cond_9
    move-object v6, v5

    .line 228
    check-cast v6, Ltf/a;

    .line 229
    .line 230
    const/4 v3, 0x0

    .line 231
    invoke-virtual {v7, v3}, LN/o;->p(Z)V

    .line 232
    .line 233
    .line 234
    and-int/lit8 v8, v1, 0xe

    .line 235
    .line 236
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->b:Ljava/lang/String;

    .line 237
    .line 238
    iget-wide v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->c:J

    .line 239
    .line 240
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/y;->a(LZ/k;Ljava/lang/String;JLtf/a;LN/o;I)V

    .line 241
    .line 242
    .line 243
    :goto_7
    sget-object v1, Lef/C;->a:Lef/C;

    .line 244
    .line 245
    return-object v1

    .line 246
    :pswitch_1
    move-object/from16 v2, p1

    .line 247
    .line 248
    check-cast v2, LZ/k;

    .line 249
    .line 250
    move-object/from16 v7, p2

    .line 251
    .line 252
    check-cast v7, LN/o;

    .line 253
    .line 254
    move-object/from16 v1, p3

    .line 255
    .line 256
    check-cast v1, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    const-string v3, "it"

    .line 263
    .line 264
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    and-int/lit8 v3, v1, 0x6

    .line 268
    .line 269
    if-nez v3, :cond_b

    .line 270
    .line 271
    invoke-virtual {v7, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_a

    .line 276
    .line 277
    const/4 v3, 0x4

    .line 278
    goto :goto_8

    .line 279
    :cond_a
    const/4 v3, 0x2

    .line 280
    :goto_8
    or-int/2addr v1, v3

    .line 281
    :cond_b
    and-int/lit8 v3, v1, 0x13

    .line 282
    .line 283
    const/16 v4, 0x12

    .line 284
    .line 285
    if-ne v3, v4, :cond_d

    .line 286
    .line 287
    invoke-virtual {v7}, LN/o;->x()Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-nez v3, :cond_c

    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_c
    invoke-virtual {v7}, LN/o;->I()V

    .line 295
    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_d
    :goto_9
    const v3, -0x5873bea7

    .line 299
    .line 300
    .line 301
    invoke-virtual {v7, v3}, LN/o;->M(I)V

    .line 302
    .line 303
    .line 304
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->d:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v3, Ltf/a;

    .line 307
    .line 308
    invoke-virtual {v7, v3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    const/4 v5, 0x0

    .line 313
    invoke-virtual {v7, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    or-int/2addr v4, v5

    .line 318
    invoke-virtual {v7}, LN/o;->F()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    if-nez v4, :cond_e

    .line 323
    .line 324
    sget-object v4, LN/k;->a:LN/P;

    .line 325
    .line 326
    if-ne v5, v4, :cond_f

    .line 327
    .line 328
    :cond_e
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/i;

    .line 329
    .line 330
    const/4 v4, 0x1

    .line 331
    invoke-direct {v5, v3, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/i;-><init>(Ltf/a;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v7, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_f
    move-object v6, v5

    .line 338
    check-cast v6, Ltf/a;

    .line 339
    .line 340
    const/4 v3, 0x0

    .line 341
    invoke-virtual {v7, v3}, LN/o;->p(Z)V

    .line 342
    .line 343
    .line 344
    and-int/lit8 v8, v1, 0xe

    .line 345
    .line 346
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->b:Ljava/lang/String;

    .line 347
    .line 348
    iget-wide v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;->c:J

    .line 349
    .line 350
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/y;->a(LZ/k;Ljava/lang/String;JLtf/a;LN/o;I)V

    .line 351
    .line 352
    .line 353
    :goto_a
    sget-object v1, Lef/C;->a:Lef/C;

    .line 354
    .line 355
    return-object v1

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
