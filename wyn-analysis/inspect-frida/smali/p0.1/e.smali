.class public final Lp0/e;
.super La2/v;
.source "SourceFile"


# instance fields
.field public final c:Lp0/n;

.field public final d:LP/d;

.field public final e:Ljava/util/LinkedHashMap;

.field public f:Lr0/k;

.field public g:Lp0/f;

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Lp0/n;)V
    .locals 1

    .line 1
    const-string v0, "pointerInputFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x12

    .line 7
    .line 8
    invoke-direct {p0, v0}, La2/v;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lp0/e;->c:Lp0/n;

    .line 12
    .line 13
    new-instance p1, LP/d;

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    new-array v0, v0, [Lp0/j;

    .line 18
    .line 19
    invoke-direct {p1, v0}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lp0/e;->d:LP/d;

    .line 23
    .line 24
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lp0/e;->e:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lp0/e;->i:Z

    .line 33
    .line 34
    iput-boolean p1, p0, Lp0/e;->j:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final C()V
    .locals 4

    .line 1
    iget-object v0, p0, La2/v;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LP/d;

    .line 4
    .line 5
    iget v1, v0, LP/d;->c:I

    .line 6
    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :cond_0
    aget-object v3, v0, v2

    .line 13
    .line 14
    check-cast v3, Lp0/e;

    .line 15
    .line 16
    invoke-virtual {v3}, Lp0/e;->C()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    if-lt v2, v1, :cond_0

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lp0/e;->c:Lp0/n;

    .line 24
    .line 25
    invoke-virtual {v0}, Lp0/n;->a()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final D(LE5/b;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lp0/e;->e:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lp0/e;->c:Lp0/n;

    .line 12
    .line 13
    iget-boolean v3, v1, Lp0/n;->b:Z

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v3, p0, Lp0/e;->g:Lp0/f;

    .line 19
    .line 20
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v4, p0, Lp0/e;->f:Lr0/k;

    .line 24
    .line 25
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    check-cast v4, Lt0/y;

    .line 29
    .line 30
    iget-wide v4, v4, Lr0/t;->c:J

    .line 31
    .line 32
    sget-object v6, Lp0/g;->c:Lp0/g;

    .line 33
    .line 34
    invoke-virtual {v1, v3, v6, v4, v5}, Lp0/n;->n(Lp0/f;Lp0/g;J)V

    .line 35
    .line 36
    .line 37
    iget-boolean v1, v1, Lp0/n;->b:Z

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, La2/v;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, LP/d;

    .line 45
    .line 46
    iget v4, v1, LP/d;->c:I

    .line 47
    .line 48
    if-lez v4, :cond_3

    .line 49
    .line 50
    iget-object v1, v1, LP/d;->a:[Ljava/lang/Object;

    .line 51
    .line 52
    :cond_2
    aget-object v5, v1, v2

    .line 53
    .line 54
    check-cast v5, Lp0/e;

    .line 55
    .line 56
    invoke-virtual {v5, p1}, Lp0/e;->D(LE5/b;)Z

    .line 57
    .line 58
    .line 59
    add-int/2addr v2, v3

    .line 60
    if-lt v2, v4, :cond_2

    .line 61
    .line 62
    :cond_3
    move v2, v3

    .line 63
    :goto_0
    invoke-virtual {p0, p1}, Lp0/e;->o(LE5/b;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    iput-object p1, p0, Lp0/e;->f:Lr0/k;

    .line 71
    .line 72
    return v2
.end method

.method public final G(Ljava/util/Map;Lr0/k;LE5/b;Z)Z
    .locals 9

    .line 1
    const-string v0, "changes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "parentCoordinates"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lp0/e;->e:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p2, p0, Lp0/e;->c:Lp0/n;

    .line 22
    .line 23
    iget-boolean v1, p2, Lp0/n;->b:Z

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    :goto_0
    return v0

    .line 28
    :cond_1
    iget-object v1, p0, Lp0/e;->g:Lp0/f;

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lp0/e;->f:Lr0/k;

    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    check-cast v2, Lt0/y;

    .line 39
    .line 40
    iget-wide v2, v2, Lr0/t;->c:J

    .line 41
    .line 42
    sget-object v4, Lp0/g;->a:Lp0/g;

    .line 43
    .line 44
    invoke-virtual {p2, v1, v4, v2, v3}, Lp0/n;->n(Lp0/f;Lp0/g;J)V

    .line 45
    .line 46
    .line 47
    iget-boolean v4, p2, Lp0/n;->b:Z

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    iget-object v4, p0, La2/v;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, LP/d;

    .line 55
    .line 56
    iget v6, v4, LP/d;->c:I

    .line 57
    .line 58
    if-lez v6, :cond_3

    .line 59
    .line 60
    iget-object v4, v4, LP/d;->a:[Ljava/lang/Object;

    .line 61
    .line 62
    :cond_2
    aget-object v7, v4, v0

    .line 63
    .line 64
    check-cast v7, Lp0/e;

    .line 65
    .line 66
    iget-object v8, p0, Lp0/e;->f:Lr0/k;

    .line 67
    .line 68
    invoke-static {v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v7, p1, v8, p3, p4}, Lp0/e;->G(Ljava/util/Map;Lr0/k;LE5/b;Z)Z

    .line 72
    .line 73
    .line 74
    add-int/2addr v0, v5

    .line 75
    if-lt v0, v6, :cond_2

    .line 76
    .line 77
    :cond_3
    iget-boolean p1, p2, Lp0/n;->b:Z

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    sget-object p1, Lp0/g;->b:Lp0/g;

    .line 82
    .line 83
    invoke-virtual {p2, v1, p1, v2, v3}, Lp0/n;->n(Lp0/f;Lp0/g;J)V

    .line 84
    .line 85
    .line 86
    :cond_4
    return v5
.end method

.method public final n(Ljava/util/LinkedHashMap;Lt0/i;LE5/b;Z)Z
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "parentCoordinates"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p4}, La2/v;->n(Ljava/util/LinkedHashMap;Lt0/i;LE5/b;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget-object v4, v0, Lp0/e;->c:Lp0/n;

    .line 17
    .line 18
    iget-boolean v5, v4, Lp0/n;->b:Z

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    return v6

    .line 24
    :cond_0
    iget-object v4, v4, Lp0/n;->a:Lr0/k;

    .line 25
    .line 26
    iput-object v4, v0, Lp0/e;->f:Lr0/k;

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    iget-object v7, v0, Lp0/e;->e:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    iget-object v9, v0, Lp0/e;->d:LP/d;

    .line 44
    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    check-cast v10, Lp0/j;

    .line 58
    .line 59
    iget-wide v10, v10, Lp0/j;->a:J

    .line 60
    .line 61
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lp0/k;

    .line 66
    .line 67
    new-instance v12, Lp0/j;

    .line 68
    .line 69
    invoke-direct {v12, v10, v11}, Lp0/j;-><init>(J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9, v12}, LP/d;->f(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_1

    .line 77
    .line 78
    new-instance v9, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v12, v5, Lp0/k;->j:Ljava/util/ArrayList;

    .line 84
    .line 85
    if-nez v12, :cond_2

    .line 86
    .line 87
    sget-object v12, Lff/v;->a:Lff/v;

    .line 88
    .line 89
    :cond_2
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    :goto_1
    if-ge v8, v13, :cond_3

    .line 94
    .line 95
    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    check-cast v14, Lp0/b;

    .line 100
    .line 101
    new-instance v15, Lp0/b;

    .line 102
    .line 103
    move/from16 v29, v6

    .line 104
    .line 105
    move-object/from16 v30, v7

    .line 106
    .line 107
    iget-wide v6, v14, Lp0/b;->a:J

    .line 108
    .line 109
    move/from16 v31, v3

    .line 110
    .line 111
    iget-object v3, v0, Lp0/e;->f:Lr0/k;

    .line 112
    .line 113
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    check-cast v3, Lt0/y;

    .line 117
    .line 118
    move-object/from16 v16, v12

    .line 119
    .line 120
    move/from16 v17, v13

    .line 121
    .line 122
    iget-wide v12, v14, Lp0/b;->b:J

    .line 123
    .line 124
    invoke-virtual {v3, v1, v12, v13}, Lt0/y;->V(Lt0/i;J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v12

    .line 128
    invoke-direct {v15, v6, v7, v12, v13}, Lp0/b;-><init>(JJ)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    add-int/lit8 v8, v8, 0x1

    .line 135
    .line 136
    move-object/from16 v12, v16

    .line 137
    .line 138
    move/from16 v13, v17

    .line 139
    .line 140
    move/from16 v6, v29

    .line 141
    .line 142
    move-object/from16 v7, v30

    .line 143
    .line 144
    move/from16 v3, v31

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    move/from16 v31, v3

    .line 148
    .line 149
    move/from16 v29, v6

    .line 150
    .line 151
    move-object/from16 v30, v7

    .line 152
    .line 153
    new-instance v3, Lp0/j;

    .line 154
    .line 155
    invoke-direct {v3, v10, v11}, Lp0/j;-><init>(J)V

    .line 156
    .line 157
    .line 158
    iget-object v6, v0, Lp0/e;->f:Lr0/k;

    .line 159
    .line 160
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    check-cast v6, Lt0/y;

    .line 164
    .line 165
    iget-wide v7, v5, Lp0/k;->f:J

    .line 166
    .line 167
    invoke-virtual {v6, v1, v7, v8}, Lt0/y;->V(Lt0/i;J)J

    .line 168
    .line 169
    .line 170
    move-result-wide v22

    .line 171
    iget-object v6, v0, Lp0/e;->f:Lr0/k;

    .line 172
    .line 173
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    check-cast v6, Lt0/y;

    .line 177
    .line 178
    iget-wide v7, v5, Lp0/k;->c:J

    .line 179
    .line 180
    invoke-virtual {v6, v1, v7, v8}, Lt0/y;->V(Lt0/i;J)J

    .line 181
    .line 182
    .line 183
    move-result-wide v17

    .line 184
    new-instance v12, Lp0/k;

    .line 185
    .line 186
    iget v6, v5, Lp0/k;->h:I

    .line 187
    .line 188
    iget-wide v7, v5, Lp0/k;->i:J

    .line 189
    .line 190
    iget-wide v13, v5, Lp0/k;->a:J

    .line 191
    .line 192
    iget-wide v10, v5, Lp0/k;->b:J

    .line 193
    .line 194
    iget-boolean v15, v5, Lp0/k;->d:Z

    .line 195
    .line 196
    move/from16 v25, v6

    .line 197
    .line 198
    move-wide/from16 v27, v7

    .line 199
    .line 200
    iget-wide v6, v5, Lp0/k;->e:J

    .line 201
    .line 202
    iget-boolean v8, v5, Lp0/k;->g:Z

    .line 203
    .line 204
    move-wide/from16 v20, v6

    .line 205
    .line 206
    move/from16 v24, v8

    .line 207
    .line 208
    move-object/from16 v26, v9

    .line 209
    .line 210
    move/from16 v19, v15

    .line 211
    .line 212
    move-wide v15, v10

    .line 213
    invoke-direct/range {v12 .. v28}, Lp0/k;-><init>(JJJZJJZILjava/util/ArrayList;J)V

    .line 214
    .line 215
    .line 216
    iget-object v5, v5, Lp0/k;->k:LVa/zb;

    .line 217
    .line 218
    iput-object v5, v12, Lp0/k;->k:LVa/zb;

    .line 219
    .line 220
    move-object/from16 v5, v30

    .line 221
    .line 222
    invoke-interface {v5, v3, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move/from16 v6, v29

    .line 226
    .line 227
    move/from16 v3, v31

    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_4
    move/from16 v31, v3

    .line 232
    .line 233
    move/from16 v29, v6

    .line 234
    .line 235
    move-object v5, v7

    .line 236
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_5

    .line 241
    .line 242
    invoke-virtual {v9}, LP/d;->e()V

    .line 243
    .line 244
    .line 245
    iget-object v1, v0, La2/v;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, LP/d;

    .line 248
    .line 249
    invoke-virtual {v1}, LP/d;->e()V

    .line 250
    .line 251
    .line 252
    return v29

    .line 253
    :cond_5
    iget v1, v9, LP/d;->c:I

    .line 254
    .line 255
    add-int/lit8 v1, v1, -0x1

    .line 256
    .line 257
    :goto_2
    const/4 v3, -0x1

    .line 258
    if-ge v3, v1, :cond_7

    .line 259
    .line 260
    iget-object v3, v9, LP/d;->a:[Ljava/lang/Object;

    .line 261
    .line 262
    aget-object v3, v3, v1

    .line 263
    .line 264
    check-cast v3, Lp0/j;

    .line 265
    .line 266
    iget-wide v3, v3, Lp0/j;->a:J

    .line 267
    .line 268
    new-instance v6, Lp0/j;

    .line 269
    .line 270
    invoke-direct {v6, v3, v4}, Lp0/j;-><init>(J)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v3, p1

    .line 274
    .line 275
    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-nez v4, :cond_6

    .line 280
    .line 281
    invoke-virtual {v9, v1}, LP/d;->m(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    :cond_6
    add-int/lit8 v1, v1, -0x1

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_7
    new-instance v1, Lp0/f;

    .line 288
    .line 289
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    check-cast v3, Ljava/lang/Iterable;

    .line 294
    .line 295
    invoke-static {v3}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    invoke-direct {v1, v3, v2}, Lp0/f;-><init>(Ljava/util/List;LE5/b;)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    move v5, v8

    .line 307
    :goto_3
    if-ge v5, v4, :cond_9

    .line 308
    .line 309
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    move-object v7, v6

    .line 314
    check-cast v7, Lp0/k;

    .line 315
    .line 316
    iget-wide v9, v7, Lp0/k;->a:J

    .line 317
    .line 318
    invoke-virtual {v2, v9, v10}, LE5/b;->i(J)Z

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    if-eqz v7, :cond_8

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_9
    const/4 v6, 0x0

    .line 329
    :goto_4
    check-cast v6, Lp0/k;

    .line 330
    .line 331
    const/4 v2, 0x3

    .line 332
    if-eqz v6, :cond_12

    .line 333
    .line 334
    iget-boolean v3, v6, Lp0/k;->d:Z

    .line 335
    .line 336
    if-nez p4, :cond_a

    .line 337
    .line 338
    iput-boolean v8, v0, Lp0/e;->i:Z

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_a
    iget-boolean v4, v0, Lp0/e;->i:Z

    .line 342
    .line 343
    if-nez v4, :cond_c

    .line 344
    .line 345
    if-nez v3, :cond_b

    .line 346
    .line 347
    iget-boolean v4, v6, Lp0/k;->g:Z

    .line 348
    .line 349
    if-eqz v4, :cond_c

    .line 350
    .line 351
    :cond_b
    iget-object v4, v0, Lp0/e;->f:Lr0/k;

    .line 352
    .line 353
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    check-cast v4, Lt0/y;

    .line 357
    .line 358
    iget-wide v4, v4, Lr0/t;->c:J

    .line 359
    .line 360
    invoke-static {v6, v4, v5}, Landroid/support/v4/media/session/b;->j0(Lp0/k;J)Z

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    xor-int/lit8 v4, v4, 0x1

    .line 365
    .line 366
    iput-boolean v4, v0, Lp0/e;->i:Z

    .line 367
    .line 368
    :cond_c
    :goto_5
    iget-boolean v4, v0, Lp0/e;->i:Z

    .line 369
    .line 370
    iget-boolean v5, v0, Lp0/e;->h:Z

    .line 371
    .line 372
    const/4 v6, 0x5

    .line 373
    const/4 v7, 0x4

    .line 374
    if-eq v4, v5, :cond_10

    .line 375
    .line 376
    iget v9, v1, Lp0/f;->c:I

    .line 377
    .line 378
    if-ne v9, v2, :cond_d

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_d
    if-ne v9, v7, :cond_e

    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_e
    if-ne v9, v6, :cond_10

    .line 385
    .line 386
    :goto_6
    if-eqz v4, :cond_f

    .line 387
    .line 388
    move v6, v7

    .line 389
    :cond_f
    iput v6, v1, Lp0/f;->c:I

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_10
    iget v9, v1, Lp0/f;->c:I

    .line 393
    .line 394
    if-ne v9, v7, :cond_11

    .line 395
    .line 396
    if-eqz v5, :cond_11

    .line 397
    .line 398
    iget-boolean v5, v0, Lp0/e;->j:Z

    .line 399
    .line 400
    if-nez v5, :cond_11

    .line 401
    .line 402
    iput v2, v1, Lp0/f;->c:I

    .line 403
    .line 404
    goto :goto_7

    .line 405
    :cond_11
    if-ne v9, v6, :cond_12

    .line 406
    .line 407
    if-eqz v4, :cond_12

    .line 408
    .line 409
    if-eqz v3, :cond_12

    .line 410
    .line 411
    iput v2, v1, Lp0/f;->c:I

    .line 412
    .line 413
    :cond_12
    :goto_7
    if-nez v31, :cond_16

    .line 414
    .line 415
    iget v3, v1, Lp0/f;->c:I

    .line 416
    .line 417
    if-ne v3, v2, :cond_16

    .line 418
    .line 419
    iget-object v2, v0, Lp0/e;->g:Lp0/f;

    .line 420
    .line 421
    if-eqz v2, :cond_16

    .line 422
    .line 423
    iget-object v2, v2, Lp0/f;->a:Ljava/util/List;

    .line 424
    .line 425
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    iget-object v4, v1, Lp0/f;->a:Ljava/util/List;

    .line 430
    .line 431
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-eq v3, v5, :cond_13

    .line 436
    .line 437
    goto :goto_9

    .line 438
    :cond_13
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    move v5, v8

    .line 443
    :goto_8
    if-ge v5, v3, :cond_15

    .line 444
    .line 445
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    check-cast v6, Lp0/k;

    .line 450
    .line 451
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    check-cast v7, Lp0/k;

    .line 456
    .line 457
    iget-wide v9, v6, Lp0/k;->c:J

    .line 458
    .line 459
    iget-wide v6, v7, Lp0/k;->c:J

    .line 460
    .line 461
    invoke-static {v9, v10, v6, v7}, Ld0/c;->a(JJ)Z

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    if-nez v6, :cond_14

    .line 466
    .line 467
    goto :goto_9

    .line 468
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 469
    .line 470
    goto :goto_8

    .line 471
    :cond_15
    move v6, v8

    .line 472
    goto :goto_a

    .line 473
    :cond_16
    :goto_9
    move/from16 v6, v29

    .line 474
    .line 475
    :goto_a
    iput-object v1, v0, Lp0/e;->g:Lp0/f;

    .line 476
    .line 477
    return v6
.end method

.method public final o(LE5/b;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, La2/v;->o(LE5/b;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp0/e;->g:Lp0/f;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v1, p0, Lp0/e;->i:Z

    .line 10
    .line 11
    iput-boolean v1, p0, Lp0/e;->h:Z

    .line 12
    .line 13
    iget-object v1, v0, Lp0/f;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_3

    .line 22
    .line 23
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Lp0/k;

    .line 28
    .line 29
    iget-boolean v6, v5, Lp0/k;->d:Z

    .line 30
    .line 31
    if-nez v6, :cond_2

    .line 32
    .line 33
    iget-wide v5, v5, Lp0/k;->a:J

    .line 34
    .line 35
    invoke-virtual {p1, v5, v6}, LE5/b;->i(J)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    iget-boolean v7, p0, Lp0/e;->i:Z

    .line 42
    .line 43
    if-nez v7, :cond_2

    .line 44
    .line 45
    :cond_1
    new-instance v7, Lp0/j;

    .line 46
    .line 47
    invoke-direct {v7, v5, v6}, Lp0/j;-><init>(J)V

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lp0/e;->d:LP/d;

    .line 51
    .line 52
    invoke-virtual {v5, v7}, LP/d;->k(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iput-boolean v3, p0, Lp0/e;->i:Z

    .line 59
    .line 60
    iget p1, v0, Lp0/f;->c:I

    .line 61
    .line 62
    const/4 v0, 0x5

    .line 63
    if-ne p1, v0, :cond_4

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    :cond_4
    iput-boolean v3, p0, Lp0/e;->j:Z

    .line 67
    .line 68
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Node(pointerInputFilter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp0/e;->c:Lp0/n;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", children="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La2/v;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, LP/d;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", pointerIds="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lp0/e;->d:LP/d;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v1, 0x29

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method
