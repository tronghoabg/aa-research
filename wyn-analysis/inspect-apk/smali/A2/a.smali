.class public final LA2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:LQ1/o;

.field public b:Ls2/o;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:LH2/a;

.field public h:Ls2/j;

.field public i:LA2/d;

.field public j:LM2/o;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LQ1/o;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LA2/a;->a:LQ1/o;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, LA2/a;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, LA2/a;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, LA2/a;->j:LM2/o;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, LA2/a;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LA2/a;->j:LM2/o;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, LM2/o;->a(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, LA2/a;->b:Ls2/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Ls2/o;->l()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LA2/a;->b:Ls2/o;

    .line 10
    .line 11
    new-instance v1, Ls2/q;

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Ls2/q;-><init>(J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ls2/o;->s(Ls2/w;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x6

    .line 25
    iput v0, p0, LA2/a;->c:I

    .line 26
    .line 27
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/a;->b:Ls2/o;

    .line 2
    .line 3
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 6

    .line 1
    check-cast p1, Ls2/j;

    .line 2
    .line 3
    iget-object v0, p0, LA2/a;->a:LQ1/o;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1}, LQ1/o;->D(I)V

    .line 7
    .line 8
    .line 9
    iget-object v2, v0, LQ1/o;->a:[B

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p1, v2, v3, v1, v3}, Ls2/j;->c([BIIZ)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LQ1/o;->A()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const v4, 0xffd8

    .line 20
    .line 21
    .line 22
    if-eq v2, v4, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0, v1}, LQ1/o;->D(I)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, LQ1/o;->a:[B

    .line 29
    .line 30
    invoke-virtual {p1, v2, v3, v1, v3}, Ls2/j;->c([BIIZ)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, LQ1/o;->A()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, LA2/a;->d:I

    .line 38
    .line 39
    const v4, 0xffe0

    .line 40
    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v1}, LQ1/o;->D(I)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, LQ1/o;->a:[B

    .line 48
    .line 49
    invoke-virtual {p1, v2, v3, v1, v3}, Ls2/j;->c([BIIZ)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, LQ1/o;->A()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    sub-int/2addr v2, v1

    .line 57
    invoke-virtual {p1, v2, v3}, Ls2/j;->b(IZ)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, LQ1/o;->D(I)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, LQ1/o;->a:[B

    .line 64
    .line 65
    invoke-virtual {p1, v2, v3, v1, v3}, Ls2/j;->c([BIIZ)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, LQ1/o;->A()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iput v2, p0, LA2/a;->d:I

    .line 73
    .line 74
    :cond_1
    iget v2, p0, LA2/a;->d:I

    .line 75
    .line 76
    const v4, 0xffe1

    .line 77
    .line 78
    .line 79
    if-eq v2, v4, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {p1, v1, v3}, Ls2/j;->b(IZ)Z

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x6

    .line 86
    invoke-virtual {v0, v1}, LQ1/o;->D(I)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, LQ1/o;->a:[B

    .line 90
    .line 91
    invoke-virtual {p1, v2, v3, v1, v3}, Ls2/j;->c([BIIZ)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, LQ1/o;->w()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    .line 99
    .line 100
    .line 101
    cmp-long p1, v1, v4

    .line 102
    .line 103
    if-nez p1, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, LQ1/o;->A()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    const/4 p1, 0x1

    .line 112
    return p1

    .line 113
    :cond_3
    :goto_0
    return v3
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 2
    .line 3
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, v0, LA2/a;->c:I

    .line 11
    .line 12
    const-wide/16 v7, -0x1

    .line 13
    .line 14
    iget-object v9, v0, LA2/a;->a:LQ1/o;

    .line 15
    .line 16
    const/4 v10, 0x4

    .line 17
    const/4 v11, 0x2

    .line 18
    if-eqz v6, :cond_17

    .line 19
    .line 20
    if-eq v6, v5, :cond_16

    .line 21
    .line 22
    if-eq v6, v11, :cond_a

    .line 23
    .line 24
    const/4 v7, 0x5

    .line 25
    if-eq v6, v10, :cond_5

    .line 26
    .line 27
    if-eq v6, v7, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    if-ne v6, v1, :cond_0

    .line 31
    .line 32
    return v3

    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    iget-object v3, v0, LA2/a;->i:LA2/d;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    iget-object v3, v0, LA2/a;->h:Ls2/j;

    .line 44
    .line 45
    if-eq v1, v3, :cond_3

    .line 46
    .line 47
    :cond_2
    check-cast v1, Ls2/j;

    .line 48
    .line 49
    iput-object v1, v0, LA2/a;->h:Ls2/j;

    .line 50
    .line 51
    new-instance v3, LA2/d;

    .line 52
    .line 53
    iget-wide v6, v0, LA2/a;->f:J

    .line 54
    .line 55
    invoke-direct {v3, v1, v6, v7}, LA2/d;-><init>(Ls2/j;J)V

    .line 56
    .line 57
    .line 58
    iput-object v3, v0, LA2/a;->i:LA2/d;

    .line 59
    .line 60
    :cond_3
    iget-object v1, v0, LA2/a;->j:LM2/o;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v3, v0, LA2/a;->i:LA2/d;

    .line 66
    .line 67
    invoke-virtual {v1, v3, v2}, LM2/o;->k(Ls2/n;LJ5/n;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v5, :cond_4

    .line 72
    .line 73
    iget-wide v3, v2, LJ5/n;->a:J

    .line 74
    .line 75
    iget-wide v5, v0, LA2/a;->f:J

    .line 76
    .line 77
    add-long/2addr v3, v5

    .line 78
    iput-wide v3, v2, LJ5/n;->a:J

    .line 79
    .line 80
    :cond_4
    return v1

    .line 81
    :cond_5
    move-object v3, v1

    .line 82
    check-cast v3, Ls2/j;

    .line 83
    .line 84
    iget-wide v11, v3, Ls2/j;->d:J

    .line 85
    .line 86
    iget-wide v13, v0, LA2/a;->f:J

    .line 87
    .line 88
    cmp-long v3, v11, v13

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iput-wide v13, v2, LJ5/n;->a:J

    .line 93
    .line 94
    return v5

    .line 95
    :cond_6
    iget-object v2, v9, LQ1/o;->a:[B

    .line 96
    .line 97
    check-cast v1, Ls2/j;

    .line 98
    .line 99
    invoke-virtual {v1, v2, v4, v5, v5}, Ls2/j;->c([BIIZ)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0}, LA2/a;->b()V

    .line 106
    .line 107
    .line 108
    return v4

    .line 109
    :cond_7
    iput v4, v1, Ls2/j;->f:I

    .line 110
    .line 111
    iget-object v2, v0, LA2/a;->j:LM2/o;

    .line 112
    .line 113
    if-nez v2, :cond_8

    .line 114
    .line 115
    new-instance v2, LM2/o;

    .line 116
    .line 117
    sget-object v3, LP2/j;->P8:Lx4/d;

    .line 118
    .line 119
    const/16 v6, 0x8

    .line 120
    .line 121
    invoke-direct {v2, v3, v6}, LM2/o;-><init>(LP2/j;I)V

    .line 122
    .line 123
    .line 124
    iput-object v2, v0, LA2/a;->j:LM2/o;

    .line 125
    .line 126
    :cond_8
    new-instance v2, LA2/d;

    .line 127
    .line 128
    iget-wide v8, v0, LA2/a;->f:J

    .line 129
    .line 130
    invoke-direct {v2, v1, v8, v9}, LA2/d;-><init>(Ls2/j;J)V

    .line 131
    .line 132
    .line 133
    iput-object v2, v0, LA2/a;->i:LA2/d;

    .line 134
    .line 135
    iget-object v1, v0, LA2/a;->j:LM2/o;

    .line 136
    .line 137
    invoke-virtual {v1, v2}, LM2/o;->i(Ls2/n;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_9

    .line 142
    .line 143
    iget-object v1, v0, LA2/a;->j:LM2/o;

    .line 144
    .line 145
    new-instance v2, LA2/d;

    .line 146
    .line 147
    iget-wide v8, v0, LA2/a;->f:J

    .line 148
    .line 149
    iget-object v3, v0, LA2/a;->b:Ls2/o;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-direct {v2, v8, v9, v3, v5}, LA2/d;-><init>(JLjava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v2}, LM2/o;->g(Ls2/o;)V

    .line 158
    .line 159
    .line 160
    iget-object v1, v0, LA2/a;->g:LH2/a;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object v2, v0, LA2/a;->b:Ls2/o;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    const/16 v3, 0x400

    .line 171
    .line 172
    invoke-interface {v2, v3, v10}, Ls2/o;->m(II)Ls2/C;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    new-instance v3, LN1/m;

    .line 177
    .line 178
    invoke-direct {v3}, LN1/m;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v6, "image/jpeg"

    .line 182
    .line 183
    invoke-static {v6}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    iput-object v6, v3, LN1/m;->l:Ljava/lang/String;

    .line 188
    .line 189
    new-instance v6, LN1/B;

    .line 190
    .line 191
    new-array v5, v5, [LN1/A;

    .line 192
    .line 193
    aput-object v1, v5, v4

    .line 194
    .line 195
    invoke-direct {v6, v5}, LN1/B;-><init>([LN1/A;)V

    .line 196
    .line 197
    .line 198
    iput-object v6, v3, LN1/m;->k:LN1/B;

    .line 199
    .line 200
    invoke-static {v3, v2}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 201
    .line 202
    .line 203
    iput v7, v0, LA2/a;->c:I

    .line 204
    .line 205
    return v4

    .line 206
    :cond_9
    invoke-virtual {v0}, LA2/a;->b()V

    .line 207
    .line 208
    .line 209
    return v4

    .line 210
    :cond_a
    iget v2, v0, LA2/a;->d:I

    .line 211
    .line 212
    const v6, 0xffe1

    .line 213
    .line 214
    .line 215
    if-ne v2, v6, :cond_14

    .line 216
    .line 217
    new-instance v2, LQ1/o;

    .line 218
    .line 219
    iget v6, v0, LA2/a;->e:I

    .line 220
    .line 221
    invoke-direct {v2, v6}, LQ1/o;-><init>(I)V

    .line 222
    .line 223
    .line 224
    iget-object v6, v2, LQ1/o;->a:[B

    .line 225
    .line 226
    iget v9, v0, LA2/a;->e:I

    .line 227
    .line 228
    move-object v10, v1

    .line 229
    check-cast v10, Ls2/j;

    .line 230
    .line 231
    invoke-virtual {v10, v6, v4, v9, v4}, Ls2/j;->f([BIIZ)Z

    .line 232
    .line 233
    .line 234
    iget-object v6, v0, LA2/a;->g:LH2/a;

    .line 235
    .line 236
    if-nez v6, :cond_15

    .line 237
    .line 238
    const-string v6, "http://ns.adobe.com/xap/1.0/"

    .line 239
    .line 240
    invoke-virtual {v2}, LQ1/o;->p()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-eqz v6, :cond_15

    .line 249
    .line 250
    invoke-virtual {v2}, LQ1/o;->p()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    if-eqz v2, :cond_15

    .line 255
    .line 256
    check-cast v1, Ls2/j;

    .line 257
    .line 258
    iget-wide v9, v1, Ls2/j;->c:J

    .line 259
    .line 260
    cmp-long v1, v9, v7

    .line 261
    .line 262
    if-nez v1, :cond_c

    .line 263
    .line 264
    :cond_b
    :goto_0
    const/4 v6, 0x0

    .line 265
    goto/16 :goto_5

    .line 266
    .line 267
    :cond_c
    :try_start_0
    invoke-static {v2}, LA2/f;->a(Ljava/lang/String;)LA2/c;

    .line 268
    .line 269
    .line 270
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch LN1/D; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    goto :goto_1

    .line 272
    :catch_0
    const-string v1, "MotionPhotoXmpParser"

    .line 273
    .line 274
    const-string v2, "Ignoring unexpected XMP metadata"

    .line 275
    .line 276
    invoke-static {v1, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    const/4 v1, 0x0

    .line 280
    :goto_1
    if-nez v1, :cond_d

    .line 281
    .line 282
    goto :goto_0

    .line 283
    :cond_d
    iget-object v2, v1, LA2/c;->b:Ll8/e0;

    .line 284
    .line 285
    iget v12, v2, Ll8/e0;->d:I

    .line 286
    .line 287
    if-ge v12, v11, :cond_e

    .line 288
    .line 289
    goto :goto_0

    .line 290
    :cond_e
    sub-int/2addr v12, v5

    .line 291
    move v5, v4

    .line 292
    move-wide v14, v7

    .line 293
    move-wide/from16 v16, v14

    .line 294
    .line 295
    move-wide/from16 v20, v16

    .line 296
    .line 297
    move-wide/from16 v22, v20

    .line 298
    .line 299
    :goto_2
    if-ltz v12, :cond_12

    .line 300
    .line 301
    invoke-virtual {v2, v12}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v11

    .line 305
    check-cast v11, LA2/b;

    .line 306
    .line 307
    iget-object v13, v11, LA2/b;->a:Ljava/lang/String;

    .line 308
    .line 309
    move/from16 v18, v3

    .line 310
    .line 311
    const-string v3, "video/mp4"

    .line 312
    .line 313
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    or-int/2addr v3, v5

    .line 318
    if-nez v12, :cond_f

    .line 319
    .line 320
    move-wide/from16 v24, v7

    .line 321
    .line 322
    iget-wide v6, v11, LA2/b;->c:J

    .line 323
    .line 324
    sub-long/2addr v9, v6

    .line 325
    const-wide/16 v5, 0x0

    .line 326
    .line 327
    :goto_3
    move-wide/from16 v26, v9

    .line 328
    .line 329
    move-wide v9, v5

    .line 330
    move-wide/from16 v5, v26

    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_f
    move-wide/from16 v24, v7

    .line 334
    .line 335
    iget-wide v5, v11, LA2/b;->b:J

    .line 336
    .line 337
    sub-long v5, v9, v5

    .line 338
    .line 339
    goto :goto_3

    .line 340
    :goto_4
    if-eqz v3, :cond_10

    .line 341
    .line 342
    cmp-long v7, v9, v5

    .line 343
    .line 344
    if-eqz v7, :cond_10

    .line 345
    .line 346
    sub-long v22, v5, v9

    .line 347
    .line 348
    move v3, v4

    .line 349
    move-wide/from16 v20, v9

    .line 350
    .line 351
    :cond_10
    if-nez v12, :cond_11

    .line 352
    .line 353
    move-wide/from16 v16, v5

    .line 354
    .line 355
    move-wide v14, v9

    .line 356
    :cond_11
    add-int/lit8 v12, v12, -0x1

    .line 357
    .line 358
    move v5, v3

    .line 359
    move/from16 v3, v18

    .line 360
    .line 361
    move-wide/from16 v7, v24

    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_12
    move-wide/from16 v24, v7

    .line 365
    .line 366
    cmp-long v2, v20, v24

    .line 367
    .line 368
    if-eqz v2, :cond_b

    .line 369
    .line 370
    cmp-long v2, v22, v24

    .line 371
    .line 372
    if-eqz v2, :cond_b

    .line 373
    .line 374
    cmp-long v2, v14, v24

    .line 375
    .line 376
    if-eqz v2, :cond_b

    .line 377
    .line 378
    cmp-long v2, v16, v24

    .line 379
    .line 380
    if-nez v2, :cond_13

    .line 381
    .line 382
    goto :goto_0

    .line 383
    :cond_13
    new-instance v13, LH2/a;

    .line 384
    .line 385
    iget-wide v1, v1, LA2/c;->a:J

    .line 386
    .line 387
    move-wide/from16 v18, v1

    .line 388
    .line 389
    invoke-direct/range {v13 .. v23}, LH2/a;-><init>(JJJJJ)V

    .line 390
    .line 391
    .line 392
    move-object v6, v13

    .line 393
    :goto_5
    iput-object v6, v0, LA2/a;->g:LH2/a;

    .line 394
    .line 395
    if-eqz v6, :cond_15

    .line 396
    .line 397
    iget-wide v1, v6, LH2/a;->d:J

    .line 398
    .line 399
    iput-wide v1, v0, LA2/a;->f:J

    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_14
    iget v2, v0, LA2/a;->e:I

    .line 403
    .line 404
    check-cast v1, Ls2/j;

    .line 405
    .line 406
    invoke-virtual {v1, v2}, Ls2/j;->j(I)V

    .line 407
    .line 408
    .line 409
    :cond_15
    :goto_6
    iput v4, v0, LA2/a;->c:I

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_16
    invoke-virtual {v9, v11}, LQ1/o;->D(I)V

    .line 413
    .line 414
    .line 415
    iget-object v2, v9, LQ1/o;->a:[B

    .line 416
    .line 417
    check-cast v1, Ls2/j;

    .line 418
    .line 419
    invoke-virtual {v1, v2, v4, v11, v4}, Ls2/j;->f([BIIZ)Z

    .line 420
    .line 421
    .line 422
    invoke-virtual {v9}, LQ1/o;->A()I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    sub-int/2addr v1, v11

    .line 427
    iput v1, v0, LA2/a;->e:I

    .line 428
    .line 429
    iput v11, v0, LA2/a;->c:I

    .line 430
    .line 431
    return v4

    .line 432
    :cond_17
    move-wide/from16 v24, v7

    .line 433
    .line 434
    invoke-virtual {v9, v11}, LQ1/o;->D(I)V

    .line 435
    .line 436
    .line 437
    iget-object v2, v9, LQ1/o;->a:[B

    .line 438
    .line 439
    check-cast v1, Ls2/j;

    .line 440
    .line 441
    invoke-virtual {v1, v2, v4, v11, v4}, Ls2/j;->f([BIIZ)Z

    .line 442
    .line 443
    .line 444
    invoke-virtual {v9}, LQ1/o;->A()I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    iput v1, v0, LA2/a;->d:I

    .line 449
    .line 450
    const v2, 0xffda

    .line 451
    .line 452
    .line 453
    if-ne v1, v2, :cond_19

    .line 454
    .line 455
    iget-wide v1, v0, LA2/a;->f:J

    .line 456
    .line 457
    cmp-long v1, v1, v24

    .line 458
    .line 459
    if-eqz v1, :cond_18

    .line 460
    .line 461
    iput v10, v0, LA2/a;->c:I

    .line 462
    .line 463
    return v4

    .line 464
    :cond_18
    invoke-virtual {v0}, LA2/a;->b()V

    .line 465
    .line 466
    .line 467
    return v4

    .line 468
    :cond_19
    const v2, 0xffd0

    .line 469
    .line 470
    .line 471
    if-lt v1, v2, :cond_1a

    .line 472
    .line 473
    const v2, 0xffd9

    .line 474
    .line 475
    .line 476
    if-le v1, v2, :cond_1b

    .line 477
    .line 478
    :cond_1a
    const v2, 0xff01

    .line 479
    .line 480
    .line 481
    if-eq v1, v2, :cond_1b

    .line 482
    .line 483
    iput v5, v0, LA2/a;->c:I

    .line 484
    .line 485
    :cond_1b
    :goto_7
    return v4
.end method

.method public final release()V
    .locals 1

    .line 1
    iget-object v0, p0, LA2/a;->j:LM2/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
