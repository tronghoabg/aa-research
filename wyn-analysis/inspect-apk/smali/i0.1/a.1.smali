.class public final Li0/a;
.super Li0/B;
.source "SourceFile"


# instance fields
.field public b:[F

.field public final c:Ljava/util/ArrayList;

.field public d:Ljava/util/List;

.field public e:Z

.field public f:Le0/f;

.field public g:LC8/i;

.field public h:LA0/p;

.field public i:Ljava/lang/String;

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li0/a;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    sget v0, Li0/I;->a:I

    .line 12
    .line 13
    sget-object v0, Lff/v;->a:Lff/v;

    .line 14
    .line 15
    iput-object v0, p0, Li0/a;->d:Ljava/util/List;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Li0/a;->e:Z

    .line 19
    .line 20
    const-string v1, ""

    .line 21
    .line 22
    iput-object v1, p0, Li0/a;->i:Ljava/lang/String;

    .line 23
    .line 24
    const/high16 v1, 0x3f800000    # 1.0f

    .line 25
    .line 26
    iput v1, p0, Li0/a;->m:F

    .line 27
    .line 28
    iput v1, p0, Li0/a;->n:F

    .line 29
    .line 30
    iput-boolean v0, p0, Li0/a;->q:Z

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lg0/d;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v2, v0, Li0/a;->q:Z

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, Li0/a;->b:[F

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-static {}, Le0/z;->h()[F

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, v0, Li0/a;->b:[F

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, Le0/z;->o([F)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget v4, v0, Li0/a;->o:F

    .line 30
    .line 31
    iget v5, v0, Li0/a;->k:F

    .line 32
    .line 33
    add-float/2addr v4, v5

    .line 34
    iget v5, v0, Li0/a;->p:F

    .line 35
    .line 36
    iget v6, v0, Li0/a;->l:F

    .line 37
    .line 38
    add-float/2addr v5, v6

    .line 39
    invoke-static {v2, v4, v5}, Le0/z;->v([FFF)V

    .line 40
    .line 41
    .line 42
    iget v4, v0, Li0/a;->j:F

    .line 43
    .line 44
    float-to-double v4, v4

    .line 45
    const-wide v6, 0x400921fb54442d18L    # Math.PI

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    mul-double/2addr v4, v6

    .line 51
    const-wide v6, 0x4066800000000000L    # 180.0

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    div-double/2addr v4, v6

    .line 57
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    double-to-float v6, v6

    .line 62
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    double-to-float v4, v4

    .line 67
    aget v5, v2, v3

    .line 68
    .line 69
    const/4 v7, 0x4

    .line 70
    aget v8, v2, v7

    .line 71
    .line 72
    mul-float v9, v6, v5

    .line 73
    .line 74
    mul-float v10, v4, v8

    .line 75
    .line 76
    add-float/2addr v10, v9

    .line 77
    neg-float v9, v4

    .line 78
    mul-float/2addr v5, v9

    .line 79
    mul-float/2addr v8, v6

    .line 80
    add-float/2addr v8, v5

    .line 81
    const/4 v5, 0x1

    .line 82
    aget v11, v2, v5

    .line 83
    .line 84
    const/4 v12, 0x5

    .line 85
    aget v13, v2, v12

    .line 86
    .line 87
    mul-float v14, v6, v11

    .line 88
    .line 89
    mul-float v15, v4, v13

    .line 90
    .line 91
    add-float/2addr v15, v14

    .line 92
    mul-float/2addr v11, v9

    .line 93
    mul-float/2addr v13, v6

    .line 94
    add-float/2addr v13, v11

    .line 95
    const/4 v11, 0x2

    .line 96
    aget v14, v2, v11

    .line 97
    .line 98
    const/16 v16, 0x6

    .line 99
    .line 100
    aget v17, v2, v16

    .line 101
    .line 102
    mul-float v18, v6, v14

    .line 103
    .line 104
    mul-float v19, v4, v17

    .line 105
    .line 106
    add-float v19, v19, v18

    .line 107
    .line 108
    mul-float/2addr v14, v9

    .line 109
    mul-float v17, v17, v6

    .line 110
    .line 111
    add-float v17, v17, v14

    .line 112
    .line 113
    const/4 v14, 0x3

    .line 114
    aget v18, v2, v14

    .line 115
    .line 116
    const/16 v20, 0x7

    .line 117
    .line 118
    aget v21, v2, v20

    .line 119
    .line 120
    mul-float v22, v6, v18

    .line 121
    .line 122
    mul-float v4, v4, v21

    .line 123
    .line 124
    add-float v4, v4, v22

    .line 125
    .line 126
    mul-float v9, v9, v18

    .line 127
    .line 128
    mul-float v6, v6, v21

    .line 129
    .line 130
    add-float/2addr v6, v9

    .line 131
    aput v10, v2, v3

    .line 132
    .line 133
    aput v15, v2, v5

    .line 134
    .line 135
    aput v19, v2, v11

    .line 136
    .line 137
    aput v4, v2, v14

    .line 138
    .line 139
    aput v8, v2, v7

    .line 140
    .line 141
    aput v13, v2, v12

    .line 142
    .line 143
    aput v17, v2, v16

    .line 144
    .line 145
    aput v6, v2, v20

    .line 146
    .line 147
    iget v9, v0, Li0/a;->m:F

    .line 148
    .line 149
    move/from16 v18, v5

    .line 150
    .line 151
    iget v5, v0, Li0/a;->n:F

    .line 152
    .line 153
    mul-float/2addr v10, v9

    .line 154
    aput v10, v2, v3

    .line 155
    .line 156
    mul-float/2addr v15, v9

    .line 157
    aput v15, v2, v18

    .line 158
    .line 159
    mul-float v19, v19, v9

    .line 160
    .line 161
    aput v19, v2, v11

    .line 162
    .line 163
    mul-float/2addr v4, v9

    .line 164
    aput v4, v2, v14

    .line 165
    .line 166
    mul-float/2addr v8, v5

    .line 167
    aput v8, v2, v7

    .line 168
    .line 169
    mul-float/2addr v13, v5

    .line 170
    aput v13, v2, v12

    .line 171
    .line 172
    mul-float v17, v17, v5

    .line 173
    .line 174
    aput v17, v2, v16

    .line 175
    .line 176
    mul-float/2addr v6, v5

    .line 177
    aput v6, v2, v20

    .line 178
    .line 179
    const/16 v4, 0x8

    .line 180
    .line 181
    aget v5, v2, v4

    .line 182
    .line 183
    const/high16 v6, 0x3f800000    # 1.0f

    .line 184
    .line 185
    mul-float/2addr v5, v6

    .line 186
    aput v5, v2, v4

    .line 187
    .line 188
    const/16 v4, 0x9

    .line 189
    .line 190
    aget v5, v2, v4

    .line 191
    .line 192
    mul-float/2addr v5, v6

    .line 193
    aput v5, v2, v4

    .line 194
    .line 195
    const/16 v4, 0xa

    .line 196
    .line 197
    aget v5, v2, v4

    .line 198
    .line 199
    mul-float/2addr v5, v6

    .line 200
    aput v5, v2, v4

    .line 201
    .line 202
    const/16 v4, 0xb

    .line 203
    .line 204
    aget v5, v2, v4

    .line 205
    .line 206
    mul-float/2addr v5, v6

    .line 207
    aput v5, v2, v4

    .line 208
    .line 209
    iget v4, v0, Li0/a;->k:F

    .line 210
    .line 211
    neg-float v4, v4

    .line 212
    iget v5, v0, Li0/a;->l:F

    .line 213
    .line 214
    neg-float v5, v5

    .line 215
    invoke-static {v2, v4, v5}, Le0/z;->v([FFF)V

    .line 216
    .line 217
    .line 218
    iput-boolean v3, v0, Li0/a;->q:Z

    .line 219
    .line 220
    :cond_1
    iget-boolean v2, v0, Li0/a;->e:Z

    .line 221
    .line 222
    if-eqz v2, :cond_5

    .line 223
    .line 224
    iget-object v2, v0, Li0/a;->d:Ljava/util/List;

    .line 225
    .line 226
    check-cast v2, Ljava/util/Collection;

    .line 227
    .line 228
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-nez v2, :cond_4

    .line 233
    .line 234
    iget-object v2, v0, Li0/a;->g:LC8/i;

    .line 235
    .line 236
    if-nez v2, :cond_2

    .line 237
    .line 238
    new-instance v2, LC8/i;

    .line 239
    .line 240
    const/16 v4, 0xd

    .line 241
    .line 242
    invoke-direct {v2, v4}, LC8/i;-><init>(I)V

    .line 243
    .line 244
    .line 245
    iput-object v2, v0, Li0/a;->g:LC8/i;

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_2
    iget-object v4, v2, LC8/i;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v4, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 253
    .line 254
    .line 255
    :goto_1
    iget-object v4, v0, Li0/a;->f:Le0/f;

    .line 256
    .line 257
    if-nez v4, :cond_3

    .line 258
    .line 259
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    iput-object v4, v0, Li0/a;->f:Le0/f;

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_3
    invoke-virtual {v4}, Le0/f;->c()V

    .line 267
    .line 268
    .line 269
    :goto_2
    iget-object v5, v0, Li0/a;->d:Ljava/util/List;

    .line 270
    .line 271
    const-string v6, "nodes"

    .line 272
    .line 273
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object v6, v2, LC8/i;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v6, Ljava/util/ArrayList;

    .line 279
    .line 280
    check-cast v5, Ljava/util/Collection;

    .line 281
    .line 282
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4}, LC8/i;->y(Le0/x;)V

    .line 286
    .line 287
    .line 288
    :cond_4
    iput-boolean v3, v0, Li0/a;->e:Z

    .line 289
    .line 290
    :cond_5
    invoke-interface {v1}, Lg0/d;->u()Lba/a;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v2}, Lba/a;->y()J

    .line 295
    .line 296
    .line 297
    move-result-wide v4

    .line 298
    invoke-virtual {v2}, Lba/a;->v()Le0/o;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-interface {v6}, Le0/o;->m()V

    .line 303
    .line 304
    .line 305
    iget-object v6, v2, Lba/a;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v6, Lad/L;

    .line 308
    .line 309
    iget-object v7, v0, Li0/a;->b:[F

    .line 310
    .line 311
    iget-object v6, v6, Lad/L;->b:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v6, Lba/a;

    .line 314
    .line 315
    if-eqz v7, :cond_6

    .line 316
    .line 317
    invoke-virtual {v6}, Lba/a;->v()Le0/o;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    invoke-interface {v8, v7}, Le0/o;->p([F)V

    .line 322
    .line 323
    .line 324
    :cond_6
    iget-object v7, v0, Li0/a;->f:Le0/f;

    .line 325
    .line 326
    iget-object v8, v0, Li0/a;->d:Ljava/util/List;

    .line 327
    .line 328
    check-cast v8, Ljava/util/Collection;

    .line 329
    .line 330
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-nez v8, :cond_7

    .line 335
    .line 336
    if-eqz v7, :cond_7

    .line 337
    .line 338
    invoke-virtual {v6}, Lba/a;->v()Le0/o;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-interface {v6, v7}, Le0/o;->l(Le0/x;)V

    .line 343
    .line 344
    .line 345
    :cond_7
    iget-object v6, v0, Li0/a;->c:Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    :goto_3
    if-ge v3, v7, :cond_8

    .line 352
    .line 353
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    check-cast v8, Li0/B;

    .line 358
    .line 359
    invoke-virtual {v8, v1}, Li0/B;->a(Lg0/d;)V

    .line 360
    .line 361
    .line 362
    add-int/lit8 v3, v3, 0x1

    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_8
    invoke-virtual {v2}, Lba/a;->v()Le0/o;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-interface {v1}, Le0/o;->restore()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v4, v5}, Lba/a;->J(J)V

    .line 373
    .line 374
    .line 375
    return-void
.end method

.method public final b()Ltf/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/a;->h:LA0/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(LA0/p;)V
    .locals 4

    .line 1
    iput-object p1, p0, Li0/a;->h:LA0/p;

    .line 2
    .line 3
    iget-object v0, p0, Li0/a;->c:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Li0/B;

    .line 17
    .line 18
    invoke-virtual {v3, p1}, Li0/B;->d(LA0/p;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final e(II)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p2, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Li0/a;->c:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge p1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Li0/B;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v2, v3}, Li0/B;->d(LA0/p;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0}, Li0/B;->c()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "VGroup: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Li0/a;->i:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Li0/a;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Li0/B;

    .line 27
    .line 28
    const-string v5, "\t"

    .line 29
    .line 30
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v4, "\n"

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "sb.toString()"

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method
