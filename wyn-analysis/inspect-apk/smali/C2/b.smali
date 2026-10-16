.class public final LC2/b;
.super Lic/d;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LC2/b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static O(LQ1/o;)LD2/a;
    .locals 8

    .line 1
    invoke-virtual {p0}, LQ1/o;->p()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LQ1/o;->p()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LQ1/o;->o()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {p0}, LQ1/o;->o()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    iget-object v0, p0, LQ1/o;->a:[B

    .line 24
    .line 25
    iget v7, p0, LQ1/o;->b:I

    .line 26
    .line 27
    iget p0, p0, LQ1/o;->c:I

    .line 28
    .line 29
    invoke-static {v0, v7, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    new-instance v0, LD2/a;

    .line 34
    .line 35
    invoke-direct/range {v0 .. v7}, LD2/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method


# virtual methods
.method public final p(LB2/a;Ljava/nio/ByteBuffer;)LN1/B;
    .locals 18

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    iget v4, v3, LC2/b;->b:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, LN1/B;

    .line 13
    .line 14
    new-instance v4, LQ1/o;

    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    invoke-direct {v4, v5, v6}, LQ1/o;-><init>([BI)V

    .line 25
    .line 26
    .line 27
    invoke-static {v4}, LC2/b;->O(LQ1/o;)LD2/a;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-array v2, v2, [LN1/A;

    .line 32
    .line 33
    aput-object v4, v2, v1

    .line 34
    .line 35
    invoke-direct {v0, v2}, LN1/B;-><init>([LN1/A;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/16 v5, 0x74

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    if-ne v4, v5, :cond_7

    .line 47
    .line 48
    new-instance v4, LJ5/y;

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    invoke-direct {v4, v5, v7, v2, v1}, LJ5/y;-><init>([BIIB)V

    .line 59
    .line 60
    .line 61
    const/16 v5, 0xc

    .line 62
    .line 63
    invoke-virtual {v4, v5}, LJ5/y;->t(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, LJ5/y;->i(I)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    add-int/2addr v8, v7

    .line 75
    const/4 v7, 0x4

    .line 76
    sub-int/2addr v8, v7

    .line 77
    const/16 v9, 0x2c

    .line 78
    .line 79
    invoke-virtual {v4, v9}, LJ5/y;->t(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, LJ5/y;->i(I)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-virtual {v4, v9}, LJ5/y;->u(I)V

    .line 87
    .line 88
    .line 89
    const/16 v9, 0x10

    .line 90
    .line 91
    invoke-virtual {v4, v9}, LJ5/y;->t(I)V

    .line 92
    .line 93
    .line 94
    new-instance v10, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    :goto_0
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-ge v11, v8, :cond_5

    .line 104
    .line 105
    const/16 v11, 0x30

    .line 106
    .line 107
    invoke-virtual {v4, v11}, LJ5/y;->t(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v0}, LJ5/y;->i(I)I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    invoke-virtual {v4, v7}, LJ5/y;->t(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v5}, LJ5/y;->i(I)I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    add-int/2addr v13, v12

    .line 126
    move-object v12, v6

    .line 127
    move-object v14, v12

    .line 128
    :goto_1
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-ge v15, v13, :cond_3

    .line 133
    .line 134
    invoke-virtual {v4, v0}, LJ5/y;->i(I)I

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    invoke-virtual {v4, v0}, LJ5/y;->i(I)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    move/from16 v17, v2

    .line 147
    .line 148
    add-int v2, v16, v1

    .line 149
    .line 150
    const/4 v5, 0x2

    .line 151
    if-ne v15, v5, :cond_1

    .line 152
    .line 153
    invoke-virtual {v4, v9}, LJ5/y;->i(I)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {v4, v0}, LJ5/y;->t(I)V

    .line 158
    .line 159
    .line 160
    const/4 v5, 0x3

    .line 161
    if-ne v1, v5, :cond_2

    .line 162
    .line 163
    :goto_2
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-ge v1, v2, :cond_2

    .line 168
    .line 169
    invoke-virtual {v4, v0}, LJ5/y;->i(I)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    sget-object v5, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 174
    .line 175
    new-array v12, v1, [B

    .line 176
    .line 177
    invoke-virtual {v4, v1, v12}, LJ5/y;->l(I[B)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Ljava/lang/String;

    .line 181
    .line 182
    invoke-direct {v1, v12, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v0}, LJ5/y;->i(I)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    const/4 v12, 0x0

    .line 190
    :goto_3
    if-ge v12, v5, :cond_0

    .line 191
    .line 192
    invoke-virtual {v4, v0}, LJ5/y;->i(I)I

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    invoke-virtual {v4, v15}, LJ5/y;->u(I)V

    .line 197
    .line 198
    .line 199
    add-int/lit8 v12, v12, 0x1

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_0
    move-object v12, v1

    .line 203
    goto :goto_2

    .line 204
    :cond_1
    const/16 v5, 0x15

    .line 205
    .line 206
    if-ne v15, v5, :cond_2

    .line 207
    .line 208
    sget-object v5, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 209
    .line 210
    new-array v14, v1, [B

    .line 211
    .line 212
    invoke-virtual {v4, v1, v14}, LJ5/y;->l(I[B)V

    .line 213
    .line 214
    .line 215
    new-instance v1, Ljava/lang/String;

    .line 216
    .line 217
    invoke-direct {v1, v14, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 218
    .line 219
    .line 220
    move-object v14, v1

    .line 221
    :cond_2
    mul-int/2addr v2, v0

    .line 222
    invoke-virtual {v4, v2}, LJ5/y;->q(I)V

    .line 223
    .line 224
    .line 225
    move/from16 v2, v17

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    const/16 v5, 0xc

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_3
    move/from16 v17, v2

    .line 232
    .line 233
    mul-int/2addr v13, v0

    .line 234
    invoke-virtual {v4, v13}, LJ5/y;->q(I)V

    .line 235
    .line 236
    .line 237
    if-eqz v12, :cond_4

    .line 238
    .line 239
    if-eqz v14, :cond_4

    .line 240
    .line 241
    new-instance v1, LC2/a;

    .line 242
    .line 243
    invoke-virtual {v12, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-direct {v1, v11, v2}, LC2/a;-><init>(ILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    :cond_4
    move/from16 v2, v17

    .line 254
    .line 255
    const/4 v1, 0x0

    .line 256
    const/16 v5, 0xc

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_6

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_6
    new-instance v6, LN1/B;

    .line 268
    .line 269
    invoke-direct {v6, v10}, LN1/B;-><init>(Ljava/util/List;)V

    .line 270
    .line 271
    .line 272
    :cond_7
    :goto_4
    return-object v6

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
