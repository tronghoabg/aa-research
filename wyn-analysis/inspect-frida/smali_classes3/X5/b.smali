.class public final LX5/b;
.super Lic/d;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LX5/b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final r(LW5/e;Ljava/nio/ByteBuffer;)LW5/c;
    .locals 17

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    iget v4, v3, LX5/b;->b:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v1, LW5/c;

    .line 13
    .line 14
    new-instance v4, LY4/b;

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
    invoke-direct {v4, v5, v6}, LY4/b;-><init>([BI)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, LY4/b;->l()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, LY4/b;->l()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, LY4/b;->k()J

    .line 42
    .line 43
    .line 44
    move-result-wide v10

    .line 45
    invoke-virtual {v4}, LY4/b;->k()J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    iget-object v5, v4, LY4/b;->a:[B

    .line 50
    .line 51
    iget v6, v4, LY4/b;->b:I

    .line 52
    .line 53
    iget v4, v4, LY4/b;->c:I

    .line 54
    .line 55
    invoke-static {v5, v6, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    new-instance v7, LY5/a;

    .line 60
    .line 61
    invoke-direct/range {v7 .. v14}, LY5/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 62
    .line 63
    .line 64
    new-array v0, v0, [LW5/b;

    .line 65
    .line 66
    aput-object v7, v0, v2

    .line 67
    .line 68
    invoke-direct {v1, v0}, LW5/c;-><init>([LW5/b;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :pswitch_0
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    const/16 v5, 0x74

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    if-ne v4, v5, :cond_7

    .line 80
    .line 81
    new-instance v4, LJ5/y;

    .line 82
    .line 83
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    const/4 v8, 0x6

    .line 92
    invoke-direct {v4, v5, v7, v8, v2}, LJ5/y;-><init>([BIIB)V

    .line 93
    .line 94
    .line 95
    const/16 v5, 0xc

    .line 96
    .line 97
    invoke-virtual {v4, v5}, LJ5/y;->t(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v5}, LJ5/y;->i(I)I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    add-int/2addr v8, v7

    .line 109
    const/4 v7, 0x4

    .line 110
    sub-int/2addr v8, v7

    .line 111
    const/16 v9, 0x2c

    .line 112
    .line 113
    invoke-virtual {v4, v9}, LJ5/y;->t(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v5}, LJ5/y;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v4, v9}, LJ5/y;->u(I)V

    .line 121
    .line 122
    .line 123
    const/16 v9, 0x10

    .line 124
    .line 125
    invoke-virtual {v4, v9}, LJ5/y;->t(I)V

    .line 126
    .line 127
    .line 128
    new-instance v10, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    :goto_0
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-ge v11, v8, :cond_5

    .line 138
    .line 139
    const/16 v11, 0x30

    .line 140
    .line 141
    invoke-virtual {v4, v11}, LJ5/y;->t(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v1}, LJ5/y;->i(I)I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-virtual {v4, v7}, LJ5/y;->t(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v5}, LJ5/y;->i(I)I

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    add-int/2addr v13, v12

    .line 160
    move-object v12, v6

    .line 161
    move-object v14, v12

    .line 162
    :goto_1
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    if-ge v15, v13, :cond_3

    .line 167
    .line 168
    invoke-virtual {v4, v1}, LJ5/y;->i(I)I

    .line 169
    .line 170
    .line 171
    move-result v15

    .line 172
    move/from16 p1, v0

    .line 173
    .line 174
    invoke-virtual {v4, v1}, LJ5/y;->i(I)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 179
    .line 180
    .line 181
    move-result v16

    .line 182
    add-int v2, v16, v0

    .line 183
    .line 184
    const/4 v5, 0x2

    .line 185
    if-ne v15, v5, :cond_1

    .line 186
    .line 187
    invoke-virtual {v4, v9}, LJ5/y;->i(I)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-virtual {v4, v1}, LJ5/y;->t(I)V

    .line 192
    .line 193
    .line 194
    const/4 v5, 0x3

    .line 195
    if-ne v0, v5, :cond_2

    .line 196
    .line 197
    :goto_2
    invoke-virtual {v4}, LJ5/y;->f()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-ge v0, v2, :cond_2

    .line 202
    .line 203
    invoke-virtual {v4, v1}, LJ5/y;->i(I)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    sget-object v5, Lk8/g;->a:Ljava/nio/charset/Charset;

    .line 208
    .line 209
    new-array v12, v0, [B

    .line 210
    .line 211
    invoke-virtual {v4, v0, v12}, LJ5/y;->l(I[B)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Ljava/lang/String;

    .line 215
    .line 216
    invoke-direct {v0, v12, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v1}, LJ5/y;->i(I)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    const/4 v12, 0x0

    .line 224
    :goto_3
    if-ge v12, v5, :cond_0

    .line 225
    .line 226
    invoke-virtual {v4, v1}, LJ5/y;->i(I)I

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    invoke-virtual {v4, v15}, LJ5/y;->u(I)V

    .line 231
    .line 232
    .line 233
    add-int/lit8 v12, v12, 0x1

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_0
    move-object v12, v0

    .line 237
    goto :goto_2

    .line 238
    :cond_1
    const/16 v5, 0x15

    .line 239
    .line 240
    if-ne v15, v5, :cond_2

    .line 241
    .line 242
    sget-object v5, Lk8/g;->a:Ljava/nio/charset/Charset;

    .line 243
    .line 244
    new-array v14, v0, [B

    .line 245
    .line 246
    invoke-virtual {v4, v0, v14}, LJ5/y;->l(I[B)V

    .line 247
    .line 248
    .line 249
    new-instance v0, Ljava/lang/String;

    .line 250
    .line 251
    invoke-direct {v0, v14, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 252
    .line 253
    .line 254
    move-object v14, v0

    .line 255
    :cond_2
    mul-int/2addr v2, v1

    .line 256
    invoke-virtual {v4, v2}, LJ5/y;->q(I)V

    .line 257
    .line 258
    .line 259
    move/from16 v0, p1

    .line 260
    .line 261
    const/4 v2, 0x0

    .line 262
    const/16 v5, 0xc

    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_3
    move/from16 p1, v0

    .line 266
    .line 267
    mul-int/2addr v13, v1

    .line 268
    invoke-virtual {v4, v13}, LJ5/y;->q(I)V

    .line 269
    .line 270
    .line 271
    if-eqz v12, :cond_4

    .line 272
    .line 273
    if-eqz v14, :cond_4

    .line 274
    .line 275
    new-instance v0, LX5/a;

    .line 276
    .line 277
    invoke-virtual {v12, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-direct {v0, v11, v2}, LX5/a;-><init>(ILjava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    :cond_4
    move/from16 v0, p1

    .line 288
    .line 289
    const/4 v2, 0x0

    .line 290
    const/16 v5, 0xc

    .line 291
    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_6

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_6
    new-instance v6, LW5/c;

    .line 302
    .line 303
    invoke-direct {v6, v10}, LW5/c;-><init>(Ljava/util/List;)V

    .line 304
    .line 305
    .line 306
    :cond_7
    :goto_4
    return-object v6

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
