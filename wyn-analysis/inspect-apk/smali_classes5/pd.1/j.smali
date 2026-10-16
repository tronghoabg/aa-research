.class public final Lpd/j;
.super Lod/d0;
.source "SourceFile"

# interfaces
.implements Lpd/u;


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public D:I

.field public final E:Lpd/d;

.field public final F:Lc7/l;

.field public final G:Lpd/m;

.field public H:Z

.field public final I:LXd/c;

.field public J:Lpd/v;

.field public K:I

.field public final synthetic L:Lpd/k;

.field public final v:I

.field public final w:Ljava/lang/Object;

.field public x:Ljava/util/ArrayList;

.field public final y:Lcg/g;

.field public z:Z


# direct methods
.method public constructor <init>(Lpd/k;ILod/W1;Ljava/lang/Object;Lpd/d;Lc7/l;Lpd/m;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpd/j;->L:Lpd/k;

    .line 2
    .line 3
    iget-object p1, p1, Lod/b;->c:Lod/a2;

    .line 4
    .line 5
    invoke-direct {p0, p2, p3, p1}, Lod/a;-><init>(ILod/W1;Lod/a2;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    iput-object p1, p0, Lod/d0;->s:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    new-instance p1, Lcg/g;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lpd/j;->y:Lcg/g;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lpd/j;->z:Z

    .line 21
    .line 22
    iput-boolean p1, p0, Lpd/j;->A:Z

    .line 23
    .line 24
    iput-boolean p1, p0, Lpd/j;->B:Z

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Lpd/j;->H:Z

    .line 28
    .line 29
    const/4 p1, -0x1

    .line 30
    iput p1, p0, Lpd/j;->K:I

    .line 31
    .line 32
    const-string p1, "lock"

    .line 33
    .line 34
    invoke-static {p4, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object p4, p0, Lpd/j;->w:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p5, p0, Lpd/j;->E:Lpd/d;

    .line 40
    .line 41
    iput-object p6, p0, Lpd/j;->F:Lc7/l;

    .line 42
    .line 43
    iput-object p7, p0, Lpd/j;->G:Lpd/m;

    .line 44
    .line 45
    iput p8, p0, Lpd/j;->C:I

    .line 46
    .line 47
    iput p8, p0, Lpd/j;->D:I

    .line 48
    .line 49
    iput p8, p0, Lpd/j;->v:I

    .line 50
    .line 51
    sget-object p1, LXd/b;->a:LXd/a;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object p1, LXd/a;->a:LXd/c;

    .line 57
    .line 58
    iput-object p1, p0, Lpd/j;->I:LXd/c;

    .line 59
    .line 60
    return-void
.end method

.method public static k(Lpd/j;Lmd/b0;Ljava/lang/String;)V
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lpd/j;->L:Lpd/k;

    .line 3
    .line 4
    iget-object v2, v1, Lpd/k;->m:Ljava/lang/String;

    .line 5
    .line 6
    iget-boolean v3, v1, Lpd/k;->q:Z

    .line 7
    .line 8
    iget-object v4, p0, Lpd/j;->G:Lpd/m;

    .line 9
    .line 10
    iget-object v5, v4, Lpd/m;->B:Ljavax/net/ssl/SSLSocketFactory;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    move v5, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v5, v6

    .line 18
    :goto_0
    sget-object v7, Lpd/e;->a:Lrd/b;

    .line 19
    .line 20
    const-string v7, "headers"

    .line 21
    .line 22
    invoke-static {p1, v7}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v7, "defaultPath"

    .line 26
    .line 27
    invoke-static {p2, v7}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v7, "authority"

    .line 31
    .line 32
    invoke-static {v2, v7}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object v7, Lod/a0;->i:Lmd/W;

    .line 36
    .line 37
    invoke-virtual {p1, v7}, Lmd/b0;->a(Lmd/Y;)V

    .line 38
    .line 39
    .line 40
    sget-object v7, Lod/a0;->j:Lmd/W;

    .line 41
    .line 42
    invoke-virtual {p1, v7}, Lmd/b0;->a(Lmd/Y;)V

    .line 43
    .line 44
    .line 45
    sget-object v7, Lod/a0;->k:Lmd/W;

    .line 46
    .line 47
    invoke-virtual {p1, v7}, Lmd/b0;->a(Lmd/Y;)V

    .line 48
    .line 49
    .line 50
    new-instance v8, Ljava/util/ArrayList;

    .line 51
    .line 52
    iget v9, p1, Lmd/b0;->b:I

    .line 53
    .line 54
    add-int/lit8 v9, v9, 0x7

    .line 55
    .line 56
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    sget-object v5, Lpd/e;->b:Lrd/b;

    .line 62
    .line 63
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    sget-object v5, Lpd/e;->a:Lrd/b;

    .line 68
    .line 69
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :goto_1
    if-eqz v3, :cond_2

    .line 73
    .line 74
    sget-object v3, Lpd/e;->d:Lrd/b;

    .line 75
    .line 76
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    sget-object v3, Lpd/e;->c:Lrd/b;

    .line 81
    .line 82
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :goto_2
    new-instance v3, Lrd/b;

    .line 86
    .line 87
    sget-object v5, Lrd/b;->h:Lcg/j;

    .line 88
    .line 89
    invoke-direct {v3, v5, v2}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    new-instance v2, Lrd/b;

    .line 96
    .line 97
    sget-object v3, Lrd/b;->f:Lcg/j;

    .line 98
    .line 99
    invoke-direct {v2, v3, p2}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    new-instance p2, Lrd/b;

    .line 106
    .line 107
    iget-object v2, v7, Lmd/Y;->a:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v3, v1, Lpd/k;->k:Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p2, v2, v3}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    sget-object p2, Lpd/e;->e:Lrd/b;

    .line 118
    .line 119
    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    sget-object p2, Lpd/e;->f:Lrd/b;

    .line 123
    .line 124
    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    sget-object p2, Lod/Z1;->a:Ljava/util/logging/Logger;

    .line 128
    .line 129
    sget-object p2, Lmd/G;->a:Ljava/nio/charset/Charset;

    .line 130
    .line 131
    iget p2, p1, Lmd/b0;->b:I

    .line 132
    .line 133
    mul-int/lit8 p2, p2, 0x2

    .line 134
    .line 135
    new-array v2, p2, [[B

    .line 136
    .line 137
    iget-object v3, p1, Lmd/b0;->a:[Ljava/lang/Object;

    .line 138
    .line 139
    instance-of v5, v3, [[B

    .line 140
    .line 141
    if-eqz v5, :cond_3

    .line 142
    .line 143
    invoke-static {v3, v6, v2, v6, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_3
    move v3, v6

    .line 148
    :goto_3
    iget v5, p1, Lmd/b0;->b:I

    .line 149
    .line 150
    if-ge v3, v5, :cond_5

    .line 151
    .line 152
    mul-int/lit8 v5, v3, 0x2

    .line 153
    .line 154
    invoke-virtual {p1, v3}, Lmd/b0;->e(I)[B

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    aput-object v7, v2, v5

    .line 159
    .line 160
    add-int/2addr v5, v0

    .line 161
    iget-object v7, p1, Lmd/b0;->a:[Ljava/lang/Object;

    .line 162
    .line 163
    aget-object v7, v7, v5

    .line 164
    .line 165
    instance-of v9, v7, [B

    .line 166
    .line 167
    if-eqz v9, :cond_4

    .line 168
    .line 169
    check-cast v7, [B

    .line 170
    .line 171
    aput-object v7, v2, v5

    .line 172
    .line 173
    add-int/2addr v3, v0

    .line 174
    goto :goto_3

    .line 175
    :cond_4
    invoke-static {v7}, LVa/M6;->z(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    const/4 p0, 0x0

    .line 179
    throw p0

    .line 180
    :cond_5
    :goto_4
    move p1, v6

    .line 181
    move v3, p1

    .line 182
    :goto_5
    if-ge p1, p2, :cond_a

    .line 183
    .line 184
    aget-object v5, v2, p1

    .line 185
    .line 186
    add-int/lit8 v7, p1, 0x1

    .line 187
    .line 188
    aget-object v7, v2, v7

    .line 189
    .line 190
    sget-object v9, Lod/Z1;->b:[B

    .line 191
    .line 192
    invoke-static {v5, v9}, Lod/Z1;->a([B[B)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-eqz v9, :cond_6

    .line 197
    .line 198
    aput-object v5, v2, v3

    .line 199
    .line 200
    add-int/lit8 v5, v3, 0x1

    .line 201
    .line 202
    sget-object v9, Lmd/G;->b:Lm8/c;

    .line 203
    .line 204
    invoke-virtual {v9, v7}, Lm8/e;->c([B)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    sget-object v9, Lk8/g;->a:Ljava/nio/charset/Charset;

    .line 209
    .line 210
    invoke-virtual {v7, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    aput-object v7, v2, v5

    .line 215
    .line 216
    :goto_6
    add-int/lit8 v3, v3, 0x2

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_6
    array-length v9, v7

    .line 220
    move v10, v6

    .line 221
    :goto_7
    if-ge v10, v9, :cond_9

    .line 222
    .line 223
    aget-byte v11, v7, v10

    .line 224
    .line 225
    const/16 v12, 0x20

    .line 226
    .line 227
    if-lt v11, v12, :cond_8

    .line 228
    .line 229
    const/16 v12, 0x7e

    .line 230
    .line 231
    if-le v11, v12, :cond_7

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_7
    add-int/2addr v10, v0

    .line 235
    goto :goto_7

    .line 236
    :cond_8
    :goto_8
    new-instance v9, Ljava/lang/String;

    .line 237
    .line 238
    sget-object v10, Lk8/g;->a:Ljava/nio/charset/Charset;

    .line 239
    .line 240
    invoke-direct {v9, v5, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 241
    .line 242
    .line 243
    const-string v5, "Metadata key="

    .line 244
    .line 245
    const-string v10, ", value="

    .line 246
    .line 247
    invoke-static {v5, v9, v10}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-static {v7}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string v7, " contains invalid ASCII characters"

    .line 259
    .line 260
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    sget-object v7, Lod/Z1;->a:Ljava/util/logging/Logger;

    .line 268
    .line 269
    invoke-virtual {v7, v5}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_9
    aput-object v5, v2, v3

    .line 274
    .line 275
    add-int/lit8 v5, v3, 0x1

    .line 276
    .line 277
    aput-object v7, v2, v5

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :goto_9
    add-int/lit8 p1, p1, 0x2

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_a
    if-ne v3, p2, :cond_b

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_b
    invoke-static {v2, v6, v3}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    move-object v2, p1

    .line 291
    check-cast v2, [[B

    .line 292
    .line 293
    :goto_a
    move p1, v6

    .line 294
    :goto_b
    array-length p2, v2

    .line 295
    if-ge p1, p2, :cond_e

    .line 296
    .line 297
    aget-object p2, v2, p1

    .line 298
    .line 299
    invoke-static {p2}, Lcg/j;->l([B)Lcg/j;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    iget-object v3, p2, Lcg/j;->a:[B

    .line 304
    .line 305
    array-length v5, v3

    .line 306
    if-eqz v5, :cond_d

    .line 307
    .line 308
    aget-byte v3, v3, v6

    .line 309
    .line 310
    const/16 v5, 0x3a

    .line 311
    .line 312
    if-ne v3, v5, :cond_c

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_c
    add-int/lit8 v3, p1, 0x1

    .line 316
    .line 317
    aget-object v3, v2, v3

    .line 318
    .line 319
    invoke-static {v3}, Lcg/j;->l([B)Lcg/j;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    new-instance v5, Lrd/b;

    .line 324
    .line 325
    invoke-direct {v5, p2, v3}, Lrd/b;-><init>(Lcg/j;Lcg/j;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    :cond_d
    :goto_c
    add-int/lit8 p1, p1, 0x2

    .line 332
    .line 333
    goto :goto_b

    .line 334
    :cond_e
    iput-object v8, p0, Lpd/j;->x:Ljava/util/ArrayList;

    .line 335
    .line 336
    iget-object p0, v4, Lpd/m;->v:Lmd/k0;

    .line 337
    .line 338
    if-eqz p0, :cond_f

    .line 339
    .line 340
    sget-object p1, Lod/s;->d:Lod/s;

    .line 341
    .line 342
    new-instance p2, Lmd/b0;

    .line 343
    .line 344
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 345
    .line 346
    .line 347
    iget-object v1, v1, Lpd/k;->n:Lpd/j;

    .line 348
    .line 349
    invoke-virtual {v1, p0, p1, v0, p2}, Lod/a;->g(Lmd/k0;Lod/s;ZLmd/b0;)V

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :cond_f
    iget-object p0, v4, Lpd/m;->n:Ljava/util/HashMap;

    .line 354
    .line 355
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 356
    .line 357
    .line 358
    move-result p0

    .line 359
    iget p1, v4, Lpd/m;->C:I

    .line 360
    .line 361
    if-lt p0, p1, :cond_12

    .line 362
    .line 363
    iget-object p0, v4, Lpd/m;->D:Ljava/util/LinkedList;

    .line 364
    .line 365
    invoke-virtual {p0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    iget-boolean p0, v4, Lpd/m;->z:Z

    .line 369
    .line 370
    if-nez p0, :cond_10

    .line 371
    .line 372
    iput-boolean v0, v4, Lpd/m;->z:Z

    .line 373
    .line 374
    iget-object p0, v4, Lpd/m;->F:Lod/u0;

    .line 375
    .line 376
    if-eqz p0, :cond_10

    .line 377
    .line 378
    invoke-virtual {p0}, Lod/u0;->b()V

    .line 379
    .line 380
    .line 381
    :cond_10
    iget-boolean p0, v1, Lod/b;->e:Z

    .line 382
    .line 383
    if-eqz p0, :cond_11

    .line 384
    .line 385
    iget-object p0, v4, Lpd/m;->M:Lod/g0;

    .line 386
    .line 387
    invoke-virtual {p0, v1, v0}, LA7/B0;->W(Ljava/lang/Object;Z)V

    .line 388
    .line 389
    .line 390
    :cond_11
    return-void

    .line 391
    :cond_12
    invoke-virtual {v4, v1}, Lpd/m;->w(Lpd/k;)V

    .line 392
    .line 393
    .line 394
    return-void
.end method

.method public static l(Lpd/j;Lcg/g;ZZ)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lpd/j;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lpd/j;->H:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-wide v0, p1, Lcg/g;->b:J

    .line 11
    .line 12
    long-to-int v0, v0

    .line 13
    iget-object v1, p0, Lpd/j;->y:Lcg/g;

    .line 14
    .line 15
    int-to-long v2, v0

    .line 16
    invoke-virtual {v1, p1, v2, v3}, Lcg/g;->E(Lcg/g;J)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Lpd/j;->z:Z

    .line 20
    .line 21
    or-int/2addr p1, p2

    .line 22
    iput-boolean p1, p0, Lpd/j;->z:Z

    .line 23
    .line 24
    iget-boolean p1, p0, Lpd/j;->A:Z

    .line 25
    .line 26
    or-int/2addr p1, p3

    .line 27
    iput-boolean p1, p0, Lpd/j;->A:Z

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget v0, p0, Lpd/j;->K:I

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    if-eq v0, v1, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    :goto_0
    const-string v1, "streamId should be set"

    .line 39
    .line 40
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lpd/j;->F:Lc7/l;

    .line 44
    .line 45
    iget-object p0, p0, Lpd/j;->J:Lpd/v;

    .line 46
    .line 47
    invoke-virtual {v0, p2, p0, p1, p3}, Lc7/l;->a(ZLpd/v;Lcg/g;Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    iget v0, p0, Lpd/j;->D:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    iput v0, p0, Lpd/j;->D:I

    .line 5
    .line 6
    int-to-float p1, v0

    .line 7
    iget v1, p0, Lpd/j;->v:I

    .line 8
    .line 9
    int-to-float v2, v1

    .line 10
    const/high16 v3, 0x3f000000    # 0.5f

    .line 11
    .line 12
    mul-float/2addr v2, v3

    .line 13
    cmpg-float p1, p1, v2

    .line 14
    .line 15
    if-gtz p1, :cond_0

    .line 16
    .line 17
    sub-int/2addr v1, v0

    .line 18
    iget p1, p0, Lpd/j;->C:I

    .line 19
    .line 20
    add-int/2addr p1, v1

    .line 21
    iput p1, p0, Lpd/j;->C:I

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    iput v0, p0, Lpd/j;->D:I

    .line 25
    .line 26
    iget p1, p0, Lpd/j;->K:I

    .line 27
    .line 28
    int-to-long v0, v1

    .line 29
    iget-object v2, p0, Lpd/j;->E:Lpd/d;

    .line 30
    .line 31
    invoke-virtual {v2, p1, v0, v1}, Lpd/d;->o(IJ)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lod/a;->n:Z

    .line 2
    .line 3
    sget-object v4, Lod/s;->a:Lod/s;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lpd/j;->G:Lpd/m;

    .line 8
    .line 9
    iget v2, p0, Lpd/j;->K:I

    .line 10
    .line 11
    sget-object v6, Lrd/a;->i:Lrd/a;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual/range {v1 .. v7}, Lpd/m;->j(ILmd/k0;Lod/s;ZLrd/a;Lmd/b0;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v1, p0, Lpd/j;->G:Lpd/m;

    .line 21
    .line 22
    iget v2, p0, Lpd/j;->K:I

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-virtual/range {v1 .. v7}, Lpd/m;->j(ILmd/k0;Lod/s;ZLrd/a;Lmd/b0;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-boolean v0, p0, Lod/a;->o:Z

    .line 32
    .line 33
    const-string v1, "status should have been reported on deframer closed"

    .line 34
    .line 35
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Lod/a;->l:Z

    .line 40
    .line 41
    iget-boolean v1, p0, Lod/a;->p:Z

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 48
    .line 49
    const-string v1, "Encountered end-of-stream mid-frame"

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v1, Lmd/b0;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, v0, v1}, Lod/a;->h(Lmd/k0;ZLmd/b0;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object p1, p0, Lod/a;->m:LA7/W0;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1}, LA7/W0;->run()V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    iput-object p1, p0, Lod/a;->m:LA7/W0;

    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public final m(Lmd/k0;ZLmd/b0;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lpd/j;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lpd/j;->B:Z

    .line 8
    .line 9
    iget-boolean v1, p0, Lpd/j;->H:Z

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-object p2, p0, Lpd/j;->G:Lpd/m;

    .line 14
    .line 15
    iget-object v1, p2, Lpd/m;->D:Ljava/util/LinkedList;

    .line 16
    .line 17
    iget-object v2, p0, Lpd/j;->L:Lpd/k;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v2}, Lpd/m;->p(Lpd/k;)V

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    iput-object p2, p0, Lpd/j;->x:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object p2, p0, Lpd/j;->y:Lcg/g;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcg/g;->a()V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    iput-boolean p2, p0, Lpd/j;->H:Z

    .line 35
    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p3, Lmd/b0;

    .line 40
    .line 41
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lod/a;->h(Lmd/k0;ZLmd/b0;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget v2, p0, Lpd/j;->K:I

    .line 49
    .line 50
    sget-object v4, Lod/s;->a:Lod/s;

    .line 51
    .line 52
    sget-object v6, Lrd/a;->i:Lrd/a;

    .line 53
    .line 54
    iget-object v1, p0, Lpd/j;->G:Lpd/m;

    .line 55
    .line 56
    move-object v3, p1

    .line 57
    move v5, p2

    .line 58
    move-object v7, p3

    .line 59
    invoke-virtual/range {v1 .. v7}, Lpd/m;->j(ILmd/k0;Lod/s;ZLrd/a;Lmd/b0;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lmd/k0;->e(Ljava/lang/Throwable;)Lmd/k0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lmd/b0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, p1, v1, v0}, Lpd/j;->m(Lmd/k0;ZLmd/b0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final o()Lpd/v;
    .locals 2

    .line 1
    iget-object v0, p0, Lpd/j;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/j;->J:Lpd/v;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final p(ILcg/g;Z)V
    .locals 7

    .line 1
    const/4 v1, 0x1

    .line 2
    const/4 v2, 0x0

    .line 3
    iget-wide v3, p2, Lcg/g;->b:J

    .line 4
    .line 5
    long-to-int v0, v3

    .line 6
    iget v5, p0, Lpd/j;->C:I

    .line 7
    .line 8
    add-int/2addr v0, p1

    .line 9
    sub-int/2addr v5, v0

    .line 10
    iput v5, p0, Lpd/j;->C:I

    .line 11
    .line 12
    iget v0, p0, Lpd/j;->D:I

    .line 13
    .line 14
    sub-int/2addr v0, p1

    .line 15
    iput v0, p0, Lpd/j;->D:I

    .line 16
    .line 17
    if-gez v5, :cond_0

    .line 18
    .line 19
    iget p1, p0, Lpd/j;->K:I

    .line 20
    .line 21
    sget-object p2, Lrd/a;->e:Lrd/a;

    .line 22
    .line 23
    iget-object p3, p0, Lpd/j;->E:Lpd/d;

    .line 24
    .line 25
    invoke-virtual {p3, p1, p2}, Lpd/d;->h(ILrd/a;)V

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lpd/j;->K:I

    .line 29
    .line 30
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 31
    .line 32
    const-string p2, "Received data size exceeded our receiving window size"

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v3, Lod/s;->a:Lod/s;

    .line 39
    .line 40
    iget-object v0, p0, Lpd/j;->G:Lpd/m;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-virtual/range {v0 .. v6}, Lpd/m;->j(ILmd/k0;Lod/s;ZLrd/a;Lmd/b0;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    new-instance p1, Lpd/q;

    .line 50
    .line 51
    invoke-direct {p1, p2}, Lpd/q;-><init>(Lcg/g;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lod/d0;->q:Lmd/k0;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, Lod/d0;->s:Ljava/nio/charset/Charset;

    .line 59
    .line 60
    sget-object v3, Lod/r1;->a:Lod/q1;

    .line 61
    .line 62
    const-string v3, "charset"

    .line 63
    .line 64
    invoke-static {v1, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-wide v3, p2, Lcg/g;->b:J

    .line 68
    .line 69
    long-to-int p2, v3

    .line 70
    new-array v3, p2, [B

    .line 71
    .line 72
    invoke-virtual {p1, v2, p2, v3}, Lpd/q;->i(II[B)V

    .line 73
    .line 74
    .line 75
    new-instance p2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {p2, v3, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "DATA-----------------------------\n"

    .line 81
    .line 82
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {v0, p2}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    iput-object p2, p0, Lod/d0;->q:Lmd/k0;

    .line 91
    .line 92
    invoke-virtual {p1}, Lpd/q;->close()V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 96
    .line 97
    iget-object p1, p1, Lmd/k0;->b:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    const/16 p2, 0x3e8

    .line 104
    .line 105
    if-gt p1, p2, :cond_1

    .line 106
    .line 107
    if-eqz p3, :cond_9

    .line 108
    .line 109
    :cond_1
    iget-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 110
    .line 111
    iget-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 112
    .line 113
    invoke-virtual {p0, p1, v2, p2}, Lpd/j;->m(Lmd/k0;ZLmd/b0;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_2
    iget-boolean p2, p0, Lod/d0;->t:Z

    .line 118
    .line 119
    if-nez p2, :cond_3

    .line 120
    .line 121
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 122
    .line 123
    const-string p2, "headers not received before payload"

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance p2, Lmd/b0;

    .line 130
    .line 131
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1, v2, p2}, Lpd/j;->m(Lmd/k0;ZLmd/b0;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    long-to-int p2, v3

    .line 139
    :try_start_0
    iget-boolean v0, p0, Lod/a;->o:Z

    .line 140
    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    sget-object v0, Lod/b;->i:Ljava/util/logging/Logger;

    .line 144
    .line 145
    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 146
    .line 147
    const-string v4, "Received data on closed stream"

    .line 148
    .line 149
    invoke-virtual {v0, v3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lpd/q;->close()V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    move-object p2, v0

    .line 158
    goto :goto_4

    .line 159
    :cond_4
    :try_start_1
    iget-object v0, p0, Lod/a;->a:Lod/W0;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 162
    .line 163
    .line 164
    :try_start_2
    invoke-virtual {v0}, Lod/W0;->isClosed()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-nez v3, :cond_6

    .line 169
    .line 170
    iget-boolean v3, v0, Lod/W0;->q:Z

    .line 171
    .line 172
    if-eqz v3, :cond_5

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_5
    iget-object v3, v0, Lod/W0;->l:Lod/x;

    .line 176
    .line 177
    invoke-virtual {v3, p1}, Lod/x;->J(Lod/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 178
    .line 179
    .line 180
    :try_start_3
    invoke-virtual {v0}, Lod/W0;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    move v1, v2

    .line 186
    goto :goto_1

    .line 187
    :catchall_2
    move-exception v0

    .line 188
    goto :goto_1

    .line 189
    :cond_6
    :goto_0
    :try_start_4
    invoke-virtual {p1}, Lpd/q;->close()V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :goto_1
    if-eqz v1, :cond_7

    .line 194
    .line 195
    invoke-virtual {p1}, Lpd/q;->close()V

    .line 196
    .line 197
    .line 198
    :cond_7
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 199
    :catchall_3
    move-exception v0

    .line 200
    :try_start_5
    invoke-virtual {p0, v0}, Lpd/j;->n(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 201
    .line 202
    .line 203
    :goto_2
    if-eqz p3, :cond_9

    .line 204
    .line 205
    if-lez p2, :cond_8

    .line 206
    .line 207
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 208
    .line 209
    const-string p2, "Received unexpected EOS on non-empty DATA frame from server"

    .line 210
    .line 211
    invoke-virtual {p1, p2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_8
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 219
    .line 220
    const-string p2, "Received unexpected EOS on empty DATA frame from server"

    .line 221
    .line 222
    invoke-virtual {p1, p2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 227
    .line 228
    :goto_3
    new-instance p1, Lmd/b0;

    .line 229
    .line 230
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 231
    .line 232
    .line 233
    iput-object p1, p0, Lod/d0;->r:Lmd/b0;

    .line 234
    .line 235
    iget-object p2, p0, Lod/d0;->q:Lmd/k0;

    .line 236
    .line 237
    invoke-virtual {p0, p2, v2, p1}, Lod/a;->h(Lmd/k0;ZLmd/b0;)V

    .line 238
    .line 239
    .line 240
    :cond_9
    return-void

    .line 241
    :catchall_4
    move-exception v0

    .line 242
    move-object p2, v0

    .line 243
    move v1, v2

    .line 244
    :goto_4
    if-eqz v1, :cond_a

    .line 245
    .line 246
    invoke-virtual {p1}, Lpd/q;->close()V

    .line 247
    .line 248
    .line 249
    :cond_a
    throw p2
.end method

.method public final q(Ljava/util/ArrayList;Z)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    sget-object v3, Lod/d0;->u:Lmd/Z;

    .line 5
    .line 6
    if-eqz p2, :cond_7

    .line 7
    .line 8
    invoke-static {p1}, Lpd/w;->a(Ljava/util/ArrayList;)[[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Lmd/b0;

    .line 13
    .line 14
    array-length v4, p1

    .line 15
    div-int/2addr v4, v2

    .line 16
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput v4, p2, Lmd/b0;->b:I

    .line 20
    .line 21
    iput-object p1, p2, Lmd/b0;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iget-boolean p1, p0, Lod/d0;->t:Z

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    invoke-static {p2}, Lod/d0;->j(Lmd/b0;)Lmd/k0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iput-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 40
    .line 41
    :cond_0
    iget-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "trailers: "

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1, p2}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 64
    .line 65
    iget-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 66
    .line 67
    invoke-virtual {p0, p1, v0, p2}, Lpd/j;->m(Lmd/k0;ZLmd/b0;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    sget-object p1, Lmd/H;->b:Lmd/Z;

    .line 72
    .line 73
    invoke-virtual {p2, p1}, Lmd/b0;->c(Lmd/Y;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lmd/k0;

    .line 78
    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    sget-object v5, Lmd/H;->a:Lmd/Z;

    .line 82
    .line 83
    invoke-virtual {p2, v5}, Lmd/b0;->c(Lmd/Y;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v4, v5}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    iget-boolean v4, p0, Lod/d0;->t:Z

    .line 95
    .line 96
    if-eqz v4, :cond_3

    .line 97
    .line 98
    sget-object v4, Lmd/k0;->g:Lmd/k0;

    .line 99
    .line 100
    const-string v5, "missing GRPC status in response"

    .line 101
    .line 102
    invoke-virtual {v4, v5}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    invoke-virtual {p2, v3}, Lmd/b0;->c(Lmd/Y;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Ljava/lang/Integer;

    .line 112
    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-static {v4}, Lod/a0;->g(I)Lmd/k0;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    goto :goto_0

    .line 124
    :cond_4
    sget-object v4, Lmd/k0;->m:Lmd/k0;

    .line 125
    .line 126
    const-string v5, "missing HTTP status code"

    .line 127
    .line 128
    invoke-virtual {v4, v5}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    :goto_0
    const-string v5, "missing GRPC status, inferred error from HTTP status code"

    .line 133
    .line 134
    invoke-virtual {v4, v5}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    :goto_1
    invoke-virtual {p2, v3}, Lmd/b0;->a(Lmd/Y;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, p1}, Lmd/b0;->a(Lmd/Y;)V

    .line 142
    .line 143
    .line 144
    sget-object p1, Lmd/H;->a:Lmd/Z;

    .line 145
    .line 146
    invoke-virtual {p2, p1}, Lmd/b0;->a(Lmd/Y;)V

    .line 147
    .line 148
    .line 149
    iget-boolean p1, p0, Lod/a;->o:Z

    .line 150
    .line 151
    if-eqz p1, :cond_5

    .line 152
    .line 153
    sget-object p1, Lod/b;->i:Ljava/util/logging/Logger;

    .line 154
    .line 155
    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 156
    .line 157
    const-string v5, "Received trailers on closed stream:\n {1}\n {2}"

    .line 158
    .line 159
    new-array v2, v2, [Ljava/lang/Object;

    .line 160
    .line 161
    aput-object v4, v2, v0

    .line 162
    .line 163
    aput-object p2, v2, v1

    .line 164
    .line 165
    invoke-virtual {p1, v3, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_5
    iget-object p1, p0, Lod/a;->h:Lod/W1;

    .line 170
    .line 171
    iget-object p1, p1, Lod/W1;->a:[Lmd/i;

    .line 172
    .line 173
    array-length v2, p1

    .line 174
    move v3, v0

    .line 175
    :goto_2
    if-ge v3, v2, :cond_6

    .line 176
    .line 177
    aget-object v5, p1, v3

    .line 178
    .line 179
    invoke-virtual {v5, p2}, Lmd/i;->e(Lmd/b0;)V

    .line 180
    .line 181
    .line 182
    add-int/2addr v3, v1

    .line 183
    goto :goto_2

    .line 184
    :cond_6
    sget-object p1, Lod/s;->a:Lod/s;

    .line 185
    .line 186
    invoke-virtual {p0, v4, p1, v0, p2}, Lod/a;->g(Lmd/k0;Lod/s;ZLmd/b0;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_7
    invoke-static {p1}, Lpd/w;->a(Ljava/util/ArrayList;)[[B

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    new-instance p2, Lmd/b0;

    .line 195
    .line 196
    array-length v0, p1

    .line 197
    div-int/2addr v0, v2

    .line 198
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    iput v0, p2, Lmd/b0;->b:I

    .line 202
    .line 203
    iput-object p1, p2, Lmd/b0;->a:[Ljava/lang/Object;

    .line 204
    .line 205
    iget-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 206
    .line 207
    const-string v0, "headers: "

    .line 208
    .line 209
    if-eqz p1, :cond_8

    .line 210
    .line 211
    new-instance v1, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-virtual {p1, p2}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 228
    .line 229
    return-void

    .line 230
    :cond_8
    :try_start_0
    iget-boolean p1, p0, Lod/d0;->t:Z

    .line 231
    .line 232
    if-eqz p1, :cond_9

    .line 233
    .line 234
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 235
    .line 236
    const-string v1, "Received headers twice"

    .line 237
    .line 238
    invoke-virtual {p1, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    .line 244
    new-instance v1, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p1, v0}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 261
    .line 262
    iput-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 263
    .line 264
    invoke-static {p2}, Lod/d0;->i(Lmd/b0;)Ljava/nio/charset/Charset;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    iput-object p1, p0, Lod/d0;->s:Ljava/nio/charset/Charset;

    .line 269
    .line 270
    return-void

    .line 271
    :catchall_0
    move-exception p1

    .line 272
    goto/16 :goto_3

    .line 273
    .line 274
    :cond_9
    :try_start_1
    invoke-virtual {p2, v3}, Lmd/b0;->c(Lmd/Y;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    check-cast p1, Ljava/lang/Integer;

    .line 279
    .line 280
    if-eqz p1, :cond_a

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    const/16 v4, 0x64

    .line 287
    .line 288
    if-lt v2, v4, :cond_a

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 291
    .line 292
    .line 293
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 294
    const/16 v2, 0xc8

    .line 295
    .line 296
    if-ge p1, v2, :cond_a

    .line 297
    .line 298
    iget-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 299
    .line 300
    if-eqz p1, :cond_c

    .line 301
    .line 302
    new-instance v1, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {p1, v0}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 319
    .line 320
    iput-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 321
    .line 322
    invoke-static {p2}, Lod/d0;->i(Lmd/b0;)Ljava/nio/charset/Charset;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    iput-object p1, p0, Lod/d0;->s:Ljava/nio/charset/Charset;

    .line 327
    .line 328
    return-void

    .line 329
    :cond_a
    :try_start_2
    iput-boolean v1, p0, Lod/d0;->t:Z

    .line 330
    .line 331
    invoke-static {p2}, Lod/d0;->j(Lmd/b0;)Lmd/k0;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 336
    .line 337
    if-eqz p1, :cond_b

    .line 338
    .line 339
    new-instance v1, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {p1, v0}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 356
    .line 357
    iput-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 358
    .line 359
    invoke-static {p2}, Lod/d0;->i(Lmd/b0;)Ljava/nio/charset/Charset;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    iput-object p1, p0, Lod/d0;->s:Ljava/nio/charset/Charset;

    .line 364
    .line 365
    return-void

    .line 366
    :cond_b
    :try_start_3
    invoke-virtual {p2, v3}, Lmd/b0;->a(Lmd/Y;)V

    .line 367
    .line 368
    .line 369
    sget-object p1, Lmd/H;->b:Lmd/Z;

    .line 370
    .line 371
    invoke-virtual {p2, p1}, Lmd/b0;->a(Lmd/Y;)V

    .line 372
    .line 373
    .line 374
    sget-object p1, Lmd/H;->a:Lmd/Z;

    .line 375
    .line 376
    invoke-virtual {p2, p1}, Lmd/b0;->a(Lmd/Y;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0, p2}, Lod/a;->d(Lmd/b0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 380
    .line 381
    .line 382
    iget-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 383
    .line 384
    if-eqz p1, :cond_c

    .line 385
    .line 386
    new-instance v1, Ljava/lang/StringBuilder;

    .line 387
    .line 388
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {p1, v0}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    iput-object p1, p0, Lod/d0;->q:Lmd/k0;

    .line 403
    .line 404
    iput-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 405
    .line 406
    invoke-static {p2}, Lod/d0;->i(Lmd/b0;)Ljava/nio/charset/Charset;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    iput-object p1, p0, Lod/d0;->s:Ljava/nio/charset/Charset;

    .line 411
    .line 412
    :cond_c
    return-void

    .line 413
    :goto_3
    iget-object v1, p0, Lod/d0;->q:Lmd/k0;

    .line 414
    .line 415
    if-eqz v1, :cond_d

    .line 416
    .line 417
    new-instance v2, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v1, v0}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    iput-object v0, p0, Lod/d0;->q:Lmd/k0;

    .line 434
    .line 435
    iput-object p2, p0, Lod/d0;->r:Lmd/b0;

    .line 436
    .line 437
    invoke-static {p2}, Lod/d0;->i(Lmd/b0;)Ljava/nio/charset/Charset;

    .line 438
    .line 439
    .line 440
    move-result-object p2

    .line 441
    iput-object p2, p0, Lod/d0;->s:Ljava/nio/charset/Charset;

    .line 442
    .line 443
    :cond_d
    throw p1
.end method
