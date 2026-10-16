.class public final Ls2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/p;


# static fields
.field public static final h:[I

.field public static final i:Lba/a;

.field public static final j:Lba/a;


# instance fields
.field public a:Z

.field public b:Z

.field public c:I

.field public d:Ll8/e0;

.field public e:Z

.field public f:Lwa/a;

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, Ls2/k;->h:[I

    .line 13
    .line 14
    new-instance v0, Lba/a;

    .line 15
    .line 16
    new-instance v3, Lm9/B;

    .line 17
    .line 18
    invoke-direct {v3, v1}, Lm9/B;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v3}, Lba/a;-><init>(Lm9/B;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ls2/k;->i:Lba/a;

    .line 25
    .line 26
    new-instance v0, Lba/a;

    .line 27
    .line 28
    new-instance v1, Lm9/B;

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lm9/B;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Lba/a;-><init>(Lm9/B;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Ls2/k;->j:Lba/a;

    .line 37
    .line 38
    return-void

    .line 39
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwa/a;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ls2/k;->f:Lwa/a;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Ls2/k;->e:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/net/Uri;Ljava/util/Map;)[Ls2/m;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, Ls2/k;->h:[I

    .line 5
    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v3, "Content-Type"

    .line 12
    .line 13
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Ljava/util/List;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 37
    :goto_1
    invoke-static {p2}, Lgc/b;->x(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    const/4 v4, -0x1

    .line 42
    if-eq p2, v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, v0, p2}, Ls2/k;->b(Ljava/util/ArrayList;I)V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-static {p1}, Lgc/b;->y(Landroid/net/Uri;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eq p1, v4, :cond_3

    .line 52
    .line 53
    if-eq p1, p2, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0, v0, p1}, Ls2/k;->b(Ljava/util/ArrayList;I)V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_2
    if-ge v3, v2, :cond_5

    .line 59
    .line 60
    aget v4, v1, v3

    .line 61
    .line 62
    if-eq v4, p2, :cond_4

    .line 63
    .line 64
    if-eq v4, p1, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0, v0, v4}, Ls2/k;->b(Ljava/util/ArrayList;I)V

    .line 67
    .line 68
    .line 69
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    new-array p1, p1, [Ls2/m;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, [Ls2/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    monitor-exit p0

    .line 87
    return-object p1

    .line 88
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p1
.end method

.method public final b(Ljava/util/ArrayList;I)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    goto :goto_0

    .line 8
    :pswitch_1
    new-instance p2, La3/a;

    .line 9
    .line 10
    invoke-direct {p2, v0}, La3/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_2
    new-instance p2, La3/a;

    .line 18
    .line 19
    invoke-direct {p2, v1}, La3/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_3
    new-instance p2, LO2/a;

    .line 27
    .line 28
    invoke-direct {p2, v2, v0}, LO2/a;-><init>(BI)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_4
    new-instance p2, La3/a;

    .line 36
    .line 37
    invoke-direct {p2, v2}, La3/a;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_5
    new-instance p2, LO2/a;

    .line 45
    .line 46
    invoke-direct {p2, v2, v2}, LO2/a;-><init>(BI)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_6
    new-instance p2, Lu2/b;

    .line 54
    .line 55
    iget-boolean v1, p0, Ls2/k;->e:Z

    .line 56
    .line 57
    xor-int/2addr v0, v1

    .line 58
    iget-object v1, p0, Ls2/k;->f:Lwa/a;

    .line 59
    .line 60
    invoke-direct {p2, v0, v1}, Lu2/b;-><init>(ILwa/a;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_7
    sget-object p2, Ls2/k;->j:Lba/a;

    .line 68
    .line 69
    new-array v0, v2, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Lba/a;->x([Ljava/lang/Object;)Ls2/m;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-eqz p2, :cond_0

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_0
    :goto_0
    return-void

    .line 81
    :pswitch_8
    new-instance p2, LO2/a;

    .line 82
    .line 83
    iget v0, p0, Ls2/k;->g:I

    .line 84
    .line 85
    invoke-direct {p2, v0}, LO2/a;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_9
    new-instance p2, LZ2/c;

    .line 93
    .line 94
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    iput v2, p2, LZ2/c;->c:I

    .line 98
    .line 99
    const-wide/16 v0, -0x1

    .line 100
    .line 101
    iput-wide v0, p2, LZ2/c;->d:J

    .line 102
    .line 103
    const/4 v2, -0x1

    .line 104
    iput v2, p2, LZ2/c;->f:I

    .line 105
    .line 106
    iput-wide v0, p2, LZ2/c;->g:J

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_a
    iget-object p2, p0, Ls2/k;->d:Ll8/e0;

    .line 113
    .line 114
    if-nez p2, :cond_1

    .line 115
    .line 116
    sget-object p2, Ll8/K;->b:Ll8/I;

    .line 117
    .line 118
    sget-object p2, Ll8/e0;->e:Ll8/e0;

    .line 119
    .line 120
    iput-object p2, p0, Ls2/k;->d:Ll8/e0;

    .line 121
    .line 122
    :cond_1
    new-instance v3, LY2/y;

    .line 123
    .line 124
    iget-boolean p2, p0, Ls2/k;->e:Z

    .line 125
    .line 126
    xor-int/lit8 v5, p2, 0x1

    .line 127
    .line 128
    iget-object v6, p0, Ls2/k;->f:Lwa/a;

    .line 129
    .line 130
    new-instance v7, LQ1/u;

    .line 131
    .line 132
    const-wide/16 v0, 0x0

    .line 133
    .line 134
    invoke-direct {v7, v0, v1}, LQ1/u;-><init>(J)V

    .line 135
    .line 136
    .line 137
    new-instance v8, LY2/f;

    .line 138
    .line 139
    iget-object p2, p0, Ls2/k;->d:Ll8/e0;

    .line 140
    .line 141
    invoke-direct {v8, v2, p2}, LY2/f;-><init>(ILjava/util/List;)V

    .line 142
    .line 143
    .line 144
    const/4 v4, 0x1

    .line 145
    invoke-direct/range {v3 .. v8}, LY2/y;-><init>(IILP2/j;LQ1/u;LY2/f;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_b
    new-instance p2, LY2/v;

    .line 153
    .line 154
    invoke-direct {p2}, LY2/v;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_c
    new-instance p2, LN2/d;

    .line 162
    .line 163
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_d
    new-instance v3, LM2/l;

    .line 171
    .line 172
    iget-object v4, p0, Ls2/k;->f:Lwa/a;

    .line 173
    .line 174
    iget-boolean p2, p0, Ls2/k;->e:Z

    .line 175
    .line 176
    if-eqz p2, :cond_2

    .line 177
    .line 178
    move v5, v2

    .line 179
    goto :goto_1

    .line 180
    :cond_2
    const/16 p2, 0x20

    .line 181
    .line 182
    move v5, p2

    .line 183
    :goto_1
    sget-object p2, Ll8/K;->b:Ll8/I;

    .line 184
    .line 185
    sget-object v8, Ll8/e0;->e:Ll8/e0;

    .line 186
    .line 187
    const/4 v6, 0x0

    .line 188
    const/4 v7, 0x0

    .line 189
    const/4 v9, 0x0

    .line 190
    invoke-direct/range {v3 .. v9}, LM2/l;-><init>(LP2/j;ILQ1/u;LM2/s;Ljava/util/List;LX1/l;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    new-instance p2, LM2/o;

    .line 197
    .line 198
    iget-object v0, p0, Ls2/k;->f:Lwa/a;

    .line 199
    .line 200
    iget-boolean v1, p0, Ls2/k;->e:Z

    .line 201
    .line 202
    if-eqz v1, :cond_3

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_3
    const/16 v2, 0x10

    .line 206
    .line 207
    :goto_2
    invoke-direct {p2, v0, v2}, LM2/o;-><init>(LP2/j;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :pswitch_e
    new-instance p2, LL2/d;

    .line 215
    .line 216
    iget v0, p0, Ls2/k;->c:I

    .line 217
    .line 218
    iget-boolean v3, p0, Ls2/k;->a:Z

    .line 219
    .line 220
    or-int/2addr v0, v3

    .line 221
    iget-boolean v3, p0, Ls2/k;->b:Z

    .line 222
    .line 223
    if-eqz v3, :cond_4

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    move v1, v2

    .line 227
    :goto_3
    or-int/2addr v0, v1

    .line 228
    invoke-direct {p2, v0}, LL2/d;-><init>(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_f
    new-instance p2, LK2/d;

    .line 236
    .line 237
    iget-object v0, p0, Ls2/k;->f:Lwa/a;

    .line 238
    .line 239
    iget-boolean v3, p0, Ls2/k;->e:Z

    .line 240
    .line 241
    if-eqz v3, :cond_5

    .line 242
    .line 243
    move v1, v2

    .line 244
    :cond_5
    invoke-direct {p2, v0, v1}, LK2/d;-><init>(LP2/j;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_10
    new-instance p2, Ly2/b;

    .line 252
    .line 253
    invoke-direct {p2}, Ly2/b;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :pswitch_11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    new-array v0, v0, [Ljava/lang/Object;

    .line 265
    .line 266
    aput-object p2, v0, v2

    .line 267
    .line 268
    sget-object p2, Ls2/k;->i:Lba/a;

    .line 269
    .line 270
    invoke-virtual {p2, v0}, Lba/a;->x([Ljava/lang/Object;)Ls2/m;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    if-eqz p2, :cond_6

    .line 275
    .line 276
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :cond_6
    new-instance p2, Lx2/a;

    .line 281
    .line 282
    invoke-direct {p2}, Lx2/a;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_12
    new-instance p2, Lt2/a;

    .line 290
    .line 291
    iget-boolean v0, p0, Ls2/k;->a:Z

    .line 292
    .line 293
    iget-boolean v3, p0, Ls2/k;->b:Z

    .line 294
    .line 295
    if-eqz v3, :cond_7

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_7
    move v1, v2

    .line 299
    :goto_4
    or-int/2addr v0, v1

    .line 300
    invoke-direct {p2, v0}, Lt2/a;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_13
    new-instance p2, LY2/d;

    .line 308
    .line 309
    iget-boolean v0, p0, Ls2/k;->a:Z

    .line 310
    .line 311
    iget-boolean v3, p0, Ls2/k;->b:Z

    .line 312
    .line 313
    if-eqz v3, :cond_8

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_8
    move v1, v2

    .line 317
    :goto_5
    or-int/2addr v0, v1

    .line 318
    invoke-direct {p2, v0}, LY2/d;-><init>(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :pswitch_14
    new-instance p2, LY2/c;

    .line 326
    .line 327
    invoke-direct {p2}, LY2/c;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :pswitch_15
    new-instance p2, LY2/a;

    .line 335
    .line 336
    invoke-direct {p2}, LY2/a;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final declared-synchronized c(Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Ls2/k;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final declared-synchronized d(I)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, Ls2/k;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method
