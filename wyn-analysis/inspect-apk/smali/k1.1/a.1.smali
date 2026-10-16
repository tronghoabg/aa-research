.class public final Lk1/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:Lk1/b;


# direct methods
.method public constructor <init>(Lk1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk1/a;->a:Lk1/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk1/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk1/b;->b(Landroid/view/View;)Lad/L;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lad/L;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk1/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    new-instance v3, Ll1/e;

    .line 7
    .line 8
    invoke-direct {v3, v1}, Ll1/e;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 9
    .line 10
    .line 11
    sget-object v4, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const-class v5, Ljava/lang/Boolean;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/16 v7, 0x1c

    .line 19
    .line 20
    if-lt v4, v7, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lk1/M;->c(Landroid/view/View;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const v4, 0x7f0a028d

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v4, v6

    .line 46
    :goto_0
    check-cast v4, Ljava/lang/Boolean;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    move v4, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v4, v8

    .line 60
    :goto_1
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    if-lt v9, v7, :cond_3

    .line 63
    .line 64
    invoke-static {v1, v4}, Ldb/b;->w(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {v3, v2, v4}, Ll1/e;->i(IZ)V

    .line 69
    .line 70
    .line 71
    :goto_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    if-lt v4, v7, :cond_4

    .line 74
    .line 75
    invoke-static {v0}, Lk1/M;->b(Landroid/view/View;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    const v4, 0x7f0a0287

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    move-object v4, v6

    .line 99
    :goto_3
    check-cast v4, Ljava/lang/Boolean;

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_6

    .line 108
    .line 109
    move v4, v2

    .line 110
    goto :goto_4

    .line 111
    :cond_6
    move v4, v8

    .line 112
    :goto_4
    if-lt v9, v7, :cond_7

    .line 113
    .line 114
    invoke-static {v1, v4}, Ldb/b;->C(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_7
    const/4 v5, 0x2

    .line 119
    invoke-virtual {v3, v5, v4}, Ll1/e;->i(IZ)V

    .line 120
    .line 121
    .line 122
    :goto_5
    invoke-static {v0}, Lk1/S;->e(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-lt v9, v7, :cond_8

    .line 127
    .line 128
    invoke-static {v1, v4}, Ldb/b;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_8
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 137
    .line 138
    invoke-virtual {v5, v7, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    :goto_6
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 142
    .line 143
    const/16 v5, 0x1e

    .line 144
    .line 145
    if-lt v4, v5, :cond_9

    .line 146
    .line 147
    invoke-static {v0}, Lk1/O;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    goto :goto_7

    .line 152
    :cond_9
    const v4, 0x7f0a028e

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    const-class v5, Ljava/lang/CharSequence;

    .line 160
    .line 161
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_a

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_a
    move-object v4, v6

    .line 169
    :goto_7
    check-cast v4, Ljava/lang/CharSequence;

    .line 170
    .line 171
    invoke-virtual {v3, v4}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    move-object/from16 v4, p0

    .line 175
    .line 176
    iget-object v5, v4, Lk1/a;->a:Lk1/b;

    .line 177
    .line 178
    invoke-virtual {v5, v0, v3}, Lk1/b;->d(Landroid/view/View;Ll1/e;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    const/16 v7, 0x1a

    .line 186
    .line 187
    if-ge v9, v7, :cond_13

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    const-string v9, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 194
    .line 195
    invoke-virtual {v7, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 203
    .line 204
    invoke-virtual {v7, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    const-string v11, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 212
    .line 213
    invoke-virtual {v7, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    const-string v12, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 221
    .line 222
    invoke-virtual {v7, v12}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const v7, 0x7f0a0286

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    check-cast v13, Landroid/util/SparseArray;

    .line 233
    .line 234
    if-eqz v13, :cond_d

    .line 235
    .line 236
    new-instance v14, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    move/from16 v16, v2

    .line 242
    .line 243
    move v15, v8

    .line 244
    :goto_8
    invoke-virtual {v13}, Landroid/util/SparseArray;->size()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-ge v15, v2, :cond_c

    .line 249
    .line 250
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    if-nez v2, :cond_b

    .line 261
    .line 262
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    :cond_b
    add-int/lit8 v15, v15, 0x1

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_c
    move v2, v8

    .line 273
    :goto_9
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 274
    .line 275
    .line 276
    move-result v15

    .line 277
    if-ge v2, v15, :cond_e

    .line 278
    .line 279
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v15

    .line 283
    check-cast v15, Ljava/lang/Integer;

    .line 284
    .line 285
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result v15

    .line 289
    invoke-virtual {v13, v15}, Landroid/util/SparseArray;->remove(I)V

    .line 290
    .line 291
    .line 292
    add-int/lit8 v2, v2, 0x1

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_d
    move/from16 v16, v2

    .line 296
    .line 297
    :cond_e
    instance-of v2, v5, Landroid/text/Spanned;

    .line 298
    .line 299
    if-eqz v2, :cond_f

    .line 300
    .line 301
    move-object v2, v5

    .line 302
    check-cast v2, Landroid/text/Spanned;

    .line 303
    .line 304
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    const-class v13, Landroid/text/style/ClickableSpan;

    .line 309
    .line 310
    invoke-interface {v2, v8, v6, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    move-object v6, v2

    .line 315
    check-cast v6, [Landroid/text/style/ClickableSpan;

    .line 316
    .line 317
    :cond_f
    if-eqz v6, :cond_14

    .line 318
    .line 319
    array-length v2, v6

    .line 320
    if-lez v2, :cond_14

    .line 321
    .line 322
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    const-string v2, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 327
    .line 328
    const v13, 0x7f0a000f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1, v2, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    check-cast v1, Landroid/util/SparseArray;

    .line 339
    .line 340
    if-nez v1, :cond_10

    .line 341
    .line 342
    new-instance v1, Landroid/util/SparseArray;

    .line 343
    .line 344
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v7, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_10
    move v2, v8

    .line 351
    :goto_a
    array-length v7, v6

    .line 352
    if-ge v2, v7, :cond_14

    .line 353
    .line 354
    aget-object v7, v6, v2

    .line 355
    .line 356
    move v13, v8

    .line 357
    :goto_b
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 358
    .line 359
    .line 360
    move-result v14

    .line 361
    if-ge v13, v14, :cond_12

    .line 362
    .line 363
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    check-cast v14, Ljava/lang/ref/WeakReference;

    .line 368
    .line 369
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v14

    .line 373
    check-cast v14, Landroid/text/style/ClickableSpan;

    .line 374
    .line 375
    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v14

    .line 379
    if-eqz v14, :cond_11

    .line 380
    .line 381
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->keyAt(I)I

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    goto :goto_c

    .line 386
    :cond_11
    add-int/lit8 v13, v13, 0x1

    .line 387
    .line 388
    goto :goto_b

    .line 389
    :cond_12
    sget v7, Ll1/e;->d:I

    .line 390
    .line 391
    add-int/lit8 v13, v7, 0x1

    .line 392
    .line 393
    sput v13, Ll1/e;->d:I

    .line 394
    .line 395
    :goto_c
    new-instance v13, Ljava/lang/ref/WeakReference;

    .line 396
    .line 397
    aget-object v14, v6, v2

    .line 398
    .line 399
    invoke-direct {v13, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v7, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    aget-object v13, v6, v2

    .line 406
    .line 407
    move-object v14, v5

    .line 408
    check-cast v14, Landroid/text/Spanned;

    .line 409
    .line 410
    invoke-virtual {v3, v9}, Ll1/e;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 411
    .line 412
    .line 413
    move-result-object v15

    .line 414
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 415
    .line 416
    .line 417
    move-result v17

    .line 418
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    invoke-interface {v15, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v3, v10}, Ll1/e;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 430
    .line 431
    .line 432
    move-result v15

    .line 433
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v15

    .line 437
    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3, v11}, Ll1/e;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 445
    .line 446
    .line 447
    move-result v13

    .line 448
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v13

    .line 452
    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    invoke-virtual {v3, v12}, Ll1/e;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 456
    .line 457
    .line 458
    move-result-object v8

    .line 459
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    add-int/lit8 v2, v2, 0x1

    .line 467
    .line 468
    const/4 v8, 0x0

    .line 469
    goto :goto_a

    .line 470
    :cond_13
    move/from16 v16, v2

    .line 471
    .line 472
    :cond_14
    const v1, 0x7f0a0285

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    check-cast v0, Ljava/util/List;

    .line 480
    .line 481
    if-nez v0, :cond_15

    .line 482
    .line 483
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 484
    .line 485
    :cond_15
    const/4 v8, 0x0

    .line 486
    :goto_d
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    if-ge v8, v1, :cond_16

    .line 491
    .line 492
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    check-cast v1, Ll1/c;

    .line 497
    .line 498
    invoke-virtual {v3, v1}, Ll1/e;->b(Ll1/c;)V

    .line 499
    .line 500
    .line 501
    add-int/lit8 v8, v8, 0x1

    .line 502
    .line 503
    goto :goto_d

    .line 504
    :cond_16
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk1/b;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lk1/b;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lk1/b;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk1/b;->h(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/a;->a:Lk1/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk1/b;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
