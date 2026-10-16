.class public final Landroidx/fragment/app/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    return-void
.end method

.method public static f(Lx/e;Landroid/view/View;)V
    .locals 4

    .line 1
    sget-object v0, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Lk1/J;->f(Landroid/view/View;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v2}, Landroidx/fragment/app/o;->f(Lx/e;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
.end method

.method public static final j(Landroid/view/ViewGroup;Landroidx/fragment/app/e0;)Landroidx/fragment/app/o;
    .locals 2

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fragmentManager"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/fragment/app/e0;->H()Landroidx/fragment/app/X;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "fragmentManager.specialEffectsControllerFactory"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const p1, 0x7f0a0268

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v1, v0, Landroidx/fragment/app/o;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    check-cast v0, Landroidx/fragment/app/o;

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    new-instance v0, Landroidx/fragment/app/o;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Landroidx/fragment/app/o;-><init>(Landroid/view/ViewGroup;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/A0;)V
    .locals 3

    .line 1
    const-string v0, "operation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Landroidx/fragment/app/A0;->i:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget v0, p1, Landroidx/fragment/app/A0;->a:I

    .line 11
    .line 12
    iget-object v1, p1, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/fragment/app/F;->requireView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "operation.fragment.requireView()"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, LVa/M6;->g(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p1, Landroidx/fragment/app/A0;->i:Z

    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final b(Ljava/util/ArrayList;Z)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v14, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x2

    .line 15
    const-string v6, "Unknown visibility "

    .line 16
    .line 17
    const/16 v7, 0x8

    .line 18
    .line 19
    const/4 v8, 0x4

    .line 20
    const/4 v9, 0x0

    .line 21
    const-string v10, "operation.fragment.mView"

    .line 22
    .line 23
    if-eqz v4, :cond_4

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    move-object v12, v4

    .line 30
    check-cast v12, Landroidx/fragment/app/A0;

    .line 31
    .line 32
    iget-object v13, v12, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 33
    .line 34
    iget-object v13, v13, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 35
    .line 36
    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v13}, Landroid/view/View;->getAlpha()F

    .line 40
    .line 41
    .line 42
    move-result v16

    .line 43
    cmpg-float v16, v16, v9

    .line 44
    .line 45
    if-nez v16, :cond_1

    .line 46
    .line 47
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 48
    .line 49
    .line 50
    move-result v16

    .line 51
    if-nez v16, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-eqz v13, :cond_3

    .line 59
    .line 60
    if-eq v13, v8, :cond_0

    .line 61
    .line 62
    if-ne v13, v7, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    invoke-static {v13, v6}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :cond_3
    iget v12, v12, Landroidx/fragment/app/A0;->a:I

    .line 76
    .line 77
    if-eq v12, v5, :cond_0

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    const/4 v4, 0x0

    .line 81
    :goto_1
    move-object v3, v4

    .line 82
    check-cast v3, Landroidx/fragment/app/A0;

    .line 83
    .line 84
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    move-object/from16 v12, p1

    .line 89
    .line 90
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    :goto_2
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    if-eqz v13, :cond_9

    .line 99
    .line 100
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    move/from16 v16, v9

    .line 105
    .line 106
    move-object v9, v13

    .line 107
    check-cast v9, Landroidx/fragment/app/A0;

    .line 108
    .line 109
    iget-object v15, v9, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 110
    .line 111
    iget-object v15, v15, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 112
    .line 113
    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v15}, Landroid/view/View;->getAlpha()F

    .line 117
    .line 118
    .line 119
    move-result v17

    .line 120
    cmpg-float v17, v17, v16

    .line 121
    .line 122
    if-nez v17, :cond_5

    .line 123
    .line 124
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 125
    .line 126
    .line 127
    move-result v17

    .line 128
    if-nez v17, :cond_5

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 132
    .line 133
    .line 134
    move-result v15

    .line 135
    if-eqz v15, :cond_8

    .line 136
    .line 137
    if-eq v15, v8, :cond_7

    .line 138
    .line 139
    if-ne v15, v7, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    invoke-static {v15, v6}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_7
    :goto_3
    iget v9, v9, Landroidx/fragment/app/A0;->a:I

    .line 153
    .line 154
    if-ne v9, v5, :cond_8

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_8
    move/from16 v9, v16

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_9
    const/4 v13, 0x0

    .line 161
    :goto_4
    move-object v4, v13

    .line 162
    check-cast v4, Landroidx/fragment/app/A0;

    .line 163
    .line 164
    invoke-static {v5}, Landroidx/fragment/app/e0;->J(I)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    const-string v15, "FragmentManager"

    .line 169
    .line 170
    if-eqz v6, :cond_a

    .line 171
    .line 172
    new-instance v6, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v7, "Executing operations from "

    .line 175
    .line 176
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v7, " to "

    .line 183
    .line 184
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {v15, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    :cond_a
    new-instance v6, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 200
    .line 201
    .line 202
    new-instance v7, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-static {v12}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    check-cast v8, Landroidx/fragment/app/A0;

    .line 212
    .line 213
    iget-object v8, v8, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 214
    .line 215
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    if-eqz v10, :cond_b

    .line 224
    .line 225
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    check-cast v10, Landroidx/fragment/app/A0;

    .line 230
    .line 231
    iget-object v10, v10, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 232
    .line 233
    iget-object v10, v10, Landroidx/fragment/app/F;->mAnimationInfo:Landroidx/fragment/app/C;

    .line 234
    .line 235
    iget-object v13, v8, Landroidx/fragment/app/F;->mAnimationInfo:Landroidx/fragment/app/C;

    .line 236
    .line 237
    move/from16 v16, v5

    .line 238
    .line 239
    iget v5, v13, Landroidx/fragment/app/C;->b:I

    .line 240
    .line 241
    iput v5, v10, Landroidx/fragment/app/C;->b:I

    .line 242
    .line 243
    iget v5, v13, Landroidx/fragment/app/C;->c:I

    .line 244
    .line 245
    iput v5, v10, Landroidx/fragment/app/C;->c:I

    .line 246
    .line 247
    iget v5, v13, Landroidx/fragment/app/C;->d:I

    .line 248
    .line 249
    iput v5, v10, Landroidx/fragment/app/C;->d:I

    .line 250
    .line 251
    iget v5, v13, Landroidx/fragment/app/C;->e:I

    .line 252
    .line 253
    iput v5, v10, Landroidx/fragment/app/C;->e:I

    .line 254
    .line 255
    move/from16 v5, v16

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_b
    move/from16 v16, v5

    .line 259
    .line 260
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    const/4 v9, 0x0

    .line 269
    if-eqz v8, :cond_e

    .line 270
    .line 271
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    check-cast v8, Landroidx/fragment/app/A0;

    .line 276
    .line 277
    new-instance v10, Landroidx/fragment/app/f;

    .line 278
    .line 279
    invoke-direct {v10, v8, v14}, Landroidx/fragment/app/f;-><init>(Landroidx/fragment/app/A0;Z)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    new-instance v10, Landroidx/fragment/app/n;

    .line 286
    .line 287
    if-eqz v14, :cond_c

    .line 288
    .line 289
    if-ne v8, v3, :cond_d

    .line 290
    .line 291
    :goto_7
    move v9, v2

    .line 292
    goto :goto_8

    .line 293
    :cond_c
    if-ne v8, v4, :cond_d

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_d
    :goto_8
    invoke-direct {v10, v8, v14, v9}, Landroidx/fragment/app/n;-><init>(Landroidx/fragment/app/A0;ZZ)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    new-instance v9, Landroidx/fragment/app/y0;

    .line 303
    .line 304
    invoke-direct {v9, v0, v8, v2}, Landroidx/fragment/app/y0;-><init>(Landroidx/fragment/app/o;Landroidx/fragment/app/A0;I)V

    .line 305
    .line 306
    .line 307
    iget-object v8, v8, Landroidx/fragment/app/A0;->d:Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_e
    new-instance v5, Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    :cond_f
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v8

    .line 326
    if-eqz v8, :cond_10

    .line 327
    .line 328
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    move-object v10, v8

    .line 333
    check-cast v10, Landroidx/fragment/app/n;

    .line 334
    .line 335
    invoke-virtual {v10}, Landroidx/fragment/app/k;->a()Z

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    if-nez v10, :cond_f

    .line 340
    .line 341
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_10
    new-instance v7, Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    :cond_11
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v8

    .line 358
    if-eqz v8, :cond_12

    .line 359
    .line 360
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    move-object v10, v8

    .line 365
    check-cast v10, Landroidx/fragment/app/n;

    .line 366
    .line 367
    invoke-virtual {v10}, Landroidx/fragment/app/n;->b()Landroidx/fragment/app/v0;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    if-eqz v10, :cond_11

    .line 372
    .line 373
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    goto :goto_a

    .line 377
    :cond_12
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    move-object v8, v5

    .line 382
    const/4 v5, 0x0

    .line 383
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    if-eqz v10, :cond_15

    .line 388
    .line 389
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    check-cast v10, Landroidx/fragment/app/n;

    .line 394
    .line 395
    invoke-virtual {v10}, Landroidx/fragment/app/n;->b()Landroidx/fragment/app/v0;

    .line 396
    .line 397
    .line 398
    move-result-object v12

    .line 399
    if-eqz v5, :cond_14

    .line 400
    .line 401
    if-ne v12, v5, :cond_13

    .line 402
    .line 403
    goto :goto_c

    .line 404
    :cond_13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    const-string v2, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 407
    .line 408
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget-object v2, v10, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 412
    .line 413
    iget-object v2, v2, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 414
    .line 415
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v2, " returned Transition "

    .line 419
    .line 420
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    iget-object v2, v10, Landroidx/fragment/app/n;->b:Ljava/lang/Object;

    .line 424
    .line 425
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    const-string v2, " which uses a different Transition type than other Fragments."

    .line 429
    .line 430
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    throw v2

    .line 447
    :cond_14
    :goto_c
    move-object v5, v12

    .line 448
    goto :goto_b

    .line 449
    :cond_15
    if-nez v5, :cond_16

    .line 450
    .line 451
    move-object/from16 v20, v6

    .line 452
    .line 453
    move/from16 v17, v16

    .line 454
    .line 455
    move/from16 v16, v2

    .line 456
    .line 457
    goto/16 :goto_1a

    .line 458
    .line 459
    :cond_16
    move v8, v2

    .line 460
    move-object v2, v7

    .line 461
    new-instance v7, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 464
    .line 465
    .line 466
    move v10, v8

    .line 467
    new-instance v8, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    new-instance v12, Lx/e;

    .line 473
    .line 474
    invoke-direct {v12, v9}, Lx/v;-><init>(I)V

    .line 475
    .line 476
    .line 477
    new-instance v13, Ljava/util/ArrayList;

    .line 478
    .line 479
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 480
    .line 481
    .line 482
    new-instance v17, Ljava/util/ArrayList;

    .line 483
    .line 484
    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 485
    .line 486
    .line 487
    move/from16 p1, v10

    .line 488
    .line 489
    new-instance v10, Lx/e;

    .line 490
    .line 491
    invoke-direct {v10, v9}, Lx/v;-><init>(I)V

    .line 492
    .line 493
    .line 494
    move-object/from16 v18, v13

    .line 495
    .line 496
    new-instance v13, Lx/e;

    .line 497
    .line 498
    invoke-direct {v13, v9}, Lx/v;-><init>(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object v19

    .line 505
    move-object/from16 v20, v6

    .line 506
    .line 507
    const/4 v6, 0x0

    .line 508
    :goto_d
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 509
    .line 510
    .line 511
    move-result v21

    .line 512
    if-eqz v21, :cond_27

    .line 513
    .line 514
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v21

    .line 518
    move-object/from16 v9, v21

    .line 519
    .line 520
    check-cast v9, Landroidx/fragment/app/n;

    .line 521
    .line 522
    iget-object v9, v9, Landroidx/fragment/app/n;->d:Ljava/lang/Object;

    .line 523
    .line 524
    if-eqz v9, :cond_26

    .line 525
    .line 526
    if-eqz v3, :cond_26

    .line 527
    .line 528
    if-eqz v4, :cond_26

    .line 529
    .line 530
    invoke-virtual {v5, v9}, Landroidx/fragment/app/v0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v6

    .line 534
    invoke-virtual {v5, v6}, Landroidx/fragment/app/v0;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    iget-object v9, v4, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 539
    .line 540
    invoke-virtual {v9}, Landroidx/fragment/app/F;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 541
    .line 542
    .line 543
    move-result-object v11

    .line 544
    const-string v1, "lastIn.fragment.sharedElementSourceNames"

    .line 545
    .line 546
    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v3, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 550
    .line 551
    move-object/from16 v22, v2

    .line 552
    .line 553
    invoke-virtual {v1}, Landroidx/fragment/app/F;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    move-object/from16 v23, v5

    .line 558
    .line 559
    const-string v5, "firstOut.fragment.sharedElementSourceNames"

    .line 560
    .line 561
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1}, Landroidx/fragment/app/F;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    move-object/from16 v24, v7

    .line 569
    .line 570
    const-string v7, "firstOut.fragment.sharedElementTargetNames"

    .line 571
    .line 572
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    move-object/from16 v25, v8

    .line 580
    .line 581
    const/4 v8, 0x0

    .line 582
    :goto_e
    if-ge v8, v7, :cond_18

    .line 583
    .line 584
    move/from16 v17, v7

    .line 585
    .line 586
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 591
    .line 592
    .line 593
    move-result v7

    .line 594
    move-object/from16 v18, v5

    .line 595
    .line 596
    const/4 v5, -0x1

    .line 597
    if-eq v7, v5, :cond_17

    .line 598
    .line 599
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    invoke-virtual {v11, v7, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    :cond_17
    add-int/lit8 v8, v8, 0x1

    .line 607
    .line 608
    move/from16 v7, v17

    .line 609
    .line 610
    move-object/from16 v5, v18

    .line 611
    .line 612
    goto :goto_e

    .line 613
    :cond_18
    invoke-virtual {v9}, Landroidx/fragment/app/F;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const-string v5, "lastIn.fragment.sharedElementTargetNames"

    .line 618
    .line 619
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    if-nez v14, :cond_19

    .line 623
    .line 624
    invoke-virtual {v1}, Landroidx/fragment/app/F;->getExitTransitionCallback()LX0/U;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v9}, Landroidx/fragment/app/F;->getEnterTransitionCallback()LX0/U;

    .line 628
    .line 629
    .line 630
    new-instance v5, Lef/k;

    .line 631
    .line 632
    const/4 v7, 0x0

    .line 633
    invoke-direct {v5, v7, v7}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    goto :goto_f

    .line 637
    :cond_19
    const/4 v7, 0x0

    .line 638
    invoke-virtual {v1}, Landroidx/fragment/app/F;->getEnterTransitionCallback()LX0/U;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v9}, Landroidx/fragment/app/F;->getExitTransitionCallback()LX0/U;

    .line 642
    .line 643
    .line 644
    new-instance v5, Lef/k;

    .line 645
    .line 646
    invoke-direct {v5, v7, v7}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    :goto_f
    iget-object v8, v5, Lef/k;->a:Ljava/lang/Object;

    .line 650
    .line 651
    if-nez v8, :cond_25

    .line 652
    .line 653
    iget-object v5, v5, Lef/k;->b:Ljava/lang/Object;

    .line 654
    .line 655
    if-nez v5, :cond_24

    .line 656
    .line 657
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 658
    .line 659
    .line 660
    move-result v5

    .line 661
    const/4 v8, 0x0

    .line 662
    :goto_10
    if-ge v8, v5, :cond_1a

    .line 663
    .line 664
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v7

    .line 668
    move/from16 v17, v5

    .line 669
    .line 670
    const-string v5, "exitingNames[i]"

    .line 671
    .line 672
    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    check-cast v7, Ljava/lang/String;

    .line 676
    .line 677
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    move/from16 v18, v8

    .line 682
    .line 683
    const-string v8, "enteringNames[i]"

    .line 684
    .line 685
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    check-cast v5, Ljava/lang/String;

    .line 689
    .line 690
    invoke-virtual {v12, v7, v5}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    add-int/lit8 v8, v18, 0x1

    .line 694
    .line 695
    move/from16 v5, v17

    .line 696
    .line 697
    const/4 v7, 0x0

    .line 698
    goto :goto_10

    .line 699
    :cond_1a
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/e0;->J(I)Z

    .line 700
    .line 701
    .line 702
    move-result v5

    .line 703
    if-eqz v5, :cond_1c

    .line 704
    .line 705
    const-string v5, ">>> entering view names <<<"

    .line 706
    .line 707
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 708
    .line 709
    .line 710
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 711
    .line 712
    .line 713
    move-result-object v5

    .line 714
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v7

    .line 718
    const-string v8, "Name: "

    .line 719
    .line 720
    if-eqz v7, :cond_1b

    .line 721
    .line 722
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v7

    .line 726
    check-cast v7, Ljava/lang/String;

    .line 727
    .line 728
    move-object/from16 v17, v5

    .line 729
    .line 730
    new-instance v5, Ljava/lang/StringBuilder;

    .line 731
    .line 732
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 743
    .line 744
    .line 745
    move-object/from16 v5, v17

    .line 746
    .line 747
    goto :goto_11

    .line 748
    :cond_1b
    const-string v5, ">>> exiting view names <<<"

    .line 749
    .line 750
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 751
    .line 752
    .line 753
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    :goto_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 758
    .line 759
    .line 760
    move-result v7

    .line 761
    if-eqz v7, :cond_1c

    .line 762
    .line 763
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v7

    .line 767
    check-cast v7, Ljava/lang/String;

    .line 768
    .line 769
    move-object/from16 v17, v5

    .line 770
    .line 771
    new-instance v5, Ljava/lang/StringBuilder;

    .line 772
    .line 773
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v5

    .line 783
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 784
    .line 785
    .line 786
    move-object/from16 v5, v17

    .line 787
    .line 788
    goto :goto_12

    .line 789
    :cond_1c
    iget-object v1, v1, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 790
    .line 791
    const-string v5, "firstOut.fragment.mView"

    .line 792
    .line 793
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    invoke-static {v10, v1}, Landroidx/fragment/app/o;->f(Lx/e;Landroid/view/View;)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v10, v11}, Lx/e;->n(Ljava/util/Collection;)Z

    .line 800
    .line 801
    .line 802
    invoke-virtual {v10}, Lx/e;->keySet()Ljava/util/Set;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-virtual {v12, v1}, Lx/e;->n(Ljava/util/Collection;)Z

    .line 807
    .line 808
    .line 809
    iget-object v1, v9, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 810
    .line 811
    const-string v5, "lastIn.fragment.mView"

    .line 812
    .line 813
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-static {v13, v1}, Landroidx/fragment/app/o;->f(Lx/e;Landroid/view/View;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v13, v2}, Lx/e;->n(Ljava/util/Collection;)Z

    .line 820
    .line 821
    .line 822
    invoke-virtual {v12}, Lx/e;->values()Ljava/util/Collection;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-virtual {v13, v1}, Lx/e;->n(Ljava/util/Collection;)Z

    .line 827
    .line 828
    .line 829
    sget-object v1, Landroidx/fragment/app/o0;->a:Landroidx/fragment/app/t0;

    .line 830
    .line 831
    iget v1, v12, Lx/v;->c:I

    .line 832
    .line 833
    add-int/lit8 v1, v1, -0x1

    .line 834
    .line 835
    const/4 v5, -0x1

    .line 836
    :goto_13
    if-ge v5, v1, :cond_1e

    .line 837
    .line 838
    invoke-virtual {v12, v1}, Lx/v;->k(I)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v7

    .line 842
    check-cast v7, Ljava/lang/String;

    .line 843
    .line 844
    invoke-virtual {v13, v7}, Lx/v;->containsKey(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v7

    .line 848
    if-nez v7, :cond_1d

    .line 849
    .line 850
    invoke-virtual {v12, v1}, Lx/v;->i(I)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    :cond_1d
    add-int/2addr v1, v5

    .line 854
    goto :goto_13

    .line 855
    :cond_1e
    invoke-virtual {v12}, Lx/e;->keySet()Ljava/util/Set;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    invoke-virtual {v10}, Lx/e;->entrySet()Ljava/util/Set;

    .line 860
    .line 861
    .line 862
    move-result-object v7

    .line 863
    new-instance v8, LR/b;

    .line 864
    .line 865
    const/4 v9, 0x3

    .line 866
    invoke-direct {v8, v9, v1}, LR/b;-><init>(ILjava/util/Collection;)V

    .line 867
    .line 868
    .line 869
    check-cast v7, Landroidx/datastore/preferences/protobuf/i0;

    .line 870
    .line 871
    invoke-virtual {v7}, Landroidx/datastore/preferences/protobuf/i0;->iterator()Ljava/util/Iterator;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    :cond_1f
    :goto_14
    move-object v7, v1

    .line 876
    check-cast v7, Lx/c;

    .line 877
    .line 878
    invoke-virtual {v7}, Lx/c;->hasNext()Z

    .line 879
    .line 880
    .line 881
    move-result v9

    .line 882
    if-eqz v9, :cond_20

    .line 883
    .line 884
    invoke-virtual {v7}, Lx/c;->next()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v8, v7}, LR/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v9

    .line 891
    check-cast v9, Ljava/lang/Boolean;

    .line 892
    .line 893
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 894
    .line 895
    .line 896
    move-result v9

    .line 897
    if-nez v9, :cond_1f

    .line 898
    .line 899
    invoke-virtual {v7}, Lx/c;->remove()V

    .line 900
    .line 901
    .line 902
    goto :goto_14

    .line 903
    :cond_20
    invoke-virtual {v12}, Lx/e;->values()Ljava/util/Collection;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-virtual {v13}, Lx/e;->entrySet()Ljava/util/Set;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    new-instance v8, LR/b;

    .line 912
    .line 913
    const/4 v9, 0x3

    .line 914
    invoke-direct {v8, v9, v1}, LR/b;-><init>(ILjava/util/Collection;)V

    .line 915
    .line 916
    .line 917
    check-cast v7, Landroidx/datastore/preferences/protobuf/i0;

    .line 918
    .line 919
    invoke-virtual {v7}, Landroidx/datastore/preferences/protobuf/i0;->iterator()Ljava/util/Iterator;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    :cond_21
    :goto_15
    move-object v7, v1

    .line 924
    check-cast v7, Lx/c;

    .line 925
    .line 926
    invoke-virtual {v7}, Lx/c;->hasNext()Z

    .line 927
    .line 928
    .line 929
    move-result v9

    .line 930
    if-eqz v9, :cond_22

    .line 931
    .line 932
    invoke-virtual {v7}, Lx/c;->next()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v8, v7}, LR/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v9

    .line 939
    check-cast v9, Ljava/lang/Boolean;

    .line 940
    .line 941
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 942
    .line 943
    .line 944
    move-result v9

    .line 945
    if-nez v9, :cond_21

    .line 946
    .line 947
    invoke-virtual {v7}, Lx/c;->remove()V

    .line 948
    .line 949
    .line 950
    goto :goto_15

    .line 951
    :cond_22
    invoke-virtual {v12}, Lx/v;->isEmpty()Z

    .line 952
    .line 953
    .line 954
    move-result v1

    .line 955
    if-eqz v1, :cond_23

    .line 956
    .line 957
    new-instance v1, Ljava/lang/StringBuilder;

    .line 958
    .line 959
    const-string v7, "Ignoring shared elements transition "

    .line 960
    .line 961
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 965
    .line 966
    .line 967
    const-string v6, " between "

    .line 968
    .line 969
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 973
    .line 974
    .line 975
    const-string v6, " and "

    .line 976
    .line 977
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    .line 980
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 981
    .line 982
    .line 983
    const-string v6, " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."

    .line 984
    .line 985
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 986
    .line 987
    .line 988
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    invoke-static {v15, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->clear()V

    .line 996
    .line 997
    .line 998
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->clear()V

    .line 999
    .line 1000
    .line 1001
    move-object/from16 v18, v2

    .line 1002
    .line 1003
    move-object/from16 v17, v11

    .line 1004
    .line 1005
    move-object/from16 v2, v22

    .line 1006
    .line 1007
    move-object/from16 v5, v23

    .line 1008
    .line 1009
    move-object/from16 v7, v24

    .line 1010
    .line 1011
    move-object/from16 v8, v25

    .line 1012
    .line 1013
    const/4 v6, 0x0

    .line 1014
    :goto_16
    const/4 v9, 0x0

    .line 1015
    goto/16 :goto_d

    .line 1016
    .line 1017
    :cond_23
    move-object/from16 v18, v2

    .line 1018
    .line 1019
    move-object/from16 v17, v11

    .line 1020
    .line 1021
    :goto_17
    move-object/from16 v2, v22

    .line 1022
    .line 1023
    move-object/from16 v5, v23

    .line 1024
    .line 1025
    move-object/from16 v7, v24

    .line 1026
    .line 1027
    move-object/from16 v8, v25

    .line 1028
    .line 1029
    goto :goto_16

    .line 1030
    :cond_24
    new-instance v1, Ljava/lang/ClassCastException;

    .line 1031
    .line 1032
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1033
    .line 1034
    .line 1035
    throw v1

    .line 1036
    :cond_25
    new-instance v1, Ljava/lang/ClassCastException;

    .line 1037
    .line 1038
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1039
    .line 1040
    .line 1041
    throw v1

    .line 1042
    :cond_26
    move-object/from16 v22, v2

    .line 1043
    .line 1044
    move-object/from16 v23, v5

    .line 1045
    .line 1046
    move-object/from16 v24, v7

    .line 1047
    .line 1048
    move-object/from16 v25, v8

    .line 1049
    .line 1050
    const/4 v5, -0x1

    .line 1051
    goto :goto_17

    .line 1052
    :cond_27
    move-object/from16 v22, v2

    .line 1053
    .line 1054
    move-object/from16 v23, v5

    .line 1055
    .line 1056
    move-object/from16 v24, v7

    .line 1057
    .line 1058
    move-object/from16 v25, v8

    .line 1059
    .line 1060
    if-nez v6, :cond_2a

    .line 1061
    .line 1062
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1063
    .line 1064
    .line 1065
    move-result v1

    .line 1066
    if-eqz v1, :cond_29

    .line 1067
    .line 1068
    :cond_28
    move/from16 v17, v16

    .line 1069
    .line 1070
    move/from16 v16, p1

    .line 1071
    .line 1072
    goto :goto_1a

    .line 1073
    :cond_29
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1078
    .line 1079
    .line 1080
    move-result v2

    .line 1081
    if-eqz v2, :cond_28

    .line 1082
    .line 1083
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v2

    .line 1087
    check-cast v2, Landroidx/fragment/app/n;

    .line 1088
    .line 1089
    iget-object v2, v2, Landroidx/fragment/app/n;->b:Ljava/lang/Object;

    .line 1090
    .line 1091
    if-nez v2, :cond_2a

    .line 1092
    .line 1093
    goto :goto_18

    .line 1094
    :cond_2a
    new-instance v1, Landroidx/fragment/app/m;

    .line 1095
    .line 1096
    move-object v9, v12

    .line 1097
    move-object/from16 v11, v17

    .line 1098
    .line 1099
    move-object/from16 v2, v22

    .line 1100
    .line 1101
    move-object/from16 v5, v23

    .line 1102
    .line 1103
    move-object/from16 v7, v24

    .line 1104
    .line 1105
    move-object/from16 v8, v25

    .line 1106
    .line 1107
    move-object v12, v10

    .line 1108
    move/from16 v17, v16

    .line 1109
    .line 1110
    move-object/from16 v10, v18

    .line 1111
    .line 1112
    move/from16 v16, p1

    .line 1113
    .line 1114
    invoke-direct/range {v1 .. v14}, Landroidx/fragment/app/m;-><init>(Ljava/util/ArrayList;Landroidx/fragment/app/A0;Landroidx/fragment/app/A0;Landroidx/fragment/app/v0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lx/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Lx/e;Lx/e;Z)V

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    if-eqz v3, :cond_2b

    .line 1126
    .line 1127
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v3

    .line 1131
    check-cast v3, Landroidx/fragment/app/n;

    .line 1132
    .line 1133
    iget-object v3, v3, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 1134
    .line 1135
    iget-object v3, v3, Landroidx/fragment/app/A0;->j:Ljava/util/ArrayList;

    .line 1136
    .line 1137
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    goto :goto_19

    .line 1141
    :cond_2b
    :goto_1a
    new-instance v1, Ljava/util/ArrayList;

    .line 1142
    .line 1143
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1144
    .line 1145
    .line 1146
    new-instance v2, Ljava/util/ArrayList;

    .line 1147
    .line 1148
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v3

    .line 1155
    :goto_1b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1156
    .line 1157
    .line 1158
    move-result v4

    .line 1159
    if-eqz v4, :cond_2c

    .line 1160
    .line 1161
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v4

    .line 1165
    check-cast v4, Landroidx/fragment/app/f;

    .line 1166
    .line 1167
    iget-object v4, v4, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 1168
    .line 1169
    iget-object v4, v4, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 1170
    .line 1171
    invoke-static {v4, v2}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_1b

    .line 1175
    :cond_2c
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v2

    .line 1179
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v3

    .line 1183
    const/4 v4, 0x0

    .line 1184
    :cond_2d
    :goto_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1185
    .line 1186
    .line 1187
    move-result v5

    .line 1188
    if-eqz v5, :cond_32

    .line 1189
    .line 1190
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v5

    .line 1194
    check-cast v5, Landroidx/fragment/app/f;

    .line 1195
    .line 1196
    iget-object v6, v0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 1197
    .line 1198
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v6

    .line 1202
    iget-object v7, v5, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 1203
    .line 1204
    const-string v8, "context"

    .line 1205
    .line 1206
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v5, v6}, Landroidx/fragment/app/f;->b(Landroid/content/Context;)Landroidx/fragment/app/K;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v6

    .line 1213
    if-nez v6, :cond_2e

    .line 1214
    .line 1215
    goto :goto_1c

    .line 1216
    :cond_2e
    iget-object v6, v6, Landroidx/fragment/app/K;->b:Ljava/lang/Cloneable;

    .line 1217
    .line 1218
    check-cast v6, Landroid/animation/AnimatorSet;

    .line 1219
    .line 1220
    if-nez v6, :cond_2f

    .line 1221
    .line 1222
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    goto :goto_1c

    .line 1226
    :cond_2f
    iget-object v6, v7, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 1227
    .line 1228
    iget-object v8, v7, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 1229
    .line 1230
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v8

    .line 1234
    if-nez v8, :cond_30

    .line 1235
    .line 1236
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/e0;->J(I)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v5

    .line 1240
    if-eqz v5, :cond_2d

    .line 1241
    .line 1242
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1243
    .line 1244
    const-string v7, "Ignoring Animator set on "

    .line 1245
    .line 1246
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1250
    .line 1251
    .line 1252
    const-string v6, " as this Fragment was involved in a Transition."

    .line 1253
    .line 1254
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v5

    .line 1261
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1262
    .line 1263
    .line 1264
    goto :goto_1c

    .line 1265
    :cond_30
    iget v4, v7, Landroidx/fragment/app/A0;->a:I

    .line 1266
    .line 1267
    const/4 v9, 0x3

    .line 1268
    if-ne v4, v9, :cond_31

    .line 1269
    .line 1270
    const/4 v6, 0x0

    .line 1271
    iput-boolean v6, v7, Landroidx/fragment/app/A0;->i:Z

    .line 1272
    .line 1273
    goto :goto_1d

    .line 1274
    :cond_31
    const/4 v6, 0x0

    .line 1275
    :goto_1d
    new-instance v4, Landroidx/fragment/app/h;

    .line 1276
    .line 1277
    invoke-direct {v4, v5}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/f;)V

    .line 1278
    .line 1279
    .line 1280
    iget-object v5, v7, Landroidx/fragment/app/A0;->j:Ljava/util/ArrayList;

    .line 1281
    .line 1282
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    move/from16 v4, v16

    .line 1286
    .line 1287
    goto :goto_1c

    .line 1288
    :cond_32
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v1

    .line 1292
    :cond_33
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1293
    .line 1294
    .line 1295
    move-result v3

    .line 1296
    if-eqz v3, :cond_36

    .line 1297
    .line 1298
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v3

    .line 1302
    check-cast v3, Landroidx/fragment/app/f;

    .line 1303
    .line 1304
    iget-object v5, v3, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/A0;

    .line 1305
    .line 1306
    iget-object v6, v5, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 1307
    .line 1308
    const-string v7, "Ignoring Animation set on "

    .line 1309
    .line 1310
    if-nez v2, :cond_34

    .line 1311
    .line 1312
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/e0;->J(I)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v3

    .line 1316
    if-eqz v3, :cond_33

    .line 1317
    .line 1318
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1319
    .line 1320
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1324
    .line 1325
    .line 1326
    const-string v5, " as Animations cannot run alongside Transitions."

    .line 1327
    .line 1328
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v3

    .line 1335
    invoke-static {v15, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1336
    .line 1337
    .line 1338
    goto :goto_1e

    .line 1339
    :cond_34
    if-eqz v4, :cond_35

    .line 1340
    .line 1341
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/e0;->J(I)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v3

    .line 1345
    if-eqz v3, :cond_33

    .line 1346
    .line 1347
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1348
    .line 1349
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1353
    .line 1354
    .line 1355
    const-string v5, " as Animations cannot run alongside Animators."

    .line 1356
    .line 1357
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v3

    .line 1364
    invoke-static {v15, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1365
    .line 1366
    .line 1367
    goto :goto_1e

    .line 1368
    :cond_35
    new-instance v6, Landroidx/fragment/app/e;

    .line 1369
    .line 1370
    invoke-direct {v6, v3}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/f;)V

    .line 1371
    .line 1372
    .line 1373
    iget-object v3, v5, Landroidx/fragment/app/A0;->j:Ljava/util/ArrayList;

    .line 1374
    .line 1375
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1376
    .line 1377
    .line 1378
    goto :goto_1e

    .line 1379
    :cond_36
    return-void
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    const-string v0, "operations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroidx/fragment/app/A0;

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {v2, v0}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v0}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Iterable;

    .line 38
    .line 39
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x0

    .line 48
    move v3, v2

    .line 49
    :goto_1
    if-ge v3, v1, :cond_1

    .line 50
    .line 51
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Landroidx/fragment/app/z0;

    .line 56
    .line 57
    iget-object v5, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Landroidx/fragment/app/z0;->c(Landroid/view/ViewGroup;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    move v1, v2

    .line 70
    :goto_2
    if-ge v1, v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Landroidx/fragment/app/A0;

    .line 77
    .line 78
    invoke-virtual {p0, v3}, Landroidx/fragment/app/o;->a(Landroidx/fragment/app/A0;)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-static {p1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    :goto_3
    if-ge v2, v0, :cond_4

    .line 93
    .line 94
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Landroidx/fragment/app/A0;

    .line 99
    .line 100
    iget-object v3, v1, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    invoke-virtual {v1}, Landroidx/fragment/app/A0;->b()V

    .line 109
    .line 110
    .line 111
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    return-void
.end method

.method public final d(IILandroidx/fragment/app/l0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p3, Landroidx/fragment/app/l0;->c:Landroidx/fragment/app/F;

    .line 5
    .line 6
    const-string v2, "fragmentStateManager.fragment"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/fragment/app/o;->g(Landroidx/fragment/app/F;)Landroidx/fragment/app/A0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p3, Landroidx/fragment/app/l0;->c:Landroidx/fragment/app/F;

    .line 18
    .line 19
    iget-boolean v2, v1, Landroidx/fragment/app/F;->mTransitioning:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroidx/fragment/app/o;->h(Landroidx/fragment/app/F;)Landroidx/fragment/app/A0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1, p1, p2}, Landroidx/fragment/app/A0;->d(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :cond_2
    :try_start_1
    new-instance v1, Landroidx/fragment/app/A0;

    .line 39
    .line 40
    invoke-direct {v1, p1, p2, p3}, Landroidx/fragment/app/A0;-><init>(IILandroidx/fragment/app/l0;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    new-instance p1, Landroidx/fragment/app/y0;

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    invoke-direct {p1, p0, v1, p2}, Landroidx/fragment/app/y0;-><init>(Landroidx/fragment/app/o;Landroidx/fragment/app/A0;I)V

    .line 52
    .line 53
    .line 54
    iget-object p2, v1, Landroidx/fragment/app/A0;->d:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    new-instance p1, Landroidx/fragment/app/y0;

    .line 60
    .line 61
    const/4 p2, 0x2

    .line 62
    invoke-direct {p1, p0, v1, p2}, Landroidx/fragment/app/y0;-><init>(Landroidx/fragment/app/o;Landroidx/fragment/app/A0;I)V

    .line 63
    .line 64
    .line 65
    iget-object p2, v1, Landroidx/fragment/app/A0;->d:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    monitor-exit v0

    .line 71
    return-void

    .line 72
    :goto_1
    monitor-exit v0

    .line 73
    throw p1
.end method

.method public final e()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/o;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/o;->i()V

    .line 16
    .line 17
    .line 18
    iput-boolean v1, p0, Landroidx/fragment/app/o;->d:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x2

    .line 31
    if-eqz v2, :cond_5

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {v1}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_17

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Landroidx/fragment/app/A0;

    .line 59
    .line 60
    invoke-static {v3}, Landroidx/fragment/app/e0;->J(I)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    const-string v4, "FragmentManager"

    .line 67
    .line 68
    new-instance v5, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v6, "SpecialEffectsController: Cancelling operation "

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v6, " with no incoming pendingOperations"

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception v1

    .line 95
    goto/16 :goto_d

    .line 96
    .line 97
    :cond_3
    :goto_1
    iget-object v4, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const-string v5, "container"

    .line 103
    .line 104
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-boolean v5, v2, Landroidx/fragment/app/A0;->e:Z

    .line 108
    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    invoke-virtual {v2, v4}, Landroidx/fragment/app/A0;->a(Landroid/view/ViewGroup;)V

    .line 113
    .line 114
    .line 115
    :goto_2
    iget-boolean v4, v2, Landroidx/fragment/app/A0;->f:Z

    .line 116
    .line 117
    if-nez v4, :cond_2

    .line 118
    .line 119
    iget-object v4, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_5
    iget-object v2, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-static {v2}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-object v4, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    const/4 v5, 0x1

    .line 145
    if-eqz v4, :cond_a

    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    check-cast v4, Landroidx/fragment/app/A0;

    .line 152
    .line 153
    invoke-static {v3}, Landroidx/fragment/app/e0;->J(I)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_7

    .line 158
    .line 159
    const-string v6, "FragmentManager"

    .line 160
    .line 161
    new-instance v7, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v8, "SpecialEffectsController: Cancelling operation "

    .line 167
    .line 168
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    :cond_7
    iget-object v6, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 182
    .line 183
    iget-object v7, v4, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 184
    .line 185
    iget-boolean v7, v7, Landroidx/fragment/app/F;->mTransitioning:Z

    .line 186
    .line 187
    const-string v8, "container"

    .line 188
    .line 189
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iget-boolean v8, v4, Landroidx/fragment/app/A0;->e:Z

    .line 193
    .line 194
    if-eqz v8, :cond_8

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    if-eqz v7, :cond_9

    .line 198
    .line 199
    iput-boolean v5, v4, Landroidx/fragment/app/A0;->g:Z

    .line 200
    .line 201
    :cond_9
    invoke-virtual {v4, v6}, Landroidx/fragment/app/A0;->a(Landroid/view/ViewGroup;)V

    .line 202
    .line 203
    .line 204
    :goto_4
    iget-boolean v5, v4, Landroidx/fragment/app/A0;->f:Z

    .line 205
    .line 206
    if-nez v5, :cond_6

    .line 207
    .line 208
    iget-object v5, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/o;->m()V

    .line 215
    .line 216
    .line 217
    iget-object v2, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-static {v2}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    if-eqz v4, :cond_b

    .line 228
    .line 229
    monitor-exit v0

    .line 230
    return-void

    .line 231
    :cond_b
    :try_start_1
    iget-object v4, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 234
    .line 235
    .line 236
    iget-object v4, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 239
    .line 240
    .line 241
    invoke-static {v3}, Landroidx/fragment/app/e0;->J(I)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-eqz v4, :cond_c

    .line 246
    .line 247
    const-string v4, "FragmentManager"

    .line 248
    .line 249
    const-string v6, "SpecialEffectsController: Executing pending operations"

    .line 250
    .line 251
    invoke-static {v4, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    :cond_c
    iget-boolean v4, p0, Landroidx/fragment/app/o;->d:Z

    .line 255
    .line 256
    invoke-virtual {p0, v2, v4}, Landroidx/fragment/app/o;->b(Ljava/util/ArrayList;Z)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    move v6, v5

    .line 264
    move v7, v6

    .line 265
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    if-eqz v8, :cond_12

    .line 270
    .line 271
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    check-cast v7, Landroidx/fragment/app/A0;

    .line 276
    .line 277
    iget-object v8, v7, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    if-nez v8, :cond_10

    .line 284
    .line 285
    iget-object v8, v7, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 286
    .line 287
    instance-of v9, v8, Ljava/util/Collection;

    .line 288
    .line 289
    if-eqz v9, :cond_d

    .line 290
    .line 291
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_d

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    :cond_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    if-eqz v9, :cond_f

    .line 307
    .line 308
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    check-cast v9, Landroidx/fragment/app/z0;

    .line 313
    .line 314
    invoke-virtual {v9}, Landroidx/fragment/app/z0;->a()Z

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-nez v9, :cond_e

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_f
    :goto_6
    move v8, v5

    .line 322
    goto :goto_8

    .line 323
    :cond_10
    :goto_7
    move v8, v1

    .line 324
    :goto_8
    iget-object v7, v7, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 325
    .line 326
    iget-boolean v7, v7, Landroidx/fragment/app/F;->mTransitioning:Z

    .line 327
    .line 328
    if-nez v7, :cond_11

    .line 329
    .line 330
    move v6, v1

    .line 331
    :cond_11
    move v7, v8

    .line 332
    goto :goto_5

    .line 333
    :cond_12
    if-eqz v7, :cond_14

    .line 334
    .line 335
    new-instance v4, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    if-eqz v8, :cond_13

    .line 349
    .line 350
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    check-cast v8, Landroidx/fragment/app/A0;

    .line 355
    .line 356
    iget-object v8, v8, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-static {v8, v4}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 359
    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_13
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-nez v4, :cond_14

    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_14
    move v5, v1

    .line 370
    :goto_a
    if-nez v6, :cond_15

    .line 371
    .line 372
    invoke-virtual {p0, v2}, Landroidx/fragment/app/o;->l(Ljava/util/ArrayList;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0, v2}, Landroidx/fragment/app/o;->c(Ljava/util/ArrayList;)V

    .line 376
    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_15
    if-eqz v5, :cond_16

    .line 380
    .line 381
    invoke-virtual {p0, v2}, Landroidx/fragment/app/o;->l(Ljava/util/ArrayList;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    move v5, v1

    .line 389
    :goto_b
    if-ge v5, v4, :cond_16

    .line 390
    .line 391
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    check-cast v6, Landroidx/fragment/app/A0;

    .line 396
    .line 397
    invoke-virtual {p0, v6}, Landroidx/fragment/app/o;->a(Landroidx/fragment/app/A0;)V

    .line 398
    .line 399
    .line 400
    add-int/lit8 v5, v5, 0x1

    .line 401
    .line 402
    goto :goto_b

    .line 403
    :cond_16
    :goto_c
    iput-boolean v1, p0, Landroidx/fragment/app/o;->d:Z

    .line 404
    .line 405
    invoke-static {v3}, Landroidx/fragment/app/e0;->J(I)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_17

    .line 410
    .line 411
    const-string v1, "FragmentManager"

    .line 412
    .line 413
    const-string v2, "SpecialEffectsController: Finished executing pending operations"

    .line 414
    .line 415
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 416
    .line 417
    .line 418
    :cond_17
    monitor-exit v0

    .line 419
    return-void

    .line 420
    :goto_d
    monitor-exit v0

    .line 421
    throw v1
.end method

.method public final g(Landroidx/fragment/app/F;)Landroidx/fragment/app/A0;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Landroidx/fragment/app/A0;

    .line 19
    .line 20
    iget-object v3, v2, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 21
    .line 22
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    iget-boolean v2, v2, Landroidx/fragment/app/A0;->e:Z

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    :goto_0
    check-cast v1, Landroidx/fragment/app/A0;

    .line 35
    .line 36
    return-object v1
.end method

.method public final h(Landroidx/fragment/app/F;)Landroidx/fragment/app/A0;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Landroidx/fragment/app/A0;

    .line 19
    .line 20
    iget-object v3, v2, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 21
    .line 22
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    iget-boolean v2, v2, Landroidx/fragment/app/A0;->e:Z

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    :goto_0
    check-cast v1, Landroidx/fragment/app/A0;

    .line 35
    .line 36
    return-object v1
.end method

.method public final i()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "FragmentManager"

    .line 9
    .line 10
    const-string v2, "SpecialEffectsController: Forcing all operations to complete"

    .line 11
    .line 12
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    monitor-enter v2

    .line 24
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/o;->m()V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0, v3}, Landroidx/fragment/app/o;->l(Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-static {v3}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Landroidx/fragment/app/A0;

    .line 53
    .line 54
    invoke-static {v0}, Landroidx/fragment/app/e0;->J(I)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const-string v5, ""

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v6, "Container "

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v6, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v6, " is not attached to window. "

    .line 84
    .line 85
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    :goto_1
    const-string v6, "FragmentManager"

    .line 93
    .line 94
    new-instance v7, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v8, "SpecialEffectsController: "

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v5, "Cancelling running operation "

    .line 108
    .line 109
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object v5, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 123
    .line 124
    invoke-virtual {v4, v5}, Landroidx/fragment/app/A0;->a(Landroid/view/ViewGroup;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    iget-object v3, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-static {v3}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Landroidx/fragment/app/A0;

    .line 149
    .line 150
    invoke-static {v0}, Landroidx/fragment/app/e0;->J(I)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    if-eqz v1, :cond_4

    .line 157
    .line 158
    const-string v5, ""

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v6, "Container "

    .line 167
    .line 168
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    iget-object v6, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 172
    .line 173
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v6, " is not attached to window. "

    .line 177
    .line 178
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    :goto_3
    const-string v6, "FragmentManager"

    .line 186
    .line 187
    new-instance v7, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    const-string v8, "SpecialEffectsController: "

    .line 193
    .line 194
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v5, "Cancelling pending operation "

    .line 201
    .line 202
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    :cond_5
    iget-object v5, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 216
    .line 217
    invoke-virtual {v4, v5}, Landroidx/fragment/app/A0;->a(Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_6
    monitor-exit v2

    .line 222
    return-void

    .line 223
    :goto_4
    monitor-exit v2

    .line 224
    throw v0
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/o;->m()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_5

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v4, v2

    .line 29
    check-cast v4, Landroidx/fragment/app/A0;

    .line 30
    .line 31
    iget-object v5, v4, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 32
    .line 33
    iget-object v5, v5, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 34
    .line 35
    const-string v6, "operation.fragment.mView"

    .line 36
    .line 37
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Landroid/view/View;->getAlpha()F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/4 v7, 0x0

    .line 45
    cmpg-float v6, v6, v7

    .line 46
    .line 47
    const/4 v7, 0x2

    .line 48
    const/4 v8, 0x4

    .line 49
    if-nez v6, :cond_1

    .line 50
    .line 51
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    if-eq v5, v8, :cond_4

    .line 65
    .line 66
    const/16 v6, 0x8

    .line 67
    .line 68
    if-ne v5, v6, :cond_2

    .line 69
    .line 70
    const/4 v8, 0x3

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v3, "Unknown visibility "

    .line 77
    .line 78
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_3
    move v8, v7

    .line 93
    :cond_4
    :goto_0
    iget v4, v4, Landroidx/fragment/app/A0;->a:I

    .line 94
    .line 95
    if-ne v4, v7, :cond_0

    .line 96
    .line 97
    if-eq v8, v7, :cond_0

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catchall_0
    move-exception v1

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    move-object v2, v3

    .line 103
    :goto_1
    check-cast v2, Landroidx/fragment/app/A0;

    .line 104
    .line 105
    if-eqz v2, :cond_6

    .line 106
    .line 107
    iget-object v3, v2, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 108
    .line 109
    :cond_6
    if-eqz v3, :cond_7

    .line 110
    .line 111
    invoke-virtual {v3}, Landroidx/fragment/app/F;->isPostponed()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    goto :goto_2

    .line 116
    :cond_7
    const/4 v1, 0x0

    .line 117
    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/o;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    monitor-exit v0

    .line 120
    return-void

    .line 121
    :goto_3
    monitor-exit v0

    .line 122
    throw v1
.end method

.method public final l(Ljava/util/ArrayList;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/4 v3, 0x1

    .line 8
    if-ge v2, v0, :cond_7

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Landroidx/fragment/app/A0;

    .line 15
    .line 16
    iget-boolean v5, v4, Landroidx/fragment/app/A0;->h:Z

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iput-boolean v3, v4, Landroidx/fragment/app/A0;->h:Z

    .line 23
    .line 24
    iget v3, v4, Landroidx/fragment/app/A0;->b:I

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    const-string v6, " for Fragment "

    .line 28
    .line 29
    const-string v7, "FragmentManager"

    .line 30
    .line 31
    const-string v8, "fragmentStateManager.fragment"

    .line 32
    .line 33
    iget-object v9, v4, Landroidx/fragment/app/A0;->l:Landroidx/fragment/app/l0;

    .line 34
    .line 35
    if-ne v3, v5, :cond_4

    .line 36
    .line 37
    iget-object v3, v9, Landroidx/fragment/app/l0;->c:Landroidx/fragment/app/F;

    .line 38
    .line 39
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v8, v3, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {v8}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    if-eqz v8, :cond_1

    .line 49
    .line 50
    invoke-virtual {v3, v8}, Landroidx/fragment/app/F;->setFocusedView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v5}, Landroidx/fragment/app/e0;->J(I)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v10, "requestFocus: Saved focused view "

    .line 62
    .line 63
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v7, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :cond_1
    iget-object v4, v4, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 83
    .line 84
    invoke-virtual {v4}, Landroidx/fragment/app/F;->requireView()Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const-string v5, "this.fragment.requireView()"

    .line 89
    .line 90
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const/4 v6, 0x0

    .line 98
    if-nez v5, :cond_2

    .line 99
    .line 100
    invoke-virtual {v9}, Landroidx/fragment/app/l0;->b()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v6}, Landroid/view/View;->setAlpha(F)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    cmpg-float v5, v5, v6

    .line 111
    .line 112
    if-nez v5, :cond_3

    .line 113
    .line 114
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-nez v5, :cond_3

    .line 119
    .line 120
    const/4 v5, 0x4

    .line 121
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    :cond_3
    invoke-virtual {v3}, Landroidx/fragment/app/F;->getPostOnViewCreatedAlpha()F

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {v4, v3}, Landroid/view/View;->setAlpha(F)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const/4 v4, 0x3

    .line 133
    if-ne v3, v4, :cond_6

    .line 134
    .line 135
    iget-object v3, v9, Landroidx/fragment/app/l0;->c:Landroidx/fragment/app/F;

    .line 136
    .line 137
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Landroidx/fragment/app/F;->requireView()Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    const-string v8, "fragment.requireView()"

    .line 145
    .line 146
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v5}, Landroidx/fragment/app/e0;->J(I)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_5

    .line 154
    .line 155
    new-instance v5, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v8, "Clearing focus "

    .line 158
    .line 159
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v8, " on view "

    .line 170
    .line 171
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v7, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->clearFocus()V

    .line 191
    .line 192
    .line 193
    :cond_6
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_8

    .line 211
    .line 212
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, Landroidx/fragment/app/A0;

    .line 217
    .line 218
    iget-object v2, v2, Landroidx/fragment/app/A0;->k:Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-static {v2, v0}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_8
    invoke-static {v0}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    check-cast p1, Ljava/lang/Iterable;

    .line 229
    .line 230
    invoke-static {p1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    :goto_3
    if-ge v1, v0, :cond_a

    .line 239
    .line 240
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Landroidx/fragment/app/z0;

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    iget-object v4, p0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 250
    .line 251
    const-string v5, "container"

    .line 252
    .line 253
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget-boolean v5, v2, Landroidx/fragment/app/z0;->a:Z

    .line 257
    .line 258
    if-nez v5, :cond_9

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/fragment/app/z0;->e(Landroid/view/ViewGroup;)V

    .line 261
    .line 262
    .line 263
    :cond_9
    iput-boolean v3, v2, Landroidx/fragment/app/z0;->a:Z

    .line 264
    .line 265
    add-int/lit8 v1, v1, 0x1

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_a
    return-void
.end method

.method public final m()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/fragment/app/A0;

    .line 18
    .line 19
    iget v2, v1, Landroidx/fragment/app/A0;->b:I

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/fragment/app/F;->requireView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v4, "fragment.requireView()"

    .line 31
    .line 32
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    if-eq v2, v3, :cond_2

    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    const/4 v3, 0x3

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    const-string v1, "Unknown visibility "

    .line 53
    .line 54
    invoke-static {v2, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    :goto_1
    const/4 v2, 0x1

    .line 63
    invoke-virtual {v1, v3, v2}, Landroidx/fragment/app/A0;->d(II)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    return-void
.end method
