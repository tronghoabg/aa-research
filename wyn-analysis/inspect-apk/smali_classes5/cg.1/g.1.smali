.class public final Lcg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcg/i;
.implements Lcg/h;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# instance fields
.field public a:Lcg/C;

.field public b:J


# virtual methods
.method public final D()Lcg/j;
    .locals 4

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/32 v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-gtz v2, :cond_0

    .line 9
    .line 10
    long-to-int v0, v0

    .line 11
    invoke-virtual {p0, v0}, Lcg/g;->J(I)Lcg/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "size > Int.MAX_VALUE: "

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-wide v1, p0, Lcg/g;->b:J

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public final E(Lcg/g;J)V
    .locals 8

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eq p1, p0, :cond_c

    .line 7
    .line 8
    iget-wide v1, p1, Lcg/g;->b:J

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    move-wide v5, p2

    .line 13
    invoke-static/range {v1 .. v6}, Lcg/b;->f(JJJ)V

    .line 14
    .line 15
    .line 16
    :goto_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v0, p2, v0

    .line 19
    .line 20
    if-lez v0, :cond_b

    .line 21
    .line 22
    iget-object v0, p1, Lcg/g;->a:Lcg/C;

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget v0, v0, Lcg/C;->c:I

    .line 28
    .line 29
    iget-object v1, p1, Lcg/g;->a:Lcg/C;

    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget v1, v1, Lcg/C;->b:I

    .line 35
    .line 36
    sub-int/2addr v0, v1

    .line 37
    int-to-long v0, v0

    .line 38
    cmp-long v0, p2, v0

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    if-gez v0, :cond_5

    .line 42
    .line 43
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object v0, v0, Lcg/C;->g:Lcg/C;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const/4 v0, 0x0

    .line 51
    :goto_1
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-boolean v2, v0, Lcg/C;->e:Z

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iget v2, v0, Lcg/C;->c:I

    .line 58
    .line 59
    int-to-long v2, v2

    .line 60
    add-long/2addr v2, p2

    .line 61
    iget-boolean v4, v0, Lcg/C;->d:Z

    .line 62
    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    move v4, v1

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    iget v4, v0, Lcg/C;->b:I

    .line 68
    .line 69
    :goto_2
    int-to-long v4, v4

    .line 70
    sub-long/2addr v2, v4

    .line 71
    const-wide/16 v4, 0x2000

    .line 72
    .line 73
    cmp-long v2, v2, v4

    .line 74
    .line 75
    if-gtz v2, :cond_2

    .line 76
    .line 77
    iget-object v1, p1, Lcg/g;->a:Lcg/C;

    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    long-to-int v2, p2

    .line 83
    invoke-virtual {v1, v0, v2}, Lcg/C;->d(Lcg/C;I)V

    .line 84
    .line 85
    .line 86
    iget-wide v0, p1, Lcg/g;->b:J

    .line 87
    .line 88
    sub-long/2addr v0, p2

    .line 89
    iput-wide v0, p1, Lcg/g;->b:J

    .line 90
    .line 91
    iget-wide v0, p0, Lcg/g;->b:J

    .line 92
    .line 93
    add-long/2addr v0, p2

    .line 94
    iput-wide v0, p0, Lcg/g;->b:J

    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    iget-object v0, p1, Lcg/g;->a:Lcg/C;

    .line 98
    .line 99
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    long-to-int v2, p2

    .line 103
    if-lez v2, :cond_4

    .line 104
    .line 105
    iget v3, v0, Lcg/C;->c:I

    .line 106
    .line 107
    iget v4, v0, Lcg/C;->b:I

    .line 108
    .line 109
    sub-int/2addr v3, v4

    .line 110
    if-gt v2, v3, :cond_4

    .line 111
    .line 112
    const/16 v3, 0x400

    .line 113
    .line 114
    if-lt v2, v3, :cond_3

    .line 115
    .line 116
    invoke-virtual {v0}, Lcg/C;->c()Lcg/C;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    invoke-static {}, Lcg/D;->b()Lcg/C;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget v4, v0, Lcg/C;->b:I

    .line 126
    .line 127
    add-int v5, v4, v2

    .line 128
    .line 129
    iget-object v6, v0, Lcg/C;->a:[B

    .line 130
    .line 131
    iget-object v7, v3, Lcg/C;->a:[B

    .line 132
    .line 133
    invoke-static {v1, v4, v5, v6, v7}, Lff/m;->f0(III[B[B)V

    .line 134
    .line 135
    .line 136
    :goto_3
    iget v4, v3, Lcg/C;->b:I

    .line 137
    .line 138
    add-int/2addr v4, v2

    .line 139
    iput v4, v3, Lcg/C;->c:I

    .line 140
    .line 141
    iget v4, v0, Lcg/C;->b:I

    .line 142
    .line 143
    add-int/2addr v4, v2

    .line 144
    iput v4, v0, Lcg/C;->b:I

    .line 145
    .line 146
    iget-object v0, v0, Lcg/C;->g:Lcg/C;

    .line 147
    .line 148
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Lcg/C;->b(Lcg/C;)V

    .line 152
    .line 153
    .line 154
    iput-object v3, p1, Lcg/g;->a:Lcg/C;

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 158
    .line 159
    const-string p2, "byteCount out of range"

    .line 160
    .line 161
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_5
    :goto_4
    iget-object v0, p1, Lcg/g;->a:Lcg/C;

    .line 166
    .line 167
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iget v2, v0, Lcg/C;->c:I

    .line 171
    .line 172
    iget v3, v0, Lcg/C;->b:I

    .line 173
    .line 174
    sub-int/2addr v2, v3

    .line 175
    int-to-long v2, v2

    .line 176
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    iput-object v4, p1, Lcg/g;->a:Lcg/C;

    .line 181
    .line 182
    iget-object v4, p0, Lcg/g;->a:Lcg/C;

    .line 183
    .line 184
    if-nez v4, :cond_6

    .line 185
    .line 186
    iput-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 187
    .line 188
    iput-object v0, v0, Lcg/C;->g:Lcg/C;

    .line 189
    .line 190
    iput-object v0, v0, Lcg/C;->f:Lcg/C;

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_6
    iget-object v4, v4, Lcg/C;->g:Lcg/C;

    .line 194
    .line 195
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v0}, Lcg/C;->b(Lcg/C;)V

    .line 199
    .line 200
    .line 201
    iget-object v4, v0, Lcg/C;->g:Lcg/C;

    .line 202
    .line 203
    if-eq v4, v0, :cond_a

    .line 204
    .line 205
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-boolean v4, v4, Lcg/C;->e:Z

    .line 209
    .line 210
    if-nez v4, :cond_7

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_7
    iget v4, v0, Lcg/C;->c:I

    .line 214
    .line 215
    iget v5, v0, Lcg/C;->b:I

    .line 216
    .line 217
    sub-int/2addr v4, v5

    .line 218
    iget-object v5, v0, Lcg/C;->g:Lcg/C;

    .line 219
    .line 220
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget v5, v5, Lcg/C;->c:I

    .line 224
    .line 225
    rsub-int v5, v5, 0x2000

    .line 226
    .line 227
    iget-object v6, v0, Lcg/C;->g:Lcg/C;

    .line 228
    .line 229
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    iget-boolean v6, v6, Lcg/C;->d:Z

    .line 233
    .line 234
    if-eqz v6, :cond_8

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_8
    iget-object v1, v0, Lcg/C;->g:Lcg/C;

    .line 238
    .line 239
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget v1, v1, Lcg/C;->b:I

    .line 243
    .line 244
    :goto_5
    add-int/2addr v5, v1

    .line 245
    if-le v4, v5, :cond_9

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_9
    iget-object v1, v0, Lcg/C;->g:Lcg/C;

    .line 249
    .line 250
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v1, v4}, Lcg/C;->d(Lcg/C;I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    .line 257
    .line 258
    .line 259
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    .line 260
    .line 261
    .line 262
    :goto_6
    iget-wide v0, p1, Lcg/g;->b:J

    .line 263
    .line 264
    sub-long/2addr v0, v2

    .line 265
    iput-wide v0, p1, Lcg/g;->b:J

    .line 266
    .line 267
    iget-wide v0, p0, Lcg/g;->b:J

    .line 268
    .line 269
    add-long/2addr v0, v2

    .line 270
    iput-wide v0, p0, Lcg/g;->b:J

    .line 271
    .line 272
    sub-long/2addr p2, v2

    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 276
    .line 277
    const-string p2, "cannot compact"

    .line 278
    .line 279
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw p1

    .line 283
    :cond_b
    return-void

    .line 284
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 285
    .line 286
    const-string p2, "source == this"

    .line 287
    .line 288
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw p1
.end method

.method public final F(Lcg/h;)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-lez v2, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, p0, v0, v1}, Lcg/F;->E(Lcg/g;J)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-wide v0
.end method

.method public final J(I)Lcg/j;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcg/j;->d:Lcg/j;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-wide v0, p0, Lcg/g;->b:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    int-to-long v4, p1

    .line 11
    invoke-static/range {v0 .. v5}, Lcg/b;->f(JJJ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v2, p1, :cond_2

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget v4, v0, Lcg/C;->c:I

    .line 25
    .line 26
    iget v5, v0, Lcg/C;->b:I

    .line 27
    .line 28
    if-eq v4, v5, :cond_1

    .line 29
    .line 30
    sub-int/2addr v4, v5

    .line 31
    add-int/2addr v2, v4

    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    iget-object v0, v0, Lcg/C;->f:Lcg/C;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 38
    .line 39
    const-string v0, "s.limit == s.pos"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_2
    new-array v0, v3, [[B

    .line 46
    .line 47
    mul-int/lit8 v2, v3, 0x2

    .line 48
    .line 49
    new-array v2, v2, [I

    .line 50
    .line 51
    iget-object v4, p0, Lcg/g;->a:Lcg/C;

    .line 52
    .line 53
    move-object v5, v4

    .line 54
    move v4, v1

    .line 55
    :goto_1
    if-ge v1, p1, :cond_3

    .line 56
    .line 57
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v6, v5, Lcg/C;->a:[B

    .line 61
    .line 62
    aput-object v6, v0, v4

    .line 63
    .line 64
    iget v6, v5, Lcg/C;->c:I

    .line 65
    .line 66
    iget v7, v5, Lcg/C;->b:I

    .line 67
    .line 68
    sub-int/2addr v6, v7

    .line 69
    add-int/2addr v1, v6

    .line 70
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    aput v6, v2, v4

    .line 75
    .line 76
    add-int v6, v4, v3

    .line 77
    .line 78
    iget v7, v5, Lcg/C;->b:I

    .line 79
    .line 80
    aput v7, v2, v6

    .line 81
    .line 82
    const/4 v6, 0x1

    .line 83
    iput-boolean v6, v5, Lcg/C;->d:Z

    .line 84
    .line 85
    add-int/2addr v4, v6

    .line 86
    iget-object v5, v5, Lcg/C;->f:Lcg/C;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    new-instance p1, Lcg/E;

    .line 90
    .line 91
    invoke-direct {p1, v0, v2}, Lcg/E;-><init>([[B[I)V

    .line 92
    .line 93
    .line 94
    return-object p1
.end method

.method public final bridge synthetic L(IILjava/lang/String;)Lcg/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcg/g;->c0(IILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final P(I)Lcg/C;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_3

    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    if-gt p1, v0, :cond_3

    .line 7
    .line 8
    iget-object v1, p0, Lcg/g;->a:Lcg/C;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lcg/D;->b()Lcg/C;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcg/g;->a:Lcg/C;

    .line 17
    .line 18
    iput-object p1, p1, Lcg/C;->g:Lcg/C;

    .line 19
    .line 20
    iput-object p1, p1, Lcg/C;->f:Lcg/C;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object v1, v1, Lcg/C;->g:Lcg/C;

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget v2, v1, Lcg/C;->c:I

    .line 29
    .line 30
    add-int/2addr v2, p1

    .line 31
    if-gt v2, v0, :cond_2

    .line 32
    .line 33
    iget-boolean p1, v1, Lcg/C;->e:Z

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-object v1

    .line 39
    :cond_2
    :goto_0
    invoke-static {}, Lcg/D;->b()Lcg/C;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Lcg/C;->b(Lcg/C;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "unexpected capacity"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final Q(Lcg/j;)V
    .locals 1

    .line 1
    const-string v0, "byteString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcg/j;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1, p0, v0}, Lcg/j;->u(Lcg/g;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final bridge synthetic T(II[B)Lcg/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1, p2}, Lcg/g;->W([BII)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final V([B)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    array-length v1, p1

    .line 8
    invoke-virtual {p0, p1, v0, v1}, Lcg/g;->W([BII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final W([BII)V
    .locals 7

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    int-to-long v1, v0

    .line 8
    int-to-long v3, p2

    .line 9
    int-to-long v5, p3

    .line 10
    invoke-static/range {v1 .. v6}, Lcg/b;->f(JJJ)V

    .line 11
    .line 12
    .line 13
    add-int/2addr p3, p2

    .line 14
    :goto_0
    if-ge p2, p3, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Lcg/g;->P(I)Lcg/C;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sub-int v1, p3, p2

    .line 22
    .line 23
    iget v2, v0, Lcg/C;->c:I

    .line 24
    .line 25
    rsub-int v2, v2, 0x2000

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v2, v0, Lcg/C;->c:I

    .line 32
    .line 33
    add-int v3, p2, v1

    .line 34
    .line 35
    iget-object v4, v0, Lcg/C;->a:[B

    .line 36
    .line 37
    invoke-static {v2, p2, v3, p1, v4}, Lff/m;->f0(III[B[B)V

    .line 38
    .line 39
    .line 40
    iget p2, v0, Lcg/C;->c:I

    .line 41
    .line 42
    add-int/2addr p2, v1

    .line 43
    iput p2, v0, Lcg/C;->c:I

    .line 44
    .line 45
    move p2, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-wide p1, p0, Lcg/g;->b:J

    .line 48
    .line 49
    add-long/2addr p1, v5

    .line 50
    iput-wide p1, p0, Lcg/g;->b:J

    .line 51
    .line 52
    return-void
.end method

.method public final X(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcg/g;->P(I)Lcg/C;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget v1, v0, Lcg/C;->c:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    iput v2, v0, Lcg/C;->c:I

    .line 11
    .line 12
    int-to-byte p1, p1

    .line 13
    iget-object v0, v0, Lcg/C;->a:[B

    .line 14
    .line 15
    aput-byte p1, v0, v1

    .line 16
    .line 17
    iget-wide v0, p0, Lcg/g;->b:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    add-long/2addr v0, v2

    .line 22
    iput-wide v0, p0, Lcg/g;->b:J

    .line 23
    .line 24
    return-void
.end method

.method public final Y(J)V
    .locals 13

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    const/16 p1, 0x30

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcg/g;->X(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v3, 0x1

    .line 14
    if-gez v2, :cond_2

    .line 15
    .line 16
    neg-long p1, p1

    .line 17
    cmp-long v2, p1, v0

    .line 18
    .line 19
    if-gez v2, :cond_1

    .line 20
    .line 21
    const-string p1, "-9223372036854775808"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcg/g;->d0(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    move v2, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 v2, 0x0

    .line 30
    :goto_0
    const-wide/32 v4, 0x5f5e100

    .line 31
    .line 32
    .line 33
    cmp-long v4, p1, v4

    .line 34
    .line 35
    const/16 v5, 0xa

    .line 36
    .line 37
    if-gez v4, :cond_a

    .line 38
    .line 39
    const-wide/16 v6, 0x2710

    .line 40
    .line 41
    cmp-long v4, p1, v6

    .line 42
    .line 43
    if-gez v4, :cond_6

    .line 44
    .line 45
    const-wide/16 v6, 0x64

    .line 46
    .line 47
    cmp-long v4, p1, v6

    .line 48
    .line 49
    if-gez v4, :cond_4

    .line 50
    .line 51
    const-wide/16 v6, 0xa

    .line 52
    .line 53
    cmp-long v4, p1, v6

    .line 54
    .line 55
    if-gez v4, :cond_3

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :cond_3
    const/4 v3, 0x2

    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :cond_4
    const-wide/16 v3, 0x3e8

    .line 63
    .line 64
    cmp-long v3, p1, v3

    .line 65
    .line 66
    if-gez v3, :cond_5

    .line 67
    .line 68
    const/4 v3, 0x3

    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_5
    const/4 v3, 0x4

    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_6
    const-wide/32 v3, 0xf4240

    .line 75
    .line 76
    .line 77
    cmp-long v3, p1, v3

    .line 78
    .line 79
    if-gez v3, :cond_8

    .line 80
    .line 81
    const-wide/32 v3, 0x186a0

    .line 82
    .line 83
    .line 84
    cmp-long v3, p1, v3

    .line 85
    .line 86
    if-gez v3, :cond_7

    .line 87
    .line 88
    const/4 v3, 0x5

    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_7
    const/4 v3, 0x6

    .line 92
    goto/16 :goto_1

    .line 93
    .line 94
    :cond_8
    const-wide/32 v3, 0x989680

    .line 95
    .line 96
    .line 97
    cmp-long v3, p1, v3

    .line 98
    .line 99
    if-gez v3, :cond_9

    .line 100
    .line 101
    const/4 v3, 0x7

    .line 102
    goto/16 :goto_1

    .line 103
    .line 104
    :cond_9
    const/16 v3, 0x8

    .line 105
    .line 106
    goto/16 :goto_1

    .line 107
    .line 108
    :cond_a
    const-wide v3, 0xe8d4a51000L

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    cmp-long v3, p1, v3

    .line 114
    .line 115
    if-gez v3, :cond_e

    .line 116
    .line 117
    const-wide v3, 0x2540be400L

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    cmp-long v3, p1, v3

    .line 123
    .line 124
    if-gez v3, :cond_c

    .line 125
    .line 126
    const-wide/32 v3, 0x3b9aca00

    .line 127
    .line 128
    .line 129
    cmp-long v3, p1, v3

    .line 130
    .line 131
    if-gez v3, :cond_b

    .line 132
    .line 133
    const/16 v3, 0x9

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_b
    move v3, v5

    .line 137
    goto :goto_1

    .line 138
    :cond_c
    const-wide v3, 0x174876e800L

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    cmp-long v3, p1, v3

    .line 144
    .line 145
    if-gez v3, :cond_d

    .line 146
    .line 147
    const/16 v3, 0xb

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_d
    const/16 v3, 0xc

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_e
    const-wide v3, 0x38d7ea4c68000L

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    cmp-long v3, p1, v3

    .line 159
    .line 160
    if-gez v3, :cond_11

    .line 161
    .line 162
    const-wide v3, 0x9184e72a000L

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    cmp-long v3, p1, v3

    .line 168
    .line 169
    if-gez v3, :cond_f

    .line 170
    .line 171
    const/16 v3, 0xd

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_f
    const-wide v3, 0x5af3107a4000L

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    cmp-long v3, p1, v3

    .line 180
    .line 181
    if-gez v3, :cond_10

    .line 182
    .line 183
    const/16 v3, 0xe

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_10
    const/16 v3, 0xf

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_11
    const-wide v3, 0x16345785d8a0000L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    cmp-long v3, p1, v3

    .line 195
    .line 196
    if-gez v3, :cond_13

    .line 197
    .line 198
    const-wide v3, 0x2386f26fc10000L

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    cmp-long v3, p1, v3

    .line 204
    .line 205
    if-gez v3, :cond_12

    .line 206
    .line 207
    const/16 v3, 0x10

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_12
    const/16 v3, 0x11

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_13
    const-wide v3, 0xde0b6b3a7640000L

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    cmp-long v3, p1, v3

    .line 219
    .line 220
    if-gez v3, :cond_14

    .line 221
    .line 222
    const/16 v3, 0x12

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_14
    const/16 v3, 0x13

    .line 226
    .line 227
    :goto_1
    if-eqz v2, :cond_15

    .line 228
    .line 229
    add-int/lit8 v3, v3, 0x1

    .line 230
    .line 231
    :cond_15
    invoke-virtual {p0, v3}, Lcg/g;->P(I)Lcg/C;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    iget v6, v4, Lcg/C;->c:I

    .line 236
    .line 237
    add-int/2addr v6, v3

    .line 238
    :goto_2
    cmp-long v7, p1, v0

    .line 239
    .line 240
    iget-object v8, v4, Lcg/C;->a:[B

    .line 241
    .line 242
    if-eqz v7, :cond_16

    .line 243
    .line 244
    int-to-long v9, v5

    .line 245
    rem-long v11, p1, v9

    .line 246
    .line 247
    long-to-int v7, v11

    .line 248
    add-int/lit8 v6, v6, -0x1

    .line 249
    .line 250
    sget-object v11, Ldg/a;->a:[B

    .line 251
    .line 252
    aget-byte v7, v11, v7

    .line 253
    .line 254
    aput-byte v7, v8, v6

    .line 255
    .line 256
    div-long/2addr p1, v9

    .line 257
    goto :goto_2

    .line 258
    :cond_16
    if-eqz v2, :cond_17

    .line 259
    .line 260
    add-int/lit8 v6, v6, -0x1

    .line 261
    .line 262
    const/16 p1, 0x2d

    .line 263
    .line 264
    aput-byte p1, v8, v6

    .line 265
    .line 266
    :cond_17
    iget p1, v4, Lcg/C;->c:I

    .line 267
    .line 268
    add-int/2addr p1, v3

    .line 269
    iput p1, v4, Lcg/C;->c:I

    .line 270
    .line 271
    iget-wide p1, p0, Lcg/g;->b:J

    .line 272
    .line 273
    int-to-long v0, v3

    .line 274
    add-long/2addr p1, v0

    .line 275
    iput-wide p1, p0, Lcg/g;->b:J

    .line 276
    .line 277
    return-void
.end method

.method public final Z(J)V
    .locals 12

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
    const/16 p1, 0x30

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcg/g;->X(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    ushr-long v1, p1, v0

    .line 15
    .line 16
    or-long/2addr v1, p1

    .line 17
    const/4 v3, 0x2

    .line 18
    ushr-long v4, v1, v3

    .line 19
    .line 20
    or-long/2addr v1, v4

    .line 21
    const/4 v4, 0x4

    .line 22
    ushr-long v5, v1, v4

    .line 23
    .line 24
    or-long/2addr v1, v5

    .line 25
    const/16 v5, 0x8

    .line 26
    .line 27
    ushr-long v6, v1, v5

    .line 28
    .line 29
    or-long/2addr v1, v6

    .line 30
    const/16 v6, 0x10

    .line 31
    .line 32
    ushr-long v7, v1, v6

    .line 33
    .line 34
    or-long/2addr v1, v7

    .line 35
    const/16 v7, 0x20

    .line 36
    .line 37
    ushr-long v8, v1, v7

    .line 38
    .line 39
    or-long/2addr v1, v8

    .line 40
    ushr-long v8, v1, v0

    .line 41
    .line 42
    const-wide v10, 0x5555555555555555L    # 1.1945305291614955E103

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v8, v10

    .line 48
    sub-long/2addr v1, v8

    .line 49
    ushr-long v8, v1, v3

    .line 50
    .line 51
    const-wide v10, 0x3333333333333333L    # 4.667261458395856E-62

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v8, v10

    .line 57
    and-long/2addr v1, v10

    .line 58
    add-long/2addr v8, v1

    .line 59
    ushr-long v1, v8, v4

    .line 60
    .line 61
    add-long/2addr v1, v8

    .line 62
    const-wide v8, 0xf0f0f0f0f0f0f0fL    # 3.815736827118017E-236

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v1, v8

    .line 68
    ushr-long v8, v1, v5

    .line 69
    .line 70
    add-long/2addr v1, v8

    .line 71
    ushr-long v5, v1, v6

    .line 72
    .line 73
    add-long/2addr v1, v5

    .line 74
    const-wide/16 v5, 0x3f

    .line 75
    .line 76
    and-long v8, v1, v5

    .line 77
    .line 78
    ushr-long/2addr v1, v7

    .line 79
    and-long/2addr v1, v5

    .line 80
    add-long/2addr v8, v1

    .line 81
    const/4 v1, 0x3

    .line 82
    int-to-long v1, v1

    .line 83
    add-long/2addr v8, v1

    .line 84
    int-to-long v1, v4

    .line 85
    div-long/2addr v8, v1

    .line 86
    long-to-int v1, v8

    .line 87
    invoke-virtual {p0, v1}, Lcg/g;->P(I)Lcg/C;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget v3, v2, Lcg/C;->c:I

    .line 92
    .line 93
    add-int v5, v3, v1

    .line 94
    .line 95
    sub-int/2addr v5, v0

    .line 96
    :goto_0
    if-lt v5, v3, :cond_1

    .line 97
    .line 98
    sget-object v0, Ldg/a;->a:[B

    .line 99
    .line 100
    const-wide/16 v6, 0xf

    .line 101
    .line 102
    and-long/2addr v6, p1

    .line 103
    long-to-int v6, v6

    .line 104
    aget-byte v0, v0, v6

    .line 105
    .line 106
    iget-object v6, v2, Lcg/C;->a:[B

    .line 107
    .line 108
    aput-byte v0, v6, v5

    .line 109
    .line 110
    ushr-long/2addr p1, v4

    .line 111
    add-int/lit8 v5, v5, -0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    iget p1, v2, Lcg/C;->c:I

    .line 115
    .line 116
    add-int/2addr p1, v1

    .line 117
    iput p1, v2, Lcg/C;->c:I

    .line 118
    .line 119
    iget-wide p1, p0, Lcg/g;->b:J

    .line 120
    .line 121
    int-to-long v0, v1

    .line 122
    add-long/2addr p1, v0

    .line 123
    iput-wide p1, p0, Lcg/g;->b:J

    .line 124
    .line 125
    return-void
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcg/g;->skip(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a0(I)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcg/g;->P(I)Lcg/C;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget v2, v1, Lcg/C;->c:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    ushr-int/lit8 v4, p1, 0x18

    .line 11
    .line 12
    and-int/lit16 v4, v4, 0xff

    .line 13
    .line 14
    int-to-byte v4, v4

    .line 15
    iget-object v5, v1, Lcg/C;->a:[B

    .line 16
    .line 17
    aput-byte v4, v5, v2

    .line 18
    .line 19
    add-int/lit8 v4, v2, 0x2

    .line 20
    .line 21
    ushr-int/lit8 v6, p1, 0x10

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    int-to-byte v6, v6

    .line 26
    aput-byte v6, v5, v3

    .line 27
    .line 28
    add-int/lit8 v3, v2, 0x3

    .line 29
    .line 30
    ushr-int/lit8 v6, p1, 0x8

    .line 31
    .line 32
    and-int/lit16 v6, v6, 0xff

    .line 33
    .line 34
    int-to-byte v6, v6

    .line 35
    aput-byte v6, v5, v4

    .line 36
    .line 37
    add-int/2addr v2, v0

    .line 38
    and-int/lit16 p1, p1, 0xff

    .line 39
    .line 40
    int-to-byte p1, p1

    .line 41
    aput-byte p1, v5, v3

    .line 42
    .line 43
    iput v2, v1, Lcg/C;->c:I

    .line 44
    .line 45
    iget-wide v0, p0, Lcg/g;->b:J

    .line 46
    .line 47
    const-wide/16 v2, 0x4

    .line 48
    .line 49
    add-long/2addr v0, v2

    .line 50
    iput-wide v0, p0, Lcg/g;->b:J

    .line 51
    .line 52
    return-void
.end method

.method public final b()Lcg/g;
    .locals 6

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lcg/g;->b:J

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v1, p0, Lcg/g;->a:Lcg/C;

    .line 16
    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcg/C;->c()Lcg/C;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, v0, Lcg/g;->a:Lcg/C;

    .line 25
    .line 26
    iput-object v2, v2, Lcg/C;->g:Lcg/C;

    .line 27
    .line 28
    iput-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 29
    .line 30
    iget-object v3, v1, Lcg/C;->f:Lcg/C;

    .line 31
    .line 32
    :goto_0
    if-eq v3, v1, :cond_1

    .line 33
    .line 34
    iget-object v4, v2, Lcg/C;->g:Lcg/C;

    .line 35
    .line 36
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Lcg/C;->c()Lcg/C;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v4, v5}, Lcg/C;->b(Lcg/C;)V

    .line 47
    .line 48
    .line 49
    iget-object v3, v3, Lcg/C;->f:Lcg/C;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-wide v1, p0, Lcg/g;->b:J

    .line 53
    .line 54
    iput-wide v1, v0, Lcg/g;->b:J

    .line 55
    .line 56
    return-object v0
.end method

.method public final b0(I)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcg/g;->P(I)Lcg/C;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget v2, v1, Lcg/C;->c:I

    .line 7
    .line 8
    add-int/lit8 v3, v2, 0x1

    .line 9
    .line 10
    ushr-int/lit8 v4, p1, 0x8

    .line 11
    .line 12
    and-int/lit16 v4, v4, 0xff

    .line 13
    .line 14
    int-to-byte v4, v4

    .line 15
    iget-object v5, v1, Lcg/C;->a:[B

    .line 16
    .line 17
    aput-byte v4, v5, v2

    .line 18
    .line 19
    add-int/2addr v2, v0

    .line 20
    and-int/lit16 p1, p1, 0xff

    .line 21
    .line 22
    int-to-byte p1, p1

    .line 23
    aput-byte p1, v5, v3

    .line 24
    .line 25
    iput v2, v1, Lcg/C;->c:I

    .line 26
    .line 27
    iget-wide v0, p0, Lcg/g;->b:J

    .line 28
    .line 29
    const-wide/16 v2, 0x2

    .line 30
    .line 31
    add-long/2addr v0, v2

    .line 32
    iput-wide v0, p0, Lcg/g;->b:J

    .line 33
    .line 34
    return-void
.end method

.method public final c0(IILjava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-ltz p1, :cond_a

    .line 7
    .line 8
    if-lt p2, p1, :cond_9

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-gt p2, v0, :cond_8

    .line 15
    .line 16
    :goto_0
    if-ge p1, p2, :cond_7

    .line 17
    .line 18
    invoke-virtual {p3, p1}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0x80

    .line 23
    .line 24
    if-ge v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-virtual {p0, v2}, Lcg/g;->P(I)Lcg/C;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget v3, v2, Lcg/C;->c:I

    .line 32
    .line 33
    sub-int/2addr v3, p1

    .line 34
    rsub-int v4, v3, 0x2000

    .line 35
    .line 36
    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    add-int/lit8 v5, p1, 0x1

    .line 41
    .line 42
    add-int/2addr p1, v3

    .line 43
    int-to-byte v0, v0

    .line 44
    iget-object v6, v2, Lcg/C;->a:[B

    .line 45
    .line 46
    aput-byte v0, v6, p1

    .line 47
    .line 48
    :goto_1
    move p1, v5

    .line 49
    if-ge p1, v4, :cond_0

    .line 50
    .line 51
    invoke-virtual {p3, p1}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-ge v0, v1, :cond_0

    .line 56
    .line 57
    add-int/lit8 v5, p1, 0x1

    .line 58
    .line 59
    add-int/2addr p1, v3

    .line 60
    int-to-byte v0, v0

    .line 61
    aput-byte v0, v6, p1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    add-int/2addr v3, p1

    .line 65
    iget v0, v2, Lcg/C;->c:I

    .line 66
    .line 67
    sub-int/2addr v3, v0

    .line 68
    add-int/2addr v0, v3

    .line 69
    iput v0, v2, Lcg/C;->c:I

    .line 70
    .line 71
    iget-wide v0, p0, Lcg/g;->b:J

    .line 72
    .line 73
    int-to-long v2, v3

    .line 74
    add-long/2addr v0, v2

    .line 75
    iput-wide v0, p0, Lcg/g;->b:J

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/16 v2, 0x800

    .line 79
    .line 80
    if-ge v0, v2, :cond_2

    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    invoke-virtual {p0, v2}, Lcg/g;->P(I)Lcg/C;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iget v4, v3, Lcg/C;->c:I

    .line 88
    .line 89
    shr-int/lit8 v5, v0, 0x6

    .line 90
    .line 91
    or-int/lit16 v5, v5, 0xc0

    .line 92
    .line 93
    int-to-byte v5, v5

    .line 94
    iget-object v6, v3, Lcg/C;->a:[B

    .line 95
    .line 96
    aput-byte v5, v6, v4

    .line 97
    .line 98
    add-int/lit8 v5, v4, 0x1

    .line 99
    .line 100
    and-int/lit8 v0, v0, 0x3f

    .line 101
    .line 102
    or-int/2addr v0, v1

    .line 103
    int-to-byte v0, v0

    .line 104
    aput-byte v0, v6, v5

    .line 105
    .line 106
    add-int/2addr v4, v2

    .line 107
    iput v4, v3, Lcg/C;->c:I

    .line 108
    .line 109
    iget-wide v0, p0, Lcg/g;->b:J

    .line 110
    .line 111
    const-wide/16 v2, 0x2

    .line 112
    .line 113
    add-long/2addr v0, v2

    .line 114
    iput-wide v0, p0, Lcg/g;->b:J

    .line 115
    .line 116
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    const v2, 0xd800

    .line 120
    .line 121
    .line 122
    const/16 v3, 0x3f

    .line 123
    .line 124
    if-lt v0, v2, :cond_6

    .line 125
    .line 126
    const v2, 0xdfff

    .line 127
    .line 128
    .line 129
    if-le v0, v2, :cond_3

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_3
    add-int/lit8 v2, p1, 0x1

    .line 133
    .line 134
    if-ge v2, p2, :cond_4

    .line 135
    .line 136
    invoke-virtual {p3, v2}, Ljava/lang/String;->charAt(I)C

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    goto :goto_3

    .line 141
    :cond_4
    const/4 v4, 0x0

    .line 142
    :goto_3
    const v5, 0xdbff

    .line 143
    .line 144
    .line 145
    if-gt v0, v5, :cond_5

    .line 146
    .line 147
    const v5, 0xdc00

    .line 148
    .line 149
    .line 150
    if-gt v5, v4, :cond_5

    .line 151
    .line 152
    const v5, 0xe000

    .line 153
    .line 154
    .line 155
    if-ge v4, v5, :cond_5

    .line 156
    .line 157
    and-int/lit16 v0, v0, 0x3ff

    .line 158
    .line 159
    shl-int/lit8 v0, v0, 0xa

    .line 160
    .line 161
    and-int/lit16 v2, v4, 0x3ff

    .line 162
    .line 163
    or-int/2addr v0, v2

    .line 164
    const/high16 v2, 0x10000

    .line 165
    .line 166
    add-int/2addr v0, v2

    .line 167
    const/4 v2, 0x4

    .line 168
    invoke-virtual {p0, v2}, Lcg/g;->P(I)Lcg/C;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget v5, v4, Lcg/C;->c:I

    .line 173
    .line 174
    shr-int/lit8 v6, v0, 0x12

    .line 175
    .line 176
    or-int/lit16 v6, v6, 0xf0

    .line 177
    .line 178
    int-to-byte v6, v6

    .line 179
    iget-object v7, v4, Lcg/C;->a:[B

    .line 180
    .line 181
    aput-byte v6, v7, v5

    .line 182
    .line 183
    add-int/lit8 v6, v5, 0x1

    .line 184
    .line 185
    shr-int/lit8 v8, v0, 0xc

    .line 186
    .line 187
    and-int/2addr v8, v3

    .line 188
    or-int/2addr v8, v1

    .line 189
    int-to-byte v8, v8

    .line 190
    aput-byte v8, v7, v6

    .line 191
    .line 192
    add-int/lit8 v6, v5, 0x2

    .line 193
    .line 194
    shr-int/lit8 v8, v0, 0x6

    .line 195
    .line 196
    and-int/2addr v8, v3

    .line 197
    or-int/2addr v8, v1

    .line 198
    int-to-byte v8, v8

    .line 199
    aput-byte v8, v7, v6

    .line 200
    .line 201
    add-int/lit8 v6, v5, 0x3

    .line 202
    .line 203
    and-int/2addr v0, v3

    .line 204
    or-int/2addr v0, v1

    .line 205
    int-to-byte v0, v0

    .line 206
    aput-byte v0, v7, v6

    .line 207
    .line 208
    add-int/2addr v5, v2

    .line 209
    iput v5, v4, Lcg/C;->c:I

    .line 210
    .line 211
    iget-wide v0, p0, Lcg/g;->b:J

    .line 212
    .line 213
    const-wide/16 v2, 0x4

    .line 214
    .line 215
    add-long/2addr v0, v2

    .line 216
    iput-wide v0, p0, Lcg/g;->b:J

    .line 217
    .line 218
    add-int/lit8 p1, p1, 0x2

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_5
    invoke-virtual {p0, v3}, Lcg/g;->X(I)V

    .line 223
    .line 224
    .line 225
    move p1, v2

    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_6
    :goto_4
    const/4 v2, 0x3

    .line 229
    invoke-virtual {p0, v2}, Lcg/g;->P(I)Lcg/C;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    iget v5, v4, Lcg/C;->c:I

    .line 234
    .line 235
    shr-int/lit8 v6, v0, 0xc

    .line 236
    .line 237
    or-int/lit16 v6, v6, 0xe0

    .line 238
    .line 239
    int-to-byte v6, v6

    .line 240
    iget-object v7, v4, Lcg/C;->a:[B

    .line 241
    .line 242
    aput-byte v6, v7, v5

    .line 243
    .line 244
    add-int/lit8 v6, v5, 0x1

    .line 245
    .line 246
    shr-int/lit8 v8, v0, 0x6

    .line 247
    .line 248
    and-int/2addr v3, v8

    .line 249
    or-int/2addr v3, v1

    .line 250
    int-to-byte v3, v3

    .line 251
    aput-byte v3, v7, v6

    .line 252
    .line 253
    add-int/lit8 v3, v5, 0x2

    .line 254
    .line 255
    and-int/lit8 v0, v0, 0x3f

    .line 256
    .line 257
    or-int/2addr v0, v1

    .line 258
    int-to-byte v0, v0

    .line 259
    aput-byte v0, v7, v3

    .line 260
    .line 261
    add-int/2addr v5, v2

    .line 262
    iput v5, v4, Lcg/C;->c:I

    .line 263
    .line 264
    iget-wide v0, p0, Lcg/g;->b:J

    .line 265
    .line 266
    const-wide/16 v2, 0x3

    .line 267
    .line 268
    add-long/2addr v0, v2

    .line 269
    iput-wide v0, p0, Lcg/g;->b:J

    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :cond_7
    return-void

    .line 274
    :cond_8
    const-string p1, "endIndex > string.length: "

    .line 275
    .line 276
    const-string v0, " > "

    .line 277
    .line 278
    invoke-static {p2, p1, v0}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw p2

    .line 303
    :cond_9
    const-string p3, "endIndex < beginIndex: "

    .line 304
    .line 305
    const-string v0, " < "

    .line 306
    .line 307
    invoke-static {p2, p1, p3, v0}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw p2

    .line 321
    :cond_a
    const-string p2, "beginIndex < 0: "

    .line 322
    .line 323
    invoke-static {p1, p2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw p2
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcg/g;->b()Lcg/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-nez v4, :cond_0

    .line 8
    .line 9
    return-wide v2

    .line 10
    :cond_0
    iget-object v2, p0, Lcg/g;->a:Lcg/C;

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v2, Lcg/C;->g:Lcg/C;

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget v3, v2, Lcg/C;->c:I

    .line 21
    .line 22
    const/16 v4, 0x2000

    .line 23
    .line 24
    if-ge v3, v4, :cond_1

    .line 25
    .line 26
    iget-boolean v4, v2, Lcg/C;->e:Z

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget v2, v2, Lcg/C;->b:I

    .line 31
    .line 32
    sub-int/2addr v3, v2

    .line 33
    int-to-long v2, v3

    .line 34
    sub-long/2addr v0, v2

    .line 35
    :cond_1
    return-wide v0
.end method

.method public final d0(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0, v0, v1, p1}, Lcg/g;->c0(IILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e(JLcg/j;)Z
    .locals 7

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p3, Lcg/j;->a:[B

    .line 7
    .line 8
    array-length v0, p3

    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    cmp-long v1, p1, v1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-ltz v1, :cond_3

    .line 15
    .line 16
    if-ltz v0, :cond_3

    .line 17
    .line 18
    iget-wide v3, p0, Lcg/g;->b:J

    .line 19
    .line 20
    sub-long/2addr v3, p1

    .line 21
    int-to-long v5, v0

    .line 22
    cmp-long v1, v3, v5

    .line 23
    .line 24
    if-ltz v1, :cond_3

    .line 25
    .line 26
    array-length v1, p3

    .line 27
    if-ge v1, v0, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v1, v2

    .line 31
    :goto_0
    if-ge v1, v0, :cond_2

    .line 32
    .line 33
    int-to-long v3, v1

    .line 34
    add-long/2addr v3, p1

    .line 35
    invoke-virtual {p0, v3, v4}, Lcg/g;->o(J)B

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    aget-byte v4, p3, v1

    .line 40
    .line 41
    if-eq v3, v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_3
    :goto_1
    return v2
.end method

.method public final e0(I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x6

    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x1

    .line 13
    const/16 v9, 0x80

    .line 14
    .line 15
    if-ge v1, v9, :cond_0

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p1}, Lcg/g;->X(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/16 v10, 0x800

    .line 22
    .line 23
    const/16 v11, 0x3f

    .line 24
    .line 25
    if-ge v1, v10, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, v7}, Lcg/g;->P(I)Lcg/C;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget v3, v2, Lcg/C;->c:I

    .line 32
    .line 33
    shr-int/lit8 v4, v1, 0x6

    .line 34
    .line 35
    or-int/lit16 v4, v4, 0xc0

    .line 36
    .line 37
    int-to-byte v4, v4

    .line 38
    iget-object v5, v2, Lcg/C;->a:[B

    .line 39
    .line 40
    aput-byte v4, v5, v3

    .line 41
    .line 42
    add-int/2addr v8, v3

    .line 43
    and-int/2addr v1, v11

    .line 44
    or-int/2addr v1, v9

    .line 45
    int-to-byte v1, v1

    .line 46
    aput-byte v1, v5, v8

    .line 47
    .line 48
    add-int/2addr v3, v7

    .line 49
    iput v3, v2, Lcg/C;->c:I

    .line 50
    .line 51
    iget-wide v1, v0, Lcg/g;->b:J

    .line 52
    .line 53
    const-wide/16 v3, 0x2

    .line 54
    .line 55
    add-long/2addr v1, v3

    .line 56
    iput-wide v1, v0, Lcg/g;->b:J

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const v10, 0xd800

    .line 60
    .line 61
    .line 62
    if-gt v10, v1, :cond_2

    .line 63
    .line 64
    const v10, 0xe000

    .line 65
    .line 66
    .line 67
    if-ge v1, v10, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0, v11}, Lcg/g;->X(I)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    const/high16 v10, 0x10000

    .line 74
    .line 75
    if-ge v1, v10, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0, v5}, Lcg/g;->P(I)Lcg/C;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget v3, v2, Lcg/C;->c:I

    .line 82
    .line 83
    shr-int/lit8 v4, v1, 0xc

    .line 84
    .line 85
    or-int/lit16 v4, v4, 0xe0

    .line 86
    .line 87
    int-to-byte v4, v4

    .line 88
    iget-object v10, v2, Lcg/C;->a:[B

    .line 89
    .line 90
    aput-byte v4, v10, v3

    .line 91
    .line 92
    add-int/2addr v8, v3

    .line 93
    shr-int/lit8 v4, v1, 0x6

    .line 94
    .line 95
    and-int/2addr v4, v11

    .line 96
    or-int/2addr v4, v9

    .line 97
    int-to-byte v4, v4

    .line 98
    aput-byte v4, v10, v8

    .line 99
    .line 100
    add-int/2addr v7, v3

    .line 101
    and-int/2addr v1, v11

    .line 102
    or-int/2addr v1, v9

    .line 103
    int-to-byte v1, v1

    .line 104
    aput-byte v1, v10, v7

    .line 105
    .line 106
    add-int/2addr v3, v5

    .line 107
    iput v3, v2, Lcg/C;->c:I

    .line 108
    .line 109
    iget-wide v1, v0, Lcg/g;->b:J

    .line 110
    .line 111
    const-wide/16 v3, 0x3

    .line 112
    .line 113
    add-long/2addr v1, v3

    .line 114
    iput-wide v1, v0, Lcg/g;->b:J

    .line 115
    .line 116
    return-void

    .line 117
    :cond_3
    const v10, 0x10ffff

    .line 118
    .line 119
    .line 120
    if-gt v1, v10, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0, v4}, Lcg/g;->P(I)Lcg/C;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iget v3, v2, Lcg/C;->c:I

    .line 127
    .line 128
    shr-int/lit8 v10, v1, 0x12

    .line 129
    .line 130
    or-int/lit16 v10, v10, 0xf0

    .line 131
    .line 132
    int-to-byte v10, v10

    .line 133
    iget-object v12, v2, Lcg/C;->a:[B

    .line 134
    .line 135
    aput-byte v10, v12, v3

    .line 136
    .line 137
    add-int/2addr v8, v3

    .line 138
    shr-int/lit8 v10, v1, 0xc

    .line 139
    .line 140
    and-int/2addr v10, v11

    .line 141
    or-int/2addr v10, v9

    .line 142
    int-to-byte v10, v10

    .line 143
    aput-byte v10, v12, v8

    .line 144
    .line 145
    add-int/2addr v7, v3

    .line 146
    shr-int/lit8 v6, v1, 0x6

    .line 147
    .line 148
    and-int/2addr v6, v11

    .line 149
    or-int/2addr v6, v9

    .line 150
    int-to-byte v6, v6

    .line 151
    aput-byte v6, v12, v7

    .line 152
    .line 153
    add-int/2addr v5, v3

    .line 154
    and-int/2addr v1, v11

    .line 155
    or-int/2addr v1, v9

    .line 156
    int-to-byte v1, v1

    .line 157
    aput-byte v1, v12, v5

    .line 158
    .line 159
    add-int/2addr v3, v4

    .line 160
    iput v3, v2, Lcg/C;->c:I

    .line 161
    .line 162
    iget-wide v1, v0, Lcg/g;->b:J

    .line 163
    .line 164
    const-wide/16 v3, 0x4

    .line 165
    .line 166
    add-long/2addr v1, v3

    .line 167
    iput-wide v1, v0, Lcg/g;->b:J

    .line 168
    .line 169
    return-void

    .line 170
    :cond_4
    new-instance v9, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    new-instance v10, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v11, "Unexpected code point: 0x"

    .line 175
    .line 176
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    if-eqz v1, :cond_6

    .line 180
    .line 181
    sget-object v11, Ldg/b;->a:[C

    .line 182
    .line 183
    shr-int/lit8 v12, v1, 0x1c

    .line 184
    .line 185
    and-int/lit8 v12, v12, 0xf

    .line 186
    .line 187
    aget-char v12, v11, v12

    .line 188
    .line 189
    shr-int/lit8 v13, v1, 0x18

    .line 190
    .line 191
    and-int/lit8 v13, v13, 0xf

    .line 192
    .line 193
    aget-char v13, v11, v13

    .line 194
    .line 195
    shr-int/lit8 v14, v1, 0x14

    .line 196
    .line 197
    and-int/lit8 v14, v14, 0xf

    .line 198
    .line 199
    aget-char v14, v11, v14

    .line 200
    .line 201
    shr-int/lit8 v15, v1, 0x10

    .line 202
    .line 203
    and-int/lit8 v15, v15, 0xf

    .line 204
    .line 205
    aget-char v15, v11, v15

    .line 206
    .line 207
    shr-int/lit8 v16, v1, 0xc

    .line 208
    .line 209
    and-int/lit8 v16, v16, 0xf

    .line 210
    .line 211
    aget-char v16, v11, v16

    .line 212
    .line 213
    shr-int/lit8 v17, v1, 0x8

    .line 214
    .line 215
    and-int/lit8 v17, v17, 0xf

    .line 216
    .line 217
    aget-char v17, v11, v17

    .line 218
    .line 219
    shr-int/lit8 v18, v1, 0x4

    .line 220
    .line 221
    and-int/lit8 v18, v18, 0xf

    .line 222
    .line 223
    aget-char v18, v11, v18

    .line 224
    .line 225
    and-int/lit8 v1, v1, 0xf

    .line 226
    .line 227
    aget-char v1, v11, v1

    .line 228
    .line 229
    new-array v11, v3, [C

    .line 230
    .line 231
    aput-char v12, v11, v2

    .line 232
    .line 233
    aput-char v13, v11, v8

    .line 234
    .line 235
    aput-char v14, v11, v7

    .line 236
    .line 237
    aput-char v15, v11, v5

    .line 238
    .line 239
    aput-char v16, v11, v4

    .line 240
    .line 241
    const/4 v4, 0x5

    .line 242
    aput-char v17, v11, v4

    .line 243
    .line 244
    aput-char v18, v11, v6

    .line 245
    .line 246
    const/4 v4, 0x7

    .line 247
    aput-char v1, v11, v4

    .line 248
    .line 249
    :goto_0
    if-ge v2, v3, :cond_5

    .line 250
    .line 251
    aget-char v1, v11, v2

    .line 252
    .line 253
    const/16 v4, 0x30

    .line 254
    .line 255
    if-ne v1, v4, :cond_5

    .line 256
    .line 257
    add-int/2addr v2, v8

    .line 258
    goto :goto_0

    .line 259
    :cond_5
    invoke-static {v11, v2, v3}, LBf/r;->Z([CII)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    goto :goto_1

    .line 264
    :cond_6
    const-string v1, "0"

    .line 265
    .line 266
    :goto_1
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-direct {v9, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v9
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, Lcg/g;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    iget-wide v5, v0, Lcg/g;->b:J

    .line 16
    .line 17
    check-cast v1, Lcg/g;

    .line 18
    .line 19
    iget-wide v7, v1, Lcg/g;->b:J

    .line 20
    .line 21
    cmp-long v3, v5, v7

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    return v4

    .line 26
    :cond_2
    const-wide/16 v7, 0x0

    .line 27
    .line 28
    cmp-long v3, v5, v7

    .line 29
    .line 30
    if-nez v3, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v3, v0, Lcg/g;->a:Lcg/C;

    .line 34
    .line 35
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v1, Lcg/g;->a:Lcg/C;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget v5, v3, Lcg/C;->b:I

    .line 44
    .line 45
    iget v6, v1, Lcg/C;->b:I

    .line 46
    .line 47
    move-wide v9, v7

    .line 48
    :goto_0
    iget-wide v11, v0, Lcg/g;->b:J

    .line 49
    .line 50
    cmp-long v11, v9, v11

    .line 51
    .line 52
    if-gez v11, :cond_8

    .line 53
    .line 54
    iget v11, v3, Lcg/C;->c:I

    .line 55
    .line 56
    sub-int/2addr v11, v5

    .line 57
    iget v12, v1, Lcg/C;->c:I

    .line 58
    .line 59
    sub-int/2addr v12, v6

    .line 60
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    int-to-long v11, v11

    .line 65
    move-wide v13, v7

    .line 66
    :goto_1
    cmp-long v15, v13, v11

    .line 67
    .line 68
    if-gez v15, :cond_5

    .line 69
    .line 70
    add-int/lit8 v15, v5, 0x1

    .line 71
    .line 72
    move/from16 v16, v2

    .line 73
    .line 74
    iget-object v2, v3, Lcg/C;->a:[B

    .line 75
    .line 76
    aget-byte v2, v2, v5

    .line 77
    .line 78
    add-int/lit8 v5, v6, 0x1

    .line 79
    .line 80
    move/from16 v17, v4

    .line 81
    .line 82
    iget-object v4, v1, Lcg/C;->a:[B

    .line 83
    .line 84
    aget-byte v4, v4, v6

    .line 85
    .line 86
    if-eq v2, v4, :cond_4

    .line 87
    .line 88
    return v17

    .line 89
    :cond_4
    const-wide/16 v18, 0x1

    .line 90
    .line 91
    add-long v13, v13, v18

    .line 92
    .line 93
    move v6, v5

    .line 94
    move v5, v15

    .line 95
    move/from16 v2, v16

    .line 96
    .line 97
    move/from16 v4, v17

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    move/from16 v16, v2

    .line 101
    .line 102
    move/from16 v17, v4

    .line 103
    .line 104
    iget v2, v3, Lcg/C;->c:I

    .line 105
    .line 106
    if-ne v5, v2, :cond_6

    .line 107
    .line 108
    iget-object v2, v3, Lcg/C;->f:Lcg/C;

    .line 109
    .line 110
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget v3, v2, Lcg/C;->b:I

    .line 114
    .line 115
    move v5, v3

    .line 116
    move-object v3, v2

    .line 117
    :cond_6
    iget v2, v1, Lcg/C;->c:I

    .line 118
    .line 119
    if-ne v6, v2, :cond_7

    .line 120
    .line 121
    iget-object v1, v1, Lcg/C;->f:Lcg/C;

    .line 122
    .line 123
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget v2, v1, Lcg/C;->b:I

    .line 127
    .line 128
    move v6, v2

    .line 129
    :cond_7
    add-long/2addr v9, v11

    .line 130
    move/from16 v2, v16

    .line 131
    .line 132
    move/from16 v4, v17

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_8
    move/from16 v16, v2

    .line 136
    .line 137
    return v16
.end method

.method public final exhausted()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getBuffer()Lcg/g;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h(Lcg/g;JJ)V
    .locals 7

    .line 1
    const-string v0, "out"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lcg/g;->b:J

    .line 7
    .line 8
    move-wide v3, p2

    .line 9
    move-wide v5, p4

    .line 10
    invoke-static/range {v1 .. v6}, Lcg/b;->f(JJJ)V

    .line 11
    .line 12
    .line 13
    const-wide/16 p2, 0x0

    .line 14
    .line 15
    cmp-long p4, v5, p2

    .line 16
    .line 17
    if-nez p4, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    iget-wide p4, p1, Lcg/g;->b:J

    .line 21
    .line 22
    add-long/2addr p4, v5

    .line 23
    iput-wide p4, p1, Lcg/g;->b:J

    .line 24
    .line 25
    iget-object p4, p0, Lcg/g;->a:Lcg/C;

    .line 26
    .line 27
    :goto_0
    invoke-static {p4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget p5, p4, Lcg/C;->c:I

    .line 31
    .line 32
    iget v0, p4, Lcg/C;->b:I

    .line 33
    .line 34
    sub-int/2addr p5, v0

    .line 35
    int-to-long v0, p5

    .line 36
    cmp-long p5, v3, v0

    .line 37
    .line 38
    if-ltz p5, :cond_1

    .line 39
    .line 40
    sub-long/2addr v3, v0

    .line 41
    iget-object p4, p4, Lcg/C;->f:Lcg/C;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v0, p4

    .line 45
    move-wide p4, v5

    .line 46
    :goto_1
    cmp-long v1, p4, p2

    .line 47
    .line 48
    if-lez v1, :cond_3

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcg/C;->c()Lcg/C;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget v2, v1, Lcg/C;->b:I

    .line 58
    .line 59
    long-to-int v3, v3

    .line 60
    add-int/2addr v2, v3

    .line 61
    iput v2, v1, Lcg/C;->b:I

    .line 62
    .line 63
    long-to-int v3, p4

    .line 64
    add-int/2addr v2, v3

    .line 65
    iget v3, v1, Lcg/C;->c:I

    .line 66
    .line 67
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iput v2, v1, Lcg/C;->c:I

    .line 72
    .line 73
    iget-object v2, p1, Lcg/g;->a:Lcg/C;

    .line 74
    .line 75
    if-nez v2, :cond_2

    .line 76
    .line 77
    iput-object v1, v1, Lcg/C;->g:Lcg/C;

    .line 78
    .line 79
    iput-object v1, v1, Lcg/C;->f:Lcg/C;

    .line 80
    .line 81
    iput-object v1, p1, Lcg/g;->a:Lcg/C;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    iget-object v2, v2, Lcg/C;->g:Lcg/C;

    .line 85
    .line 86
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v1}, Lcg/C;->b(Lcg/C;)V

    .line 90
    .line 91
    .line 92
    :goto_2
    iget v2, v1, Lcg/C;->c:I

    .line 93
    .line 94
    iget v1, v1, Lcg/C;->b:I

    .line 95
    .line 96
    sub-int/2addr v2, v1

    .line 97
    int-to-long v1, v2

    .line 98
    sub-long/2addr p4, v1

    .line 99
    iget-object v0, v0, Lcg/C;->f:Lcg/C;

    .line 100
    .line 101
    move-wide v3, p2

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    :goto_3
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    :cond_1
    iget v2, v0, Lcg/C;->b:I

    .line 9
    .line 10
    iget v3, v0, Lcg/C;->c:I

    .line 11
    .line 12
    :goto_0
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v4, v0, Lcg/C;->a:[B

    .line 17
    .line 18
    aget-byte v4, v4, v2

    .line 19
    .line 20
    add-int/2addr v1, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, v0, Lcg/C;->f:Lcg/C;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcg/g;->a:Lcg/C;

    .line 30
    .line 31
    if-ne v0, v2, :cond_1

    .line 32
    .line 33
    return v1
.end method

.method public final indexOf(BJJ)J
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, v0, p2

    .line 4
    .line 5
    if-gtz v2, :cond_b

    .line 6
    .line 7
    cmp-long v2, p2, p4

    .line 8
    .line 9
    if-gtz v2, :cond_b

    .line 10
    .line 11
    iget-wide v2, p0, Lcg/g;->b:J

    .line 12
    .line 13
    cmp-long v4, p4, v2

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    move-wide p4, v2

    .line 18
    :cond_0
    cmp-long v4, p2, p4

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_1
    iget-object v4, p0, Lcg/g;->a:Lcg/C;

    .line 25
    .line 26
    if-nez v4, :cond_2

    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_2
    sub-long v5, v2, p2

    .line 31
    .line 32
    cmp-long v5, v5, p2

    .line 33
    .line 34
    if-gez v5, :cond_6

    .line 35
    .line 36
    :goto_0
    cmp-long v0, v2, p2

    .line 37
    .line 38
    if-lez v0, :cond_3

    .line 39
    .line 40
    iget-object v4, v4, Lcg/C;->g:Lcg/C;

    .line 41
    .line 42
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget v0, v4, Lcg/C;->c:I

    .line 46
    .line 47
    iget v1, v4, Lcg/C;->b:I

    .line 48
    .line 49
    sub-int/2addr v0, v1

    .line 50
    int-to-long v0, v0

    .line 51
    sub-long/2addr v2, v0

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    :goto_1
    cmp-long v0, v2, p4

    .line 54
    .line 55
    if-gez v0, :cond_a

    .line 56
    .line 57
    iget v0, v4, Lcg/C;->c:I

    .line 58
    .line 59
    int-to-long v0, v0

    .line 60
    iget v5, v4, Lcg/C;->b:I

    .line 61
    .line 62
    int-to-long v5, v5

    .line 63
    add-long/2addr v5, p4

    .line 64
    sub-long/2addr v5, v2

    .line 65
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    long-to-int v0, v0

    .line 70
    iget v1, v4, Lcg/C;->b:I

    .line 71
    .line 72
    int-to-long v5, v1

    .line 73
    add-long/2addr v5, p2

    .line 74
    sub-long/2addr v5, v2

    .line 75
    long-to-int p2, v5

    .line 76
    :goto_2
    if-ge p2, v0, :cond_5

    .line 77
    .line 78
    iget-object p3, v4, Lcg/C;->a:[B

    .line 79
    .line 80
    aget-byte p3, p3, p2

    .line 81
    .line 82
    if-ne p3, p1, :cond_4

    .line 83
    .line 84
    iget p1, v4, Lcg/C;->b:I

    .line 85
    .line 86
    sub-int/2addr p2, p1

    .line 87
    int-to-long p1, p2

    .line 88
    add-long/2addr p1, v2

    .line 89
    return-wide p1

    .line 90
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    iget p2, v4, Lcg/C;->c:I

    .line 94
    .line 95
    iget p3, v4, Lcg/C;->b:I

    .line 96
    .line 97
    sub-int/2addr p2, p3

    .line 98
    int-to-long p2, p2

    .line 99
    add-long/2addr v2, p2

    .line 100
    iget-object v4, v4, Lcg/C;->f:Lcg/C;

    .line 101
    .line 102
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-wide p2, v2

    .line 106
    goto :goto_1

    .line 107
    :cond_6
    :goto_3
    iget v2, v4, Lcg/C;->c:I

    .line 108
    .line 109
    iget v3, v4, Lcg/C;->b:I

    .line 110
    .line 111
    sub-int/2addr v2, v3

    .line 112
    int-to-long v2, v2

    .line 113
    add-long/2addr v2, v0

    .line 114
    cmp-long v5, v2, p2

    .line 115
    .line 116
    if-gtz v5, :cond_7

    .line 117
    .line 118
    iget-object v4, v4, Lcg/C;->f:Lcg/C;

    .line 119
    .line 120
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-wide v0, v2

    .line 124
    goto :goto_3

    .line 125
    :cond_7
    :goto_4
    cmp-long v2, v0, p4

    .line 126
    .line 127
    if-gez v2, :cond_a

    .line 128
    .line 129
    iget v2, v4, Lcg/C;->c:I

    .line 130
    .line 131
    int-to-long v2, v2

    .line 132
    iget v5, v4, Lcg/C;->b:I

    .line 133
    .line 134
    int-to-long v5, v5

    .line 135
    add-long/2addr v5, p4

    .line 136
    sub-long/2addr v5, v0

    .line 137
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 138
    .line 139
    .line 140
    move-result-wide v2

    .line 141
    long-to-int v2, v2

    .line 142
    iget v3, v4, Lcg/C;->b:I

    .line 143
    .line 144
    int-to-long v5, v3

    .line 145
    add-long/2addr v5, p2

    .line 146
    sub-long/2addr v5, v0

    .line 147
    long-to-int p2, v5

    .line 148
    :goto_5
    if-ge p2, v2, :cond_9

    .line 149
    .line 150
    iget-object p3, v4, Lcg/C;->a:[B

    .line 151
    .line 152
    aget-byte p3, p3, p2

    .line 153
    .line 154
    if-ne p3, p1, :cond_8

    .line 155
    .line 156
    iget p1, v4, Lcg/C;->b:I

    .line 157
    .line 158
    sub-int/2addr p2, p1

    .line 159
    int-to-long p1, p2

    .line 160
    add-long/2addr p1, v0

    .line 161
    return-wide p1

    .line 162
    :cond_8
    add-int/lit8 p2, p2, 0x1

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_9
    iget p2, v4, Lcg/C;->c:I

    .line 166
    .line 167
    iget p3, v4, Lcg/C;->b:I

    .line 168
    .line 169
    sub-int/2addr p2, p3

    .line 170
    int-to-long p2, p2

    .line 171
    add-long/2addr v0, p2

    .line 172
    iget-object v4, v4, Lcg/C;->f:Lcg/C;

    .line 173
    .line 174
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move-wide p2, v0

    .line 178
    goto :goto_4

    .line 179
    :cond_a
    :goto_6
    const-wide/16 p1, -0x1

    .line 180
    .line 181
    return-wide p1

    .line 182
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v0, "size="

    .line 185
    .line 186
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iget-wide v0, p0, Lcg/g;->b:J

    .line 190
    .line 191
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, " fromIndex="

    .line 195
    .line 196
    const-string v1, " toIndex="

    .line 197
    .line 198
    invoke-static {p1, v0, p2, p3, v1}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p2
.end method

.method public final inputStream()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, LCd/t;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final m(Lcg/j;)J
    .locals 2

    .line 1
    const-string v0, "targetBytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, p1}, Lcg/g;->y(JLcg/j;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final o(J)B
    .locals 7

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v4, 0x1

    .line 4
    .line 5
    move-wide v2, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lcg/b;->f(JJJ)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcg/g;->a:Lcg/C;

    .line 10
    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    iget-wide v0, p0, Lcg/g;->b:J

    .line 14
    .line 15
    sub-long v4, v0, v2

    .line 16
    .line 17
    cmp-long p2, v4, v2

    .line 18
    .line 19
    if-gez p2, :cond_1

    .line 20
    .line 21
    :goto_0
    cmp-long p2, v0, v2

    .line 22
    .line 23
    if-lez p2, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Lcg/C;->g:Lcg/C;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget p2, p1, Lcg/C;->c:I

    .line 31
    .line 32
    iget v4, p1, Lcg/C;->b:I

    .line 33
    .line 34
    sub-int/2addr p2, v4

    .line 35
    int-to-long v4, p2

    .line 36
    sub-long/2addr v0, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget p2, p1, Lcg/C;->b:I

    .line 39
    .line 40
    int-to-long v4, p2

    .line 41
    add-long/2addr v4, v2

    .line 42
    sub-long/2addr v4, v0

    .line 43
    long-to-int p2, v4

    .line 44
    iget-object p1, p1, Lcg/C;->a:[B

    .line 45
    .line 46
    aget-byte p1, p1, p2

    .line 47
    .line 48
    return p1

    .line 49
    :cond_1
    const-wide/16 v0, 0x0

    .line 50
    .line 51
    :goto_1
    iget p2, p1, Lcg/C;->c:I

    .line 52
    .line 53
    iget v4, p1, Lcg/C;->b:I

    .line 54
    .line 55
    sub-int/2addr p2, v4

    .line 56
    int-to-long v5, p2

    .line 57
    add-long/2addr v5, v0

    .line 58
    cmp-long p2, v5, v2

    .line 59
    .line 60
    if-gtz p2, :cond_2

    .line 61
    .line 62
    iget-object p1, p1, Lcg/C;->f:Lcg/C;

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-wide v0, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    int-to-long v4, v4

    .line 70
    add-long/2addr v4, v2

    .line 71
    sub-long/2addr v4, v0

    .line 72
    long-to-int p2, v4

    .line 73
    iget-object p1, p1, Lcg/C;->a:[B

    .line 74
    .line 75
    aget-byte p1, p1, p2

    .line 76
    .line 77
    return p1

    .line 78
    :cond_3
    const/4 p1, 0x0

    .line 79
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public final q(Lcg/H;)J
    .locals 6

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :goto_0
    const-wide/16 v2, 0x2000

    .line 9
    .line 10
    invoke-interface {p1, p0, v2, v3}, Lcg/H;->read(Lcg/g;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide/16 v4, -0x1

    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    add-long/2addr v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-wide v0
.end method

.method public final r(Lcg/x;)I
    .locals 3

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, p1, v0}, Ldg/a;->c(Lcg/g;Lcg/x;Z)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object p1, p1, Lcg/x;->a:[Lcg/j;

    .line 16
    .line 17
    aget-object p1, p1, v0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcg/j;->d()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-long v1, p1

    .line 24
    invoke-virtual {p0, v1, v2}, Lcg/g;->skip(J)V

    .line 25
    .line 26
    .line 27
    return v0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget v2, v0, Lcg/C;->c:I

    iget v3, v0, Lcg/C;->b:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 12
    iget-object v2, v0, Lcg/C;->a:[B

    iget v3, v0, Lcg/C;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 13
    iget p1, v0, Lcg/C;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Lcg/C;->b:I

    .line 14
    iget-wide v2, p0, Lcg/g;->b:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcg/g;->b:J

    .line 15
    iget v2, v0, Lcg/C;->c:I

    if-ne p1, v2, :cond_1

    .line 16
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    move-result-object p1

    iput-object p1, p0, Lcg/g;->a:Lcg/C;

    .line 17
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    :cond_1
    return v1
.end method

.method public final read([BII)I
    .locals 7

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lcg/b;->f(JJJ)V

    .line 19
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 20
    :cond_0
    iget v1, v0, Lcg/C;->c:I

    iget v2, v0, Lcg/C;->b:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 21
    iget v1, v0, Lcg/C;->b:I

    add-int v2, v1, p3

    .line 22
    iget-object v3, v0, Lcg/C;->a:[B

    invoke-static {p2, v1, v2, v3, p1}, Lff/m;->f0(III[B[B)V

    .line 23
    iget p1, v0, Lcg/C;->b:I

    add-int/2addr p1, p3

    iput p1, v0, Lcg/C;->b:I

    .line 24
    iget-wide v1, p0, Lcg/g;->b:J

    int-to-long v3, p3

    sub-long/2addr v1, v3

    .line 25
    iput-wide v1, p0, Lcg/g;->b:J

    .line 26
    iget p2, v0, Lcg/C;->c:I

    if-ne p1, p2, :cond_1

    .line 27
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    move-result-object p1

    iput-object p1, p0, Lcg/g;->a:Lcg/C;

    .line 28
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    :cond_1
    return p3
.end method

.method public final read(Lcg/g;J)J
    .locals 4

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    .line 1
    iget-wide v2, p0, Lcg/g;->b:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    cmp-long v0, p2, v2

    if-lez v0, :cond_1

    move-wide p2, v2

    .line 2
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lcg/g;->E(Lcg/g;J)V

    return-wide p2

    .line 3
    :cond_2
    const-string p1, "byteCount < 0: "

    .line 4
    invoke-static {p2, p3, p1}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final readByte()B
    .locals 8

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lcg/C;->b:I

    .line 15
    .line 16
    iget v2, v0, Lcg/C;->c:I

    .line 17
    .line 18
    add-int/lit8 v3, v1, 0x1

    .line 19
    .line 20
    iget-object v4, v0, Lcg/C;->a:[B

    .line 21
    .line 22
    aget-byte v1, v4, v1

    .line 23
    .line 24
    iget-wide v4, p0, Lcg/g;->b:J

    .line 25
    .line 26
    const-wide/16 v6, 0x1

    .line 27
    .line 28
    sub-long/2addr v4, v6

    .line 29
    iput-wide v4, p0, Lcg/g;->b:J

    .line 30
    .line 31
    if-ne v3, v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lcg/g;->a:Lcg/C;

    .line 38
    .line 39
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    .line 40
    .line 41
    .line 42
    return v1

    .line 43
    :cond_0
    iput v3, v0, Lcg/C;->b:I

    .line 44
    .line 45
    return v1

    .line 46
    :cond_1
    new-instance v0, Ljava/io/EOFException;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final readByteArray()[B
    .locals 2

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    invoke-virtual {p0, v0, v1}, Lcg/g;->readByteArray(J)[B

    move-result-object v0

    return-object v0
.end method

.method public final readByteArray(J)[B
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gtz v0, :cond_3

    .line 3
    iget-wide v0, p0, Lcg/g;->b:J

    cmp-long v0, v0, p1

    if-ltz v0, :cond_2

    long-to-int p1, p1

    .line 4
    new-array p1, p1, [B

    .line 5
    const-string p2, "sink"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 6
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_1

    .line 7
    array-length v0, p1

    sub-int/2addr v0, p2

    invoke-virtual {p0, p1, p2, v0}, Lcg/g;->read([BII)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    add-int/2addr p2, v0

    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return-object p1

    .line 9
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 10
    :cond_3
    const-string v0, "byteCount: "

    .line 11
    invoke-static {p1, p2, v0}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 12
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final readByteString()Lcg/j;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcg/g;->z(J)Lcg/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final readDecimalLong()J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x30

    .line 5
    .line 6
    iget-wide v5, v0, Lcg/g;->b:J

    .line 7
    .line 8
    const-wide/16 v7, 0x0

    .line 9
    .line 10
    cmp-long v5, v5, v7

    .line 11
    .line 12
    if-eqz v5, :cond_f

    .line 13
    .line 14
    const-wide/16 v5, -0x7

    .line 15
    .line 16
    move-wide v9, v7

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    :goto_0
    iget-object v14, v0, Lcg/g;->a:Lcg/C;

    .line 21
    .line 22
    invoke-static {v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget v15, v14, Lcg/C;->b:I

    .line 26
    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    iget v3, v14, Lcg/C;->c:I

    .line 30
    .line 31
    :goto_1
    if-ge v15, v3, :cond_6

    .line 32
    .line 33
    const/16 v17, 0x1

    .line 34
    .line 35
    iget-object v4, v14, Lcg/C;->a:[B

    .line 36
    .line 37
    aget-byte v4, v4, v15

    .line 38
    .line 39
    move/from16 v18, v2

    .line 40
    .line 41
    if-lt v4, v2, :cond_4

    .line 42
    .line 43
    const/16 v2, 0x39

    .line 44
    .line 45
    if-gt v4, v2, :cond_4

    .line 46
    .line 47
    rsub-int/lit8 v2, v4, 0x30

    .line 48
    .line 49
    const-wide v19, -0xcccccccccccccccL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    cmp-long v19, v9, v19

    .line 55
    .line 56
    if-ltz v19, :cond_2

    .line 57
    .line 58
    if-nez v19, :cond_0

    .line 59
    .line 60
    move-wide/from16 v19, v7

    .line 61
    .line 62
    int-to-long v7, v2

    .line 63
    cmp-long v7, v7, v5

    .line 64
    .line 65
    if-gez v7, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_0
    move-wide/from16 v19, v7

    .line 69
    .line 70
    :cond_1
    const-wide/16 v7, 0xa

    .line 71
    .line 72
    mul-long/2addr v9, v7

    .line 73
    int-to-long v7, v2

    .line 74
    add-long/2addr v9, v7

    .line 75
    goto :goto_3

    .line 76
    :cond_2
    :goto_2
    new-instance v1, Lcg/g;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v9, v10}, Lcg/g;->Y(J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v4}, Lcg/g;->X(I)V

    .line 85
    .line 86
    .line 87
    if-nez v12, :cond_3

    .line 88
    .line 89
    invoke-virtual {v1}, Lcg/g;->readByte()B

    .line 90
    .line 91
    .line 92
    :cond_3
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v3, "Number too large: "

    .line 99
    .line 100
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v2, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_4
    move-wide/from16 v19, v7

    .line 109
    .line 110
    const/16 v2, 0x2d

    .line 111
    .line 112
    if-ne v4, v2, :cond_5

    .line 113
    .line 114
    if-nez v11, :cond_5

    .line 115
    .line 116
    const-wide/16 v7, 0x1

    .line 117
    .line 118
    sub-long/2addr v5, v7

    .line 119
    move/from16 v12, v17

    .line 120
    .line 121
    :goto_3
    add-int/lit8 v15, v15, 0x1

    .line 122
    .line 123
    add-int/lit8 v11, v11, 0x1

    .line 124
    .line 125
    move/from16 v2, v18

    .line 126
    .line 127
    move-wide/from16 v7, v19

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    move/from16 v13, v17

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_6
    move/from16 v18, v2

    .line 134
    .line 135
    move-wide/from16 v19, v7

    .line 136
    .line 137
    const/16 v17, 0x1

    .line 138
    .line 139
    :goto_4
    if-ne v15, v3, :cond_7

    .line 140
    .line 141
    invoke-virtual {v14}, Lcg/C;->a()Lcg/C;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iput-object v2, v0, Lcg/g;->a:Lcg/C;

    .line 146
    .line 147
    invoke-static {v14}, Lcg/D;->a(Lcg/C;)V

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_7
    iput v15, v14, Lcg/C;->b:I

    .line 152
    .line 153
    :goto_5
    if-nez v13, :cond_9

    .line 154
    .line 155
    iget-object v2, v0, Lcg/g;->a:Lcg/C;

    .line 156
    .line 157
    if-nez v2, :cond_8

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_8
    move/from16 v2, v18

    .line 161
    .line 162
    move-wide/from16 v7, v19

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_9
    :goto_6
    iget-wide v2, v0, Lcg/g;->b:J

    .line 167
    .line 168
    int-to-long v4, v11

    .line 169
    sub-long/2addr v2, v4

    .line 170
    iput-wide v2, v0, Lcg/g;->b:J

    .line 171
    .line 172
    if-eqz v12, :cond_a

    .line 173
    .line 174
    move v4, v1

    .line 175
    goto :goto_7

    .line 176
    :cond_a
    move/from16 v4, v17

    .line 177
    .line 178
    :goto_7
    if-ge v11, v4, :cond_d

    .line 179
    .line 180
    cmp-long v2, v2, v19

    .line 181
    .line 182
    if-eqz v2, :cond_c

    .line 183
    .line 184
    if-eqz v12, :cond_b

    .line 185
    .line 186
    const-string v2, "Expected a digit"

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_b
    const-string v2, "Expected a digit or \'-\'"

    .line 190
    .line 191
    :goto_8
    new-instance v3, Ljava/lang/NumberFormatException;

    .line 192
    .line 193
    const-string v4, " but was 0x"

    .line 194
    .line 195
    invoke-static {v2, v4}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    move-wide/from16 v4, v19

    .line 200
    .line 201
    invoke-virtual {v0, v4, v5}, Lcg/g;->o(J)B

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    sget-object v5, Ldg/b;->a:[C

    .line 206
    .line 207
    shr-int/lit8 v6, v4, 0x4

    .line 208
    .line 209
    and-int/lit8 v6, v6, 0xf

    .line 210
    .line 211
    aget-char v6, v5, v6

    .line 212
    .line 213
    and-int/lit8 v4, v4, 0xf

    .line 214
    .line 215
    aget-char v4, v5, v4

    .line 216
    .line 217
    new-array v1, v1, [C

    .line 218
    .line 219
    aput-char v6, v1, v16

    .line 220
    .line 221
    aput-char v4, v1, v17

    .line 222
    .line 223
    new-instance v4, Ljava/lang/String;

    .line 224
    .line 225
    invoke-direct {v4, v1}, Ljava/lang/String;-><init>([C)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-direct {v3, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v3

    .line 239
    :cond_c
    new-instance v1, Ljava/io/EOFException;

    .line 240
    .line 241
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 242
    .line 243
    .line 244
    throw v1

    .line 245
    :cond_d
    if-eqz v12, :cond_e

    .line 246
    .line 247
    return-wide v9

    .line 248
    :cond_e
    neg-long v1, v9

    .line 249
    return-wide v1

    .line 250
    :cond_f
    new-instance v1, Ljava/io/EOFException;

    .line 251
    .line 252
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 253
    .line 254
    .line 255
    throw v1
.end method

.method public final readHexadecimalUnsignedLong()J
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/16 v2, 0x30

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-wide v5, v0, Lcg/g;->b:J

    .line 9
    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    cmp-long v5, v5, v7

    .line 13
    .line 14
    if-eqz v5, :cond_9

    .line 15
    .line 16
    move v9, v3

    .line 17
    move v10, v9

    .line 18
    move-wide v5, v7

    .line 19
    :cond_0
    iget-object v11, v0, Lcg/g;->a:Lcg/C;

    .line 20
    .line 21
    invoke-static {v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget v12, v11, Lcg/C;->b:I

    .line 25
    .line 26
    iget v13, v11, Lcg/C;->c:I

    .line 27
    .line 28
    :goto_0
    if-ge v12, v13, :cond_6

    .line 29
    .line 30
    iget-object v14, v11, Lcg/C;->a:[B

    .line 31
    .line 32
    aget-byte v14, v14, v12

    .line 33
    .line 34
    if-lt v14, v2, :cond_1

    .line 35
    .line 36
    const/16 v15, 0x39

    .line 37
    .line 38
    if-gt v14, v15, :cond_1

    .line 39
    .line 40
    add-int/lit8 v15, v14, -0x30

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v15, 0x61

    .line 44
    .line 45
    if-lt v14, v15, :cond_2

    .line 46
    .line 47
    const/16 v15, 0x66

    .line 48
    .line 49
    if-gt v14, v15, :cond_2

    .line 50
    .line 51
    add-int/lit8 v15, v14, -0x57

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/16 v15, 0x41

    .line 55
    .line 56
    if-lt v14, v15, :cond_4

    .line 57
    .line 58
    const/16 v15, 0x46

    .line 59
    .line 60
    if-gt v14, v15, :cond_4

    .line 61
    .line 62
    add-int/lit8 v15, v14, -0x37

    .line 63
    .line 64
    :goto_1
    const-wide/high16 v16, -0x1000000000000000L    # -3.105036184601418E231

    .line 65
    .line 66
    and-long v16, v5, v16

    .line 67
    .line 68
    cmp-long v16, v16, v7

    .line 69
    .line 70
    if-nez v16, :cond_3

    .line 71
    .line 72
    shl-long/2addr v5, v1

    .line 73
    int-to-long v14, v15

    .line 74
    or-long/2addr v5, v14

    .line 75
    add-int/2addr v12, v4

    .line 76
    add-int/2addr v9, v4

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    new-instance v1, Lcg/g;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v5, v6}, Lcg/g;->Z(J)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v14}, Lcg/g;->X(I)V

    .line 87
    .line 88
    .line 89
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 90
    .line 91
    invoke-virtual {v1}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v3, "Number too large: "

    .line 96
    .line 97
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-direct {v2, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v2

    .line 105
    :cond_4
    if-eqz v9, :cond_5

    .line 106
    .line 107
    move v10, v4

    .line 108
    goto :goto_2

    .line 109
    :cond_5
    new-instance v2, Ljava/lang/NumberFormatException;

    .line 110
    .line 111
    sget-object v5, Ldg/b;->a:[C

    .line 112
    .line 113
    shr-int/lit8 v1, v14, 0x4

    .line 114
    .line 115
    and-int/lit8 v1, v1, 0xf

    .line 116
    .line 117
    aget-char v1, v5, v1

    .line 118
    .line 119
    and-int/lit8 v6, v14, 0xf

    .line 120
    .line 121
    aget-char v5, v5, v6

    .line 122
    .line 123
    const/4 v6, 0x2

    .line 124
    new-array v6, v6, [C

    .line 125
    .line 126
    aput-char v1, v6, v3

    .line 127
    .line 128
    aput-char v5, v6, v4

    .line 129
    .line 130
    new-instance v1, Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v1, v6}, Ljava/lang/String;-><init>([C)V

    .line 133
    .line 134
    .line 135
    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 136
    .line 137
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-direct {v2, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v2

    .line 145
    :cond_6
    :goto_2
    if-ne v12, v13, :cond_7

    .line 146
    .line 147
    invoke-virtual {v11}, Lcg/C;->a()Lcg/C;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    iput-object v12, v0, Lcg/g;->a:Lcg/C;

    .line 152
    .line 153
    invoke-static {v11}, Lcg/D;->a(Lcg/C;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    iput v12, v11, Lcg/C;->b:I

    .line 158
    .line 159
    :goto_3
    if-nez v10, :cond_8

    .line 160
    .line 161
    iget-object v11, v0, Lcg/g;->a:Lcg/C;

    .line 162
    .line 163
    if-nez v11, :cond_0

    .line 164
    .line 165
    :cond_8
    iget-wide v1, v0, Lcg/g;->b:J

    .line 166
    .line 167
    int-to-long v3, v9

    .line 168
    sub-long/2addr v1, v3

    .line 169
    iput-wide v1, v0, Lcg/g;->b:J

    .line 170
    .line 171
    return-wide v5

    .line 172
    :cond_9
    new-instance v1, Ljava/io/EOFException;

    .line 173
    .line 174
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 175
    .line 176
    .line 177
    throw v1
.end method

.method public final readInt()I
    .locals 9

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x4

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lcg/C;->b:I

    .line 15
    .line 16
    iget v4, v0, Lcg/C;->c:I

    .line 17
    .line 18
    sub-int v5, v4, v1

    .line 19
    .line 20
    int-to-long v5, v5

    .line 21
    cmp-long v5, v5, v2

    .line 22
    .line 23
    if-gez v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    .line 31
    shl-int/lit8 v0, v0, 0x18

    .line 32
    .line 33
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    and-int/lit16 v1, v1, 0xff

    .line 38
    .line 39
    shl-int/lit8 v1, v1, 0x10

    .line 40
    .line 41
    or-int/2addr v0, v1

    .line 42
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    and-int/lit16 v1, v1, 0xff

    .line 47
    .line 48
    shl-int/lit8 v1, v1, 0x8

    .line 49
    .line 50
    or-int/2addr v0, v1

    .line 51
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    and-int/lit16 v1, v1, 0xff

    .line 56
    .line 57
    or-int/2addr v0, v1

    .line 58
    return v0

    .line 59
    :cond_0
    add-int/lit8 v5, v1, 0x1

    .line 60
    .line 61
    iget-object v6, v0, Lcg/C;->a:[B

    .line 62
    .line 63
    aget-byte v7, v6, v1

    .line 64
    .line 65
    and-int/lit16 v7, v7, 0xff

    .line 66
    .line 67
    shl-int/lit8 v7, v7, 0x18

    .line 68
    .line 69
    add-int/lit8 v8, v1, 0x2

    .line 70
    .line 71
    aget-byte v5, v6, v5

    .line 72
    .line 73
    and-int/lit16 v5, v5, 0xff

    .line 74
    .line 75
    shl-int/lit8 v5, v5, 0x10

    .line 76
    .line 77
    or-int/2addr v5, v7

    .line 78
    add-int/lit8 v7, v1, 0x3

    .line 79
    .line 80
    aget-byte v8, v6, v8

    .line 81
    .line 82
    and-int/lit16 v8, v8, 0xff

    .line 83
    .line 84
    shl-int/lit8 v8, v8, 0x8

    .line 85
    .line 86
    or-int/2addr v5, v8

    .line 87
    add-int/lit8 v1, v1, 0x4

    .line 88
    .line 89
    aget-byte v6, v6, v7

    .line 90
    .line 91
    and-int/lit16 v6, v6, 0xff

    .line 92
    .line 93
    or-int/2addr v5, v6

    .line 94
    iget-wide v6, p0, Lcg/g;->b:J

    .line 95
    .line 96
    sub-long/2addr v6, v2

    .line 97
    iput-wide v6, p0, Lcg/g;->b:J

    .line 98
    .line 99
    if-ne v1, v4, :cond_1

    .line 100
    .line 101
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iput-object v1, p0, Lcg/g;->a:Lcg/C;

    .line 106
    .line 107
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    .line 108
    .line 109
    .line 110
    return v5

    .line 111
    :cond_1
    iput v1, v0, Lcg/C;->b:I

    .line 112
    .line 113
    return v5

    .line 114
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 117
    .line 118
    .line 119
    throw v0
.end method

.method public final readShort()S
    .locals 9

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x2

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lcg/C;->b:I

    .line 15
    .line 16
    iget v4, v0, Lcg/C;->c:I

    .line 17
    .line 18
    sub-int v5, v4, v1

    .line 19
    .line 20
    const/4 v6, 0x2

    .line 21
    if-ge v5, v6, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/lit16 v0, v0, 0xff

    .line 28
    .line 29
    shl-int/lit8 v0, v0, 0x8

    .line 30
    .line 31
    invoke-virtual {p0}, Lcg/g;->readByte()B

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit16 v1, v1, 0xff

    .line 36
    .line 37
    or-int/2addr v0, v1

    .line 38
    int-to-short v0, v0

    .line 39
    return v0

    .line 40
    :cond_0
    add-int/lit8 v5, v1, 0x1

    .line 41
    .line 42
    iget-object v7, v0, Lcg/C;->a:[B

    .line 43
    .line 44
    aget-byte v8, v7, v1

    .line 45
    .line 46
    and-int/lit16 v8, v8, 0xff

    .line 47
    .line 48
    shl-int/lit8 v8, v8, 0x8

    .line 49
    .line 50
    add-int/2addr v1, v6

    .line 51
    aget-byte v5, v7, v5

    .line 52
    .line 53
    and-int/lit16 v5, v5, 0xff

    .line 54
    .line 55
    or-int/2addr v5, v8

    .line 56
    iget-wide v6, p0, Lcg/g;->b:J

    .line 57
    .line 58
    sub-long/2addr v6, v2

    .line 59
    iput-wide v6, p0, Lcg/g;->b:J

    .line 60
    .line 61
    if-ne v1, v4, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, Lcg/g;->a:Lcg/C;

    .line 68
    .line 69
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iput v1, v0, Lcg/C;->b:I

    .line 74
    .line 75
    :goto_0
    int-to-short v0, v5

    .line 76
    return v0

    .line 77
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw v0
.end method

.method public final readShortLe()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcg/g;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xff00

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, v0

    .line 9
    ushr-int/lit8 v1, v1, 0x8

    .line 10
    .line 11
    and-int/lit16 v0, v0, 0xff

    .line 12
    .line 13
    shl-int/lit8 v0, v0, 0x8

    .line 14
    .line 15
    or-int/2addr v0, v1

    .line 16
    int-to-short v0, v0

    .line 17
    return v0
.end method

.method public final readString(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 6

    const-string v0, "charset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_4

    const-wide/32 v1, 0x7fffffff

    cmp-long v1, p1, v1

    if-gtz v1, :cond_4

    .line 2
    iget-wide v1, p0, Lcg/g;->b:J

    cmp-long v1, v1, p1

    if-ltz v1, :cond_3

    if-nez v0, :cond_0

    .line 3
    const-string p1, ""

    return-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 5
    iget v1, v0, Lcg/C;->b:I

    int-to-long v2, v1

    add-long/2addr v2, p1

    iget v4, v0, Lcg/C;->c:I

    int-to-long v4, v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    new-instance v0, Ljava/lang/String;

    .line 6
    invoke-virtual {p0, p1, p2}, Lcg/g;->readByteArray(J)[B

    move-result-object p1

    invoke-direct {v0, p1, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    :cond_1
    new-instance v2, Ljava/lang/String;

    long-to-int v3, p1

    .line 7
    iget-object v4, v0, Lcg/C;->a:[B

    invoke-direct {v2, v4, v1, v3, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 8
    iget p3, v0, Lcg/C;->b:I

    add-int/2addr p3, v3

    iput p3, v0, Lcg/C;->b:I

    .line 9
    iget-wide v3, p0, Lcg/g;->b:J

    sub-long/2addr v3, p1

    iput-wide v3, p0, Lcg/g;->b:J

    .line 10
    iget p1, v0, Lcg/C;->c:I

    if-ne p3, p1, :cond_2

    .line 11
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    move-result-object p1

    iput-object p1, p0, Lcg/g;->a:Lcg/C;

    .line 12
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    :cond_2
    return-object v2

    .line 13
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 14
    :cond_4
    const-string p3, "byteCount: "

    .line 15
    invoke-static {p1, p2, p3}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final readString(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    invoke-virtual {p0, v0, v1, p1}, Lcg/g;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final readUtf8()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    sget-object v2, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1, v2}, Lcg/g;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final request(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final s(Lcg/j;)J
    .locals 2

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, p1}, Lcg/g;->w(JLcg/j;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final skip(J)V
    .locals 6

    .line 1
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcg/g;->a:Lcg/C;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lcg/C;->c:I

    .line 12
    .line 13
    iget v2, v0, Lcg/C;->b:I

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    int-to-long v1, v1

    .line 17
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    long-to-int v1, v1

    .line 22
    iget-wide v2, p0, Lcg/g;->b:J

    .line 23
    .line 24
    int-to-long v4, v1

    .line 25
    sub-long/2addr v2, v4

    .line 26
    iput-wide v2, p0, Lcg/g;->b:J

    .line 27
    .line 28
    sub-long/2addr p1, v4

    .line 29
    iget v2, v0, Lcg/C;->b:I

    .line 30
    .line 31
    add-int/2addr v2, v1

    .line 32
    iput v2, v0, Lcg/C;->b:I

    .line 33
    .line 34
    iget v1, v0, Lcg/C;->c:I

    .line 35
    .line 36
    if-ne v2, v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lcg/g;->a:Lcg/C;

    .line 43
    .line 44
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    return-void
.end method

.method public final timeout()Lcg/J;
    .locals 1

    .line 1
    sget-object v0, Lcg/J;->d:Lcg/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcg/g;->D()Lcg/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcg/j;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final bridge synthetic u(Lcg/j;)Lcg/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcg/g;->Q(Lcg/j;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final w(JLcg/j;)J
    .locals 12

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p3, Lcg/j;->a:[B

    .line 7
    .line 8
    array-length v0, p3

    .line 9
    if-lez v0, :cond_a

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long v2, p1, v0

    .line 14
    .line 15
    if-ltz v2, :cond_9

    .line 16
    .line 17
    iget-object v2, p0, Lcg/g;->a:Lcg/C;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    iget-wide v3, p0, Lcg/g;->b:J

    .line 24
    .line 25
    sub-long v5, v3, p1

    .line 26
    .line 27
    cmp-long v5, v5, p1

    .line 28
    .line 29
    const-wide/16 v6, 0x1

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    if-gez v5, :cond_4

    .line 33
    .line 34
    :goto_0
    cmp-long v0, v3, p1

    .line 35
    .line 36
    if-lez v0, :cond_1

    .line 37
    .line 38
    iget-object v2, v2, Lcg/C;->g:Lcg/C;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget v0, v2, Lcg/C;->c:I

    .line 44
    .line 45
    iget v1, v2, Lcg/C;->b:I

    .line 46
    .line 47
    sub-int/2addr v0, v1

    .line 48
    int-to-long v0, v0

    .line 49
    sub-long/2addr v3, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    aget-byte v0, p3, v8

    .line 52
    .line 53
    array-length v1, p3

    .line 54
    iget-wide v8, p0, Lcg/g;->b:J

    .line 55
    .line 56
    int-to-long v10, v1

    .line 57
    sub-long/2addr v8, v10

    .line 58
    add-long/2addr v8, v6

    .line 59
    :goto_1
    cmp-long v5, v3, v8

    .line 60
    .line 61
    if-gez v5, :cond_8

    .line 62
    .line 63
    iget v5, v2, Lcg/C;->c:I

    .line 64
    .line 65
    iget v6, v2, Lcg/C;->b:I

    .line 66
    .line 67
    int-to-long v6, v6

    .line 68
    add-long/2addr v6, v8

    .line 69
    sub-long/2addr v6, v3

    .line 70
    int-to-long v10, v5

    .line 71
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    long-to-int v5, v5

    .line 76
    iget v6, v2, Lcg/C;->b:I

    .line 77
    .line 78
    int-to-long v6, v6

    .line 79
    add-long/2addr v6, p1

    .line 80
    sub-long/2addr v6, v3

    .line 81
    long-to-int p1, v6

    .line 82
    :goto_2
    if-ge p1, v5, :cond_3

    .line 83
    .line 84
    iget-object p2, v2, Lcg/C;->a:[B

    .line 85
    .line 86
    aget-byte p2, p2, p1

    .line 87
    .line 88
    if-ne p2, v0, :cond_2

    .line 89
    .line 90
    add-int/lit8 p2, p1, 0x1

    .line 91
    .line 92
    invoke-static {v2, p2, p3, v1}, Ldg/a;->a(Lcg/C;I[BI)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_2

    .line 97
    .line 98
    iget p2, v2, Lcg/C;->b:I

    .line 99
    .line 100
    sub-int/2addr p1, p2

    .line 101
    int-to-long p1, p1

    .line 102
    add-long/2addr p1, v3

    .line 103
    return-wide p1

    .line 104
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    iget p1, v2, Lcg/C;->c:I

    .line 108
    .line 109
    iget p2, v2, Lcg/C;->b:I

    .line 110
    .line 111
    sub-int/2addr p1, p2

    .line 112
    int-to-long p1, p1

    .line 113
    add-long/2addr v3, p1

    .line 114
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 115
    .line 116
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-wide p1, v3

    .line 120
    goto :goto_1

    .line 121
    :cond_4
    :goto_3
    iget v3, v2, Lcg/C;->c:I

    .line 122
    .line 123
    iget v4, v2, Lcg/C;->b:I

    .line 124
    .line 125
    sub-int/2addr v3, v4

    .line 126
    int-to-long v3, v3

    .line 127
    add-long/2addr v3, v0

    .line 128
    cmp-long v5, v3, p1

    .line 129
    .line 130
    if-gtz v5, :cond_5

    .line 131
    .line 132
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 133
    .line 134
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-wide v0, v3

    .line 138
    goto :goto_3

    .line 139
    :cond_5
    aget-byte v3, p3, v8

    .line 140
    .line 141
    array-length v4, p3

    .line 142
    iget-wide v8, p0, Lcg/g;->b:J

    .line 143
    .line 144
    int-to-long v10, v4

    .line 145
    sub-long/2addr v8, v10

    .line 146
    add-long/2addr v8, v6

    .line 147
    :goto_4
    cmp-long v5, v0, v8

    .line 148
    .line 149
    if-gez v5, :cond_8

    .line 150
    .line 151
    iget v5, v2, Lcg/C;->c:I

    .line 152
    .line 153
    iget v6, v2, Lcg/C;->b:I

    .line 154
    .line 155
    int-to-long v6, v6

    .line 156
    add-long/2addr v6, v8

    .line 157
    sub-long/2addr v6, v0

    .line 158
    int-to-long v10, v5

    .line 159
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 160
    .line 161
    .line 162
    move-result-wide v5

    .line 163
    long-to-int v5, v5

    .line 164
    iget v6, v2, Lcg/C;->b:I

    .line 165
    .line 166
    int-to-long v6, v6

    .line 167
    add-long/2addr v6, p1

    .line 168
    sub-long/2addr v6, v0

    .line 169
    long-to-int p1, v6

    .line 170
    :goto_5
    if-ge p1, v5, :cond_7

    .line 171
    .line 172
    iget-object p2, v2, Lcg/C;->a:[B

    .line 173
    .line 174
    aget-byte p2, p2, p1

    .line 175
    .line 176
    if-ne p2, v3, :cond_6

    .line 177
    .line 178
    add-int/lit8 p2, p1, 0x1

    .line 179
    .line 180
    invoke-static {v2, p2, p3, v4}, Ldg/a;->a(Lcg/C;I[BI)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_6

    .line 185
    .line 186
    iget p2, v2, Lcg/C;->b:I

    .line 187
    .line 188
    sub-int/2addr p1, p2

    .line 189
    int-to-long p1, p1

    .line 190
    add-long/2addr p1, v0

    .line 191
    return-wide p1

    .line 192
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_7
    iget p1, v2, Lcg/C;->c:I

    .line 196
    .line 197
    iget p2, v2, Lcg/C;->b:I

    .line 198
    .line 199
    sub-int/2addr p1, p2

    .line 200
    int-to-long p1, p1

    .line 201
    add-long/2addr v0, p1

    .line 202
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 203
    .line 204
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    move-wide p1, v0

    .line 208
    goto :goto_4

    .line 209
    :cond_8
    :goto_6
    const-wide/16 p1, -0x1

    .line 210
    .line 211
    return-wide p1

    .line 212
    :cond_9
    const-string p3, "fromIndex < 0: "

    .line 213
    .line 214
    invoke-static {p1, p2, p3}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p2

    .line 228
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 229
    .line 230
    const-string p2, "bytes is empty"

    .line 231
    .line 232
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p1
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    move v1, v0

    :goto_0
    if-lez v1, :cond_0

    const/4 v2, 0x1

    .line 3
    invoke-virtual {p0, v2}, Lcg/g;->P(I)Lcg/C;

    move-result-object v2

    .line 4
    iget v3, v2, Lcg/C;->c:I

    rsub-int v3, v3, 0x2000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 5
    iget-object v4, v2, Lcg/C;->a:[B

    iget v5, v2, Lcg/C;->c:I

    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v1, v3

    .line 6
    iget v4, v2, Lcg/C;->c:I

    add-int/2addr v4, v3

    iput v4, v2, Lcg/C;->c:I

    goto :goto_0

    .line 7
    :cond_0
    iget-wide v1, p0, Lcg/g;->b:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcg/g;->b:J

    return v0
.end method

.method public final bridge synthetic write([B)Lcg/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcg/g;->V([B)V

    return-object p0
.end method

.method public final bridge synthetic writeByte(I)Lcg/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcg/g;->X(I)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final bridge synthetic writeDecimalLong(J)Lcg/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcg/g;->Y(J)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final bridge synthetic writeUtf8(Ljava/lang/String;)Lcg/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcg/g;->d0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final y(JLcg/j;)J
    .locals 9

    .line 1
    const-string v0, "targetBytes"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v2, p1, v0

    .line 9
    .line 10
    if-ltz v2, :cond_13

    .line 11
    .line 12
    iget-object v2, p0, Lcg/g;->a:Lcg/C;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_e

    .line 17
    .line 18
    :cond_0
    iget-wide v3, p0, Lcg/g;->b:J

    .line 19
    .line 20
    sub-long v5, v3, p1

    .line 21
    .line 22
    cmp-long v5, v5, p1

    .line 23
    .line 24
    const/4 v6, 0x1

    .line 25
    iget-object p3, p3, Lcg/j;->a:[B

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    const/4 v8, 0x0

    .line 29
    if-gez v5, :cond_9

    .line 30
    .line 31
    :goto_0
    cmp-long v0, v3, p1

    .line 32
    .line 33
    if-lez v0, :cond_1

    .line 34
    .line 35
    iget-object v2, v2, Lcg/C;->g:Lcg/C;

    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget v0, v2, Lcg/C;->c:I

    .line 41
    .line 42
    iget v1, v2, Lcg/C;->b:I

    .line 43
    .line 44
    sub-int/2addr v0, v1

    .line 45
    int-to-long v0, v0

    .line 46
    sub-long/2addr v3, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    array-length v0, p3

    .line 49
    if-ne v0, v7, :cond_5

    .line 50
    .line 51
    aget-byte v0, p3, v8

    .line 52
    .line 53
    aget-byte p3, p3, v6

    .line 54
    .line 55
    :goto_1
    iget-wide v5, p0, Lcg/g;->b:J

    .line 56
    .line 57
    cmp-long v1, v3, v5

    .line 58
    .line 59
    if-gez v1, :cond_12

    .line 60
    .line 61
    iget v1, v2, Lcg/C;->b:I

    .line 62
    .line 63
    int-to-long v5, v1

    .line 64
    add-long/2addr v5, p1

    .line 65
    sub-long/2addr v5, v3

    .line 66
    long-to-int p1, v5

    .line 67
    iget p2, v2, Lcg/C;->c:I

    .line 68
    .line 69
    :goto_2
    if-ge p1, p2, :cond_4

    .line 70
    .line 71
    iget-object v1, v2, Lcg/C;->a:[B

    .line 72
    .line 73
    aget-byte v1, v1, p1

    .line 74
    .line 75
    if-eq v1, v0, :cond_3

    .line 76
    .line 77
    if-ne v1, p3, :cond_2

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    :goto_3
    iget p2, v2, Lcg/C;->b:I

    .line 84
    .line 85
    sub-int/2addr p1, p2

    .line 86
    int-to-long p1, p1

    .line 87
    add-long/2addr p1, v3

    .line 88
    return-wide p1

    .line 89
    :cond_4
    iget p1, v2, Lcg/C;->c:I

    .line 90
    .line 91
    iget p2, v2, Lcg/C;->b:I

    .line 92
    .line 93
    sub-int/2addr p1, p2

    .line 94
    int-to-long p1, p1

    .line 95
    add-long/2addr v3, p1

    .line 96
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-wide p1, v3

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    :goto_4
    iget-wide v0, p0, Lcg/g;->b:J

    .line 104
    .line 105
    cmp-long v0, v3, v0

    .line 106
    .line 107
    if-gez v0, :cond_12

    .line 108
    .line 109
    iget v0, v2, Lcg/C;->b:I

    .line 110
    .line 111
    int-to-long v0, v0

    .line 112
    add-long/2addr v0, p1

    .line 113
    sub-long/2addr v0, v3

    .line 114
    long-to-int p1, v0

    .line 115
    iget p2, v2, Lcg/C;->c:I

    .line 116
    .line 117
    :goto_5
    if-ge p1, p2, :cond_8

    .line 118
    .line 119
    iget-object v0, v2, Lcg/C;->a:[B

    .line 120
    .line 121
    aget-byte v0, v0, p1

    .line 122
    .line 123
    array-length v1, p3

    .line 124
    move v5, v8

    .line 125
    :goto_6
    if-ge v5, v1, :cond_7

    .line 126
    .line 127
    aget-byte v6, p3, v5

    .line 128
    .line 129
    if-ne v0, v6, :cond_6

    .line 130
    .line 131
    iget p2, v2, Lcg/C;->b:I

    .line 132
    .line 133
    sub-int/2addr p1, p2

    .line 134
    int-to-long p1, p1

    .line 135
    add-long/2addr p1, v3

    .line 136
    return-wide p1

    .line 137
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_7
    add-int/lit8 p1, p1, 0x1

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_8
    iget p1, v2, Lcg/C;->c:I

    .line 144
    .line 145
    iget p2, v2, Lcg/C;->b:I

    .line 146
    .line 147
    sub-int/2addr p1, p2

    .line 148
    int-to-long p1, p1

    .line 149
    add-long/2addr v3, p1

    .line 150
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 151
    .line 152
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-wide p1, v3

    .line 156
    goto :goto_4

    .line 157
    :cond_9
    :goto_7
    iget v3, v2, Lcg/C;->c:I

    .line 158
    .line 159
    iget v4, v2, Lcg/C;->b:I

    .line 160
    .line 161
    sub-int/2addr v3, v4

    .line 162
    int-to-long v3, v3

    .line 163
    add-long/2addr v3, v0

    .line 164
    cmp-long v5, v3, p1

    .line 165
    .line 166
    if-gtz v5, :cond_a

    .line 167
    .line 168
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 169
    .line 170
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move-wide v0, v3

    .line 174
    goto :goto_7

    .line 175
    :cond_a
    array-length v3, p3

    .line 176
    if-ne v3, v7, :cond_e

    .line 177
    .line 178
    aget-byte v3, p3, v8

    .line 179
    .line 180
    aget-byte p3, p3, v6

    .line 181
    .line 182
    :goto_8
    iget-wide v4, p0, Lcg/g;->b:J

    .line 183
    .line 184
    cmp-long v4, v0, v4

    .line 185
    .line 186
    if-gez v4, :cond_12

    .line 187
    .line 188
    iget v4, v2, Lcg/C;->b:I

    .line 189
    .line 190
    int-to-long v4, v4

    .line 191
    add-long/2addr v4, p1

    .line 192
    sub-long/2addr v4, v0

    .line 193
    long-to-int p1, v4

    .line 194
    iget p2, v2, Lcg/C;->c:I

    .line 195
    .line 196
    :goto_9
    if-ge p1, p2, :cond_d

    .line 197
    .line 198
    iget-object v4, v2, Lcg/C;->a:[B

    .line 199
    .line 200
    aget-byte v4, v4, p1

    .line 201
    .line 202
    if-eq v4, v3, :cond_c

    .line 203
    .line 204
    if-ne v4, p3, :cond_b

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_b
    add-int/lit8 p1, p1, 0x1

    .line 208
    .line 209
    goto :goto_9

    .line 210
    :cond_c
    :goto_a
    iget p2, v2, Lcg/C;->b:I

    .line 211
    .line 212
    sub-int/2addr p1, p2

    .line 213
    int-to-long p1, p1

    .line 214
    add-long/2addr p1, v0

    .line 215
    return-wide p1

    .line 216
    :cond_d
    iget p1, v2, Lcg/C;->c:I

    .line 217
    .line 218
    iget p2, v2, Lcg/C;->b:I

    .line 219
    .line 220
    sub-int/2addr p1, p2

    .line 221
    int-to-long p1, p1

    .line 222
    add-long/2addr v0, p1

    .line 223
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 224
    .line 225
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    move-wide p1, v0

    .line 229
    goto :goto_8

    .line 230
    :cond_e
    :goto_b
    iget-wide v3, p0, Lcg/g;->b:J

    .line 231
    .line 232
    cmp-long v3, v0, v3

    .line 233
    .line 234
    if-gez v3, :cond_12

    .line 235
    .line 236
    iget v3, v2, Lcg/C;->b:I

    .line 237
    .line 238
    int-to-long v3, v3

    .line 239
    add-long/2addr v3, p1

    .line 240
    sub-long/2addr v3, v0

    .line 241
    long-to-int p1, v3

    .line 242
    iget p2, v2, Lcg/C;->c:I

    .line 243
    .line 244
    :goto_c
    if-ge p1, p2, :cond_11

    .line 245
    .line 246
    iget-object v3, v2, Lcg/C;->a:[B

    .line 247
    .line 248
    aget-byte v3, v3, p1

    .line 249
    .line 250
    array-length v4, p3

    .line 251
    move v5, v8

    .line 252
    :goto_d
    if-ge v5, v4, :cond_10

    .line 253
    .line 254
    aget-byte v6, p3, v5

    .line 255
    .line 256
    if-ne v3, v6, :cond_f

    .line 257
    .line 258
    iget p2, v2, Lcg/C;->b:I

    .line 259
    .line 260
    sub-int/2addr p1, p2

    .line 261
    int-to-long p1, p1

    .line 262
    add-long/2addr p1, v0

    .line 263
    return-wide p1

    .line 264
    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 265
    .line 266
    goto :goto_d

    .line 267
    :cond_10
    add-int/lit8 p1, p1, 0x1

    .line 268
    .line 269
    goto :goto_c

    .line 270
    :cond_11
    iget p1, v2, Lcg/C;->c:I

    .line 271
    .line 272
    iget p2, v2, Lcg/C;->b:I

    .line 273
    .line 274
    sub-int/2addr p1, p2

    .line 275
    int-to-long p1, p1

    .line 276
    add-long/2addr v0, p1

    .line 277
    iget-object v2, v2, Lcg/C;->f:Lcg/C;

    .line 278
    .line 279
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-wide p1, v0

    .line 283
    goto :goto_b

    .line 284
    :cond_12
    :goto_e
    const-wide/16 p1, -0x1

    .line 285
    .line 286
    return-wide p1

    .line 287
    :cond_13
    const-string p3, "fromIndex < 0: "

    .line 288
    .line 289
    invoke-static {p1, p2, p3}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw p2
.end method

.method public final z(J)Lcg/j;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_2

    .line 6
    .line 7
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-gtz v0, :cond_2

    .line 13
    .line 14
    iget-wide v0, p0, Lcg/g;->b:J

    .line 15
    .line 16
    cmp-long v0, v0, p1

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    const-wide/16 v0, 0x1000

    .line 21
    .line 22
    cmp-long v0, p1, v0

    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    long-to-int v0, p1

    .line 27
    invoke-virtual {p0, v0}, Lcg/g;->J(I)Lcg/j;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, p1, p2}, Lcg/g;->skip(J)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    new-instance v0, Lcg/j;

    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Lcg/g;->readByteArray(J)[B

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v0, p1}, Lcg/j;-><init>([B)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    const-string v0, "byteCount: "

    .line 52
    .line 53
    invoke-static {p1, p2, v0}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p2
.end method
