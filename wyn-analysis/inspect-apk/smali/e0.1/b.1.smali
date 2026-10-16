.class public final Le0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/o;


# instance fields
.field public a:Landroid/graphics/Canvas;

.field public final b:Landroid/graphics/Rect;

.field public final c:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Le0/c;->a:Landroid/graphics/Canvas;

    .line 5
    .line 6
    iput-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Le0/b;->b:Landroid/graphics/Rect;

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Le0/b;->c:Landroid/graphics/Rect;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(FFFFLc7/l;)V
    .locals 7

    .line 1
    const-string v0, "paint"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 7
    .line 8
    iget-object p5, p5, Lc7/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v6, p5

    .line 11
    check-cast v6, Landroid/graphics/Paint;

    .line 12
    .line 13
    move v2, p1

    .line 14
    move v3, p2

    .line 15
    move v4, p3

    .line 16
    move v5, p4

    .line 17
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final b(Le0/d;JJJJLc7/l;)V
    .locals 8

    .line 1
    const-string v0, "image"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 7
    .line 8
    invoke-static {p1}, Le0/z;->f(Le0/d;)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget v1, LL0/g;->c:I

    .line 13
    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    shr-long v2, p2, v1

    .line 17
    .line 18
    long-to-int v2, v2

    .line 19
    iget-object v3, p0, Le0/b;->b:Landroid/graphics/Rect;

    .line 20
    .line 21
    iput v2, v3, Landroid/graphics/Rect;->left:I

    .line 22
    .line 23
    const-wide v4, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr p2, v4

    .line 29
    long-to-int p2, p2

    .line 30
    iput p2, v3, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    shr-long v6, p4, v1

    .line 33
    .line 34
    long-to-int p3, v6

    .line 35
    add-int/2addr v2, p3

    .line 36
    iput v2, v3, Landroid/graphics/Rect;->right:I

    .line 37
    .line 38
    and-long v6, p4, v4

    .line 39
    .line 40
    long-to-int p3, v6

    .line 41
    add-int/2addr p2, p3

    .line 42
    iput p2, v3, Landroid/graphics/Rect;->bottom:I

    .line 43
    .line 44
    shr-long p2, p6, v1

    .line 45
    .line 46
    long-to-int p2, p2

    .line 47
    iget-object p3, p0, Le0/b;->c:Landroid/graphics/Rect;

    .line 48
    .line 49
    iput p2, p3, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    and-long v6, p6, v4

    .line 52
    .line 53
    long-to-int v2, v6

    .line 54
    iput v2, p3, Landroid/graphics/Rect;->top:I

    .line 55
    .line 56
    shr-long v6, p8, v1

    .line 57
    .line 58
    long-to-int v1, v6

    .line 59
    add-int/2addr p2, v1

    .line 60
    iput p2, p3, Landroid/graphics/Rect;->right:I

    .line 61
    .line 62
    and-long v4, p8, v4

    .line 63
    .line 64
    long-to-int p2, v4

    .line 65
    add-int/2addr v2, p2

    .line 66
    iput v2, p3, Landroid/graphics/Rect;->bottom:I

    .line 67
    .line 68
    move-object/from16 p2, p10

    .line 69
    .line 70
    iget-object p2, p2, Lc7/l;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-virtual {v0, p1, v3, p3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final c(Le0/f;Lc7/l;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 7
    .line 8
    iget-object p2, p2, Lc7/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Landroid/graphics/Paint;

    .line 11
    .line 12
    iget-object p1, p1, Le0/f;->a:Landroid/graphics/Path;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iget-object v1, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 4
    .line 5
    const/high16 v2, -0x40800000    # -1.0f

    .line 6
    .line 7
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e(FFFFI)V
    .locals 6

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    if-nez p5, :cond_0

    .line 4
    .line 5
    sget-object p5, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 6
    .line 7
    :goto_0
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object p5, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final f(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Ld0/d;Lc7/l;)V
    .locals 7

    .line 1
    const-string v0, "paint"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v2, p1, Ld0/d;->a:F

    .line 7
    .line 8
    iget v3, p1, Ld0/d;->b:F

    .line 9
    .line 10
    iget v4, p1, Ld0/d;->c:F

    .line 11
    .line 12
    iget v5, p1, Ld0/d;->d:F

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    move-object v6, p2

    .line 16
    invoke-virtual/range {v1 .. v6}, Le0/b;->a(FFFFLc7/l;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final h(Le0/d;JLc7/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-static {p1}, Le0/z;->f(Le0/d;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iget-object p3, p4, Lc7/l;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p3, Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, p2, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Le0/z;->i(Landroid/graphics/Canvas;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final j(Ld0/d;)V
    .locals 6

    .line 1
    iget v2, p1, Ld0/d;->b:F

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    iget v1, p1, Ld0/d;->a:F

    .line 5
    .line 6
    iget v3, p1, Ld0/d;->c:F

    .line 7
    .line 8
    iget v4, p1, Ld0/d;->d:F

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    invoke-virtual/range {v0 .. v5}, Le0/b;->e(FFFFI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final k(FJLc7/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iget-object p3, p4, Lc7/l;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p3, Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p2, p1, p3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final l(Le0/x;)V
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 7
    .line 8
    instance-of v1, p1, Le0/f;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast p1, Le0/f;

    .line 13
    .line 14
    sget-object v1, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 15
    .line 16
    iget-object p1, p1, Le0/f;->a:Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v0, "Unable to obtain android.graphics.Path"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public final m()V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n(FFFFFFLc7/l;)V
    .locals 8

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    iget-object p7, p7, Lc7/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v7, p7

    .line 6
    check-cast v7, Landroid/graphics/Paint;

    .line 7
    .line 8
    move v1, p1

    .line 9
    move v2, p2

    .line 10
    move v3, p3

    .line 11
    move v4, p4

    .line 12
    move v5, p5

    .line 13
    move v6, p6

    .line 14
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Le0/z;->i(Landroid/graphics/Canvas;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final p([F)V
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "matrix"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    const/4 v3, 0x4

    .line 11
    if-ge v2, v3, :cond_4

    .line 12
    .line 13
    move v4, v1

    .line 14
    :goto_1
    if-ge v4, v3, :cond_3

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/high16 v6, 0x3f800000    # 1.0f

    .line 18
    .line 19
    if-ne v2, v4, :cond_0

    .line 20
    .line 21
    move v7, v6

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    move v7, v5

    .line 24
    :goto_2
    mul-int/lit8 v8, v2, 0x4

    .line 25
    .line 26
    add-int/2addr v8, v4

    .line 27
    aget v8, v0, v8

    .line 28
    .line 29
    cmpg-float v7, v8, v7

    .line 30
    .line 31
    if-nez v7, :cond_1

    .line 32
    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance v2, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    aget v7, v0, v4

    .line 43
    .line 44
    cmpg-float v8, v7, v5

    .line 45
    .line 46
    if-nez v8, :cond_2

    .line 47
    .line 48
    const/4 v8, 0x6

    .line 49
    aget v9, v0, v8

    .line 50
    .line 51
    cmpg-float v10, v9, v5

    .line 52
    .line 53
    if-nez v10, :cond_2

    .line 54
    .line 55
    const/16 v10, 0xa

    .line 56
    .line 57
    aget v10, v0, v10

    .line 58
    .line 59
    cmpg-float v6, v10, v6

    .line 60
    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    const/16 v6, 0xe

    .line 64
    .line 65
    aget v6, v0, v6

    .line 66
    .line 67
    cmpg-float v6, v6, v5

    .line 68
    .line 69
    if-nez v6, :cond_2

    .line 70
    .line 71
    const/16 v6, 0x8

    .line 72
    .line 73
    aget v10, v0, v6

    .line 74
    .line 75
    cmpg-float v11, v10, v5

    .line 76
    .line 77
    if-nez v11, :cond_2

    .line 78
    .line 79
    const/16 v11, 0x9

    .line 80
    .line 81
    aget v11, v0, v11

    .line 82
    .line 83
    cmpg-float v11, v11, v5

    .line 84
    .line 85
    if-nez v11, :cond_2

    .line 86
    .line 87
    const/16 v11, 0xb

    .line 88
    .line 89
    aget v11, v0, v11

    .line 90
    .line 91
    cmpg-float v5, v11, v5

    .line 92
    .line 93
    if-nez v5, :cond_2

    .line 94
    .line 95
    aget v5, v0, v1

    .line 96
    .line 97
    const/4 v11, 0x1

    .line 98
    aget v12, v0, v11

    .line 99
    .line 100
    const/4 v13, 0x3

    .line 101
    aget v14, v0, v13

    .line 102
    .line 103
    aget v15, v0, v3

    .line 104
    .line 105
    const/16 v16, 0x5

    .line 106
    .line 107
    aget v17, v0, v16

    .line 108
    .line 109
    const/16 v18, 0x7

    .line 110
    .line 111
    aget v19, v0, v18

    .line 112
    .line 113
    const/16 v20, 0xc

    .line 114
    .line 115
    aget v20, v0, v20

    .line 116
    .line 117
    const/16 v21, 0xd

    .line 118
    .line 119
    aget v21, v0, v21

    .line 120
    .line 121
    const/16 v22, 0xf

    .line 122
    .line 123
    aget v22, v0, v22

    .line 124
    .line 125
    aput v5, v0, v1

    .line 126
    .line 127
    aput v15, v0, v11

    .line 128
    .line 129
    aput v20, v0, v4

    .line 130
    .line 131
    aput v12, v0, v13

    .line 132
    .line 133
    aput v17, v0, v3

    .line 134
    .line 135
    aput v21, v0, v16

    .line 136
    .line 137
    aput v14, v0, v8

    .line 138
    .line 139
    aput v19, v0, v18

    .line 140
    .line 141
    aput v22, v0, v6

    .line 142
    .line 143
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 144
    .line 145
    .line 146
    aput v5, v0, v1

    .line 147
    .line 148
    aput v12, v0, v11

    .line 149
    .line 150
    aput v7, v0, v4

    .line 151
    .line 152
    aput v14, v0, v13

    .line 153
    .line 154
    aput v15, v0, v3

    .line 155
    .line 156
    aput v17, v0, v16

    .line 157
    .line 158
    aput v9, v0, v8

    .line 159
    .line 160
    aput v19, v0, v18

    .line 161
    .line 162
    aput v10, v0, v6

    .line 163
    .line 164
    move-object/from16 v3, p0

    .line 165
    .line 166
    iget-object v0, v3, Le0/b;->a:Landroid/graphics/Canvas;

    .line 167
    .line 168
    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_2
    move-object/from16 v3, p0

    .line 173
    .line 174
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 175
    .line 176
    const-string v1, "Android does not support arbitrary transforms"

    .line 177
    .line 178
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :cond_3
    move-object/from16 v3, p0

    .line 183
    .line 184
    add-int/lit8 v2, v2, 0x1

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_4
    move-object/from16 v3, p0

    .line 189
    .line 190
    return-void
.end method

.method public final q(Ld0/d;Lc7/l;)V
    .locals 7

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    iget-object p2, p2, Lc7/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v5, p2

    .line 6
    check-cast v5, Landroid/graphics/Paint;

    .line 7
    .line 8
    iget v3, p1, Ld0/d;->c:F

    .line 9
    .line 10
    iget v4, p1, Ld0/d;->d:F

    .line 11
    .line 12
    iget v1, p1, Ld0/d;->a:F

    .line 13
    .line 14
    iget v2, p1, Ld0/d;->b:F

    .line 15
    .line 16
    const/16 v6, 0x1f

    .line 17
    .line 18
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final r(FFFFFFLc7/l;)V
    .locals 9

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    iget-object v1, v1, Lc7/l;->b:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v8, v1

    .line 8
    check-cast v8, Landroid/graphics/Paint;

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    move v1, p1

    .line 12
    move v2, p2

    .line 13
    move v3, p3

    .line 14
    move v4, p4

    .line 15
    move v5, p5

    .line 16
    move v6, p6

    .line 17
    invoke-virtual/range {v0 .. v8}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final restore()V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
