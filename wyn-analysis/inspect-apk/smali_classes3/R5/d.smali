.class public abstract LR5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lu6/v;->a:I

    .line 2
    .line 3
    sget-object v0, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v1, "OpusHead"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LR5/d;->a:[B

    .line 12
    .line 13
    return-void
.end method

.method public static a(ILY4/b;)LM2/b;
    .locals 10

    .line 1
    add-int/lit8 p0, p0, 0xc

    .line 2
    .line 3
    invoke-virtual {p1, p0}, LY4/b;->A(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, LY4/b;->B(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, LR5/d;->b(LY4/b;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0}, LY4/b;->B(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, LY4/b;->q()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, LY4/b;->B(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, LY4/b;->q()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v2}, LY4/b;->B(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v0}, LY4/b;->B(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1, p0}, LY4/b;->B(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, LR5/d;->b(LY4/b;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LY4/b;->q()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Lu6/k;->c(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p1, v0}, LY4/b;->B(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, LY4/b;->r()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p1}, LY4/b;->r()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p1, p0}, LY4/b;->B(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, LR5/d;->b(LY4/b;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p0, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p1, v6, p0, v3}, LY4/b;->c(II[B)V

    .line 109
    .line 110
    .line 111
    move-wide p0, v0

    .line 112
    new-instance v1, LM2/b;

    .line 113
    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    cmp-long v0, v4, v6

    .line 117
    .line 118
    const-wide/16 v8, -0x1

    .line 119
    .line 120
    if-lez v0, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move-wide v4, v8

    .line 124
    :goto_0
    cmp-long v0, p0, v6

    .line 125
    .line 126
    if-lez v0, :cond_5

    .line 127
    .line 128
    move-wide v6, p0

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    move-wide v6, v8

    .line 131
    :goto_1
    invoke-direct/range {v1 .. v7}, LM2/b;-><init>(Ljava/lang/String;[BJJ)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_6
    :goto_2
    new-instance v1, LM2/b;

    .line 136
    .line 137
    const-wide/16 v4, -0x1

    .line 138
    .line 139
    const-wide/16 v6, -0x1

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-direct/range {v1 .. v7}, LM2/b;-><init>(Ljava/lang/String;[BJJ)V

    .line 143
    .line 144
    .line 145
    return-object v1
.end method

.method public static b(LY4/b;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, LY4/b;->q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LY4/b;->q()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method

.method public static c(LY4/b;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LY4/b;->b:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p1

    .line 6
    .line 7
    move/from16 v4, p2

    .line 8
    .line 9
    if-ge v2, v4, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, LY4/b;->A(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LY4/b;->d()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    move v7, v6

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v7, v5

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LY4/b;->d()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    move v12, v5

    .line 43
    move v9, v8

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    :goto_2
    sub-int v13, v7, v1

    .line 47
    .line 48
    const/4 v14, 0x4

    .line 49
    if-ge v13, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, LY4/b;->A(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, LY4/b;->d()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    invoke-virtual {v0}, LY4/b;->d()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const v3, 0x66726d61

    .line 65
    .line 66
    .line 67
    if-ne v15, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, LY4/b;->d()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const v3, 0x7363686d

    .line 79
    .line 80
    .line 81
    if-ne v15, v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0, v14}, LY4/b;->B(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {v0, v14, v3}, LY4/b;->o(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    const v3, 0x73636869

    .line 94
    .line 95
    .line 96
    if-ne v15, v3, :cond_3

    .line 97
    .line 98
    move v9, v7

    .line 99
    move v12, v13

    .line 100
    :cond_3
    :goto_3
    add-int/2addr v7, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const/16 v16, 0x0

    .line 103
    .line 104
    const-string v3, "cenc"

    .line 105
    .line 106
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    const-string v3, "cbc1"

    .line 113
    .line 114
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    const-string v3, "cens"

    .line 121
    .line 122
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_6

    .line 127
    .line 128
    const-string v3, "cbcs"

    .line 129
    .line 130
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move-object/from16 v3, v16

    .line 138
    .line 139
    goto/16 :goto_b

    .line 140
    .line 141
    :cond_6
    :goto_4
    if-eqz v10, :cond_7

    .line 142
    .line 143
    move v3, v6

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move v3, v5

    .line 146
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 147
    .line 148
    invoke-static {v7, v3}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    if-eq v9, v8, :cond_8

    .line 152
    .line 153
    move v3, v6

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move v3, v5

    .line 156
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 157
    .line 158
    invoke-static {v7, v3}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v3, v9, 0x8

    .line 162
    .line 163
    :goto_7
    sub-int v7, v3, v9

    .line 164
    .line 165
    if-ge v7, v12, :cond_d

    .line 166
    .line 167
    invoke-virtual {v0, v3}, LY4/b;->A(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, LY4/b;->d()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v0}, LY4/b;->d()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const v13, 0x74656e63

    .line 179
    .line 180
    .line 181
    if-ne v8, v13, :cond_c

    .line 182
    .line 183
    invoke-virtual {v0}, LY4/b;->d()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, LH5/a;->n(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v0, v6}, LY4/b;->B(I)V

    .line 192
    .line 193
    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v0, v6}, LY4/b;->B(I)V

    .line 197
    .line 198
    .line 199
    move v14, v5

    .line 200
    move v15, v14

    .line 201
    goto :goto_8

    .line 202
    :cond_9
    invoke-virtual {v0}, LY4/b;->q()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    and-int/lit16 v7, v3, 0xf0

    .line 207
    .line 208
    shr-int/2addr v7, v14

    .line 209
    and-int/lit8 v3, v3, 0xf

    .line 210
    .line 211
    move v15, v3

    .line 212
    move v14, v7

    .line 213
    :goto_8
    invoke-virtual {v0}, LY4/b;->q()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-ne v3, v6, :cond_a

    .line 218
    .line 219
    move-object v3, v10

    .line 220
    move v10, v6

    .line 221
    goto :goto_9

    .line 222
    :cond_a
    move-object v3, v10

    .line 223
    move v10, v5

    .line 224
    :goto_9
    invoke-virtual {v0}, LY4/b;->q()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    const/16 v7, 0x10

    .line 229
    .line 230
    new-array v13, v7, [B

    .line 231
    .line 232
    invoke-virtual {v0, v5, v7, v13}, LY4/b;->c(II[B)V

    .line 233
    .line 234
    .line 235
    if-eqz v10, :cond_b

    .line 236
    .line 237
    if-nez v12, :cond_b

    .line 238
    .line 239
    invoke-virtual {v0}, LY4/b;->q()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    new-array v8, v7, [B

    .line 244
    .line 245
    invoke-virtual {v0, v5, v7, v8}, LY4/b;->c(II[B)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v8

    .line 249
    .line 250
    :cond_b
    new-instance v9, LR5/o;

    .line 251
    .line 252
    move-object v8, v3

    .line 253
    invoke-direct/range {v9 .. v16}, LR5/o;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 254
    .line 255
    .line 256
    move-object v3, v9

    .line 257
    goto :goto_a

    .line 258
    :cond_c
    move-object v8, v10

    .line 259
    add-int/2addr v3, v7

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-object v8, v10

    .line 262
    move-object/from16 v3, v16

    .line 263
    .line 264
    :goto_a
    if-eqz v3, :cond_e

    .line 265
    .line 266
    move v5, v6

    .line 267
    :cond_e
    const-string v6, "tenc atom is mandatory"

    .line 268
    .line 269
    invoke-static {v6, v5}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 270
    .line 271
    .line 272
    sget v5, Lu6/v;->a:I

    .line 273
    .line 274
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    :goto_b
    if-eqz v3, :cond_f

    .line 279
    .line 280
    return-object v3

    .line 281
    :cond_f
    add-int/2addr v1, v2

    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_10
    const/16 v16, 0x0

    .line 285
    .line 286
    return-object v16
.end method

.method public static d(LR5/n;LR5/a;LJ5/q;)LR5/p;
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const v3, 0x7374737a

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v3}, LR5/a;->q(I)LR5/b;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iget-object v4, v1, LR5/n;->f:LE5/T;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    new-instance v6, LM2/e;

    .line 17
    .line 18
    invoke-direct {v6, v3, v4}, LM2/e;-><init>(LR5/b;LE5/T;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const v3, 0x73747a32

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, LR5/a;->q(I)LR5/b;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_34

    .line 30
    .line 31
    new-instance v6, LM2/f;

    .line 32
    .line 33
    invoke-direct {v6, v3}, LM2/f;-><init>(LR5/b;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-interface {v6}, LR5/c;->d()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v7, 0x0

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    new-instance v0, LR5/p;

    .line 44
    .line 45
    new-array v2, v7, [J

    .line 46
    .line 47
    new-array v3, v7, [I

    .line 48
    .line 49
    new-array v5, v7, [J

    .line 50
    .line 51
    new-array v6, v7, [I

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct/range {v0 .. v8}, LR5/p;-><init>(LR5/n;[J[II[J[IJ)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    const v8, 0x7374636f

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v8}, LR5/a;->q(I)LR5/b;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const/4 v9, 0x1

    .line 68
    if-nez v8, :cond_2

    .line 69
    .line 70
    const v8, 0x636f3634

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v8}, LR5/a;->q(I)LR5/b;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move v10, v9

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v10, v7

    .line 83
    :goto_1
    const v11, 0x73747363

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v11}, LR5/a;->q(I)LR5/b;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const v12, 0x73747473

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v12}, LR5/a;->q(I)LR5/b;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const v13, 0x73747373

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v13}, LR5/a;->q(I)LR5/b;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    if-eqz v13, :cond_3

    .line 111
    .line 112
    iget-object v13, v13, LR5/b;->c:LY4/b;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    const/4 v13, 0x0

    .line 116
    :goto_2
    const v14, 0x63747473

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v14}, LR5/a;->q(I)LR5/b;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    iget-object v0, v0, LR5/b;->c:LY4/b;

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    const/4 v0, 0x0

    .line 129
    :goto_3
    new-instance v14, LM2/a;

    .line 130
    .line 131
    iget-object v11, v11, LR5/b;->c:LY4/b;

    .line 132
    .line 133
    iget-object v8, v8, LR5/b;->c:LY4/b;

    .line 134
    .line 135
    invoke-direct {v14, v11, v8, v10}, LM2/a;-><init>(LY4/b;LY4/b;Z)V

    .line 136
    .line 137
    .line 138
    iget-object v8, v12, LR5/b;->c:LY4/b;

    .line 139
    .line 140
    const/16 v10, 0xc

    .line 141
    .line 142
    invoke-virtual {v8, v10}, LY4/b;->A(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, LY4/b;->t()I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    sub-int/2addr v11, v9

    .line 150
    invoke-virtual {v8}, LY4/b;->t()I

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    invoke-virtual {v8}, LY4/b;->t()I

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-virtual {v0, v10}, LY4/b;->A(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, LY4/b;->t()I

    .line 164
    .line 165
    .line 166
    move-result v16

    .line 167
    goto :goto_4

    .line 168
    :cond_5
    move/from16 v16, v7

    .line 169
    .line 170
    :goto_4
    const/4 v5, -0x1

    .line 171
    if-eqz v13, :cond_7

    .line 172
    .line 173
    invoke-virtual {v13, v10}, LY4/b;->A(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v13}, LY4/b;->t()I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-lez v10, :cond_6

    .line 181
    .line 182
    invoke-virtual {v13}, LY4/b;->t()I

    .line 183
    .line 184
    .line 185
    move-result v17

    .line 186
    add-int/lit8 v17, v17, -0x1

    .line 187
    .line 188
    move/from16 v18, v7

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_6
    move/from16 v17, v5

    .line 192
    .line 193
    move/from16 v18, v7

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    goto :goto_5

    .line 197
    :cond_7
    move/from16 v17, v5

    .line 198
    .line 199
    move v10, v7

    .line 200
    move/from16 v18, v10

    .line 201
    .line 202
    :goto_5
    invoke-interface {v6}, LR5/c;->c()I

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    move/from16 v19, v9

    .line 207
    .line 208
    iget-object v9, v4, LE5/T;->l:Ljava/lang/String;

    .line 209
    .line 210
    if-eq v7, v5, :cond_9

    .line 211
    .line 212
    const-string v5, "audio/raw"

    .line 213
    .line 214
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-nez v5, :cond_8

    .line 219
    .line 220
    const-string v5, "audio/g711-mlaw"

    .line 221
    .line 222
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-nez v5, :cond_8

    .line 227
    .line 228
    const-string v5, "audio/g711-alaw"

    .line 229
    .line 230
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_9

    .line 235
    .line 236
    :cond_8
    if-nez v11, :cond_9

    .line 237
    .line 238
    if-nez v16, :cond_9

    .line 239
    .line 240
    if-nez v10, :cond_9

    .line 241
    .line 242
    move/from16 p1, v19

    .line 243
    .line 244
    :goto_6
    move-object v9, v6

    .line 245
    goto :goto_7

    .line 246
    :cond_9
    move/from16 p1, v18

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :goto_7
    if-eqz p1, :cond_e

    .line 250
    .line 251
    iget v0, v14, LM2/a;->b:I

    .line 252
    .line 253
    new-array v8, v0, [J

    .line 254
    .line 255
    new-array v9, v0, [I

    .line 256
    .line 257
    :goto_8
    invoke-virtual {v14}, LM2/a;->a()Z

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    if-eqz v10, :cond_a

    .line 262
    .line 263
    iget v10, v14, LM2/a;->c:I

    .line 264
    .line 265
    iget-wide v11, v14, LM2/a;->e:J

    .line 266
    .line 267
    aput-wide v11, v8, v10

    .line 268
    .line 269
    iget v11, v14, LM2/a;->d:I

    .line 270
    .line 271
    aput v11, v9, v10

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_a
    int-to-long v10, v15

    .line 275
    const/16 v12, 0x2000

    .line 276
    .line 277
    div-int/2addr v12, v7

    .line 278
    move/from16 v13, v18

    .line 279
    .line 280
    move v14, v13

    .line 281
    :goto_9
    if-ge v13, v0, :cond_b

    .line 282
    .line 283
    aget v15, v9, v13

    .line 284
    .line 285
    invoke-static {v15, v12}, Lu6/v;->f(II)I

    .line 286
    .line 287
    .line 288
    move-result v15

    .line 289
    add-int/2addr v14, v15

    .line 290
    add-int/lit8 v13, v13, 0x1

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_b
    new-array v13, v14, [J

    .line 294
    .line 295
    new-array v15, v14, [I

    .line 296
    .line 297
    const-wide/16 v20, 0x0

    .line 298
    .line 299
    new-array v5, v14, [J

    .line 300
    .line 301
    new-array v6, v14, [I

    .line 302
    .line 303
    move-object/from16 v16, v5

    .line 304
    .line 305
    move/from16 v5, v18

    .line 306
    .line 307
    move v14, v5

    .line 308
    move/from16 v17, v14

    .line 309
    .line 310
    move/from16 v22, v17

    .line 311
    .line 312
    :goto_a
    if-ge v14, v0, :cond_d

    .line 313
    .line 314
    aget v23, v9, v14

    .line 315
    .line 316
    aget-wide v24, v8, v14

    .line 317
    .line 318
    move/from16 v37, v22

    .line 319
    .line 320
    move/from16 v22, v0

    .line 321
    .line 322
    move/from16 v0, v17

    .line 323
    .line 324
    move/from16 v17, v37

    .line 325
    .line 326
    move/from16 v37, v23

    .line 327
    .line 328
    move-object/from16 v23, v6

    .line 329
    .line 330
    move/from16 v6, v37

    .line 331
    .line 332
    :goto_b
    if-lez v6, :cond_c

    .line 333
    .line 334
    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    .line 335
    .line 336
    .line 337
    move-result v26

    .line 338
    aput-wide v24, v13, v17

    .line 339
    .line 340
    move/from16 p1, v6

    .line 341
    .line 342
    mul-int v6, v7, v26

    .line 343
    .line 344
    aput v6, v15, v17

    .line 345
    .line 346
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    move/from16 v27, v7

    .line 351
    .line 352
    int-to-long v6, v5

    .line 353
    mul-long/2addr v6, v10

    .line 354
    aput-wide v6, v16, v17

    .line 355
    .line 356
    aput v19, v23, v17

    .line 357
    .line 358
    aget v6, v15, v17

    .line 359
    .line 360
    int-to-long v6, v6

    .line 361
    add-long v24, v24, v6

    .line 362
    .line 363
    add-int v5, v5, v26

    .line 364
    .line 365
    sub-int v6, p1, v26

    .line 366
    .line 367
    add-int/lit8 v17, v17, 0x1

    .line 368
    .line 369
    move/from16 v7, v27

    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_c
    move/from16 v27, v7

    .line 373
    .line 374
    add-int/lit8 v14, v14, 0x1

    .line 375
    .line 376
    move/from16 v6, v17

    .line 377
    .line 378
    move/from16 v17, v0

    .line 379
    .line 380
    move/from16 v0, v22

    .line 381
    .line 382
    move/from16 v22, v6

    .line 383
    .line 384
    move-object/from16 v6, v23

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_d
    move-object/from16 v23, v6

    .line 388
    .line 389
    int-to-long v5, v5

    .line 390
    mul-long/2addr v10, v5

    .line 391
    move-object/from16 v25, v4

    .line 392
    .line 393
    move-wide v7, v10

    .line 394
    move-object v2, v13

    .line 395
    move-object/from16 v5, v16

    .line 396
    .line 397
    move/from16 v4, v17

    .line 398
    .line 399
    move-object/from16 v6, v23

    .line 400
    .line 401
    goto/16 :goto_17

    .line 402
    .line 403
    :cond_e
    const-wide/16 v20, 0x0

    .line 404
    .line 405
    new-array v5, v3, [J

    .line 406
    .line 407
    new-array v6, v3, [I

    .line 408
    .line 409
    new-array v7, v3, [J

    .line 410
    .line 411
    move-object/from16 p1, v0

    .line 412
    .line 413
    new-array v0, v3, [I

    .line 414
    .line 415
    move-object/from16 v25, v4

    .line 416
    .line 417
    move-object/from16 v22, v8

    .line 418
    .line 419
    move-object/from16 v23, v13

    .line 420
    .line 421
    move/from16 v8, v17

    .line 422
    .line 423
    move/from16 v4, v18

    .line 424
    .line 425
    move v13, v4

    .line 426
    move/from16 v24, v13

    .line 427
    .line 428
    move/from16 v30, v24

    .line 429
    .line 430
    move-wide/from16 v26, v20

    .line 431
    .line 432
    move-wide/from16 v28, v26

    .line 433
    .line 434
    move-object/from16 v17, v9

    .line 435
    .line 436
    move/from16 v9, v30

    .line 437
    .line 438
    :goto_c
    const-string v2, "AtomParsers"

    .line 439
    .line 440
    if-ge v9, v3, :cond_17

    .line 441
    .line 442
    move-wide/from16 v31, v28

    .line 443
    .line 444
    move/from16 v28, v24

    .line 445
    .line 446
    move/from16 v24, v19

    .line 447
    .line 448
    :goto_d
    if-nez v28, :cond_f

    .line 449
    .line 450
    invoke-virtual {v14}, LM2/a;->a()Z

    .line 451
    .line 452
    .line 453
    move-result v24

    .line 454
    if-eqz v24, :cond_f

    .line 455
    .line 456
    move/from16 v29, v11

    .line 457
    .line 458
    move/from16 v33, v12

    .line 459
    .line 460
    iget-wide v11, v14, LM2/a;->e:J

    .line 461
    .line 462
    move/from16 v34, v3

    .line 463
    .line 464
    iget v3, v14, LM2/a;->d:I

    .line 465
    .line 466
    move/from16 v28, v3

    .line 467
    .line 468
    move-wide/from16 v31, v11

    .line 469
    .line 470
    move/from16 v11, v29

    .line 471
    .line 472
    move/from16 v12, v33

    .line 473
    .line 474
    move/from16 v3, v34

    .line 475
    .line 476
    goto :goto_d

    .line 477
    :cond_f
    move/from16 v34, v3

    .line 478
    .line 479
    move/from16 v29, v11

    .line 480
    .line 481
    move/from16 v33, v12

    .line 482
    .line 483
    if-nez v24, :cond_10

    .line 484
    .line 485
    const-string v3, "Unexpected end of chunk data"

    .line 486
    .line 487
    invoke-static {v2, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    move-object v15, v5

    .line 507
    move-object v5, v6

    .line 508
    move/from16 v7, v28

    .line 509
    .line 510
    move-object v6, v0

    .line 511
    move-object v0, v3

    .line 512
    move v3, v9

    .line 513
    goto/16 :goto_11

    .line 514
    .line 515
    :cond_10
    if-eqz p1, :cond_12

    .line 516
    .line 517
    move/from16 v2, v30

    .line 518
    .line 519
    :goto_e
    if-nez v2, :cond_11

    .line 520
    .line 521
    if-lez v16, :cond_11

    .line 522
    .line 523
    invoke-virtual/range {p1 .. p1}, LY4/b;->t()I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    invoke-virtual/range {p1 .. p1}, LY4/b;->d()I

    .line 528
    .line 529
    .line 530
    move-result v13

    .line 531
    add-int/lit8 v16, v16, -0x1

    .line 532
    .line 533
    goto :goto_e

    .line 534
    :cond_11
    add-int/lit8 v2, v2, -0x1

    .line 535
    .line 536
    move/from16 v30, v2

    .line 537
    .line 538
    :cond_12
    aput-wide v31, v5, v9

    .line 539
    .line 540
    invoke-interface/range {v17 .. v17}, LR5/c;->a()I

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    aput v2, v6, v9

    .line 545
    .line 546
    if-le v2, v4, :cond_13

    .line 547
    .line 548
    move v4, v2

    .line 549
    :cond_13
    int-to-long v2, v13

    .line 550
    add-long v2, v26, v2

    .line 551
    .line 552
    aput-wide v2, v7, v9

    .line 553
    .line 554
    if-nez v23, :cond_14

    .line 555
    .line 556
    move/from16 v2, v19

    .line 557
    .line 558
    goto :goto_f

    .line 559
    :cond_14
    move/from16 v2, v18

    .line 560
    .line 561
    :goto_f
    aput v2, v0, v9

    .line 562
    .line 563
    if-ne v9, v8, :cond_15

    .line 564
    .line 565
    aput v19, v0, v9

    .line 566
    .line 567
    add-int/lit8 v10, v10, -0x1

    .line 568
    .line 569
    if-lez v10, :cond_15

    .line 570
    .line 571
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v23 .. v23}, LY4/b;->t()I

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    add-int/lit8 v2, v2, -0x1

    .line 579
    .line 580
    move v8, v2

    .line 581
    :cond_15
    int-to-long v2, v15

    .line 582
    add-long v26, v26, v2

    .line 583
    .line 584
    add-int/lit8 v12, v33, -0x1

    .line 585
    .line 586
    if-nez v12, :cond_16

    .line 587
    .line 588
    if-lez v29, :cond_16

    .line 589
    .line 590
    invoke-virtual/range {v22 .. v22}, LY4/b;->t()I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    invoke-virtual/range {v22 .. v22}, LY4/b;->d()I

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    add-int/lit8 v11, v29, -0x1

    .line 599
    .line 600
    move v12, v2

    .line 601
    move v15, v3

    .line 602
    goto :goto_10

    .line 603
    :cond_16
    move/from16 v11, v29

    .line 604
    .line 605
    :goto_10
    aget v2, v6, v9

    .line 606
    .line 607
    int-to-long v2, v2

    .line 608
    add-long v2, v31, v2

    .line 609
    .line 610
    add-int/lit8 v24, v28, -0x1

    .line 611
    .line 612
    add-int/lit8 v9, v9, 0x1

    .line 613
    .line 614
    move-wide/from16 v28, v2

    .line 615
    .line 616
    move/from16 v3, v34

    .line 617
    .line 618
    goto/16 :goto_c

    .line 619
    .line 620
    :cond_17
    move/from16 v34, v3

    .line 621
    .line 622
    move/from16 v29, v11

    .line 623
    .line 624
    move/from16 v33, v12

    .line 625
    .line 626
    move-object v15, v6

    .line 627
    move-object v6, v0

    .line 628
    move-object v0, v5

    .line 629
    move-object v5, v7

    .line 630
    move/from16 v7, v24

    .line 631
    .line 632
    :goto_11
    int-to-long v8, v13

    .line 633
    add-long v8, v26, v8

    .line 634
    .line 635
    if-eqz p1, :cond_19

    .line 636
    .line 637
    :goto_12
    if-lez v16, :cond_19

    .line 638
    .line 639
    invoke-virtual/range {p1 .. p1}, LY4/b;->t()I

    .line 640
    .line 641
    .line 642
    move-result v11

    .line 643
    if-eqz v11, :cond_18

    .line 644
    .line 645
    move/from16 v11, v18

    .line 646
    .line 647
    goto :goto_13

    .line 648
    :cond_18
    invoke-virtual/range {p1 .. p1}, LY4/b;->d()I

    .line 649
    .line 650
    .line 651
    add-int/lit8 v16, v16, -0x1

    .line 652
    .line 653
    goto :goto_12

    .line 654
    :cond_19
    move/from16 v11, v19

    .line 655
    .line 656
    :goto_13
    if-nez v10, :cond_1b

    .line 657
    .line 658
    if-nez v33, :cond_1b

    .line 659
    .line 660
    if-nez v7, :cond_1b

    .line 661
    .line 662
    if-nez v29, :cond_1b

    .line 663
    .line 664
    if-nez v30, :cond_1b

    .line 665
    .line 666
    if-nez v11, :cond_1a

    .line 667
    .line 668
    goto :goto_14

    .line 669
    :cond_1a
    move-object/from16 p1, v0

    .line 670
    .line 671
    goto :goto_16

    .line 672
    :cond_1b
    :goto_14
    new-instance v12, Ljava/lang/StringBuilder;

    .line 673
    .line 674
    const-string v13, "Inconsistent stbl box for track "

    .line 675
    .line 676
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    iget v13, v1, LR5/n;->a:I

    .line 680
    .line 681
    const-string v14, ": remainingSynchronizationSamples "

    .line 682
    .line 683
    move-object/from16 p1, v0

    .line 684
    .line 685
    const-string v0, ", remainingSamplesAtTimestampDelta "

    .line 686
    .line 687
    invoke-static {v13, v10, v14, v0, v12}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 688
    .line 689
    .line 690
    const-string v0, ", remainingSamplesInChunk "

    .line 691
    .line 692
    const-string v10, ", remainingTimestampDeltaChanges "

    .line 693
    .line 694
    move/from16 v13, v33

    .line 695
    .line 696
    invoke-static {v13, v7, v0, v10, v12}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 697
    .line 698
    .line 699
    move/from16 v0, v29

    .line 700
    .line 701
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    const-string v0, ", remainingSamplesAtTimestampOffset "

    .line 705
    .line 706
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    move/from16 v0, v30

    .line 710
    .line 711
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    if-nez v11, :cond_1c

    .line 715
    .line 716
    const-string v0, ", ctts invalid"

    .line 717
    .line 718
    goto :goto_15

    .line 719
    :cond_1c
    const-string v0, ""

    .line 720
    .line 721
    :goto_15
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-static {v2, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    :goto_16
    move-object/from16 v2, p1

    .line 732
    .line 733
    move-wide v7, v8

    .line 734
    :goto_17
    const-wide/32 v9, 0xf4240

    .line 735
    .line 736
    .line 737
    iget-wide v11, v1, LR5/n;->c:J

    .line 738
    .line 739
    invoke-static/range {v7 .. v12}, Lu6/v;->D(JJJ)J

    .line 740
    .line 741
    .line 742
    move-result-wide v9

    .line 743
    iget-wide v11, v1, LR5/n;->c:J

    .line 744
    .line 745
    iget-object v0, v1, LR5/n;->h:[J

    .line 746
    .line 747
    if-nez v0, :cond_1d

    .line 748
    .line 749
    invoke-static {v5, v11, v12}, Lu6/v;->E([JJ)V

    .line 750
    .line 751
    .line 752
    new-instance v0, LR5/p;

    .line 753
    .line 754
    move-wide v7, v9

    .line 755
    move-object v3, v15

    .line 756
    invoke-direct/range {v0 .. v8}, LR5/p;-><init>(LR5/n;[J[II[J[IJ)V

    .line 757
    .line 758
    .line 759
    return-object v0

    .line 760
    :cond_1d
    move v9, v3

    .line 761
    move-object v3, v15

    .line 762
    array-length v10, v0

    .line 763
    iget v13, v1, LR5/n;->b:I

    .line 764
    .line 765
    iget-object v14, v1, LR5/n;->i:[J

    .line 766
    .line 767
    move/from16 v15, v19

    .line 768
    .line 769
    if-ne v10, v15, :cond_22

    .line 770
    .line 771
    if-ne v13, v15, :cond_22

    .line 772
    .line 773
    array-length v10, v5

    .line 774
    const/4 v15, 0x2

    .line 775
    if-lt v10, v15, :cond_22

    .line 776
    .line 777
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    aget-wide v15, v14, v18

    .line 781
    .line 782
    aget-wide v26, v0, v18

    .line 783
    .line 784
    move-object/from16 p1, v2

    .line 785
    .line 786
    move-object v10, v3

    .line 787
    iget-wide v2, v1, LR5/n;->c:J

    .line 788
    .line 789
    move-wide/from16 v28, v2

    .line 790
    .line 791
    iget-wide v2, v1, LR5/n;->d:J

    .line 792
    .line 793
    move-wide/from16 v30, v2

    .line 794
    .line 795
    invoke-static/range {v26 .. v31}, Lu6/v;->D(JJJ)J

    .line 796
    .line 797
    .line 798
    move-result-wide v2

    .line 799
    add-long/2addr v2, v15

    .line 800
    move-wide/from16 v22, v2

    .line 801
    .line 802
    array-length v2, v5

    .line 803
    const/16 v19, 0x1

    .line 804
    .line 805
    add-int/lit8 v2, v2, -0x1

    .line 806
    .line 807
    const/4 v3, 0x4

    .line 808
    move/from16 v17, v4

    .line 809
    .line 810
    move/from16 v4, v18

    .line 811
    .line 812
    invoke-static {v3, v4, v2}, Lu6/v;->h(III)I

    .line 813
    .line 814
    .line 815
    move-result v24

    .line 816
    move/from16 v18, v3

    .line 817
    .line 818
    array-length v3, v5

    .line 819
    add-int/lit8 v3, v3, -0x4

    .line 820
    .line 821
    invoke-static {v3, v4, v2}, Lu6/v;->h(III)I

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    aget-wide v26, v5, v4

    .line 826
    .line 827
    cmp-long v3, v26, v15

    .line 828
    .line 829
    if-gtz v3, :cond_1e

    .line 830
    .line 831
    aget-wide v3, v5, v24

    .line 832
    .line 833
    cmp-long v3, v15, v3

    .line 834
    .line 835
    if-gez v3, :cond_1e

    .line 836
    .line 837
    aget-wide v2, v5, v2

    .line 838
    .line 839
    cmp-long v2, v2, v22

    .line 840
    .line 841
    if-gez v2, :cond_1e

    .line 842
    .line 843
    cmp-long v2, v22, v7

    .line 844
    .line 845
    if-gtz v2, :cond_1e

    .line 846
    .line 847
    const/4 v2, 0x1

    .line 848
    goto :goto_18

    .line 849
    :cond_1e
    const/4 v2, 0x0

    .line 850
    :goto_18
    if-eqz v2, :cond_21

    .line 851
    .line 852
    sub-long v28, v7, v22

    .line 853
    .line 854
    sub-long v30, v15, v26

    .line 855
    .line 856
    move-object/from16 v2, v25

    .line 857
    .line 858
    iget v3, v2, LE5/T;->z:I

    .line 859
    .line 860
    int-to-long v3, v3

    .line 861
    move-wide/from16 v32, v3

    .line 862
    .line 863
    iget-wide v3, v1, LR5/n;->c:J

    .line 864
    .line 865
    move-wide/from16 v34, v3

    .line 866
    .line 867
    invoke-static/range {v30 .. v35}, Lu6/v;->D(JJJ)J

    .line 868
    .line 869
    .line 870
    move-result-wide v3

    .line 871
    iget v2, v2, LE5/T;->z:I

    .line 872
    .line 873
    move-wide v15, v7

    .line 874
    move-object v8, v6

    .line 875
    int-to-long v6, v2

    .line 876
    move-wide/from16 v30, v6

    .line 877
    .line 878
    iget-wide v6, v1, LR5/n;->c:J

    .line 879
    .line 880
    move-wide/from16 v32, v6

    .line 881
    .line 882
    invoke-static/range {v28 .. v33}, Lu6/v;->D(JJJ)J

    .line 883
    .line 884
    .line 885
    move-result-wide v6

    .line 886
    cmp-long v2, v3, v20

    .line 887
    .line 888
    if-nez v2, :cond_20

    .line 889
    .line 890
    cmp-long v2, v6, v20

    .line 891
    .line 892
    if-eqz v2, :cond_1f

    .line 893
    .line 894
    goto :goto_1a

    .line 895
    :cond_1f
    move-object/from16 v2, p1

    .line 896
    .line 897
    move-object v6, v8

    .line 898
    :goto_19
    move-object v3, v10

    .line 899
    move/from16 v4, v17

    .line 900
    .line 901
    goto :goto_1b

    .line 902
    :cond_20
    :goto_1a
    const-wide/32 v22, 0x7fffffff

    .line 903
    .line 904
    .line 905
    cmp-long v2, v3, v22

    .line 906
    .line 907
    if-gtz v2, :cond_1f

    .line 908
    .line 909
    cmp-long v2, v6, v22

    .line 910
    .line 911
    if-gtz v2, :cond_1f

    .line 912
    .line 913
    long-to-int v2, v3

    .line 914
    move-object/from16 v3, p2

    .line 915
    .line 916
    iput v2, v3, LJ5/q;->a:I

    .line 917
    .line 918
    long-to-int v2, v6

    .line 919
    iput v2, v3, LJ5/q;->b:I

    .line 920
    .line 921
    invoke-static {v5, v11, v12}, Lu6/v;->E([JJ)V

    .line 922
    .line 923
    .line 924
    const/16 v18, 0x0

    .line 925
    .line 926
    aget-wide v11, v0, v18

    .line 927
    .line 928
    const-wide/32 v13, 0xf4240

    .line 929
    .line 930
    .line 931
    iget-wide v2, v1, LR5/n;->d:J

    .line 932
    .line 933
    move-wide v15, v2

    .line 934
    invoke-static/range {v11 .. v16}, Lu6/v;->D(JJJ)J

    .line 935
    .line 936
    .line 937
    move-result-wide v2

    .line 938
    new-instance v0, LR5/p;

    .line 939
    .line 940
    move-object v6, v8

    .line 941
    move/from16 v4, v17

    .line 942
    .line 943
    move-wide v7, v2

    .line 944
    move-object v3, v10

    .line 945
    move-object/from16 v2, p1

    .line 946
    .line 947
    invoke-direct/range {v0 .. v8}, LR5/p;-><init>(LR5/n;[J[II[J[IJ)V

    .line 948
    .line 949
    .line 950
    return-object v0

    .line 951
    :cond_21
    move-object/from16 v2, p1

    .line 952
    .line 953
    move-wide v15, v7

    .line 954
    goto :goto_19

    .line 955
    :cond_22
    move-wide v15, v7

    .line 956
    :goto_1b
    array-length v7, v0

    .line 957
    const/4 v8, 0x1

    .line 958
    const/16 v18, 0x0

    .line 959
    .line 960
    if-ne v7, v8, :cond_25

    .line 961
    .line 962
    aget-wide v7, v0, v18

    .line 963
    .line 964
    cmp-long v7, v7, v20

    .line 965
    .line 966
    if-nez v7, :cond_24

    .line 967
    .line 968
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    aget-wide v7, v14, v18

    .line 972
    .line 973
    move/from16 v0, v18

    .line 974
    .line 975
    :goto_1c
    array-length v9, v5

    .line 976
    if-ge v0, v9, :cond_23

    .line 977
    .line 978
    aget-wide v9, v5, v0

    .line 979
    .line 980
    sub-long v17, v9, v7

    .line 981
    .line 982
    const-wide/32 v19, 0xf4240

    .line 983
    .line 984
    .line 985
    iget-wide v9, v1, LR5/n;->c:J

    .line 986
    .line 987
    move-wide/from16 v21, v9

    .line 988
    .line 989
    invoke-static/range {v17 .. v22}, Lu6/v;->D(JJJ)J

    .line 990
    .line 991
    .line 992
    move-result-wide v9

    .line 993
    aput-wide v9, v5, v0

    .line 994
    .line 995
    add-int/lit8 v0, v0, 0x1

    .line 996
    .line 997
    goto :goto_1c

    .line 998
    :cond_23
    sub-long v9, v15, v7

    .line 999
    .line 1000
    const-wide/32 v11, 0xf4240

    .line 1001
    .line 1002
    .line 1003
    iget-wide v13, v1, LR5/n;->c:J

    .line 1004
    .line 1005
    invoke-static/range {v9 .. v14}, Lu6/v;->D(JJJ)J

    .line 1006
    .line 1007
    .line 1008
    move-result-wide v7

    .line 1009
    new-instance v0, LR5/p;

    .line 1010
    .line 1011
    invoke-direct/range {v0 .. v8}, LR5/p;-><init>(LR5/n;[J[II[J[IJ)V

    .line 1012
    .line 1013
    .line 1014
    return-object v0

    .line 1015
    :cond_24
    const/4 v15, 0x1

    .line 1016
    goto :goto_1d

    .line 1017
    :cond_25
    move v15, v8

    .line 1018
    :goto_1d
    if-ne v13, v15, :cond_26

    .line 1019
    .line 1020
    const/4 v15, 0x1

    .line 1021
    goto :goto_1e

    .line 1022
    :cond_26
    move/from16 v15, v18

    .line 1023
    .line 1024
    :goto_1e
    array-length v7, v0

    .line 1025
    new-array v7, v7, [I

    .line 1026
    .line 1027
    array-length v8, v0

    .line 1028
    new-array v8, v8, [I

    .line 1029
    .line 1030
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    move/from16 v17, v4

    .line 1034
    .line 1035
    move/from16 v10, v18

    .line 1036
    .line 1037
    move v11, v10

    .line 1038
    move v12, v11

    .line 1039
    move v13, v12

    .line 1040
    :goto_1f
    array-length v4, v0

    .line 1041
    if-ge v10, v4, :cond_2a

    .line 1042
    .line 1043
    move-object v4, v7

    .line 1044
    move-object/from16 v16, v8

    .line 1045
    .line 1046
    aget-wide v7, v14, v10

    .line 1047
    .line 1048
    const-wide/16 v22, -0x1

    .line 1049
    .line 1050
    cmp-long v22, v7, v22

    .line 1051
    .line 1052
    if-eqz v22, :cond_29

    .line 1053
    .line 1054
    aget-wide v23, v0, v10

    .line 1055
    .line 1056
    move/from16 v22, v10

    .line 1057
    .line 1058
    move/from16 p1, v11

    .line 1059
    .line 1060
    iget-wide v10, v1, LR5/n;->c:J

    .line 1061
    .line 1062
    move-wide/from16 v25, v10

    .line 1063
    .line 1064
    iget-wide v10, v1, LR5/n;->d:J

    .line 1065
    .line 1066
    move-wide/from16 v27, v10

    .line 1067
    .line 1068
    invoke-static/range {v23 .. v28}, Lu6/v;->D(JJJ)J

    .line 1069
    .line 1070
    .line 1071
    move-result-wide v10

    .line 1072
    move-object/from16 p2, v4

    .line 1073
    .line 1074
    const/4 v4, 0x1

    .line 1075
    invoke-static {v5, v7, v8, v4}, Lu6/v;->e([JJZ)I

    .line 1076
    .line 1077
    .line 1078
    move-result v19

    .line 1079
    aput v19, p2, v22

    .line 1080
    .line 1081
    add-long/2addr v7, v10

    .line 1082
    invoke-static {v5, v7, v8, v15}, Lu6/v;->b([JJZ)I

    .line 1083
    .line 1084
    .line 1085
    move-result v7

    .line 1086
    aput v7, v16, v22

    .line 1087
    .line 1088
    :goto_20
    aget v7, p2, v22

    .line 1089
    .line 1090
    aget v8, v16, v22

    .line 1091
    .line 1092
    if-ge v7, v8, :cond_27

    .line 1093
    .line 1094
    aget v10, v6, v7

    .line 1095
    .line 1096
    and-int/2addr v10, v4

    .line 1097
    if-nez v10, :cond_27

    .line 1098
    .line 1099
    add-int/lit8 v7, v7, 0x1

    .line 1100
    .line 1101
    aput v7, p2, v22

    .line 1102
    .line 1103
    goto :goto_20

    .line 1104
    :cond_27
    sub-int v10, v8, v7

    .line 1105
    .line 1106
    add-int/2addr v10, v12

    .line 1107
    if-eq v13, v7, :cond_28

    .line 1108
    .line 1109
    move v7, v4

    .line 1110
    goto :goto_21

    .line 1111
    :cond_28
    move/from16 v7, v18

    .line 1112
    .line 1113
    :goto_21
    or-int v7, p1, v7

    .line 1114
    .line 1115
    move v11, v7

    .line 1116
    move v13, v8

    .line 1117
    move v12, v10

    .line 1118
    goto :goto_22

    .line 1119
    :cond_29
    move-object/from16 p2, v4

    .line 1120
    .line 1121
    move/from16 v22, v10

    .line 1122
    .line 1123
    move/from16 p1, v11

    .line 1124
    .line 1125
    const/4 v4, 0x1

    .line 1126
    :goto_22
    add-int/lit8 v10, v22, 0x1

    .line 1127
    .line 1128
    move-object/from16 v7, p2

    .line 1129
    .line 1130
    move-object/from16 v8, v16

    .line 1131
    .line 1132
    goto :goto_1f

    .line 1133
    :cond_2a
    move-object/from16 p2, v7

    .line 1134
    .line 1135
    move-object/from16 v16, v8

    .line 1136
    .line 1137
    move/from16 p1, v11

    .line 1138
    .line 1139
    const/4 v4, 0x1

    .line 1140
    if-eq v12, v9, :cond_2b

    .line 1141
    .line 1142
    move v9, v4

    .line 1143
    goto :goto_23

    .line 1144
    :cond_2b
    move/from16 v9, v18

    .line 1145
    .line 1146
    :goto_23
    or-int v4, p1, v9

    .line 1147
    .line 1148
    if-eqz v4, :cond_2c

    .line 1149
    .line 1150
    new-array v7, v12, [J

    .line 1151
    .line 1152
    goto :goto_24

    .line 1153
    :cond_2c
    move-object v7, v2

    .line 1154
    :goto_24
    if-eqz v4, :cond_2d

    .line 1155
    .line 1156
    new-array v15, v12, [I

    .line 1157
    .line 1158
    goto :goto_25

    .line 1159
    :cond_2d
    move-object v15, v3

    .line 1160
    :goto_25
    if-eqz v4, :cond_2e

    .line 1161
    .line 1162
    move/from16 v17, v18

    .line 1163
    .line 1164
    :cond_2e
    if-eqz v4, :cond_2f

    .line 1165
    .line 1166
    new-array v8, v12, [I

    .line 1167
    .line 1168
    goto :goto_26

    .line 1169
    :cond_2f
    move-object v8, v6

    .line 1170
    :goto_26
    new-array v9, v12, [J

    .line 1171
    .line 1172
    move/from16 v10, v18

    .line 1173
    .line 1174
    move v11, v10

    .line 1175
    move-wide/from16 v22, v20

    .line 1176
    .line 1177
    :goto_27
    array-length v12, v0

    .line 1178
    if-ge v10, v12, :cond_33

    .line 1179
    .line 1180
    aget-wide v12, v14, v10

    .line 1181
    .line 1182
    move-object/from16 v18, v0

    .line 1183
    .line 1184
    aget v0, p2, v10

    .line 1185
    .line 1186
    move/from16 p1, v4

    .line 1187
    .line 1188
    aget v4, v16, v10

    .line 1189
    .line 1190
    move-object/from16 v19, v5

    .line 1191
    .line 1192
    if-eqz p1, :cond_30

    .line 1193
    .line 1194
    sub-int v5, v4, v0

    .line 1195
    .line 1196
    invoke-static {v2, v0, v7, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1197
    .line 1198
    .line 1199
    invoke-static {v3, v0, v15, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1200
    .line 1201
    .line 1202
    invoke-static {v6, v0, v8, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1203
    .line 1204
    .line 1205
    :cond_30
    move/from16 v5, v17

    .line 1206
    .line 1207
    :goto_28
    if-ge v0, v4, :cond_32

    .line 1208
    .line 1209
    const-wide/32 v24, 0xf4240

    .line 1210
    .line 1211
    .line 1212
    move-object/from16 v28, v2

    .line 1213
    .line 1214
    move-object/from16 v29, v3

    .line 1215
    .line 1216
    iget-wide v2, v1, LR5/n;->d:J

    .line 1217
    .line 1218
    move-wide/from16 v26, v2

    .line 1219
    .line 1220
    invoke-static/range {v22 .. v27}, Lu6/v;->D(JJJ)J

    .line 1221
    .line 1222
    .line 1223
    move-result-wide v2

    .line 1224
    aget-wide v24, v19, v0

    .line 1225
    .line 1226
    move-wide/from16 v26, v2

    .line 1227
    .line 1228
    sub-long v2, v24, v12

    .line 1229
    .line 1230
    move-object/from16 v24, v6

    .line 1231
    .line 1232
    move-object/from16 v30, v7

    .line 1233
    .line 1234
    move-wide/from16 v6, v20

    .line 1235
    .line 1236
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 1237
    .line 1238
    .line 1239
    move-result-wide v31

    .line 1240
    const-wide/32 v33, 0xf4240

    .line 1241
    .line 1242
    .line 1243
    iget-wide v2, v1, LR5/n;->c:J

    .line 1244
    .line 1245
    move-wide/from16 v35, v2

    .line 1246
    .line 1247
    invoke-static/range {v31 .. v36}, Lu6/v;->D(JJJ)J

    .line 1248
    .line 1249
    .line 1250
    move-result-wide v2

    .line 1251
    add-long v2, v26, v2

    .line 1252
    .line 1253
    aput-wide v2, v9, v11

    .line 1254
    .line 1255
    if-eqz p1, :cond_31

    .line 1256
    .line 1257
    aget v2, v15, v11

    .line 1258
    .line 1259
    if-le v2, v5, :cond_31

    .line 1260
    .line 1261
    aget v5, v29, v0

    .line 1262
    .line 1263
    :cond_31
    add-int/lit8 v11, v11, 0x1

    .line 1264
    .line 1265
    add-int/lit8 v0, v0, 0x1

    .line 1266
    .line 1267
    move-wide/from16 v20, v6

    .line 1268
    .line 1269
    move-object/from16 v6, v24

    .line 1270
    .line 1271
    move-object/from16 v2, v28

    .line 1272
    .line 1273
    move-object/from16 v3, v29

    .line 1274
    .line 1275
    move-object/from16 v7, v30

    .line 1276
    .line 1277
    goto :goto_28

    .line 1278
    :cond_32
    move-object/from16 v28, v2

    .line 1279
    .line 1280
    move-object/from16 v29, v3

    .line 1281
    .line 1282
    move-object/from16 v24, v6

    .line 1283
    .line 1284
    move-object/from16 v30, v7

    .line 1285
    .line 1286
    move-wide/from16 v6, v20

    .line 1287
    .line 1288
    aget-wide v2, v18, v10

    .line 1289
    .line 1290
    add-long v22, v22, v2

    .line 1291
    .line 1292
    add-int/lit8 v10, v10, 0x1

    .line 1293
    .line 1294
    move/from16 v4, p1

    .line 1295
    .line 1296
    move/from16 v17, v5

    .line 1297
    .line 1298
    move-object/from16 v0, v18

    .line 1299
    .line 1300
    move-object/from16 v5, v19

    .line 1301
    .line 1302
    move-object/from16 v6, v24

    .line 1303
    .line 1304
    move-object/from16 v2, v28

    .line 1305
    .line 1306
    move-object/from16 v3, v29

    .line 1307
    .line 1308
    move-object/from16 v7, v30

    .line 1309
    .line 1310
    goto/16 :goto_27

    .line 1311
    .line 1312
    :cond_33
    move-object/from16 v30, v7

    .line 1313
    .line 1314
    const-wide/32 v24, 0xf4240

    .line 1315
    .line 1316
    .line 1317
    iget-wide v2, v1, LR5/n;->d:J

    .line 1318
    .line 1319
    move-wide/from16 v26, v2

    .line 1320
    .line 1321
    invoke-static/range {v22 .. v27}, Lu6/v;->D(JJJ)J

    .line 1322
    .line 1323
    .line 1324
    move-result-wide v2

    .line 1325
    new-instance v0, LR5/p;

    .line 1326
    .line 1327
    move-object v6, v8

    .line 1328
    move-object v5, v9

    .line 1329
    move/from16 v4, v17

    .line 1330
    .line 1331
    move-wide v7, v2

    .line 1332
    move-object v3, v15

    .line 1333
    move-object/from16 v2, v30

    .line 1334
    .line 1335
    invoke-direct/range {v0 .. v8}, LR5/p;-><init>(LR5/n;[J[II[J[IJ)V

    .line 1336
    .line 1337
    .line 1338
    return-object v0

    .line 1339
    :cond_34
    const-string v0, "Track has no sample table size information"

    .line 1340
    .line 1341
    const/4 v1, 0x0

    .line 1342
    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    throw v0
.end method

.method public static e(LR5/a;LJ5/q;JLI5/c;ZZLk8/h;)Ljava/util/ArrayList;
    .locals 71

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    .line 2
    :goto_0
    iget-object v5, v0, LR5/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v4, v6, :cond_a1

    .line 3
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LR5/a;

    .line 4
    iget v6, v5, LH5/a;->b:I

    const v7, 0x7472616b

    if-eq v6, v7, :cond_0

    move-object/from16 v3, p1

    move-object/from16 v0, p7

    move/from16 v33, v4

    goto/16 :goto_70

    :cond_0
    const v6, 0x6d766864

    .line 5
    invoke-virtual {v0, v6}, LR5/a;->q(I)LR5/b;

    move-result-object v6

    .line 6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v7, 0x6d646961

    .line 7
    invoke-virtual {v5, v7}, LR5/a;->o(I)LR5/a;

    move-result-object v8

    .line 8
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, 0x68646c72    # 4.3148E24f

    .line 9
    invoke-virtual {v8, v9}, LR5/a;->q(I)LR5/b;

    move-result-object v9

    .line 10
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v9, v9, LR5/b;->c:LY4/b;

    const/16 v10, 0x10

    invoke-virtual {v9, v10}, LY4/b;->A(I)V

    .line 12
    invoke-virtual {v9}, LY4/b;->d()I

    move-result v9

    const v11, 0x736f756e

    const/4 v12, -0x1

    const/16 v16, 0x5

    if-ne v9, v11, :cond_1

    const/4 v9, 0x1

    goto :goto_2

    :cond_1
    const v11, 0x76696465

    if-ne v9, v11, :cond_2

    const/4 v9, 0x2

    goto :goto_2

    :cond_2
    const v11, 0x74657874

    if-eq v9, v11, :cond_5

    const v11, 0x7362746c

    if-eq v9, v11, :cond_5

    const v11, 0x73756274

    if-eq v9, v11, :cond_5

    const v11, 0x636c6370

    if-ne v9, v11, :cond_3

    goto :goto_1

    :cond_3
    const v11, 0x6d657461

    if-ne v9, v11, :cond_4

    move/from16 v9, v16

    goto :goto_2

    :cond_4
    move v9, v12

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v9, 0x3

    :goto_2
    const/16 v17, 0x3

    if-ne v9, v12, :cond_6

    move-object/from16 v0, p7

    move-object/from16 v39, v2

    move/from16 v33, v4

    const/4 v13, 0x0

    goto/16 :goto_6f

    :cond_6
    const v13, 0x746b6864

    .line 13
    invoke-virtual {v5, v13}, LR5/a;->q(I)LR5/b;

    move-result-object v13

    .line 14
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    iget-object v13, v13, LR5/b;->c:LY4/b;

    const/16 v15, 0x8

    invoke-virtual {v13, v15}, LY4/b;->A(I)V

    .line 16
    invoke-virtual {v13}, LY4/b;->d()I

    move-result v20

    .line 17
    invoke-static/range {v20 .. v20}, LH5/a;->n(I)I

    move-result v20

    if-nez v20, :cond_7

    move v14, v15

    goto :goto_3

    :cond_7
    move v14, v10

    .line 18
    :goto_3
    invoke-virtual {v13, v14}, LY4/b;->B(I)V

    .line 19
    invoke-virtual {v13}, LY4/b;->d()I

    move-result v14

    const/4 v3, 0x4

    .line 20
    invoke-virtual {v13, v3}, LY4/b;->B(I)V

    .line 21
    iget v11, v13, LY4/b;->b:I

    if-nez v20, :cond_8

    move v7, v3

    goto :goto_4

    :cond_8
    move v7, v15

    :goto_4
    const/4 v15, 0x0

    :goto_5
    const-wide/16 v23, 0x0

    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v15, v7, :cond_b

    .line 22
    iget-object v3, v13, LY4/b;->a:[B

    add-int v28, v11, v15

    .line 23
    aget-byte v3, v3, v28

    if-eq v3, v12, :cond_a

    if-nez v20, :cond_9

    .line 24
    invoke-virtual {v13}, LY4/b;->r()J

    move-result-wide v28

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, LY4/b;->u()J

    move-result-wide v28

    :goto_6
    cmp-long v3, v28, v23

    if-nez v3, :cond_c

    :goto_7
    move-wide/from16 v28, v25

    goto :goto_8

    :cond_a
    add-int/lit8 v15, v15, 0x1

    const/4 v3, 0x4

    goto :goto_5

    .line 25
    :cond_b
    invoke-virtual {v13, v7}, LY4/b;->B(I)V

    goto :goto_7

    .line 26
    :cond_c
    :goto_8
    invoke-virtual {v13, v10}, LY4/b;->B(I)V

    .line 27
    invoke-virtual {v13}, LY4/b;->d()I

    move-result v3

    .line 28
    invoke-virtual {v13}, LY4/b;->d()I

    move-result v7

    const/4 v11, 0x4

    .line 29
    invoke-virtual {v13, v11}, LY4/b;->B(I)V

    .line 30
    invoke-virtual {v13}, LY4/b;->d()I

    move-result v11

    .line 31
    invoke-virtual {v13}, LY4/b;->d()I

    move-result v13

    const/high16 v15, -0x10000

    const/high16 v12, 0x10000

    if-nez v3, :cond_d

    if-ne v7, v12, :cond_d

    if-ne v11, v15, :cond_d

    if-nez v13, :cond_d

    const/16 v3, 0x5a

    goto :goto_9

    :cond_d
    if-nez v3, :cond_e

    if-ne v7, v15, :cond_e

    if-ne v11, v12, :cond_e

    if-nez v13, :cond_e

    const/16 v3, 0x10e

    goto :goto_9

    :cond_e
    if-ne v3, v15, :cond_f

    if-nez v7, :cond_f

    if-nez v11, :cond_f

    if-ne v13, v15, :cond_f

    const/16 v3, 0xb4

    goto :goto_9

    :cond_f
    const/4 v3, 0x0

    :goto_9
    cmp-long v7, p2, v25

    if-nez v7, :cond_10

    move-wide/from16 v33, v28

    goto :goto_a

    :cond_10
    move-wide/from16 v33, p2

    .line 32
    :goto_a
    iget-object v6, v6, LR5/b;->c:LY4/b;

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, LY4/b;->A(I)V

    .line 33
    invoke-virtual {v6}, LY4/b;->d()I

    move-result v7

    .line 34
    invoke-static {v7}, LH5/a;->n(I)I

    move-result v7

    if-nez v7, :cond_11

    const/16 v7, 0x8

    goto :goto_b

    :cond_11
    move v7, v10

    .line 35
    :goto_b
    invoke-virtual {v6, v7}, LY4/b;->B(I)V

    .line 36
    invoke-virtual {v6}, LY4/b;->r()J

    move-result-wide v37

    cmp-long v6, v33, v25

    if-nez v6, :cond_12

    :goto_c
    const v6, 0x6d696e66

    goto :goto_d

    :cond_12
    const-wide/32 v35, 0xf4240

    .line 37
    invoke-static/range {v33 .. v38}, Lu6/v;->D(JJJ)J

    move-result-wide v25

    goto :goto_c

    .line 38
    :goto_d
    invoke-virtual {v8, v6}, LR5/a;->o(I)LR5/a;

    move-result-object v7

    .line 39
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x7374626c

    .line 40
    invoke-virtual {v7, v6}, LR5/a;->o(I)LR5/a;

    move-result-object v7

    .line 41
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x6d646864

    .line 42
    invoke-virtual {v8, v6}, LR5/a;->q(I)LR5/b;

    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    iget-object v6, v6, LR5/b;->c:LY4/b;

    const/16 v8, 0x8

    invoke-virtual {v6, v8}, LY4/b;->A(I)V

    .line 45
    invoke-virtual {v6}, LY4/b;->d()I

    move-result v8

    .line 46
    invoke-static {v8}, LH5/a;->n(I)I

    move-result v8

    if-nez v8, :cond_13

    const/16 v11, 0x8

    goto :goto_e

    :cond_13
    move v11, v10

    .line 47
    :goto_e
    invoke-virtual {v6, v11}, LY4/b;->B(I)V

    .line 48
    invoke-virtual {v6}, LY4/b;->r()J

    move-result-wide v11

    if-nez v8, :cond_14

    const/4 v8, 0x4

    goto :goto_f

    :cond_14
    const/16 v8, 0x8

    .line 49
    :goto_f
    invoke-virtual {v6, v8}, LY4/b;->B(I)V

    .line 50
    invoke-virtual {v6}, LY4/b;->v()I

    move-result v6

    .line 51
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v13, ""

    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    shr-int/lit8 v13, v6, 0xa

    and-int/lit8 v13, v13, 0x1f

    add-int/lit8 v13, v13, 0x60

    int-to-char v13, v13

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v13, v6, 0x5

    and-int/lit8 v13, v13, 0x1f

    add-int/lit8 v13, v13, 0x60

    int-to-char v13, v13

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v6, v6, 0x1f

    add-int/lit8 v6, v6, 0x60

    int-to-char v6, v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 52
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v8, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v6

    const v8, 0x73747364

    .line 53
    invoke-virtual {v7, v8}, LR5/a;->q(I)LR5/b;

    move-result-object v7

    .line 54
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    iget-object v8, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .line 56
    iget-object v7, v7, LR5/b;->c:LY4/b;

    const/16 v11, 0xc

    invoke-virtual {v7, v11}, LY4/b;->A(I)V

    .line 57
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v11

    .line 58
    new-array v12, v11, [LR5/o;

    move-wide/from16 v28, v23

    move-wide/from16 v24, v25

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    :goto_10
    if-ge v13, v11, :cond_97

    .line 59
    iget v10, v7, LY4/b;->b:I

    .line 60
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v0

    move/from16 v33, v4

    if-lez v0, :cond_15

    const/4 v4, 0x1

    :goto_11
    move/from16 v31, v9

    goto :goto_12

    :cond_15
    const/4 v4, 0x0

    goto :goto_11

    .line 61
    :goto_12
    const-string v9, "childAtomSize must be positive"

    invoke-static {v9, v4}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 62
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v4

    move/from16 v34, v11

    const v11, 0x61766331

    if-eq v4, v11, :cond_16

    const v11, 0x61766333

    if-eq v4, v11, :cond_16

    const v11, 0x656e6376

    if-eq v4, v11, :cond_16

    const v11, 0x6d317620

    if-eq v4, v11, :cond_16

    const v11, 0x6d703476

    if-eq v4, v11, :cond_16

    const v11, 0x68766331

    if-eq v4, v11, :cond_16

    const v11, 0x68657631

    if-eq v4, v11, :cond_16

    const v11, 0x73323633

    if-eq v4, v11, :cond_16

    const v11, 0x48323633

    if-eq v4, v11, :cond_16

    const v11, 0x76703038

    if-eq v4, v11, :cond_16

    const v11, 0x76703039

    if-eq v4, v11, :cond_16

    const v11, 0x61763031

    if-eq v4, v11, :cond_16

    const v11, 0x64766176

    if-eq v4, v11, :cond_16

    const v11, 0x64766131

    if-eq v4, v11, :cond_16

    const v11, 0x64766865

    if-eq v4, v11, :cond_16

    const v11, 0x64766831

    if-ne v4, v11, :cond_17

    :cond_16
    move/from16 v48, v0

    move-object/from16 v39, v2

    move/from16 v46, v3

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v47, v10

    move-object/from16 v63, v12

    move/from16 v64, v13

    move/from16 v53, v14

    move/from16 v70, v15

    const/4 v5, 0x0

    goto/16 :goto_3f

    :cond_17
    const v11, 0x656e6361

    move-object/from16 v63, v12

    const v12, 0x6d703461

    if-eq v4, v12, :cond_18

    if-eq v4, v11, :cond_18

    const v12, 0x61632d33

    if-eq v4, v12, :cond_18

    const v12, 0x65632d33

    if-eq v4, v12, :cond_18

    const v12, 0x61632d34

    if-eq v4, v12, :cond_18

    const v12, 0x6d6c7061

    if-eq v4, v12, :cond_18

    const v12, 0x64747363

    if-eq v4, v12, :cond_18

    const v12, 0x64747365

    if-eq v4, v12, :cond_18

    const v12, 0x64747368

    if-eq v4, v12, :cond_18

    const v12, 0x6474736c

    if-eq v4, v12, :cond_18

    const v12, 0x64747378

    if-eq v4, v12, :cond_18

    const v12, 0x73616d72

    if-eq v4, v12, :cond_18

    const v12, 0x73617762

    if-eq v4, v12, :cond_18

    const v12, 0x6c70636d

    if-eq v4, v12, :cond_18

    const v12, 0x736f7774

    if-eq v4, v12, :cond_18

    const v12, 0x74776f73

    if-eq v4, v12, :cond_18

    const v12, 0x2e6d7032

    if-eq v4, v12, :cond_18

    const v12, 0x2e6d7033

    if-eq v4, v12, :cond_18

    const v12, 0x6d686131

    if-eq v4, v12, :cond_18

    const v12, 0x6d686d31

    if-eq v4, v12, :cond_18

    const v12, 0x616c6163

    if-eq v4, v12, :cond_18

    const v12, 0x616c6177

    if-eq v4, v12, :cond_18

    const v12, 0x756c6177

    if-eq v4, v12, :cond_18

    const v12, 0x4f707573

    if-eq v4, v12, :cond_18

    const v12, 0x664c6143

    if-ne v4, v12, :cond_19

    :cond_18
    move/from16 v64, v13

    move/from16 v53, v14

    goto/16 :goto_1a

    :cond_19
    const v12, 0x77767474

    const v9, 0x74783367

    const v11, 0x54544d4c

    if-eq v4, v11, :cond_1d

    if-eq v4, v9, :cond_1d

    if-eq v4, v12, :cond_1d

    const v12, 0x73747070

    if-eq v4, v12, :cond_1d

    const v12, 0x63363038

    if-ne v4, v12, :cond_1a

    goto/16 :goto_16

    :cond_1a
    const v9, 0x6d657474

    if-ne v4, v9, :cond_1c

    add-int/lit8 v11, v10, 0x10

    .line 63
    invoke-virtual {v7, v11}, LY4/b;->A(I)V

    if-ne v4, v9, :cond_1b

    .line 64
    invoke-virtual {v7}, LY4/b;->l()Ljava/lang/String;

    .line 65
    invoke-virtual {v7}, LY4/b;->l()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1b

    .line 66
    new-instance v9, LE5/S;

    invoke-direct {v9}, LE5/S;-><init>()V

    .line 67
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v9, LE5/S;->a:Ljava/lang/String;

    .line 68
    iput-object v4, v9, LE5/S;->k:Ljava/lang/String;

    .line 69
    new-instance v4, LE5/T;

    invoke-direct {v4, v9}, LE5/T;-><init>(LE5/S;)V

    move-object/from16 v26, v4

    :cond_1b
    move/from16 v55, v0

    move-object/from16 v39, v2

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move-object/from16 v41, v8

    :goto_13
    move/from16 v47, v10

    move/from16 v64, v13

    move/from16 v53, v14

    :goto_14
    move/from16 v4, v17

    :goto_15
    const/4 v0, -0x1

    const/4 v6, 0x0

    const/16 v12, 0x10

    goto/16 :goto_69

    :cond_1c
    const v9, 0x63616d6d

    if-ne v4, v9, :cond_1b

    .line 70
    new-instance v4, LE5/S;

    invoke-direct {v4}, LE5/S;-><init>()V

    .line 71
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, LE5/S;->a:Ljava/lang/String;

    .line 72
    const-string v9, "application/x-camera-motion"

    iput-object v9, v4, LE5/S;->k:Ljava/lang/String;

    .line 73
    new-instance v9, LE5/T;

    invoke-direct {v9, v4}, LE5/T;-><init>(LE5/S;)V

    move/from16 v55, v0

    move-object/from16 v39, v2

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move-object/from16 v41, v8

    move-object/from16 v26, v9

    goto :goto_13

    :cond_1d
    :goto_16
    add-int/lit8 v12, v10, 0x10

    .line 74
    invoke-virtual {v7, v12}, LY4/b;->A(I)V

    .line 75
    const-string v12, "application/ttml+xml"

    const-wide v40, 0x7fffffffffffffffL

    if-ne v4, v11, :cond_1e

    :goto_17
    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v40

    :goto_18
    const/4 v4, 0x0

    goto :goto_19

    :cond_1e
    if-ne v4, v9, :cond_1f

    add-int/lit8 v4, v0, -0x10

    .line 76
    new-array v9, v4, [B

    const/4 v11, 0x0

    .line 77
    invoke-virtual {v7, v11, v4, v9}, LY4/b;->c(II[B)V

    .line 78
    invoke-static {v9}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v4

    .line 79
    const-string v12, "application/x-quicktime-tx3g"

    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v40

    goto :goto_19

    :cond_1f
    const v9, 0x77767474

    if-ne v4, v9, :cond_20

    .line 80
    const-string v12, "application/x-mp4-vtt"

    goto :goto_17

    :cond_20
    const v9, 0x73747070

    if-ne v4, v9, :cond_21

    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v28

    goto :goto_18

    :cond_21
    const v12, 0x63363038

    if-ne v4, v12, :cond_22

    .line 81
    const-string v12, "application/x-mp4-cea-608"

    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v40

    const/4 v4, 0x0

    const/4 v15, 0x1

    .line 82
    :goto_19
    new-instance v9, LE5/S;

    invoke-direct {v9}, LE5/S;-><init>()V

    .line 83
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v9, LE5/S;->a:Ljava/lang/String;

    .line 84
    iput-object v12, v9, LE5/S;->k:Ljava/lang/String;

    .line 85
    iput-object v8, v9, LE5/S;->c:Ljava/lang/String;

    .line 86
    iput-wide v13, v9, LE5/S;->o:J

    .line 87
    iput-object v4, v9, LE5/S;->m:Ljava/util/List;

    .line 88
    new-instance v4, LE5/T;

    invoke-direct {v4, v9}, LE5/T;-><init>(LE5/S;)V

    move/from16 v55, v0

    move-object/from16 v39, v2

    move-object/from16 v26, v4

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move-object/from16 v41, v8

    move/from16 v47, v10

    goto/16 :goto_14

    .line 89
    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :goto_1a
    add-int/lit8 v12, v10, 0x10

    .line 90
    invoke-virtual {v7, v12}, LY4/b;->A(I)V

    if-eqz p6, :cond_23

    .line 91
    invoke-virtual {v7}, LY4/b;->v()I

    move-result v12

    const/4 v13, 0x6

    .line 92
    invoke-virtual {v7, v13}, LY4/b;->B(I)V

    goto :goto_1b

    :cond_23
    const/16 v12, 0x8

    .line 93
    invoke-virtual {v7, v12}, LY4/b;->B(I)V

    const/4 v12, 0x0

    :goto_1b
    const/16 v13, 0x14

    if-eqz v12, :cond_26

    const/4 v14, 0x1

    if-ne v12, v14, :cond_24

    goto :goto_1c

    :cond_24
    const/4 v14, 0x2

    if-ne v12, v14, :cond_25

    const/16 v12, 0x10

    .line 94
    invoke-virtual {v7, v12}, LY4/b;->B(I)V

    .line 95
    invoke-virtual {v7}, LY4/b;->k()J

    move-result-wide v65

    invoke-static/range {v65 .. v66}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v65

    .line 96
    invoke-static/range {v65 .. v66}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    long-to-int v11, v11

    .line 97
    invoke-virtual {v7}, LY4/b;->t()I

    move-result v12

    .line 98
    invoke-virtual {v7, v13}, LY4/b;->B(I)V

    const/4 v13, 0x0

    goto :goto_1d

    :cond_25
    move/from16 v48, v0

    move-object/from16 v39, v2

    move/from16 v46, v3

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v47, v10

    move/from16 v70, v15

    const/4 v5, 0x0

    goto/16 :goto_3e

    .line 99
    :cond_26
    :goto_1c
    invoke-virtual {v7}, LY4/b;->v()I

    move-result v11

    const/4 v14, 0x6

    .line 100
    invoke-virtual {v7, v14}, LY4/b;->B(I)V

    .line 101
    iget-object v14, v7, LY4/b;->a:[B

    iget v13, v7, LY4/b;->b:I

    move/from16 v67, v11

    add-int/lit8 v11, v13, 0x1

    iput v11, v7, LY4/b;->b:I

    move/from16 v68, v11

    aget-byte v11, v14, v13

    and-int/lit16 v11, v11, 0xff

    const/16 v22, 0x8

    shl-int/lit8 v11, v11, 0x8

    move/from16 v69, v11

    add-int/lit8 v11, v13, 0x2

    iput v11, v7, LY4/b;->b:I

    aget-byte v11, v14, v68

    and-int/lit16 v11, v11, 0xff

    or-int v11, v69, v11

    add-int/lit8 v14, v13, 0x4

    .line 102
    iput v14, v7, LY4/b;->b:I

    .line 103
    invoke-virtual {v7, v13}, LY4/b;->A(I)V

    .line 104
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v13

    const/4 v14, 0x1

    if-ne v12, v14, :cond_27

    const/16 v12, 0x10

    .line 105
    invoke-virtual {v7, v12}, LY4/b;->B(I)V

    :cond_27
    move/from16 v12, v67

    .line 106
    :goto_1d
    iget v14, v7, LY4/b;->b:I

    move/from16 v67, v11

    const v11, 0x656e6361

    if-ne v4, v11, :cond_2a

    .line 107
    invoke-static {v7, v10, v0}, LR5/d;->c(LY4/b;II)Landroid/util/Pair;

    move-result-object v11

    if-eqz v11, :cond_29

    .line 108
    iget-object v4, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v1, :cond_28

    move/from16 v65, v4

    const/4 v4, 0x0

    goto :goto_1e

    :cond_28
    move/from16 v65, v4

    .line 109
    iget-object v4, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, LR5/o;

    iget-object v4, v4, LR5/o;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, LI5/c;->c(Ljava/lang/String;)LI5/c;

    move-result-object v4

    .line 110
    :goto_1e
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, LR5/o;

    aput-object v11, v63, v64

    move-object v11, v4

    move/from16 v4, v65

    goto :goto_1f

    :cond_29
    move-object v11, v1

    .line 111
    :goto_1f
    invoke-virtual {v7, v14}, LY4/b;->A(I)V

    :goto_20
    move/from16 v65, v12

    goto :goto_21

    :cond_2a
    move-object v11, v1

    goto :goto_20

    .line 112
    :goto_21
    const-string v12, "audio/ac4"

    const-string v68, "audio/eac3"

    move/from16 v69, v14

    const-string v14, "audio/ac3"

    move/from16 v70, v15

    const v15, 0x61632d33

    if-ne v4, v15, :cond_2b

    move-object v4, v14

    :goto_22
    const/4 v15, -0x1

    goto/16 :goto_26

    :cond_2b
    const v15, 0x65632d33

    if-ne v4, v15, :cond_2c

    move-object/from16 v4, v68

    goto :goto_22

    :cond_2c
    const v15, 0x61632d34

    if-ne v4, v15, :cond_2d

    move-object v4, v12

    goto :goto_22

    :cond_2d
    const v15, 0x64747363

    if-ne v4, v15, :cond_2e

    .line 113
    const-string v4, "audio/vnd.dts"

    goto :goto_22

    :cond_2e
    const v15, 0x64747368

    if-eq v4, v15, :cond_41

    const v15, 0x6474736c

    if-ne v4, v15, :cond_2f

    goto/16 :goto_25

    :cond_2f
    const v15, 0x64747365

    if-ne v4, v15, :cond_30

    .line 114
    const-string v4, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_22

    :cond_30
    const v15, 0x64747378

    if-ne v4, v15, :cond_31

    .line 115
    const-string v4, "audio/vnd.dts.uhd;profile=p2"

    goto :goto_22

    :cond_31
    const v15, 0x73616d72

    if-ne v4, v15, :cond_32

    .line 116
    const-string v4, "audio/3gpp"

    goto :goto_22

    :cond_32
    const v15, 0x73617762

    if-ne v4, v15, :cond_33

    .line 117
    const-string v4, "audio/amr-wb"

    goto :goto_22

    .line 118
    :cond_33
    const-string v15, "audio/raw"

    move-object/from16 v51, v15

    const v15, 0x6c70636d

    if-eq v4, v15, :cond_40

    const v15, 0x736f7774

    if-ne v4, v15, :cond_34

    goto/16 :goto_24

    :cond_34
    const v15, 0x74776f73

    if-ne v4, v15, :cond_35

    const/high16 v4, 0x10000000

    move v15, v4

    move-object/from16 v4, v51

    goto :goto_26

    :cond_35
    const v15, 0x2e6d7032

    if-eq v4, v15, :cond_3f

    const v15, 0x2e6d7033

    if-ne v4, v15, :cond_36

    goto :goto_23

    :cond_36
    const v15, 0x6d686131

    if-ne v4, v15, :cond_37

    .line 119
    const-string v4, "audio/mha1"

    goto :goto_22

    :cond_37
    const v15, 0x6d686d31

    if-ne v4, v15, :cond_38

    .line 120
    const-string v4, "audio/mhm1"

    goto :goto_22

    :cond_38
    const v15, 0x616c6163

    if-ne v4, v15, :cond_39

    .line 121
    const-string v4, "audio/alac"

    goto/16 :goto_22

    :cond_39
    const v15, 0x616c6177

    if-ne v4, v15, :cond_3a

    .line 122
    const-string v4, "audio/g711-alaw"

    goto/16 :goto_22

    :cond_3a
    const v15, 0x756c6177

    if-ne v4, v15, :cond_3b

    .line 123
    const-string v4, "audio/g711-mlaw"

    goto/16 :goto_22

    :cond_3b
    const v15, 0x4f707573

    if-ne v4, v15, :cond_3c

    .line 124
    const-string v4, "audio/opus"

    goto/16 :goto_22

    :cond_3c
    const v15, 0x664c6143

    if-ne v4, v15, :cond_3d

    .line 125
    const-string v4, "audio/flac"

    goto/16 :goto_22

    :cond_3d
    const v15, 0x6d6c7061

    if-ne v4, v15, :cond_3e

    .line 126
    const-string v4, "audio/true-hd"

    goto/16 :goto_22

    :cond_3e
    const/4 v4, 0x0

    goto/16 :goto_22

    .line 127
    :cond_3f
    :goto_23
    const-string v4, "audio/mpeg"

    goto/16 :goto_22

    :cond_40
    :goto_24
    move-object/from16 v4, v51

    const/4 v15, 0x2

    goto :goto_26

    .line 128
    :cond_41
    :goto_25
    const-string v4, "audio/vnd.dts.hd"

    goto/16 :goto_22

    :goto_26
    move-object/from16 v39, v2

    move/from16 v46, v3

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v47, v10

    move/from16 v10, v65

    move/from16 v2, v67

    move/from16 v6, v69

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v40, 0x0

    :goto_27
    sub-int v1, v6, v47

    if-ge v1, v0, :cond_5c

    .line 129
    invoke-virtual {v7, v6}, LY4/b;->A(I)V

    .line 130
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v1

    move/from16 v48, v0

    if-lez v1, :cond_42

    const/4 v0, 0x1

    goto :goto_28

    :cond_42
    const/4 v0, 0x0

    .line 131
    :goto_28
    invoke-static {v9, v0}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 132
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v0

    move-object/from16 v41, v3

    const v3, 0x6d686143

    if-ne v0, v3, :cond_43

    add-int/lit8 v0, v1, -0xd

    .line 133
    new-array v3, v0, [B

    move/from16 v42, v15

    add-int/lit8 v15, v6, 0xd

    .line 134
    invoke-virtual {v7, v15}, LY4/b;->A(I)V

    const/4 v15, 0x0

    .line 135
    invoke-virtual {v7, v15, v0, v3}, LY4/b;->c(II[B)V

    .line 136
    invoke-static {v3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v0

    move-object v3, v0

    move-object/from16 v50, v5

    move-object/from16 v49, v14

    :goto_29
    const/4 v5, 0x0

    :goto_2a
    const v15, 0x616c6163

    goto/16 :goto_3d

    :cond_43
    move/from16 v42, v15

    const v3, 0x65736473

    if-eq v0, v3, :cond_44

    if-eqz p6, :cond_45

    const v3, 0x77617665

    if-ne v0, v3, :cond_45

    const v3, 0x65736473

    :cond_44
    move-object/from16 v50, v5

    move-object/from16 v49, v14

    const/4 v5, 0x4

    const/16 v14, 0x14

    const v15, 0x616c6163

    goto/16 :goto_33

    .line 137
    :cond_45
    sget-object v3, LG5/b;->f:[I

    sget-object v15, LG5/b;->d:[I

    move-object/from16 v49, v3

    const v3, 0x64616333

    if-ne v0, v3, :cond_47

    add-int/lit8 v0, v6, 0x8

    .line 138
    invoke-virtual {v7, v0}, LY4/b;->A(I)V

    .line 139
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 140
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v3

    and-int/lit16 v3, v3, 0xc0

    const/16 v36, 0x6

    shr-int/lit8 v3, v3, 0x6

    .line 141
    aget v3, v15, v3

    .line 142
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v15

    and-int/lit8 v26, v15, 0x38

    shr-int/lit8 v26, v26, 0x3

    .line 143
    aget v26, v49, v26

    const/16 v27, 0x4

    and-int/lit8 v15, v15, 0x4

    if-eqz v15, :cond_46

    add-int/lit8 v26, v26, 0x1

    :cond_46
    move-object/from16 v50, v5

    move/from16 v15, v26

    .line 144
    new-instance v5, LE5/S;

    invoke-direct {v5}, LE5/S;-><init>()V

    .line 145
    iput-object v0, v5, LE5/S;->a:Ljava/lang/String;

    .line 146
    iput-object v14, v5, LE5/S;->k:Ljava/lang/String;

    .line 147
    iput v15, v5, LE5/S;->x:I

    .line 148
    iput v3, v5, LE5/S;->y:I

    .line 149
    iput-object v11, v5, LE5/S;->n:LI5/c;

    .line 150
    iput-object v8, v5, LE5/S;->c:Ljava/lang/String;

    .line 151
    new-instance v0, LE5/T;

    invoke-direct {v0, v5}, LE5/T;-><init>(LE5/S;)V

    move-object/from16 v26, v0

    move-object/from16 v49, v14

    :goto_2b
    const/4 v5, 0x4

    const/16 v14, 0x14

    const v15, 0x616c6163

    goto/16 :goto_32

    :cond_47
    move-object/from16 v50, v5

    const v3, 0x64656333

    if-ne v0, v3, :cond_4b

    add-int/lit8 v0, v6, 0x8

    .line 152
    invoke-virtual {v7, v0}, LY4/b;->A(I)V

    .line 153
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    .line 154
    invoke-virtual {v7, v3}, LY4/b;->B(I)V

    .line 155
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v3

    and-int/lit16 v3, v3, 0xc0

    const/16 v36, 0x6

    shr-int/lit8 v3, v3, 0x6

    .line 156
    aget v3, v15, v3

    .line 157
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v5

    and-int/lit8 v15, v5, 0xe

    const/16 v21, 0x1

    shr-int/lit8 v15, v15, 0x1

    .line 158
    aget v15, v49, v15

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_48

    add-int/lit8 v15, v15, 0x1

    .line 159
    :cond_48
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v5

    and-int/lit8 v5, v5, 0x1e

    shr-int/lit8 v5, v5, 0x1

    if-lez v5, :cond_49

    .line 160
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v5

    const/16 v19, 0x2

    and-int/lit8 v5, v5, 0x2

    if-eqz v5, :cond_49

    add-int/lit8 v15, v15, 0x2

    .line 161
    :cond_49
    invoke-virtual {v7}, LY4/b;->a()I

    move-result v5

    if-lez v5, :cond_4a

    .line 162
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v5

    const/16 v21, 0x1

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_4a

    .line 163
    const-string v5, "audio/eac3-joc"

    :goto_2c
    move-object/from16 v49, v14

    goto :goto_2d

    :cond_4a
    move-object/from16 v5, v68

    goto :goto_2c

    .line 164
    :goto_2d
    new-instance v14, LE5/S;

    invoke-direct {v14}, LE5/S;-><init>()V

    .line 165
    iput-object v0, v14, LE5/S;->a:Ljava/lang/String;

    .line 166
    iput-object v5, v14, LE5/S;->k:Ljava/lang/String;

    .line 167
    iput v15, v14, LE5/S;->x:I

    .line 168
    iput v3, v14, LE5/S;->y:I

    .line 169
    iput-object v11, v14, LE5/S;->n:LI5/c;

    .line 170
    iput-object v8, v14, LE5/S;->c:Ljava/lang/String;

    .line 171
    new-instance v0, LE5/T;

    invoke-direct {v0, v14}, LE5/T;-><init>(LE5/S;)V

    :goto_2e
    move-object/from16 v26, v0

    goto/16 :goto_2b

    :cond_4b
    move-object/from16 v49, v14

    const v3, 0x64616334

    if-ne v0, v3, :cond_4d

    add-int/lit8 v0, v6, 0x8

    .line 172
    invoke-virtual {v7, v0}, LY4/b;->A(I)V

    .line 173
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x1

    .line 174
    invoke-virtual {v7, v14}, LY4/b;->B(I)V

    .line 175
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v3

    and-int/lit8 v3, v3, 0x20

    shr-int/lit8 v3, v3, 0x5

    if-ne v3, v14, :cond_4c

    const v3, 0xbb80

    goto :goto_2f

    :cond_4c
    const v3, 0xac44

    .line 176
    :goto_2f
    new-instance v5, LE5/S;

    invoke-direct {v5}, LE5/S;-><init>()V

    .line 177
    iput-object v0, v5, LE5/S;->a:Ljava/lang/String;

    .line 178
    iput-object v12, v5, LE5/S;->k:Ljava/lang/String;

    const/4 v14, 0x2

    .line 179
    iput v14, v5, LE5/S;->x:I

    .line 180
    iput v3, v5, LE5/S;->y:I

    .line 181
    iput-object v11, v5, LE5/S;->n:LI5/c;

    .line 182
    iput-object v8, v5, LE5/S;->c:Ljava/lang/String;

    .line 183
    new-instance v0, LE5/T;

    invoke-direct {v0, v5}, LE5/T;-><init>(LE5/S;)V

    goto :goto_2e

    :cond_4d
    const v3, 0x646d6c70

    if-ne v0, v3, :cond_4f

    if-lez v13, :cond_4e

    move v2, v13

    move-object/from16 v3, v41

    const/4 v5, 0x0

    const/4 v10, 0x2

    goto/16 :goto_2a

    .line 184
    :cond_4e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object v0

    throw v0

    :cond_4f
    const v3, 0x64647473

    if-ne v0, v3, :cond_50

    .line 185
    new-instance v0, LE5/S;

    invoke-direct {v0}, LE5/S;-><init>()V

    .line 186
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, LE5/S;->a:Ljava/lang/String;

    .line 187
    iput-object v4, v0, LE5/S;->k:Ljava/lang/String;

    .line 188
    iput v10, v0, LE5/S;->x:I

    .line 189
    iput v2, v0, LE5/S;->y:I

    .line 190
    iput-object v11, v0, LE5/S;->n:LI5/c;

    .line 191
    iput-object v8, v0, LE5/S;->c:Ljava/lang/String;

    .line 192
    new-instance v3, LE5/T;

    invoke-direct {v3, v0}, LE5/T;-><init>(LE5/S;)V

    move-object/from16 v26, v3

    goto/16 :goto_2b

    :cond_50
    const v3, 0x644f7073

    if-ne v0, v3, :cond_51

    add-int/lit8 v0, v1, -0x8

    .line 193
    sget-object v3, LR5/d;->a:[B

    array-length v5, v3

    add-int/2addr v5, v0

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    add-int/lit8 v14, v6, 0x8

    .line 194
    invoke-virtual {v7, v14}, LY4/b;->A(I)V

    .line 195
    array-length v3, v3

    invoke-virtual {v7, v3, v0, v5}, LY4/b;->c(II[B)V

    .line 196
    invoke-static {v5}, LG5/b;->a([B)Ljava/util/ArrayList;

    move-result-object v0

    :goto_30
    move-object v3, v0

    goto/16 :goto_29

    :cond_51
    const v3, 0x64664c61

    if-ne v0, v3, :cond_52

    add-int/lit8 v0, v1, -0xc

    add-int/lit8 v3, v1, -0x8

    .line 197
    new-array v3, v3, [B

    const/16 v5, 0x66

    const/16 v32, 0x0

    .line 198
    aput-byte v5, v3, v32

    const/16 v5, 0x4c

    const/16 v21, 0x1

    .line 199
    aput-byte v5, v3, v21

    const/16 v5, 0x61

    const/16 v19, 0x2

    .line 200
    aput-byte v5, v3, v19

    const/16 v5, 0x43

    .line 201
    aput-byte v5, v3, v17

    add-int/lit8 v5, v6, 0xc

    .line 202
    invoke-virtual {v7, v5}, LY4/b;->A(I)V

    const/4 v5, 0x4

    .line 203
    invoke-virtual {v7, v5, v0, v3}, LY4/b;->c(II[B)V

    .line 204
    invoke-static {v3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v0

    goto :goto_30

    :cond_52
    const/4 v5, 0x4

    const v15, 0x616c6163

    if-ne v0, v15, :cond_53

    add-int/lit8 v0, v1, -0xc

    .line 205
    new-array v2, v0, [B

    add-int/lit8 v3, v6, 0xc

    .line 206
    invoke-virtual {v7, v3}, LY4/b;->A(I)V

    const/4 v3, 0x0

    .line 207
    invoke-virtual {v7, v3, v0, v2}, LY4/b;->c(II[B)V

    .line 208
    new-instance v0, LY4/b;

    invoke-direct {v0, v2}, LY4/b;-><init>([B)V

    const/16 v3, 0x9

    .line 209
    invoke-virtual {v0, v3}, LY4/b;->A(I)V

    .line 210
    invoke-virtual {v0}, LY4/b;->q()I

    move-result v3

    const/16 v14, 0x14

    .line 211
    invoke-virtual {v0, v14}, LY4/b;->A(I)V

    .line 212
    invoke-virtual {v0}, LY4/b;->t()I

    move-result v0

    .line 213
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    .line 214
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 215
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 216
    invoke-static {v2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v2

    move v5, v3

    move-object v3, v2

    move v2, v5

    move v10, v0

    :goto_31
    const/4 v5, 0x0

    goto/16 :goto_3d

    :cond_53
    const/16 v14, 0x14

    :goto_32
    move-object/from16 v3, v41

    goto :goto_31

    :goto_33
    if-ne v0, v3, :cond_54

    move v0, v6

    :goto_34
    const/4 v3, -0x1

    goto :goto_39

    .line 217
    :cond_54
    iget v0, v7, LY4/b;->b:I

    if-lt v0, v6, :cond_55

    const/4 v3, 0x1

    :goto_35
    const/4 v5, 0x0

    goto :goto_36

    :cond_55
    const/4 v3, 0x0

    goto :goto_35

    .line 218
    :goto_36
    invoke-static {v5, v3}, LS3/f;->k(Ljava/lang/String;Z)V

    :goto_37
    sub-int v3, v0, v6

    if-ge v3, v1, :cond_58

    .line 219
    invoke-virtual {v7, v0}, LY4/b;->A(I)V

    .line 220
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v3

    if-lez v3, :cond_56

    const/4 v5, 0x1

    goto :goto_38

    :cond_56
    const/4 v5, 0x0

    .line 221
    :goto_38
    invoke-static {v9, v5}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 222
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v5

    const v14, 0x65736473

    if-ne v5, v14, :cond_57

    goto :goto_34

    :cond_57
    add-int/2addr v0, v3

    const/16 v14, 0x14

    goto :goto_37

    :cond_58
    const/4 v0, -0x1

    goto :goto_34

    :goto_39
    if-eq v0, v3, :cond_5b

    .line 223
    invoke-static {v0, v7}, LR5/d;->a(ILY4/b;)LM2/b;

    move-result-object v0

    .line 224
    iget-object v4, v0, LM2/b;->a:Ljava/lang/String;

    iget-object v3, v0, LM2/b;->b:[B

    if-eqz v3, :cond_5a

    .line 225
    const-string v5, "audio/mp4a-latm"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_59

    .line 226
    new-instance v2, LJ5/y;

    .line 227
    array-length v5, v3

    const/4 v10, 0x6

    const/4 v14, 0x0

    invoke-direct {v2, v3, v5, v10, v14}, LJ5/y;-><init>([BIIB)V

    const/4 v5, 0x0

    .line 228
    invoke-static {v2, v5}, LG5/b;->f(LJ5/y;Z)LG5/a;

    move-result-object v2

    .line 229
    iget v10, v2, LG5/a;->a:I

    iget v14, v2, LG5/a;->b:I

    iget-object v2, v2, LG5/a;->c:Ljava/lang/String;

    move-object/from16 v50, v2

    move v2, v10

    move v10, v14

    goto :goto_3a

    :cond_59
    const/4 v5, 0x0

    .line 230
    :goto_3a
    invoke-static {v3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v3

    goto :goto_3c

    :cond_5a
    const/4 v5, 0x0

    :goto_3b
    move-object/from16 v3, v41

    goto :goto_3c

    :cond_5b
    const/4 v5, 0x0

    move-object/from16 v0, v40

    goto :goto_3b

    :goto_3c
    move-object/from16 v40, v0

    :goto_3d
    add-int/2addr v6, v1

    move/from16 v15, v42

    move/from16 v0, v48

    move-object/from16 v14, v49

    move-object/from16 v5, v50

    goto/16 :goto_27

    :cond_5c
    move/from16 v48, v0

    move-object/from16 v41, v3

    move-object/from16 v50, v5

    move/from16 v42, v15

    const/4 v5, 0x0

    if-nez v26, :cond_5e

    if-eqz v4, :cond_5e

    .line 231
    new-instance v0, LE5/S;

    invoke-direct {v0}, LE5/S;-><init>()V

    .line 232
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LE5/S;->a:Ljava/lang/String;

    .line 233
    iput-object v4, v0, LE5/S;->k:Ljava/lang/String;

    move-object/from16 v1, v50

    .line 234
    iput-object v1, v0, LE5/S;->h:Ljava/lang/String;

    .line 235
    iput v10, v0, LE5/S;->x:I

    .line 236
    iput v2, v0, LE5/S;->y:I

    move/from16 v4, v42

    .line 237
    iput v4, v0, LE5/S;->z:I

    move-object/from16 v3, v41

    .line 238
    iput-object v3, v0, LE5/S;->m:Ljava/util/List;

    .line 239
    iput-object v11, v0, LE5/S;->n:LI5/c;

    .line 240
    iput-object v8, v0, LE5/S;->c:Ljava/lang/String;

    if-eqz v40, :cond_5d

    move-object/from16 v1, v40

    .line 241
    iget-wide v2, v1, LM2/b;->c:J

    invoke-static {v2, v3}, LS3/f;->F(J)I

    move-result v2

    .line 242
    iput v2, v0, LE5/S;->f:I

    .line 243
    iget-wide v1, v1, LM2/b;->d:J

    invoke-static {v1, v2}, LS3/f;->F(J)I

    move-result v1

    .line 244
    iput v1, v0, LE5/S;->g:I

    .line 245
    :cond_5d
    new-instance v1, LE5/T;

    invoke-direct {v1, v0}, LE5/T;-><init>(LE5/S;)V

    move-object/from16 v26, v1

    :cond_5e
    :goto_3e
    move-object/from16 v41, v8

    move/from16 v4, v17

    move/from16 v3, v46

    move/from16 v55, v48

    move/from16 v15, v70

    goto/16 :goto_15

    :goto_3f
    add-int/lit8 v10, v47, 0x10

    .line 246
    invoke-virtual {v7, v10}, LY4/b;->A(I)V

    const/16 v12, 0x10

    .line 247
    invoke-virtual {v7, v12}, LY4/b;->B(I)V

    .line 248
    invoke-virtual {v7}, LY4/b;->v()I

    move-result v0

    .line 249
    invoke-virtual {v7}, LY4/b;->v()I

    move-result v1

    const/16 v2, 0x32

    .line 250
    invoke-virtual {v7, v2}, LY4/b;->B(I)V

    .line 251
    iget v2, v7, LY4/b;->b:I

    const v11, 0x656e6376

    if-ne v4, v11, :cond_61

    move/from16 v3, v47

    move/from16 v6, v48

    .line 252
    invoke-static {v7, v3, v6}, LR5/d;->c(LY4/b;II)Landroid/util/Pair;

    move-result-object v10

    if-eqz v10, :cond_60

    .line 253
    iget-object v4, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez p4, :cond_5f

    move-object/from16 v12, p4

    const/4 v11, 0x0

    goto :goto_40

    .line 254
    :cond_5f
    iget-object v11, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, LR5/o;

    iget-object v11, v11, LR5/o;->b:Ljava/lang/String;

    move-object/from16 v12, p4

    invoke-virtual {v12, v11}, LI5/c;->c(Ljava/lang/String;)LI5/c;

    move-result-object v11

    .line 255
    :goto_40
    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, LR5/o;

    aput-object v10, v63, v64

    goto :goto_41

    :cond_60
    move-object/from16 v12, p4

    move-object v11, v12

    .line 256
    :goto_41
    invoke-virtual {v7, v2}, LY4/b;->A(I)V

    goto :goto_42

    :cond_61
    move-object/from16 v12, p4

    move/from16 v3, v47

    move/from16 v6, v48

    move-object v11, v12

    .line 257
    :goto_42
    const-string v10, "video/3gpp"

    const v13, 0x6d317620

    if-ne v4, v13, :cond_62

    .line 258
    const-string v13, "video/mpeg"

    goto :goto_43

    :cond_62
    const v13, 0x48323633

    if-ne v4, v13, :cond_63

    move-object v13, v10

    goto :goto_43

    :cond_63
    const/4 v13, 0x0

    :goto_43
    const/high16 v14, 0x3f800000    # 1.0f

    move/from16 v47, v3

    move/from16 v43, v5

    move-object/from16 v41, v8

    move-object/from16 v42, v10

    move-object v5, v13

    move v15, v14

    move/from16 v50, v23

    const/4 v8, -0x1

    const/4 v10, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    const/16 v48, 0x0

    const/16 v49, -0x1

    const/16 v51, -0x1

    move v3, v2

    const/4 v2, 0x0

    :goto_44
    sub-int v12, v3, v47

    if-ge v12, v6, :cond_90

    .line 259
    invoke-virtual {v7, v3}, LY4/b;->A(I)V

    .line 260
    iget v12, v7, LY4/b;->b:I

    move/from16 v52, v3

    .line 261
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v3

    move/from16 v54, v10

    if-nez v3, :cond_64

    .line 262
    iget v10, v7, LY4/b;->b:I

    sub-int v10, v10, v47

    if-ne v10, v6, :cond_64

    :goto_45
    move-object/from16 v59, v2

    move/from16 v55, v6

    move/from16 v60, v8

    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v62, v15

    move/from16 v4, v17

    const/4 v6, 0x0

    const/16 v12, 0x10

    goto/16 :goto_65

    :cond_64
    if-lez v3, :cond_65

    const/4 v10, 0x1

    goto :goto_46

    :cond_65
    const/4 v10, 0x0

    .line 263
    :goto_46
    invoke-static {v9, v10}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 264
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v10

    move/from16 v55, v6

    const v6, 0x61766343

    if-ne v10, v6, :cond_68

    if-nez v5, :cond_66

    const/4 v2, 0x1

    :goto_47
    const/4 v5, 0x0

    goto :goto_48

    :cond_66
    const/4 v2, 0x0

    goto :goto_47

    .line 265
    :goto_48
    invoke-static {v5, v2}, LS3/f;->k(Ljava/lang/String;Z)V

    add-int/lit8 v12, v12, 0x8

    .line 266
    invoke-virtual {v7, v12}, LY4/b;->A(I)V

    .line 267
    invoke-static {v7}, Lv6/a;->a(LY4/b;)Lv6/a;

    move-result-object v2

    if-nez v43, :cond_67

    .line 268
    iget v15, v2, Lv6/a;->e:F

    .line 269
    :cond_67
    iget-object v5, v2, Lv6/a;->a:Ljava/util/ArrayList;

    iget v6, v2, Lv6/a;->b:I

    const-string v10, "video/avc"

    iget-object v2, v2, Lv6/a;->f:Ljava/lang/String;

    move-object v13, v2

    move/from16 v56, v4

    move-object v2, v5

    move/from16 v50, v6

    move-object/from16 v57, v9

    move-object v5, v10

    :goto_49
    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v4, v17

    :goto_4a
    const/4 v6, 0x0

    :goto_4b
    const/4 v10, 0x6

    const/16 v12, 0x10

    const v14, 0x65736473

    goto/16 :goto_64

    :cond_68
    const v6, 0x68766343

    if-ne v10, v6, :cond_6b

    if-nez v5, :cond_69

    const/4 v2, 0x1

    :goto_4c
    const/4 v5, 0x0

    goto :goto_4d

    :cond_69
    const/4 v2, 0x0

    goto :goto_4c

    .line 270
    :goto_4d
    invoke-static {v5, v2}, LS3/f;->k(Ljava/lang/String;Z)V

    add-int/lit8 v12, v12, 0x8

    .line 271
    invoke-virtual {v7, v12}, LY4/b;->A(I)V

    .line 272
    invoke-static {v7}, Lv6/c;->a(LY4/b;)Lv6/c;

    move-result-object v2

    if-nez v43, :cond_6a

    .line 273
    iget v15, v2, Lv6/c;->c:F

    .line 274
    :cond_6a
    iget v5, v2, Lv6/c;->b:I

    const-string v6, "video/hevc"

    iget-object v10, v2, Lv6/c;->a:Ljava/util/List;

    iget-object v2, v2, Lv6/c;->d:Ljava/lang/String;

    move-object v13, v2

    move/from16 v56, v4

    move/from16 v50, v5

    move-object v5, v6

    move-object/from16 v57, v9

    move-object v2, v10

    goto :goto_49

    :cond_6b
    const v6, 0x64766343

    if-eq v10, v6, :cond_6c

    const v6, 0x64767643

    if-ne v10, v6, :cond_6d

    :cond_6c
    move-object/from16 v59, v2

    move/from16 v56, v4

    move/from16 v60, v8

    move-object/from16 v57, v9

    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v62, v15

    move/from16 v4, v17

    const/4 v6, 0x0

    const/4 v10, 0x6

    const/16 v12, 0x10

    const v14, 0x65736473

    goto/16 :goto_63

    :cond_6d
    const v6, 0x76706343

    if-ne v10, v6, :cond_70

    if-nez v5, :cond_6e

    const/4 v5, 0x1

    :goto_4e
    const/4 v6, 0x0

    goto :goto_4f

    :cond_6e
    const/4 v5, 0x0

    goto :goto_4e

    .line 275
    :goto_4f
    invoke-static {v6, v5}, LS3/f;->k(Ljava/lang/String;Z)V

    const v6, 0x76703038

    if-ne v4, v6, :cond_6f

    .line 276
    const-string v5, "video/x-vnd.on2.vp8"

    goto :goto_50

    :cond_6f
    const-string v5, "video/x-vnd.on2.vp9"

    :goto_50
    move/from16 v56, v4

    :goto_51
    move-object/from16 v57, v9

    goto :goto_49

    :cond_70
    const v6, 0x61763143

    if-ne v10, v6, :cond_72

    if-nez v5, :cond_71

    const/4 v5, 0x1

    :goto_52
    const/4 v6, 0x0

    goto :goto_53

    :cond_71
    const/4 v5, 0x0

    goto :goto_52

    .line 277
    :goto_53
    invoke-static {v6, v5}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 278
    const-string v5, "video/av01"

    goto :goto_50

    :cond_72
    const v6, 0x636c6c69

    const/16 v56, 0x19

    if-ne v10, v6, :cond_74

    if-nez v23, :cond_73

    .line 279
    invoke-static/range {v56 .. v56}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v6

    goto :goto_54

    :cond_73
    move-object/from16 v6, v23

    :goto_54
    const/16 v10, 0x15

    .line 280
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 281
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v10

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 282
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v10

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move/from16 v56, v4

    move-object/from16 v23, v6

    goto :goto_51

    :cond_74
    const v6, 0x6d646376

    if-ne v10, v6, :cond_76

    if-nez v23, :cond_75

    .line 283
    invoke-static/range {v56 .. v56}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v6

    goto :goto_55

    :cond_75
    move-object/from16 v6, v23

    .line 284
    :goto_55
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v10

    .line 285
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v12

    move/from16 v56, v4

    .line 286
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v4

    move-object/from16 v57, v9

    .line 287
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v9

    move-object/from16 v58, v11

    .line 288
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v11

    move-object/from16 v59, v2

    .line 289
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v2

    move/from16 v60, v8

    .line 290
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v8

    move-object/from16 v61, v14

    .line 291
    invoke-virtual {v7}, LY4/b;->n()S

    move-result v14

    .line 292
    invoke-virtual {v7}, LY4/b;->r()J

    move-result-wide v65

    .line 293
    invoke-virtual {v7}, LY4/b;->r()J

    move-result-wide v67

    move/from16 v62, v15

    const/4 v15, 0x1

    .line 294
    invoke-virtual {v6, v15}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 295
    invoke-virtual {v6, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 296
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 297
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 298
    invoke-virtual {v6, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 299
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 300
    invoke-virtual {v6, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 301
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 302
    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v8, 0x2710

    .line 303
    div-long v10, v65, v8

    long-to-int v2, v10

    int-to-short v2, v2

    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 304
    div-long v8, v67, v8

    long-to-int v2, v8

    int-to-short v2, v2

    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v23, v6

    move/from16 v4, v17

    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    goto/16 :goto_4a

    :cond_76
    move-object/from16 v59, v2

    move/from16 v56, v4

    move/from16 v60, v8

    move-object/from16 v57, v9

    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v62, v15

    const v2, 0x64323633

    if-ne v10, v2, :cond_78

    if-nez v5, :cond_77

    const/4 v2, 0x1

    :goto_56
    const/4 v6, 0x0

    goto :goto_57

    :cond_77
    const/4 v2, 0x0

    goto :goto_56

    .line 305
    :goto_57
    invoke-static {v6, v2}, LS3/f;->k(Ljava/lang/String;Z)V

    move/from16 v4, v17

    move-object/from16 v5, v42

    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    goto/16 :goto_4b

    :cond_78
    const/4 v6, 0x0

    const v14, 0x65736473

    if-ne v10, v14, :cond_7c

    if-nez v5, :cond_79

    const/4 v2, 0x1

    goto :goto_58

    :cond_79
    const/4 v2, 0x0

    .line 306
    :goto_58
    invoke-static {v6, v2}, LS3/f;->k(Ljava/lang/String;Z)V

    .line 307
    invoke-static {v12, v7}, LR5/d;->a(ILY4/b;)LM2/b;

    move-result-object v2

    .line 308
    iget-object v4, v2, LM2/b;->b:[B

    if-eqz v4, :cond_7a

    .line 309
    invoke-static {v4}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v4

    move-object/from16 v59, v4

    .line 310
    :cond_7a
    iget-object v4, v2, LM2/b;->a:Ljava/lang/String;

    move-object/from16 v48, v2

    move-object v5, v4

    :goto_59
    move/from16 v4, v17

    :cond_7b
    :goto_5a
    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    const/4 v10, 0x6

    const/16 v12, 0x10

    goto/16 :goto_64

    :cond_7c
    const v2, 0x70617370

    if-ne v10, v2, :cond_7d

    add-int/lit8 v12, v12, 0x8

    .line 311
    invoke-virtual {v7, v12}, LY4/b;->A(I)V

    .line 312
    invoke-virtual {v7}, LY4/b;->t()I

    move-result v2

    .line 313
    invoke-virtual {v7}, LY4/b;->t()I

    move-result v4

    int-to-float v2, v2

    int-to-float v4, v4

    div-float/2addr v2, v4

    move v15, v2

    move/from16 v4, v17

    move-object/from16 v2, v59

    move/from16 v8, v60

    const/4 v10, 0x6

    const/16 v12, 0x10

    const/16 v43, 0x1

    goto/16 :goto_64

    :cond_7d
    const v2, 0x73763364

    if-ne v10, v2, :cond_80

    add-int/lit8 v2, v12, 0x8

    :goto_5b
    sub-int v4, v2, v12

    if-ge v4, v3, :cond_7f

    .line 314
    invoke-virtual {v7, v2}, LY4/b;->A(I)V

    .line 315
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v4

    .line 316
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v8

    const v9, 0x70726f6a

    if-ne v8, v9, :cond_7e

    .line 317
    iget-object v8, v7, LY4/b;->a:[B

    add-int/2addr v4, v2

    .line 318
    invoke-static {v8, v2, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    goto :goto_5c

    :cond_7e
    add-int/2addr v2, v4

    goto :goto_5b

    :cond_7f
    move-object v2, v6

    :goto_5c
    move-object/from16 v61, v2

    goto :goto_59

    :cond_80
    const v2, 0x73743364

    if-ne v10, v2, :cond_85

    .line 319
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v2

    move/from16 v4, v17

    .line 320
    invoke-virtual {v7, v4}, LY4/b;->B(I)V

    if-nez v2, :cond_7b

    .line 321
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v2

    if-eqz v2, :cond_84

    const/4 v15, 0x1

    if-eq v2, v15, :cond_83

    const/4 v8, 0x2

    if-eq v2, v8, :cond_82

    if-eq v2, v4, :cond_81

    goto :goto_5a

    :cond_81
    move/from16 v60, v4

    goto :goto_5a

    :cond_82
    const/16 v60, 0x2

    goto :goto_5a

    :cond_83
    const/16 v60, 0x1

    goto :goto_5a

    :cond_84
    const/16 v60, 0x0

    goto/16 :goto_5a

    :cond_85
    move/from16 v4, v17

    const v2, 0x636f6c72

    if-ne v10, v2, :cond_87

    .line 322
    invoke-virtual {v7}, LY4/b;->d()I

    move-result v2

    const v8, 0x6e636c78

    if-eq v2, v8, :cond_88

    const v8, 0x6e636c63

    if-ne v2, v8, :cond_86

    goto :goto_5d

    .line 323
    :cond_86
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Unsupported color type: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, LH5/a;->e(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v8, "AtomParsers"

    invoke-static {v8, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    :cond_87
    const/4 v10, 0x6

    const/16 v12, 0x10

    goto :goto_62

    .line 324
    :cond_88
    :goto_5d
    invoke-virtual {v7}, LY4/b;->v()I

    move-result v2

    .line 325
    invoke-virtual {v7}, LY4/b;->v()I

    move-result v8

    const/4 v9, 0x2

    .line 326
    invoke-virtual {v7, v9}, LY4/b;->B(I)V

    const/16 v9, 0x13

    if-ne v3, v9, :cond_89

    .line 327
    invoke-virtual {v7}, LY4/b;->q()I

    move-result v9

    and-int/lit16 v9, v9, 0x80

    if-eqz v9, :cond_89

    const/4 v9, 0x1

    goto :goto_5e

    :cond_89
    const/4 v9, 0x0

    .line 328
    :goto_5e
    invoke-static {v2}, Lv6/b;->a(I)I

    move-result v2

    if-eqz v9, :cond_8a

    const/4 v9, 0x1

    :goto_5f
    const/4 v15, 0x1

    goto :goto_60

    :cond_8a
    const/4 v9, 0x2

    goto :goto_5f

    :goto_60
    if-eq v8, v15, :cond_8d

    const/16 v12, 0x10

    if-eq v8, v12, :cond_8c

    const/16 v10, 0x12

    const/4 v11, 0x7

    if-eq v8, v10, :cond_8b

    const/4 v10, 0x6

    if-eq v8, v10, :cond_8e

    if-eq v8, v11, :cond_8e

    const/4 v11, -0x1

    goto :goto_61

    :cond_8b
    const/4 v10, 0x6

    goto :goto_61

    :cond_8c
    const/4 v10, 0x6

    move v11, v10

    goto :goto_61

    :cond_8d
    const/4 v10, 0x6

    const/16 v12, 0x10

    :cond_8e
    move v11, v4

    :goto_61
    move/from16 v54, v2

    move/from16 v51, v9

    move/from16 v49, v11

    :cond_8f
    :goto_62
    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    goto :goto_64

    .line 329
    :goto_63
    invoke-static {v7}, LB8/e;->f(LY4/b;)LB8/e;

    move-result-object v2

    if-eqz v2, :cond_8f

    .line 330
    iget-object v13, v2, LB8/e;->b:Ljava/lang/String;

    const-string v5, "video/dolby-vision"

    goto :goto_62

    :goto_64
    add-int v3, v52, v3

    move/from16 v17, v4

    move/from16 v10, v54

    move/from16 v6, v55

    move/from16 v4, v56

    move-object/from16 v9, v57

    move-object/from16 v11, v58

    move-object/from16 v14, v61

    goto/16 :goto_44

    :cond_90
    move/from16 v54, v10

    goto/16 :goto_45

    :goto_65
    if-nez v5, :cond_91

    move/from16 v3, v46

    const/4 v0, -0x1

    goto/16 :goto_68

    .line 331
    :cond_91
    new-instance v2, LE5/S;

    invoke-direct {v2}, LE5/S;-><init>()V

    .line 332
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, LE5/S;->a:Ljava/lang/String;

    .line 333
    iput-object v5, v2, LE5/S;->k:Ljava/lang/String;

    .line 334
    iput-object v13, v2, LE5/S;->h:Ljava/lang/String;

    .line 335
    iput v0, v2, LE5/S;->p:I

    .line 336
    iput v1, v2, LE5/S;->q:I

    move/from16 v14, v62

    .line 337
    iput v14, v2, LE5/S;->t:F

    move/from16 v3, v46

    .line 338
    iput v3, v2, LE5/S;->s:I

    move-object/from16 v0, v61

    .line 339
    iput-object v0, v2, LE5/S;->u:[B

    move/from16 v8, v60

    .line 340
    iput v8, v2, LE5/S;->v:I

    move-object/from16 v0, v59

    .line 341
    iput-object v0, v2, LE5/S;->m:Ljava/util/List;

    move-object/from16 v11, v58

    .line 342
    iput-object v11, v2, LE5/S;->n:LI5/c;

    move/from16 v1, v54

    const/4 v0, -0x1

    if-ne v1, v0, :cond_92

    move/from16 v5, v51

    move/from16 v8, v49

    if-ne v5, v0, :cond_93

    if-ne v8, v0, :cond_93

    if-eqz v23, :cond_95

    goto :goto_66

    :cond_92
    move/from16 v8, v49

    move/from16 v5, v51

    .line 343
    :cond_93
    :goto_66
    new-instance v9, Lv6/b;

    if-eqz v23, :cond_94

    .line 344
    invoke-virtual/range {v23 .. v23}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v10

    goto :goto_67

    :cond_94
    move-object v10, v6

    :goto_67
    invoke-direct {v9, v1, v10, v5, v8}, Lv6/b;-><init>(I[BII)V

    .line 345
    iput-object v9, v2, LE5/S;->w:Lv6/b;

    :cond_95
    if-eqz v48, :cond_96

    move-object/from16 v1, v48

    .line 346
    iget-wide v8, v1, LM2/b;->c:J

    invoke-static {v8, v9}, LS3/f;->F(J)I

    move-result v5

    .line 347
    iput v5, v2, LE5/S;->f:I

    .line 348
    iget-wide v8, v1, LM2/b;->d:J

    invoke-static {v8, v9}, LS3/f;->F(J)I

    move-result v1

    .line 349
    iput v1, v2, LE5/S;->g:I

    .line 350
    :cond_96
    new-instance v1, LE5/T;

    invoke-direct {v1, v2}, LE5/T;-><init>(LE5/S;)V

    move-object/from16 v26, v1

    :goto_68
    move/from16 v23, v50

    move/from16 v15, v70

    :goto_69
    add-int v10, v47, v55

    .line 351
    invoke-virtual {v7, v10}, LY4/b;->A(I)V

    add-int/lit8 v13, v64, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move/from16 v17, v4

    move v10, v12

    move/from16 v9, v31

    move/from16 v4, v33

    move/from16 v11, v34

    move-object/from16 v2, v39

    move-object/from16 v8, v41

    move-object/from16 v6, v44

    move-object/from16 v5, v45

    move/from16 v14, v53

    move-object/from16 v12, v63

    goto/16 :goto_10

    :cond_97
    move-object/from16 v39, v2

    move/from16 v33, v4

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v31, v9

    move-object/from16 v63, v12

    move/from16 v53, v14

    move/from16 v70, v15

    const/4 v6, 0x0

    if-nez p5, :cond_9d

    const v0, 0x65647473

    move-object/from16 v5, v45

    .line 352
    invoke-virtual {v5, v0}, LR5/a;->o(I)LR5/a;

    move-result-object v0

    if-eqz v0, :cond_9e

    const v1, 0x656c7374

    .line 353
    invoke-virtual {v0, v1}, LR5/a;->q(I)LR5/b;

    move-result-object v0

    if-nez v0, :cond_98

    move-object v1, v6

    goto :goto_6d

    .line 354
    :cond_98
    iget-object v0, v0, LR5/b;->c:LY4/b;

    const/16 v8, 0x8

    invoke-virtual {v0, v8}, LY4/b;->A(I)V

    .line 355
    invoke-virtual {v0}, LY4/b;->d()I

    move-result v1

    .line 356
    invoke-static {v1}, LH5/a;->n(I)I

    move-result v1

    .line 357
    invoke-virtual {v0}, LY4/b;->t()I

    move-result v2

    .line 358
    new-array v3, v2, [J

    .line 359
    new-array v4, v2, [J

    const/4 v11, 0x0

    :goto_6a
    if-ge v11, v2, :cond_9c

    const/4 v14, 0x1

    if-ne v1, v14, :cond_99

    .line 360
    invoke-virtual {v0}, LY4/b;->u()J

    move-result-wide v7

    goto :goto_6b

    :cond_99
    invoke-virtual {v0}, LY4/b;->r()J

    move-result-wide v7

    :goto_6b
    aput-wide v7, v3, v11

    if-ne v1, v14, :cond_9a

    .line 361
    invoke-virtual {v0}, LY4/b;->k()J

    move-result-wide v7

    goto :goto_6c

    :cond_9a
    invoke-virtual {v0}, LY4/b;->d()I

    move-result v7

    int-to-long v7, v7

    :goto_6c
    aput-wide v7, v4, v11

    .line 362
    invoke-virtual {v0}, LY4/b;->n()S

    move-result v7

    if-ne v7, v14, :cond_9b

    const/4 v8, 0x2

    .line 363
    invoke-virtual {v0, v8}, LY4/b;->B(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_6a

    .line 364
    :cond_9b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 365
    :cond_9c
    invoke-static {v3, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    :goto_6d
    if-eqz v1, :cond_9e

    .line 366
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, [J

    .line 367
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [J

    move-object/from16 v30, v0

    goto :goto_6e

    :cond_9d
    move-object/from16 v5, v45

    :cond_9e
    move-object v1, v6

    move-object/from16 v30, v1

    :goto_6e
    if-nez v26, :cond_9f

    move-object/from16 v0, p7

    move-object v13, v6

    goto :goto_6f

    .line 368
    :cond_9f
    new-instance v17, LR5/n;

    move-object/from16 v0, v44

    .line 369
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    .line 370
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    move/from16 v29, v23

    move/from16 v19, v31

    move-wide/from16 v22, v37

    move/from16 v18, v53

    move-object/from16 v28, v63

    move/from16 v27, v70

    move-object/from16 v31, v1

    invoke-direct/range {v17 .. v31}, LR5/n;-><init>(IIJJJLE5/T;I[LR5/o;I[J[J)V

    move-object/from16 v0, p7

    move-object/from16 v13, v17

    .line 371
    :goto_6f
    invoke-interface {v0, v13}, Lk8/h;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LR5/n;

    if-nez v1, :cond_a0

    move-object/from16 v3, p1

    move-object/from16 v2, v39

    goto :goto_70

    :cond_a0
    const v2, 0x6d646961

    .line 372
    invoke-virtual {v5, v2}, LR5/a;->o(I)LR5/a;

    move-result-object v2

    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x6d696e66

    .line 374
    invoke-virtual {v2, v6}, LR5/a;->o(I)LR5/a;

    move-result-object v2

    .line 375
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x7374626c

    .line 376
    invoke-virtual {v2, v6}, LR5/a;->o(I)LR5/a;

    move-result-object v2

    .line 377
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, p1

    .line 378
    invoke-static {v1, v2, v3}, LR5/d;->d(LR5/n;LR5/a;LJ5/q;)LR5/p;

    move-result-object v1

    move-object/from16 v2, v39

    .line 379
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_70
    add-int/lit8 v4, v33, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    goto/16 :goto_0

    :cond_a1
    return-object v2
.end method
