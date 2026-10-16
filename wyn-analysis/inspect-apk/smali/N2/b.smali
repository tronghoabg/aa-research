.class public final LN2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN2/g;
.implements LS5/d;


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:J

.field public d:I

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LN2/i;JJJJZ)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LN2/b;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    cmp-long v0, p4, p2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .line 11
    :goto_0
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 12
    iput-object p1, p0, LN2/b;->m:Ljava/lang/Object;

    .line 13
    iput-wide p2, p0, LN2/b;->b:J

    .line 14
    iput-wide p4, p0, LN2/b;->c:J

    sub-long/2addr p4, p2

    cmp-long p1, p6, p4

    if-eqz p1, :cond_2

    if-eqz p10, :cond_1

    goto :goto_1

    .line 15
    :cond_1
    iput v1, p0, LN2/b;->d:I

    goto :goto_2

    .line 16
    :cond_2
    :goto_1
    iput-wide p8, p0, LN2/b;->e:J

    const/4 p1, 0x4

    .line 17
    iput p1, p0, LN2/b;->d:I

    .line 18
    :goto_2
    new-instance p1, LN2/f;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LN2/f;-><init>(I)V

    iput-object p1, p0, LN2/b;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LN2/i;JJJJZB)V
    .locals 2

    const/4 p11, 0x1

    iput p11, p0, LN2/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long p11, p2, v0

    const/4 v0, 0x0

    if-ltz p11, :cond_0

    cmp-long p11, p4, p2

    if-lez p11, :cond_0

    const/4 p11, 0x1

    goto :goto_0

    :cond_0
    move p11, v0

    .line 2
    :goto_0
    invoke-static {p11}, Lu6/a;->e(Z)V

    .line 3
    iput-object p1, p0, LN2/b;->m:Ljava/lang/Object;

    .line 4
    iput-wide p2, p0, LN2/b;->b:J

    .line 5
    iput-wide p4, p0, LN2/b;->c:J

    sub-long/2addr p4, p2

    cmp-long p1, p6, p4

    if-eqz p1, :cond_2

    if-eqz p10, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    iput v0, p0, LN2/b;->d:I

    goto :goto_2

    .line 7
    :cond_2
    :goto_1
    iput-wide p8, p0, LN2/b;->e:J

    const/4 p1, 0x4

    .line 8
    iput p1, p0, LN2/b;->d:I

    .line 9
    :goto_2
    new-instance p1, LN2/f;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, LN2/f;-><init>(I)V

    iput-object p1, p0, LN2/b;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()LJ5/t;
    .locals 4

    .line 1
    iget-wide v0, p0, LN2/b;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, LS5/a;

    invoke-direct {v0, p0}, LS5/a;-><init>(LN2/b;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a()Ls2/w;
    .locals 4

    .line 2
    iget-wide v0, p0, LN2/b;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, LN2/a;

    invoke-direct {v0, p0}, LN2/a;-><init>(LN2/b;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(J)V
    .locals 10

    .line 1
    iget v0, p0, LN2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, LN2/b;->e:J

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    .line 10
    sub-long v8, v0, v2

    .line 11
    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    move-wide v4, p1

    .line 15
    invoke-static/range {v4 .. v9}, Lu6/v;->i(JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    iput-wide p1, p0, LN2/b;->g:J

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    iput p1, p0, LN2/b;->d:I

    .line 23
    .line 24
    iget-wide p1, p0, LN2/b;->b:J

    .line 25
    .line 26
    iput-wide p1, p0, LN2/b;->h:J

    .line 27
    .line 28
    iget-wide p1, p0, LN2/b;->c:J

    .line 29
    .line 30
    iput-wide p1, p0, LN2/b;->i:J

    .line 31
    .line 32
    const-wide/16 p1, 0x0

    .line 33
    .line 34
    iput-wide p1, p0, LN2/b;->j:J

    .line 35
    .line 36
    iget-wide p1, p0, LN2/b;->e:J

    .line 37
    .line 38
    iput-wide p1, p0, LN2/b;->k:J

    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    move-wide v0, p1

    .line 42
    iget-wide p1, p0, LN2/b;->e:J

    .line 43
    .line 44
    const-wide/16 v2, 0x1

    .line 45
    .line 46
    sub-long v4, p1, v2

    .line 47
    .line 48
    const-wide/16 v2, 0x0

    .line 49
    .line 50
    invoke-static/range {v0 .. v5}, LQ1/x;->j(JJJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    iput-wide p1, p0, LN2/b;->g:J

    .line 55
    .line 56
    const/4 p1, 0x2

    .line 57
    iput p1, p0, LN2/b;->d:I

    .line 58
    .line 59
    iget-wide p1, p0, LN2/b;->b:J

    .line 60
    .line 61
    iput-wide p1, p0, LN2/b;->h:J

    .line 62
    .line 63
    iget-wide p1, p0, LN2/b;->c:J

    .line 64
    .line 65
    iput-wide p1, p0, LN2/b;->i:J

    .line 66
    .line 67
    const-wide/16 p1, 0x0

    .line 68
    .line 69
    iput-wide p1, p0, LN2/b;->j:J

    .line 70
    .line 71
    iget-wide p1, p0, LN2/b;->e:J

    .line 72
    .line 73
    iput-wide p1, p0, LN2/b;->k:J

    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(LJ5/h;)J
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, LN2/b;->d:I

    .line 6
    .line 7
    const-wide/16 v5, -0x1

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    iget-wide v8, v0, LN2/b;->c:J

    .line 11
    .line 12
    iget-object v10, v0, LN2/b;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v10, LN2/f;

    .line 15
    .line 16
    const/4 v11, 0x1

    .line 17
    const/4 v12, 0x4

    .line 18
    if-eqz v2, :cond_d

    .line 19
    .line 20
    if-eq v2, v11, :cond_c

    .line 21
    .line 22
    const/4 v8, 0x2

    .line 23
    const/4 v9, 0x3

    .line 24
    if-eq v2, v8, :cond_2

    .line 25
    .line 26
    if-eq v2, v9, :cond_1

    .line 27
    .line 28
    if-ne v2, v12, :cond_0

    .line 29
    .line 30
    return-wide v5

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    move-wide/from16 v26, v5

    .line 38
    .line 39
    move-object v14, v10

    .line 40
    const-wide/16 v15, 0x2

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_2
    const-wide/16 v15, 0x2

    .line 45
    .line 46
    iget-wide v13, v0, LN2/b;->h:J

    .line 47
    .line 48
    const-wide/16 v17, 0x0

    .line 49
    .line 50
    iget-wide v3, v0, LN2/b;->i:J

    .line 51
    .line 52
    cmp-long v2, v13, v3

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    :goto_0
    move-wide v2, v5

    .line 57
    move-wide/from16 v26, v2

    .line 58
    .line 59
    :goto_1
    move-object v14, v10

    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_3
    iget-wide v13, v1, LJ5/h;->d:J

    .line 63
    .line 64
    invoke-virtual {v10, v1, v3, v4}, LN2/f;->c(LJ5/h;J)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    iget-wide v2, v0, LN2/b;->h:J

    .line 71
    .line 72
    cmp-long v4, v2, v13

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    move-wide/from16 v26, v5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    new-instance v1, Ljava/io/IOException;

    .line 80
    .line 81
    const-string v2, "No ogg page can be found."

    .line 82
    .line 83
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_5
    invoke-virtual {v10, v1, v7}, LN2/f;->a(LJ5/h;Z)Z

    .line 88
    .line 89
    .line 90
    iput v7, v1, LJ5/h;->f:I

    .line 91
    .line 92
    iget-wide v2, v0, LN2/b;->g:J

    .line 93
    .line 94
    iget-wide v7, v10, LN2/f;->b:J

    .line 95
    .line 96
    sub-long/2addr v2, v7

    .line 97
    iget v11, v10, LN2/f;->d:I

    .line 98
    .line 99
    iget v4, v10, LN2/f;->e:I

    .line 100
    .line 101
    add-int/2addr v11, v4

    .line 102
    cmp-long v4, v17, v2

    .line 103
    .line 104
    if-gtz v4, :cond_6

    .line 105
    .line 106
    const-wide/32 v19, 0x11940

    .line 107
    .line 108
    .line 109
    cmp-long v4, v2, v19

    .line 110
    .line 111
    if-gez v4, :cond_6

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    cmp-long v4, v2, v17

    .line 115
    .line 116
    if-gez v4, :cond_7

    .line 117
    .line 118
    iput-wide v13, v0, LN2/b;->i:J

    .line 119
    .line 120
    iput-wide v7, v0, LN2/b;->k:J

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    iget-wide v13, v1, LJ5/h;->d:J

    .line 124
    .line 125
    move-wide/from16 v17, v13

    .line 126
    .line 127
    int-to-long v12, v11

    .line 128
    add-long v12, v17, v12

    .line 129
    .line 130
    iput-wide v12, v0, LN2/b;->h:J

    .line 131
    .line 132
    iput-wide v7, v0, LN2/b;->j:J

    .line 133
    .line 134
    :goto_2
    iget-wide v7, v0, LN2/b;->i:J

    .line 135
    .line 136
    iget-wide v12, v0, LN2/b;->h:J

    .line 137
    .line 138
    sub-long v17, v7, v12

    .line 139
    .line 140
    const-wide/32 v20, 0x186a0

    .line 141
    .line 142
    .line 143
    cmp-long v14, v17, v20

    .line 144
    .line 145
    if-gez v14, :cond_8

    .line 146
    .line 147
    iput-wide v12, v0, LN2/b;->i:J

    .line 148
    .line 149
    move-wide/from16 v26, v5

    .line 150
    .line 151
    move-object v14, v10

    .line 152
    move-wide v2, v12

    .line 153
    goto :goto_4

    .line 154
    :cond_8
    move-wide/from16 v26, v5

    .line 155
    .line 156
    int-to-long v5, v11

    .line 157
    const-wide/16 v17, 0x1

    .line 158
    .line 159
    if-gtz v4, :cond_9

    .line 160
    .line 161
    move-wide/from16 v20, v15

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    move-wide/from16 v20, v17

    .line 165
    .line 166
    :goto_3
    mul-long v5, v5, v20

    .line 167
    .line 168
    move-object v14, v10

    .line 169
    iget-wide v9, v1, LJ5/h;->d:J

    .line 170
    .line 171
    sub-long/2addr v9, v5

    .line 172
    sub-long v5, v7, v12

    .line 173
    .line 174
    mul-long/2addr v5, v2

    .line 175
    iget-wide v2, v0, LN2/b;->k:J

    .line 176
    .line 177
    move-wide/from16 v20, v5

    .line 178
    .line 179
    iget-wide v4, v0, LN2/b;->j:J

    .line 180
    .line 181
    sub-long/2addr v2, v4

    .line 182
    div-long v5, v20, v2

    .line 183
    .line 184
    add-long v20, v5, v9

    .line 185
    .line 186
    sub-long v24, v7, v17

    .line 187
    .line 188
    move-wide/from16 v22, v12

    .line 189
    .line 190
    invoke-static/range {v20 .. v25}, Lu6/v;->i(JJJ)J

    .line 191
    .line 192
    .line 193
    move-result-wide v2

    .line 194
    :goto_4
    cmp-long v4, v2, v26

    .line 195
    .line 196
    if-eqz v4, :cond_a

    .line 197
    .line 198
    return-wide v2

    .line 199
    :cond_a
    const/4 v4, 0x3

    .line 200
    iput v4, v0, LN2/b;->d:I

    .line 201
    .line 202
    :goto_5
    move-wide/from16 v2, v26

    .line 203
    .line 204
    :goto_6
    invoke-virtual {v14, v1, v2, v3}, LN2/f;->c(LJ5/h;J)Z

    .line 205
    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    invoke-virtual {v14, v1, v4}, LN2/f;->a(LJ5/h;Z)Z

    .line 209
    .line 210
    .line 211
    iget-wide v2, v14, LN2/f;->b:J

    .line 212
    .line 213
    iget-wide v5, v0, LN2/b;->g:J

    .line 214
    .line 215
    cmp-long v2, v2, v5

    .line 216
    .line 217
    if-lez v2, :cond_b

    .line 218
    .line 219
    iput v4, v1, LJ5/h;->f:I

    .line 220
    .line 221
    const/4 v1, 0x4

    .line 222
    iput v1, v0, LN2/b;->d:I

    .line 223
    .line 224
    iget-wide v1, v0, LN2/b;->j:J

    .line 225
    .line 226
    add-long/2addr v1, v15

    .line 227
    neg-long v1, v1

    .line 228
    return-wide v1

    .line 229
    :cond_b
    iget v2, v14, LN2/f;->d:I

    .line 230
    .line 231
    iget v3, v14, LN2/f;->e:I

    .line 232
    .line 233
    add-int/2addr v2, v3

    .line 234
    invoke-virtual {v1, v2}, LJ5/h;->j(I)V

    .line 235
    .line 236
    .line 237
    iget-wide v2, v1, LJ5/h;->d:J

    .line 238
    .line 239
    iput-wide v2, v0, LN2/b;->h:J

    .line 240
    .line 241
    iget-wide v2, v14, LN2/f;->b:J

    .line 242
    .line 243
    iput-wide v2, v0, LN2/b;->j:J

    .line 244
    .line 245
    const-wide/16 v2, -0x1

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_c
    move-object v14, v10

    .line 249
    const-wide/16 v17, 0x0

    .line 250
    .line 251
    move v4, v7

    .line 252
    goto :goto_7

    .line 253
    :cond_d
    move-object v14, v10

    .line 254
    const-wide/16 v17, 0x0

    .line 255
    .line 256
    iget-wide v2, v1, LJ5/h;->d:J

    .line 257
    .line 258
    iput-wide v2, v0, LN2/b;->f:J

    .line 259
    .line 260
    iput v11, v0, LN2/b;->d:I

    .line 261
    .line 262
    const-wide/32 v5, 0xff1b

    .line 263
    .line 264
    .line 265
    sub-long v5, v8, v5

    .line 266
    .line 267
    cmp-long v2, v5, v2

    .line 268
    .line 269
    if-lez v2, :cond_e

    .line 270
    .line 271
    return-wide v5

    .line 272
    :cond_e
    const/4 v4, 0x0

    .line 273
    :goto_7
    iput v4, v14, LN2/f;->a:I

    .line 274
    .line 275
    move-wide/from16 v2, v17

    .line 276
    .line 277
    iput-wide v2, v14, LN2/f;->b:J

    .line 278
    .line 279
    iput v4, v14, LN2/f;->c:I

    .line 280
    .line 281
    iput v4, v14, LN2/f;->d:I

    .line 282
    .line 283
    iput v4, v14, LN2/f;->e:I

    .line 284
    .line 285
    const-wide/16 v2, -0x1

    .line 286
    .line 287
    invoke-virtual {v14, v1, v2, v3}, LN2/f;->c(LJ5/h;J)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-eqz v5, :cond_10

    .line 292
    .line 293
    invoke-virtual {v14, v1, v4}, LN2/f;->a(LJ5/h;Z)Z

    .line 294
    .line 295
    .line 296
    iget v2, v14, LN2/f;->d:I

    .line 297
    .line 298
    iget v3, v14, LN2/f;->e:I

    .line 299
    .line 300
    add-int/2addr v2, v3

    .line 301
    invoke-virtual {v1, v2}, LJ5/h;->j(I)V

    .line 302
    .line 303
    .line 304
    iget-wide v2, v14, LN2/f;->b:J

    .line 305
    .line 306
    :goto_8
    iget v4, v14, LN2/f;->a:I

    .line 307
    .line 308
    const/4 v5, 0x4

    .line 309
    and-int/2addr v4, v5

    .line 310
    if-eq v4, v5, :cond_f

    .line 311
    .line 312
    const-wide/16 v4, -0x1

    .line 313
    .line 314
    invoke-virtual {v14, v1, v4, v5}, LN2/f;->c(LJ5/h;J)Z

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    if-eqz v6, :cond_f

    .line 319
    .line 320
    iget-wide v6, v1, LJ5/h;->d:J

    .line 321
    .line 322
    cmp-long v6, v6, v8

    .line 323
    .line 324
    if-gez v6, :cond_f

    .line 325
    .line 326
    invoke-virtual {v14, v1, v11}, LN2/f;->a(LJ5/h;Z)Z

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    if-eqz v6, :cond_f

    .line 331
    .line 332
    iget v6, v14, LN2/f;->d:I

    .line 333
    .line 334
    iget v7, v14, LN2/f;->e:I

    .line 335
    .line 336
    add-int/2addr v6, v7

    .line 337
    :try_start_0
    invoke-virtual {v1, v6}, LJ5/h;->j(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    .line 339
    .line 340
    iget-wide v2, v14, LN2/f;->b:J

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :catch_0
    :cond_f
    iput-wide v2, v0, LN2/b;->e:J

    .line 344
    .line 345
    const/4 v1, 0x4

    .line 346
    iput v1, v0, LN2/b;->d:I

    .line 347
    .line 348
    iget-wide v1, v0, LN2/b;->f:J

    .line 349
    .line 350
    return-wide v1

    .line 351
    :cond_10
    new-instance v1, Ljava/io/EOFException;

    .line 352
    .line 353
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 354
    .line 355
    .line 356
    throw v1
.end method

.method public f(Ls2/j;)J
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, LN2/b;->d:I

    .line 6
    .line 7
    const-wide/16 v5, -0x1

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    iget-wide v8, v0, LN2/b;->c:J

    .line 11
    .line 12
    iget-object v10, v0, LN2/b;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v10, LN2/f;

    .line 15
    .line 16
    const/4 v11, 0x1

    .line 17
    const/4 v12, 0x4

    .line 18
    if-eqz v2, :cond_d

    .line 19
    .line 20
    if-eq v2, v11, :cond_c

    .line 21
    .line 22
    const/4 v8, 0x2

    .line 23
    const/4 v9, 0x3

    .line 24
    if-eq v2, v8, :cond_2

    .line 25
    .line 26
    if-eq v2, v9, :cond_1

    .line 27
    .line 28
    if-ne v2, v12, :cond_0

    .line 29
    .line 30
    return-wide v5

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    move-wide/from16 v26, v5

    .line 38
    .line 39
    move-object v14, v10

    .line 40
    const-wide/16 v15, 0x2

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_2
    const-wide/16 v15, 0x2

    .line 45
    .line 46
    iget-wide v13, v0, LN2/b;->h:J

    .line 47
    .line 48
    const-wide/16 v17, 0x0

    .line 49
    .line 50
    iget-wide v3, v0, LN2/b;->i:J

    .line 51
    .line 52
    cmp-long v2, v13, v3

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    :goto_0
    move-wide v2, v5

    .line 57
    move-wide/from16 v26, v2

    .line 58
    .line 59
    :goto_1
    move-object v14, v10

    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_3
    iget-wide v13, v1, Ls2/j;->d:J

    .line 63
    .line 64
    invoke-virtual {v10, v1, v3, v4}, LN2/f;->d(Ls2/j;J)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    iget-wide v2, v0, LN2/b;->h:J

    .line 71
    .line 72
    cmp-long v4, v2, v13

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    move-wide/from16 v26, v5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    new-instance v1, Ljava/io/IOException;

    .line 80
    .line 81
    const-string v2, "No ogg page can be found."

    .line 82
    .line 83
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_5
    invoke-virtual {v10, v1, v7}, LN2/f;->b(Ls2/j;Z)Z

    .line 88
    .line 89
    .line 90
    iput v7, v1, Ls2/j;->f:I

    .line 91
    .line 92
    iget-wide v2, v0, LN2/b;->g:J

    .line 93
    .line 94
    iget-wide v7, v10, LN2/f;->b:J

    .line 95
    .line 96
    sub-long/2addr v2, v7

    .line 97
    iget v11, v10, LN2/f;->d:I

    .line 98
    .line 99
    iget v4, v10, LN2/f;->e:I

    .line 100
    .line 101
    add-int/2addr v11, v4

    .line 102
    cmp-long v4, v17, v2

    .line 103
    .line 104
    if-gtz v4, :cond_6

    .line 105
    .line 106
    const-wide/32 v19, 0x11940

    .line 107
    .line 108
    .line 109
    cmp-long v4, v2, v19

    .line 110
    .line 111
    if-gez v4, :cond_6

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    cmp-long v4, v2, v17

    .line 115
    .line 116
    if-gez v4, :cond_7

    .line 117
    .line 118
    iput-wide v13, v0, LN2/b;->i:J

    .line 119
    .line 120
    iput-wide v7, v0, LN2/b;->k:J

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    iget-wide v13, v1, Ls2/j;->d:J

    .line 124
    .line 125
    move-wide/from16 v17, v13

    .line 126
    .line 127
    int-to-long v12, v11

    .line 128
    add-long v12, v17, v12

    .line 129
    .line 130
    iput-wide v12, v0, LN2/b;->h:J

    .line 131
    .line 132
    iput-wide v7, v0, LN2/b;->j:J

    .line 133
    .line 134
    :goto_2
    iget-wide v7, v0, LN2/b;->i:J

    .line 135
    .line 136
    iget-wide v12, v0, LN2/b;->h:J

    .line 137
    .line 138
    sub-long v17, v7, v12

    .line 139
    .line 140
    const-wide/32 v20, 0x186a0

    .line 141
    .line 142
    .line 143
    cmp-long v14, v17, v20

    .line 144
    .line 145
    if-gez v14, :cond_8

    .line 146
    .line 147
    iput-wide v12, v0, LN2/b;->i:J

    .line 148
    .line 149
    move-wide/from16 v26, v5

    .line 150
    .line 151
    move-object v14, v10

    .line 152
    move-wide v2, v12

    .line 153
    goto :goto_4

    .line 154
    :cond_8
    move-wide/from16 v26, v5

    .line 155
    .line 156
    int-to-long v5, v11

    .line 157
    const-wide/16 v17, 0x1

    .line 158
    .line 159
    if-gtz v4, :cond_9

    .line 160
    .line 161
    move-wide/from16 v20, v15

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    move-wide/from16 v20, v17

    .line 165
    .line 166
    :goto_3
    mul-long v5, v5, v20

    .line 167
    .line 168
    move-object v14, v10

    .line 169
    iget-wide v9, v1, Ls2/j;->d:J

    .line 170
    .line 171
    sub-long/2addr v9, v5

    .line 172
    sub-long v5, v7, v12

    .line 173
    .line 174
    mul-long/2addr v5, v2

    .line 175
    iget-wide v2, v0, LN2/b;->k:J

    .line 176
    .line 177
    move-wide/from16 v20, v5

    .line 178
    .line 179
    iget-wide v4, v0, LN2/b;->j:J

    .line 180
    .line 181
    sub-long/2addr v2, v4

    .line 182
    div-long v5, v20, v2

    .line 183
    .line 184
    add-long v20, v5, v9

    .line 185
    .line 186
    sub-long v24, v7, v17

    .line 187
    .line 188
    move-wide/from16 v22, v12

    .line 189
    .line 190
    invoke-static/range {v20 .. v25}, LQ1/x;->j(JJJ)J

    .line 191
    .line 192
    .line 193
    move-result-wide v2

    .line 194
    :goto_4
    cmp-long v4, v2, v26

    .line 195
    .line 196
    if-eqz v4, :cond_a

    .line 197
    .line 198
    return-wide v2

    .line 199
    :cond_a
    const/4 v4, 0x3

    .line 200
    iput v4, v0, LN2/b;->d:I

    .line 201
    .line 202
    :goto_5
    move-wide/from16 v2, v26

    .line 203
    .line 204
    :goto_6
    invoke-virtual {v14, v1, v2, v3}, LN2/f;->d(Ls2/j;J)Z

    .line 205
    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    invoke-virtual {v14, v1, v4}, LN2/f;->b(Ls2/j;Z)Z

    .line 209
    .line 210
    .line 211
    iget-wide v2, v14, LN2/f;->b:J

    .line 212
    .line 213
    iget-wide v5, v0, LN2/b;->g:J

    .line 214
    .line 215
    cmp-long v2, v2, v5

    .line 216
    .line 217
    if-lez v2, :cond_b

    .line 218
    .line 219
    iput v4, v1, Ls2/j;->f:I

    .line 220
    .line 221
    const/4 v1, 0x4

    .line 222
    iput v1, v0, LN2/b;->d:I

    .line 223
    .line 224
    iget-wide v1, v0, LN2/b;->j:J

    .line 225
    .line 226
    add-long/2addr v1, v15

    .line 227
    neg-long v1, v1

    .line 228
    return-wide v1

    .line 229
    :cond_b
    iget v2, v14, LN2/f;->d:I

    .line 230
    .line 231
    iget v3, v14, LN2/f;->e:I

    .line 232
    .line 233
    add-int/2addr v2, v3

    .line 234
    invoke-virtual {v1, v2}, Ls2/j;->j(I)V

    .line 235
    .line 236
    .line 237
    iget-wide v2, v1, Ls2/j;->d:J

    .line 238
    .line 239
    iput-wide v2, v0, LN2/b;->h:J

    .line 240
    .line 241
    iget-wide v2, v14, LN2/f;->b:J

    .line 242
    .line 243
    iput-wide v2, v0, LN2/b;->j:J

    .line 244
    .line 245
    const-wide/16 v2, -0x1

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_c
    move-object v14, v10

    .line 249
    const-wide/16 v17, 0x0

    .line 250
    .line 251
    move v4, v7

    .line 252
    goto :goto_7

    .line 253
    :cond_d
    move-object v14, v10

    .line 254
    const-wide/16 v17, 0x0

    .line 255
    .line 256
    iget-wide v2, v1, Ls2/j;->d:J

    .line 257
    .line 258
    iput-wide v2, v0, LN2/b;->f:J

    .line 259
    .line 260
    iput v11, v0, LN2/b;->d:I

    .line 261
    .line 262
    const-wide/32 v5, 0xff1b

    .line 263
    .line 264
    .line 265
    sub-long v5, v8, v5

    .line 266
    .line 267
    cmp-long v2, v5, v2

    .line 268
    .line 269
    if-lez v2, :cond_e

    .line 270
    .line 271
    return-wide v5

    .line 272
    :cond_e
    const/4 v4, 0x0

    .line 273
    :goto_7
    iput v4, v14, LN2/f;->a:I

    .line 274
    .line 275
    move-wide/from16 v2, v17

    .line 276
    .line 277
    iput-wide v2, v14, LN2/f;->b:J

    .line 278
    .line 279
    iput v4, v14, LN2/f;->c:I

    .line 280
    .line 281
    iput v4, v14, LN2/f;->d:I

    .line 282
    .line 283
    iput v4, v14, LN2/f;->e:I

    .line 284
    .line 285
    const-wide/16 v2, -0x1

    .line 286
    .line 287
    invoke-virtual {v14, v1, v2, v3}, LN2/f;->d(Ls2/j;J)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-eqz v5, :cond_10

    .line 292
    .line 293
    invoke-virtual {v14, v1, v4}, LN2/f;->b(Ls2/j;Z)Z

    .line 294
    .line 295
    .line 296
    iget v2, v14, LN2/f;->d:I

    .line 297
    .line 298
    iget v3, v14, LN2/f;->e:I

    .line 299
    .line 300
    add-int/2addr v2, v3

    .line 301
    invoke-virtual {v1, v2}, Ls2/j;->j(I)V

    .line 302
    .line 303
    .line 304
    iget-wide v2, v14, LN2/f;->b:J

    .line 305
    .line 306
    :goto_8
    iget v4, v14, LN2/f;->a:I

    .line 307
    .line 308
    const/4 v5, 0x4

    .line 309
    and-int/2addr v4, v5

    .line 310
    if-eq v4, v5, :cond_f

    .line 311
    .line 312
    const-wide/16 v4, -0x1

    .line 313
    .line 314
    invoke-virtual {v14, v1, v4, v5}, LN2/f;->d(Ls2/j;J)Z

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    if-eqz v6, :cond_f

    .line 319
    .line 320
    iget-wide v6, v1, Ls2/j;->d:J

    .line 321
    .line 322
    cmp-long v6, v6, v8

    .line 323
    .line 324
    if-gez v6, :cond_f

    .line 325
    .line 326
    invoke-virtual {v14, v1, v11}, LN2/f;->b(Ls2/j;Z)Z

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    if-eqz v6, :cond_f

    .line 331
    .line 332
    iget v6, v14, LN2/f;->d:I

    .line 333
    .line 334
    iget v7, v14, LN2/f;->e:I

    .line 335
    .line 336
    add-int/2addr v6, v7

    .line 337
    :try_start_0
    invoke-virtual {v1, v6}, Ls2/j;->j(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    .line 339
    .line 340
    iget-wide v2, v14, LN2/f;->b:J

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :catch_0
    :cond_f
    iput-wide v2, v0, LN2/b;->e:J

    .line 344
    .line 345
    const/4 v1, 0x4

    .line 346
    iput v1, v0, LN2/b;->d:I

    .line 347
    .line 348
    iget-wide v1, v0, LN2/b;->f:J

    .line 349
    .line 350
    return-wide v1

    .line 351
    :cond_10
    new-instance v1, Ljava/io/EOFException;

    .line 352
    .line 353
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 354
    .line 355
    .line 356
    throw v1
.end method
