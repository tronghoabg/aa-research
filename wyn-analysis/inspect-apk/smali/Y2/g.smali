.class public final LY2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY2/h;


# instance fields
.field public final a:LQ1/o;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public e:Ljava/lang/String;

.field public f:Ls2/C;

.field public g:I

.field public h:I

.field public i:I

.field public j:J

.field public k:LN1/n;

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:J


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LQ1/o;

    .line 5
    .line 6
    new-array p3, p3, [B

    .line 7
    .line 8
    invoke-direct {v0, p3}, LQ1/o;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LY2/g;->a:LQ1/o;

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    iput p3, p0, LY2/g;->g:I

    .line 15
    .line 16
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, LY2/g;->p:J

    .line 22
    .line 23
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, LY2/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    const/4 p3, -0x1

    .line 31
    iput p3, p0, LY2/g;->n:I

    .line 32
    .line 33
    iput p3, p0, LY2/g;->o:I

    .line 34
    .line 35
    iput-object p1, p0, LY2/g;->c:Ljava/lang/String;

    .line 36
    .line 37
    iput p2, p0, LY2/g;->d:I

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LY2/g;->g:I

    .line 3
    .line 4
    iput v0, p0, LY2/g;->h:I

    .line 5
    .line 6
    iput v0, p0, LY2/g;->i:I

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, LY2/g;->p:J

    .line 14
    .line 15
    iget-object v1, p0, LY2/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final b(LQ1/o;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, LQ1/o;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, LY2/g;->h:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, LY2/g;->h:I

    .line 14
    .line 15
    invoke-virtual {p1, v1, v0, p2}, LQ1/o;->f(II[B)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, LY2/g;->h:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, LY2/g;->h:I

    .line 22
    .line 23
    if-ne p1, p3, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final c(LG5/a;)V
    .locals 4

    .line 1
    const v0, -0x7fffffff

    .line 2
    .line 3
    .line 4
    iget v1, p1, LG5/a;->a:I

    .line 5
    .line 6
    if-eq v1, v0, :cond_3

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iget v2, p1, LG5/a;->b:I

    .line 10
    .line 11
    if-ne v2, v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v0, p0, LY2/g;->k:LN1/n;

    .line 15
    .line 16
    iget-object p1, p1, LG5/a;->c:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget v3, v0, LN1/n;->C:I

    .line 21
    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    iget v3, v0, LN1/n;->D:I

    .line 25
    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, LN1/n;->n:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, LY2/g;->k:LN1/n;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    new-instance v0, LN1/m;

    .line 41
    .line 42
    invoke-direct {v0}, LN1/m;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v0}, LN1/n;->a()LN1/m;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_0
    iget-object v3, p0, LY2/g;->e:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v3, v0, LN1/m;->a:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, v0, LN1/m;->m:Ljava/lang/String;

    .line 59
    .line 60
    iput v2, v0, LN1/m;->B:I

    .line 61
    .line 62
    iput v1, v0, LN1/m;->C:I

    .line 63
    .line 64
    iget-object p1, p0, LY2/g;->c:Ljava/lang/String;

    .line 65
    .line 66
    iput-object p1, v0, LN1/m;->d:Ljava/lang/String;

    .line 67
    .line 68
    iget p1, p0, LY2/g;->d:I

    .line 69
    .line 70
    iput p1, v0, LN1/m;->f:I

    .line 71
    .line 72
    new-instance p1, LN1/n;

    .line 73
    .line 74
    invoke-direct {p1, v0}, LN1/n;-><init>(LN1/m;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, LY2/g;->k:LN1/n;

    .line 78
    .line 79
    iget-object v0, p0, LY2/g;->f:Ls2/C;

    .line 80
    .line 81
    invoke-interface {v0, p1}, Ls2/C;->c(LN1/n;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_1
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, LY2/g;->p:J

    .line 2
    .line 3
    return-void
.end method

.method public final e(LQ1/o;)V
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v8, 0x1

    .line 7
    iget-object v9, v0, LY2/g;->f:Ls2/C;

    .line 8
    .line 9
    invoke-static {v9}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    if-lez v9, :cond_40

    .line 17
    .line 18
    iget v9, v0, LY2/g;->g:I

    .line 19
    .line 20
    const/16 v16, 0x7d00

    .line 21
    .line 22
    const v17, 0xac44

    .line 23
    .line 24
    .line 25
    const v18, 0xbb80

    .line 26
    .line 27
    .line 28
    const/16 v19, 0x10

    .line 29
    .line 30
    const v12, 0x40411bf2

    .line 31
    .line 32
    .line 33
    const/4 v13, 0x5

    .line 34
    const/16 v21, -0x1

    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const/4 v11, 0x2

    .line 44
    const/16 v27, 0xc

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    const/16 v28, 0x8

    .line 48
    .line 49
    iget-object v5, v0, LY2/g;->a:LQ1/o;

    .line 50
    .line 51
    packed-switch v9, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :pswitch_0
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    iget v4, v0, LY2/g;->l:I

    .line 65
    .line 66
    iget v5, v0, LY2/g;->h:I

    .line 67
    .line 68
    sub-int/2addr v4, v5

    .line 69
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iget-object v4, v0, LY2/g;->f:Ls2/C;

    .line 74
    .line 75
    invoke-interface {v4, v2, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 76
    .line 77
    .line 78
    iget v4, v0, LY2/g;->h:I

    .line 79
    .line 80
    add-int/2addr v4, v2

    .line 81
    iput v4, v0, LY2/g;->h:I

    .line 82
    .line 83
    iget v2, v0, LY2/g;->l:I

    .line 84
    .line 85
    if-ne v4, v2, :cond_0

    .line 86
    .line 87
    iget-wide v4, v0, LY2/g;->p:J

    .line 88
    .line 89
    cmp-long v2, v4, v22

    .line 90
    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    move v2, v8

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move v2, v7

    .line 96
    :goto_1
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 97
    .line 98
    .line 99
    iget-object v9, v0, LY2/g;->f:Ls2/C;

    .line 100
    .line 101
    iget-wide v10, v0, LY2/g;->p:J

    .line 102
    .line 103
    iget v2, v0, LY2/g;->m:I

    .line 104
    .line 105
    if-ne v2, v3, :cond_2

    .line 106
    .line 107
    move v12, v7

    .line 108
    goto :goto_2

    .line 109
    :cond_2
    move v12, v8

    .line 110
    :goto_2
    iget v13, v0, LY2/g;->l:I

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const/4 v15, 0x0

    .line 114
    invoke-interface/range {v9 .. v15}, Ls2/C;->a(JIIILs2/B;)V

    .line 115
    .line 116
    .line 117
    iget-wide v4, v0, LY2/g;->p:J

    .line 118
    .line 119
    iget-wide v9, v0, LY2/g;->j:J

    .line 120
    .line 121
    add-long/2addr v4, v9

    .line 122
    iput-wide v4, v0, LY2/g;->p:J

    .line 123
    .line 124
    iput v7, v0, LY2/g;->g:I

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_1
    iget-object v9, v5, LQ1/o;->a:[B

    .line 128
    .line 129
    iget v13, v0, LY2/g;->o:I

    .line 130
    .line 131
    invoke-virtual {v0, v1, v9, v13}, LY2/g;->b(LQ1/o;[BI)Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eqz v9, :cond_0

    .line 136
    .line 137
    iget-object v9, v5, LQ1/o;->a:[B

    .line 138
    .line 139
    iget-object v13, v0, LY2/g;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 140
    .line 141
    move/from16 v29, v3

    .line 142
    .line 143
    invoke-static {v9}, Ls2/a;->k([B)LJ5/y;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v3, v4}, LJ5/y;->i(I)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-ne v4, v12, :cond_3

    .line 152
    .line 153
    move v4, v8

    .line 154
    goto :goto_3

    .line 155
    :cond_3
    move v4, v7

    .line 156
    :goto_3
    sget-object v12, Ls2/a;->n:[I

    .line 157
    .line 158
    invoke-static {v3, v12}, Ls2/a;->t(LJ5/y;[I)I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    add-int/lit8 v24, v12, 0x1

    .line 163
    .line 164
    if-eqz v4, :cond_e

    .line 165
    .line 166
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 167
    .line 168
    .line 169
    move-result v20

    .line 170
    if-eqz v20, :cond_d

    .line 171
    .line 172
    add-int/lit8 v6, v12, -0x1

    .line 173
    .line 174
    aget-byte v20, v9, v6

    .line 175
    .line 176
    shl-int/lit8 v20, v20, 0x8

    .line 177
    .line 178
    const v25, 0xffff

    .line 179
    .line 180
    .line 181
    and-int v20, v20, v25

    .line 182
    .line 183
    aget-byte v12, v9, v12

    .line 184
    .line 185
    and-int/lit16 v12, v12, 0xff

    .line 186
    .line 187
    or-int v12, v20, v12

    .line 188
    .line 189
    sget v20, LQ1/x;->a:I

    .line 190
    .line 191
    move v10, v7

    .line 192
    move/from16 v7, v25

    .line 193
    .line 194
    :goto_4
    if-ge v10, v6, :cond_4

    .line 195
    .line 196
    aget-byte v15, v9, v10

    .line 197
    .line 198
    and-int/lit16 v2, v15, 0xff

    .line 199
    .line 200
    shr-int/lit8 v2, v2, 0x4

    .line 201
    .line 202
    shr-int/lit8 v14, v7, 0xc

    .line 203
    .line 204
    and-int/lit16 v14, v14, 0xff

    .line 205
    .line 206
    xor-int/2addr v2, v14

    .line 207
    and-int/lit16 v2, v2, 0xff

    .line 208
    .line 209
    shl-int/lit8 v7, v7, 0x4

    .line 210
    .line 211
    and-int v7, v7, v25

    .line 212
    .line 213
    sget-object v14, LQ1/x;->o:[I

    .line 214
    .line 215
    aget v2, v14, v2

    .line 216
    .line 217
    xor-int/2addr v2, v7

    .line 218
    and-int v2, v2, v25

    .line 219
    .line 220
    and-int/lit8 v7, v15, 0xf

    .line 221
    .line 222
    shr-int/lit8 v15, v2, 0xc

    .line 223
    .line 224
    and-int/lit16 v15, v15, 0xff

    .line 225
    .line 226
    xor-int/2addr v7, v15

    .line 227
    and-int/lit16 v7, v7, 0xff

    .line 228
    .line 229
    shl-int/lit8 v2, v2, 0x4

    .line 230
    .line 231
    and-int v2, v2, v25

    .line 232
    .line 233
    aget v7, v14, v7

    .line 234
    .line 235
    xor-int/2addr v2, v7

    .line 236
    and-int v7, v2, v25

    .line 237
    .line 238
    add-int/2addr v10, v8

    .line 239
    goto :goto_4

    .line 240
    :cond_4
    if-ne v12, v7, :cond_c

    .line 241
    .line 242
    invoke-virtual {v3, v11}, LJ5/y;->i(I)I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_7

    .line 247
    .line 248
    if-eq v2, v8, :cond_6

    .line 249
    .line 250
    if-ne v2, v11, :cond_5

    .line 251
    .line 252
    const/16 v6, 0x180

    .line 253
    .line 254
    :goto_5
    const/4 v2, 0x3

    .line 255
    goto :goto_6

    .line 256
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    const-string v3, "Unsupported base duration index in DTS UHD header: "

    .line 259
    .line 260
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    const/4 v2, 0x0

    .line 271
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    throw v1

    .line 276
    :cond_6
    const/16 v6, 0x1e0

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_7
    const/4 v2, 0x3

    .line 280
    const/16 v6, 0x200

    .line 281
    .line 282
    :goto_6
    invoke-virtual {v3, v2}, LJ5/y;->i(I)I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    add-int/2addr v7, v8

    .line 287
    mul-int/2addr v7, v6

    .line 288
    invoke-virtual {v3, v11}, LJ5/y;->i(I)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_a

    .line 293
    .line 294
    if-eq v2, v8, :cond_9

    .line 295
    .line 296
    if-ne v2, v11, :cond_8

    .line 297
    .line 298
    move/from16 v2, v18

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    const-string v3, "Unsupported clock rate index in DTS UHD header: "

    .line 304
    .line 305
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    const/4 v2, 0x0

    .line 316
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    throw v1

    .line 321
    :cond_9
    move/from16 v2, v17

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_a
    move/from16 v2, v16

    .line 325
    .line 326
    :goto_7
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    if-eqz v6, :cond_b

    .line 331
    .line 332
    const/16 v6, 0x24

    .line 333
    .line 334
    invoke-virtual {v3, v6}, LJ5/y;->t(I)V

    .line 335
    .line 336
    .line 337
    :cond_b
    invoke-virtual {v3, v11}, LJ5/y;->i(I)I

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    shl-int v6, v8, v6

    .line 342
    .line 343
    mul-int v14, v2, v6

    .line 344
    .line 345
    int-to-long v6, v7

    .line 346
    int-to-long v9, v2

    .line 347
    sget-object v39, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 348
    .line 349
    const-wide/32 v35, 0xf4240

    .line 350
    .line 351
    .line 352
    move-wide/from16 v33, v6

    .line 353
    .line 354
    move-wide/from16 v37, v9

    .line 355
    .line 356
    invoke-static/range {v33 .. v39}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 357
    .line 358
    .line 359
    move-result-wide v6

    .line 360
    move v12, v14

    .line 361
    move-wide v14, v6

    .line 362
    goto :goto_8

    .line 363
    :cond_c
    const-string v1, "CRC check failed"

    .line 364
    .line 365
    const/4 v2, 0x0

    .line 366
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    throw v1

    .line 371
    :cond_d
    const-string v1, "Only supports full channel mask-based audio presentation"

    .line 372
    .line 373
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    throw v1

    .line 378
    :cond_e
    move-wide/from16 v14, v22

    .line 379
    .line 380
    const v12, -0x7fffffff

    .line 381
    .line 382
    .line 383
    :goto_8
    const/4 v2, 0x0

    .line 384
    const/4 v6, 0x0

    .line 385
    :goto_9
    if-ge v2, v4, :cond_f

    .line 386
    .line 387
    sget-object v7, Ls2/a;->o:[I

    .line 388
    .line 389
    invoke-static {v3, v7}, Ls2/a;->t(LJ5/y;[I)I

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    add-int/2addr v6, v7

    .line 394
    add-int/2addr v2, v8

    .line 395
    goto :goto_9

    .line 396
    :cond_f
    if-eqz v4, :cond_10

    .line 397
    .line 398
    sget-object v2, Ls2/a;->p:[I

    .line 399
    .line 400
    invoke-static {v3, v2}, Ls2/a;->t(LJ5/y;[I)I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-virtual {v13, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 405
    .line 406
    .line 407
    :cond_10
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-eqz v2, :cond_11

    .line 412
    .line 413
    sget-object v2, Ls2/a;->q:[I

    .line 414
    .line 415
    invoke-static {v3, v2}, Ls2/a;->t(LJ5/y;[I)I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    goto :goto_a

    .line 420
    :cond_11
    const/4 v2, 0x0

    .line 421
    :goto_a
    add-int/2addr v6, v2

    .line 422
    add-int v13, v6, v24

    .line 423
    .line 424
    new-instance v9, LG5/a;

    .line 425
    .line 426
    const-string v10, "audio/vnd.dts.uhd;profile=p2"

    .line 427
    .line 428
    const/4 v11, 0x2

    .line 429
    invoke-direct/range {v9 .. v15}, LG5/a;-><init>(Ljava/lang/String;IIIJ)V

    .line 430
    .line 431
    .line 432
    iget v2, v0, LY2/g;->m:I

    .line 433
    .line 434
    const/4 v3, 0x3

    .line 435
    if-ne v2, v3, :cond_12

    .line 436
    .line 437
    invoke-virtual {v0, v9}, LY2/g;->c(LG5/a;)V

    .line 438
    .line 439
    .line 440
    :cond_12
    iput v13, v0, LY2/g;->l:I

    .line 441
    .line 442
    cmp-long v2, v14, v22

    .line 443
    .line 444
    if-nez v2, :cond_13

    .line 445
    .line 446
    const-wide/16 v12, 0x0

    .line 447
    .line 448
    goto :goto_b

    .line 449
    :cond_13
    move-wide v12, v14

    .line 450
    :goto_b
    iput-wide v12, v0, LY2/g;->j:J

    .line 451
    .line 452
    const/4 v2, 0x0

    .line 453
    invoke-virtual {v5, v2}, LQ1/o;->G(I)V

    .line 454
    .line 455
    .line 456
    iget-object v2, v0, LY2/g;->f:Ls2/C;

    .line 457
    .line 458
    iget v3, v0, LY2/g;->o:I

    .line 459
    .line 460
    invoke-interface {v2, v3, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 461
    .line 462
    .line 463
    const/4 v2, 0x6

    .line 464
    iput v2, v0, LY2/g;->g:I

    .line 465
    .line 466
    :cond_14
    :goto_c
    move/from16 v3, v29

    .line 467
    .line 468
    goto/16 :goto_0

    .line 469
    .line 470
    :pswitch_2
    move/from16 v29, v3

    .line 471
    .line 472
    const/4 v2, 0x6

    .line 473
    iget-object v3, v5, LQ1/o;->a:[B

    .line 474
    .line 475
    invoke-virtual {v0, v1, v3, v2}, LY2/g;->b(LQ1/o;[BI)Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_14

    .line 480
    .line 481
    iget-object v2, v5, LQ1/o;->a:[B

    .line 482
    .line 483
    invoke-static {v2}, Ls2/a;->k([B)LJ5/y;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-virtual {v2, v4}, LJ5/y;->t(I)V

    .line 488
    .line 489
    .line 490
    sget-object v3, Ls2/a;->r:[I

    .line 491
    .line 492
    invoke-static {v2, v3}, Ls2/a;->t(LJ5/y;[I)I

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    add-int/2addr v2, v8

    .line 497
    iput v2, v0, LY2/g;->o:I

    .line 498
    .line 499
    iget v3, v0, LY2/g;->h:I

    .line 500
    .line 501
    if-le v3, v2, :cond_15

    .line 502
    .line 503
    sub-int v2, v3, v2

    .line 504
    .line 505
    sub-int/2addr v3, v2

    .line 506
    iput v3, v0, LY2/g;->h:I

    .line 507
    .line 508
    iget v3, v1, LQ1/o;->b:I

    .line 509
    .line 510
    sub-int/2addr v3, v2

    .line 511
    invoke-virtual {v1, v3}, LQ1/o;->G(I)V

    .line 512
    .line 513
    .line 514
    :cond_15
    iput v13, v0, LY2/g;->g:I

    .line 515
    .line 516
    goto :goto_c

    .line 517
    :pswitch_3
    move/from16 v29, v3

    .line 518
    .line 519
    iget-object v2, v5, LQ1/o;->a:[B

    .line 520
    .line 521
    iget v3, v0, LY2/g;->n:I

    .line 522
    .line 523
    invoke-virtual {v0, v1, v2, v3}, LY2/g;->b(LQ1/o;[BI)Z

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    if-eqz v2, :cond_26

    .line 528
    .line 529
    iget-object v2, v5, LQ1/o;->a:[B

    .line 530
    .line 531
    invoke-static {v2}, Ls2/a;->k([B)LJ5/y;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/16 v3, 0x28

    .line 536
    .line 537
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    if-nez v4, :cond_16

    .line 549
    .line 550
    move/from16 v4, v19

    .line 551
    .line 552
    move/from16 v6, v28

    .line 553
    .line 554
    goto :goto_d

    .line 555
    :cond_16
    const/16 v4, 0x14

    .line 556
    .line 557
    move/from16 v6, v27

    .line 558
    .line 559
    :goto_d
    invoke-virtual {v2, v6}, LJ5/y;->t(I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v4}, LJ5/y;->i(I)I

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    add-int/lit8 v38, v6, 0x1

    .line 567
    .line 568
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 569
    .line 570
    .line 571
    move-result v6

    .line 572
    if-eqz v6, :cond_1b

    .line 573
    .line 574
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    const/4 v9, 0x3

    .line 579
    invoke-virtual {v2, v9}, LJ5/y;->i(I)I

    .line 580
    .line 581
    .line 582
    move-result v10

    .line 583
    add-int/2addr v10, v8

    .line 584
    const/16 v12, 0x200

    .line 585
    .line 586
    mul-int/2addr v10, v12

    .line 587
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 588
    .line 589
    .line 590
    move-result v12

    .line 591
    if-eqz v12, :cond_17

    .line 592
    .line 593
    const/16 v12, 0x24

    .line 594
    .line 595
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 596
    .line 597
    .line 598
    :cond_17
    invoke-virtual {v2, v9}, LJ5/y;->i(I)I

    .line 599
    .line 600
    .line 601
    move-result v12

    .line 602
    add-int/2addr v12, v8

    .line 603
    invoke-virtual {v2, v9}, LJ5/y;->i(I)I

    .line 604
    .line 605
    .line 606
    move-result v9

    .line 607
    add-int/2addr v9, v8

    .line 608
    if-ne v12, v8, :cond_1a

    .line 609
    .line 610
    if-ne v9, v8, :cond_1a

    .line 611
    .line 612
    add-int/2addr v3, v8

    .line 613
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    .line 614
    .line 615
    .line 616
    move-result v9

    .line 617
    const/4 v12, 0x0

    .line 618
    :goto_e
    if-ge v12, v3, :cond_19

    .line 619
    .line 620
    shr-int v14, v9, v12

    .line 621
    .line 622
    and-int/2addr v14, v8

    .line 623
    if-ne v14, v8, :cond_18

    .line 624
    .line 625
    move/from16 v14, v28

    .line 626
    .line 627
    invoke-virtual {v2, v14}, LJ5/y;->t(I)V

    .line 628
    .line 629
    .line 630
    :cond_18
    add-int/2addr v12, v8

    .line 631
    const/16 v28, 0x8

    .line 632
    .line 633
    goto :goto_e

    .line 634
    :cond_19
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    if-eqz v3, :cond_1c

    .line 639
    .line 640
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    .line 644
    .line 645
    .line 646
    move-result v3

    .line 647
    add-int/2addr v3, v8

    .line 648
    shl-int/2addr v3, v11

    .line 649
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    .line 650
    .line 651
    .line 652
    move-result v9

    .line 653
    add-int/2addr v9, v8

    .line 654
    const/4 v12, 0x0

    .line 655
    :goto_f
    if-ge v12, v9, :cond_1c

    .line 656
    .line 657
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 658
    .line 659
    .line 660
    add-int/2addr v12, v8

    .line 661
    goto :goto_f

    .line 662
    :cond_1a
    const-string v1, "Multiple audio presentations or assets not supported"

    .line 663
    .line 664
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    throw v1

    .line 669
    :cond_1b
    move/from16 v7, v21

    .line 670
    .line 671
    const/4 v10, 0x0

    .line 672
    :cond_1c
    invoke-virtual {v2, v4}, LJ5/y;->t(I)V

    .line 673
    .line 674
    .line 675
    move/from16 v3, v27

    .line 676
    .line 677
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 678
    .line 679
    .line 680
    if-eqz v6, :cond_20

    .line 681
    .line 682
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    if-eqz v3, :cond_1d

    .line 687
    .line 688
    move/from16 v3, v29

    .line 689
    .line 690
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 691
    .line 692
    .line 693
    :cond_1d
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    if-eqz v3, :cond_1e

    .line 698
    .line 699
    const/16 v3, 0x18

    .line 700
    .line 701
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 702
    .line 703
    .line 704
    :cond_1e
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    if-eqz v3, :cond_1f

    .line 709
    .line 710
    const/16 v3, 0xa

    .line 711
    .line 712
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    add-int/2addr v3, v8

    .line 717
    invoke-virtual {v2, v3}, LJ5/y;->u(I)V

    .line 718
    .line 719
    .line 720
    :cond_1f
    invoke-virtual {v2, v13}, LJ5/y;->t(I)V

    .line 721
    .line 722
    .line 723
    sget-object v3, Ls2/a;->m:[I

    .line 724
    .line 725
    const/4 v4, 0x4

    .line 726
    invoke-virtual {v2, v4}, LJ5/y;->i(I)I

    .line 727
    .line 728
    .line 729
    move-result v9

    .line 730
    aget v14, v3, v9

    .line 731
    .line 732
    const/16 v3, 0x8

    .line 733
    .line 734
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    add-int/2addr v2, v8

    .line 739
    move/from16 v36, v2

    .line 740
    .line 741
    move/from16 v37, v14

    .line 742
    .line 743
    goto :goto_10

    .line 744
    :cond_20
    move/from16 v36, v21

    .line 745
    .line 746
    const v37, -0x7fffffff

    .line 747
    .line 748
    .line 749
    :goto_10
    if-eqz v6, :cond_24

    .line 750
    .line 751
    if-eqz v7, :cond_23

    .line 752
    .line 753
    if-eq v7, v8, :cond_22

    .line 754
    .line 755
    if-ne v7, v11, :cond_21

    .line 756
    .line 757
    move/from16 v2, v18

    .line 758
    .line 759
    goto :goto_11

    .line 760
    :cond_21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 761
    .line 762
    const-string v2, "Unsupported reference clock code in DTS HD header: "

    .line 763
    .line 764
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    const/4 v2, 0x0

    .line 775
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    throw v1

    .line 780
    :cond_22
    move/from16 v2, v17

    .line 781
    .line 782
    goto :goto_11

    .line 783
    :cond_23
    move/from16 v2, v16

    .line 784
    .line 785
    :goto_11
    int-to-long v11, v10

    .line 786
    int-to-long v2, v2

    .line 787
    sget v4, LQ1/x;->a:I

    .line 788
    .line 789
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 790
    .line 791
    const-wide/32 v13, 0xf4240

    .line 792
    .line 793
    .line 794
    move-wide v15, v2

    .line 795
    invoke-static/range {v11 .. v17}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 796
    .line 797
    .line 798
    move-result-wide v2

    .line 799
    move-wide/from16 v39, v2

    .line 800
    .line 801
    goto :goto_12

    .line 802
    :cond_24
    move-wide/from16 v39, v22

    .line 803
    .line 804
    :goto_12
    new-instance v34, LG5/a;

    .line 805
    .line 806
    const-string v35, "audio/vnd.dts.hd;profile=lbr"

    .line 807
    .line 808
    invoke-direct/range {v34 .. v40}, LG5/a;-><init>(Ljava/lang/String;IIIJ)V

    .line 809
    .line 810
    .line 811
    move-object/from16 v2, v34

    .line 812
    .line 813
    move/from16 v6, v38

    .line 814
    .line 815
    invoke-virtual {v0, v2}, LY2/g;->c(LG5/a;)V

    .line 816
    .line 817
    .line 818
    iput v6, v0, LY2/g;->l:I

    .line 819
    .line 820
    cmp-long v2, v39, v22

    .line 821
    .line 822
    if-nez v2, :cond_25

    .line 823
    .line 824
    const-wide/16 v12, 0x0

    .line 825
    .line 826
    goto :goto_13

    .line 827
    :cond_25
    move-wide/from16 v12, v39

    .line 828
    .line 829
    :goto_13
    iput-wide v12, v0, LY2/g;->j:J

    .line 830
    .line 831
    const/4 v2, 0x0

    .line 832
    invoke-virtual {v5, v2}, LQ1/o;->G(I)V

    .line 833
    .line 834
    .line 835
    iget-object v2, v0, LY2/g;->f:Ls2/C;

    .line 836
    .line 837
    iget v3, v0, LY2/g;->n:I

    .line 838
    .line 839
    invoke-interface {v2, v3, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 840
    .line 841
    .line 842
    const/4 v2, 0x6

    .line 843
    iput v2, v0, LY2/g;->g:I

    .line 844
    .line 845
    :cond_26
    :goto_14
    const/4 v3, 0x4

    .line 846
    goto/16 :goto_0

    .line 847
    .line 848
    :pswitch_4
    iget-object v2, v5, LQ1/o;->a:[B

    .line 849
    .line 850
    const/4 v3, 0x7

    .line 851
    invoke-virtual {v0, v1, v2, v3}, LY2/g;->b(LQ1/o;[BI)Z

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    if-eqz v2, :cond_26

    .line 856
    .line 857
    iget-object v2, v5, LQ1/o;->a:[B

    .line 858
    .line 859
    invoke-static {v2}, Ls2/a;->k([B)LJ5/y;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    const/16 v3, 0x2a

    .line 864
    .line 865
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    if-eqz v3, :cond_27

    .line 873
    .line 874
    const/16 v3, 0xc

    .line 875
    .line 876
    goto :goto_15

    .line 877
    :cond_27
    const/16 v3, 0x8

    .line 878
    .line 879
    :goto_15
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    .line 880
    .line 881
    .line 882
    move-result v2

    .line 883
    add-int/2addr v2, v8

    .line 884
    iput v2, v0, LY2/g;->n:I

    .line 885
    .line 886
    const/4 v2, 0x3

    .line 887
    iput v2, v0, LY2/g;->g:I

    .line 888
    .line 889
    goto :goto_14

    .line 890
    :pswitch_5
    iget-object v2, v5, LQ1/o;->a:[B

    .line 891
    .line 892
    const/16 v3, 0x12

    .line 893
    .line 894
    invoke-virtual {v0, v1, v2, v3}, LY2/g;->b(LQ1/o;[BI)Z

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    if-eqz v2, :cond_32

    .line 899
    .line 900
    iget-object v2, v5, LQ1/o;->a:[B

    .line 901
    .line 902
    iget-object v6, v0, LY2/g;->k:LN1/n;

    .line 903
    .line 904
    const/16 v7, 0x3c

    .line 905
    .line 906
    if-nez v6, :cond_2a

    .line 907
    .line 908
    iget-object v6, v0, LY2/g;->e:Ljava/lang/String;

    .line 909
    .line 910
    invoke-static {v2}, Ls2/a;->k([B)LJ5/y;

    .line 911
    .line 912
    .line 913
    move-result-object v9

    .line 914
    invoke-virtual {v9, v7}, LJ5/y;->t(I)V

    .line 915
    .line 916
    .line 917
    const/4 v10, 0x6

    .line 918
    invoke-virtual {v9, v10}, LJ5/y;->i(I)I

    .line 919
    .line 920
    .line 921
    move-result v12

    .line 922
    sget-object v10, Ls2/a;->j:[I

    .line 923
    .line 924
    aget v10, v10, v12

    .line 925
    .line 926
    const/4 v12, 0x4

    .line 927
    invoke-virtual {v9, v12}, LJ5/y;->i(I)I

    .line 928
    .line 929
    .line 930
    move-result v14

    .line 931
    sget-object v12, Ls2/a;->k:[I

    .line 932
    .line 933
    aget v12, v12, v14

    .line 934
    .line 935
    invoke-virtual {v9, v13}, LJ5/y;->i(I)I

    .line 936
    .line 937
    .line 938
    move-result v14

    .line 939
    const/16 v15, 0x1d

    .line 940
    .line 941
    if-lt v14, v15, :cond_28

    .line 942
    .line 943
    move/from16 v14, v21

    .line 944
    .line 945
    :goto_16
    const/16 v15, 0xa

    .line 946
    .line 947
    goto :goto_17

    .line 948
    :cond_28
    sget-object v15, Ls2/a;->l:[I

    .line 949
    .line 950
    aget v14, v15, v14

    .line 951
    .line 952
    mul-int/lit16 v14, v14, 0x3e8

    .line 953
    .line 954
    div-int/2addr v14, v11

    .line 955
    goto :goto_16

    .line 956
    :goto_17
    invoke-virtual {v9, v15}, LJ5/y;->t(I)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v9, v11}, LJ5/y;->i(I)I

    .line 960
    .line 961
    .line 962
    move-result v9

    .line 963
    if-lez v9, :cond_29

    .line 964
    .line 965
    move v9, v8

    .line 966
    goto :goto_18

    .line 967
    :cond_29
    const/4 v9, 0x0

    .line 968
    :goto_18
    add-int/2addr v10, v9

    .line 969
    new-instance v9, LN1/m;

    .line 970
    .line 971
    invoke-direct {v9}, LN1/m;-><init>()V

    .line 972
    .line 973
    .line 974
    iput-object v6, v9, LN1/m;->a:Ljava/lang/String;

    .line 975
    .line 976
    const-string v6, "audio/vnd.dts"

    .line 977
    .line 978
    invoke-static {v6}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v6

    .line 982
    iput-object v6, v9, LN1/m;->m:Ljava/lang/String;

    .line 983
    .line 984
    iput v14, v9, LN1/m;->h:I

    .line 985
    .line 986
    iput v10, v9, LN1/m;->B:I

    .line 987
    .line 988
    iput v12, v9, LN1/m;->C:I

    .line 989
    .line 990
    const/4 v6, 0x0

    .line 991
    iput-object v6, v9, LN1/m;->q:LN1/j;

    .line 992
    .line 993
    iget-object v6, v0, LY2/g;->c:Ljava/lang/String;

    .line 994
    .line 995
    iput-object v6, v9, LN1/m;->d:Ljava/lang/String;

    .line 996
    .line 997
    iget v6, v0, LY2/g;->d:I

    .line 998
    .line 999
    iput v6, v9, LN1/m;->f:I

    .line 1000
    .line 1001
    new-instance v6, LN1/n;

    .line 1002
    .line 1003
    invoke-direct {v6, v9}, LN1/n;-><init>(LN1/m;)V

    .line 1004
    .line 1005
    .line 1006
    iput-object v6, v0, LY2/g;->k:LN1/n;

    .line 1007
    .line 1008
    iget-object v9, v0, LY2/g;->f:Ls2/C;

    .line 1009
    .line 1010
    invoke-interface {v9, v6}, Ls2/C;->c(LN1/n;)V

    .line 1011
    .line 1012
    .line 1013
    :cond_2a
    const/16 v31, 0x0

    .line 1014
    .line 1015
    aget-byte v6, v2, v31

    .line 1016
    .line 1017
    const/16 v9, 0x1f

    .line 1018
    .line 1019
    const/4 v10, -0x2

    .line 1020
    if-eq v6, v10, :cond_2d

    .line 1021
    .line 1022
    move/from16 v12, v21

    .line 1023
    .line 1024
    if-eq v6, v12, :cond_2c

    .line 1025
    .line 1026
    if-eq v6, v9, :cond_2b

    .line 1027
    .line 1028
    aget-byte v12, v2, v13

    .line 1029
    .line 1030
    const/16 v32, 0x3

    .line 1031
    .line 1032
    and-int/lit8 v12, v12, 0x3

    .line 1033
    .line 1034
    const/16 v27, 0xc

    .line 1035
    .line 1036
    shl-int/lit8 v12, v12, 0xc

    .line 1037
    .line 1038
    const/16 v30, 0x6

    .line 1039
    .line 1040
    aget-byte v14, v2, v30

    .line 1041
    .line 1042
    and-int/lit16 v14, v14, 0xff

    .line 1043
    .line 1044
    const/16 v29, 0x4

    .line 1045
    .line 1046
    shl-int/lit8 v14, v14, 0x4

    .line 1047
    .line 1048
    or-int/2addr v12, v14

    .line 1049
    const/16 v24, 0x7

    .line 1050
    .line 1051
    aget-byte v14, v2, v24

    .line 1052
    .line 1053
    and-int/lit16 v14, v14, 0xf0

    .line 1054
    .line 1055
    shr-int/lit8 v14, v14, 0x4

    .line 1056
    .line 1057
    or-int/2addr v12, v14

    .line 1058
    add-int/2addr v12, v8

    .line 1059
    const/4 v14, 0x0

    .line 1060
    :goto_19
    const/16 v27, 0xc

    .line 1061
    .line 1062
    goto :goto_1b

    .line 1063
    :cond_2b
    const/16 v24, 0x7

    .line 1064
    .line 1065
    const/16 v29, 0x4

    .line 1066
    .line 1067
    const/16 v30, 0x6

    .line 1068
    .line 1069
    aget-byte v12, v2, v30

    .line 1070
    .line 1071
    const/16 v32, 0x3

    .line 1072
    .line 1073
    and-int/lit8 v12, v12, 0x3

    .line 1074
    .line 1075
    const/16 v27, 0xc

    .line 1076
    .line 1077
    shl-int/lit8 v12, v12, 0xc

    .line 1078
    .line 1079
    aget-byte v14, v2, v24

    .line 1080
    .line 1081
    and-int/lit16 v14, v14, 0xff

    .line 1082
    .line 1083
    shl-int/lit8 v14, v14, 0x4

    .line 1084
    .line 1085
    or-int/2addr v12, v14

    .line 1086
    const/16 v28, 0x8

    .line 1087
    .line 1088
    aget-byte v14, v2, v28

    .line 1089
    .line 1090
    :goto_1a
    and-int/2addr v14, v7

    .line 1091
    shr-int/2addr v14, v11

    .line 1092
    or-int/2addr v12, v14

    .line 1093
    add-int/2addr v12, v8

    .line 1094
    move v14, v8

    .line 1095
    goto :goto_19

    .line 1096
    :cond_2c
    const/16 v24, 0x7

    .line 1097
    .line 1098
    aget-byte v12, v2, v24

    .line 1099
    .line 1100
    const/16 v32, 0x3

    .line 1101
    .line 1102
    and-int/lit8 v12, v12, 0x3

    .line 1103
    .line 1104
    const/16 v27, 0xc

    .line 1105
    .line 1106
    shl-int/lit8 v12, v12, 0xc

    .line 1107
    .line 1108
    const/16 v30, 0x6

    .line 1109
    .line 1110
    aget-byte v14, v2, v30

    .line 1111
    .line 1112
    and-int/lit16 v14, v14, 0xff

    .line 1113
    .line 1114
    const/16 v29, 0x4

    .line 1115
    .line 1116
    shl-int/lit8 v14, v14, 0x4

    .line 1117
    .line 1118
    or-int/2addr v12, v14

    .line 1119
    const/16 v14, 0x9

    .line 1120
    .line 1121
    aget-byte v14, v2, v14

    .line 1122
    .line 1123
    goto :goto_1a

    .line 1124
    :cond_2d
    const/16 v29, 0x4

    .line 1125
    .line 1126
    aget-byte v12, v2, v29

    .line 1127
    .line 1128
    const/16 v32, 0x3

    .line 1129
    .line 1130
    and-int/lit8 v12, v12, 0x3

    .line 1131
    .line 1132
    const/16 v27, 0xc

    .line 1133
    .line 1134
    shl-int/lit8 v12, v12, 0xc

    .line 1135
    .line 1136
    const/16 v24, 0x7

    .line 1137
    .line 1138
    aget-byte v14, v2, v24

    .line 1139
    .line 1140
    and-int/lit16 v14, v14, 0xff

    .line 1141
    .line 1142
    shl-int/lit8 v14, v14, 0x4

    .line 1143
    .line 1144
    or-int/2addr v12, v14

    .line 1145
    const/16 v30, 0x6

    .line 1146
    .line 1147
    aget-byte v14, v2, v30

    .line 1148
    .line 1149
    and-int/lit16 v14, v14, 0xf0

    .line 1150
    .line 1151
    shr-int/lit8 v14, v14, 0x4

    .line 1152
    .line 1153
    or-int/2addr v12, v14

    .line 1154
    add-int/2addr v12, v8

    .line 1155
    const/4 v14, 0x0

    .line 1156
    :goto_1b
    if-eqz v14, :cond_2e

    .line 1157
    .line 1158
    mul-int/lit8 v12, v12, 0x10

    .line 1159
    .line 1160
    div-int/lit8 v12, v12, 0xe

    .line 1161
    .line 1162
    :cond_2e
    iput v12, v0, LY2/g;->l:I

    .line 1163
    .line 1164
    if-eq v6, v10, :cond_31

    .line 1165
    .line 1166
    const/4 v10, -0x1

    .line 1167
    if-eq v6, v10, :cond_30

    .line 1168
    .line 1169
    if-eq v6, v9, :cond_2f

    .line 1170
    .line 1171
    const/16 v29, 0x4

    .line 1172
    .line 1173
    aget-byte v6, v2, v29

    .line 1174
    .line 1175
    and-int/2addr v6, v8

    .line 1176
    const/16 v30, 0x6

    .line 1177
    .line 1178
    shl-int/lit8 v6, v6, 0x6

    .line 1179
    .line 1180
    aget-byte v2, v2, v13

    .line 1181
    .line 1182
    :goto_1c
    and-int/lit16 v2, v2, 0xfc

    .line 1183
    .line 1184
    :goto_1d
    shr-int/2addr v2, v11

    .line 1185
    or-int/2addr v2, v6

    .line 1186
    goto :goto_1f

    .line 1187
    :cond_2f
    const/16 v29, 0x4

    .line 1188
    .line 1189
    const/16 v30, 0x6

    .line 1190
    .line 1191
    aget-byte v6, v2, v13

    .line 1192
    .line 1193
    const/16 v24, 0x7

    .line 1194
    .line 1195
    and-int/lit8 v6, v6, 0x7

    .line 1196
    .line 1197
    shl-int/lit8 v6, v6, 0x4

    .line 1198
    .line 1199
    aget-byte v2, v2, v30

    .line 1200
    .line 1201
    :goto_1e
    and-int/2addr v2, v7

    .line 1202
    goto :goto_1d

    .line 1203
    :cond_30
    const/16 v24, 0x7

    .line 1204
    .line 1205
    const/16 v29, 0x4

    .line 1206
    .line 1207
    aget-byte v6, v2, v29

    .line 1208
    .line 1209
    and-int/lit8 v6, v6, 0x7

    .line 1210
    .line 1211
    shl-int/lit8 v6, v6, 0x4

    .line 1212
    .line 1213
    aget-byte v2, v2, v24

    .line 1214
    .line 1215
    goto :goto_1e

    .line 1216
    :cond_31
    const/4 v10, -0x1

    .line 1217
    const/16 v29, 0x4

    .line 1218
    .line 1219
    aget-byte v6, v2, v13

    .line 1220
    .line 1221
    and-int/2addr v6, v8

    .line 1222
    const/16 v30, 0x6

    .line 1223
    .line 1224
    shl-int/lit8 v6, v6, 0x6

    .line 1225
    .line 1226
    aget-byte v2, v2, v29

    .line 1227
    .line 1228
    goto :goto_1c

    .line 1229
    :goto_1f
    add-int/2addr v2, v8

    .line 1230
    mul-int/2addr v2, v4

    .line 1231
    int-to-long v6, v2

    .line 1232
    iget-object v2, v0, LY2/g;->k:LN1/n;

    .line 1233
    .line 1234
    iget v2, v2, LN1/n;->D:I

    .line 1235
    .line 1236
    invoke-static {v2, v6, v7}, LQ1/x;->Q(IJ)J

    .line 1237
    .line 1238
    .line 1239
    move-result-wide v6

    .line 1240
    invoke-static {v6, v7}, LS3/f;->l(J)I

    .line 1241
    .line 1242
    .line 1243
    move-result v2

    .line 1244
    int-to-long v6, v2

    .line 1245
    iput-wide v6, v0, LY2/g;->j:J

    .line 1246
    .line 1247
    const/4 v2, 0x0

    .line 1248
    invoke-virtual {v5, v2}, LQ1/o;->G(I)V

    .line 1249
    .line 1250
    .line 1251
    iget-object v2, v0, LY2/g;->f:Ls2/C;

    .line 1252
    .line 1253
    invoke-interface {v2, v3, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 1254
    .line 1255
    .line 1256
    const/4 v2, 0x6

    .line 1257
    iput v2, v0, LY2/g;->g:I

    .line 1258
    .line 1259
    goto/16 :goto_14

    .line 1260
    .line 1261
    :cond_32
    const/16 v27, 0xc

    .line 1262
    .line 1263
    goto/16 :goto_14

    .line 1264
    .line 1265
    :pswitch_6
    move/from16 v10, v21

    .line 1266
    .line 1267
    :goto_20
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 1268
    .line 1269
    .line 1270
    move-result v2

    .line 1271
    if-lez v2, :cond_3f

    .line 1272
    .line 1273
    iget v2, v0, LY2/g;->i:I

    .line 1274
    .line 1275
    const/16 v28, 0x8

    .line 1276
    .line 1277
    shl-int/lit8 v2, v2, 0x8

    .line 1278
    .line 1279
    iput v2, v0, LY2/g;->i:I

    .line 1280
    .line 1281
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 1282
    .line 1283
    .line 1284
    move-result v3

    .line 1285
    or-int/2addr v2, v3

    .line 1286
    iput v2, v0, LY2/g;->i:I

    .line 1287
    .line 1288
    const v3, 0x7ffe8001

    .line 1289
    .line 1290
    .line 1291
    if-eq v2, v3, :cond_3a

    .line 1292
    .line 1293
    const v3, -0x180fe80

    .line 1294
    .line 1295
    .line 1296
    if-eq v2, v3, :cond_3a

    .line 1297
    .line 1298
    const v3, 0x1fffe800

    .line 1299
    .line 1300
    .line 1301
    if-eq v2, v3, :cond_3a

    .line 1302
    .line 1303
    const v3, -0xe0ff18

    .line 1304
    .line 1305
    .line 1306
    if-ne v2, v3, :cond_33

    .line 1307
    .line 1308
    goto :goto_24

    .line 1309
    :cond_33
    const v3, 0x64582025

    .line 1310
    .line 1311
    .line 1312
    if-eq v2, v3, :cond_39

    .line 1313
    .line 1314
    const v3, 0x25205864

    .line 1315
    .line 1316
    .line 1317
    if-ne v2, v3, :cond_34

    .line 1318
    .line 1319
    goto :goto_23

    .line 1320
    :cond_34
    if-eq v2, v12, :cond_38

    .line 1321
    .line 1322
    const v3, -0xde4bec0

    .line 1323
    .line 1324
    .line 1325
    if-ne v2, v3, :cond_35

    .line 1326
    .line 1327
    goto :goto_22

    .line 1328
    :cond_35
    const v3, 0x71c442e8

    .line 1329
    .line 1330
    .line 1331
    if-eq v2, v3, :cond_37

    .line 1332
    .line 1333
    const v3, -0x17bd3b8f

    .line 1334
    .line 1335
    .line 1336
    if-ne v2, v3, :cond_36

    .line 1337
    .line 1338
    goto :goto_21

    .line 1339
    :cond_36
    const/4 v3, 0x0

    .line 1340
    goto :goto_25

    .line 1341
    :cond_37
    :goto_21
    const/4 v3, 0x4

    .line 1342
    goto :goto_25

    .line 1343
    :cond_38
    :goto_22
    const/4 v3, 0x3

    .line 1344
    goto :goto_25

    .line 1345
    :cond_39
    :goto_23
    move v3, v11

    .line 1346
    goto :goto_25

    .line 1347
    :cond_3a
    :goto_24
    move v3, v8

    .line 1348
    :goto_25
    iput v3, v0, LY2/g;->m:I

    .line 1349
    .line 1350
    if-eqz v3, :cond_3e

    .line 1351
    .line 1352
    iget-object v4, v5, LQ1/o;->a:[B

    .line 1353
    .line 1354
    const/16 v26, 0x18

    .line 1355
    .line 1356
    shr-int/lit8 v5, v2, 0x18

    .line 1357
    .line 1358
    and-int/lit16 v5, v5, 0xff

    .line 1359
    .line 1360
    int-to-byte v5, v5

    .line 1361
    const/16 v31, 0x0

    .line 1362
    .line 1363
    aput-byte v5, v4, v31

    .line 1364
    .line 1365
    shr-int/lit8 v5, v2, 0x10

    .line 1366
    .line 1367
    and-int/lit16 v5, v5, 0xff

    .line 1368
    .line 1369
    int-to-byte v5, v5

    .line 1370
    aput-byte v5, v4, v8

    .line 1371
    .line 1372
    const/16 v28, 0x8

    .line 1373
    .line 1374
    shr-int/lit8 v5, v2, 0x8

    .line 1375
    .line 1376
    and-int/lit16 v5, v5, 0xff

    .line 1377
    .line 1378
    int-to-byte v5, v5

    .line 1379
    aput-byte v5, v4, v11

    .line 1380
    .line 1381
    and-int/lit16 v2, v2, 0xff

    .line 1382
    .line 1383
    int-to-byte v2, v2

    .line 1384
    const/4 v9, 0x3

    .line 1385
    aput-byte v2, v4, v9

    .line 1386
    .line 1387
    const/4 v4, 0x4

    .line 1388
    iput v4, v0, LY2/g;->h:I

    .line 1389
    .line 1390
    const/4 v2, 0x0

    .line 1391
    iput v2, v0, LY2/g;->i:I

    .line 1392
    .line 1393
    if-eq v3, v9, :cond_3d

    .line 1394
    .line 1395
    if-ne v3, v4, :cond_3b

    .line 1396
    .line 1397
    goto :goto_27

    .line 1398
    :cond_3b
    if-ne v3, v8, :cond_3c

    .line 1399
    .line 1400
    iput v8, v0, LY2/g;->g:I

    .line 1401
    .line 1402
    :goto_26
    move v3, v4

    .line 1403
    goto/16 :goto_0

    .line 1404
    .line 1405
    :cond_3c
    iput v11, v0, LY2/g;->g:I

    .line 1406
    .line 1407
    goto :goto_26

    .line 1408
    :cond_3d
    :goto_27
    iput v4, v0, LY2/g;->g:I

    .line 1409
    .line 1410
    goto :goto_26

    .line 1411
    :cond_3e
    const/16 v26, 0x18

    .line 1412
    .line 1413
    const/16 v28, 0x8

    .line 1414
    .line 1415
    goto/16 :goto_20

    .line 1416
    .line 1417
    :cond_3f
    const/16 v26, 0x18

    .line 1418
    .line 1419
    const/16 v28, 0x8

    .line 1420
    .line 1421
    goto/16 :goto_14

    .line 1422
    .line 1423
    :cond_40
    return-void

    .line 1424
    nop

    .line 1425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ls2/o;LT5/B;)V
    .locals 1

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
    iput-object v0, p0, LY2/g;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget p2, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, p2, v0}, Ls2/o;->m(II)Ls2/C;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, LY2/g;->f:Ls2/C;

    .line 22
    .line 23
    return-void
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    return-void
.end method
