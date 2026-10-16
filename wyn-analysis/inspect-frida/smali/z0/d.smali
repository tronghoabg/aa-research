.class public final Lz0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LVa/Y7;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:F

.field public final f:I

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(LVa/Y7;JIZ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lz0/d;->a:LVa/Y7;

    .line 9
    .line 10
    move/from16 v2, p4

    .line 11
    .line 12
    iput v2, v0, Lz0/d;->b:I

    .line 13
    .line 14
    invoke-static/range {p2 .. p3}, LL0/a;->g(J)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_a

    .line 19
    .line 20
    invoke-static/range {p2 .. p3}, LL0/a;->f(J)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_a

    .line 25
    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v1, v1, LVa/Y7;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    :goto_0
    if-ge v6, v3, :cond_4

    .line 43
    .line 44
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    check-cast v7, Lz0/g;

    .line 49
    .line 50
    iget-object v15, v7, Lz0/g;->a:LH0/c;

    .line 51
    .line 52
    invoke-static/range {p2 .. p3}, LL0/a;->e(J)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-static/range {p2 .. p3}, LL0/a;->b(J)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_0

    .line 61
    .line 62
    invoke-static/range {p2 .. p3}, LL0/a;->d(J)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    const/16 p4, 0x0

    .line 67
    .line 68
    float-to-double v4, v13

    .line 69
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    double-to-float v4, v4

    .line 74
    float-to-int v4, v4

    .line 75
    sub-int/2addr v9, v4

    .line 76
    if-gez v9, :cond_1

    .line 77
    .line 78
    move/from16 v9, p4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    const/16 p4, 0x0

    .line 82
    .line 83
    invoke-static/range {p2 .. p3}, LL0/a;->d(J)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    :cond_1
    :goto_1
    const/4 v4, 0x5

    .line 88
    invoke-static {v8, v9, v4}, Lxg/g;->b(III)J

    .line 89
    .line 90
    .line 91
    move-result-wide v18

    .line 92
    iget v4, v0, Lz0/d;->b:I

    .line 93
    .line 94
    sub-int v16, v4, v11

    .line 95
    .line 96
    new-instance v14, LH0/a;

    .line 97
    .line 98
    move/from16 v17, p5

    .line 99
    .line 100
    invoke-direct/range {v14 .. v19}, LH0/a;-><init>(LH0/c;IZJ)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v14}, LH0/a;->b()F

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    add-float/2addr v4, v13

    .line 108
    iget-object v5, v14, LH0/a;->d:LA0/q;

    .line 109
    .line 110
    iget v8, v5, LA0/q;->c:I

    .line 111
    .line 112
    add-int v12, v11, v8

    .line 113
    .line 114
    new-instance v8, Lz0/f;

    .line 115
    .line 116
    iget v9, v7, Lz0/g;->b:I

    .line 117
    .line 118
    iget v10, v7, Lz0/g;->c:I

    .line 119
    .line 120
    move-object v7, v8

    .line 121
    move-object v8, v14

    .line 122
    move v14, v4

    .line 123
    invoke-direct/range {v7 .. v14}, Lz0/f;-><init>(LH0/a;IIIIFF)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    iget-boolean v4, v5, LA0/q;->a:Z

    .line 130
    .line 131
    if-nez v4, :cond_3

    .line 132
    .line 133
    iget v4, v0, Lz0/d;->b:I

    .line 134
    .line 135
    if-ne v12, v4, :cond_2

    .line 136
    .line 137
    iget-object v4, v0, Lz0/d;->a:LVa/Y7;

    .line 138
    .line 139
    iget-object v4, v4, LVa/Y7;->d:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-static {v4}, Lr7/e;->z(Ljava/util/List;)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eq v6, v4, :cond_2

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    move v11, v12

    .line 153
    move v13, v14

    .line 154
    goto :goto_0

    .line 155
    :cond_3
    :goto_2
    const/4 v1, 0x1

    .line 156
    move v11, v12

    .line 157
    move v13, v14

    .line 158
    goto :goto_3

    .line 159
    :cond_4
    const/16 p4, 0x0

    .line 160
    .line 161
    move/from16 v1, p4

    .line 162
    .line 163
    :goto_3
    iput v13, v0, Lz0/d;->e:F

    .line 164
    .line 165
    iput v11, v0, Lz0/d;->f:I

    .line 166
    .line 167
    iput-boolean v1, v0, Lz0/d;->c:Z

    .line 168
    .line 169
    iput-object v2, v0, Lz0/d;->h:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-static/range {p2 .. p3}, LL0/a;->e(J)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    int-to-float v1, v1

    .line 176
    iput v1, v0, Lz0/d;->d:F

    .line 177
    .line 178
    new-instance v1, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    move/from16 v4, p4

    .line 192
    .line 193
    :goto_4
    const/4 v5, 0x0

    .line 194
    if-ge v4, v3, :cond_7

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    check-cast v6, Lz0/f;

    .line 201
    .line 202
    iget-object v7, v6, Lz0/f;->a:LH0/a;

    .line 203
    .line 204
    iget-object v7, v7, LH0/a;->e:Ljava/lang/Object;

    .line 205
    .line 206
    new-instance v8, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    move/from16 v10, p4

    .line 220
    .line 221
    :goto_5
    if-ge v10, v9, :cond_6

    .line 222
    .line 223
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    check-cast v11, Ld0/d;

    .line 228
    .line 229
    if-eqz v11, :cond_5

    .line 230
    .line 231
    iget v12, v6, Lz0/f;->f:F

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    invoke-static {v13, v12}, LU8/v0;->f(FF)J

    .line 235
    .line 236
    .line 237
    move-result-wide v14

    .line 238
    invoke-virtual {v11, v14, v15}, Ld0/d;->e(J)Ld0/d;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    goto :goto_6

    .line 243
    :cond_5
    const/4 v13, 0x0

    .line 244
    move-object v11, v5

    .line 245
    :goto_6
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    add-int/lit8 v10, v10, 0x1

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_6
    const/4 v13, 0x0

    .line 252
    invoke-static {v8, v1}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 253
    .line 254
    .line 255
    add-int/lit8 v4, v4, 0x1

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-gez v2, :cond_9

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    rsub-int/lit8 v2, v2, 0x0

    .line 269
    .line 270
    new-instance v3, Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 273
    .line 274
    .line 275
    move/from16 v4, p4

    .line 276
    .line 277
    :goto_7
    if-ge v4, v2, :cond_8

    .line 278
    .line 279
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    add-int/lit8 v4, v4, 0x1

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_8
    invoke-static {v3, v1}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    :cond_9
    iput-object v1, v0, Lz0/d;->g:Ljava/util/ArrayList;

    .line 290
    .line 291
    return-void

    .line 292
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 293
    .line 294
    const-string v2, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 295
    .line 296
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v1
.end method


# virtual methods
.method public final a(Le0/o;JLe0/D;LK0/d;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1}, Le0/o;->m()V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lz0/d;->h:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_4

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lz0/f;

    .line 19
    .line 20
    iget-object v5, v4, Lz0/f;->a:LH0/a;

    .line 21
    .line 22
    iget-object v6, v5, LH0/a;->a:LH0/c;

    .line 23
    .line 24
    iget-object v6, v6, LH0/c;->g:LH0/d;

    .line 25
    .line 26
    invoke-virtual {v6, p2, p3}, LH0/d;->a(J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6, p4}, LH0/d;->b(Le0/D;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6, p5}, LH0/d;->c(LK0/d;)V

    .line 33
    .line 34
    .line 35
    sget-object v6, Le0/c;->a:Landroid/graphics/Canvas;

    .line 36
    .line 37
    move-object v6, p1

    .line 38
    check-cast v6, Le0/b;

    .line 39
    .line 40
    iget-object v6, v6, Le0/b;->a:Landroid/graphics/Canvas;

    .line 41
    .line 42
    iget-object v7, v5, LH0/a;->d:LA0/q;

    .line 43
    .line 44
    iget-boolean v8, v7, LA0/q;->a:Z

    .line 45
    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, LH0/a;->c()F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-virtual {v5}, LH0/a;->b()F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v6, v0, v0, v8, v5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const-string v5, "canvas"

    .line 66
    .line 67
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget v5, v7, LA0/q;->d:I

    .line 71
    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    int-to-float v8, v5

    .line 75
    invoke-virtual {v6, v0, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object v8, v7, LA0/q;->b:Landroid/text/Layout;

    .line 79
    .line 80
    invoke-virtual {v8, v6}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 81
    .line 82
    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    const/4 v8, -0x1

    .line 86
    int-to-float v8, v8

    .line 87
    int-to-float v5, v5

    .line 88
    mul-float/2addr v8, v5

    .line 89
    invoke-virtual {v6, v0, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 90
    .line 91
    .line 92
    :cond_2
    iget-boolean v5, v7, LA0/q;->a:Z

    .line 93
    .line 94
    if-eqz v5, :cond_3

    .line 95
    .line 96
    invoke-virtual {v6}, Landroid/graphics/Canvas;->restore()V

    .line 97
    .line 98
    .line 99
    :cond_3
    iget-object v4, v4, Lz0/f;->a:LH0/a;

    .line 100
    .line 101
    invoke-virtual {v4}, LH0/a;->b()F

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    invoke-interface {p1, v0, v4}, Le0/o;->f(FF)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v3, v3, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-interface {p1}, Le0/o;->restore()V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lz0/d;->a:LVa/Y7;

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, LVa/Y7;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz0/b;

    .line 8
    .line 9
    iget-object v1, v1, Lz0/b;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-gt p1, v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v1, "offset("

    .line 19
    .line 20
    const-string v2, ") is out of bounds [0, "

    .line 21
    .line 22
    invoke-static {p1, v1, v2}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, v0, LVa/Y7;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lz0/b;

    .line 29
    .line 30
    iget-object v0, v0, Lz0/b;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 v0, 0x5d

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method public final c(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lz0/d;->f:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "lineIndex("

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ") is out of bounds [0, "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 p1, 0x29

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method
