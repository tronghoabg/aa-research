.class public final LT5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;
.implements LY2/h;


# instance fields
.field public final synthetic a:I

.field public final b:Z

.field public final c:Z

.field public d:J

.field public final e:[Z

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:J

.field public i:Z

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LS3/s;ZZ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LT5/n;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LT5/n;->j:Ljava/lang/Object;

    .line 3
    iput-boolean p2, p0, LT5/n;->b:Z

    .line 4
    iput-boolean p3, p0, LT5/n;->c:Z

    const/4 p1, 0x3

    .line 5
    new-array p1, p1, [Z

    iput-object p1, p0, LT5/n;->e:[Z

    .line 6
    new-instance p1, LT5/s;

    const/4 p2, 0x7

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/n;->k:Ljava/lang/Object;

    .line 7
    new-instance p1, LT5/s;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/n;->l:Ljava/lang/Object;

    .line 8
    new-instance p1, LT5/s;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/n;->m:Ljava/lang/Object;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide p1, p0, LT5/n;->h:J

    .line 10
    new-instance p1, LY4/b;

    invoke-direct {p1}, LY4/b;-><init>()V

    iput-object p1, p0, LT5/n;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb7/k;ZZ)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LT5/n;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, LT5/n;->j:Ljava/lang/Object;

    .line 13
    iput-boolean p2, p0, LT5/n;->b:Z

    .line 14
    iput-boolean p3, p0, LT5/n;->c:Z

    const/4 p1, 0x3

    .line 15
    new-array p1, p1, [Z

    iput-object p1, p0, LT5/n;->e:[Z

    .line 16
    new-instance p1, LT5/s;

    const/4 p2, 0x7

    const/4 p3, 0x1

    invoke-direct {p1, p2, p3}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/n;->k:Ljava/lang/Object;

    .line 17
    new-instance p1, LT5/s;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/n;->l:Ljava/lang/Object;

    .line 18
    new-instance p1, LT5/s;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/n;->m:Ljava/lang/Object;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    iput-wide p1, p0, LT5/n;->h:J

    .line 20
    new-instance p1, LQ1/o;

    invoke-direct {p1}, LQ1/o;-><init>()V

    iput-object p1, p0, LT5/n;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, LT5/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, LT5/n;->d:J

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, LT5/n;->i:Z

    .line 12
    .line 13
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, p0, LT5/n;->h:J

    .line 19
    .line 20
    iget-object v1, p0, LT5/n;->e:[Z

    .line 21
    .line 22
    invoke-static {v1}, LR1/n;->a([Z)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LT5/n;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LT5/s;

    .line 28
    .line 29
    invoke-virtual {v1}, LT5/s;->d()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LT5/n;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LT5/s;

    .line 35
    .line 36
    invoke-virtual {v1}, LT5/s;->d()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, LT5/n;->m:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, LT5/s;

    .line 42
    .line 43
    invoke-virtual {v1}, LT5/s;->d()V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, LT5/n;->j:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lb7/k;

    .line 49
    .line 50
    iget-object v1, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, LR1/q;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, LR1/q;->p(I)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, LT5/n;->o:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, LY2/m;

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    iput-boolean v0, v1, LY2/m;->k:Z

    .line 64
    .line 65
    iput-boolean v0, v1, LY2/m;->o:Z

    .line 66
    .line 67
    iget-object v1, v1, LY2/m;->n:LT5/l;

    .line 68
    .line 69
    iput-boolean v0, v1, LT5/l;->b:Z

    .line 70
    .line 71
    iput-boolean v0, v1, LT5/l;->a:Z

    .line 72
    .line 73
    :cond_0
    return-void

    .line 74
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 75
    .line 76
    iput-wide v0, p0, LT5/n;->d:J

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, LT5/n;->i:Z

    .line 80
    .line 81
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    iput-wide v1, p0, LT5/n;->h:J

    .line 87
    .line 88
    iget-object v1, p0, LT5/n;->e:[Z

    .line 89
    .line 90
    invoke-static {v1}, Lu6/a;->l([Z)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, LT5/n;->k:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, LT5/s;

    .line 96
    .line 97
    invoke-virtual {v1}, LT5/s;->d()V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, LT5/n;->l:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, LT5/s;

    .line 103
    .line 104
    invoke-virtual {v1}, LT5/s;->d()V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, LT5/n;->m:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, LT5/s;

    .line 110
    .line 111
    invoke-virtual {v1}, LT5/s;->d()V

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, LT5/n;->o:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, LT5/m;

    .line 117
    .line 118
    if-eqz v1, :cond_1

    .line 119
    .line 120
    iput-boolean v0, v1, LT5/m;->k:Z

    .line 121
    .line 122
    iput-boolean v0, v1, LT5/m;->o:Z

    .line 123
    .line 124
    iget-object v1, v1, LT5/m;->n:LT5/l;

    .line 125
    .line 126
    iput-boolean v0, v1, LT5/l;->b:Z

    .line 127
    .line 128
    iput-boolean v0, v1, LT5/l;->a:Z

    .line 129
    .line 130
    :cond_1
    return-void

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(II[B)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget v4, v0, LT5/n;->a:I

    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v4, v0, LT5/n;->g:Z

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    iget-object v4, v0, LT5/n;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, LY2/m;

    .line 21
    .line 22
    iget-boolean v4, v4, LY2/m;->c:Z

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    :cond_0
    iget-object v4, v0, LT5/n;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, LT5/s;

    .line 29
    .line 30
    invoke-virtual {v4, v1, v2, v3}, LT5/s;->a(II[B)V

    .line 31
    .line 32
    .line 33
    iget-object v4, v0, LT5/n;->l:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, LT5/s;

    .line 36
    .line 37
    invoke-virtual {v4, v1, v2, v3}, LT5/s;->a(II[B)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v4, v0, LT5/n;->m:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, LT5/s;

    .line 43
    .line 44
    invoke-virtual {v4, v1, v2, v3}, LT5/s;->a(II[B)V

    .line 45
    .line 46
    .line 47
    iget-object v4, v0, LT5/n;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, LY2/m;

    .line 50
    .line 51
    iget-boolean v5, v4, LY2/m;->k:Z

    .line 52
    .line 53
    if-nez v5, :cond_2

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    sub-int/2addr v2, v1

    .line 58
    iget-object v5, v4, LY2/m;->g:[B

    .line 59
    .line 60
    array-length v6, v5

    .line 61
    iget v7, v4, LY2/m;->h:I

    .line 62
    .line 63
    add-int/2addr v7, v2

    .line 64
    const/4 v8, 0x2

    .line 65
    if-ge v6, v7, :cond_3

    .line 66
    .line 67
    mul-int/2addr v7, v8

    .line 68
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iput-object v5, v4, LY2/m;->g:[B

    .line 73
    .line 74
    :cond_3
    iget-object v5, v4, LY2/m;->g:[B

    .line 75
    .line 76
    iget v6, v4, LY2/m;->h:I

    .line 77
    .line 78
    invoke-static {v3, v1, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    iget v1, v4, LY2/m;->h:I

    .line 82
    .line 83
    add-int/2addr v1, v2

    .line 84
    iput v1, v4, LY2/m;->h:I

    .line 85
    .line 86
    iget-object v2, v4, LY2/m;->g:[B

    .line 87
    .line 88
    iget-object v3, v4, LY2/m;->f:LJ5/y;

    .line 89
    .line 90
    iput-object v2, v3, LJ5/y;->b:[B

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    iput v2, v3, LJ5/y;->d:I

    .line 94
    .line 95
    iput v1, v3, LJ5/y;->c:I

    .line 96
    .line 97
    iput v2, v3, LJ5/y;->e:I

    .line 98
    .line 99
    invoke-virtual {v3}, LJ5/y;->a()V

    .line 100
    .line 101
    .line 102
    const/16 v1, 0x8

    .line 103
    .line 104
    invoke-virtual {v3, v1}, LJ5/y;->d(I)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_4
    invoke-virtual {v3}, LJ5/y;->s()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v8}, LJ5/y;->i(I)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    const/4 v5, 0x5

    .line 120
    invoke-virtual {v3, v5}, LJ5/y;->t(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_5

    .line 128
    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_5
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-nez v6, :cond_6

    .line 139
    .line 140
    goto/16 :goto_7

    .line 141
    .line 142
    :cond_6
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    iget-boolean v7, v4, LY2/m;->c:Z

    .line 147
    .line 148
    const/4 v9, 0x1

    .line 149
    if-nez v7, :cond_7

    .line 150
    .line 151
    iput-boolean v2, v4, LY2/m;->k:Z

    .line 152
    .line 153
    iget-object v1, v4, LY2/m;->n:LT5/l;

    .line 154
    .line 155
    iput v6, v1, LT5/l;->d:I

    .line 156
    .line 157
    iput-boolean v9, v1, LT5/l;->b:Z

    .line 158
    .line 159
    goto/16 :goto_7

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-nez v7, :cond_8

    .line 166
    .line 167
    goto/16 :goto_7

    .line 168
    .line 169
    :cond_8
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    iget-object v10, v4, LY2/m;->e:Landroid/util/SparseArray;

    .line 174
    .line 175
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    if-gez v11, :cond_9

    .line 180
    .line 181
    iput-boolean v2, v4, LY2/m;->k:Z

    .line 182
    .line 183
    goto/16 :goto_7

    .line 184
    .line 185
    :cond_9
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    check-cast v10, LR1/l;

    .line 190
    .line 191
    iget-object v11, v4, LY2/m;->d:Landroid/util/SparseArray;

    .line 192
    .line 193
    iget v12, v10, LR1/l;->a:I

    .line 194
    .line 195
    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    check-cast v11, LR1/m;

    .line 200
    .line 201
    iget-boolean v12, v11, LR1/m;->j:Z

    .line 202
    .line 203
    if-eqz v12, :cond_b

    .line 204
    .line 205
    invoke-virtual {v3, v8}, LJ5/y;->d(I)Z

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    if-nez v12, :cond_a

    .line 210
    .line 211
    goto/16 :goto_7

    .line 212
    .line 213
    :cond_a
    invoke-virtual {v3, v8}, LJ5/y;->t(I)V

    .line 214
    .line 215
    .line 216
    :cond_b
    iget v8, v11, LR1/m;->l:I

    .line 217
    .line 218
    invoke-virtual {v3, v8}, LJ5/y;->d(I)Z

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    if-nez v12, :cond_c

    .line 223
    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :cond_c
    invoke-virtual {v3, v8}, LJ5/y;->i(I)I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    iget-boolean v12, v11, LR1/m;->k:Z

    .line 231
    .line 232
    if-nez v12, :cond_10

    .line 233
    .line 234
    invoke-virtual {v3, v9}, LJ5/y;->d(I)Z

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    if-nez v12, :cond_d

    .line 239
    .line 240
    goto/16 :goto_7

    .line 241
    .line 242
    :cond_d
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    if-eqz v12, :cond_f

    .line 247
    .line 248
    invoke-virtual {v3, v9}, LJ5/y;->d(I)Z

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    if-nez v13, :cond_e

    .line 253
    .line 254
    goto/16 :goto_7

    .line 255
    .line 256
    :cond_e
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    move v14, v9

    .line 261
    goto :goto_1

    .line 262
    :cond_f
    move v13, v2

    .line 263
    :goto_0
    move v14, v13

    .line 264
    goto :goto_1

    .line 265
    :cond_10
    move v12, v2

    .line 266
    move v13, v12

    .line 267
    goto :goto_0

    .line 268
    :goto_1
    iget v15, v4, LY2/m;->i:I

    .line 269
    .line 270
    if-ne v15, v5, :cond_11

    .line 271
    .line 272
    move v5, v9

    .line 273
    goto :goto_2

    .line 274
    :cond_11
    move v5, v2

    .line 275
    :goto_2
    if-eqz v5, :cond_13

    .line 276
    .line 277
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 278
    .line 279
    .line 280
    move-result v15

    .line 281
    if-nez v15, :cond_12

    .line 282
    .line 283
    goto/16 :goto_7

    .line 284
    .line 285
    :cond_12
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 286
    .line 287
    .line 288
    move-result v15

    .line 289
    goto :goto_3

    .line 290
    :cond_13
    move v15, v2

    .line 291
    :goto_3
    iget-boolean v10, v10, LR1/l;->b:Z

    .line 292
    .line 293
    iget v2, v11, LR1/m;->m:I

    .line 294
    .line 295
    if-nez v2, :cond_17

    .line 296
    .line 297
    iget v2, v11, LR1/m;->n:I

    .line 298
    .line 299
    invoke-virtual {v3, v2}, LJ5/y;->d(I)Z

    .line 300
    .line 301
    .line 302
    move-result v16

    .line 303
    if-nez v16, :cond_14

    .line 304
    .line 305
    goto/16 :goto_7

    .line 306
    .line 307
    :cond_14
    invoke-virtual {v3, v2}, LJ5/y;->i(I)I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v10, :cond_16

    .line 312
    .line 313
    if-nez v12, :cond_16

    .line 314
    .line 315
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    if-nez v10, :cond_15

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_15
    invoke-virtual {v3}, LJ5/y;->n()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    move v10, v3

    .line 327
    const/4 v3, 0x0

    .line 328
    const/4 v9, 0x0

    .line 329
    goto :goto_6

    .line 330
    :cond_16
    :goto_4
    const/4 v3, 0x0

    .line 331
    :goto_5
    const/4 v9, 0x0

    .line 332
    const/4 v10, 0x0

    .line 333
    goto :goto_6

    .line 334
    :cond_17
    if-ne v2, v9, :cond_1b

    .line 335
    .line 336
    iget-boolean v2, v11, LR1/m;->o:Z

    .line 337
    .line 338
    if-nez v2, :cond_1b

    .line 339
    .line 340
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-nez v2, :cond_18

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_18
    invoke-virtual {v3}, LJ5/y;->n()I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-eqz v10, :cond_1a

    .line 352
    .line 353
    if-nez v12, :cond_1a

    .line 354
    .line 355
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    if-nez v10, :cond_19

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_19
    invoke-virtual {v3}, LJ5/y;->n()I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    move v9, v3

    .line 367
    const/4 v10, 0x0

    .line 368
    move v3, v2

    .line 369
    const/4 v2, 0x0

    .line 370
    goto :goto_6

    .line 371
    :cond_1a
    move v3, v2

    .line 372
    const/4 v2, 0x0

    .line 373
    goto :goto_5

    .line 374
    :cond_1b
    const/4 v2, 0x0

    .line 375
    goto :goto_4

    .line 376
    :goto_6
    iget-object v0, v4, LY2/m;->n:LT5/l;

    .line 377
    .line 378
    iput-object v11, v0, LT5/l;->p:Ljava/lang/Object;

    .line 379
    .line 380
    iput v1, v0, LT5/l;->c:I

    .line 381
    .line 382
    iput v6, v0, LT5/l;->d:I

    .line 383
    .line 384
    iput v8, v0, LT5/l;->e:I

    .line 385
    .line 386
    iput v7, v0, LT5/l;->f:I

    .line 387
    .line 388
    iput-boolean v12, v0, LT5/l;->g:Z

    .line 389
    .line 390
    iput-boolean v14, v0, LT5/l;->h:Z

    .line 391
    .line 392
    iput-boolean v13, v0, LT5/l;->i:Z

    .line 393
    .line 394
    iput-boolean v5, v0, LT5/l;->j:Z

    .line 395
    .line 396
    iput v15, v0, LT5/l;->k:I

    .line 397
    .line 398
    iput v2, v0, LT5/l;->l:I

    .line 399
    .line 400
    iput v10, v0, LT5/l;->m:I

    .line 401
    .line 402
    iput v3, v0, LT5/l;->n:I

    .line 403
    .line 404
    iput v9, v0, LT5/l;->o:I

    .line 405
    .line 406
    const/4 v1, 0x1

    .line 407
    iput-boolean v1, v0, LT5/l;->a:Z

    .line 408
    .line 409
    iput-boolean v1, v0, LT5/l;->b:Z

    .line 410
    .line 411
    const/4 v0, 0x0

    .line 412
    iput-boolean v0, v4, LY2/m;->k:Z

    .line 413
    .line 414
    :goto_7
    return-void

    .line 415
    :pswitch_0
    iget-boolean v4, v0, LT5/n;->g:Z

    .line 416
    .line 417
    if-eqz v4, :cond_1c

    .line 418
    .line 419
    iget-object v4, v0, LT5/n;->o:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v4, LT5/m;

    .line 422
    .line 423
    iget-boolean v4, v4, LT5/m;->c:Z

    .line 424
    .line 425
    if-eqz v4, :cond_1d

    .line 426
    .line 427
    :cond_1c
    iget-object v4, v0, LT5/n;->k:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v4, LT5/s;

    .line 430
    .line 431
    invoke-virtual {v4, v1, v2, v3}, LT5/s;->a(II[B)V

    .line 432
    .line 433
    .line 434
    iget-object v4, v0, LT5/n;->l:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v4, LT5/s;

    .line 437
    .line 438
    invoke-virtual {v4, v1, v2, v3}, LT5/s;->a(II[B)V

    .line 439
    .line 440
    .line 441
    :cond_1d
    iget-object v4, v0, LT5/n;->m:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v4, LT5/s;

    .line 444
    .line 445
    invoke-virtual {v4, v1, v2, v3}, LT5/s;->a(II[B)V

    .line 446
    .line 447
    .line 448
    iget-object v4, v0, LT5/n;->o:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v4, LT5/m;

    .line 451
    .line 452
    iget-boolean v5, v4, LT5/m;->k:Z

    .line 453
    .line 454
    if-nez v5, :cond_1e

    .line 455
    .line 456
    goto/16 :goto_f

    .line 457
    .line 458
    :cond_1e
    sub-int/2addr v2, v1

    .line 459
    iget-object v5, v4, LT5/m;->g:[B

    .line 460
    .line 461
    array-length v6, v5

    .line 462
    iget v7, v4, LT5/m;->h:I

    .line 463
    .line 464
    add-int/2addr v7, v2

    .line 465
    const/4 v8, 0x2

    .line 466
    if-ge v6, v7, :cond_1f

    .line 467
    .line 468
    mul-int/2addr v7, v8

    .line 469
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    iput-object v5, v4, LT5/m;->g:[B

    .line 474
    .line 475
    :cond_1f
    iget-object v5, v4, LT5/m;->g:[B

    .line 476
    .line 477
    iget v6, v4, LT5/m;->h:I

    .line 478
    .line 479
    invoke-static {v3, v1, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 480
    .line 481
    .line 482
    iget v1, v4, LT5/m;->h:I

    .line 483
    .line 484
    add-int/2addr v1, v2

    .line 485
    iput v1, v4, LT5/m;->h:I

    .line 486
    .line 487
    iget-object v2, v4, LT5/m;->g:[B

    .line 488
    .line 489
    iget-object v3, v4, LT5/m;->f:LJ5/y;

    .line 490
    .line 491
    iput-object v2, v3, LJ5/y;->b:[B

    .line 492
    .line 493
    const/4 v2, 0x0

    .line 494
    iput v2, v3, LJ5/y;->d:I

    .line 495
    .line 496
    iput v1, v3, LJ5/y;->c:I

    .line 497
    .line 498
    iput v2, v3, LJ5/y;->e:I

    .line 499
    .line 500
    invoke-virtual {v3}, LJ5/y;->a()V

    .line 501
    .line 502
    .line 503
    const/16 v1, 0x8

    .line 504
    .line 505
    invoke-virtual {v3, v1}, LJ5/y;->d(I)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-nez v1, :cond_20

    .line 510
    .line 511
    goto/16 :goto_f

    .line 512
    .line 513
    :cond_20
    invoke-virtual {v3}, LJ5/y;->s()V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3, v8}, LJ5/y;->i(I)I

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    const/4 v5, 0x5

    .line 521
    invoke-virtual {v3, v5}, LJ5/y;->t(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    if-nez v6, :cond_21

    .line 529
    .line 530
    goto/16 :goto_f

    .line 531
    .line 532
    :cond_21
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 533
    .line 534
    .line 535
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 536
    .line 537
    .line 538
    move-result v6

    .line 539
    if-nez v6, :cond_22

    .line 540
    .line 541
    goto/16 :goto_f

    .line 542
    .line 543
    :cond_22
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 544
    .line 545
    .line 546
    move-result v6

    .line 547
    iget-boolean v7, v4, LT5/m;->c:Z

    .line 548
    .line 549
    const/4 v9, 0x1

    .line 550
    if-nez v7, :cond_23

    .line 551
    .line 552
    iput-boolean v2, v4, LT5/m;->k:Z

    .line 553
    .line 554
    iget-object v1, v4, LT5/m;->n:LT5/l;

    .line 555
    .line 556
    iput v6, v1, LT5/l;->d:I

    .line 557
    .line 558
    iput-boolean v9, v1, LT5/l;->b:Z

    .line 559
    .line 560
    goto/16 :goto_f

    .line 561
    .line 562
    :cond_23
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    if-nez v7, :cond_24

    .line 567
    .line 568
    goto/16 :goto_f

    .line 569
    .line 570
    :cond_24
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    iget-object v10, v4, LT5/m;->e:Landroid/util/SparseArray;

    .line 575
    .line 576
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    if-gez v11, :cond_25

    .line 581
    .line 582
    iput-boolean v2, v4, LT5/m;->k:Z

    .line 583
    .line 584
    goto/16 :goto_f

    .line 585
    .line 586
    :cond_25
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v10

    .line 590
    check-cast v10, Lu6/m;

    .line 591
    .line 592
    iget-object v11, v4, LT5/m;->d:Landroid/util/SparseArray;

    .line 593
    .line 594
    iget v12, v10, Lu6/m;->a:I

    .line 595
    .line 596
    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v11

    .line 600
    check-cast v11, Lu6/n;

    .line 601
    .line 602
    iget-boolean v12, v11, Lu6/n;->h:Z

    .line 603
    .line 604
    if-eqz v12, :cond_27

    .line 605
    .line 606
    invoke-virtual {v3, v8}, LJ5/y;->d(I)Z

    .line 607
    .line 608
    .line 609
    move-result v12

    .line 610
    if-nez v12, :cond_26

    .line 611
    .line 612
    goto/16 :goto_f

    .line 613
    .line 614
    :cond_26
    invoke-virtual {v3, v8}, LJ5/y;->t(I)V

    .line 615
    .line 616
    .line 617
    :cond_27
    iget v8, v11, Lu6/n;->j:I

    .line 618
    .line 619
    invoke-virtual {v3, v8}, LJ5/y;->d(I)Z

    .line 620
    .line 621
    .line 622
    move-result v12

    .line 623
    if-nez v12, :cond_28

    .line 624
    .line 625
    goto/16 :goto_f

    .line 626
    .line 627
    :cond_28
    invoke-virtual {v3, v8}, LJ5/y;->i(I)I

    .line 628
    .line 629
    .line 630
    move-result v8

    .line 631
    iget-boolean v12, v11, Lu6/n;->i:Z

    .line 632
    .line 633
    if-nez v12, :cond_2c

    .line 634
    .line 635
    invoke-virtual {v3, v9}, LJ5/y;->d(I)Z

    .line 636
    .line 637
    .line 638
    move-result v12

    .line 639
    if-nez v12, :cond_29

    .line 640
    .line 641
    goto/16 :goto_f

    .line 642
    .line 643
    :cond_29
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 644
    .line 645
    .line 646
    move-result v12

    .line 647
    if-eqz v12, :cond_2b

    .line 648
    .line 649
    invoke-virtual {v3, v9}, LJ5/y;->d(I)Z

    .line 650
    .line 651
    .line 652
    move-result v13

    .line 653
    if-nez v13, :cond_2a

    .line 654
    .line 655
    goto/16 :goto_f

    .line 656
    .line 657
    :cond_2a
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 658
    .line 659
    .line 660
    move-result v13

    .line 661
    move v14, v9

    .line 662
    goto :goto_9

    .line 663
    :cond_2b
    move v13, v2

    .line 664
    :goto_8
    move v14, v13

    .line 665
    goto :goto_9

    .line 666
    :cond_2c
    move v12, v2

    .line 667
    move v13, v12

    .line 668
    goto :goto_8

    .line 669
    :goto_9
    iget v15, v4, LT5/m;->i:I

    .line 670
    .line 671
    if-ne v15, v5, :cond_2d

    .line 672
    .line 673
    move v5, v9

    .line 674
    goto :goto_a

    .line 675
    :cond_2d
    move v5, v2

    .line 676
    :goto_a
    if-eqz v5, :cond_2f

    .line 677
    .line 678
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 679
    .line 680
    .line 681
    move-result v15

    .line 682
    if-nez v15, :cond_2e

    .line 683
    .line 684
    goto/16 :goto_f

    .line 685
    .line 686
    :cond_2e
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 687
    .line 688
    .line 689
    move-result v15

    .line 690
    goto :goto_b

    .line 691
    :cond_2f
    move v15, v2

    .line 692
    :goto_b
    iget-boolean v10, v10, Lu6/m;->b:Z

    .line 693
    .line 694
    iget v2, v11, Lu6/n;->k:I

    .line 695
    .line 696
    if-nez v2, :cond_33

    .line 697
    .line 698
    iget v2, v11, Lu6/n;->l:I

    .line 699
    .line 700
    invoke-virtual {v3, v2}, LJ5/y;->d(I)Z

    .line 701
    .line 702
    .line 703
    move-result v16

    .line 704
    if-nez v16, :cond_30

    .line 705
    .line 706
    goto/16 :goto_f

    .line 707
    .line 708
    :cond_30
    invoke-virtual {v3, v2}, LJ5/y;->i(I)I

    .line 709
    .line 710
    .line 711
    move-result v2

    .line 712
    if-eqz v10, :cond_32

    .line 713
    .line 714
    if-nez v12, :cond_32

    .line 715
    .line 716
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 717
    .line 718
    .line 719
    move-result v10

    .line 720
    if-nez v10, :cond_31

    .line 721
    .line 722
    goto :goto_f

    .line 723
    :cond_31
    invoke-virtual {v3}, LJ5/y;->n()I

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    move v10, v3

    .line 728
    const/4 v3, 0x0

    .line 729
    const/4 v9, 0x0

    .line 730
    goto :goto_e

    .line 731
    :cond_32
    :goto_c
    const/4 v3, 0x0

    .line 732
    :goto_d
    const/4 v9, 0x0

    .line 733
    const/4 v10, 0x0

    .line 734
    goto :goto_e

    .line 735
    :cond_33
    if-ne v2, v9, :cond_37

    .line 736
    .line 737
    iget-boolean v2, v11, Lu6/n;->m:Z

    .line 738
    .line 739
    if-nez v2, :cond_37

    .line 740
    .line 741
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 742
    .line 743
    .line 744
    move-result v2

    .line 745
    if-nez v2, :cond_34

    .line 746
    .line 747
    goto :goto_f

    .line 748
    :cond_34
    invoke-virtual {v3}, LJ5/y;->n()I

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    if-eqz v10, :cond_36

    .line 753
    .line 754
    if-nez v12, :cond_36

    .line 755
    .line 756
    invoke-virtual {v3}, LJ5/y;->e()Z

    .line 757
    .line 758
    .line 759
    move-result v10

    .line 760
    if-nez v10, :cond_35

    .line 761
    .line 762
    goto :goto_f

    .line 763
    :cond_35
    invoke-virtual {v3}, LJ5/y;->n()I

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    move v9, v3

    .line 768
    const/4 v10, 0x0

    .line 769
    move v3, v2

    .line 770
    const/4 v2, 0x0

    .line 771
    goto :goto_e

    .line 772
    :cond_36
    move v3, v2

    .line 773
    const/4 v2, 0x0

    .line 774
    goto :goto_d

    .line 775
    :cond_37
    const/4 v2, 0x0

    .line 776
    goto :goto_c

    .line 777
    :goto_e
    iget-object v0, v4, LT5/m;->n:LT5/l;

    .line 778
    .line 779
    iput-object v11, v0, LT5/l;->p:Ljava/lang/Object;

    .line 780
    .line 781
    iput v1, v0, LT5/l;->c:I

    .line 782
    .line 783
    iput v6, v0, LT5/l;->d:I

    .line 784
    .line 785
    iput v8, v0, LT5/l;->e:I

    .line 786
    .line 787
    iput v7, v0, LT5/l;->f:I

    .line 788
    .line 789
    iput-boolean v12, v0, LT5/l;->g:Z

    .line 790
    .line 791
    iput-boolean v14, v0, LT5/l;->h:Z

    .line 792
    .line 793
    iput-boolean v13, v0, LT5/l;->i:Z

    .line 794
    .line 795
    iput-boolean v5, v0, LT5/l;->j:Z

    .line 796
    .line 797
    iput v15, v0, LT5/l;->k:I

    .line 798
    .line 799
    iput v2, v0, LT5/l;->l:I

    .line 800
    .line 801
    iput v10, v0, LT5/l;->m:I

    .line 802
    .line 803
    iput v3, v0, LT5/l;->n:I

    .line 804
    .line 805
    iput v9, v0, LT5/l;->o:I

    .line 806
    .line 807
    const/4 v1, 0x1

    .line 808
    iput-boolean v1, v0, LT5/l;->a:Z

    .line 809
    .line 810
    iput-boolean v1, v0, LT5/l;->b:Z

    .line 811
    .line 812
    const/4 v0, 0x0

    .line 813
    iput-boolean v0, v4, LT5/m;->k:Z

    .line 814
    .line 815
    :goto_f
    return-void

    .line 816
    nop

    .line 817
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(LY4/b;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v6, 0x3

    .line 6
    iget-object v7, v0, LT5/n;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v7, LJ5/w;

    .line 9
    .line 10
    invoke-static {v7}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget v7, Lu6/v;->a:I

    .line 14
    .line 15
    iget v7, v1, LY4/b;->b:I

    .line 16
    .line 17
    iget v8, v1, LY4/b;->c:I

    .line 18
    .line 19
    iget-object v9, v1, LY4/b;->a:[B

    .line 20
    .line 21
    iget-wide v10, v0, LT5/n;->d:J

    .line 22
    .line 23
    invoke-virtual {v1}, LY4/b;->a()I

    .line 24
    .line 25
    .line 26
    move-result v12

    .line 27
    int-to-long v12, v12

    .line 28
    add-long/2addr v10, v12

    .line 29
    iput-wide v10, v0, LT5/n;->d:J

    .line 30
    .line 31
    iget-object v10, v0, LT5/n;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v10, LJ5/w;

    .line 34
    .line 35
    invoke-virtual {v1}, LY4/b;->a()I

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    invoke-interface {v10, v11, v1}, LJ5/w;->c(ILY4/b;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, v0, LT5/n;->e:[Z

    .line 43
    .line 44
    invoke-static {v9, v7, v8, v1}, Lu6/a;->r([BII[Z)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-ne v1, v8, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v7, v8, v9}, LT5/n;->b(II[B)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    add-int/lit8 v10, v1, 0x3

    .line 55
    .line 56
    aget-byte v11, v9, v10

    .line 57
    .line 58
    and-int/lit8 v11, v11, 0x1f

    .line 59
    .line 60
    sub-int v12, v1, v7

    .line 61
    .line 62
    if-lez v12, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0, v7, v1, v9}, LT5/n;->b(II[B)V

    .line 65
    .line 66
    .line 67
    :cond_1
    sub-int v1, v8, v1

    .line 68
    .line 69
    iget-wide v13, v0, LT5/n;->d:J

    .line 70
    .line 71
    const/4 v7, 0x2

    .line 72
    const/4 v15, 0x1

    .line 73
    int-to-long v2, v1

    .line 74
    sub-long/2addr v13, v2

    .line 75
    if-gez v12, :cond_2

    .line 76
    .line 77
    neg-int v2, v12

    .line 78
    :goto_1
    move/from16 p1, v7

    .line 79
    .line 80
    move v3, v8

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/4 v2, 0x0

    .line 83
    goto :goto_1

    .line 84
    :goto_2
    iget-wide v7, v0, LT5/n;->h:J

    .line 85
    .line 86
    iget-boolean v12, v0, LT5/n;->g:Z

    .line 87
    .line 88
    move/from16 v16, v15

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    iget-object v4, v0, LT5/n;->l:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, LT5/s;

    .line 95
    .line 96
    iget-object v5, v0, LT5/n;->k:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v5, LT5/s;

    .line 99
    .line 100
    if-eqz v12, :cond_4

    .line 101
    .line 102
    iget-object v12, v0, LT5/n;->o:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v12, LT5/m;

    .line 105
    .line 106
    iget-boolean v12, v12, LT5/m;->c:Z

    .line 107
    .line 108
    if-eqz v12, :cond_3

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    move/from16 v20, v1

    .line 112
    .line 113
    move/from16 v21, v3

    .line 114
    .line 115
    move-object/from16 v22, v9

    .line 116
    .line 117
    move/from16 v23, v10

    .line 118
    .line 119
    move-wide/from16 v24, v13

    .line 120
    .line 121
    goto/16 :goto_4

    .line 122
    .line 123
    :cond_4
    :goto_3
    invoke-virtual {v5, v2}, LT5/s;->b(I)Z

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v2}, LT5/s;->b(I)Z

    .line 127
    .line 128
    .line 129
    iget-boolean v12, v0, LT5/n;->g:Z

    .line 130
    .line 131
    if-nez v12, :cond_5

    .line 132
    .line 133
    iget-boolean v12, v5, LT5/s;->d:Z

    .line 134
    .line 135
    if-eqz v12, :cond_3

    .line 136
    .line 137
    iget-boolean v12, v4, LT5/s;->d:Z

    .line 138
    .line 139
    if-eqz v12, :cond_3

    .line 140
    .line 141
    new-instance v12, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object v15, v5, LT5/s;->e:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v15, [B

    .line 149
    .line 150
    iget v6, v5, LT5/s;->f:I

    .line 151
    .line 152
    invoke-static {v15, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    iget-object v6, v4, LT5/s;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v6, [B

    .line 162
    .line 163
    iget v15, v4, LT5/s;->f:I

    .line 164
    .line 165
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    iget-object v6, v5, LT5/s;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v6, [B

    .line 175
    .line 176
    iget v15, v5, LT5/s;->f:I

    .line 177
    .line 178
    move/from16 v20, v1

    .line 179
    .line 180
    const/4 v1, 0x3

    .line 181
    invoke-static {v1, v15, v6}, Lu6/a;->A(II[B)Lu6/n;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    iget-object v1, v4, LT5/s;->e:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v1, [B

    .line 188
    .line 189
    iget v15, v4, LT5/s;->f:I

    .line 190
    .line 191
    move/from16 v21, v3

    .line 192
    .line 193
    new-instance v3, LJ5/y;

    .line 194
    .line 195
    move-object/from16 v22, v9

    .line 196
    .line 197
    move/from16 v23, v10

    .line 198
    .line 199
    const/4 v9, 0x4

    .line 200
    const/4 v10, 0x7

    .line 201
    invoke-direct {v3, v9, v1, v15, v10}, LJ5/y;-><init>(I[BII)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    invoke-virtual {v3}, LJ5/y;->m()I

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    invoke-virtual {v3}, LJ5/y;->s()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    new-instance v10, Lu6/m;

    .line 220
    .line 221
    invoke-direct {v10, v1, v9, v3}, Lu6/m;-><init>(IIZ)V

    .line 222
    .line 223
    .line 224
    iget v3, v6, Lu6/n;->a:I

    .line 225
    .line 226
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    iget v9, v6, Lu6/n;->b:I

    .line 231
    .line 232
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    iget v15, v6, Lu6/n;->c:I

    .line 237
    .line 238
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    move-object/from16 v24, v3

    .line 243
    .line 244
    move-object/from16 v25, v9

    .line 245
    .line 246
    const/4 v3, 0x3

    .line 247
    new-array v9, v3, [Ljava/lang/Object;

    .line 248
    .line 249
    aput-object v24, v9, v17

    .line 250
    .line 251
    aput-object v25, v9, v16

    .line 252
    .line 253
    aput-object v15, v9, p1

    .line 254
    .line 255
    const-string v3, "avc1.%02X%02X%02X"

    .line 256
    .line 257
    invoke-static {v3, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    iget-object v9, v0, LT5/n;->n:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v9, LJ5/w;

    .line 264
    .line 265
    new-instance v15, LE5/S;

    .line 266
    .line 267
    invoke-direct {v15}, LE5/S;-><init>()V

    .line 268
    .line 269
    .line 270
    move-wide/from16 v24, v13

    .line 271
    .line 272
    iget-object v13, v0, LT5/n;->f:Ljava/lang/String;

    .line 273
    .line 274
    iput-object v13, v15, LE5/S;->a:Ljava/lang/String;

    .line 275
    .line 276
    const-string v13, "video/avc"

    .line 277
    .line 278
    iput-object v13, v15, LE5/S;->k:Ljava/lang/String;

    .line 279
    .line 280
    iput-object v3, v15, LE5/S;->h:Ljava/lang/String;

    .line 281
    .line 282
    iget v3, v6, Lu6/n;->e:I

    .line 283
    .line 284
    iput v3, v15, LE5/S;->p:I

    .line 285
    .line 286
    iget v3, v6, Lu6/n;->f:I

    .line 287
    .line 288
    iput v3, v15, LE5/S;->q:I

    .line 289
    .line 290
    iget v3, v6, Lu6/n;->g:F

    .line 291
    .line 292
    iput v3, v15, LE5/S;->t:F

    .line 293
    .line 294
    iput-object v12, v15, LE5/S;->m:Ljava/util/List;

    .line 295
    .line 296
    new-instance v3, LE5/T;

    .line 297
    .line 298
    invoke-direct {v3, v15}, LE5/T;-><init>(LE5/S;)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v9, v3}, LJ5/w;->a(LE5/T;)V

    .line 302
    .line 303
    .line 304
    move/from16 v15, v16

    .line 305
    .line 306
    iput-boolean v15, v0, LT5/n;->g:Z

    .line 307
    .line 308
    iget-object v3, v0, LT5/n;->o:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v3, LT5/m;

    .line 311
    .line 312
    iget-object v3, v3, LT5/m;->d:Landroid/util/SparseArray;

    .line 313
    .line 314
    iget v9, v6, Lu6/n;->d:I

    .line 315
    .line 316
    invoke-virtual {v3, v9, v6}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    iget-object v3, v0, LT5/n;->o:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v3, LT5/m;

    .line 322
    .line 323
    iget-object v3, v3, LT5/m;->e:Landroid/util/SparseArray;

    .line 324
    .line 325
    invoke-virtual {v3, v1, v10}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5}, LT5/s;->d()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4}, LT5/s;->d()V

    .line 332
    .line 333
    .line 334
    const/4 v6, 0x3

    .line 335
    goto :goto_4

    .line 336
    :cond_5
    move/from16 v20, v1

    .line 337
    .line 338
    move/from16 v21, v3

    .line 339
    .line 340
    move-object/from16 v22, v9

    .line 341
    .line 342
    move/from16 v23, v10

    .line 343
    .line 344
    move-wide/from16 v24, v13

    .line 345
    .line 346
    iget-boolean v1, v5, LT5/s;->d:Z

    .line 347
    .line 348
    if-eqz v1, :cond_6

    .line 349
    .line 350
    iget-object v1, v5, LT5/s;->e:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v1, [B

    .line 353
    .line 354
    iget v3, v5, LT5/s;->f:I

    .line 355
    .line 356
    const/4 v6, 0x3

    .line 357
    invoke-static {v6, v3, v1}, Lu6/a;->A(II[B)Lu6/n;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    iget-object v3, v0, LT5/n;->o:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v3, LT5/m;

    .line 364
    .line 365
    iget-object v3, v3, LT5/m;->d:Landroid/util/SparseArray;

    .line 366
    .line 367
    iget v9, v1, Lu6/n;->d:I

    .line 368
    .line 369
    invoke-virtual {v3, v9, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5}, LT5/s;->d()V

    .line 373
    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_6
    const/4 v6, 0x3

    .line 377
    iget-boolean v1, v4, LT5/s;->d:Z

    .line 378
    .line 379
    if-eqz v1, :cond_7

    .line 380
    .line 381
    iget-object v1, v4, LT5/s;->e:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v1, [B

    .line 384
    .line 385
    iget v3, v4, LT5/s;->f:I

    .line 386
    .line 387
    new-instance v9, LJ5/y;

    .line 388
    .line 389
    const/4 v10, 0x4

    .line 390
    const/4 v12, 0x7

    .line 391
    invoke-direct {v9, v10, v1, v3, v12}, LJ5/y;-><init>(I[BII)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v9}, LJ5/y;->m()I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    invoke-virtual {v9}, LJ5/y;->m()I

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    invoke-virtual {v9}, LJ5/y;->s()V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v9}, LJ5/y;->h()Z

    .line 406
    .line 407
    .line 408
    move-result v9

    .line 409
    new-instance v10, Lu6/m;

    .line 410
    .line 411
    invoke-direct {v10, v1, v3, v9}, Lu6/m;-><init>(IIZ)V

    .line 412
    .line 413
    .line 414
    iget-object v3, v0, LT5/n;->o:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v3, LT5/m;

    .line 417
    .line 418
    iget-object v3, v3, LT5/m;->e:Landroid/util/SparseArray;

    .line 419
    .line 420
    invoke-virtual {v3, v1, v10}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v4}, LT5/s;->d()V

    .line 424
    .line 425
    .line 426
    :cond_7
    :goto_4
    iget-object v1, v0, LT5/n;->m:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, LT5/s;

    .line 429
    .line 430
    invoke-virtual {v1, v2}, LT5/s;->b(I)Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_8

    .line 435
    .line 436
    iget-object v2, v1, LT5/s;->e:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v2, [B

    .line 439
    .line 440
    iget v3, v1, LT5/s;->f:I

    .line 441
    .line 442
    invoke-static {v3, v2}, Lu6/a;->C(I[B)I

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    iget-object v3, v1, LT5/s;->e:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v3, [B

    .line 449
    .line 450
    iget-object v9, v0, LT5/n;->p:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v9, LY4/b;

    .line 453
    .line 454
    invoke-virtual {v9, v2, v3}, LY4/b;->y(I[B)V

    .line 455
    .line 456
    .line 457
    const/4 v10, 0x4

    .line 458
    invoke-virtual {v9, v10}, LY4/b;->A(I)V

    .line 459
    .line 460
    .line 461
    iget-object v2, v0, LT5/n;->j:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v2, LS3/s;

    .line 464
    .line 465
    iget-object v2, v2, LS3/s;->c:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v2, [LJ5/w;

    .line 468
    .line 469
    invoke-static {v7, v8, v9, v2}, LFe/g;->w(JLY4/b;[LJ5/w;)V

    .line 470
    .line 471
    .line 472
    :cond_8
    iget-object v2, v0, LT5/n;->o:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v2, LT5/m;

    .line 475
    .line 476
    iget-boolean v3, v0, LT5/n;->g:Z

    .line 477
    .line 478
    iget-boolean v8, v0, LT5/n;->i:Z

    .line 479
    .line 480
    iget v7, v2, LT5/m;->i:I

    .line 481
    .line 482
    const/16 v9, 0x9

    .line 483
    .line 484
    if-eq v7, v9, :cond_f

    .line 485
    .line 486
    iget-boolean v7, v2, LT5/m;->c:Z

    .line 487
    .line 488
    if-eqz v7, :cond_12

    .line 489
    .line 490
    iget-object v7, v2, LT5/m;->n:LT5/l;

    .line 491
    .line 492
    iget-object v9, v2, LT5/m;->m:LT5/l;

    .line 493
    .line 494
    iget-boolean v10, v7, LT5/l;->a:Z

    .line 495
    .line 496
    if-nez v10, :cond_9

    .line 497
    .line 498
    goto/16 :goto_7

    .line 499
    .line 500
    :cond_9
    iget-boolean v10, v9, LT5/l;->a:Z

    .line 501
    .line 502
    if-nez v10, :cond_a

    .line 503
    .line 504
    goto/16 :goto_5

    .line 505
    .line 506
    :cond_a
    iget-object v10, v7, LT5/l;->p:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v10, Lu6/n;

    .line 509
    .line 510
    invoke-static {v10}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    iget-object v12, v9, LT5/l;->p:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v12, Lu6/n;

    .line 516
    .line 517
    invoke-static {v12}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    iget v13, v7, LT5/l;->e:I

    .line 521
    .line 522
    iget v14, v9, LT5/l;->e:I

    .line 523
    .line 524
    if-ne v13, v14, :cond_f

    .line 525
    .line 526
    iget v13, v7, LT5/l;->f:I

    .line 527
    .line 528
    iget v14, v9, LT5/l;->f:I

    .line 529
    .line 530
    if-ne v13, v14, :cond_f

    .line 531
    .line 532
    iget-boolean v13, v7, LT5/l;->g:Z

    .line 533
    .line 534
    iget-boolean v14, v9, LT5/l;->g:Z

    .line 535
    .line 536
    if-ne v13, v14, :cond_f

    .line 537
    .line 538
    iget-boolean v13, v7, LT5/l;->h:Z

    .line 539
    .line 540
    if-eqz v13, :cond_b

    .line 541
    .line 542
    iget-boolean v13, v9, LT5/l;->h:Z

    .line 543
    .line 544
    if-eqz v13, :cond_b

    .line 545
    .line 546
    iget-boolean v13, v7, LT5/l;->i:Z

    .line 547
    .line 548
    iget-boolean v14, v9, LT5/l;->i:Z

    .line 549
    .line 550
    if-ne v13, v14, :cond_f

    .line 551
    .line 552
    :cond_b
    iget v13, v7, LT5/l;->c:I

    .line 553
    .line 554
    iget v14, v9, LT5/l;->c:I

    .line 555
    .line 556
    if-eq v13, v14, :cond_c

    .line 557
    .line 558
    if-eqz v13, :cond_f

    .line 559
    .line 560
    if-eqz v14, :cond_f

    .line 561
    .line 562
    :cond_c
    iget v12, v12, Lu6/n;->k:I

    .line 563
    .line 564
    iget v10, v10, Lu6/n;->k:I

    .line 565
    .line 566
    if-nez v10, :cond_d

    .line 567
    .line 568
    if-nez v12, :cond_d

    .line 569
    .line 570
    iget v13, v7, LT5/l;->l:I

    .line 571
    .line 572
    iget v14, v9, LT5/l;->l:I

    .line 573
    .line 574
    if-ne v13, v14, :cond_f

    .line 575
    .line 576
    iget v13, v7, LT5/l;->m:I

    .line 577
    .line 578
    iget v14, v9, LT5/l;->m:I

    .line 579
    .line 580
    if-ne v13, v14, :cond_f

    .line 581
    .line 582
    :cond_d
    const/4 v15, 0x1

    .line 583
    if-ne v10, v15, :cond_e

    .line 584
    .line 585
    if-ne v12, v15, :cond_e

    .line 586
    .line 587
    iget v10, v7, LT5/l;->n:I

    .line 588
    .line 589
    iget v12, v9, LT5/l;->n:I

    .line 590
    .line 591
    if-ne v10, v12, :cond_f

    .line 592
    .line 593
    iget v10, v7, LT5/l;->o:I

    .line 594
    .line 595
    iget v12, v9, LT5/l;->o:I

    .line 596
    .line 597
    if-ne v10, v12, :cond_f

    .line 598
    .line 599
    :cond_e
    iget-boolean v10, v7, LT5/l;->j:Z

    .line 600
    .line 601
    iget-boolean v12, v9, LT5/l;->j:Z

    .line 602
    .line 603
    if-ne v10, v12, :cond_f

    .line 604
    .line 605
    if-eqz v10, :cond_12

    .line 606
    .line 607
    iget v7, v7, LT5/l;->k:I

    .line 608
    .line 609
    iget v9, v9, LT5/l;->k:I

    .line 610
    .line 611
    if-eq v7, v9, :cond_12

    .line 612
    .line 613
    :cond_f
    :goto_5
    if-eqz v3, :cond_11

    .line 614
    .line 615
    iget-boolean v3, v2, LT5/m;->o:Z

    .line 616
    .line 617
    if-eqz v3, :cond_11

    .line 618
    .line 619
    iget-wide v9, v2, LT5/m;->j:J

    .line 620
    .line 621
    sub-long v13, v24, v9

    .line 622
    .line 623
    long-to-int v3, v13

    .line 624
    add-int v31, v20, v3

    .line 625
    .line 626
    iget-wide v12, v2, LT5/m;->q:J

    .line 627
    .line 628
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    cmp-long v3, v12, v18

    .line 634
    .line 635
    if-nez v3, :cond_10

    .line 636
    .line 637
    goto :goto_6

    .line 638
    :cond_10
    iget-boolean v3, v2, LT5/m;->r:Z

    .line 639
    .line 640
    iget-wide v6, v2, LT5/m;->p:J

    .line 641
    .line 642
    sub-long/2addr v9, v6

    .line 643
    long-to-int v6, v9

    .line 644
    iget-object v7, v2, LT5/m;->a:LJ5/w;

    .line 645
    .line 646
    const/16 v32, 0x0

    .line 647
    .line 648
    move/from16 v29, v3

    .line 649
    .line 650
    move/from16 v30, v6

    .line 651
    .line 652
    move-object/from16 v26, v7

    .line 653
    .line 654
    move-wide/from16 v27, v12

    .line 655
    .line 656
    invoke-interface/range {v26 .. v32}, LJ5/w;->b(JIIILJ5/v;)V

    .line 657
    .line 658
    .line 659
    :cond_11
    :goto_6
    iget-wide v6, v2, LT5/m;->j:J

    .line 660
    .line 661
    iput-wide v6, v2, LT5/m;->p:J

    .line 662
    .line 663
    iget-wide v6, v2, LT5/m;->l:J

    .line 664
    .line 665
    iput-wide v6, v2, LT5/m;->q:J

    .line 666
    .line 667
    move/from16 v3, v17

    .line 668
    .line 669
    iput-boolean v3, v2, LT5/m;->r:Z

    .line 670
    .line 671
    const/4 v15, 0x1

    .line 672
    iput-boolean v15, v2, LT5/m;->o:Z

    .line 673
    .line 674
    :cond_12
    :goto_7
    iget-boolean v3, v2, LT5/m;->b:Z

    .line 675
    .line 676
    if-eqz v3, :cond_16

    .line 677
    .line 678
    iget-object v3, v2, LT5/m;->n:LT5/l;

    .line 679
    .line 680
    iget-boolean v6, v3, LT5/l;->b:Z

    .line 681
    .line 682
    if-eqz v6, :cond_14

    .line 683
    .line 684
    iget v3, v3, LT5/l;->d:I

    .line 685
    .line 686
    const/4 v10, 0x7

    .line 687
    if-eq v3, v10, :cond_13

    .line 688
    .line 689
    move/from16 v7, p1

    .line 690
    .line 691
    if-ne v3, v7, :cond_15

    .line 692
    .line 693
    :cond_13
    const/4 v3, 0x1

    .line 694
    goto :goto_8

    .line 695
    :cond_14
    const/4 v10, 0x7

    .line 696
    :cond_15
    const/4 v3, 0x0

    .line 697
    :goto_8
    move v8, v3

    .line 698
    goto :goto_9

    .line 699
    :cond_16
    const/4 v10, 0x7

    .line 700
    :goto_9
    iget-boolean v3, v2, LT5/m;->r:Z

    .line 701
    .line 702
    iget v6, v2, LT5/m;->i:I

    .line 703
    .line 704
    const/4 v9, 0x5

    .line 705
    if-eq v6, v9, :cond_18

    .line 706
    .line 707
    if-eqz v8, :cond_17

    .line 708
    .line 709
    const/4 v15, 0x1

    .line 710
    if-ne v6, v15, :cond_17

    .line 711
    .line 712
    goto :goto_a

    .line 713
    :cond_17
    const/4 v6, 0x0

    .line 714
    goto :goto_b

    .line 715
    :cond_18
    :goto_a
    const/4 v6, 0x1

    .line 716
    :goto_b
    or-int/2addr v3, v6

    .line 717
    iput-boolean v3, v2, LT5/m;->r:Z

    .line 718
    .line 719
    if-eqz v3, :cond_19

    .line 720
    .line 721
    const/4 v3, 0x0

    .line 722
    iput-boolean v3, v0, LT5/n;->i:Z

    .line 723
    .line 724
    :cond_19
    iget-wide v2, v0, LT5/n;->h:J

    .line 725
    .line 726
    iget-boolean v6, v0, LT5/n;->g:Z

    .line 727
    .line 728
    if-eqz v6, :cond_1a

    .line 729
    .line 730
    iget-object v6, v0, LT5/n;->o:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v6, LT5/m;

    .line 733
    .line 734
    iget-boolean v6, v6, LT5/m;->c:Z

    .line 735
    .line 736
    if-eqz v6, :cond_1b

    .line 737
    .line 738
    :cond_1a
    invoke-virtual {v5, v11}, LT5/s;->e(I)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v4, v11}, LT5/s;->e(I)V

    .line 742
    .line 743
    .line 744
    :cond_1b
    invoke-virtual {v1, v11}, LT5/s;->e(I)V

    .line 745
    .line 746
    .line 747
    iget-object v1, v0, LT5/n;->o:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v1, LT5/m;

    .line 750
    .line 751
    iput v11, v1, LT5/m;->i:I

    .line 752
    .line 753
    iput-wide v2, v1, LT5/m;->l:J

    .line 754
    .line 755
    move-wide/from16 v13, v24

    .line 756
    .line 757
    iput-wide v13, v1, LT5/m;->j:J

    .line 758
    .line 759
    iget-boolean v2, v1, LT5/m;->b:Z

    .line 760
    .line 761
    const/4 v15, 0x1

    .line 762
    if-eqz v2, :cond_1d

    .line 763
    .line 764
    if-eq v11, v15, :cond_1c

    .line 765
    .line 766
    goto :goto_c

    .line 767
    :cond_1c
    const/4 v7, 0x2

    .line 768
    goto :goto_e

    .line 769
    :cond_1d
    :goto_c
    iget-boolean v2, v1, LT5/m;->c:Z

    .line 770
    .line 771
    if-eqz v2, :cond_1f

    .line 772
    .line 773
    if-eq v11, v9, :cond_1c

    .line 774
    .line 775
    if-eq v11, v15, :cond_1c

    .line 776
    .line 777
    const/4 v7, 0x2

    .line 778
    if-ne v11, v7, :cond_1e

    .line 779
    .line 780
    goto :goto_e

    .line 781
    :cond_1e
    const/4 v15, 0x1

    .line 782
    :goto_d
    const/4 v3, 0x0

    .line 783
    goto :goto_f

    .line 784
    :goto_e
    iget-object v2, v1, LT5/m;->m:LT5/l;

    .line 785
    .line 786
    iget-object v3, v1, LT5/m;->n:LT5/l;

    .line 787
    .line 788
    iput-object v3, v1, LT5/m;->m:LT5/l;

    .line 789
    .line 790
    iput-object v2, v1, LT5/m;->n:LT5/l;

    .line 791
    .line 792
    const/4 v3, 0x0

    .line 793
    iput-boolean v3, v2, LT5/l;->b:Z

    .line 794
    .line 795
    iput-boolean v3, v2, LT5/l;->a:Z

    .line 796
    .line 797
    iput v3, v1, LT5/m;->h:I

    .line 798
    .line 799
    const/4 v15, 0x1

    .line 800
    iput-boolean v15, v1, LT5/m;->k:Z

    .line 801
    .line 802
    goto :goto_f

    .line 803
    :cond_1f
    const/4 v7, 0x2

    .line 804
    goto :goto_d

    .line 805
    :goto_f
    move/from16 v8, v21

    .line 806
    .line 807
    move-object/from16 v9, v22

    .line 808
    .line 809
    move/from16 v7, v23

    .line 810
    .line 811
    const/4 v6, 0x3

    .line 812
    goto/16 :goto_0
.end method

.method public final d(IJ)V
    .locals 2

    .line 1
    iget v0, p0, LT5/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, LT5/n;->h:J

    .line 7
    .line 8
    iget-boolean p2, p0, LT5/n;->i:Z

    .line 9
    .line 10
    and-int/lit8 p1, p1, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    or-int/2addr p1, p2

    .line 18
    iput-boolean p1, p0, LT5/n;->i:Z

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v0, p2, v0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iput-wide p2, p0, LT5/n;->h:J

    .line 31
    .line 32
    :cond_1
    iget-boolean p2, p0, LT5/n;->i:Z

    .line 33
    .line 34
    and-int/lit8 p1, p1, 0x2

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    :goto_1
    or-int/2addr p1, p2

    .line 42
    iput-boolean p1, p0, LT5/n;->i:Z

    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(LQ1/o;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    iget-object v3, v0, LT5/n;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, Ls2/C;

    .line 9
    .line 10
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget v3, LQ1/x;->a:I

    .line 14
    .line 15
    iget v3, v1, LQ1/o;->b:I

    .line 16
    .line 17
    iget v4, v1, LQ1/o;->c:I

    .line 18
    .line 19
    iget-object v5, v1, LQ1/o;->a:[B

    .line 20
    .line 21
    iget-wide v6, v0, LT5/n;->d:J

    .line 22
    .line 23
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    int-to-long v8, v8

    .line 28
    add-long/2addr v6, v8

    .line 29
    iput-wide v6, v0, LT5/n;->d:J

    .line 30
    .line 31
    iget-object v6, v0, LT5/n;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v6, Ls2/C;

    .line 34
    .line 35
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-interface {v6, v7, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, v0, LT5/n;->e:[Z

    .line 43
    .line 44
    invoke-static {v5, v3, v4, v1}, LR1/n;->b([BII[Z)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-ne v1, v4, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, v3, v4, v5}, LT5/n;->b(II[B)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    add-int/lit8 v6, v1, 0x3

    .line 55
    .line 56
    aget-byte v7, v5, v6

    .line 57
    .line 58
    and-int/lit8 v7, v7, 0x1f

    .line 59
    .line 60
    sub-int v8, v1, v3

    .line 61
    .line 62
    if-lez v8, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0, v3, v1, v5}, LT5/n;->b(II[B)V

    .line 65
    .line 66
    .line 67
    :cond_1
    sub-int v1, v4, v1

    .line 68
    .line 69
    iget-wide v9, v0, LT5/n;->d:J

    .line 70
    .line 71
    int-to-long v11, v1

    .line 72
    sub-long/2addr v9, v11

    .line 73
    if-gez v8, :cond_2

    .line 74
    .line 75
    neg-int v8, v8

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 v8, 0x0

    .line 78
    :goto_1
    iget-wide v11, v0, LT5/n;->h:J

    .line 79
    .line 80
    iget-boolean v13, v0, LT5/n;->g:Z

    .line 81
    .line 82
    iget-object v14, v0, LT5/n;->j:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v14, Lb7/k;

    .line 85
    .line 86
    iget-object v3, v0, LT5/n;->l:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, LT5/s;

    .line 89
    .line 90
    iget-object v15, v0, LT5/n;->k:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v15, LT5/s;

    .line 93
    .line 94
    iget-object v14, v14, Lb7/k;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v14, LR1/q;

    .line 97
    .line 98
    if-eqz v13, :cond_4

    .line 99
    .line 100
    iget-object v13, v0, LT5/n;->o:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v13, LY2/m;

    .line 103
    .line 104
    iget-boolean v13, v13, LY2/m;->c:Z

    .line 105
    .line 106
    if-eqz v13, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    move/from16 v16, v1

    .line 110
    .line 111
    move/from16 v17, v4

    .line 112
    .line 113
    move-object/from16 v18, v5

    .line 114
    .line 115
    move/from16 v19, v6

    .line 116
    .line 117
    move-wide/from16 v20, v9

    .line 118
    .line 119
    move v9, v2

    .line 120
    goto/16 :goto_6

    .line 121
    .line 122
    :cond_4
    :goto_2
    invoke-virtual {v15, v8}, LT5/s;->b(I)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v8}, LT5/s;->b(I)Z

    .line 126
    .line 127
    .line 128
    iget-boolean v13, v0, LT5/n;->g:Z

    .line 129
    .line 130
    if-nez v13, :cond_7

    .line 131
    .line 132
    iget-boolean v13, v15, LT5/s;->d:Z

    .line 133
    .line 134
    if-eqz v13, :cond_3

    .line 135
    .line 136
    iget-boolean v13, v3, LT5/s;->d:Z

    .line 137
    .line 138
    if-eqz v13, :cond_3

    .line 139
    .line 140
    new-instance v13, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v2, v15, LT5/s;->e:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, [B

    .line 148
    .line 149
    move/from16 v16, v1

    .line 150
    .line 151
    iget v1, v15, LT5/s;->f:I

    .line 152
    .line 153
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    iget-object v1, v3, LT5/s;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, [B

    .line 163
    .line 164
    iget v2, v3, LT5/s;->f:I

    .line 165
    .line 166
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    iget-object v1, v15, LT5/s;->e:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v1, [B

    .line 176
    .line 177
    iget v2, v15, LT5/s;->f:I

    .line 178
    .line 179
    move/from16 v17, v4

    .line 180
    .line 181
    const/4 v4, 0x3

    .line 182
    invoke-static {v4, v2, v1}, LR1/n;->i(II[B)LR1/m;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iget-object v2, v3, LT5/s;->e:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v2, [B

    .line 189
    .line 190
    iget v4, v3, LT5/s;->f:I

    .line 191
    .line 192
    move-object/from16 v18, v5

    .line 193
    .line 194
    new-instance v5, LJ5/y;

    .line 195
    .line 196
    move/from16 v19, v6

    .line 197
    .line 198
    move-wide/from16 v20, v9

    .line 199
    .line 200
    const/4 v6, 0x4

    .line 201
    const/4 v9, 0x3

    .line 202
    invoke-direct {v5, v6, v2, v4, v9}, LJ5/y;-><init>(I[BII)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, LJ5/y;->m()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-virtual {v5}, LJ5/y;->m()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    invoke-virtual {v5}, LJ5/y;->s()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5}, LJ5/y;->h()Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    new-instance v6, LR1/l;

    .line 221
    .line 222
    invoke-direct {v6, v2, v4, v5}, LR1/l;-><init>(IIZ)V

    .line 223
    .line 224
    .line 225
    iget v4, v1, LR1/m;->a:I

    .line 226
    .line 227
    iget v5, v1, LR1/m;->b:I

    .line 228
    .line 229
    iget v9, v1, LR1/m;->c:I

    .line 230
    .line 231
    invoke-static {v4, v5, v9}, LQ1/a;->a(III)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    iget-object v5, v0, LT5/n;->n:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v5, Ls2/C;

    .line 238
    .line 239
    new-instance v9, LN1/m;

    .line 240
    .line 241
    invoke-direct {v9}, LN1/m;-><init>()V

    .line 242
    .line 243
    .line 244
    iget-object v10, v0, LT5/n;->f:Ljava/lang/String;

    .line 245
    .line 246
    iput-object v10, v9, LN1/m;->a:Ljava/lang/String;

    .line 247
    .line 248
    const-string v10, "video/avc"

    .line 249
    .line 250
    invoke-static {v10}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    iput-object v10, v9, LN1/m;->m:Ljava/lang/String;

    .line 255
    .line 256
    iput-object v4, v9, LN1/m;->j:Ljava/lang/String;

    .line 257
    .line 258
    iget v4, v1, LR1/m;->e:I

    .line 259
    .line 260
    iput v4, v9, LN1/m;->t:I

    .line 261
    .line 262
    iget v4, v1, LR1/m;->f:I

    .line 263
    .line 264
    iput v4, v9, LN1/m;->u:I

    .line 265
    .line 266
    iget v4, v1, LR1/m;->h:I

    .line 267
    .line 268
    add-int/lit8 v26, v4, 0x8

    .line 269
    .line 270
    iget v4, v1, LR1/m;->i:I

    .line 271
    .line 272
    add-int/lit8 v27, v4, 0x8

    .line 273
    .line 274
    new-instance v22, LN1/f;

    .line 275
    .line 276
    iget v4, v1, LR1/m;->p:I

    .line 277
    .line 278
    iget v10, v1, LR1/m;->q:I

    .line 279
    .line 280
    move/from16 v23, v4

    .line 281
    .line 282
    iget v4, v1, LR1/m;->r:I

    .line 283
    .line 284
    const/16 v28, 0x0

    .line 285
    .line 286
    move/from16 v25, v4

    .line 287
    .line 288
    move/from16 v24, v10

    .line 289
    .line 290
    invoke-direct/range {v22 .. v28}, LN1/f;-><init>(IIIII[B)V

    .line 291
    .line 292
    .line 293
    move-object/from16 v4, v22

    .line 294
    .line 295
    iput-object v4, v9, LN1/m;->A:LN1/f;

    .line 296
    .line 297
    iget v4, v1, LR1/m;->g:F

    .line 298
    .line 299
    iput v4, v9, LN1/m;->x:F

    .line 300
    .line 301
    iput-object v13, v9, LN1/m;->p:Ljava/util/List;

    .line 302
    .line 303
    iget v4, v1, LR1/m;->s:I

    .line 304
    .line 305
    iput v4, v9, LN1/m;->o:I

    .line 306
    .line 307
    invoke-static {v9, v5}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 308
    .line 309
    .line 310
    const/4 v5, 0x1

    .line 311
    iput-boolean v5, v0, LT5/n;->g:Z

    .line 312
    .line 313
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    if-ltz v4, :cond_5

    .line 317
    .line 318
    const/4 v5, 0x1

    .line 319
    goto :goto_3

    .line 320
    :cond_5
    const/4 v5, 0x0

    .line 321
    :goto_3
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 322
    .line 323
    .line 324
    iput v4, v14, LR1/q;->a:I

    .line 325
    .line 326
    invoke-virtual {v14, v4}, LR1/q;->p(I)V

    .line 327
    .line 328
    .line 329
    iget-object v4, v0, LT5/n;->o:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v4, LY2/m;

    .line 332
    .line 333
    iget-object v4, v4, LY2/m;->d:Landroid/util/SparseArray;

    .line 334
    .line 335
    iget v5, v1, LR1/m;->d:I

    .line 336
    .line 337
    invoke-virtual {v4, v5, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    iget-object v1, v0, LT5/n;->o:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v1, LY2/m;

    .line 343
    .line 344
    iget-object v1, v1, LY2/m;->e:Landroid/util/SparseArray;

    .line 345
    .line 346
    invoke-virtual {v1, v2, v6}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v15}, LT5/s;->d()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3}, LT5/s;->d()V

    .line 353
    .line 354
    .line 355
    :cond_6
    :goto_4
    const/4 v9, 0x3

    .line 356
    goto :goto_6

    .line 357
    :cond_7
    move/from16 v16, v1

    .line 358
    .line 359
    move/from16 v17, v4

    .line 360
    .line 361
    move-object/from16 v18, v5

    .line 362
    .line 363
    move/from16 v19, v6

    .line 364
    .line 365
    move-wide/from16 v20, v9

    .line 366
    .line 367
    iget-boolean v1, v15, LT5/s;->d:Z

    .line 368
    .line 369
    if-eqz v1, :cond_9

    .line 370
    .line 371
    iget-object v1, v15, LT5/s;->e:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v1, [B

    .line 374
    .line 375
    iget v2, v15, LT5/s;->f:I

    .line 376
    .line 377
    const/4 v4, 0x3

    .line 378
    invoke-static {v4, v2, v1}, LR1/n;->i(II[B)LR1/m;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iget v2, v1, LR1/m;->s:I

    .line 386
    .line 387
    if-ltz v2, :cond_8

    .line 388
    .line 389
    const/4 v4, 0x1

    .line 390
    goto :goto_5

    .line 391
    :cond_8
    const/4 v4, 0x0

    .line 392
    :goto_5
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 393
    .line 394
    .line 395
    iput v2, v14, LR1/q;->a:I

    .line 396
    .line 397
    invoke-virtual {v14, v2}, LR1/q;->p(I)V

    .line 398
    .line 399
    .line 400
    iget-object v2, v0, LT5/n;->o:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v2, LY2/m;

    .line 403
    .line 404
    iget-object v2, v2, LY2/m;->d:Landroid/util/SparseArray;

    .line 405
    .line 406
    iget v4, v1, LR1/m;->d:I

    .line 407
    .line 408
    invoke-virtual {v2, v4, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v15}, LT5/s;->d()V

    .line 412
    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_9
    iget-boolean v1, v3, LT5/s;->d:Z

    .line 416
    .line 417
    if-eqz v1, :cond_6

    .line 418
    .line 419
    iget-object v1, v3, LT5/s;->e:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v1, [B

    .line 422
    .line 423
    iget v2, v3, LT5/s;->f:I

    .line 424
    .line 425
    new-instance v4, LJ5/y;

    .line 426
    .line 427
    const/4 v6, 0x4

    .line 428
    const/4 v9, 0x3

    .line 429
    invoke-direct {v4, v6, v1, v2, v9}, LJ5/y;-><init>(I[BII)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4}, LJ5/y;->m()I

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    invoke-virtual {v4}, LJ5/y;->m()I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    invoke-virtual {v4}, LJ5/y;->s()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v4}, LJ5/y;->h()Z

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    new-instance v5, LR1/l;

    .line 448
    .line 449
    invoke-direct {v5, v1, v2, v4}, LR1/l;-><init>(IIZ)V

    .line 450
    .line 451
    .line 452
    iget-object v2, v0, LT5/n;->o:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v2, LY2/m;

    .line 455
    .line 456
    iget-object v2, v2, LY2/m;->e:Landroid/util/SparseArray;

    .line 457
    .line 458
    invoke-virtual {v2, v1, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3}, LT5/s;->d()V

    .line 462
    .line 463
    .line 464
    :goto_6
    iget-object v1, v0, LT5/n;->m:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, LT5/s;

    .line 467
    .line 468
    invoke-virtual {v1, v8}, LT5/s;->b(I)Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    if-eqz v2, :cond_a

    .line 473
    .line 474
    iget-object v2, v1, LT5/s;->e:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v2, [B

    .line 477
    .line 478
    iget v4, v1, LT5/s;->f:I

    .line 479
    .line 480
    invoke-static {v4, v2}, LR1/n;->k(I[B)I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    iget-object v4, v1, LT5/s;->e:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v4, [B

    .line 487
    .line 488
    iget-object v5, v0, LT5/n;->p:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v5, LQ1/o;

    .line 491
    .line 492
    invoke-virtual {v5, v2, v4}, LQ1/o;->E(I[B)V

    .line 493
    .line 494
    .line 495
    const/4 v6, 0x4

    .line 496
    invoke-virtual {v5, v6}, LQ1/o;->G(I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v14, v11, v12, v5}, LR1/q;->m(JLQ1/o;)V

    .line 500
    .line 501
    .line 502
    :cond_a
    iget-object v2, v0, LT5/n;->o:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v2, LY2/m;

    .line 505
    .line 506
    iget-boolean v4, v0, LT5/n;->g:Z

    .line 507
    .line 508
    iget v5, v2, LY2/m;->i:I

    .line 509
    .line 510
    const/16 v6, 0x9

    .line 511
    .line 512
    if-eq v5, v6, :cond_12

    .line 513
    .line 514
    iget-boolean v5, v2, LY2/m;->c:Z

    .line 515
    .line 516
    if-eqz v5, :cond_11

    .line 517
    .line 518
    iget-object v5, v2, LY2/m;->n:LT5/l;

    .line 519
    .line 520
    iget-object v6, v2, LY2/m;->m:LT5/l;

    .line 521
    .line 522
    iget-boolean v8, v5, LT5/l;->a:Z

    .line 523
    .line 524
    if-nez v8, :cond_b

    .line 525
    .line 526
    goto/16 :goto_7

    .line 527
    .line 528
    :cond_b
    iget-boolean v8, v6, LT5/l;->a:Z

    .line 529
    .line 530
    if-nez v8, :cond_c

    .line 531
    .line 532
    goto/16 :goto_8

    .line 533
    .line 534
    :cond_c
    iget-object v8, v5, LT5/l;->p:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v8, LR1/m;

    .line 537
    .line 538
    invoke-static {v8}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    iget-object v10, v6, LT5/l;->p:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v10, LR1/m;

    .line 544
    .line 545
    invoke-static {v10}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    iget v11, v5, LT5/l;->e:I

    .line 549
    .line 550
    iget v12, v6, LT5/l;->e:I

    .line 551
    .line 552
    if-ne v11, v12, :cond_12

    .line 553
    .line 554
    iget v11, v5, LT5/l;->f:I

    .line 555
    .line 556
    iget v12, v6, LT5/l;->f:I

    .line 557
    .line 558
    if-ne v11, v12, :cond_12

    .line 559
    .line 560
    iget-boolean v11, v5, LT5/l;->g:Z

    .line 561
    .line 562
    iget-boolean v12, v6, LT5/l;->g:Z

    .line 563
    .line 564
    if-ne v11, v12, :cond_12

    .line 565
    .line 566
    iget-boolean v11, v5, LT5/l;->h:Z

    .line 567
    .line 568
    if-eqz v11, :cond_d

    .line 569
    .line 570
    iget-boolean v11, v6, LT5/l;->h:Z

    .line 571
    .line 572
    if-eqz v11, :cond_d

    .line 573
    .line 574
    iget-boolean v11, v5, LT5/l;->i:Z

    .line 575
    .line 576
    iget-boolean v12, v6, LT5/l;->i:Z

    .line 577
    .line 578
    if-ne v11, v12, :cond_12

    .line 579
    .line 580
    :cond_d
    iget v11, v5, LT5/l;->c:I

    .line 581
    .line 582
    iget v12, v6, LT5/l;->c:I

    .line 583
    .line 584
    if-eq v11, v12, :cond_e

    .line 585
    .line 586
    if-eqz v11, :cond_12

    .line 587
    .line 588
    if-eqz v12, :cond_12

    .line 589
    .line 590
    :cond_e
    iget v10, v10, LR1/m;->m:I

    .line 591
    .line 592
    iget v8, v8, LR1/m;->m:I

    .line 593
    .line 594
    if-nez v8, :cond_f

    .line 595
    .line 596
    if-nez v10, :cond_f

    .line 597
    .line 598
    iget v11, v5, LT5/l;->l:I

    .line 599
    .line 600
    iget v12, v6, LT5/l;->l:I

    .line 601
    .line 602
    if-ne v11, v12, :cond_12

    .line 603
    .line 604
    iget v11, v5, LT5/l;->m:I

    .line 605
    .line 606
    iget v12, v6, LT5/l;->m:I

    .line 607
    .line 608
    if-ne v11, v12, :cond_12

    .line 609
    .line 610
    :cond_f
    const/4 v11, 0x1

    .line 611
    if-ne v8, v11, :cond_10

    .line 612
    .line 613
    if-ne v10, v11, :cond_10

    .line 614
    .line 615
    iget v8, v5, LT5/l;->n:I

    .line 616
    .line 617
    iget v10, v6, LT5/l;->n:I

    .line 618
    .line 619
    if-ne v8, v10, :cond_12

    .line 620
    .line 621
    iget v8, v5, LT5/l;->o:I

    .line 622
    .line 623
    iget v10, v6, LT5/l;->o:I

    .line 624
    .line 625
    if-ne v8, v10, :cond_12

    .line 626
    .line 627
    :cond_10
    iget-boolean v8, v5, LT5/l;->j:Z

    .line 628
    .line 629
    iget-boolean v10, v6, LT5/l;->j:Z

    .line 630
    .line 631
    if-ne v8, v10, :cond_12

    .line 632
    .line 633
    if-eqz v8, :cond_11

    .line 634
    .line 635
    iget v5, v5, LT5/l;->k:I

    .line 636
    .line 637
    iget v6, v6, LT5/l;->k:I

    .line 638
    .line 639
    if-eq v5, v6, :cond_11

    .line 640
    .line 641
    goto :goto_8

    .line 642
    :cond_11
    :goto_7
    const/4 v4, 0x0

    .line 643
    goto :goto_a

    .line 644
    :cond_12
    :goto_8
    if-eqz v4, :cond_14

    .line 645
    .line 646
    iget-boolean v4, v2, LY2/m;->o:Z

    .line 647
    .line 648
    if-eqz v4, :cond_14

    .line 649
    .line 650
    iget-wide v4, v2, LY2/m;->j:J

    .line 651
    .line 652
    sub-long v10, v20, v4

    .line 653
    .line 654
    long-to-int v6, v10

    .line 655
    add-int v27, v16, v6

    .line 656
    .line 657
    iget-wide v10, v2, LY2/m;->q:J

    .line 658
    .line 659
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    cmp-long v6, v10, v12

    .line 665
    .line 666
    if-nez v6, :cond_13

    .line 667
    .line 668
    goto :goto_9

    .line 669
    :cond_13
    iget-boolean v6, v2, LY2/m;->r:Z

    .line 670
    .line 671
    iget-wide v12, v2, LY2/m;->p:J

    .line 672
    .line 673
    sub-long/2addr v4, v12

    .line 674
    long-to-int v4, v4

    .line 675
    iget-object v5, v2, LY2/m;->a:Ls2/C;

    .line 676
    .line 677
    const/16 v28, 0x0

    .line 678
    .line 679
    move/from16 v26, v4

    .line 680
    .line 681
    move-object/from16 v22, v5

    .line 682
    .line 683
    move/from16 v25, v6

    .line 684
    .line 685
    move-wide/from16 v23, v10

    .line 686
    .line 687
    invoke-interface/range {v22 .. v28}, Ls2/C;->a(JIIILs2/B;)V

    .line 688
    .line 689
    .line 690
    :cond_14
    :goto_9
    iget-wide v4, v2, LY2/m;->j:J

    .line 691
    .line 692
    iput-wide v4, v2, LY2/m;->p:J

    .line 693
    .line 694
    iget-wide v4, v2, LY2/m;->l:J

    .line 695
    .line 696
    iput-wide v4, v2, LY2/m;->q:J

    .line 697
    .line 698
    const/4 v4, 0x0

    .line 699
    iput-boolean v4, v2, LY2/m;->r:Z

    .line 700
    .line 701
    const/4 v5, 0x1

    .line 702
    iput-boolean v5, v2, LY2/m;->o:Z

    .line 703
    .line 704
    :goto_a
    invoke-virtual {v2}, LY2/m;->a()V

    .line 705
    .line 706
    .line 707
    iget-boolean v2, v2, LY2/m;->r:Z

    .line 708
    .line 709
    if-eqz v2, :cond_15

    .line 710
    .line 711
    iput-boolean v4, v0, LT5/n;->i:Z

    .line 712
    .line 713
    :cond_15
    iget-wide v4, v0, LT5/n;->h:J

    .line 714
    .line 715
    iget-boolean v2, v0, LT5/n;->g:Z

    .line 716
    .line 717
    if-eqz v2, :cond_16

    .line 718
    .line 719
    iget-object v2, v0, LT5/n;->o:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v2, LY2/m;

    .line 722
    .line 723
    iget-boolean v2, v2, LY2/m;->c:Z

    .line 724
    .line 725
    if-eqz v2, :cond_17

    .line 726
    .line 727
    :cond_16
    invoke-virtual {v15, v7}, LT5/s;->e(I)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3, v7}, LT5/s;->e(I)V

    .line 731
    .line 732
    .line 733
    :cond_17
    invoke-virtual {v1, v7}, LT5/s;->e(I)V

    .line 734
    .line 735
    .line 736
    iget-object v1, v0, LT5/n;->o:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v1, LY2/m;

    .line 739
    .line 740
    iget-boolean v2, v0, LT5/n;->i:Z

    .line 741
    .line 742
    iput v7, v1, LY2/m;->i:I

    .line 743
    .line 744
    iput-wide v4, v1, LY2/m;->l:J

    .line 745
    .line 746
    move-wide/from16 v3, v20

    .line 747
    .line 748
    iput-wide v3, v1, LY2/m;->j:J

    .line 749
    .line 750
    iput-boolean v2, v1, LY2/m;->s:Z

    .line 751
    .line 752
    iget-boolean v2, v1, LY2/m;->b:Z

    .line 753
    .line 754
    const/4 v5, 0x1

    .line 755
    if-eqz v2, :cond_18

    .line 756
    .line 757
    if-eq v7, v5, :cond_19

    .line 758
    .line 759
    :cond_18
    iget-boolean v2, v1, LY2/m;->c:Z

    .line 760
    .line 761
    if-eqz v2, :cond_1a

    .line 762
    .line 763
    const/4 v2, 0x5

    .line 764
    if-eq v7, v2, :cond_19

    .line 765
    .line 766
    if-eq v7, v5, :cond_19

    .line 767
    .line 768
    const/4 v2, 0x2

    .line 769
    if-ne v7, v2, :cond_1a

    .line 770
    .line 771
    :cond_19
    iget-object v2, v1, LY2/m;->m:LT5/l;

    .line 772
    .line 773
    iget-object v3, v1, LY2/m;->n:LT5/l;

    .line 774
    .line 775
    iput-object v3, v1, LY2/m;->m:LT5/l;

    .line 776
    .line 777
    iput-object v2, v1, LY2/m;->n:LT5/l;

    .line 778
    .line 779
    const/4 v4, 0x0

    .line 780
    iput-boolean v4, v2, LT5/l;->b:Z

    .line 781
    .line 782
    iput-boolean v4, v2, LT5/l;->a:Z

    .line 783
    .line 784
    iput v4, v1, LY2/m;->h:I

    .line 785
    .line 786
    const/4 v5, 0x1

    .line 787
    iput-boolean v5, v1, LY2/m;->k:Z

    .line 788
    .line 789
    :cond_1a
    move v2, v9

    .line 790
    move/from16 v4, v17

    .line 791
    .line 792
    move-object/from16 v5, v18

    .line 793
    .line 794
    move/from16 v3, v19

    .line 795
    .line 796
    goto/16 :goto_0
.end method

.method public f(Ls2/o;LT5/B;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, LT5/B;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LT5/B;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LT5/n;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LT5/n;->n:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, LY2/m;

    .line 24
    .line 25
    iget-boolean v2, p0, LT5/n;->b:Z

    .line 26
    .line 27
    iget-boolean v3, p0, LT5/n;->c:Z

    .line 28
    .line 29
    invoke-direct {v1, v0, v2, v3}, LY2/m;-><init>(Ls2/C;ZZ)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LT5/n;->o:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v0, p0, LT5/n;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lb7/k;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Lb7/k;->q(Ls2/o;LT5/B;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public g(LJ5/m;LT5/B;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, LT5/B;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LT5/B;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LT5/n;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, LJ5/m;->m(II)LJ5/w;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LT5/n;->n:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, LT5/m;

    .line 24
    .line 25
    iget-boolean v2, p0, LT5/n;->b:Z

    .line 26
    .line 27
    iget-boolean v3, p0, LT5/n;->c:Z

    .line 28
    .line 29
    invoke-direct {v1, v0, v2, v3}, LT5/m;-><init>(LJ5/w;ZZ)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LT5/n;->o:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v0, p0, LT5/n;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LS3/s;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, LS3/s;->k(LJ5/m;LT5/B;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public h(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, LT5/n;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls2/C;

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v0, LQ1/x;->a:I

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, LT5/n;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lb7/k;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iget-object p1, p1, Lb7/k;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, LR1/q;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, LR1/q;->p(I)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LT5/n;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, LY2/m;

    .line 27
    .line 28
    iget-wide v0, p0, LT5/n;->d:J

    .line 29
    .line 30
    invoke-virtual {p1}, LY2/m;->a()V

    .line 31
    .line 32
    .line 33
    iput-wide v0, p1, LY2/m;->j:J

    .line 34
    .line 35
    iget-wide v3, p1, LY2/m;->q:J

    .line 36
    .line 37
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v2, v3, v5

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-boolean v5, p1, LY2/m;->r:Z

    .line 49
    .line 50
    iget-wide v8, p1, LY2/m;->p:J

    .line 51
    .line 52
    sub-long/2addr v0, v8

    .line 53
    long-to-int v6, v0

    .line 54
    iget-object v2, p1, LY2/m;->a:Ls2/C;

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-interface/range {v2 .. v8}, Ls2/C;->a(JIIILs2/B;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iput-boolean v7, p1, LY2/m;->o:Z

    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public i()V
    .locals 0

    .line 1
    return-void
.end method
