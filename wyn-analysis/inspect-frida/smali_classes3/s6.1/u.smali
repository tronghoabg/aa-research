.class public final synthetic Ls6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls6/y;


# direct methods
.method public synthetic constructor <init>(Ls6/y;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls6/u;->a:I

    iput-object p1, p0, Ls6/u;->b:Ls6/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Ls6/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iget-object v1, p0, Ls6/u;->b:Ls6/y;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ls6/y;->i(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object v0, p0, Ls6/u;->b:Ls6/y;

    .line 14
    .line 15
    iget-object v1, v0, Ls6/y;->l:Landroid/animation/AnimatorSet;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Ls6/y;->u:Ls6/u;

    .line 21
    .line 22
    const-wide/16 v2, 0x7d0

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3}, Ls6/y;->e(Ljava/lang/Runnable;J)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object v0, p0, Ls6/u;->b:Ls6/y;

    .line 29
    .line 30
    iget-object v0, v0, Ls6/y;->m:Landroid/animation/AnimatorSet;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Ls6/u;->b:Ls6/y;

    .line 37
    .line 38
    iget-object v0, v0, Ls6/y;->n:Landroid/animation/AnimatorSet;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_3
    iget-object v0, p0, Ls6/u;->b:Ls6/y;

    .line 45
    .line 46
    iget-object v1, v0, Ls6/y;->f:Landroid/view/ViewGroup;

    .line 47
    .line 48
    if-eqz v1, :cond_8

    .line 49
    .line 50
    iget-object v2, v0, Ls6/y;->g:Landroid/view/ViewGroup;

    .line 51
    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_0
    iget-object v3, v0, Ls6/y;->a:Ls6/t;

    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    sub-int/2addr v4, v5

    .line 67
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    sub-int/2addr v4, v3

    .line 72
    :goto_0
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    const/4 v5, 0x1

    .line 77
    const/4 v6, 0x0

    .line 78
    if-le v3, v5, :cond_1

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    add-int/lit8 v3, v3, -0x2

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    iget-object v3, v0, Ls6/y;->k:Landroid/view/View;

    .line 98
    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    const/16 v7, 0x8

    .line 102
    .line 103
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 104
    .line 105
    .line 106
    :cond_2
    iget-object v7, v0, Ls6/y;->i:Landroid/view/ViewGroup;

    .line 107
    .line 108
    invoke-static {v7}, Ls6/y;->c(Landroid/view/View;)I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    sub-int/2addr v8, v5

    .line 117
    move v9, v6

    .line 118
    :goto_1
    if-ge v9, v8, :cond_3

    .line 119
    .line 120
    invoke-virtual {v1, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-static {v10}, Ls6/y;->c(Landroid/view/View;)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    add-int/2addr v7, v10

    .line 129
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    if-le v7, v4, :cond_7

    .line 133
    .line 134
    if-eqz v3, :cond_4

    .line 135
    .line 136
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v3}, Ls6/y;->c(Landroid/view/View;)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    add-int/2addr v7, v0

    .line 144
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    move v3, v6

    .line 150
    :goto_2
    if-ge v3, v8, :cond_6

    .line 151
    .line 152
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-static {v9}, Ls6/y;->c(Landroid/view/View;)I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    sub-int/2addr v7, v10

    .line 161
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    if-gt v7, v4, :cond_5

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_6
    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-nez v3, :cond_8

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-virtual {v1, v6, v3}, Landroid/view/ViewGroup;->removeViews(II)V

    .line 181
    .line 182
    .line 183
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-ge v6, v1, :cond_8

    .line 188
    .line 189
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    sub-int/2addr v1, v5

    .line 194
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, Landroid/view/View;

    .line 199
    .line 200
    invoke-virtual {v2, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 201
    .line 202
    .line 203
    add-int/lit8 v6, v6, 0x1

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_7
    iget-object v1, v0, Ls6/y;->h:Landroid/view/ViewGroup;

    .line 207
    .line 208
    if-eqz v1, :cond_8

    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-nez v1, :cond_8

    .line 215
    .line 216
    iget-object v1, v0, Ls6/y;->r:Landroid/animation/ValueAnimator;

    .line 217
    .line 218
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-nez v2, :cond_8

    .line 223
    .line 224
    iget-object v0, v0, Ls6/y;->q:Landroid/animation/ValueAnimator;

    .line 225
    .line 226
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 230
    .line 231
    .line 232
    :cond_8
    :goto_5
    return-void

    .line 233
    :pswitch_4
    iget-object v0, p0, Ls6/u;->b:Ls6/y;

    .line 234
    .line 235
    iget-object v1, v0, Ls6/y;->e:Landroid/view/ViewGroup;

    .line 236
    .line 237
    const/4 v2, 0x4

    .line 238
    const/4 v3, 0x0

    .line 239
    if-eqz v1, :cond_a

    .line 240
    .line 241
    iget-boolean v4, v0, Ls6/y;->A:Z

    .line 242
    .line 243
    if-eqz v4, :cond_9

    .line 244
    .line 245
    move v4, v3

    .line 246
    goto :goto_6

    .line 247
    :cond_9
    move v4, v2

    .line 248
    :goto_6
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 249
    .line 250
    .line 251
    :cond_a
    iget-object v1, v0, Ls6/y;->j:Landroid/view/View;

    .line 252
    .line 253
    if-eqz v1, :cond_12

    .line 254
    .line 255
    iget-object v4, v0, Ls6/y;->a:Ls6/t;

    .line 256
    .line 257
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    const v5, 0x7f0700c1

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 273
    .line 274
    if-eqz v5, :cond_c

    .line 275
    .line 276
    iget-boolean v6, v0, Ls6/y;->A:Z

    .line 277
    .line 278
    if-eqz v6, :cond_b

    .line 279
    .line 280
    move v4, v3

    .line 281
    :cond_b
    iput v4, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 282
    .line 283
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 284
    .line 285
    .line 286
    :cond_c
    instance-of v4, v1, Ls6/d;

    .line 287
    .line 288
    if-eqz v4, :cond_12

    .line 289
    .line 290
    check-cast v1, Ls6/d;

    .line 291
    .line 292
    iget-boolean v4, v0, Ls6/y;->A:Z

    .line 293
    .line 294
    const/4 v5, 0x0

    .line 295
    iget-object v6, v1, Ls6/d;->a:Landroid/graphics/Rect;

    .line 296
    .line 297
    const/4 v7, 0x1

    .line 298
    if-eqz v4, :cond_e

    .line 299
    .line 300
    iget-object v4, v1, Ls6/d;->E:Landroid/animation/ValueAnimator;

    .line 301
    .line 302
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    if-eqz v8, :cond_d

    .line 307
    .line 308
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 309
    .line 310
    .line 311
    :cond_d
    iput-boolean v7, v1, Ls6/d;->G:Z

    .line 312
    .line 313
    iput v5, v1, Ls6/d;->F:F

    .line 314
    .line 315
    invoke-virtual {v1, v6}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_e
    iget v4, v0, Ls6/y;->z:I

    .line 320
    .line 321
    if-ne v4, v7, :cond_10

    .line 322
    .line 323
    iget-object v4, v1, Ls6/d;->E:Landroid/animation/ValueAnimator;

    .line 324
    .line 325
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    if-eqz v7, :cond_f

    .line 330
    .line 331
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 332
    .line 333
    .line 334
    :cond_f
    iput-boolean v3, v1, Ls6/d;->G:Z

    .line 335
    .line 336
    iput v5, v1, Ls6/d;->F:F

    .line 337
    .line 338
    invoke-virtual {v1, v6}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 339
    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_10
    const/4 v5, 0x3

    .line 343
    if-eq v4, v5, :cond_12

    .line 344
    .line 345
    iget-object v4, v1, Ls6/d;->E:Landroid/animation/ValueAnimator;

    .line 346
    .line 347
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-eqz v5, :cond_11

    .line 352
    .line 353
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 354
    .line 355
    .line 356
    :cond_11
    iput-boolean v3, v1, Ls6/d;->G:Z

    .line 357
    .line 358
    const/high16 v4, 0x3f800000    # 1.0f

    .line 359
    .line 360
    iput v4, v1, Ls6/d;->F:F

    .line 361
    .line 362
    invoke-virtual {v1, v6}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 363
    .line 364
    .line 365
    :cond_12
    :goto_7
    iget-object v1, v0, Ls6/y;->y:Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_14

    .line 376
    .line 377
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    check-cast v4, Landroid/view/View;

    .line 382
    .line 383
    iget-boolean v5, v0, Ls6/y;->A:Z

    .line 384
    .line 385
    if-eqz v5, :cond_13

    .line 386
    .line 387
    invoke-static {v4}, Ls6/y;->j(Landroid/view/View;)Z

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    if-eqz v5, :cond_13

    .line 392
    .line 393
    move v5, v2

    .line 394
    goto :goto_9

    .line 395
    :cond_13
    move v5, v3

    .line 396
    :goto_9
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 397
    .line 398
    .line 399
    goto :goto_8

    .line 400
    :cond_14
    return-void

    .line 401
    :pswitch_5
    iget-object v0, p0, Ls6/u;->b:Ls6/y;

    .line 402
    .line 403
    invoke-virtual {v0}, Ls6/y;->k()V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
