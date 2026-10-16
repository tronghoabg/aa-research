.class public LD9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:Landroid/view/View;

.field public final f:LS3/l;

.field public g:I

.field public h:F

.field public i:F

.field public j:Z

.field public k:I

.field public l:Landroid/view/VelocityTracker;

.field public m:F


# direct methods
.method public constructor <init>(Landroid/view/View;LS3/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, LD9/s;->g:I

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, LD9/s;->a:I

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    mul-int/lit8 v1, v1, 0x10

    .line 26
    .line 27
    iput v1, p0, LD9/s;->b:I

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, LD9/s;->c:I

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/high16 v1, 0x10e0000

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    int-to-long v0, v0

    .line 50
    iput-wide v0, p0, LD9/s;->d:J

    .line 51
    .line 52
    iput-object p1, p0, LD9/s;->e:Landroid/view/View;

    .line 53
    .line 54
    iput-object p2, p0, LD9/s;->f:LS3/l;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(FFLD9/o;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LD9/s;->b()F

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    sub-float v3, p1, v2

    .line 6
    .line 7
    iget-object p1, p0, LD9/s;->e:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sub-float v5, p2, v4

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    new-array p1, p1, [F

    .line 17
    .line 18
    fill-array-data p1, :array_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-wide v0, p0, LD9/s;->d:J

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    new-instance v0, LD9/p;

    .line 31
    .line 32
    move-object v1, p0

    .line 33
    invoke-direct/range {v0 .. v5}, LD9/p;-><init>(LD9/s;FFFF)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 37
    .line 38
    .line 39
    if-eqz p3, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b()F
    .locals 1

    .line 1
    iget-object v0, p0, LD9/s;->e:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LD9/s;->e:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    iget p1, p0, LD9/s;->m:F

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 5
    .line 6
    .line 7
    iget p1, p0, LD9/s;->g:I

    .line 8
    .line 9
    iget-object v1, p0, LD9/s;->e:Landroid/view/View;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-ge p1, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, LD9/s;->g:I

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz p1, :cond_15

    .line 26
    .line 27
    const/high16 v4, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x1

    .line 31
    if-eq p1, v6, :cond_7

    .line 32
    .line 33
    const/4 v7, 0x3

    .line 34
    if-eq p1, v2, :cond_3

    .line 35
    .line 36
    if-eq p1, v7, :cond_1

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, v0, v4, v5}, LD9/s;->a(FFLD9/o;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 52
    .line 53
    .line 54
    iput-object v5, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 55
    .line 56
    iput v0, p0, LD9/s;->m:F

    .line 57
    .line 58
    iput v0, p0, LD9/s;->h:F

    .line 59
    .line 60
    iput v0, p0, LD9/s;->i:F

    .line 61
    .line 62
    iput-boolean v3, p0, LD9/s;->j:Z

    .line 63
    .line 64
    return v3

    .line 65
    :cond_3
    iget-object p1, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 66
    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_4
    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iget v2, p0, LD9/s;->h:F

    .line 79
    .line 80
    sub-float/2addr p1, v2

    .line 81
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    iget v5, p0, LD9/s;->i:F

    .line 86
    .line 87
    sub-float/2addr v2, v5

    .line 88
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    iget v8, p0, LD9/s;->a:I

    .line 93
    .line 94
    int-to-float v9, v8

    .line 95
    cmpl-float v5, v5, v9

    .line 96
    .line 97
    const/high16 v9, 0x40000000    # 2.0f

    .line 98
    .line 99
    if-lez v5, :cond_6

    .line 100
    .line 101
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    div-float/2addr v5, v9

    .line 110
    cmpg-float v2, v2, v5

    .line 111
    .line 112
    if-gez v2, :cond_6

    .line 113
    .line 114
    iput-boolean v6, p0, LD9/s;->j:Z

    .line 115
    .line 116
    cmpl-float v2, p1, v0

    .line 117
    .line 118
    if-lez v2, :cond_5

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_5
    neg-int v8, v8

    .line 122
    :goto_0
    iput v8, p0, LD9/s;->k:I

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v2, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 129
    .line 130
    .line 131
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    shl-int/lit8 p2, p2, 0x8

    .line 140
    .line 141
    or-int/2addr p2, v7

    .line 142
    invoke-virtual {v2, p2}, Landroid/view/MotionEvent;->setAction(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 149
    .line 150
    .line 151
    :cond_6
    iget-boolean p2, p0, LD9/s;->j:Z

    .line 152
    .line 153
    if-eqz p2, :cond_8

    .line 154
    .line 155
    iput p1, p0, LD9/s;->m:F

    .line 156
    .line 157
    iget p2, p0, LD9/s;->k:I

    .line 158
    .line 159
    int-to-float p2, p2

    .line 160
    sub-float p2, p1, p2

    .line 161
    .line 162
    invoke-virtual {p0, p2}, LD9/s;->c(F)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    mul-float/2addr p1, v9

    .line 170
    iget p2, p0, LD9/s;->g:I

    .line 171
    .line 172
    int-to-float p2, p2

    .line 173
    div-float/2addr p1, p2

    .line 174
    sub-float p1, v4, p1

    .line 175
    .line 176
    invoke-static {v4, p1}, Ljava/lang/Math;->min(FF)F

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    iget-object p2, p0, LD9/s;->e:Landroid/view/View;

    .line 185
    .line 186
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 187
    .line 188
    .line 189
    return v6

    .line 190
    :cond_7
    iget-object p1, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 191
    .line 192
    if-nez p1, :cond_9

    .line 193
    .line 194
    :cond_8
    :goto_1
    return v3

    .line 195
    :cond_9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    iget v1, p0, LD9/s;->h:F

    .line 200
    .line 201
    sub-float/2addr p1, v1

    .line 202
    iget-object v1, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 203
    .line 204
    invoke-virtual {v1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 205
    .line 206
    .line 207
    iget-object p2, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 208
    .line 209
    const/16 v1, 0x3e8

    .line 210
    .line 211
    invoke-virtual {p2, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 212
    .line 213
    .line 214
    iget-object p2, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 215
    .line 216
    invoke-virtual {p2}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    iget-object v7, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 225
    .line 226
    invoke-virtual {v7}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    iget v9, p0, LD9/s;->g:I

    .line 239
    .line 240
    div-int/2addr v9, v2

    .line 241
    int-to-float v2, v9

    .line 242
    cmpl-float v2, v8, v2

    .line 243
    .line 244
    if-lez v2, :cond_b

    .line 245
    .line 246
    iget-boolean v2, p0, LD9/s;->j:Z

    .line 247
    .line 248
    if-eqz v2, :cond_b

    .line 249
    .line 250
    cmpl-float p1, p1, v0

    .line 251
    .line 252
    if-lez p1, :cond_a

    .line 253
    .line 254
    move p1, v6

    .line 255
    goto :goto_6

    .line 256
    :cond_a
    move p1, v3

    .line 257
    goto :goto_6

    .line 258
    :cond_b
    iget v2, p0, LD9/s;->b:I

    .line 259
    .line 260
    int-to-float v2, v2

    .line 261
    cmpg-float v2, v2, v1

    .line 262
    .line 263
    if-gtz v2, :cond_10

    .line 264
    .line 265
    iget v2, p0, LD9/s;->c:I

    .line 266
    .line 267
    int-to-float v2, v2

    .line 268
    cmpg-float v2, v1, v2

    .line 269
    .line 270
    if-gtz v2, :cond_10

    .line 271
    .line 272
    cmpg-float v1, v7, v1

    .line 273
    .line 274
    if-gez v1, :cond_10

    .line 275
    .line 276
    if-gez v1, :cond_10

    .line 277
    .line 278
    iget-boolean v1, p0, LD9/s;->j:Z

    .line 279
    .line 280
    if-eqz v1, :cond_10

    .line 281
    .line 282
    cmpg-float p2, p2, v0

    .line 283
    .line 284
    if-gez p2, :cond_c

    .line 285
    .line 286
    move p2, v6

    .line 287
    goto :goto_2

    .line 288
    :cond_c
    move p2, v3

    .line 289
    :goto_2
    cmpg-float p1, p1, v0

    .line 290
    .line 291
    if-gez p1, :cond_d

    .line 292
    .line 293
    move p1, v6

    .line 294
    goto :goto_3

    .line 295
    :cond_d
    move p1, v3

    .line 296
    :goto_3
    if-ne p2, p1, :cond_e

    .line 297
    .line 298
    move p1, v6

    .line 299
    goto :goto_4

    .line 300
    :cond_e
    move p1, v3

    .line 301
    :goto_4
    iget-object p2, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 302
    .line 303
    invoke-virtual {p2}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 304
    .line 305
    .line 306
    move-result p2

    .line 307
    cmpl-float p2, p2, v0

    .line 308
    .line 309
    if-lez p2, :cond_f

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_f
    move v6, v3

    .line 313
    :goto_5
    move v10, v6

    .line 314
    move v6, p1

    .line 315
    move p1, v10

    .line 316
    goto :goto_6

    .line 317
    :cond_10
    move p1, v3

    .line 318
    move v6, p1

    .line 319
    :goto_6
    if-eqz v6, :cond_12

    .line 320
    .line 321
    if-eqz p1, :cond_11

    .line 322
    .line 323
    iget p1, p0, LD9/s;->g:I

    .line 324
    .line 325
    :goto_7
    int-to-float p1, p1

    .line 326
    goto :goto_8

    .line 327
    :cond_11
    iget p1, p0, LD9/s;->g:I

    .line 328
    .line 329
    neg-int p1, p1

    .line 330
    goto :goto_7

    .line 331
    :goto_8
    new-instance p2, LD9/o;

    .line 332
    .line 333
    const/4 v1, 0x0

    .line 334
    invoke-direct {p2, p0, v1}, LD9/o;-><init>(Ljava/lang/Object;I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0, p1, v0, p2}, LD9/s;->a(FFLD9/o;)V

    .line 338
    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_12
    iget-boolean p1, p0, LD9/s;->j:Z

    .line 342
    .line 343
    if-eqz p1, :cond_13

    .line 344
    .line 345
    invoke-virtual {p0, v0, v4, v5}, LD9/s;->a(FFLD9/o;)V

    .line 346
    .line 347
    .line 348
    :cond_13
    :goto_9
    iget-object p1, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 349
    .line 350
    if-eqz p1, :cond_14

    .line 351
    .line 352
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 353
    .line 354
    .line 355
    :cond_14
    iput-object v5, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 356
    .line 357
    iput v0, p0, LD9/s;->m:F

    .line 358
    .line 359
    iput v0, p0, LD9/s;->h:F

    .line 360
    .line 361
    iput v0, p0, LD9/s;->i:F

    .line 362
    .line 363
    iput-boolean v3, p0, LD9/s;->j:Z

    .line 364
    .line 365
    return v3

    .line 366
    :cond_15
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    iput p1, p0, LD9/s;->h:F

    .line 371
    .line 372
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 373
    .line 374
    .line 375
    move-result p1

    .line 376
    iput p1, p0, LD9/s;->i:F

    .line 377
    .line 378
    iget-object p1, p0, LD9/s;->f:LS3/l;

    .line 379
    .line 380
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    iput-object p1, p0, LD9/s;->l:Landroid/view/VelocityTracker;

    .line 388
    .line 389
    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 390
    .line 391
    .line 392
    return v3
.end method
