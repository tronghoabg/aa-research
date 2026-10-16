.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ltf/a;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:J

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:Lh0/c;


# direct methods
.method public constructor <init>(FLjava/lang/String;Ltf/a;ZZLjava/lang/String;JJJLh0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->c:Ltf/a;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-wide p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->g:J

    .line 17
    .line 18
    iput-wide p9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->h:J

    .line 19
    .line 20
    iput-wide p11, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->i:J

    .line 21
    .line 22
    iput-object p13, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->j:Lh0/c;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, LN/o;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v2, v2, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-ne v2, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, LN/o;->x()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v1}, LN/o;->I()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_1
    :goto_0
    sget-object v2, LE/L;->a:LE/x;

    .line 33
    .line 34
    new-instance v3, LE/M;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v8, 0x5

    .line 38
    const/4 v4, 0x0

    .line 39
    iget v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->a:F

    .line 40
    .line 41
    const/high16 v7, 0x7fc00000    # Float.NaN

    .line 42
    .line 43
    invoke-direct/range {v3 .. v8}, LE/M;-><init>(FFFFI)V

    .line 44
    .line 45
    .line 46
    const/16 v2, 0xa

    .line 47
    .line 48
    int-to-float v2, v2

    .line 49
    const/4 v4, 0x6

    .line 50
    int-to-float v5, v4

    .line 51
    new-instance v6, LE/E;

    .line 52
    .line 53
    invoke-direct {v6, v2, v5, v2, v5}, LE/E;-><init>(FFFF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v6}, LE/M;->g(LZ/k;)LZ/k;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {v1, v4, v4}, LM/s;->a(LN/o;II)LM/e;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    const v2, 0x449e6261

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, LN/o;->M(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, LN/o;->F()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget-object v3, LN/k;->a:LN/P;

    .line 75
    .line 76
    if-ne v2, v3, :cond_2

    .line 77
    .line 78
    new-instance v2, LD/i;

    .line 79
    .line 80
    invoke-direct {v2}, LD/i;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    move-object v8, v2

    .line 87
    check-cast v8, LD/i;

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 91
    .line 92
    .line 93
    new-instance v12, Lx0/e;

    .line 94
    .line 95
    invoke-direct {v12, v2}, Lx0/e;-><init>(I)V

    .line 96
    .line 97
    .line 98
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->b:Ljava/lang/String;

    .line 99
    .line 100
    const/4 v10, 0x0

    .line 101
    const/4 v14, 0x4

    .line 102
    iget-object v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->c:Ltf/a;

    .line 103
    .line 104
    invoke-static/range {v7 .. v14}, Lcom/moloco/sdk/internal/publisher/H;->Q(LZ/k;LD/i;LM/e;ZLjava/lang/String;Lx0/e;Ltf/a;I)LZ/k;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    move-object/from16 v17, v11

    .line 109
    .line 110
    sget-object v5, LE/i;->c:LE/b;

    .line 111
    .line 112
    const v6, 0x2952b718

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v6}, LN/o;->M(I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v5, v1}, LE/J;->a(LE/c;LN/o;)Lr0/n;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    const v6, -0x4ee9b9da

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v6}, LN/o;->M(I)V

    .line 126
    .line 127
    .line 128
    sget-object v6, Lu0/M;->e:LN/L0;

    .line 129
    .line 130
    invoke-virtual {v1, v6}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    check-cast v6, LL0/b;

    .line 135
    .line 136
    sget-object v7, Lu0/M;->k:LN/L0;

    .line 137
    .line 138
    invoke-virtual {v1, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, LL0/i;

    .line 143
    .line 144
    sget-object v8, Lu0/M;->o:LN/L0;

    .line 145
    .line 146
    invoke-virtual {v1, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, Lu0/p0;

    .line 151
    .line 152
    sget-object v9, Lt0/c;->g9:Lt0/b;

    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    sget-object v9, Lt0/b;->b:Lt0/d;

    .line 158
    .line 159
    invoke-static {v3}, LS3/f;->y(LZ/k;)LV/d;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v1}, LN/o;->O()V

    .line 164
    .line 165
    .line 166
    iget-boolean v10, v1, LN/o;->O:Z

    .line 167
    .line 168
    if-eqz v10, :cond_3

    .line 169
    .line 170
    invoke-virtual {v1, v9}, LN/o;->k(Ltf/a;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    invoke-virtual {v1}, LN/o;->X()V

    .line 175
    .line 176
    .line 177
    :goto_1
    iput-boolean v2, v1, LN/o;->x:Z

    .line 178
    .line 179
    sget-object v9, Lt0/b;->e:Lt0/a;

    .line 180
    .line 181
    invoke-static {v1, v5, v9}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 182
    .line 183
    .line 184
    sget-object v5, Lt0/b;->d:Lt0/a;

    .line 185
    .line 186
    invoke-static {v1, v6, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 187
    .line 188
    .line 189
    sget-object v5, Lt0/b;->f:Lt0/a;

    .line 190
    .line 191
    invoke-static {v1, v7, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 192
    .line 193
    .line 194
    sget-object v5, Lt0/b;->g:Lt0/a;

    .line 195
    .line 196
    invoke-static {v1, v8, v5, v1}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    const v6, 0x7ab4aae9

    .line 201
    .line 202
    .line 203
    invoke-static {v2, v3, v5, v1, v6}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 204
    .line 205
    .line 206
    const v3, -0x286e2e7f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v3}, LN/o;->M(I)V

    .line 210
    .line 211
    .line 212
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/M;

    .line 213
    .line 214
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->f:Ljava/lang/String;

    .line 215
    .line 216
    iget-wide v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->g:J

    .line 217
    .line 218
    iget-wide v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->h:J

    .line 219
    .line 220
    invoke-direct/range {v5 .. v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/M;-><init>(Ljava/lang/String;JJ)V

    .line 221
    .line 222
    .line 223
    move-wide/from16 v18, v7

    .line 224
    .line 225
    const v3, -0x24dae108

    .line 226
    .line 227
    .line 228
    invoke-static {v1, v3, v5}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    new-instance v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/L;

    .line 233
    .line 234
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->j:Lh0/c;

    .line 235
    .line 236
    iget-wide v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->i:J

    .line 237
    .line 238
    move-object/from16 v16, v5

    .line 239
    .line 240
    invoke-direct/range {v13 .. v19}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/L;-><init>(JLh0/c;Ljava/lang/String;J)V

    .line 241
    .line 242
    .line 243
    const v5, 0x15e0d584

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v5, v13}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    const/4 v6, 0x4

    .line 251
    iget-boolean v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->d:Z

    .line 252
    .line 253
    iget-boolean v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/N;->e:Z

    .line 254
    .line 255
    if-eqz v7, :cond_5

    .line 256
    .line 257
    const v7, 0x2e226833

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v7}, LN/o;->M(I)V

    .line 261
    .line 262
    .line 263
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    invoke-virtual {v3, v1, v7}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    if-eqz v8, :cond_4

    .line 271
    .line 272
    int-to-float v3, v6

    .line 273
    invoke-static {v3}, LE/L;->f(F)LZ/k;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v1, v3}, Lka/e0;->b(LN/o;LZ/k;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v5, v1, v3}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    :cond_4
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 288
    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_5
    const v7, 0x2e2540b3

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v7}, LN/o;->M(I)V

    .line 295
    .line 296
    .line 297
    const v7, 0x2ac76737

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v7}, LN/o;->M(I)V

    .line 301
    .line 302
    .line 303
    if-eqz v8, :cond_6

    .line 304
    .line 305
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    invoke-virtual {v5, v1, v7}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    int-to-float v5, v6

    .line 313
    invoke-static {v5}, LE/L;->f(F)LZ/k;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-static {v1, v5}, Lka/e0;->b(LN/o;LZ/k;)V

    .line 318
    .line 319
    .line 320
    :cond_6
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 321
    .line 322
    .line 323
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v3, v1, v4}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 331
    .line 332
    .line 333
    :goto_2
    const/4 v3, 0x1

    .line 334
    invoke-static {v1, v2, v2, v3, v2}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v2}, LN/o;->p(Z)V

    .line 338
    .line 339
    .line 340
    :goto_3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 341
    .line 342
    return-object v1
.end method
