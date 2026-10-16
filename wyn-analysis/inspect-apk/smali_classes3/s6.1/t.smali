.class public final Ls6/t;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final x0:[F


# instance fields
.field public final A:Landroid/view/View;

.field public final B:Landroid/view/View;

.field public final C:Landroid/widget/TextView;

.field public final D:Landroid/widget/TextView;

.field public final E:Ls6/F;

.field public final F:Ljava/lang/StringBuilder;

.field public final G:Ljava/util/Formatter;

.field public final H:LE5/H0;

.field public final I:LE5/I0;

.field public final J:Lkd/c;

.field public final K:Landroid/graphics/drawable/Drawable;

.field public final L:Landroid/graphics/drawable/Drawable;

.field public final M:Landroid/graphics/drawable/Drawable;

.field public final N:Ljava/lang/String;

.field public final O:Ljava/lang/String;

.field public final P:Ljava/lang/String;

.field public final Q:Landroid/graphics/drawable/Drawable;

.field public final R:Landroid/graphics/drawable/Drawable;

.field public final S:F

.field public final T:F

.field public final U:Ljava/lang/String;

.field public final V:Ljava/lang/String;

.field public final W:Landroid/graphics/drawable/Drawable;

.field public final a:Ls6/y;

.field public final a0:Landroid/graphics/drawable/Drawable;

.field public final b:Landroid/content/res/Resources;

.field public final b0:Ljava/lang/String;

.field public final c:Ls6/j;

.field public final c0:Ljava/lang/String;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final d0:Landroid/graphics/drawable/Drawable;

.field public final e:Landroidx/recyclerview/widget/RecyclerView;

.field public final e0:Landroid/graphics/drawable/Drawable;

.field public final f:Ls6/p;

.field public final f0:Ljava/lang/String;

.field public final g:Ls6/m;

.field public final g0:Ljava/lang/String;

.field public final h:Ls6/i;

.field public h0:LE5/w0;

.field public final i:Ls6/i;

.field public i0:Ls6/k;

.field public final j:LI4/w;

.field public j0:Z

.field public final k:Landroid/widget/PopupWindow;

.field public k0:Z

.field public final l:I

.field public l0:Z

.field public final m:Landroid/view/View;

.field public m0:Z

.field public final n:Landroid/view/View;

.field public n0:Z

.field public final o:Landroid/view/View;

.field public o0:I

.field public final p:Landroid/view/View;

.field public p0:I

.field public final q:Landroid/view/View;

.field public q0:I

.field public final r:Landroid/widget/TextView;

.field public r0:[J

.field public final s:Landroid/widget/TextView;

.field public s0:[Z

.field public final t:Landroid/widget/ImageView;

.field public final t0:[J

.field public final u:Landroid/widget/ImageView;

.field public final u0:[Z

.field public final v:Landroid/view/View;

.field public v0:J

.field public final w:Landroid/widget/ImageView;

.field public w0:Z

.field public final x:Landroid/widget/ImageView;

.field public final y:Landroid/widget/ImageView;

.field public final z:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "goog.exo.ui"

    .line 2
    .line 3
    invoke-static {v0}, LE5/P;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, Ls6/t;->x0:[F

    .line 13
    .line 14
    return-void

    .line 15
    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v8, 0x1

    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v10, 0x0

    .line 10
    invoke-direct {v0, v1, v9, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    const/16 v3, 0x1388

    .line 14
    .line 15
    iput v3, v0, Ls6/t;->o0:I

    .line 16
    .line 17
    iput v10, v0, Ls6/t;->q0:I

    .line 18
    .line 19
    const/16 v3, 0xc8

    .line 20
    .line 21
    iput v3, v0, Ls6/t;->p0:I

    .line 22
    .line 23
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const v4, 0x7f0d003b

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v4, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const/high16 v3, 0x40000

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 36
    .line 37
    .line 38
    new-instance v11, Ls6/j;

    .line 39
    .line 40
    invoke-direct {v11, v0}, Ls6/j;-><init>(Ls6/t;)V

    .line 41
    .line 42
    .line 43
    iput-object v11, v0, Ls6/t;->c:Ls6/j;

    .line 44
    .line 45
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v3, v0, Ls6/t;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    new-instance v3, LE5/H0;

    .line 53
    .line 54
    invoke-direct {v3}, LE5/H0;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v3, v0, Ls6/t;->H:LE5/H0;

    .line 58
    .line 59
    new-instance v3, LE5/I0;

    .line 60
    .line 61
    invoke-direct {v3}, LE5/I0;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v3, v0, Ls6/t;->I:LE5/I0;

    .line 65
    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v3, v0, Ls6/t;->F:Ljava/lang/StringBuilder;

    .line 72
    .line 73
    new-instance v4, Ljava/util/Formatter;

    .line 74
    .line 75
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-direct {v4, v3, v5}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 80
    .line 81
    .line 82
    iput-object v4, v0, Ls6/t;->G:Ljava/util/Formatter;

    .line 83
    .line 84
    new-array v3, v10, [J

    .line 85
    .line 86
    iput-object v3, v0, Ls6/t;->r0:[J

    .line 87
    .line 88
    new-array v3, v10, [Z

    .line 89
    .line 90
    iput-object v3, v0, Ls6/t;->s0:[Z

    .line 91
    .line 92
    new-array v3, v10, [J

    .line 93
    .line 94
    iput-object v3, v0, Ls6/t;->t0:[J

    .line 95
    .line 96
    new-array v3, v10, [Z

    .line 97
    .line 98
    iput-object v3, v0, Ls6/t;->u0:[Z

    .line 99
    .line 100
    new-instance v3, Lkd/c;

    .line 101
    .line 102
    const/16 v4, 0xd

    .line 103
    .line 104
    invoke-direct {v3, v0, v4}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    iput-object v3, v0, Ls6/t;->J:Lkd/c;

    .line 108
    .line 109
    const v3, 0x7f0a0101

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Landroid/widget/TextView;

    .line 117
    .line 118
    iput-object v3, v0, Ls6/t;->C:Landroid/widget/TextView;

    .line 119
    .line 120
    const v3, 0x7f0a0114

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Landroid/widget/TextView;

    .line 128
    .line 129
    iput-object v3, v0, Ls6/t;->D:Landroid/widget/TextView;

    .line 130
    .line 131
    const v3, 0x7f0a0120

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    move-object v12, v3

    .line 139
    check-cast v12, Landroid/widget/ImageView;

    .line 140
    .line 141
    iput-object v12, v0, Ls6/t;->w:Landroid/widget/ImageView;

    .line 142
    .line 143
    if-eqz v12, :cond_0

    .line 144
    .line 145
    invoke-virtual {v12, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    :cond_0
    const v3, 0x7f0a0107

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Landroid/widget/ImageView;

    .line 156
    .line 157
    iput-object v3, v0, Ls6/t;->x:Landroid/widget/ImageView;

    .line 158
    .line 159
    new-instance v4, LLb/h;

    .line 160
    .line 161
    invoke-direct {v4, v0, v2}, LLb/h;-><init>(Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    const/16 v5, 0x8

    .line 165
    .line 166
    if-nez v3, :cond_1

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_1
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    .line 174
    .line 175
    :goto_0
    const v3, 0x7f0a010b

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Landroid/widget/ImageView;

    .line 183
    .line 184
    iput-object v3, v0, Ls6/t;->y:Landroid/widget/ImageView;

    .line 185
    .line 186
    new-instance v4, LLb/h;

    .line 187
    .line 188
    invoke-direct {v4, v0, v2}, LLb/h;-><init>(Ljava/lang/Object;I)V

    .line 189
    .line 190
    .line 191
    if-nez v3, :cond_2

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_2
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    .line 199
    .line 200
    :goto_1
    const v2, 0x7f0a011b

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    iput-object v2, v0, Ls6/t;->z:Landroid/view/View;

    .line 208
    .line 209
    if-eqz v2, :cond_3

    .line 210
    .line 211
    invoke-virtual {v2, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    .line 214
    :cond_3
    const v2, 0x7f0a0113

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    iput-object v2, v0, Ls6/t;->A:Landroid/view/View;

    .line 222
    .line 223
    if-eqz v2, :cond_4

    .line 224
    .line 225
    invoke-virtual {v2, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    .line 227
    .line 228
    :cond_4
    const v2, 0x7f0a00f7

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    iput-object v2, v0, Ls6/t;->B:Landroid/view/View;

    .line 236
    .line 237
    if-eqz v2, :cond_5

    .line 238
    .line 239
    invoke-virtual {v2, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    :cond_5
    const v2, 0x7f0a0116

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    check-cast v3, Ls6/F;

    .line 250
    .line 251
    const v4, 0x7f0a0117

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    if-eqz v3, :cond_6

    .line 259
    .line 260
    iput-object v3, v0, Ls6/t;->E:Ls6/F;

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_6
    if-eqz v4, :cond_7

    .line 264
    .line 265
    new-instance v3, Ls6/d;

    .line 266
    .line 267
    invoke-direct {v3, v1}, Ls6/d;-><init>(Landroid/content/Context;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v2}, Landroid/view/View;->setId(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    check-cast v2, Landroid/view/ViewGroup;

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 294
    .line 295
    .line 296
    iput-object v3, v0, Ls6/t;->E:Ls6/F;

    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_7
    iput-object v9, v0, Ls6/t;->E:Ls6/F;

    .line 300
    .line 301
    :goto_2
    iget-object v2, v0, Ls6/t;->E:Ls6/F;

    .line 302
    .line 303
    if-eqz v2, :cond_8

    .line 304
    .line 305
    check-cast v2, Ls6/d;

    .line 306
    .line 307
    iget-object v2, v2, Ls6/d;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 308
    .line 309
    invoke-virtual {v2, v11}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_8
    const v2, 0x7f0a0112

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    iput-object v2, v0, Ls6/t;->o:Landroid/view/View;

    .line 320
    .line 321
    if-eqz v2, :cond_9

    .line 322
    .line 323
    invoke-virtual {v2, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    .line 325
    .line 326
    :cond_9
    const v2, 0x7f0a0115

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    iput-object v13, v0, Ls6/t;->m:Landroid/view/View;

    .line 334
    .line 335
    if-eqz v13, :cond_a

    .line 336
    .line 337
    invoke-virtual {v13, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 338
    .line 339
    .line 340
    :cond_a
    const v2, 0x7f0a010c

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    iput-object v14, v0, Ls6/t;->n:Landroid/view/View;

    .line 348
    .line 349
    if-eqz v14, :cond_b

    .line 350
    .line 351
    invoke-virtual {v14, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 352
    .line 353
    .line 354
    :cond_b
    sget-object v2, La1/l;->a:Ljava/lang/ThreadLocal;

    .line 355
    .line 356
    invoke-virtual {v1}, Landroid/content/Context;->isRestricted()Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-eqz v2, :cond_c

    .line 361
    .line 362
    move-object v2, v9

    .line 363
    goto :goto_3

    .line 364
    :cond_c
    new-instance v3, Landroid/util/TypedValue;

    .line 365
    .line 366
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 367
    .line 368
    .line 369
    const/4 v6, 0x0

    .line 370
    const/4 v7, 0x0

    .line 371
    const/high16 v2, 0x7f090000

    .line 372
    .line 373
    const/4 v4, 0x0

    .line 374
    const/4 v5, 0x0

    .line 375
    invoke-static/range {v1 .. v7}, La1/l;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILa1/b;ZZ)Landroid/graphics/Typeface;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    :goto_3
    const v1, 0x7f0a0119

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    if-nez v1, :cond_d

    .line 387
    .line 388
    const v3, 0x7f0a011a

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    check-cast v3, Landroid/widget/TextView;

    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_d
    move-object v3, v9

    .line 399
    :goto_4
    iput-object v3, v0, Ls6/t;->s:Landroid/widget/TextView;

    .line 400
    .line 401
    if-eqz v3, :cond_e

    .line 402
    .line 403
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 404
    .line 405
    .line 406
    :cond_e
    if-nez v1, :cond_f

    .line 407
    .line 408
    move-object v1, v3

    .line 409
    :cond_f
    iput-object v1, v0, Ls6/t;->q:Landroid/view/View;

    .line 410
    .line 411
    if-eqz v1, :cond_10

    .line 412
    .line 413
    invoke-virtual {v1, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 414
    .line 415
    .line 416
    :cond_10
    const v3, 0x7f0a0105

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    if-nez v3, :cond_11

    .line 424
    .line 425
    const v4, 0x7f0a0106

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    check-cast v4, Landroid/widget/TextView;

    .line 433
    .line 434
    goto :goto_5

    .line 435
    :cond_11
    move-object v4, v9

    .line 436
    :goto_5
    iput-object v4, v0, Ls6/t;->r:Landroid/widget/TextView;

    .line 437
    .line 438
    if-eqz v4, :cond_12

    .line 439
    .line 440
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 441
    .line 442
    .line 443
    :cond_12
    if-nez v3, :cond_13

    .line 444
    .line 445
    move-object v3, v4

    .line 446
    :cond_13
    iput-object v3, v0, Ls6/t;->p:Landroid/view/View;

    .line 447
    .line 448
    if-eqz v3, :cond_14

    .line 449
    .line 450
    invoke-virtual {v3, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    .line 452
    .line 453
    :cond_14
    const v2, 0x7f0a0118

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    check-cast v2, Landroid/widget/ImageView;

    .line 461
    .line 462
    iput-object v2, v0, Ls6/t;->t:Landroid/widget/ImageView;

    .line 463
    .line 464
    if-eqz v2, :cond_15

    .line 465
    .line 466
    invoke-virtual {v2, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 467
    .line 468
    .line 469
    :cond_15
    const v4, 0x7f0a011d

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    check-cast v4, Landroid/widget/ImageView;

    .line 477
    .line 478
    iput-object v4, v0, Ls6/t;->u:Landroid/widget/ImageView;

    .line 479
    .line 480
    if-eqz v4, :cond_16

    .line 481
    .line 482
    invoke-virtual {v4, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 483
    .line 484
    .line 485
    :cond_16
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    iput-object v5, v0, Ls6/t;->b:Landroid/content/res/Resources;

    .line 490
    .line 491
    const v6, 0x7f0b0009

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getInteger(I)I

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    int-to-float v6, v6

    .line 499
    const/high16 v7, 0x42c80000    # 100.0f

    .line 500
    .line 501
    div-float/2addr v6, v7

    .line 502
    iput v6, v0, Ls6/t;->S:F

    .line 503
    .line 504
    const v6, 0x7f0b0008

    .line 505
    .line 506
    .line 507
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getInteger(I)I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    int-to-float v6, v6

    .line 512
    div-float/2addr v6, v7

    .line 513
    iput v6, v0, Ls6/t;->T:F

    .line 514
    .line 515
    const v6, 0x7f0a0125

    .line 516
    .line 517
    .line 518
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 519
    .line 520
    .line 521
    move-result-object v6

    .line 522
    iput-object v6, v0, Ls6/t;->v:Landroid/view/View;

    .line 523
    .line 524
    if-eqz v6, :cond_17

    .line 525
    .line 526
    invoke-virtual {v0, v6, v10}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 527
    .line 528
    .line 529
    :cond_17
    new-instance v7, Ls6/y;

    .line 530
    .line 531
    invoke-direct {v7, v0}, Ls6/y;-><init>(Ls6/t;)V

    .line 532
    .line 533
    .line 534
    iput-object v7, v0, Ls6/t;->a:Ls6/y;

    .line 535
    .line 536
    iput-boolean v8, v7, Ls6/y;->C:Z

    .line 537
    .line 538
    const v15, 0x7f13006d

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5, v15}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v15

    .line 545
    move/from16 v16, v10

    .line 546
    .line 547
    const v10, 0x7f08012c

    .line 548
    .line 549
    .line 550
    invoke-virtual {v5, v10}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 551
    .line 552
    .line 553
    move-result-object v10

    .line 554
    move/from16 v17, v8

    .line 555
    .line 556
    const v8, 0x7f13008e

    .line 557
    .line 558
    .line 559
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v8

    .line 563
    filled-new-array {v15, v8}, [Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    const v15, 0x7f08011a

    .line 568
    .line 569
    .line 570
    invoke-virtual {v5, v15}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 571
    .line 572
    .line 573
    move-result-object v15

    .line 574
    const/4 v9, 0x2

    .line 575
    new-array v9, v9, [Landroid/graphics/drawable/Drawable;

    .line 576
    .line 577
    aput-object v10, v9, v16

    .line 578
    .line 579
    aput-object v15, v9, v17

    .line 580
    .line 581
    new-instance v10, Ls6/p;

    .line 582
    .line 583
    invoke-direct {v10, v0, v8, v9}, Ls6/p;-><init>(Ls6/t;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    .line 584
    .line 585
    .line 586
    iput-object v10, v0, Ls6/t;->f:Ls6/p;

    .line 587
    .line 588
    const v8, 0x7f0700b0

    .line 589
    .line 590
    .line 591
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 592
    .line 593
    .line 594
    move-result v8

    .line 595
    iput v8, v0, Ls6/t;->l:I

    .line 596
    .line 597
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 598
    .line 599
    .line 600
    move-result-object v8

    .line 601
    const v9, 0x7f0d003d

    .line 602
    .line 603
    .line 604
    const/4 v15, 0x0

    .line 605
    invoke-virtual {v8, v9, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 606
    .line 607
    .line 608
    move-result-object v8

    .line 609
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 610
    .line 611
    iput-object v8, v0, Ls6/t;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 612
    .line 613
    invoke-virtual {v8, v10}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/I;)V

    .line 614
    .line 615
    .line 616
    new-instance v9, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 617
    .line 618
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 619
    .line 620
    .line 621
    invoke-direct {v9}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>()V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v8, v9}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/V;)V

    .line 625
    .line 626
    .line 627
    new-instance v9, Landroid/widget/PopupWindow;

    .line 628
    .line 629
    const/4 v10, -0x2

    .line 630
    move/from16 v15, v17

    .line 631
    .line 632
    invoke-direct {v9, v8, v10, v10, v15}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 633
    .line 634
    .line 635
    iput-object v9, v0, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 636
    .line 637
    sget v8, Lu6/v;->a:I

    .line 638
    .line 639
    const/16 v10, 0x17

    .line 640
    .line 641
    if-ge v8, v10, :cond_18

    .line 642
    .line 643
    new-instance v8, Landroid/graphics/drawable/ColorDrawable;

    .line 644
    .line 645
    move/from16 v10, v16

    .line 646
    .line 647
    invoke-direct {v8, v10}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v9, v8}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 651
    .line 652
    .line 653
    :cond_18
    invoke-virtual {v9, v11}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 654
    .line 655
    .line 656
    iput-boolean v15, v0, Ls6/t;->w0:Z

    .line 657
    .line 658
    new-instance v8, LI4/w;

    .line 659
    .line 660
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    invoke-direct {v8, v9, v15}, LI4/w;-><init>(Landroid/content/res/Resources;I)V

    .line 665
    .line 666
    .line 667
    iput-object v8, v0, Ls6/t;->j:LI4/w;

    .line 668
    .line 669
    const v8, 0x7f08012e

    .line 670
    .line 671
    .line 672
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 673
    .line 674
    .line 675
    move-result-object v8

    .line 676
    iput-object v8, v0, Ls6/t;->W:Landroid/graphics/drawable/Drawable;

    .line 677
    .line 678
    const v8, 0x7f08012d

    .line 679
    .line 680
    .line 681
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 682
    .line 683
    .line 684
    move-result-object v8

    .line 685
    iput-object v8, v0, Ls6/t;->a0:Landroid/graphics/drawable/Drawable;

    .line 686
    .line 687
    const v8, 0x7f130062

    .line 688
    .line 689
    .line 690
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    iput-object v8, v0, Ls6/t;->b0:Ljava/lang/String;

    .line 695
    .line 696
    const v8, 0x7f130061

    .line 697
    .line 698
    .line 699
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v8

    .line 703
    iput-object v8, v0, Ls6/t;->c0:Ljava/lang/String;

    .line 704
    .line 705
    new-instance v8, Ls6/i;

    .line 706
    .line 707
    const/4 v15, 0x1

    .line 708
    invoke-direct {v8, v0, v15}, Ls6/i;-><init>(Ls6/t;I)V

    .line 709
    .line 710
    .line 711
    iput-object v8, v0, Ls6/t;->h:Ls6/i;

    .line 712
    .line 713
    new-instance v8, Ls6/i;

    .line 714
    .line 715
    const/4 v10, 0x0

    .line 716
    invoke-direct {v8, v0, v10}, Ls6/i;-><init>(Ls6/t;I)V

    .line 717
    .line 718
    .line 719
    iput-object v8, v0, Ls6/t;->i:Ls6/i;

    .line 720
    .line 721
    new-instance v8, Ls6/m;

    .line 722
    .line 723
    const/high16 v9, 0x7f030000

    .line 724
    .line 725
    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v9

    .line 729
    sget-object v10, Ls6/t;->x0:[F

    .line 730
    .line 731
    invoke-direct {v8, v0, v9, v10}, Ls6/m;-><init>(Ls6/t;[Ljava/lang/String;[F)V

    .line 732
    .line 733
    .line 734
    iput-object v8, v0, Ls6/t;->g:Ls6/m;

    .line 735
    .line 736
    const v8, 0x7f08011e

    .line 737
    .line 738
    .line 739
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 740
    .line 741
    .line 742
    move-result-object v8

    .line 743
    iput-object v8, v0, Ls6/t;->d0:Landroid/graphics/drawable/Drawable;

    .line 744
    .line 745
    const v8, 0x7f08011d

    .line 746
    .line 747
    .line 748
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 749
    .line 750
    .line 751
    move-result-object v8

    .line 752
    iput-object v8, v0, Ls6/t;->e0:Landroid/graphics/drawable/Drawable;

    .line 753
    .line 754
    const v8, 0x7f080126

    .line 755
    .line 756
    .line 757
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 758
    .line 759
    .line 760
    move-result-object v8

    .line 761
    iput-object v8, v0, Ls6/t;->K:Landroid/graphics/drawable/Drawable;

    .line 762
    .line 763
    const v8, 0x7f080127

    .line 764
    .line 765
    .line 766
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 767
    .line 768
    .line 769
    move-result-object v8

    .line 770
    iput-object v8, v0, Ls6/t;->L:Landroid/graphics/drawable/Drawable;

    .line 771
    .line 772
    const v8, 0x7f080125

    .line 773
    .line 774
    .line 775
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 776
    .line 777
    .line 778
    move-result-object v8

    .line 779
    iput-object v8, v0, Ls6/t;->M:Landroid/graphics/drawable/Drawable;

    .line 780
    .line 781
    const v8, 0x7f08012b

    .line 782
    .line 783
    .line 784
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 785
    .line 786
    .line 787
    move-result-object v8

    .line 788
    iput-object v8, v0, Ls6/t;->Q:Landroid/graphics/drawable/Drawable;

    .line 789
    .line 790
    const v8, 0x7f08012a

    .line 791
    .line 792
    .line 793
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 794
    .line 795
    .line 796
    move-result-object v8

    .line 797
    iput-object v8, v0, Ls6/t;->R:Landroid/graphics/drawable/Drawable;

    .line 798
    .line 799
    const v8, 0x7f130066

    .line 800
    .line 801
    .line 802
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v8

    .line 806
    iput-object v8, v0, Ls6/t;->f0:Ljava/lang/String;

    .line 807
    .line 808
    const v8, 0x7f130065

    .line 809
    .line 810
    .line 811
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v8

    .line 815
    iput-object v8, v0, Ls6/t;->g0:Ljava/lang/String;

    .line 816
    .line 817
    const v8, 0x7f130070

    .line 818
    .line 819
    .line 820
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v8

    .line 824
    iput-object v8, v0, Ls6/t;->N:Ljava/lang/String;

    .line 825
    .line 826
    const v8, 0x7f130071

    .line 827
    .line 828
    .line 829
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v8

    .line 833
    iput-object v8, v0, Ls6/t;->O:Ljava/lang/String;

    .line 834
    .line 835
    const v8, 0x7f13006f

    .line 836
    .line 837
    .line 838
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v8

    .line 842
    iput-object v8, v0, Ls6/t;->P:Ljava/lang/String;

    .line 843
    .line 844
    const v8, 0x7f130077

    .line 845
    .line 846
    .line 847
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v8

    .line 851
    iput-object v8, v0, Ls6/t;->U:Ljava/lang/String;

    .line 852
    .line 853
    const v8, 0x7f130076

    .line 854
    .line 855
    .line 856
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    iput-object v5, v0, Ls6/t;->V:Ljava/lang/String;

    .line 861
    .line 862
    const v5, 0x7f0a00f9

    .line 863
    .line 864
    .line 865
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 866
    .line 867
    .line 868
    move-result-object v5

    .line 869
    check-cast v5, Landroid/view/ViewGroup;

    .line 870
    .line 871
    const/4 v15, 0x1

    .line 872
    invoke-virtual {v7, v5, v15}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v7, v3, v15}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v7, v1, v15}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v7, v13, v15}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v7, v14, v15}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 885
    .line 886
    .line 887
    const/4 v10, 0x0

    .line 888
    invoke-virtual {v7, v4, v10}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v7, v12, v10}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v7, v6, v10}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 895
    .line 896
    .line 897
    iget v1, v0, Ls6/t;->q0:I

    .line 898
    .line 899
    if-eqz v1, :cond_19

    .line 900
    .line 901
    move v10, v15

    .line 902
    :cond_19
    invoke-virtual {v7, v2, v10}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 903
    .line 904
    .line 905
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;

    .line 906
    .line 907
    invoke-direct {v1, v0, v15}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;-><init>(Ljava/lang/Object;I)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 911
    .line 912
    .line 913
    return-void
.end method

.method public static a(Ls6/t;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls6/t;->i0:Ls6/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-boolean v0, p0, Ls6/t;->j0:Z

    .line 7
    .line 8
    xor-int/lit8 v1, v0, 0x1

    .line 9
    .line 10
    iput-boolean v1, p0, Ls6/t;->j0:Z

    .line 11
    .line 12
    iget-object v1, p0, Ls6/t;->g0:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Ls6/t;->e0:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    iget-object v3, p0, Ls6/t;->f0:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, p0, Ls6/t;->d0:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    iget-object v5, p0, Ls6/t;->x:Landroid/widget/ImageView;

    .line 21
    .line 22
    if-nez v5, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-boolean v0, p0, Ls6/t;->j0:Z

    .line 41
    .line 42
    iget-object v5, p0, Ls6/t;->y:Landroid/widget/ImageView;

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    iget-object p0, p0, Ls6/t;->i0:Ls6/k;

    .line 63
    .line 64
    if-eqz p0, :cond_5

    .line 65
    .line 66
    check-cast p0, Ls6/z;

    .line 67
    .line 68
    iget-object p0, p0, Ls6/z;->c:Ls6/C;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_2
    return-void
.end method

.method public static synthetic b(Ls6/t;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls6/t;->setPlaybackSpeed(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setPlaybackSpeed(F)V
    .locals 12

    .line 1
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move-object v1, v0

    .line 7
    check-cast v1, LE5/I;

    .line 8
    .line 9
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, LE5/I;->j0:LE5/q0;

    .line 13
    .line 14
    iget-object v0, v0, LE5/q0;->n:LE5/r0;

    .line 15
    .line 16
    new-instance v2, LE5/r0;

    .line 17
    .line 18
    iget v0, v0, LE5/r0;->b:F

    .line 19
    .line 20
    invoke-direct {v2, p1, v0}, LE5/r0;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 24
    .line 25
    .line 26
    iget-object p1, v1, LE5/I;->j0:LE5/q0;

    .line 27
    .line 28
    iget-object p1, p1, LE5/q0;->n:LE5/r0;

    .line 29
    .line 30
    invoke-virtual {p1, v2}, LE5/r0;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    :goto_0
    return-void

    .line 37
    :cond_1
    iget-object p1, v1, LE5/I;->j0:LE5/q0;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, LE5/q0;->e(LE5/r0;)LE5/q0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget v0, v1, LE5/I;->H:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iput v0, v1, LE5/I;->H:I

    .line 48
    .line 49
    iget-object v0, v1, LE5/I;->k:LE5/O;

    .line 50
    .line 51
    iget-object v0, v0, LE5/O;->h:Lu6/s;

    .line 52
    .line 53
    const/4 v3, 0x4

    .line 54
    invoke-virtual {v0, v3, v2}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lu6/r;->b()V

    .line 59
    .line 60
    .line 61
    const/4 v10, -0x1

    .line 62
    const/4 v11, 0x0

    .line 63
    const/4 v3, 0x0

    .line 64
    const/4 v4, 0x1

    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x5

    .line 68
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    move-object v2, p1

    .line 74
    invoke-virtual/range {v1 .. v11}, LE5/I;->O0(LE5/q0;IIZZIJIZ)V

    .line 75
    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 13

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_f

    .line 9
    .line 10
    const/16 v3, 0x58

    .line 11
    .line 12
    const/16 v4, 0x57

    .line 13
    .line 14
    const/16 v5, 0x7f

    .line 15
    .line 16
    const/16 v6, 0x7e

    .line 17
    .line 18
    const/16 v7, 0x4f

    .line 19
    .line 20
    const/16 v8, 0x55

    .line 21
    .line 22
    const/16 v9, 0x59

    .line 23
    .line 24
    const/16 v10, 0x5a

    .line 25
    .line 26
    if-eq v0, v10, :cond_0

    .line 27
    .line 28
    if-eq v0, v9, :cond_0

    .line 29
    .line 30
    if-eq v0, v8, :cond_0

    .line 31
    .line 32
    if-eq v0, v7, :cond_0

    .line 33
    .line 34
    if-eq v0, v6, :cond_0

    .line 35
    .line 36
    if-eq v0, v5, :cond_0

    .line 37
    .line 38
    if-eq v0, v4, :cond_0

    .line 39
    .line 40
    if-ne v0, v3, :cond_f

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    const/4 v12, 0x1

    .line 47
    if-nez v11, :cond_e

    .line 48
    .line 49
    const/4 v11, 0x4

    .line 50
    if-ne v0, v10, :cond_1

    .line 51
    .line 52
    move-object p1, v1

    .line 53
    check-cast p1, LE5/I;

    .line 54
    .line 55
    invoke-virtual {p1}, LE5/I;->t0()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eq p1, v11, :cond_e

    .line 60
    .line 61
    check-cast v1, LA7/B0;

    .line 62
    .line 63
    move-object p1, v1

    .line 64
    check-cast p1, LE5/I;

    .line 65
    .line 66
    invoke-virtual {p1}, LE5/I;->Q0()V

    .line 67
    .line 68
    .line 69
    iget-wide v2, p1, LE5/I;->v:J

    .line 70
    .line 71
    invoke-virtual {v1, v2, v3}, LA7/B0;->Q(J)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_1
    if-ne v0, v9, :cond_2

    .line 77
    .line 78
    check-cast v1, LA7/B0;

    .line 79
    .line 80
    move-object p1, v1

    .line 81
    check-cast p1, LE5/I;

    .line 82
    .line 83
    invoke-virtual {p1}, LE5/I;->Q0()V

    .line 84
    .line 85
    .line 86
    iget-wide v2, p1, LE5/I;->u:J

    .line 87
    .line 88
    neg-long v2, v2

    .line 89
    invoke-virtual {v1, v2, v3}, LA7/B0;->Q(J)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_3

    .line 93
    .line 94
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_e

    .line 99
    .line 100
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    if-eq v0, v7, :cond_9

    .line 106
    .line 107
    if-eq v0, v8, :cond_9

    .line 108
    .line 109
    if-eq v0, v4, :cond_8

    .line 110
    .line 111
    if-eq v0, v3, :cond_7

    .line 112
    .line 113
    if-eq v0, v6, :cond_4

    .line 114
    .line 115
    if-eq v0, v5, :cond_3

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    check-cast v1, LA7/B0;

    .line 119
    .line 120
    check-cast v1, LE5/I;

    .line 121
    .line 122
    invoke-virtual {v1, v2}, LE5/I;->I0(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_4
    check-cast v1, LE5/I;

    .line 127
    .line 128
    invoke-virtual {v1}, LE5/I;->t0()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-ne p1, v12, :cond_5

    .line 133
    .line 134
    invoke-virtual {v1}, LE5/I;->B0()V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_5
    if-ne p1, v11, :cond_6

    .line 139
    .line 140
    invoke-virtual {v1}, LE5/I;->l0()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v9, v10, p1, v2}, LE5/I;->E0(JIZ)V

    .line 148
    .line 149
    .line 150
    :cond_6
    :goto_0
    invoke-virtual {v1, v12}, LE5/I;->I0(Z)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    check-cast v1, LA7/B0;

    .line 155
    .line 156
    invoke-virtual {v1}, LA7/B0;->R()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_8
    check-cast v1, LA7/B0;

    .line 161
    .line 162
    invoke-virtual {v1}, LA7/B0;->P()V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_9
    check-cast v1, LE5/I;

    .line 167
    .line 168
    invoke-virtual {v1}, LE5/I;->t0()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eq p1, v12, :cond_b

    .line 173
    .line 174
    if-eq p1, v11, :cond_b

    .line 175
    .line 176
    invoke-virtual {v1}, LE5/I;->s0()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_a

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_a
    invoke-virtual {v1, v2}, LE5/I;->I0(Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_b
    :goto_1
    invoke-virtual {v1}, LE5/I;->t0()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-ne p1, v12, :cond_c

    .line 192
    .line 193
    invoke-virtual {v1}, LE5/I;->B0()V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_c
    if-ne p1, v11, :cond_d

    .line 198
    .line 199
    invoke-virtual {v1}, LE5/I;->l0()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v9, v10, p1, v2}, LE5/I;->E0(JIZ)V

    .line 207
    .line 208
    .line 209
    :cond_d
    :goto_2
    invoke-virtual {v1, v12}, LE5/I;->I0(Z)V

    .line 210
    .line 211
    .line 212
    :cond_e
    :goto_3
    return v12

    .line 213
    :cond_f
    return v2
.end method

.method public final d(Landroidx/recyclerview/widget/I;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/t;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/I;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ls6/t;->p()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Ls6/t;->w0:Z

    .line 11
    .line 12
    iget-object p1, p0, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Ls6/t;->w0:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sub-int/2addr v0, v1

    .line 29
    iget v1, p0, Ls6/t;->l:I

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    neg-int v2, v2

    .line 37
    sub-int/2addr v2, v1

    .line 38
    invoke-virtual {p1, p2, v0, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ls6/t;->c(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public final e(LE5/L0;I)Ll8/e0;
    .locals 12

    .line 1
    const-string v0, "initialCapacity"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, Ll8/s;->d(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-array v0, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p1, LE5/L0;->a:Ll8/K;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    move v5, v4

    .line 14
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-ge v4, v6, :cond_5

    .line 19
    .line 20
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, LE5/K0;

    .line 25
    .line 26
    iget-object v7, v6, LE5/K0;->b:Lf6/Z;

    .line 27
    .line 28
    iget v7, v7, Lf6/Z;->c:I

    .line 29
    .line 30
    if-eq v7, p2, :cond_0

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_0
    move v7, v3

    .line 34
    :goto_1
    iget v8, v6, LE5/K0;->a:I

    .line 35
    .line 36
    if-ge v7, v8, :cond_4

    .line 37
    .line 38
    iget-object v8, v6, LE5/K0;->d:[I

    .line 39
    .line 40
    aget v8, v8, v7

    .line 41
    .line 42
    if-eq v8, v1, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    iget-object v8, v6, LE5/K0;->b:Lf6/Z;

    .line 46
    .line 47
    iget-object v8, v8, Lf6/Z;->d:[LE5/T;

    .line 48
    .line 49
    aget-object v8, v8, v7

    .line 50
    .line 51
    iget v9, v8, LE5/T;->d:I

    .line 52
    .line 53
    and-int/lit8 v9, v9, 0x2

    .line 54
    .line 55
    if-eqz v9, :cond_2

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_2
    iget-object v9, p0, Ls6/t;->j:LI4/w;

    .line 59
    .line 60
    invoke-virtual {v9, v8}, LI4/w;->c(LE5/T;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    new-instance v9, Ls6/r;

    .line 65
    .line 66
    invoke-direct {v9, p1, v4, v7, v8}, Ls6/r;-><init>(LE5/L0;IILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    array-length v8, v0

    .line 70
    add-int/lit8 v10, v5, 0x1

    .line 71
    .line 72
    invoke-static {v8, v10}, Ll8/E;->f(II)I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    array-length v11, v0

    .line 77
    if-gt v8, v11, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_2
    aput-object v9, v0, v5

    .line 85
    .line 86
    move v5, v10

    .line 87
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    invoke-static {v5, v0}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget v1, v0, Ls6/y;->z:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq v1, v2, :cond_3

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ls6/y;->f()V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, v0, Ls6/y;->C:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ls6/y;->i(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget v1, v0, Ls6/y;->z:I

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    iget-object v0, v0, Ls6/y;->m:Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    iget-object v0, v0, Ls6/y;->n:Landroid/animation/AnimatorSet;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 37
    .line 38
    .line 39
    :cond_3
    :goto_0
    return-void
.end method

.method public final g()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget v1, v0, Ls6/y;->z:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Ls6/y;->a:Ls6/t;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls6/t;->h()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public getPlayer()LE5/w0;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRepeatToggleModes()I
    .locals 1

    .line 1
    iget v0, p0, Ls6/t;->q0:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowShuffleButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->u:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls6/y;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getShowSubtitleButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->w:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls6/y;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getShowTimeoutMs()I
    .locals 1

    .line 1
    iget v0, p0, Ls6/t;->o0:I

    .line 2
    .line 3
    return v0
.end method

.method public getShowVrButton()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->v:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls6/y;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final i()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls6/t;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ls6/t;->k()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ls6/t;->o()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ls6/t;->q()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ls6/t;->s()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ls6/t;->m()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ls6/t;->r()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final j(Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iget p2, p0, Ls6/t;->S:F

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    iget p2, p0, Ls6/t;->T:F

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final k()V
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0}, Ls6/t;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_8

    .line 8
    .line 9
    iget-boolean v2, p0, Ls6/t;->k0:Z

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Ls6/t;->h0:LE5/w0;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    check-cast v2, LA7/B0;

    .line 20
    .line 21
    const/4 v3, 0x5

    .line 22
    invoke-virtual {v2, v3}, LA7/B0;->H(I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x7

    .line 27
    invoke-virtual {v2, v4}, LA7/B0;->H(I)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/16 v5, 0xb

    .line 32
    .line 33
    invoke-virtual {v2, v5}, LA7/B0;->H(I)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/16 v6, 0xc

    .line 38
    .line 39
    invoke-virtual {v2, v6}, LA7/B0;->H(I)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const/16 v7, 0x9

    .line 44
    .line 45
    invoke-virtual {v2, v7}, LA7/B0;->H(I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v1

    .line 51
    move v3, v2

    .line 52
    move v4, v3

    .line 53
    move v5, v4

    .line 54
    move v6, v5

    .line 55
    :goto_0
    iget-object v7, p0, Ls6/t;->b:Landroid/content/res/Resources;

    .line 56
    .line 57
    iget-object v8, p0, Ls6/t;->q:Landroid/view/View;

    .line 58
    .line 59
    const-wide/16 v9, 0x3e8

    .line 60
    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    iget-object v11, p0, Ls6/t;->h0:LE5/w0;

    .line 64
    .line 65
    if-eqz v11, :cond_2

    .line 66
    .line 67
    check-cast v11, LE5/I;

    .line 68
    .line 69
    invoke-virtual {v11}, LE5/I;->Q0()V

    .line 70
    .line 71
    .line 72
    iget-wide v11, v11, LE5/I;->u:J

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const-wide/16 v11, 0x1388

    .line 76
    .line 77
    :goto_1
    div-long/2addr v11, v9

    .line 78
    long-to-int v11, v11

    .line 79
    iget-object v12, p0, Ls6/t;->s:Landroid/widget/TextView;

    .line 80
    .line 81
    if-eqz v12, :cond_3

    .line 82
    .line 83
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    if-eqz v8, :cond_4

    .line 91
    .line 92
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    new-array v13, v0, [Ljava/lang/Object;

    .line 97
    .line 98
    aput-object v12, v13, v1

    .line 99
    .line 100
    const v12, 0x7f110001

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7, v12, v11, v13}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-virtual {v8, v11}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    iget-object v11, p0, Ls6/t;->p:Landroid/view/View;

    .line 111
    .line 112
    if-eqz v6, :cond_7

    .line 113
    .line 114
    iget-object v12, p0, Ls6/t;->h0:LE5/w0;

    .line 115
    .line 116
    if-eqz v12, :cond_5

    .line 117
    .line 118
    check-cast v12, LE5/I;

    .line 119
    .line 120
    invoke-virtual {v12}, LE5/I;->Q0()V

    .line 121
    .line 122
    .line 123
    iget-wide v12, v12, LE5/I;->v:J

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    const-wide/16 v12, 0x3a98

    .line 127
    .line 128
    :goto_2
    div-long/2addr v12, v9

    .line 129
    long-to-int v9, v12

    .line 130
    iget-object v10, p0, Ls6/t;->r:Landroid/widget/TextView;

    .line 131
    .line 132
    if-eqz v10, :cond_6

    .line 133
    .line 134
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    if-eqz v11, :cond_7

    .line 142
    .line 143
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    new-array v0, v0, [Ljava/lang/Object;

    .line 148
    .line 149
    aput-object v10, v0, v1

    .line 150
    .line 151
    const/high16 v1, 0x7f110000

    .line 152
    .line 153
    invoke-virtual {v7, v1, v9, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v11, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    iget-object v0, p0, Ls6/t;->m:Landroid/view/View;

    .line 161
    .line 162
    invoke-virtual {p0, v0, v4}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v8, v5}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v11, v6}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Ls6/t;->n:Landroid/view/View;

    .line 172
    .line 173
    invoke-virtual {p0, v0, v2}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Ls6/t;->E:Ls6/F;

    .line 177
    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    check-cast v0, Ls6/d;

    .line 181
    .line 182
    invoke-virtual {v0, v3}, Ls6/d;->setEnabled(Z)V

    .line 183
    .line 184
    .line 185
    :cond_8
    :goto_3
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ls6/t;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, Ls6/t;->k0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Ls6/t;->o:Landroid/view/View;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 17
    .line 18
    iget-object v2, p0, Ls6/t;->b:Landroid/content/res/Resources;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v1, LE5/I;

    .line 23
    .line 24
    invoke-virtual {v1}, LE5/I;->t0()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v3, 0x4

    .line 29
    if-eq v1, v3, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 32
    .line 33
    check-cast v1, LE5/I;

    .line 34
    .line 35
    invoke-virtual {v1}, LE5/I;->t0()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eq v1, v3, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 43
    .line 44
    check-cast v1, LE5/I;

    .line 45
    .line 46
    invoke-virtual {v1}, LE5/I;->s0()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    move-object v1, v0

    .line 53
    check-cast v1, Landroid/widget/ImageView;

    .line 54
    .line 55
    const v3, 0x7f080122

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    const v1, 0x7f13006b

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    move-object v1, v0

    .line 77
    check-cast v1, Landroid/widget/ImageView;

    .line 78
    .line 79
    const v3, 0x7f080123

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    const v1, 0x7f13006c

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_0
    return-void
.end method

.method public final m()V
    .locals 8

    .line 1
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, LE5/I;

    .line 7
    .line 8
    invoke-virtual {v0}, LE5/I;->Q0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, LE5/I;->j0:LE5/q0;

    .line 12
    .line 13
    iget-object v0, v0, LE5/q0;->n:LE5/r0;

    .line 14
    .line 15
    iget v0, v0, LE5/r0;->a:F

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 19
    .line 20
    .line 21
    move v3, v1

    .line 22
    move v4, v3

    .line 23
    :goto_0
    iget-object v5, p0, Ls6/t;->g:Ls6/m;

    .line 24
    .line 25
    iget-object v6, v5, Ls6/m;->j:[F

    .line 26
    .line 27
    array-length v7, v6

    .line 28
    if-ge v3, v7, :cond_2

    .line 29
    .line 30
    aget v5, v6, v3

    .line 31
    .line 32
    sub-float v5, v0, v5

    .line 33
    .line 34
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpg-float v6, v5, v2

    .line 39
    .line 40
    if-gez v6, :cond_1

    .line 41
    .line 42
    move v4, v3

    .line 43
    move v2, v5

    .line 44
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iput v4, v5, Ls6/m;->k:I

    .line 48
    .line 49
    iget-object v0, v5, Ls6/m;->i:[Ljava/lang/String;

    .line 50
    .line 51
    aget-object v0, v0, v4

    .line 52
    .line 53
    iget-object v2, p0, Ls6/t;->f:Ls6/p;

    .line 54
    .line 55
    iget-object v2, v2, Ls6/p;->j:[Ljava/lang/String;

    .line 56
    .line 57
    aput-object v0, v2, v1

    .line 58
    .line 59
    return-void
.end method

.method public final n()V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ls6/t;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-boolean v0, p0, Ls6/t;->k0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    iget-wide v3, p0, Ls6/t;->v0:J

    .line 20
    .line 21
    move-object v5, v0

    .line 22
    check-cast v5, LE5/I;

    .line 23
    .line 24
    invoke-virtual {v5}, LE5/I;->i0()J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    add-long/2addr v6, v3

    .line 29
    iget-wide v3, p0, Ls6/t;->v0:J

    .line 30
    .line 31
    invoke-virtual {v5}, LE5/I;->Q0()V

    .line 32
    .line 33
    .line 34
    iget-object v8, v5, LE5/I;->j0:LE5/q0;

    .line 35
    .line 36
    iget-object v8, v8, LE5/q0;->a:LE5/J0;

    .line 37
    .line 38
    invoke-virtual {v8}, LE5/J0;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_1

    .line 43
    .line 44
    iget-wide v1, v5, LE5/I;->l0:J

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object v8, v5, LE5/I;->j0:LE5/q0;

    .line 48
    .line 49
    iget-object v9, v8, LE5/q0;->k:Lf6/z;

    .line 50
    .line 51
    iget-wide v9, v9, Lf6/x;->d:J

    .line 52
    .line 53
    iget-object v11, v8, LE5/q0;->b:Lf6/z;

    .line 54
    .line 55
    iget-wide v11, v11, Lf6/x;->d:J

    .line 56
    .line 57
    cmp-long v9, v9, v11

    .line 58
    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    iget-object v8, v8, LE5/q0;->a:LE5/J0;

    .line 62
    .line 63
    invoke-virtual {v5}, LE5/I;->l0()I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    iget-object v5, v5, LA7/B0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, LE5/I0;

    .line 70
    .line 71
    invoke-virtual {v8, v9, v5, v1, v2}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-wide v1, v1, LE5/I0;->m:J

    .line 76
    .line 77
    invoke-static {v1, v2}, Lu6/v;->F(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    iget-wide v1, v8, LE5/q0;->p:J

    .line 83
    .line 84
    iget-object v8, v5, LE5/I;->j0:LE5/q0;

    .line 85
    .line 86
    iget-object v8, v8, LE5/q0;->k:Lf6/z;

    .line 87
    .line 88
    invoke-virtual {v8}, Lf6/x;->a()Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    iget-object v1, v5, LE5/I;->j0:LE5/q0;

    .line 95
    .line 96
    iget-object v2, v1, LE5/q0;->a:LE5/J0;

    .line 97
    .line 98
    iget-object v1, v1, LE5/q0;->k:Lf6/z;

    .line 99
    .line 100
    iget-object v1, v1, Lf6/x;->a:Ljava/lang/Object;

    .line 101
    .line 102
    iget-object v8, v5, LE5/I;->n:LE5/H0;

    .line 103
    .line 104
    invoke-virtual {v2, v1, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v2, v5, LE5/I;->j0:LE5/q0;

    .line 109
    .line 110
    iget-object v2, v2, LE5/q0;->k:Lf6/z;

    .line 111
    .line 112
    iget v2, v2, Lf6/x;->b:I

    .line 113
    .line 114
    invoke-virtual {v1, v2}, LE5/H0;->d(I)J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    const-wide/high16 v10, -0x8000000000000000L

    .line 119
    .line 120
    cmp-long v2, v8, v10

    .line 121
    .line 122
    if-nez v2, :cond_3

    .line 123
    .line 124
    iget-wide v1, v1, LE5/H0;->d:J

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    move-wide v1, v8

    .line 128
    :cond_4
    :goto_0
    iget-object v8, v5, LE5/I;->j0:LE5/q0;

    .line 129
    .line 130
    iget-object v9, v8, LE5/q0;->a:LE5/J0;

    .line 131
    .line 132
    iget-object v8, v8, LE5/q0;->k:Lf6/z;

    .line 133
    .line 134
    iget-object v8, v8, Lf6/x;->a:Ljava/lang/Object;

    .line 135
    .line 136
    iget-object v5, v5, LE5/I;->n:LE5/H0;

    .line 137
    .line 138
    invoke-virtual {v9, v8, v5}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 139
    .line 140
    .line 141
    iget-wide v8, v5, LE5/H0;->e:J

    .line 142
    .line 143
    add-long/2addr v1, v8

    .line 144
    invoke-static {v1, v2}, Lu6/v;->F(J)J

    .line 145
    .line 146
    .line 147
    move-result-wide v1

    .line 148
    :goto_1
    add-long/2addr v1, v3

    .line 149
    move-wide v3, v1

    .line 150
    move-wide v1, v6

    .line 151
    goto :goto_2

    .line 152
    :cond_5
    move-wide v3, v1

    .line 153
    :goto_2
    iget-object v5, p0, Ls6/t;->D:Landroid/widget/TextView;

    .line 154
    .line 155
    if-eqz v5, :cond_6

    .line 156
    .line 157
    iget-boolean v6, p0, Ls6/t;->n0:Z

    .line 158
    .line 159
    if-nez v6, :cond_6

    .line 160
    .line 161
    iget-object v6, p0, Ls6/t;->F:Ljava/lang/StringBuilder;

    .line 162
    .line 163
    iget-object v7, p0, Ls6/t;->G:Ljava/util/Formatter;

    .line 164
    .line 165
    invoke-static {v6, v7, v1, v2}, Lu6/v;->r(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    :cond_6
    iget-object v5, p0, Ls6/t;->E:Ls6/F;

    .line 173
    .line 174
    if-eqz v5, :cond_7

    .line 175
    .line 176
    check-cast v5, Ls6/d;

    .line 177
    .line 178
    invoke-virtual {v5, v1, v2}, Ls6/d;->setPosition(J)V

    .line 179
    .line 180
    .line 181
    iget-object v5, p0, Ls6/t;->E:Ls6/F;

    .line 182
    .line 183
    check-cast v5, Ls6/d;

    .line 184
    .line 185
    invoke-virtual {v5, v3, v4}, Ls6/d;->setBufferedPosition(J)V

    .line 186
    .line 187
    .line 188
    :cond_7
    iget-object v3, p0, Ls6/t;->J:Lkd/c;

    .line 189
    .line 190
    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 191
    .line 192
    .line 193
    const/4 v3, 0x1

    .line 194
    if-nez v0, :cond_8

    .line 195
    .line 196
    move v4, v3

    .line 197
    goto :goto_3

    .line 198
    :cond_8
    move-object v4, v0

    .line 199
    check-cast v4, LE5/I;

    .line 200
    .line 201
    invoke-virtual {v4}, LE5/I;->t0()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    :goto_3
    const-wide/16 v5, 0x3e8

    .line 206
    .line 207
    if-eqz v0, :cond_b

    .line 208
    .line 209
    move-object v7, v0

    .line 210
    check-cast v7, LA7/B0;

    .line 211
    .line 212
    check-cast v7, LE5/I;

    .line 213
    .line 214
    invoke-virtual {v7}, LE5/I;->t0()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    const/4 v9, 0x3

    .line 219
    if-ne v8, v9, :cond_b

    .line 220
    .line 221
    invoke-virtual {v7}, LE5/I;->s0()Z

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    if-eqz v8, :cond_b

    .line 226
    .line 227
    invoke-virtual {v7}, LE5/I;->Q0()V

    .line 228
    .line 229
    .line 230
    iget-object v7, v7, LE5/I;->j0:LE5/q0;

    .line 231
    .line 232
    iget v7, v7, LE5/q0;->m:I

    .line 233
    .line 234
    if-nez v7, :cond_b

    .line 235
    .line 236
    iget-object v3, p0, Ls6/t;->E:Ls6/F;

    .line 237
    .line 238
    if-eqz v3, :cond_9

    .line 239
    .line 240
    check-cast v3, Ls6/d;

    .line 241
    .line 242
    invoke-virtual {v3}, Ls6/d;->getPreferredUpdateDelay()J

    .line 243
    .line 244
    .line 245
    move-result-wide v3

    .line 246
    goto :goto_4

    .line 247
    :cond_9
    move-wide v3, v5

    .line 248
    :goto_4
    rem-long/2addr v1, v5

    .line 249
    sub-long v1, v5, v1

    .line 250
    .line 251
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide v1

    .line 255
    check-cast v0, LE5/I;

    .line 256
    .line 257
    invoke-virtual {v0}, LE5/I;->Q0()V

    .line 258
    .line 259
    .line 260
    iget-object v0, v0, LE5/I;->j0:LE5/q0;

    .line 261
    .line 262
    iget-object v0, v0, LE5/q0;->n:LE5/r0;

    .line 263
    .line 264
    iget v0, v0, LE5/r0;->a:F

    .line 265
    .line 266
    const/4 v3, 0x0

    .line 267
    cmpl-float v3, v0, v3

    .line 268
    .line 269
    if-lez v3, :cond_a

    .line 270
    .line 271
    long-to-float v1, v1

    .line 272
    div-float/2addr v1, v0

    .line 273
    float-to-long v5, v1

    .line 274
    :cond_a
    move-wide v7, v5

    .line 275
    iget v0, p0, Ls6/t;->p0:I

    .line 276
    .line 277
    int-to-long v9, v0

    .line 278
    const-wide/16 v11, 0x3e8

    .line 279
    .line 280
    invoke-static/range {v7 .. v12}, Lu6/v;->i(JJJ)J

    .line 281
    .line 282
    .line 283
    move-result-wide v0

    .line 284
    iget-object v2, p0, Ls6/t;->J:Lkd/c;

    .line 285
    .line 286
    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_b
    const/4 v0, 0x4

    .line 291
    if-eq v4, v0, :cond_c

    .line 292
    .line 293
    if-eq v4, v3, :cond_c

    .line 294
    .line 295
    iget-object v0, p0, Ls6/t;->J:Lkd/c;

    .line 296
    .line 297
    invoke-virtual {p0, v0, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 298
    .line 299
    .line 300
    :cond_c
    :goto_5
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ls6/t;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-boolean v0, p0, Ls6/t;->k0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    iget-object v0, p0, Ls6/t;->t:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v1, p0, Ls6/t;->q0:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0, v2}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 26
    .line 27
    iget-object v3, p0, Ls6/t;->N:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Ls6/t;->K:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v0, v2}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    const/4 v2, 0x1

    .line 44
    invoke-virtual {p0, v0, v2}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 45
    .line 46
    .line 47
    check-cast v1, LE5/I;

    .line 48
    .line 49
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 50
    .line 51
    .line 52
    iget v1, v1, LE5/I;->F:I

    .line 53
    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    if-eq v1, v2, :cond_4

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    if-eq v1, v2, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    iget-object v1, p0, Ls6/t;->M:Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Ls6/t;->P:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    iget-object v1, p0, Ls6/t;->L:Landroid/graphics/drawable/Drawable;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Ls6/t;->O:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    :goto_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 5
    .line 6
    iget-object v1, v0, Ls6/y;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;

    .line 7
    .line 8
    iget-object v2, v0, Ls6/y;->a:Ls6/t;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Ls6/t;->k0:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Ls6/t;->g()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ls6/y;->g()V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Ls6/t;->i()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 5
    .line 6
    iget-object v1, v0, Ls6/y;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/H;

    .line 7
    .line 8
    iget-object v2, v0, Ls6/y;->a:Ls6/t;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Ls6/t;->k0:Z

    .line 15
    .line 16
    iget-object v1, p0, Ls6/t;->J:Lkd/c;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ls6/y;->f()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object v0, p1, Ls6/t;->a:Ls6/y;

    .line 6
    .line 7
    iget-object v0, v0, Ls6/y;->b:Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sub-int/2addr p4, p2

    .line 12
    sub-int/2addr p5, p3

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {v0, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ls6/t;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, Ls6/t;->l:I

    .line 12
    .line 13
    mul-int/lit8 v3, v2, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v3

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    mul-int/lit8 v2, v2, 0x2

    .line 34
    .line 35
    sub-int/2addr v0, v2

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ls6/t;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-boolean v0, p0, Ls6/t;->k0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    iget-object v0, p0, Ls6/t;->u:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 17
    .line 18
    iget-object v2, p0, Ls6/t;->a:Ls6/y;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ls6/y;->b(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v0, v3}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v2, p0, Ls6/t;->V:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, p0, Ls6/t;->R:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, v0, v3}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    const/4 v3, 0x1

    .line 48
    invoke-virtual {p0, v0, v3}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 49
    .line 50
    .line 51
    check-cast v1, LE5/I;

    .line 52
    .line 53
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 54
    .line 55
    .line 56
    iget-boolean v3, v1, LE5/I;->G:Z

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object v4, p0, Ls6/t;->Q:Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, LE5/I;->Q0()V

    .line 66
    .line 67
    .line 68
    iget-boolean v1, v1, LE5/I;->G:Z

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    iget-object v2, p0, Ls6/t;->U:Ljava/lang/String;

    .line 73
    .line 74
    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    :cond_5
    :goto_0
    return-void
.end method

.method public final r()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ls6/t;->h0:LE5/w0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v2, v0, Ls6/t;->l0:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide/16 v7, 0x0

    .line 18
    .line 19
    iget-object v9, v0, Ls6/t;->I:LE5/I0;

    .line 20
    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, LE5/I;

    .line 25
    .line 26
    invoke-virtual {v2}, LE5/I;->o0()LE5/J0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, LE5/J0;->o()I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    const/16 v11, 0x64

    .line 35
    .line 36
    if-le v10, v11, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v2}, LE5/J0;->o()I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    move v11, v3

    .line 44
    :goto_0
    if-ge v11, v10, :cond_3

    .line 45
    .line 46
    invoke-virtual {v2, v11, v9, v7, v8}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    iget-wide v12, v12, LE5/I0;->m:J

    .line 51
    .line 52
    cmp-long v12, v12, v5

    .line 53
    .line 54
    if-nez v12, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    add-int/lit8 v11, v11, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    move v2, v4

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    :goto_1
    move v2, v3

    .line 63
    :goto_2
    iput-boolean v2, v0, Ls6/t;->m0:Z

    .line 64
    .line 65
    iput-wide v7, v0, Ls6/t;->v0:J

    .line 66
    .line 67
    check-cast v1, LE5/I;

    .line 68
    .line 69
    invoke-virtual {v1}, LE5/I;->o0()LE5/J0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-nez v10, :cond_15

    .line 78
    .line 79
    invoke-virtual {v1}, LE5/I;->l0()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iget-boolean v10, v0, Ls6/t;->m0:Z

    .line 84
    .line 85
    if-eqz v10, :cond_5

    .line 86
    .line 87
    move v11, v3

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    move v11, v1

    .line 90
    :goto_3
    if-eqz v10, :cond_6

    .line 91
    .line 92
    invoke-virtual {v2}, LE5/J0;->o()I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    sub-int/2addr v10, v4

    .line 97
    goto :goto_4

    .line 98
    :cond_6
    move v10, v1

    .line 99
    :goto_4
    move v14, v3

    .line 100
    move-wide v12, v7

    .line 101
    :goto_5
    if-gt v11, v10, :cond_8

    .line 102
    .line 103
    move-wide v15, v5

    .line 104
    if-ne v11, v1, :cond_7

    .line 105
    .line 106
    invoke-static {v12, v13}, Lu6/v;->F(J)J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    iput-wide v5, v0, Ls6/t;->v0:J

    .line 111
    .line 112
    :cond_7
    invoke-virtual {v2, v11, v9}, LE5/J0;->n(ILE5/I0;)V

    .line 113
    .line 114
    .line 115
    iget-wide v5, v9, LE5/I0;->m:J

    .line 116
    .line 117
    cmp-long v5, v5, v15

    .line 118
    .line 119
    if-nez v5, :cond_9

    .line 120
    .line 121
    iget-boolean v1, v0, Ls6/t;->m0:Z

    .line 122
    .line 123
    xor-int/2addr v1, v4

    .line 124
    invoke-static {v1}, Lu6/a;->i(Z)V

    .line 125
    .line 126
    .line 127
    :cond_8
    move v2, v4

    .line 128
    goto/16 :goto_d

    .line 129
    .line 130
    :cond_9
    iget v5, v9, LE5/I0;->n:I

    .line 131
    .line 132
    :goto_6
    iget v6, v9, LE5/I0;->o:I

    .line 133
    .line 134
    if-gt v5, v6, :cond_14

    .line 135
    .line 136
    iget-object v6, v0, Ls6/t;->H:LE5/H0;

    .line 137
    .line 138
    invoke-virtual {v2, v5, v6, v3}, LE5/J0;->f(ILE5/H0;Z)LE5/H0;

    .line 139
    .line 140
    .line 141
    move-wide/from16 v17, v7

    .line 142
    .line 143
    iget-object v7, v6, LE5/H0;->g:Lg6/b;

    .line 144
    .line 145
    iget v8, v7, Lg6/b;->d:I

    .line 146
    .line 147
    move-wide/from16 v19, v15

    .line 148
    .line 149
    :goto_7
    iget v15, v7, Lg6/b;->a:I

    .line 150
    .line 151
    if-ge v8, v15, :cond_13

    .line 152
    .line 153
    invoke-virtual {v6, v8}, LE5/H0;->d(I)J

    .line 154
    .line 155
    .line 156
    move-result-wide v15

    .line 157
    const-wide/high16 v21, -0x8000000000000000L

    .line 158
    .line 159
    cmp-long v21, v15, v21

    .line 160
    .line 161
    if-nez v21, :cond_c

    .line 162
    .line 163
    iget-wide v3, v6, LE5/H0;->d:J

    .line 164
    .line 165
    cmp-long v15, v3, v19

    .line 166
    .line 167
    if-nez v15, :cond_b

    .line 168
    .line 169
    :cond_a
    move/from16 v16, v1

    .line 170
    .line 171
    move-object/from16 v24, v2

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    goto/16 :goto_c

    .line 175
    .line 176
    :cond_b
    move-wide v15, v3

    .line 177
    :cond_c
    iget-wide v3, v6, LE5/H0;->e:J

    .line 178
    .line 179
    add-long/2addr v15, v3

    .line 180
    cmp-long v3, v15, v17

    .line 181
    .line 182
    if-ltz v3, :cond_a

    .line 183
    .line 184
    iget-object v3, v0, Ls6/t;->r0:[J

    .line 185
    .line 186
    array-length v4, v3

    .line 187
    if-ne v14, v4, :cond_e

    .line 188
    .line 189
    array-length v4, v3

    .line 190
    if-nez v4, :cond_d

    .line 191
    .line 192
    const/4 v4, 0x1

    .line 193
    goto :goto_8

    .line 194
    :cond_d
    array-length v4, v3

    .line 195
    mul-int/lit8 v4, v4, 0x2

    .line 196
    .line 197
    :goto_8
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    iput-object v3, v0, Ls6/t;->r0:[J

    .line 202
    .line 203
    iget-object v3, v0, Ls6/t;->s0:[Z

    .line 204
    .line 205
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    iput-object v3, v0, Ls6/t;->s0:[Z

    .line 210
    .line 211
    :cond_e
    iget-object v3, v0, Ls6/t;->r0:[J

    .line 212
    .line 213
    add-long/2addr v15, v12

    .line 214
    invoke-static/range {v15 .. v16}, Lu6/v;->F(J)J

    .line 215
    .line 216
    .line 217
    move-result-wide v15

    .line 218
    aput-wide v15, v3, v14

    .line 219
    .line 220
    iget-object v3, v0, Ls6/t;->s0:[Z

    .line 221
    .line 222
    iget-object v4, v6, LE5/H0;->g:Lg6/b;

    .line 223
    .line 224
    invoke-virtual {v4, v8}, Lg6/b;->a(I)Lg6/a;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    iget v15, v4, Lg6/a;->b:I

    .line 229
    .line 230
    move/from16 v16, v1

    .line 231
    .line 232
    const/4 v1, -0x1

    .line 233
    if-ne v15, v1, :cond_f

    .line 234
    .line 235
    move-object/from16 v24, v2

    .line 236
    .line 237
    const/4 v2, 0x1

    .line 238
    const/16 v22, 0x1

    .line 239
    .line 240
    goto :goto_b

    .line 241
    :cond_f
    const/4 v1, 0x0

    .line 242
    :goto_9
    if-ge v1, v15, :cond_12

    .line 243
    .line 244
    move/from16 v23, v1

    .line 245
    .line 246
    iget-object v1, v4, Lg6/a;->e:[I

    .line 247
    .line 248
    aget v1, v1, v23

    .line 249
    .line 250
    move-object/from16 v24, v2

    .line 251
    .line 252
    const/4 v2, 0x1

    .line 253
    if-eqz v1, :cond_11

    .line 254
    .line 255
    if-ne v1, v2, :cond_10

    .line 256
    .line 257
    goto :goto_a

    .line 258
    :cond_10
    add-int/lit8 v1, v23, 0x1

    .line 259
    .line 260
    move-object/from16 v2, v24

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_11
    :goto_a
    move/from16 v22, v2

    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_12
    move-object/from16 v24, v2

    .line 267
    .line 268
    const/4 v2, 0x1

    .line 269
    const/16 v22, 0x0

    .line 270
    .line 271
    :goto_b
    xor-int/lit8 v1, v22, 0x1

    .line 272
    .line 273
    aput-boolean v1, v3, v14

    .line 274
    .line 275
    add-int/lit8 v14, v14, 0x1

    .line 276
    .line 277
    :goto_c
    add-int/lit8 v8, v8, 0x1

    .line 278
    .line 279
    move v4, v2

    .line 280
    move/from16 v1, v16

    .line 281
    .line 282
    move-object/from16 v2, v24

    .line 283
    .line 284
    const/4 v3, 0x0

    .line 285
    goto/16 :goto_7

    .line 286
    .line 287
    :cond_13
    move/from16 v16, v1

    .line 288
    .line 289
    move-object/from16 v24, v2

    .line 290
    .line 291
    move v2, v4

    .line 292
    add-int/lit8 v5, v5, 0x1

    .line 293
    .line 294
    move-wide/from16 v7, v17

    .line 295
    .line 296
    move-wide/from16 v15, v19

    .line 297
    .line 298
    move-object/from16 v2, v24

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    goto/16 :goto_6

    .line 302
    .line 303
    :cond_14
    move-object/from16 v24, v2

    .line 304
    .line 305
    move v2, v4

    .line 306
    move-wide/from16 v17, v7

    .line 307
    .line 308
    move-wide/from16 v19, v15

    .line 309
    .line 310
    move/from16 v16, v1

    .line 311
    .line 312
    iget-wide v3, v9, LE5/I0;->m:J

    .line 313
    .line 314
    add-long/2addr v12, v3

    .line 315
    add-int/lit8 v11, v11, 0x1

    .line 316
    .line 317
    move v4, v2

    .line 318
    move-wide/from16 v5, v19

    .line 319
    .line 320
    move-object/from16 v2, v24

    .line 321
    .line 322
    const/4 v3, 0x0

    .line 323
    goto/16 :goto_5

    .line 324
    .line 325
    :goto_d
    move-wide v7, v12

    .line 326
    goto :goto_e

    .line 327
    :cond_15
    move v2, v4

    .line 328
    move-wide/from16 v17, v7

    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    :goto_e
    invoke-static {v7, v8}, Lu6/v;->F(J)J

    .line 332
    .line 333
    .line 334
    move-result-wide v3

    .line 335
    iget-object v1, v0, Ls6/t;->C:Landroid/widget/TextView;

    .line 336
    .line 337
    if-eqz v1, :cond_16

    .line 338
    .line 339
    iget-object v5, v0, Ls6/t;->F:Ljava/lang/StringBuilder;

    .line 340
    .line 341
    iget-object v6, v0, Ls6/t;->G:Ljava/util/Formatter;

    .line 342
    .line 343
    invoke-static {v5, v6, v3, v4}, Lu6/v;->r(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    .line 349
    .line 350
    :cond_16
    iget-object v1, v0, Ls6/t;->E:Ls6/F;

    .line 351
    .line 352
    if-eqz v1, :cond_1a

    .line 353
    .line 354
    check-cast v1, Ls6/d;

    .line 355
    .line 356
    invoke-virtual {v1, v3, v4}, Ls6/d;->setDuration(J)V

    .line 357
    .line 358
    .line 359
    iget-object v3, v0, Ls6/t;->t0:[J

    .line 360
    .line 361
    array-length v4, v3

    .line 362
    add-int v5, v14, v4

    .line 363
    .line 364
    iget-object v6, v0, Ls6/t;->r0:[J

    .line 365
    .line 366
    array-length v7, v6

    .line 367
    if-le v5, v7, :cond_17

    .line 368
    .line 369
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    iput-object v6, v0, Ls6/t;->r0:[J

    .line 374
    .line 375
    iget-object v6, v0, Ls6/t;->s0:[Z

    .line 376
    .line 377
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    iput-object v6, v0, Ls6/t;->s0:[Z

    .line 382
    .line 383
    :cond_17
    iget-object v6, v0, Ls6/t;->r0:[J

    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 387
    .line 388
    .line 389
    iget-object v3, v0, Ls6/t;->u0:[Z

    .line 390
    .line 391
    iget-object v6, v0, Ls6/t;->s0:[Z

    .line 392
    .line 393
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 394
    .line 395
    .line 396
    iget-object v3, v0, Ls6/t;->r0:[J

    .line 397
    .line 398
    iget-object v4, v0, Ls6/t;->s0:[Z

    .line 399
    .line 400
    if-eqz v5, :cond_19

    .line 401
    .line 402
    if-eqz v3, :cond_18

    .line 403
    .line 404
    if-eqz v4, :cond_18

    .line 405
    .line 406
    goto :goto_f

    .line 407
    :cond_18
    move v2, v7

    .line 408
    :cond_19
    :goto_f
    invoke-static {v2}, Lu6/a;->e(Z)V

    .line 409
    .line 410
    .line 411
    iput v5, v1, Ls6/d;->M:I

    .line 412
    .line 413
    iput-object v3, v1, Ls6/d;->N:[J

    .line 414
    .line 415
    iput-object v4, v1, Ls6/d;->O:[Z

    .line 416
    .line 417
    invoke-virtual {v1}, Ls6/d;->e()V

    .line 418
    .line 419
    .line 420
    :cond_1a
    invoke-virtual {v0}, Ls6/t;->n()V

    .line 421
    .line 422
    .line 423
    return-void
.end method

.method public final s()V
    .locals 11

    .line 1
    iget-object v0, p0, Ls6/t;->h:Ls6/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Ls6/i;->i:Ljava/util/List;

    .line 9
    .line 10
    iget-object v2, p0, Ls6/t;->i:Ls6/i;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v1, v2, Ls6/i;->i:Ljava/util/List;

    .line 16
    .line 17
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iget-object v4, p0, Ls6/t;->w:Landroid/widget/ImageView;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    const/16 v6, 0x1e

    .line 26
    .line 27
    check-cast v1, LA7/B0;

    .line 28
    .line 29
    invoke-virtual {v1, v6}, LA7/B0;->H(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_6

    .line 34
    .line 35
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 36
    .line 37
    const/16 v6, 0x1d

    .line 38
    .line 39
    check-cast v1, LA7/B0;

    .line 40
    .line 41
    invoke-virtual {v1, v6}, LA7/B0;->H(I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_0
    iget-object v1, p0, Ls6/t;->h0:LE5/w0;

    .line 50
    .line 51
    check-cast v1, LE5/I;

    .line 52
    .line 53
    invoke-virtual {v1}, LE5/I;->p0()LE5/L0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0, v1, v3}, Ls6/t;->e(LE5/L0;I)Ll8/e0;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iput-object v6, v2, Ls6/i;->i:Ljava/util/List;

    .line 62
    .line 63
    iget-object v7, v2, Ls6/i;->l:Ls6/t;

    .line 64
    .line 65
    iget-object v8, v7, Ls6/t;->h0:LE5/w0;

    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast v8, LE5/I;

    .line 71
    .line 72
    invoke-virtual {v8}, LE5/I;->v0()Lr6/f;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    iget-object v10, v7, Ls6/t;->f:Ls6/p;

    .line 81
    .line 82
    if-eqz v9, :cond_1

    .line 83
    .line 84
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const v6, 0x7f13008d

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v6, v10, Ls6/p;->j:[Ljava/lang/String;

    .line 96
    .line 97
    aput-object v2, v6, v3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {v2, v8}, Ls6/i;->a(Lr6/f;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_2

    .line 105
    .line 106
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const v6, 0x7f13008c

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v6, v10, Ls6/p;->j:[Ljava/lang/String;

    .line 118
    .line 119
    aput-object v2, v6, v3

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    move v2, v5

    .line 123
    :goto_0
    iget v7, v6, Ll8/e0;->d:I

    .line 124
    .line 125
    if-ge v2, v7, :cond_4

    .line 126
    .line 127
    invoke-virtual {v6, v2}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    check-cast v7, Ls6/r;

    .line 132
    .line 133
    iget-object v8, v7, Ls6/r;->a:LE5/K0;

    .line 134
    .line 135
    iget-object v8, v8, LE5/K0;->e:[Z

    .line 136
    .line 137
    iget v9, v7, Ls6/r;->b:I

    .line 138
    .line 139
    aget-boolean v8, v8, v9

    .line 140
    .line 141
    if-eqz v8, :cond_3

    .line 142
    .line 143
    iget-object v2, v10, Ls6/p;->j:[Ljava/lang/String;

    .line 144
    .line 145
    iget-object v6, v7, Ls6/r;->c:Ljava/lang/String;

    .line 146
    .line 147
    aput-object v6, v2, v3

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    :goto_1
    iget-object v2, p0, Ls6/t;->a:Ls6/y;

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Ls6/y;->b(Landroid/view/View;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_5

    .line 160
    .line 161
    const/4 v2, 0x3

    .line 162
    invoke-virtual {p0, v1, v2}, Ls6/t;->e(LE5/L0;I)Ll8/e0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v0, v1}, Ls6/i;->b(Ljava/util/List;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ls6/i;->b(Ljava/util/List;)V

    .line 173
    .line 174
    .line 175
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ls6/i;->getItemCount()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-lez v0, :cond_7

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    move v3, v5

    .line 183
    :goto_3
    invoke-virtual {p0, v4, v3}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iput-boolean p1, v0, Ls6/y;->C:Z

    .line 4
    .line 5
    return-void
.end method

.method public setOnFullScreenModeChangedListener(Ls6/k;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Ls6/t;->i0:Ls6/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    move v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v0

    .line 10
    :goto_0
    const/16 v3, 0x8

    .line 11
    .line 12
    iget-object v4, p0, Ls6/t;->x:Landroid/widget/ImageView;

    .line 13
    .line 14
    if-nez v4, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    :goto_1
    if-eqz p1, :cond_3

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_3
    move v1, v0

    .line 30
    :goto_2
    iget-object p1, p0, Ls6/t;->y:Landroid/widget/ImageView;

    .line 31
    .line 32
    if-nez p1, :cond_4

    .line 33
    .line 34
    return-void

    .line 35
    :cond_4
    if-eqz v1, :cond_5

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_5
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public setPlayer(LE5/w0;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    check-cast v0, LE5/I;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v0, v0, LE5/I;->s:Landroid/os/Looper;

    .line 29
    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    :cond_1
    move v2, v3

    .line 33
    :cond_2
    invoke-static {v2}, Lu6/a;->e(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 37
    .line 38
    if-ne v0, p1, :cond_3

    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    iget-object v1, p0, Ls6/t;->c:Ls6/j;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    check-cast v0, LE5/I;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, LE5/I;->C0(LE5/u0;)V

    .line 48
    .line 49
    .line 50
    :cond_4
    iput-object p1, p0, Ls6/t;->h0:LE5/w0;

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    check-cast p1, LE5/I;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object p1, p1, LE5/I;->l:LK8/H;

    .line 60
    .line 61
    invoke-virtual {p1, v1}, LK8/H;->d(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_5
    invoke-virtual {p0}, Ls6/t;->i()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public setProgressUpdateListener(Ls6/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 4

    .line 1
    iput p1, p0, Ls6/t;->q0:I

    .line 2
    .line 3
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    check-cast v0, LE5/I;

    .line 10
    .line 11
    invoke-virtual {v0}, LE5/I;->Q0()V

    .line 12
    .line 13
    .line 14
    iget v0, v0, LE5/I;->F:I

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 21
    .line 22
    check-cast v0, LE5/I;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, LE5/I;->J0(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    if-ne p1, v2, :cond_1

    .line 30
    .line 31
    if-ne v0, v3, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 34
    .line 35
    check-cast v0, LE5/I;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, LE5/I;->J0(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-ne p1, v3, :cond_2

    .line 42
    .line 43
    if-ne v0, v2, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Ls6/t;->h0:LE5/w0;

    .line 46
    .line 47
    check-cast v0, LE5/I;

    .line 48
    .line 49
    invoke-virtual {v0, v3}, LE5/I;->J0(I)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 53
    .line 54
    move v1, v2

    .line 55
    :cond_3
    iget-object p1, p0, Ls6/t;->a:Ls6/y;

    .line 56
    .line 57
    iget-object v0, p0, Ls6/t;->t:Landroid/widget/ImageView;

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ls6/t;->o()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->p:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ls6/t;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ls6/t;->l0:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Ls6/t;->r()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->n:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ls6/t;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->m:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ls6/t;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->q:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ls6/t;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->u:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ls6/t;->q()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->w:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls6/t;->o0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ls6/t;->g()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Ls6/t;->a:Ls6/y;

    .line 10
    .line 11
    invoke-virtual {p1}, Ls6/y;->g()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/t;->a:Ls6/y;

    .line 2
    .line 3
    iget-object v1, p0, Ls6/t;->v:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ls6/y;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lu6/v;->h(III)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Ls6/t;->p0:I

    .line 10
    .line 11
    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/t;->v:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, v0, p1}, Ls6/t;->j(Landroid/view/View;Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
