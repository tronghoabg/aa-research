.class public final Lg0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/d;


# instance fields
.field public final a:Lg0/a;

.field public final b:Lba/a;

.field public c:Lc7/l;

.field public d:Lc7/l;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg0/a;

    .line 5
    .line 6
    sget-object v1, Lg0/c;->a:LL0/c;

    .line 7
    .line 8
    sget-object v2, LL0/i;->a:LL0/i;

    .line 9
    .line 10
    new-instance v3, Lg0/e;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-wide v4, Ld0/f;->b:J

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lg0/a;->a:LL0/b;

    .line 21
    .line 22
    iput-object v2, v0, Lg0/a;->b:LL0/i;

    .line 23
    .line 24
    iput-object v3, v0, Lg0/a;->c:Le0/o;

    .line 25
    .line 26
    iput-wide v4, v0, Lg0/a;->d:J

    .line 27
    .line 28
    iput-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 29
    .line 30
    new-instance v0, Lba/a;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lba/a;-><init>(Lg0/b;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lg0/b;->b:Lba/a;

    .line 36
    .line 37
    return-void
.end method

.method public static a(Lg0/b;JLg0/c;FLe0/r;I)Lc7/l;
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lg0/b;->g(Lg0/c;)Lc7/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpg-float p3, p4, p3

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p1, p2}, Le0/q;->c(J)F

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    mul-float/2addr p3, p4

    .line 17
    invoke-static {p1, p2, p3}, Le0/q;->a(JF)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    :goto_0
    iget-object p3, p0, Lc7/l;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p3, Landroid/graphics/Paint;

    .line 24
    .line 25
    const-string p4, "<this>"

    .line 26
    .line 27
    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3}, Landroid/graphics/Paint;->getColor()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-static {p3}, Le0/z;->b(I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-static {v0, v1, p1, p2}, Le0/q;->b(JJ)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-nez p3, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lc7/l;->e(J)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object p1, p0, Lc7/l;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroid/graphics/Shader;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lc7/l;->c:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object p2, p0, Lc7/l;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, Landroid/graphics/Paint;

    .line 59
    .line 60
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p1, p0, Lc7/l;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Le0/r;

    .line 69
    .line 70
    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0, p5}, Lc7/l;->f(Le0/r;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget p1, p0, Lc7/l;->a:I

    .line 80
    .line 81
    if-ne p1, p6, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-virtual {p0, p6}, Lc7/l;->d(I)V

    .line 85
    .line 86
    .line 87
    :goto_1
    iget-object p1, p0, Lc7/l;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Landroid/graphics/Paint;

    .line 90
    .line 91
    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const/4 p2, 0x1

    .line 99
    if-ne p1, p2, :cond_5

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_5
    iget-object p1, p0, Lc7/l;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Landroid/graphics/Paint;

    .line 105
    .line 106
    const-string p3, "$this$setNativeFilterQuality"

    .line 107
    .line 108
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 112
    .line 113
    .line 114
    return-object p0
.end method


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/a;->a:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0}, LL0/b;->b()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/b;->b:Lba/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lba/a;->y()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d(Le0/d;JLg0/c;)V
    .locals 7

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 7
    .line 8
    iget-object v0, v0, Lg0/a;->c:Le0/o;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/high16 v4, 0x3f800000    # 1.0f

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    move-object v3, p4

    .line 17
    invoke-virtual/range {v1 .. v6}, Lg0/b;->e(Le0/m;Lg0/c;FLe0/r;I)Lc7/l;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-interface {v0, p1, p2, p3, p4}, Le0/o;->h(Le0/d;JLc7/l;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final e(Le0/m;Lg0/c;FLe0/r;I)Lc7/l;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lg0/b;->g(Lg0/c;)Lc7/l;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "<this>"

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lg0/b;->b:Lba/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lba/a;->y()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {p1, p3, v1, v2, p2}, Le0/m;->a(FJLc7/l;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p2, Lc7/l;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Paint;->getAlpha()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    int-to-float p1, p1

    .line 31
    const/high16 v1, 0x437f0000    # 255.0f

    .line 32
    .line 33
    div-float/2addr p1, v1

    .line 34
    cmpg-float p1, p1, p3

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p2, p3}, Lc7/l;->c(F)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p1, p2, Lc7/l;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Le0/r;

    .line 45
    .line 46
    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p2, p4}, Lc7/l;->f(Le0/r;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget p1, p2, Lc7/l;->a:I

    .line 56
    .line 57
    const/4 p3, 0x3

    .line 58
    if-ne p1, p3, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-virtual {p2, p3}, Lc7/l;->d(I)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object p1, p2, Lc7/l;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-ne p1, p5, :cond_4

    .line 76
    .line 77
    return-object p2

    .line 78
    :cond_4
    iget-object p1, p2, Lc7/l;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Landroid/graphics/Paint;

    .line 81
    .line 82
    const-string p3, "$this$setNativeFilterQuality"

    .line 83
    .line 84
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p3, 0x1

    .line 88
    if-nez p5, :cond_5

    .line 89
    .line 90
    move p4, p3

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const/4 p4, 0x0

    .line 93
    :goto_2
    xor-int/2addr p3, p4

    .line 94
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 95
    .line 96
    .line 97
    return-object p2
.end method

.method public final f(Le0/d;JJJJFLe0/r;I)V
    .locals 14

    .line 1
    sget-object v2, Lg0/f;->b:Lg0/f;

    .line 2
    .line 3
    const-string v0, "image"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 9
    .line 10
    iget-object v6, v0, Lg0/a;->c:Le0/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move-object v0, p0

    .line 14
    move/from16 v3, p10

    .line 15
    .line 16
    move-object/from16 v4, p11

    .line 17
    .line 18
    move/from16 v5, p12

    .line 19
    .line 20
    invoke-virtual/range {v0 .. v5}, Lg0/b;->e(Le0/m;Lg0/c;FLe0/r;I)Lc7/l;

    .line 21
    .line 22
    .line 23
    move-result-object v13

    .line 24
    move-object v4, p1

    .line 25
    move-wide/from16 v7, p4

    .line 26
    .line 27
    move-wide/from16 v9, p6

    .line 28
    .line 29
    move-wide/from16 v11, p8

    .line 30
    .line 31
    move-object v3, v6

    .line 32
    move-wide/from16 v5, p2

    .line 33
    .line 34
    invoke-interface/range {v3 .. v13}, Le0/o;->b(Le0/d;JJJJLc7/l;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final g(Lg0/c;)Lc7/l;
    .locals 9

    .line 1
    sget-object v0, Lg0/f;->b:Lg0/f;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lg0/b;->c:Lc7/l;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v1}, Lc7/l;->g(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lg0/b;->c:Lc7/l;

    .line 22
    .line 23
    :cond_0
    return-object p1

    .line 24
    :cond_1
    instance-of v0, p1, Lg0/g;

    .line 25
    .line 26
    if-eqz v0, :cond_15

    .line 27
    .line 28
    iget-object v0, p0, Lg0/b;->d:Lc7/l;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, v2}, Lc7/l;->g(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lg0/b;->d:Lc7/l;

    .line 41
    .line 42
    :cond_2
    iget-object v3, v0, Lc7/l;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Landroid/graphics/Paint;

    .line 45
    .line 46
    const-string v4, "<this>"

    .line 47
    .line 48
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    check-cast p1, Lg0/g;

    .line 56
    .line 57
    iget v6, p1, Lg0/g;->b:F

    .line 58
    .line 59
    cmpg-float v5, v5, v6

    .line 60
    .line 61
    if-nez v5, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v5, v0, Lc7/l;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v5, Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeCap()Landroid/graphics/Paint$Cap;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const/4 v5, -0x1

    .line 79
    if-nez v4, :cond_4

    .line 80
    .line 81
    move v4, v5

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    sget-object v6, Le0/e;->a:[I

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    aget v4, v6, v4

    .line 90
    .line 91
    :goto_1
    const/4 v6, 0x3

    .line 92
    const/4 v7, 0x2

    .line 93
    if-eq v4, v2, :cond_7

    .line 94
    .line 95
    if-eq v4, v7, :cond_6

    .line 96
    .line 97
    if-eq v4, v6, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    move v4, v7

    .line 101
    goto :goto_3

    .line 102
    :cond_6
    move v4, v2

    .line 103
    goto :goto_3

    .line 104
    :cond_7
    :goto_2
    move v4, v1

    .line 105
    :goto_3
    iget v8, p1, Lg0/g;->d:I

    .line 106
    .line 107
    if-ne v4, v8, :cond_8

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_8
    if-ne v8, v7, :cond_9

    .line 111
    .line 112
    sget-object v4, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_9
    if-ne v8, v2, :cond_a

    .line 116
    .line 117
    sget-object v4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_a
    if-nez v8, :cond_b

    .line 121
    .line 122
    sget-object v4, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_b
    sget-object v4, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 126
    .line 127
    :goto_4
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 128
    .line 129
    .line 130
    :goto_5
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    iget v8, p1, Lg0/g;->c:F

    .line 135
    .line 136
    cmpg-float v4, v4, v8

    .line 137
    .line 138
    if-nez v4, :cond_c

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_c
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 142
    .line 143
    .line 144
    :goto_6
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    if-nez v4, :cond_d

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_d
    sget-object v5, Le0/e;->b:[I

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    aget v5, v5, v4

    .line 158
    .line 159
    :goto_7
    if-eq v5, v2, :cond_10

    .line 160
    .line 161
    if-eq v5, v7, :cond_f

    .line 162
    .line 163
    if-eq v5, v6, :cond_e

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_e
    move v1, v2

    .line 167
    goto :goto_8

    .line 168
    :cond_f
    move v1, v7

    .line 169
    :cond_10
    :goto_8
    iget p1, p1, Lg0/g;->e:I

    .line 170
    .line 171
    if-ne v1, p1, :cond_11

    .line 172
    .line 173
    return-object v0

    .line 174
    :cond_11
    if-nez p1, :cond_12

    .line 175
    .line 176
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_12
    if-ne p1, v7, :cond_13

    .line 180
    .line 181
    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_13
    if-ne p1, v2, :cond_14

    .line 185
    .line 186
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_14
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 190
    .line 191
    :goto_9
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 192
    .line 193
    .line 194
    return-object v0

    .line 195
    :cond_15
    new-instance p1, LE5/Q;

    .line 196
    .line 197
    const/16 v0, 0x9

    .line 198
    .line 199
    const/4 v1, 0x0

    .line 200
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 201
    .line 202
    .line 203
    throw p1
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/a;->a:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0}, LL0/b;->getFontScale()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final getLayoutDirection()LL0/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/a;->b:LL0/i;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i(Le0/f;Le0/m;FLg0/c;)V
    .locals 7

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "brush"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "style"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 17
    .line 18
    iget-object v0, v0, Lg0/a;->c:Le0/o;

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p2

    .line 24
    move v4, p3

    .line 25
    move-object v3, p4

    .line 26
    invoke-virtual/range {v1 .. v6}, Lg0/b;->e(Le0/m;Lg0/c;FLe0/r;I)Lc7/l;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-interface {v0, p1, p2}, Le0/o;->c(Le0/f;Lc7/l;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final synthetic j(F)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, LA7/p0;->a(LL0/b;F)I

    move-result p1

    return p1
.end method

.method public final k(JJJFLg0/c;Le0/r;I)V
    .locals 12

    .line 1
    iget-object v1, p0, Lg0/b;->a:Lg0/a;

    .line 2
    .line 3
    iget-object v7, v1, Lg0/a;->c:Le0/o;

    .line 4
    .line 5
    invoke-static/range {p3 .. p4}, Ld0/c;->b(J)F

    .line 6
    .line 7
    .line 8
    move-result v8

    .line 9
    invoke-static/range {p3 .. p4}, Ld0/c;->c(J)F

    .line 10
    .line 11
    .line 12
    move-result v9

    .line 13
    invoke-static/range {p3 .. p4}, Ld0/c;->b(J)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static/range {p5 .. p6}, Ld0/f;->d(J)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-float v10, v2, v1

    .line 22
    .line 23
    invoke-static/range {p3 .. p4}, Ld0/c;->c(J)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static/range {p5 .. p6}, Ld0/f;->b(J)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-float v11, v2, v1

    .line 32
    .line 33
    move-object v0, p0

    .line 34
    move-wide v1, p1

    .line 35
    move/from16 v4, p7

    .line 36
    .line 37
    move-object/from16 v3, p8

    .line 38
    .line 39
    move-object/from16 v5, p9

    .line 40
    .line 41
    move/from16 v6, p10

    .line 42
    .line 43
    invoke-static/range {v0 .. v6}, Lg0/b;->a(Lg0/b;JLg0/c;FLe0/r;I)Lc7/l;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object/from16 p6, v1

    .line 48
    .line 49
    move-object p1, v7

    .line 50
    move p2, v8

    .line 51
    move p3, v9

    .line 52
    move/from16 p4, v10

    .line 53
    .line 54
    move/from16 p5, v11

    .line 55
    .line 56
    invoke-interface/range {p1 .. p6}, Le0/o;->a(FFFFLc7/l;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final synthetic l(J)F
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, LA7/p0;->b(JLL0/b;)F

    move-result p1

    return p1
.end method

.method public final t(F)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/b;->b()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-float/2addr v0, p1

    .line 6
    return v0
.end method

.method public final u()Lba/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/b;->b:Lba/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w(JFFJJLg0/g;)V
    .locals 12

    .line 1
    iget-object v1, p0, Lg0/b;->a:Lg0/a;

    .line 2
    .line 3
    iget-object v7, v1, Lg0/a;->c:Le0/o;

    .line 4
    .line 5
    invoke-static/range {p5 .. p6}, Ld0/c;->b(J)F

    .line 6
    .line 7
    .line 8
    move-result v8

    .line 9
    invoke-static/range {p5 .. p6}, Ld0/c;->c(J)F

    .line 10
    .line 11
    .line 12
    move-result v9

    .line 13
    invoke-static/range {p5 .. p6}, Ld0/c;->b(J)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static/range {p7 .. p8}, Ld0/f;->d(J)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-float v10, v2, v1

    .line 22
    .line 23
    invoke-static/range {p5 .. p6}, Ld0/c;->c(J)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static/range {p7 .. p8}, Ld0/f;->b(J)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-float v11, v2, v1

    .line 32
    .line 33
    const/high16 v4, 0x3f800000    # 1.0f

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x3

    .line 37
    move-object v0, p0

    .line 38
    move-wide v1, p1

    .line 39
    move-object/from16 v3, p9

    .line 40
    .line 41
    invoke-static/range {v0 .. v6}, Lg0/b;->a(Lg0/b;JLg0/c;FLe0/r;I)Lc7/l;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    move-object v2, v7

    .line 46
    move v3, v8

    .line 47
    move v4, v9

    .line 48
    move v5, v10

    .line 49
    move v6, v11

    .line 50
    move v7, p3

    .line 51
    move/from16 v8, p4

    .line 52
    .line 53
    move-object v9, v1

    .line 54
    invoke-interface/range {v2 .. v9}, Le0/o;->r(FFFFFFLc7/l;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final x()J
    .locals 4

    .line 1
    iget-object v0, p0, Lg0/b;->b:Lba/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lba/a;->y()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ld0/f;->d(J)F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/high16 v3, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr v2, v3

    .line 14
    invoke-static {v0, v1}, Ld0/f;->b(J)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    div-float/2addr v0, v3

    .line 19
    invoke-static {v2, v0}, LU8/v0;->f(FF)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0
.end method

.method public final synthetic y(J)J
    .locals 0

    .line 1
    invoke-static {p1, p2, p0}, LA7/p0;->c(JLL0/b;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final z(JJJJLg0/c;)V
    .locals 6

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg0/b;->a:Lg0/a;

    .line 7
    .line 8
    iget-object v0, v0, Lg0/a;->c:Le0/o;

    .line 9
    .line 10
    move-wide v1, p3

    .line 11
    move-wide v3, p5

    .line 12
    move-wide p4, p1

    .line 13
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-static {v3, v4}, Ld0/f;->d(J)F

    .line 26
    .line 27
    .line 28
    move-result p6

    .line 29
    add-float v5, p6, p3

    .line 30
    .line 31
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    invoke-static {v3, v4}, Ld0/f;->b(J)F

    .line 36
    .line 37
    .line 38
    move-result p6

    .line 39
    add-float v1, p6, p3

    .line 40
    .line 41
    invoke-static {p7, p8}, Ld0/a;->b(J)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {p7, p8}, Ld0/a;->c(J)F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/high16 p7, 0x3f800000    # 1.0f

    .line 50
    .line 51
    const/4 p8, 0x0

    .line 52
    move-object p6, p9

    .line 53
    const/4 p9, 0x3

    .line 54
    move-object p3, p0

    .line 55
    invoke-static/range {p3 .. p9}, Lg0/b;->a(Lg0/b;JLg0/c;FLe0/r;I)Lc7/l;

    .line 56
    .line 57
    .line 58
    move-result-object p8

    .line 59
    move p3, p1

    .line 60
    move-object p1, v0

    .line 61
    move p5, v1

    .line 62
    move p6, v2

    .line 63
    move p7, v3

    .line 64
    move p4, v5

    .line 65
    invoke-interface/range {p1 .. p8}, Le0/o;->n(FFFFFFLc7/l;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
