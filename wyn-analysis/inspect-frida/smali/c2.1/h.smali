.class public final Lc2/h;
.super LU1/d;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:LN1/n;

.field public C:Lc2/b;

.field public D:LT1/d;

.field public E:Lc2/e;

.field public F:Landroid/graphics/Bitmap;

.field public G:Z

.field public H:Lc2/g;

.field public I:Lc2/g;

.field public J:I

.field public final r:La2/c;

.field public final s:LT1/d;

.field public final t:Ljava/util/ArrayDeque;

.field public u:Z

.field public v:Z

.field public w:Lc2/f;

.field public x:J

.field public y:J

.field public z:I


# direct methods
.method public constructor <init>(La2/c;)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, LU1/d;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lc2/h;->r:La2/c;

    .line 6
    .line 7
    sget-object p1, Lc2/e;->a:Lc2/e;

    .line 8
    .line 9
    iput-object p1, p0, Lc2/h;->E:Lc2/e;

    .line 10
    .line 11
    new-instance p1, LT1/d;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, LT1/d;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lc2/h;->s:LT1/d;

    .line 18
    .line 19
    sget-object p1, Lc2/f;->c:Lc2/f;

    .line 20
    .line 21
    iput-object p1, p0, Lc2/h;->w:Lc2/f;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lc2/h;->t:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide v1, p0, Lc2/h;->y:J

    .line 36
    .line 37
    iput-wide v1, p0, Lc2/h;->x:J

    .line 38
    .line 39
    iput v0, p0, Lc2/h;->z:I

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    iput p1, p0, Lc2/h;->A:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final D()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc2/h;->B:LN1/n;

    .line 3
    .line 4
    sget-object v0, Lc2/f;->c:Lc2/f;

    .line 5
    .line 6
    iput-object v0, p0, Lc2/h;->w:Lc2/f;

    .line 7
    .line 8
    iget-object v0, p0, Lc2/h;->t:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lc2/h;->P()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lc2/h;->E:Lc2/e;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final E(ZZ)V
    .locals 0

    .line 1
    iput p2, p0, Lc2/h;->A:I

    .line 2
    .line 3
    return-void
.end method

.method public final F(JZ)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iget p2, p0, Lc2/h;->A:I

    .line 3
    .line 4
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lc2/h;->A:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lc2/h;->v:Z

    .line 12
    .line 13
    iput-boolean p1, p0, Lc2/h;->u:Z

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    iput-object p2, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    iput-object p2, p0, Lc2/h;->H:Lc2/g;

    .line 19
    .line 20
    iput-object p2, p0, Lc2/h;->I:Lc2/g;

    .line 21
    .line 22
    iput-boolean p1, p0, Lc2/h;->G:Z

    .line 23
    .line 24
    iput-object p2, p0, Lc2/h;->D:LT1/d;

    .line 25
    .line 26
    iget-object p1, p0, Lc2/h;->C:Lc2/b;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lc2/b;->flush()V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, Lc2/h;->t:Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final G()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc2/h;->P()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final H()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc2/h;->P()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iget v1, p0, Lc2/h;->A:I

    .line 6
    .line 7
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lc2/h;->A:I

    .line 12
    .line 13
    return-void
.end method

.method public final K([LN1/n;JJLk2/H;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lc2/h;->w:Lc2/f;

    .line 2
    .line 3
    iget-wide p1, p1, Lc2/f;->b:J

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, p1, v0

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lc2/h;->t:Ljava/util/ArrayDeque;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iget-wide p2, p0, Lc2/h;->y:J

    .line 23
    .line 24
    cmp-long p6, p2, v0

    .line 25
    .line 26
    if-eqz p6, :cond_1

    .line 27
    .line 28
    iget-wide v2, p0, Lc2/h;->x:J

    .line 29
    .line 30
    cmp-long p6, v2, v0

    .line 31
    .line 32
    if-eqz p6, :cond_0

    .line 33
    .line 34
    cmp-long p2, v2, p2

    .line 35
    .line 36
    if-ltz p2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p2, Lc2/f;

    .line 40
    .line 41
    iget-wide v0, p0, Lc2/h;->y:J

    .line 42
    .line 43
    invoke-direct {p2, v0, v1, p4, p5}, Lc2/f;-><init>(JJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    :goto_0
    new-instance p1, Lc2/f;

    .line 51
    .line 52
    invoke-direct {p1, v0, v1, p4, p5}, Lc2/f;-><init>(JJ)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lc2/h;->w:Lc2/f;

    .line 56
    .line 57
    return-void
.end method

.method public final M(J)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lc2/h;->H:Lc2/g;

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_8

    .line 11
    .line 12
    :cond_0
    iget v2, p0, Lc2/h;->A:I

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    iget v2, p0, LU1/d;->h:I

    .line 18
    .line 19
    if-eq v2, v3, :cond_1

    .line 20
    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_1
    iget-object v2, p0, Lc2/h;->t:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    const/4 v4, 0x3

    .line 26
    const/4 v5, 0x1

    .line 27
    if-nez v0, :cond_5

    .line 28
    .line 29
    iget-object v0, p0, Lc2/h;->C:Lc2/b;

    .line 30
    .line 31
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lc2/h;->C:Lc2/b;

    .line 35
    .line 36
    invoke-virtual {v0}, Lc2/b;->i()LT1/e;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lc2/a;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto/16 :goto_8

    .line 45
    .line 46
    :cond_2
    const/4 v6, 0x4

    .line 47
    invoke-virtual {v0, v6}, LH5/a;->h(I)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_4

    .line 52
    .line 53
    iget p1, p0, Lc2/h;->z:I

    .line 54
    .line 55
    if-ne p1, v4, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lc2/h;->P()V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lc2/h;->B:LN1/n;

    .line 61
    .line 62
    invoke-static {p1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lc2/h;->O()V

    .line 66
    .line 67
    .line 68
    return v1

    .line 69
    :cond_3
    invoke-virtual {v0}, Lc2/a;->q()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_14

    .line 77
    .line 78
    iput-boolean v5, p0, Lc2/h;->v:Z

    .line 79
    .line 80
    return v1

    .line 81
    :cond_4
    iget-object v6, v0, Lc2/a;->e:Landroid/graphics/Bitmap;

    .line 82
    .line 83
    const-string v7, "Non-EOS buffer came back from the decoder without bitmap."

    .line 84
    .line 85
    invoke-static {v6, v7}, LQ1/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v6, v0, Lc2/a;->e:Landroid/graphics/Bitmap;

    .line 89
    .line 90
    iput-object v6, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 91
    .line 92
    invoke-virtual {v0}, Lc2/a;->q()V

    .line 93
    .line 94
    .line 95
    :cond_5
    iget-boolean v0, p0, Lc2/h;->G:Z

    .line 96
    .line 97
    if-eqz v0, :cond_14

    .line 98
    .line 99
    iget-object v0, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 100
    .line 101
    if-eqz v0, :cond_14

    .line 102
    .line 103
    iget-object v0, p0, Lc2/h;->H:Lc2/g;

    .line 104
    .line 105
    if-eqz v0, :cond_14

    .line 106
    .line 107
    iget-object v0, p0, Lc2/h;->B:LN1/n;

    .line 108
    .line 109
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lc2/h;->B:LN1/n;

    .line 113
    .line 114
    iget v6, v0, LN1/n;->J:I

    .line 115
    .line 116
    iget v0, v0, LN1/n;->K:I

    .line 117
    .line 118
    if-ne v6, v5, :cond_6

    .line 119
    .line 120
    if-eq v0, v5, :cond_7

    .line 121
    .line 122
    :cond_6
    const/4 v7, -0x1

    .line 123
    if-eq v6, v7, :cond_7

    .line 124
    .line 125
    if-eq v0, v7, :cond_7

    .line 126
    .line 127
    move v0, v5

    .line 128
    goto :goto_0

    .line 129
    :cond_7
    move v0, v1

    .line 130
    :goto_0
    iget-object v6, p0, Lc2/h;->H:Lc2/g;

    .line 131
    .line 132
    iget-object v7, v6, Lc2/g;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v7, Landroid/graphics/Bitmap;

    .line 135
    .line 136
    if-eqz v7, :cond_8

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_8
    if-eqz v0, :cond_9

    .line 140
    .line 141
    iget-object v7, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 142
    .line 143
    invoke-static {v7}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget-object v7, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 147
    .line 148
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    iget-object v8, p0, Lc2/h;->B:LN1/n;

    .line 153
    .line 154
    invoke-static {v8}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget v8, v8, LN1/n;->J:I

    .line 158
    .line 159
    div-int/2addr v7, v8

    .line 160
    iget-object v8, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 161
    .line 162
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    iget-object v9, p0, Lc2/h;->B:LN1/n;

    .line 167
    .line 168
    invoke-static {v9}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget v9, v9, LN1/n;->K:I

    .line 172
    .line 173
    div-int/2addr v8, v9

    .line 174
    iget-object v9, p0, Lc2/h;->B:LN1/n;

    .line 175
    .line 176
    iget v9, v9, LN1/n;->J:I

    .line 177
    .line 178
    iget v10, v6, Lc2/g;->a:I

    .line 179
    .line 180
    rem-int v11, v10, v9

    .line 181
    .line 182
    mul-int/2addr v11, v7

    .line 183
    div-int/2addr v10, v9

    .line 184
    mul-int/2addr v10, v8

    .line 185
    iget-object v9, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 186
    .line 187
    invoke-static {v9, v11, v10, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    goto :goto_1

    .line 192
    :cond_9
    iget-object v7, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 193
    .line 194
    invoke-static {v7}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :goto_1
    iput-object v7, v6, Lc2/g;->c:Ljava/lang/Object;

    .line 198
    .line 199
    :goto_2
    iget-object v6, p0, Lc2/h;->H:Lc2/g;

    .line 200
    .line 201
    iget-object v6, v6, Lc2/g;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v6, Landroid/graphics/Bitmap;

    .line 204
    .line 205
    invoke-static {v6}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object v6, p0, Lc2/h;->H:Lc2/g;

    .line 209
    .line 210
    iget-wide v6, v6, Lc2/g;->b:J

    .line 211
    .line 212
    sub-long/2addr v6, p1

    .line 213
    iget p1, p0, LU1/d;->h:I

    .line 214
    .line 215
    if-ne p1, v3, :cond_a

    .line 216
    .line 217
    move p1, v5

    .line 218
    goto :goto_3

    .line 219
    :cond_a
    move p1, v1

    .line 220
    :goto_3
    iget p2, p0, Lc2/h;->A:I

    .line 221
    .line 222
    if-eqz p2, :cond_d

    .line 223
    .line 224
    if-eq p2, v5, :cond_c

    .line 225
    .line 226
    if-ne p2, v4, :cond_b

    .line 227
    .line 228
    move p1, v1

    .line 229
    goto :goto_4

    .line 230
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 231
    .line 232
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 233
    .line 234
    .line 235
    throw p1

    .line 236
    :cond_c
    move p1, v5

    .line 237
    :cond_d
    :goto_4
    if-nez p1, :cond_f

    .line 238
    .line 239
    const-wide/16 p1, 0x7530

    .line 240
    .line 241
    cmp-long p1, v6, p1

    .line 242
    .line 243
    if-gez p1, :cond_e

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_e
    move p1, v1

    .line 247
    goto :goto_6

    .line 248
    :cond_f
    :goto_5
    iget-object p1, p0, Lc2/h;->E:Lc2/e;

    .line 249
    .line 250
    iget-object p2, p0, Lc2/h;->w:Lc2/f;

    .line 251
    .line 252
    iget-wide v6, p2, Lc2/f;->b:J

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move p1, v5

    .line 258
    :goto_6
    if-nez p1, :cond_10

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_10
    iget-object p1, p0, Lc2/h;->H:Lc2/g;

    .line 262
    .line 263
    invoke-static {p1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    iget-wide p1, p1, Lc2/g;->b:J

    .line 267
    .line 268
    iput-wide p1, p0, Lc2/h;->x:J

    .line 269
    .line 270
    :goto_7
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-nez v1, :cond_11

    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    check-cast v1, Lc2/f;

    .line 281
    .line 282
    iget-wide v6, v1, Lc2/f;->a:J

    .line 283
    .line 284
    cmp-long v1, p1, v6

    .line 285
    .line 286
    if-ltz v1, :cond_11

    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Lc2/f;

    .line 293
    .line 294
    iput-object v1, p0, Lc2/h;->w:Lc2/f;

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_11
    iput v4, p0, Lc2/h;->A:I

    .line 298
    .line 299
    const/4 p1, 0x0

    .line 300
    if-eqz v0, :cond_12

    .line 301
    .line 302
    iget-object p2, p0, Lc2/h;->H:Lc2/g;

    .line 303
    .line 304
    invoke-static {p2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iget-object v0, p0, Lc2/h;->B:LN1/n;

    .line 308
    .line 309
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    iget-object v1, p0, Lc2/h;->B:LN1/n;

    .line 313
    .line 314
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    iget v1, v1, LN1/n;->J:I

    .line 318
    .line 319
    iget v0, v0, LN1/n;->K:I

    .line 320
    .line 321
    mul-int/2addr v0, v1

    .line 322
    sub-int/2addr v0, v5

    .line 323
    iget p2, p2, Lc2/g;->a:I

    .line 324
    .line 325
    if-ne p2, v0, :cond_13

    .line 326
    .line 327
    :cond_12
    iput-object p1, p0, Lc2/h;->F:Landroid/graphics/Bitmap;

    .line 328
    .line 329
    :cond_13
    iget-object p2, p0, Lc2/h;->I:Lc2/g;

    .line 330
    .line 331
    iput-object p2, p0, Lc2/h;->H:Lc2/g;

    .line 332
    .line 333
    iput-object p1, p0, Lc2/h;->I:Lc2/g;

    .line 334
    .line 335
    return v5

    .line 336
    :cond_14
    :goto_8
    return v1
.end method

.method public final N(J)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, Lc2/h;->G:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lc2/h;->H:Lc2/g;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_9

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LU1/d;->c:LS3/c;

    .line 13
    .line 14
    invoke-virtual {v0}, LS3/c;->i()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lc2/h;->C:Lc2/b;

    .line 18
    .line 19
    if-eqz v2, :cond_15

    .line 20
    .line 21
    iget v3, p0, Lc2/h;->z:I

    .line 22
    .line 23
    const/4 v4, 0x3

    .line 24
    if-eq v3, v4, :cond_15

    .line 25
    .line 26
    iget-boolean v3, p0, Lc2/h;->u:Z

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :cond_1
    iget-object v3, p0, Lc2/h;->D:LT1/d;

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Lc2/b;->c()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, LT1/d;

    .line 41
    .line 42
    iput-object v2, p0, Lc2/h;->D:LT1/d;

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto/16 :goto_9

    .line 47
    .line 48
    :cond_2
    iget v2, p0, Lc2/h;->z:I

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x4

    .line 53
    if-ne v2, v3, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Lc2/h;->D:LT1/d;

    .line 56
    .line 57
    invoke-static {p1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lc2/h;->D:LT1/d;

    .line 61
    .line 62
    iput v6, p1, LH5/a;->b:I

    .line 63
    .line 64
    iget-object p1, p0, Lc2/h;->C:Lc2/b;

    .line 65
    .line 66
    invoke-static {p1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p2, p0, Lc2/h;->D:LT1/d;

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lc2/b;->k(LT1/d;)V

    .line 72
    .line 73
    .line 74
    iput-object v5, p0, Lc2/h;->D:LT1/d;

    .line 75
    .line 76
    iput v4, p0, Lc2/h;->z:I

    .line 77
    .line 78
    return v1

    .line 79
    :cond_3
    iget-object v2, p0, Lc2/h;->D:LT1/d;

    .line 80
    .line 81
    invoke-virtual {p0, v0, v2, v1}, LU1/d;->L(LS3/c;LT1/d;I)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v4, -0x5

    .line 86
    const/4 v7, 0x1

    .line 87
    if-eq v2, v4, :cond_14

    .line 88
    .line 89
    const/4 v0, -0x4

    .line 90
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    const/4 p1, -0x3

    .line 93
    if-ne v2, p1, :cond_4

    .line 94
    .line 95
    goto/16 :goto_9

    .line 96
    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_5
    iget-object v0, p0, Lc2/h;->D:LT1/d;

    .line 104
    .line 105
    invoke-virtual {v0}, LT1/d;->s()V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lc2/h;->D:LT1/d;

    .line 109
    .line 110
    iget-object v0, v0, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-gtz v0, :cond_7

    .line 119
    .line 120
    :cond_6
    iget-object v0, p0, Lc2/h;->D:LT1/d;

    .line 121
    .line 122
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v6}, LH5/a;->h(I)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_8

    .line 130
    .line 131
    :cond_7
    move v0, v7

    .line 132
    goto :goto_0

    .line 133
    :cond_8
    move v0, v1

    .line 134
    :goto_0
    if-eqz v0, :cond_9

    .line 135
    .line 136
    iget-object v2, p0, Lc2/h;->C:Lc2/b;

    .line 137
    .line 138
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object v3, p0, Lc2/h;->D:LT1/d;

    .line 142
    .line 143
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v3}, Lc2/b;->k(LT1/d;)V

    .line 147
    .line 148
    .line 149
    iput v1, p0, Lc2/h;->J:I

    .line 150
    .line 151
    :cond_9
    iget-object v2, p0, Lc2/h;->D:LT1/d;

    .line 152
    .line 153
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v6}, LH5/a;->h(I)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_a

    .line 161
    .line 162
    iput-boolean v7, p0, Lc2/h;->G:Z

    .line 163
    .line 164
    goto/16 :goto_7

    .line 165
    .line 166
    :cond_a
    new-instance v3, Lc2/g;

    .line 167
    .line 168
    iget v4, p0, Lc2/h;->J:I

    .line 169
    .line 170
    iget-wide v8, v2, LT1/d;->g:J

    .line 171
    .line 172
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 173
    .line 174
    .line 175
    iput v4, v3, Lc2/g;->a:I

    .line 176
    .line 177
    iput-wide v8, v3, Lc2/g;->b:J

    .line 178
    .line 179
    iput-object v3, p0, Lc2/h;->I:Lc2/g;

    .line 180
    .line 181
    add-int/lit8 v2, v4, 0x1

    .line 182
    .line 183
    iput v2, p0, Lc2/h;->J:I

    .line 184
    .line 185
    iget-boolean v2, p0, Lc2/h;->G:Z

    .line 186
    .line 187
    if-nez v2, :cond_11

    .line 188
    .line 189
    const-wide/16 v2, 0x7530

    .line 190
    .line 191
    sub-long v10, v8, v2

    .line 192
    .line 193
    cmp-long v10, v10, p1

    .line 194
    .line 195
    if-gtz v10, :cond_b

    .line 196
    .line 197
    add-long/2addr v2, v8

    .line 198
    cmp-long v2, p1, v2

    .line 199
    .line 200
    if-gtz v2, :cond_b

    .line 201
    .line 202
    move v2, v7

    .line 203
    goto :goto_1

    .line 204
    :cond_b
    move v2, v1

    .line 205
    :goto_1
    iget-object v3, p0, Lc2/h;->H:Lc2/g;

    .line 206
    .line 207
    if-eqz v3, :cond_c

    .line 208
    .line 209
    iget-wide v10, v3, Lc2/g;->b:J

    .line 210
    .line 211
    cmp-long v3, v10, p1

    .line 212
    .line 213
    if-gtz v3, :cond_c

    .line 214
    .line 215
    cmp-long p1, p1, v8

    .line 216
    .line 217
    if-gez p1, :cond_c

    .line 218
    .line 219
    move p1, v7

    .line 220
    goto :goto_2

    .line 221
    :cond_c
    move p1, v1

    .line 222
    :goto_2
    iget-object p2, p0, Lc2/h;->B:LN1/n;

    .line 223
    .line 224
    invoke-static {p2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget p2, p2, LN1/n;->J:I

    .line 228
    .line 229
    const/4 v3, -0x1

    .line 230
    if-eq p2, v3, :cond_e

    .line 231
    .line 232
    iget-object p2, p0, Lc2/h;->B:LN1/n;

    .line 233
    .line 234
    iget v8, p2, LN1/n;->K:I

    .line 235
    .line 236
    if-eq v8, v3, :cond_e

    .line 237
    .line 238
    iget p2, p2, LN1/n;->J:I

    .line 239
    .line 240
    mul-int/2addr v8, p2

    .line 241
    sub-int/2addr v8, v7

    .line 242
    if-ne v4, v8, :cond_d

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_d
    move p2, v1

    .line 246
    goto :goto_4

    .line 247
    :cond_e
    :goto_3
    move p2, v7

    .line 248
    :goto_4
    if-nez v2, :cond_10

    .line 249
    .line 250
    if-nez p1, :cond_10

    .line 251
    .line 252
    if-eqz p2, :cond_f

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_f
    move p2, v1

    .line 256
    goto :goto_6

    .line 257
    :cond_10
    :goto_5
    move p2, v7

    .line 258
    :goto_6
    iput-boolean p2, p0, Lc2/h;->G:Z

    .line 259
    .line 260
    if-eqz p1, :cond_11

    .line 261
    .line 262
    if-nez v2, :cond_11

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_11
    iget-object p1, p0, Lc2/h;->I:Lc2/g;

    .line 266
    .line 267
    iput-object p1, p0, Lc2/h;->H:Lc2/g;

    .line 268
    .line 269
    iput-object v5, p0, Lc2/h;->I:Lc2/g;

    .line 270
    .line 271
    :goto_7
    iget-object p1, p0, Lc2/h;->D:LT1/d;

    .line 272
    .line 273
    invoke-static {p1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v6}, LH5/a;->h(I)Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    if-eqz p1, :cond_12

    .line 281
    .line 282
    iput-boolean v7, p0, Lc2/h;->u:Z

    .line 283
    .line 284
    iput-object v5, p0, Lc2/h;->D:LT1/d;

    .line 285
    .line 286
    return v1

    .line 287
    :cond_12
    iget-wide p1, p0, Lc2/h;->y:J

    .line 288
    .line 289
    iget-object v1, p0, Lc2/h;->D:LT1/d;

    .line 290
    .line 291
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iget-wide v1, v1, LT1/d;->g:J

    .line 295
    .line 296
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 297
    .line 298
    .line 299
    move-result-wide p1

    .line 300
    iput-wide p1, p0, Lc2/h;->y:J

    .line 301
    .line 302
    if-eqz v0, :cond_13

    .line 303
    .line 304
    iput-object v5, p0, Lc2/h;->D:LT1/d;

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_13
    iget-object p1, p0, Lc2/h;->D:LT1/d;

    .line 308
    .line 309
    invoke-static {p1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1}, LT1/d;->o()V

    .line 313
    .line 314
    .line 315
    :goto_8
    iget-boolean p1, p0, Lc2/h;->G:Z

    .line 316
    .line 317
    xor-int/2addr p1, v7

    .line 318
    return p1

    .line 319
    :cond_14
    iget-object p1, v0, LS3/c;->c:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p1, LN1/n;

    .line 322
    .line 323
    invoke-static {p1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    iput-object p1, p0, Lc2/h;->B:LN1/n;

    .line 327
    .line 328
    iput v3, p0, Lc2/h;->z:I

    .line 329
    .line 330
    return v7

    .line 331
    :cond_15
    :goto_9
    return v1
.end method

.method public final O()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc2/h;->B:LN1/n;

    .line 2
    .line 3
    iget-object v1, p0, Lc2/h;->r:La2/c;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, La2/c;->N(LN1/n;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x4

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v2, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-static {v2, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lc2/d;

    .line 26
    .line 27
    const-string v1, "Provided decoder factory can\'t create decoder for format."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lc2/h;->B:LN1/n;

    .line 33
    .line 34
    const/16 v2, 0xfa5

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v3, v2}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    throw v0

    .line 41
    :cond_1
    :goto_0
    iget-object v0, p0, Lc2/h;->C:Lc2/b;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Lc2/b;->release()V

    .line 46
    .line 47
    .line 48
    :cond_2
    new-instance v0, Lc2/b;

    .line 49
    .line 50
    iget-object v1, v1, La2/c;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, LV1/c;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lc2/b;-><init>(LV1/c;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lc2/h;->C:Lc2/b;

    .line 58
    .line 59
    return-void
.end method

.method public final P()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc2/h;->D:LT1/d;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lc2/h;->z:I

    .line 6
    .line 7
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide v1, p0, Lc2/h;->y:J

    .line 13
    .line 14
    iget-object v1, p0, Lc2/h;->C:Lc2/b;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Lc2/b;->release()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lc2/h;->C:Lc2/b;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc2/h;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    instance-of p1, p2, Lc2/e;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    check-cast p2, Lc2/e;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p2, 0x0

    .line 14
    :goto_0
    if-nez p2, :cond_2

    .line 15
    .line 16
    sget-object p2, Lc2/e;->a:Lc2/e;

    .line 17
    .line 18
    :cond_2
    iput-object p2, p0, Lc2/h;->E:Lc2/e;

    .line 19
    .line 20
    return-void
.end method

.method public final d(LN1/n;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc2/h;->r:La2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La2/c;->N(LN1/n;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ImageRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final isReady()Z
    .locals 2

    .line 1
    iget v0, p0, Lc2/h;->A:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lc2/h;->G:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
.end method

.method public final v(JJ)V
    .locals 2

    .line 1
    iget-boolean p3, p0, Lc2/h;->v:Z

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p3, p0, Lc2/h;->B:LN1/n;

    .line 7
    .line 8
    if-nez p3, :cond_3

    .line 9
    .line 10
    iget-object p3, p0, LU1/d;->c:LS3/c;

    .line 11
    .line 12
    invoke-virtual {p3}, LS3/c;->i()V

    .line 13
    .line 14
    .line 15
    iget-object p4, p0, Lc2/h;->s:LT1/d;

    .line 16
    .line 17
    invoke-virtual {p4}, LT1/d;->o()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-virtual {p0, p3, p4, v0}, LU1/d;->L(LS3/c;LT1/d;I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, -0x5

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget-object p3, p3, LS3/c;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p3, LN1/n;

    .line 31
    .line 32
    invoke-static {p3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p3, p0, Lc2/h;->B:LN1/n;

    .line 36
    .line 37
    invoke-virtual {p0}, Lc2/h;->O()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 p1, -0x4

    .line 42
    if-ne v0, p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x4

    .line 45
    invoke-virtual {p4, p1}, LH5/a;->h(I)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Lc2/h;->u:Z

    .line 54
    .line 55
    iput-boolean p1, p0, Lc2/h;->v:Z

    .line 56
    .line 57
    :cond_2
    :goto_0
    return-void

    .line 58
    :cond_3
    :goto_1
    :try_start_0
    const-string p3, "drainAndFeedDecoder"

    .line 59
    .line 60
    invoke-static {p3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    invoke-virtual {p0, p1, p2}, Lc2/h;->M(J)Z

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-eqz p3, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_3
    invoke-virtual {p0, p1, p2}, Lc2/h;->N(J)Z

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-eqz p3, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_0
    .catch Lc2/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catch_0
    move-exception p1

    .line 82
    const/4 p2, 0x0

    .line 83
    const/16 p3, 0xfa3

    .line 84
    .line 85
    const/4 p4, 0x0

    .line 86
    invoke-virtual {p0, p1, p2, p4, p3}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    throw p1
.end method
