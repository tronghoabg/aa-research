.class public final LQ0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:LQ0/d;

.field public c:I

.field public d:LQ0/c;

.field public e:LQ0/c;

.field public f:LQ0/c;

.field public g:LQ0/c;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public final synthetic r:LQ0/g;


# direct methods
.method public constructor <init>(LQ0/g;ILQ0/c;LQ0/c;LQ0/c;LQ0/c;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ0/f;->r:LQ0/g;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, LQ0/f;->b:LQ0/d;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, LQ0/f;->c:I

    .line 11
    .line 12
    iput v0, p0, LQ0/f;->l:I

    .line 13
    .line 14
    iput v0, p0, LQ0/f;->m:I

    .line 15
    .line 16
    iput v0, p0, LQ0/f;->n:I

    .line 17
    .line 18
    iput v0, p0, LQ0/f;->o:I

    .line 19
    .line 20
    iput v0, p0, LQ0/f;->p:I

    .line 21
    .line 22
    iput p2, p0, LQ0/f;->a:I

    .line 23
    .line 24
    iput-object p3, p0, LQ0/f;->d:LQ0/c;

    .line 25
    .line 26
    iput-object p4, p0, LQ0/f;->e:LQ0/c;

    .line 27
    .line 28
    iput-object p5, p0, LQ0/f;->f:LQ0/c;

    .line 29
    .line 30
    iput-object p6, p0, LQ0/f;->g:LQ0/c;

    .line 31
    .line 32
    iget p2, p1, LQ0/g;->w0:I

    .line 33
    .line 34
    iput p2, p0, LQ0/f;->h:I

    .line 35
    .line 36
    iget p2, p1, LQ0/g;->s0:I

    .line 37
    .line 38
    iput p2, p0, LQ0/f;->i:I

    .line 39
    .line 40
    iget p2, p1, LQ0/g;->x0:I

    .line 41
    .line 42
    iput p2, p0, LQ0/f;->j:I

    .line 43
    .line 44
    iget p1, p1, LQ0/g;->t0:I

    .line 45
    .line 46
    iput p1, p0, LQ0/f;->k:I

    .line 47
    .line 48
    iput p7, p0, LQ0/f;->q:I

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(LQ0/d;)V
    .locals 8

    .line 1
    iget v0, p0, LQ0/f;->a:I

    .line 2
    .line 3
    iget-object v1, p0, LQ0/f;->r:LQ0/g;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget v0, p0, LQ0/f;->q:I

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0}, LQ0/g;->U(LQ0/d;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v6, p1, LQ0/d;->p0:[I

    .line 19
    .line 20
    aget v6, v6, v5

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    iget v0, p0, LQ0/f;->p:I

    .line 25
    .line 26
    add-int/2addr v0, v4

    .line 27
    iput v0, p0, LQ0/f;->p:I

    .line 28
    .line 29
    move v0, v5

    .line 30
    :cond_0
    iget v3, v1, LQ0/g;->P0:I

    .line 31
    .line 32
    iget v6, p1, LQ0/d;->g0:I

    .line 33
    .line 34
    if-ne v6, v2, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v5, v3

    .line 38
    :goto_0
    iget v2, p0, LQ0/f;->l:I

    .line 39
    .line 40
    add-int/2addr v0, v5

    .line 41
    add-int/2addr v0, v2

    .line 42
    iput v0, p0, LQ0/f;->l:I

    .line 43
    .line 44
    iget v0, p0, LQ0/f;->q:I

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, LQ0/g;->T(LQ0/d;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, LQ0/f;->b:LQ0/d;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget v1, p0, LQ0/f;->c:I

    .line 55
    .line 56
    if-ge v1, v0, :cond_7

    .line 57
    .line 58
    :cond_2
    iput-object p1, p0, LQ0/f;->b:LQ0/d;

    .line 59
    .line 60
    iput v0, p0, LQ0/f;->c:I

    .line 61
    .line 62
    iput v0, p0, LQ0/f;->m:I

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget v0, p0, LQ0/f;->q:I

    .line 66
    .line 67
    invoke-virtual {v1, p1, v0}, LQ0/g;->U(LQ0/d;I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget v6, p0, LQ0/f;->q:I

    .line 72
    .line 73
    invoke-virtual {v1, p1, v6}, LQ0/g;->T(LQ0/d;I)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    iget-object v7, p1, LQ0/d;->p0:[I

    .line 78
    .line 79
    aget v7, v7, v4

    .line 80
    .line 81
    if-ne v7, v3, :cond_4

    .line 82
    .line 83
    iget v3, p0, LQ0/f;->p:I

    .line 84
    .line 85
    add-int/2addr v3, v4

    .line 86
    iput v3, p0, LQ0/f;->p:I

    .line 87
    .line 88
    move v6, v5

    .line 89
    :cond_4
    iget v1, v1, LQ0/g;->Q0:I

    .line 90
    .line 91
    iget v3, p1, LQ0/d;->g0:I

    .line 92
    .line 93
    if-ne v3, v2, :cond_5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    move v5, v1

    .line 97
    :goto_1
    iget v1, p0, LQ0/f;->m:I

    .line 98
    .line 99
    add-int/2addr v6, v5

    .line 100
    add-int/2addr v6, v1

    .line 101
    iput v6, p0, LQ0/f;->m:I

    .line 102
    .line 103
    iget-object v1, p0, LQ0/f;->b:LQ0/d;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    iget v1, p0, LQ0/f;->c:I

    .line 108
    .line 109
    if-ge v1, v0, :cond_7

    .line 110
    .line 111
    :cond_6
    iput-object p1, p0, LQ0/f;->b:LQ0/d;

    .line 112
    .line 113
    iput v0, p0, LQ0/f;->c:I

    .line 114
    .line 115
    iput v0, p0, LQ0/f;->l:I

    .line 116
    .line 117
    :cond_7
    :goto_2
    iget p1, p0, LQ0/f;->o:I

    .line 118
    .line 119
    add-int/2addr p1, v4

    .line 120
    iput p1, p0, LQ0/f;->o:I

    .line 121
    .line 122
    return-void
.end method

.method public final b(IZZ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LQ0/f;->o:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    iget-object v4, v0, LQ0/f;->r:LQ0/g;

    .line 8
    .line 9
    if-ge v3, v1, :cond_2

    .line 10
    .line 11
    iget v5, v0, LQ0/f;->n:I

    .line 12
    .line 13
    add-int/2addr v5, v3

    .line 14
    iget v6, v4, LQ0/g;->b1:I

    .line 15
    .line 16
    if-lt v5, v6, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v4, v4, LQ0/g;->a1:[LQ0/d;

    .line 20
    .line 21
    aget-object v4, v4, v5

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, LQ0/d;->D()V

    .line 26
    .line 27
    .line 28
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    if-eqz v1, :cond_3c

    .line 32
    .line 33
    iget-object v3, v0, LQ0/f;->b:LQ0/d;

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    goto/16 :goto_1e

    .line 38
    .line 39
    :cond_3
    if-eqz p3, :cond_4

    .line 40
    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    goto :goto_2

    .line 45
    :cond_4
    move v5, v2

    .line 46
    :goto_2
    const/4 v6, -0x1

    .line 47
    move v7, v2

    .line 48
    move v8, v6

    .line 49
    move v9, v8

    .line 50
    :goto_3
    if-ge v7, v1, :cond_9

    .line 51
    .line 52
    if-eqz p2, :cond_5

    .line 53
    .line 54
    add-int/lit8 v10, v1, -0x1

    .line 55
    .line 56
    sub-int/2addr v10, v7

    .line 57
    goto :goto_4

    .line 58
    :cond_5
    move v10, v7

    .line 59
    :goto_4
    iget v11, v0, LQ0/f;->n:I

    .line 60
    .line 61
    add-int/2addr v11, v10

    .line 62
    iget v10, v4, LQ0/g;->b1:I

    .line 63
    .line 64
    if-lt v11, v10, :cond_6

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_6
    iget-object v10, v4, LQ0/g;->a1:[LQ0/d;

    .line 68
    .line 69
    aget-object v10, v10, v11

    .line 70
    .line 71
    if-eqz v10, :cond_8

    .line 72
    .line 73
    iget v10, v10, LQ0/d;->g0:I

    .line 74
    .line 75
    if-nez v10, :cond_8

    .line 76
    .line 77
    if-ne v8, v6, :cond_7

    .line 78
    .line 79
    move v8, v7

    .line 80
    :cond_7
    move v9, v7

    .line 81
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_9
    :goto_5
    iget v7, v0, LQ0/f;->a:I

    .line 85
    .line 86
    if-nez v7, :cond_24

    .line 87
    .line 88
    iget-object v7, v0, LQ0/f;->b:LQ0/d;

    .line 89
    .line 90
    iget v11, v4, LQ0/g;->E0:I

    .line 91
    .line 92
    iput v11, v7, LQ0/d;->j0:I

    .line 93
    .line 94
    iget v11, v0, LQ0/f;->i:I

    .line 95
    .line 96
    if-lez p1, :cond_a

    .line 97
    .line 98
    iget v12, v4, LQ0/g;->Q0:I

    .line 99
    .line 100
    add-int/2addr v11, v12

    .line 101
    :cond_a
    iget-object v12, v0, LQ0/f;->e:LQ0/c;

    .line 102
    .line 103
    iget-object v13, v7, LQ0/d;->J:LQ0/c;

    .line 104
    .line 105
    invoke-virtual {v13, v12, v11}, LQ0/c;->a(LQ0/c;I)V

    .line 106
    .line 107
    .line 108
    iget-object v11, v7, LQ0/d;->L:LQ0/c;

    .line 109
    .line 110
    if-eqz p3, :cond_b

    .line 111
    .line 112
    iget-object v12, v0, LQ0/f;->g:LQ0/c;

    .line 113
    .line 114
    iget v14, v0, LQ0/f;->k:I

    .line 115
    .line 116
    invoke-virtual {v11, v12, v14}, LQ0/c;->a(LQ0/c;I)V

    .line 117
    .line 118
    .line 119
    :cond_b
    if-lez p1, :cond_c

    .line 120
    .line 121
    iget-object v12, v0, LQ0/f;->e:LQ0/c;

    .line 122
    .line 123
    iget-object v12, v12, LQ0/c;->d:LQ0/d;

    .line 124
    .line 125
    iget-object v12, v12, LQ0/d;->L:LQ0/c;

    .line 126
    .line 127
    invoke-virtual {v12, v13, v2}, LQ0/c;->a(LQ0/c;I)V

    .line 128
    .line 129
    .line 130
    :cond_c
    iget v12, v4, LQ0/g;->S0:I

    .line 131
    .line 132
    const/4 v14, 0x3

    .line 133
    if-ne v12, v14, :cond_10

    .line 134
    .line 135
    iget-boolean v12, v7, LQ0/d;->E:Z

    .line 136
    .line 137
    if-nez v12, :cond_10

    .line 138
    .line 139
    move v12, v2

    .line 140
    :goto_6
    if-ge v12, v1, :cond_10

    .line 141
    .line 142
    if-eqz p2, :cond_d

    .line 143
    .line 144
    add-int/lit8 v15, v1, -0x1

    .line 145
    .line 146
    sub-int/2addr v15, v12

    .line 147
    goto :goto_7

    .line 148
    :cond_d
    move v15, v12

    .line 149
    :goto_7
    iget v10, v0, LQ0/f;->n:I

    .line 150
    .line 151
    add-int/2addr v10, v15

    .line 152
    iget v15, v4, LQ0/g;->b1:I

    .line 153
    .line 154
    if-lt v10, v15, :cond_e

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_e
    iget-object v15, v4, LQ0/g;->a1:[LQ0/d;

    .line 158
    .line 159
    aget-object v10, v15, v10

    .line 160
    .line 161
    iget-boolean v15, v10, LQ0/d;->E:Z

    .line 162
    .line 163
    if-eqz v15, :cond_f

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_f
    add-int/lit8 v12, v12, 0x1

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_10
    :goto_8
    move-object v10, v7

    .line 170
    :goto_9
    move v15, v2

    .line 171
    const/4 v12, 0x0

    .line 172
    :goto_a
    if-ge v15, v1, :cond_3c

    .line 173
    .line 174
    if-eqz p2, :cond_11

    .line 175
    .line 176
    add-int/lit8 v16, v1, -0x1

    .line 177
    .line 178
    sub-int v16, v16, v15

    .line 179
    .line 180
    :goto_b
    const/16 v17, 0x1

    .line 181
    .line 182
    goto :goto_c

    .line 183
    :cond_11
    move/from16 v16, v15

    .line 184
    .line 185
    goto :goto_b

    .line 186
    :goto_c
    iget v3, v0, LQ0/f;->n:I

    .line 187
    .line 188
    add-int v3, v3, v16

    .line 189
    .line 190
    iget v14, v4, LQ0/g;->b1:I

    .line 191
    .line 192
    if-lt v3, v14, :cond_12

    .line 193
    .line 194
    goto/16 :goto_1e

    .line 195
    .line 196
    :cond_12
    iget-object v14, v4, LQ0/g;->a1:[LQ0/d;

    .line 197
    .line 198
    aget-object v3, v14, v3

    .line 199
    .line 200
    if-nez v3, :cond_13

    .line 201
    .line 202
    move/from16 v19, v5

    .line 203
    .line 204
    const/4 v5, 0x3

    .line 205
    goto/16 :goto_14

    .line 206
    .line 207
    :cond_13
    iget-object v14, v3, LQ0/d;->I:LQ0/c;

    .line 208
    .line 209
    if-nez v15, :cond_14

    .line 210
    .line 211
    iget-object v2, v0, LQ0/f;->d:LQ0/c;

    .line 212
    .line 213
    iget v6, v0, LQ0/f;->h:I

    .line 214
    .line 215
    invoke-virtual {v3, v14, v2, v6}, LQ0/d;->f(LQ0/c;LQ0/c;I)V

    .line 216
    .line 217
    .line 218
    :cond_14
    if-nez v16, :cond_1b

    .line 219
    .line 220
    iget v2, v4, LQ0/g;->D0:I

    .line 221
    .line 222
    if-eqz p2, :cond_15

    .line 223
    .line 224
    const/high16 v16, 0x3f800000    # 1.0f

    .line 225
    .line 226
    iget v6, v4, LQ0/g;->J0:F

    .line 227
    .line 228
    sub-float v6, v16, v6

    .line 229
    .line 230
    :goto_d
    move/from16 v18, v2

    .line 231
    .line 232
    goto :goto_e

    .line 233
    :cond_15
    const/high16 v16, 0x3f800000    # 1.0f

    .line 234
    .line 235
    iget v6, v4, LQ0/g;->J0:F

    .line 236
    .line 237
    goto :goto_d

    .line 238
    :goto_e
    iget v2, v0, LQ0/f;->n:I

    .line 239
    .line 240
    if-nez v2, :cond_17

    .line 241
    .line 242
    iget v2, v4, LQ0/g;->F0:I

    .line 243
    .line 244
    move/from16 v19, v5

    .line 245
    .line 246
    const/4 v5, -0x1

    .line 247
    if-eq v2, v5, :cond_18

    .line 248
    .line 249
    if-eqz p2, :cond_16

    .line 250
    .line 251
    iget v5, v4, LQ0/g;->L0:F

    .line 252
    .line 253
    :goto_f
    sub-float v6, v16, v5

    .line 254
    .line 255
    goto :goto_11

    .line 256
    :cond_16
    iget v5, v4, LQ0/g;->L0:F

    .line 257
    .line 258
    :goto_10
    move v6, v5

    .line 259
    goto :goto_11

    .line 260
    :cond_17
    move/from16 v19, v5

    .line 261
    .line 262
    :cond_18
    if-eqz p3, :cond_1a

    .line 263
    .line 264
    iget v2, v4, LQ0/g;->H0:I

    .line 265
    .line 266
    const/4 v5, -0x1

    .line 267
    if-eq v2, v5, :cond_1a

    .line 268
    .line 269
    if-eqz p2, :cond_19

    .line 270
    .line 271
    iget v5, v4, LQ0/g;->N0:F

    .line 272
    .line 273
    goto :goto_f

    .line 274
    :cond_19
    iget v5, v4, LQ0/g;->N0:F

    .line 275
    .line 276
    goto :goto_10

    .line 277
    :cond_1a
    move/from16 v2, v18

    .line 278
    .line 279
    :goto_11
    iput v2, v3, LQ0/d;->i0:I

    .line 280
    .line 281
    iput v6, v3, LQ0/d;->d0:F

    .line 282
    .line 283
    goto :goto_12

    .line 284
    :cond_1b
    move/from16 v19, v5

    .line 285
    .line 286
    :goto_12
    add-int/lit8 v2, v1, -0x1

    .line 287
    .line 288
    if-ne v15, v2, :cond_1c

    .line 289
    .line 290
    iget-object v2, v0, LQ0/f;->f:LQ0/c;

    .line 291
    .line 292
    iget v5, v0, LQ0/f;->j:I

    .line 293
    .line 294
    iget-object v6, v3, LQ0/d;->K:LQ0/c;

    .line 295
    .line 296
    invoke-virtual {v3, v6, v2, v5}, LQ0/d;->f(LQ0/c;LQ0/c;I)V

    .line 297
    .line 298
    .line 299
    :cond_1c
    if-eqz v12, :cond_1e

    .line 300
    .line 301
    iget v2, v4, LQ0/g;->P0:I

    .line 302
    .line 303
    iget-object v5, v12, LQ0/d;->K:LQ0/c;

    .line 304
    .line 305
    invoke-virtual {v14, v5, v2}, LQ0/c;->a(LQ0/c;I)V

    .line 306
    .line 307
    .line 308
    if-ne v15, v8, :cond_1d

    .line 309
    .line 310
    iget v2, v0, LQ0/f;->h:I

    .line 311
    .line 312
    invoke-virtual {v14}, LQ0/c;->h()Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-eqz v6, :cond_1d

    .line 317
    .line 318
    iput v2, v14, LQ0/c;->h:I

    .line 319
    .line 320
    :cond_1d
    const/4 v2, 0x0

    .line 321
    invoke-virtual {v5, v14, v2}, LQ0/c;->a(LQ0/c;I)V

    .line 322
    .line 323
    .line 324
    add-int/lit8 v2, v9, 0x1

    .line 325
    .line 326
    if-ne v15, v2, :cond_1e

    .line 327
    .line 328
    iget v2, v0, LQ0/f;->j:I

    .line 329
    .line 330
    invoke-virtual {v5}, LQ0/c;->h()Z

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-eqz v6, :cond_1e

    .line 335
    .line 336
    iput v2, v5, LQ0/c;->h:I

    .line 337
    .line 338
    :cond_1e
    if-eq v3, v7, :cond_23

    .line 339
    .line 340
    iget v2, v4, LQ0/g;->S0:I

    .line 341
    .line 342
    const/4 v5, 0x3

    .line 343
    if-ne v2, v5, :cond_1f

    .line 344
    .line 345
    iget-boolean v6, v10, LQ0/d;->E:Z

    .line 346
    .line 347
    if-eqz v6, :cond_1f

    .line 348
    .line 349
    if-eq v3, v10, :cond_1f

    .line 350
    .line 351
    iget-boolean v6, v3, LQ0/d;->E:Z

    .line 352
    .line 353
    if-eqz v6, :cond_1f

    .line 354
    .line 355
    iget-object v2, v3, LQ0/d;->M:LQ0/c;

    .line 356
    .line 357
    iget-object v6, v10, LQ0/d;->M:LQ0/c;

    .line 358
    .line 359
    const/4 v12, 0x0

    .line 360
    invoke-virtual {v2, v6, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 361
    .line 362
    .line 363
    goto :goto_13

    .line 364
    :cond_1f
    iget-object v6, v3, LQ0/d;->J:LQ0/c;

    .line 365
    .line 366
    if-eqz v2, :cond_22

    .line 367
    .line 368
    iget-object v12, v3, LQ0/d;->L:LQ0/c;

    .line 369
    .line 370
    move/from16 v14, v17

    .line 371
    .line 372
    if-eq v2, v14, :cond_21

    .line 373
    .line 374
    if-eqz v19, :cond_20

    .line 375
    .line 376
    iget-object v2, v0, LQ0/f;->e:LQ0/c;

    .line 377
    .line 378
    iget v14, v0, LQ0/f;->i:I

    .line 379
    .line 380
    invoke-virtual {v6, v2, v14}, LQ0/c;->a(LQ0/c;I)V

    .line 381
    .line 382
    .line 383
    iget-object v2, v0, LQ0/f;->g:LQ0/c;

    .line 384
    .line 385
    iget v6, v0, LQ0/f;->k:I

    .line 386
    .line 387
    invoke-virtual {v12, v2, v6}, LQ0/c;->a(LQ0/c;I)V

    .line 388
    .line 389
    .line 390
    goto :goto_13

    .line 391
    :cond_20
    const/4 v2, 0x0

    .line 392
    invoke-virtual {v6, v13, v2}, LQ0/c;->a(LQ0/c;I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v11, v2}, LQ0/c;->a(LQ0/c;I)V

    .line 396
    .line 397
    .line 398
    goto :goto_13

    .line 399
    :cond_21
    const/4 v2, 0x0

    .line 400
    invoke-virtual {v12, v11, v2}, LQ0/c;->a(LQ0/c;I)V

    .line 401
    .line 402
    .line 403
    goto :goto_13

    .line 404
    :cond_22
    const/4 v2, 0x0

    .line 405
    invoke-virtual {v6, v13, v2}, LQ0/c;->a(LQ0/c;I)V

    .line 406
    .line 407
    .line 408
    goto :goto_13

    .line 409
    :cond_23
    const/4 v5, 0x3

    .line 410
    :goto_13
    move-object v12, v3

    .line 411
    :goto_14
    add-int/lit8 v15, v15, 0x1

    .line 412
    .line 413
    move v14, v5

    .line 414
    move/from16 v5, v19

    .line 415
    .line 416
    const/4 v2, 0x0

    .line 417
    const/4 v6, -0x1

    .line 418
    goto/16 :goto_a

    .line 419
    .line 420
    :cond_24
    move/from16 v19, v5

    .line 421
    .line 422
    iget-object v2, v0, LQ0/f;->b:LQ0/d;

    .line 423
    .line 424
    iget v3, v4, LQ0/g;->D0:I

    .line 425
    .line 426
    iput v3, v2, LQ0/d;->i0:I

    .line 427
    .line 428
    iget v3, v0, LQ0/f;->h:I

    .line 429
    .line 430
    if-lez p1, :cond_25

    .line 431
    .line 432
    iget v5, v4, LQ0/g;->P0:I

    .line 433
    .line 434
    add-int/2addr v3, v5

    .line 435
    :cond_25
    iget-object v5, v2, LQ0/d;->I:LQ0/c;

    .line 436
    .line 437
    iget-object v6, v2, LQ0/d;->K:LQ0/c;

    .line 438
    .line 439
    if-eqz p2, :cond_27

    .line 440
    .line 441
    iget-object v7, v0, LQ0/f;->f:LQ0/c;

    .line 442
    .line 443
    invoke-virtual {v6, v7, v3}, LQ0/c;->a(LQ0/c;I)V

    .line 444
    .line 445
    .line 446
    if-eqz p3, :cond_26

    .line 447
    .line 448
    iget-object v3, v0, LQ0/f;->d:LQ0/c;

    .line 449
    .line 450
    iget v7, v0, LQ0/f;->j:I

    .line 451
    .line 452
    invoke-virtual {v5, v3, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 453
    .line 454
    .line 455
    :cond_26
    if-lez p1, :cond_29

    .line 456
    .line 457
    iget-object v3, v0, LQ0/f;->f:LQ0/c;

    .line 458
    .line 459
    iget-object v3, v3, LQ0/c;->d:LQ0/d;

    .line 460
    .line 461
    iget-object v3, v3, LQ0/d;->I:LQ0/c;

    .line 462
    .line 463
    const/4 v12, 0x0

    .line 464
    invoke-virtual {v3, v6, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 465
    .line 466
    .line 467
    goto :goto_15

    .line 468
    :cond_27
    iget-object v7, v0, LQ0/f;->d:LQ0/c;

    .line 469
    .line 470
    invoke-virtual {v5, v7, v3}, LQ0/c;->a(LQ0/c;I)V

    .line 471
    .line 472
    .line 473
    if-eqz p3, :cond_28

    .line 474
    .line 475
    iget-object v3, v0, LQ0/f;->f:LQ0/c;

    .line 476
    .line 477
    iget v7, v0, LQ0/f;->j:I

    .line 478
    .line 479
    invoke-virtual {v6, v3, v7}, LQ0/c;->a(LQ0/c;I)V

    .line 480
    .line 481
    .line 482
    :cond_28
    if-lez p1, :cond_29

    .line 483
    .line 484
    iget-object v3, v0, LQ0/f;->d:LQ0/c;

    .line 485
    .line 486
    iget-object v3, v3, LQ0/c;->d:LQ0/d;

    .line 487
    .line 488
    iget-object v3, v3, LQ0/d;->K:LQ0/c;

    .line 489
    .line 490
    const/4 v12, 0x0

    .line 491
    invoke-virtual {v3, v5, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 492
    .line 493
    .line 494
    :cond_29
    :goto_15
    const/4 v3, 0x0

    .line 495
    const/4 v10, 0x0

    .line 496
    :goto_16
    if-ge v3, v1, :cond_3c

    .line 497
    .line 498
    iget v7, v0, LQ0/f;->n:I

    .line 499
    .line 500
    add-int/2addr v7, v3

    .line 501
    iget v11, v4, LQ0/g;->b1:I

    .line 502
    .line 503
    if-lt v7, v11, :cond_2a

    .line 504
    .line 505
    goto/16 :goto_1e

    .line 506
    .line 507
    :cond_2a
    iget-object v11, v4, LQ0/g;->a1:[LQ0/d;

    .line 508
    .line 509
    aget-object v7, v11, v7

    .line 510
    .line 511
    if-nez v7, :cond_2b

    .line 512
    .line 513
    const/4 v12, 0x0

    .line 514
    const/4 v14, 0x1

    .line 515
    const/4 v15, -0x1

    .line 516
    goto/16 :goto_1d

    .line 517
    .line 518
    :cond_2b
    iget-object v11, v7, LQ0/d;->J:LQ0/c;

    .line 519
    .line 520
    if-nez v3, :cond_2f

    .line 521
    .line 522
    iget-object v12, v0, LQ0/f;->e:LQ0/c;

    .line 523
    .line 524
    iget v13, v0, LQ0/f;->i:I

    .line 525
    .line 526
    invoke-virtual {v7, v11, v12, v13}, LQ0/d;->f(LQ0/c;LQ0/c;I)V

    .line 527
    .line 528
    .line 529
    iget v12, v4, LQ0/g;->E0:I

    .line 530
    .line 531
    iget v13, v4, LQ0/g;->K0:F

    .line 532
    .line 533
    iget v14, v0, LQ0/f;->n:I

    .line 534
    .line 535
    if-nez v14, :cond_2c

    .line 536
    .line 537
    iget v14, v4, LQ0/g;->G0:I

    .line 538
    .line 539
    const/4 v15, -0x1

    .line 540
    if-eq v14, v15, :cond_2d

    .line 541
    .line 542
    iget v13, v4, LQ0/g;->M0:F

    .line 543
    .line 544
    :goto_17
    move v12, v14

    .line 545
    goto :goto_18

    .line 546
    :cond_2c
    const/4 v15, -0x1

    .line 547
    :cond_2d
    if-eqz p3, :cond_2e

    .line 548
    .line 549
    iget v14, v4, LQ0/g;->I0:I

    .line 550
    .line 551
    if-eq v14, v15, :cond_2e

    .line 552
    .line 553
    iget v13, v4, LQ0/g;->O0:F

    .line 554
    .line 555
    goto :goto_17

    .line 556
    :cond_2e
    :goto_18
    iput v12, v7, LQ0/d;->j0:I

    .line 557
    .line 558
    iput v13, v7, LQ0/d;->e0:F

    .line 559
    .line 560
    goto :goto_19

    .line 561
    :cond_2f
    const/4 v15, -0x1

    .line 562
    :goto_19
    add-int/lit8 v12, v1, -0x1

    .line 563
    .line 564
    if-ne v3, v12, :cond_30

    .line 565
    .line 566
    iget-object v12, v0, LQ0/f;->g:LQ0/c;

    .line 567
    .line 568
    iget v13, v0, LQ0/f;->k:I

    .line 569
    .line 570
    iget-object v14, v7, LQ0/d;->L:LQ0/c;

    .line 571
    .line 572
    invoke-virtual {v7, v14, v12, v13}, LQ0/d;->f(LQ0/c;LQ0/c;I)V

    .line 573
    .line 574
    .line 575
    :cond_30
    if-eqz v10, :cond_32

    .line 576
    .line 577
    iget v12, v4, LQ0/g;->Q0:I

    .line 578
    .line 579
    iget-object v10, v10, LQ0/d;->L:LQ0/c;

    .line 580
    .line 581
    invoke-virtual {v11, v10, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 582
    .line 583
    .line 584
    if-ne v3, v8, :cond_31

    .line 585
    .line 586
    iget v12, v0, LQ0/f;->i:I

    .line 587
    .line 588
    invoke-virtual {v11}, LQ0/c;->h()Z

    .line 589
    .line 590
    .line 591
    move-result v13

    .line 592
    if-eqz v13, :cond_31

    .line 593
    .line 594
    iput v12, v11, LQ0/c;->h:I

    .line 595
    .line 596
    :cond_31
    const/4 v12, 0x0

    .line 597
    invoke-virtual {v10, v11, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 598
    .line 599
    .line 600
    const/16 v17, 0x1

    .line 601
    .line 602
    add-int/lit8 v11, v9, 0x1

    .line 603
    .line 604
    if-ne v3, v11, :cond_32

    .line 605
    .line 606
    iget v11, v0, LQ0/f;->k:I

    .line 607
    .line 608
    invoke-virtual {v10}, LQ0/c;->h()Z

    .line 609
    .line 610
    .line 611
    move-result v12

    .line 612
    if-eqz v12, :cond_32

    .line 613
    .line 614
    iput v11, v10, LQ0/c;->h:I

    .line 615
    .line 616
    :cond_32
    if-eq v7, v2, :cond_36

    .line 617
    .line 618
    iget-object v10, v7, LQ0/d;->K:LQ0/c;

    .line 619
    .line 620
    iget-object v11, v7, LQ0/d;->I:LQ0/c;

    .line 621
    .line 622
    const/4 v12, 0x2

    .line 623
    if-eqz p2, :cond_37

    .line 624
    .line 625
    iget v13, v4, LQ0/g;->R0:I

    .line 626
    .line 627
    if-eqz v13, :cond_35

    .line 628
    .line 629
    const/4 v14, 0x1

    .line 630
    if-eq v13, v14, :cond_34

    .line 631
    .line 632
    if-eq v13, v12, :cond_33

    .line 633
    .line 634
    goto :goto_1a

    .line 635
    :cond_33
    const/4 v12, 0x0

    .line 636
    invoke-virtual {v11, v5, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v10, v6, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 640
    .line 641
    .line 642
    goto :goto_1a

    .line 643
    :cond_34
    const/4 v12, 0x0

    .line 644
    invoke-virtual {v11, v5, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 645
    .line 646
    .line 647
    goto :goto_1a

    .line 648
    :cond_35
    const/4 v12, 0x0

    .line 649
    invoke-virtual {v10, v6, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 650
    .line 651
    .line 652
    :cond_36
    :goto_1a
    const/4 v12, 0x0

    .line 653
    const/4 v14, 0x1

    .line 654
    goto :goto_1c

    .line 655
    :cond_37
    iget v13, v4, LQ0/g;->R0:I

    .line 656
    .line 657
    if-eqz v13, :cond_3b

    .line 658
    .line 659
    const/4 v14, 0x1

    .line 660
    if-eq v13, v14, :cond_3a

    .line 661
    .line 662
    if-eq v13, v12, :cond_38

    .line 663
    .line 664
    :goto_1b
    const/4 v12, 0x0

    .line 665
    goto :goto_1c

    .line 666
    :cond_38
    if-eqz v19, :cond_39

    .line 667
    .line 668
    iget-object v12, v0, LQ0/f;->d:LQ0/c;

    .line 669
    .line 670
    iget v13, v0, LQ0/f;->h:I

    .line 671
    .line 672
    invoke-virtual {v11, v12, v13}, LQ0/c;->a(LQ0/c;I)V

    .line 673
    .line 674
    .line 675
    iget-object v11, v0, LQ0/f;->f:LQ0/c;

    .line 676
    .line 677
    iget v12, v0, LQ0/f;->j:I

    .line 678
    .line 679
    invoke-virtual {v10, v11, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 680
    .line 681
    .line 682
    goto :goto_1b

    .line 683
    :cond_39
    const/4 v12, 0x0

    .line 684
    invoke-virtual {v11, v5, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v10, v6, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 688
    .line 689
    .line 690
    goto :goto_1c

    .line 691
    :cond_3a
    const/4 v12, 0x0

    .line 692
    invoke-virtual {v10, v6, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 693
    .line 694
    .line 695
    goto :goto_1c

    .line 696
    :cond_3b
    const/4 v12, 0x0

    .line 697
    const/4 v14, 0x1

    .line 698
    invoke-virtual {v11, v5, v12}, LQ0/c;->a(LQ0/c;I)V

    .line 699
    .line 700
    .line 701
    :goto_1c
    move-object v10, v7

    .line 702
    :goto_1d
    add-int/lit8 v3, v3, 0x1

    .line 703
    .line 704
    goto/16 :goto_16

    .line 705
    .line 706
    :cond_3c
    :goto_1e
    return-void
.end method

.method public final c()I
    .locals 2

    .line 1
    iget v0, p0, LQ0/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, LQ0/f;->m:I

    .line 7
    .line 8
    iget-object v1, p0, LQ0/f;->r:LQ0/g;

    .line 9
    .line 10
    iget v1, v1, LQ0/g;->Q0:I

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    return v0

    .line 14
    :cond_0
    iget v0, p0, LQ0/f;->m:I

    .line 15
    .line 16
    return v0
.end method

.method public final d()I
    .locals 2

    .line 1
    iget v0, p0, LQ0/f;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LQ0/f;->l:I

    .line 6
    .line 7
    iget-object v1, p0, LQ0/f;->r:LQ0/g;

    .line 8
    .line 9
    iget v1, v1, LQ0/g;->P0:I

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    return v0

    .line 13
    :cond_0
    iget v0, p0, LQ0/f;->l:I

    .line 14
    .line 15
    return v0
.end method

.method public final e(I)V
    .locals 11

    .line 1
    iget v0, p0, LQ0/f;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget v1, p0, LQ0/f;->o:I

    .line 8
    .line 9
    div-int v4, p1, v0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    move v0, p1

    .line 13
    :goto_0
    iget-object v2, p0, LQ0/f;->r:LQ0/g;

    .line 14
    .line 15
    if-ge v0, v1, :cond_4

    .line 16
    .line 17
    iget v3, p0, LQ0/f;->n:I

    .line 18
    .line 19
    add-int/2addr v3, v0

    .line 20
    iget v5, v2, LQ0/g;->b1:I

    .line 21
    .line 22
    if-lt v3, v5, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    iget-object v5, v2, LQ0/g;->a1:[LQ0/d;

    .line 26
    .line 27
    aget-object v7, v5, v3

    .line 28
    .line 29
    iget v3, p0, LQ0/f;->a:I

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    move v6, v3

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v8, 0x3

    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    if-eqz v7, :cond_3

    .line 38
    .line 39
    iget-object v6, v7, LQ0/d;->p0:[I

    .line 40
    .line 41
    aget v9, v6, p1

    .line 42
    .line 43
    if-ne v9, v8, :cond_3

    .line 44
    .line 45
    iget v8, v7, LQ0/d;->r:I

    .line 46
    .line 47
    if-nez v8, :cond_3

    .line 48
    .line 49
    aget v5, v6, v5

    .line 50
    .line 51
    invoke-virtual {v7}, LQ0/d;->k()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual/range {v2 .. v7}, LQ0/g;->V(IIIILQ0/d;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    if-eqz v7, :cond_3

    .line 60
    .line 61
    iget-object v6, v7, LQ0/d;->p0:[I

    .line 62
    .line 63
    aget v5, v6, v5

    .line 64
    .line 65
    if-ne v5, v8, :cond_3

    .line 66
    .line 67
    iget v5, v7, LQ0/d;->s:I

    .line 68
    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    aget v5, v6, p1

    .line 72
    .line 73
    move v6, v4

    .line 74
    invoke-virtual {v7}, LQ0/d;->q()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    move v10, v5

    .line 79
    move v5, v3

    .line 80
    move v3, v10

    .line 81
    invoke-virtual/range {v2 .. v7}, LQ0/g;->V(IIIILQ0/d;)V

    .line 82
    .line 83
    .line 84
    move v4, v6

    .line 85
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    :goto_2
    iput p1, p0, LQ0/f;->l:I

    .line 89
    .line 90
    iput p1, p0, LQ0/f;->m:I

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    iput-object v0, p0, LQ0/f;->b:LQ0/d;

    .line 94
    .line 95
    iput p1, p0, LQ0/f;->c:I

    .line 96
    .line 97
    iget v0, p0, LQ0/f;->o:I

    .line 98
    .line 99
    move v1, p1

    .line 100
    :goto_3
    if-ge v1, v0, :cond_c

    .line 101
    .line 102
    iget v3, p0, LQ0/f;->n:I

    .line 103
    .line 104
    add-int/2addr v3, v1

    .line 105
    iget v4, v2, LQ0/g;->b1:I

    .line 106
    .line 107
    if-lt v3, v4, :cond_5

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_5
    iget-object v4, v2, LQ0/g;->a1:[LQ0/d;

    .line 111
    .line 112
    aget-object v3, v4, v3

    .line 113
    .line 114
    iget v4, p0, LQ0/f;->a:I

    .line 115
    .line 116
    const/16 v5, 0x8

    .line 117
    .line 118
    if-nez v4, :cond_8

    .line 119
    .line 120
    invoke-virtual {v3}, LQ0/d;->q()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    iget v6, v2, LQ0/g;->P0:I

    .line 125
    .line 126
    iget v7, v3, LQ0/d;->g0:I

    .line 127
    .line 128
    if-ne v7, v5, :cond_6

    .line 129
    .line 130
    move v6, p1

    .line 131
    :cond_6
    iget v5, p0, LQ0/f;->l:I

    .line 132
    .line 133
    add-int/2addr v4, v6

    .line 134
    add-int/2addr v4, v5

    .line 135
    iput v4, p0, LQ0/f;->l:I

    .line 136
    .line 137
    iget v4, p0, LQ0/f;->q:I

    .line 138
    .line 139
    invoke-virtual {v2, v3, v4}, LQ0/g;->T(LQ0/d;I)I

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    iget-object v5, p0, LQ0/f;->b:LQ0/d;

    .line 144
    .line 145
    if-eqz v5, :cond_7

    .line 146
    .line 147
    iget v5, p0, LQ0/f;->c:I

    .line 148
    .line 149
    if-ge v5, v4, :cond_b

    .line 150
    .line 151
    :cond_7
    iput-object v3, p0, LQ0/f;->b:LQ0/d;

    .line 152
    .line 153
    iput v4, p0, LQ0/f;->c:I

    .line 154
    .line 155
    iput v4, p0, LQ0/f;->m:I

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_8
    iget v4, p0, LQ0/f;->q:I

    .line 159
    .line 160
    invoke-virtual {v2, v3, v4}, LQ0/g;->U(LQ0/d;I)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    iget v6, p0, LQ0/f;->q:I

    .line 165
    .line 166
    invoke-virtual {v2, v3, v6}, LQ0/g;->T(LQ0/d;I)I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    iget v7, v2, LQ0/g;->Q0:I

    .line 171
    .line 172
    iget v8, v3, LQ0/d;->g0:I

    .line 173
    .line 174
    if-ne v8, v5, :cond_9

    .line 175
    .line 176
    move v7, p1

    .line 177
    :cond_9
    iget v5, p0, LQ0/f;->m:I

    .line 178
    .line 179
    add-int/2addr v6, v7

    .line 180
    add-int/2addr v6, v5

    .line 181
    iput v6, p0, LQ0/f;->m:I

    .line 182
    .line 183
    iget-object v5, p0, LQ0/f;->b:LQ0/d;

    .line 184
    .line 185
    if-eqz v5, :cond_a

    .line 186
    .line 187
    iget v5, p0, LQ0/f;->c:I

    .line 188
    .line 189
    if-ge v5, v4, :cond_b

    .line 190
    .line 191
    :cond_a
    iput-object v3, p0, LQ0/f;->b:LQ0/d;

    .line 192
    .line 193
    iput v4, p0, LQ0/f;->c:I

    .line 194
    .line 195
    iput v4, p0, LQ0/f;->l:I

    .line 196
    .line 197
    :cond_b
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_c
    :goto_5
    return-void
.end method

.method public final f(ILQ0/c;LQ0/c;LQ0/c;LQ0/c;IIIII)V
    .locals 0

    .line 1
    iput p1, p0, LQ0/f;->a:I

    .line 2
    .line 3
    iput-object p2, p0, LQ0/f;->d:LQ0/c;

    .line 4
    .line 5
    iput-object p3, p0, LQ0/f;->e:LQ0/c;

    .line 6
    .line 7
    iput-object p4, p0, LQ0/f;->f:LQ0/c;

    .line 8
    .line 9
    iput-object p5, p0, LQ0/f;->g:LQ0/c;

    .line 10
    .line 11
    iput p6, p0, LQ0/f;->h:I

    .line 12
    .line 13
    iput p7, p0, LQ0/f;->i:I

    .line 14
    .line 15
    iput p8, p0, LQ0/f;->j:I

    .line 16
    .line 17
    iput p9, p0, LQ0/f;->k:I

    .line 18
    .line 19
    iput p10, p0, LQ0/f;->q:I

    .line 20
    .line 21
    return-void
.end method
