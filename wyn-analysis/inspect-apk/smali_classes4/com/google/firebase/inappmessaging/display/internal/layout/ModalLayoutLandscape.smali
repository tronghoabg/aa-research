.class public Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;
.super LH9/a;
.source "SourceFile"


# instance fields
.field public e:Landroid/view/View;

.field public f:Landroid/view/View;

.field public g:Landroid/view/View;

.field public h:Landroid/view/View;

.field public i:I

.field public j:I

.field public k:I

.field public l:I


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
    .locals 5

    .line 1
    invoke-super/range {p0 .. p5}, LH9/a;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 18
    .line 19
    .line 20
    move-result p5

    .line 21
    sub-int/2addr p4, p5

    .line 22
    iget p5, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->k:I

    .line 23
    .line 24
    iget v0, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->l:I

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-ge p5, v0, :cond_0

    .line 28
    .line 29
    sub-int/2addr v0, p5

    .line 30
    div-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    move p5, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sub-int/2addr p5, v0

    .line 35
    div-int/lit8 p5, p5, 0x2

    .line 36
    .line 37
    move v0, v1

    .line 38
    :goto_0
    const-string v2, "Layout image"

    .line 39
    .line 40
    invoke-static {v2}, LD9/e;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    add-int/2addr v0, p3

    .line 44
    iget-object v2, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 45
    .line 46
    invoke-static {v2}, LH9/a;->e(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, p2

    .line 51
    iget-object v3, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 52
    .line 53
    invoke-static {v3}, LH9/a;->d(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v3, v0

    .line 58
    iget-object v4, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 59
    .line 60
    invoke-static {v4, p2, v0, v2, v3}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 61
    .line 62
    .line 63
    iget p2, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->i:I

    .line 64
    .line 65
    add-int/2addr v2, p2

    .line 66
    const-string p2, "Layout getTitle"

    .line 67
    .line 68
    invoke-static {p2}, LD9/e;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    add-int/2addr p3, p5

    .line 72
    iget-object p2, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->f:Landroid/view/View;

    .line 73
    .line 74
    invoke-static {p2}, LH9/a;->d(Landroid/view/View;)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    add-int/2addr p2, p3

    .line 79
    iget-object p5, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->f:Landroid/view/View;

    .line 80
    .line 81
    invoke-static {p5, v2, p3, p4, p2}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 82
    .line 83
    .line 84
    const-string p3, "Layout getBody"

    .line 85
    .line 86
    invoke-static {p3}, LD9/e;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object p3, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->f:Landroid/view/View;

    .line 90
    .line 91
    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    const/16 p5, 0x8

    .line 96
    .line 97
    if-ne p3, p5, :cond_1

    .line 98
    .line 99
    move p3, v1

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    iget p3, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->j:I

    .line 102
    .line 103
    :goto_1
    add-int/2addr p2, p3

    .line 104
    iget-object p3, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->g:Landroid/view/View;

    .line 105
    .line 106
    invoke-static {p3}, LH9/a;->d(Landroid/view/View;)I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    add-int/2addr p3, p2

    .line 111
    iget-object v0, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->g:Landroid/view/View;

    .line 112
    .line 113
    invoke-static {v0, v2, p2, p4, p3}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 114
    .line 115
    .line 116
    const-string p2, "Layout button"

    .line 117
    .line 118
    invoke-static {p2}, LD9/e;->a(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object p2, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->g:Landroid/view/View;

    .line 122
    .line 123
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-ne p2, p5, :cond_2

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    iget v1, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->j:I

    .line 131
    .line 132
    :goto_2
    add-int/2addr p3, v1

    .line 133
    iget-object p2, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->h:Landroid/view/View;

    .line 134
    .line 135
    invoke-static {p2}, LH9/a;->e(Landroid/view/View;)I

    .line 136
    .line 137
    .line 138
    move-result p4

    .line 139
    add-int/2addr p4, v2

    .line 140
    invoke-static {p2}, LH9/a;->d(Landroid/view/View;)I

    .line 141
    .line 142
    .line 143
    move-result p5

    .line 144
    add-int/2addr p5, p3

    .line 145
    invoke-static {p2, v2, p3, p4, p5}, LH9/a;->f(Landroid/view/View;IIII)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    iget-object v0, p0, LH9/a;->c:Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, LH9/a;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    const v1, 0x7f0a015b

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, LH9/a;->c(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 14
    .line 15
    const v1, 0x7f0a01b8

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, LH9/a;->c(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->f:Landroid/view/View;

    .line 23
    .line 24
    const v1, 0x7f0a0088

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, LH9/a;->c(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->g:Landroid/view/View;

    .line 32
    .line 33
    const v1, 0x7f0a0094

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, LH9/a;->c(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->h:Landroid/view/View;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/16 v2, 0x18

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    const/4 v4, 0x0

    .line 52
    const/16 v5, 0x8

    .line 53
    .line 54
    if-ne v1, v5, :cond_0

    .line 55
    .line 56
    move v1, v4

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    int-to-float v1, v2

    .line 59
    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    float-to-double v6, v1

    .line 64
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    double-to-int v1, v6

    .line 69
    :goto_0
    iput v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->i:I

    .line 70
    .line 71
    int-to-float v1, v2

    .line 72
    invoke-static {v3, v1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    float-to-double v0, v0

    .line 77
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    double-to-int v0, v0

    .line 82
    iput v0, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->j:I

    .line 83
    .line 84
    iget-object v0, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->f:Landroid/view/View;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->g:Landroid/view/View;

    .line 87
    .line 88
    iget-object v2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->h:Landroid/view/View;

    .line 89
    .line 90
    const/4 v6, 0x3

    .line 91
    new-array v6, v6, [Landroid/view/View;

    .line 92
    .line 93
    aput-object v0, v6, v4

    .line 94
    .line 95
    aput-object v1, v6, v3

    .line 96
    .line 97
    const/4 v0, 0x2

    .line 98
    aput-object v2, v6, v0

    .line 99
    .line 100
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    add-int/2addr v2, v1

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    add-int/2addr v6, v1

    .line 122
    invoke-virtual {p0, p1}, LH9/a;->b(I)I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-virtual {p0, p2}, LH9/a;->a(I)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    sub-int/2addr p2, v6

    .line 131
    sub-int/2addr p1, v2

    .line 132
    const-string v1, "Measuring image"

    .line 133
    .line 134
    invoke-static {v1}, LD9/e;->a(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 138
    .line 139
    int-to-float v7, p1

    .line 140
    const v8, 0x3ecccccd    # 0.4f

    .line 141
    .line 142
    .line 143
    mul-float/2addr v7, v8

    .line 144
    float-to-int v7, v7

    .line 145
    invoke-static {v1, v7, p2}, LFe/b;->J(Landroid/view/View;II)V

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 149
    .line 150
    invoke-static {v1}, LH9/a;->e(Landroid/view/View;)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    iget v7, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->i:I

    .line 155
    .line 156
    add-int/2addr v7, v1

    .line 157
    sub-int/2addr p1, v7

    .line 158
    int-to-float v7, v1

    .line 159
    int-to-float v8, p1

    .line 160
    const-string v9, "Max col widths (l, r)"

    .line 161
    .line 162
    invoke-static {v9, v7, v8}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    move v9, v4

    .line 170
    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-eqz v10, :cond_2

    .line 175
    .line 176
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    check-cast v10, Landroid/view/View;

    .line 181
    .line 182
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eq v10, v5, :cond_1

    .line 187
    .line 188
    add-int/2addr v9, v3

    .line 189
    goto :goto_1

    .line 190
    :cond_2
    sub-int/2addr v9, v3

    .line 191
    iget v3, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->j:I

    .line 192
    .line 193
    mul-int/2addr v9, v3

    .line 194
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    sub-int/2addr p2, v3

    .line 199
    const-string v5, "Measuring getTitle"

    .line 200
    .line 201
    invoke-static {v5}, LD9/e;->a(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-object v5, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->f:Landroid/view/View;

    .line 205
    .line 206
    invoke-static {v5, p1, p2}, LFe/b;->J(Landroid/view/View;II)V

    .line 207
    .line 208
    .line 209
    const-string v5, "Measuring button"

    .line 210
    .line 211
    invoke-static {v5}, LD9/e;->a(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v5, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->h:Landroid/view/View;

    .line 215
    .line 216
    invoke-static {v5, p1, p2}, LFe/b;->J(Landroid/view/View;II)V

    .line 217
    .line 218
    .line 219
    const-string v5, "Measuring scroll view"

    .line 220
    .line 221
    invoke-static {v5}, LD9/e;->a(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget-object v5, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->f:Landroid/view/View;

    .line 225
    .line 226
    invoke-static {v5}, LH9/a;->d(Landroid/view/View;)I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    sub-int/2addr p2, v5

    .line 231
    iget-object v5, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->h:Landroid/view/View;

    .line 232
    .line 233
    invoke-static {v5}, LH9/a;->d(Landroid/view/View;)I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    sub-int/2addr p2, v5

    .line 238
    iget-object v5, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->g:Landroid/view/View;

    .line 239
    .line 240
    invoke-static {v5, p1, p2}, LFe/b;->J(Landroid/view/View;II)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->e:Landroid/view/View;

    .line 244
    .line 245
    invoke-static {p1}, LH9/a;->d(Landroid/view/View;)I

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    iput p1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->k:I

    .line 250
    .line 251
    iput v3, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->l:I

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result p2

    .line 261
    if-eqz p2, :cond_3

    .line 262
    .line 263
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    check-cast p2, Landroid/view/View;

    .line 268
    .line 269
    iget v3, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->l:I

    .line 270
    .line 271
    invoke-static {p2}, LH9/a;->d(Landroid/view/View;)I

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    add-int/2addr p2, v3

    .line 276
    iput p2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->l:I

    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_3
    iget p1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->k:I

    .line 280
    .line 281
    add-int/2addr p1, v6

    .line 282
    iget p2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->l:I

    .line 283
    .line 284
    add-int/2addr p2, v6

    .line 285
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_4

    .line 298
    .line 299
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Landroid/view/View;

    .line 304
    .line 305
    invoke-static {v0}, LH9/a;->e(Landroid/view/View;)I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    goto :goto_3

    .line 314
    :cond_4
    const-string p2, "Measured columns (l, r)"

    .line 315
    .line 316
    int-to-float v0, v4

    .line 317
    invoke-static {p2, v7, v0}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 318
    .line 319
    .line 320
    add-int/2addr v1, v4

    .line 321
    iget p2, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutLandscape;->i:I

    .line 322
    .line 323
    add-int/2addr v1, p2

    .line 324
    add-int/2addr v1, v2

    .line 325
    int-to-float p2, v1

    .line 326
    int-to-float v0, p1

    .line 327
    const-string v2, "Measured dims"

    .line 328
    .line 329
    invoke-static {v2, p2, v0}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 333
    .line 334
    .line 335
    return-void
.end method
