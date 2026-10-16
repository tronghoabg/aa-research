.class public final Lz0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz0/m;

.field public final b:Lz0/d;

.field public final c:J

.field public final d:F

.field public final e:F

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lz0/m;Lz0/d;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/n;->a:Lz0/m;

    .line 5
    .line 6
    iput-object p2, p0, Lz0/n;->b:Lz0/d;

    .line 7
    .line 8
    iput-wide p3, p0, Lz0/n;->c:J

    .line 9
    .line 10
    iget-object p1, p2, Lz0/d;->h:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const/4 p4, 0x0

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    move p3, p4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p3, 0x0

    .line 22
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lz0/f;

    .line 27
    .line 28
    iget-object v0, v0, Lz0/f;->a:LH0/a;

    .line 29
    .line 30
    iget-object v0, v0, LH0/a;->d:LA0/q;

    .line 31
    .line 32
    invoke-virtual {v0, p3}, LA0/q;->a(I)F

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    :goto_0
    iput p3, p0, Lz0/n;->d:F

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-static {p1}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lz0/f;

    .line 50
    .line 51
    iget-object p3, p1, Lz0/f;->a:LH0/a;

    .line 52
    .line 53
    iget-object p4, p3, LH0/a;->d:LA0/q;

    .line 54
    .line 55
    iget v0, p4, LA0/q;->c:I

    .line 56
    .line 57
    iget p3, p3, LH0/a;->b:I

    .line 58
    .line 59
    if-ge p3, v0, :cond_2

    .line 60
    .line 61
    add-int/lit8 p3, p3, -0x1

    .line 62
    .line 63
    invoke-virtual {p4, p3}, LA0/q;->a(I)F

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    invoke-virtual {p4, v0}, LA0/q;->a(I)F

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    :goto_1
    iget p1, p1, Lz0/f;->f:F

    .line 75
    .line 76
    add-float p4, p3, p1

    .line 77
    .line 78
    :goto_2
    iput p4, p0, Lz0/n;->e:F

    .line 79
    .line 80
    iget-object p1, p2, Lz0/d;->g:Ljava/util/ArrayList;

    .line 81
    .line 82
    iput-object p1, p0, Lz0/n;->f:Ljava/util/ArrayList;

    .line 83
    .line 84
    return-void
.end method

.method public static a(Lz0/n;I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lz0/n;->b:Lz0/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz0/d;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lz0/d;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {p0, p1}, LS3/f;->r(Ljava/util/ArrayList;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lz0/f;

    .line 17
    .line 18
    iget-object v0, p0, Lz0/f;->a:LH0/a;

    .line 19
    .line 20
    iget v1, p0, Lz0/f;->d:I

    .line 21
    .line 22
    sub-int/2addr p1, v1

    .line 23
    iget-object v0, v0, LH0/a;->d:LA0/q;

    .line 24
    .line 25
    iget-object v0, v0, LA0/q;->b:Landroid/text/Layout;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    :goto_0
    iget p0, p0, Lz0/f;->b:I

    .line 47
    .line 48
    add-int/2addr p1, p0

    .line 49
    return p1
.end method


# virtual methods
.method public final b(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lz0/n;->b:Lz0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz0/d;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lz0/d;->a:LVa/Y7;

    .line 7
    .line 8
    iget-object v1, v1, LVa/Y7;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lz0/b;

    .line 11
    .line 12
    iget-object v1, v1, Lz0/b;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v0, v0, Lz0/d;->h:Ljava/util/ArrayList;

    .line 19
    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lr7/e;->z(Ljava/util/List;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v0, p1}, LS3/f;->q(Ljava/util/ArrayList;I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lz0/f;

    .line 36
    .line 37
    iget-object v1, v0, Lz0/f;->a:LH0/a;

    .line 38
    .line 39
    iget v2, v0, Lz0/f;->b:I

    .line 40
    .line 41
    iget v3, v0, Lz0/f;->c:I

    .line 42
    .line 43
    invoke-static {p1, v2, v3}, Landroid/support/v4/media/session/b;->S(III)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sub-int/2addr p1, v2

    .line 48
    iget-object v1, v1, LH0/a;->d:LA0/q;

    .line 49
    .line 50
    iget-object v1, v1, LA0/q;->b:Landroid/text/Layout;

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget v0, v0, Lz0/f;->d:I

    .line 57
    .line 58
    add-int/2addr p1, v0

    .line 59
    return p1
.end method

.method public final c(F)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    iget-object v1, p0, Lz0/n;->b:Lz0/d;

    .line 5
    .line 6
    iget-object v2, v1, Lz0/d;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    move v0, v3

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget v0, v1, Lz0/d;->e:F

    .line 14
    .line 15
    cmpl-float v0, p1, v0

    .line 16
    .line 17
    if-ltz v0, :cond_1

    .line 18
    .line 19
    invoke-static {v2}, Lr7/e;->z(Ljava/util/List;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    const-string v0, "paragraphInfoList"

    .line 25
    .line 26
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x1

    .line 34
    sub-int/2addr v0, v1

    .line 35
    const/4 v4, 0x0

    .line 36
    move v5, v4

    .line 37
    :goto_0
    if-gt v5, v0, :cond_6

    .line 38
    .line 39
    add-int v6, v5, v0

    .line 40
    .line 41
    ushr-int/2addr v6, v1

    .line 42
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, Lz0/f;

    .line 47
    .line 48
    iget v8, v7, Lz0/f;->f:F

    .line 49
    .line 50
    cmpl-float v8, v8, p1

    .line 51
    .line 52
    if-lez v8, :cond_2

    .line 53
    .line 54
    move v7, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget v7, v7, Lz0/f;->g:F

    .line 57
    .line 58
    cmpg-float v7, v7, p1

    .line 59
    .line 60
    if-gtz v7, :cond_3

    .line 61
    .line 62
    const/4 v7, -0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move v7, v4

    .line 65
    :goto_1
    if-gez v7, :cond_4

    .line 66
    .line 67
    add-int/lit8 v5, v6, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-lez v7, :cond_5

    .line 71
    .line 72
    add-int/lit8 v0, v6, -0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    move v0, v6

    .line 76
    goto :goto_2

    .line 77
    :cond_6
    add-int/2addr v5, v1

    .line 78
    neg-int v0, v5

    .line 79
    :goto_2
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lz0/f;

    .line 84
    .line 85
    iget v1, v0, Lz0/f;->c:I

    .line 86
    .line 87
    iget v2, v0, Lz0/f;->b:I

    .line 88
    .line 89
    sub-int/2addr v1, v2

    .line 90
    if-nez v1, :cond_7

    .line 91
    .line 92
    add-int/lit8 v2, v2, -0x1

    .line 93
    .line 94
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    return p1

    .line 99
    :cond_7
    iget v1, v0, Lz0/f;->f:F

    .line 100
    .line 101
    sub-float/2addr p1, v1

    .line 102
    iget-object v1, v0, Lz0/f;->a:LH0/a;

    .line 103
    .line 104
    float-to-int p1, p1

    .line 105
    iget-object v1, v1, LH0/a;->d:LA0/q;

    .line 106
    .line 107
    iget v2, v1, LA0/q;->d:I

    .line 108
    .line 109
    add-int/2addr v2, p1

    .line 110
    iget-object p1, v1, LA0/q;->b:Landroid/text/Layout;

    .line 111
    .line 112
    invoke-virtual {p1, v2}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    iget v0, v0, Lz0/f;->d:I

    .line 117
    .line 118
    add-int/2addr p1, v0

    .line 119
    return p1
.end method

.method public final d(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lz0/n;->b:Lz0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz0/d;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lz0/d;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {v0, p1}, LS3/f;->r(Ljava/util/ArrayList;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lz0/f;

    .line 17
    .line 18
    iget-object v1, v0, Lz0/f;->a:LH0/a;

    .line 19
    .line 20
    iget v2, v0, Lz0/f;->d:I

    .line 21
    .line 22
    sub-int/2addr p1, v2

    .line 23
    iget-object v1, v1, LH0/a;->d:LA0/q;

    .line 24
    .line 25
    iget-object v1, v1, LA0/q;->b:Landroid/text/Layout;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v0, v0, Lz0/f;->b:I

    .line 32
    .line 33
    add-int/2addr p1, v0

    .line 34
    return p1
.end method

.method public final e(I)F
    .locals 3

    .line 1
    iget-object v0, p0, Lz0/n;->b:Lz0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz0/d;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lz0/d;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {v0, p1}, LS3/f;->r(Ljava/util/ArrayList;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lz0/f;

    .line 17
    .line 18
    iget-object v1, v0, Lz0/f;->a:LH0/a;

    .line 19
    .line 20
    iget v2, v0, Lz0/f;->d:I

    .line 21
    .line 22
    sub-int/2addr p1, v2

    .line 23
    iget-object v1, v1, LH0/a;->d:LA0/q;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, LA0/q;->c(I)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget v0, v0, Lz0/f;->f:F

    .line 30
    .line 31
    add-float/2addr p1, v0

    .line 32
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lz0/n;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lz0/n;

    .line 10
    .line 11
    iget-object v0, p1, Lz0/n;->a:Lz0/m;

    .line 12
    .line 13
    iget-object v1, p0, Lz0/n;->a:Lz0/m;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lz0/m;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lz0/n;->b:Lz0/d;

    .line 23
    .line 24
    iget-object v1, p1, Lz0/n;->b:Lz0/d;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-wide v0, p0, Lz0/n;->c:J

    .line 34
    .line 35
    iget-wide v2, p1, Lz0/n;->c:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, LL0/h;->a(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_4
    iget v0, p0, Lz0/n;->d:F

    .line 45
    .line 46
    iget v1, p1, Lz0/n;->d:F

    .line 47
    .line 48
    cmpg-float v0, v0, v1

    .line 49
    .line 50
    if-nez v0, :cond_6

    .line 51
    .line 52
    iget v0, p0, Lz0/n;->e:F

    .line 53
    .line 54
    iget v1, p1, Lz0/n;->e:F

    .line 55
    .line 56
    cmpg-float v0, v0, v1

    .line 57
    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    iget-object v0, p0, Lz0/n;->f:Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object p1, p1, Lz0/n;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    :goto_0
    const/4 p1, 0x1

    .line 72
    return p1

    .line 73
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 74
    return p1
.end method

.method public final f(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lz0/n;->b:Lz0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz0/d;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lz0/d;->a:LVa/Y7;

    .line 7
    .line 8
    iget-object v1, v1, LVa/Y7;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lz0/b;

    .line 11
    .line 12
    iget-object v1, v1, Lz0/b;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v0, v0, Lz0/d;->h:Ljava/util/ArrayList;

    .line 19
    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lr7/e;->z(Ljava/util/List;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v0, p1}, LS3/f;->q(Ljava/util/ArrayList;I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lz0/f;

    .line 36
    .line 37
    iget-object v1, v0, Lz0/f;->a:LH0/a;

    .line 38
    .line 39
    iget v2, v0, Lz0/f;->b:I

    .line 40
    .line 41
    iget v0, v0, Lz0/f;->c:I

    .line 42
    .line 43
    invoke-static {p1, v2, v0}, Landroid/support/v4/media/session/b;->S(III)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sub-int/2addr p1, v2

    .line 48
    iget-object v0, v1, LH0/a;->d:LA0/q;

    .line 49
    .line 50
    iget-object v1, v0, LA0/q;->b:Landroid/text/Layout;

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget-object v0, v0, LA0/q;->b:Landroid/text/Layout;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const/4 v0, 0x1

    .line 63
    if-ne p1, v0, :cond_1

    .line 64
    .line 65
    return v0

    .line 66
    :cond_1
    const/4 p1, 0x2

    .line 67
    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, Lz0/n;->a:Lz0/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/m;->hashCode()I

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
    iget-object v2, p0, Lz0/n;->b:Lz0/d;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    iget-wide v3, p0, Lz0/n;->c:J

    .line 21
    .line 22
    ushr-long v5, v3, v0

    .line 23
    .line 24
    xor-long/2addr v3, v5

    .line 25
    long-to-int v0, v3

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget v2, p0, Lz0/n;->d:F

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lz0/n;->e:F

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v1, p0, Lz0/n;->f:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextLayoutResult(layoutInput="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lz0/n;->a:Lz0/m;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", multiParagraph="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lz0/n;->b:Lz0/d;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", size="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lz0/n;->c:J

    .line 29
    .line 30
    invoke-static {v1, v2}, LL0/h;->b(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", firstBaseline="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lz0/n;->d:F

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", lastBaseline="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget v1, p0, Lz0/n;->e:F

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", placeholderRects="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lz0/n;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 v1, 0x29

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
.end method
