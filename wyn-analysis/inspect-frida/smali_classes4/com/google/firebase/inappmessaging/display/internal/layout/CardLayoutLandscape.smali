.class public Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;
.super LH9/a;
.source "SourceFile"


# instance fields
.field public e:Landroid/view/View;

.field public f:Landroid/view/View;

.field public g:Landroid/view/View;

.field public h:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LH9/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    invoke-super/range {p0 .. p5}, LH9/a;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const-string p4, "Layout image"

    .line 14
    .line 15
    invoke-static {p4}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p4, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 19
    .line 20
    invoke-static {p4}, LH9/a;->e(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    iget-object p5, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 25
    .line 26
    invoke-static {p5}, LH9/a;->d(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result p5

    .line 30
    iget-object v0, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {v0, v1, v1, p4, p5}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 34
    .line 35
    .line 36
    const-string p5, "Layout title"

    .line 37
    .line 38
    invoke-static {p5}, LD9/e;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p5, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->f:Landroid/view/View;

    .line 42
    .line 43
    invoke-static {p5}, LH9/a;->d(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result p5

    .line 47
    iget-object v0, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->f:Landroid/view/View;

    .line 48
    .line 49
    invoke-static {v0, p4, v1, p2, p5}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 50
    .line 51
    .line 52
    const-string v0, "Layout scroll"

    .line 53
    .line 54
    invoke-static {v0}, LD9/e;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->g:Landroid/view/View;

    .line 58
    .line 59
    invoke-static {v0}, LH9/a;->d(Landroid/view/View;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v0, p5

    .line 64
    iget-object v1, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->g:Landroid/view/View;

    .line 65
    .line 66
    invoke-static {v1, p4, p5, p2, v0}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 67
    .line 68
    .line 69
    const-string p5, "Layout action bar"

    .line 70
    .line 71
    invoke-static {p5}, LD9/e;->a(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object p5, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->h:Landroid/view/View;

    .line 75
    .line 76
    invoke-static {p5}, LH9/a;->d(Landroid/view/View;)I

    .line 77
    .line 78
    .line 79
    move-result p5

    .line 80
    sub-int p5, p3, p5

    .line 81
    .line 82
    iget-object v0, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->h:Landroid/view/View;

    .line 83
    .line 84
    invoke-static {v0, p4, p5, p2, p3}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2}, LH9/a;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0a015b

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, LH9/a;->c(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 12
    .line 13
    const v0, 0x7f0a01b8

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, LH9/a;->c(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->f:Landroid/view/View;

    .line 21
    .line 22
    const v0, 0x7f0a0088

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, LH9/a;->c(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->g:Landroid/view/View;

    .line 30
    .line 31
    const v0, 0x7f0a0034

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, LH9/a;->c(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->h:Landroid/view/View;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->f:Landroid/view/View;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->g:Landroid/view/View;

    .line 43
    .line 44
    const/4 v3, 0x3

    .line 45
    new-array v3, v3, [Landroid/view/View;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    aput-object v1, v3, v4

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    aput-object v2, v3, v1

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    aput-object v0, v3, v1

    .line 55
    .line 56
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, p1}, LH9/a;->b(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {p0, p2}, LH9/a;->a(I)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    const-wide v1, 0x3fe3333333333333L    # 0.6

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    int-to-double v5, p1

    .line 74
    mul-double/2addr v1, v5

    .line 75
    double-to-int v1, v1

    .line 76
    int-to-float v1, v1

    .line 77
    const/4 v2, 0x4

    .line 78
    int-to-float v3, v2

    .line 79
    div-float/2addr v1, v3

    .line 80
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    mul-int/2addr v1, v2

    .line 85
    const-string v2, "Measuring image"

    .line 86
    .line 87
    invoke-static {v2}, LD9/e;->a(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 91
    .line 92
    const/high16 v3, -0x80000000

    .line 93
    .line 94
    const/high16 v5, 0x40000000    # 2.0f

    .line 95
    .line 96
    invoke-static {v2, p1, p2, v3, v5}, LFe/b;->I(Landroid/view/View;IIII)V

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 100
    .line 101
    invoke-static {v2}, LH9/a;->e(Landroid/view/View;)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-le v2, v1, :cond_0

    .line 106
    .line 107
    const-string v2, "Image exceeded maximum width, remeasuring image"

    .line 108
    .line 109
    invoke-static {v2}, LD9/e;->a(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 113
    .line 114
    invoke-static {v2, v1, p2, v5, v3}, LFe/b;->I(Landroid/view/View;IIII)V

    .line 115
    .line 116
    .line 117
    :cond_0
    iget-object p2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 118
    .line 119
    invoke-static {p2}, LH9/a;->d(Landroid/view/View;)I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    iget-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->e:Landroid/view/View;

    .line 124
    .line 125
    invoke-static {v1}, LH9/a;->e(Landroid/view/View;)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    sub-int/2addr p1, v1

    .line 130
    int-to-float v2, v1

    .line 131
    int-to-float v6, p1

    .line 132
    const-string v7, "Max col widths (l, r)"

    .line 133
    .line 134
    invoke-static {v7, v2, v6}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 135
    .line 136
    .line 137
    const-string v6, "Measuring title"

    .line 138
    .line 139
    invoke-static {v6}, LD9/e;->a(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget-object v6, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->f:Landroid/view/View;

    .line 143
    .line 144
    invoke-static {v6, p1, p2}, LFe/b;->J(Landroid/view/View;II)V

    .line 145
    .line 146
    .line 147
    const-string v6, "Measuring action bar"

    .line 148
    .line 149
    invoke-static {v6}, LD9/e;->a(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v6, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->h:Landroid/view/View;

    .line 153
    .line 154
    invoke-static {v6, p1, p2}, LFe/b;->J(Landroid/view/View;II)V

    .line 155
    .line 156
    .line 157
    const-string v6, "Measuring scroll view"

    .line 158
    .line 159
    invoke-static {v6}, LD9/e;->a(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object v6, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->f:Landroid/view/View;

    .line 163
    .line 164
    invoke-static {v6}, LH9/a;->d(Landroid/view/View;)I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    sub-int v6, p2, v6

    .line 169
    .line 170
    iget-object v7, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->h:Landroid/view/View;

    .line 171
    .line 172
    invoke-static {v7}, LH9/a;->d(Landroid/view/View;)I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    sub-int/2addr v6, v7

    .line 177
    iget-object v7, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/CardLayoutLandscape;->g:Landroid/view/View;

    .line 178
    .line 179
    invoke-static {v7, p1, v6, v3, v5}, LFe/b;->I(Landroid/view/View;IIII)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_1

    .line 191
    .line 192
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Landroid/view/View;

    .line 197
    .line 198
    invoke-static {v0}, LH9/a;->e(Landroid/view/View;)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    goto :goto_0

    .line 207
    :cond_1
    const-string p1, "Measured columns (l, r)"

    .line 208
    .line 209
    int-to-float v0, v4

    .line 210
    invoke-static {p1, v2, v0}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 211
    .line 212
    .line 213
    add-int/2addr v1, v4

    .line 214
    int-to-float p1, v1

    .line 215
    int-to-float v0, p2

    .line 216
    const-string v2, "Measured dims"

    .line 217
    .line 218
    invoke-static {v2, p1, v0}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 222
    .line 223
    .line 224
    return-void
.end method
