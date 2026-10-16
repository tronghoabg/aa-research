.class public final Lr9/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/f;


# static fields
.field public static final k:[B


# instance fields
.field public final a:Lr9/K;

.field public final b:La2/v;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/HashMap;

.field public final e:Lad/L;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/PriorityQueue;

.field public h:Z

.field public i:I

.field public j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lr9/F;->k:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lr9/K;La2/v;Ln9/e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr9/F;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Lad/L;

    .line 12
    .line 13
    const/16 v1, 0x18

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lad/L;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lr9/F;->e:Lad/L;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lr9/F;->f:Ljava/util/HashMap;

    .line 26
    .line 27
    new-instance v0, Ljava/util/PriorityQueue;

    .line 28
    .line 29
    new-instance v1, Lq6/d;

    .line 30
    .line 31
    const/16 v2, 0xd

    .line 32
    .line 33
    invoke-direct {v1, v2}, Lq6/d;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/16 v2, 0xa

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lr9/F;->g:Ljava/util/PriorityQueue;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lr9/F;->h:Z

    .line 45
    .line 46
    const/4 v0, -0x1

    .line 47
    iput v0, p0, Lr9/F;->i:I

    .line 48
    .line 49
    const-wide/16 v0, -0x1

    .line 50
    .line 51
    iput-wide v0, p0, Lr9/F;->j:J

    .line 52
    .line 53
    iput-object p1, p0, Lr9/F;->a:Lr9/K;

    .line 54
    .line 55
    iput-object p2, p0, Lr9/F;->b:La2/v;

    .line 56
    .line 57
    iget-object p1, p3, Ln9/e;->a:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string p1, ""

    .line 63
    .line 64
    :goto_0
    iput-object p1, p0, Lr9/F;->c:Ljava/lang/String;

    .line 65
    .line 66
    return-void
.end method

.method public static a(Ls9/a;Lp9/A;Ljava/util/Collection;)[Ljava/lang/Object;
    .locals 20

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lq9/c;

    .line 11
    .line 12
    invoke-direct {v1}, Lq9/c;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual/range {p0 .. p0}, Ls9/a;->b()Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_8

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ls9/d;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lka/C1;

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_7

    .line 57
    .line 58
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, Lq9/c;

    .line 63
    .line 64
    iget-object v8, v3, Ls9/d;->a:Ls9/j;

    .line 65
    .line 66
    move-object/from16 v9, p1

    .line 67
    .line 68
    iget-object v10, v9, Lp9/A;->c:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    iget v12, v3, Ls9/d;->b:I

    .line 79
    .line 80
    if-eqz v11, :cond_6

    .line 81
    .line 82
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    check-cast v11, Lp9/k;

    .line 87
    .line 88
    instance-of v13, v11, Lp9/j;

    .line 89
    .line 90
    if-eqz v13, :cond_1

    .line 91
    .line 92
    check-cast v11, Lp9/j;

    .line 93
    .line 94
    iget-object v13, v11, Lp9/j;->c:Ls9/j;

    .line 95
    .line 96
    invoke-virtual {v13, v8}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_1

    .line 101
    .line 102
    sget-object v13, Lp9/i;->j:Lp9/i;

    .line 103
    .line 104
    iget-object v11, v11, Lp9/j;->a:Lp9/i;

    .line 105
    .line 106
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    if-nez v13, :cond_2

    .line 111
    .line 112
    sget-object v13, Lp9/i;->k:Lp9/i;

    .line 113
    .line 114
    invoke-virtual {v11, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_1
    move-object/from16 p2, v1

    .line 122
    .line 123
    goto/16 :goto_6

    .line 124
    .line 125
    :cond_2
    :goto_3
    invoke-static {v5}, Ls9/p;->f(Lka/C1;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_6

    .line 130
    .line 131
    new-instance v7, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    new-instance v0, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5}, Lka/C1;->m()Lka/g;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v8}, Lka/g;->getValuesList()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    :cond_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_5

    .line 158
    .line 159
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    check-cast v10, Lka/C1;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-eqz v13, :cond_3

    .line 174
    .line 175
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    check-cast v13, Lq9/c;

    .line 180
    .line 181
    new-instance v14, Lq9/c;

    .line 182
    .line 183
    invoke-direct {v14}, Lq9/c;-><init>()V

    .line 184
    .line 185
    .line 186
    iget-object v13, v13, Lq9/c;->a:Lq9/e;

    .line 187
    .line 188
    iget-object v15, v13, Lq9/e;->a:[B

    .line 189
    .line 190
    iget v13, v13, Lq9/e;->b:I

    .line 191
    .line 192
    invoke-static {v15, v13}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    iget-object v15, v14, Lq9/c;->a:Lq9/e;

    .line 197
    .line 198
    array-length v4, v13

    .line 199
    invoke-virtual {v15, v4}, Lq9/e;->a(I)V

    .line 200
    .line 201
    .line 202
    array-length v4, v13

    .line 203
    move-object/from16 p2, v1

    .line 204
    .line 205
    const/4 v1, 0x0

    .line 206
    :goto_5
    if-ge v1, v4, :cond_4

    .line 207
    .line 208
    aget-byte v16, v13, v1

    .line 209
    .line 210
    move/from16 v17, v1

    .line 211
    .line 212
    iget-object v1, v15, Lq9/e;->a:[B

    .line 213
    .line 214
    move-object/from16 v18, v1

    .line 215
    .line 216
    iget v1, v15, Lq9/e;->b:I

    .line 217
    .line 218
    move/from16 v19, v1

    .line 219
    .line 220
    add-int/lit8 v1, v19, 0x1

    .line 221
    .line 222
    iput v1, v15, Lq9/e;->b:I

    .line 223
    .line 224
    aput-byte v16, v18, v19

    .line 225
    .line 226
    add-int/lit8 v1, v17, 0x1

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_4
    invoke-virtual {v14, v12}, Lq9/c;->a(I)Lvf/a;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-static {v10, v1}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Lvf/a;->S()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-object/from16 v1, p2

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_5
    move-object/from16 p2, v1

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_6
    move-object/from16 p2, v1

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :goto_6
    move-object/from16 v1, p2

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :goto_7
    invoke-virtual {v7, v12}, Lq9/c;->a(I)Lvf/a;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {v5, v1}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Lvf/a;->S()V

    .line 263
    .line 264
    .line 265
    :goto_8
    move-object/from16 v1, p2

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :cond_7
    move-object/from16 v9, p1

    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    new-array v1, v1, [Ljava/lang/Object;

    .line 278
    .line 279
    const/4 v4, 0x0

    .line 280
    :goto_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-ge v4, v2, :cond_9

    .line 285
    .line 286
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    check-cast v2, Lq9/c;

    .line 291
    .line 292
    iget-object v2, v2, Lq9/c;->a:Lq9/e;

    .line 293
    .line 294
    iget-object v3, v2, Lq9/e;->a:[B

    .line 295
    .line 296
    iget v2, v2, Lq9/e;->b:I

    .line 297
    .line 298
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    aput-object v2, v1, v4

    .line 303
    .line 304
    add-int/lit8 v4, v4, 0x1

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_9
    return-object v1
.end method

.method public static f(Ljava/util/Collection;)Ls9/b;
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "Found empty index group when looking for least recent index offset."

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ls9/a;

    .line 24
    .line 25
    iget-object v0, v0, Ls9/a;->d:Ls9/c;

    .line 26
    .line 27
    iget-object v0, v0, Ls9/c;->b:Ls9/b;

    .line 28
    .line 29
    iget v1, v0, Ls9/b;->c:I

    .line 30
    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ls9/a;

    .line 42
    .line 43
    iget-object v2, v2, Ls9/a;->d:Ls9/c;

    .line 44
    .line 45
    iget-object v2, v2, Ls9/c;->b:Ls9/b;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ls9/b;->a(Ls9/b;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-gez v3, :cond_0

    .line 52
    .line 53
    move-object v0, v2

    .line 54
    :cond_0
    iget v2, v2, Ls9/b;->c:I

    .line 55
    .line 56
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance p0, Ls9/b;

    .line 62
    .line 63
    iget-object v2, v0, Ls9/b;->a:Ls9/o;

    .line 64
    .line 65
    iget-object v0, v0, Ls9/b;->b:Ls9/h;

    .line 66
    .line 67
    invoke-direct {p0, v2, v0, v1}, Ls9/b;-><init>(Ls9/o;Ls9/h;I)V

    .line 68
    .line 69
    .line 70
    return-object p0
.end method


# virtual methods
.method public final b(Lp9/A;)Ls9/a;
    .locals 14

    .line 1
    iget-boolean v0, p0, Lr9/F;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lp9/A;->e:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p1, Lp9/A;->d:Ls9/m;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2}, Ls9/e;->f()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    new-instance v3, Ljava/util/TreeSet;

    .line 23
    .line 24
    new-instance v4, Lq6/d;

    .line 25
    .line 26
    const/16 v5, 0x14

    .line 27
    .line 28
    invoke-direct {v4, v5}, Lq6/d;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v3, v4}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v5, p1, Lp9/A;->c:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Lp9/k;

    .line 56
    .line 57
    check-cast v6, Lp9/j;

    .line 58
    .line 59
    invoke-virtual {v6}, Lp9/j;->f()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_1

    .line 64
    .line 65
    invoke-virtual {v3, v6}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object v5, p1, Lp9/A;->e:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v5, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-virtual {v2}, Ls9/e;->f()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    :goto_2
    invoke-virtual {p0, v5}, Lr9/F;->d(Ljava/lang/String;)Ljava/util/Collection;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    const/4 v6, 0x0

    .line 91
    if-eqz v5, :cond_4

    .line 92
    .line 93
    return-object v6

    .line 94
    :cond_4
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_10

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Ls9/a;

    .line 109
    .line 110
    iget-object v7, v5, Ls9/a;->b:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    const-string v8, "Collection IDs do not match"

    .line 117
    .line 118
    new-array v9, v1, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v7, v8, v9}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/util/TreeSet;->size()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    const/4 v8, 0x1

    .line 128
    if-le v7, v8, :cond_6

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    invoke-virtual {v5}, Ls9/a;->a()Ls9/d;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    :cond_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    if-eqz v9, :cond_5

    .line 146
    .line 147
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    check-cast v9, Lp9/j;

    .line 152
    .line 153
    invoke-static {v9, v7}, LA6/c;->G(Lp9/j;Ls9/d;)Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-eqz v9, :cond_7

    .line 158
    .line 159
    :cond_8
    iget-object v7, p1, Lp9/A;->b:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {v5}, Ls9/a;->b()Ljava/util/ArrayList;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    new-instance v9, Ljava/util/HashSet;

    .line 170
    .line 171
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 172
    .line 173
    .line 174
    move v10, v1

    .line 175
    :goto_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    if-ge v10, v11, :cond_a

    .line 180
    .line 181
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    check-cast v11, Ls9/d;

    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    :cond_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-eqz v13, :cond_a

    .line 196
    .line 197
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    check-cast v13, Lp9/j;

    .line 202
    .line 203
    invoke-static {v13, v11}, LA6/c;->G(Lp9/j;Ls9/d;)Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-eqz v13, :cond_9

    .line 208
    .line 209
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    check-cast v11, Ls9/d;

    .line 214
    .line 215
    iget-object v11, v11, Ls9/d;->a:Ls9/j;

    .line 216
    .line 217
    invoke-virtual {v11}, Ls9/j;->c()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    invoke-virtual {v9, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    add-int/lit8 v10, v10, 0x1

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_a
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    if-ne v10, v11, :cond_b

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_b
    invoke-virtual {v3}, Ljava/util/TreeSet;->size()I

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    if-lez v11, :cond_d

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v11

    .line 244
    check-cast v11, Lp9/j;

    .line 245
    .line 246
    iget-object v12, v11, Lp9/j;->c:Ls9/j;

    .line 247
    .line 248
    invoke-virtual {v12}, Ls9/j;->c()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    invoke-virtual {v9, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    if-nez v9, :cond_c

    .line 257
    .line 258
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    check-cast v9, Ls9/d;

    .line 263
    .line 264
    invoke-static {v11, v9}, LA6/c;->G(Lp9/j;Ls9/d;)Z

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    if-eqz v11, :cond_5

    .line 269
    .line 270
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    check-cast v11, Lp9/t;

    .line 275
    .line 276
    invoke-static {v11, v9}, LA6/c;->H(Lp9/t;Ls9/d;)Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    if-nez v9, :cond_c

    .line 281
    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 285
    .line 286
    :cond_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-ge v10, v9, :cond_e

    .line 291
    .line 292
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    check-cast v9, Ls9/d;

    .line 297
    .line 298
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    if-eqz v11, :cond_5

    .line 303
    .line 304
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    check-cast v11, Lp9/t;

    .line 309
    .line 310
    invoke-static {v11, v9}, LA6/c;->H(Lp9/t;Ls9/d;)Z

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    if-nez v9, :cond_c

    .line 315
    .line 316
    goto/16 :goto_3

    .line 317
    .line 318
    :cond_e
    :goto_5
    if-eqz v6, :cond_f

    .line 319
    .line 320
    iget-object v7, v5, Ls9/a;->c:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    iget-object v8, v6, Ls9/a;->c:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    if-le v7, v8, :cond_5

    .line 333
    .line 334
    :cond_f
    move-object v6, v5

    .line 335
    goto/16 :goto_3

    .line 336
    .line 337
    :cond_10
    return-object v6
.end method

.method public final c(Ls9/a;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p1, Ls9/a;->a:I

    .line 4
    .line 5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-array v3, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    aput-object v2, v3, v0

    .line 12
    .line 13
    const-string v2, "DELETE FROM index_configuration WHERE index_id = ?"

    .line 14
    .line 15
    iget-object v4, p0, Lr9/F;->a:Lr9/K;

    .line 16
    .line 17
    invoke-virtual {v4, v2, v3}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget v2, p1, Ls9/a;->a:I

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-array v5, v1, [Ljava/lang/Object;

    .line 27
    .line 28
    aput-object v3, v5, v0

    .line 29
    .line 30
    const-string v3, "DELETE FROM index_entries WHERE index_id = ?"

    .line 31
    .line 32
    invoke-virtual {v4, v3, v5}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-array v1, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object v3, v1, v0

    .line 42
    .line 43
    const-string v0, "DELETE FROM index_state WHERE index_id = ?"

    .line 44
    .line 45
    invoke-virtual {v4, v0, v1}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lr9/F;->g:Ljava/util/PriorityQueue;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lr9/F;->f:Ljava/util/HashMap;

    .line 54
    .line 55
    iget-object p1, p1, Ls9/a;->b:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/util/Map;

    .line 62
    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;)Ljava/util/Collection;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr9/F;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr9/F;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/Map;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final e(Ls9/a;)V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    iget-boolean v1, p0, Lr9/F;->h:Z

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    new-array v3, v2, [Ljava/lang/Object;

    .line 6
    .line 7
    const-string v4, "IndexManager not started"

    .line 8
    .line 9
    invoke-static {v1, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lr9/F;->i:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    add-int/2addr v1, v3

    .line 16
    iget-object v4, p1, Ls9/a;->b:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v5, Ls9/a;

    .line 19
    .line 20
    iget-object v6, p1, Ls9/a;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object p1, p1, Ls9/a;->d:Ls9/c;

    .line 23
    .line 24
    invoke-direct {v5, v1, v4, v6, p1}, Ls9/a;-><init>(ILjava/lang/String;Ljava/util/ArrayList;Ls9/c;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v1, p0, Lr9/F;->b:La2/v;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lia/h;->d()Lia/b;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lia/b;->b()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Ls9/d;

    .line 58
    .line 59
    invoke-static {}, Lia/f;->h()Lia/d;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    iget-object v9, v7, Ls9/d;->a:Ls9/j;

    .line 64
    .line 65
    invoke-virtual {v9}, Ls9/j;->c()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {v8, v9}, Lia/d;->b(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget v7, v7, Ls9/d;->b:I

    .line 73
    .line 74
    if-ne v7, v0, :cond_0

    .line 75
    .line 76
    invoke-virtual {v8}, Lia/d;->a()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    if-ne v7, v3, :cond_1

    .line 81
    .line 82
    sget-object v7, Lia/e;->c:Lia/e;

    .line 83
    .line 84
    invoke-virtual {v8, v7}, Lia/d;->c(Lia/e;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    sget-object v7, Lia/e;->d:Lia/e;

    .line 89
    .line 90
    invoke-virtual {v8, v7}, Lia/d;->c(Lia/e;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {v1, v8}, Lia/b;->a(Lia/d;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lia/h;

    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    new-array v0, v0, [Ljava/lang/Object;

    .line 108
    .line 109
    aput-object p1, v0, v2

    .line 110
    .line 111
    aput-object v4, v0, v3

    .line 112
    .line 113
    const/4 p1, 0x2

    .line 114
    aput-object v1, v0, p1

    .line 115
    .line 116
    iget-object p1, p0, Lr9/F;->a:Lr9/K;

    .line 117
    .line 118
    const-string v1, "INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)"

    .line 119
    .line 120
    invoke-virtual {p1, v1, v0}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v5}, Lr9/F;->i(Ls9/a;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final g(Lp9/A;)Ljava/util/List;
    .locals 13

    .line 1
    iget-object v0, p0, Lr9/F;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v2, p1, Lp9/A;->c:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    new-instance v2, Lp9/d;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iget-object v4, p1, Lp9/A;->c:Ljava/util/List;

    .line 38
    .line 39
    invoke-direct {v2, v3, v4}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 40
    .line 41
    .line 42
    iget-object v3, v2, Lp9/d;->a:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static {v2}, LFe/b;->p(Lp9/k;)Lp9/k;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, LFe/b;->o(Lp9/k;)Lp9/k;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2}, LFe/b;->G(Lp9/k;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v4, 0x0

    .line 70
    new-array v4, v4, [Ljava/lang/Object;

    .line 71
    .line 72
    const-string v5, "computeDistributedNormalForm did not result in disjunctive normal form"

    .line 73
    .line 74
    invoke-static {v3, v5, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    instance-of v3, v2, Lp9/j;

    .line 78
    .line 79
    if-nez v3, :cond_6

    .line 80
    .line 81
    instance-of v3, v2, Lp9/d;

    .line 82
    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    move-object v3, v2

    .line 86
    check-cast v3, Lp9/d;

    .line 87
    .line 88
    iget-object v4, v3, Lp9/d;->a:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_4

    .line 99
    .line 100
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, Lp9/k;

    .line 105
    .line 106
    instance-of v5, v5, Lp9/d;

    .line 107
    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-virtual {v3}, Lp9/d;->e()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    :goto_0
    invoke-virtual {v2}, Lp9/k;->b()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    :goto_1
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_7

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Lp9/k;

    .line 142
    .line 143
    new-instance v4, Lp9/A;

    .line 144
    .line 145
    invoke-virtual {v3}, Lp9/k;->b()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    iget-object v11, p1, Lp9/A;->g:Lp9/c;

    .line 150
    .line 151
    iget-object v12, p1, Lp9/A;->h:Lp9/c;

    .line 152
    .line 153
    iget-object v5, p1, Lp9/A;->d:Ls9/m;

    .line 154
    .line 155
    iget-object v6, p1, Lp9/A;->e:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v8, p1, Lp9/A;->b:Ljava/util/List;

    .line 158
    .line 159
    iget-wide v9, p1, Lp9/A;->f:J

    .line 160
    .line 161
    invoke-direct/range {v4 .. v12}, Lp9/A;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLp9/c;Lp9/c;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_7
    :goto_4
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    return-object v1
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lr9/F;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr9/F;->g:Ljava/util/PriorityQueue;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ls9/a;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Ls9/a;->b:Ljava/lang/String;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public final i(Ls9/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/F;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p1, Ls9/a;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Ljava/util/Map;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget v0, p1, Ls9/a;->a:I

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ls9/a;

    .line 32
    .line 33
    iget-object v3, p0, Lr9/F;->g:Ljava/util/PriorityQueue;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/util/PriorityQueue;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget v1, p0, Lr9/F;->i:I

    .line 51
    .line 52
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, Lr9/F;->i:I

    .line 57
    .line 58
    iget-wide v0, p0, Lr9/F;->j:J

    .line 59
    .line 60
    iget-object p1, p1, Ls9/a;->d:Ls9/c;

    .line 61
    .line 62
    iget-wide v2, p1, Ls9/c;->a:J

    .line 63
    .line 64
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    iput-wide v0, p0, Lr9/F;->j:J

    .line 69
    .line 70
    return-void
.end method

.method public final k(Lp9/A;)I
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p1}, Lr9/F;->g(Lp9/A;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x3

    .line 10
    move v3, v2

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x2

    .line 17
    if-eqz v4, :cond_9

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lp9/A;

    .line 24
    .line 25
    move-object/from16 v7, p0

    .line 26
    .line 27
    invoke-virtual {v7, v4}, Lr9/F;->b(Lp9/A;)Ls9/a;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    if-nez v8, :cond_1

    .line 32
    .line 33
    move v3, v5

    .line 34
    :goto_1
    move-object/from16 v1, p1

    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_1
    iget-object v8, v8, Ls9/a;->c:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    new-instance v9, Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v10, v4, Lp9/A;->c:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    const/4 v11, 0x0

    .line 56
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    if-eqz v12, :cond_6

    .line 61
    .line 62
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    check-cast v12, Lp9/k;

    .line 67
    .line 68
    invoke-virtual {v12}, Lp9/k;->c()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    if-eqz v13, :cond_2

    .line 81
    .line 82
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    check-cast v13, Lp9/j;

    .line 87
    .line 88
    iget-object v14, v13, Lp9/j;->c:Ls9/j;

    .line 89
    .line 90
    sget-object v15, Ls9/j;->b:Ls9/j;

    .line 91
    .line 92
    invoke-virtual {v14, v15}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    if-eqz v14, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    sget-object v14, Lp9/i;->h:Lp9/i;

    .line 100
    .line 101
    iget-object v15, v13, Lp9/j;->a:Lp9/i;

    .line 102
    .line 103
    invoke-virtual {v15, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    if-nez v14, :cond_5

    .line 108
    .line 109
    sget-object v14, Lp9/i;->i:Lp9/i;

    .line 110
    .line 111
    invoke-virtual {v15, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-eqz v14, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    iget-object v13, v13, Lp9/j;->c:Ls9/j;

    .line 119
    .line 120
    invoke-virtual {v9, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    :goto_3
    move v11, v5

    .line 125
    goto :goto_2

    .line 126
    :cond_6
    iget-object v4, v4, Lp9/A;->b:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eqz v5, :cond_8

    .line 137
    .line 138
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    check-cast v5, Lp9/t;

    .line 143
    .line 144
    iget-object v10, v5, Lp9/t;->b:Ls9/j;

    .line 145
    .line 146
    sget-object v12, Ls9/j;->b:Ls9/j;

    .line 147
    .line 148
    invoke-virtual {v10, v12}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-nez v10, :cond_7

    .line 153
    .line 154
    iget-object v5, v5, Lp9/t;->b:Ls9/j;

    .line 155
    .line 156
    invoke-virtual {v9, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_8
    invoke-virtual {v9}, Ljava/util/HashSet;->size()I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    add-int/2addr v4, v11

    .line 165
    if-ge v8, v4, :cond_0

    .line 166
    .line 167
    move v3, v6

    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_9
    move-object/from16 v7, p0

    .line 171
    .line 172
    goto/16 :goto_1

    .line 173
    .line 174
    :goto_5
    iget-wide v8, v1, Lp9/A;->f:J

    .line 175
    .line 176
    const-wide/16 v10, -0x1

    .line 177
    .line 178
    cmp-long v1, v8, v10

    .line 179
    .line 180
    if-eqz v1, :cond_a

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-le v0, v5, :cond_a

    .line 187
    .line 188
    if-ne v3, v2, :cond_a

    .line 189
    .line 190
    return v6

    .line 191
    :cond_a
    return v3
.end method

.method public final m(Ljava/lang/String;)Ls9/b;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lr9/F;->d(Ljava/lang/String;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v2, "minOffset was called for collection without indexes"

    .line 15
    .line 16
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lr9/F;->f(Ljava/util/Collection;)Ls9/b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public final n(Lc9/c;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-boolean v3, v1, Lr9/F;->h:Z

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    new-array v5, v4, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v6, "IndexManager not started"

    .line 11
    .line 12
    invoke-static {v3, v6, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_a

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Ls9/h;

    .line 36
    .line 37
    iget-object v6, v6, Ls9/h;->a:Ls9/m;

    .line 38
    .line 39
    iget-object v7, v6, Ls9/e;->a:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    sub-int/2addr v7, v0

    .line 46
    invoke-virtual {v6, v7}, Ls9/e;->g(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v1, v6}, Lr9/F;->d(Ljava/lang/String;)Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_0

    .line 63
    .line 64
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Ls9/a;

    .line 69
    .line 70
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Ls9/h;

    .line 75
    .line 76
    new-instance v9, Ljava/util/TreeSet;

    .line 77
    .line 78
    invoke-direct {v9}, Ljava/util/TreeSet;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v10, v1, Lr9/F;->a:Lr9/K;

    .line 82
    .line 83
    const-string v11, "SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?"

    .line 84
    .line 85
    invoke-virtual {v10, v11}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    iget v11, v7, Ls9/a;->a:I

    .line 90
    .line 91
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    iget-object v12, v8, Ls9/h;->a:Ls9/m;

    .line 96
    .line 97
    invoke-virtual {v12}, Ls9/m;->c()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    iget-object v13, v1, Lr9/F;->c:Ljava/lang/String;

    .line 102
    .line 103
    const/4 v14, 0x3

    .line 104
    new-array v14, v14, [Ljava/lang/Object;

    .line 105
    .line 106
    aput-object v11, v14, v4

    .line 107
    .line 108
    aput-object v12, v14, v2

    .line 109
    .line 110
    aput-object v13, v14, v0

    .line 111
    .line 112
    invoke-virtual {v10, v14}, Lne/a;->b([Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v10}, Lne/a;->i()Landroid/database/Cursor;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    :goto_1
    :try_start_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 120
    .line 121
    .line 122
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    iget v12, v7, Ls9/a;->a:I

    .line 124
    .line 125
    if-eqz v11, :cond_1

    .line 126
    .line 127
    :try_start_1
    invoke-interface {v10, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-interface {v10, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    new-instance v14, Lq9/a;

    .line 136
    .line 137
    invoke-direct {v14, v12, v8, v11, v13}, Lq9/a;-><init>(ILs9/h;[B[B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v9, v14}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :goto_2
    move-object v2, v0

    .line 145
    goto/16 :goto_8

    .line 146
    .line 147
    :cond_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 148
    .line 149
    .line 150
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, Ls9/k;

    .line 155
    .line 156
    new-instance v10, Ljava/util/TreeSet;

    .line 157
    .line 158
    invoke-direct {v10}, Ljava/util/TreeSet;-><init>()V

    .line 159
    .line 160
    .line 161
    new-instance v11, Lq9/c;

    .line 162
    .line 163
    invoke-direct {v11}, Lq9/c;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7}, Ls9/a;->b()Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object v13

    .line 170
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-eqz v14, :cond_3

    .line 179
    .line 180
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    check-cast v14, Ls9/d;

    .line 185
    .line 186
    iget-object v15, v14, Ls9/d;->a:Ls9/j;

    .line 187
    .line 188
    iget-object v0, v8, Ls9/k;->e:Ls9/l;

    .line 189
    .line 190
    invoke-virtual {v0, v15}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-nez v0, :cond_2

    .line 195
    .line 196
    const/4 v0, 0x0

    .line 197
    goto :goto_4

    .line 198
    :cond_2
    iget v14, v14, Ls9/d;->b:I

    .line 199
    .line 200
    invoke-virtual {v11, v14}, Lq9/c;->a(I)Lvf/a;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    invoke-static {v0, v14}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v14}, Lvf/a;->S()V

    .line 208
    .line 209
    .line 210
    const/4 v0, 0x2

    .line 211
    goto :goto_3

    .line 212
    :cond_3
    iget-object v0, v11, Lq9/c;->a:Lq9/e;

    .line 213
    .line 214
    iget-object v11, v0, Lq9/e;->a:[B

    .line 215
    .line 216
    iget v0, v0, Lq9/e;->b:I

    .line 217
    .line 218
    invoke-static {v11, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :goto_4
    if-nez v0, :cond_4

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_4
    invoke-virtual {v7}, Ls9/a;->a()Ls9/d;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    if-eqz v7, :cond_5

    .line 230
    .line 231
    iget-object v11, v8, Ls9/k;->e:Ls9/l;

    .line 232
    .line 233
    iget-object v7, v7, Ls9/d;->a:Ls9/j;

    .line 234
    .line 235
    invoke-virtual {v11, v7}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-static {v7}, Ls9/p;->f(Lka/C1;)Z

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    if-eqz v11, :cond_6

    .line 244
    .line 245
    invoke-virtual {v7}, Lka/C1;->m()Lka/g;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v7}, Lka/g;->getValuesList()Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    if-eqz v11, :cond_6

    .line 262
    .line 263
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    check-cast v11, Lka/C1;

    .line 268
    .line 269
    new-instance v13, Lq9/c;

    .line 270
    .line 271
    invoke-direct {v13}, Lq9/c;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v13, v2}, Lq9/c;->a(I)Lvf/a;

    .line 275
    .line 276
    .line 277
    move-result-object v14

    .line 278
    invoke-static {v11, v14}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v14}, Lvf/a;->S()V

    .line 282
    .line 283
    .line 284
    iget-object v11, v13, Lq9/c;->a:Lq9/e;

    .line 285
    .line 286
    iget-object v13, v11, Lq9/e;->a:[B

    .line 287
    .line 288
    iget v11, v11, Lq9/e;->b:I

    .line 289
    .line 290
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    new-instance v13, Lq9/a;

    .line 295
    .line 296
    iget-object v14, v8, Ls9/k;->a:Ls9/h;

    .line 297
    .line 298
    invoke-direct {v13, v12, v14, v11, v0}, Lq9/a;-><init>(ILs9/h;[B[B)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v10, v13}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_5
    iget-object v7, v8, Ls9/k;->a:Ls9/h;

    .line 306
    .line 307
    new-array v8, v4, [B

    .line 308
    .line 309
    new-instance v11, Lq9/a;

    .line 310
    .line 311
    invoke-direct {v11, v12, v7, v8, v0}, Lq9/a;-><init>(ILs9/h;[B[B)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v10, v11}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :cond_6
    :goto_6
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_8

    .line 322
    .line 323
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Ls9/k;

    .line 328
    .line 329
    iget-object v7, v0, Ls9/k;->a:Ls9/h;

    .line 330
    .line 331
    new-array v8, v2, [Ljava/lang/Object;

    .line 332
    .line 333
    aput-object v7, v8, v4

    .line 334
    .line 335
    const-string v7, "F"

    .line 336
    .line 337
    const-string v11, "Updating index entries for document \'%s\'"

    .line 338
    .line 339
    invoke-static {v7, v11, v2, v8}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    new-instance v7, Lr9/C;

    .line 343
    .line 344
    invoke-direct {v7, v1, v0, v4}, Lr9/C;-><init>(Lr9/F;Ls9/k;I)V

    .line 345
    .line 346
    .line 347
    new-instance v8, Lr9/C;

    .line 348
    .line 349
    invoke-direct {v8, v1, v0, v2}, Lr9/C;-><init>(Lr9/F;Ls9/k;I)V

    .line 350
    .line 351
    .line 352
    sget-object v0, Lw9/p;->a:Lm9/B;

    .line 353
    .line 354
    invoke-virtual {v9}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v10}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v10

    .line 362
    invoke-virtual {v9}, Ljava/util/TreeSet;->comparator()Ljava/util/Comparator;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    if-eqz v11, :cond_7

    .line 367
    .line 368
    invoke-virtual {v9}, Ljava/util/TreeSet;->comparator()Ljava/util/Comparator;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    goto :goto_7

    .line 373
    :cond_7
    new-instance v9, Lq6/d;

    .line 374
    .line 375
    const/16 v11, 0x19

    .line 376
    .line 377
    invoke-direct {v9, v11}, Lq6/d;-><init>(I)V

    .line 378
    .line 379
    .line 380
    :goto_7
    invoke-static {v0, v10, v9, v7, v8}, Lw9/p;->f(Ljava/util/Iterator;Ljava/util/Iterator;Ljava/util/Comparator;Lw9/g;Lw9/g;)V

    .line 381
    .line 382
    .line 383
    :cond_8
    const/4 v0, 0x2

    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :catchall_0
    move-exception v0

    .line 387
    goto/16 :goto_2

    .line 388
    .line 389
    :goto_8
    if-eqz v10, :cond_9

    .line 390
    .line 391
    :try_start_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 392
    .line 393
    .line 394
    goto :goto_9

    .line 395
    :catchall_1
    move-exception v0

    .line 396
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    :cond_9
    :goto_9
    throw v2

    .line 400
    :cond_a
    return-void
.end method

.method public final o(Ljava/lang/String;Ls9/b;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lr9/F;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-wide v2, p0, Lr9/F;->j:J

    .line 12
    .line 13
    const-wide/16 v4, 0x1

    .line 14
    .line 15
    add-long/2addr v2, v4

    .line 16
    iput-wide v2, p0, Lr9/F;->j:J

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lr9/F;->d(Ljava/lang/String;)Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ls9/a;

    .line 37
    .line 38
    iget v2, v0, Ls9/a;->a:I

    .line 39
    .line 40
    iget-wide v3, p0, Lr9/F;->j:J

    .line 41
    .line 42
    new-instance v5, Ls9/c;

    .line 43
    .line 44
    invoke-direct {v5, v3, v4, p2}, Ls9/c;-><init>(JLs9/b;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Ls9/a;

    .line 48
    .line 49
    iget-object v4, v0, Ls9/a;->c:Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object v6, v0, Ls9/a;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v3, v2, v6, v4, v5}, Ls9/a;-><init>(ILjava/lang/String;Ljava/util/ArrayList;Ls9/c;)V

    .line 54
    .line 55
    .line 56
    iget v0, v0, Ls9/a;->a:I

    .line 57
    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-wide v4, p0, Lr9/F;->j:J

    .line 63
    .line 64
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v4, p2, Ls9/b;->a:Ls9/o;

    .line 69
    .line 70
    iget-object v5, v4, Ls9/o;->a:Ls8/q;

    .line 71
    .line 72
    iget-wide v5, v5, Ls8/q;->a:J

    .line 73
    .line 74
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    iget-object v4, v4, Ls9/o;->a:Ls8/q;

    .line 79
    .line 80
    iget v4, v4, Ls8/q;->b:I

    .line 81
    .line 82
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    iget-object v6, p2, Ls9/b;->b:Ls9/h;

    .line 87
    .line 88
    iget-object v6, v6, Ls9/h;->a:Ls9/m;

    .line 89
    .line 90
    invoke-static {v6}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    iget v7, p2, Ls9/b;->c:I

    .line 95
    .line 96
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    iget-object v8, p0, Lr9/F;->c:Ljava/lang/String;

    .line 101
    .line 102
    const/4 v9, 0x7

    .line 103
    new-array v9, v9, [Ljava/lang/Object;

    .line 104
    .line 105
    aput-object v0, v9, v1

    .line 106
    .line 107
    const/4 v0, 0x1

    .line 108
    aput-object v8, v9, v0

    .line 109
    .line 110
    const/4 v0, 0x2

    .line 111
    aput-object v2, v9, v0

    .line 112
    .line 113
    const/4 v0, 0x3

    .line 114
    aput-object v5, v9, v0

    .line 115
    .line 116
    const/4 v0, 0x4

    .line 117
    aput-object v4, v9, v0

    .line 118
    .line 119
    const/4 v0, 0x5

    .line 120
    aput-object v6, v9, v0

    .line 121
    .line 122
    const/4 v0, 0x6

    .line 123
    aput-object v7, v9, v0

    .line 124
    .line 125
    iget-object v0, p0, Lr9/F;->a:Lr9/K;

    .line 126
    .line 127
    const-string v2, "REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)"

    .line 128
    .line 129
    invoke-virtual {v0, v2, v9}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v3}, Lr9/F;->i(Ls9/a;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    return-void
.end method

.method public final p(Lp9/A;)Ljava/util/List;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v7, v1, Lr9/F;->h:Z

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    new-array v9, v8, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v10, "IndexManager not started"

    .line 9
    .line 10
    invoke-static {v7, v10, v9}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v7, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v9, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v10, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Lr9/F;->g(Lp9/A;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v12

    .line 40
    const/4 v13, 0x0

    .line 41
    if-eqz v12, :cond_1

    .line 42
    .line 43
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    check-cast v12, Lp9/A;

    .line 48
    .line 49
    invoke-virtual {v1, v12}, Lr9/F;->b(Lp9/A;)Ls9/a;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    if-nez v14, :cond_0

    .line 54
    .line 55
    return-object v13

    .line 56
    :cond_0
    invoke-static {v12, v14}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    const-string v12, ")"

    .line 73
    .line 74
    const-string v14, " UNION "

    .line 75
    .line 76
    const-string v15, "F"

    .line 77
    .line 78
    if-eqz v11, :cond_18

    .line 79
    .line 80
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    check-cast v11, Landroid/util/Pair;

    .line 85
    .line 86
    const/16 v16, 0x4

    .line 87
    .line 88
    iget-object v2, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lp9/A;

    .line 91
    .line 92
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v11, Ls9/a;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v11}, Ls9/a;->a()Ls9/d;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    if-nez v13, :cond_3

    .line 104
    .line 105
    :cond_2
    move/from16 v18, v8

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    goto :goto_3

    .line 109
    :cond_3
    iget-object v13, v13, Ls9/d;->a:Ls9/j;

    .line 110
    .line 111
    invoke-virtual {v2, v13}, Lp9/A;->d(Ls9/j;)Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v17

    .line 123
    if-eqz v17, :cond_2

    .line 124
    .line 125
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v17

    .line 129
    move/from16 v18, v8

    .line 130
    .line 131
    move-object/from16 v8, v17

    .line 132
    .line 133
    check-cast v8, Lp9/j;

    .line 134
    .line 135
    iget-object v3, v8, Lp9/j;->a:Lp9/i;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    const/4 v6, 0x6

    .line 142
    iget-object v8, v8, Lp9/j;->b:Lka/C1;

    .line 143
    .line 144
    if-eq v3, v6, :cond_5

    .line 145
    .line 146
    const/4 v6, 0x7

    .line 147
    if-eq v3, v6, :cond_4

    .line 148
    .line 149
    move/from16 v8, v18

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    invoke-virtual {v8}, Lka/C1;->m()Lka/g;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Lka/g;->getValuesList()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_3

    .line 161
    :cond_5
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    :goto_3
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v11}, Ls9/a;->b()Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    if-eqz v13, :cond_9

    .line 183
    .line 184
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    check-cast v13, Ls9/d;

    .line 189
    .line 190
    iget-object v4, v13, Ls9/d;->a:Ls9/j;

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Lp9/A;->d(Ls9/j;)Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v21

    .line 204
    if-eqz v21, :cond_6

    .line 205
    .line 206
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v21

    .line 210
    move-object/from16 v5, v21

    .line 211
    .line 212
    check-cast v5, Lp9/j;

    .line 213
    .line 214
    move-object/from16 v21, v4

    .line 215
    .line 216
    iget-object v4, v5, Lp9/j;->a:Lp9/i;

    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    move-object/from16 v23, v8

    .line 223
    .line 224
    iget-object v8, v13, Ls9/d;->a:Ls9/j;

    .line 225
    .line 226
    iget-object v5, v5, Lp9/j;->b:Lka/C1;

    .line 227
    .line 228
    move-object/from16 v24, v10

    .line 229
    .line 230
    const/4 v10, 0x2

    .line 231
    if-eq v4, v10, :cond_8

    .line 232
    .line 233
    const/4 v10, 0x3

    .line 234
    if-eq v4, v10, :cond_7

    .line 235
    .line 236
    const/16 v10, 0x8

    .line 237
    .line 238
    if-eq v4, v10, :cond_8

    .line 239
    .line 240
    const/16 v10, 0x9

    .line 241
    .line 242
    if-eq v4, v10, :cond_7

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_7
    invoke-virtual {v6, v8, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    goto :goto_6

    .line 253
    :cond_8
    invoke-virtual {v6, v8, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    :goto_5
    move-object/from16 v4, v21

    .line 257
    .line 258
    move-object/from16 v8, v23

    .line 259
    .line 260
    move-object/from16 v10, v24

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_9
    move-object/from16 v24, v10

    .line 264
    .line 265
    const/4 v4, 0x0

    .line 266
    :goto_6
    new-instance v5, Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v11}, Ls9/a;->b()Ljava/util/ArrayList;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    const/4 v8, 0x1

    .line 280
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    if-eqz v10, :cond_b

    .line 285
    .line 286
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    check-cast v10, Ls9/d;

    .line 291
    .line 292
    iget v13, v10, Ls9/d;->b:I

    .line 293
    .line 294
    move-object/from16 v21, v6

    .line 295
    .line 296
    const/4 v6, 0x1

    .line 297
    invoke-static {v13, v6}, LA/f;->b(II)Z

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    iget-object v6, v2, Lp9/A;->g:Lp9/c;

    .line 302
    .line 303
    if-eqz v13, :cond_a

    .line 304
    .line 305
    invoke-virtual {v2, v10, v6}, Lp9/A;->a(Ls9/d;Lp9/c;)Landroid/util/Pair;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    goto :goto_8

    .line 310
    :cond_a
    invoke-virtual {v2, v10, v6}, Lp9/A;->c(Ls9/d;Lp9/c;)Landroid/util/Pair;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    :goto_8
    iget-object v10, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v10, Lka/C1;

    .line 317
    .line 318
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v6, Ljava/lang/Boolean;

    .line 324
    .line 325
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    and-int/2addr v8, v6

    .line 330
    move-object/from16 v6, v21

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_b
    new-instance v6, Lp9/c;

    .line 334
    .line 335
    invoke-direct {v6, v5, v8}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 336
    .line 337
    .line 338
    new-instance v5, Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v11}, Ls9/a;->b()Ljava/util/ArrayList;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    const/4 v10, 0x1

    .line 352
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v13

    .line 356
    if-eqz v13, :cond_d

    .line 357
    .line 358
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v13

    .line 362
    check-cast v13, Ls9/d;

    .line 363
    .line 364
    move-object/from16 v21, v8

    .line 365
    .line 366
    iget v8, v13, Ls9/d;->b:I

    .line 367
    .line 368
    const/4 v0, 0x1

    .line 369
    invoke-static {v8, v0}, LA/f;->b(II)Z

    .line 370
    .line 371
    .line 372
    move-result v8

    .line 373
    iget-object v0, v2, Lp9/A;->h:Lp9/c;

    .line 374
    .line 375
    if-eqz v8, :cond_c

    .line 376
    .line 377
    invoke-virtual {v2, v13, v0}, Lp9/A;->c(Ls9/d;Lp9/c;)Landroid/util/Pair;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    goto :goto_a

    .line 382
    :cond_c
    invoke-virtual {v2, v13, v0}, Lp9/A;->a(Ls9/d;Lp9/c;)Landroid/util/Pair;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    :goto_a
    iget-object v8, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v8, Lka/C1;

    .line 389
    .line 390
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Ljava/lang/Boolean;

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    and-int/2addr v10, v0

    .line 402
    move-object/from16 v8, v21

    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_d
    new-instance v0, Lp9/c;

    .line 406
    .line 407
    invoke-direct {v0, v5, v10}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 408
    .line 409
    .line 410
    invoke-static {}, LBa/c;->E()Z

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    if-eqz v8, :cond_e

    .line 415
    .line 416
    const/4 v8, 0x5

    .line 417
    new-array v13, v8, [Ljava/lang/Object;

    .line 418
    .line 419
    aput-object v11, v13, v18

    .line 420
    .line 421
    const/4 v8, 0x1

    .line 422
    aput-object v2, v13, v8

    .line 423
    .line 424
    const/16 v22, 0x2

    .line 425
    .line 426
    aput-object v3, v13, v22

    .line 427
    .line 428
    const/16 v20, 0x3

    .line 429
    .line 430
    aput-object v6, v13, v20

    .line 431
    .line 432
    aput-object v0, v13, v16

    .line 433
    .line 434
    const-string v0, "Using index \'%s\' to execute \'%s\' (Arrays: %s, Lower bound: %s, Upper bound: %s)"

    .line 435
    .line 436
    invoke-static {v15, v0, v8, v13}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    :cond_e
    iget-object v0, v6, Lp9/c;->b:Ljava/lang/Object;

    .line 440
    .line 441
    invoke-static {v11, v2, v0}, Lr9/F;->a(Ls9/a;Lp9/A;Ljava/util/Collection;)[Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    iget-boolean v6, v6, Lp9/c;->a:Z

    .line 446
    .line 447
    if-eqz v6, :cond_f

    .line 448
    .line 449
    const-string v6, ">="

    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_f
    const-string v6, ">"

    .line 453
    .line 454
    :goto_b
    invoke-static {v11, v2, v5}, Lr9/F;->a(Ls9/a;Lp9/A;Ljava/util/Collection;)[Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    if-eqz v10, :cond_10

    .line 459
    .line 460
    const-string v8, "<="

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_10
    const-string v8, "<"

    .line 464
    .line 465
    :goto_c
    invoke-static {v11, v2, v4}, Lr9/F;->a(Ls9/a;Lp9/A;Ljava/util/Collection;)[Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    if-eqz v3, :cond_11

    .line 470
    .line 471
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    goto :goto_d

    .line 476
    :cond_11
    const/4 v4, 0x1

    .line 477
    :goto_d
    array-length v10, v0

    .line 478
    array-length v13, v5

    .line 479
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    mul-int/2addr v10, v4

    .line 484
    new-instance v4, Ljava/lang/StringBuilder;

    .line 485
    .line 486
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 487
    .line 488
    .line 489
    const-string v13, "SELECT document_key, directional_value FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value "

    .line 490
    .line 491
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    const-string v6, " ? AND directional_value "

    .line 498
    .line 499
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    const-string v6, " ? "

    .line 506
    .line 507
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-static {v10, v4, v14}, Lw9/p;->h(ILjava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    if-eqz v2, :cond_12

    .line 515
    .line 516
    new-instance v6, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    const-string v8, "SELECT document_key, directional_value FROM ("

    .line 519
    .line 520
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    const-string v4, ") WHERE directional_value NOT IN ("

    .line 527
    .line 528
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    array-length v4, v2

    .line 532
    const-string v8, ", "

    .line 533
    .line 534
    const-string v13, "?"

    .line 535
    .line 536
    invoke-static {v4, v13, v8}, Lw9/p;->h(ILjava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    move-object v4, v6

    .line 547
    :cond_12
    if-eqz v3, :cond_13

    .line 548
    .line 549
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 550
    .line 551
    .line 552
    move-result v6

    .line 553
    goto :goto_e

    .line 554
    :cond_13
    const/4 v6, 0x1

    .line 555
    :goto_e
    div-int v6, v10, v6

    .line 556
    .line 557
    const/16 v17, 0x5

    .line 558
    .line 559
    mul-int/lit8 v8, v10, 0x5

    .line 560
    .line 561
    if-eqz v2, :cond_14

    .line 562
    .line 563
    array-length v12, v2

    .line 564
    goto :goto_f

    .line 565
    :cond_14
    move/from16 v12, v18

    .line 566
    .line 567
    :goto_f
    add-int/2addr v8, v12

    .line 568
    new-array v8, v8, [Ljava/lang/Object;

    .line 569
    .line 570
    move/from16 v12, v18

    .line 571
    .line 572
    move v13, v12

    .line 573
    :goto_10
    if-ge v12, v10, :cond_16

    .line 574
    .line 575
    const/16 v19, 0x1

    .line 576
    .line 577
    add-int/lit8 v14, v13, 0x1

    .line 578
    .line 579
    iget v15, v11, Ls9/a;->a:I

    .line 580
    .line 581
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 582
    .line 583
    .line 584
    move-result-object v15

    .line 585
    aput-object v15, v8, v13

    .line 586
    .line 587
    const/16 v22, 0x2

    .line 588
    .line 589
    add-int/lit8 v15, v13, 0x2

    .line 590
    .line 591
    move-object/from16 v21, v0

    .line 592
    .line 593
    iget-object v0, v1, Lr9/F;->c:Ljava/lang/String;

    .line 594
    .line 595
    aput-object v0, v8, v14

    .line 596
    .line 597
    const/16 v20, 0x3

    .line 598
    .line 599
    add-int/lit8 v0, v13, 0x3

    .line 600
    .line 601
    if-eqz v3, :cond_15

    .line 602
    .line 603
    div-int v14, v12, v6

    .line 604
    .line 605
    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v14

    .line 609
    check-cast v14, Lka/C1;

    .line 610
    .line 611
    move/from16 v23, v0

    .line 612
    .line 613
    new-instance v0, Lq9/c;

    .line 614
    .line 615
    invoke-direct {v0}, Lq9/c;-><init>()V

    .line 616
    .line 617
    .line 618
    move-object/from16 v25, v3

    .line 619
    .line 620
    move-object/from16 v26, v4

    .line 621
    .line 622
    const/4 v3, 0x1

    .line 623
    invoke-virtual {v0, v3}, Lq9/c;->a(I)Lvf/a;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    invoke-static {v14, v4}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v4}, Lvf/a;->S()V

    .line 631
    .line 632
    .line 633
    iget-object v0, v0, Lq9/c;->a:Lq9/e;

    .line 634
    .line 635
    iget-object v3, v0, Lq9/e;->a:[B

    .line 636
    .line 637
    iget v0, v0, Lq9/e;->b:I

    .line 638
    .line 639
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    goto :goto_11

    .line 644
    :cond_15
    move/from16 v23, v0

    .line 645
    .line 646
    move-object/from16 v25, v3

    .line 647
    .line 648
    move-object/from16 v26, v4

    .line 649
    .line 650
    sget-object v0, Lr9/F;->k:[B

    .line 651
    .line 652
    :goto_11
    aput-object v0, v8, v15

    .line 653
    .line 654
    add-int/lit8 v0, v13, 0x4

    .line 655
    .line 656
    rem-int v3, v12, v6

    .line 657
    .line 658
    aget-object v4, v21, v3

    .line 659
    .line 660
    aput-object v4, v8, v23

    .line 661
    .line 662
    const/16 v17, 0x5

    .line 663
    .line 664
    add-int/lit8 v13, v13, 0x5

    .line 665
    .line 666
    aget-object v3, v5, v3

    .line 667
    .line 668
    aput-object v3, v8, v0

    .line 669
    .line 670
    const/16 v19, 0x1

    .line 671
    .line 672
    add-int/lit8 v12, v12, 0x1

    .line 673
    .line 674
    move-object/from16 v0, v21

    .line 675
    .line 676
    move-object/from16 v3, v25

    .line 677
    .line 678
    move-object/from16 v4, v26

    .line 679
    .line 680
    goto :goto_10

    .line 681
    :cond_16
    move-object/from16 v26, v4

    .line 682
    .line 683
    const/16 v17, 0x5

    .line 684
    .line 685
    const/16 v19, 0x1

    .line 686
    .line 687
    const/16 v20, 0x3

    .line 688
    .line 689
    const/16 v22, 0x2

    .line 690
    .line 691
    if-eqz v2, :cond_17

    .line 692
    .line 693
    array-length v0, v2

    .line 694
    move/from16 v3, v18

    .line 695
    .line 696
    :goto_12
    if-ge v3, v0, :cond_17

    .line 697
    .line 698
    aget-object v4, v2, v3

    .line 699
    .line 700
    add-int/lit8 v5, v13, 0x1

    .line 701
    .line 702
    aput-object v4, v8, v13

    .line 703
    .line 704
    add-int/lit8 v3, v3, 0x1

    .line 705
    .line 706
    move v13, v5

    .line 707
    const/16 v19, 0x1

    .line 708
    .line 709
    goto :goto_12

    .line 710
    :cond_17
    new-instance v0, Ljava/util/ArrayList;

    .line 711
    .line 712
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    aget-object v2, v0, v18

    .line 734
    .line 735
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    array-length v0, v0

    .line 747
    const/4 v3, 0x1

    .line 748
    invoke-interface {v2, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 753
    .line 754
    .line 755
    move/from16 v8, v18

    .line 756
    .line 757
    move-object/from16 v10, v24

    .line 758
    .line 759
    const/4 v13, 0x0

    .line 760
    goto/16 :goto_1

    .line 761
    .line 762
    :cond_18
    move/from16 v18, v8

    .line 763
    .line 764
    const/4 v3, 0x1

    .line 765
    new-instance v0, Ljava/lang/StringBuilder;

    .line 766
    .line 767
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 768
    .line 769
    .line 770
    invoke-static {v14, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    const-string v2, "ORDER BY directional_value, document_key "

    .line 778
    .line 779
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    move-object/from16 v2, p1

    .line 783
    .line 784
    iget-object v4, v2, Lp9/A;->b:Ljava/util/List;

    .line 785
    .line 786
    invoke-static {v3, v4}, LVa/M6;->k(ILjava/util/List;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    check-cast v4, Lp9/t;

    .line 791
    .line 792
    iget v4, v4, Lp9/t;->a:I

    .line 793
    .line 794
    invoke-static {v4, v3}, LA/f;->b(II)Z

    .line 795
    .line 796
    .line 797
    move-result v4

    .line 798
    if-eqz v4, :cond_19

    .line 799
    .line 800
    const-string v3, "asc "

    .line 801
    .line 802
    goto :goto_13

    .line 803
    :cond_19
    const-string v3, "desc "

    .line 804
    .line 805
    :goto_13
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    const-string v3, "SELECT DISTINCT document_key FROM ("

    .line 813
    .line 814
    invoke-static {v3, v0, v12}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    const-wide/16 v3, -0x1

    .line 819
    .line 820
    iget-wide v5, v2, Lp9/A;->f:J

    .line 821
    .line 822
    cmp-long v2, v5, v3

    .line 823
    .line 824
    if-eqz v2, :cond_1a

    .line 825
    .line 826
    new-instance v2, Ljava/lang/StringBuilder;

    .line 827
    .line 828
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    const-string v0, " LIMIT "

    .line 835
    .line 836
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    :cond_1a
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 847
    .line 848
    .line 849
    move-result v2

    .line 850
    const/16 v3, 0x3e8

    .line 851
    .line 852
    if-ge v2, v3, :cond_1b

    .line 853
    .line 854
    const/4 v2, 0x1

    .line 855
    goto :goto_14

    .line 856
    :cond_1b
    move/from16 v2, v18

    .line 857
    .line 858
    :goto_14
    const-string v3, "Cannot perform query with more than 999 bind elements"

    .line 859
    .line 860
    move/from16 v4, v18

    .line 861
    .line 862
    new-array v5, v4, [Ljava/lang/Object;

    .line 863
    .line 864
    invoke-static {v2, v3, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    iget-object v2, v1, Lr9/F;->a:Lr9/K;

    .line 868
    .line 869
    invoke-virtual {v2, v0}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-virtual {v9}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    invoke-virtual {v0, v2}, Lne/a;->b([Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    new-instance v2, Ljava/util/ArrayList;

    .line 881
    .line 882
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0}, Lne/a;->i()Landroid/database/Cursor;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    :goto_15
    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    if-eqz v0, :cond_1c

    .line 894
    .line 895
    const/4 v4, 0x0

    .line 896
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-static {v0}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    new-instance v4, Ls9/h;

    .line 905
    .line 906
    invoke-direct {v4, v0}, Ls9/h;-><init>(Ls9/m;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 910
    .line 911
    .line 912
    goto :goto_15

    .line 913
    :goto_16
    move-object v2, v0

    .line 914
    goto :goto_17

    .line 915
    :cond_1c
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 919
    .line 920
    .line 921
    move-result v0

    .line 922
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    const/4 v3, 0x1

    .line 927
    new-array v4, v3, [Ljava/lang/Object;

    .line 928
    .line 929
    const/16 v18, 0x0

    .line 930
    .line 931
    aput-object v0, v4, v18

    .line 932
    .line 933
    const-string v0, "Index scan returned %s documents"

    .line 934
    .line 935
    invoke-static {v15, v0, v3, v4}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 936
    .line 937
    .line 938
    return-object v2

    .line 939
    :catchall_0
    move-exception v0

    .line 940
    goto :goto_16

    .line 941
    :goto_17
    if-eqz v3, :cond_1d

    .line 942
    .line 943
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 944
    .line 945
    .line 946
    goto :goto_18

    .line 947
    :catchall_1
    move-exception v0

    .line 948
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 949
    .line 950
    .line 951
    :cond_1d
    :goto_18
    throw v2
.end method

.method public final r()Ljava/util/Collection;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr9/F;->f:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-object v0
.end method

.method public final start()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr9/F;->a:Lr9/K;

    .line 7
    .line 8
    const-string v2, "SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, Lr9/F;->c:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    new-array v5, v4, [Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    aput-object v3, v5, v6

    .line 21
    .line 22
    invoke-virtual {v2, v5}, Lne/a;->b([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lr9/D;

    .line 26
    .line 27
    invoke-direct {v3, v0, v6}, Lr9/D;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lne/a;->f(Lw9/g;)I

    .line 31
    .line 32
    .line 33
    const-string v2, "SELECT index_id, collection_group, index_proto FROM index_configuration"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Lr9/E;

    .line 40
    .line 41
    invoke-direct {v2, v6, p0, v0}, Lr9/E;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lne/a;->f(Lw9/g;)I

    .line 45
    .line 46
    .line 47
    iput-boolean v4, p0, Lr9/F;->h:Z

    .line 48
    .line 49
    return-void
.end method

.method public final t(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lr9/F;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lr9/F;->a:Lr9/K;

    .line 17
    .line 18
    const-string v3, "SELECT parent FROM collection_parents WHERE collection_id = ?"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x1

    .line 25
    new-array v3, v3, [Ljava/lang/Object;

    .line 26
    .line 27
    aput-object p1, v3, v1

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lne/a;->b([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lne/a;->i()Landroid/database/Cursor;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, Lka/e0;->l(Ljava/lang/String;)Ls9/m;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_1
    move-exception p1

    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_1
    throw v0
.end method

.method public final u(Ls9/m;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    iget-boolean v2, p0, Lr9/F;->h:Z

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    new-array v4, v3, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v5, "IndexManager not started"

    .line 9
    .line 10
    invoke-static {v2, v5, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p1, Ls9/e;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    rem-int/2addr v2, v1

    .line 20
    if-ne v2, v0, :cond_0

    .line 21
    .line 22
    move v2, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v3

    .line 25
    :goto_0
    const-string v4, "Expected a collection path."

    .line 26
    .line 27
    new-array v5, v3, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v2, v4, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lr9/F;->e:Lad/L;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Lad/L;->e(Ls9/m;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1}, Ls9/e;->f()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p1}, Ls9/e;->k()Ls9/e;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ls9/m;

    .line 49
    .line 50
    invoke-static {p1}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-array v1, v1, [Ljava/lang/Object;

    .line 55
    .line 56
    aput-object v2, v1, v3

    .line 57
    .line 58
    aput-object p1, v1, v0

    .line 59
    .line 60
    iget-object p1, p0, Lr9/F;->a:Lr9/K;

    .line 61
    .line 62
    const-string v0, "INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public final v()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "DELETE FROM index_configuration"

    .line 5
    .line 6
    iget-object v3, p0, Lr9/F;->a:Lr9/K;

    .line 7
    .line 8
    invoke-virtual {v3, v2, v1}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "DELETE FROM index_entries"

    .line 12
    .line 13
    new-array v2, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v3, v1, v2}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "DELETE FROM index_state"

    .line 19
    .line 20
    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v3, v1, v0}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lr9/F;->g:Ljava/util/PriorityQueue;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lr9/F;->f:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final x(Lp9/A;)Ls9/b;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lr9/F;->g(Lp9/A;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lp9/A;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lr9/F;->b(Lp9/A;)Ls9/a;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {v0}, Lr9/F;->f(Ljava/util/Collection;)Ls9/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public final y(Lp9/A;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lr9/F;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "IndexManager not started"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lr9/F;->g(Lp9/A;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_f

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lp9/A;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lr9/F;->k(Lp9/A;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eq v1, v3, :cond_1

    .line 38
    .line 39
    if-ne v1, v2, :cond_0

    .line 40
    .line 41
    :cond_1
    iget-object v1, v0, Lp9/A;->e:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v1, v0, Lp9/A;->d:Ls9/m;

    .line 47
    .line 48
    invoke-virtual {v1}, Ls9/e;->f()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_1
    new-instance v4, Ljava/util/TreeSet;

    .line 53
    .line 54
    new-instance v5, Lq6/d;

    .line 55
    .line 56
    const/16 v6, 0x14

    .line 57
    .line 58
    invoke-direct {v5, v6}, Lq6/d;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v4, v5}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 62
    .line 63
    .line 64
    new-instance v5, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v6, v0, Lp9/A;->c:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_4

    .line 80
    .line 81
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lp9/k;

    .line 86
    .line 87
    check-cast v7, Lp9/j;

    .line 88
    .line 89
    invoke-virtual {v7}, Lp9/j;->f()Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_3

    .line 94
    .line 95
    invoke-virtual {v4, v7}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-virtual {v4}, Ljava/util/TreeSet;->size()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-le v4, v3, :cond_5

    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_5
    new-instance v4, Ljava/util/HashSet;

    .line 113
    .line 114
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 115
    .line 116
    .line 117
    new-instance v6, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eqz v7, :cond_a

    .line 131
    .line 132
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    check-cast v7, Lp9/j;

    .line 137
    .line 138
    iget-object v8, v7, Lp9/j;->c:Ls9/j;

    .line 139
    .line 140
    sget-object v9, Ls9/j;->b:Ls9/j;

    .line 141
    .line 142
    invoke-virtual {v8, v9}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_6

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    sget-object v8, Lp9/i;->h:Lp9/i;

    .line 150
    .line 151
    iget-object v9, v7, Lp9/j;->a:Lp9/i;

    .line 152
    .line 153
    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    iget-object v7, v7, Lp9/j;->c:Ls9/j;

    .line 158
    .line 159
    if-nez v8, :cond_9

    .line 160
    .line 161
    sget-object v8, Lp9/i;->i:Lp9/i;

    .line 162
    .line 163
    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-eqz v8, :cond_7

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eqz v8, :cond_8

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_8
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    new-instance v8, Ls9/d;

    .line 181
    .line 182
    invoke-direct {v8, v3, v7}, Ls9/d;-><init>(ILs9/j;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_9
    :goto_4
    new-instance v8, Ls9/d;

    .line 190
    .line 191
    const/4 v9, 0x3

    .line 192
    invoke-direct {v8, v9, v7}, Ls9/d;-><init>(ILs9/j;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_a
    iget-object v0, v0, Lp9/A;->b:Ljava/util/List;

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_e

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    check-cast v5, Lp9/t;

    .line 216
    .line 217
    iget-object v7, v5, Lp9/t;->b:Ls9/j;

    .line 218
    .line 219
    sget-object v8, Ls9/j;->b:Ls9/j;

    .line 220
    .line 221
    invoke-virtual {v7, v8}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-eqz v7, :cond_b

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_b
    iget-object v7, v5, Lp9/t;->b:Ls9/j;

    .line 229
    .line 230
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    if-eqz v8, :cond_c

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_c
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    iget v5, v5, Lp9/t;->a:I

    .line 241
    .line 242
    if-ne v5, v3, :cond_d

    .line 243
    .line 244
    move v5, v3

    .line 245
    goto :goto_6

    .line 246
    :cond_d
    move v5, v2

    .line 247
    :goto_6
    new-instance v8, Ls9/d;

    .line 248
    .line 249
    invoke-direct {v8, v5, v7}, Ls9/d;-><init>(ILs9/j;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_e
    sget-object v0, Ls9/a;->e:Ls9/c;

    .line 257
    .line 258
    new-instance v2, Ls9/a;

    .line 259
    .line 260
    const/4 v3, -0x1

    .line 261
    invoke-direct {v2, v3, v1, v6, v0}, Ls9/a;-><init>(ILjava/lang/String;Ljava/util/ArrayList;Ls9/c;)V

    .line 262
    .line 263
    .line 264
    move-object v0, v2

    .line 265
    :goto_7
    if-eqz v0, :cond_0

    .line 266
    .line 267
    invoke-virtual {p0, v0}, Lr9/F;->e(Ls9/a;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_f
    return-void
.end method
