.class public final Le0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/x;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/RectF;

.field public final c:[F


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le0/f;->a:Landroid/graphics/Path;

    .line 5
    .line 6
    new-instance p1, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Le0/f;->b:Landroid/graphics/RectF;

    .line 12
    .line 13
    const/16 p1, 0x8

    .line 14
    .line 15
    new-array p1, p1, [F

    .line 16
    .line 17
    iput-object p1, p0, Le0/f;->c:[F

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ld0/e;)V
    .locals 6

    .line 1
    iget-object v0, p0, Le0/f;->b:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, p1, Ld0/e;->c:F

    .line 4
    .line 5
    iget v2, p1, Ld0/e;->d:F

    .line 6
    .line 7
    iget v3, p1, Ld0/e;->a:F

    .line 8
    .line 9
    iget v4, p1, Ld0/e;->b:F

    .line 10
    .line 11
    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 12
    .line 13
    .line 14
    iget-wide v1, p1, Ld0/e;->e:J

    .line 15
    .line 16
    invoke-static {v1, v2}, Ld0/a;->b(J)F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    iget-object v5, p0, Le0/f;->c:[F

    .line 22
    .line 23
    aput v3, v5, v4

    .line 24
    .line 25
    invoke-static {v1, v2}, Ld0/a;->c(J)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x1

    .line 30
    aput v1, v5, v2

    .line 31
    .line 32
    iget-wide v1, p1, Ld0/e;->f:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Ld0/a;->b(J)F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x2

    .line 39
    aput v3, v5, v4

    .line 40
    .line 41
    invoke-static {v1, v2}, Ld0/a;->c(J)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v2, 0x3

    .line 46
    aput v1, v5, v2

    .line 47
    .line 48
    iget-wide v1, p1, Ld0/e;->g:J

    .line 49
    .line 50
    invoke-static {v1, v2}, Ld0/a;->b(J)F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x4

    .line 55
    aput v3, v5, v4

    .line 56
    .line 57
    invoke-static {v1, v2}, Ld0/a;->c(J)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const/4 v2, 0x5

    .line 62
    aput v1, v5, v2

    .line 63
    .line 64
    iget-wide v1, p1, Ld0/e;->h:J

    .line 65
    .line 66
    invoke-static {v1, v2}, Ld0/a;->b(J)F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/4 v3, 0x6

    .line 71
    aput p1, v5, v3

    .line 72
    .line 73
    invoke-static {v1, v2}, Ld0/a;->c(J)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/4 v1, 0x7

    .line 78
    aput p1, v5, v1

    .line 79
    .line 80
    sget-object p1, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 81
    .line 82
    iget-object v1, p0, Le0/f;->a:Landroid/graphics/Path;

    .line 83
    .line 84
    invoke-virtual {v1, v0, v5, p1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final b(Le0/x;Le0/x;I)Z
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p3, v0, :cond_1

    .line 8
    .line 9
    sget-object p3, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v0, 0x4

    .line 13
    if-ne p3, v0, :cond_2

    .line 14
    .line 15
    sget-object p3, Landroid/graphics/Path$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Path$Op;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const/4 v0, 0x2

    .line 19
    if-ne p3, v0, :cond_3

    .line 20
    .line 21
    sget-object p3, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_3
    sget-object p3, Landroid/graphics/Path$Op;->XOR:Landroid/graphics/Path$Op;

    .line 25
    .line 26
    :goto_0
    instance-of v0, p1, Le0/f;

    .line 27
    .line 28
    const-string v1, "Unable to obtain android.graphics.Path"

    .line 29
    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    check-cast p1, Le0/f;

    .line 33
    .line 34
    instance-of v0, p2, Le0/f;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    check-cast p2, Le0/f;

    .line 39
    .line 40
    iget-object v0, p0, Le0/f;->a:Landroid/graphics/Path;

    .line 41
    .line 42
    iget-object p1, p1, Le0/f;->a:Landroid/graphics/Path;

    .line 43
    .line 44
    iget-object p2, p2, Le0/f;->a:Landroid/graphics/Path;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 52
    .line 53
    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 58
    .line 59
    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/f;->a:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
