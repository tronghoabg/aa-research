.class public abstract LM2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, LQ1/x;->a:I

    .line 2
    .line 3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

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
    sput-object v0, LM2/g;->a:[B

    .line 12
    .line 13
    return-void
.end method

.method public static a(ILQ1/o;)LM2/b;
    .locals 10

    .line 1
    add-int/lit8 p0, p0, 0xc

    .line 2
    .line 3
    invoke-virtual {p1, p0}, LQ1/o;->G(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, LQ1/o;->H(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, LM2/g;->b(LQ1/o;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0}, LQ1/o;->H(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, LQ1/o;->u()I

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
    invoke-virtual {p1, v0}, LQ1/o;->H(I)V

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
    invoke-virtual {p1}, LQ1/o;->u()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v2}, LQ1/o;->H(I)V

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
    invoke-virtual {p1, v0}, LQ1/o;->H(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1, p0}, LQ1/o;->H(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, LM2/g;->b(LQ1/o;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LQ1/o;->u()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, LN1/C;->e(I)Ljava/lang/String;

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
    invoke-virtual {p1, v0}, LQ1/o;->H(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, LQ1/o;->w()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p1}, LQ1/o;->w()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p1, p0}, LQ1/o;->H(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, LM2/g;->b(LQ1/o;)I

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
    invoke-virtual {p1, v6, p0, v3}, LQ1/o;->f(II[B)V

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

.method public static b(LQ1/o;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, LQ1/o;->u()I

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
    invoke-virtual {p0}, LQ1/o;->u()I

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

.method public static c(I)I
    .locals 0

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method public static d(LQ1/o;)LR1/e;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LQ1/o;->G(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LQ1/o;->h()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, LM2/g;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, LQ1/o;->w()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, LQ1/o;->w()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, LQ1/o;->o()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, LQ1/o;->o()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, LQ1/o;->w()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, LR1/e;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, LR1/e;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
.end method

.method public static e(LQ1/o;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LQ1/o;->b:I

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
    invoke-virtual {v0, v1}, LQ1/o;->G(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LQ1/o;->h()I

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
    invoke-static {v8, v7}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LQ1/o;->h()I

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
    invoke-virtual {v0, v7}, LQ1/o;->G(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    invoke-virtual {v0}, LQ1/o;->h()I

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
    invoke-virtual {v0}, LQ1/o;->h()I

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
    invoke-virtual {v0, v14}, LQ1/o;->H(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {v0, v14, v3}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

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
    invoke-static {v7, v3}, Ls2/a;->e(Ljava/lang/String;Z)V

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
    invoke-static {v7, v3}, Ls2/a;->e(Ljava/lang/String;Z)V

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
    invoke-virtual {v0, v3}, LQ1/o;->G(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v0}, LQ1/o;->h()I

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
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, LM2/g;->c(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v0, v6}, LQ1/o;->H(I)V

    .line 192
    .line 193
    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v0, v6}, LQ1/o;->H(I)V

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
    invoke-virtual {v0}, LQ1/o;->u()I

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
    invoke-virtual {v0}, LQ1/o;->u()I

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
    invoke-virtual {v0}, LQ1/o;->u()I

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
    invoke-virtual {v0, v5, v7, v13}, LQ1/o;->f(II[B)V

    .line 233
    .line 234
    .line 235
    if-eqz v10, :cond_b

    .line 236
    .line 237
    if-nez v12, :cond_b

    .line 238
    .line 239
    invoke-virtual {v0}, LQ1/o;->u()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    new-array v8, v7, [B

    .line 244
    .line 245
    invoke-virtual {v0, v5, v7, v8}, LQ1/o;->f(II[B)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v8

    .line 249
    .line 250
    :cond_b
    new-instance v9, LM2/t;

    .line 251
    .line 252
    move-object v8, v3

    .line 253
    invoke-direct/range {v9 .. v16}, LM2/t;-><init>(ZLjava/lang/String;I[BII[B)V

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
    invoke-static {v6, v5}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 270
    .line 271
    .line 272
    sget v5, LQ1/x;->a:I

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

.method public static f(LQ1/o;IILjava/lang/String;LN1/j;Z)LM2/d;
    .locals 62

    move-object/from16 v0, p0

    move-object/from16 v9, p3

    .line 1
    const-string v1, "audio/mhm1"

    const-string v16, "audio/ac4"

    const-string v17, "audio/eac3"

    const-wide/16 v18, 0x0

    const/16 v4, 0xc

    invoke-virtual {v0, v4}, LQ1/o;->G(I)V

    .line 2
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v4

    .line 3
    new-instance v10, LM2/d;

    invoke-direct {v10, v4}, LM2/d;-><init>(I)V

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v4, :cond_9f

    .line 4
    iget v12, v0, LQ1/o;->b:I

    .line 5
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v13

    if-lez v13, :cond_0

    const/4 v15, 0x1

    :goto_1
    const/16 v26, 0x10

    goto :goto_2

    :cond_0
    const/4 v15, 0x0

    goto :goto_1

    .line 6
    :goto_2
    const-string v7, "childAtomSize must be positive"

    invoke-static {v7, v15}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 7
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v15

    const v5, 0x61766331

    if-eq v15, v5, :cond_9e

    const v5, 0x61766333

    if-eq v15, v5, :cond_9e

    const v5, 0x656e6376

    if-eq v15, v5, :cond_9e

    const v5, 0x6d317620

    if-eq v15, v5, :cond_9e

    const v5, 0x6d703476

    if-eq v15, v5, :cond_9e

    const v5, 0x68766331

    if-eq v15, v5, :cond_9e

    const v5, 0x68657631

    if-eq v15, v5, :cond_9e

    const v5, 0x73323633

    if-eq v15, v5, :cond_9e

    const v5, 0x48323633

    if-eq v15, v5, :cond_9e

    const v5, 0x68323633

    if-eq v15, v5, :cond_9e

    const v5, 0x76703038

    if-eq v15, v5, :cond_9e

    const v5, 0x76703039

    if-eq v15, v5, :cond_9e

    const v5, 0x61763031

    if-eq v15, v5, :cond_9e

    const v5, 0x64766176

    if-eq v15, v5, :cond_9e

    const v5, 0x64766131

    if-eq v15, v5, :cond_9e

    const v5, 0x64766865

    if-eq v15, v5, :cond_9e

    const v5, 0x64766831

    if-ne v15, v5, :cond_1

    move/from16 v5, p2

    move-object/from16 v6, p4

    move-object/from16 v37, v1

    move/from16 v56, v4

    move-object v7, v10

    move v2, v12

    move v3, v13

    move v8, v14

    move v1, v15

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xff

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v24, 0xa

    const/16 v25, 0x5

    const/16 v27, 0x2

    :goto_3
    const/16 v28, 0x8

    const/16 v29, 0x1

    const v31, 0x6d657474

    move/from16 v4, p1

    goto/16 :goto_61

    :cond_1
    const v5, 0x6d703461

    const v3, 0x65632d33

    const v8, 0x61632d33

    const v2, 0x656e6361

    const v11, 0x616c6163

    if-eq v15, v5, :cond_2

    if-eq v15, v2, :cond_2

    if-eq v15, v8, :cond_2

    if-eq v15, v3, :cond_2

    const v5, 0x61632d34

    if-eq v15, v5, :cond_2

    const v5, 0x6d6c7061

    if-eq v15, v5, :cond_2

    const v5, 0x64747363

    if-eq v15, v5, :cond_2

    const v5, 0x64747365

    if-eq v15, v5, :cond_2

    const v5, 0x64747368

    if-eq v15, v5, :cond_2

    const v5, 0x6474736c

    if-eq v15, v5, :cond_2

    const v5, 0x64747378

    if-eq v15, v5, :cond_2

    const v5, 0x73616d72

    if-eq v15, v5, :cond_2

    const v5, 0x73617762

    if-eq v15, v5, :cond_2

    const v5, 0x6c70636d

    if-eq v15, v5, :cond_2

    const v5, 0x736f7774

    if-eq v15, v5, :cond_2

    const v5, 0x74776f73

    if-eq v15, v5, :cond_2

    const v5, 0x2e6d7032

    if-eq v15, v5, :cond_2

    const v5, 0x2e6d7033

    if-eq v15, v5, :cond_2

    const v5, 0x6d686131

    if-eq v15, v5, :cond_2

    const v5, 0x6d686d31

    if-eq v15, v5, :cond_2

    if-eq v15, v11, :cond_2

    const v5, 0x616c6177

    if-eq v15, v5, :cond_2

    const v5, 0x756c6177

    if-eq v15, v5, :cond_2

    const v5, 0x4f707573

    if-eq v15, v5, :cond_2

    const v5, 0x664c6143

    if-eq v15, v5, :cond_2

    const v5, 0x69616d66

    if-ne v15, v5, :cond_3

    :cond_2
    const v31, 0x6d657474

    goto/16 :goto_9

    :cond_3
    const v2, 0x63363038

    const v3, 0x73747070

    const v5, 0x77767474

    const v7, 0x74783367

    const v8, 0x54544d4c

    if-eq v15, v8, :cond_7

    if-eq v15, v7, :cond_7

    if-eq v15, v5, :cond_7

    if-eq v15, v3, :cond_7

    if-ne v15, v2, :cond_4

    goto/16 :goto_5

    :cond_4
    const v11, 0x6d657474

    if-ne v15, v11, :cond_6

    add-int/lit8 v7, v12, 0x10

    .line 8
    invoke-virtual {v0, v7}, LQ1/o;->G(I)V

    if-ne v15, v11, :cond_5

    .line 9
    invoke-virtual {v0}, LQ1/o;->p()Ljava/lang/String;

    .line 10
    invoke-virtual {v0}, LQ1/o;->p()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 11
    new-instance v3, LN1/m;

    invoke-direct {v3}, LN1/m;-><init>()V

    .line 12
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, LN1/m;->a:Ljava/lang/String;

    .line 13
    invoke-static {v2}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, LN1/m;->m:Ljava/lang/String;

    .line 14
    new-instance v2, LN1/n;

    invoke-direct {v2, v3}, LN1/n;-><init>(LN1/m;)V

    .line 15
    iput-object v2, v10, LM2/d;->e:Ljava/lang/Object;

    :cond_5
    :goto_4
    move-object/from16 v37, v1

    move/from16 v56, v4

    move-object v7, v10

    move/from16 v31, v11

    move v2, v12

    move v3, v13

    move/from16 v33, v14

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xff

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v24, 0xa

    const/16 v25, 0x5

    const/16 v27, 0x2

    const/16 v28, 0x8

    const/16 v29, 0x1

    goto/16 :goto_62

    :cond_6
    const v2, 0x63616d6d

    if-ne v15, v2, :cond_5

    .line 16
    new-instance v2, LN1/m;

    invoke-direct {v2}, LN1/m;-><init>()V

    .line 17
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, LN1/m;->a:Ljava/lang/String;

    .line 18
    const-string v3, "application/x-camera-motion"

    invoke-static {v3}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, LN1/m;->m:Ljava/lang/String;

    .line 19
    new-instance v3, LN1/n;

    invoke-direct {v3, v2}, LN1/n;-><init>(LN1/m;)V

    .line 20
    iput-object v3, v10, LM2/d;->e:Ljava/lang/Object;

    goto :goto_4

    :cond_7
    :goto_5
    add-int/lit8 v11, v12, 0x10

    .line 21
    invoke-virtual {v0, v11}, LQ1/o;->G(I)V

    .line 22
    const-string v11, "application/ttml+xml"

    const-wide v32, 0x7fffffffffffffffL

    if-ne v15, v8, :cond_8

    :goto_6
    move-wide/from16 v7, v32

    :goto_7
    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    if-ne v15, v7, :cond_9

    add-int/lit8 v2, v13, -0x10

    .line 23
    new-array v3, v2, [B

    const/4 v5, 0x0

    .line 24
    invoke-virtual {v0, v5, v2, v3}, LQ1/o;->f(II[B)V

    .line 25
    invoke-static {v3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v2

    .line 26
    const-string v11, "application/x-quicktime-tx3g"

    move-wide/from16 v7, v32

    goto :goto_8

    :cond_9
    if-ne v15, v5, :cond_a

    .line 27
    const-string v11, "application/x-mp4-vtt"

    goto :goto_6

    :cond_a
    if-ne v15, v3, :cond_b

    move-wide/from16 v7, v18

    goto :goto_7

    :cond_b
    if-ne v15, v2, :cond_c

    const/4 v2, 0x1

    .line 28
    iput v2, v10, LM2/d;->c:I

    const-string v11, "application/x-mp4-cea-608"

    goto :goto_6

    .line 29
    :goto_8
    new-instance v3, LN1/m;

    invoke-direct {v3}, LN1/m;-><init>()V

    .line 30
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, LN1/m;->a:Ljava/lang/String;

    .line 31
    invoke-static {v11}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, LN1/m;->m:Ljava/lang/String;

    .line 32
    iput-object v9, v3, LN1/m;->d:Ljava/lang/String;

    .line 33
    iput-wide v7, v3, LN1/m;->r:J

    .line 34
    iput-object v2, v3, LN1/m;->p:Ljava/util/List;

    .line 35
    new-instance v2, LN1/n;

    invoke-direct {v2, v3}, LN1/n;-><init>(LN1/m;)V

    .line 36
    iput-object v2, v10, LM2/d;->e:Ljava/lang/Object;

    move-object/from16 v37, v1

    move/from16 v56, v4

    move-object v7, v10

    move v2, v12

    move v3, v13

    move/from16 v33, v14

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xff

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v24, 0xa

    const/16 v25, 0x5

    const/16 v27, 0x2

    const/16 v28, 0x8

    const/16 v29, 0x1

    const v31, 0x6d657474

    goto/16 :goto_62

    .line 37
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :goto_9
    add-int/lit8 v5, v12, 0x10

    .line 38
    invoke-virtual {v0, v5}, LQ1/o;->G(I)V

    const/4 v5, 0x6

    if-eqz p5, :cond_d

    .line 39
    invoke-virtual {v0}, LQ1/o;->A()I

    move-result v52

    .line 40
    invoke-virtual {v0, v5}, LQ1/o;->H(I)V

    move/from16 v11, v52

    goto :goto_a

    :cond_d
    const/16 v11, 0x8

    .line 41
    invoke-virtual {v0, v11}, LQ1/o;->H(I)V

    const/4 v11, 0x0

    :goto_a
    const/16 v52, 0x15

    const/16 v3, 0x18

    const/high16 v54, 0x10000000

    const/4 v8, 0x4

    if-eqz v11, :cond_e

    const/4 v2, 0x1

    if-ne v11, v2, :cond_f

    :cond_e
    move/from16 v58, v8

    goto/16 :goto_11

    :cond_f
    const/4 v2, 0x2

    if-ne v11, v2, :cond_1a

    move/from16 v2, v26

    .line 42
    invoke-virtual {v0, v2}, LQ1/o;->H(I)V

    .line 43
    invoke-virtual {v0}, LQ1/o;->o()J

    move-result-wide v57

    invoke-static/range {v57 .. v58}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v57

    .line 44
    invoke-static/range {v57 .. v58}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    long-to-int v5, v5

    .line 45
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v6

    .line 46
    invoke-virtual {v0, v8}, LQ1/o;->H(I)V

    .line 47
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v11

    .line 48
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v57

    const/16 v29, 0x1

    and-int/lit8 v58, v57, 0x1

    if-eqz v58, :cond_10

    const/16 v58, 0x1

    :goto_b
    const/16 v27, 0x2

    goto :goto_c

    :cond_10
    const/16 v58, 0x0

    goto :goto_b

    :goto_c
    and-int/lit8 v57, v57, 0x2

    if-eqz v57, :cond_11

    const/16 v57, 0x1

    goto :goto_d

    :cond_11
    const/16 v57, 0x0

    :goto_d
    const/16 v2, 0x20

    if-nez v58, :cond_18

    move/from16 v58, v8

    const/16 v8, 0x8

    if-ne v11, v8, :cond_12

    move v11, v8

    const/4 v2, 0x3

    goto :goto_f

    :cond_12
    const/16 v8, 0x10

    if-ne v11, v8, :cond_14

    if-eqz v57, :cond_13

    move/from16 v2, v54

    goto :goto_e

    :cond_13
    const/4 v2, 0x2

    :goto_e
    const/16 v11, 0x8

    goto :goto_f

    :cond_14
    if-ne v11, v3, :cond_16

    if-eqz v57, :cond_15

    const/high16 v2, 0x50000000

    goto :goto_e

    :cond_15
    move/from16 v2, v52

    goto :goto_e

    :cond_16
    if-ne v11, v2, :cond_19

    if-eqz v57, :cond_17

    const/high16 v2, 0x60000000

    goto :goto_e

    :cond_17
    const/16 v2, 0x16

    goto :goto_e

    :cond_18
    move/from16 v58, v8

    if-ne v11, v2, :cond_19

    move/from16 v2, v58

    goto :goto_e

    :cond_19
    const/4 v2, -0x1

    goto :goto_e

    .line 49
    :goto_f
    invoke-virtual {v0, v11}, LQ1/o;->H(I)V

    move v8, v5

    const/4 v5, 0x0

    :goto_10
    const v11, 0x69616d66

    goto :goto_12

    :cond_1a
    move-object/from16 v37, v1

    move/from16 v27, v2

    move/from16 v56, v4

    move/from16 v32, v12

    move/from16 v36, v13

    move/from16 v33, v14

    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v28, 0x8

    goto/16 :goto_60

    .line 50
    :goto_11
    invoke-virtual {v0}, LQ1/o;->A()I

    move-result v5

    const/4 v2, 0x6

    .line 51
    invoke-virtual {v0, v2}, LQ1/o;->H(I)V

    .line 52
    invoke-virtual {v0}, LQ1/o;->v()I

    move-result v6

    .line 53
    iget v8, v0, LQ1/o;->b:I

    add-int/lit8 v8, v8, -0x4

    .line 54
    invoke-virtual {v0, v8}, LQ1/o;->G(I)V

    .line 55
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v8

    const/4 v2, 0x1

    if-ne v11, v2, :cond_1b

    const/16 v2, 0x10

    .line 56
    invoke-virtual {v0, v2}, LQ1/o;->H(I)V

    :cond_1b
    move v2, v6

    move v6, v5

    move v5, v8

    move v8, v2

    const/4 v2, -0x1

    goto :goto_10

    :goto_12
    if-ne v15, v11, :cond_1c

    const/4 v6, -0x1

    const/4 v8, -0x1

    .line 57
    :cond_1c
    iget v11, v0, LQ1/o;->b:I

    const v3, 0x656e6361

    if-ne v15, v3, :cond_1f

    .line 58
    invoke-static {v0, v12, v13}, LM2/g;->e(LQ1/o;II)Landroid/util/Pair;

    move-result-object v3

    if-eqz v3, :cond_1e

    .line 59
    iget-object v15, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-nez p4, :cond_1d

    move/from16 v56, v4

    move/from16 v59, v6

    const/4 v4, 0x0

    move-object/from16 v6, p4

    goto :goto_13

    :cond_1d
    move/from16 v56, v4

    .line 60
    iget-object v4, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, LM2/t;

    iget-object v4, v4, LM2/t;->b:Ljava/lang/String;

    move/from16 v59, v6

    move-object/from16 v6, p4

    invoke-virtual {v6, v4}, LN1/j;->c(Ljava/lang/String;)LN1/j;

    move-result-object v4

    .line 61
    :goto_13
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, LM2/t;

    move-object/from16 v60, v3

    iget-object v3, v10, LM2/d;->d:Ljava/lang/Object;

    check-cast v3, [LM2/t;

    aput-object v60, v3, v14

    goto :goto_14

    :cond_1e
    move/from16 v56, v4

    move/from16 v59, v6

    move-object/from16 v6, p4

    move-object v4, v6

    .line 62
    :goto_14
    invoke-virtual {v0, v11}, LQ1/o;->G(I)V

    goto :goto_15

    :cond_1f
    move/from16 v56, v4

    move/from16 v59, v6

    move-object/from16 v6, p4

    move-object v4, v6

    .line 63
    :goto_15
    const-string v3, "audio/ac3"

    move-object/from16 v60, v3

    const v3, 0x61632d33

    if-ne v15, v3, :cond_20

    move v15, v2

    move-object/from16 v3, v60

    goto/16 :goto_1a

    :cond_20
    const v3, 0x65632d33

    if-ne v15, v3, :cond_21

    move v15, v2

    move-object/from16 v3, v17

    goto/16 :goto_1a

    :cond_21
    const v3, 0x61632d34

    if-ne v15, v3, :cond_22

    move v15, v2

    move-object/from16 v3, v16

    goto/16 :goto_1a

    :cond_22
    const v3, 0x64747363

    if-ne v15, v3, :cond_23

    .line 64
    const-string v3, "audio/vnd.dts"

    :goto_16
    move v15, v2

    goto/16 :goto_1a

    :cond_23
    const v3, 0x64747368

    if-eq v15, v3, :cond_38

    const v3, 0x6474736c

    if-ne v15, v3, :cond_24

    goto/16 :goto_19

    :cond_24
    const v3, 0x64747365

    if-ne v15, v3, :cond_25

    .line 65
    const-string v3, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_16

    :cond_25
    const v3, 0x64747378

    if-ne v15, v3, :cond_26

    .line 66
    const-string v3, "audio/vnd.dts.uhd;profile=p2"

    goto :goto_16

    :cond_26
    const v3, 0x73616d72

    if-ne v15, v3, :cond_27

    .line 67
    const-string v3, "audio/3gpp"

    goto :goto_16

    :cond_27
    const v3, 0x73617762

    if-ne v15, v3, :cond_28

    .line 68
    const-string v3, "audio/amr-wb"

    goto :goto_16

    .line 69
    :cond_28
    const-string v3, "audio/raw"

    move-object/from16 v44, v3

    const v3, 0x736f7774

    if-ne v15, v3, :cond_29

    :goto_17
    move-object/from16 v3, v44

    const/4 v15, 0x2

    goto/16 :goto_1a

    :cond_29
    const v3, 0x74776f73

    if-ne v15, v3, :cond_2a

    move-object/from16 v3, v44

    move/from16 v15, v54

    goto/16 :goto_1a

    :cond_2a
    const v3, 0x6c70636d

    if-ne v15, v3, :cond_2c

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2b

    goto :goto_17

    :cond_2b
    move v15, v2

    move-object/from16 v3, v44

    goto/16 :goto_1a

    :cond_2c
    const v3, 0x2e6d7032

    if-eq v15, v3, :cond_37

    const v3, 0x2e6d7033

    if-ne v15, v3, :cond_2d

    goto :goto_18

    :cond_2d
    const v3, 0x6d686131

    if-ne v15, v3, :cond_2e

    .line 70
    const-string v3, "audio/mha1"

    goto :goto_16

    :cond_2e
    const v3, 0x6d686d31

    if-ne v15, v3, :cond_2f

    move-object v3, v1

    goto :goto_16

    :cond_2f
    const v3, 0x616c6163

    if-ne v15, v3, :cond_30

    .line 71
    const-string v3, "audio/alac"

    goto :goto_16

    :cond_30
    const v3, 0x616c6177

    if-ne v15, v3, :cond_31

    .line 72
    const-string v3, "audio/g711-alaw"

    goto :goto_16

    :cond_31
    const v3, 0x756c6177

    if-ne v15, v3, :cond_32

    .line 73
    const-string v3, "audio/g711-mlaw"

    goto/16 :goto_16

    :cond_32
    const v3, 0x4f707573

    if-ne v15, v3, :cond_33

    .line 74
    const-string v3, "audio/opus"

    goto/16 :goto_16

    :cond_33
    const v3, 0x664c6143

    if-ne v15, v3, :cond_34

    .line 75
    const-string v3, "audio/flac"

    goto/16 :goto_16

    :cond_34
    const v3, 0x6d6c7061

    if-ne v15, v3, :cond_35

    .line 76
    const-string v3, "audio/true-hd"

    goto/16 :goto_16

    :cond_35
    const v3, 0x69616d66

    if-ne v15, v3, :cond_36

    .line 77
    const-string v3, "audio/iamf"

    goto/16 :goto_16

    :cond_36
    move v15, v2

    const/4 v3, 0x0

    goto :goto_1a

    .line 78
    :cond_37
    :goto_18
    const-string v3, "audio/mpeg"

    goto/16 :goto_16

    .line 79
    :cond_38
    :goto_19
    const-string v3, "audio/vnd.dts.hd"

    goto/16 :goto_16

    :goto_1a
    move v2, v11

    move/from16 v32, v12

    move/from16 v33, v14

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/16 v34, 0x0

    move v11, v8

    move-object v8, v3

    move/from16 v3, v59

    :goto_1b
    sub-int v14, v2, v32

    if-ge v14, v13, :cond_9b

    .line 80
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 81
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v14

    move/from16 v35, v2

    if-lez v14, :cond_39

    const/4 v2, 0x1

    goto :goto_1c

    :cond_39
    const/4 v2, 0x0

    .line 82
    :goto_1c
    invoke-static {v7, v2}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 83
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v2

    move/from16 v36, v13

    const v13, 0x6d686143

    if-ne v2, v13, :cond_3d

    const/16 v28, 0x8

    add-int/lit8 v2, v35, 0x8

    .line 84
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    const/4 v2, 0x1

    .line 85
    invoke-virtual {v0, v2}, LQ1/o;->H(I)V

    .line 86
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v6

    .line 87
    invoke-virtual {v0, v2}, LQ1/o;->H(I)V

    .line 88
    invoke-static {v8, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3a

    .line 89
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v13, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v13, v2

    const-string v6, "mhm1.%02X"

    invoke-static {v6, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move/from16 v30, v2

    goto :goto_1d

    :cond_3a
    const/4 v2, 0x0

    .line 90
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move/from16 v30, v2

    const/4 v13, 0x1

    new-array v2, v13, [Ljava/lang/Object;

    aput-object v6, v2, v30

    const-string v6, "mha1.%02X"

    invoke-static {v6, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    .line 91
    :goto_1d
    invoke-virtual {v0}, LQ1/o;->A()I

    move-result v2

    .line 92
    new-array v13, v2, [B

    move-object/from16 v37, v1

    move/from16 v1, v30

    .line 93
    invoke-virtual {v0, v1, v2, v13}, LQ1/o;->f(II[B)V

    if-nez v12, :cond_3b

    .line 94
    invoke-static {v13}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v2

    move-object v12, v2

    goto :goto_1e

    .line 95
    :cond_3b
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v13, v2}, Ll8/K;->o(Ljava/lang/Object;Ljava/lang/Object;)Ll8/e0;

    move-result-object v1

    move-object v12, v1

    :cond_3c
    :goto_1e
    move/from16 v51, v3

    move-object/from16 v42, v7

    move-object/from16 v39, v12

    move v3, v14

    move/from16 v41, v15

    move/from16 v15, v35

    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    const/16 v28, 0x8

    :goto_1f
    const/16 v55, 0x3

    goto/16 :goto_5f

    :cond_3d
    move-object/from16 v37, v1

    const v1, 0x6d686150

    if-ne v2, v1, :cond_3f

    const/16 v28, 0x8

    add-int/lit8 v2, v35, 0x8

    .line 96
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 97
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v1

    if-lez v1, :cond_3c

    .line 98
    new-array v2, v1, [B

    const/4 v13, 0x0

    .line 99
    invoke-virtual {v0, v13, v1, v2}, LQ1/o;->f(II[B)V

    if-nez v12, :cond_3e

    .line 100
    invoke-static {v2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v12

    goto :goto_1e

    .line 101
    :cond_3e
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v1, v2}, Ll8/K;->o(Ljava/lang/Object;Ljava/lang/Object;)Ll8/e0;

    move-result-object v12

    goto :goto_1e

    :cond_3f
    const v1, 0x65736473

    if-eq v2, v1, :cond_40

    if-eqz p5, :cond_41

    const v13, 0x77617665

    if-ne v2, v13, :cond_41

    :cond_40
    move-object/from16 v42, v7

    move-object/from16 v38, v8

    move v8, v11

    move-object/from16 v39, v12

    move/from16 v43, v14

    move/from16 v41, v15

    move/from16 v46, v35

    const/16 v11, 0xd

    const/16 v12, 0x9

    const/16 v14, 0x10

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    const/16 v28, 0x8

    const/16 v55, 0x3

    move-object/from16 v35, v6

    move v6, v3

    const v3, 0x616c6163

    goto/16 :goto_52

    :cond_41
    const v1, 0x64616333

    if-ne v2, v1, :cond_43

    const/16 v1, 0x8

    add-int/lit8 v2, v35, 0x8

    .line 102
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 103
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 104
    new-instance v13, LJ5/y;

    const/4 v1, 0x1

    invoke-direct {v13, v1}, LJ5/y;-><init>(I)V

    .line 105
    invoke-virtual {v13, v0}, LJ5/y;->p(LQ1/o;)V

    const/4 v1, 0x2

    .line 106
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    move-result v38

    .line 107
    sget-object v1, Ls2/a;->d:[I

    aget v1, v1, v38

    move-object/from16 v38, v8

    const/16 v8, 0x8

    .line 108
    invoke-virtual {v13, v8}, LJ5/y;->t(I)V

    .line 109
    sget-object v8, Ls2/a;->f:[I

    move-object/from16 v39, v8

    const/4 v8, 0x3

    invoke-virtual {v13, v8}, LJ5/y;->i(I)I

    move-result v40

    aget v8, v39, v40

    move/from16 v39, v8

    const/4 v8, 0x1

    .line 110
    invoke-virtual {v13, v8}, LJ5/y;->i(I)I

    move-result v29

    if-eqz v29, :cond_42

    add-int/lit8 v39, v39, 0x1

    :cond_42
    move/from16 v8, v39

    move-object/from16 v39, v12

    const/4 v12, 0x5

    .line 111
    invoke-virtual {v13, v12}, LJ5/y;->i(I)I

    move-result v40

    .line 112
    sget-object v12, Ls2/a;->g:[I

    aget v12, v12, v40

    mul-int/lit16 v12, v12, 0x3e8

    .line 113
    invoke-virtual {v13}, LJ5/y;->c()V

    .line 114
    invoke-virtual {v13}, LJ5/y;->f()I

    move-result v13

    invoke-virtual {v0, v13}, LQ1/o;->G(I)V

    .line 115
    new-instance v13, LN1/m;

    invoke-direct {v13}, LN1/m;-><init>()V

    .line 116
    iput-object v2, v13, LN1/m;->a:Ljava/lang/String;

    .line 117
    invoke-static/range {v60 .. v60}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v13, LN1/m;->m:Ljava/lang/String;

    .line 118
    iput v8, v13, LN1/m;->B:I

    .line 119
    iput v1, v13, LN1/m;->C:I

    .line 120
    iput-object v4, v13, LN1/m;->q:LN1/j;

    .line 121
    iput-object v9, v13, LN1/m;->d:Ljava/lang/String;

    .line 122
    iput v12, v13, LN1/m;->h:I

    .line 123
    iput v12, v13, LN1/m;->i:I

    .line 124
    new-instance v1, LN1/n;

    invoke-direct {v1, v13}, LN1/n;-><init>(LN1/m;)V

    .line 125
    iput-object v1, v10, LM2/d;->e:Ljava/lang/Object;

    move-object/from16 v42, v7

    move v8, v11

    move/from16 v43, v14

    move/from16 v41, v15

    move/from16 v46, v35

    const/16 v11, 0xd

    const/16 v12, 0x9

    const/16 v14, 0x10

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    const/16 v28, 0x8

    const/16 v55, 0x3

    move-object/from16 v35, v6

    move v6, v3

    const v3, 0x616c6163

    goto/16 :goto_51

    :cond_43
    move-object/from16 v38, v8

    move-object/from16 v39, v12

    const v1, 0x64656333

    if-ne v2, v1, :cond_48

    const/16 v28, 0x8

    add-int/lit8 v2, v35, 0x8

    .line 126
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 127
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 128
    new-instance v8, LJ5/y;

    const/4 v2, 0x1

    invoke-direct {v8, v2}, LJ5/y;-><init>(I)V

    .line 129
    invoke-virtual {v8, v0}, LJ5/y;->p(LQ1/o;)V

    const/16 v2, 0xd

    .line 130
    invoke-virtual {v8, v2}, LJ5/y;->i(I)I

    move-result v12

    mul-int/lit16 v12, v12, 0x3e8

    const/4 v2, 0x3

    .line 131
    invoke-virtual {v8, v2}, LJ5/y;->t(I)V

    const/4 v13, 0x2

    .line 132
    invoke-virtual {v8, v13}, LJ5/y;->i(I)I

    move-result v40

    .line 133
    sget-object v13, Ls2/a;->d:[I

    aget v13, v13, v40

    const/16 v2, 0xa

    .line 134
    invoke-virtual {v8, v2}, LJ5/y;->t(I)V

    .line 135
    sget-object v2, Ls2/a;->f:[I

    move-object/from16 v40, v2

    const/4 v2, 0x3

    invoke-virtual {v8, v2}, LJ5/y;->i(I)I

    move-result v41

    aget v40, v40, v41

    const/4 v2, 0x1

    .line 136
    invoke-virtual {v8, v2}, LJ5/y;->i(I)I

    move-result v29

    if-eqz v29, :cond_44

    add-int/lit8 v40, v40, 0x1

    :cond_44
    const/4 v2, 0x3

    .line 137
    invoke-virtual {v8, v2}, LJ5/y;->t(I)V

    move/from16 v2, v58

    .line 138
    invoke-virtual {v8, v2}, LJ5/y;->i(I)I

    move-result v41

    const/4 v2, 0x1

    .line 139
    invoke-virtual {v8, v2}, LJ5/y;->t(I)V

    if-lez v41, :cond_46

    move/from16 v41, v15

    const/4 v15, 0x6

    .line 140
    invoke-virtual {v8, v15}, LJ5/y;->t(I)V

    move/from16 v15, v35

    .line 141
    invoke-virtual {v8, v2}, LJ5/y;->i(I)I

    move-result v29

    if-eqz v29, :cond_45

    const/16 v27, 0x2

    add-int/lit8 v40, v40, 0x2

    .line 142
    :cond_45
    invoke-virtual {v8, v2}, LJ5/y;->t(I)V

    :goto_20
    move/from16 v61, v40

    goto :goto_21

    :cond_46
    move/from16 v41, v15

    move/from16 v15, v35

    goto :goto_20

    .line 143
    :goto_21
    invoke-virtual {v8}, LJ5/y;->b()I

    move-result v2

    move-object/from16 v35, v6

    const/4 v6, 0x7

    if-le v2, v6, :cond_47

    .line 144
    invoke-virtual {v8, v6}, LJ5/y;->t(I)V

    const/4 v2, 0x1

    .line 145
    invoke-virtual {v8, v2}, LJ5/y;->i(I)I

    move-result v6

    if-eqz v6, :cond_47

    .line 146
    const-string v2, "audio/eac3-joc"

    goto :goto_22

    :cond_47
    move-object/from16 v2, v17

    .line 147
    :goto_22
    invoke-virtual {v8}, LJ5/y;->c()V

    .line 148
    invoke-virtual {v8}, LJ5/y;->f()I

    move-result v6

    invoke-virtual {v0, v6}, LQ1/o;->G(I)V

    .line 149
    new-instance v6, LN1/m;

    invoke-direct {v6}, LN1/m;-><init>()V

    .line 150
    iput-object v1, v6, LN1/m;->a:Ljava/lang/String;

    .line 151
    invoke-static {v2}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v6, LN1/m;->m:Ljava/lang/String;

    move/from16 v1, v61

    .line 152
    iput v1, v6, LN1/m;->B:I

    .line 153
    iput v13, v6, LN1/m;->C:I

    .line 154
    iput-object v4, v6, LN1/m;->q:LN1/j;

    .line 155
    iput-object v9, v6, LN1/m;->d:Ljava/lang/String;

    .line 156
    iput v12, v6, LN1/m;->i:I

    .line 157
    new-instance v1, LN1/n;

    invoke-direct {v1, v6}, LN1/n;-><init>(LN1/m;)V

    .line 158
    iput-object v1, v10, LM2/d;->e:Ljava/lang/Object;

    move v6, v3

    move-object/from16 v42, v7

    move v8, v11

    move/from16 v43, v14

    move/from16 v46, v15

    const v3, 0x616c6163

    const/16 v11, 0xd

    const/16 v12, 0x9

    const/16 v14, 0x10

    :goto_23
    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    const/16 v28, 0x8

    const/16 v55, 0x3

    goto/16 :goto_51

    :cond_48
    move/from16 v41, v15

    move/from16 v15, v35

    move-object/from16 v35, v6

    const v1, 0x64616334

    if-ne v2, v1, :cond_82

    const/16 v28, 0x8

    add-int/lit8 v2, v15, 0x8

    .line 159
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 160
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 161
    new-instance v2, LJ5/y;

    const/4 v13, 0x1

    invoke-direct {v2, v13}, LJ5/y;-><init>(I)V

    .line 162
    invoke-virtual {v2, v0}, LJ5/y;->p(LQ1/o;)V

    .line 163
    invoke-virtual {v2}, LJ5/y;->b()I

    move-result v6

    const/4 v8, 0x3

    .line 164
    invoke-virtual {v2, v8}, LJ5/y;->i(I)I

    move-result v12

    if-gt v12, v13, :cond_81

    const/4 v8, 0x7

    .line 165
    invoke-virtual {v2, v8}, LJ5/y;->i(I)I

    move-result v13

    .line 166
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v8

    if-eqz v8, :cond_49

    const v8, 0xbb80

    :goto_24
    move/from16 v40, v6

    const/4 v6, 0x4

    goto :goto_25

    :cond_49
    const v8, 0xac44

    goto :goto_24

    .line 167
    :goto_25
    invoke-virtual {v2, v6}, LJ5/y;->t(I)V

    move-object/from16 v42, v7

    const/16 v6, 0x9

    .line 168
    invoke-virtual {v2, v6}, LJ5/y;->i(I)I

    move-result v7

    const/4 v6, 0x1

    if-le v13, v6, :cond_4c

    if-eqz v12, :cond_4b

    .line 169
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_4a

    const/16 v6, 0x10

    .line 170
    invoke-virtual {v2, v6}, LJ5/y;->t(I)V

    .line 171
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_4a

    const/16 v6, 0x80

    .line 172
    invoke-virtual {v2, v6}, LJ5/y;->t(I)V

    :cond_4a
    const/4 v13, 0x1

    goto :goto_26

    .line 173
    :cond_4b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    :cond_4c
    move v13, v6

    :goto_26
    if-ne v12, v13, :cond_4e

    .line 174
    invoke-virtual {v2}, LJ5/y;->b()I

    move-result v6

    const/16 v13, 0x42

    if-lt v6, v13, :cond_4d

    .line 175
    invoke-virtual {v2, v13}, LJ5/y;->t(I)V

    .line 176
    invoke-virtual {v2}, LJ5/y;->c()V

    goto :goto_27

    .line 177
    :cond_4d
    const-string v0, "Invalid AC-4 DSI bitrate."

    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    .line 178
    :cond_4e
    :goto_27
    new-instance v6, LW1/g;

    .line 179
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v13, 0x1

    .line 180
    iput-boolean v13, v6, LW1/g;->a:Z

    const/4 v13, -0x1

    .line 181
    iput v13, v6, LW1/g;->b:I

    .line 182
    iput v13, v6, LW1/g;->c:I

    const/4 v13, 0x1

    .line 183
    iput-boolean v13, v6, LW1/g;->d:Z

    const/4 v13, 0x2

    .line 184
    iput v13, v6, LW1/g;->e:I

    const/4 v13, 0x0

    .line 185
    iput v13, v6, LW1/g;->f:I

    move/from16 v43, v14

    const/4 v13, 0x0

    :goto_28
    if-ge v13, v7, :cond_75

    if-nez v12, :cond_4f

    .line 186
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v7

    const/4 v14, 0x5

    .line 187
    invoke-virtual {v2, v14}, LJ5/y;->i(I)I

    move-result v46

    .line 188
    invoke-virtual {v2, v14}, LJ5/y;->i(I)I

    move-result v47

    move/from16 v48, v7

    move/from16 v7, v46

    move/from16 v14, v47

    const/16 v47, 0x0

    const/16 v49, 0x0

    move/from16 v46, v15

    const/4 v15, 0x0

    :goto_29
    move/from16 v50, v11

    goto :goto_2b

    :cond_4f
    move/from16 v28, v7

    const/16 v14, 0x8

    .line 189
    invoke-virtual {v2, v14}, LJ5/y;->i(I)I

    move-result v7

    move/from16 v46, v15

    .line 190
    invoke-virtual {v2, v14}, LJ5/y;->i(I)I

    move-result v15

    move/from16 v47, v14

    const/16 v14, 0xff

    if-ne v15, v14, :cond_50

    const/16 v14, 0x10

    .line 191
    invoke-virtual {v2, v14}, LJ5/y;->i(I)I

    move-result v48

    add-int v48, v48, v15

    move/from16 v15, v48

    :cond_50
    const/4 v14, 0x2

    if-le v7, v14, :cond_51

    mul-int/lit8 v15, v15, 0x8

    .line 192
    invoke-virtual {v2, v15}, LJ5/y;->t(I)V

    const/16 v29, 0x1

    add-int/lit8 v13, v13, 0x1

    move/from16 v7, v28

    move/from16 v15, v46

    goto :goto_28

    .line 193
    :cond_51
    invoke-virtual {v2}, LJ5/y;->b()I

    move-result v14

    sub-int v14, v40, v14

    div-int/lit8 v14, v14, 0x8

    move/from16 v48, v7

    move/from16 v47, v14

    const/4 v7, 0x5

    .line 194
    invoke-virtual {v2, v7}, LJ5/y;->i(I)I

    move-result v14

    const/16 v7, 0x1f

    if-ne v14, v7, :cond_52

    const/4 v7, 0x1

    goto :goto_2a

    :cond_52
    const/4 v7, 0x0

    :goto_2a
    move/from16 v49, v7

    move v7, v14

    move/from16 v14, v48

    const/16 v48, 0x0

    goto :goto_29

    :goto_2b
    if-nez v48, :cond_53

    if-nez v49, :cond_53

    const/4 v11, 0x6

    if-ne v7, v11, :cond_53

    move/from16 v51, v3

    move/from16 v53, v14

    const/4 v3, 0x1

    goto/16 :goto_3f

    :cond_53
    move/from16 v51, v3

    const/4 v11, 0x3

    .line 195
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    move-result v3

    iput v3, v6, LW1/g;->f:I

    .line 196
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v3

    if-eqz v3, :cond_54

    const/4 v3, 0x5

    .line 197
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    :cond_54
    const/4 v3, 0x2

    .line 198
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    const/4 v11, 0x1

    if-ne v12, v11, :cond_55

    if-eq v14, v11, :cond_56

    if-ne v14, v3, :cond_55

    goto :goto_2d

    :cond_55
    :goto_2c
    const/4 v3, 0x5

    goto :goto_2e

    .line 199
    :cond_56
    :goto_2d
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    goto :goto_2c

    .line 200
    :goto_2e
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    const/16 v3, 0xa

    .line 201
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    if-ne v12, v11, :cond_61

    if-lez v14, :cond_57

    .line 202
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v3

    iput-boolean v3, v6, LW1/g;->a:Z

    .line 203
    :cond_57
    iget-boolean v3, v6, LW1/g;->a:Z

    if-eqz v3, :cond_5c

    if-eq v14, v11, :cond_58

    const/4 v3, 0x2

    if-ne v14, v3, :cond_59

    :cond_58
    const/4 v3, 0x5

    goto :goto_30

    :cond_59
    :goto_2f
    const/16 v11, 0x18

    goto :goto_31

    .line 204
    :goto_30
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    move-result v11

    if-ltz v11, :cond_5a

    const/16 v3, 0xf

    if-gt v11, v3, :cond_5a

    .line 205
    iput v11, v6, LW1/g;->b:I

    :cond_5a
    const/16 v3, 0xb

    if-lt v11, v3, :cond_5b

    const/16 v3, 0xe

    if-gt v11, v3, :cond_5b

    .line 206
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v3

    iput-boolean v3, v6, LW1/g;->d:Z

    const/4 v3, 0x2

    .line 207
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    move-result v11

    iput v11, v6, LW1/g;->e:I

    goto :goto_2f

    :cond_5b
    const/4 v3, 0x2

    goto :goto_2f

    .line 208
    :goto_31
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    :goto_32
    const/4 v11, 0x1

    goto :goto_33

    :cond_5c
    const/4 v3, 0x2

    goto :goto_32

    :goto_33
    if-eq v14, v11, :cond_5f

    if-ne v14, v3, :cond_5d

    goto :goto_34

    :cond_5d
    move/from16 v53, v14

    :cond_5e
    const/4 v11, 0x1

    goto :goto_36

    .line 209
    :cond_5f
    :goto_34
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v11

    if-eqz v11, :cond_60

    .line 210
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v11

    if-eqz v11, :cond_60

    .line 211
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 212
    :cond_60
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v3

    if-eqz v3, :cond_5d

    .line 213
    invoke-virtual {v2}, LJ5/y;->s()V

    const/16 v11, 0x8

    .line 214
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    move-result v3

    move/from16 v53, v14

    const/4 v14, 0x0

    :goto_35
    if-ge v14, v3, :cond_5e

    .line 215
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    const/4 v11, 0x1

    add-int/2addr v14, v11

    const/16 v11, 0x8

    goto :goto_35

    :cond_61
    move/from16 v53, v14

    :goto_36
    if-nez v48, :cond_69

    if-eqz v49, :cond_62

    goto/16 :goto_3d

    .line 216
    :cond_62
    invoke-virtual {v2}, LJ5/y;->s()V

    if-eqz v7, :cond_67

    if-eq v7, v11, :cond_67

    const/4 v3, 0x2

    if-eq v7, v3, :cond_67

    const/4 v3, 0x3

    if-eq v7, v3, :cond_65

    const/4 v3, 0x4

    if-eq v7, v3, :cond_65

    const/4 v3, 0x5

    if-eq v7, v3, :cond_63

    const/4 v3, 0x7

    .line 217
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    move-result v7

    const/4 v3, 0x0

    :goto_37
    if-ge v3, v7, :cond_6b

    const/16 v14, 0x8

    .line 218
    invoke-virtual {v2, v14}, LJ5/y;->t(I)V

    add-int/2addr v3, v11

    goto :goto_37

    :cond_63
    if-nez v53, :cond_64

    .line 219
    invoke-static {v2, v6}, Ls2/a;->r(LJ5/y;LW1/g;)V

    goto :goto_3e

    :cond_64
    const/4 v3, 0x3

    .line 220
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    move-result v7

    const/4 v3, 0x0

    :goto_38
    const/16 v27, 0x2

    add-int/lit8 v14, v7, 0x2

    if-ge v3, v14, :cond_6b

    .line 221
    invoke-static {v2, v6}, Ls2/a;->s(LJ5/y;LW1/g;)V

    add-int/2addr v3, v11

    goto :goto_38

    :cond_65
    if-nez v53, :cond_66

    const/4 v3, 0x0

    const/4 v7, 0x3

    :goto_39
    if-ge v3, v7, :cond_6b

    .line 222
    invoke-static {v2, v6}, Ls2/a;->r(LJ5/y;LW1/g;)V

    add-int/2addr v3, v11

    goto :goto_39

    :cond_66
    const/4 v3, 0x0

    :goto_3a
    const/4 v7, 0x3

    if-ge v3, v7, :cond_6b

    .line 223
    invoke-static {v2, v6}, Ls2/a;->s(LJ5/y;LW1/g;)V

    add-int/2addr v3, v11

    goto :goto_3a

    :cond_67
    if-nez v53, :cond_68

    const/4 v3, 0x0

    const/4 v14, 0x2

    :goto_3b
    if-ge v3, v14, :cond_6b

    .line 224
    invoke-static {v2, v6}, Ls2/a;->r(LJ5/y;LW1/g;)V

    add-int/2addr v3, v11

    goto :goto_3b

    :cond_68
    const/4 v3, 0x0

    :goto_3c
    const/4 v14, 0x2

    if-ge v3, v14, :cond_6b

    .line 225
    invoke-static {v2, v6}, Ls2/a;->s(LJ5/y;LW1/g;)V

    add-int/2addr v3, v11

    goto :goto_3c

    :cond_69
    :goto_3d
    if-nez v53, :cond_6a

    .line 226
    invoke-static {v2, v6}, Ls2/a;->r(LJ5/y;LW1/g;)V

    goto :goto_3e

    .line 227
    :cond_6a
    invoke-static {v2, v6}, Ls2/a;->s(LJ5/y;LW1/g;)V

    .line 228
    :cond_6b
    :goto_3e
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 229
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v3

    :goto_3f
    if-eqz v3, :cond_6c

    const/4 v3, 0x7

    .line 230
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    move-result v7

    const/4 v3, 0x0

    :goto_40
    if-ge v3, v7, :cond_6c

    const/16 v11, 0xf

    .line 231
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    const/16 v29, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_40

    :cond_6c
    if-lez v53, :cond_71

    .line 232
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v3

    if-eqz v3, :cond_6f

    .line 233
    invoke-virtual {v2}, LJ5/y;->b()I

    move-result v3

    const/16 v11, 0x42

    if-ge v3, v11, :cond_6d

    const/4 v3, 0x0

    goto :goto_41

    .line 234
    :cond_6d
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    const/4 v3, 0x1

    :goto_41
    if-eqz v3, :cond_6e

    goto :goto_42

    .line 235
    :cond_6e
    const-string v0, "Can\'t parse bitrate DSI."

    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    :cond_6f
    const/16 v11, 0x42

    .line 236
    :goto_42
    invoke-virtual {v2}, LJ5/y;->h()Z

    move-result v3

    if-eqz v3, :cond_71

    .line 237
    invoke-virtual {v2}, LJ5/y;->c()V

    const/16 v14, 0x10

    .line 238
    invoke-virtual {v2, v14}, LJ5/y;->i(I)I

    move-result v3

    .line 239
    invoke-virtual {v2, v3}, LJ5/y;->u(I)V

    const/4 v3, 0x5

    .line 240
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    move-result v7

    const/4 v3, 0x0

    :goto_43
    if-ge v3, v7, :cond_70

    const/4 v11, 0x3

    .line 241
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    const/16 v11, 0x8

    .line 242
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    move/from16 v28, v11

    const/4 v11, 0x1

    add-int/2addr v3, v11

    const/16 v11, 0x42

    goto :goto_43

    :cond_70
    const/4 v11, 0x1

    :goto_44
    const/16 v28, 0x8

    goto :goto_45

    :cond_71
    const/4 v11, 0x1

    const/16 v14, 0x10

    goto :goto_44

    .line 243
    :goto_45
    invoke-virtual {v2}, LJ5/y;->c()V

    if-ne v12, v11, :cond_73

    .line 244
    invoke-virtual {v2}, LJ5/y;->b()I

    move-result v3

    sub-int v3, v40, v3

    div-int/lit8 v3, v3, 0x8

    sub-int v3, v3, v47

    if-lt v15, v3, :cond_72

    sub-int/2addr v15, v3

    .line 245
    invoke-virtual {v2, v15}, LJ5/y;->u(I)V

    goto :goto_46

    .line 246
    :cond_72
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    .line 247
    :cond_73
    :goto_46
    iget-boolean v2, v6, LW1/g;->a:Z

    if-eqz v2, :cond_76

    iget v2, v6, LW1/g;->b:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_74

    goto :goto_47

    .line 248
    :cond_74
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t determine channel mode of presentation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    :cond_75
    move/from16 v51, v3

    move/from16 v50, v11

    move/from16 v46, v15

    const/16 v14, 0x10

    .line 249
    :cond_76
    :goto_47
    iget-boolean v2, v6, LW1/g;->a:Z

    if-eqz v2, :cond_7d

    .line 250
    iget v2, v6, LW1/g;->b:I

    iget-boolean v3, v6, LW1/g;->d:Z

    iget v6, v6, LW1/g;->e:I

    packed-switch v2, :pswitch_data_0

    const/16 v7, 0xb

    const/16 v45, -0x1

    goto :goto_48

    :pswitch_0
    const/16 v7, 0xb

    const/16 v45, 0x18

    goto :goto_48

    :pswitch_1
    const/16 v7, 0xb

    const/16 v45, 0xe

    goto :goto_48

    :pswitch_2
    const/16 v7, 0xb

    const/16 v45, 0xd

    goto :goto_48

    :pswitch_3
    const/16 v7, 0xb

    const/16 v45, 0xc

    goto :goto_48

    :pswitch_4
    const/16 v7, 0xb

    const/16 v45, 0xb

    goto :goto_48

    :pswitch_5
    const/16 v7, 0xb

    const/16 v45, 0x8

    goto :goto_48

    :pswitch_6
    const/16 v7, 0xb

    const/16 v45, 0x7

    goto :goto_48

    :pswitch_7
    const/16 v7, 0xb

    const/16 v45, 0x6

    goto :goto_48

    :pswitch_8
    const/16 v7, 0xb

    const/16 v45, 0x5

    goto :goto_48

    :pswitch_9
    const/16 v7, 0xb

    const/16 v45, 0x3

    goto :goto_48

    :pswitch_a
    const/16 v7, 0xb

    const/16 v45, 0x2

    goto :goto_48

    :pswitch_b
    const/16 v7, 0xb

    const/16 v45, 0x1

    :goto_48
    if-eq v2, v7, :cond_78

    const/16 v7, 0xc

    if-eq v2, v7, :cond_78

    const/16 v11, 0xd

    if-eq v2, v11, :cond_79

    const/16 v7, 0xe

    if-ne v2, v7, :cond_77

    goto :goto_49

    :cond_77
    const/4 v2, 0x1

    goto :goto_4a

    :cond_78
    const/16 v11, 0xd

    :cond_79
    :goto_49
    if-nez v3, :cond_7a

    add-int/lit8 v45, v45, -0x2

    :cond_7a
    if-eqz v6, :cond_7c

    const/4 v2, 0x1

    if-eq v6, v2, :cond_7b

    goto :goto_4a

    :cond_7b
    add-int/lit8 v45, v45, -0x2

    goto :goto_4a

    :cond_7c
    const/4 v2, 0x1

    add-int/lit8 v45, v45, -0x4

    :goto_4a
    move/from16 v3, v45

    goto :goto_4b

    :cond_7d
    const/4 v2, 0x1

    const/16 v11, 0xd

    .line 251
    iget v3, v6, LW1/g;->c:I

    add-int/2addr v3, v2

    .line 252
    iget v2, v6, LW1/g;->f:I

    const/4 v6, 0x4

    if-ne v2, v6, :cond_7f

    const/16 v2, 0x11

    if-ne v3, v2, :cond_7e

    move/from16 v45, v52

    goto :goto_4a

    :cond_7e
    move/from16 v45, v3

    goto :goto_4a

    :cond_7f
    :goto_4b
    if-lez v3, :cond_80

    .line 253
    new-instance v2, LN1/m;

    invoke-direct {v2}, LN1/m;-><init>()V

    .line 254
    iput-object v1, v2, LN1/m;->a:Ljava/lang/String;

    .line 255
    invoke-static/range {v16 .. v16}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, LN1/m;->m:Ljava/lang/String;

    .line 256
    iput v3, v2, LN1/m;->B:I

    .line 257
    iput v8, v2, LN1/m;->C:I

    .line 258
    iput-object v4, v2, LN1/m;->q:LN1/j;

    .line 259
    iput-object v9, v2, LN1/m;->d:Ljava/lang/String;

    .line 260
    new-instance v1, LN1/n;

    invoke-direct {v1, v2}, LN1/n;-><init>(LN1/m;)V

    .line 261
    iput-object v1, v10, LM2/d;->e:Ljava/lang/Object;

    move/from16 v8, v50

    move/from16 v6, v51

    const v3, 0x616c6163

    const/16 v12, 0x9

    goto/16 :goto_23

    .line 262
    :cond_80
    const-string v0, "Can\'t determine channel count of presentation."

    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    .line 263
    :cond_81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    :cond_82
    move/from16 v51, v3

    move-object/from16 v42, v7

    move/from16 v50, v11

    move/from16 v43, v14

    move/from16 v46, v15

    const/16 v11, 0xd

    const/16 v14, 0x10

    const v1, 0x646d6c70

    if-ne v2, v1, :cond_84

    if-lez v5, :cond_83

    move v11, v5

    move-object/from16 v6, v35

    move-object/from16 v8, v38

    move/from16 v3, v43

    move/from16 v15, v46

    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    const/16 v28, 0x8

    const/16 v51, 0x2

    goto/16 :goto_1f

    .line 264
    :cond_83
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    :cond_84
    const v1, 0x64647473

    if-eq v2, v1, :cond_85

    const v1, 0x75647473

    if-ne v2, v1, :cond_86

    :cond_85
    const v3, 0x616c6163

    const/16 v12, 0x9

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    const/16 v28, 0x8

    const/16 v55, 0x3

    goto/16 :goto_50

    :cond_86
    const v1, 0x644f7073

    if-ne v2, v1, :cond_87

    const/16 v28, 0x8

    add-int/lit8 v1, v43, -0x8

    .line 265
    sget-object v2, LM2/g;->a:[B

    array-length v3, v2

    add-int/2addr v3, v1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    add-int/lit8 v6, v46, 0x8

    .line 266
    invoke-virtual {v0, v6}, LQ1/o;->G(I)V

    .line 267
    array-length v2, v2

    invoke-virtual {v0, v2, v1, v3}, LQ1/o;->f(II[B)V

    .line 268
    invoke-static {v3}, Ls2/a;->c([B)Ljava/util/ArrayList;

    move-result-object v12

    move-object/from16 v39, v12

    move-object/from16 v6, v35

    move-object/from16 v8, v38

    move/from16 v3, v43

    move/from16 v15, v46

    move/from16 v11, v50

    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    goto/16 :goto_1f

    :cond_87
    const/16 v28, 0x8

    const v1, 0x64664c61

    if-ne v2, v1, :cond_88

    const/16 v22, 0xc

    add-int/lit8 v1, v43, -0xc

    add-int/lit8 v2, v43, -0x8

    .line 269
    new-array v2, v2, [B

    const/16 v3, 0x66

    const/16 v30, 0x0

    .line 270
    aput-byte v3, v2, v30

    const/16 v3, 0x4c

    const/16 v29, 0x1

    .line 271
    aput-byte v3, v2, v29

    const/16 v3, 0x61

    const/16 v27, 0x2

    .line 272
    aput-byte v3, v2, v27

    const/16 v3, 0x43

    const/16 v55, 0x3

    .line 273
    aput-byte v3, v2, v55

    add-int/lit8 v3, v46, 0xc

    .line 274
    invoke-virtual {v0, v3}, LQ1/o;->G(I)V

    const/4 v6, 0x4

    .line 275
    invoke-virtual {v0, v6, v1, v2}, LQ1/o;->f(II[B)V

    .line 276
    invoke-static {v2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v12

    move-object/from16 v39, v12

    move-object/from16 v6, v35

    move-object/from16 v8, v38

    move/from16 v3, v43

    move/from16 v15, v46

    move/from16 v11, v50

    :goto_4c
    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v23, 0x7

    goto/16 :goto_5f

    :cond_88
    const v3, 0x616c6163

    const/4 v6, 0x4

    const/16 v22, 0xc

    const/16 v27, 0x2

    const/16 v55, 0x3

    if-ne v2, v3, :cond_89

    add-int/lit8 v1, v43, -0xc

    .line 277
    new-array v2, v1, [B

    add-int/lit8 v7, v46, 0xc

    .line 278
    invoke-virtual {v0, v7}, LQ1/o;->G(I)V

    const/4 v13, 0x0

    .line 279
    invoke-virtual {v0, v13, v1, v2}, LQ1/o;->f(II[B)V

    .line 280
    sget-object v1, LQ1/a;->a:[B

    .line 281
    new-instance v1, LQ1/o;

    invoke-direct {v1, v2}, LQ1/o;-><init>([B)V

    const/16 v7, 0x9

    .line 282
    invoke-virtual {v1, v7}, LQ1/o;->G(I)V

    .line 283
    invoke-virtual {v1}, LQ1/o;->u()I

    move-result v7

    const/16 v8, 0x14

    .line 284
    invoke-virtual {v1, v8}, LQ1/o;->G(I)V

    .line 285
    invoke-virtual {v1}, LQ1/o;->y()I

    move-result v1

    .line 286
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    .line 287
    iget-object v7, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 288
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 289
    invoke-static {v2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v12

    move/from16 v51, v1

    move v11, v7

    move-object/from16 v39, v12

    move-object/from16 v6, v35

    move-object/from16 v8, v38

    move/from16 v3, v43

    move/from16 v15, v46

    goto :goto_4c

    :cond_89
    const v1, 0x69616362

    const/16 v12, 0x9

    if-ne v2, v1, :cond_8d

    add-int/lit8 v2, v46, 0x9

    .line 290
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    move-wide/from16 v7, v18

    const/4 v1, 0x0

    :goto_4d
    if-ge v1, v12, :cond_8c

    .line 291
    iget v2, v0, LQ1/o;->b:I

    iget v13, v0, LQ1/o;->c:I

    if-eq v2, v13, :cond_8b

    .line 292
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v2

    move-wide/from16 v39, v7

    int-to-long v6, v2

    const-wide/16 v44, 0x7f

    and-long v44, v6, v44

    const/16 v23, 0x7

    mul-int/lit8 v2, v1, 0x7

    shl-long v44, v44, v2

    or-long v39, v39, v44

    const-wide/16 v44, 0x80

    and-long v6, v6, v44

    cmp-long v2, v6, v18

    if-nez v2, :cond_8a

    move-wide/from16 v7, v39

    goto :goto_4e

    :cond_8a
    const/16 v29, 0x1

    add-int/lit8 v1, v1, 0x1

    move-wide/from16 v7, v39

    const/4 v6, 0x4

    goto :goto_4d

    .line 293
    :cond_8b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to read a byte over the limit."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8c
    move-wide/from16 v39, v7

    const/16 v23, 0x7

    .line 294
    :goto_4e
    invoke-static {v7, v8}, LS3/f;->l(J)I

    move-result v1

    .line 295
    new-array v2, v1, [B

    const/4 v13, 0x0

    .line 296
    invoke-virtual {v0, v13, v1, v2}, LQ1/o;->f(II[B)V

    .line 297
    invoke-static {v2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v1

    move-object/from16 v39, v1

    move-object/from16 v6, v35

    move-object/from16 v8, v38

    move/from16 v3, v43

    move/from16 v15, v46

    move/from16 v11, v50

    :goto_4f
    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    goto/16 :goto_5f

    :cond_8d
    const/16 v23, 0x7

    move/from16 v8, v50

    move/from16 v6, v51

    goto :goto_51

    .line 298
    :goto_50
    new-instance v1, LN1/m;

    invoke-direct {v1}, LN1/m;-><init>()V

    .line 299
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, LN1/m;->a:Ljava/lang/String;

    .line 300
    invoke-static/range {v38 .. v38}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, LN1/m;->m:Ljava/lang/String;

    move/from16 v6, v51

    .line 301
    iput v6, v1, LN1/m;->B:I

    move/from16 v8, v50

    .line 302
    iput v8, v1, LN1/m;->C:I

    .line 303
    iput-object v4, v1, LN1/m;->q:LN1/j;

    .line 304
    iput-object v9, v1, LN1/m;->d:Ljava/lang/String;

    .line 305
    new-instance v2, LN1/n;

    invoke-direct {v2, v1}, LN1/n;-><init>(LN1/m;)V

    .line 306
    iput-object v2, v10, LM2/d;->e:Ljava/lang/Object;

    :goto_51
    move/from16 v51, v6

    move v11, v8

    move-object/from16 v6, v35

    move-object/from16 v8, v38

    move/from16 v3, v43

    move/from16 v15, v46

    goto :goto_4f

    :goto_52
    if-ne v2, v1, :cond_8e

    move-object/from16 v12, v42

    move/from16 v3, v43

    move/from16 v2, v46

    move v15, v2

    const/4 v13, 0x0

    :goto_53
    const/4 v1, -0x1

    goto :goto_59

    .line 307
    :cond_8e
    iget v2, v0, LQ1/o;->b:I

    move/from16 v15, v46

    if-lt v2, v15, :cond_8f

    const/4 v7, 0x1

    :goto_54
    const/4 v13, 0x0

    goto :goto_55

    :cond_8f
    const/4 v7, 0x0

    goto :goto_54

    .line 308
    :goto_55
    invoke-static {v13, v7}, Ls2/a;->e(Ljava/lang/String;Z)V

    :goto_56
    sub-int v7, v2, v15

    move/from16 v3, v43

    if-ge v7, v3, :cond_92

    .line 309
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 310
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v7

    if-lez v7, :cond_90

    const/4 v11, 0x1

    :goto_57
    move-object/from16 v12, v42

    goto :goto_58

    :cond_90
    const/4 v11, 0x0

    goto :goto_57

    .line 311
    :goto_58
    invoke-static {v12, v11}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 312
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v11

    if-ne v11, v1, :cond_91

    goto :goto_53

    :cond_91
    add-int/2addr v2, v7

    move/from16 v43, v3

    move-object/from16 v42, v12

    const v3, 0x616c6163

    const/16 v11, 0xd

    const/16 v12, 0x9

    goto :goto_56

    :cond_92
    move-object/from16 v12, v42

    const/4 v2, -0x1

    goto :goto_53

    :goto_59
    if-eq v2, v1, :cond_9a

    .line 313
    invoke-static {v2, v0}, LM2/g;->a(ILQ1/o;)LM2/b;

    move-result-object v2

    .line 314
    iget-object v7, v2, LM2/b;->a:Ljava/lang/String;

    iget-object v11, v2, LM2/b;->b:[B

    if-eqz v11, :cond_99

    .line 315
    const-string v1, "audio/vorbis"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_97

    .line 316
    new-instance v1, LQ1/o;

    invoke-direct {v1, v11}, LQ1/o;-><init>([B)V

    const/4 v13, 0x1

    .line 317
    invoke-virtual {v1, v13}, LQ1/o;->H(I)V

    const/4 v14, 0x0

    .line 318
    :goto_5a
    invoke-virtual {v1}, LQ1/o;->a()I

    move-result v29

    if-lez v29, :cond_93

    invoke-virtual {v1}, LQ1/o;->e()I

    move-result v13

    const/16 v0, 0xff

    if-ne v13, v0, :cond_94

    add-int/2addr v14, v0

    const/4 v13, 0x1

    .line 319
    invoke-virtual {v1, v13}, LQ1/o;->H(I)V

    move-object/from16 v0, p0

    goto :goto_5a

    :cond_93
    const/16 v0, 0xff

    .line 320
    :cond_94
    invoke-virtual {v1}, LQ1/o;->u()I

    move-result v13

    add-int/2addr v13, v14

    const/4 v14, 0x0

    .line 321
    :goto_5b
    invoke-virtual {v1}, LQ1/o;->a()I

    move-result v21

    if-lez v21, :cond_95

    move-object/from16 v21, v2

    invoke-virtual {v1}, LQ1/o;->e()I

    move-result v2

    if-ne v2, v0, :cond_96

    add-int/2addr v14, v0

    const/4 v2, 0x1

    .line 322
    invoke-virtual {v1, v2}, LQ1/o;->H(I)V

    move-object/from16 v2, v21

    goto :goto_5b

    :cond_95
    move-object/from16 v21, v2

    .line 323
    :cond_96
    invoke-virtual {v1}, LQ1/o;->u()I

    move-result v2

    add-int/2addr v2, v14

    .line 324
    new-array v14, v13, [B

    .line 325
    iget v1, v1, LQ1/o;->b:I

    move-object/from16 v42, v12

    const/4 v12, 0x0

    .line 326
    invoke-static {v11, v1, v14, v12, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v13

    add-int/2addr v1, v2

    .line 327
    array-length v2, v11

    sub-int/2addr v2, v1

    .line 328
    new-array v13, v2, [B

    .line 329
    invoke-static {v11, v1, v13, v12, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 330
    invoke-static {v14, v13}, Ll8/K;->o(Ljava/lang/Object;Ljava/lang/Object;)Ll8/e0;

    move-result-object v1

    move-object/from16 v39, v1

    move v2, v6

    move v11, v8

    move-object/from16 v14, v21

    move-object/from16 v6, v35

    const/4 v13, 0x1

    :goto_5c
    move-object v8, v7

    goto :goto_5e

    :cond_97
    move-object/from16 v21, v2

    move-object/from16 v42, v12

    const/16 v0, 0xff

    const/4 v12, 0x0

    .line 331
    const-string v1, "audio/mp4a-latm"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_98

    .line 332
    new-instance v1, LJ5/y;

    .line 333
    array-length v2, v11

    const/4 v13, 0x1

    invoke-direct {v1, v11, v2, v13, v12}, LJ5/y;-><init>([BIIB)V

    .line 334
    invoke-static {v1, v12}, Ls2/a;->q(LJ5/y;Z)LG5/a;

    move-result-object v1

    .line 335
    iget v2, v1, LG5/a;->a:I

    iget v6, v1, LG5/a;->b:I

    iget-object v1, v1, LG5/a;->c:Ljava/lang/String;

    goto :goto_5d

    :cond_98
    const/4 v13, 0x1

    move v2, v8

    move-object/from16 v1, v35

    .line 336
    :goto_5d
    invoke-static {v11}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v8

    move v11, v2

    move v2, v6

    move-object/from16 v39, v8

    move-object/from16 v14, v21

    move-object v6, v1

    goto :goto_5c

    :cond_99
    move-object/from16 v21, v2

    move-object/from16 v42, v12

    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    move v2, v6

    move v11, v8

    move-object/from16 v14, v21

    move-object/from16 v6, v35

    goto :goto_5c

    :cond_9a
    move-object/from16 v42, v12

    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    move v2, v6

    move v11, v8

    move-object/from16 v14, v34

    move-object/from16 v6, v35

    move-object/from16 v8, v38

    :goto_5e
    move/from16 v51, v2

    move-object/from16 v34, v14

    :goto_5f
    add-int v2, v15, v3

    move-object/from16 v0, p0

    move/from16 v13, v36

    move-object/from16 v1, v37

    move-object/from16 v12, v39

    move/from16 v15, v41

    move-object/from16 v7, v42

    move/from16 v3, v51

    const/16 v58, 0x4

    goto/16 :goto_1b

    :cond_9b
    move-object/from16 v37, v1

    move-object/from16 v35, v6

    move-object/from16 v38, v8

    move v8, v11

    move-object/from16 v39, v12

    move/from16 v36, v13

    move/from16 v41, v15

    const/16 v0, 0xff

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    const/16 v28, 0x8

    move v6, v3

    .line 337
    iget-object v1, v10, LM2/d;->e:Ljava/lang/Object;

    check-cast v1, LN1/n;

    if-nez v1, :cond_9d

    if-eqz v38, :cond_9d

    .line 338
    new-instance v1, LN1/m;

    invoke-direct {v1}, LN1/m;-><init>()V

    .line 339
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, LN1/m;->a:Ljava/lang/String;

    .line 340
    invoke-static/range {v38 .. v38}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, LN1/m;->m:Ljava/lang/String;

    move-object/from16 v2, v35

    .line 341
    iput-object v2, v1, LN1/m;->j:Ljava/lang/String;

    .line 342
    iput v6, v1, LN1/m;->B:I

    .line 343
    iput v8, v1, LN1/m;->C:I

    move/from16 v2, v41

    .line 344
    iput v2, v1, LN1/m;->D:I

    move-object/from16 v2, v39

    .line 345
    iput-object v2, v1, LN1/m;->p:Ljava/util/List;

    .line 346
    iput-object v4, v1, LN1/m;->q:LN1/j;

    .line 347
    iput-object v9, v1, LN1/m;->d:Ljava/lang/String;

    if-eqz v34, :cond_9c

    move-object/from16 v2, v34

    .line 348
    iget-wide v3, v2, LM2/b;->c:J

    invoke-static {v3, v4}, LS3/f;->F(J)I

    move-result v3

    .line 349
    iput v3, v1, LN1/m;->h:I

    .line 350
    iget-wide v2, v2, LM2/b;->d:J

    invoke-static {v2, v3}, LS3/f;->F(J)I

    move-result v2

    .line 351
    iput v2, v1, LN1/m;->i:I

    .line 352
    :cond_9c
    new-instance v2, LN1/n;

    invoke-direct {v2, v1}, LN1/n;-><init>(LN1/m;)V

    .line 353
    iput-object v2, v10, LM2/d;->e:Ljava/lang/Object;

    :cond_9d
    :goto_60
    move/from16 v21, v0

    move-object v7, v10

    move/from16 v29, v13

    move/from16 v2, v32

    move/from16 v3, v36

    const/16 v20, 0x0

    const/16 v24, 0xa

    const/16 v25, 0x5

    const/16 v26, 0x10

    move-object/from16 v0, p0

    goto :goto_62

    :cond_9e
    move/from16 v32, v12

    const/4 v12, 0x0

    const/16 v22, 0xc

    const/16 v23, 0x7

    const/16 v27, 0x2

    move-object/from16 v0, p0

    move/from16 v5, p2

    move-object/from16 v6, p4

    move-object/from16 v37, v1

    move/from16 v56, v4

    move-object v7, v10

    move v3, v13

    move v8, v14

    move v1, v15

    move/from16 v2, v32

    const/16 v20, 0x0

    const/16 v21, 0xff

    const/16 v24, 0xa

    const/16 v25, 0x5

    const/16 v26, 0x10

    goto/16 :goto_3

    .line 354
    :goto_61
    invoke-static/range {v0 .. v8}, LM2/g;->h(LQ1/o;IIIIILN1/j;LM2/d;I)V

    move/from16 v33, v8

    :goto_62
    add-int v1, v2, v3

    .line 355
    invoke-virtual {v0, v1}, LQ1/o;->G(I)V

    add-int/lit8 v14, v33, 0x1

    move-object v10, v7

    move-object/from16 v1, v37

    move/from16 v4, v56

    goto/16 :goto_0

    :cond_9f
    move-object v7, v10

    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(LR1/b;Ls2/s;JLN1/j;ZZLk8/h;)Ljava/util/ArrayList;
    .locals 69

    move-object/from16 v0, p0

    const/4 v3, -0x1

    .line 1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    .line 2
    :goto_0
    iget-object v8, v0, LR1/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v7, v9, :cond_59

    .line 3
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LR1/b;

    .line 4
    iget v9, v8, LH5/a;->b:I

    const v10, 0x7472616b

    if-eq v9, v10, :cond_0

    move/from16 v49, v3

    move-object v0, v5

    move/from16 v25, v7

    const/16 v33, 0x5

    const/16 v34, 0x0

    :goto_1
    const/16 v38, 0x1

    goto/16 :goto_4e

    :cond_0
    const v9, 0x6d766864

    .line 5
    invoke-virtual {v0, v9}, LR1/b;->q(I)LR1/c;

    move-result-object v9

    .line 6
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v10, 0x6d646961

    .line 7
    invoke-virtual {v8, v10}, LR1/b;->o(I)LR1/b;

    move-result-object v11

    .line 8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v12, 0x68646c72    # 4.3148E24f

    .line 9
    invoke-virtual {v11, v12}, LR1/b;->q(I)LR1/c;

    move-result-object v12

    .line 10
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v12, v12, LR1/c;->c:LQ1/o;

    const/16 v13, 0x10

    invoke-virtual {v12, v13}, LQ1/o;->G(I)V

    .line 12
    invoke-virtual {v12}, LQ1/o;->h()I

    move-result v12

    const v14, 0x736f756e

    if-ne v12, v14, :cond_1

    const/4 v12, 0x1

    goto :goto_3

    :cond_1
    const v14, 0x76696465

    if-ne v12, v14, :cond_2

    const/4 v12, 0x2

    goto :goto_3

    :cond_2
    const v14, 0x74657874

    if-eq v12, v14, :cond_5

    const v14, 0x7362746c

    if-eq v12, v14, :cond_5

    const v14, 0x73756274

    if-eq v12, v14, :cond_5

    const v14, 0x636c6370

    if-ne v12, v14, :cond_3

    goto :goto_2

    :cond_3
    const v14, 0x6d657461

    if-ne v12, v14, :cond_4

    const/4 v12, 0x5

    goto :goto_3

    :cond_4
    move v12, v3

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v12, 0x3

    .line 13
    :goto_3
    const-string v14, ""

    const/16 v33, 0x5

    const-wide/16 v35, 0x0

    const/4 v10, 0x4

    if-ne v12, v3, :cond_6

    :goto_4
    move-object/from16 v0, p7

    const/4 v15, 0x0

    goto/16 :goto_1c

    :cond_6
    const v15, 0x746b6864

    .line 14
    invoke-virtual {v8, v15}, LR1/b;->q(I)LR1/c;

    move-result-object v15

    .line 15
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iget-object v15, v15, LR1/c;->c:LQ1/o;

    const/16 v38, 0x1

    const/16 v4, 0x8

    invoke-virtual {v15, v4}, LQ1/o;->G(I)V

    .line 17
    invoke-virtual {v15}, LQ1/o;->h()I

    move-result v16

    .line 18
    invoke-static/range {v16 .. v16}, LM2/g;->c(I)I

    move-result v16

    if-nez v16, :cond_7

    goto :goto_5

    :cond_7
    move v4, v13

    .line 19
    :goto_5
    invoke-virtual {v15, v4}, LQ1/o;->H(I)V

    .line 20
    invoke-virtual {v15}, LQ1/o;->h()I

    move-result v19

    .line 21
    invoke-virtual {v15, v10}, LQ1/o;->H(I)V

    .line 22
    iget v4, v15, LQ1/o;->b:I

    if-nez v16, :cond_8

    move v2, v10

    goto :goto_6

    :cond_8
    const/16 v2, 0x8

    :goto_6
    const/4 v6, 0x0

    :goto_7
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v6, v2, :cond_b

    .line 23
    iget-object v10, v15, LQ1/o;->a:[B

    add-int v18, v4, v6

    .line 24
    aget-byte v10, v10, v18

    if-eq v10, v3, :cond_a

    if-nez v16, :cond_9

    .line 25
    invoke-virtual {v15}, LQ1/o;->w()J

    move-result-wide v22

    goto :goto_8

    :cond_9
    invoke-virtual {v15}, LQ1/o;->z()J

    move-result-wide v22

    :goto_8
    cmp-long v2, v22, v35

    if-nez v2, :cond_c

    :goto_9
    move-wide/from16 v22, v20

    goto :goto_a

    :cond_a
    add-int/lit8 v6, v6, 0x1

    const/4 v10, 0x4

    goto :goto_7

    .line 26
    :cond_b
    invoke-virtual {v15, v2}, LQ1/o;->H(I)V

    goto :goto_9

    .line 27
    :cond_c
    :goto_a
    invoke-virtual {v15, v13}, LQ1/o;->H(I)V

    .line 28
    invoke-virtual {v15}, LQ1/o;->h()I

    move-result v2

    .line 29
    invoke-virtual {v15}, LQ1/o;->h()I

    move-result v4

    const/4 v6, 0x4

    .line 30
    invoke-virtual {v15, v6}, LQ1/o;->H(I)V

    .line 31
    invoke-virtual {v15}, LQ1/o;->h()I

    move-result v6

    .line 32
    invoke-virtual {v15}, LQ1/o;->h()I

    move-result v10

    const/high16 v15, -0x10000

    const/high16 v13, 0x10000

    if-nez v2, :cond_d

    if-ne v4, v13, :cond_d

    if-ne v6, v15, :cond_d

    if-nez v10, :cond_d

    const/16 v2, 0x5a

    :goto_b
    move-wide/from16 v24, v20

    move/from16 v20, v2

    goto :goto_c

    :cond_d
    if-nez v2, :cond_e

    if-ne v4, v15, :cond_e

    if-ne v6, v13, :cond_e

    if-nez v10, :cond_e

    const/16 v2, 0x10e

    goto :goto_b

    :cond_e
    if-ne v2, v15, :cond_f

    if-nez v4, :cond_f

    if-nez v6, :cond_f

    if-ne v10, v15, :cond_f

    const/16 v2, 0xb4

    goto :goto_b

    :cond_f
    move-wide/from16 v24, v20

    const/16 v20, 0x0

    :goto_c
    cmp-long v2, p2, v24

    if-nez v2, :cond_10

    move-wide/from16 v26, v22

    goto :goto_d

    :cond_10
    move-wide/from16 v26, p2

    .line 33
    :goto_d
    iget-object v2, v9, LR1/c;->c:LQ1/o;

    invoke-static {v2}, LM2/g;->d(LQ1/o;)LR1/e;

    move-result-object v2

    cmp-long v4, v26, v24

    .line 34
    iget-wide v9, v2, LR1/e;->c:J

    if-nez v4, :cond_11

    move-wide/from16 v30, v9

    move-wide/from16 v9, v24

    :goto_e
    const v2, 0x6d696e66

    goto :goto_f

    .line 35
    :cond_11
    sget v2, LQ1/x;->a:I

    .line 36
    sget-object v32, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v28, 0xf4240

    move-wide/from16 v30, v9

    invoke-static/range {v26 .. v32}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v9

    goto :goto_e

    .line 37
    :goto_f
    invoke-virtual {v11, v2}, LR1/b;->o(I)LR1/b;

    move-result-object v4

    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7374626c

    .line 39
    invoke-virtual {v4, v2}, LR1/b;->o(I)LR1/b;

    move-result-object v4

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x6d646864

    .line 41
    invoke-virtual {v11, v2}, LR1/b;->q(I)LR1/c;

    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    iget-object v2, v2, LR1/c;->c:LQ1/o;

    const/16 v6, 0x8

    invoke-virtual {v2, v6}, LQ1/o;->G(I)V

    .line 44
    invoke-virtual {v2}, LQ1/o;->h()I

    move-result v6

    .line 45
    invoke-static {v6}, LM2/g;->c(I)I

    move-result v6

    if-nez v6, :cond_12

    const/16 v13, 0x8

    goto :goto_10

    :cond_12
    const/16 v13, 0x10

    .line 46
    :goto_10
    invoke-virtual {v2, v13}, LQ1/o;->H(I)V

    .line 47
    invoke-virtual {v2}, LQ1/o;->w()J

    move-result-wide v46

    .line 48
    iget v11, v2, LQ1/o;->b:I

    if-nez v6, :cond_13

    const/4 v13, 0x4

    goto :goto_11

    :cond_13
    const/16 v13, 0x8

    :goto_11
    const/4 v15, 0x0

    :goto_12
    if-ge v15, v13, :cond_17

    .line 49
    iget-object v3, v2, LQ1/o;->a:[B

    add-int v16, v11, v15

    .line 50
    aget-byte v3, v3, v16

    const/4 v0, -0x1

    if-eq v3, v0, :cond_16

    if-nez v6, :cond_14

    .line 51
    invoke-virtual {v2}, LQ1/o;->w()J

    move-result-wide v15

    :goto_13
    move-wide/from16 v42, v15

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, LQ1/o;->z()J

    move-result-wide v15

    goto :goto_13

    :goto_14
    cmp-long v0, v42, v35

    if-nez v0, :cond_15

    :goto_15
    move-wide/from16 v25, v24

    goto :goto_16

    .line 52
    :cond_15
    sget v0, LQ1/x;->a:I

    .line 53
    sget-object v48, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v44, 0xf4240

    invoke-static/range {v42 .. v48}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v15

    move-wide/from16 v25, v15

    goto :goto_16

    :cond_16
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    const/4 v3, -0x1

    goto :goto_12

    .line 54
    :cond_17
    invoke-virtual {v2, v13}, LQ1/o;->H(I)V

    goto :goto_15

    .line 55
    :goto_16
    invoke-virtual {v2}, LQ1/o;->A()I

    move-result v0

    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    shr-int/lit8 v3, v0, 0xa

    and-int/lit8 v3, v3, 0x1f

    add-int/lit8 v3, v3, 0x60

    int-to-char v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v3, v0, 0x5

    and-int/lit8 v3, v3, 0x1f

    add-int/lit8 v3, v3, 0x60

    int-to-char v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x60

    int-to-char v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    const v0, 0x73747364

    .line 57
    invoke-virtual {v4, v0}, LR1/b;->q(I)LR1/c;

    move-result-object v0

    if-eqz v0, :cond_58

    .line 58
    iget-object v0, v0, LR1/c;->c:LQ1/o;

    move-object/from16 v22, p4

    move/from16 v23, p6

    move-object/from16 v18, v0

    invoke-static/range {v18 .. v23}, LM2/g;->f(LQ1/o;IILjava/lang/String;LN1/j;Z)LM2/d;

    move-result-object v0

    if-nez p5, :cond_1d

    const v2, 0x65647473

    .line 59
    invoke-virtual {v8, v2}, LR1/b;->o(I)LR1/b;

    move-result-object v2

    if-eqz v2, :cond_1d

    const v3, 0x656c7374

    .line 60
    invoke-virtual {v2, v3}, LR1/b;->q(I)LR1/c;

    move-result-object v2

    if-nez v2, :cond_18

    const/4 v2, 0x0

    goto :goto_1a

    .line 61
    :cond_18
    iget-object v2, v2, LR1/c;->c:LQ1/o;

    const/16 v6, 0x8

    invoke-virtual {v2, v6}, LQ1/o;->G(I)V

    .line 62
    invoke-virtual {v2}, LQ1/o;->h()I

    move-result v3

    .line 63
    invoke-static {v3}, LM2/g;->c(I)I

    move-result v3

    .line 64
    invoke-virtual {v2}, LQ1/o;->y()I

    move-result v4

    .line 65
    new-array v6, v4, [J

    .line 66
    new-array v11, v4, [J

    const/4 v13, 0x0

    :goto_17
    if-ge v13, v4, :cond_1c

    move/from16 v15, v38

    if-ne v3, v15, :cond_19

    .line 67
    invoke-virtual {v2}, LQ1/o;->z()J

    move-result-wide v16

    goto :goto_18

    :cond_19
    invoke-virtual {v2}, LQ1/o;->w()J

    move-result-wide v16

    :goto_18
    aput-wide v16, v6, v13

    if-ne v3, v15, :cond_1a

    .line 68
    invoke-virtual {v2}, LQ1/o;->o()J

    move-result-wide v16

    move-wide/from16 v67, v16

    move/from16 v16, v3

    move/from16 v17, v4

    move-wide/from16 v3, v67

    goto :goto_19

    :cond_1a
    invoke-virtual {v2}, LQ1/o;->h()I

    move-result v15

    move/from16 v16, v3

    move/from16 v17, v4

    int-to-long v3, v15

    :goto_19
    aput-wide v3, v11, v13

    .line 69
    invoke-virtual {v2}, LQ1/o;->r()S

    move-result v3

    const/4 v15, 0x1

    if-ne v3, v15, :cond_1b

    const/4 v3, 0x2

    .line 70
    invoke-virtual {v2, v3}, LQ1/o;->H(I)V

    add-int/2addr v13, v15

    move/from16 v38, v15

    move/from16 v3, v16

    move/from16 v4, v17

    goto :goto_17

    .line 71
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_1c
    invoke-static {v6, v11}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    :goto_1a
    if-eqz v2, :cond_1d

    .line 73
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, [J

    .line 74
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [J

    move-object/from16 v32, v2

    goto :goto_1b

    :cond_1d
    const/4 v3, 0x0

    const/16 v32, 0x0

    .line 75
    :goto_1b
    iget-object v2, v0, LM2/d;->e:Ljava/lang/Object;

    move-object/from16 v27, v2

    check-cast v27, LN1/n;

    if-nez v27, :cond_1e

    goto/16 :goto_4

    .line 76
    :cond_1e
    new-instance v16, LM2/s;

    .line 77
    iget v2, v0, LM2/d;->c:I

    iget-object v4, v0, LM2/d;->d:Ljava/lang/Object;

    move-object/from16 v29, v4

    check-cast v29, [LM2/t;

    iget v0, v0, LM2/d;->b:I

    move/from16 v28, v2

    move-wide/from16 v23, v9

    move/from16 v18, v12

    move/from16 v17, v19

    move-wide/from16 v21, v30

    move-wide/from16 v19, v46

    move/from16 v30, v0

    move-object/from16 v31, v3

    invoke-direct/range {v16 .. v32}, LM2/s;-><init>(IIJJJJLN1/n;I[LM2/t;I[J[J)V

    move-object/from16 v0, p7

    move-object/from16 v15, v16

    .line 78
    :goto_1c
    invoke-interface {v0, v15}, Lk8/h;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM2/s;

    if-nez v2, :cond_1f

    move-object v0, v5

    move/from16 v25, v7

    const/16 v34, 0x0

    const/16 v38, 0x1

    const/16 v49, -0x1

    goto/16 :goto_4e

    :cond_1f
    const v3, 0x6d646961

    .line 79
    invoke-virtual {v8, v3}, LR1/b;->o(I)LR1/b;

    move-result-object v3

    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x6d696e66

    .line 81
    invoke-virtual {v3, v4}, LR1/b;->o(I)LR1/b;

    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x7374626c

    .line 83
    invoke-virtual {v3, v4}, LR1/b;->o(I)LR1/b;

    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x7374737a

    .line 85
    invoke-virtual {v3, v4}, LR1/b;->q(I)LR1/c;

    move-result-object v4

    .line 86
    iget-object v6, v2, LM2/s;->g:LN1/n;

    if-eqz v4, :cond_20

    .line 87
    new-instance v8, LM2/e;

    invoke-direct {v8, v4, v6}, LM2/e;-><init>(LR1/c;LN1/n;)V

    goto :goto_1d

    :cond_20
    const v4, 0x73747a32

    .line 88
    invoke-virtual {v3, v4}, LR1/b;->q(I)LR1/c;

    move-result-object v4

    if-eqz v4, :cond_57

    .line 89
    new-instance v8, LM2/f;

    invoke-direct {v8, v4}, LM2/f;-><init>(LR1/c;)V

    .line 90
    :goto_1d
    invoke-interface {v8}, LM2/c;->d()I

    move-result v4

    if-nez v4, :cond_21

    .line 91
    new-instance v15, LM2/v;

    const/4 v3, 0x0

    new-array v4, v3, [J

    new-array v6, v3, [I

    new-array v8, v3, [J

    new-array v9, v3, [I

    const-wide/16 v22, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    move-object/from16 v18, v6

    move-object/from16 v20, v8

    move-object/from16 v21, v9

    invoke-direct/range {v15 .. v23}, LM2/v;-><init>(LM2/s;[J[II[J[IJ)V

    move-object v0, v5

    move/from16 v25, v7

    const/16 v34, 0x0

    const/16 v49, -0x1

    goto/16 :goto_4d

    .line 92
    :cond_21
    iget v9, v2, LM2/s;->b:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_22

    iget-wide v9, v2, LM2/s;->f:J

    cmp-long v11, v9, v35

    if-lez v11, :cond_22

    int-to-float v11, v4

    long-to-float v9, v9

    const v10, 0x49742400    # 1000000.0f

    div-float/2addr v9, v10

    div-float/2addr v11, v9

    .line 93
    invoke-virtual {v6}, LN1/n;->a()LN1/m;

    move-result-object v6

    .line 94
    iput v11, v6, LN1/m;->v:F

    .line 95
    new-instance v9, LN1/n;

    invoke-direct {v9, v6}, LN1/n;-><init>(LN1/m;)V

    .line 96
    new-instance v15, LM2/s;

    iget-object v6, v2, LM2/s;->i:[J

    iget-object v10, v2, LM2/s;->j:[J

    iget v11, v2, LM2/s;->a:I

    iget v12, v2, LM2/s;->b:I

    move-object/from16 v30, v6

    move v13, v7

    iget-wide v6, v2, LM2/s;->c:J

    move-wide/from16 v18, v6

    iget-wide v6, v2, LM2/s;->d:J

    move-wide/from16 v20, v6

    iget-wide v6, v2, LM2/s;->e:J

    move-wide/from16 v22, v6

    iget-wide v6, v2, LM2/s;->f:J

    iget v0, v2, LM2/s;->h:I

    move/from16 v27, v0

    iget-object v0, v2, LM2/s;->l:[LM2/t;

    iget v2, v2, LM2/s;->k:I

    move-object/from16 v28, v0

    move/from16 v29, v2

    move-wide/from16 v24, v6

    move-object/from16 v26, v9

    move-object/from16 v31, v10

    move/from16 v16, v11

    move/from16 v17, v12

    invoke-direct/range {v15 .. v31}, LM2/s;-><init>(IIJJJJLN1/n;I[LM2/t;I[J[J)V

    move-object v2, v15

    goto :goto_1e

    :cond_22
    move v13, v7

    :goto_1e
    const v0, 0x7374636f

    .line 97
    invoke-virtual {v3, v0}, LR1/b;->q(I)LR1/c;

    move-result-object v0

    if-nez v0, :cond_23

    const v0, 0x636f3634

    .line 98
    invoke-virtual {v3, v0}, LR1/b;->q(I)LR1/c;

    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x1

    goto :goto_1f

    :cond_23
    const/4 v6, 0x0

    :goto_1f
    const v7, 0x73747363

    .line 100
    invoke-virtual {v3, v7}, LR1/b;->q(I)LR1/c;

    move-result-object v7

    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, 0x73747473

    .line 102
    invoke-virtual {v3, v9}, LR1/b;->q(I)LR1/c;

    move-result-object v9

    .line 103
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v10, 0x73747373

    .line 104
    invoke-virtual {v3, v10}, LR1/b;->q(I)LR1/c;

    move-result-object v10

    if-eqz v10, :cond_24

    .line 105
    iget-object v10, v10, LR1/c;->c:LQ1/o;

    goto :goto_20

    :cond_24
    const/4 v10, 0x0

    :goto_20
    const v11, 0x63747473

    .line 106
    invoke-virtual {v3, v11}, LR1/b;->q(I)LR1/c;

    move-result-object v3

    if-eqz v3, :cond_25

    .line 107
    iget-object v3, v3, LR1/c;->c:LQ1/o;

    goto :goto_21

    :cond_25
    const/4 v3, 0x0

    .line 108
    :goto_21
    new-instance v11, LM2/a;

    iget-object v7, v7, LR1/c;->c:LQ1/o;

    iget-object v0, v0, LR1/c;->c:LQ1/o;

    invoke-direct {v11, v7, v0, v6}, LM2/a;-><init>(LQ1/o;LQ1/o;Z)V

    .line 109
    iget-object v0, v9, LR1/c;->c:LQ1/o;

    const/16 v6, 0xc

    invoke-virtual {v0, v6}, LQ1/o;->G(I)V

    .line 110
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v7

    const/16 v38, 0x1

    add-int/lit8 v7, v7, -0x1

    .line 111
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v9

    .line 112
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v12

    if-eqz v3, :cond_26

    .line 113
    invoke-virtual {v3, v6}, LQ1/o;->G(I)V

    .line 114
    invoke-virtual {v3}, LQ1/o;->y()I

    move-result v15

    goto :goto_22

    :cond_26
    const/4 v15, 0x0

    :goto_22
    if-eqz v10, :cond_28

    .line 115
    invoke-virtual {v10, v6}, LQ1/o;->G(I)V

    .line 116
    invoke-virtual {v10}, LQ1/o;->y()I

    move-result v6

    if-lez v6, :cond_27

    .line 117
    invoke-virtual {v10}, LQ1/o;->y()I

    move-result v16

    const/16 v38, 0x1

    add-int/lit8 v16, v16, -0x1

    move-object/from16 v17, v0

    goto :goto_24

    :cond_27
    move-object/from16 v17, v0

    const/4 v10, 0x0

    :goto_23
    const/16 v16, -0x1

    goto :goto_24

    :cond_28
    move-object/from16 v17, v0

    const/4 v6, 0x0

    goto :goto_23

    .line 118
    :goto_24
    invoke-interface {v8}, LM2/c;->c()I

    move-result v0

    move-object/from16 v18, v3

    .line 119
    iget-object v3, v2, LM2/s;->g:LN1/n;

    move/from16 v19, v6

    iget-object v6, v3, LN1/n;->n:Ljava/lang/String;

    move/from16 v20, v7

    const/4 v7, -0x1

    if-eq v0, v7, :cond_2e

    .line 120
    const-string v7, "audio/raw"

    .line 121
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_29

    const-string v7, "audio/g711-mlaw"

    .line 122
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_29

    const-string v7, "audio/g711-alaw"

    .line 123
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    :cond_29
    if-nez v20, :cond_2e

    if-nez v15, :cond_2e

    if-nez v19, :cond_2e

    .line 124
    iget v6, v11, LM2/a;->b:I

    new-array v7, v6, [J

    .line 125
    new-array v8, v6, [I

    .line 126
    :goto_25
    invoke-virtual {v11}, LM2/a;->a()Z

    move-result v9

    if-eqz v9, :cond_2a

    .line 127
    iget v9, v11, LM2/a;->c:I

    iget-wide v14, v11, LM2/a;->e:J

    aput-wide v14, v7, v9

    .line 128
    iget v10, v11, LM2/a;->d:I

    aput v10, v8, v9

    goto :goto_25

    :cond_2a
    int-to-long v9, v12

    const/16 v11, 0x2000

    .line 129
    div-int/2addr v11, v0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_26
    if-ge v12, v6, :cond_2b

    .line 130
    aget v15, v8, v12

    .line 131
    invoke-static {v15, v11}, LQ1/x;->f(II)I

    move-result v15

    add-int/2addr v14, v15

    const/16 v38, 0x1

    add-int/lit8 v12, v12, 0x1

    goto :goto_26

    .line 132
    :cond_2b
    new-array v12, v14, [J

    .line 133
    new-array v15, v14, [I

    move/from16 v21, v0

    .line 134
    new-array v0, v14, [J

    .line 135
    new-array v14, v14, [I

    move-object/from16 v16, v0

    move-object/from16 v17, v7

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_27
    if-ge v0, v6, :cond_2d

    .line 136
    aget v20, v8, v0

    .line 137
    aget-wide v22, v17, v0

    move/from16 v67, v19

    move/from16 v19, v0

    move/from16 v0, v18

    move/from16 v18, v67

    move/from16 v67, v20

    move/from16 v20, v6

    move/from16 v6, v67

    :goto_28
    if-lez v6, :cond_2c

    .line 138
    invoke-static {v11, v6}, Ljava/lang/Math;->min(II)I

    move-result v24

    .line 139
    aput-wide v22, v12, v18

    move/from16 v25, v6

    mul-int v6, v21, v24

    .line 140
    aput v6, v15, v18

    .line 141
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    move-object v6, v8

    move-wide/from16 v26, v9

    int-to-long v8, v7

    mul-long v9, v26, v8

    .line 142
    aput-wide v9, v16, v18

    const/16 v38, 0x1

    .line 143
    aput v38, v14, v18

    .line 144
    aget v8, v15, v18

    int-to-long v8, v8

    add-long v22, v22, v8

    add-int v7, v7, v24

    sub-int v8, v25, v24

    add-int/lit8 v18, v18, 0x1

    move v9, v8

    move-object v8, v6

    move v6, v9

    move-wide/from16 v9, v26

    goto :goto_28

    :cond_2c
    move-object v6, v8

    move-wide/from16 v26, v9

    const/16 v38, 0x1

    add-int/lit8 v8, v19, 0x1

    move/from16 v19, v18

    move/from16 v18, v0

    move v0, v8

    move-object v8, v6

    move/from16 v6, v20

    goto :goto_27

    :cond_2d
    move-wide/from16 v26, v9

    int-to-long v6, v7

    mul-long v9, v26, v6

    move-object/from16 v23, v3

    move-object/from16 v26, v5

    move-wide v5, v9

    move/from16 v25, v13

    move-object/from16 v19, v15

    move/from16 v20, v18

    const/16 v49, -0x1

    move-object/from16 v18, v12

    :goto_29
    move-object/from16 v22, v14

    move-object/from16 v0, v16

    goto/16 :goto_37

    .line 145
    :cond_2e
    new-array v0, v4, [J

    .line 146
    new-array v6, v4, [I

    .line 147
    new-array v7, v4, [J

    move-object/from16 v21, v8

    .line 148
    new-array v8, v4, [I

    move/from16 v22, v15

    move v15, v9

    move/from16 v9, v19

    move/from16 v19, v22

    move-object/from16 v23, v3

    move-object/from16 v26, v5

    move/from16 v25, v13

    move/from16 v13, v16

    move-wide/from16 v27, v35

    move-wide/from16 v29, v27

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, v10

    move v10, v12

    move/from16 v12, v20

    move-object/from16 v20, v14

    const/4 v14, 0x0

    .line 149
    :goto_2a
    const-string v1, "BoxParsers"

    if-ge v14, v4, :cond_38

    const/16 v31, 0x1

    :goto_2b
    if-nez v22, :cond_2f

    .line 150
    invoke-virtual {v11}, LM2/a;->a()Z

    move-result v31

    if-eqz v31, :cond_2f

    move/from16 v32, v4

    move/from16 v37, v5

    .line 151
    iget-wide v4, v11, LM2/a;->e:J

    move-wide/from16 v29, v4

    .line 152
    iget v4, v11, LM2/a;->d:I

    move/from16 v22, v4

    move/from16 v4, v32

    move/from16 v5, v37

    goto :goto_2b

    :cond_2f
    move/from16 v32, v4

    move/from16 v37, v5

    if-nez v31, :cond_30

    .line 153
    const-string v4, "Unexpected end of chunk data"

    invoke-static {v1, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    invoke-static {v0, v14}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    .line 155
    invoke-static {v6, v14}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    .line 156
    invoke-static {v7, v14}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v5

    .line 157
    invoke-static {v8, v14}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    move-object v7, v5

    move-object v5, v0

    move-object v0, v7

    move-object v7, v6

    move-object v6, v4

    move v4, v14

    move-object v14, v7

    move/from16 v8, v37

    :goto_2c
    move/from16 v7, v22

    goto/16 :goto_31

    :cond_30
    if-eqz v18, :cond_32

    move/from16 v1, v24

    move/from16 v5, v37

    :goto_2d
    if-nez v1, :cond_31

    if-lez v19, :cond_31

    .line 158
    invoke-virtual/range {v18 .. v18}, LQ1/o;->y()I

    move-result v1

    .line 159
    invoke-virtual/range {v18 .. v18}, LQ1/o;->h()I

    move-result v5

    const/16 v49, -0x1

    add-int/lit8 v19, v19, -0x1

    goto :goto_2d

    :cond_31
    const/16 v49, -0x1

    add-int/lit8 v1, v1, -0x1

    move/from16 v24, v1

    goto :goto_2e

    :cond_32
    move/from16 v5, v37

    .line 160
    :goto_2e
    aput-wide v29, v0, v14

    .line 161
    invoke-interface/range {v21 .. v21}, LM2/c;->a()I

    move-result v1

    aput v1, v6, v14

    if-le v1, v3, :cond_33

    move v3, v1

    :cond_33
    move-object v4, v0

    int-to-long v0, v5

    add-long v0, v27, v0

    .line 162
    aput-wide v0, v7, v14

    if-nez v16, :cond_34

    const/4 v0, 0x1

    goto :goto_2f

    :cond_34
    const/4 v0, 0x0

    .line 163
    :goto_2f
    aput v0, v8, v14

    if-ne v14, v13, :cond_35

    const/16 v38, 0x1

    .line 164
    aput v38, v8, v14

    const/16 v49, -0x1

    add-int/lit8 v9, v9, -0x1

    if-lez v9, :cond_36

    .line 165
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    invoke-virtual/range {v16 .. v16}, LQ1/o;->y()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v13, v0

    goto :goto_30

    :cond_35
    const/16 v49, -0x1

    :cond_36
    :goto_30
    int-to-long v0, v10

    add-long v27, v27, v0

    add-int/lit8 v15, v15, -0x1

    if-nez v15, :cond_37

    if-lez v12, :cond_37

    .line 167
    invoke-virtual/range {v17 .. v17}, LQ1/o;->y()I

    move-result v0

    .line 168
    invoke-virtual/range {v17 .. v17}, LQ1/o;->h()I

    move-result v1

    add-int/lit8 v12, v12, -0x1

    move v15, v0

    move v10, v1

    .line 169
    :cond_37
    aget v0, v6, v14

    int-to-long v0, v0

    add-long v29, v29, v0

    add-int/lit8 v22, v22, -0x1

    const/16 v38, 0x1

    add-int/lit8 v14, v14, 0x1

    move-object v0, v4

    move/from16 v4, v32

    goto/16 :goto_2a

    :cond_38
    move/from16 v32, v4

    move-object v4, v0

    move-object v0, v7

    move-object v14, v8

    move v8, v5

    move-object v5, v4

    move/from16 v4, v32

    goto/16 :goto_2c

    :goto_31
    int-to-long v10, v8

    add-long v10, v27, v10

    if-eqz v18, :cond_3a

    :goto_32
    if-lez v19, :cond_3a

    .line 170
    invoke-virtual/range {v18 .. v18}, LQ1/o;->y()I

    move-result v8

    if-eqz v8, :cond_39

    const/4 v8, 0x0

    const/16 v49, -0x1

    goto :goto_33

    .line 171
    :cond_39
    invoke-virtual/range {v18 .. v18}, LQ1/o;->h()I

    const/16 v49, -0x1

    add-int/lit8 v19, v19, -0x1

    goto :goto_32

    :cond_3a
    const/16 v49, -0x1

    const/4 v8, 0x1

    :goto_33
    if-nez v9, :cond_3c

    if-nez v15, :cond_3c

    if-nez v7, :cond_3c

    if-nez v12, :cond_3c

    if-nez v24, :cond_3c

    if-nez v8, :cond_3b

    goto :goto_34

    :cond_3b
    move-object/from16 v16, v0

    move/from16 v17, v3

    move/from16 v18, v4

    goto :goto_36

    .line 172
    :cond_3c
    :goto_34
    new-instance v13, Ljava/lang/StringBuilder;

    move-object/from16 v16, v0

    const-string v0, "Inconsistent stbl box for track "

    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v2, LM2/s;->a:I

    move/from16 v17, v3

    const-string v3, ": remainingSynchronizationSamples "

    move/from16 v18, v4

    const-string v4, ", remainingSamplesAtTimestampDelta "

    .line 173
    invoke-static {v0, v9, v3, v4, v13}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 174
    const-string v0, ", remainingSamplesInChunk "

    const-string v3, ", remainingTimestampDeltaChanges "

    .line 175
    invoke-static {v15, v7, v0, v3, v13}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 176
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v24

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v8, :cond_3d

    .line 177
    const-string v0, ", ctts invalid"

    goto :goto_35

    :cond_3d
    move-object/from16 v0, v20

    :goto_35
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-static {v1, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_36
    move-object/from16 v19, v6

    move/from16 v20, v17

    move/from16 v4, v18

    move-object/from16 v18, v5

    move-wide v5, v10

    goto/16 :goto_29

    .line 179
    :goto_37
    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v7, 0xf4240

    iget-wide v9, v2, LM2/s;->c:J

    move-object v11, v13

    invoke-static/range {v5 .. v11}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    .line 180
    iget-wide v14, v2, LM2/s;->c:J

    iget-object v1, v2, LM2/s;->i:[J

    if-nez v1, :cond_3e

    .line 181
    invoke-static {v0, v14, v15}, LQ1/x;->R([JJ)V

    .line 182
    new-instance v16, LM2/v;

    move-object/from16 v21, v0

    move-object/from16 v17, v2

    move-wide/from16 v23, v7

    invoke-direct/range {v16 .. v24}, LM2/v;-><init>(LM2/s;[J[II[J[IJ)V

    :goto_38
    move-object/from16 v15, v16

    move-object/from16 v0, v26

    const/16 v34, 0x0

    goto/16 :goto_4d

    .line 183
    :cond_3e
    array-length v3, v1

    iget v7, v2, LM2/s;->b:I

    iget-object v8, v2, LM2/s;->j:[J

    const/4 v9, 0x1

    if-ne v3, v9, :cond_43

    if-ne v7, v9, :cond_43

    array-length v3, v0

    const/4 v10, 0x2

    if-lt v3, v10, :cond_43

    .line 184
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    .line 185
    aget-wide v16, v8, v3

    .line 186
    aget-wide v9, v1, v3

    move v11, v7

    move-object v12, v8

    move-wide v7, v9

    .line 187
    iget-wide v9, v2, LM2/s;->c:J

    move/from16 v21, v11

    move-object/from16 v24, v12

    iget-wide v11, v2, LM2/s;->d:J

    move/from16 v50, v21

    invoke-static/range {v7 .. v13}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    add-long v7, v16, v7

    .line 188
    array-length v9, v0

    const/16 v38, 0x1

    add-int/lit8 v9, v9, -0x1

    const/4 v10, 0x4

    .line 189
    invoke-static {v10, v3, v9}, LQ1/x;->i(III)I

    move-result v11

    .line 190
    array-length v12, v0

    sub-int/2addr v12, v10

    .line 191
    invoke-static {v12, v3, v9}, LQ1/x;->i(III)I

    move-result v9

    .line 192
    aget-wide v27, v0, v3

    cmp-long v3, v27, v16

    if-gtz v3, :cond_3f

    aget-wide v10, v0, v11

    cmp-long v3, v16, v10

    if-gez v3, :cond_3f

    aget-wide v9, v0, v9

    cmp-long v3, v9, v7

    if-gez v3, :cond_3f

    cmp-long v3, v7, v5

    if-gtz v3, :cond_3f

    const/4 v3, 0x1

    goto :goto_39

    :cond_3f
    const/4 v3, 0x0

    :goto_39
    if-eqz v3, :cond_42

    sub-long v29, v5, v7

    sub-long v7, v16, v27

    move-object/from16 v3, v23

    .line 193
    iget v9, v3, LN1/n;->D:I

    int-to-long v9, v9

    .line 194
    iget-wide v11, v2, LM2/s;->c:J

    invoke-static/range {v7 .. v13}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    .line 195
    iget-wide v11, v2, LM2/s;->c:J

    move-wide/from16 v16, v5

    move-wide v5, v7

    move-wide/from16 v7, v29

    invoke-static/range {v7 .. v13}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    cmp-long v9, v5, v35

    if-nez v9, :cond_41

    cmp-long v9, v7, v35

    if-eqz v9, :cond_40

    goto :goto_3b

    :cond_40
    :goto_3a
    move-object/from16 v5, p1

    goto :goto_3d

    :cond_41
    :goto_3b
    const-wide/32 v9, 0x7fffffff

    cmp-long v11, v5, v9

    if-gtz v11, :cond_40

    cmp-long v9, v7, v9

    if-gtz v9, :cond_40

    long-to-int v3, v5

    move-object/from16 v5, p1

    .line 196
    iput v3, v5, Ls2/s;->a:I

    long-to-int v3, v7

    .line 197
    iput v3, v5, Ls2/s;->b:I

    .line 198
    invoke-static {v0, v14, v15}, LQ1/x;->R([JJ)V

    const/16 v34, 0x0

    .line 199
    aget-wide v7, v1, v34

    const-wide/32 v9, 0xf4240

    .line 200
    iget-wide v11, v2, LM2/s;->d:J

    invoke-static/range {v7 .. v13}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v23

    .line 201
    new-instance v16, LM2/v;

    move-object/from16 v21, v0

    move-object/from16 v17, v2

    invoke-direct/range {v16 .. v24}, LM2/v;-><init>(LM2/s;[J[II[J[IJ)V

    goto/16 :goto_38

    :cond_42
    move-wide/from16 v16, v5

    :goto_3c
    move-object/from16 v3, v23

    goto :goto_3a

    :cond_43
    move-wide/from16 v16, v5

    move/from16 v50, v7

    move-object/from16 v24, v8

    goto :goto_3c

    .line 202
    :goto_3d
    array-length v6, v1

    const/4 v15, 0x1

    const/16 v34, 0x0

    if-ne v6, v15, :cond_45

    aget-wide v6, v1, v34

    cmp-long v6, v6, v35

    if-nez v6, :cond_45

    .line 203
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    aget-wide v3, v24, v34

    move/from16 v1, v34

    .line 205
    :goto_3e
    array-length v6, v0

    if-ge v1, v6, :cond_44

    .line 206
    aget-wide v6, v0, v1

    sub-long v8, v6, v3

    .line 207
    sget-object v14, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v10, 0xf4240

    iget-wide v12, v2, LM2/s;->c:J

    invoke-static/range {v8 .. v14}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    .line 208
    aput-wide v6, v0, v1

    const/16 v38, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3e

    :cond_44
    sub-long v6, v16, v3

    .line 209
    sget-object v12, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v8, 0xf4240

    iget-wide v10, v2, LM2/s;->c:J

    invoke-static/range {v6 .. v12}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v23

    .line 210
    new-instance v16, LM2/v;

    move-object/from16 v21, v0

    move-object/from16 v17, v2

    invoke-direct/range {v16 .. v24}, LM2/v;-><init>(LM2/s;[J[II[J[IJ)V

    move-object/from16 v15, v16

    move-object/from16 v0, v26

    goto/16 :goto_4d

    :cond_45
    move-object/from16 v12, v18

    move-object/from16 v15, v19

    move-object/from16 v14, v22

    move/from16 v11, v50

    const/4 v9, 0x1

    if-ne v11, v9, :cond_46

    const/4 v6, 0x1

    goto :goto_3f

    :cond_46
    move/from16 v6, v34

    .line 211
    :goto_3f
    array-length v7, v1

    new-array v7, v7, [I

    .line 212
    array-length v8, v1

    new-array v8, v8, [I

    .line 213
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v3

    move/from16 v3, v34

    move v9, v3

    move v10, v9

    move v13, v10

    .line 214
    :goto_40
    array-length v5, v1

    if-ge v9, v5, :cond_4b

    move-object v5, v7

    move-object/from16 v16, v8

    .line 215
    aget-wide v7, v24, v9

    const-wide/16 v17, -0x1

    cmp-long v17, v7, v17

    if-eqz v17, :cond_4a

    .line 216
    aget-wide v39, v1, v9

    .line 217
    sget-object v45, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move/from16 v17, v9

    move/from16 v18, v10

    iget-wide v9, v2, LM2/s;->c:J

    move-wide/from16 v41, v9

    iget-wide v9, v2, LM2/s;->d:J

    move-wide/from16 v43, v9

    invoke-static/range {v39 .. v45}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v9

    move-object/from16 v19, v5

    const/4 v5, 0x1

    .line 218
    invoke-static {v0, v7, v8, v5}, LQ1/x;->e([JJZ)I

    move-result v21

    aput v21, v19, v17

    .line 219
    :goto_41
    aget v21, v19, v17

    if-ltz v21, :cond_47

    aget v22, v14, v21

    and-int/lit8 v22, v22, 0x1

    if-nez v22, :cond_47

    add-int/lit8 v21, v21, -0x1

    .line 220
    aput v21, v19, v17

    const/4 v5, 0x1

    goto :goto_41

    :cond_47
    add-long/2addr v7, v9

    .line 221
    invoke-static {v0, v7, v8, v6}, LQ1/x;->a([JJZ)I

    move-result v5

    aput v5, v16, v17

    const/4 v10, 0x2

    if-ne v11, v10, :cond_48

    .line 222
    :goto_42
    aget v5, v16, v17

    array-length v9, v0

    const/16 v38, 0x1

    add-int/lit8 v9, v9, -0x1

    if-ge v5, v9, :cond_48

    add-int/lit8 v5, v5, 0x1

    aget-wide v21, v0, v5

    cmp-long v9, v21, v7

    if-gtz v9, :cond_48

    .line 223
    aput v5, v16, v17

    goto :goto_42

    .line 224
    :cond_48
    aget v5, v16, v17

    aget v7, v19, v17

    sub-int v8, v5, v7

    add-int/2addr v8, v13

    if-eq v3, v7, :cond_49

    const/4 v3, 0x1

    goto :goto_43

    :cond_49
    move/from16 v3, v34

    :goto_43
    or-int v3, v18, v3

    move/from16 v18, v3

    move v3, v5

    move v13, v8

    :goto_44
    const/16 v38, 0x1

    goto :goto_45

    :cond_4a
    move-object/from16 v19, v5

    move/from16 v17, v9

    move/from16 v18, v10

    const/4 v10, 0x2

    goto :goto_44

    :goto_45
    add-int/lit8 v9, v17, 0x1

    move-object/from16 v8, v16

    move/from16 v10, v18

    move-object/from16 v7, v19

    goto :goto_40

    :cond_4b
    move-object/from16 v19, v7

    move-object/from16 v16, v8

    move/from16 v18, v10

    if-eq v13, v4, :cond_4c

    const/4 v3, 0x1

    goto :goto_46

    :cond_4c
    move/from16 v3, v34

    :goto_46
    or-int v3, v18, v3

    if-eqz v3, :cond_4d

    .line 225
    new-array v4, v13, [J

    goto :goto_47

    :cond_4d
    move-object v4, v12

    :goto_47
    if-eqz v3, :cond_4e

    .line 226
    new-array v5, v13, [I

    goto :goto_48

    :cond_4e
    move-object v5, v15

    :goto_48
    if-eqz v3, :cond_4f

    move/from16 v20, v34

    :cond_4f
    if-eqz v3, :cond_50

    .line 227
    new-array v6, v13, [I

    goto :goto_49

    :cond_50
    move-object v6, v14

    .line 228
    :goto_49
    new-array v7, v13, [J

    move/from16 v43, v20

    move/from16 v8, v34

    move v9, v8

    move v10, v9

    move-wide/from16 v50, v35

    .line 229
    :goto_4a
    array-length v11, v1

    if-ge v8, v11, :cond_55

    .line 230
    aget-wide v17, v24, v8

    .line 231
    aget v11, v19, v8

    .line 232
    aget v13, v16, v8

    move-object/from16 v21, v0

    if-eqz v3, :cond_51

    sub-int v0, v13, v11

    .line 233
    invoke-static {v12, v11, v4, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 234
    invoke-static {v15, v11, v5, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 235
    invoke-static {v14, v11, v6, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_51
    move/from16 v0, v43

    :goto_4b
    if-ge v11, v13, :cond_54

    .line 236
    sget-object v56, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v52, 0xf4240

    move/from16 v20, v3

    move-object/from16 v22, v4

    iget-wide v3, v2, LM2/s;->d:J

    move-wide/from16 v54, v3

    invoke-static/range {v50 .. v56}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    .line 237
    aget-wide v27, v21, v11

    sub-long v39, v27, v17

    const-wide/32 v41, 0xf4240

    move-wide/from16 v27, v3

    .line 238
    iget-wide v3, v2, LM2/s;->c:J

    move-wide/from16 v43, v3

    move-object/from16 v45, v56

    invoke-static/range {v39 .. v45}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    cmp-long v29, v3, v35

    if-gez v29, :cond_52

    const/4 v9, 0x1

    :cond_52
    add-long v3, v27, v3

    .line 239
    aput-wide v3, v7, v10

    if-eqz v20, :cond_53

    .line 240
    aget v3, v5, v10

    if-le v3, v0, :cond_53

    .line 241
    aget v0, v15, v11

    :cond_53
    const/4 v3, 0x1

    add-int/2addr v10, v3

    add-int/2addr v11, v3

    move/from16 v3, v20

    move-object/from16 v4, v22

    goto :goto_4b

    :cond_54
    move/from16 v20, v3

    move-object/from16 v22, v4

    const/4 v3, 0x1

    .line 242
    aget-wide v17, v1, v8

    add-long v50, v50, v17

    add-int/2addr v8, v3

    move/from16 v43, v0

    move/from16 v3, v20

    move-object/from16 v0, v21

    goto :goto_4a

    :cond_55
    move-object/from16 v22, v4

    const/4 v3, 0x1

    .line 243
    sget-object v56, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v52, 0xf4240

    iget-wide v0, v2, LM2/s;->d:J

    move-wide/from16 v54, v0

    invoke-static/range {v50 .. v56}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    move-result-wide v46

    if-eqz v9, :cond_56

    .line 244
    invoke-virtual/range {v23 .. v23}, LN1/n;->a()LN1/m;

    move-result-object v0

    .line 245
    iput-boolean v3, v0, LN1/m;->s:Z

    .line 246
    new-instance v1, LN1/n;

    invoke-direct {v1, v0}, LN1/n;-><init>(LN1/m;)V

    .line 247
    new-instance v50, LM2/s;

    iget-object v0, v2, LM2/s;->i:[J

    iget-object v3, v2, LM2/s;->j:[J

    iget v4, v2, LM2/s;->a:I

    iget v8, v2, LM2/s;->b:I

    iget-wide v9, v2, LM2/s;->c:J

    iget-wide v11, v2, LM2/s;->d:J

    iget-wide v13, v2, LM2/s;->e:J

    move-object/from16 v65, v0

    move-object/from16 v61, v1

    iget-wide v0, v2, LM2/s;->f:J

    iget v15, v2, LM2/s;->h:I

    move-wide/from16 v59, v0

    iget-object v0, v2, LM2/s;->l:[LM2/t;

    iget v1, v2, LM2/s;->k:I

    move-object/from16 v63, v0

    move/from16 v64, v1

    move-object/from16 v66, v3

    move/from16 v51, v4

    move/from16 v52, v8

    move-wide/from16 v53, v9

    move-wide/from16 v55, v11

    move-wide/from16 v57, v13

    move/from16 v62, v15

    invoke-direct/range {v50 .. v66}, LM2/s;-><init>(IIJJJJLN1/n;I[LM2/t;I[J[J)V

    move-object/from16 v40, v50

    goto :goto_4c

    :cond_56
    move-object/from16 v40, v2

    .line 248
    :goto_4c
    new-instance v39, LM2/v;

    move-object/from16 v42, v5

    move-object/from16 v45, v6

    move-object/from16 v44, v7

    move-object/from16 v41, v22

    invoke-direct/range {v39 .. v47}, LM2/v;-><init>(LM2/s;[J[II[J[IJ)V

    move-object/from16 v0, v26

    move-object/from16 v15, v39

    .line 249
    :goto_4d
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :goto_4e
    add-int/lit8 v7, v25, 0x1

    move-object v5, v0

    move/from16 v3, v49

    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 250
    :cond_57
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    :cond_58
    const/4 v1, 0x0

    .line 251
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    move-result-object v0

    throw v0

    :cond_59
    move-object v0, v5

    return-object v0
.end method

.method public static h(LQ1/o;IIIIILN1/j;LM2/d;I)V
    .locals 53

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    const/16 v16, 0xa

    const/16 v5, 0x10

    const/16 v17, 0x7

    add-int/lit8 v7, v1, 0x10

    .line 1
    invoke-virtual {v0, v7}, LQ1/o;->G(I)V

    .line 2
    invoke-virtual {v0, v5}, LQ1/o;->H(I)V

    .line 3
    invoke-virtual {v0}, LQ1/o;->A()I

    move-result v5

    .line 4
    invoke-virtual {v0}, LQ1/o;->A()I

    move-result v7

    const/16 v18, 0x5

    const/16 v8, 0x32

    .line 5
    invoke-virtual {v0, v8}, LQ1/o;->H(I)V

    .line 6
    iget v8, v0, LQ1/o;->b:I

    const/16 v19, 0x6

    const v6, 0x656e6376

    const/16 v20, 0x3

    move/from16 v10, p1

    const/16 v21, 0xc

    if-ne v10, v6, :cond_2

    .line 7
    invoke-static {v0, v1, v2}, LM2/g;->e(LQ1/o;II)Landroid/util/Pair;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 8
    iget-object v10, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v3, :cond_0

    const/4 v3, 0x0

    const/16 v22, 0x8

    goto :goto_0

    :cond_0
    const/16 v22, 0x8

    .line 9
    iget-object v15, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, LM2/t;

    iget-object v15, v15, LM2/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v15}, LN1/j;->c(Ljava/lang/String;)LN1/j;

    move-result-object v3

    .line 10
    :goto_0
    iget-object v15, v4, LM2/d;->d:Ljava/lang/Object;

    check-cast v15, [LM2/t;

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, LM2/t;

    aput-object v6, v15, p8

    goto :goto_1

    :cond_1
    const/16 v22, 0x8

    .line 11
    :goto_1
    invoke-virtual {v0, v8}, LQ1/o;->G(I)V

    goto :goto_2

    :cond_2
    const/16 v22, 0x8

    :goto_2
    const v6, 0x6d317620

    .line 12
    const-string v15, "video/3gpp"

    if-ne v10, v6, :cond_3

    .line 13
    const-string v6, "video/mpeg"

    goto :goto_3

    :cond_3
    const v6, 0x48323633

    if-ne v10, v6, :cond_4

    move-object v6, v15

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    const/high16 v24, 0x3f800000    # 1.0f

    move/from16 v34, v22

    move/from16 v35, v34

    move/from16 v25, v24

    const/4 v14, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, -0x1

    const/16 v30, -0x1

    const/16 v31, -0x1

    const/16 v32, -0x1

    const/16 v33, -0x1

    const/16 v36, 0x0

    const/16 v38, 0x0

    :goto_4
    sub-int v13, v8, v1

    if-ge v13, v2, :cond_5

    .line 14
    invoke-virtual {v0, v8}, LQ1/o;->G(I)V

    .line 15
    iget v13, v0, LQ1/o;->b:I

    .line 16
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v12

    if-nez v12, :cond_6

    .line 17
    iget v11, v0, LQ1/o;->b:I

    sub-int/2addr v11, v1

    if-ne v11, v2, :cond_6

    :cond_5
    move-object/from16 v43, v3

    move-object/from16 p8, v6

    move/from16 v46, v29

    move/from16 v2, v31

    move/from16 v6, v33

    move/from16 v31, v35

    const/4 v3, 0x0

    move-object/from16 v35, v26

    move/from16 v26, v34

    goto/16 :goto_4b

    :cond_6
    if-lez v12, :cond_7

    const/4 v11, 0x1

    goto :goto_5

    :cond_7
    const/4 v11, 0x0

    .line 18
    :goto_5
    const-string v9, "childAtomSize must be positive"

    invoke-static {v9, v11}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 19
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v11

    const v1, 0x61766343

    if-ne v11, v1, :cond_a

    if-nez v6, :cond_8

    const/4 v1, 0x1

    :goto_6
    const/4 v6, 0x0

    goto :goto_7

    :cond_8
    const/4 v1, 0x0

    goto :goto_6

    .line 20
    :goto_7
    invoke-static {v6, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    add-int/lit8 v13, v13, 0x8

    .line 21
    invoke-virtual {v0, v13}, LQ1/o;->G(I)V

    .line 22
    invoke-static {v0}, Ls2/c;->a(LQ1/o;)Ls2/c;

    move-result-object v1

    .line 23
    iget v6, v1, Ls2/c;->b:I

    iput v6, v4, LM2/d;->b:I

    if-nez v38, :cond_9

    .line 24
    iget v6, v1, Ls2/c;->k:F

    move/from16 v25, v6

    .line 25
    :cond_9
    iget-object v6, v1, Ls2/c;->a:Ljava/util/ArrayList;

    const-string v9, "video/avc"

    iget-object v11, v1, Ls2/c;->l:Ljava/lang/String;

    iget v13, v1, Ls2/c;->j:I

    iget v2, v1, Ls2/c;->g:I

    move/from16 v26, v2

    iget v2, v1, Ls2/c;->h:I

    move/from16 v27, v2

    iget v2, v1, Ls2/c;->i:I

    move/from16 v30, v2

    iget v2, v1, Ls2/c;->e:I

    iget v1, v1, Ls2/c;->f:I

    move/from16 v35, v1

    move/from16 v34, v2

    move-object/from16 v43, v3

    move/from16 p6, v8

    move-object/from16 v33, v15

    move/from16 v4, v20

    move/from16 v31, v26

    move/from16 v32, v27

    move/from16 v46, v29

    move/from16 v2, v30

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/4 v8, 0x2

    move-object/from16 v26, v6

    move-object v6, v9

    move/from16 v29, v10

    move-object/from16 v27, v11

    move/from16 v30, v13

    :goto_8
    const/4 v9, 0x1

    goto/16 :goto_4a

    :cond_a
    const v1, 0x68766343

    const-string v2, "video/hevc"

    if-ne v11, v1, :cond_e

    if-nez v6, :cond_b

    const/4 v1, 0x1

    :goto_9
    const/4 v6, 0x0

    goto :goto_a

    :cond_b
    const/4 v1, 0x0

    goto :goto_9

    .line 26
    :goto_a
    invoke-static {v6, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    add-int/lit8 v13, v13, 0x8

    .line 27
    invoke-virtual {v0, v13}, LQ1/o;->G(I)V

    const/4 v1, 0x0

    .line 28
    invoke-static {v0, v1, v6}, Ls2/t;->a(LQ1/o;ZLVa/X7;)Ls2/t;

    move-result-object v9

    .line 29
    iget v1, v9, Ls2/t;->b:I

    iput v1, v4, LM2/d;->b:I

    if-nez v38, :cond_c

    .line 30
    iget v1, v9, Ls2/t;->i:F

    move/from16 v25, v1

    .line 31
    :cond_c
    iget v1, v9, Ls2/t;->h:I

    const/4 v6, -0x1

    if-eq v1, v6, :cond_d

    move/from16 v29, v1

    .line 32
    :cond_d
    iget-object v1, v9, Ls2/t;->a:Ljava/util/List;

    iget v6, v9, Ls2/t;->j:I

    iget-object v11, v9, Ls2/t;->k:Ljava/lang/String;

    iget v13, v9, Ls2/t;->e:I

    iget v14, v9, Ls2/t;->f:I

    move-object/from16 v26, v1

    iget v1, v9, Ls2/t;->g:I

    move/from16 v27, v1

    iget v1, v9, Ls2/t;->c:I

    move/from16 v30, v1

    iget v1, v9, Ls2/t;->d:I

    iget-object v9, v9, Ls2/t;->l:LVa/X7;

    move/from16 v35, v1

    move-object/from16 v43, v3

    move/from16 p6, v8

    move/from16 v31, v13

    move/from16 v32, v14

    move-object/from16 v33, v15

    move/from16 v4, v20

    move/from16 v46, v29

    move/from16 v34, v30

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/4 v8, 0x2

    move/from16 v30, v6

    move-object v14, v9

    move/from16 v29, v10

    const/4 v9, 0x1

    move-object v6, v2

    move/from16 v2, v27

    move-object/from16 v27, v11

    goto/16 :goto_4a

    :cond_e
    const v1, 0x6c687643

    if-ne v11, v1, :cond_1a

    .line 33
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "lhvC must follow hvcC atom"

    .line 34
    invoke-static {v2, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    if-eqz v14, :cond_f

    .line 35
    iget-object v1, v14, LVa/X7;->a:Ljava/lang/Object;

    check-cast v1, Ll8/K;

    .line 36
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_f

    const/4 v1, 0x1

    goto :goto_b

    :cond_f
    const/4 v1, 0x0

    :goto_b
    const-string v2, "must have at least two layers"

    .line 37
    invoke-static {v2, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    add-int/lit8 v13, v13, 0x8

    .line 38
    invoke-virtual {v0, v13}, LQ1/o;->G(I)V

    .line 39
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 40
    invoke-static {v0, v1, v14}, Ls2/t;->a(LQ1/o;ZLVa/X7;)Ls2/t;

    move-result-object v2

    .line 41
    iget v1, v4, LM2/d;->b:I

    iget v6, v2, Ls2/t;->b:I

    if-ne v1, v6, :cond_10

    const/4 v1, 0x1

    goto :goto_c

    :cond_10
    const/4 v1, 0x0

    :goto_c
    const-string v6, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    invoke-static {v6, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 42
    iget v1, v2, Ls2/t;->e:I

    const/4 v6, -0x1

    move/from16 v9, v31

    if-eq v1, v6, :cond_12

    if-ne v9, v1, :cond_11

    const/4 v1, 0x1

    goto :goto_d

    :cond_11
    const/4 v1, 0x0

    .line 43
    :goto_d
    const-string v11, "colorSpace must be the same for both views"

    invoke-static {v11, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 44
    :cond_12
    iget v1, v2, Ls2/t;->f:I

    move/from16 v11, v32

    if-eq v1, v6, :cond_14

    if-ne v11, v1, :cond_13

    const/4 v1, 0x1

    goto :goto_e

    :cond_13
    const/4 v1, 0x0

    .line 45
    :goto_e
    const-string v13, "colorRange must be the same for both views"

    invoke-static {v13, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 46
    :cond_14
    iget v1, v2, Ls2/t;->g:I

    if-eq v1, v6, :cond_16

    move/from16 v6, v33

    if-ne v6, v1, :cond_15

    const/4 v1, 0x1

    goto :goto_f

    :cond_15
    const/4 v1, 0x0

    .line 47
    :goto_f
    const-string v13, "colorTransfer must be the same for both views"

    invoke-static {v13, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    goto :goto_10

    :cond_16
    move/from16 v6, v33

    .line 48
    :goto_10
    iget v1, v2, Ls2/t;->c:I

    move/from16 v13, v34

    if-ne v13, v1, :cond_17

    const/4 v1, 0x1

    :goto_11
    move/from16 v27, v6

    goto :goto_12

    :cond_17
    const/4 v1, 0x0

    goto :goto_11

    :goto_12
    const-string v6, "bitdepthLuma must be the same for both views"

    invoke-static {v6, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 49
    iget v1, v2, Ls2/t;->d:I

    move/from16 v6, v35

    if-ne v6, v1, :cond_18

    const/4 v1, 0x1

    :goto_13
    move/from16 v31, v6

    goto :goto_14

    :cond_18
    const/4 v1, 0x0

    goto :goto_13

    :goto_14
    const-string v6, "bitdepthChroma must be the same for both views"

    invoke-static {v6, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    move-object/from16 v1, v26

    if-eqz v1, :cond_19

    .line 50
    invoke-static {}, Ll8/K;->i()Ll8/H;

    move-result-object v6

    .line 51
    invoke-virtual {v6, v1}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 52
    iget-object v1, v2, Ls2/t;->a:Ljava/util/List;

    invoke-virtual {v6, v1}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 53
    invoke-virtual {v6}, Ll8/H;->g()Ll8/e0;

    move-result-object v26

    move/from16 p6, v8

    goto :goto_15

    .line 54
    :cond_19
    const-string v6, "initializationData must be already set from hvcC atom"

    move/from16 p6, v8

    const/4 v8, 0x0

    invoke-static {v6, v8}, Ls2/a;->e(Ljava/lang/String;Z)V

    move-object/from16 v26, v1

    .line 55
    :goto_15
    const-string v1, "video/mv-hevc"

    iget-object v2, v2, Ls2/t;->k:Ljava/lang/String;

    move/from16 v4, v27

    move-object/from16 v27, v2

    move v2, v4

    move-object v6, v1

    move-object/from16 v43, v3

    move/from16 v32, v11

    move/from16 v34, v13

    move-object/from16 v33, v15

    move/from16 v4, v20

    move/from16 v46, v29

    move/from16 v35, v31

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/4 v8, 0x2

    move/from16 v31, v9

    move/from16 v29, v10

    goto/16 :goto_8

    :cond_1a
    move-object/from16 p8, v6

    move/from16 p6, v8

    move-object/from16 v1, v26

    move/from16 v2, v31

    move/from16 v6, v33

    move/from16 v26, v34

    move/from16 v31, v35

    const v8, 0x76657875

    if-ne v11, v8, :cond_2a

    add-int/lit8 v8, v13, 0x8

    .line 56
    invoke-virtual {v0, v8}, LQ1/o;->G(I)V

    .line 57
    iget v8, v0, LQ1/o;->b:I

    move-object/from16 v33, v15

    const/4 v11, 0x0

    :goto_16
    sub-int v15, v8, v13

    if-ge v15, v12, :cond_23

    .line 58
    invoke-virtual {v0, v8}, LQ1/o;->G(I)V

    .line 59
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v15

    move/from16 v34, v8

    if-lez v15, :cond_1b

    const/4 v8, 0x1

    goto :goto_17

    :cond_1b
    const/4 v8, 0x0

    .line 60
    :goto_17
    invoke-static {v9, v8}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 61
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v8

    const v4, 0x65796573

    if-ne v8, v4, :cond_22

    add-int/lit8 v8, v34, 0x8

    .line 62
    invoke-virtual {v0, v8}, LQ1/o;->G(I)V

    .line 63
    iget v4, v0, LQ1/o;->b:I

    :goto_18
    sub-int v8, v4, v34

    if-ge v8, v15, :cond_21

    .line 64
    invoke-virtual {v0, v4}, LQ1/o;->G(I)V

    .line 65
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v8

    if-lez v8, :cond_1c

    const/4 v11, 0x1

    goto :goto_19

    :cond_1c
    const/4 v11, 0x0

    .line 66
    :goto_19
    invoke-static {v9, v11}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 67
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v11

    move/from16 v35, v4

    const v4, 0x73747269

    if-ne v11, v4, :cond_20

    const/4 v4, 0x4

    .line 68
    invoke-virtual {v0, v4}, LQ1/o;->H(I)V

    .line 69
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v4

    .line 70
    new-instance v8, Ly3/j;

    new-instance v11, LE4/j;

    move/from16 v35, v4

    move-object/from16 v41, v9

    const/4 v4, 0x1

    and-int/lit8 v9, v35, 0x1

    if-ne v9, v4, :cond_1d

    const/4 v4, 0x1

    :goto_1a
    move/from16 v42, v15

    const/4 v9, 0x2

    goto :goto_1b

    :cond_1d
    const/4 v4, 0x0

    goto :goto_1a

    :goto_1b
    and-int/lit8 v15, v35, 0x2

    if-ne v15, v9, :cond_1e

    const/4 v9, 0x1

    goto :goto_1c

    :cond_1e
    const/4 v9, 0x0

    :goto_1c
    and-int/lit8 v15, v35, 0x8

    move-object/from16 v43, v3

    move/from16 v3, v22

    if-ne v15, v3, :cond_1f

    const/4 v3, 0x1

    goto :goto_1d

    :cond_1f
    const/4 v3, 0x0

    :goto_1d
    invoke-direct {v11, v4, v9, v3}, LE4/j;-><init>(ZZZ)V

    const/16 v3, 0x11

    invoke-direct {v8, v11, v3}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    goto :goto_1e

    :cond_20
    move-object/from16 v43, v3

    move-object/from16 v41, v9

    move/from16 v42, v15

    add-int v4, v35, v8

    const/16 v22, 0x8

    goto :goto_18

    :cond_21
    move-object/from16 v43, v3

    move-object/from16 v41, v9

    move/from16 v42, v15

    const/4 v8, 0x0

    :goto_1e
    move-object v11, v8

    goto :goto_1f

    :cond_22
    move-object/from16 v43, v3

    move-object/from16 v41, v9

    move/from16 v42, v15

    :goto_1f
    add-int v8, v34, v42

    move-object/from16 v4, p7

    move-object/from16 v9, v41

    move-object/from16 v3, v43

    const/16 v22, 0x8

    goto/16 :goto_16

    :cond_23
    move-object/from16 v43, v3

    if-nez v11, :cond_24

    const/4 v3, 0x0

    goto :goto_20

    .line 71
    :cond_24
    new-instance v3, LS3/l;

    invoke-direct {v3, v11}, LS3/l;-><init>(Ljava/lang/Object;)V

    :goto_20
    if-eqz v3, :cond_26

    .line 72
    iget-object v3, v3, LS3/l;->a:Ljava/lang/Object;

    check-cast v3, Ly3/j;

    .line 73
    iget-object v3, v3, Ly3/j;->b:Ljava/lang/Object;

    check-cast v3, LE4/j;

    if-eqz v14, :cond_27

    iget-object v4, v14, LVa/X7;->a:Ljava/lang/Object;

    check-cast v4, Ll8/K;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    const/4 v9, 0x2

    if-lt v4, v9, :cond_27

    .line 74
    iget-boolean v4, v3, LE4/j;->a:Z

    if-eqz v4, :cond_25

    .line 75
    iget-boolean v4, v3, LE4/j;->b:Z

    if-eqz v4, :cond_25

    const/4 v4, 0x1

    goto :goto_21

    :cond_25
    const/4 v4, 0x0

    .line 76
    :goto_21
    const-string v8, "both eye views must be marked as available"

    .line 77
    invoke-static {v8, v4}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 78
    iget-boolean v3, v3, LE4/j;->c:Z

    const/16 v37, 0x1

    xor-int/lit8 v3, v3, 0x1

    const-string v4, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 79
    invoke-static {v4, v3}, Ls2/a;->e(Ljava/lang/String;Z)V

    :cond_26
    move/from16 v4, v29

    goto :goto_23

    :cond_27
    move/from16 v4, v29

    const/4 v8, -0x1

    if-ne v4, v8, :cond_29

    .line 80
    iget-boolean v3, v3, LE4/j;->c:Z

    if-eqz v3, :cond_28

    move/from16 v3, v18

    goto :goto_22

    :cond_28
    const/4 v3, 0x4

    :goto_22
    move/from16 v29, v3

    goto :goto_24

    :cond_29
    :goto_23
    move/from16 v29, v4

    :goto_24
    move/from16 v4, v20

    move/from16 v34, v26

    move/from16 v46, v29

    move/from16 v35, v31

    const/4 v3, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v22, 0x8

    move-object/from16 v26, v1

    move/from16 v31, v2

    move v2, v6

    move/from16 v29, v10

    :goto_25
    const/4 v1, -0x1

    :goto_26
    move-object/from16 v6, p8

    goto/16 :goto_4a

    :cond_2a
    move-object/from16 v43, v3

    move-object/from16 v33, v15

    move/from16 v4, v29

    const v3, 0x64766343

    if-eq v11, v3, :cond_2b

    const v3, 0x64767643

    if-ne v11, v3, :cond_2c

    :cond_2b
    move-object/from16 v35, v1

    move/from16 v46, v4

    move/from16 v29, v10

    move-object/from16 v34, v14

    move/from16 v4, v20

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v22, 0x8

    goto/16 :goto_48

    :cond_2c
    const v3, 0x76706343

    if-ne v11, v3, :cond_32

    if-nez p8, :cond_2d

    const/4 v2, 0x1

    :goto_27
    const/4 v6, 0x0

    goto :goto_28

    :cond_2d
    const/4 v2, 0x0

    goto :goto_27

    .line 81
    :goto_28
    invoke-static {v6, v2}, Ls2/a;->e(Ljava/lang/String;Z)V

    const v2, 0x76703038

    .line 82
    const-string v3, "video/x-vnd.on2.vp9"

    if-ne v10, v2, :cond_2e

    const-string v2, "video/x-vnd.on2.vp8"

    goto :goto_29

    :cond_2e
    move-object v2, v3

    :goto_29
    add-int/lit8 v13, v13, 0xc

    .line 83
    invoke-virtual {v0, v13}, LQ1/o;->G(I)V

    .line 84
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v6

    int-to-byte v6, v6

    .line 85
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v8

    int-to-byte v8, v8

    .line 86
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v9

    const/16 v23, 0x4

    shr-int/lit8 v11, v9, 0x4

    const/16 v37, 0x1

    shr-int/lit8 v13, v9, 0x1

    and-int/lit8 v13, v13, 0x7

    int-to-byte v13, v13

    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    int-to-byte v1, v11

    .line 88
    sget-object v3, LQ1/a;->a:[B

    move/from16 v3, v21

    .line 89
    new-array v15, v3, [B

    const/16 v40, 0x0

    aput-byte v37, v15, v40

    aput-byte v37, v15, v37

    const/16 v39, 0x2

    aput-byte v6, v15, v39

    aput-byte v39, v15, v20

    const/16 v23, 0x4

    aput-byte v37, v15, v23

    aput-byte v8, v15, v18

    aput-byte v20, v15, v19

    aput-byte v37, v15, v17

    const/16 v22, 0x8

    aput-byte v1, v15, v22

    const/16 v1, 0x9

    aput-byte v23, v15, v1

    aput-byte v37, v15, v16

    const/16 v1, 0xb

    aput-byte v13, v15, v1

    invoke-static {v15}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v26

    goto :goto_2a

    :cond_2f
    move-object/from16 v26, v1

    :goto_2a
    and-int/lit8 v1, v9, 0x1

    if-eqz v1, :cond_30

    const/4 v1, 0x1

    goto :goto_2b

    :cond_30
    const/4 v1, 0x0

    .line 90
    :goto_2b
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v3

    .line 91
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v6

    .line 92
    invoke-static {v3}, LN1/f;->f(I)I

    move-result v31

    if-eqz v1, :cond_31

    const/16 v32, 0x1

    goto :goto_2c

    :cond_31
    const/16 v32, 0x2

    .line 93
    :goto_2c
    invoke-static {v6}, LN1/f;->g(I)I

    move-result v1

    move-object v6, v2

    move/from16 v46, v4

    move/from16 v29, v10

    move/from16 v34, v11

    move/from16 v35, v34

    move/from16 v4, v20

    const/4 v3, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v21, 0xc

    const/16 v22, 0x8

    :goto_2d
    move v2, v1

    const/4 v1, -0x1

    goto/16 :goto_4a

    :cond_32
    const v3, 0x61763143

    .line 94
    const-string v8, "BoxParsers"

    if-ne v11, v3, :cond_4b

    const/16 v22, 0x8

    add-int/lit8 v1, v12, -0x8

    .line 95
    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 96
    invoke-virtual {v0, v3, v1, v2}, LQ1/o;->f(II[B)V

    .line 97
    invoke-static {v2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v26

    add-int/lit8 v13, v13, 0x8

    .line 98
    invoke-virtual {v0, v13}, LQ1/o;->G(I)V

    .line 99
    new-instance v1, LJ5/y;

    .line 100
    iget-object v2, v0, LQ1/o;->a:[B

    .line 101
    array-length v6, v2

    const/4 v9, 0x1

    invoke-direct {v1, v2, v6, v9, v3}, LJ5/y;-><init>([BIIB)V

    .line 102
    iget v2, v0, LQ1/o;->b:I

    const/16 v22, 0x8

    mul-int/lit8 v2, v2, 0x8

    .line 103
    invoke-virtual {v1, v2}, LJ5/y;->q(I)V

    .line 104
    invoke-virtual {v1, v9}, LJ5/y;->u(I)V

    move/from16 v2, v20

    .line 105
    invoke-virtual {v1, v2}, LJ5/y;->i(I)I

    move-result v6

    move/from16 v9, v19

    .line 106
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 107
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v2

    .line 108
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v11

    const/16 v45, -0x1

    const/4 v13, 0x2

    if-ne v6, v13, :cond_35

    if-eqz v2, :cond_35

    if-eqz v11, :cond_33

    const/16 v2, 0xc

    goto :goto_2e

    :cond_33
    move/from16 v2, v16

    :goto_2e
    if-eqz v11, :cond_34

    const/16 v6, 0xc

    goto :goto_2f

    :cond_34
    move/from16 v6, v16

    :goto_2f
    move/from16 v48, v2

    move/from16 v49, v6

    goto :goto_32

    :cond_35
    if-gt v6, v13, :cond_38

    if-eqz v2, :cond_36

    move/from16 v6, v16

    goto :goto_30

    :cond_36
    const/16 v6, 0x8

    :goto_30
    if-eqz v2, :cond_37

    move/from16 v2, v16

    goto :goto_31

    :cond_37
    const/16 v2, 0x8

    :goto_31
    move/from16 v49, v2

    move/from16 v48, v6

    goto :goto_32

    :cond_38
    move/from16 v48, v45

    move/from16 v49, v48

    :goto_32
    const/16 v2, 0xd

    .line 109
    invoke-virtual {v1, v2}, LJ5/y;->t(I)V

    .line 110
    invoke-virtual {v1}, LJ5/y;->s()V

    const/4 v6, 0x4

    .line 111
    invoke-virtual {v1, v6}, LJ5/y;->i(I)I

    move-result v11

    const/16 v50, 0x0

    const/4 v6, 0x1

    if-eq v11, v6, :cond_39

    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported obu_type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    new-instance v44, LN1/f;

    move/from16 v46, v45

    move/from16 v47, v45

    invoke-direct/range {v44 .. v50}, LN1/f;-><init>(IIIII[B)V

    :goto_33
    move/from16 v9, v17

    move/from16 v15, v18

    move-object/from16 v1, v44

    const/16 v13, 0xc

    goto/16 :goto_3b

    .line 114
    :cond_39
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_3a

    .line 115
    const-string v1, "Unsupported obu_extension_flag"

    invoke-static {v8, v1}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    new-instance v44, LN1/f;

    move/from16 v46, v45

    move/from16 v47, v45

    invoke-direct/range {v44 .. v50}, LN1/f;-><init>(IIIII[B)V

    goto :goto_33

    .line 117
    :cond_3a
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    .line 118
    invoke-virtual {v1}, LJ5/y;->s()V

    if-eqz v6, :cond_3b

    const/16 v6, 0x8

    .line 119
    invoke-virtual {v1, v6}, LJ5/y;->i(I)I

    move-result v11

    const/16 v6, 0x7f

    if-le v11, v6, :cond_3b

    .line 120
    const-string v1, "Excessive obu_size"

    invoke-static {v8, v1}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    new-instance v44, LN1/f;

    move/from16 v46, v45

    move/from16 v47, v45

    invoke-direct/range {v44 .. v50}, LN1/f;-><init>(IIIII[B)V

    goto :goto_33

    :cond_3b
    const/4 v6, 0x3

    .line 122
    invoke-virtual {v1, v6}, LJ5/y;->i(I)I

    move-result v11

    .line 123
    invoke-virtual {v1}, LJ5/y;->s()V

    .line 124
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_3c

    .line 125
    const-string v1, "Unsupported reduced_still_picture_header"

    invoke-static {v8, v1}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    new-instance v44, LN1/f;

    move/from16 v46, v45

    move/from16 v47, v45

    invoke-direct/range {v44 .. v50}, LN1/f;-><init>(IIIII[B)V

    goto :goto_33

    .line 127
    :cond_3c
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_3d

    .line 128
    const-string v1, "Unsupported timing_info_present_flag"

    invoke-static {v8, v1}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    new-instance v44, LN1/f;

    move/from16 v46, v45

    move/from16 v47, v45

    invoke-direct/range {v44 .. v50}, LN1/f;-><init>(IIIII[B)V

    goto :goto_33

    .line 130
    :cond_3d
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_3e

    .line 131
    const-string v1, "Unsupported initial_display_delay_present_flag"

    invoke-static {v8, v1}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    new-instance v44, LN1/f;

    move/from16 v46, v45

    move/from16 v47, v45

    invoke-direct/range {v44 .. v50}, LN1/f;-><init>(IIIII[B)V

    goto/16 :goto_33

    :cond_3e
    move/from16 v15, v18

    .line 133
    invoke-virtual {v1, v15}, LJ5/y;->i(I)I

    move-result v6

    move v8, v3

    :goto_34
    if-gt v8, v6, :cond_40

    const/16 v13, 0xc

    .line 134
    invoke-virtual {v1, v13}, LJ5/y;->t(I)V

    .line 135
    invoke-virtual {v1, v15}, LJ5/y;->i(I)I

    move-result v3

    move/from16 v9, v17

    if-le v3, v9, :cond_3f

    .line 136
    invoke-virtual {v1}, LJ5/y;->s()V

    :cond_3f
    const/16 v37, 0x1

    add-int/lit8 v8, v8, 0x1

    const/4 v3, 0x0

    const/4 v9, 0x6

    const/16 v17, 0x7

    goto :goto_34

    :cond_40
    const/4 v3, 0x4

    const/16 v13, 0xc

    const/16 v37, 0x1

    .line 137
    invoke-virtual {v1, v3}, LJ5/y;->i(I)I

    move-result v6

    .line 138
    invoke-virtual {v1, v3}, LJ5/y;->i(I)I

    move-result v8

    add-int/lit8 v6, v6, 0x1

    .line 139
    invoke-virtual {v1, v6}, LJ5/y;->t(I)V

    add-int/lit8 v8, v8, 0x1

    .line 140
    invoke-virtual {v1, v8}, LJ5/y;->t(I)V

    .line 141
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    const/4 v9, 0x7

    if-eqz v6, :cond_41

    .line 142
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 143
    :cond_41
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 144
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_42

    const/4 v8, 0x2

    .line 145
    invoke-virtual {v1, v8}, LJ5/y;->t(I)V

    .line 146
    :cond_42
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v8

    if-eqz v8, :cond_43

    const/4 v8, 0x1

    const/16 v17, 0x2

    goto :goto_35

    :cond_43
    const/4 v8, 0x1

    .line 147
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    move-result v17

    :goto_35
    if-lez v17, :cond_44

    .line 148
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v17

    if-nez v17, :cond_44

    .line 149
    invoke-virtual {v1, v8}, LJ5/y;->t(I)V

    :cond_44
    if-eqz v6, :cond_45

    const/4 v6, 0x3

    .line 150
    invoke-virtual {v1, v6}, LJ5/y;->t(I)V

    goto :goto_36

    :cond_45
    const/4 v6, 0x3

    .line 151
    :goto_36
    invoke-virtual {v1, v6}, LJ5/y;->t(I)V

    .line 152
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    const/4 v8, 0x2

    if-ne v11, v8, :cond_46

    if-eqz v6, :cond_46

    .line 153
    invoke-virtual {v1}, LJ5/y;->s()V

    :cond_46
    const/4 v8, 0x1

    if-eq v11, v8, :cond_47

    .line 154
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v6

    if-eqz v6, :cond_47

    const/4 v6, 0x1

    goto :goto_37

    :cond_47
    const/4 v6, 0x0

    .line 155
    :goto_37
    invoke-virtual {v1}, LJ5/y;->h()Z

    move-result v8

    if-eqz v8, :cond_4a

    const/16 v8, 0x8

    .line 156
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    move-result v11

    .line 157
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    move-result v3

    .line 158
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    move-result v17

    const/4 v8, 0x1

    if-nez v6, :cond_48

    if-ne v11, v8, :cond_48

    if-ne v3, v2, :cond_48

    if-nez v17, :cond_48

    move v1, v8

    goto :goto_38

    .line 159
    :cond_48
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    move-result v37

    move/from16 v1, v37

    .line 160
    :goto_38
    invoke-static {v11}, LN1/f;->f(I)I

    move-result v45

    if-ne v1, v8, :cond_49

    const/4 v1, 0x1

    goto :goto_39

    :cond_49
    const/4 v1, 0x2

    .line 161
    :goto_39
    invoke-static {v3}, LN1/f;->g(I)I

    move-result v2

    move/from16 v47, v45

    move/from16 v51, v49

    move/from16 v45, v1

    move/from16 v49, v2

    goto :goto_3a

    :cond_4a
    move/from16 v47, v45

    move/from16 v51, v49

    move/from16 v49, v47

    .line 162
    :goto_3a
    new-instance v46, LN1/f;

    move-object/from16 v52, v50

    move/from16 v50, v48

    move/from16 v48, v45

    invoke-direct/range {v46 .. v52}, LN1/f;-><init>(IIIII[B)V

    move-object/from16 v1, v46

    .line 163
    :goto_3b
    const-string v2, "video/av01"

    iget v3, v1, LN1/f;->e:I

    iget v6, v1, LN1/f;->f:I

    iget v8, v1, LN1/f;->a:I

    iget v11, v1, LN1/f;->b:I

    iget v1, v1, LN1/f;->c:I

    move/from16 v34, v3

    move/from16 v46, v4

    move/from16 v35, v6

    move/from16 v31, v8

    move/from16 v29, v10

    move/from16 v32, v11

    move/from16 v21, v13

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v22, 0x8

    move-object v6, v2

    goto/16 :goto_2d

    :cond_4b
    move/from16 v9, v17

    move/from16 v15, v18

    const/16 v21, 0xc

    const v3, 0x636c6c69

    const/16 v17, 0x19

    if-ne v11, v3, :cond_4d

    if-nez v24, :cond_4c

    .line 164
    invoke-static/range {v17 .. v17}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v24

    :cond_4c
    move-object/from16 v3, v24

    const/16 v8, 0x15

    .line 165
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 166
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v8

    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 167
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v8

    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v24, v3

    move/from16 v46, v4

    move/from16 v29, v10

    move/from16 v34, v26

    move/from16 v35, v31

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v22, 0x8

    move-object/from16 v26, v1

    move/from16 v31, v2

    move v2, v6

    goto/16 :goto_25

    :cond_4d
    const v3, 0x6d646376

    if-ne v11, v3, :cond_4f

    if-nez v24, :cond_4e

    .line 168
    invoke-static/range {v17 .. v17}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v24

    :cond_4e
    move-object/from16 v3, v24

    .line 169
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v8

    .line 170
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v11

    .line 171
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v13

    .line 172
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v9

    .line 173
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v15

    move/from16 v29, v10

    .line 174
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v10

    move-object/from16 v34, v14

    .line 175
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v14

    move-object/from16 v35, v1

    .line 176
    invoke-virtual {v0}, LQ1/o;->r()S

    move-result v1

    .line 177
    invoke-virtual {v0}, LQ1/o;->w()J

    move-result-wide v41

    .line 178
    invoke-virtual {v0}, LQ1/o;->w()J

    move-result-wide v44

    move/from16 v46, v4

    const/4 v4, 0x1

    .line 179
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 180
    invoke-virtual {v3, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 181
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 182
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 183
    invoke-virtual {v3, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 184
    invoke-virtual {v3, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 185
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 186
    invoke-virtual {v3, v14}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 187
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v8, 0x2710

    .line 188
    div-long v10, v41, v8

    long-to-int v1, v10

    int-to-short v1, v1

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 189
    div-long v8, v44, v8

    long-to-int v1, v8

    int-to-short v1, v1

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v24, v3

    move-object/from16 v14, v34

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v22, 0x8

    :goto_3c
    move/from16 v34, v26

    move-object/from16 v26, v35

    move/from16 v35, v31

    move/from16 v31, v2

    move v2, v6

    goto/16 :goto_26

    :cond_4f
    move-object/from16 v35, v1

    move/from16 v46, v4

    move/from16 v29, v10

    move-object/from16 v34, v14

    const v1, 0x64323633

    if-ne v11, v1, :cond_51

    if-nez p8, :cond_50

    const/4 v1, 0x1

    :goto_3d
    const/4 v3, 0x0

    goto :goto_3e

    :cond_50
    const/4 v1, 0x0

    goto :goto_3d

    .line 190
    :goto_3e
    invoke-static {v3, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    move-object/from16 v14, v34

    const/4 v1, -0x1

    const/4 v4, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v22, 0x8

    move/from16 v34, v26

    move-object/from16 v26, v35

    move/from16 v35, v31

    move/from16 v31, v2

    move v2, v6

    move-object/from16 v6, v33

    goto/16 :goto_4a

    :cond_51
    const/4 v3, 0x0

    const v1, 0x65736473

    if-ne v11, v1, :cond_54

    if-nez p8, :cond_52

    const/4 v1, 0x1

    goto :goto_3f

    :cond_52
    const/4 v1, 0x0

    .line 191
    :goto_3f
    invoke-static {v3, v1}, Ls2/a;->e(Ljava/lang/String;Z)V

    .line 192
    invoke-static {v13, v0}, LM2/g;->a(ILQ1/o;)LM2/b;

    move-result-object v1

    .line 193
    iget-object v4, v1, LM2/b;->b:[B

    if-eqz v4, :cond_53

    .line 194
    invoke-static {v4}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v4

    move-object/from16 v35, v4

    .line 195
    :cond_53
    iget-object v4, v1, LM2/b;->a:Ljava/lang/String;

    move-object/from16 v36, v1

    move-object/from16 v14, v34

    const/4 v1, -0x1

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v22, 0x8

    move/from16 v34, v26

    move-object/from16 v26, v35

    move/from16 v35, v31

    move/from16 v31, v2

    move v2, v6

    move-object v6, v4

    const/4 v4, 0x3

    goto/16 :goto_4a

    :cond_54
    const v1, 0x70617370

    if-ne v11, v1, :cond_55

    const/16 v22, 0x8

    add-int/lit8 v13, v13, 0x8

    .line 196
    invoke-virtual {v0, v13}, LQ1/o;->G(I)V

    .line 197
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v1

    .line 198
    invoke-virtual {v0}, LQ1/o;->y()I

    move-result v4

    int-to-float v1, v1

    int-to-float v4, v4

    div-float/2addr v1, v4

    move/from16 v25, v1

    move-object/from16 v14, v34

    const/4 v1, -0x1

    const/4 v4, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/16 v38, 0x1

    goto/16 :goto_3c

    :cond_55
    const/16 v22, 0x8

    const v1, 0x73763364

    if-ne v11, v1, :cond_58

    add-int/lit8 v15, v13, 0x8

    :goto_40
    sub-int v1, v15, v13

    if-ge v1, v12, :cond_57

    .line 199
    invoke-virtual {v0, v15}, LQ1/o;->G(I)V

    .line 200
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v1

    .line 201
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v4

    const v8, 0x70726f6a

    if-ne v4, v8, :cond_56

    .line 202
    iget-object v4, v0, LQ1/o;->a:[B

    add-int/2addr v1, v15

    .line 203
    invoke-static {v4, v15, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    move-object/from16 v28, v1

    goto :goto_41

    :cond_56
    add-int/2addr v15, v1

    goto :goto_40

    :cond_57
    move-object/from16 v28, v3

    :goto_41
    move-object/from16 v14, v34

    const/4 v1, -0x1

    const/4 v4, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    goto/16 :goto_3c

    :cond_58
    const v1, 0x73743364

    if-ne v11, v1, :cond_5e

    .line 204
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v1

    const/4 v4, 0x3

    .line 205
    invoke-virtual {v0, v4}, LQ1/o;->H(I)V

    if-nez v1, :cond_5d

    .line 206
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v1

    if-eqz v1, :cond_5c

    const/4 v9, 0x1

    if-eq v1, v9, :cond_5b

    const/4 v8, 0x2

    if-eq v1, v8, :cond_5a

    if-eq v1, v4, :cond_59

    goto :goto_42

    :cond_59
    move/from16 v46, v4

    goto :goto_42

    :cond_5a
    const/16 v46, 0x2

    goto :goto_42

    :cond_5b
    move/from16 v46, v9

    goto :goto_42

    :cond_5c
    const/4 v9, 0x1

    const/16 v46, 0x0

    goto :goto_42

    :cond_5d
    const/4 v9, 0x1

    :goto_42
    move-object/from16 v14, v34

    const/4 v1, -0x1

    const/4 v8, 0x2

    goto/16 :goto_3c

    :cond_5e
    const/4 v4, 0x3

    const/4 v9, 0x1

    const v1, 0x636f6c72

    if-ne v11, v1, :cond_64

    const/4 v1, -0x1

    if-ne v2, v1, :cond_60

    if-ne v6, v1, :cond_60

    .line 207
    invoke-virtual {v0}, LQ1/o;->h()I

    move-result v10

    const v11, 0x6e636c78

    if-eq v10, v11, :cond_61

    const v11, 0x6e636c63

    if-ne v10, v11, :cond_5f

    goto :goto_44

    .line 208
    :cond_5f
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "Unsupported color type: "

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v10}, LH5/a;->f(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_60
    :goto_43
    const/4 v8, 0x2

    goto :goto_47

    .line 209
    :cond_61
    :goto_44
    invoke-virtual {v0}, LQ1/o;->A()I

    move-result v2

    .line 210
    invoke-virtual {v0}, LQ1/o;->A()I

    move-result v6

    const/4 v8, 0x2

    .line 211
    invoke-virtual {v0, v8}, LQ1/o;->H(I)V

    const/16 v10, 0x13

    if-ne v12, v10, :cond_62

    .line 212
    invoke-virtual {v0}, LQ1/o;->u()I

    move-result v10

    and-int/lit16 v10, v10, 0x80

    if-eqz v10, :cond_62

    move v10, v9

    goto :goto_45

    :cond_62
    const/4 v10, 0x0

    .line 213
    :goto_45
    invoke-static {v2}, LN1/f;->f(I)I

    move-result v2

    if-eqz v10, :cond_63

    move/from16 v32, v9

    goto :goto_46

    :cond_63
    move/from16 v32, v8

    .line 214
    :goto_46
    invoke-static {v6}, LN1/f;->g(I)I

    move-result v6

    :goto_47
    move-object/from16 v14, v34

    goto/16 :goto_3c

    :cond_64
    const/4 v1, -0x1

    goto :goto_43

    .line 215
    :goto_48
    invoke-static {v0}, LD8/a;->a(LQ1/o;)LD8/a;

    move-result-object v10

    if-eqz v10, :cond_65

    .line 216
    iget-object v10, v10, LD8/a;->b:Ljava/lang/String;

    const-string v11, "video/dolby-vision"

    move-object/from16 v27, v10

    goto :goto_49

    :cond_65
    move-object/from16 v11, p8

    :goto_49
    move-object/from16 v14, v34

    move/from16 v34, v26

    move-object/from16 v26, v35

    move/from16 v35, v31

    move/from16 v31, v2

    move v2, v6

    move-object v6, v11

    :goto_4a
    add-int v10, p6, v12

    move/from16 v1, p2

    move/from16 v20, v4

    move v8, v10

    move/from16 v10, v29

    move-object/from16 v15, v33

    move-object/from16 v3, v43

    move/from16 v29, v46

    const/16 v17, 0x7

    const/16 v18, 0x5

    const/16 v19, 0x6

    move-object/from16 v4, p7

    move/from16 v33, v2

    move/from16 v2, p3

    goto/16 :goto_4

    :goto_4b
    if-nez p8, :cond_66

    return-void

    .line 217
    :cond_66
    new-instance v0, LN1/m;

    invoke-direct {v0}, LN1/m;-><init>()V

    .line 218
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LN1/m;->a:Ljava/lang/String;

    .line 219
    invoke-static/range {p8 .. p8}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LN1/m;->m:Ljava/lang/String;

    move-object/from16 v9, v27

    .line 220
    iput-object v9, v0, LN1/m;->j:Ljava/lang/String;

    .line 221
    iput v5, v0, LN1/m;->t:I

    .line 222
    iput v7, v0, LN1/m;->u:I

    move/from16 v1, v25

    .line 223
    iput v1, v0, LN1/m;->x:F

    move/from16 v1, p5

    .line 224
    iput v1, v0, LN1/m;->w:I

    move-object/from16 v9, v28

    .line 225
    iput-object v9, v0, LN1/m;->y:[B

    move/from16 v4, v46

    .line 226
    iput v4, v0, LN1/m;->z:I

    move-object/from16 v1, v35

    .line 227
    iput-object v1, v0, LN1/m;->p:Ljava/util/List;

    move/from16 v12, v30

    .line 228
    iput v12, v0, LN1/m;->o:I

    move-object/from16 v1, v43

    .line 229
    iput-object v1, v0, LN1/m;->q:LN1/j;

    if-eqz v24, :cond_67

    .line 230
    invoke-virtual/range {v24 .. v24}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    goto :goto_4c

    :cond_67
    move-object v9, v3

    .line 231
    :goto_4c
    new-instance v1, LN1/f;

    move-object/from16 p0, v1

    move/from16 p1, v2

    move/from16 p3, v6

    move-object/from16 p6, v9

    move/from16 p4, v26

    move/from16 p5, v31

    move/from16 p2, v32

    invoke-direct/range {p0 .. p6}, LN1/f;-><init>(IIIII[B)V

    .line 232
    iput-object v1, v0, LN1/m;->A:LN1/f;

    move-object/from16 v9, v36

    if-eqz v9, :cond_68

    .line 233
    iget-wide v1, v9, LM2/b;->c:J

    invoke-static {v1, v2}, LS3/f;->F(J)I

    move-result v1

    .line 234
    iput v1, v0, LN1/m;->h:I

    .line 235
    iget-wide v1, v9, LM2/b;->d:J

    invoke-static {v1, v2}, LS3/f;->F(J)I

    move-result v1

    .line 236
    iput v1, v0, LN1/m;->i:I

    .line 237
    :cond_68
    new-instance v1, LN1/n;

    invoke-direct {v1, v0}, LN1/n;-><init>(LN1/m;)V

    move-object/from16 v4, p7

    .line 238
    iput-object v1, v4, LM2/d;->e:Ljava/lang/Object;

    return-void
.end method
