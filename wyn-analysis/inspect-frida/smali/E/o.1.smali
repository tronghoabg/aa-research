.class public final LE/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/n;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LZ/d;


# direct methods
.method public constructor <init>(LZ/d;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, LE/o;->a:Z

    .line 5
    .line 6
    iput-object p1, p0, LE/o;->b:LZ/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lt0/r;LP/a;J)LD0/b;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const-string v1, "$this$MeasurePolicy"

    .line 8
    .line 9
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v3, LP/a;->a:LP/d;

    .line 13
    .line 14
    invoke-virtual {v1}, LP/d;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static/range {p3 .. p4}, LL0/a;->f(J)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sget-object v3, LE/l;->k:LE/l;

    .line 29
    .line 30
    invoke-static {v4, v1, v2, v3}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    return-object v1

    .line 35
    :cond_0
    iget-boolean v2, v0, LE/o;->a:Z

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    move-wide/from16 v6, p3

    .line 41
    .line 42
    move-wide v8, v6

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-wide/from16 v6, p3

    .line 45
    .line 46
    invoke-static {v5, v5, v6, v7}, LL0/a;->a(IIJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v8

    .line 50
    :goto_0
    iget v2, v1, LP/d;->c:I

    .line 51
    .line 52
    iget-object v7, v0, LE/o;->b:LZ/d;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v10, 0x1

    .line 56
    if-ne v2, v10, :cond_5

    .line 57
    .line 58
    invoke-virtual {v3, v5}, LP/a;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v3, v1

    .line 63
    check-cast v3, Lr0/m;

    .line 64
    .line 65
    invoke-interface {v3}, Lr0/m;->a()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    instance-of v2, v1, LE/j;

    .line 70
    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    move-object v6, v1

    .line 74
    check-cast v6, LE/j;

    .line 75
    .line 76
    :cond_2
    if-eqz v6, :cond_3

    .line 77
    .line 78
    iget-boolean v5, v6, LE/j;->c:Z

    .line 79
    .line 80
    :cond_3
    if-nez v5, :cond_4

    .line 81
    .line 82
    invoke-interface {v3, v8, v9}, Lr0/m;->e(J)Lr0/t;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    iget v5, v1, Lr0/t;->a:I

    .line 91
    .line 92
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-static/range {p3 .. p4}, LL0/a;->f(J)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    iget v6, v1, Lr0/t;->b:I

    .line 101
    .line 102
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    :goto_1
    move v6, v5

    .line 107
    move v5, v2

    .line 108
    move-object v2, v1

    .line 109
    goto :goto_2

    .line 110
    :cond_4
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-static/range {p3 .. p4}, LL0/a;->f(J)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-static/range {p3 .. p4}, LL0/a;->f(J)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-static {v1, v6}, Lvf/a;->r(II)J

    .line 127
    .line 128
    .line 129
    move-result-wide v8

    .line 130
    invoke-interface {v3, v8, v9}, Lr0/m;->e(J)Lr0/t;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    goto :goto_1

    .line 135
    :goto_2
    new-instance v1, LE/n;

    .line 136
    .line 137
    invoke-direct/range {v1 .. v7}, LE/n;-><init>(Lr0/t;Lr0/m;Lt0/r;IILZ/d;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v4, v5, v6, v1}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    return-object v1

    .line 145
    :cond_5
    new-array v2, v2, [Lr0/t;

    .line 146
    .line 147
    move v11, v5

    .line 148
    new-instance v5, Lkotlin/jvm/internal/E;

    .line 149
    .line 150
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    iput v12, v5, Lkotlin/jvm/internal/E;->a:I

    .line 158
    .line 159
    move-object v12, v6

    .line 160
    new-instance v6, Lkotlin/jvm/internal/E;

    .line 161
    .line 162
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-static/range {p3 .. p4}, LL0/a;->f(J)I

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    iput v13, v6, Lkotlin/jvm/internal/E;->a:I

    .line 170
    .line 171
    iget v13, v1, LP/d;->c:I

    .line 172
    .line 173
    move v14, v11

    .line 174
    move v15, v14

    .line 175
    :goto_3
    if-ge v14, v13, :cond_9

    .line 176
    .line 177
    invoke-virtual {v3, v14}, LP/a;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v16

    .line 181
    move-object/from16 v10, v16

    .line 182
    .line 183
    check-cast v10, Lr0/m;

    .line 184
    .line 185
    invoke-interface {v10}, Lr0/m;->a()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    instance-of v12, v11, LE/j;

    .line 190
    .line 191
    if-eqz v12, :cond_6

    .line 192
    .line 193
    check-cast v11, LE/j;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    const/4 v11, 0x0

    .line 197
    :goto_4
    if-eqz v11, :cond_7

    .line 198
    .line 199
    iget-boolean v11, v11, LE/j;->c:Z

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_7
    const/4 v11, 0x0

    .line 203
    :goto_5
    if-nez v11, :cond_8

    .line 204
    .line 205
    invoke-interface {v10, v8, v9}, Lr0/m;->e(J)Lr0/t;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    aput-object v10, v2, v14

    .line 210
    .line 211
    iget v11, v5, Lkotlin/jvm/internal/E;->a:I

    .line 212
    .line 213
    iget v12, v10, Lr0/t;->a:I

    .line 214
    .line 215
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    iput v11, v5, Lkotlin/jvm/internal/E;->a:I

    .line 220
    .line 221
    iget v11, v6, Lkotlin/jvm/internal/E;->a:I

    .line 222
    .line 223
    iget v10, v10, Lr0/t;->b:I

    .line 224
    .line 225
    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    iput v10, v6, Lkotlin/jvm/internal/E;->a:I

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_8
    const/4 v15, 0x1

    .line 233
    :goto_6
    add-int/lit8 v14, v14, 0x1

    .line 234
    .line 235
    const/4 v10, 0x1

    .line 236
    const/4 v11, 0x0

    .line 237
    const/4 v12, 0x0

    .line 238
    goto :goto_3

    .line 239
    :cond_9
    if-eqz v15, :cond_f

    .line 240
    .line 241
    iget v8, v5, Lkotlin/jvm/internal/E;->a:I

    .line 242
    .line 243
    const v9, 0x7fffffff

    .line 244
    .line 245
    .line 246
    if-eq v8, v9, :cond_a

    .line 247
    .line 248
    move v10, v8

    .line 249
    goto :goto_7

    .line 250
    :cond_a
    const/4 v10, 0x0

    .line 251
    :goto_7
    iget v11, v6, Lkotlin/jvm/internal/E;->a:I

    .line 252
    .line 253
    if-eq v11, v9, :cond_b

    .line 254
    .line 255
    move v9, v11

    .line 256
    goto :goto_8

    .line 257
    :cond_b
    const/4 v9, 0x0

    .line 258
    :goto_8
    invoke-static {v10, v8, v9, v11}, Lxg/g;->a(IIII)J

    .line 259
    .line 260
    .line 261
    move-result-wide v8

    .line 262
    iget v1, v1, LP/d;->c:I

    .line 263
    .line 264
    const/4 v10, 0x0

    .line 265
    :goto_9
    if-ge v10, v1, :cond_f

    .line 266
    .line 267
    invoke-virtual {v3, v10}, LP/a;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    check-cast v11, Lr0/m;

    .line 272
    .line 273
    invoke-interface {v11}, Lr0/m;->a()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    instance-of v13, v12, LE/j;

    .line 278
    .line 279
    if-eqz v13, :cond_c

    .line 280
    .line 281
    check-cast v12, LE/j;

    .line 282
    .line 283
    goto :goto_a

    .line 284
    :cond_c
    const/4 v12, 0x0

    .line 285
    :goto_a
    if-eqz v12, :cond_d

    .line 286
    .line 287
    iget-boolean v12, v12, LE/j;->c:Z

    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_d
    const/4 v12, 0x0

    .line 291
    :goto_b
    if-eqz v12, :cond_e

    .line 292
    .line 293
    invoke-interface {v11, v8, v9}, Lr0/m;->e(J)Lr0/t;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    aput-object v11, v2, v10

    .line 298
    .line 299
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_f
    iget v8, v5, Lkotlin/jvm/internal/E;->a:I

    .line 303
    .line 304
    iget v9, v6, Lkotlin/jvm/internal/E;->a:I

    .line 305
    .line 306
    new-instance v1, LB/D;

    .line 307
    .line 308
    invoke-direct/range {v1 .. v7}, LB/D;-><init>([Lr0/t;LP/a;Lt0/r;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;LZ/d;)V

    .line 309
    .line 310
    .line 311
    invoke-static {v4, v8, v9, v1}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    return-object v1
.end method
