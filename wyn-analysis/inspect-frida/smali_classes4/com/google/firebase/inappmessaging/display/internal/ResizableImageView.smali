.class public Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;
.super Lq/u;
.source "SourceFile"


# instance fields
.field public final d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lq/u;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    const/high16 p2, 0x43200000    # 160.0f

    .line 16
    .line 17
    mul-float/2addr p1, p2

    .line 18
    float-to-int p1, p1

    .line 19
    iput p1, p0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->d:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final c(II)LD9/n;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getMaxWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getMaxHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-le p1, v0, :cond_0

    .line 10
    .line 11
    const-string v2, "Image: capping width"

    .line 12
    .line 13
    int-to-float v3, v0

    .line 14
    invoke-static {v2, v3}, LD9/e;->b(Ljava/lang/String;F)V

    .line 15
    .line 16
    .line 17
    mul-int/2addr p2, v0

    .line 18
    div-int/2addr p2, p1

    .line 19
    move p1, v0

    .line 20
    :cond_0
    if-le p2, v1, :cond_1

    .line 21
    .line 22
    const-string v0, "Image: capping height"

    .line 23
    .line 24
    int-to-float v2, v1

    .line 25
    invoke-static {v0, v2}, LD9/e;->b(Ljava/lang/String;F)V

    .line 26
    .line 27
    .line 28
    mul-int/2addr p1, v1

    .line 29
    div-int/2addr p1, p2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, p2

    .line 32
    :goto_0
    new-instance p2, LD9/n;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p2, p1, v1, v0}, LD9/n;-><init>(III)V

    .line 36
    .line 37
    .line 38
    return-object p2
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroid/widget/ImageView;->getAdjustViewBounds()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    if-eqz p2, :cond_3

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float v0, p2

    .line 25
    int-to-float v1, p1

    .line 26
    const-string v2, "Image: intrinsic width, height"

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->d:I

    .line 32
    .line 33
    mul-int/2addr p2, v0

    .line 34
    div-int/lit16 p2, p2, 0xa0

    .line 35
    .line 36
    int-to-double v0, p2

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    double-to-int p2, v0

    .line 42
    iget v0, p0, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->d:I

    .line 43
    .line 44
    mul-int/2addr p1, v0

    .line 45
    div-int/lit16 p1, p1, 0xa0

    .line 46
    .line 47
    int-to-double v0, p1

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    double-to-int p1, v0

    .line 53
    invoke-virtual {p0, p2, p1}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->c(II)LD9/n;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget p2, p1, LD9/n;->b:I

    .line 58
    .line 59
    int-to-float v0, p2

    .line 60
    iget p1, p1, LD9/n;->c:I

    .line 61
    .line 62
    int-to-float v1, p1

    .line 63
    const-string v2, "Image: new target dimensions"

    .line 64
    .line 65
    invoke-static {v2, v0, v1}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    int-to-float v2, p1

    .line 104
    int-to-float v3, p2

    .line 105
    const-string v4, "Image: min width, height"

    .line 106
    .line 107
    invoke-static {v4, v2, v3}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 108
    .line 109
    .line 110
    int-to-float v4, v0

    .line 111
    int-to-float v5, v1

    .line 112
    const-string v6, "Image: actual width, height"

    .line 113
    .line 114
    invoke-static {v6, v4, v5}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x3f800000    # 1.0f

    .line 118
    .line 119
    if-ge v0, p1, :cond_0

    .line 120
    .line 121
    div-float/2addr v2, v4

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    move v2, v6

    .line 124
    :goto_0
    if-ge v1, p2, :cond_1

    .line 125
    .line 126
    div-float v6, v3, v5

    .line 127
    .line 128
    :cond_1
    cmpl-float p1, v2, v6

    .line 129
    .line 130
    if-lez p1, :cond_2

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    move v2, v6

    .line 134
    :goto_1
    float-to-double p1, v2

    .line 135
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 136
    .line 137
    cmpl-double p1, p1, v6

    .line 138
    .line 139
    if-lez p1, :cond_3

    .line 140
    .line 141
    mul-float/2addr v4, v2

    .line 142
    float-to-double p1, v4

    .line 143
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    .line 144
    .line 145
    .line 146
    move-result-wide p1

    .line 147
    double-to-int p1, p1

    .line 148
    mul-float/2addr v5, v2

    .line 149
    float-to-double v2, v5

    .line 150
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    double-to-int p2, v2

    .line 155
    const-string v2, "Measured dimension ("

    .line 156
    .line 157
    const-string v3, "x"

    .line 158
    .line 159
    const-string v4, ") too small.  Resizing to "

    .line 160
    .line 161
    invoke-static {v2, v0, v3, v1, v4}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, LD9/e;->a(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/inappmessaging/display/internal/ResizableImageView;->c(II)LD9/n;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iget p2, p1, LD9/n;->b:I

    .line 186
    .line 187
    iget p1, p1, LD9/n;->c:I

    .line 188
    .line 189
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 190
    .line 191
    .line 192
    :cond_3
    return-void
.end method
