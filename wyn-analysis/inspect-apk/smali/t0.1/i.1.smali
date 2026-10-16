.class public final Lt0/i;
.super Lt0/y;
.source "SourceFile"

# interfaces
.implements LL0/b;


# static fields
.field public static final A:Lc7/l;


# instance fields
.field public final synthetic z:Lt0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Le0/q;->e:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lc7/l;->e(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lc7/l;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const-string v2, "<this>"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/high16 v2, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lc7/l;->g(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lt0/i;->A:Lc7/l;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Lt0/t;)V
    .locals 1

    .line 1
    const-string v0, "layoutNode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lt0/y;-><init>(Lt0/t;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lt0/t;->o:Lt0/r;

    .line 10
    .line 11
    iput-object p1, p0, Lt0/i;->z:Lt0/r;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J()Lt0/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lt0/t;->o:Lt0/r;

    .line 4
    .line 5
    return-object v0
.end method

.method public final Q(Lt0/j;JLt0/h;ZZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    const-string v2, "hitTestSource"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "hitTestResult"

    .line 15
    .line 16
    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, Lt0/y;->e:Lt0/t;

    .line 20
    .line 21
    iget v5, v1, Lt0/j;->a:I

    .line 22
    .line 23
    packed-switch v5, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    const-string v5, "parentLayoutNode"

    .line 27
    .line 28
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v5}, Lx0/h;->j()Lx0/g;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    iget-boolean v5, v5, Lx0/g;->c:Z

    .line 46
    .line 47
    if-ne v5, v7, :cond_0

    .line 48
    .line 49
    move v6, v7

    .line 50
    :cond_0
    xor-int/lit8 v5, v6, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_0
    const-string v5, "parentLayoutNode"

    .line 54
    .line 55
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    :goto_0
    const/4 v12, 0x1

    .line 60
    const/4 v6, 0x0

    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    invoke-static {v3, v4}, LU8/v0;->R(J)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iget-object v5, v0, Lt0/y;->v:Lt0/G;

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    iget-boolean v7, v0, Lt0/y;->g:Z

    .line 75
    .line 76
    if-eqz v7, :cond_3

    .line 77
    .line 78
    invoke-interface {v5, v3, v4}, Lt0/G;->e(J)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    :goto_1
    if-eqz p5, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Lt0/y;->K()J

    .line 88
    .line 89
    .line 90
    move-result-wide v7

    .line 91
    invoke-virtual {v0, v3, v4, v7, v8}, Lt0/y;->C(JJ)F

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-nez v7, :cond_4

    .line 100
    .line 101
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_4

    .line 106
    .line 107
    move v11, v6

    .line 108
    :goto_2
    move v6, v12

    .line 109
    goto :goto_4

    .line 110
    :cond_3
    :goto_3
    move/from16 v11, p6

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    move/from16 v11, p6

    .line 114
    .line 115
    :goto_4
    if-eqz v6, :cond_8

    .line 116
    .line 117
    iget v13, v9, Lt0/h;->c:I

    .line 118
    .line 119
    invoke-virtual {v2}, Lt0/t;->k()LP/d;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget v5, v2, LP/d;->c:I

    .line 124
    .line 125
    if-lez v5, :cond_7

    .line 126
    .line 127
    sub-int/2addr v5, v12

    .line 128
    iget-object v14, v2, LP/d;->a:[Ljava/lang/Object;

    .line 129
    .line 130
    move v15, v5

    .line 131
    :goto_5
    aget-object v2, v14, v15

    .line 132
    .line 133
    check-cast v2, Lt0/t;

    .line 134
    .line 135
    iget-boolean v5, v2, Lt0/t;->s:Z

    .line 136
    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    iget v5, v1, Lt0/j;->a:I

    .line 140
    .line 141
    packed-switch v5, :pswitch_data_1

    .line 142
    .line 143
    .line 144
    const-string v5, "hitTestResult"

    .line 145
    .line 146
    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v5, v2, Lt0/t;->y:Lt0/F;

    .line 150
    .line 151
    iget-object v6, v5, Lt0/F;->f:Lt0/y;

    .line 152
    .line 153
    invoke-virtual {v6, v3, v4}, Lt0/y;->G(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v7

    .line 157
    iget-object v5, v5, Lt0/F;->f:Lt0/y;

    .line 158
    .line 159
    sget-object v6, Lt0/y;->y:Lt0/j;

    .line 160
    .line 161
    const/4 v10, 0x1

    .line 162
    invoke-virtual/range {v5 .. v11}, Lt0/y;->P(Lt0/j;JLt0/h;ZZ)V

    .line 163
    .line 164
    .line 165
    goto :goto_6

    .line 166
    :pswitch_1
    const-string v5, "hitTestResult"

    .line 167
    .line 168
    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    move/from16 v6, p5

    .line 172
    .line 173
    move-object v5, v9

    .line 174
    move v7, v11

    .line 175
    invoke-virtual/range {v2 .. v7}, Lt0/t;->m(JLt0/h;ZZ)V

    .line 176
    .line 177
    .line 178
    :goto_6
    invoke-virtual {v9}, Lt0/h;->a()J

    .line 179
    .line 180
    .line 181
    move-result-wide v3

    .line 182
    const/16 v5, 0x20

    .line 183
    .line 184
    shr-long v5, v3, v5

    .line 185
    .line 186
    long-to-int v5, v5

    .line 187
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    const/4 v6, 0x0

    .line 192
    cmpg-float v5, v5, v6

    .line 193
    .line 194
    if-gez v5, :cond_5

    .line 195
    .line 196
    const-wide v5, 0xffffffffL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    and-long/2addr v3, v5

    .line 202
    long-to-int v3, v3

    .line 203
    if-eqz v3, :cond_5

    .line 204
    .line 205
    iget-object v2, v2, Lt0/t;->y:Lt0/F;

    .line 206
    .line 207
    iget-object v2, v2, Lt0/F;->f:Lt0/y;

    .line 208
    .line 209
    invoke-virtual {v2}, Lt0/y;->c0()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_7

    .line 214
    .line 215
    iget v2, v9, Lt0/h;->d:I

    .line 216
    .line 217
    sub-int/2addr v2, v12

    .line 218
    iput v2, v9, Lt0/h;->c:I

    .line 219
    .line 220
    :cond_5
    add-int/lit8 v15, v15, -0x1

    .line 221
    .line 222
    if-gez v15, :cond_6

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_6
    move-wide/from16 v3, p2

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_7
    :goto_7
    iput v13, v9, Lt0/h;->c:I

    .line 229
    .line 230
    :cond_8
    return-void

    .line 231
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
    .end packed-switch
.end method

.method public final Z(Le0/o;)V
    .locals 6

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 7
    .line 8
    invoke-static {v0}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Lt0/t;->k()LP/d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v2, v0, LP/d;->c:I

    .line 17
    .line 18
    if-lez v2, :cond_2

    .line 19
    .line 20
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    :cond_0
    aget-object v4, v0, v3

    .line 24
    .line 25
    check-cast v4, Lt0/t;

    .line 26
    .line 27
    iget-boolean v5, v4, Lt0/t;->s:Z

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v4, p1}, Lt0/t;->h(Le0/o;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    if-lt v3, v2, :cond_0

    .line 37
    .line 38
    :cond_2
    check-cast v1, Lu0/n;

    .line 39
    .line 40
    invoke-virtual {v1}, Lu0/n;->getShowLayoutBounds()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    sget-object v0, Lt0/i;->A:Lc7/l;

    .line 47
    .line 48
    invoke-virtual {p0, p1, v0}, Lt0/y;->E(Le0/o;Lc7/l;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/i;->z:Lt0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/r;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e(J)Lr0/t;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lr0/t;->p(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 5
    .line 6
    invoke-virtual {v0}, Lt0/t;->l()LP/d;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget v2, v1, LP/d;->c:I

    .line 11
    .line 12
    if-lez v2, :cond_1

    .line 13
    .line 14
    iget-object v1, v1, LP/d;->a:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :cond_0
    aget-object v4, v1, v3

    .line 18
    .line 19
    check-cast v4, Lt0/t;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    iput v5, v4, Lt0/t;->O:I

    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    if-lt v3, v2, :cond_0

    .line 30
    .line 31
    :cond_1
    iget-object v1, v0, Lt0/t;->l:Lr0/n;

    .line 32
    .line 33
    invoke-virtual {v0}, Lt0/t;->i()LP/a;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, v0, Lt0/t;->o:Lt0/r;

    .line 38
    .line 39
    invoke-interface {v1, v3, v2, p1, p2}, Lr0/n;->a(Lt0/r;LP/a;J)LD0/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string p2, "measureResult"

    .line 44
    .line 45
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, v0, Lt0/t;->x:Lt0/i;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, Lt0/y;->b0(LD0/b;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lt0/y;->Y()V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/i;->z:Lt0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/r;->getFontScale()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/i;->z:Lt0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LA7/p0;->a(LL0/b;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final l(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/i;->z:Lt0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v0}, LA7/p0;->b(JLL0/b;)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final m(JFLtf/l;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lt0/y;->m(JFLtf/l;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lt0/y;->f:Lt0/y;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p1, Lt0/y;->q:Z

    .line 10
    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lt0/y;->s:[LX0/E;

    .line 15
    .line 16
    const/4 p3, 0x4

    .line 17
    aget-object p1, p1, p3

    .line 18
    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    move-object p3, p1

    .line 22
    check-cast p3, Lt0/O;

    .line 23
    .line 24
    iget-object p3, p3, LX0/E;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p3, LZ/j;

    .line 27
    .line 28
    check-cast p3, Lr0/q;

    .line 29
    .line 30
    invoke-interface {p3, p0}, Lr0/q;->r(Lt0/y;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, LX0/E;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, LX0/E;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object p1, p0, Lt0/y;->e:Lt0/t;

    .line 39
    .line 40
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    iget-object p4, p1, Lt0/t;->x:Lt0/i;

    .line 45
    .line 46
    iget v0, p4, Lt0/y;->p:F

    .line 47
    .line 48
    iget-object v1, p1, Lt0/t;->y:Lt0/F;

    .line 49
    .line 50
    iget-object v1, v1, Lt0/F;->f:Lt0/y;

    .line 51
    .line 52
    :goto_1
    invoke-static {v1, p4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    check-cast v1, Lt0/A;

    .line 59
    .line 60
    iget v2, v1, Lt0/y;->p:F

    .line 61
    .line 62
    add-float/2addr v0, v2

    .line 63
    iget-object v1, v1, Lt0/A;->z:Lt0/y;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget p4, p1, Lt0/t;->z:F

    .line 67
    .line 68
    cmpg-float p4, v0, p4

    .line 69
    .line 70
    if-nez p4, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iput v0, p1, Lt0/t;->z:F

    .line 74
    .line 75
    if-eqz p3, :cond_4

    .line 76
    .line 77
    invoke-virtual {p3}, Lt0/t;->x()V

    .line 78
    .line 79
    .line 80
    :cond_4
    if-eqz p3, :cond_5

    .line 81
    .line 82
    invoke-virtual {p3}, Lt0/t;->o()V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    iget-boolean p4, p1, Lt0/t;->s:Z

    .line 86
    .line 87
    if-nez p4, :cond_7

    .line 88
    .line 89
    if-eqz p3, :cond_6

    .line 90
    .line 91
    invoke-virtual {p3}, Lt0/t;->o()V

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p1}, Lt0/t;->t()V

    .line 95
    .line 96
    .line 97
    :cond_7
    if-eqz p3, :cond_9

    .line 98
    .line 99
    iget-boolean p4, p1, Lt0/t;->J:Z

    .line 100
    .line 101
    if-nez p4, :cond_a

    .line 102
    .line 103
    iget p4, p3, Lt0/t;->N:I

    .line 104
    .line 105
    const/4 v0, 0x2

    .line 106
    if-ne p4, v0, :cond_a

    .line 107
    .line 108
    iget p4, p1, Lt0/t;->t:I

    .line 109
    .line 110
    const v0, 0x7fffffff

    .line 111
    .line 112
    .line 113
    if-ne p4, v0, :cond_8

    .line 114
    .line 115
    iget p4, p3, Lt0/t;->v:I

    .line 116
    .line 117
    iput p4, p1, Lt0/t;->t:I

    .line 118
    .line 119
    add-int/2addr p4, p2

    .line 120
    iput p4, p3, Lt0/t;->v:I

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string p2, "Place was called on a node which was placed already"

    .line 126
    .line 127
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_9
    const/4 p2, 0x0

    .line 132
    iput p2, p1, Lt0/t;->t:I

    .line 133
    .line 134
    :cond_a
    :goto_3
    invoke-virtual {p1}, Lt0/t;->s()V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final t(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/i;->z:Lt0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/r;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method

.method public final v(Lr0/j;)I
    .locals 4

    .line 1
    const-string v0, "alignmentLine"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 7
    .line 8
    iget-object v1, v0, Lt0/t;->y:Lt0/F;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget v1, v0, Lt0/t;->N:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    iget-object v3, v0, Lt0/t;->r:Lt0/u;

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iput-boolean v2, v3, Lt0/u;->d:Z

    .line 21
    .line 22
    iget-boolean v1, v3, Lt0/u;->b:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iput-boolean v2, v0, Lt0/t;->L:Z

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-boolean v2, v3, Lt0/u;->e:Z

    .line 30
    .line 31
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lt0/t;->s()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v3, Lt0/u;->g:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_2
    const/high16 p1, -0x80000000

    .line 50
    .line 51
    return p1
.end method

.method public final y(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/i;->z:Lt0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v0}, LA7/p0;->c(JLL0/b;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1
.end method
