.class public final Lu0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt0/G;


# instance fields
.field public final a:Lu0/n;

.field public b:Lt0/y;

.field public c:Lt0/p;

.field public d:Z

.field public final e:Lu0/c0;

.field public f:Z

.field public g:Z

.field public h:Lc7/l;

.field public final i:Lu0/a0;

.field public final j:Lac/a;

.field public k:J

.field public final l:Lu0/N;


# direct methods
.method public constructor <init>(Lu0/n;Lt0/y;Lt0/p;)V
    .locals 1

    .line 1
    const-string v0, "invalidateParentLayer"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lu0/h0;->a:Lu0/n;

    .line 10
    .line 11
    iput-object p2, p0, Lu0/h0;->b:Lt0/y;

    .line 12
    .line 13
    iput-object p3, p0, Lu0/h0;->c:Lt0/p;

    .line 14
    .line 15
    new-instance p2, Lu0/c0;

    .line 16
    .line 17
    invoke-virtual {p1}, Lu0/n;->getDensity()LL0/b;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-direct {p2, p3}, Lu0/c0;-><init>(LL0/b;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lu0/h0;->e:Lu0/c0;

    .line 25
    .line 26
    new-instance p2, Lu0/a0;

    .line 27
    .line 28
    sget-object p3, Lu0/J;->k:Lu0/J;

    .line 29
    .line 30
    invoke-direct {p2, p3}, Lu0/a0;-><init>(Ltf/p;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lu0/h0;->i:Lu0/a0;

    .line 34
    .line 35
    new-instance p2, Lac/a;

    .line 36
    .line 37
    const/4 p3, 0x4

    .line 38
    invoke-direct {p2, p3}, Lac/a;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lu0/h0;->j:Lac/a;

    .line 42
    .line 43
    sget-wide p2, Le0/J;->b:J

    .line 44
    .line 45
    iput-wide p2, p0, Lu0/h0;->k:J

    .line 46
    .line 47
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 p3, 0x1d

    .line 50
    .line 51
    if-lt p2, p3, :cond_0

    .line 52
    .line 53
    new-instance p2, Lu0/f0;

    .line 54
    .line 55
    invoke-direct {p2, p1}, Lu0/f0;-><init>(Lu0/n;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance p2, Lu0/d0;

    .line 60
    .line 61
    invoke-direct {p2, p1}, Lu0/d0;-><init>(Lu0/n;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-interface {p2}, Lu0/N;->k()Z

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lu0/h0;->l:Lu0/N;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final a(Le0/o;)V
    .locals 9

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Le0/c;->a:Landroid/graphics/Canvas;

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Le0/b;

    .line 10
    .line 11
    iget-object v1, v0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v7, 0x0

    .line 18
    iget-object v8, p0, Lu0/h0;->l:Lu0/N;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Lu0/h0;->h()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v8}, Lu0/N;->I()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v2, 0x0

    .line 30
    cmpl-float v0, v0, v2

    .line 31
    .line 32
    if-lez v0, :cond_0

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    :cond_0
    iput-boolean v7, p0, Lu0/h0;->g:Z

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    invoke-interface {p1}, Le0/o;->i()V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-interface {v8, v1}, Lu0/N;->c(Landroid/graphics/Canvas;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v0, p0, Lu0/h0;->g:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {p1}, Le0/o;->o()V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :cond_3
    invoke-interface {v8}, Lu0/N;->a()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    int-to-float v2, v0

    .line 58
    invoke-interface {v8}, Lu0/N;->n()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    int-to-float v3, v0

    .line 63
    invoke-interface {v8}, Lu0/N;->b()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    int-to-float v4, v0

    .line 68
    invoke-interface {v8}, Lu0/N;->w()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-float v5, v0

    .line 73
    invoke-interface {v8}, Lu0/N;->s()F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const/high16 v6, 0x3f800000    # 1.0f

    .line 78
    .line 79
    cmpg-float v0, v0, v6

    .line 80
    .line 81
    if-gez v0, :cond_5

    .line 82
    .line 83
    iget-object v0, p0, Lu0/h0;->h:Lc7/l;

    .line 84
    .line 85
    if-nez v0, :cond_4

    .line 86
    .line 87
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lu0/h0;->h:Lc7/l;

    .line 92
    .line 93
    :cond_4
    invoke-interface {v8}, Lu0/N;->s()F

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-virtual {v0, v6}, Lc7/l;->c(F)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, Lc7/l;->b:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v6, v0

    .line 103
    check-cast v6, Landroid/graphics/Paint;

    .line 104
    .line 105
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    invoke-interface {p1}, Le0/o;->m()V

    .line 110
    .line 111
    .line 112
    :goto_0
    invoke-interface {p1, v2, v3}, Le0/o;->f(FF)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lu0/h0;->i:Lu0/a0;

    .line 116
    .line 117
    invoke-virtual {v0, v8}, Lu0/a0;->b(Ljava/lang/Object;)[F

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {p1, v0}, Le0/o;->p([F)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v8}, Lu0/N;->r()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_6

    .line 129
    .line 130
    invoke-interface {v8}, Lu0/N;->m()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    :cond_6
    iget-object v0, p0, Lu0/h0;->e:Lu0/c0;

    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lu0/c0;->a(Le0/o;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    iget-object v0, p0, Lu0/h0;->b:Lt0/y;

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lt0/y;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_8
    invoke-interface {p1}, Le0/o;->restore()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v7}, Lu0/h0;->j(Z)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final b(FFFFFJLe0/E;ZJJLL0/i;LL0/b;)V
    .locals 10

    .line 1
    move-wide/from16 v0, p6

    .line 2
    .line 3
    move-object/from16 v2, p8

    .line 4
    .line 5
    const-string v3, "shape"

    .line 6
    .line 7
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v3, "layoutDirection"

    .line 11
    .line 12
    move-object/from16 v4, p14

    .line 13
    .line 14
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "density"

    .line 18
    .line 19
    move-object/from16 v5, p15

    .line 20
    .line 21
    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-wide v0, p0, Lu0/h0;->k:J

    .line 25
    .line 26
    iget-object v3, p0, Lu0/h0;->l:Lu0/N;

    .line 27
    .line 28
    invoke-interface {v3}, Lu0/N;->r()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    iget-object v7, p0, Lu0/h0;->e:Lu0/c0;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x1

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    iget-boolean v6, v7, Lu0/c0;->i:Z

    .line 39
    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    move v6, v9

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v6, v8

    .line 45
    :goto_0
    invoke-interface {v3, p1}, Lu0/N;->p(F)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v3, p2}, Lu0/N;->A(F)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v3, p3}, Lu0/N;->C(F)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v3}, Lu0/N;->F()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v3}, Lu0/N;->D()V

    .line 58
    .line 59
    .line 60
    invoke-interface {v3, p4}, Lu0/N;->h(F)V

    .line 61
    .line 62
    .line 63
    invoke-static/range {p10 .. p11}, Le0/z;->s(J)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-interface {v3, p1}, Lu0/N;->E(I)V

    .line 68
    .line 69
    .line 70
    invoke-static/range {p12 .. p13}, Le0/z;->s(J)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-interface {v3, p1}, Lu0/N;->H(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v3}, Lu0/N;->q()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v3}, Lu0/N;->l()V

    .line 81
    .line 82
    .line 83
    invoke-interface {v3}, Lu0/N;->o()V

    .line 84
    .line 85
    .line 86
    invoke-interface {v3, p5}, Lu0/N;->t(F)V

    .line 87
    .line 88
    .line 89
    sget p1, Le0/J;->c:I

    .line 90
    .line 91
    const/16 p1, 0x20

    .line 92
    .line 93
    shr-long p1, v0, p1

    .line 94
    .line 95
    long-to-int p1, p1

    .line 96
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-interface {v3}, Lu0/N;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    int-to-float p2, p2

    .line 105
    mul-float/2addr p1, p2

    .line 106
    invoke-interface {v3, p1}, Lu0/N;->y(F)V

    .line 107
    .line 108
    .line 109
    const-wide p1, 0xffffffffL

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    and-long/2addr p1, v0

    .line 115
    long-to-int p1, p1

    .line 116
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-interface {v3}, Lu0/N;->getHeight()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    int-to-float p2, p2

    .line 125
    mul-float/2addr p1, p2

    .line 126
    invoke-interface {v3, p1}, Lu0/N;->z(F)V

    .line 127
    .line 128
    .line 129
    sget-object p1, Le0/z;->a:Lad/I;

    .line 130
    .line 131
    if-eqz p9, :cond_1

    .line 132
    .line 133
    if-eq v2, p1, :cond_1

    .line 134
    .line 135
    move p2, v9

    .line 136
    goto :goto_1

    .line 137
    :cond_1
    move p2, v8

    .line 138
    :goto_1
    invoke-interface {v3, p2}, Lu0/N;->G(Z)V

    .line 139
    .line 140
    .line 141
    if-eqz p9, :cond_2

    .line 142
    .line 143
    if-ne v2, p1, :cond_2

    .line 144
    .line 145
    move p1, v9

    .line 146
    goto :goto_2

    .line 147
    :cond_2
    move p1, v8

    .line 148
    :goto_2
    invoke-interface {v3, p1}, Lu0/N;->d(Z)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v3}, Lu0/N;->x()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v3}, Lu0/N;->s()F

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-interface {v3}, Lu0/N;->r()Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-interface {v3}, Lu0/N;->I()F

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    iget-object v1, p0, Lu0/h0;->e:Lu0/c0;

    .line 167
    .line 168
    move p3, p1

    .line 169
    move p4, p2

    .line 170
    move p5, v0

    .line 171
    move-object p1, v1

    .line 172
    move-object p2, v2

    .line 173
    move-object/from16 p6, v4

    .line 174
    .line 175
    move-object/from16 p7, v5

    .line 176
    .line 177
    invoke-virtual/range {p1 .. p7}, Lu0/c0;->d(Le0/E;FZFLL0/i;LL0/b;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    invoke-virtual {v7}, Lu0/c0;->b()Landroid/graphics/Outline;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-interface {v3, p2}, Lu0/N;->B(Landroid/graphics/Outline;)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v3}, Lu0/N;->r()Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_3

    .line 193
    .line 194
    iget-boolean p2, v7, Lu0/c0;->i:Z

    .line 195
    .line 196
    if-eqz p2, :cond_3

    .line 197
    .line 198
    move v8, v9

    .line 199
    :cond_3
    iget-object p2, p0, Lu0/h0;->a:Lu0/n;

    .line 200
    .line 201
    if-ne v6, v8, :cond_6

    .line 202
    .line 203
    if-eqz v8, :cond_4

    .line 204
    .line 205
    if-eqz p1, :cond_4

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 209
    .line 210
    const/16 v0, 0x1a

    .line 211
    .line 212
    if-lt p1, v0, :cond_5

    .line 213
    .line 214
    sget-object p1, Lu0/N0;->a:Lu0/N0;

    .line 215
    .line 216
    invoke-virtual {p1, p2}, Lu0/N0;->a(Lu0/n;)V

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_5
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_6
    :goto_3
    iget-boolean p1, p0, Lu0/h0;->d:Z

    .line 225
    .line 226
    if-nez p1, :cond_7

    .line 227
    .line 228
    iget-boolean p1, p0, Lu0/h0;->f:Z

    .line 229
    .line 230
    if-nez p1, :cond_7

    .line 231
    .line 232
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v9}, Lu0/h0;->j(Z)V

    .line 236
    .line 237
    .line 238
    :cond_7
    :goto_4
    iget-boolean p1, p0, Lu0/h0;->g:Z

    .line 239
    .line 240
    if-nez p1, :cond_8

    .line 241
    .line 242
    invoke-interface {v3}, Lu0/N;->I()F

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    const/4 p2, 0x0

    .line 247
    cmpl-float p1, p1, p2

    .line 248
    .line 249
    if-lez p1, :cond_8

    .line 250
    .line 251
    iget-object p1, p0, Lu0/h0;->c:Lt0/p;

    .line 252
    .line 253
    if-eqz p1, :cond_8

    .line 254
    .line 255
    invoke-virtual {p1}, Lt0/p;->invoke()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    :cond_8
    iget-object p1, p0, Lu0/h0;->i:Lu0/a0;

    .line 259
    .line 260
    invoke-virtual {p1}, Lu0/a0;->c()V

    .line 261
    .line 262
    .line 263
    return-void
.end method

.method public final c(JZ)J
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/h0;->l:Lu0/N;

    .line 2
    .line 3
    iget-object v1, p0, Lu0/h0;->i:Lu0/a0;

    .line 4
    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lu0/a0;->a(Ljava/lang/Object;)[F

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-static {p1, p2, p3}, Le0/z;->m(J[F)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    return-wide p1

    .line 18
    :cond_0
    sget-wide p1, Ld0/c;->c:J

    .line 19
    .line 20
    return-wide p1

    .line 21
    :cond_1
    invoke-virtual {v1, v0}, Lu0/a0;->b(Ljava/lang/Object;)[F

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-static {p1, p2, p3}, Le0/z;->m(J[F)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    return-wide p1
.end method

.method public final d(J)V
    .locals 7

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v2

    .line 12
    long-to-int p1, p1

    .line 13
    iget-wide v4, p0, Lu0/h0;->k:J

    .line 14
    .line 15
    sget p2, Le0/J;->c:I

    .line 16
    .line 17
    shr-long/2addr v4, v0

    .line 18
    long-to-int p2, v4

    .line 19
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-float v0, v1

    .line 24
    mul-float/2addr p2, v0

    .line 25
    iget-object v4, p0, Lu0/h0;->l:Lu0/N;

    .line 26
    .line 27
    invoke-interface {v4, p2}, Lu0/N;->y(F)V

    .line 28
    .line 29
    .line 30
    iget-wide v5, p0, Lu0/h0;->k:J

    .line 31
    .line 32
    and-long/2addr v2, v5

    .line 33
    long-to-int p2, v2

    .line 34
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    int-to-float v2, p1

    .line 39
    mul-float/2addr p2, v2

    .line 40
    invoke-interface {v4, p2}, Lu0/N;->z(F)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v4}, Lu0/N;->a()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-interface {v4}, Lu0/N;->n()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-interface {v4}, Lu0/N;->a()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    add-int/2addr v5, v1

    .line 56
    invoke-interface {v4}, Lu0/N;->n()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, p1

    .line 61
    invoke-interface {v4, p2, v3, v5, v1}, Lu0/N;->e(IIII)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-static {v0, v2}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    iget-object v0, p0, Lu0/h0;->e:Lu0/c0;

    .line 72
    .line 73
    iget-wide v1, v0, Lu0/c0;->d:J

    .line 74
    .line 75
    invoke-static {v1, v2, p1, p2}, Ld0/f;->a(JJ)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const/4 v2, 0x1

    .line 80
    if-nez v1, :cond_0

    .line 81
    .line 82
    iput-wide p1, v0, Lu0/c0;->d:J

    .line 83
    .line 84
    iput-boolean v2, v0, Lu0/c0;->h:Z

    .line 85
    .line 86
    :cond_0
    invoke-virtual {v0}, Lu0/c0;->b()Landroid/graphics/Outline;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {v4, p1}, Lu0/N;->B(Landroid/graphics/Outline;)V

    .line 91
    .line 92
    .line 93
    iget-boolean p1, p0, Lu0/h0;->d:Z

    .line 94
    .line 95
    if-nez p1, :cond_1

    .line 96
    .line 97
    iget-boolean p1, p0, Lu0/h0;->f:Z

    .line 98
    .line 99
    if-nez p1, :cond_1

    .line 100
    .line 101
    iget-object p1, p0, Lu0/h0;->a:Lu0/n;

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, Lu0/h0;->j(Z)V

    .line 107
    .line 108
    .line 109
    :cond_1
    iget-object p1, p0, Lu0/h0;->i:Lu0/a0;

    .line 110
    .line 111
    invoke-virtual {p1}, Lu0/a0;->c()V

    .line 112
    .line 113
    .line 114
    :cond_2
    return-void
.end method

.method public final destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/h0;->l:Lu0/N;

    .line 2
    .line 3
    invoke-interface {v0}, Lu0/N;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lu0/N;->f()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lu0/h0;->b:Lt0/y;

    .line 14
    .line 15
    iput-object v0, p0, Lu0/h0;->c:Lt0/p;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lu0/h0;->f:Z

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v1}, Lu0/h0;->j(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lu0/h0;->a:Lu0/n;

    .line 25
    .line 26
    iput-boolean v0, v1, Lu0/n;->u:Z

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lu0/n;->q(Lt0/G;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final e(J)Z
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lu0/h0;->l:Lu0/N;

    .line 10
    .line 11
    invoke-interface {v2}, Lu0/N;->m()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    cmpg-float p2, p1, v0

    .line 19
    .line 20
    if-gtz p2, :cond_0

    .line 21
    .line 22
    invoke-interface {v2}, Lu0/N;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    int-to-float p2, p2

    .line 27
    cmpg-float p2, v0, p2

    .line 28
    .line 29
    if-gez p2, :cond_0

    .line 30
    .line 31
    cmpg-float p1, p1, v1

    .line 32
    .line 33
    if-gtz p1, :cond_0

    .line 34
    .line 35
    invoke-interface {v2}, Lu0/N;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    int-to-float p1, p1

    .line 40
    cmpg-float p1, v1, p1

    .line 41
    .line 42
    if-gez p1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_1
    invoke-interface {v2}, Lu0/N;->r()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Lu0/h0;->e:Lu0/c0;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2}, Lu0/c0;->c(J)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1

    .line 60
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 61
    return p1
.end method

.method public final f(Ld0/b;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/h0;->l:Lu0/N;

    .line 2
    .line 3
    iget-object v1, p0, Lu0/h0;->i:Lu0/a0;

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lu0/a0;->a(Ljava/lang/Object;)[F

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput p2, p1, Ld0/b;->a:F

    .line 15
    .line 16
    iput p2, p1, Ld0/b;->b:F

    .line 17
    .line 18
    iput p2, p1, Ld0/b;->c:F

    .line 19
    .line 20
    iput p2, p1, Ld0/b;->d:F

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-static {p2, p1}, Le0/z;->n([FLd0/b;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {v1, v0}, Lu0/a0;->b(Ljava/lang/Object;)[F

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p2, p1}, Le0/z;->n([FLd0/b;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final g(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lu0/h0;->l:Lu0/N;

    .line 2
    .line 3
    invoke-interface {v0}, Lu0/N;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0}, Lu0/N;->n()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    sget v3, LL0/g;->c:I

    .line 12
    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    shr-long v3, p1, v3

    .line 16
    .line 17
    long-to-int v3, v3

    .line 18
    const-wide v4, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p1, v4

    .line 24
    long-to-int p1, p1

    .line 25
    if-ne v1, v3, :cond_1

    .line 26
    .line 27
    if-eq v2, p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void

    .line 31
    :cond_1
    :goto_0
    sub-int/2addr v3, v1

    .line 32
    invoke-interface {v0, v3}, Lu0/N;->v(I)V

    .line 33
    .line 34
    .line 35
    sub-int/2addr p1, v2

    .line 36
    invoke-interface {v0, p1}, Lu0/N;->i(I)V

    .line 37
    .line 38
    .line 39
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    iget-object p2, p0, Lu0/h0;->a:Lu0/n;

    .line 42
    .line 43
    const/16 v0, 0x1a

    .line 44
    .line 45
    if-lt p1, v0, :cond_2

    .line 46
    .line 47
    sget-object p1, Lu0/N0;->a:Lu0/N0;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lu0/N0;->a(Lu0/n;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object p1, p0, Lu0/h0;->i:Lu0/a0;

    .line 57
    .line 58
    invoke-virtual {p1}, Lu0/a0;->c()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lu0/h0;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Lu0/h0;->l:Lu0/N;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1}, Lu0/N;->j()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Lu0/h0;->j(Z)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Lu0/N;->r()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lu0/h0;->e:Lu0/c0;

    .line 24
    .line 25
    iget-boolean v2, v0, Lu0/c0;->i:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lu0/c0;->e()V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lu0/c0;->g:Le0/x;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_0
    iget-object v2, p0, Lu0/h0;->b:Lt0/y;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lu0/h0;->j:Lac/a;

    .line 41
    .line 42
    invoke-interface {v1, v3, v0, v2}, Lu0/N;->g(Lac/a;Le0/x;Lt0/y;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final i(Lt0/y;Lt0/p;)V
    .locals 2

    .line 1
    const-string v0, "invalidateParentLayer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lu0/h0;->j(Z)V

    .line 8
    .line 9
    .line 10
    iput-boolean v0, p0, Lu0/h0;->f:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lu0/h0;->g:Z

    .line 13
    .line 14
    sget-wide v0, Le0/J;->b:J

    .line 15
    .line 16
    iput-wide v0, p0, Lu0/h0;->k:J

    .line 17
    .line 18
    iput-object p1, p0, Lu0/h0;->b:Lt0/y;

    .line 19
    .line 20
    iput-object p2, p0, Lu0/h0;->c:Lt0/p;

    .line 21
    .line 22
    return-void
.end method

.method public final invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu0/h0;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lu0/h0;->f:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lu0/h0;->a:Lu0/n;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lu0/h0;->j(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu0/h0;->d:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lu0/h0;->d:Z

    .line 6
    .line 7
    iget-object v0, p0, Lu0/h0;->a:Lu0/n;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1}, Lu0/n;->l(Lt0/G;Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
