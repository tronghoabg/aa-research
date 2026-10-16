.class public final Ll4/g;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:Lcom/afollestad/materialdialogs/internal/MDRootLayout;

.field public b:Landroid/content/DialogInterface$OnShowListener;

.field public final c:Ll4/e;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/EditText;

.field public final h:Landroidx/recyclerview/widget/RecyclerView;

.field public final i:Landroid/view/View;

.field public final j:Landroid/widget/FrameLayout;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/CheckBox;

.field public final m:Lcom/afollestad/materialdialogs/internal/MDButton;

.field public final n:Lcom/afollestad/materialdialogs/internal/MDButton;

.field public final o:Lcom/afollestad/materialdialogs/internal/MDButton;

.field public final p:I


# direct methods
.method public constructor <init>(Ll4/e;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const v3, 0x10100a0

    .line 6
    .line 7
    .line 8
    const v4, -0x10100a0

    .line 9
    .line 10
    .line 11
    const v5, 0x101009e

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x4

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x2

    .line 18
    iget v10, v0, Ll4/e;->E:I

    .line 19
    .line 20
    if-ne v10, v9, :cond_0

    .line 21
    .line 22
    move v10, v8

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v10, v7

    .line 25
    :goto_0
    const v11, 0x7f04033e

    .line 26
    .line 27
    .line 28
    iget-object v12, v0, Ll4/e;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v12, v11, v10}, Lvf/a;->C(Landroid/content/Context;IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    if-eqz v10, :cond_1

    .line 35
    .line 36
    move v11, v9

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v11, v8

    .line 39
    :goto_1
    iput v11, v0, Ll4/e;->E:I

    .line 40
    .line 41
    if-eqz v10, :cond_2

    .line 42
    .line 43
    const v10, 0x7f140154

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const v10, 0x7f140155

    .line 48
    .line 49
    .line 50
    :goto_2
    invoke-direct {v1, v12, v10}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 51
    .line 52
    .line 53
    new-instance v10, Landroid/os/Handler;

    .line 54
    .line 55
    invoke-direct {v10}, Landroid/os/Handler;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, v1, Ll4/g;->c:Ll4/e;

    .line 59
    .line 60
    invoke-static {v12}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    iget-object v11, v0, Ll4/e;->m:Landroid/view/View;

    .line 65
    .line 66
    if-eqz v11, :cond_3

    .line 67
    .line 68
    const v11, 0x7f0d0068

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    iget-object v11, v0, Ll4/e;->y:Ll4/b;

    .line 73
    .line 74
    if-eqz v11, :cond_5

    .line 75
    .line 76
    iget-object v11, v0, Ll4/e;->C:Ljava/lang/CharSequence;

    .line 77
    .line 78
    if-eqz v11, :cond_4

    .line 79
    .line 80
    const v11, 0x7f0d006d

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    const v11, 0x7f0d006c

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    iget-object v11, v0, Ll4/e;->C:Ljava/lang/CharSequence;

    .line 89
    .line 90
    if-eqz v11, :cond_6

    .line 91
    .line 92
    const v11, 0x7f0d0066

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    const v11, 0x7f0d0065

    .line 97
    .line 98
    .line 99
    :goto_3
    const/4 v13, 0x0

    .line 100
    invoke-virtual {v10, v11, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    check-cast v10, Lcom/afollestad/materialdialogs/internal/MDRootLayout;

    .line 105
    .line 106
    iput-object v10, v1, Ll4/g;->a:Lcom/afollestad/materialdialogs/internal/MDRootLayout;

    .line 107
    .line 108
    invoke-virtual {v1, v8}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v8}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 112
    .line 113
    .line 114
    iget v11, v0, Ll4/e;->A:I

    .line 115
    .line 116
    if-nez v11, :cond_7

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    const v14, 0x7f040104

    .line 123
    .line 124
    .line 125
    invoke-static {v11, v14, v7}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    const v14, 0x7f040334

    .line 130
    .line 131
    .line 132
    invoke-static {v12, v14, v11}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    iput v11, v0, Ll4/e;->A:I

    .line 137
    .line 138
    :cond_7
    iget v11, v0, Ll4/e;->A:I

    .line 139
    .line 140
    if-eqz v11, :cond_8

    .line 141
    .line 142
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 143
    .line 144
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    const v15, 0x7f070272

    .line 152
    .line 153
    .line 154
    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getDimension(I)F

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 159
    .line 160
    .line 161
    iget v14, v0, Ll4/e;->A:I

    .line 162
    .line 163
    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    invoke-virtual {v14, v11}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    const v11, 0x7f04034b

    .line 174
    .line 175
    .line 176
    iget-object v14, v0, Ll4/e;->o:Landroid/content/res/ColorStateList;

    .line 177
    .line 178
    invoke-static {v12, v11, v14}, Lvf/a;->B(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    iput-object v11, v0, Ll4/e;->o:Landroid/content/res/ColorStateList;

    .line 183
    .line 184
    const v11, 0x7f04034a

    .line 185
    .line 186
    .line 187
    iget-object v14, v0, Ll4/e;->q:Landroid/content/res/ColorStateList;

    .line 188
    .line 189
    invoke-static {v12, v11, v14}, Lvf/a;->B(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    iput-object v11, v0, Ll4/e;->q:Landroid/content/res/ColorStateList;

    .line 194
    .line 195
    const v11, 0x7f040349

    .line 196
    .line 197
    .line 198
    iget-object v14, v0, Ll4/e;->p:Landroid/content/res/ColorStateList;

    .line 199
    .line 200
    invoke-static {v12, v11, v14}, Lvf/a;->B(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    iput-object v11, v0, Ll4/e;->p:Landroid/content/res/ColorStateList;

    .line 205
    .line 206
    const v11, 0x7f040350

    .line 207
    .line 208
    .line 209
    iget v14, v0, Ll4/e;->n:I

    .line 210
    .line 211
    invoke-static {v12, v11, v14}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    iput v11, v0, Ll4/e;->n:I

    .line 216
    .line 217
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    const v14, 0x1010036

    .line 222
    .line 223
    .line 224
    invoke-static {v11, v14, v7}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    const v15, 0x7f04034e

    .line 229
    .line 230
    .line 231
    invoke-static {v12, v15, v11}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    iput v11, v0, Ll4/e;->i:I

    .line 236
    .line 237
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    const v15, 0x1010038

    .line 242
    .line 243
    .line 244
    invoke-static {v11, v15, v7}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    const v15, 0x7f04033c

    .line 249
    .line 250
    .line 251
    invoke-static {v12, v15, v11}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    iput v11, v0, Ll4/e;->j:I

    .line 256
    .line 257
    const v15, 0x7f040344

    .line 258
    .line 259
    .line 260
    invoke-static {v12, v15, v11}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    iput v11, v0, Ll4/e;->B:I

    .line 265
    .line 266
    const v11, 0x7f0a01b1

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    check-cast v11, Landroid/widget/TextView;

    .line 274
    .line 275
    iput-object v11, v1, Ll4/g;->e:Landroid/widget/TextView;

    .line 276
    .line 277
    const v11, 0x7f0a01ab

    .line 278
    .line 279
    .line 280
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    check-cast v11, Landroid/widget/ImageView;

    .line 285
    .line 286
    iput-object v11, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 287
    .line 288
    const v11, 0x7f0a01b2

    .line 289
    .line 290
    .line 291
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    iput-object v11, v1, Ll4/g;->i:Landroid/view/View;

    .line 296
    .line 297
    const v11, 0x7f0a01a3

    .line 298
    .line 299
    .line 300
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    check-cast v11, Landroid/widget/TextView;

    .line 305
    .line 306
    iput-object v11, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 307
    .line 308
    const v11, 0x7f0a01a5

    .line 309
    .line 310
    .line 311
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    check-cast v11, Landroidx/recyclerview/widget/RecyclerView;

    .line 316
    .line 317
    iput-object v11, v1, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 318
    .line 319
    const v11, 0x7f0a01af

    .line 320
    .line 321
    .line 322
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    check-cast v11, Landroid/widget/CheckBox;

    .line 327
    .line 328
    iput-object v11, v1, Ll4/g;->l:Landroid/widget/CheckBox;

    .line 329
    .line 330
    const v11, 0x7f0a0194

    .line 331
    .line 332
    .line 333
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    check-cast v11, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 338
    .line 339
    iput-object v11, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 340
    .line 341
    const v11, 0x7f0a0193

    .line 342
    .line 343
    .line 344
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    check-cast v11, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 349
    .line 350
    iput-object v11, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 351
    .line 352
    const v11, 0x7f0a0192

    .line 353
    .line 354
    .line 355
    invoke-virtual {v10, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    check-cast v11, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 360
    .line 361
    iput-object v11, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 362
    .line 363
    iget-object v11, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 364
    .line 365
    iget-object v15, v0, Ll4/e;->k:Ljava/lang/String;

    .line 366
    .line 367
    const/16 v13, 0x8

    .line 368
    .line 369
    if-eqz v15, :cond_9

    .line 370
    .line 371
    move v15, v7

    .line 372
    goto :goto_4

    .line 373
    :cond_9
    move v15, v13

    .line 374
    :goto_4
    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    .line 375
    .line 376
    .line 377
    iget-object v11, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 378
    .line 379
    invoke-virtual {v11, v13}, Landroid/view/View;->setVisibility(I)V

    .line 380
    .line 381
    .line 382
    iget-object v11, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 383
    .line 384
    iget-object v15, v0, Ll4/e;->l:Ljava/lang/String;

    .line 385
    .line 386
    if-eqz v15, :cond_a

    .line 387
    .line 388
    move v15, v7

    .line 389
    goto :goto_5

    .line 390
    :cond_a
    move v15, v13

    .line 391
    :goto_5
    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    .line 392
    .line 393
    .line 394
    iget-object v11, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 395
    .line 396
    invoke-virtual {v11, v8}, Landroid/view/View;->setFocusable(Z)V

    .line 397
    .line 398
    .line 399
    iget-object v11, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 400
    .line 401
    invoke-virtual {v11, v8}, Landroid/view/View;->setFocusable(Z)V

    .line 402
    .line 403
    .line 404
    iget-object v11, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 405
    .line 406
    invoke-virtual {v11, v8}, Landroid/view/View;->setFocusable(Z)V

    .line 407
    .line 408
    .line 409
    iget-object v11, v0, Ll4/e;->x:Landroid/graphics/drawable/Drawable;

    .line 410
    .line 411
    if-eqz v11, :cond_b

    .line 412
    .line 413
    iget-object v11, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 414
    .line 415
    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 416
    .line 417
    .line 418
    iget-object v11, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 419
    .line 420
    iget-object v15, v0, Ll4/e;->x:Landroid/graphics/drawable/Drawable;

    .line 421
    .line 422
    invoke-virtual {v11, v15}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 423
    .line 424
    .line 425
    goto :goto_6

    .line 426
    :cond_b
    const v11, 0x7f040341

    .line 427
    .line 428
    .line 429
    invoke-static {v12, v11}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    if-eqz v11, :cond_c

    .line 434
    .line 435
    iget-object v15, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 436
    .line 437
    invoke-virtual {v15, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 438
    .line 439
    .line 440
    iget-object v15, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 441
    .line 442
    invoke-virtual {v15, v11}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 443
    .line 444
    .line 445
    goto :goto_6

    .line 446
    :cond_c
    iget-object v11, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 447
    .line 448
    invoke-virtual {v11, v13}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 449
    .line 450
    .line 451
    :goto_6
    invoke-virtual {v12}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 452
    .line 453
    .line 454
    move-result-object v11

    .line 455
    const v15, 0x7f040343

    .line 456
    .line 457
    .line 458
    filled-new-array {v15}, [I

    .line 459
    .line 460
    .line 461
    move-result-object v15

    .line 462
    invoke-virtual {v11, v15}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    const/4 v15, -0x1

    .line 467
    :try_start_0
    invoke-virtual {v11, v7, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 468
    .line 469
    .line 470
    move-result v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 471
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 472
    .line 473
    .line 474
    const v11, 0x7f040342

    .line 475
    .line 476
    .line 477
    invoke-static {v12, v11, v7}, Lvf/a;->C(Landroid/content/Context;IZ)Z

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    if-eqz v11, :cond_d

    .line 482
    .line 483
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 484
    .line 485
    .line 486
    move-result-object v11

    .line 487
    const v2, 0x7f070288

    .line 488
    .line 489
    .line 490
    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 491
    .line 492
    .line 493
    move-result v16

    .line 494
    :cond_d
    move/from16 v2, v16

    .line 495
    .line 496
    if-le v2, v15, :cond_e

    .line 497
    .line 498
    iget-object v11, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 499
    .line 500
    invoke-virtual {v11, v8}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 501
    .line 502
    .line 503
    iget-object v11, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 504
    .line 505
    invoke-virtual {v11, v2}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 506
    .line 507
    .line 508
    iget-object v11, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 509
    .line 510
    invoke-virtual {v11, v2}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 511
    .line 512
    .line 513
    iget-object v2, v1, Ll4/g;->d:Landroid/widget/ImageView;

    .line 514
    .line 515
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 516
    .line 517
    .line 518
    :cond_e
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const v11, 0x7f04033f

    .line 523
    .line 524
    .line 525
    invoke-static {v2, v11, v7}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    const v11, 0x7f040340

    .line 530
    .line 531
    .line 532
    invoke-static {v12, v11, v2}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    invoke-virtual {v10, v2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->setDividerColor(I)V

    .line 537
    .line 538
    .line 539
    iget-object v2, v1, Ll4/g;->e:Landroid/widget/TextView;

    .line 540
    .line 541
    const/16 v16, 0x5

    .line 542
    .line 543
    if-eqz v2, :cond_12

    .line 544
    .line 545
    iget-object v11, v0, Ll4/e;->w:Landroid/graphics/Typeface;

    .line 546
    .line 547
    invoke-static {v2, v11}, Ll4/g;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 548
    .line 549
    .line 550
    iget-object v2, v1, Ll4/g;->e:Landroid/widget/TextView;

    .line 551
    .line 552
    iget v11, v0, Ll4/e;->i:I

    .line 553
    .line 554
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 555
    .line 556
    .line 557
    iget-object v2, v1, Ll4/g;->e:Landroid/widget/TextView;

    .line 558
    .line 559
    iget-object v11, v0, Ll4/e;->c:Ll4/d;

    .line 560
    .line 561
    invoke-virtual {v11}, Ll4/d;->a()I

    .line 562
    .line 563
    .line 564
    move-result v11

    .line 565
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 566
    .line 567
    .line 568
    iget-object v2, v1, Ll4/g;->e:Landroid/widget/TextView;

    .line 569
    .line 570
    iget-object v11, v0, Ll4/e;->c:Ll4/d;

    .line 571
    .line 572
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 573
    .line 574
    .line 575
    move-result v11

    .line 576
    if-eq v11, v8, :cond_10

    .line 577
    .line 578
    if-eq v11, v9, :cond_f

    .line 579
    .line 580
    move/from16 v11, v16

    .line 581
    .line 582
    goto :goto_7

    .line 583
    :cond_f
    const/4 v11, 0x6

    .line 584
    goto :goto_7

    .line 585
    :cond_10
    move v11, v6

    .line 586
    :goto_7
    invoke-virtual {v2, v11}, Landroid/view/View;->setTextAlignment(I)V

    .line 587
    .line 588
    .line 589
    iget-object v2, v0, Ll4/e;->b:Ljava/lang/CharSequence;

    .line 590
    .line 591
    if-nez v2, :cond_11

    .line 592
    .line 593
    iget-object v2, v1, Ll4/g;->i:Landroid/view/View;

    .line 594
    .line 595
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 596
    .line 597
    .line 598
    goto :goto_8

    .line 599
    :cond_11
    iget-object v11, v1, Ll4/g;->e:Landroid/widget/TextView;

    .line 600
    .line 601
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 602
    .line 603
    .line 604
    iget-object v2, v1, Ll4/g;->i:Landroid/view/View;

    .line 605
    .line 606
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 607
    .line 608
    .line 609
    :cond_12
    :goto_8
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 610
    .line 611
    if-eqz v2, :cond_16

    .line 612
    .line 613
    new-instance v11, Landroid/text/method/LinkMovementMethod;

    .line 614
    .line 615
    invoke-direct {v11}, Landroid/text/method/LinkMovementMethod;-><init>()V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 619
    .line 620
    .line 621
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 622
    .line 623
    iget-object v11, v0, Ll4/e;->v:Landroid/graphics/Typeface;

    .line 624
    .line 625
    invoke-static {v2, v11}, Ll4/g;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 626
    .line 627
    .line 628
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 629
    .line 630
    const/4 v11, 0x0

    .line 631
    const v15, 0x3f99999a    # 1.2f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v11, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 635
    .line 636
    .line 637
    iget-object v2, v0, Ll4/e;->r:Landroid/content/res/ColorStateList;

    .line 638
    .line 639
    if-nez v2, :cond_13

    .line 640
    .line 641
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 642
    .line 643
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 644
    .line 645
    .line 646
    move-result-object v11

    .line 647
    invoke-static {v11, v14, v7}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 648
    .line 649
    .line 650
    move-result v11

    .line 651
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 652
    .line 653
    .line 654
    goto :goto_9

    .line 655
    :cond_13
    iget-object v11, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 656
    .line 657
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 658
    .line 659
    .line 660
    :goto_9
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 661
    .line 662
    iget v11, v0, Ll4/e;->j:I

    .line 663
    .line 664
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 665
    .line 666
    .line 667
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 668
    .line 669
    iget-object v11, v0, Ll4/e;->d:Ll4/d;

    .line 670
    .line 671
    invoke-virtual {v11}, Ll4/d;->a()I

    .line 672
    .line 673
    .line 674
    move-result v11

    .line 675
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 676
    .line 677
    .line 678
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 679
    .line 680
    iget-object v11, v0, Ll4/e;->d:Ll4/d;

    .line 681
    .line 682
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 683
    .line 684
    .line 685
    move-result v11

    .line 686
    if-eq v11, v8, :cond_15

    .line 687
    .line 688
    if-eq v11, v9, :cond_14

    .line 689
    .line 690
    move/from16 v11, v16

    .line 691
    .line 692
    goto :goto_a

    .line 693
    :cond_14
    const/4 v11, 0x6

    .line 694
    goto :goto_a

    .line 695
    :cond_15
    move v11, v6

    .line 696
    :goto_a
    invoke-virtual {v2, v11}, Landroid/view/View;->setTextAlignment(I)V

    .line 697
    .line 698
    .line 699
    iget-object v2, v1, Ll4/g;->f:Landroid/widget/TextView;

    .line 700
    .line 701
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 702
    .line 703
    .line 704
    :cond_16
    iget-object v2, v1, Ll4/g;->l:Landroid/widget/CheckBox;

    .line 705
    .line 706
    const v11, 0x3e99999a    # 0.3f

    .line 707
    .line 708
    .line 709
    if-eqz v2, :cond_18

    .line 710
    .line 711
    iget-object v15, v0, Ll4/e;->C:Ljava/lang/CharSequence;

    .line 712
    .line 713
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 714
    .line 715
    .line 716
    iget-object v2, v1, Ll4/g;->l:Landroid/widget/CheckBox;

    .line 717
    .line 718
    invoke-virtual {v2, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 719
    .line 720
    .line 721
    iget-object v2, v1, Ll4/g;->l:Landroid/widget/CheckBox;

    .line 722
    .line 723
    iget-object v15, v0, Ll4/e;->D:Lhc/a;

    .line 724
    .line 725
    invoke-virtual {v2, v15}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 726
    .line 727
    .line 728
    iget-object v2, v1, Ll4/g;->l:Landroid/widget/CheckBox;

    .line 729
    .line 730
    iget-object v15, v0, Ll4/e;->v:Landroid/graphics/Typeface;

    .line 731
    .line 732
    invoke-static {v2, v15}, Ll4/g;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 733
    .line 734
    .line 735
    iget-object v2, v1, Ll4/g;->l:Landroid/widget/CheckBox;

    .line 736
    .line 737
    iget v15, v0, Ll4/e;->j:I

    .line 738
    .line 739
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 740
    .line 741
    .line 742
    iget-object v2, v1, Ll4/g;->l:Landroid/widget/CheckBox;

    .line 743
    .line 744
    iget v15, v0, Ll4/e;->n:I

    .line 745
    .line 746
    move/from16 v16, v9

    .line 747
    .line 748
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 749
    .line 750
    .line 751
    move-result-object v9

    .line 752
    invoke-static {v9, v14, v7}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 753
    .line 754
    .line 755
    move-result v9

    .line 756
    invoke-static {v9}, Lvf/a;->y(I)Z

    .line 757
    .line 758
    .line 759
    move-result v9

    .line 760
    if-eqz v9, :cond_17

    .line 761
    .line 762
    const/high16 v9, -0x1000000

    .line 763
    .line 764
    goto :goto_b

    .line 765
    :cond_17
    const/4 v9, -0x1

    .line 766
    :goto_b
    invoke-static {v11, v9}, Lvf/a;->h(FI)I

    .line 767
    .line 768
    .line 769
    move-result v9

    .line 770
    new-instance v14, Landroid/content/res/ColorStateList;

    .line 771
    .line 772
    new-array v6, v6, [[I

    .line 773
    .line 774
    filled-new-array {v5, v4}, [I

    .line 775
    .line 776
    .line 777
    move-result-object v17

    .line 778
    aput-object v17, v6, v7

    .line 779
    .line 780
    filled-new-array {v5, v3}, [I

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    aput-object v5, v6, v8

    .line 785
    .line 786
    const v5, -0x101009e

    .line 787
    .line 788
    .line 789
    filled-new-array {v5, v4}, [I

    .line 790
    .line 791
    .line 792
    move-result-object v4

    .line 793
    aput-object v4, v6, v16

    .line 794
    .line 795
    filled-new-array {v5, v3}, [I

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    const/4 v4, 0x3

    .line 800
    aput-object v3, v6, v4

    .line 801
    .line 802
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 803
    .line 804
    .line 805
    move-result-object v3

    .line 806
    const v4, 0x7f040109

    .line 807
    .line 808
    .line 809
    invoke-static {v3, v4, v7}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    filled-new-array {v3, v15, v9, v9}, [I

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    invoke-direct {v14, v6, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v2, v14}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 821
    .line 822
    .line 823
    goto :goto_c

    .line 824
    :cond_18
    move/from16 v16, v9

    .line 825
    .line 826
    :goto_c
    iget-object v2, v0, Ll4/e;->g:Ll4/d;

    .line 827
    .line 828
    invoke-virtual {v10, v2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->setButtonGravity(Ll4/d;)V

    .line 829
    .line 830
    .line 831
    iget-object v2, v0, Ll4/e;->e:Ll4/d;

    .line 832
    .line 833
    invoke-virtual {v10, v2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->setButtonStackedGravity(Ll4/d;)V

    .line 834
    .line 835
    .line 836
    const/4 v2, 0x0

    .line 837
    invoke-virtual {v10, v2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->setStackingBehavior(Ll4/i;)V

    .line 838
    .line 839
    .line 840
    const v2, 0x101038c

    .line 841
    .line 842
    .line 843
    invoke-static {v12, v2, v8}, Lvf/a;->C(Landroid/content/Context;IZ)Z

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    if-eqz v2, :cond_19

    .line 848
    .line 849
    const v2, 0x7f0404bd

    .line 850
    .line 851
    .line 852
    invoke-static {v12, v2, v8}, Lvf/a;->C(Landroid/content/Context;IZ)Z

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    :cond_19
    iget-object v3, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 857
    .line 858
    iget-object v4, v0, Ll4/e;->w:Landroid/graphics/Typeface;

    .line 859
    .line 860
    invoke-static {v3, v4}, Ll4/g;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v3, v2}, Lcom/afollestad/materialdialogs/internal/MDButton;->setAllCapsCompat(Z)V

    .line 864
    .line 865
    .line 866
    iget-object v4, v0, Ll4/e;->k:Ljava/lang/String;

    .line 867
    .line 868
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 869
    .line 870
    .line 871
    iget-object v4, v0, Ll4/e;->o:Landroid/content/res/ColorStateList;

    .line 872
    .line 873
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 874
    .line 875
    .line 876
    iget-object v3, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 877
    .line 878
    sget-object v4, Ll4/c;->a:Ll4/c;

    .line 879
    .line 880
    invoke-virtual {v1, v4, v8}, Ll4/g;->a(Ll4/c;Z)Landroid/graphics/drawable/Drawable;

    .line 881
    .line 882
    .line 883
    move-result-object v5

    .line 884
    invoke-virtual {v3, v5}, Lcom/afollestad/materialdialogs/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 885
    .line 886
    .line 887
    iget-object v3, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 888
    .line 889
    invoke-virtual {v1, v4, v7}, Ll4/g;->a(Ll4/c;Z)Landroid/graphics/drawable/Drawable;

    .line 890
    .line 891
    .line 892
    move-result-object v5

    .line 893
    invoke-virtual {v3, v5}, Lcom/afollestad/materialdialogs/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 894
    .line 895
    .line 896
    iget-object v3, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 897
    .line 898
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    iget-object v3, v1, Ll4/g;->m:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 902
    .line 903
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 904
    .line 905
    .line 906
    iget-object v3, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 907
    .line 908
    iget-object v4, v0, Ll4/e;->w:Landroid/graphics/Typeface;

    .line 909
    .line 910
    invoke-static {v3, v4}, Ll4/g;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v3, v2}, Lcom/afollestad/materialdialogs/internal/MDButton;->setAllCapsCompat(Z)V

    .line 914
    .line 915
    .line 916
    iget-object v4, v0, Ll4/e;->l:Ljava/lang/String;

    .line 917
    .line 918
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 919
    .line 920
    .line 921
    iget-object v4, v0, Ll4/e;->p:Landroid/content/res/ColorStateList;

    .line 922
    .line 923
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 924
    .line 925
    .line 926
    iget-object v3, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 927
    .line 928
    sget-object v4, Ll4/c;->c:Ll4/c;

    .line 929
    .line 930
    invoke-virtual {v1, v4, v8}, Ll4/g;->a(Ll4/c;Z)Landroid/graphics/drawable/Drawable;

    .line 931
    .line 932
    .line 933
    move-result-object v5

    .line 934
    invoke-virtual {v3, v5}, Lcom/afollestad/materialdialogs/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 935
    .line 936
    .line 937
    iget-object v3, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 938
    .line 939
    invoke-virtual {v1, v4, v7}, Ll4/g;->a(Ll4/c;Z)Landroid/graphics/drawable/Drawable;

    .line 940
    .line 941
    .line 942
    move-result-object v5

    .line 943
    invoke-virtual {v3, v5}, Lcom/afollestad/materialdialogs/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 944
    .line 945
    .line 946
    iget-object v3, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 947
    .line 948
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 949
    .line 950
    .line 951
    iget-object v3, v1, Ll4/g;->o:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 952
    .line 953
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 954
    .line 955
    .line 956
    iget-object v3, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 957
    .line 958
    iget-object v4, v0, Ll4/e;->w:Landroid/graphics/Typeface;

    .line 959
    .line 960
    invoke-static {v3, v4}, Ll4/g;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v3, v2}, Lcom/afollestad/materialdialogs/internal/MDButton;->setAllCapsCompat(Z)V

    .line 964
    .line 965
    .line 966
    const/4 v2, 0x0

    .line 967
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 968
    .line 969
    .line 970
    iget-object v2, v0, Ll4/e;->q:Landroid/content/res/ColorStateList;

    .line 971
    .line 972
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 973
    .line 974
    .line 975
    iget-object v2, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 976
    .line 977
    sget-object v3, Ll4/c;->b:Ll4/c;

    .line 978
    .line 979
    invoke-virtual {v1, v3, v8}, Ll4/g;->a(Ll4/c;Z)Landroid/graphics/drawable/Drawable;

    .line 980
    .line 981
    .line 982
    move-result-object v4

    .line 983
    invoke-virtual {v2, v4}, Lcom/afollestad/materialdialogs/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 984
    .line 985
    .line 986
    iget-object v2, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 987
    .line 988
    invoke-virtual {v1, v3, v7}, Ll4/g;->a(Ll4/c;Z)Landroid/graphics/drawable/Drawable;

    .line 989
    .line 990
    .line 991
    move-result-object v4

    .line 992
    invoke-virtual {v2, v4}, Lcom/afollestad/materialdialogs/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 993
    .line 994
    .line 995
    iget-object v2, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 996
    .line 997
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    iget-object v2, v1, Ll4/g;->n:Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 1001
    .line 1002
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1003
    .line 1004
    .line 1005
    iget-object v2, v1, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 1006
    .line 1007
    if-eqz v2, :cond_1a

    .line 1008
    .line 1009
    iget-object v2, v0, Ll4/e;->y:Ll4/b;

    .line 1010
    .line 1011
    if-nez v2, :cond_1a

    .line 1012
    .line 1013
    iput v8, v1, Ll4/g;->p:I

    .line 1014
    .line 1015
    new-instance v2, Ll4/b;

    .line 1016
    .line 1017
    const v3, 0x7f0d0071

    .line 1018
    .line 1019
    .line 1020
    invoke-direct {v2, v1, v3}, Ll4/b;-><init>(Ll4/g;I)V

    .line 1021
    .line 1022
    .line 1023
    iput-object v2, v0, Ll4/e;->y:Ll4/b;

    .line 1024
    .line 1025
    :cond_1a
    const v2, 0x1020009

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v10, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    check-cast v2, Landroid/widget/EditText;

    .line 1033
    .line 1034
    iput-object v2, v1, Ll4/g;->g:Landroid/widget/EditText;

    .line 1035
    .line 1036
    if-nez v2, :cond_1b

    .line 1037
    .line 1038
    goto :goto_e

    .line 1039
    :cond_1b
    iget-object v3, v0, Ll4/e;->v:Landroid/graphics/Typeface;

    .line 1040
    .line 1041
    invoke-static {v2, v3}, Ll4/g;->d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 1042
    .line 1043
    .line 1044
    iget-object v2, v1, Ll4/g;->g:Landroid/widget/EditText;

    .line 1045
    .line 1046
    if-nez v2, :cond_1c

    .line 1047
    .line 1048
    goto :goto_d

    .line 1049
    :cond_1c
    new-instance v3, Lf8/w;

    .line 1050
    .line 1051
    invoke-direct {v3, v1, v8}, Lf8/w;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1055
    .line 1056
    .line 1057
    :goto_d
    iget-object v2, v1, Ll4/g;->g:Landroid/widget/EditText;

    .line 1058
    .line 1059
    const/4 v3, 0x0

    .line 1060
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 1061
    .line 1062
    .line 1063
    iget-object v2, v1, Ll4/g;->g:Landroid/widget/EditText;

    .line 1064
    .line 1065
    invoke-virtual {v2}, Landroid/widget/TextView;->setSingleLine()V

    .line 1066
    .line 1067
    .line 1068
    iget-object v2, v1, Ll4/g;->g:Landroid/widget/EditText;

    .line 1069
    .line 1070
    iget v3, v0, Ll4/e;->j:I

    .line 1071
    .line 1072
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1073
    .line 1074
    .line 1075
    iget-object v2, v1, Ll4/g;->g:Landroid/widget/EditText;

    .line 1076
    .line 1077
    iget v3, v0, Ll4/e;->j:I

    .line 1078
    .line 1079
    invoke-static {v11, v3}, Lvf/a;->h(FI)I

    .line 1080
    .line 1081
    .line 1082
    move-result v3

    .line 1083
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 1084
    .line 1085
    .line 1086
    iget-object v2, v1, Ll4/g;->g:Landroid/widget/EditText;

    .line 1087
    .line 1088
    iget v3, v0, Ll4/e;->n:I

    .line 1089
    .line 1090
    invoke-static {v2, v3}, Lgc/b;->I(Landroid/widget/EditText;I)V

    .line 1091
    .line 1092
    .line 1093
    const v2, 0x7f0a01ae

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v10, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v2

    .line 1100
    check-cast v2, Landroid/widget/TextView;

    .line 1101
    .line 1102
    iput-object v2, v1, Ll4/g;->k:Landroid/widget/TextView;

    .line 1103
    .line 1104
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 1105
    .line 1106
    .line 1107
    const/4 v2, 0x0

    .line 1108
    iput-object v2, v1, Ll4/g;->k:Landroid/widget/TextView;

    .line 1109
    .line 1110
    :goto_e
    iget-object v2, v0, Ll4/e;->m:Landroid/view/View;

    .line 1111
    .line 1112
    if-eqz v2, :cond_1e

    .line 1113
    .line 1114
    const v2, 0x7f0a01b0

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v10, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    check-cast v2, Lcom/afollestad/materialdialogs/internal/MDRootLayout;

    .line 1122
    .line 1123
    iput-boolean v8, v2, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->k:Z

    .line 1124
    .line 1125
    const v2, 0x7f0a01a8

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v10, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    check-cast v2, Landroid/widget/FrameLayout;

    .line 1133
    .line 1134
    iput-object v2, v1, Ll4/g;->j:Landroid/widget/FrameLayout;

    .line 1135
    .line 1136
    iget-object v3, v0, Ll4/e;->m:Landroid/view/View;

    .line 1137
    .line 1138
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v4

    .line 1142
    if-eqz v4, :cond_1d

    .line 1143
    .line 1144
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v4

    .line 1148
    check-cast v4, Landroid/view/ViewGroup;

    .line 1149
    .line 1150
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1151
    .line 1152
    .line 1153
    :cond_1d
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 1154
    .line 1155
    const/4 v5, -0x2

    .line 1156
    const/4 v6, -0x1

    .line 1157
    invoke-direct {v4, v6, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1161
    .line 1162
    .line 1163
    :cond_1e
    invoke-super {v1, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 1164
    .line 1165
    .line 1166
    iget-object v2, v1, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 1167
    .line 1168
    if-nez v2, :cond_1f

    .line 1169
    .line 1170
    goto :goto_f

    .line 1171
    :cond_1f
    iget-object v2, v0, Ll4/e;->y:Ll4/b;

    .line 1172
    .line 1173
    if-nez v2, :cond_20

    .line 1174
    .line 1175
    goto :goto_f

    .line 1176
    :cond_20
    iget-object v2, v0, Ll4/e;->z:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1177
    .line 1178
    if-nez v2, :cond_21

    .line 1179
    .line 1180
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1181
    .line 1182
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1183
    .line 1184
    .line 1185
    invoke-direct {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>()V

    .line 1186
    .line 1187
    .line 1188
    iput-object v2, v0, Ll4/e;->z:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1189
    .line 1190
    :cond_21
    iget-object v2, v1, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 1191
    .line 1192
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/V;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v2

    .line 1196
    if-nez v2, :cond_22

    .line 1197
    .line 1198
    iget-object v2, v1, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 1199
    .line 1200
    iget-object v3, v0, Ll4/e;->z:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1201
    .line 1202
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/V;)V

    .line 1203
    .line 1204
    .line 1205
    :cond_22
    iget-object v2, v1, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 1206
    .line 1207
    iget-object v3, v0, Ll4/e;->y:Ll4/b;

    .line 1208
    .line 1209
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/I;)V

    .line 1210
    .line 1211
    .line 1212
    iget v2, v1, Ll4/g;->p:I

    .line 1213
    .line 1214
    if-eqz v2, :cond_23

    .line 1215
    .line 1216
    iget-object v0, v0, Ll4/e;->y:Ll4/b;

    .line 1217
    .line 1218
    iput-object v1, v0, Ll4/b;->k:Ll4/g;

    .line 1219
    .line 1220
    :cond_23
    :goto_f
    invoke-super {v1, v10}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 1221
    .line 1222
    .line 1223
    iget-object v0, v1, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 1224
    .line 1225
    if-nez v0, :cond_24

    .line 1226
    .line 1227
    goto :goto_10

    .line 1228
    :cond_24
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    new-instance v2, LE9/d;

    .line 1233
    .line 1234
    move/from16 v3, v16

    .line 1235
    .line 1236
    invoke-direct {v2, v1, v3}, LE9/d;-><init>(Ljava/lang/Object;I)V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1240
    .line 1241
    .line 1242
    :goto_10
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0

    .line 1250
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    new-instance v2, Landroid/graphics/Point;

    .line 1255
    .line 1256
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v0, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 1260
    .line 1261
    .line 1262
    iget v0, v2, Landroid/graphics/Point;->x:I

    .line 1263
    .line 1264
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 1265
    .line 1266
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    const v4, 0x7f070285

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1274
    .line 1275
    .line 1276
    move-result v3

    .line 1277
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v4

    .line 1281
    const v5, 0x7f070283

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1285
    .line 1286
    .line 1287
    move-result v4

    .line 1288
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v5

    .line 1292
    const v6, 0x7f070284

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1296
    .line 1297
    .line 1298
    move-result v5

    .line 1299
    const/16 v16, 0x2

    .line 1300
    .line 1301
    mul-int/lit8 v4, v4, 0x2

    .line 1302
    .line 1303
    sub-int/2addr v0, v4

    .line 1304
    mul-int/lit8 v3, v3, 0x2

    .line 1305
    .line 1306
    sub-int/2addr v2, v3

    .line 1307
    invoke-virtual {v10, v2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->setMaxHeight(I)V

    .line 1308
    .line 1309
    .line 1310
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    .line 1311
    .line 1312
    invoke-direct {v2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v3

    .line 1319
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v3

    .line 1323
    invoke-virtual {v2, v3}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 1324
    .line 1325
    .line 1326
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 1327
    .line 1328
    .line 1329
    move-result v0

    .line 1330
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 1331
    .line 1332
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1337
    .line 1338
    .line 1339
    return-void

    .line 1340
    :catchall_0
    move-exception v0

    .line 1341
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 1342
    .line 1343
    .line 1344
    throw v0
.end method

.method public static d(Landroid/widget/TextView;Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    or-int/lit16 v0, v0, 0x80

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ll4/c;Z)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/g;->c:Ll4/e;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p1, v0, Ll4/e;->a:Landroid/content/Context;

    .line 9
    .line 10
    const p2, 0x7f040339

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, 0x1

    .line 34
    if-eq p1, p2, :cond_7

    .line 35
    .line 36
    const/4 p2, 0x2

    .line 37
    if-eq p1, p2, :cond_4

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object p1, v0, Ll4/e;->a:Landroid/content/Context;

    .line 43
    .line 44
    const p2, 0x7f040337

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget p2, v0, Ll4/e;->h:I

    .line 63
    .line 64
    instance-of v0, p1, Landroid/graphics/drawable/RippleDrawable;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    move-object v0, p1

    .line 69
    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    .line 70
    .line 71
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    return-object p1

    .line 79
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object p1, v0, Ll4/e;->a:Landroid/content/Context;

    .line 83
    .line 84
    const p2, 0x7f040335

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_5
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget p2, v0, Ll4/e;->h:I

    .line 103
    .line 104
    instance-of v0, p1, Landroid/graphics/drawable/RippleDrawable;

    .line 105
    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    move-object v0, p1

    .line 109
    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    .line 110
    .line 111
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    return-object p1

    .line 119
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object p1, v0, Ll4/e;->a:Landroid/content/Context;

    .line 123
    .line 124
    const p2, 0x7f040336

    .line 125
    .line 126
    .line 127
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_8
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1, p2}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget p2, v0, Ll4/e;->h:I

    .line 143
    .line 144
    instance-of v0, p1, Landroid/graphics/drawable/RippleDrawable;

    .line 145
    .line 146
    if-eqz v0, :cond_9

    .line 147
    .line 148
    move-object v0, p1

    .line 149
    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    .line 150
    .line 151
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 156
    .line 157
    .line 158
    :cond_9
    return-object p1
.end method

.method public final b(Landroid/view/View;IZ)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget p3, p0, Ll4/g;->p:I

    .line 9
    .line 10
    iget-object v0, p0, Ll4/g;->c:Ll4/e;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz p3, :cond_7

    .line 14
    .line 15
    if-ne p3, v1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/4 v2, 0x3

    .line 19
    const v3, 0x7f0a01a7

    .line 20
    .line 21
    .line 22
    if-ne p3, v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroid/widget/CheckBox;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 p1, 0x0

    .line 38
    throw p1

    .line 39
    :cond_3
    const/4 v2, 0x2

    .line 40
    if-ne p3, v2, :cond_6

    .line 41
    .line 42
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Landroid/widget/RadioButton;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-nez p3, :cond_4

    .line 53
    .line 54
    :goto_0
    const/4 p1, 0x0

    .line 55
    return p1

    .line 56
    :cond_4
    iget p3, v0, Ll4/e;->u:I

    .line 57
    .line 58
    iget-object v2, v0, Ll4/e;->k:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0}, Ll4/g;->dismiss()V

    .line 63
    .line 64
    .line 65
    iput p2, v0, Ll4/e;->u:I

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    return v1

    .line 71
    :cond_5
    iput p2, v0, Ll4/e;->u:I

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v0, Ll4/e;->y:Ll4/b;

    .line 77
    .line 78
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/I;->notifyItemChanged(I)V

    .line 79
    .line 80
    .line 81
    iget-object p1, v0, Ll4/e;->y:Ll4/b;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/I;->notifyItemChanged(I)V

    .line 84
    .line 85
    .line 86
    :cond_6
    return v1

    .line 87
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ll4/g;->dismiss()V

    .line 91
    .line 92
    .line 93
    return v1
.end method

.method public final c(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/g;->b:Landroid/content/DialogInterface$OnShowListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnShowListener;->onShow(Landroid/content/DialogInterface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final dismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll4/g;->g:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Ll4/g;->c:Ll4/e;

    .line 9
    .line 10
    iget-object v0, v0, Ll4/e;->a:Landroid/content/Context;

    .line 11
    .line 12
    const-string v1, "input_method"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/app/Dialog;->getCurrentFocus()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v1, p0, Ll4/g;->a:Lcom/afollestad/materialdialogs/internal/MDRootLayout;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v1, 0x0

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/g;->a:Lcom/afollestad/materialdialogs/internal/MDRootLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ll4/c;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Ll4/g;->c:Ll4/e;

    .line 12
    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq p1, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq p1, v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Ll4/e;->t:Lcom/google/android/gms/ads/nativead/l;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lhc/b;

    .line 32
    .line 33
    iget-object p1, p1, Lhc/b;->i:LLb/h;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Ll4/g;->a:Lcom/afollestad/materialdialogs/internal/MDRootLayout;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, LLb/h;->onClick(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ll4/g;->dismiss()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p1, v0, Ll4/e;->s:La2/v;

    .line 57
    .line 58
    if-eqz p1, :cond_5

    .line 59
    .line 60
    iget-object p1, p1, La2/v;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lhc/b;

    .line 63
    .line 64
    iget-object v1, p1, Lhc/b;->a:Landroid/content/Context;

    .line 65
    .line 66
    iget v2, p1, Lhc/b;->b:I

    .line 67
    .line 68
    :try_start_0
    invoke-static {v1, v2}, Lgc/b;->t(Landroid/content/Context;I)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-static {v1, v2}, Lff/B;->B(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception v1

    .line 85
    const-class v2, Lgc/b;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_0
    iget-object p1, p1, Lhc/b;->h:LLb/h;

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    iget-object v1, p0, Ll4/g;->a:Lcom/afollestad/materialdialogs/internal/MDRootLayout;

    .line 103
    .line 104
    invoke-virtual {p1, v1}, LLb/h;->onClick(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ll4/g;->dismiss()V

    .line 114
    .line 115
    .line 116
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll4/g;->g:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LL7/b;

    .line 6
    .line 7
    iget-object v2, p0, Ll4/g;->c:Ll4/e;

    .line 8
    .line 9
    const/16 v3, 0x14

    .line 10
    .line 11
    invoke-direct {v1, v3, p0, v2}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ll4/g;->g:Landroid/widget/EditText;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Ll4/g;->g:Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0, p1}, Ll4/g;->c(Landroid/content/DialogInterface;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalAccessError;

    const-string v0, "setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/IllegalAccessError;

    const-string v0, "setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    new-instance p1, Ljava/lang/IllegalAccessError;

    const-string p2, "setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead."

    invoke-direct {p1, p2}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll4/g;->b:Landroid/content/DialogInterface$OnShowListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll4/g;->c:Ll4/e;

    iget-object v0, v0, Ll4/e;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll4/g;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/g;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final show()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    new-instance v0, Ll4/f;

    .line 6
    .line 7
    const-string v1, "Bad window token, you cannot show a dialog before an Activity is created or after it\'s hidden."

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/view/WindowManager$BadTokenException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method
