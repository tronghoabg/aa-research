.class public final LA/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:D

.field public c:Z


# virtual methods
.method public final a(FFJ)J
    .locals 6

    .line 1
    iget-boolean v0, p0, LA/E;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, LA/E;->a:F

    .line 7
    .line 8
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 9
    .line 10
    .line 11
    cmpg-float v0, v0, v1

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LA/E;->c:Z

    .line 17
    .line 18
    :goto_0
    iget v0, p0, LA/E;->a:F

    .line 19
    .line 20
    sub-float/2addr p1, v0

    .line 21
    long-to-double p3, p3

    .line 22
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    div-double/2addr p3, v0

    .line 28
    float-to-double v0, p2

    .line 29
    iget-wide v2, p0, LA/E;->b:D

    .line 30
    .line 31
    float-to-double p1, p1

    .line 32
    mul-double v4, v2, p1

    .line 33
    .line 34
    add-double/2addr v4, v0

    .line 35
    mul-double v0, v4, p3

    .line 36
    .line 37
    add-double/2addr v0, p1

    .line 38
    neg-double p1, v2

    .line 39
    mul-double/2addr p1, p3

    .line 40
    invoke-static {p1, p2}, Ljava/lang/Math;->exp(D)D

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    mul-double/2addr p1, v0

    .line 45
    iget-wide v2, p0, LA/E;->b:D

    .line 46
    .line 47
    neg-double v2, v2

    .line 48
    mul-double/2addr v2, p3

    .line 49
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    mul-double/2addr v2, v0

    .line 54
    iget-wide v0, p0, LA/E;->b:D

    .line 55
    .line 56
    neg-double v0, v0

    .line 57
    mul-double/2addr v2, v0

    .line 58
    mul-double/2addr v0, p3

    .line 59
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide p3

    .line 63
    mul-double/2addr p3, v4

    .line 64
    add-double/2addr p3, v2

    .line 65
    iget v0, p0, LA/E;->a:F

    .line 66
    .line 67
    float-to-double v0, v0

    .line 68
    add-double/2addr p1, v0

    .line 69
    double-to-float p1, p1

    .line 70
    double-to-float p2, p3

    .line 71
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    int-to-long p3, p1

    .line 76
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    int-to-long p1, p1

    .line 81
    const/16 v0, 0x20

    .line 82
    .line 83
    shl-long/2addr p3, v0

    .line 84
    const-wide v0, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr p1, v0

    .line 90
    or-long/2addr p1, p3

    .line 91
    return-wide p1

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string p2, "Error: Final position of the spring must be set before the animation starts"

    .line 95
    .line 96
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method
