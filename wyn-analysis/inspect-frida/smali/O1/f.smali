.class public final LO1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:[S

.field public j:[S

.field public k:I

.field public l:[S

.field public m:I

.field public n:[S

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:D


# direct methods
.method public constructor <init>(FFIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LO1/f;->a:I

    .line 5
    .line 6
    iput p4, p0, LO1/f;->b:I

    .line 7
    .line 8
    iput p1, p0, LO1/f;->c:F

    .line 9
    .line 10
    iput p2, p0, LO1/f;->d:F

    .line 11
    .line 12
    int-to-float p1, p3

    .line 13
    int-to-float p2, p5

    .line 14
    div-float/2addr p1, p2

    .line 15
    iput p1, p0, LO1/f;->e:F

    .line 16
    .line 17
    div-int/lit16 p1, p3, 0x190

    .line 18
    .line 19
    iput p1, p0, LO1/f;->f:I

    .line 20
    .line 21
    div-int/lit8 p3, p3, 0x41

    .line 22
    .line 23
    iput p3, p0, LO1/f;->g:I

    .line 24
    .line 25
    mul-int/lit8 p3, p3, 0x2

    .line 26
    .line 27
    iput p3, p0, LO1/f;->h:I

    .line 28
    .line 29
    new-array p1, p3, [S

    .line 30
    .line 31
    iput-object p1, p0, LO1/f;->i:[S

    .line 32
    .line 33
    mul-int p1, p3, p4

    .line 34
    .line 35
    new-array p1, p1, [S

    .line 36
    .line 37
    iput-object p1, p0, LO1/f;->j:[S

    .line 38
    .line 39
    mul-int p1, p3, p4

    .line 40
    .line 41
    new-array p1, p1, [S

    .line 42
    .line 43
    iput-object p1, p0, LO1/f;->l:[S

    .line 44
    .line 45
    mul-int/2addr p3, p4

    .line 46
    new-array p1, p3, [S

    .line 47
    .line 48
    iput-object p1, p0, LO1/f;->n:[S

    .line 49
    .line 50
    return-void
.end method

.method public static e(II[SI[SI[SI)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v1, p1, :cond_1

    .line 4
    .line 5
    mul-int v2, p3, p1

    .line 6
    .line 7
    add-int/2addr v2, v1

    .line 8
    mul-int v3, p7, p1

    .line 9
    .line 10
    add-int/2addr v3, v1

    .line 11
    mul-int v4, p5, p1

    .line 12
    .line 13
    add-int/2addr v4, v1

    .line 14
    move v5, v0

    .line 15
    :goto_1
    if-ge v5, p0, :cond_0

    .line 16
    .line 17
    aget-short v6, p4, v4

    .line 18
    .line 19
    sub-int v7, p0, v5

    .line 20
    .line 21
    mul-int/2addr v7, v6

    .line 22
    aget-short v6, p6, v3

    .line 23
    .line 24
    mul-int/2addr v6, v5

    .line 25
    add-int/2addr v6, v7

    .line 26
    div-int/2addr v6, p0

    .line 27
    int-to-short v6, v6

    .line 28
    aput-short v6, p2, v2

    .line 29
    .line 30
    add-int/2addr v2, p1

    .line 31
    add-int/2addr v4, p1

    .line 32
    add-int/2addr v3, p1

    .line 33
    add-int/lit8 v5, v5, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
.end method


# virtual methods
.method public final a([SII)V
    .locals 3

    .line 1
    iget-object v0, p0, LO1/f;->l:[S

    .line 2
    .line 3
    iget v1, p0, LO1/f;->m:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, p3}, LO1/f;->c([SII)[S

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LO1/f;->l:[S

    .line 10
    .line 11
    iget v1, p0, LO1/f;->b:I

    .line 12
    .line 13
    mul-int/2addr p2, v1

    .line 14
    iget v2, p0, LO1/f;->m:I

    .line 15
    .line 16
    mul-int/2addr v2, v1

    .line 17
    mul-int/2addr v1, p3

    .line 18
    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, LO1/f;->m:I

    .line 22
    .line 23
    add-int/2addr p1, p3

    .line 24
    iput p1, p0, LO1/f;->m:I

    .line 25
    .line 26
    return-void
.end method

.method public final b([SII)V
    .locals 6

    .line 1
    iget v0, p0, LO1/f;->h:I

    .line 2
    .line 3
    div-int/2addr v0, p3

    .line 4
    iget v1, p0, LO1/f;->b:I

    .line 5
    .line 6
    mul-int/2addr p3, v1

    .line 7
    mul-int/2addr p2, v1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    move v3, v1

    .line 13
    move v4, v3

    .line 14
    :goto_1
    if-ge v3, p3, :cond_0

    .line 15
    .line 16
    mul-int v5, v2, p3

    .line 17
    .line 18
    add-int/2addr v5, p2

    .line 19
    add-int/2addr v5, v3

    .line 20
    aget-short v5, p1, v5

    .line 21
    .line 22
    add-int/2addr v4, v5

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    div-int/2addr v4, p3

    .line 27
    iget-object v3, p0, LO1/f;->i:[S

    .line 28
    .line 29
    int-to-short v4, v4

    .line 30
    aput-short v4, v3, v2

    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final c([SII)[S
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, LO1/f;->b:I

    .line 3
    .line 4
    div-int/2addr v0, v1

    .line 5
    add-int/2addr p2, p3

    .line 6
    if-gt p2, v0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    mul-int/lit8 v0, v0, 0x3

    .line 10
    .line 11
    div-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    add-int/2addr v0, p3

    .line 14
    mul-int/2addr v0, v1

    .line 15
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([SI)[S

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final d([SIII)I
    .locals 9

    .line 1
    iget v0, p0, LO1/f;->b:I

    .line 2
    .line 3
    mul-int/2addr p2, v0

    .line 4
    const/4 v0, 0x0

    .line 5
    const/16 v1, 0xff

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    move v3, v0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-gt p3, p4, :cond_3

    .line 11
    .line 12
    move v5, v0

    .line 13
    move v6, v5

    .line 14
    :goto_1
    if-ge v5, p3, :cond_0

    .line 15
    .line 16
    add-int v7, p2, v5

    .line 17
    .line 18
    aget-short v7, p1, v7

    .line 19
    .line 20
    add-int v8, p2, p3

    .line 21
    .line 22
    add-int/2addr v8, v5

    .line 23
    aget-short v8, p1, v8

    .line 24
    .line 25
    sub-int/2addr v7, v8

    .line 26
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    add-int/2addr v6, v7

    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    mul-int v5, v6, v3

    .line 35
    .line 36
    mul-int v7, v2, p3

    .line 37
    .line 38
    if-ge v5, v7, :cond_1

    .line 39
    .line 40
    move v3, p3

    .line 41
    move v2, v6

    .line 42
    :cond_1
    mul-int v5, v6, v1

    .line 43
    .line 44
    mul-int v7, v4, p3

    .line 45
    .line 46
    if-le v5, v7, :cond_2

    .line 47
    .line 48
    move v1, p3

    .line 49
    move v4, v6

    .line 50
    :cond_2
    add-int/lit8 p3, p3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    div-int/2addr v2, v3

    .line 54
    iput v2, p0, LO1/f;->u:I

    .line 55
    .line 56
    div-int/2addr v4, v1

    .line 57
    iput v4, p0, LO1/f;->v:I

    .line 58
    .line 59
    return v3
.end method

.method public final f()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LO1/f;->m:I

    .line 4
    .line 5
    iget v2, v0, LO1/f;->c:F

    .line 6
    .line 7
    iget v3, v0, LO1/f;->d:F

    .line 8
    .line 9
    div-float/2addr v2, v3

    .line 10
    float-to-double v4, v2

    .line 11
    iget v2, v0, LO1/f;->e:F

    .line 12
    .line 13
    mul-float/2addr v2, v3

    .line 14
    const-wide v6, 0x3ff0000a7c5ac472L    # 1.00001

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmpl-double v3, v4, v6

    .line 20
    .line 21
    iget v6, v0, LO1/f;->a:I

    .line 22
    .line 23
    iget v7, v0, LO1/f;->b:I

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x1

    .line 27
    if-gtz v3, :cond_1

    .line 28
    .line 29
    const-wide v10, 0x3fefffeb074a771dL    # 0.99999

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmpg-double v3, v4, v10

    .line 35
    .line 36
    if-gez v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v3, v0, LO1/f;->j:[S

    .line 40
    .line 41
    iget v4, v0, LO1/f;->k:I

    .line 42
    .line 43
    invoke-virtual {v0, v3, v8, v4}, LO1/f;->a([SII)V

    .line 44
    .line 45
    .line 46
    iput v8, v0, LO1/f;->k:I

    .line 47
    .line 48
    :goto_0
    move/from16 v20, v2

    .line 49
    .line 50
    goto/16 :goto_c

    .line 51
    .line 52
    :cond_1
    :goto_1
    iget v3, v0, LO1/f;->k:I

    .line 53
    .line 54
    iget v10, v0, LO1/f;->h:I

    .line 55
    .line 56
    if-ge v3, v10, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move v11, v8

    .line 60
    :goto_2
    iget v12, v0, LO1/f;->r:I

    .line 61
    .line 62
    if-lez v12, :cond_3

    .line 63
    .line 64
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    iget-object v13, v0, LO1/f;->j:[S

    .line 69
    .line 70
    invoke-virtual {v0, v13, v11, v12}, LO1/f;->a([SII)V

    .line 71
    .line 72
    .line 73
    iget v13, v0, LO1/f;->r:I

    .line 74
    .line 75
    sub-int/2addr v13, v12

    .line 76
    iput v13, v0, LO1/f;->r:I

    .line 77
    .line 78
    add-int/2addr v11, v12

    .line 79
    move/from16 v20, v2

    .line 80
    .line 81
    move-wide/from16 v21, v4

    .line 82
    .line 83
    goto/16 :goto_b

    .line 84
    .line 85
    :cond_3
    iget-object v12, v0, LO1/f;->j:[S

    .line 86
    .line 87
    const/16 v13, 0xfa0

    .line 88
    .line 89
    if-le v6, v13, :cond_4

    .line 90
    .line 91
    div-int/lit16 v13, v6, 0xfa0

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move v13, v9

    .line 95
    :goto_3
    iget v14, v0, LO1/f;->g:I

    .line 96
    .line 97
    iget v15, v0, LO1/f;->f:I

    .line 98
    .line 99
    if-ne v7, v9, :cond_5

    .line 100
    .line 101
    if-ne v13, v9, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, v12, v11, v15, v14}, LO1/f;->d([SIII)I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    move/from16 v20, v2

    .line 108
    .line 109
    move-wide/from16 v21, v4

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_5
    invoke-virtual {v0, v12, v11, v13}, LO1/f;->b([SII)V

    .line 113
    .line 114
    .line 115
    div-int v9, v15, v13

    .line 116
    .line 117
    move/from16 v20, v2

    .line 118
    .line 119
    div-int v2, v14, v13

    .line 120
    .line 121
    move-wide/from16 v21, v4

    .line 122
    .line 123
    iget-object v4, v0, LO1/f;->i:[S

    .line 124
    .line 125
    invoke-virtual {v0, v4, v8, v9, v2}, LO1/f;->d([SIII)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    const/4 v5, 0x1

    .line 130
    if-eq v13, v5, :cond_9

    .line 131
    .line 132
    mul-int/2addr v2, v13

    .line 133
    mul-int/lit8 v13, v13, 0x4

    .line 134
    .line 135
    sub-int v5, v2, v13

    .line 136
    .line 137
    add-int/2addr v2, v13

    .line 138
    if-ge v5, v15, :cond_6

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_6
    move v15, v5

    .line 142
    :goto_4
    if-le v2, v14, :cond_7

    .line 143
    .line 144
    :goto_5
    const/4 v5, 0x1

    .line 145
    goto :goto_6

    .line 146
    :cond_7
    move v14, v2

    .line 147
    goto :goto_5

    .line 148
    :goto_6
    if-ne v7, v5, :cond_8

    .line 149
    .line 150
    invoke-virtual {v0, v12, v11, v15, v14}, LO1/f;->d([SIII)I

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    goto :goto_7

    .line 155
    :cond_8
    invoke-virtual {v0, v12, v11, v5}, LO1/f;->b([SII)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v4, v8, v15, v14}, LO1/f;->d([SIII)I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    goto :goto_7

    .line 163
    :cond_9
    move v12, v2

    .line 164
    :goto_7
    iget v2, v0, LO1/f;->u:I

    .line 165
    .line 166
    iget v4, v0, LO1/f;->v:I

    .line 167
    .line 168
    if-eqz v2, :cond_c

    .line 169
    .line 170
    iget v5, v0, LO1/f;->s:I

    .line 171
    .line 172
    if-nez v5, :cond_a

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_a
    mul-int/lit8 v9, v2, 0x3

    .line 176
    .line 177
    if-le v4, v9, :cond_b

    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_b
    mul-int/lit8 v4, v2, 0x2

    .line 181
    .line 182
    iget v9, v0, LO1/f;->t:I

    .line 183
    .line 184
    mul-int/lit8 v9, v9, 0x3

    .line 185
    .line 186
    if-gt v4, v9, :cond_d

    .line 187
    .line 188
    :cond_c
    :goto_8
    move v5, v12

    .line 189
    :cond_d
    iput v2, v0, LO1/f;->t:I

    .line 190
    .line 191
    iput v12, v0, LO1/f;->s:I

    .line 192
    .line 193
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 194
    .line 195
    cmpl-double v2, v21, v12

    .line 196
    .line 197
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 198
    .line 199
    if-lez v2, :cond_f

    .line 200
    .line 201
    move-wide/from16 v16, v14

    .line 202
    .line 203
    iget-object v15, v0, LO1/f;->j:[S

    .line 204
    .line 205
    cmpl-double v2, v21, v16

    .line 206
    .line 207
    if-ltz v2, :cond_e

    .line 208
    .line 209
    move-wide/from16 v23, v12

    .line 210
    .line 211
    int-to-double v12, v5

    .line 212
    sub-double v16, v21, v23

    .line 213
    .line 214
    div-double v12, v12, v16

    .line 215
    .line 216
    iget-wide v8, v0, LO1/f;->w:D

    .line 217
    .line 218
    add-double/2addr v12, v8

    .line 219
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 220
    .line 221
    .line 222
    move-result-wide v8

    .line 223
    long-to-int v4, v8

    .line 224
    int-to-double v8, v4

    .line 225
    sub-double/2addr v12, v8

    .line 226
    iput-wide v12, v0, LO1/f;->w:D

    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_e
    move-wide/from16 v23, v12

    .line 230
    .line 231
    int-to-double v8, v5

    .line 232
    sub-double v12, v16, v21

    .line 233
    .line 234
    mul-double/2addr v12, v8

    .line 235
    sub-double v8, v21, v23

    .line 236
    .line 237
    div-double/2addr v12, v8

    .line 238
    iget-wide v8, v0, LO1/f;->w:D

    .line 239
    .line 240
    add-double/2addr v12, v8

    .line 241
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 242
    .line 243
    .line 244
    move-result-wide v8

    .line 245
    long-to-int v4, v8

    .line 246
    iput v4, v0, LO1/f;->r:I

    .line 247
    .line 248
    int-to-double v8, v4

    .line 249
    sub-double/2addr v12, v8

    .line 250
    iput-wide v12, v0, LO1/f;->w:D

    .line 251
    .line 252
    move v4, v5

    .line 253
    :goto_9
    iget-object v8, v0, LO1/f;->l:[S

    .line 254
    .line 255
    iget v9, v0, LO1/f;->m:I

    .line 256
    .line 257
    invoke-virtual {v0, v8, v9, v4}, LO1/f;->c([SII)[S

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    iput-object v13, v0, LO1/f;->l:[S

    .line 262
    .line 263
    iget v14, v0, LO1/f;->m:I

    .line 264
    .line 265
    add-int v18, v11, v5

    .line 266
    .line 267
    iget v12, v0, LO1/f;->b:I

    .line 268
    .line 269
    move-object/from16 v17, v15

    .line 270
    .line 271
    move/from16 v16, v11

    .line 272
    .line 273
    move v11, v4

    .line 274
    invoke-static/range {v11 .. v18}, LO1/f;->e(II[SI[SI[SI)V

    .line 275
    .line 276
    .line 277
    move/from16 v18, v16

    .line 278
    .line 279
    iget v4, v0, LO1/f;->m:I

    .line 280
    .line 281
    add-int/2addr v4, v11

    .line 282
    iput v4, v0, LO1/f;->m:I

    .line 283
    .line 284
    add-int/2addr v5, v11

    .line 285
    add-int v5, v5, v18

    .line 286
    .line 287
    move v11, v5

    .line 288
    goto :goto_b

    .line 289
    :cond_f
    move/from16 v18, v11

    .line 290
    .line 291
    move-wide/from16 v23, v12

    .line 292
    .line 293
    move-wide/from16 v16, v14

    .line 294
    .line 295
    iget-object v15, v0, LO1/f;->j:[S

    .line 296
    .line 297
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 298
    .line 299
    cmpg-double v4, v21, v8

    .line 300
    .line 301
    if-gez v4, :cond_10

    .line 302
    .line 303
    int-to-double v8, v5

    .line 304
    mul-double v8, v8, v21

    .line 305
    .line 306
    sub-double v12, v23, v21

    .line 307
    .line 308
    div-double/2addr v8, v12

    .line 309
    iget-wide v11, v0, LO1/f;->w:D

    .line 310
    .line 311
    add-double/2addr v8, v11

    .line 312
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    .line 313
    .line 314
    .line 315
    move-result-wide v11

    .line 316
    long-to-int v4, v11

    .line 317
    int-to-double v11, v4

    .line 318
    sub-double/2addr v8, v11

    .line 319
    iput-wide v8, v0, LO1/f;->w:D

    .line 320
    .line 321
    move v11, v4

    .line 322
    goto :goto_a

    .line 323
    :cond_10
    int-to-double v8, v5

    .line 324
    mul-double v11, v21, v16

    .line 325
    .line 326
    sub-double v11, v11, v23

    .line 327
    .line 328
    mul-double/2addr v11, v8

    .line 329
    sub-double v8, v23, v21

    .line 330
    .line 331
    div-double/2addr v11, v8

    .line 332
    iget-wide v8, v0, LO1/f;->w:D

    .line 333
    .line 334
    add-double/2addr v11, v8

    .line 335
    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    .line 336
    .line 337
    .line 338
    move-result-wide v8

    .line 339
    long-to-int v4, v8

    .line 340
    iput v4, v0, LO1/f;->r:I

    .line 341
    .line 342
    int-to-double v8, v4

    .line 343
    sub-double/2addr v11, v8

    .line 344
    iput-wide v11, v0, LO1/f;->w:D

    .line 345
    .line 346
    move v11, v5

    .line 347
    :goto_a
    iget-object v4, v0, LO1/f;->l:[S

    .line 348
    .line 349
    iget v8, v0, LO1/f;->m:I

    .line 350
    .line 351
    add-int v9, v5, v11

    .line 352
    .line 353
    invoke-virtual {v0, v4, v8, v9}, LO1/f;->c([SII)[S

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    iput-object v4, v0, LO1/f;->l:[S

    .line 358
    .line 359
    mul-int v8, v18, v7

    .line 360
    .line 361
    iget v12, v0, LO1/f;->m:I

    .line 362
    .line 363
    mul-int/2addr v12, v7

    .line 364
    mul-int v13, v5, v7

    .line 365
    .line 366
    invoke-static {v15, v8, v4, v12, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 367
    .line 368
    .line 369
    iget-object v13, v0, LO1/f;->l:[S

    .line 370
    .line 371
    iget v4, v0, LO1/f;->m:I

    .line 372
    .line 373
    add-int v14, v4, v5

    .line 374
    .line 375
    add-int v16, v18, v5

    .line 376
    .line 377
    iget v12, v0, LO1/f;->b:I

    .line 378
    .line 379
    move-object/from16 v17, v15

    .line 380
    .line 381
    invoke-static/range {v11 .. v18}, LO1/f;->e(II[SI[SI[SI)V

    .line 382
    .line 383
    .line 384
    iget v4, v0, LO1/f;->m:I

    .line 385
    .line 386
    add-int/2addr v4, v9

    .line 387
    iput v4, v0, LO1/f;->m:I

    .line 388
    .line 389
    add-int v11, v18, v11

    .line 390
    .line 391
    :goto_b
    add-int v4, v11, v10

    .line 392
    .line 393
    if-le v4, v3, :cond_1a

    .line 394
    .line 395
    iget v3, v0, LO1/f;->k:I

    .line 396
    .line 397
    sub-int/2addr v3, v11

    .line 398
    iget-object v4, v0, LO1/f;->j:[S

    .line 399
    .line 400
    mul-int/2addr v11, v7

    .line 401
    mul-int v5, v3, v7

    .line 402
    .line 403
    const/4 v2, 0x0

    .line 404
    invoke-static {v4, v11, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 405
    .line 406
    .line 407
    iput v3, v0, LO1/f;->k:I

    .line 408
    .line 409
    :goto_c
    const/high16 v3, 0x3f800000    # 1.0f

    .line 410
    .line 411
    cmpl-float v3, v20, v3

    .line 412
    .line 413
    if-eqz v3, :cond_19

    .line 414
    .line 415
    iget v3, v0, LO1/f;->m:I

    .line 416
    .line 417
    if-ne v3, v1, :cond_11

    .line 418
    .line 419
    goto/16 :goto_12

    .line 420
    .line 421
    :cond_11
    int-to-float v3, v6

    .line 422
    div-float v3, v3, v20

    .line 423
    .line 424
    float-to-long v3, v3

    .line 425
    int-to-long v5, v6

    .line 426
    :goto_d
    const-wide/16 v8, 0x0

    .line 427
    .line 428
    cmp-long v10, v3, v8

    .line 429
    .line 430
    if-eqz v10, :cond_12

    .line 431
    .line 432
    cmp-long v10, v5, v8

    .line 433
    .line 434
    if-eqz v10, :cond_12

    .line 435
    .line 436
    const-wide/16 v10, 0x2

    .line 437
    .line 438
    rem-long v12, v3, v10

    .line 439
    .line 440
    cmp-long v12, v12, v8

    .line 441
    .line 442
    if-nez v12, :cond_12

    .line 443
    .line 444
    rem-long v12, v5, v10

    .line 445
    .line 446
    cmp-long v8, v12, v8

    .line 447
    .line 448
    if-nez v8, :cond_12

    .line 449
    .line 450
    div-long/2addr v3, v10

    .line 451
    div-long/2addr v5, v10

    .line 452
    goto :goto_d

    .line 453
    :cond_12
    iget v8, v0, LO1/f;->m:I

    .line 454
    .line 455
    sub-int/2addr v8, v1

    .line 456
    iget-object v9, v0, LO1/f;->n:[S

    .line 457
    .line 458
    iget v10, v0, LO1/f;->o:I

    .line 459
    .line 460
    invoke-virtual {v0, v9, v10, v8}, LO1/f;->c([SII)[S

    .line 461
    .line 462
    .line 463
    move-result-object v9

    .line 464
    iput-object v9, v0, LO1/f;->n:[S

    .line 465
    .line 466
    iget-object v10, v0, LO1/f;->l:[S

    .line 467
    .line 468
    mul-int v11, v1, v7

    .line 469
    .line 470
    iget v12, v0, LO1/f;->o:I

    .line 471
    .line 472
    mul-int/2addr v12, v7

    .line 473
    mul-int v13, v8, v7

    .line 474
    .line 475
    invoke-static {v10, v11, v9, v12, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 476
    .line 477
    .line 478
    iput v1, v0, LO1/f;->m:I

    .line 479
    .line 480
    iget v1, v0, LO1/f;->o:I

    .line 481
    .line 482
    add-int/2addr v1, v8

    .line 483
    iput v1, v0, LO1/f;->o:I

    .line 484
    .line 485
    const/4 v1, 0x0

    .line 486
    :goto_e
    iget v8, v0, LO1/f;->o:I

    .line 487
    .line 488
    add-int/lit8 v9, v8, -0x1

    .line 489
    .line 490
    if-ge v1, v9, :cond_17

    .line 491
    .line 492
    :goto_f
    iget v8, v0, LO1/f;->p:I

    .line 493
    .line 494
    const/4 v9, 0x1

    .line 495
    add-int/2addr v8, v9

    .line 496
    int-to-long v10, v8

    .line 497
    mul-long v12, v10, v3

    .line 498
    .line 499
    iget v14, v0, LO1/f;->q:I

    .line 500
    .line 501
    int-to-long v14, v14

    .line 502
    mul-long v16, v14, v5

    .line 503
    .line 504
    cmp-long v12, v12, v16

    .line 505
    .line 506
    if-lez v12, :cond_14

    .line 507
    .line 508
    iget-object v8, v0, LO1/f;->l:[S

    .line 509
    .line 510
    iget v10, v0, LO1/f;->m:I

    .line 511
    .line 512
    invoke-virtual {v0, v8, v10, v9}, LO1/f;->c([SII)[S

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    iput-object v8, v0, LO1/f;->l:[S

    .line 517
    .line 518
    const/4 v8, 0x0

    .line 519
    :goto_10
    if-ge v8, v7, :cond_13

    .line 520
    .line 521
    iget-object v9, v0, LO1/f;->l:[S

    .line 522
    .line 523
    iget v10, v0, LO1/f;->m:I

    .line 524
    .line 525
    mul-int/2addr v10, v7

    .line 526
    add-int/2addr v10, v8

    .line 527
    iget-object v11, v0, LO1/f;->n:[S

    .line 528
    .line 529
    mul-int v12, v1, v7

    .line 530
    .line 531
    add-int/2addr v12, v8

    .line 532
    aget-short v13, v11, v12

    .line 533
    .line 534
    add-int/2addr v12, v7

    .line 535
    aget-short v11, v11, v12

    .line 536
    .line 537
    iget v12, v0, LO1/f;->q:I

    .line 538
    .line 539
    int-to-long v14, v12

    .line 540
    mul-long/2addr v14, v5

    .line 541
    iget v12, v0, LO1/f;->p:I

    .line 542
    .line 543
    move-wide/from16 v17, v3

    .line 544
    .line 545
    int-to-long v2, v12

    .line 546
    mul-long v2, v2, v17

    .line 547
    .line 548
    const/16 v19, 0x1

    .line 549
    .line 550
    add-int/lit8 v12, v12, 0x1

    .line 551
    .line 552
    move v4, v1

    .line 553
    move-wide/from16 v20, v2

    .line 554
    .line 555
    int-to-long v1, v12

    .line 556
    mul-long v1, v1, v17

    .line 557
    .line 558
    sub-long v14, v1, v14

    .line 559
    .line 560
    sub-long v1, v1, v20

    .line 561
    .line 562
    int-to-long v12, v13

    .line 563
    mul-long/2addr v12, v14

    .line 564
    sub-long v14, v1, v14

    .line 565
    .line 566
    move-wide/from16 v20, v1

    .line 567
    .line 568
    int-to-long v1, v11

    .line 569
    mul-long/2addr v14, v1

    .line 570
    add-long/2addr v14, v12

    .line 571
    div-long v14, v14, v20

    .line 572
    .line 573
    long-to-int v1, v14

    .line 574
    int-to-short v1, v1

    .line 575
    aput-short v1, v9, v10

    .line 576
    .line 577
    add-int/lit8 v8, v8, 0x1

    .line 578
    .line 579
    move v1, v4

    .line 580
    move-wide/from16 v3, v17

    .line 581
    .line 582
    goto :goto_10

    .line 583
    :cond_13
    move-wide/from16 v17, v3

    .line 584
    .line 585
    move v4, v1

    .line 586
    iget v1, v0, LO1/f;->q:I

    .line 587
    .line 588
    const/16 v19, 0x1

    .line 589
    .line 590
    add-int/lit8 v1, v1, 0x1

    .line 591
    .line 592
    iput v1, v0, LO1/f;->q:I

    .line 593
    .line 594
    iget v1, v0, LO1/f;->m:I

    .line 595
    .line 596
    add-int/lit8 v1, v1, 0x1

    .line 597
    .line 598
    iput v1, v0, LO1/f;->m:I

    .line 599
    .line 600
    move v1, v4

    .line 601
    move-wide/from16 v3, v17

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :cond_14
    move-wide/from16 v17, v3

    .line 605
    .line 606
    move/from16 v19, v9

    .line 607
    .line 608
    move v4, v1

    .line 609
    iput v8, v0, LO1/f;->p:I

    .line 610
    .line 611
    cmp-long v1, v10, v5

    .line 612
    .line 613
    if-nez v1, :cond_16

    .line 614
    .line 615
    const/4 v2, 0x0

    .line 616
    iput v2, v0, LO1/f;->p:I

    .line 617
    .line 618
    cmp-long v1, v14, v17

    .line 619
    .line 620
    if-nez v1, :cond_15

    .line 621
    .line 622
    move/from16 v1, v19

    .line 623
    .line 624
    goto :goto_11

    .line 625
    :cond_15
    move v1, v2

    .line 626
    :goto_11
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 627
    .line 628
    .line 629
    iput v2, v0, LO1/f;->q:I

    .line 630
    .line 631
    :cond_16
    add-int/lit8 v1, v4, 0x1

    .line 632
    .line 633
    move-wide/from16 v3, v17

    .line 634
    .line 635
    goto/16 :goto_e

    .line 636
    .line 637
    :cond_17
    if-nez v9, :cond_18

    .line 638
    .line 639
    goto :goto_12

    .line 640
    :cond_18
    iget-object v1, v0, LO1/f;->n:[S

    .line 641
    .line 642
    mul-int v3, v9, v7

    .line 643
    .line 644
    sub-int/2addr v8, v9

    .line 645
    mul-int/2addr v8, v7

    .line 646
    const/4 v2, 0x0

    .line 647
    invoke-static {v1, v3, v1, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 648
    .line 649
    .line 650
    iget v1, v0, LO1/f;->o:I

    .line 651
    .line 652
    sub-int/2addr v1, v9

    .line 653
    iput v1, v0, LO1/f;->o:I

    .line 654
    .line 655
    :cond_19
    :goto_12
    return-void

    .line 656
    :cond_1a
    const/4 v2, 0x0

    .line 657
    const/16 v19, 0x1

    .line 658
    .line 659
    move v8, v2

    .line 660
    move/from16 v9, v19

    .line 661
    .line 662
    move/from16 v2, v20

    .line 663
    .line 664
    move-wide/from16 v4, v21

    .line 665
    .line 666
    goto/16 :goto_2
.end method
