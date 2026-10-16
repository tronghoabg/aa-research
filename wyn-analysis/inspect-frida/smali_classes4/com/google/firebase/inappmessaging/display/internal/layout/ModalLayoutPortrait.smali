.class public Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutPortrait;
.super LH9/a;
.source "SourceFile"


# instance fields
.field public final e:LI9/a;

.field public f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LH9/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LI9/a;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p1, LI9/a;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    iput p2, p1, LI9/a;->b:I

    .line 18
    .line 19
    iput-object p1, p0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutPortrait;->e:LI9/a;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 9

    .line 1
    invoke-super/range {p0 .. p5}, LH9/a;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 10
    .line 11
    .line 12
    move-result p5

    .line 13
    invoke-virtual {p0}, LH9/a;->getVisibleChildren()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    if-ge v1, v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, LH9/a;->getVisibleChildren()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    add-int/2addr v4, p3

    .line 49
    iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    and-int/2addr v3, v6

    .line 53
    if-ne v3, v6, :cond_0

    .line 54
    .line 55
    sub-int v3, p4, p2

    .line 56
    .line 57
    div-int/lit8 v3, v3, 0x2

    .line 58
    .line 59
    div-int/lit8 v5, v5, 0x2

    .line 60
    .line 61
    sub-int v6, v3, v5

    .line 62
    .line 63
    add-int/2addr v3, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    add-int v3, p5, v5

    .line 66
    .line 67
    move v6, p5

    .line 68
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v7, "Layout child "

    .line 71
    .line 72
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v5}, LD9/e;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    int-to-float v5, p3

    .line 86
    int-to-float v7, v4

    .line 87
    const-string v8, "\t(top, bottom)"

    .line 88
    .line 89
    invoke-static {v8, v5, v7}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 90
    .line 91
    .line 92
    int-to-float v5, v6

    .line 93
    int-to-float v7, v3

    .line 94
    const-string v8, "\t(left, right)"

    .line 95
    .line 96
    invoke-static {v8, v5, v7}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v6, p3, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    add-int/2addr v2, p3

    .line 107
    add-int/lit8 p3, v0, -0x1

    .line 108
    .line 109
    if-ge v1, p3, :cond_1

    .line 110
    .line 111
    iget p3, p1, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutPortrait;->f:I

    .line 112
    .line 113
    add-int/2addr v2, p3

    .line 114
    :cond_1
    move p3, v2

    .line 115
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, LH9/a;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    iget-object v2, v0, LH9/a;->c:Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v3, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    float-to-double v1, v1

    .line 17
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    double-to-int v1, v1

    .line 22
    iput v1, v0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutPortrait;->f:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v1

    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    add-int/2addr v4, v1

    .line 42
    invoke-virtual/range {p0 .. p1}, LH9/a;->b(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    move/from16 v5, p2

    .line 47
    .line 48
    invoke-virtual {v0, v5}, LH9/a;->a(I)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-virtual {v0}, LH9/a;->getVisibleChildren()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    sub-int/2addr v6, v3

    .line 61
    iget v7, v0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutPortrait;->f:I

    .line 62
    .line 63
    mul-int/2addr v6, v7

    .line 64
    add-int/2addr v6, v4

    .line 65
    iget-object v4, v0, Lcom/google/firebase/inappmessaging/display/internal/layout/ModalLayoutPortrait;->e:LI9/a;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iput v5, v4, LI9/a;->b:I

    .line 71
    .line 72
    new-instance v7, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v7, v4, LI9/a;->a:Ljava/util/ArrayList;

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    move v8, v7

    .line 81
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-ge v8, v9, :cond_2

    .line 86
    .line 87
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v9}, Landroid/view/View;->getId()I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    const v11, 0x7f0a0088

    .line 96
    .line 97
    .line 98
    if-eq v10, v11, :cond_1

    .line 99
    .line 100
    invoke-virtual {v9}, Landroid/view/View;->getId()I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    const v11, 0x7f0a015b

    .line 105
    .line 106
    .line 107
    if-ne v10, v11, :cond_0

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_0
    move v10, v7

    .line 111
    goto :goto_2

    .line 112
    :cond_1
    :goto_1
    move v10, v3

    .line 113
    :goto_2
    new-instance v11, LI9/b;

    .line 114
    .line 115
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v9, v11, LI9/b;->a:Landroid/view/View;

    .line 119
    .line 120
    iput-boolean v10, v11, LI9/b;->b:Z

    .line 121
    .line 122
    iget v9, v4, LI9/a;->b:I

    .line 123
    .line 124
    iput v9, v11, LI9/b;->c:I

    .line 125
    .line 126
    iget-object v9, v4, LI9/a;->a:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    add-int/lit8 v8, v8, 0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v9, "Screen dimens: "

    .line 137
    .line 138
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, LH9/a;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-static {v8}, LD9/e;->a(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, LH9/a;->getMaxWidthPct()F

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    invoke-virtual {v0}, LH9/a;->getMaxHeightPct()F

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    const-string v10, "Max pct"

    .line 164
    .line 165
    invoke-static {v10, v8, v9}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 166
    .line 167
    .line 168
    int-to-float v8, v1

    .line 169
    int-to-float v9, v5

    .line 170
    const-string v10, "Base dimens"

    .line 171
    .line 172
    invoke-static {v10, v8, v9}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 173
    .line 174
    .line 175
    iget-object v9, v4, LI9/a;->a:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    const/high16 v11, -0x80000000

    .line 186
    .line 187
    if-eqz v10, :cond_3

    .line 188
    .line 189
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    check-cast v10, LI9/b;

    .line 194
    .line 195
    const-string v12, "Pre-measure child"

    .line 196
    .line 197
    invoke-static {v12}, LD9/e;->a(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget-object v10, v10, LI9/b;->a:Landroid/view/View;

    .line 201
    .line 202
    invoke-static {v10, v1, v5, v11, v11}, LFe/b;->I(Landroid/view/View;IIII)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_3
    iget-object v9, v4, LI9/a;->a:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    move v10, v7

    .line 213
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    if-eqz v12, :cond_4

    .line 218
    .line 219
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    check-cast v12, LI9/b;

    .line 224
    .line 225
    invoke-virtual {v12}, LI9/b;->a()I

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    add-int/2addr v10, v12

    .line 230
    goto :goto_4

    .line 231
    :cond_4
    add-int/2addr v10, v6

    .line 232
    const-string v9, "Total reserved height"

    .line 233
    .line 234
    int-to-float v12, v6

    .line 235
    invoke-static {v9, v12}, LD9/e;->b(Ljava/lang/String;F)V

    .line 236
    .line 237
    .line 238
    const-string v9, "Total desired height"

    .line 239
    .line 240
    int-to-float v12, v10

    .line 241
    invoke-static {v9, v12}, LD9/e;->b(Ljava/lang/String;F)V

    .line 242
    .line 243
    .line 244
    if-le v10, v5, :cond_5

    .line 245
    .line 246
    move v9, v3

    .line 247
    goto :goto_5

    .line 248
    :cond_5
    move v9, v7

    .line 249
    :goto_5
    new-instance v10, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v12, "Total height constrained: "

    .line 252
    .line 253
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    invoke-static {v10}, LD9/e;->a(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    if-eqz v9, :cond_e

    .line 267
    .line 268
    sub-int/2addr v5, v6

    .line 269
    iget-object v9, v4, LI9/a;->a:Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    move v10, v7

    .line 276
    :cond_6
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    if-eqz v12, :cond_7

    .line 281
    .line 282
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    check-cast v12, LI9/b;

    .line 287
    .line 288
    iget-boolean v13, v12, LI9/b;->b:Z

    .line 289
    .line 290
    if-nez v13, :cond_6

    .line 291
    .line 292
    invoke-virtual {v12}, LI9/b;->a()I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    add-int/2addr v10, v12

    .line 297
    goto :goto_6

    .line 298
    :cond_7
    sub-int/2addr v5, v10

    .line 299
    new-instance v9, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    iget-object v10, v4, LI9/a;->a:Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    :cond_8
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    if-eqz v12, :cond_9

    .line 315
    .line 316
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    check-cast v12, LI9/b;

    .line 321
    .line 322
    iget-boolean v13, v12, LI9/b;->b:Z

    .line 323
    .line 324
    if-eqz v13, :cond_8

    .line 325
    .line 326
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_9
    new-instance v10, LA7/R0;

    .line 331
    .line 332
    const/4 v12, 0x3

    .line 333
    invoke-direct {v10, v12}, LA7/R0;-><init>(I)V

    .line 334
    .line 335
    .line 336
    invoke-static {v9, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v12

    .line 347
    if-eqz v12, :cond_a

    .line 348
    .line 349
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    check-cast v12, LI9/b;

    .line 354
    .line 355
    invoke-virtual {v12}, LI9/b;->a()I

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    add-int/2addr v7, v12

    .line 360
    goto :goto_8

    .line 361
    :cond_a
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    const/4 v12, 0x6

    .line 366
    if-ge v10, v12, :cond_d

    .line 367
    .line 368
    sub-int/2addr v10, v3

    .line 369
    int-to-float v3, v10

    .line 370
    const v10, 0x3e4ccccd    # 0.2f

    .line 371
    .line 372
    .line 373
    mul-float/2addr v3, v10

    .line 374
    const/high16 v12, 0x3f800000    # 1.0f

    .line 375
    .line 376
    sub-float/2addr v12, v3

    .line 377
    const-string v3, "VVGM (minFrac, maxFrac)"

    .line 378
    .line 379
    invoke-static {v3, v10, v12}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    const/4 v9, 0x0

    .line 387
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    if-eqz v13, :cond_e

    .line 392
    .line 393
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v13

    .line 397
    check-cast v13, LI9/b;

    .line 398
    .line 399
    invoke-virtual {v13}, LI9/b;->a()I

    .line 400
    .line 401
    .line 402
    move-result v14

    .line 403
    int-to-float v14, v14

    .line 404
    int-to-float v15, v7

    .line 405
    div-float/2addr v14, v15

    .line 406
    cmpl-float v15, v14, v12

    .line 407
    .line 408
    if-lez v15, :cond_b

    .line 409
    .line 410
    sub-float v15, v14, v12

    .line 411
    .line 412
    add-float/2addr v9, v15

    .line 413
    move v15, v12

    .line 414
    goto :goto_a

    .line 415
    :cond_b
    move v15, v14

    .line 416
    :goto_a
    cmpg-float v16, v14, v10

    .line 417
    .line 418
    if-gez v16, :cond_c

    .line 419
    .line 420
    sub-float v15, v10, v14

    .line 421
    .line 422
    invoke-static {v15, v9}, Ljava/lang/Math;->min(FF)F

    .line 423
    .line 424
    .line 425
    move-result v15

    .line 426
    add-float v16, v14, v15

    .line 427
    .line 428
    sub-float/2addr v9, v15

    .line 429
    move/from16 v15, v16

    .line 430
    .line 431
    :cond_c
    const-string v10, "\t(desired, granted)"

    .line 432
    .line 433
    invoke-static {v10, v14, v15}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 434
    .line 435
    .line 436
    int-to-float v10, v5

    .line 437
    mul-float/2addr v15, v10

    .line 438
    float-to-int v10, v15

    .line 439
    iput v10, v13, LI9/b;->c:I

    .line 440
    .line 441
    const v10, 0x3e4ccccd    # 0.2f

    .line 442
    .line 443
    .line 444
    goto :goto_9

    .line 445
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 446
    .line 447
    const-string v2, "VerticalViewGroupMeasure only supports up to 5 children"

    .line 448
    .line 449
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v1

    .line 453
    :cond_e
    sub-int v2, v1, v2

    .line 454
    .line 455
    iget-object v3, v4, LI9/a;->a:Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v4

    .line 465
    if-eqz v4, :cond_f

    .line 466
    .line 467
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    check-cast v4, LI9/b;

    .line 472
    .line 473
    const-string v5, "Measuring child"

    .line 474
    .line 475
    invoke-static {v5}, LD9/e;->a(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    iget-object v5, v4, LI9/b;->a:Landroid/view/View;

    .line 479
    .line 480
    iget v7, v4, LI9/b;->c:I

    .line 481
    .line 482
    invoke-static {v5, v2, v7, v11, v11}, LFe/b;->I(Landroid/view/View;IIII)V

    .line 483
    .line 484
    .line 485
    iget-object v4, v4, LI9/b;->a:Landroid/view/View;

    .line 486
    .line 487
    invoke-static {v4}, LH9/a;->d(Landroid/view/View;)I

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    add-int/2addr v6, v4

    .line 492
    goto :goto_b

    .line 493
    :cond_f
    const-string v2, "Measured dims"

    .line 494
    .line 495
    int-to-float v3, v6

    .line 496
    invoke-static {v2, v8, v3}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0, v1, v6}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 500
    .line 501
    .line 502
    return-void
.end method
