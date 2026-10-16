.class public final LB/a;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lb0/e;


# instance fields
.field public final b:Le0/q;

.field public final c:Le0/m;

.field public final d:F

.field public final e:Le0/E;

.field public f:Ld0/f;

.field public g:Le0/z;


# direct methods
.method public constructor <init>(Le0/q;Le0/u;Le0/E;I)V
    .locals 3

    .line 1
    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    .line 3
    and-int/lit8 v1, p4, 0x1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object p1, v2

    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    move-object p2, v2

    .line 14
    :cond_1
    invoke-direct {p0, v0}, LA7/B0;-><init>(Ltf/l;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LB/a;->b:Le0/q;

    .line 18
    .line 19
    iput-object p2, p0, LB/a;->c:Le0/m;

    .line 20
    .line 21
    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    iput p1, p0, LB/a;->d:F

    .line 24
    .line 25
    iput-object p3, p0, LB/a;->e:Le0/E;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final e(Lt0/v;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v11, 0x0

    .line 4
    const/16 v12, 0x9

    .line 5
    .line 6
    sget-object v1, Le0/z;->a:Lad/I;

    .line 7
    .line 8
    iget-object v9, v0, LB/a;->c:Le0/m;

    .line 9
    .line 10
    iget-object v2, v0, LB/a;->b:Le0/q;

    .line 11
    .line 12
    iget-object v3, v0, LB/a;->e:Le0/E;

    .line 13
    .line 14
    if-ne v3, v1, :cond_2

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/16 v8, 0x7e

    .line 20
    .line 21
    iget-wide v2, v2, Le0/q;->a:J

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    invoke-static/range {v1 .. v8}, Lcom/google/android/gms/internal/consent_sdk/a;->g(Lg0/d;JJFLe0/r;I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz v9, :cond_1

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    move-object v2, v9

    .line 35
    const/16 v9, 0x76

    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    iget v7, v0, LB/a;->d:F

    .line 42
    .line 43
    move-object/from16 v1, p1

    .line 44
    .line 45
    invoke-static/range {v1 .. v9}, Lcom/google/android/gms/internal/consent_sdk/a;->f(Lt0/v;Le0/m;JJFLg0/c;I)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_1
    move-object/from16 v1, p1

    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_2
    move-object/from16 v1, p1

    .line 55
    .line 56
    move-object v13, v9

    .line 57
    iget-object v4, v1, Lt0/v;->a:Lg0/b;

    .line 58
    .line 59
    iget-object v5, v4, Lg0/b;->b:Lba/a;

    .line 60
    .line 61
    invoke-virtual {v5}, Lba/a;->y()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    iget-object v7, v0, LB/a;->f:Ld0/f;

    .line 66
    .line 67
    sget v8, Ld0/f;->d:I

    .line 68
    .line 69
    instance-of v8, v7, Ld0/f;

    .line 70
    .line 71
    iget-object v14, v4, Lg0/b;->b:Lba/a;

    .line 72
    .line 73
    if-nez v8, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget-wide v7, v7, Ld0/f;->a:J

    .line 77
    .line 78
    cmp-long v5, v5, v7

    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-virtual {v1}, Lt0/v;->getLayoutDirection()LL0/i;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-nez v5, :cond_5

    .line 88
    .line 89
    iget-object v3, v0, LB/a;->g:Le0/z;

    .line 90
    .line 91
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    move-object v15, v3

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    :goto_1
    invoke-virtual {v14}, Lba/a;->y()J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    invoke-virtual {v1}, Lt0/v;->getLayoutDirection()LL0/i;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-interface {v3, v5, v6, v7, v1}, Le0/E;->b(JLL0/i;LL0/b;)Le0/z;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    goto :goto_0

    .line 109
    :goto_2
    sget-object v10, Lg0/f;->b:Lg0/f;

    .line 110
    .line 111
    if-eqz v2, :cond_9

    .line 112
    .line 113
    instance-of v3, v15, Le0/v;

    .line 114
    .line 115
    iget-wide v5, v2, Le0/q;->a:J

    .line 116
    .line 117
    if-eqz v3, :cond_6

    .line 118
    .line 119
    move-object v2, v15

    .line 120
    check-cast v2, Le0/v;

    .line 121
    .line 122
    iget-object v2, v2, Le0/v;->e:Ld0/d;

    .line 123
    .line 124
    iget v3, v2, Ld0/d;->b:F

    .line 125
    .line 126
    iget v4, v2, Ld0/d;->a:F

    .line 127
    .line 128
    invoke-static {v4, v3}, LU8/v0;->f(FF)J

    .line 129
    .line 130
    .line 131
    move-result-wide v19

    .line 132
    invoke-virtual {v2}, Ld0/d;->c()F

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-virtual {v2}, Ld0/d;->b()F

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {v3, v2}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 141
    .line 142
    .line 143
    move-result-wide v21

    .line 144
    iget-object v2, v1, Lt0/v;->a:Lg0/b;

    .line 145
    .line 146
    const/high16 v23, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/16 v25, 0x0

    .line 149
    .line 150
    const/16 v26, 0x3

    .line 151
    .line 152
    move-object/from16 v16, v2

    .line 153
    .line 154
    move-wide/from16 v17, v5

    .line 155
    .line 156
    move-object/from16 v24, v10

    .line 157
    .line 158
    invoke-virtual/range {v16 .. v26}, Lg0/b;->k(JJJFLg0/c;Le0/r;I)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    move-wide/from16 v17, v5

    .line 163
    .line 164
    instance-of v2, v15, Le0/w;

    .line 165
    .line 166
    if-eqz v2, :cond_8

    .line 167
    .line 168
    move-object v2, v15

    .line 169
    check-cast v2, Le0/w;

    .line 170
    .line 171
    iget-object v3, v2, Le0/w;->f:Le0/f;

    .line 172
    .line 173
    if-eqz v3, :cond_7

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v2, v4, Lg0/b;->a:Lg0/a;

    .line 179
    .line 180
    iget-object v2, v2, Lg0/a;->c:Le0/o;

    .line 181
    .line 182
    move-object v7, v10

    .line 183
    const/4 v10, 0x3

    .line 184
    const/high16 v8, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v9, 0x0

    .line 187
    move-wide/from16 v5, v17

    .line 188
    .line 189
    invoke-static/range {v4 .. v10}, Lg0/b;->a(Lg0/b;JLg0/c;FLe0/r;I)Lc7/l;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    move-object v10, v7

    .line 194
    invoke-interface {v2, v3, v4}, Le0/o;->c(Le0/f;Lc7/l;)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    iget-object v2, v2, Le0/w;->e:Ld0/e;

    .line 199
    .line 200
    iget-wide v3, v2, Ld0/e;->h:J

    .line 201
    .line 202
    invoke-static {v3, v4}, Ld0/a;->b(J)F

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    iget v4, v2, Ld0/e;->b:F

    .line 207
    .line 208
    iget v5, v2, Ld0/e;->a:F

    .line 209
    .line 210
    invoke-static {v5, v4}, LU8/v0;->f(FF)J

    .line 211
    .line 212
    .line 213
    move-result-wide v4

    .line 214
    invoke-virtual {v2}, Ld0/e;->b()F

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    invoke-virtual {v2}, Ld0/e;->a()F

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-static {v6, v2}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 223
    .line 224
    .line 225
    move-result-wide v6

    .line 226
    invoke-static {v3, v3}, LFe/g;->a(FF)J

    .line 227
    .line 228
    .line 229
    move-result-wide v8

    .line 230
    move-wide/from16 v2, v17

    .line 231
    .line 232
    invoke-virtual/range {v1 .. v10}, Lt0/v;->z(JJJJLg0/c;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    new-instance v1, LE5/Q;

    .line 237
    .line 238
    invoke-direct {v1, v11, v12}, LE5/Q;-><init>(BI)V

    .line 239
    .line 240
    .line 241
    throw v1

    .line 242
    :cond_9
    :goto_3
    if-eqz v13, :cond_d

    .line 243
    .line 244
    instance-of v1, v15, Le0/v;

    .line 245
    .line 246
    iget v7, v0, LB/a;->d:F

    .line 247
    .line 248
    if-eqz v1, :cond_a

    .line 249
    .line 250
    move-object v1, v15

    .line 251
    check-cast v1, Le0/v;

    .line 252
    .line 253
    iget-object v1, v1, Le0/v;->e:Ld0/d;

    .line 254
    .line 255
    iget v2, v1, Ld0/d;->b:F

    .line 256
    .line 257
    iget v3, v1, Ld0/d;->a:F

    .line 258
    .line 259
    invoke-static {v3, v2}, LU8/v0;->f(FF)J

    .line 260
    .line 261
    .line 262
    move-result-wide v3

    .line 263
    invoke-virtual {v1}, Ld0/d;->c()F

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    invoke-virtual {v1}, Ld0/d;->b()F

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-static {v2, v1}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 272
    .line 273
    .line 274
    move-result-wide v5

    .line 275
    move-object/from16 v1, p1

    .line 276
    .line 277
    move-object v8, v10

    .line 278
    move-object v2, v13

    .line 279
    invoke-virtual/range {v1 .. v8}, Lt0/v;->e(Le0/m;JJFLg0/c;)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_a
    move-object/from16 v1, p1

    .line 284
    .line 285
    move-object v2, v13

    .line 286
    instance-of v3, v15, Le0/w;

    .line 287
    .line 288
    if-eqz v3, :cond_c

    .line 289
    .line 290
    move-object v3, v15

    .line 291
    check-cast v3, Le0/w;

    .line 292
    .line 293
    iget-object v4, v3, Le0/w;->f:Le0/f;

    .line 294
    .line 295
    if-eqz v4, :cond_b

    .line 296
    .line 297
    invoke-virtual {v1, v4, v2, v7, v10}, Lt0/v;->i(Le0/f;Le0/m;FLg0/c;)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_b
    iget-object v3, v3, Le0/w;->e:Ld0/e;

    .line 302
    .line 303
    iget-wide v4, v3, Ld0/e;->h:J

    .line 304
    .line 305
    invoke-static {v4, v5}, Ld0/a;->b(J)F

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    iget v5, v3, Ld0/e;->b:F

    .line 310
    .line 311
    iget v6, v3, Ld0/e;->a:F

    .line 312
    .line 313
    invoke-static {v6, v5}, LU8/v0;->f(FF)J

    .line 314
    .line 315
    .line 316
    move-result-wide v5

    .line 317
    invoke-virtual {v3}, Ld0/e;->b()F

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    invoke-virtual {v3}, Ld0/e;->a()F

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    invoke-static {v8, v3}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 326
    .line 327
    .line 328
    move-result-wide v8

    .line 329
    invoke-static {v4, v4}, LFe/g;->a(FF)J

    .line 330
    .line 331
    .line 332
    move-result-wide v3

    .line 333
    move-wide/from16 v27, v8

    .line 334
    .line 335
    move v9, v7

    .line 336
    move-wide v7, v3

    .line 337
    move-wide v3, v5

    .line 338
    move-wide/from16 v5, v27

    .line 339
    .line 340
    invoke-virtual/range {v1 .. v10}, Lt0/v;->g(Le0/m;JJJFLg0/c;)V

    .line 341
    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_c
    new-instance v1, LE5/Q;

    .line 345
    .line 346
    invoke-direct {v1, v11, v12}, LE5/Q;-><init>(BI)V

    .line 347
    .line 348
    .line 349
    throw v1

    .line 350
    :cond_d
    :goto_4
    iput-object v15, v0, LB/a;->g:Le0/z;

    .line 351
    .line 352
    invoke-virtual {v14}, Lba/a;->y()J

    .line 353
    .line 354
    .line 355
    move-result-wide v1

    .line 356
    new-instance v3, Ld0/f;

    .line 357
    .line 358
    invoke-direct {v3, v1, v2}, Ld0/f;-><init>(J)V

    .line 359
    .line 360
    .line 361
    iput-object v3, v0, LB/a;->f:Ld0/f;

    .line 362
    .line 363
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lt0/v;->a()V

    .line 364
    .line 365
    .line 366
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, LB/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LB/a;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    iget-object v1, p0, LB/a;->b:Le0/q;

    .line 14
    .line 15
    iget-object v2, p1, LB/a;->b:Le0/q;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, LB/a;->c:Le0/m;

    .line 24
    .line 25
    iget-object v2, p1, LB/a;->c:Le0/m;

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget v1, p0, LB/a;->d:F

    .line 34
    .line 35
    iget v2, p1, LB/a;->d:F

    .line 36
    .line 37
    cmpg-float v1, v1, v2

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget-object v1, p0, LB/a;->e:Le0/E;

    .line 42
    .line 43
    iget-object p1, p1, LB/a;->e:Le0/E;

    .line 44
    .line 45
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_2
    return v0
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LB/a;->b:Le0/q;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-wide v1, v1, Le0/q;->a:J

    .line 7
    .line 8
    invoke-static {v1, v2}, Lef/w;->a(J)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v0

    .line 14
    :goto_0
    const/16 v2, 0x1f

    .line 15
    .line 16
    mul-int/2addr v1, v2

    .line 17
    iget-object v3, p0, LB/a;->c:Le0/m;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :cond_1
    add-int/2addr v1, v0

    .line 26
    mul-int/2addr v1, v2

    .line 27
    iget v0, p0, LB/a;->d:F

    .line 28
    .line 29
    invoke-static {v0, v1, v2}, LA/f;->c(FII)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v1, p0, LB/a;->e:Le0/E;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v1, v0

    .line 40
    return v1
.end method

.method public final p(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Background(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LB/a;->b:Le0/q;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", brush="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LB/a;->c:Le0/m;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", alpha = "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, LB/a;->d:F

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", shape="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LB/a;->e:Le0/E;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x29

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
