.class public final LY2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY2/h;


# instance fields
.field public final a:LQ1/o;

.field public final b:LJ5/y;

.field public final c:LQ1/o;

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Ls2/C;

.field public g:D

.field public h:D

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:Z

.field public n:I

.field public o:I

.field public final p:LY2/q;

.field public q:I

.field public r:I

.field public s:I

.field public t:J

.field public u:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LY2/p;->d:I

    .line 6
    .line 7
    new-instance v0, LQ1/o;

    .line 8
    .line 9
    const/16 v1, 0xf

    .line 10
    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {v0, v1, v2}, LQ1/o;-><init>([BI)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LY2/p;->a:LQ1/o;

    .line 18
    .line 19
    new-instance v0, LJ5/y;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, v1}, LJ5/y;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LY2/p;->b:LJ5/y;

    .line 26
    .line 27
    new-instance v0, LQ1/o;

    .line 28
    .line 29
    invoke-direct {v0}, LQ1/o;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LY2/p;->c:LQ1/o;

    .line 33
    .line 34
    new-instance v0, LY2/q;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LY2/p;->p:LY2/q;

    .line 40
    .line 41
    const v0, -0x7fffffff

    .line 42
    .line 43
    .line 44
    iput v0, p0, LY2/p;->q:I

    .line 45
    .line 46
    const/4 v0, -0x1

    .line 47
    iput v0, p0, LY2/p;->r:I

    .line 48
    .line 49
    const-wide/16 v0, -0x1

    .line 50
    .line 51
    iput-wide v0, p0, LY2/p;->t:J

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, LY2/p;->j:Z

    .line 55
    .line 56
    iput-boolean v0, p0, LY2/p;->m:Z

    .line 57
    .line 58
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 59
    .line 60
    iput-wide v0, p0, LY2/p;->g:D

    .line 61
    .line 62
    iput-wide v0, p0, LY2/p;->h:D

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LY2/p;->d:I

    .line 3
    .line 4
    iput v0, p0, LY2/p;->l:I

    .line 5
    .line 6
    iget-object v1, p0, LY2/p;->a:LQ1/o;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-virtual {v1, v2}, LQ1/o;->D(I)V

    .line 10
    .line 11
    .line 12
    iput v0, p0, LY2/p;->n:I

    .line 13
    .line 14
    iput v0, p0, LY2/p;->o:I

    .line 15
    .line 16
    const v1, -0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v1, p0, LY2/p;->q:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, p0, LY2/p;->r:I

    .line 23
    .line 24
    iput v0, p0, LY2/p;->s:I

    .line 25
    .line 26
    const-wide/16 v1, -0x1

    .line 27
    .line 28
    iput-wide v1, p0, LY2/p;->t:J

    .line 29
    .line 30
    iput-boolean v0, p0, LY2/p;->u:Z

    .line 31
    .line 32
    iput-boolean v0, p0, LY2/p;->i:Z

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, LY2/p;->m:Z

    .line 36
    .line 37
    iput-boolean v0, p0, LY2/p;->j:Z

    .line 38
    .line 39
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 40
    .line 41
    iput-wide v0, p0, LY2/p;->g:D

    .line 42
    .line 43
    iput-wide v0, p0, LY2/p;->h:D

    .line 44
    .line 45
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    .line 1
    iput p1, p0, LY2/p;->k:I

    .line 2
    .line 3
    iget-boolean p1, p0, LY2/p;->j:Z

    .line 4
    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    iget p1, p0, LY2/p;->o:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, LY2/p;->m:Z

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, LY2/p;->i:Z

    .line 17
    .line 18
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p1, p2, v0

    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget-boolean p1, p0, LY2/p;->i:Z

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    long-to-double p1, p2

    .line 32
    iput-wide p1, p0, LY2/p;->h:D

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    long-to-double p1, p2

    .line 36
    iput-wide p1, p0, LY2/p;->g:D

    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public final e(LQ1/o;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x2

    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v0, LY2/p;->f:Ls2/C;

    .line 12
    .line 13
    invoke-static {v7}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    if-lez v7, :cond_46

    .line 21
    .line 22
    iget v7, v0, LY2/p;->d:I

    .line 23
    .line 24
    const/4 v8, 0x3

    .line 25
    if-eqz v7, :cond_41

    .line 26
    .line 27
    iget-object v9, v0, LY2/p;->p:LY2/q;

    .line 28
    .line 29
    const/16 v12, 0x18

    .line 30
    .line 31
    const/16 v13, 0x11

    .line 32
    .line 33
    iget-object v14, v0, LY2/p;->c:LQ1/o;

    .line 34
    .line 35
    if-eq v7, v6, :cond_30

    .line 36
    .line 37
    if-ne v7, v3, :cond_2f

    .line 38
    .line 39
    iget v7, v9, LY2/q;->a:I

    .line 40
    .line 41
    if-eq v7, v6, :cond_1

    .line 42
    .line 43
    if-ne v7, v13, :cond_2

    .line 44
    .line 45
    :cond_1
    iget v7, v1, LQ1/o;->b:I

    .line 46
    .line 47
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 48
    .line 49
    .line 50
    move-result v15

    .line 51
    invoke-virtual {v14}, LQ1/o;->a()I

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    invoke-static {v15, v11}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    iget-object v15, v14, LQ1/o;->a:[B

    .line 60
    .line 61
    iget v13, v14, LQ1/o;->b:I

    .line 62
    .line 63
    invoke-virtual {v1, v13, v11, v15}, LQ1/o;->f(II[B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v14, v11}, LQ1/o;->H(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v7}, LQ1/o;->G(I)V

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    iget v11, v9, LY2/q;->c:I

    .line 77
    .line 78
    iget v13, v0, LY2/p;->n:I

    .line 79
    .line 80
    sub-int/2addr v11, v13

    .line 81
    invoke-static {v7, v11}, Ljava/lang/Math;->min(II)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    iget-object v11, v0, LY2/p;->f:Ls2/C;

    .line 86
    .line 87
    invoke-interface {v11, v7, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 88
    .line 89
    .line 90
    iget v11, v0, LY2/p;->n:I

    .line 91
    .line 92
    add-int/2addr v11, v7

    .line 93
    iput v11, v0, LY2/p;->n:I

    .line 94
    .line 95
    iget v7, v9, LY2/q;->c:I

    .line 96
    .line 97
    if-ne v11, v7, :cond_0

    .line 98
    .line 99
    iget v7, v9, LY2/q;->a:I

    .line 100
    .line 101
    if-ne v7, v6, :cond_28

    .line 102
    .line 103
    new-instance v7, LJ5/y;

    .line 104
    .line 105
    iget-object v13, v14, LQ1/o;->a:[B

    .line 106
    .line 107
    array-length v14, v13

    .line 108
    invoke-direct {v7, v13, v14, v6, v5}, LJ5/y;-><init>([BIIB)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7, v4}, LJ5/y;->i(I)I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    const/4 v14, 0x5

    .line 116
    invoke-virtual {v7, v14}, LJ5/y;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    const/16 v10, 0x1f

    .line 121
    .line 122
    if-ne v15, v10, :cond_3

    .line 123
    .line 124
    invoke-virtual {v7, v12}, LJ5/y;->i(I)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    goto/16 :goto_1

    .line 129
    .line 130
    :cond_3
    packed-switch v15, :pswitch_data_0

    .line 131
    .line 132
    .line 133
    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v2, "Unsupported sampling rate index "

    .line 136
    .line 137
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    throw v1

    .line 152
    :pswitch_1
    const/16 v10, 0x2580

    .line 153
    .line 154
    goto/16 :goto_1

    .line 155
    .line 156
    :pswitch_2
    const/16 v10, 0x3200

    .line 157
    .line 158
    goto/16 :goto_1

    .line 159
    .line 160
    :pswitch_3
    const/16 v10, 0x3840

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_4
    const/16 v10, 0x42b3

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :pswitch_5
    const/16 v10, 0x4b00

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :pswitch_6
    const/16 v10, 0x4e20

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :pswitch_7
    const/16 v10, 0x6400

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :pswitch_8
    const/16 v10, 0x7080

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :pswitch_9
    const v10, 0x8566

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :pswitch_a
    const v10, 0x9600

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :pswitch_b
    const v10, 0x9c40

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :pswitch_c
    const v10, 0xc800

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :pswitch_d
    const v10, 0xe100

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :pswitch_e
    const/16 v10, 0x1cb6

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :pswitch_f
    const/16 v10, 0x1f40

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :pswitch_10
    const/16 v10, 0x2b11

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :pswitch_11
    const/16 v10, 0x2ee0

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :pswitch_12
    const/16 v10, 0x3e80

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :pswitch_13
    const/16 v10, 0x5622

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :pswitch_14
    const/16 v10, 0x5dc0

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :pswitch_15
    const/16 v10, 0x7d00

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :pswitch_16
    const v10, 0xac44

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :pswitch_17
    const v10, 0xbb80

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :pswitch_18
    const v10, 0xfa00

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :pswitch_19
    const v10, 0x15888

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :pswitch_1a
    const v10, 0x17700

    .line 239
    .line 240
    .line 241
    :goto_1
    invoke-virtual {v7, v8}, LJ5/y;->i(I)I

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    const-string v15, "Unsupported coreSbrFrameLengthIndex "

    .line 246
    .line 247
    if-eqz v12, :cond_7

    .line 248
    .line 249
    if-eq v12, v6, :cond_6

    .line 250
    .line 251
    if-eq v12, v3, :cond_5

    .line 252
    .line 253
    if-eq v12, v8, :cond_5

    .line 254
    .line 255
    if-ne v12, v2, :cond_4

    .line 256
    .line 257
    const/16 v16, 0x1000

    .line 258
    .line 259
    :goto_2
    move/from16 v17, v16

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    throw v1

    .line 279
    :cond_5
    const/16 v16, 0x800

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_6
    const/16 v16, 0x400

    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_7
    const/16 v16, 0x300

    .line 286
    .line 287
    goto :goto_2

    .line 288
    :goto_3
    if-eqz v12, :cond_b

    .line 289
    .line 290
    if-eq v12, v6, :cond_b

    .line 291
    .line 292
    if-eq v12, v3, :cond_a

    .line 293
    .line 294
    if-eq v12, v8, :cond_9

    .line 295
    .line 296
    if-ne v12, v2, :cond_8

    .line 297
    .line 298
    move v12, v6

    .line 299
    goto :goto_4

    .line 300
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    throw v1

    .line 317
    :cond_9
    move v12, v8

    .line 318
    goto :goto_4

    .line 319
    :cond_a
    move v12, v3

    .line 320
    goto :goto_4

    .line 321
    :cond_b
    move v12, v5

    .line 322
    :goto_4
    invoke-virtual {v7, v3}, LJ5/y;->t(I)V

    .line 323
    .line 324
    .line 325
    invoke-static {v7}, LS3/f;->I(LJ5/y;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7, v14}, LJ5/y;->i(I)I

    .line 329
    .line 330
    .line 331
    move-result v15

    .line 332
    move v11, v5

    .line 333
    move/from16 v18, v11

    .line 334
    .line 335
    :goto_5
    add-int/lit8 v5, v15, 0x1

    .line 336
    .line 337
    move/from16 v20, v6

    .line 338
    .line 339
    const/16 v6, 0x10

    .line 340
    .line 341
    if-ge v11, v5, :cond_e

    .line 342
    .line 343
    invoke-virtual {v7, v8}, LJ5/y;->i(I)I

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    invoke-static {v7, v14, v4, v6}, LS3/f;->D(LJ5/y;III)I

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    add-int/lit8 v6, v6, 0x1

    .line 352
    .line 353
    add-int v18, v6, v18

    .line 354
    .line 355
    if-eqz v5, :cond_c

    .line 356
    .line 357
    if-ne v5, v3, :cond_d

    .line 358
    .line 359
    :cond_c
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-eqz v5, :cond_d

    .line 364
    .line 365
    invoke-static {v7}, LS3/f;->I(LJ5/y;)V

    .line 366
    .line 367
    .line 368
    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 369
    .line 370
    move/from16 v6, v20

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_e
    invoke-static {v7, v2, v4, v6}, LS3/f;->D(LJ5/y;III)I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    add-int/lit8 v5, v5, 0x1

    .line 378
    .line 379
    invoke-virtual {v7}, LJ5/y;->s()V

    .line 380
    .line 381
    .line 382
    const/4 v11, 0x0

    .line 383
    :goto_6
    const-wide/high16 v21, 0x4000000000000000L    # 2.0

    .line 384
    .line 385
    if-ge v11, v5, :cond_20

    .line 386
    .line 387
    invoke-virtual {v7, v3}, LJ5/y;->i(I)I

    .line 388
    .line 389
    .line 390
    move-result v15

    .line 391
    if-eqz v15, :cond_1e

    .line 392
    .line 393
    move/from16 v14, v20

    .line 394
    .line 395
    if-eq v15, v14, :cond_13

    .line 396
    .line 397
    if-eq v15, v8, :cond_11

    .line 398
    .line 399
    :cond_f
    :goto_7
    const/4 v2, 0x5

    .line 400
    :cond_10
    :goto_8
    const/16 v20, 0x1

    .line 401
    .line 402
    goto/16 :goto_c

    .line 403
    .line 404
    :cond_11
    invoke-static {v7, v2, v4, v6}, LS3/f;->D(LJ5/y;III)I

    .line 405
    .line 406
    .line 407
    invoke-static {v7, v2, v4, v6}, LS3/f;->D(LJ5/y;III)I

    .line 408
    .line 409
    .line 410
    move-result v14

    .line 411
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 412
    .line 413
    .line 414
    move-result v15

    .line 415
    if-eqz v15, :cond_12

    .line 416
    .line 417
    const/4 v15, 0x0

    .line 418
    invoke-static {v7, v4, v6, v15}, LS3/f;->D(LJ5/y;III)I

    .line 419
    .line 420
    .line 421
    :cond_12
    invoke-virtual {v7}, LJ5/y;->s()V

    .line 422
    .line 423
    .line 424
    if-lez v14, :cond_f

    .line 425
    .line 426
    mul-int/2addr v14, v4

    .line 427
    invoke-virtual {v7, v14}, LJ5/y;->t(I)V

    .line 428
    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_13
    invoke-virtual {v7, v8}, LJ5/y;->t(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 435
    .line 436
    .line 437
    move-result v14

    .line 438
    if-eqz v14, :cond_14

    .line 439
    .line 440
    const/16 v15, 0xd

    .line 441
    .line 442
    invoke-virtual {v7, v15}, LJ5/y;->t(I)V

    .line 443
    .line 444
    .line 445
    :cond_14
    if-eqz v14, :cond_15

    .line 446
    .line 447
    invoke-virtual {v7}, LJ5/y;->s()V

    .line 448
    .line 449
    .line 450
    :cond_15
    if-lez v12, :cond_16

    .line 451
    .line 452
    invoke-static {v7}, LS3/f;->H(LJ5/y;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v7, v3}, LJ5/y;->i(I)I

    .line 456
    .line 457
    .line 458
    move-result v14

    .line 459
    goto :goto_9

    .line 460
    :cond_16
    const/4 v14, 0x0

    .line 461
    :goto_9
    if-lez v14, :cond_1b

    .line 462
    .line 463
    const/4 v15, 0x6

    .line 464
    invoke-virtual {v7, v15}, LJ5/y;->t(I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v7, v3}, LJ5/y;->i(I)I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    invoke-virtual {v7, v2}, LJ5/y;->t(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 475
    .line 476
    .line 477
    move-result v25

    .line 478
    const/4 v2, 0x5

    .line 479
    if-eqz v25, :cond_17

    .line 480
    .line 481
    invoke-virtual {v7, v2}, LJ5/y;->t(I)V

    .line 482
    .line 483
    .line 484
    :cond_17
    if-eq v14, v3, :cond_18

    .line 485
    .line 486
    if-ne v14, v8, :cond_19

    .line 487
    .line 488
    :cond_18
    invoke-virtual {v7, v15}, LJ5/y;->t(I)V

    .line 489
    .line 490
    .line 491
    :cond_19
    if-ne v6, v3, :cond_1a

    .line 492
    .line 493
    invoke-virtual {v7}, LJ5/y;->s()V

    .line 494
    .line 495
    .line 496
    :cond_1a
    :goto_a
    const/16 v20, 0x1

    .line 497
    .line 498
    goto :goto_b

    .line 499
    :cond_1b
    const/4 v2, 0x5

    .line 500
    goto :goto_a

    .line 501
    :goto_b
    add-int/lit8 v6, v18, -0x1

    .line 502
    .line 503
    int-to-double v14, v6

    .line 504
    invoke-static {v14, v15}, Ljava/lang/Math;->log(D)D

    .line 505
    .line 506
    .line 507
    move-result-wide v14

    .line 508
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->log(D)D

    .line 509
    .line 510
    .line 511
    move-result-wide v21

    .line 512
    div-double v14, v14, v21

    .line 513
    .line 514
    invoke-static {v14, v15}, Ljava/lang/Math;->floor(D)D

    .line 515
    .line 516
    .line 517
    move-result-wide v14

    .line 518
    double-to-int v6, v14

    .line 519
    add-int/lit8 v6, v6, 0x1

    .line 520
    .line 521
    invoke-virtual {v7, v3}, LJ5/y;->i(I)I

    .line 522
    .line 523
    .line 524
    move-result v14

    .line 525
    if-lez v14, :cond_1c

    .line 526
    .line 527
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 528
    .line 529
    .line 530
    move-result v15

    .line 531
    if-eqz v15, :cond_1c

    .line 532
    .line 533
    invoke-virtual {v7, v6}, LJ5/y;->t(I)V

    .line 534
    .line 535
    .line 536
    :cond_1c
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 537
    .line 538
    .line 539
    move-result v15

    .line 540
    if-eqz v15, :cond_1d

    .line 541
    .line 542
    invoke-virtual {v7, v6}, LJ5/y;->t(I)V

    .line 543
    .line 544
    .line 545
    :cond_1d
    if-nez v12, :cond_10

    .line 546
    .line 547
    if-nez v14, :cond_10

    .line 548
    .line 549
    invoke-virtual {v7}, LJ5/y;->s()V

    .line 550
    .line 551
    .line 552
    goto/16 :goto_8

    .line 553
    .line 554
    :cond_1e
    move v2, v14

    .line 555
    invoke-virtual {v7, v8}, LJ5/y;->t(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 559
    .line 560
    .line 561
    move-result v6

    .line 562
    if-eqz v6, :cond_1f

    .line 563
    .line 564
    const/16 v15, 0xd

    .line 565
    .line 566
    invoke-virtual {v7, v15}, LJ5/y;->t(I)V

    .line 567
    .line 568
    .line 569
    :cond_1f
    if-lez v12, :cond_10

    .line 570
    .line 571
    invoke-static {v7}, LS3/f;->H(LJ5/y;)V

    .line 572
    .line 573
    .line 574
    goto/16 :goto_8

    .line 575
    .line 576
    :goto_c
    add-int/lit8 v11, v11, 0x1

    .line 577
    .line 578
    move v14, v2

    .line 579
    const/4 v2, 0x4

    .line 580
    const/16 v6, 0x10

    .line 581
    .line 582
    goto/16 :goto_6

    .line 583
    .line 584
    :cond_20
    invoke-virtual {v7}, LJ5/y;->h()Z

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    if-eqz v2, :cond_23

    .line 589
    .line 590
    const/4 v2, 0x4

    .line 591
    invoke-static {v7, v3, v2, v4}, LS3/f;->D(LJ5/y;III)I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    add-int/lit8 v5, v5, 0x1

    .line 596
    .line 597
    const/4 v6, 0x0

    .line 598
    const/4 v8, 0x0

    .line 599
    :goto_d
    if-ge v6, v5, :cond_24

    .line 600
    .line 601
    const/16 v11, 0x10

    .line 602
    .line 603
    invoke-static {v7, v2, v4, v11}, LS3/f;->D(LJ5/y;III)I

    .line 604
    .line 605
    .line 606
    move-result v12

    .line 607
    invoke-static {v7, v2, v4, v11}, LS3/f;->D(LJ5/y;III)I

    .line 608
    .line 609
    .line 610
    move-result v14

    .line 611
    const/4 v15, 0x7

    .line 612
    if-ne v12, v15, :cond_22

    .line 613
    .line 614
    invoke-virtual {v7, v2}, LJ5/y;->i(I)I

    .line 615
    .line 616
    .line 617
    move-result v8

    .line 618
    add-int/lit8 v8, v8, 0x1

    .line 619
    .line 620
    invoke-virtual {v7, v2}, LJ5/y;->t(I)V

    .line 621
    .line 622
    .line 623
    new-array v2, v8, [B

    .line 624
    .line 625
    const/4 v12, 0x0

    .line 626
    :goto_e
    if-ge v12, v8, :cond_21

    .line 627
    .line 628
    invoke-virtual {v7, v4}, LJ5/y;->i(I)I

    .line 629
    .line 630
    .line 631
    move-result v14

    .line 632
    int-to-byte v14, v14

    .line 633
    aput-byte v14, v2, v12

    .line 634
    .line 635
    add-int/lit8 v12, v12, 0x1

    .line 636
    .line 637
    goto :goto_e

    .line 638
    :cond_21
    move-object v8, v2

    .line 639
    goto :goto_f

    .line 640
    :cond_22
    mul-int/2addr v14, v4

    .line 641
    invoke-virtual {v7, v14}, LJ5/y;->t(I)V

    .line 642
    .line 643
    .line 644
    :goto_f
    add-int/lit8 v6, v6, 0x1

    .line 645
    .line 646
    const/4 v2, 0x4

    .line 647
    const/16 v20, 0x1

    .line 648
    .line 649
    goto :goto_d

    .line 650
    :cond_23
    const/4 v8, 0x0

    .line 651
    :cond_24
    sparse-switch v10, :sswitch_data_0

    .line 652
    .line 653
    .line 654
    new-instance v1, Ljava/lang/StringBuilder;

    .line 655
    .line 656
    const-string v2, "Unsupported sampling rate "

    .line 657
    .line 658
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    throw v1

    .line 673
    :sswitch_0
    const-wide/high16 v21, 0x3ff0000000000000L    # 1.0

    .line 674
    .line 675
    goto :goto_10

    .line 676
    :sswitch_1
    const-wide/high16 v21, 0x3ff8000000000000L    # 1.5

    .line 677
    .line 678
    goto :goto_10

    .line 679
    :sswitch_2
    const-wide/high16 v21, 0x4008000000000000L    # 3.0

    .line 680
    .line 681
    :goto_10
    :sswitch_3
    int-to-double v5, v10

    .line 682
    mul-double v5, v5, v21

    .line 683
    .line 684
    double-to-int v2, v5

    .line 685
    move/from16 v5, v17

    .line 686
    .line 687
    int-to-double v5, v5

    .line 688
    mul-double v5, v5, v21

    .line 689
    .line 690
    double-to-int v5, v5

    .line 691
    iput v2, v0, LY2/p;->q:I

    .line 692
    .line 693
    iput v5, v0, LY2/p;->r:I

    .line 694
    .line 695
    iget-wide v5, v0, LY2/p;->t:J

    .line 696
    .line 697
    iget-wide v9, v9, LY2/q;->b:J

    .line 698
    .line 699
    cmp-long v2, v5, v9

    .line 700
    .line 701
    if-eqz v2, :cond_27

    .line 702
    .line 703
    iput-wide v9, v0, LY2/p;->t:J

    .line 704
    .line 705
    const-string v2, "mhm1"

    .line 706
    .line 707
    const/4 v5, -0x1

    .line 708
    if-eq v13, v5, :cond_25

    .line 709
    .line 710
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 711
    .line 712
    .line 713
    move-result-object v5

    .line 714
    const/4 v14, 0x1

    .line 715
    new-array v6, v14, [Ljava/lang/Object;

    .line 716
    .line 717
    const/16 v19, 0x0

    .line 718
    .line 719
    aput-object v5, v6, v19

    .line 720
    .line 721
    const-string v5, ".%02X"

    .line 722
    .line 723
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v5

    .line 727
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    :cond_25
    if-eqz v8, :cond_26

    .line 732
    .line 733
    array-length v5, v8

    .line 734
    if-lez v5, :cond_26

    .line 735
    .line 736
    sget-object v5, LQ1/x;->f:[B

    .line 737
    .line 738
    invoke-static {v5, v8}, Ll8/K;->o(Ljava/lang/Object;Ljava/lang/Object;)Ll8/e0;

    .line 739
    .line 740
    .line 741
    move-result-object v11

    .line 742
    goto :goto_11

    .line 743
    :cond_26
    const/4 v11, 0x0

    .line 744
    :goto_11
    new-instance v5, LN1/m;

    .line 745
    .line 746
    invoke-direct {v5}, LN1/m;-><init>()V

    .line 747
    .line 748
    .line 749
    iget-object v6, v0, LY2/p;->e:Ljava/lang/String;

    .line 750
    .line 751
    iput-object v6, v5, LN1/m;->a:Ljava/lang/String;

    .line 752
    .line 753
    const-string v6, "audio/mhm1"

    .line 754
    .line 755
    invoke-static {v6}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v6

    .line 759
    iput-object v6, v5, LN1/m;->m:Ljava/lang/String;

    .line 760
    .line 761
    iget v6, v0, LY2/p;->q:I

    .line 762
    .line 763
    iput v6, v5, LN1/m;->C:I

    .line 764
    .line 765
    iput-object v2, v5, LN1/m;->j:Ljava/lang/String;

    .line 766
    .line 767
    iput-object v11, v5, LN1/m;->p:Ljava/util/List;

    .line 768
    .line 769
    new-instance v2, LN1/n;

    .line 770
    .line 771
    invoke-direct {v2, v5}, LN1/n;-><init>(LN1/m;)V

    .line 772
    .line 773
    .line 774
    iget-object v5, v0, LY2/p;->f:Ls2/C;

    .line 775
    .line 776
    invoke-interface {v5, v2}, Ls2/C;->c(LN1/n;)V

    .line 777
    .line 778
    .line 779
    :cond_27
    const/4 v2, 0x1

    .line 780
    iput-boolean v2, v0, LY2/p;->u:Z

    .line 781
    .line 782
    move v14, v2

    .line 783
    goto :goto_16

    .line 784
    :cond_28
    move v2, v6

    .line 785
    const/16 v5, 0x11

    .line 786
    .line 787
    if-ne v7, v5, :cond_2b

    .line 788
    .line 789
    new-instance v5, LJ5/y;

    .line 790
    .line 791
    iget-object v6, v14, LQ1/o;->a:[B

    .line 792
    .line 793
    array-length v7, v6

    .line 794
    const/4 v15, 0x0

    .line 795
    invoke-direct {v5, v6, v7, v2, v15}, LJ5/y;-><init>([BIIB)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v5}, LJ5/y;->h()Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    if-eqz v2, :cond_29

    .line 803
    .line 804
    invoke-virtual {v5, v3}, LJ5/y;->t(I)V

    .line 805
    .line 806
    .line 807
    const/16 v15, 0xd

    .line 808
    .line 809
    invoke-virtual {v5, v15}, LJ5/y;->i(I)I

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    goto :goto_12

    .line 814
    :cond_29
    const/4 v2, 0x0

    .line 815
    :goto_12
    iput v2, v0, LY2/p;->s:I

    .line 816
    .line 817
    :cond_2a
    :goto_13
    const/4 v14, 0x1

    .line 818
    goto :goto_16

    .line 819
    :cond_2b
    if-ne v7, v3, :cond_2a

    .line 820
    .line 821
    iget-boolean v2, v0, LY2/p;->u:Z

    .line 822
    .line 823
    if-eqz v2, :cond_2c

    .line 824
    .line 825
    const/4 v15, 0x0

    .line 826
    iput-boolean v15, v0, LY2/p;->j:Z

    .line 827
    .line 828
    const/4 v8, 0x1

    .line 829
    goto :goto_14

    .line 830
    :cond_2c
    const/4 v8, 0x0

    .line 831
    :goto_14
    iget v2, v0, LY2/p;->r:I

    .line 832
    .line 833
    iget v5, v0, LY2/p;->s:I

    .line 834
    .line 835
    sub-int/2addr v2, v5

    .line 836
    int-to-double v5, v2

    .line 837
    const-wide v9, 0x412e848000000000L    # 1000000.0

    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    mul-double/2addr v5, v9

    .line 843
    iget v2, v0, LY2/p;->q:I

    .line 844
    .line 845
    int-to-double v9, v2

    .line 846
    div-double/2addr v5, v9

    .line 847
    iget-wide v9, v0, LY2/p;->g:D

    .line 848
    .line 849
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 850
    .line 851
    .line 852
    move-result-wide v9

    .line 853
    iget-boolean v2, v0, LY2/p;->i:Z

    .line 854
    .line 855
    if-eqz v2, :cond_2d

    .line 856
    .line 857
    const/4 v15, 0x0

    .line 858
    iput-boolean v15, v0, LY2/p;->i:Z

    .line 859
    .line 860
    iget-wide v5, v0, LY2/p;->h:D

    .line 861
    .line 862
    iput-wide v5, v0, LY2/p;->g:D

    .line 863
    .line 864
    goto :goto_15

    .line 865
    :cond_2d
    iget-wide v11, v0, LY2/p;->g:D

    .line 866
    .line 867
    add-double/2addr v11, v5

    .line 868
    iput-wide v11, v0, LY2/p;->g:D

    .line 869
    .line 870
    :goto_15
    iget-object v5, v0, LY2/p;->f:Ls2/C;

    .line 871
    .line 872
    move-wide v6, v9

    .line 873
    iget v9, v0, LY2/p;->o:I

    .line 874
    .line 875
    const/4 v10, 0x0

    .line 876
    const/4 v11, 0x0

    .line 877
    invoke-interface/range {v5 .. v11}, Ls2/C;->a(JIIILs2/B;)V

    .line 878
    .line 879
    .line 880
    const/4 v15, 0x0

    .line 881
    iput-boolean v15, v0, LY2/p;->u:Z

    .line 882
    .line 883
    iput v15, v0, LY2/p;->s:I

    .line 884
    .line 885
    iput v15, v0, LY2/p;->o:I

    .line 886
    .line 887
    goto :goto_13

    .line 888
    :goto_16
    iput v14, v0, LY2/p;->d:I

    .line 889
    .line 890
    :cond_2e
    :goto_17
    move v6, v14

    .line 891
    const/4 v2, 0x4

    .line 892
    const/4 v5, 0x0

    .line 893
    goto/16 :goto_0

    .line 894
    .line 895
    :cond_2f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 896
    .line 897
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 898
    .line 899
    .line 900
    throw v1

    .line 901
    :cond_30
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    iget-object v5, v0, LY2/p;->a:LQ1/o;

    .line 906
    .line 907
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 908
    .line 909
    .line 910
    move-result v6

    .line 911
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 912
    .line 913
    .line 914
    move-result v2

    .line 915
    iget-object v6, v5, LQ1/o;->a:[B

    .line 916
    .line 917
    iget v7, v5, LQ1/o;->b:I

    .line 918
    .line 919
    invoke-virtual {v1, v7, v2, v6}, LQ1/o;->f(II[B)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v5, v2}, LQ1/o;->H(I)V

    .line 923
    .line 924
    .line 925
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 926
    .line 927
    .line 928
    move-result v2

    .line 929
    if-nez v2, :cond_40

    .line 930
    .line 931
    iget v2, v5, LQ1/o;->c:I

    .line 932
    .line 933
    iget-object v6, v5, LQ1/o;->a:[B

    .line 934
    .line 935
    iget-object v7, v0, LY2/p;->b:LJ5/y;

    .line 936
    .line 937
    invoke-virtual {v7, v2, v6}, LJ5/y;->o(I[B)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v7}, LJ5/y;->f()I

    .line 941
    .line 942
    .line 943
    invoke-static {v7, v8, v4, v4}, LS3/f;->D(LJ5/y;III)I

    .line 944
    .line 945
    .line 946
    move-result v6

    .line 947
    iput v6, v9, LY2/q;->a:I

    .line 948
    .line 949
    const/4 v8, -0x1

    .line 950
    if-ne v6, v8, :cond_32

    .line 951
    .line 952
    move-object v15, v9

    .line 953
    :cond_31
    :goto_18
    const/4 v6, 0x0

    .line 954
    goto/16 :goto_1d

    .line 955
    .line 956
    :cond_32
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 957
    .line 958
    .line 959
    move-result v6

    .line 960
    const/16 v8, 0x20

    .line 961
    .line 962
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 963
    .line 964
    .line 965
    move-result v6

    .line 966
    const/16 v10, 0x3f

    .line 967
    .line 968
    if-gt v6, v10, :cond_33

    .line 969
    .line 970
    const/4 v6, 0x1

    .line 971
    goto :goto_19

    .line 972
    :cond_33
    const/4 v6, 0x0

    .line 973
    :goto_19
    invoke-static {v6}, LQ1/k;->c(Z)V

    .line 974
    .line 975
    .line 976
    const-wide/16 v10, 0x3

    .line 977
    .line 978
    const-wide/16 v12, 0xff

    .line 979
    .line 980
    move-object v15, v9

    .line 981
    invoke-static {v10, v11, v12, v13}, LA6/h;->k(JJ)J

    .line 982
    .line 983
    .line 984
    move-result-wide v8

    .line 985
    move-wide/from16 v21, v10

    .line 986
    .line 987
    const-wide v10, 0x100000000L

    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    invoke-static {v8, v9, v10, v11}, LA6/h;->k(JJ)J

    .line 993
    .line 994
    .line 995
    invoke-virtual {v7}, LJ5/y;->b()I

    .line 996
    .line 997
    .line 998
    move-result v8

    .line 999
    const-wide/16 v9, -0x1

    .line 1000
    .line 1001
    if-ge v8, v3, :cond_34

    .line 1002
    .line 1003
    :goto_1a
    move-wide v11, v9

    .line 1004
    goto :goto_1b

    .line 1005
    :cond_34
    invoke-virtual {v7, v3}, LJ5/y;->k(I)J

    .line 1006
    .line 1007
    .line 1008
    move-result-wide v23

    .line 1009
    cmp-long v8, v23, v21

    .line 1010
    .line 1011
    if-nez v8, :cond_37

    .line 1012
    .line 1013
    invoke-virtual {v7}, LJ5/y;->b()I

    .line 1014
    .line 1015
    .line 1016
    move-result v8

    .line 1017
    if-ge v8, v4, :cond_35

    .line 1018
    .line 1019
    goto :goto_1a

    .line 1020
    :cond_35
    invoke-virtual {v7, v4}, LJ5/y;->k(I)J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v21

    .line 1024
    add-long v23, v23, v21

    .line 1025
    .line 1026
    cmp-long v8, v21, v12

    .line 1027
    .line 1028
    if-nez v8, :cond_37

    .line 1029
    .line 1030
    invoke-virtual {v7}, LJ5/y;->b()I

    .line 1031
    .line 1032
    .line 1033
    move-result v8

    .line 1034
    const/16 v11, 0x20

    .line 1035
    .line 1036
    if-ge v8, v11, :cond_36

    .line 1037
    .line 1038
    goto :goto_1a

    .line 1039
    :cond_36
    invoke-virtual {v7, v11}, LJ5/y;->k(I)J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v11

    .line 1043
    add-long v23, v11, v23

    .line 1044
    .line 1045
    :cond_37
    move-wide/from16 v11, v23

    .line 1046
    .line 1047
    :goto_1b
    iput-wide v11, v15, LY2/q;->b:J

    .line 1048
    .line 1049
    cmp-long v8, v11, v9

    .line 1050
    .line 1051
    if-nez v8, :cond_38

    .line 1052
    .line 1053
    goto :goto_18

    .line 1054
    :cond_38
    const-wide/16 v8, 0x10

    .line 1055
    .line 1056
    cmp-long v8, v11, v8

    .line 1057
    .line 1058
    if-gtz v8, :cond_3f

    .line 1059
    .line 1060
    const-wide/16 v8, 0x0

    .line 1061
    .line 1062
    cmp-long v8, v11, v8

    .line 1063
    .line 1064
    if-nez v8, :cond_3c

    .line 1065
    .line 1066
    iget v8, v15, LY2/q;->a:I

    .line 1067
    .line 1068
    const/4 v9, 0x1

    .line 1069
    if-eq v8, v9, :cond_3b

    .line 1070
    .line 1071
    if-eq v8, v3, :cond_3a

    .line 1072
    .line 1073
    const/16 v9, 0x11

    .line 1074
    .line 1075
    if-eq v8, v9, :cond_39

    .line 1076
    .line 1077
    goto :goto_1c

    .line 1078
    :cond_39
    const-string v1, "AudioTruncation packet with invalid packet label 0"

    .line 1079
    .line 1080
    const/4 v2, 0x0

    .line 1081
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    throw v1

    .line 1086
    :cond_3a
    const/4 v2, 0x0

    .line 1087
    const-string v1, "Mpegh3daFrame packet with invalid packet label 0"

    .line 1088
    .line 1089
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v1

    .line 1093
    throw v1

    .line 1094
    :cond_3b
    const/4 v2, 0x0

    .line 1095
    const-string v1, "Mpegh3daConfig packet with invalid packet label 0"

    .line 1096
    .line 1097
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v1

    .line 1101
    throw v1

    .line 1102
    :cond_3c
    :goto_1c
    const/16 v8, 0xb

    .line 1103
    .line 1104
    const/16 v6, 0x18

    .line 1105
    .line 1106
    invoke-static {v7, v8, v6, v6}, LS3/f;->D(LJ5/y;III)I

    .line 1107
    .line 1108
    .line 1109
    move-result v6

    .line 1110
    iput v6, v15, LY2/q;->c:I

    .line 1111
    .line 1112
    const/4 v8, -0x1

    .line 1113
    if-eq v6, v8, :cond_31

    .line 1114
    .line 1115
    const/4 v6, 0x1

    .line 1116
    :goto_1d
    if-eqz v6, :cond_3d

    .line 1117
    .line 1118
    const/4 v7, 0x0

    .line 1119
    iput v7, v0, LY2/p;->n:I

    .line 1120
    .line 1121
    iget v8, v0, LY2/p;->o:I

    .line 1122
    .line 1123
    iget v9, v15, LY2/q;->c:I

    .line 1124
    .line 1125
    add-int/2addr v9, v2

    .line 1126
    add-int/2addr v9, v8

    .line 1127
    iput v9, v0, LY2/p;->o:I

    .line 1128
    .line 1129
    goto :goto_1e

    .line 1130
    :cond_3d
    const/4 v7, 0x0

    .line 1131
    :goto_1e
    if-eqz v6, :cond_3e

    .line 1132
    .line 1133
    invoke-virtual {v5, v7}, LQ1/o;->G(I)V

    .line 1134
    .line 1135
    .line 1136
    iget-object v2, v0, LY2/p;->f:Ls2/C;

    .line 1137
    .line 1138
    iget v6, v5, LQ1/o;->c:I

    .line 1139
    .line 1140
    invoke-interface {v2, v6, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v5, v3}, LQ1/o;->D(I)V

    .line 1144
    .line 1145
    .line 1146
    iget v2, v15, LY2/q;->c:I

    .line 1147
    .line 1148
    invoke-virtual {v14, v2}, LQ1/o;->D(I)V

    .line 1149
    .line 1150
    .line 1151
    const/4 v14, 0x1

    .line 1152
    iput-boolean v14, v0, LY2/p;->m:Z

    .line 1153
    .line 1154
    iput v3, v0, LY2/p;->d:I

    .line 1155
    .line 1156
    goto/16 :goto_17

    .line 1157
    .line 1158
    :cond_3e
    const/4 v14, 0x1

    .line 1159
    iget v2, v5, LQ1/o;->c:I

    .line 1160
    .line 1161
    const/16 v6, 0xf

    .line 1162
    .line 1163
    if-ge v2, v6, :cond_2e

    .line 1164
    .line 1165
    add-int/2addr v2, v14

    .line 1166
    invoke-virtual {v5, v2}, LQ1/o;->F(I)V

    .line 1167
    .line 1168
    .line 1169
    const/4 v7, 0x0

    .line 1170
    iput-boolean v7, v0, LY2/p;->m:Z

    .line 1171
    .line 1172
    :goto_1f
    move v5, v7

    .line 1173
    const/4 v2, 0x4

    .line 1174
    :goto_20
    const/4 v6, 0x1

    .line 1175
    goto/16 :goto_0

    .line 1176
    .line 1177
    :cond_3f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1178
    .line 1179
    const-string v2, "Contains sub-stream with an invalid packet label "

    .line 1180
    .line 1181
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1182
    .line 1183
    .line 1184
    iget-wide v2, v15, LY2/q;->b:J

    .line 1185
    .line 1186
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    invoke-static {v1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    throw v1

    .line 1198
    :cond_40
    const/4 v7, 0x0

    .line 1199
    iput-boolean v7, v0, LY2/p;->m:Z

    .line 1200
    .line 1201
    goto :goto_1f

    .line 1202
    :cond_41
    iget v2, v0, LY2/p;->k:I

    .line 1203
    .line 1204
    and-int/lit8 v5, v2, 0x2

    .line 1205
    .line 1206
    if-nez v5, :cond_43

    .line 1207
    .line 1208
    iget v2, v1, LQ1/o;->c:I

    .line 1209
    .line 1210
    invoke-virtual {v1, v2}, LQ1/o;->G(I)V

    .line 1211
    .line 1212
    .line 1213
    const/16 v25, 0x4

    .line 1214
    .line 1215
    :cond_42
    const/4 v15, 0x0

    .line 1216
    goto :goto_22

    .line 1217
    :cond_43
    const/16 v25, 0x4

    .line 1218
    .line 1219
    and-int/lit8 v2, v2, 0x4

    .line 1220
    .line 1221
    if-nez v2, :cond_45

    .line 1222
    .line 1223
    :cond_44
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 1224
    .line 1225
    .line 1226
    move-result v2

    .line 1227
    if-lez v2, :cond_42

    .line 1228
    .line 1229
    iget v2, v0, LY2/p;->l:I

    .line 1230
    .line 1231
    shl-int/2addr v2, v4

    .line 1232
    iput v2, v0, LY2/p;->l:I

    .line 1233
    .line 1234
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 1235
    .line 1236
    .line 1237
    move-result v5

    .line 1238
    or-int/2addr v2, v5

    .line 1239
    iput v2, v0, LY2/p;->l:I

    .line 1240
    .line 1241
    const v5, 0xffffff

    .line 1242
    .line 1243
    .line 1244
    and-int/2addr v2, v5

    .line 1245
    const v5, 0xc001a5

    .line 1246
    .line 1247
    .line 1248
    if-ne v2, v5, :cond_44

    .line 1249
    .line 1250
    iget v2, v1, LQ1/o;->b:I

    .line 1251
    .line 1252
    sub-int/2addr v2, v8

    .line 1253
    invoke-virtual {v1, v2}, LQ1/o;->G(I)V

    .line 1254
    .line 1255
    .line 1256
    const/4 v15, 0x0

    .line 1257
    iput v15, v0, LY2/p;->l:I

    .line 1258
    .line 1259
    :goto_21
    const/4 v14, 0x1

    .line 1260
    goto :goto_23

    .line 1261
    :goto_22
    move v5, v15

    .line 1262
    move/from16 v2, v25

    .line 1263
    .line 1264
    goto :goto_20

    .line 1265
    :cond_45
    const/4 v15, 0x0

    .line 1266
    goto :goto_21

    .line 1267
    :goto_23
    iput v14, v0, LY2/p;->d:I

    .line 1268
    .line 1269
    move v6, v14

    .line 1270
    move v5, v15

    .line 1271
    move/from16 v2, v25

    .line 1272
    .line 1273
    goto/16 :goto_0

    .line 1274
    .line 1275
    :cond_46
    return-void

    .line 1276
    nop

    .line 1277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    :sswitch_data_0
    .sparse-switch
        0x396c -> :sswitch_2
        0x3e80 -> :sswitch_2
        0x5622 -> :sswitch_3
        0x5dc0 -> :sswitch_3
        0x72d8 -> :sswitch_1
        0x7d00 -> :sswitch_1
        0xac44 -> :sswitch_0
        0xbb80 -> :sswitch_0
        0xe5b0 -> :sswitch_1
        0xfa00 -> :sswitch_1
        0x15888 -> :sswitch_0
        0x17700 -> :sswitch_0
    .end sparse-switch
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
    iput-object v0, p0, LY2/p;->e:Ljava/lang/String;

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
    iput-object p1, p0, LY2/p;->f:Ls2/C;

    .line 22
    .line 23
    return-void
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    return-void
.end method
