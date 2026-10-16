.class public abstract Lu0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    const-class v1, Ljava/io/Serializable;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    const-class v1, Landroid/os/Parcelable;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    const-class v1, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    const-class v1, Landroid/util/SparseArray;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    const-class v1, Landroid/os/Binder;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    const-class v1, Landroid/util/Size;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    aput-object v1, v0, v2

    .line 33
    .line 34
    const-class v1, Landroid/util/SizeF;

    .line 35
    .line 36
    const/4 v2, 0x6

    .line 37
    aput-object v1, v0, v2

    .line 38
    .line 39
    sput-object v0, Lu0/Q;->a:[Ljava/lang/Class;

    .line 40
    .line 41
    return-void
.end method

.method public static final a(Lx0/k;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx0/k;->f()Lx0/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lx0/n;->i:Lx0/q;

    .line 6
    .line 7
    invoke-static {p0, v0}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static final b([F[F)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2, v2, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-static {v2, v4, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    const/4 v6, 0x2

    .line 16
    invoke-static {v2, v6, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/4 v8, 0x3

    .line 21
    invoke-static {v2, v8, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    invoke-static {v4, v2, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    invoke-static {v4, v4, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    invoke-static {v4, v6, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    invoke-static {v4, v8, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 38
    .line 39
    .line 40
    move-result v13

    .line 41
    invoke-static {v6, v2, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 42
    .line 43
    .line 44
    move-result v14

    .line 45
    invoke-static {v6, v4, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 46
    .line 47
    .line 48
    move-result v15

    .line 49
    invoke-static {v6, v6, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    invoke-static {v6, v8, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 54
    .line 55
    .line 56
    move-result v17

    .line 57
    invoke-static {v8, v2, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 58
    .line 59
    .line 60
    move-result v18

    .line 61
    invoke-static {v8, v4, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 62
    .line 63
    .line 64
    move-result v19

    .line 65
    invoke-static {v8, v6, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 66
    .line 67
    .line 68
    move-result v20

    .line 69
    invoke-static {v8, v8, v1, v0}, Lu0/Q;->e(II[F[F)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    aput v3, v0, v2

    .line 74
    .line 75
    aput v5, v0, v4

    .line 76
    .line 77
    aput v7, v0, v6

    .line 78
    .line 79
    aput v9, v0, v8

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    aput v10, v0, v2

    .line 83
    .line 84
    const/4 v2, 0x5

    .line 85
    aput v11, v0, v2

    .line 86
    .line 87
    const/4 v2, 0x6

    .line 88
    aput v12, v0, v2

    .line 89
    .line 90
    const/4 v2, 0x7

    .line 91
    aput v13, v0, v2

    .line 92
    .line 93
    const/16 v2, 0x8

    .line 94
    .line 95
    aput v14, v0, v2

    .line 96
    .line 97
    const/16 v2, 0x9

    .line 98
    .line 99
    aput v15, v0, v2

    .line 100
    .line 101
    const/16 v2, 0xa

    .line 102
    .line 103
    aput v16, v0, v2

    .line 104
    .line 105
    const/16 v2, 0xb

    .line 106
    .line 107
    aput v17, v0, v2

    .line 108
    .line 109
    const/16 v2, 0xc

    .line 110
    .line 111
    aput v18, v0, v2

    .line 112
    .line 113
    const/16 v2, 0xd

    .line 114
    .line 115
    aput v19, v0, v2

    .line 116
    .line 117
    const/16 v2, 0xe

    .line 118
    .line 119
    aput v20, v0, v2

    .line 120
    .line 121
    const/16 v2, 0xf

    .line 122
    .line 123
    aput v1, v0, v2

    .line 124
    .line 125
    return-void
.end method

.method public static final c(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p0, LN/Y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    check-cast p0, LN/Y;

    .line 7
    .line 8
    sget-object v0, LN/P;->c:LN/P;

    .line 9
    .line 10
    iget-object v2, p0, LN/Y;->b:LN/A0;

    .line 11
    .line 12
    if-eq v2, v0, :cond_0

    .line 13
    .line 14
    sget-object v0, LN/P;->f:LN/P;

    .line 15
    .line 16
    if-eq v2, v0, :cond_0

    .line 17
    .line 18
    sget-object v0, LN/P;->d:LN/P;

    .line 19
    .line 20
    if-ne v2, v0, :cond_5

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p0}, Lu0/Q;->c(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_2
    instance-of v0, p0, Lef/e;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    instance-of v0, p0, Ljava/io/Serializable;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    sget-object v0, Lu0/Q;->a:[Ljava/lang/Class;

    .line 44
    .line 45
    move v2, v1

    .line 46
    :goto_0
    const/4 v3, 0x7

    .line 47
    if-ge v2, v3, :cond_5

    .line 48
    .line 49
    aget-object v3, v0, v2

    .line 50
    .line 51
    invoke-virtual {v3, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    :goto_1
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    :goto_2
    return v1
.end method

.method public static final d(F)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p0, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    float-to-double v0, p0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    :goto_0
    double-to-float p0, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    float-to-double v0, p0

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    float-to-int p0, p0

    .line 20
    mul-int/lit8 p0, p0, -0x1

    .line 21
    .line 22
    return p0
.end method

.method public static final e(II[F[F)F
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    mul-int/2addr p0, v0

    .line 3
    aget v1, p2, p0

    .line 4
    .line 5
    aget v2, p3, p1

    .line 6
    .line 7
    mul-float/2addr v1, v2

    .line 8
    add-int/lit8 v2, p0, 0x1

    .line 9
    .line 10
    aget v2, p2, v2

    .line 11
    .line 12
    add-int/2addr v0, p1

    .line 13
    aget v0, p3, v0

    .line 14
    .line 15
    mul-float/2addr v2, v0

    .line 16
    add-float/2addr v2, v1

    .line 17
    add-int/lit8 v0, p0, 0x2

    .line 18
    .line 19
    aget v0, p2, v0

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    add-int/2addr v1, p1

    .line 24
    aget v1, p3, v1

    .line 25
    .line 26
    mul-float/2addr v0, v1

    .line 27
    add-float/2addr v0, v2

    .line 28
    add-int/lit8 p0, p0, 0x3

    .line 29
    .line 30
    aget p0, p2, p0

    .line 31
    .line 32
    const/16 p2, 0xc

    .line 33
    .line 34
    add-int/2addr p2, p1

    .line 35
    aget p1, p3, p2

    .line 36
    .line 37
    mul-float/2addr p0, p1

    .line 38
    add-float/2addr p0, v0

    .line 39
    return p0
.end method

.method public static final f(Ljava/util/ArrayList;I)Lu0/l0;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lu0/l0;

    .line 18
    .line 19
    iget v2, v2, Lu0/l0;->a:I

    .line 20
    .line 21
    if-ne v2, p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lu0/l0;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static final g(Landroid/graphics/Region;Lx0/k;Ljava/util/LinkedHashMap;Lx0/k;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v3, Lx0/k;->g:Lt0/t;

    .line 10
    .line 11
    iget-boolean v5, v4, Lt0/t;->s:Z

    .line 12
    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    invoke-virtual {v4}, Lt0/t;->r()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v4, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v4, 0x1

    .line 25
    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Region;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iget v8, v1, Lx0/k;->f:I

    .line 30
    .line 31
    iget v9, v3, Lx0/k;->f:I

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    if-ne v9, v8, :cond_11

    .line 36
    .line 37
    :cond_2
    if-eqz v4, :cond_3

    .line 38
    .line 39
    iget-boolean v4, v3, Lx0/k;->c:Z

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_3
    iget-object v4, v3, Lx0/k;->e:Lx0/g;

    .line 46
    .line 47
    iget-boolean v4, v4, Lx0/g;->b:Z

    .line 48
    .line 49
    iget-object v5, v3, Lx0/k;->a:Lx0/h;

    .line 50
    .line 51
    if-eqz v4, :cond_5

    .line 52
    .line 53
    iget-object v4, v3, Lx0/k;->g:Lt0/t;

    .line 54
    .line 55
    invoke-static {v4}, LS3/f;->u(Lt0/t;)Lx0/h;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    move-object v5, v4

    .line 63
    :cond_5
    :goto_2
    iget-boolean v4, v5, LX0/E;->a:Z

    .line 64
    .line 65
    sget-object v10, Ld0/d;->e:Ld0/d;

    .line 66
    .line 67
    const/4 v11, 0x0

    .line 68
    if-nez v4, :cond_6

    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_6
    iget-object v4, v5, LX0/E;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, LZ/j;

    .line 75
    .line 76
    check-cast v4, Lx0/i;

    .line 77
    .line 78
    check-cast v4, Lx0/j;

    .line 79
    .line 80
    iget-object v4, v4, Lx0/j;->b:Lx0/g;

    .line 81
    .line 82
    sget-object v12, Lx0/f;->b:Lx0/q;

    .line 83
    .line 84
    invoke-static {v4, v12}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget-object v5, v5, LX0/E;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v5, Lt0/y;

    .line 91
    .line 92
    if-eqz v4, :cond_b

    .line 93
    .line 94
    invoke-virtual {v5}, Lt0/y;->S()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_7

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-static {v5}, LFe/g;->z(Lr0/k;)Lr0/k;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-object v12, v5, Lt0/y;->r:Ld0/b;

    .line 106
    .line 107
    if-nez v12, :cond_8

    .line 108
    .line 109
    new-instance v12, Ld0/b;

    .line 110
    .line 111
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iput v11, v12, Ld0/b;->a:F

    .line 115
    .line 116
    iput v11, v12, Ld0/b;->b:F

    .line 117
    .line 118
    iput v11, v12, Ld0/b;->c:F

    .line 119
    .line 120
    iput v11, v12, Ld0/b;->d:F

    .line 121
    .line 122
    iput-object v12, v5, Lt0/y;->r:Ld0/b;

    .line 123
    .line 124
    :cond_8
    invoke-virtual {v5}, Lt0/y;->K()J

    .line 125
    .line 126
    .line 127
    move-result-wide v13

    .line 128
    invoke-virtual {v5, v13, v14}, Lt0/y;->A(J)J

    .line 129
    .line 130
    .line 131
    move-result-wide v13

    .line 132
    invoke-static {v13, v14}, Ld0/f;->d(J)F

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    neg-float v15, v15

    .line 137
    iput v15, v12, Ld0/b;->a:F

    .line 138
    .line 139
    invoke-static {v13, v14}, Ld0/f;->b(J)F

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    neg-float v15, v15

    .line 144
    iput v15, v12, Ld0/b;->b:F

    .line 145
    .line 146
    invoke-virtual {v5}, Lr0/t;->h()I

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    int-to-float v15, v15

    .line 151
    invoke-static {v13, v14}, Ld0/f;->d(J)F

    .line 152
    .line 153
    .line 154
    move-result v16

    .line 155
    add-float v15, v16, v15

    .line 156
    .line 157
    iput v15, v12, Ld0/b;->c:F

    .line 158
    .line 159
    iget-wide v6, v5, Lr0/t;->c:J

    .line 160
    .line 161
    const-wide v17, 0xffffffffL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    and-long v6, v6, v17

    .line 167
    .line 168
    long-to-int v6, v6

    .line 169
    int-to-float v6, v6

    .line 170
    invoke-static {v13, v14}, Ld0/f;->b(J)F

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    add-float/2addr v7, v6

    .line 175
    iput v7, v12, Ld0/b;->d:F

    .line 176
    .line 177
    :goto_3
    if-eq v5, v4, :cond_a

    .line 178
    .line 179
    const/4 v6, 0x1

    .line 180
    const/4 v15, 0x0

    .line 181
    invoke-virtual {v5, v12, v15, v6}, Lt0/y;->a0(Ld0/b;ZZ)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Ld0/b;->b()Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_9

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_9
    iget-object v5, v5, Lt0/y;->f:Lt0/y;

    .line 192
    .line 193
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_a
    new-instance v10, Ld0/d;

    .line 198
    .line 199
    iget v4, v12, Ld0/b;->a:F

    .line 200
    .line 201
    iget v5, v12, Ld0/b;->b:F

    .line 202
    .line 203
    iget v6, v12, Ld0/b;->c:F

    .line 204
    .line 205
    iget v7, v12, Ld0/b;->d:F

    .line 206
    .line 207
    invoke-direct {v10, v4, v5, v6, v7}, Ld0/d;-><init>(FFFF)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_b
    invoke-static {v5}, LFe/g;->q(Lt0/y;)Ld0/d;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    :goto_4
    invoke-static {v10}, Le0/z;->r(Ld0/d;)Landroid/graphics/Rect;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    new-instance v5, Landroid/graphics/Region;

    .line 220
    .line 221
    invoke-direct {v5}, Landroid/graphics/Region;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5, v4}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    .line 225
    .line 226
    .line 227
    const/4 v6, -0x1

    .line 228
    if-ne v9, v8, :cond_c

    .line 229
    .line 230
    move v9, v6

    .line 231
    :cond_c
    sget-object v7, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 232
    .line 233
    invoke-virtual {v5, v0, v5, v7}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    const-string v8, "region.bounds"

    .line 238
    .line 239
    if-eqz v7, :cond_e

    .line 240
    .line 241
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    new-instance v9, Lu0/m0;

    .line 246
    .line 247
    invoke-virtual {v5}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-direct {v9, v3, v5}, Lu0/m0;-><init>(Lx0/k;Landroid/graphics/Rect;)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v2, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    const/4 v15, 0x0

    .line 261
    invoke-virtual {v3, v15}, Lx0/k;->e(Z)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    const/16 v16, 0x1

    .line 270
    .line 271
    add-int/lit8 v5, v5, -0x1

    .line 272
    .line 273
    :goto_5
    if-ge v6, v5, :cond_d

    .line 274
    .line 275
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    check-cast v7, Lx0/k;

    .line 280
    .line 281
    invoke-static {v0, v1, v2, v7}, Lu0/Q;->g(Landroid/graphics/Region;Lx0/k;Ljava/util/LinkedHashMap;Lx0/k;)V

    .line 282
    .line 283
    .line 284
    add-int/lit8 v5, v5, -0x1

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_d
    sget-object v1, Landroid/graphics/Region$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Region$Op;

    .line 288
    .line 289
    invoke-virtual {v0, v4, v0, v1}, Landroid/graphics/Region;->op(Landroid/graphics/Rect;Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_e
    iget-boolean v0, v3, Lx0/k;->c:Z

    .line 294
    .line 295
    if-eqz v0, :cond_10

    .line 296
    .line 297
    invoke-virtual {v3}, Lx0/k;->g()Lx0/k;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-eqz v0, :cond_f

    .line 302
    .line 303
    iget-object v1, v0, Lx0/k;->g:Lt0/t;

    .line 304
    .line 305
    if-eqz v1, :cond_f

    .line 306
    .line 307
    iget-boolean v1, v1, Lt0/t;->s:Z

    .line 308
    .line 309
    const/4 v6, 0x1

    .line 310
    if-ne v1, v6, :cond_f

    .line 311
    .line 312
    invoke-virtual {v0}, Lx0/k;->d()Ld0/d;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    goto :goto_6

    .line 317
    :cond_f
    new-instance v0, Ld0/d;

    .line 318
    .line 319
    const/high16 v1, 0x41200000    # 10.0f

    .line 320
    .line 321
    invoke-direct {v0, v11, v11, v1, v1}, Ld0/d;-><init>(FFFF)V

    .line 322
    .line 323
    .line 324
    :goto_6
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    new-instance v4, Lu0/m0;

    .line 329
    .line 330
    invoke-static {v0}, Le0/z;->r(Ld0/d;)Landroid/graphics/Rect;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-direct {v4, v3, v0}, Lu0/m0;-><init>(Lx0/k;Landroid/graphics/Rect;)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :cond_10
    if-ne v9, v6, :cond_11

    .line 342
    .line 343
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    new-instance v1, Lu0/m0;

    .line 348
    .line 349
    invoke-virtual {v5}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-direct {v1, v3, v4}, Lu0/m0;-><init>(Lx0/k;Landroid/graphics/Rect;)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    :cond_11
    :goto_7
    return-void
.end method

.method public static final h([F[F)Z
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "$this$invertTo"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "other"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aget v3, v0, v2

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    aget v5, v0, v4

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    aget v7, v0, v6

    .line 23
    .line 24
    const/4 v8, 0x3

    .line 25
    aget v9, v0, v8

    .line 26
    .line 27
    const/4 v10, 0x4

    .line 28
    aget v11, v0, v10

    .line 29
    .line 30
    const/4 v12, 0x5

    .line 31
    aget v13, v0, v12

    .line 32
    .line 33
    const/4 v14, 0x6

    .line 34
    aget v15, v0, v14

    .line 35
    .line 36
    const/16 v16, 0x7

    .line 37
    .line 38
    aget v17, v0, v16

    .line 39
    .line 40
    const/16 v18, 0x8

    .line 41
    .line 42
    move/from16 v19, v2

    .line 43
    .line 44
    aget v2, v0, v18

    .line 45
    .line 46
    const/16 v20, 0x9

    .line 47
    .line 48
    move/from16 v21, v4

    .line 49
    .line 50
    aget v4, v0, v20

    .line 51
    .line 52
    const/16 v22, 0xa

    .line 53
    .line 54
    aget v23, v0, v22

    .line 55
    .line 56
    const/16 v24, 0xb

    .line 57
    .line 58
    aget v25, v0, v24

    .line 59
    .line 60
    const/16 v26, 0xc

    .line 61
    .line 62
    move/from16 v27, v6

    .line 63
    .line 64
    aget v6, v0, v26

    .line 65
    .line 66
    const/16 v28, 0xd

    .line 67
    .line 68
    aget v29, v0, v28

    .line 69
    .line 70
    const/16 v30, 0xe

    .line 71
    .line 72
    aget v31, v0, v30

    .line 73
    .line 74
    const/16 v32, 0xf

    .line 75
    .line 76
    aget v0, v0, v32

    .line 77
    .line 78
    mul-float v33, v3, v13

    .line 79
    .line 80
    mul-float v34, v5, v11

    .line 81
    .line 82
    sub-float v33, v33, v34

    .line 83
    .line 84
    mul-float v34, v3, v15

    .line 85
    .line 86
    mul-float v35, v7, v11

    .line 87
    .line 88
    sub-float v34, v34, v35

    .line 89
    .line 90
    mul-float v35, v3, v17

    .line 91
    .line 92
    mul-float v36, v9, v11

    .line 93
    .line 94
    sub-float v35, v35, v36

    .line 95
    .line 96
    mul-float v36, v5, v15

    .line 97
    .line 98
    mul-float v37, v7, v13

    .line 99
    .line 100
    sub-float v36, v36, v37

    .line 101
    .line 102
    mul-float v37, v5, v17

    .line 103
    .line 104
    mul-float v38, v9, v13

    .line 105
    .line 106
    sub-float v37, v37, v38

    .line 107
    .line 108
    mul-float v38, v7, v17

    .line 109
    .line 110
    mul-float v39, v9, v15

    .line 111
    .line 112
    sub-float v38, v38, v39

    .line 113
    .line 114
    mul-float v39, v2, v29

    .line 115
    .line 116
    mul-float v40, v4, v6

    .line 117
    .line 118
    sub-float v39, v39, v40

    .line 119
    .line 120
    mul-float v40, v2, v31

    .line 121
    .line 122
    mul-float v41, v23, v6

    .line 123
    .line 124
    sub-float v40, v40, v41

    .line 125
    .line 126
    mul-float v41, v2, v0

    .line 127
    .line 128
    mul-float v42, v25, v6

    .line 129
    .line 130
    sub-float v41, v41, v42

    .line 131
    .line 132
    mul-float v42, v4, v31

    .line 133
    .line 134
    mul-float v43, v23, v29

    .line 135
    .line 136
    sub-float v42, v42, v43

    .line 137
    .line 138
    mul-float v43, v4, v0

    .line 139
    .line 140
    mul-float v44, v25, v29

    .line 141
    .line 142
    sub-float v43, v43, v44

    .line 143
    .line 144
    mul-float v44, v23, v0

    .line 145
    .line 146
    mul-float v45, v25, v31

    .line 147
    .line 148
    sub-float v44, v44, v45

    .line 149
    .line 150
    mul-float v45, v33, v44

    .line 151
    .line 152
    mul-float v46, v34, v43

    .line 153
    .line 154
    sub-float v45, v45, v46

    .line 155
    .line 156
    mul-float v46, v35, v42

    .line 157
    .line 158
    add-float v46, v46, v45

    .line 159
    .line 160
    mul-float v45, v36, v41

    .line 161
    .line 162
    add-float v45, v45, v46

    .line 163
    .line 164
    mul-float v46, v37, v40

    .line 165
    .line 166
    sub-float v45, v45, v46

    .line 167
    .line 168
    mul-float v46, v38, v39

    .line 169
    .line 170
    add-float v46, v46, v45

    .line 171
    .line 172
    const/16 v45, 0x0

    .line 173
    .line 174
    cmpg-float v45, v46, v45

    .line 175
    .line 176
    if-nez v45, :cond_0

    .line 177
    .line 178
    return v19

    .line 179
    :cond_0
    const/high16 v45, 0x3f800000    # 1.0f

    .line 180
    .line 181
    div-float v45, v45, v46

    .line 182
    .line 183
    mul-float v46, v13, v44

    .line 184
    .line 185
    mul-float v47, v15, v43

    .line 186
    .line 187
    sub-float v46, v46, v47

    .line 188
    .line 189
    mul-float v47, v17, v42

    .line 190
    .line 191
    add-float v47, v47, v46

    .line 192
    .line 193
    mul-float v47, v47, v45

    .line 194
    .line 195
    aput v47, v1, v19

    .line 196
    .line 197
    move/from16 v19, v8

    .line 198
    .line 199
    neg-float v8, v5

    .line 200
    mul-float v8, v8, v44

    .line 201
    .line 202
    mul-float v46, v7, v43

    .line 203
    .line 204
    add-float v46, v46, v8

    .line 205
    .line 206
    mul-float v8, v9, v42

    .line 207
    .line 208
    sub-float v46, v46, v8

    .line 209
    .line 210
    mul-float v46, v46, v45

    .line 211
    .line 212
    aput v46, v1, v21

    .line 213
    .line 214
    mul-float v8, v29, v38

    .line 215
    .line 216
    mul-float v46, v31, v37

    .line 217
    .line 218
    sub-float v8, v8, v46

    .line 219
    .line 220
    mul-float v46, v0, v36

    .line 221
    .line 222
    add-float v46, v46, v8

    .line 223
    .line 224
    mul-float v46, v46, v45

    .line 225
    .line 226
    aput v46, v1, v27

    .line 227
    .line 228
    neg-float v8, v4

    .line 229
    mul-float v8, v8, v38

    .line 230
    .line 231
    mul-float v27, v23, v37

    .line 232
    .line 233
    add-float v27, v27, v8

    .line 234
    .line 235
    mul-float v8, v25, v36

    .line 236
    .line 237
    sub-float v27, v27, v8

    .line 238
    .line 239
    mul-float v27, v27, v45

    .line 240
    .line 241
    aput v27, v1, v19

    .line 242
    .line 243
    neg-float v8, v11

    .line 244
    mul-float v19, v8, v44

    .line 245
    .line 246
    mul-float v27, v15, v41

    .line 247
    .line 248
    add-float v27, v27, v19

    .line 249
    .line 250
    mul-float v19, v17, v40

    .line 251
    .line 252
    sub-float v27, v27, v19

    .line 253
    .line 254
    mul-float v27, v27, v45

    .line 255
    .line 256
    aput v27, v1, v10

    .line 257
    .line 258
    mul-float v44, v44, v3

    .line 259
    .line 260
    mul-float v10, v7, v41

    .line 261
    .line 262
    sub-float v44, v44, v10

    .line 263
    .line 264
    mul-float v10, v9, v40

    .line 265
    .line 266
    add-float v10, v10, v44

    .line 267
    .line 268
    mul-float v10, v10, v45

    .line 269
    .line 270
    aput v10, v1, v12

    .line 271
    .line 272
    neg-float v10, v6

    .line 273
    mul-float v12, v10, v38

    .line 274
    .line 275
    mul-float v19, v31, v35

    .line 276
    .line 277
    add-float v19, v19, v12

    .line 278
    .line 279
    mul-float v12, v0, v34

    .line 280
    .line 281
    sub-float v19, v19, v12

    .line 282
    .line 283
    mul-float v19, v19, v45

    .line 284
    .line 285
    aput v19, v1, v14

    .line 286
    .line 287
    mul-float v38, v38, v2

    .line 288
    .line 289
    mul-float v12, v23, v35

    .line 290
    .line 291
    sub-float v38, v38, v12

    .line 292
    .line 293
    mul-float v12, v25, v34

    .line 294
    .line 295
    add-float v12, v12, v38

    .line 296
    .line 297
    mul-float v12, v12, v45

    .line 298
    .line 299
    aput v12, v1, v16

    .line 300
    .line 301
    mul-float v11, v11, v43

    .line 302
    .line 303
    mul-float v12, v13, v41

    .line 304
    .line 305
    sub-float/2addr v11, v12

    .line 306
    mul-float v17, v17, v39

    .line 307
    .line 308
    add-float v17, v17, v11

    .line 309
    .line 310
    mul-float v17, v17, v45

    .line 311
    .line 312
    aput v17, v1, v18

    .line 313
    .line 314
    neg-float v11, v3

    .line 315
    mul-float v11, v11, v43

    .line 316
    .line 317
    mul-float v41, v41, v5

    .line 318
    .line 319
    add-float v41, v41, v11

    .line 320
    .line 321
    mul-float v9, v9, v39

    .line 322
    .line 323
    sub-float v41, v41, v9

    .line 324
    .line 325
    mul-float v41, v41, v45

    .line 326
    .line 327
    aput v41, v1, v20

    .line 328
    .line 329
    mul-float v6, v6, v37

    .line 330
    .line 331
    mul-float v9, v29, v35

    .line 332
    .line 333
    sub-float/2addr v6, v9

    .line 334
    mul-float v0, v0, v33

    .line 335
    .line 336
    add-float/2addr v0, v6

    .line 337
    mul-float v0, v0, v45

    .line 338
    .line 339
    aput v0, v1, v22

    .line 340
    .line 341
    neg-float v0, v2

    .line 342
    mul-float v0, v0, v37

    .line 343
    .line 344
    mul-float v35, v35, v4

    .line 345
    .line 346
    add-float v35, v35, v0

    .line 347
    .line 348
    mul-float v25, v25, v33

    .line 349
    .line 350
    sub-float v35, v35, v25

    .line 351
    .line 352
    mul-float v35, v35, v45

    .line 353
    .line 354
    aput v35, v1, v24

    .line 355
    .line 356
    mul-float v8, v8, v42

    .line 357
    .line 358
    mul-float v13, v13, v40

    .line 359
    .line 360
    add-float/2addr v13, v8

    .line 361
    mul-float v15, v15, v39

    .line 362
    .line 363
    sub-float/2addr v13, v15

    .line 364
    mul-float v13, v13, v45

    .line 365
    .line 366
    aput v13, v1, v26

    .line 367
    .line 368
    mul-float v3, v3, v42

    .line 369
    .line 370
    mul-float v5, v5, v40

    .line 371
    .line 372
    sub-float/2addr v3, v5

    .line 373
    mul-float v7, v7, v39

    .line 374
    .line 375
    add-float/2addr v7, v3

    .line 376
    mul-float v7, v7, v45

    .line 377
    .line 378
    aput v7, v1, v28

    .line 379
    .line 380
    mul-float v10, v10, v36

    .line 381
    .line 382
    mul-float v29, v29, v34

    .line 383
    .line 384
    add-float v29, v29, v10

    .line 385
    .line 386
    mul-float v31, v31, v33

    .line 387
    .line 388
    sub-float v29, v29, v31

    .line 389
    .line 390
    mul-float v29, v29, v45

    .line 391
    .line 392
    aput v29, v1, v30

    .line 393
    .line 394
    mul-float v2, v2, v36

    .line 395
    .line 396
    mul-float v4, v4, v34

    .line 397
    .line 398
    sub-float/2addr v2, v4

    .line 399
    mul-float v23, v23, v33

    .line 400
    .line 401
    add-float v23, v23, v2

    .line 402
    .line 403
    mul-float v23, v23, v45

    .line 404
    .line 405
    aput v23, v1, v32

    .line 406
    .line 407
    return v21
.end method

.method public static final i(FFJFF)Z
    .locals 0

    .line 1
    sub-float/2addr p0, p4

    .line 2
    sub-float/2addr p1, p5

    .line 3
    invoke-static {p2, p3}, Ld0/a;->b(J)F

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    invoke-static {p2, p3}, Ld0/a;->c(J)F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    mul-float/2addr p0, p0

    .line 12
    mul-float/2addr p4, p4

    .line 13
    div-float/2addr p0, p4

    .line 14
    mul-float/2addr p1, p1

    .line 15
    mul-float/2addr p2, p2

    .line 16
    div-float/2addr p1, p2

    .line 17
    add-float/2addr p1, p0

    .line 18
    const/high16 p0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    cmpg-float p0, p1, p0

    .line 21
    .line 22
    if-gtz p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public static final j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x40

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-array v1, v0, [Ljava/lang/Object;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    aput-object p0, v1, v3

    .line 54
    .line 55
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v0, "%07x"

    .line 60
    .line 61
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static k(Landroid/view/View;)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const-class v3, Ljava/lang/String;

    .line 5
    .line 6
    const-class v4, Ljava/lang/Class;

    .line 7
    .line 8
    :try_start_0
    sget-boolean v5, Lu0/s0;->p:Z

    .line 9
    .line 10
    if-nez v5, :cond_3

    .line 11
    .line 12
    sput-boolean v2, Lu0/s0;->p:Z

    .line 13
    .line 14
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    const/16 v6, 0x1c

    .line 17
    .line 18
    const-string v7, "mRecreateDisplayList"

    .line 19
    .line 20
    const-string v8, "updateDisplayListIfDirty"

    .line 21
    .line 22
    const-class v9, Landroid/view/View;

    .line 23
    .line 24
    if-ge v5, v6, :cond_0

    .line 25
    .line 26
    :try_start_1
    new-array v0, v1, [Ljava/lang/Class;

    .line 27
    .line 28
    invoke-virtual {v9, v8, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lu0/s0;->n:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-virtual {v9, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lu0/s0;->o:Ljava/lang/reflect/Field;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v5, "getDeclaredMethod"

    .line 42
    .line 43
    new-array v6, v1, [Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-array v10, v0, [Ljava/lang/Class;

    .line 50
    .line 51
    aput-object v3, v10, v1

    .line 52
    .line 53
    aput-object v6, v10, v2

    .line 54
    .line 55
    invoke-virtual {v4, v5, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-array v6, v1, [Ljava/lang/Class;

    .line 60
    .line 61
    new-array v0, v0, [Ljava/lang/Object;

    .line 62
    .line 63
    aput-object v8, v0, v1

    .line 64
    .line 65
    aput-object v6, v0, v2

    .line 66
    .line 67
    invoke-virtual {v5, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/reflect/Method;

    .line 72
    .line 73
    sput-object v0, Lu0/s0;->n:Ljava/lang/reflect/Method;

    .line 74
    .line 75
    const-string v0, "getDeclaredField"

    .line 76
    .line 77
    new-array v5, v2, [Ljava/lang/Class;

    .line 78
    .line 79
    aput-object v3, v5, v1

    .line 80
    .line 81
    invoke-virtual {v4, v0, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-array v3, v2, [Ljava/lang/Object;

    .line 86
    .line 87
    aput-object v7, v3, v1

    .line 88
    .line 89
    invoke-virtual {v0, v9, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Ljava/lang/reflect/Field;

    .line 94
    .line 95
    sput-object v0, Lu0/s0;->o:Ljava/lang/reflect/Field;

    .line 96
    .line 97
    :goto_0
    sget-object v0, Lu0/s0;->n:Ljava/lang/reflect/Method;

    .line 98
    .line 99
    if-nez v0, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    :goto_1
    sget-object v0, Lu0/s0;->o:Ljava/lang/reflect/Field;

    .line 106
    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_2
    sget-object v0, Lu0/s0;->o:Ljava/lang/reflect/Field;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 118
    .line 119
    .line 120
    :cond_4
    sget-object v0, Lu0/s0;->n:Ljava/lang/reflect/Method;

    .line 121
    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    new-array v1, v1, [Ljava/lang/Object;

    .line 125
    .line 126
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :catchall_0
    sput-boolean v2, Lu0/s0;->q:Z

    .line 131
    .line 132
    :cond_5
    return-void
.end method
