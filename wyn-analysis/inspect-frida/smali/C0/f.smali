.class public final LC0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LineHeightSpan;


# instance fields
.field public final a:F

.field public final b:I

.field public final c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>(FII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LC0/f;->a:F

    .line 5
    .line 6
    iput p2, p0, LC0/f;->b:I

    .line 7
    .line 8
    iput p3, p0, LC0/f;->c:I

    .line 9
    .line 10
    if-ltz p3, :cond_0

    .line 11
    .line 12
    const/16 p1, 0x65

    .line 13
    .line 14
    if-ge p3, p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, -0x1

    .line 18
    if-ne p3, p1, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string p2, "topRatio should be in [0..100] range or -1"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method


# virtual methods
.method public final chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 4

    .line 1
    const-string p4, "text"

    .line 2
    .line 3
    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "fontMetricsInt"

    .line 7
    .line 8
    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 12
    .line 13
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 14
    .line 15
    sub-int p5, p1, p4

    .line 16
    .line 17
    if-gtz p5, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const/4 p5, 0x0

    .line 21
    const/4 v0, 0x1

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    move p2, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p2, p5

    .line 27
    :goto_0
    iget v1, p0, LC0/f;->b:I

    .line 28
    .line 29
    if-ne p3, v1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move v0, p5

    .line 33
    :goto_1
    if-eqz p2, :cond_3

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    :goto_2
    return-void

    .line 38
    :cond_3
    if-eqz p2, :cond_6

    .line 39
    .line 40
    sub-int/2addr p1, p4

    .line 41
    iget p3, p0, LC0/f;->a:F

    .line 42
    .line 43
    float-to-double p3, p3

    .line 44
    invoke-static {p3, p4}, Ljava/lang/Math;->ceil(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide p3

    .line 48
    double-to-float p3, p3

    .line 49
    float-to-int p3, p3

    .line 50
    sub-int p1, p3, p1

    .line 51
    .line 52
    const/4 p4, -0x1

    .line 53
    const/high16 v1, 0x42c80000    # 100.0f

    .line 54
    .line 55
    iget v2, p0, LC0/f;->c:I

    .line 56
    .line 57
    if-ne v2, p4, :cond_4

    .line 58
    .line 59
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 60
    .line 61
    int-to-float p4, p4

    .line 62
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result p4

    .line 66
    iget v2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 67
    .line 68
    iget v3, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 69
    .line 70
    sub-int/2addr v2, v3

    .line 71
    int-to-float v2, v2

    .line 72
    div-float/2addr p4, v2

    .line 73
    mul-float/2addr p4, v1

    .line 74
    float-to-int v2, p4

    .line 75
    :cond_4
    if-gtz p1, :cond_5

    .line 76
    .line 77
    mul-int/2addr p1, v2

    .line 78
    int-to-float p1, p1

    .line 79
    div-float/2addr p1, v1

    .line 80
    float-to-double v1, p1

    .line 81
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    :goto_3
    double-to-float p1, v1

    .line 86
    float-to-int p1, p1

    .line 87
    goto :goto_4

    .line 88
    :cond_5
    rsub-int/lit8 p4, v2, 0x64

    .line 89
    .line 90
    mul-int/2addr p4, p1

    .line 91
    int-to-float p1, p4

    .line 92
    div-float/2addr p1, v1

    .line 93
    float-to-double v1, p1

    .line 94
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    goto :goto_3

    .line 99
    :goto_4
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 100
    .line 101
    add-int/2addr p1, p4

    .line 102
    iput p1, p0, LC0/f;->f:I

    .line 103
    .line 104
    sub-int/2addr p1, p3

    .line 105
    iput p1, p0, LC0/f;->e:I

    .line 106
    .line 107
    iget p1, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 108
    .line 109
    iput p1, p0, LC0/f;->d:I

    .line 110
    .line 111
    iput p4, p0, LC0/f;->g:I

    .line 112
    .line 113
    iput p5, p0, LC0/f;->h:I

    .line 114
    .line 115
    iput p5, p0, LC0/f;->i:I

    .line 116
    .line 117
    :cond_6
    if-eqz p2, :cond_7

    .line 118
    .line 119
    iget p1, p0, LC0/f;->d:I

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_7
    iget p1, p0, LC0/f;->e:I

    .line 123
    .line 124
    :goto_5
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 125
    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    iget p1, p0, LC0/f;->g:I

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_8
    iget p1, p0, LC0/f;->f:I

    .line 132
    .line 133
    :goto_6
    iput p1, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 134
    .line 135
    return-void
.end method
