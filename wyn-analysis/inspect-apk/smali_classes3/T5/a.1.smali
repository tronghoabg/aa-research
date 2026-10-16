.class public final LT5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;


# instance fields
.field public final synthetic a:I

.field public final b:LJ5/y;

.field public final c:LY4/b;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:LJ5/w;

.field public g:I

.field public h:I

.field public i:Z

.field public j:J

.field public k:LE5/T;

.field public l:I

.field public m:J


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 4

    .line 1
    iput p2, p0, LT5/a;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, LJ5/y;

    .line 10
    .line 11
    const/16 v0, 0x80

    .line 12
    .line 13
    new-array v1, v0, [B

    .line 14
    .line 15
    const/4 v2, 0x6

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {p2, v1, v0, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, LT5/a;->b:LJ5/y;

    .line 21
    .line 22
    new-instance p2, LY4/b;

    .line 23
    .line 24
    invoke-direct {p2, v1}, LY4/b;-><init>([B)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, LT5/a;->c:LY4/b;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    iput p2, p0, LT5/a;->g:I

    .line 31
    .line 32
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iput-wide v0, p0, LT5/a;->m:J

    .line 38
    .line 39
    iput-object p1, p0, LT5/a;->d:Ljava/lang/String;

    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance p2, LJ5/y;

    .line 46
    .line 47
    const/16 v0, 0x10

    .line 48
    .line 49
    new-array v1, v0, [B

    .line 50
    .line 51
    const/4 v2, 0x6

    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {p2, v1, v0, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 54
    .line 55
    .line 56
    iput-object p2, p0, LT5/a;->b:LJ5/y;

    .line 57
    .line 58
    new-instance p2, LY4/b;

    .line 59
    .line 60
    invoke-direct {p2, v1}, LY4/b;-><init>([B)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, LT5/a;->c:LY4/b;

    .line 64
    .line 65
    const/4 p2, 0x0

    .line 66
    iput p2, p0, LT5/a;->g:I

    .line 67
    .line 68
    iput p2, p0, LT5/a;->h:I

    .line 69
    .line 70
    iput-boolean p2, p0, LT5/a;->i:Z

    .line 71
    .line 72
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    iput-wide v0, p0, LT5/a;->m:J

    .line 78
    .line 79
    iput-object p1, p0, LT5/a;->d:Ljava/lang/String;

    .line 80
    .line 81
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final e()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, LT5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, LT5/a;->g:I

    .line 8
    .line 9
    iput v0, p0, LT5/a;->h:I

    .line 10
    .line 11
    iput-boolean v0, p0, LT5/a;->i:Z

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, LT5/a;->m:J

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const/4 v0, 0x0

    .line 22
    iput v0, p0, LT5/a;->g:I

    .line 23
    .line 24
    iput v0, p0, LT5/a;->h:I

    .line 25
    .line 26
    iput-boolean v0, p0, LT5/a;->i:Z

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, LT5/a;->m:J

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(LY4/b;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, LT5/a;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, LT5/a;->f:LJ5/w;

    .line 11
    .line 12
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual {v1}, LY4/b;->a()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-lez v2, :cond_d

    .line 20
    .line 21
    iget v2, v0, LT5/a;->g:I

    .line 22
    .line 23
    iget-object v3, v0, LT5/a;->c:LY4/b;

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const/4 v5, 0x1

    .line 27
    const/4 v6, 0x0

    .line 28
    if-eqz v2, :cond_6

    .line 29
    .line 30
    if-eq v2, v5, :cond_3

    .line 31
    .line 32
    if-eq v2, v4, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1}, LY4/b;->a()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget v3, v0, LT5/a;->l:I

    .line 40
    .line 41
    iget v4, v0, LT5/a;->h:I

    .line 42
    .line 43
    sub-int/2addr v3, v4

    .line 44
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v3, v0, LT5/a;->f:LJ5/w;

    .line 49
    .line 50
    invoke-interface {v3, v2, v1}, LJ5/w;->c(ILY4/b;)V

    .line 51
    .line 52
    .line 53
    iget v3, v0, LT5/a;->h:I

    .line 54
    .line 55
    add-int/2addr v3, v2

    .line 56
    iput v3, v0, LT5/a;->h:I

    .line 57
    .line 58
    iget v11, v0, LT5/a;->l:I

    .line 59
    .line 60
    if-ne v3, v11, :cond_0

    .line 61
    .line 62
    iget-wide v8, v0, LT5/a;->m:J

    .line 63
    .line 64
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    cmp-long v2, v8, v2

    .line 70
    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    iget-object v7, v0, LT5/a;->f:LJ5/w;

    .line 74
    .line 75
    const/4 v13, 0x0

    .line 76
    const/4 v10, 0x1

    .line 77
    const/4 v12, 0x0

    .line 78
    invoke-interface/range {v7 .. v13}, LJ5/w;->b(JIIILJ5/v;)V

    .line 79
    .line 80
    .line 81
    iget-wide v2, v0, LT5/a;->m:J

    .line 82
    .line 83
    iget-wide v4, v0, LT5/a;->j:J

    .line 84
    .line 85
    add-long/2addr v2, v4

    .line 86
    iput-wide v2, v0, LT5/a;->m:J

    .line 87
    .line 88
    :cond_2
    iput v6, v0, LT5/a;->g:I

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    iget-object v2, v3, LY4/b;->a:[B

    .line 92
    .line 93
    invoke-virtual {v1}, LY4/b;->a()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iget v7, v0, LT5/a;->h:I

    .line 98
    .line 99
    const/16 v8, 0x10

    .line 100
    .line 101
    rsub-int/lit8 v7, v7, 0x10

    .line 102
    .line 103
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    iget v7, v0, LT5/a;->h:I

    .line 108
    .line 109
    invoke-virtual {v1, v7, v5, v2}, LY4/b;->c(II[B)V

    .line 110
    .line 111
    .line 112
    iget v2, v0, LT5/a;->h:I

    .line 113
    .line 114
    add-int/2addr v2, v5

    .line 115
    iput v2, v0, LT5/a;->h:I

    .line 116
    .line 117
    if-ne v2, v8, :cond_0

    .line 118
    .line 119
    iget-object v2, v0, LT5/a;->b:LJ5/y;

    .line 120
    .line 121
    invoke-virtual {v2, v6}, LJ5/y;->q(I)V

    .line 122
    .line 123
    .line 124
    invoke-static {v2}, LG5/b;->e(LJ5/y;)LG5/c;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iget-object v5, v0, LT5/a;->k:LE5/T;

    .line 129
    .line 130
    const-string v7, "audio/ac4"

    .line 131
    .line 132
    iget v9, v2, LG5/c;->a:I

    .line 133
    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    iget v10, v5, LE5/T;->y:I

    .line 137
    .line 138
    if-ne v4, v10, :cond_4

    .line 139
    .line 140
    iget v10, v5, LE5/T;->z:I

    .line 141
    .line 142
    if-ne v9, v10, :cond_4

    .line 143
    .line 144
    iget-object v5, v5, LE5/T;->l:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-nez v5, :cond_5

    .line 151
    .line 152
    :cond_4
    new-instance v5, LE5/S;

    .line 153
    .line 154
    invoke-direct {v5}, LE5/S;-><init>()V

    .line 155
    .line 156
    .line 157
    iget-object v10, v0, LT5/a;->e:Ljava/lang/String;

    .line 158
    .line 159
    iput-object v10, v5, LE5/S;->a:Ljava/lang/String;

    .line 160
    .line 161
    iput-object v7, v5, LE5/S;->k:Ljava/lang/String;

    .line 162
    .line 163
    iput v4, v5, LE5/S;->x:I

    .line 164
    .line 165
    iput v9, v5, LE5/S;->y:I

    .line 166
    .line 167
    iget-object v7, v0, LT5/a;->d:Ljava/lang/String;

    .line 168
    .line 169
    iput-object v7, v5, LE5/S;->c:Ljava/lang/String;

    .line 170
    .line 171
    new-instance v7, LE5/T;

    .line 172
    .line 173
    invoke-direct {v7, v5}, LE5/T;-><init>(LE5/S;)V

    .line 174
    .line 175
    .line 176
    iput-object v7, v0, LT5/a;->k:LE5/T;

    .line 177
    .line 178
    iget-object v5, v0, LT5/a;->f:LJ5/w;

    .line 179
    .line 180
    invoke-interface {v5, v7}, LJ5/w;->a(LE5/T;)V

    .line 181
    .line 182
    .line 183
    :cond_5
    iget v5, v2, LG5/c;->b:I

    .line 184
    .line 185
    iput v5, v0, LT5/a;->l:I

    .line 186
    .line 187
    iget v2, v2, LG5/c;->c:I

    .line 188
    .line 189
    int-to-long v9, v2

    .line 190
    const-wide/32 v11, 0xf4240

    .line 191
    .line 192
    .line 193
    mul-long/2addr v9, v11

    .line 194
    iget-object v2, v0, LT5/a;->k:LE5/T;

    .line 195
    .line 196
    iget v2, v2, LE5/T;->z:I

    .line 197
    .line 198
    int-to-long v11, v2

    .line 199
    div-long/2addr v9, v11

    .line 200
    iput-wide v9, v0, LT5/a;->j:J

    .line 201
    .line 202
    invoke-virtual {v3, v6}, LY4/b;->A(I)V

    .line 203
    .line 204
    .line 205
    iget-object v2, v0, LT5/a;->f:LJ5/w;

    .line 206
    .line 207
    invoke-interface {v2, v8, v3}, LJ5/w;->c(ILY4/b;)V

    .line 208
    .line 209
    .line 210
    iput v4, v0, LT5/a;->g:I

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_6
    :goto_1
    invoke-virtual {v1}, LY4/b;->a()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-lez v2, :cond_0

    .line 219
    .line 220
    iget-boolean v2, v0, LT5/a;->i:Z

    .line 221
    .line 222
    const/16 v7, 0xac

    .line 223
    .line 224
    if-nez v2, :cond_8

    .line 225
    .line 226
    invoke-virtual {v1}, LY4/b;->q()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-ne v2, v7, :cond_7

    .line 231
    .line 232
    move v2, v5

    .line 233
    goto :goto_2

    .line 234
    :cond_7
    move v2, v6

    .line 235
    :goto_2
    iput-boolean v2, v0, LT5/a;->i:Z

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_8
    invoke-virtual {v1}, LY4/b;->q()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-ne v2, v7, :cond_9

    .line 243
    .line 244
    move v7, v5

    .line 245
    goto :goto_3

    .line 246
    :cond_9
    move v7, v6

    .line 247
    :goto_3
    iput-boolean v7, v0, LT5/a;->i:Z

    .line 248
    .line 249
    const/16 v7, 0x41

    .line 250
    .line 251
    const/16 v8, 0x40

    .line 252
    .line 253
    if-eq v2, v8, :cond_a

    .line 254
    .line 255
    if-ne v2, v7, :cond_6

    .line 256
    .line 257
    :cond_a
    if-ne v2, v7, :cond_b

    .line 258
    .line 259
    move v2, v5

    .line 260
    goto :goto_4

    .line 261
    :cond_b
    move v2, v6

    .line 262
    :goto_4
    iput v5, v0, LT5/a;->g:I

    .line 263
    .line 264
    iget-object v3, v3, LY4/b;->a:[B

    .line 265
    .line 266
    const/16 v9, -0x54

    .line 267
    .line 268
    aput-byte v9, v3, v6

    .line 269
    .line 270
    if-eqz v2, :cond_c

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_c
    move v7, v8

    .line 274
    :goto_5
    int-to-byte v2, v7

    .line 275
    aput-byte v2, v3, v5

    .line 276
    .line 277
    iput v4, v0, LT5/a;->h:I

    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_d
    return-void

    .line 282
    :pswitch_0
    iget-object v2, v0, LT5/a;->f:LJ5/w;

    .line 283
    .line 284
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    :cond_e
    :goto_6
    invoke-virtual {v1}, LY4/b;->a()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-lez v2, :cond_4b

    .line 292
    .line 293
    iget v2, v0, LT5/a;->g:I

    .line 294
    .line 295
    const/4 v3, 0x1

    .line 296
    const/16 v4, 0xb

    .line 297
    .line 298
    iget-object v5, v0, LT5/a;->c:LY4/b;

    .line 299
    .line 300
    const/4 v6, 0x2

    .line 301
    const/4 v7, 0x0

    .line 302
    if-eqz v2, :cond_46

    .line 303
    .line 304
    if-eq v2, v3, :cond_11

    .line 305
    .line 306
    if-eq v2, v6, :cond_f

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_f
    invoke-virtual {v1}, LY4/b;->a()I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    iget v3, v0, LT5/a;->l:I

    .line 314
    .line 315
    iget v4, v0, LT5/a;->h:I

    .line 316
    .line 317
    sub-int/2addr v3, v4

    .line 318
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    iget-object v3, v0, LT5/a;->f:LJ5/w;

    .line 323
    .line 324
    invoke-interface {v3, v2, v1}, LJ5/w;->c(ILY4/b;)V

    .line 325
    .line 326
    .line 327
    iget v3, v0, LT5/a;->h:I

    .line 328
    .line 329
    add-int/2addr v3, v2

    .line 330
    iput v3, v0, LT5/a;->h:I

    .line 331
    .line 332
    iget v12, v0, LT5/a;->l:I

    .line 333
    .line 334
    if-ne v3, v12, :cond_e

    .line 335
    .line 336
    iget-wide v9, v0, LT5/a;->m:J

    .line 337
    .line 338
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    cmp-long v2, v9, v2

    .line 344
    .line 345
    if-eqz v2, :cond_10

    .line 346
    .line 347
    iget-object v8, v0, LT5/a;->f:LJ5/w;

    .line 348
    .line 349
    const/4 v14, 0x0

    .line 350
    const/4 v11, 0x1

    .line 351
    const/4 v13, 0x0

    .line 352
    invoke-interface/range {v8 .. v14}, LJ5/w;->b(JIIILJ5/v;)V

    .line 353
    .line 354
    .line 355
    iget-wide v2, v0, LT5/a;->m:J

    .line 356
    .line 357
    iget-wide v4, v0, LT5/a;->j:J

    .line 358
    .line 359
    add-long/2addr v2, v4

    .line 360
    iput-wide v2, v0, LT5/a;->m:J

    .line 361
    .line 362
    :cond_10
    iput v7, v0, LT5/a;->g:I

    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_11
    iget-object v2, v5, LY4/b;->a:[B

    .line 366
    .line 367
    invoke-virtual {v1}, LY4/b;->a()I

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    iget v9, v0, LT5/a;->h:I

    .line 372
    .line 373
    const/16 v10, 0x80

    .line 374
    .line 375
    rsub-int v9, v9, 0x80

    .line 376
    .line 377
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 378
    .line 379
    .line 380
    move-result v8

    .line 381
    iget v9, v0, LT5/a;->h:I

    .line 382
    .line 383
    invoke-virtual {v1, v9, v8, v2}, LY4/b;->c(II[B)V

    .line 384
    .line 385
    .line 386
    iget v2, v0, LT5/a;->h:I

    .line 387
    .line 388
    add-int/2addr v2, v8

    .line 389
    iput v2, v0, LT5/a;->h:I

    .line 390
    .line 391
    if-ne v2, v10, :cond_e

    .line 392
    .line 393
    iget-object v2, v0, LT5/a;->b:LJ5/y;

    .line 394
    .line 395
    invoke-virtual {v2, v7}, LJ5/y;->q(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2}, LJ5/y;->g()I

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    const/16 v9, 0x28

    .line 403
    .line 404
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 405
    .line 406
    .line 407
    const/4 v9, 0x5

    .line 408
    invoke-virtual {v2, v9}, LJ5/y;->i(I)I

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    const/16 v12, 0xa

    .line 413
    .line 414
    if-le v11, v12, :cond_12

    .line 415
    .line 416
    move v11, v3

    .line 417
    goto :goto_7

    .line 418
    :cond_12
    move v11, v7

    .line 419
    :goto_7
    invoke-virtual {v2, v8}, LJ5/y;->q(I)V

    .line 420
    .line 421
    .line 422
    sget-object v8, LG5/b;->f:[I

    .line 423
    .line 424
    sget-object v13, LG5/b;->d:[I

    .line 425
    .line 426
    const/16 v15, 0x8

    .line 427
    .line 428
    const/4 v10, 0x3

    .line 429
    if-eqz v11, :cond_3e

    .line 430
    .line 431
    const/16 v11, 0x10

    .line 432
    .line 433
    invoke-virtual {v2, v11}, LJ5/y;->t(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v6}, LJ5/y;->i(I)I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    if-eqz v7, :cond_15

    .line 441
    .line 442
    if-eq v7, v3, :cond_14

    .line 443
    .line 444
    if-eq v7, v6, :cond_13

    .line 445
    .line 446
    const/4 v7, -0x1

    .line 447
    goto :goto_8

    .line 448
    :cond_13
    move v7, v6

    .line 449
    goto :goto_8

    .line 450
    :cond_14
    move v7, v3

    .line 451
    goto :goto_8

    .line 452
    :cond_15
    const/4 v7, 0x0

    .line 453
    :goto_8
    invoke-virtual {v2, v10}, LJ5/y;->t(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v4}, LJ5/y;->i(I)I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    add-int/2addr v4, v3

    .line 461
    mul-int/2addr v4, v6

    .line 462
    invoke-virtual {v2, v6}, LJ5/y;->i(I)I

    .line 463
    .line 464
    .line 465
    move-result v14

    .line 466
    if-ne v14, v10, :cond_16

    .line 467
    .line 468
    sget-object v13, LG5/b;->e:[I

    .line 469
    .line 470
    invoke-virtual {v2, v6}, LJ5/y;->i(I)I

    .line 471
    .line 472
    .line 473
    move-result v16

    .line 474
    aget v13, v13, v16

    .line 475
    .line 476
    move/from16 v19, v10

    .line 477
    .line 478
    const/4 v6, 0x6

    .line 479
    goto :goto_9

    .line 480
    :cond_16
    invoke-virtual {v2, v6}, LJ5/y;->i(I)I

    .line 481
    .line 482
    .line 483
    move-result v16

    .line 484
    sget-object v18, LG5/b;->c:[I

    .line 485
    .line 486
    aget v18, v18, v16

    .line 487
    .line 488
    aget v13, v13, v14

    .line 489
    .line 490
    move/from16 v19, v16

    .line 491
    .line 492
    move/from16 v6, v18

    .line 493
    .line 494
    :goto_9
    mul-int/lit16 v11, v6, 0x100

    .line 495
    .line 496
    invoke-virtual {v2, v10}, LJ5/y;->i(I)I

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 501
    .line 502
    .line 503
    move-result v16

    .line 504
    aget v8, v8, v3

    .line 505
    .line 506
    add-int v8, v8, v16

    .line 507
    .line 508
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 512
    .line 513
    .line 514
    move-result v12

    .line 515
    if-eqz v12, :cond_17

    .line 516
    .line 517
    invoke-virtual {v2, v15}, LJ5/y;->t(I)V

    .line 518
    .line 519
    .line 520
    :cond_17
    if-nez v3, :cond_18

    .line 521
    .line 522
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 526
    .line 527
    .line 528
    move-result v12

    .line 529
    if-eqz v12, :cond_18

    .line 530
    .line 531
    invoke-virtual {v2, v15}, LJ5/y;->t(I)V

    .line 532
    .line 533
    .line 534
    :cond_18
    const/4 v12, 0x1

    .line 535
    if-ne v7, v12, :cond_19

    .line 536
    .line 537
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 538
    .line 539
    .line 540
    move-result v12

    .line 541
    if-eqz v12, :cond_19

    .line 542
    .line 543
    const/16 v12, 0x10

    .line 544
    .line 545
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 546
    .line 547
    .line 548
    :cond_19
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 549
    .line 550
    .line 551
    move-result v12

    .line 552
    if-eqz v12, :cond_32

    .line 553
    .line 554
    const/4 v12, 0x2

    .line 555
    if-le v3, v12, :cond_1a

    .line 556
    .line 557
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 558
    .line 559
    .line 560
    :cond_1a
    and-int/lit8 v18, v3, 0x1

    .line 561
    .line 562
    if-eqz v18, :cond_1b

    .line 563
    .line 564
    if-le v3, v12, :cond_1b

    .line 565
    .line 566
    const/4 v12, 0x6

    .line 567
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 568
    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_1b
    const/4 v12, 0x6

    .line 572
    :goto_a
    and-int/lit8 v17, v3, 0x4

    .line 573
    .line 574
    if-eqz v17, :cond_1c

    .line 575
    .line 576
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 577
    .line 578
    .line 579
    :cond_1c
    if-eqz v16, :cond_1d

    .line 580
    .line 581
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 582
    .line 583
    .line 584
    move-result v12

    .line 585
    if-eqz v12, :cond_1d

    .line 586
    .line 587
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 588
    .line 589
    .line 590
    :cond_1d
    if-nez v7, :cond_32

    .line 591
    .line 592
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 593
    .line 594
    .line 595
    move-result v12

    .line 596
    if-eqz v12, :cond_1e

    .line 597
    .line 598
    const/4 v12, 0x6

    .line 599
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 600
    .line 601
    .line 602
    goto :goto_b

    .line 603
    :cond_1e
    const/4 v12, 0x6

    .line 604
    :goto_b
    if-nez v3, :cond_1f

    .line 605
    .line 606
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 607
    .line 608
    .line 609
    move-result v16

    .line 610
    if-eqz v16, :cond_1f

    .line 611
    .line 612
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 613
    .line 614
    .line 615
    :cond_1f
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 616
    .line 617
    .line 618
    move-result v16

    .line 619
    if-eqz v16, :cond_20

    .line 620
    .line 621
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 622
    .line 623
    .line 624
    :cond_20
    const/4 v12, 0x2

    .line 625
    invoke-virtual {v2, v12}, LJ5/y;->i(I)I

    .line 626
    .line 627
    .line 628
    move-result v15

    .line 629
    const/4 v10, 0x1

    .line 630
    if-ne v15, v10, :cond_21

    .line 631
    .line 632
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 633
    .line 634
    .line 635
    move v15, v12

    .line 636
    goto/16 :goto_f

    .line 637
    .line 638
    :cond_21
    if-ne v15, v12, :cond_23

    .line 639
    .line 640
    const/16 v10, 0xc

    .line 641
    .line 642
    invoke-virtual {v2, v10}, LJ5/y;->t(I)V

    .line 643
    .line 644
    .line 645
    :cond_22
    const/4 v15, 0x2

    .line 646
    goto/16 :goto_f

    .line 647
    .line 648
    :cond_23
    const/4 v10, 0x3

    .line 649
    if-ne v15, v10, :cond_22

    .line 650
    .line 651
    invoke-virtual {v2, v9}, LJ5/y;->i(I)I

    .line 652
    .line 653
    .line 654
    move-result v10

    .line 655
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 656
    .line 657
    .line 658
    move-result v12

    .line 659
    if-eqz v12, :cond_2c

    .line 660
    .line 661
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 665
    .line 666
    .line 667
    move-result v12

    .line 668
    if-eqz v12, :cond_24

    .line 669
    .line 670
    const/4 v12, 0x4

    .line 671
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 672
    .line 673
    .line 674
    goto :goto_c

    .line 675
    :cond_24
    const/4 v12, 0x4

    .line 676
    :goto_c
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 677
    .line 678
    .line 679
    move-result v15

    .line 680
    if-eqz v15, :cond_25

    .line 681
    .line 682
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 683
    .line 684
    .line 685
    :cond_25
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 686
    .line 687
    .line 688
    move-result v15

    .line 689
    if-eqz v15, :cond_26

    .line 690
    .line 691
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 692
    .line 693
    .line 694
    :cond_26
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 695
    .line 696
    .line 697
    move-result v15

    .line 698
    if-eqz v15, :cond_27

    .line 699
    .line 700
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 701
    .line 702
    .line 703
    :cond_27
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 704
    .line 705
    .line 706
    move-result v15

    .line 707
    if-eqz v15, :cond_28

    .line 708
    .line 709
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 710
    .line 711
    .line 712
    :cond_28
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 713
    .line 714
    .line 715
    move-result v15

    .line 716
    if-eqz v15, :cond_29

    .line 717
    .line 718
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 719
    .line 720
    .line 721
    :cond_29
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 722
    .line 723
    .line 724
    move-result v15

    .line 725
    if-eqz v15, :cond_2a

    .line 726
    .line 727
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 728
    .line 729
    .line 730
    :cond_2a
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 731
    .line 732
    .line 733
    move-result v15

    .line 734
    if-eqz v15, :cond_2c

    .line 735
    .line 736
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 737
    .line 738
    .line 739
    move-result v15

    .line 740
    if-eqz v15, :cond_2b

    .line 741
    .line 742
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 743
    .line 744
    .line 745
    :cond_2b
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 746
    .line 747
    .line 748
    move-result v15

    .line 749
    if-eqz v15, :cond_2c

    .line 750
    .line 751
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 752
    .line 753
    .line 754
    :cond_2c
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 755
    .line 756
    .line 757
    move-result v12

    .line 758
    if-eqz v12, :cond_2d

    .line 759
    .line 760
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 764
    .line 765
    .line 766
    move-result v12

    .line 767
    if-eqz v12, :cond_2d

    .line 768
    .line 769
    const/4 v12, 0x7

    .line 770
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 774
    .line 775
    .line 776
    move-result v12

    .line 777
    if-eqz v12, :cond_2d

    .line 778
    .line 779
    const/16 v12, 0x8

    .line 780
    .line 781
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 782
    .line 783
    .line 784
    :goto_d
    const/4 v15, 0x2

    .line 785
    goto :goto_e

    .line 786
    :cond_2d
    const/16 v12, 0x8

    .line 787
    .line 788
    goto :goto_d

    .line 789
    :goto_e
    add-int/2addr v10, v15

    .line 790
    mul-int/2addr v10, v12

    .line 791
    invoke-virtual {v2, v10}, LJ5/y;->t(I)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2}, LJ5/y;->c()V

    .line 795
    .line 796
    .line 797
    :goto_f
    if-ge v3, v15, :cond_2f

    .line 798
    .line 799
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 800
    .line 801
    .line 802
    move-result v10

    .line 803
    const/16 v12, 0xe

    .line 804
    .line 805
    if-eqz v10, :cond_2e

    .line 806
    .line 807
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 808
    .line 809
    .line 810
    :cond_2e
    if-nez v3, :cond_2f

    .line 811
    .line 812
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 813
    .line 814
    .line 815
    move-result v10

    .line 816
    if-eqz v10, :cond_2f

    .line 817
    .line 818
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 819
    .line 820
    .line 821
    :cond_2f
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 822
    .line 823
    .line 824
    move-result v10

    .line 825
    if-eqz v10, :cond_32

    .line 826
    .line 827
    move/from16 v10, v19

    .line 828
    .line 829
    if-nez v10, :cond_30

    .line 830
    .line 831
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 832
    .line 833
    .line 834
    goto :goto_11

    .line 835
    :cond_30
    const/4 v12, 0x0

    .line 836
    :goto_10
    if-ge v12, v6, :cond_33

    .line 837
    .line 838
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 839
    .line 840
    .line 841
    move-result v15

    .line 842
    if-eqz v15, :cond_31

    .line 843
    .line 844
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 845
    .line 846
    .line 847
    :cond_31
    add-int/lit8 v12, v12, 0x1

    .line 848
    .line 849
    goto :goto_10

    .line 850
    :cond_32
    move/from16 v10, v19

    .line 851
    .line 852
    :cond_33
    :goto_11
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 853
    .line 854
    .line 855
    move-result v6

    .line 856
    if-eqz v6, :cond_38

    .line 857
    .line 858
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 859
    .line 860
    .line 861
    const/4 v12, 0x2

    .line 862
    if-ne v3, v12, :cond_34

    .line 863
    .line 864
    const/4 v6, 0x4

    .line 865
    invoke-virtual {v2, v6}, LJ5/y;->t(I)V

    .line 866
    .line 867
    .line 868
    :cond_34
    const/4 v6, 0x6

    .line 869
    if-lt v3, v6, :cond_35

    .line 870
    .line 871
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 872
    .line 873
    .line 874
    :cond_35
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 875
    .line 876
    .line 877
    move-result v6

    .line 878
    const/16 v12, 0x8

    .line 879
    .line 880
    if-eqz v6, :cond_36

    .line 881
    .line 882
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 883
    .line 884
    .line 885
    :cond_36
    if-nez v3, :cond_37

    .line 886
    .line 887
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 888
    .line 889
    .line 890
    move-result v3

    .line 891
    if-eqz v3, :cond_37

    .line 892
    .line 893
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 894
    .line 895
    .line 896
    :cond_37
    const/4 v3, 0x3

    .line 897
    if-ge v14, v3, :cond_39

    .line 898
    .line 899
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 900
    .line 901
    .line 902
    goto :goto_12

    .line 903
    :cond_38
    const/4 v3, 0x3

    .line 904
    :cond_39
    :goto_12
    if-nez v7, :cond_3a

    .line 905
    .line 906
    if-eq v10, v3, :cond_3a

    .line 907
    .line 908
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 909
    .line 910
    .line 911
    :cond_3a
    const/4 v12, 0x2

    .line 912
    if-ne v7, v12, :cond_3c

    .line 913
    .line 914
    if-eq v10, v3, :cond_3b

    .line 915
    .line 916
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 917
    .line 918
    .line 919
    move-result v3

    .line 920
    if-eqz v3, :cond_3c

    .line 921
    .line 922
    :cond_3b
    const/4 v12, 0x6

    .line 923
    goto :goto_13

    .line 924
    :cond_3c
    const/4 v12, 0x6

    .line 925
    goto :goto_14

    .line 926
    :goto_13
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 927
    .line 928
    .line 929
    :goto_14
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 930
    .line 931
    .line 932
    move-result v3

    .line 933
    if-eqz v3, :cond_3d

    .line 934
    .line 935
    invoke-virtual {v2, v12}, LJ5/y;->i(I)I

    .line 936
    .line 937
    .line 938
    move-result v3

    .line 939
    const/4 v10, 0x1

    .line 940
    if-ne v3, v10, :cond_3d

    .line 941
    .line 942
    const/16 v12, 0x8

    .line 943
    .line 944
    invoke-virtual {v2, v12}, LJ5/y;->i(I)I

    .line 945
    .line 946
    .line 947
    move-result v2

    .line 948
    if-ne v2, v10, :cond_3d

    .line 949
    .line 950
    const-string v2, "audio/eac3-joc"

    .line 951
    .line 952
    goto :goto_19

    .line 953
    :cond_3d
    const-string v2, "audio/eac3"

    .line 954
    .line 955
    goto :goto_19

    .line 956
    :cond_3e
    const/16 v3, 0x20

    .line 957
    .line 958
    invoke-virtual {v2, v3}, LJ5/y;->t(I)V

    .line 959
    .line 960
    .line 961
    const/4 v12, 0x2

    .line 962
    invoke-virtual {v2, v12}, LJ5/y;->i(I)I

    .line 963
    .line 964
    .line 965
    move-result v3

    .line 966
    const/4 v10, 0x3

    .line 967
    if-ne v3, v10, :cond_3f

    .line 968
    .line 969
    const/4 v4, 0x0

    .line 970
    :goto_15
    const/4 v12, 0x6

    .line 971
    goto :goto_16

    .line 972
    :cond_3f
    const-string v4, "audio/ac3"

    .line 973
    .line 974
    goto :goto_15

    .line 975
    :goto_16
    invoke-virtual {v2, v12}, LJ5/y;->i(I)I

    .line 976
    .line 977
    .line 978
    move-result v6

    .line 979
    invoke-static {v3, v6}, LG5/b;->b(II)I

    .line 980
    .line 981
    .line 982
    move-result v6

    .line 983
    const/16 v12, 0x8

    .line 984
    .line 985
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v2, v10}, LJ5/y;->i(I)I

    .line 989
    .line 990
    .line 991
    move-result v7

    .line 992
    and-int/lit8 v9, v7, 0x1

    .line 993
    .line 994
    if-eqz v9, :cond_40

    .line 995
    .line 996
    const/4 v10, 0x1

    .line 997
    if-eq v7, v10, :cond_40

    .line 998
    .line 999
    const/4 v12, 0x2

    .line 1000
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 1001
    .line 1002
    .line 1003
    goto :goto_17

    .line 1004
    :cond_40
    const/4 v12, 0x2

    .line 1005
    :goto_17
    and-int/lit8 v9, v7, 0x4

    .line 1006
    .line 1007
    if-eqz v9, :cond_41

    .line 1008
    .line 1009
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 1010
    .line 1011
    .line 1012
    :cond_41
    if-ne v7, v12, :cond_42

    .line 1013
    .line 1014
    invoke-virtual {v2, v12}, LJ5/y;->t(I)V

    .line 1015
    .line 1016
    .line 1017
    :cond_42
    const/4 v10, 0x3

    .line 1018
    if-ge v3, v10, :cond_43

    .line 1019
    .line 1020
    aget v14, v13, v3

    .line 1021
    .line 1022
    goto :goto_18

    .line 1023
    :cond_43
    const/4 v14, -0x1

    .line 1024
    :goto_18
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 1025
    .line 1026
    .line 1027
    move-result v2

    .line 1028
    aget v3, v8, v7

    .line 1029
    .line 1030
    add-int v8, v3, v2

    .line 1031
    .line 1032
    const/16 v11, 0x600

    .line 1033
    .line 1034
    move-object v2, v4

    .line 1035
    move v4, v6

    .line 1036
    move v13, v14

    .line 1037
    :goto_19
    iget-object v3, v0, LT5/a;->k:LE5/T;

    .line 1038
    .line 1039
    if-eqz v3, :cond_44

    .line 1040
    .line 1041
    iget v6, v3, LE5/T;->y:I

    .line 1042
    .line 1043
    if-ne v8, v6, :cond_44

    .line 1044
    .line 1045
    iget v6, v3, LE5/T;->z:I

    .line 1046
    .line 1047
    if-ne v13, v6, :cond_44

    .line 1048
    .line 1049
    iget-object v3, v3, LE5/T;->l:Ljava/lang/String;

    .line 1050
    .line 1051
    invoke-static {v2, v3}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v3

    .line 1055
    if-nez v3, :cond_45

    .line 1056
    .line 1057
    :cond_44
    new-instance v3, LE5/S;

    .line 1058
    .line 1059
    invoke-direct {v3}, LE5/S;-><init>()V

    .line 1060
    .line 1061
    .line 1062
    iget-object v6, v0, LT5/a;->e:Ljava/lang/String;

    .line 1063
    .line 1064
    iput-object v6, v3, LE5/S;->a:Ljava/lang/String;

    .line 1065
    .line 1066
    iput-object v2, v3, LE5/S;->k:Ljava/lang/String;

    .line 1067
    .line 1068
    iput v8, v3, LE5/S;->x:I

    .line 1069
    .line 1070
    iput v13, v3, LE5/S;->y:I

    .line 1071
    .line 1072
    iget-object v2, v0, LT5/a;->d:Ljava/lang/String;

    .line 1073
    .line 1074
    iput-object v2, v3, LE5/S;->c:Ljava/lang/String;

    .line 1075
    .line 1076
    new-instance v2, LE5/T;

    .line 1077
    .line 1078
    invoke-direct {v2, v3}, LE5/T;-><init>(LE5/S;)V

    .line 1079
    .line 1080
    .line 1081
    iput-object v2, v0, LT5/a;->k:LE5/T;

    .line 1082
    .line 1083
    iget-object v3, v0, LT5/a;->f:LJ5/w;

    .line 1084
    .line 1085
    invoke-interface {v3, v2}, LJ5/w;->a(LE5/T;)V

    .line 1086
    .line 1087
    .line 1088
    :cond_45
    iput v4, v0, LT5/a;->l:I

    .line 1089
    .line 1090
    const-wide/32 v2, 0xf4240

    .line 1091
    .line 1092
    .line 1093
    int-to-long v6, v11

    .line 1094
    mul-long/2addr v6, v2

    .line 1095
    iget-object v2, v0, LT5/a;->k:LE5/T;

    .line 1096
    .line 1097
    iget v2, v2, LE5/T;->z:I

    .line 1098
    .line 1099
    int-to-long v2, v2

    .line 1100
    div-long/2addr v6, v2

    .line 1101
    iput-wide v6, v0, LT5/a;->j:J

    .line 1102
    .line 1103
    const/4 v2, 0x0

    .line 1104
    invoke-virtual {v5, v2}, LY4/b;->A(I)V

    .line 1105
    .line 1106
    .line 1107
    iget-object v2, v0, LT5/a;->f:LJ5/w;

    .line 1108
    .line 1109
    const/16 v3, 0x80

    .line 1110
    .line 1111
    invoke-interface {v2, v3, v5}, LJ5/w;->c(ILY4/b;)V

    .line 1112
    .line 1113
    .line 1114
    const/4 v12, 0x2

    .line 1115
    iput v12, v0, LT5/a;->g:I

    .line 1116
    .line 1117
    goto/16 :goto_6

    .line 1118
    .line 1119
    :cond_46
    :goto_1a
    invoke-virtual {v1}, LY4/b;->a()I

    .line 1120
    .line 1121
    .line 1122
    move-result v2

    .line 1123
    if-lez v2, :cond_e

    .line 1124
    .line 1125
    iget-boolean v2, v0, LT5/a;->i:Z

    .line 1126
    .line 1127
    if-nez v2, :cond_48

    .line 1128
    .line 1129
    invoke-virtual {v1}, LY4/b;->q()I

    .line 1130
    .line 1131
    .line 1132
    move-result v2

    .line 1133
    if-ne v2, v4, :cond_47

    .line 1134
    .line 1135
    const/4 v12, 0x1

    .line 1136
    goto :goto_1b

    .line 1137
    :cond_47
    const/4 v12, 0x0

    .line 1138
    :goto_1b
    iput-boolean v12, v0, LT5/a;->i:Z

    .line 1139
    .line 1140
    goto :goto_1a

    .line 1141
    :cond_48
    invoke-virtual {v1}, LY4/b;->q()I

    .line 1142
    .line 1143
    .line 1144
    move-result v2

    .line 1145
    const/16 v3, 0x77

    .line 1146
    .line 1147
    if-ne v2, v3, :cond_49

    .line 1148
    .line 1149
    const/4 v12, 0x0

    .line 1150
    iput-boolean v12, v0, LT5/a;->i:Z

    .line 1151
    .line 1152
    const/4 v10, 0x1

    .line 1153
    iput v10, v0, LT5/a;->g:I

    .line 1154
    .line 1155
    iget-object v2, v5, LY4/b;->a:[B

    .line 1156
    .line 1157
    aput-byte v4, v2, v12

    .line 1158
    .line 1159
    aput-byte v3, v2, v10

    .line 1160
    .line 1161
    const/4 v15, 0x2

    .line 1162
    iput v15, v0, LT5/a;->h:I

    .line 1163
    .line 1164
    goto/16 :goto_6

    .line 1165
    .line 1166
    :cond_49
    const/4 v10, 0x1

    .line 1167
    const/4 v12, 0x0

    .line 1168
    const/4 v15, 0x2

    .line 1169
    if-ne v2, v4, :cond_4a

    .line 1170
    .line 1171
    move v2, v10

    .line 1172
    goto :goto_1c

    .line 1173
    :cond_4a
    move v2, v12

    .line 1174
    :goto_1c
    iput-boolean v2, v0, LT5/a;->i:Z

    .line 1175
    .line 1176
    goto :goto_1a

    .line 1177
    :cond_4b
    return-void

    .line 1178
    nop

    .line 1179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(IJ)V
    .locals 2

    .line 1
    iget p1, p0, LT5/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long p1, p2, v0

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iput-wide p2, p0, LT5/a;->m:J

    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p1, p2, v0

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iput-wide p2, p0, LT5/a;->m:J

    .line 28
    .line 29
    :cond_1
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(LJ5/m;LT5/B;)V
    .locals 1

    .line 1
    iget v0, p0, LT5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, LT5/B;->a()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, LT5/B;->b()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, LT5/a;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p2}, LT5/B;->b()V

    .line 17
    .line 18
    .line 19
    iget p2, p2, LT5/B;->e:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-interface {p1, p2, v0}, LJ5/m;->m(II)LJ5/w;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, LT5/a;->f:LJ5/w;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-virtual {p2}, LT5/B;->a()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, LT5/B;->b()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, LT5/a;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p2}, LT5/B;->b()V

    .line 40
    .line 41
    .line 42
    iget p2, p2, LT5/B;->e:I

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-interface {p1, p2, v0}, LJ5/m;->m(II)LJ5/w;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, LT5/a;->f:LJ5/w;

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()V
    .locals 1

    .line 1
    iget v0, p0, LT5/a;->a:I

    return-void
.end method
