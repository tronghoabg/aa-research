.class public final LN7/b;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LV0/a;


# direct methods
.method public synthetic constructor <init>(LV0/a;I)V
    .locals 0

    .line 1
    iput p2, p0, LN7/b;->b:I

    const/16 p2, 0x17

    invoke-direct {p0, p2}, La/a;-><init>(I)V

    iput-object p1, p0, LN7/b;->c:LV0/a;

    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 2

    .line 1
    iget v0, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LN7/b;->c:LV0/a;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 12
    .line 13
    iget-boolean v1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    const/4 v0, 0x1

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, LN7/b;->c:LV0/a;

    .line 25
    .line 26
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 27
    .line 28
    iget-boolean v1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final E(Landroid/view/View;II)V
    .locals 3

    .line 1
    iget p2, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LN7/b;->c:LV0/a;

    .line 7
    .line 8
    check-cast p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 9
    .line 10
    iget-object p3, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    check-cast p3, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p3, 0x0

    .line 22
    :goto_0
    if-eqz p3, :cond_2

    .line 23
    .line 24
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v1, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lad/L;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 39
    .line 40
    .line 41
    iget-object p1, v1, Lad/L;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 44
    .line 45
    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 46
    .line 47
    if-gt v2, p1, :cond_1

    .line 48
    .line 49
    sub-int/2addr p1, v2

    .line 50
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 51
    .line 52
    :cond_1
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object p1, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t:Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    if-nez p3, :cond_4

    .line 62
    .line 63
    iget-object p2, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lad/L;

    .line 64
    .line 65
    iget-object p3, p2, Lad/L;->b:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {p2}, Lad/L;->o()I

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-nez p2, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-static {p1}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    throw p1

    .line 86
    :cond_4
    :goto_1
    return-void

    .line 87
    :pswitch_0
    iget-object p1, p0, LN7/b;->c:LV0/a;

    .line 88
    .line 89
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 90
    .line 91
    invoke-virtual {p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t(I)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final F(Landroid/view/View;FF)V
    .locals 7

    .line 1
    iget v0, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN7/b;->c:LV0/a;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lad/L;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    cmpg-float v3, p2, v2

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    if-gez v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    int-to-float v3, v3

    .line 27
    iget-object v5, v1, Lad/L;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 30
    .line 31
    iget v6, v5, Lcom/google/android/material/sidesheet/SideSheetBehavior;->k:F

    .line 32
    .line 33
    mul-float/2addr v6, p2

    .line 34
    add-float/2addr v6, v3

    .line 35
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    cmpl-float v3, v3, v6

    .line 42
    .line 43
    const/4 v6, 0x5

    .line 44
    if-lez v3, :cond_3

    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    cmpl-float p2, p2, v2

    .line 55
    .line 56
    if-lez p2, :cond_1

    .line 57
    .line 58
    const/16 p2, 0x1f4

    .line 59
    .line 60
    int-to-float p2, p2

    .line 61
    cmpl-float p2, p3, p2

    .line 62
    .line 63
    if-lez p2, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iget p3, v5, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 71
    .line 72
    invoke-virtual {v1}, Lad/L;->o()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    sub-int/2addr p3, v1

    .line 77
    div-int/lit8 p3, p3, 0x2

    .line 78
    .line 79
    if-le p2, p3, :cond_5

    .line 80
    .line 81
    :cond_2
    :goto_0
    move v4, v6

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    cmpl-float v2, p2, v2

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    cmpl-float p2, p2, p3

    .line 96
    .line 97
    if-lez p2, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    invoke-virtual {v1}, Lad/L;->o()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    sub-int p3, p2, p3

    .line 109
    .line 110
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    iget v1, v5, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 115
    .line 116
    sub-int/2addr p2, v1

    .line 117
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-ge p3, p2, :cond_2

    .line 122
    .line 123
    :cond_5
    :goto_1
    const/4 p2, 0x1

    .line 124
    invoke-virtual {v0, p1, v4, p2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_0
    const/4 v0, 0x0

    .line 129
    cmpg-float v1, p3, v0

    .line 130
    .line 131
    const/4 v2, 0x6

    .line 132
    const/4 v3, 0x3

    .line 133
    iget-object v4, p0, LN7/b;->c:LV0/a;

    .line 134
    .line 135
    check-cast v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 136
    .line 137
    if-gez v1, :cond_8

    .line 138
    .line 139
    iget-boolean p2, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 140
    .line 141
    if-eqz p2, :cond_7

    .line 142
    .line 143
    :cond_6
    :goto_2
    move v2, v3

    .line 144
    goto/16 :goto_4

    .line 145
    .line 146
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget p3, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 157
    .line 158
    if-le p2, p3, :cond_6

    .line 159
    .line 160
    goto/16 :goto_4

    .line 161
    .line 162
    :cond_8
    iget-boolean v1, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:Z

    .line 163
    .line 164
    if-eqz v1, :cond_d

    .line 165
    .line 166
    invoke-virtual {v4, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(Landroid/view/View;F)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_d

    .line 171
    .line 172
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    cmpg-float p2, p2, v0

    .line 181
    .line 182
    if-gez p2, :cond_9

    .line 183
    .line 184
    iget p2, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:I

    .line 185
    .line 186
    int-to-float p2, p2

    .line 187
    cmpl-float p2, p3, p2

    .line 188
    .line 189
    if-gtz p2, :cond_a

    .line 190
    .line 191
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    iget p3, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:I

    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    add-int/2addr v0, p3

    .line 202
    div-int/lit8 v0, v0, 0x2

    .line 203
    .line 204
    if-le p2, v0, :cond_b

    .line 205
    .line 206
    :cond_a
    const/4 v2, 0x5

    .line 207
    goto/16 :goto_4

    .line 208
    .line 209
    :cond_b
    iget-boolean p2, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 210
    .line 211
    if-eqz p2, :cond_c

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    invoke-virtual {v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w()I

    .line 219
    .line 220
    .line 221
    move-result p3

    .line 222
    sub-int/2addr p2, p3

    .line 223
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 228
    .line 229
    .line 230
    move-result p3

    .line 231
    iget v0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 232
    .line 233
    sub-int/2addr p3, v0

    .line 234
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 235
    .line 236
    .line 237
    move-result p3

    .line 238
    if-ge p2, p3, :cond_15

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_d
    cmpl-float v0, p3, v0

    .line 242
    .line 243
    const/4 v1, 0x4

    .line 244
    if-eqz v0, :cond_11

    .line 245
    .line 246
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 251
    .line 252
    .line 253
    move-result p3

    .line 254
    cmpl-float p2, p2, p3

    .line 255
    .line 256
    if-lez p2, :cond_e

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_e
    iget-boolean p2, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 260
    .line 261
    if-eqz p2, :cond_10

    .line 262
    .line 263
    :cond_f
    move v2, v1

    .line 264
    goto :goto_4

    .line 265
    :cond_10
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    iget p3, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 270
    .line 271
    sub-int p3, p2, p3

    .line 272
    .line 273
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 274
    .line 275
    .line 276
    move-result p3

    .line 277
    iget v0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:I

    .line 278
    .line 279
    sub-int/2addr p2, v0

    .line 280
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    if-ge p3, p2, :cond_f

    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_11
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 291
    .line 292
    .line 293
    move-result p2

    .line 294
    iget-boolean p3, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 295
    .line 296
    if-eqz p3, :cond_12

    .line 297
    .line 298
    iget p3, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D:I

    .line 299
    .line 300
    sub-int p3, p2, p3

    .line 301
    .line 302
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 303
    .line 304
    .line 305
    move-result p3

    .line 306
    iget v0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:I

    .line 307
    .line 308
    sub-int/2addr p2, v0

    .line 309
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 310
    .line 311
    .line 312
    move-result p2

    .line 313
    if-ge p3, p2, :cond_f

    .line 314
    .line 315
    goto/16 :goto_2

    .line 316
    .line 317
    :cond_12
    iget p3, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 318
    .line 319
    if-ge p2, p3, :cond_14

    .line 320
    .line 321
    iget p3, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:I

    .line 322
    .line 323
    sub-int p3, p2, p3

    .line 324
    .line 325
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 326
    .line 327
    .line 328
    move-result p3

    .line 329
    if-ge p2, p3, :cond_13

    .line 330
    .line 331
    goto/16 :goto_2

    .line 332
    .line 333
    :cond_13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_14
    sub-int p3, p2, p3

    .line 338
    .line 339
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 340
    .line 341
    .line 342
    move-result p3

    .line 343
    iget v0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:I

    .line 344
    .line 345
    sub-int/2addr p2, v0

    .line 346
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 347
    .line 348
    .line 349
    move-result p2

    .line 350
    if-ge p3, p2, :cond_f

    .line 351
    .line 352
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    :cond_15
    :goto_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    const/4 p2, 0x1

    .line 359
    invoke-virtual {v4, p1, v2, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(Landroid/view/View;IZ)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final N(ILandroid/view/View;)Z
    .locals 4

    .line 1
    iget v0, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LN7/b;->c:LV0/a;

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 9
    .line 10
    iget v0, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-ne p1, p2, :cond_1

    .line 26
    .line 27
    move v1, v2

    .line 28
    :cond_1
    :goto_0
    return v1

    .line 29
    :pswitch_0
    iget-object v0, p0, LN7/b;->c:LV0/a;

    .line 30
    .line 31
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 32
    .line 33
    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-ne v1, v2, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-boolean v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a0:Z

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    const/4 v3, 0x3

    .line 45
    if-ne v1, v3, :cond_5

    .line 46
    .line 47
    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 48
    .line 49
    if-ne v1, p1, :cond_5

    .line 50
    .line 51
    iget-object p1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroid/view/View;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    const/4 p1, 0x0

    .line 63
    :goto_1
    if-eqz p1, :cond_5

    .line 64
    .line 65
    const/4 v1, -0x1

    .line 66
    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    iget-object p1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    .line 77
    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, p2, :cond_6

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_6
    :goto_2
    const/4 v2, 0x0

    .line 88
    :goto_3
    return v2

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(ILandroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LN7/b;->c:LV0/a;

    .line 7
    .line 8
    check-cast p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 9
    .line 10
    iget-object v0, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:Lad/L;

    .line 11
    .line 12
    invoke-virtual {v0}, Lad/L;->o()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p2, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 17
    .line 18
    invoke-static {p1, v0, p2}, LS3/f;->m(III)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(ILandroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object p2, p0, LN7/b;->c:LV0/a;

    .line 12
    .line 13
    check-cast p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p0}, LN7/b;->y()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1, p2, v0}, LS3/f;->m(III)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public x(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/a;->x(Landroid/view/View;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object p1, p0, LN7/b;->c:LV0/a;

    .line 12
    .line 13
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 14
    .line 15
    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 16
    .line 17
    return p1

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public y()I
    .locals 2

    .line 1
    iget v0, p0, LN7/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, La/a;->y()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LN7/b;->c:LV0/a;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    iget-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->T:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G:I

    .line 23
    .line 24
    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
