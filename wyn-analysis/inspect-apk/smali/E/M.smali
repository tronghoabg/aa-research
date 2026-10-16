.class public final LE/M;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lr0/l;


# instance fields
.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:Z


# direct methods
.method public synthetic constructor <init>(FFFFI)V
    .locals 8

    and-int/lit8 v0, p5, 0x1

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, p1

    :goto_0
    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, p2

    :goto_1
    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, p3

    :goto_2
    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_3

    move v6, v1

    goto :goto_3

    :cond_3
    move v6, p4

    :goto_3
    const/4 v7, 0x1

    move-object v2, p0

    .line 1
    invoke-direct/range {v2 .. v7}, LE/M;-><init>(FFFFZ)V

    return-void
.end method

.method public constructor <init>(FFFFZ)V
    .locals 1

    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    invoke-direct {p0, v0}, LA7/B0;-><init>(Ltf/l;)V

    .line 3
    iput p1, p0, LE/M;->b:F

    .line 4
    iput p2, p0, LE/M;->c:F

    .line 5
    iput p3, p0, LE/M;->d:F

    .line 6
    iput p4, p0, LE/M;->e:F

    .line 7
    iput-boolean p5, p0, LE/M;->f:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LE/M;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, LE/M;

    .line 7
    .line 8
    iget v0, p1, LE/M;->b:F

    .line 9
    .line 10
    iget v1, p0, LE/M;->b:F

    .line 11
    .line 12
    invoke-static {v1, v0}, LL0/d;->a(FF)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v0, p0, LE/M;->c:F

    .line 19
    .line 20
    iget v1, p1, LE/M;->c:F

    .line 21
    .line 22
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v0, p0, LE/M;->d:F

    .line 29
    .line 30
    iget v1, p1, LE/M;->d:F

    .line 31
    .line 32
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget v0, p0, LE/M;->e:F

    .line 39
    .line 40
    iget v1, p1, LE/M;->e:F

    .line 41
    .line 42
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-boolean v0, p0, LE/M;->f:Z

    .line 49
    .line 50
    iget-boolean p1, p1, LE/M;->f:Z

    .line 51
    .line 52
    if-ne v0, p1, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 57
    return p1
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
    .locals 3

    .line 1
    iget v0, p0, LE/M;->b:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, LE/M;->c:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, LE/M;->d:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, LE/M;->e:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
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

.method public final q(Lt0/r;Lr0/m;J)LD0/b;
    .locals 11

    .line 1
    const-string v0, "$this$measure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "measurable"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, LE/M;->d:F

    .line 12
    .line 13
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 14
    .line 15
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const v3, 0x7fffffff

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    new-instance v2, LL0/d;

    .line 26
    .line 27
    invoke-direct {v2, v0}, LL0/d;-><init>(F)V

    .line 28
    .line 29
    .line 30
    int-to-float v5, v4

    .line 31
    new-instance v6, LL0/d;

    .line 32
    .line 33
    invoke-direct {v6, v5}, LL0/d;-><init>(F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v6}, LL0/d;->compareTo(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-gez v5, :cond_0

    .line 41
    .line 42
    move-object v2, v6

    .line 43
    :cond_0
    iget v2, v2, LL0/d;->a:F

    .line 44
    .line 45
    invoke-static {p1, v2}, LA7/p0;->a(LL0/b;F)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v3

    .line 51
    :goto_0
    iget v5, p0, LE/M;->e:F

    .line 52
    .line 53
    invoke-static {v5, v1}, LL0/d;->a(FF)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    new-instance v6, LL0/d;

    .line 60
    .line 61
    invoke-direct {v6, v5}, LL0/d;-><init>(F)V

    .line 62
    .line 63
    .line 64
    int-to-float v7, v4

    .line 65
    new-instance v8, LL0/d;

    .line 66
    .line 67
    invoke-direct {v8, v7}, LL0/d;-><init>(F)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v8}, LL0/d;->compareTo(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-gez v7, :cond_2

    .line 75
    .line 76
    move-object v6, v8

    .line 77
    :cond_2
    iget v6, v6, LL0/d;->a:F

    .line 78
    .line 79
    invoke-static {p1, v6}, LA7/p0;->a(LL0/b;F)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    move v6, v3

    .line 85
    :goto_1
    iget v7, p0, LE/M;->b:F

    .line 86
    .line 87
    invoke-static {v7, v1}, LL0/d;->a(FF)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-nez v8, :cond_6

    .line 92
    .line 93
    invoke-static {p1, v7}, LA7/p0;->a(LL0/b;F)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-le v8, v2, :cond_4

    .line 98
    .line 99
    move v8, v2

    .line 100
    :cond_4
    if-gez v8, :cond_5

    .line 101
    .line 102
    move v8, v4

    .line 103
    :cond_5
    if-eq v8, v3, :cond_6

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    move v8, v4

    .line 107
    :goto_2
    iget v9, p0, LE/M;->c:F

    .line 108
    .line 109
    invoke-static {v9, v1}, LL0/d;->a(FF)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-nez v10, :cond_9

    .line 114
    .line 115
    invoke-static {p1, v9}, LA7/p0;->a(LL0/b;F)I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-le v10, v6, :cond_7

    .line 120
    .line 121
    move v10, v6

    .line 122
    :cond_7
    if-gez v10, :cond_8

    .line 123
    .line 124
    move v10, v4

    .line 125
    :cond_8
    if-eq v10, v3, :cond_9

    .line 126
    .line 127
    move v4, v10

    .line 128
    :cond_9
    invoke-static {v8, v2, v4, v6}, Lxg/g;->a(IIII)J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    iget-boolean v4, p0, LE/M;->f:Z

    .line 133
    .line 134
    if-eqz v4, :cond_a

    .line 135
    .line 136
    invoke-static {v2, v3}, LL0/a;->g(J)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    invoke-static {v0, v1, v4}, Landroid/support/v4/media/session/b;->S(III)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-static {v2, v3}, LL0/a;->e(J)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    invoke-static {v1, v4, v5}, Landroid/support/v4/media/session/b;->S(III)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-static {v2, v3}, LL0/a;->f(J)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    invoke-static {v4, v5, v6}, Landroid/support/v4/media/session/b;->S(III)I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-static {v2, v3}, LL0/a;->d(J)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 193
    .line 194
    .line 195
    move-result p3

    .line 196
    invoke-static {v2, v3, p3}, Landroid/support/v4/media/session/b;->S(III)I

    .line 197
    .line 198
    .line 199
    move-result p3

    .line 200
    invoke-static {v0, v1, v4, p3}, Lxg/g;->a(IIII)J

    .line 201
    .line 202
    .line 203
    move-result-wide p3

    .line 204
    goto :goto_7

    .line 205
    :cond_a
    invoke-static {v7, v1}, LL0/d;->a(FF)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-nez v4, :cond_b

    .line 210
    .line 211
    invoke-static {v2, v3}, LL0/a;->g(J)I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    goto :goto_3

    .line 216
    :cond_b
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    invoke-static {v2, v3}, LL0/a;->e(J)I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-le v4, v6, :cond_c

    .line 225
    .line 226
    move v4, v6

    .line 227
    :cond_c
    :goto_3
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_d

    .line 232
    .line 233
    invoke-static {v2, v3}, LL0/a;->e(J)I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    goto :goto_4

    .line 238
    :cond_d
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    invoke-static {v2, v3}, LL0/a;->g(J)I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-ge v0, v6, :cond_e

    .line 247
    .line 248
    move v0, v6

    .line 249
    :cond_e
    :goto_4
    invoke-static {v9, v1}, LL0/d;->a(FF)Z

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-nez v6, :cond_f

    .line 254
    .line 255
    invoke-static {v2, v3}, LL0/a;->f(J)I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    goto :goto_5

    .line 260
    :cond_f
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    invoke-static {v2, v3}, LL0/a;->d(J)I

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    if-le v6, v7, :cond_10

    .line 269
    .line 270
    move v6, v7

    .line 271
    :cond_10
    :goto_5
    invoke-static {v5, v1}, LL0/d;->a(FF)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-nez v1, :cond_11

    .line 276
    .line 277
    invoke-static {v2, v3}, LL0/a;->d(J)I

    .line 278
    .line 279
    .line 280
    move-result p3

    .line 281
    goto :goto_6

    .line 282
    :cond_11
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 283
    .line 284
    .line 285
    move-result p3

    .line 286
    invoke-static {v2, v3}, LL0/a;->f(J)I

    .line 287
    .line 288
    .line 289
    move-result p4

    .line 290
    if-ge p3, p4, :cond_12

    .line 291
    .line 292
    move p3, p4

    .line 293
    :cond_12
    :goto_6
    invoke-static {v4, v0, v6, p3}, Lxg/g;->a(IIII)J

    .line 294
    .line 295
    .line 296
    move-result-wide p3

    .line 297
    :goto_7
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    iget p3, p2, Lr0/t;->a:I

    .line 302
    .line 303
    iget p4, p2, Lr0/t;->b:I

    .line 304
    .line 305
    new-instance v0, LE/w;

    .line 306
    .line 307
    const/4 v1, 0x1

    .line 308
    invoke-direct {v0, p2, v1}, LE/w;-><init>(Lr0/t;I)V

    .line 309
    .line 310
    .line 311
    invoke-static {p1, p3, p4, v0}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    return-object p1
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
