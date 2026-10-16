.class public final Lx/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[I

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx/t;->a:[J

    .line 5
    .line 6
    iput-object v0, p0, Lx/m;->a:[J

    .line 7
    .line 8
    sget-object v0, Lx/g;->a:[I

    .line 9
    .line 10
    iput-object v0, p0, Lx/m;->b:[I

    .line 11
    .line 12
    sget-object v0, Ly/a;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, Lx/m;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v0, 0x6

    .line 17
    invoke-static {v0}, Lx/t;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Lx/m;->c(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 9

    .line 1
    iget v0, p0, Lx/m;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lx/m;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    shr-int/lit8 v1, v1, 0x3

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    and-int/2addr p1, v0

    .line 55
    return p1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    and-int/2addr p1, v0

    .line 60
    goto :goto_0
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 13

    .line 1
    const v0, -0x3361d2af    # -8.293031E7f

    .line 2
    .line 3
    .line 4
    mul-int/2addr v0, p1

    .line 5
    shl-int/lit8 v1, v0, 0x10

    .line 6
    .line 7
    xor-int/2addr v0, v1

    .line 8
    and-int/lit8 v1, v0, 0x7f

    .line 9
    .line 10
    iget v2, p0, Lx/m;->d:I

    .line 11
    .line 12
    ushr-int/lit8 v0, v0, 0x7

    .line 13
    .line 14
    and-int/2addr v0, v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    iget-object v4, p0, Lx/m;->a:[J

    .line 17
    .line 18
    shr-int/lit8 v5, v0, 0x3

    .line 19
    .line 20
    and-int/lit8 v6, v0, 0x7

    .line 21
    .line 22
    shl-int/lit8 v6, v6, 0x3

    .line 23
    .line 24
    aget-wide v7, v4, v5

    .line 25
    .line 26
    ushr-long/2addr v7, v6

    .line 27
    add-int/lit8 v5, v5, 0x1

    .line 28
    .line 29
    aget-wide v9, v4, v5

    .line 30
    .line 31
    rsub-int/lit8 v4, v6, 0x40

    .line 32
    .line 33
    shl-long v4, v9, v4

    .line 34
    .line 35
    int-to-long v9, v6

    .line 36
    neg-long v9, v9

    .line 37
    const/16 v6, 0x3f

    .line 38
    .line 39
    shr-long/2addr v9, v6

    .line 40
    and-long/2addr v4, v9

    .line 41
    or-long/2addr v4, v7

    .line 42
    int-to-long v6, v1

    .line 43
    const-wide v8, 0x101010101010101L

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    mul-long/2addr v6, v8

    .line 49
    xor-long/2addr v6, v4

    .line 50
    sub-long v8, v6, v8

    .line 51
    .line 52
    not-long v6, v6

    .line 53
    and-long/2addr v6, v8

    .line 54
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v6, v8

    .line 60
    :goto_1
    const-wide/16 v10, 0x0

    .line 61
    .line 62
    cmp-long v12, v6, v10

    .line 63
    .line 64
    if-eqz v12, :cond_1

    .line 65
    .line 66
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    shr-int/lit8 v10, v10, 0x3

    .line 71
    .line 72
    add-int/2addr v10, v0

    .line 73
    and-int/2addr v10, v2

    .line 74
    iget-object v11, p0, Lx/m;->b:[I

    .line 75
    .line 76
    aget v11, v11, v10

    .line 77
    .line 78
    if-ne v11, p1, :cond_0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_0
    const-wide/16 v10, 0x1

    .line 82
    .line 83
    sub-long v10, v6, v10

    .line 84
    .line 85
    and-long/2addr v6, v10

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    not-long v6, v4

    .line 88
    const/4 v12, 0x6

    .line 89
    shl-long/2addr v6, v12

    .line 90
    and-long/2addr v4, v6

    .line 91
    and-long/2addr v4, v8

    .line 92
    cmp-long v4, v4, v10

    .line 93
    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    const/4 v10, -0x1

    .line 97
    :goto_2
    if-ltz v10, :cond_2

    .line 98
    .line 99
    iget-object p1, p0, Lx/m;->c:[Ljava/lang/Object;

    .line 100
    .line 101
    aget-object p1, p1, v10

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_2
    const/4 p1, 0x0

    .line 105
    return-object p1

    .line 106
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 107
    .line 108
    add-int/2addr v0, v3

    .line 109
    and-int/2addr v0, v2

    .line 110
    goto :goto_0
.end method

.method public final c(I)V
    .locals 9

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lx/t;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x7

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Lx/m;->d:I

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    sget-object v0, Lx/t;->a:[J

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v0, p1, 0xf

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x8

    .line 24
    .line 25
    shr-int/lit8 v0, v0, 0x3

    .line 26
    .line 27
    new-array v0, v0, [J

    .line 28
    .line 29
    invoke-static {v0}, Lff/m;->q0([J)V

    .line 30
    .line 31
    .line 32
    :goto_1
    iput-object v0, p0, Lx/m;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v1, p1, 0x3

    .line 35
    .line 36
    and-int/lit8 v2, p1, 0x7

    .line 37
    .line 38
    shl-int/lit8 v2, v2, 0x3

    .line 39
    .line 40
    aget-wide v3, v0, v1

    .line 41
    .line 42
    const-wide/16 v5, 0xff

    .line 43
    .line 44
    shl-long/2addr v5, v2

    .line 45
    not-long v7, v5

    .line 46
    and-long/2addr v3, v7

    .line 47
    or-long/2addr v3, v5

    .line 48
    aput-wide v3, v0, v1

    .line 49
    .line 50
    iget v0, p0, Lx/m;->d:I

    .line 51
    .line 52
    invoke-static {v0}, Lx/t;->a(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v1, p0, Lx/m;->e:I

    .line 57
    .line 58
    sub-int/2addr v0, v1

    .line 59
    iput v0, p0, Lx/m;->f:I

    .line 60
    .line 61
    new-array v0, p1, [I

    .line 62
    .line 63
    iput-object v0, p0, Lx/m;->b:[I

    .line 64
    .line 65
    new-array p1, p1, [Ljava/lang/Object;

    .line 66
    .line 67
    iput-object p1, p0, Lx/m;->c:[Ljava/lang/Object;

    .line 68
    .line 69
    return-void
.end method

.method public final d(ILjava/lang/Object;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const v2, -0x3361d2af    # -8.293031E7f

    .line 6
    .line 7
    .line 8
    mul-int v3, v1, v2

    .line 9
    .line 10
    shl-int/lit8 v4, v3, 0x10

    .line 11
    .line 12
    xor-int/2addr v3, v4

    .line 13
    ushr-int/lit8 v4, v3, 0x7

    .line 14
    .line 15
    and-int/lit8 v3, v3, 0x7f

    .line 16
    .line 17
    iget v5, v0, Lx/m;->d:I

    .line 18
    .line 19
    and-int v6, v4, v5

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    :goto_0
    iget-object v9, v0, Lx/m;->a:[J

    .line 23
    .line 24
    shr-int/lit8 v10, v6, 0x3

    .line 25
    .line 26
    and-int/lit8 v11, v6, 0x7

    .line 27
    .line 28
    shl-int/lit8 v11, v11, 0x3

    .line 29
    .line 30
    aget-wide v12, v9, v10

    .line 31
    .line 32
    ushr-long/2addr v12, v11

    .line 33
    const/4 v14, 0x1

    .line 34
    add-int/2addr v10, v14

    .line 35
    aget-wide v15, v9, v10

    .line 36
    .line 37
    rsub-int/lit8 v9, v11, 0x40

    .line 38
    .line 39
    shl-long v9, v15, v9

    .line 40
    .line 41
    move/from16 v16, v8

    .line 42
    .line 43
    int-to-long v7, v11

    .line 44
    neg-long v7, v7

    .line 45
    const/16 v11, 0x3f

    .line 46
    .line 47
    shr-long/2addr v7, v11

    .line 48
    and-long/2addr v7, v9

    .line 49
    or-long/2addr v7, v12

    .line 50
    int-to-long v9, v3

    .line 51
    const-wide v11, 0x101010101010101L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    mul-long v17, v9, v11

    .line 57
    .line 58
    move v13, v2

    .line 59
    move/from16 v19, v3

    .line 60
    .line 61
    xor-long v2, v7, v17

    .line 62
    .line 63
    sub-long v11, v2, v11

    .line 64
    .line 65
    not-long v2, v2

    .line 66
    and-long/2addr v2, v11

    .line 67
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v2, v11

    .line 73
    :goto_1
    const-wide/16 v17, 0x0

    .line 74
    .line 75
    cmp-long v20, v2, v17

    .line 76
    .line 77
    if-eqz v20, :cond_1

    .line 78
    .line 79
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 80
    .line 81
    .line 82
    move-result v17

    .line 83
    shr-int/lit8 v17, v17, 0x3

    .line 84
    .line 85
    add-int v17, v6, v17

    .line 86
    .line 87
    and-int v17, v17, v5

    .line 88
    .line 89
    move-wide/from16 v20, v11

    .line 90
    .line 91
    iget-object v11, v0, Lx/m;->b:[I

    .line 92
    .line 93
    aget v11, v11, v17

    .line 94
    .line 95
    if-ne v11, v1, :cond_0

    .line 96
    .line 97
    goto/16 :goto_c

    .line 98
    .line 99
    :cond_0
    const-wide/16 v11, 0x1

    .line 100
    .line 101
    sub-long v11, v2, v11

    .line 102
    .line 103
    and-long/2addr v2, v11

    .line 104
    move-wide/from16 v11, v20

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move-wide/from16 v20, v11

    .line 108
    .line 109
    not-long v2, v7

    .line 110
    const/4 v11, 0x6

    .line 111
    shl-long/2addr v2, v11

    .line 112
    and-long/2addr v2, v7

    .line 113
    and-long v2, v2, v20

    .line 114
    .line 115
    cmp-long v2, v2, v17

    .line 116
    .line 117
    const/16 v3, 0x8

    .line 118
    .line 119
    if-eqz v2, :cond_b

    .line 120
    .line 121
    invoke-virtual {v0, v4}, Lx/m;->a(I)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    iget v5, v0, Lx/m;->f:I

    .line 126
    .line 127
    const-wide/16 v11, 0xff

    .line 128
    .line 129
    if-nez v5, :cond_2

    .line 130
    .line 131
    iget-object v5, v0, Lx/m;->a:[J

    .line 132
    .line 133
    shr-int/lit8 v8, v2, 0x3

    .line 134
    .line 135
    aget-wide v16, v5, v8

    .line 136
    .line 137
    and-int/lit8 v5, v2, 0x7

    .line 138
    .line 139
    shl-int/lit8 v5, v5, 0x3

    .line 140
    .line 141
    shr-long v16, v16, v5

    .line 142
    .line 143
    and-long v16, v16, v11

    .line 144
    .line 145
    const-wide/16 v18, 0xfe

    .line 146
    .line 147
    cmp-long v5, v16, v18

    .line 148
    .line 149
    if-nez v5, :cond_3

    .line 150
    .line 151
    :cond_2
    move-wide/from16 v22, v11

    .line 152
    .line 153
    move/from16 v20, v14

    .line 154
    .line 155
    const-wide/16 v16, 0x80

    .line 156
    .line 157
    goto/16 :goto_9

    .line 158
    .line 159
    :cond_3
    iget v2, v0, Lx/m;->d:I

    .line 160
    .line 161
    if-le v2, v3, :cond_7

    .line 162
    .line 163
    iget v3, v0, Lx/m;->e:I

    .line 164
    .line 165
    const-wide/16 v16, 0x80

    .line 166
    .line 167
    int-to-long v6, v3

    .line 168
    const-wide/16 v20, 0x20

    .line 169
    .line 170
    mul-long v6, v6, v20

    .line 171
    .line 172
    int-to-long v2, v2

    .line 173
    const-wide/16 v20, 0x19

    .line 174
    .line 175
    mul-long v2, v2, v20

    .line 176
    .line 177
    const-wide/high16 v20, -0x8000000000000000L

    .line 178
    .line 179
    xor-long v6, v6, v20

    .line 180
    .line 181
    xor-long v2, v2, v20

    .line 182
    .line 183
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-gtz v2, :cond_6

    .line 188
    .line 189
    iget-object v2, v0, Lx/m;->a:[J

    .line 190
    .line 191
    iget v3, v0, Lx/m;->d:I

    .line 192
    .line 193
    const/4 v5, 0x0

    .line 194
    const/4 v6, 0x0

    .line 195
    :goto_2
    if-ge v5, v3, :cond_5

    .line 196
    .line 197
    shr-int/lit8 v7, v5, 0x3

    .line 198
    .line 199
    aget-wide v20, v2, v7

    .line 200
    .line 201
    and-int/lit8 v8, v5, 0x7

    .line 202
    .line 203
    shl-int/lit8 v8, v8, 0x3

    .line 204
    .line 205
    shr-long v20, v20, v8

    .line 206
    .line 207
    and-long v20, v20, v11

    .line 208
    .line 209
    cmp-long v13, v20, v18

    .line 210
    .line 211
    if-nez v13, :cond_4

    .line 212
    .line 213
    iget-object v13, v0, Lx/m;->a:[J

    .line 214
    .line 215
    aget-wide v20, v13, v7

    .line 216
    .line 217
    move-wide/from16 v22, v11

    .line 218
    .line 219
    shl-long v11, v22, v8

    .line 220
    .line 221
    not-long v11, v11

    .line 222
    and-long v11, v20, v11

    .line 223
    .line 224
    shl-long v20, v16, v8

    .line 225
    .line 226
    or-long v11, v11, v20

    .line 227
    .line 228
    aput-wide v11, v13, v7

    .line 229
    .line 230
    iget v7, v0, Lx/m;->d:I

    .line 231
    .line 232
    add-int/lit8 v8, v5, -0x7

    .line 233
    .line 234
    and-int/2addr v8, v7

    .line 235
    and-int/lit8 v7, v7, 0x7

    .line 236
    .line 237
    add-int/2addr v8, v7

    .line 238
    shr-int/lit8 v7, v8, 0x3

    .line 239
    .line 240
    and-int/lit8 v8, v8, 0x7

    .line 241
    .line 242
    shl-int/lit8 v8, v8, 0x3

    .line 243
    .line 244
    aget-wide v11, v13, v7

    .line 245
    .line 246
    move/from16 v20, v14

    .line 247
    .line 248
    shl-long v14, v22, v8

    .line 249
    .line 250
    not-long v14, v14

    .line 251
    and-long/2addr v11, v14

    .line 252
    shl-long v14, v16, v8

    .line 253
    .line 254
    or-long/2addr v11, v14

    .line 255
    aput-wide v11, v13, v7

    .line 256
    .line 257
    add-int/lit8 v6, v6, 0x1

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_4
    move-wide/from16 v22, v11

    .line 261
    .line 262
    move/from16 v20, v14

    .line 263
    .line 264
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 265
    .line 266
    move/from16 v14, v20

    .line 267
    .line 268
    move-wide/from16 v11, v22

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_5
    move-wide/from16 v22, v11

    .line 272
    .line 273
    move/from16 v20, v14

    .line 274
    .line 275
    iget v2, v0, Lx/m;->f:I

    .line 276
    .line 277
    add-int/2addr v2, v6

    .line 278
    iput v2, v0, Lx/m;->f:I

    .line 279
    .line 280
    goto/16 :goto_8

    .line 281
    .line 282
    :cond_6
    :goto_4
    move-wide/from16 v22, v11

    .line 283
    .line 284
    move/from16 v20, v14

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_7
    const-wide/16 v16, 0x80

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :goto_5
    iget v2, v0, Lx/m;->d:I

    .line 291
    .line 292
    invoke-static {v2}, Lx/t;->b(I)I

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    iget-object v3, v0, Lx/m;->a:[J

    .line 297
    .line 298
    iget-object v5, v0, Lx/m;->b:[I

    .line 299
    .line 300
    iget-object v6, v0, Lx/m;->c:[Ljava/lang/Object;

    .line 301
    .line 302
    iget v7, v0, Lx/m;->d:I

    .line 303
    .line 304
    invoke-virtual {v0, v2}, Lx/m;->c(I)V

    .line 305
    .line 306
    .line 307
    iget-object v2, v0, Lx/m;->b:[I

    .line 308
    .line 309
    iget-object v8, v0, Lx/m;->c:[Ljava/lang/Object;

    .line 310
    .line 311
    const/4 v11, 0x0

    .line 312
    :goto_6
    if-ge v11, v7, :cond_9

    .line 313
    .line 314
    shr-int/lit8 v12, v11, 0x3

    .line 315
    .line 316
    aget-wide v14, v3, v12

    .line 317
    .line 318
    and-int/lit8 v12, v11, 0x7

    .line 319
    .line 320
    shl-int/lit8 v12, v12, 0x3

    .line 321
    .line 322
    shr-long/2addr v14, v12

    .line 323
    and-long v14, v14, v22

    .line 324
    .line 325
    cmp-long v12, v14, v16

    .line 326
    .line 327
    if-gez v12, :cond_8

    .line 328
    .line 329
    aget v12, v5, v11

    .line 330
    .line 331
    mul-int v14, v12, v13

    .line 332
    .line 333
    shl-int/lit8 v15, v14, 0x10

    .line 334
    .line 335
    xor-int/2addr v14, v15

    .line 336
    ushr-int/lit8 v15, v14, 0x7

    .line 337
    .line 338
    invoke-virtual {v0, v15}, Lx/m;->a(I)I

    .line 339
    .line 340
    .line 341
    move-result v15

    .line 342
    and-int/lit8 v14, v14, 0x7f

    .line 343
    .line 344
    int-to-long v13, v14

    .line 345
    iget-object v1, v0, Lx/m;->a:[J

    .line 346
    .line 347
    shr-int/lit8 v19, v15, 0x3

    .line 348
    .line 349
    and-int/lit8 v24, v15, 0x7

    .line 350
    .line 351
    shl-int/lit8 v24, v24, 0x3

    .line 352
    .line 353
    aget-wide v25, v1, v19

    .line 354
    .line 355
    move-object/from16 v28, v1

    .line 356
    .line 357
    move-object/from16 v27, v2

    .line 358
    .line 359
    shl-long v1, v22, v24

    .line 360
    .line 361
    not-long v1, v1

    .line 362
    and-long v1, v25, v1

    .line 363
    .line 364
    shl-long v24, v13, v24

    .line 365
    .line 366
    or-long v1, v1, v24

    .line 367
    .line 368
    aput-wide v1, v28, v19

    .line 369
    .line 370
    iget v1, v0, Lx/m;->d:I

    .line 371
    .line 372
    add-int/lit8 v2, v15, -0x7

    .line 373
    .line 374
    and-int/2addr v2, v1

    .line 375
    and-int/lit8 v1, v1, 0x7

    .line 376
    .line 377
    add-int/2addr v2, v1

    .line 378
    shr-int/lit8 v1, v2, 0x3

    .line 379
    .line 380
    and-int/lit8 v2, v2, 0x7

    .line 381
    .line 382
    shl-int/lit8 v2, v2, 0x3

    .line 383
    .line 384
    aget-wide v24, v28, v1

    .line 385
    .line 386
    move/from16 v19, v1

    .line 387
    .line 388
    move/from16 v26, v2

    .line 389
    .line 390
    shl-long v1, v22, v26

    .line 391
    .line 392
    not-long v1, v1

    .line 393
    and-long v1, v24, v1

    .line 394
    .line 395
    shl-long v13, v13, v26

    .line 396
    .line 397
    or-long/2addr v1, v13

    .line 398
    aput-wide v1, v28, v19

    .line 399
    .line 400
    aput v12, v27, v15

    .line 401
    .line 402
    aget-object v1, v6, v11

    .line 403
    .line 404
    aput-object v1, v8, v15

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_8
    move-object/from16 v27, v2

    .line 408
    .line 409
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 410
    .line 411
    move/from16 v1, p1

    .line 412
    .line 413
    move-object/from16 v2, v27

    .line 414
    .line 415
    const v13, -0x3361d2af    # -8.293031E7f

    .line 416
    .line 417
    .line 418
    goto :goto_6

    .line 419
    :cond_9
    :goto_8
    invoke-virtual {v0, v4}, Lx/m;->a(I)I

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    goto :goto_a

    .line 424
    :goto_9
    move v1, v2

    .line 425
    :goto_a
    iget v2, v0, Lx/m;->e:I

    .line 426
    .line 427
    add-int/lit8 v2, v2, 0x1

    .line 428
    .line 429
    iput v2, v0, Lx/m;->e:I

    .line 430
    .line 431
    iget v2, v0, Lx/m;->f:I

    .line 432
    .line 433
    iget-object v3, v0, Lx/m;->a:[J

    .line 434
    .line 435
    shr-int/lit8 v4, v1, 0x3

    .line 436
    .line 437
    aget-wide v5, v3, v4

    .line 438
    .line 439
    and-int/lit8 v7, v1, 0x7

    .line 440
    .line 441
    shl-int/lit8 v7, v7, 0x3

    .line 442
    .line 443
    shr-long v11, v5, v7

    .line 444
    .line 445
    and-long v11, v11, v22

    .line 446
    .line 447
    cmp-long v8, v11, v16

    .line 448
    .line 449
    if-nez v8, :cond_a

    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_a
    const/16 v20, 0x0

    .line 453
    .line 454
    :goto_b
    sub-int v2, v2, v20

    .line 455
    .line 456
    iput v2, v0, Lx/m;->f:I

    .line 457
    .line 458
    shl-long v11, v22, v7

    .line 459
    .line 460
    not-long v11, v11

    .line 461
    and-long/2addr v5, v11

    .line 462
    shl-long v7, v9, v7

    .line 463
    .line 464
    or-long/2addr v5, v7

    .line 465
    aput-wide v5, v3, v4

    .line 466
    .line 467
    iget v2, v0, Lx/m;->d:I

    .line 468
    .line 469
    add-int/lit8 v4, v1, -0x7

    .line 470
    .line 471
    and-int/2addr v4, v2

    .line 472
    and-int/lit8 v2, v2, 0x7

    .line 473
    .line 474
    add-int/2addr v4, v2

    .line 475
    shr-int/lit8 v2, v4, 0x3

    .line 476
    .line 477
    and-int/lit8 v4, v4, 0x7

    .line 478
    .line 479
    shl-int/lit8 v4, v4, 0x3

    .line 480
    .line 481
    aget-wide v5, v3, v2

    .line 482
    .line 483
    shl-long v7, v22, v4

    .line 484
    .line 485
    not-long v7, v7

    .line 486
    and-long/2addr v5, v7

    .line 487
    shl-long v7, v9, v4

    .line 488
    .line 489
    or-long/2addr v5, v7

    .line 490
    aput-wide v5, v3, v2

    .line 491
    .line 492
    move/from16 v17, v1

    .line 493
    .line 494
    :goto_c
    iget-object v1, v0, Lx/m;->b:[I

    .line 495
    .line 496
    aput p1, v1, v17

    .line 497
    .line 498
    iget-object v1, v0, Lx/m;->c:[Ljava/lang/Object;

    .line 499
    .line 500
    aput-object p2, v1, v17

    .line 501
    .line 502
    return-void

    .line 503
    :cond_b
    add-int/lit8 v8, v16, 0x8

    .line 504
    .line 505
    add-int/2addr v6, v8

    .line 506
    and-int/2addr v6, v5

    .line 507
    move/from16 v1, p1

    .line 508
    .line 509
    move/from16 v3, v19

    .line 510
    .line 511
    const v2, -0x3361d2af    # -8.293031E7f

    .line 512
    .line 513
    .line 514
    goto/16 :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, Lx/m;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    check-cast v1, Lx/m;

    .line 16
    .line 17
    iget v3, v1, Lx/m;->e:I

    .line 18
    .line 19
    iget v5, v0, Lx/m;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, Lx/m;->b:[I

    .line 25
    .line 26
    iget-object v5, v0, Lx/m;->c:[Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v6, v0, Lx/m;->a:[J

    .line 29
    .line 30
    array-length v7, v6

    .line 31
    add-int/lit8 v7, v7, -0x2

    .line 32
    .line 33
    if-ltz v7, :cond_d

    .line 34
    .line 35
    move v8, v4

    .line 36
    :goto_0
    aget-wide v9, v6, v8

    .line 37
    .line 38
    not-long v11, v9

    .line 39
    const/4 v13, 0x7

    .line 40
    shl-long/2addr v11, v13

    .line 41
    and-long/2addr v11, v9

    .line 42
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v11, v14

    .line 48
    cmp-long v11, v11, v14

    .line 49
    .line 50
    if-eqz v11, :cond_c

    .line 51
    .line 52
    sub-int v11, v8, v7

    .line 53
    .line 54
    not-int v11, v11

    .line 55
    ushr-int/lit8 v11, v11, 0x1f

    .line 56
    .line 57
    const/16 v12, 0x8

    .line 58
    .line 59
    rsub-int/lit8 v11, v11, 0x8

    .line 60
    .line 61
    move/from16 v16, v2

    .line 62
    .line 63
    move v2, v4

    .line 64
    :goto_1
    if-ge v2, v11, :cond_b

    .line 65
    .line 66
    const-wide/16 v17, 0xff

    .line 67
    .line 68
    and-long v17, v9, v17

    .line 69
    .line 70
    const-wide/16 v19, 0x80

    .line 71
    .line 72
    cmp-long v17, v17, v19

    .line 73
    .line 74
    if-gez v17, :cond_9

    .line 75
    .line 76
    shl-int/lit8 v17, v8, 0x3

    .line 77
    .line 78
    add-int v17, v17, v2

    .line 79
    .line 80
    move/from16 v18, v4

    .line 81
    .line 82
    aget v4, v3, v17

    .line 83
    .line 84
    move/from16 p1, v13

    .line 85
    .line 86
    aget-object v13, v5, v17

    .line 87
    .line 88
    if-nez v13, :cond_8

    .line 89
    .line 90
    invoke-virtual {v1, v4}, Lx/m;->b(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    if-nez v13, :cond_7

    .line 95
    .line 96
    const v13, -0x3361d2af    # -8.293031E7f

    .line 97
    .line 98
    .line 99
    mul-int/2addr v13, v4

    .line 100
    shl-int/lit8 v17, v13, 0x10

    .line 101
    .line 102
    xor-int v13, v13, v17

    .line 103
    .line 104
    move-wide/from16 v19, v14

    .line 105
    .line 106
    and-int/lit8 v14, v13, 0x7f

    .line 107
    .line 108
    iget v15, v1, Lx/m;->d:I

    .line 109
    .line 110
    ushr-int/lit8 v13, v13, 0x7

    .line 111
    .line 112
    and-int/2addr v13, v15

    .line 113
    move/from16 v21, v12

    .line 114
    .line 115
    move/from16 v17, v18

    .line 116
    .line 117
    :goto_2
    iget-object v12, v1, Lx/m;->a:[J

    .line 118
    .line 119
    shr-int/lit8 v22, v13, 0x3

    .line 120
    .line 121
    and-int/lit8 v23, v13, 0x7

    .line 122
    .line 123
    shl-int/lit8 v0, v23, 0x3

    .line 124
    .line 125
    aget-wide v23, v12, v22

    .line 126
    .line 127
    ushr-long v23, v23, v0

    .line 128
    .line 129
    add-int/lit8 v22, v22, 0x1

    .line 130
    .line 131
    aget-wide v25, v12, v22

    .line 132
    .line 133
    rsub-int/lit8 v12, v0, 0x40

    .line 134
    .line 135
    shl-long v25, v25, v12

    .line 136
    .line 137
    move/from16 v22, v2

    .line 138
    .line 139
    move-object v12, v3

    .line 140
    int-to-long v2, v0

    .line 141
    neg-long v2, v2

    .line 142
    const/16 v0, 0x3f

    .line 143
    .line 144
    shr-long/2addr v2, v0

    .line 145
    and-long v2, v25, v2

    .line 146
    .line 147
    or-long v2, v23, v2

    .line 148
    .line 149
    move-object v0, v5

    .line 150
    move-object/from16 v23, v6

    .line 151
    .line 152
    int-to-long v5, v14

    .line 153
    const-wide v24, 0x101010101010101L

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    mul-long v5, v5, v24

    .line 159
    .line 160
    xor-long/2addr v5, v2

    .line 161
    sub-long v24, v5, v24

    .line 162
    .line 163
    not-long v5, v5

    .line 164
    and-long v5, v24, v5

    .line 165
    .line 166
    and-long v5, v5, v19

    .line 167
    .line 168
    :goto_3
    const-wide/16 v24, 0x0

    .line 169
    .line 170
    cmp-long v26, v5, v24

    .line 171
    .line 172
    if-eqz v26, :cond_4

    .line 173
    .line 174
    invoke-static {v5, v6}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 175
    .line 176
    .line 177
    move-result v24

    .line 178
    shr-int/lit8 v24, v24, 0x3

    .line 179
    .line 180
    add-int v24, v13, v24

    .line 181
    .line 182
    and-int v24, v24, v15

    .line 183
    .line 184
    move-object/from16 v26, v0

    .line 185
    .line 186
    iget-object v0, v1, Lx/m;->b:[I

    .line 187
    .line 188
    aget v0, v0, v24

    .line 189
    .line 190
    if-ne v0, v4, :cond_3

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_3
    const-wide/16 v24, 0x1

    .line 194
    .line 195
    sub-long v24, v5, v24

    .line 196
    .line 197
    and-long v5, v5, v24

    .line 198
    .line 199
    move-object/from16 v0, v26

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_4
    move-object/from16 v26, v0

    .line 203
    .line 204
    not-long v5, v2

    .line 205
    const/4 v0, 0x6

    .line 206
    shl-long/2addr v5, v0

    .line 207
    and-long/2addr v2, v5

    .line 208
    and-long v2, v2, v19

    .line 209
    .line 210
    cmp-long v0, v2, v24

    .line 211
    .line 212
    if-eqz v0, :cond_6

    .line 213
    .line 214
    const/16 v24, -0x1

    .line 215
    .line 216
    :goto_4
    if-ltz v24, :cond_5

    .line 217
    .line 218
    move/from16 v0, v16

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_5
    move/from16 v0, v18

    .line 222
    .line 223
    :goto_5
    if-nez v0, :cond_a

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_6
    add-int/lit8 v17, v17, 0x8

    .line 227
    .line 228
    add-int v13, v13, v17

    .line 229
    .line 230
    and-int/2addr v13, v15

    .line 231
    move-object/from16 v0, p0

    .line 232
    .line 233
    move-object v3, v12

    .line 234
    move/from16 v2, v22

    .line 235
    .line 236
    move-object/from16 v6, v23

    .line 237
    .line 238
    move-object/from16 v5, v26

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_7
    :goto_6
    return v18

    .line 242
    :cond_8
    move/from16 v22, v2

    .line 243
    .line 244
    move-object/from16 v26, v5

    .line 245
    .line 246
    move-object/from16 v23, v6

    .line 247
    .line 248
    move/from16 v21, v12

    .line 249
    .line 250
    move-wide/from16 v19, v14

    .line 251
    .line 252
    move-object v12, v3

    .line 253
    invoke-virtual {v1, v4}, Lx/m;->b(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v0, :cond_a

    .line 262
    .line 263
    return v18

    .line 264
    :cond_9
    move/from16 v22, v2

    .line 265
    .line 266
    move/from16 v18, v4

    .line 267
    .line 268
    move-object/from16 v26, v5

    .line 269
    .line 270
    move-object/from16 v23, v6

    .line 271
    .line 272
    move/from16 v21, v12

    .line 273
    .line 274
    move/from16 p1, v13

    .line 275
    .line 276
    move-wide/from16 v19, v14

    .line 277
    .line 278
    move-object v12, v3

    .line 279
    :cond_a
    shr-long v9, v9, v21

    .line 280
    .line 281
    add-int/lit8 v2, v22, 0x1

    .line 282
    .line 283
    move-object/from16 v0, p0

    .line 284
    .line 285
    move/from16 v13, p1

    .line 286
    .line 287
    move-object v3, v12

    .line 288
    move/from16 v4, v18

    .line 289
    .line 290
    move-wide/from16 v14, v19

    .line 291
    .line 292
    move/from16 v12, v21

    .line 293
    .line 294
    move-object/from16 v6, v23

    .line 295
    .line 296
    move-object/from16 v5, v26

    .line 297
    .line 298
    goto/16 :goto_1

    .line 299
    .line 300
    :cond_b
    move/from16 v18, v4

    .line 301
    .line 302
    move-object/from16 v26, v5

    .line 303
    .line 304
    move-object/from16 v23, v6

    .line 305
    .line 306
    move v0, v12

    .line 307
    move-object v12, v3

    .line 308
    if-ne v11, v0, :cond_e

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_c
    move/from16 v16, v2

    .line 312
    .line 313
    move-object v12, v3

    .line 314
    move/from16 v18, v4

    .line 315
    .line 316
    move-object/from16 v26, v5

    .line 317
    .line 318
    move-object/from16 v23, v6

    .line 319
    .line 320
    :goto_7
    if-eq v8, v7, :cond_e

    .line 321
    .line 322
    add-int/lit8 v8, v8, 0x1

    .line 323
    .line 324
    move-object/from16 v0, p0

    .line 325
    .line 326
    move-object v3, v12

    .line 327
    move/from16 v2, v16

    .line 328
    .line 329
    move/from16 v4, v18

    .line 330
    .line 331
    move-object/from16 v6, v23

    .line 332
    .line 333
    move-object/from16 v5, v26

    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :cond_d
    move/from16 v16, v2

    .line 338
    .line 339
    :cond_e
    return v16
.end method

.method public final hashCode()I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx/m;->b:[I

    .line 4
    .line 5
    iget-object v2, v0, Lx/m;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Lx/m;->a:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-ltz v4, :cond_6

    .line 14
    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    :goto_0
    aget-wide v8, v3, v6

    .line 18
    .line 19
    not-long v10, v8

    .line 20
    const/4 v12, 0x7

    .line 21
    shl-long/2addr v10, v12

    .line 22
    and-long/2addr v10, v8

    .line 23
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v10, v12

    .line 29
    cmp-long v10, v10, v12

    .line 30
    .line 31
    if-eqz v10, :cond_4

    .line 32
    .line 33
    sub-int v10, v6, v4

    .line 34
    .line 35
    not-int v10, v10

    .line 36
    ushr-int/lit8 v10, v10, 0x1f

    .line 37
    .line 38
    const/16 v11, 0x8

    .line 39
    .line 40
    rsub-int/lit8 v10, v10, 0x8

    .line 41
    .line 42
    move v12, v5

    .line 43
    :goto_1
    if-ge v12, v10, :cond_2

    .line 44
    .line 45
    const-wide/16 v13, 0xff

    .line 46
    .line 47
    and-long/2addr v13, v8

    .line 48
    const-wide/16 v15, 0x80

    .line 49
    .line 50
    cmp-long v13, v13, v15

    .line 51
    .line 52
    if-gez v13, :cond_1

    .line 53
    .line 54
    shl-int/lit8 v13, v6, 0x3

    .line 55
    .line 56
    add-int/2addr v13, v12

    .line 57
    aget v14, v1, v13

    .line 58
    .line 59
    aget-object v13, v2, v13

    .line 60
    .line 61
    if-eqz v13, :cond_0

    .line 62
    .line 63
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    move v13, v5

    .line 69
    :goto_2
    xor-int/2addr v13, v14

    .line 70
    add-int/2addr v7, v13

    .line 71
    :cond_1
    shr-long/2addr v8, v11

    .line 72
    add-int/lit8 v12, v12, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    if-ne v10, v11, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    return v7

    .line 79
    :cond_4
    :goto_3
    if-eq v6, v4, :cond_5

    .line 80
    .line 81
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    return v7

    .line 85
    :cond_6
    return v5
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lx/m;->e:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v1, "{}"

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "{"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lx/m;->b:[I

    .line 18
    .line 19
    iget-object v3, v0, Lx/m;->c:[Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v4, v0, Lx/m;->a:[J

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    add-int/lit8 v5, v5, -0x2

    .line 25
    .line 26
    if-ltz v5, :cond_5

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    move v7, v6

    .line 30
    move v8, v7

    .line 31
    :goto_0
    aget-wide v9, v4, v7

    .line 32
    .line 33
    not-long v11, v9

    .line 34
    const/4 v13, 0x7

    .line 35
    shl-long/2addr v11, v13

    .line 36
    and-long/2addr v11, v9

    .line 37
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v11, v13

    .line 43
    cmp-long v11, v11, v13

    .line 44
    .line 45
    if-eqz v11, :cond_4

    .line 46
    .line 47
    sub-int v11, v7, v5

    .line 48
    .line 49
    not-int v11, v11

    .line 50
    ushr-int/lit8 v11, v11, 0x1f

    .line 51
    .line 52
    const/16 v12, 0x8

    .line 53
    .line 54
    rsub-int/lit8 v11, v11, 0x8

    .line 55
    .line 56
    move v13, v6

    .line 57
    :goto_1
    if-ge v13, v11, :cond_3

    .line 58
    .line 59
    const-wide/16 v14, 0xff

    .line 60
    .line 61
    and-long/2addr v14, v9

    .line 62
    const-wide/16 v16, 0x80

    .line 63
    .line 64
    cmp-long v14, v14, v16

    .line 65
    .line 66
    if-gez v14, :cond_2

    .line 67
    .line 68
    shl-int/lit8 v14, v7, 0x3

    .line 69
    .line 70
    add-int/2addr v14, v13

    .line 71
    aget v15, v2, v14

    .line 72
    .line 73
    aget-object v14, v3, v14

    .line 74
    .line 75
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v15, "="

    .line 79
    .line 80
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    if-ne v14, v0, :cond_1

    .line 84
    .line 85
    const-string v14, "(this)"

    .line 86
    .line 87
    :cond_1
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v8, v8, 0x1

    .line 91
    .line 92
    iget v14, v0, Lx/m;->e:I

    .line 93
    .line 94
    if-ge v8, v14, :cond_2

    .line 95
    .line 96
    const-string v14, ", "

    .line 97
    .line 98
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_2
    shr-long/2addr v9, v12

    .line 102
    add-int/lit8 v13, v13, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    if-ne v11, v12, :cond_5

    .line 106
    .line 107
    :cond_4
    if-eq v7, v5, :cond_5

    .line 108
    .line 109
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    const/16 v2, 0x7d

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, "s.append(\'}\').toString()"

    .line 122
    .line 123
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v1
.end method
