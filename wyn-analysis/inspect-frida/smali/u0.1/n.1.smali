.class public final Lu0/n;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lt0/I;
.implements Lt0/N;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# static fields
.field public static o0:Ljava/lang/Class;

.field public static p0:Ljava/lang/reflect/Method;


# instance fields
.field public A:Lu0/S;

.field public B:LL0/a;

.field public C:Z

.field public final D:Lt0/z;

.field public final E:Lu0/E;

.field public F:J

.field public final G:[I

.field public final H:[F

.field public final I:[F

.field public J:J

.field public K:Z

.field public L:J

.field public M:Z

.field public final N:LN/Y;

.field public O:Ltf/l;

.field public final P:LLb/f;

.field public final Q:LLb/e;

.field public final R:Lu0/i;

.field public final S:LW9/u;

.field public final T:LF0/c;

.field public final U:LJ4/c;

.field public final V:LN/Y;

.field public W:I

.field public a:J

.field public final a0:LN/Y;

.field public final b:Z

.field public final b0:La2/k;

.field public final c:Lt0/v;

.field public final c0:Ll0/c;

.field public d:LL0/c;

.field public final d0:Lu0/V;

.field public final e:Lb7/k;

.field public e0:Landroid/view/MotionEvent;

.field public final f:Lu0/y0;

.field public f0:J

.field public final g:Ln0/c;

.field public final g0:Lu0/w0;

.field public final h:Lac/a;

.field public final h0:LP/d;

.field public final i:Lt0/t;

.field public final i0:Lg5/d;

.field public final j:Lu0/n;

.field public final j0:Lkd/c;

.field public final k:Lx0/l;

.field public k0:Z

.field public final l:Lu0/s;

.field public final l0:Lt0/p;

.field public final m:La0/f;

.field public final m0:Lu0/G;

.field public final n:Ljava/util/ArrayList;

.field public final n0:Lu0/V;

.field public o:Ljava/util/ArrayList;

.field public p:Z

.field public final q:Lp0/c;

.field public final r:LM/y;

.field public s:Ltf/l;

.field public final t:La0/a;

.field public u:Z

.field public final v:Lu0/h;

.field public final w:Lu0/g;

.field public final x:Lt0/K;

.field public y:Z

.field public z:Lu0/F;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sget-wide v7, Ld0/c;->d:J

    .line 14
    .line 15
    iput-wide v7, v0, Lu0/n;->a:J

    .line 16
    .line 17
    iput-boolean v6, v0, Lu0/n;->b:Z

    .line 18
    .line 19
    new-instance v7, Lt0/v;

    .line 20
    .line 21
    invoke-direct {v7}, Lt0/v;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v7, v0, Lu0/n;->c:Lt0/v;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    iget v8, v8, Landroid/content/res/Configuration;->fontScale:F

    .line 45
    .line 46
    new-instance v9, LL0/c;

    .line 47
    .line 48
    invoke-direct {v9, v7, v8}, LL0/c;-><init>(FF)V

    .line 49
    .line 50
    .line 51
    iput-object v9, v0, Lu0/n;->d:LL0/c;

    .line 52
    .line 53
    new-instance v7, Lx0/j;

    .line 54
    .line 55
    sget-object v8, Lx0/j;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 56
    .line 57
    invoke-virtual {v8, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    sget-object v9, Lu0/m;->k:Lu0/m;

    .line 62
    .line 63
    invoke-direct {v7, v8, v5, v9}, Lx0/j;-><init>(IZLtf/l;)V

    .line 64
    .line 65
    .line 66
    new-instance v8, Lb7/k;

    .line 67
    .line 68
    const/16 v9, 0x14

    .line 69
    .line 70
    invoke-direct {v8, v9}, Lb7/k;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object v8, v0, Lu0/n;->e:Lb7/k;

    .line 74
    .line 75
    new-instance v9, Lu0/y0;

    .line 76
    .line 77
    invoke-direct {v9}, Lu0/y0;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v9, v0, Lu0/n;->f:Lu0/y0;

    .line 81
    .line 82
    new-instance v9, Ln0/c;

    .line 83
    .line 84
    new-instance v10, Lu0/k;

    .line 85
    .line 86
    invoke-direct {v10, v0, v6}, Lu0/k;-><init>(Lu0/n;I)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v9, v10}, Ln0/c;-><init>(Ltf/l;)V

    .line 90
    .line 91
    .line 92
    iput-object v9, v0, Lu0/n;->g:Ln0/c;

    .line 93
    .line 94
    sget-object v10, LZ/i;->a:LZ/i;

    .line 95
    .line 96
    sget-object v11, Lq0/c;->a:La2/v;

    .line 97
    .line 98
    new-instance v11, Lm0/a;

    .line 99
    .line 100
    new-instance v12, Lq0/b;

    .line 101
    .line 102
    invoke-direct {v12, v6}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 103
    .line 104
    .line 105
    sget-object v13, Lq0/c;->a:La2/v;

    .line 106
    .line 107
    invoke-direct {v11, v12, v13}, Lm0/a;-><init>(Lq0/b;La2/v;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v10, v11}, Lu0/Y;->a(LZ/k;LZ/k;)LZ/k;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    new-instance v11, Lac/a;

    .line 115
    .line 116
    invoke-direct {v11, v4}, Lac/a;-><init>(I)V

    .line 117
    .line 118
    .line 119
    iput-object v11, v0, Lu0/n;->h:Lac/a;

    .line 120
    .line 121
    new-instance v11, Lt0/t;

    .line 122
    .line 123
    invoke-direct {v11, v5}, Lt0/t;-><init>(Z)V

    .line 124
    .line 125
    .line 126
    sget-object v12, Lr0/w;->a:Lr0/w;

    .line 127
    .line 128
    invoke-virtual {v11, v12}, Lt0/t;->C(Lr0/n;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v7, v10}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iget-object v8, v8, Lb7/k;->c:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v8, LZ/k;

    .line 138
    .line 139
    invoke-interface {v7, v8}, LZ/k;->g(LZ/k;)LZ/k;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-interface {v7, v9}, LZ/k;->g(LZ/k;)LZ/k;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v11, v7}, Lt0/t;->D(LZ/k;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lu0/n;->getDensity()LL0/b;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {v11, v7}, Lt0/t;->B(LL0/b;)V

    .line 155
    .line 156
    .line 157
    iput-object v11, v0, Lu0/n;->i:Lt0/t;

    .line 158
    .line 159
    iput-object v0, v0, Lu0/n;->j:Lu0/n;

    .line 160
    .line 161
    new-instance v7, Lx0/l;

    .line 162
    .line 163
    invoke-virtual {v0}, Lu0/n;->getRoot()Lt0/t;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    invoke-direct {v7, v8}, Lx0/l;-><init>(Lt0/t;)V

    .line 168
    .line 169
    .line 170
    iput-object v7, v0, Lu0/n;->k:Lx0/l;

    .line 171
    .line 172
    new-instance v7, Lu0/s;

    .line 173
    .line 174
    invoke-direct {v7, v0}, Lu0/s;-><init>(Lu0/n;)V

    .line 175
    .line 176
    .line 177
    iput-object v7, v0, Lu0/n;->l:Lu0/s;

    .line 178
    .line 179
    new-instance v8, La0/f;

    .line 180
    .line 181
    invoke-direct {v8}, La0/f;-><init>()V

    .line 182
    .line 183
    .line 184
    iput-object v8, v0, Lu0/n;->m:La0/f;

    .line 185
    .line 186
    new-instance v8, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 189
    .line 190
    .line 191
    iput-object v8, v0, Lu0/n;->n:Ljava/util/ArrayList;

    .line 192
    .line 193
    new-instance v8, Lp0/c;

    .line 194
    .line 195
    invoke-direct {v8}, Lp0/c;-><init>()V

    .line 196
    .line 197
    .line 198
    iput-object v8, v0, Lu0/n;->q:Lp0/c;

    .line 199
    .line 200
    new-instance v8, LM/y;

    .line 201
    .line 202
    invoke-virtual {v0}, Lu0/n;->getRoot()Lt0/t;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    const-string v10, "root"

    .line 207
    .line 208
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    iput-object v9, v8, LM/y;->b:Ljava/lang/Object;

    .line 215
    .line 216
    new-instance v10, Lba/a;

    .line 217
    .line 218
    iget-object v9, v9, Lt0/t;->x:Lt0/i;

    .line 219
    .line 220
    invoke-direct {v10, v9}, Lba/a;-><init>(Lt0/i;)V

    .line 221
    .line 222
    .line 223
    iput-object v10, v8, LM/y;->c:Ljava/lang/Object;

    .line 224
    .line 225
    new-instance v9, Lad/L;

    .line 226
    .line 227
    const/16 v10, 0x13

    .line 228
    .line 229
    invoke-direct {v9, v10}, Lad/L;-><init>(I)V

    .line 230
    .line 231
    .line 232
    iput-object v9, v8, LM/y;->d:Ljava/lang/Object;

    .line 233
    .line 234
    new-instance v9, Lt0/h;

    .line 235
    .line 236
    invoke-direct {v9}, Lt0/h;-><init>()V

    .line 237
    .line 238
    .line 239
    iput-object v9, v8, LM/y;->e:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v8, v0, Lu0/n;->r:LM/y;

    .line 242
    .line 243
    sget-object v8, Lu0/m;->j:Lu0/m;

    .line 244
    .line 245
    iput-object v8, v0, Lu0/n;->s:Ltf/l;

    .line 246
    .line 247
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 248
    .line 249
    const/16 v9, 0x1a

    .line 250
    .line 251
    if-lt v8, v9, :cond_0

    .line 252
    .line 253
    new-instance v10, La0/a;

    .line 254
    .line 255
    invoke-virtual {v0}, Lu0/n;->getAutofillTree()La0/f;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    invoke-direct {v10, v0, v11}, La0/a;-><init>(Lu0/n;La0/f;)V

    .line 260
    .line 261
    .line 262
    goto :goto_0

    .line 263
    :cond_0
    move-object v10, v3

    .line 264
    :goto_0
    iput-object v10, v0, Lu0/n;->t:La0/a;

    .line 265
    .line 266
    new-instance v10, Lu0/h;

    .line 267
    .line 268
    invoke-direct {v10, v1}, Lu0/h;-><init>(Landroid/content/Context;)V

    .line 269
    .line 270
    .line 271
    iput-object v10, v0, Lu0/n;->v:Lu0/h;

    .line 272
    .line 273
    new-instance v10, Lu0/g;

    .line 274
    .line 275
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    const-string v11, "accessibility"

    .line 279
    .line 280
    invoke-virtual {v1, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    if-eqz v11, :cond_8

    .line 285
    .line 286
    check-cast v11, Landroid/view/accessibility/AccessibilityManager;

    .line 287
    .line 288
    iput-object v10, v0, Lu0/n;->w:Lu0/g;

    .line 289
    .line 290
    new-instance v10, Lt0/K;

    .line 291
    .line 292
    new-instance v11, Lu0/k;

    .line 293
    .line 294
    invoke-direct {v11, v0, v2}, Lu0/k;-><init>(Lu0/n;I)V

    .line 295
    .line 296
    .line 297
    invoke-direct {v10, v11}, Lt0/K;-><init>(Lu0/k;)V

    .line 298
    .line 299
    .line 300
    iput-object v10, v0, Lu0/n;->x:Lt0/K;

    .line 301
    .line 302
    new-instance v10, Lt0/z;

    .line 303
    .line 304
    invoke-virtual {v0}, Lu0/n;->getRoot()Lt0/t;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    invoke-direct {v10, v11}, Lt0/z;-><init>(Lt0/t;)V

    .line 309
    .line 310
    .line 311
    iput-object v10, v0, Lu0/n;->D:Lt0/z;

    .line 312
    .line 313
    new-instance v10, Lu0/E;

    .line 314
    .line 315
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    const-string v12, "get(context)"

    .line 320
    .line 321
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 325
    .line 326
    .line 327
    iput-object v10, v0, Lu0/n;->E:Lu0/E;

    .line 328
    .line 329
    sget-wide v10, LL0/g;->b:J

    .line 330
    .line 331
    iput-wide v10, v0, Lu0/n;->F:J

    .line 332
    .line 333
    filled-new-array {v5, v5}, [I

    .line 334
    .line 335
    .line 336
    move-result-object v10

    .line 337
    iput-object v10, v0, Lu0/n;->G:[I

    .line 338
    .line 339
    invoke-static {}, Le0/z;->h()[F

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    iput-object v10, v0, Lu0/n;->H:[F

    .line 344
    .line 345
    invoke-static {}, Le0/z;->h()[F

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    iput-object v10, v0, Lu0/n;->I:[F

    .line 350
    .line 351
    const-wide/16 v10, -0x1

    .line 352
    .line 353
    iput-wide v10, v0, Lu0/n;->J:J

    .line 354
    .line 355
    sget-wide v10, Ld0/c;->c:J

    .line 356
    .line 357
    iput-wide v10, v0, Lu0/n;->L:J

    .line 358
    .line 359
    iput-boolean v6, v0, Lu0/n;->M:Z

    .line 360
    .line 361
    sget-object v10, LN/P;->f:LN/P;

    .line 362
    .line 363
    invoke-static {v3, v10}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    iput-object v11, v0, Lu0/n;->N:LN/Y;

    .line 368
    .line 369
    new-instance v11, LLb/f;

    .line 370
    .line 371
    invoke-direct {v11, v0, v6}, LLb/f;-><init>(Landroid/view/ViewGroup;I)V

    .line 372
    .line 373
    .line 374
    iput-object v11, v0, Lu0/n;->P:LLb/f;

    .line 375
    .line 376
    new-instance v11, LLb/e;

    .line 377
    .line 378
    invoke-direct {v11, v0, v6}, LLb/e;-><init>(Landroid/view/ViewGroup;I)V

    .line 379
    .line 380
    .line 381
    iput-object v11, v0, Lu0/n;->Q:LLb/e;

    .line 382
    .line 383
    new-instance v11, Lu0/i;

    .line 384
    .line 385
    invoke-direct {v11, v0}, Lu0/i;-><init>(Lu0/n;)V

    .line 386
    .line 387
    .line 388
    iput-object v11, v0, Lu0/n;->R:Lu0/i;

    .line 389
    .line 390
    new-instance v11, LW9/u;

    .line 391
    .line 392
    new-instance v12, Lxa/d;

    .line 393
    .line 394
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 395
    .line 396
    .line 397
    move-result-object v13

    .line 398
    const-string v14, "view.context"

    .line 399
    .line 400
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-direct {v12, v13}, Lxa/d;-><init>(Landroid/content/Context;)V

    .line 404
    .line 405
    .line 406
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 407
    .line 408
    .line 409
    iput-object v0, v11, LW9/u;->a:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v12, v11, LW9/u;->b:Ljava/lang/Object;

    .line 412
    .line 413
    new-instance v12, LF0/b;

    .line 414
    .line 415
    sget-wide v13, Lz0/o;->a:J

    .line 416
    .line 417
    new-instance v15, Lz0/b;

    .line 418
    .line 419
    const-string v2, ""

    .line 420
    .line 421
    const/4 v9, 0x6

    .line 422
    invoke-direct {v15, v9, v3, v2}, Lz0/b;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-direct {v12, v15, v13, v14}, LF0/b;-><init>(Lz0/b;J)V

    .line 426
    .line 427
    .line 428
    sget-object v2, Lef/j;->c:Lef/j;

    .line 429
    .line 430
    new-instance v12, LA0/p;

    .line 431
    .line 432
    const/4 v13, 0x5

    .line 433
    invoke-direct {v12, v11, v13}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 434
    .line 435
    .line 436
    invoke-static {v2, v12}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    iput-object v2, v11, LW9/u;->c:Ljava/lang/Object;

    .line 441
    .line 442
    const v2, 0x7fffffff

    .line 443
    .line 444
    .line 445
    invoke-static {v2, v9, v3}, Lic/d;->a(IILGf/a;)LGf/e;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    iput-object v2, v11, LW9/u;->d:Ljava/lang/Object;

    .line 450
    .line 451
    iput-object v11, v0, Lu0/n;->S:LW9/u;

    .line 452
    .line 453
    new-instance v2, LF0/c;

    .line 454
    .line 455
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 456
    .line 457
    .line 458
    new-instance v9, Ljava/util/concurrent/atomic/AtomicReference;

    .line 459
    .line 460
    invoke-direct {v9, v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iput-object v2, v0, Lu0/n;->T:LF0/c;

    .line 464
    .line 465
    new-instance v2, LJ4/c;

    .line 466
    .line 467
    invoke-direct {v2, v1, v5}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    .line 468
    .line 469
    .line 470
    iput-object v2, v0, Lu0/n;->U:LJ4/c;

    .line 471
    .line 472
    invoke-static {v1}, Lvf/a;->o(Landroid/content/Context;)LE0/f;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    sget-object v3, LN/P;->d:LN/P;

    .line 477
    .line 478
    invoke-static {v2, v3}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    iput-object v2, v0, Lu0/n;->V:LN/Y;

    .line 483
    .line 484
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const-string v3, "context.resources.configuration"

    .line 493
    .line 494
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    const/16 v9, 0x1f

    .line 498
    .line 499
    if-lt v8, v9, :cond_1

    .line 500
    .line 501
    invoke-static {v2}, Le1/c;->a(Landroid/content/res/Configuration;)I

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    goto :goto_1

    .line 506
    :cond_1
    move v2, v5

    .line 507
    :goto_1
    iput v2, v0, Lu0/n;->W:I

    .line 508
    .line 509
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    sget-object v2, LL0/i;->a:LL0/i;

    .line 525
    .line 526
    if-eqz v1, :cond_3

    .line 527
    .line 528
    if-eq v1, v6, :cond_2

    .line 529
    .line 530
    goto :goto_2

    .line 531
    :cond_2
    sget-object v2, LL0/i;->b:LL0/i;

    .line 532
    .line 533
    :cond_3
    :goto_2
    invoke-static {v2, v10}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    iput-object v1, v0, Lu0/n;->a0:LN/Y;

    .line 538
    .line 539
    new-instance v1, La2/k;

    .line 540
    .line 541
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 542
    .line 543
    .line 544
    iput-object v1, v0, Lu0/n;->b0:La2/k;

    .line 545
    .line 546
    new-instance v1, Ll0/c;

    .line 547
    .line 548
    invoke-virtual {v0}, Landroid/view/View;->isInTouchMode()Z

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    if-eqz v2, :cond_4

    .line 553
    .line 554
    move v2, v6

    .line 555
    goto :goto_3

    .line 556
    :cond_4
    const/4 v2, 0x2

    .line 557
    :goto_3
    new-instance v3, Lu0/k;

    .line 558
    .line 559
    invoke-direct {v3, v0, v5}, Lu0/k;-><init>(Lu0/n;I)V

    .line 560
    .line 561
    .line 562
    invoke-direct {v1, v2, v3}, Ll0/c;-><init>(ILu0/k;)V

    .line 563
    .line 564
    .line 565
    iput-object v1, v0, Lu0/n;->c0:Ll0/c;

    .line 566
    .line 567
    new-instance v1, Lu0/V;

    .line 568
    .line 569
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 570
    .line 571
    .line 572
    iput-object v1, v0, Lu0/n;->d0:Lu0/V;

    .line 573
    .line 574
    new-instance v1, Lu0/w0;

    .line 575
    .line 576
    invoke-direct {v1}, Lu0/w0;-><init>()V

    .line 577
    .line 578
    .line 579
    iput-object v1, v0, Lu0/n;->g0:Lu0/w0;

    .line 580
    .line 581
    new-instance v1, LP/d;

    .line 582
    .line 583
    const/16 v2, 0x10

    .line 584
    .line 585
    new-array v2, v2, [Ltf/a;

    .line 586
    .line 587
    invoke-direct {v1, v2}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    iput-object v1, v0, Lu0/n;->h0:LP/d;

    .line 591
    .line 592
    new-instance v1, Lg5/d;

    .line 593
    .line 594
    const/16 v2, 0x1b

    .line 595
    .line 596
    invoke-direct {v1, v0, v2}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 597
    .line 598
    .line 599
    iput-object v1, v0, Lu0/n;->i0:Lg5/d;

    .line 600
    .line 601
    new-instance v1, Lkd/c;

    .line 602
    .line 603
    const/16 v2, 0xe

    .line 604
    .line 605
    invoke-direct {v1, v0, v2}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 606
    .line 607
    .line 608
    iput-object v1, v0, Lu0/n;->j0:Lkd/c;

    .line 609
    .line 610
    new-instance v1, Lt0/p;

    .line 611
    .line 612
    invoke-direct {v1, v0, v4}, Lt0/p;-><init>(Ljava/lang/Object;I)V

    .line 613
    .line 614
    .line 615
    iput-object v1, v0, Lu0/n;->l0:Lt0/p;

    .line 616
    .line 617
    const/16 v1, 0x1d

    .line 618
    .line 619
    if-lt v8, v1, :cond_5

    .line 620
    .line 621
    new-instance v2, Lu0/H;

    .line 622
    .line 623
    invoke-direct {v2}, Lu0/H;-><init>()V

    .line 624
    .line 625
    .line 626
    goto :goto_4

    .line 627
    :cond_5
    new-instance v2, La1/h;

    .line 628
    .line 629
    invoke-direct {v2}, La1/h;-><init>()V

    .line 630
    .line 631
    .line 632
    :goto_4
    iput-object v2, v0, Lu0/n;->m0:Lu0/G;

    .line 633
    .line 634
    invoke-virtual {v0, v5}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 638
    .line 639
    .line 640
    const/16 v2, 0x1a

    .line 641
    .line 642
    if-lt v8, v2, :cond_6

    .line 643
    .line 644
    sget-object v2, Lu0/v;->a:Lu0/v;

    .line 645
    .line 646
    invoke-virtual {v2, v0, v6, v5}, Lu0/v;->a(Landroid/view/View;IZ)V

    .line 647
    .line 648
    .line 649
    :cond_6
    invoke-virtual {v0, v6}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    .line 656
    .line 657
    .line 658
    invoke-static {v0, v7}, Lk1/S;->m(Landroid/view/View;Lk1/b;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0}, Lu0/n;->getRoot()Lt0/t;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    invoke-virtual {v2, v0}, Lt0/t;->b(Lu0/n;)V

    .line 666
    .line 667
    .line 668
    if-lt v8, v1, :cond_7

    .line 669
    .line 670
    sget-object v1, Lu0/t;->a:Lu0/t;

    .line 671
    .line 672
    invoke-virtual {v1, v0}, Lu0/t;->a(Landroid/view/View;)V

    .line 673
    .line 674
    .line 675
    :cond_7
    new-instance v1, Lu0/V;

    .line 676
    .line 677
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 678
    .line 679
    .line 680
    iput-object v1, v0, Lu0/n;->n0:Lu0/V;

    .line 681
    .line 682
    return-void

    .line 683
    :cond_8
    new-instance v1, Ljava/lang/NullPointerException;

    .line 684
    .line 685
    const-string v2, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    .line 686
    .line 687
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    throw v1
.end method

.method public static a(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    instance-of v3, v2, Lu0/n;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, Lu0/n;

    .line 17
    .line 18
    invoke-virtual {v2}, Lu0/n;->m()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v2, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-static {v2}, Lu0/n;->a(Landroid/view/ViewGroup;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public static b(I)Lef/k;
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/high16 v1, 0x40000000    # 2.0f

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v1, Lef/k;

    .line 29
    .line 30
    invoke-direct {v1, v0, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const v0, 0x7fffffff

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Lef/k;

    .line 52
    .line 53
    invoke-direct {v1, p0, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance v1, Lef/k;

    .line 66
    .line 67
    invoke-direct {v1, v0, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-object v1
.end method

.method public static c(ILandroid/view/View;)Landroid/view/View;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    new-array v1, v0, [Ljava/lang/Class;

    .line 9
    .line 10
    const-class v2, Landroid/view/View;

    .line 11
    .line 12
    const-string v3, "getAccessibilityViewId"

    .line 13
    .line 14
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    new-array v2, v0, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    check-cast p1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    if-ge v0, v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "currentView.getChildAt(i)"

    .line 56
    .line 57
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2}, Lu0/n;->c(ILandroid/view/View;)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    return-object v2

    .line 67
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/4 p0, 0x0

    .line 71
    return-object p0
.end method

.method public static e(Lt0/t;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt0/t;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt0/t;->l()LP/d;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget v0, p0, LP/d;->c:I

    .line 9
    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, LP/d;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :cond_0
    aget-object v2, p0, v1

    .line 16
    .line 17
    check-cast v2, Lt0/t;

    .line 18
    .line 19
    invoke-static {v2}, Lu0/n;->e(Lt0/t;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    if-lt v1, v0, :cond_0

    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static g(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_0

    .line 58
    .line 59
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_0

    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_0
    const/4 p0, 0x1

    .line 68
    return p0
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Lef/c;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui_release$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getTextInputService$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private setFontFamilyResolver(LE0/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/n;->V:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private setLayoutDirection(LL0/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/n;->a0:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final setViewTreeOwners(Lu0/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/n;->N:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final autofill(Landroid/util/SparseArray;)V
    .locals 8

    .line 1
    const-string v0, "values"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1a

    .line 9
    .line 10
    if-lt v0, v1, :cond_5

    .line 11
    .line 12
    iget-object v0, p0, Lu0/n;->t:La0/a;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_5

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v4}, LU1/b;->j(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    sget-object v5, La0/d;->a:La0/d;

    .line 36
    .line 37
    const-string v6, "value"

    .line 38
    .line 39
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v4}, La0/d;->d(Landroid/view/autofill/AutofillValue;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5, v4}, La0/d;->i(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v5, v0, La0/a;->b:La0/f;

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v4, v5, La0/f;->a:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-nez v3, :cond_0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_1
    invoke-virtual {v5, v4}, La0/d;->b(Landroid/view/autofill/AutofillValue;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_4

    .line 88
    .line 89
    invoke-virtual {v5, v4}, La0/d;->c(Landroid/view/autofill/AutofillValue;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_3

    .line 94
    .line 95
    invoke-virtual {v5, v4}, La0/d;->e(Landroid/view/autofill/AutofillValue;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_2

    .line 100
    .line 101
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    new-instance p1, LEf/G;

    .line 105
    .line 106
    const-string v0, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    .line 107
    .line 108
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    new-instance p1, LEf/G;

    .line 113
    .line 114
    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    .line 115
    .line 116
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_4
    new-instance p1, LEf/G;

    .line 121
    .line 122
    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_5
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 3

    .line 1
    iget-wide v0, p0, Lu0/n;->a:J

    .line 2
    .line 3
    iget-object p1, p0, Lu0/n;->l:Lu0/s;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p1, v0, v1, v2}, Lu0/s;->k(JZ)V

    .line 7
    .line 8
    .line 9
    return v2
.end method

.method public final canScrollVertically(I)Z
    .locals 3

    .line 1
    iget-wide v0, p0, Lu0/n;->a:J

    .line 2
    .line 3
    iget-object p1, p0, Lu0/n;->l:Lu0/s;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {p1, v0, v1, v2}, Lu0/s;->k(JZ)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final d(Landroid/view/MotionEvent;)I
    .locals 13

    .line 1
    iget-object v2, p0, Lu0/n;->H:[F

    .line 2
    .line 3
    iget-object v3, p0, Lu0/n;->i0:Lg5/d;

    .line 4
    .line 5
    invoke-virtual {p0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    :try_start_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iput-wide v3, p0, Lu0/n;->J:J

    .line 14
    .line 15
    iget-object v3, p0, Lu0/n;->m0:Lu0/G;

    .line 16
    .line 17
    invoke-interface {v3, p0, v2}, Lu0/G;->a(Landroid/view/View;[F)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Lu0/n;->I:[F

    .line 21
    .line 22
    invoke-static {v2, v3}, Lu0/Q;->h([F[F)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v3, v4}, LU8/v0;->f(FF)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-static {v3, v4, v2}, Le0/z;->m(J[F)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v2, v3}, Ld0/c;->b(J)F

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    sub-float/2addr v4, v5

    .line 50
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-static {v2, v3}, Ld0/c;->c(J)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    sub-float/2addr v5, v2

    .line 59
    invoke-static {v4, v5}, LU8/v0;->f(FF)J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    iput-wide v2, p0, Lu0/n;->L:J

    .line 64
    .line 65
    const/4 v8, 0x1

    .line 66
    iput-boolean v8, p0, Lu0/n;->K:Z

    .line 67
    .line 68
    invoke-virtual {p0, v7}, Lu0/n;->k(Z)V

    .line 69
    .line 70
    .line 71
    const-string v2, "AndroidOwner:onTouch"

    .line 72
    .line 73
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 74
    .line 75
    .line 76
    :try_start_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    iget-object v2, p0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 81
    .line 82
    const/4 v10, 0x3

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-ne v3, v10, :cond_0

    .line 90
    .line 91
    move v11, v8

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    move v11, v7

    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :goto_0
    if-eqz v2, :cond_5

    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-ne v3, v4, :cond_2

    .line 109
    .line 110
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eq v3, v4, :cond_1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    move v3, v7

    .line 122
    goto :goto_2

    .line 123
    :cond_2
    :goto_1
    move v3, v8

    .line 124
    :goto_2
    if-eqz v3, :cond_5

    .line 125
    .line 126
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    :cond_3
    move-object v12, v2

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_3

    .line 139
    .line 140
    const/4 v4, 0x2

    .line 141
    if-eq v3, v4, :cond_3

    .line 142
    .line 143
    const/4 v4, 0x6

    .line 144
    if-eq v3, v4, :cond_3

    .line 145
    .line 146
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    const/16 v4, 0xa

    .line 151
    .line 152
    if-eq v3, v4, :cond_5

    .line 153
    .line 154
    if-eqz v11, :cond_5

    .line 155
    .line 156
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 157
    .line 158
    .line 159
    move-result-wide v4

    .line 160
    const/4 v6, 0x1

    .line 161
    const/16 v3, 0xa

    .line 162
    .line 163
    move-object v1, p0

    .line 164
    invoke-virtual/range {v1 .. v6}, Lu0/n;->v(Landroid/view/MotionEvent;IJZ)V

    .line 165
    .line 166
    .line 167
    move-object v12, v2

    .line 168
    goto :goto_4

    .line 169
    :cond_5
    move-object v12, v2

    .line 170
    goto :goto_4

    .line 171
    :goto_3
    iget-object v2, p0, Lu0/n;->r:LM/y;

    .line 172
    .line 173
    invoke-virtual {v2}, LM/y;->h()V

    .line 174
    .line 175
    .line 176
    :goto_4
    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-ne v2, v10, :cond_6

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_6
    move v8, v7

    .line 184
    :goto_5
    if-nez v11, :cond_7

    .line 185
    .line 186
    if-eqz v8, :cond_7

    .line 187
    .line 188
    if-eq v9, v10, :cond_7

    .line 189
    .line 190
    const/16 v2, 0x9

    .line 191
    .line 192
    if-eq v9, v2, :cond_7

    .line 193
    .line 194
    invoke-virtual/range {p0 .. p1}, Lu0/n;->h(Landroid/view/MotionEvent;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_7

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 201
    .line 202
    .line 203
    move-result-wide v4

    .line 204
    const/4 v6, 0x1

    .line 205
    const/16 v3, 0x9

    .line 206
    .line 207
    move-object v1, p0

    .line 208
    move-object v2, p1

    .line 209
    invoke-virtual/range {v1 .. v6}, Lu0/n;->v(Landroid/view/MotionEvent;IJZ)V

    .line 210
    .line 211
    .line 212
    :cond_7
    if-eqz v12, :cond_8

    .line 213
    .line 214
    invoke-virtual {v12}, Landroid/view/MotionEvent;->recycle()V

    .line 215
    .line 216
    .line 217
    :cond_8
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iput-object v0, p0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 222
    .line 223
    invoke-virtual/range {p0 .. p1}, Lu0/n;->u(Landroid/view/MotionEvent;)I

    .line 224
    .line 225
    .line 226
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 228
    .line 229
    .line 230
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 231
    .line 232
    const/16 v3, 0x18

    .line 233
    .line 234
    if-lt v2, v3, :cond_9

    .line 235
    .line 236
    sget-object v2, Lu0/u;->a:Lu0/u;

    .line 237
    .line 238
    const/4 v3, 0x0

    .line 239
    invoke-virtual {v2, p0, v3}, Lu0/u;->a(Landroid/view/View;Lp0/h;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :catchall_1
    move-exception v0

    .line 244
    goto :goto_8

    .line 245
    :cond_9
    :goto_6
    iput-boolean v7, p0, Lu0/n;->K:Z

    .line 246
    .line 247
    return v0

    .line 248
    :goto_7
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 249
    .line 250
    .line 251
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 252
    :goto_8
    iput-boolean v7, p0, Lu0/n;->K:Z

    .line 253
    .line 254
    throw v0
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lu0/n;->e(Lt0/t;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lu0/n;->k(Z)V

    .line 21
    .line 22
    .line 23
    iput-boolean v0, p0, Lu0/n;->p:Z

    .line 24
    .line 25
    iget-object v0, p0, Lu0/n;->h:Lac/a;

    .line 26
    .line 27
    iget-object v1, v0, Lac/a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Le0/b;

    .line 30
    .line 31
    iget-object v2, v1, Le0/b;->a:Landroid/graphics/Canvas;

    .line 32
    .line 33
    iput-object p1, v1, Le0/b;->a:Landroid/graphics/Canvas;

    .line 34
    .line 35
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v0, v0, Lac/a;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Le0/b;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lt0/t;->h(Le0/o;)V

    .line 44
    .line 45
    .line 46
    const-string v1, "<set-?>"

    .line 47
    .line 48
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, v0, Le0/b;->a:Landroid/graphics/Canvas;

    .line 52
    .line 53
    iget-object v0, p0, Lu0/n;->n:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v2, 0x0

    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    move v3, v2

    .line 67
    :goto_0
    if-ge v3, v1, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lt0/G;

    .line 74
    .line 75
    invoke-interface {v4}, Lt0/G;->h()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-boolean v1, Lu0/s0;->q:Z

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-virtual {p1, v3, v3, v3, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 91
    .line 92
    .line 93
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 100
    .line 101
    .line 102
    iput-boolean v2, p0, Lu0/n;->p:Z

    .line 103
    .line 104
    iget-object p1, p0, Lu0/n;->o:Ljava/util/ArrayList;

    .line 105
    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 112
    .line 113
    .line 114
    :cond_3
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-ne v0, v1, :cond_8

    .line 13
    .line 14
    const/high16 v0, 0x400000

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v3, 0x1a

    .line 33
    .line 34
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    neg-float v4, v4

    .line 39
    new-instance v5, Lq0/d;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    if-lt v7, v3, :cond_0

    .line 48
    .line 49
    sget-object v6, Lk1/T;->a:Ljava/lang/reflect/Method;

    .line 50
    .line 51
    invoke-static {v0}, LY0/b;->d(Landroid/view/ViewConfiguration;)F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v0, v6}, Lk1/T;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    :goto_0
    mul-float/2addr v6, v4

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    if-lt v7, v3, :cond_1

    .line 66
    .line 67
    invoke-static {v0}, LY0/b;->c(Landroid/view/ViewConfiguration;)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-static {v0, v8}, Lk1/T;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :goto_1
    mul-float/2addr v0, v4

    .line 77
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    invoke-direct {v5, v6, v0, v3, v4}, Lq0/d;-><init>(FFJ)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lu0/n;->e:Lb7/k;

    .line 85
    .line 86
    iget-object p1, p1, Lb7/k;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Lc0/g;

    .line 89
    .line 90
    invoke-static {p1}, Lvf/a;->p(Lc0/g;)Lc0/g;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    iget-object p1, p1, Lc0/g;->g:Lm0/a;

    .line 97
    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1}, Lm0/a;->b()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_2

    .line 105
    .line 106
    invoke-virtual {p1, v5}, Lm0/a;->a(Lq0/d;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    :cond_2
    return v2

    .line 113
    :cond_3
    return v1

    .line 114
    :cond_4
    invoke-static {p1}, Lu0/n;->g(Landroid/view/MotionEvent;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_7

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-virtual {p0, p1}, Lu0/n;->d(Landroid/view/MotionEvent;)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    and-int/2addr p1, v2

    .line 132
    if-eqz p1, :cond_6

    .line 133
    .line 134
    return v2

    .line 135
    :cond_6
    return v1

    .line 136
    :cond_7
    :goto_2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    return p1

    .line 141
    :cond_8
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    return p1
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "event"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v2, v0, Lu0/n;->k0:Z

    .line 11
    .line 12
    iget-object v3, v0, Lu0/n;->j0:Lkd/c;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Lkd/c;->run()V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {v1}, Lu0/n;->g(Landroid/view/MotionEvent;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v4, 0x0

    .line 27
    if-nez v2, :cond_13

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_1
    const/16 v2, 0x1002

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v5, 0x1

    .line 44
    const/16 v6, 0xa

    .line 45
    .line 46
    const/4 v7, 0x7

    .line 47
    if-eqz v2, :cond_d

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-ne v2, v5, :cond_d

    .line 54
    .line 55
    iget-object v2, v0, Lu0/n;->l:Lu0/s;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lu0/s;->r()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_2

    .line 65
    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/16 v8, 0x100

    .line 73
    .line 74
    const/16 v9, 0xc

    .line 75
    .line 76
    const/16 v10, 0x80

    .line 77
    .line 78
    const/4 v11, 0x0

    .line 79
    iget-object v12, v2, Lu0/s;->d:Lu0/n;

    .line 80
    .line 81
    const/high16 v13, -0x80000000

    .line 82
    .line 83
    if-eq v3, v7, :cond_6

    .line 84
    .line 85
    const/16 v7, 0x9

    .line 86
    .line 87
    if-eq v3, v7, :cond_6

    .line 88
    .line 89
    if-eq v3, v6, :cond_3

    .line 90
    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_3
    iget v3, v2, Lu0/s;->e:I

    .line 94
    .line 95
    if-eq v3, v13, :cond_5

    .line 96
    .line 97
    if-ne v3, v13, :cond_4

    .line 98
    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_4
    iput v13, v2, Lu0/s;->e:I

    .line 102
    .line 103
    invoke-static {v2, v13, v10, v11, v9}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v2, v3, v8, v11, v9}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 107
    .line 108
    .line 109
    return v5

    .line 110
    :cond_5
    invoke-virtual {v12}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    return v1

    .line 119
    :cond_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    invoke-virtual {v12, v5}, Lu0/n;->k(Z)V

    .line 128
    .line 129
    .line 130
    new-instance v18, Lt0/h;

    .line 131
    .line 132
    invoke-direct/range {v18 .. v18}, Lt0/h;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12}, Lu0/n;->getRoot()Lt0/t;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-static {v3, v4}, LU8/v0;->f(FF)J

    .line 140
    .line 141
    .line 142
    move-result-wide v3

    .line 143
    sget-object v7, Lt0/t;->R:Lt0/l;

    .line 144
    .line 145
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v6, v6, Lt0/t;->y:Lt0/F;

    .line 149
    .line 150
    iget-object v7, v6, Lt0/F;->f:Lt0/y;

    .line 151
    .line 152
    invoke-virtual {v7, v3, v4}, Lt0/y;->G(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v16

    .line 156
    iget-object v14, v6, Lt0/F;->f:Lt0/y;

    .line 157
    .line 158
    sget-object v15, Lt0/y;->y:Lt0/j;

    .line 159
    .line 160
    const/16 v19, 0x1

    .line 161
    .line 162
    const/16 v20, 0x1

    .line 163
    .line 164
    invoke-virtual/range {v14 .. v20}, Lt0/y;->P(Lt0/j;JLt0/h;ZZ)V

    .line 165
    .line 166
    .line 167
    invoke-static/range {v18 .. v18}, Lff/o;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lx0/h;

    .line 172
    .line 173
    if-eqz v3, :cond_7

    .line 174
    .line 175
    iget-object v3, v3, LX0/E;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v3, Lt0/y;

    .line 178
    .line 179
    iget-object v3, v3, Lt0/y;->e:Lt0/t;

    .line 180
    .line 181
    if-eqz v3, :cond_7

    .line 182
    .line 183
    invoke-static {v3}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    goto :goto_0

    .line 188
    :cond_7
    move-object v3, v11

    .line 189
    :goto_0
    if-eqz v3, :cond_a

    .line 190
    .line 191
    invoke-virtual {v3}, Lx0/h;->j()Lx0/g;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    iget-object v6, v3, LX0/E;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v6, LZ/j;

    .line 198
    .line 199
    check-cast v6, Lx0/i;

    .line 200
    .line 201
    check-cast v6, Lx0/j;

    .line 202
    .line 203
    iget v7, v6, Lx0/j;->a:I

    .line 204
    .line 205
    iget-object v7, v3, LX0/E;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v7, Lt0/y;

    .line 208
    .line 209
    iget-object v14, v7, Lt0/y;->e:Lt0/t;

    .line 210
    .line 211
    iget-boolean v15, v4, Lx0/g;->b:Z

    .line 212
    .line 213
    if-eqz v15, :cond_9

    .line 214
    .line 215
    invoke-static {v14}, LS3/f;->u(Lt0/t;)Lx0/h;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    if-nez v14, :cond_8

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_8
    move-object v3, v14

    .line 223
    :goto_1
    iget-object v3, v3, LX0/E;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v3, Lt0/y;

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_9
    move-object v3, v7

    .line 229
    :goto_2
    sget-object v14, Lx0/n;->l:Lx0/q;

    .line 230
    .line 231
    invoke-virtual {v4, v14}, Lx0/g;->a(Lx0/q;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-nez v4, :cond_a

    .line 236
    .line 237
    invoke-virtual {v3}, Lt0/y;->T()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_a

    .line 242
    .line 243
    invoke-virtual {v12}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v3}, Lu0/F;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    iget-object v4, v7, Lt0/y;->e:Lt0/t;

    .line 252
    .line 253
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, LM0/i;

    .line 258
    .line 259
    if-nez v3, :cond_a

    .line 260
    .line 261
    iget v3, v6, Lx0/j;->a:I

    .line 262
    .line 263
    invoke-virtual {v2, v3}, Lu0/s;->t(I)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    goto :goto_3

    .line 268
    :cond_a
    move v3, v13

    .line 269
    :goto_3
    invoke-virtual {v12}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-virtual {v4, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    iget v4, v2, Lu0/s;->e:I

    .line 278
    .line 279
    if-ne v4, v3, :cond_b

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_b
    iput v3, v2, Lu0/s;->e:I

    .line 283
    .line 284
    invoke-static {v2, v3, v10, v11, v9}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 285
    .line 286
    .line 287
    invoke-static {v2, v4, v8, v11, v9}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 288
    .line 289
    .line 290
    :goto_4
    if-ne v3, v13, :cond_c

    .line 291
    .line 292
    return v1

    .line 293
    :cond_c
    :goto_5
    return v5

    .line 294
    :cond_d
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-eq v2, v7, :cond_11

    .line 299
    .line 300
    if-eq v2, v6, :cond_e

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_e
    invoke-virtual/range {p0 .. p1}, Lu0/n;->h(Landroid/view/MotionEvent;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_12

    .line 308
    .line 309
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    const/4 v6, 0x3

    .line 314
    if-eq v2, v6, :cond_10

    .line 315
    .line 316
    iget-object v2, v0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 317
    .line 318
    if-eqz v2, :cond_f

    .line 319
    .line 320
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 321
    .line 322
    .line 323
    :cond_f
    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    iput-object v1, v0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 328
    .line 329
    iput-boolean v5, v0, Lu0/n;->k0:Z

    .line 330
    .line 331
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 332
    .line 333
    .line 334
    return v4

    .line 335
    :cond_10
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-eqz v2, :cond_12

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_11
    invoke-virtual/range {p0 .. p1}, Lu0/n;->i(Landroid/view/MotionEvent;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-nez v2, :cond_12

    .line 347
    .line 348
    goto :goto_7

    .line 349
    :cond_12
    :goto_6
    invoke-virtual/range {p0 .. p1}, Lu0/n;->d(Landroid/view/MotionEvent;)I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    and-int/2addr v1, v5

    .line 354
    if-eqz v1, :cond_13

    .line 355
    .line 356
    return v5

    .line 357
    :cond_13
    :goto_7
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_b

    .line 11
    .line 12
    iget-object v0, p0, Lu0/n;->g:Ln0/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Ln0/c;->b:Lc0/g;

    .line 18
    .line 19
    if-eqz v0, :cond_a

    .line 20
    .line 21
    invoke-static {v0}, LA6/c;->t(Lc0/g;)Lc0/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_a

    .line 26
    .line 27
    iget-object v1, v0, Lc0/g;->k:Lt0/y;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_8

    .line 31
    .line 32
    iget-object v1, v1, Lt0/y;->e:Lt0/t;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-object v3, v0, Lc0/g;->n:LP/d;

    .line 38
    .line 39
    iget v4, v3, LP/d;->c:I

    .line 40
    .line 41
    if-lez v4, :cond_6

    .line 42
    .line 43
    iget-object v3, v3, LP/d;->a:[Ljava/lang/Object;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    :cond_1
    aget-object v6, v3, v5

    .line 47
    .line 48
    check-cast v6, Ln0/c;

    .line 49
    .line 50
    iget-object v7, v6, Ln0/c;->d:Lt0/t;

    .line 51
    .line 52
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_5

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    :cond_2
    :goto_0
    move-object v2, v6

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    iget-object v7, v6, Ln0/c;->d:Lt0/t;

    .line 63
    .line 64
    move-object v8, v2

    .line 65
    :cond_4
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-nez v9, :cond_5

    .line 70
    .line 71
    iget-object v8, v8, Ln0/c;->c:Ln0/c;

    .line 72
    .line 73
    if-eqz v8, :cond_2

    .line 74
    .line 75
    iget-object v9, v8, Ln0/c;->d:Lt0/t;

    .line 76
    .line 77
    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-nez v9, :cond_4

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 85
    .line 86
    if-lt v5, v4, :cond_1

    .line 87
    .line 88
    :cond_6
    if-eqz v2, :cond_7

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_7
    iget-object v2, v0, Lc0/g;->m:Ln0/c;

    .line 92
    .line 93
    :cond_8
    :goto_2
    if-eqz v2, :cond_a

    .line 94
    .line 95
    invoke-virtual {v2, p1}, Ln0/c;->b(Landroid/view/KeyEvent;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    return p1

    .line 103
    :cond_9
    invoke-virtual {v2, p1}, Ln0/c;->a(Landroid/view/KeyEvent;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    return p1

    .line 108
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string v0, "KeyEvent can\'t be processed because this key input node is not active."

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_b
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lu0/n;->k0:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lu0/n;->j0:Lkd/c;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 17
    .line 18
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eq v2, v3, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput-boolean v1, p0, Lu0/n;->k0:Z

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lkd/c;->run()V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_1
    invoke-static {p1}, Lu0/n;->g(Landroid/view/MotionEvent;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v2, 0x2

    .line 72
    if-ne v0, v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lu0/n;->i(Landroid/view/MotionEvent;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-virtual {p0, p1}, Lu0/n;->d(Landroid/view/MotionEvent;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    and-int/lit8 v0, p1, 0x2

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 95
    .line 96
    .line 97
    :cond_5
    and-int/2addr p1, v2

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    return v2

    .line 101
    :cond_6
    :goto_2
    return v1
.end method

.method public final f(Lt0/t;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/n;->D:Lt0/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lt0/z;->f(Lt0/t;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lt0/t;->l()LP/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget v0, p1, LP/d;->c:I

    .line 12
    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    iget-object p1, p1, LP/d;->a:[Ljava/lang/Object;

    .line 16
    .line 17
    :cond_0
    aget-object v2, p1, v1

    .line 18
    .line 19
    check-cast v2, Lt0/t;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lu0/n;->f(Lt0/t;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    if-lt v1, v0, :cond_0

    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v3, 0x1d

    .line 6
    .line 7
    if-lt v2, v3, :cond_0

    .line 8
    .line 9
    const-class v2, Landroid/view/View;

    .line 10
    .line 11
    const-string v3, "findViewByAccessibilityIdTraversal"

    .line 12
    .line 13
    new-array v4, v1, [Ljava/lang/Class;

    .line 14
    .line 15
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    aput-object v5, v4, v0

    .line 18
    .line 19
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    aput-object p1, v1, v0

    .line 33
    .line 34
    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    instance-of v0, p1, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    check-cast p1, Landroid/view/View;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_0
    invoke-static {p1, p0}, Lu0/n;->c(ILandroid/view/View;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-object p1

    .line 50
    :catch_0
    :cond_1
    const/4 p1, 0x0

    .line 51
    return-object p1
.end method

.method public bridge synthetic getAccessibilityManager()Lu0/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu0/n;->getAccessibilityManager()Lu0/g;

    move-result-object v0

    return-object v0
.end method

.method public getAccessibilityManager()Lu0/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lu0/n;->w:Lu0/g;

    return-object v0
.end method

.method public final getAndroidViewsHandler$ui_release()Lu0/F;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->z:Lu0/F;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lu0/F;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "context"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lu0/F;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lu0/n;->z:Lu0/F;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lu0/n;->z:Lu0/F;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public getAutofill()La0/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->t:La0/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAutofillTree()La0/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->m:La0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getClipboardManager()Lu0/I;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu0/n;->getClipboardManager()Lu0/h;

    move-result-object v0

    return-object v0
.end method

.method public getClipboardManager()Lu0/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lu0/n;->v:Lu0/h;

    return-object v0
.end method

.method public final getConfigurationChangeObserver()Ltf/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltf/l;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->s:Ltf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDensity()LL0/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->d:LL0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFocusManager()Lc0/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->e:Lb7/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    const-string v0, "rect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu0/n;->e:Lb7/k;

    .line 7
    .line 8
    iget-object v0, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lc0/g;

    .line 11
    .line 12
    invoke-static {v0}, Lvf/a;->p(Lc0/g;)Lc0/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, LA6/c;->v(Lc0/g;)Ld0/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v1, v0, Ld0/d;->a:F

    .line 23
    .line 24
    invoke-static {v1}, Lvf/a;->H(F)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 29
    .line 30
    iget v1, v0, Ld0/d;->b:F

    .line 31
    .line 32
    invoke-static {v1}, Lvf/a;->H(F)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput v1, p1, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    iget v1, v0, Ld0/d;->c:F

    .line 39
    .line 40
    invoke-static {v1}, Lvf/a;->H(F)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 45
    .line 46
    iget v0, v0, Ld0/d;->d:F

    .line 47
    .line 48
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    sget-object v0, Lef/C;->a:Lef/C;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v0, 0x0

    .line 58
    :goto_0
    if-nez v0, :cond_1

    .line 59
    .line 60
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public getFontFamilyResolver()LE0/e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->V:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE0/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public getFontLoader()LE0/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->U:LJ4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHapticFeedBack()Lk0/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->b0:La2/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/n;->D:Lt0/z;

    .line 2
    .line 3
    iget-object v0, v0, Lt0/z;->b:LY2/B;

    .line 4
    .line 5
    iget-object v0, v0, LY2/B;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lt0/P;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    return v0
.end method

.method public getInputModeManager()Ll0/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->c0:Ll0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui_release()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lu0/n;->J:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLayoutDirection()LL0/i;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->a0:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LL0/i;

    .line 8
    .line 9
    return-object v0
.end method

.method public getMeasureIteration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/n;->D:Lt0/z;

    .line 2
    .line 3
    iget-boolean v1, v0, Lt0/z;->c:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-wide v0, v0, Lt0/z;->f:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v1, "measureIteration should be only used during the measure/layout pass"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public getPointerIconService()Lp0/i;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->n0:Lu0/V;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRoot()Lt0/t;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->i:Lt0/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRootForTest()Lt0/N;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->j:Lu0/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSemanticsOwner()Lx0/l;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->k:Lx0/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSharedDrawScope()Lt0/v;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->c:Lt0/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShowLayoutBounds()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu0/n;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSnapshotObserver()Lt0/K;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->x:Lt0/K;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextInputService()LF0/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->T:LF0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTextToolbar()Lu0/n0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->d0:Lu0/V;

    .line 2
    .line 3
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    return-object p0
.end method

.method public getViewConfiguration()Lu0/p0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->E:Lu0/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getViewTreeOwners()Lu0/j;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->N:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu0/j;

    .line 8
    .line 9
    return-object v0
.end method

.method public getWindowInfo()Lu0/x0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/n;->f:Lu0/y0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v2, v1, v0

    .line 11
    .line 12
    if-gtz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    cmpg-float v0, v0, v2

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    cmpg-float v0, v1, p1

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    cmpg-float p1, p1, v0

    .line 33
    .line 34
    if-gtz p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    return p1
.end method

.method public final i(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    cmpg-float v2, v2, v3

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    cmpg-float p1, p1, v0

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_1
    :goto_0
    return v1
.end method

.method public final j(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lu0/n;->p()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu0/n;->H:[F

    .line 5
    .line 6
    invoke-static {p1, p2, v0}, Le0/z;->m(J[F)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-wide v1, p0, Lu0/n;->L:J

    .line 15
    .line 16
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-float/2addr v1, v0

    .line 21
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-wide v2, p0, Lu0/n;->L:J

    .line 26
    .line 27
    invoke-static {v2, v3}, Ld0/c;->c(J)F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    add-float/2addr p2, p1

    .line 32
    invoke-static {v1, p2}, LU8/v0;->f(FF)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    return-wide p1
.end method

.method public final k(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/n;->D:Lt0/z;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    :try_start_0
    iget-object p1, p0, Lu0/n;->l0:Lt0/p;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    invoke-virtual {v0, p1}, Lt0/z;->c(Lt0/p;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 23
    .line 24
    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    invoke-virtual {v0, p1}, Lt0/z;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method public final l(Lt0/G;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/n;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez p2, :cond_2

    .line 4
    .line 5
    iget-boolean p2, p0, Lu0/n;->p:Z

    .line 6
    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p2, "Failed requirement."

    .line 19
    .line 20
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    return-void

    .line 25
    :cond_2
    iget-boolean p2, p0, Lu0/n;->p:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_3
    iget-object p2, p0, Lu0/n;->o:Ljava/util/ArrayList;

    .line 34
    .line 35
    if-nez p2, :cond_4

    .line 36
    .line 37
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lu0/n;->o:Ljava/util/ArrayList;

    .line 43
    .line 44
    :cond_4
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final m()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lu0/n;->u:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lt0/K;->a:LX/u;

    .line 12
    .line 13
    iget-object v3, v0, LX/u;->f:LP/d;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v0, v0, LX/u;->f:LP/d;

    .line 17
    .line 18
    iget v4, v0, LP/d;->c:I

    .line 19
    .line 20
    move v5, v2

    .line 21
    move v6, v5

    .line 22
    :goto_0
    if-ge v5, v4, :cond_2

    .line 23
    .line 24
    iget-object v7, v0, LP/d;->a:[Ljava/lang/Object;

    .line 25
    .line 26
    aget-object v7, v7, v5

    .line 27
    .line 28
    check-cast v7, LX/t;

    .line 29
    .line 30
    invoke-virtual {v7}, LX/t;->e()V

    .line 31
    .line 32
    .line 33
    iget-object v7, v7, LX/t;->f:Lx/o;

    .line 34
    .line 35
    iget v7, v7, Lx/o;->e:I

    .line 36
    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    if-lez v6, :cond_1

    .line 40
    .line 41
    iget-object v7, v0, LP/d;->a:[Ljava/lang/Object;

    .line 42
    .line 43
    sub-int v8, v5, v6

    .line 44
    .line 45
    aget-object v9, v7, v5

    .line 46
    .line 47
    aput-object v9, v7, v8

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    iget-object v5, v0, LP/d;->a:[Ljava/lang/Object;

    .line 58
    .line 59
    sub-int v6, v4, v6

    .line 60
    .line 61
    invoke-static {v5, v6, v4, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput v6, v0, LP/d;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    monitor-exit v3

    .line 67
    iput-boolean v2, p0, Lu0/n;->u:Z

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :goto_2
    monitor-exit v3

    .line 71
    throw v0

    .line 72
    :cond_3
    :goto_3
    iget-object v0, p0, Lu0/n;->z:Lu0/F;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-static {v0}, Lu0/n;->a(Landroid/view/ViewGroup;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_4
    iget-object v0, p0, Lu0/n;->h0:LP/d;

    .line 80
    .line 81
    invoke-virtual {v0}, LP/d;->j()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_a

    .line 86
    .line 87
    iget-object v0, p0, Lu0/n;->h0:LP/d;

    .line 88
    .line 89
    iget v0, v0, LP/d;->c:I

    .line 90
    .line 91
    move v3, v2

    .line 92
    :goto_5
    if-ge v3, v0, :cond_6

    .line 93
    .line 94
    iget-object v4, p0, Lu0/n;->h0:LP/d;

    .line 95
    .line 96
    iget-object v4, v4, LP/d;->a:[Ljava/lang/Object;

    .line 97
    .line 98
    aget-object v5, v4, v3

    .line 99
    .line 100
    check-cast v5, Ltf/a;

    .line 101
    .line 102
    aput-object v1, v4, v3

    .line 103
    .line 104
    if-eqz v5, :cond_5

    .line 105
    .line 106
    invoke-interface {v5}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_6
    iget-object v3, p0, Lu0/n;->h0:LP/d;

    .line 113
    .line 114
    if-lez v0, :cond_9

    .line 115
    .line 116
    iget v4, v3, LP/d;->c:I

    .line 117
    .line 118
    if-ge v0, v4, :cond_7

    .line 119
    .line 120
    iget-object v5, v3, LP/d;->a:[Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v5, v2, v5, v0, v4}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 123
    .line 124
    .line 125
    :cond_7
    iget v4, v3, LP/d;->c:I

    .line 126
    .line 127
    sub-int v0, v4, v0

    .line 128
    .line 129
    add-int/lit8 v4, v4, -0x1

    .line 130
    .line 131
    if-gt v0, v4, :cond_8

    .line 132
    .line 133
    move v5, v0

    .line 134
    :goto_6
    iget-object v6, v3, LP/d;->a:[Ljava/lang/Object;

    .line 135
    .line 136
    aput-object v1, v6, v5

    .line 137
    .line 138
    if-eq v5, v4, :cond_8

    .line 139
    .line 140
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_8
    iput v0, v3, LP/d;->c:I

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_a
    return-void
.end method

.method public final n(Lt0/t;)V
    .locals 2

    .line 1
    const-string v0, "layoutNode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu0/n;->l:Lu0/s;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lu0/s;->p:Z

    .line 13
    .line 14
    invoke-virtual {v0}, Lu0/s;->r()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {v0, p1}, Lu0/s;->s(Lt0/t;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/n;->l:Lu0/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lu0/s;->p:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Lu0/s;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-boolean v2, v0, Lu0/s;->v:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iput-boolean v1, v0, Lu0/s;->v:Z

    .line 17
    .line 18
    iget-object v1, v0, Lu0/s;->g:Landroid/os/Handler;

    .line 19
    .line 20
    iget-object v0, v0, Lu0/s;->w:Lkd/c;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Lu0/n;->f(Lt0/t;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lu0/n;->e(Lt0/t;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lt0/K;->a:LX/u;

    .line 23
    .line 24
    invoke-virtual {v0}, LX/u;->d()V

    .line 25
    .line 26
    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v1, 0x1a

    .line 30
    .line 31
    if-lt v0, v1, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lu0/n;->t:La0/a;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    sget-object v1, La0/e;->a:La0/e;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, La0/e;->a(La0/a;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/V;->e(Landroid/view/View;)Landroidx/lifecycle/v;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {p0}, Ltg/b;->y(Landroid/view/View;)Ln3/f;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {p0}, Lu0/n;->getViewTreeOwners()Lu0/j;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    iget-object v3, v2, Lu0/j;->a:Landroidx/lifecycle/v;

    .line 61
    .line 62
    if-ne v0, v3, :cond_1

    .line 63
    .line 64
    if-eq v1, v3, :cond_4

    .line 65
    .line 66
    :cond_1
    if-eqz v0, :cond_6

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    iget-object v2, v2, Lu0/j;->a:Landroidx/lifecycle/v;

    .line 73
    .line 74
    invoke-interface {v2}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {v2, p0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-interface {v0}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2, p0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 88
    .line 89
    .line 90
    new-instance v2, Lu0/j;

    .line 91
    .line 92
    invoke-direct {v2, v0, v1}, Lu0/j;-><init>(Landroidx/lifecycle/v;Ln3/f;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, v2}, Lu0/n;->setViewTreeOwners(Lu0/j;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lu0/n;->O:Ltf/l;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-interface {v0, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_3
    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Lu0/n;->O:Ltf/l;

    .line 107
    .line 108
    :cond_4
    invoke-virtual {p0}, Lu0/n;->getViewTreeOwners()Lu0/j;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, Lu0/j;->a:Landroidx/lifecycle/v;

    .line 116
    .line 117
    invoke-interface {v0}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0, p0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object v1, p0, Lu0/n;->P:LLb/f;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v1, p0, Lu0/n;->Q:LLb/e;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v1, p0, Lu0/n;->R:Lu0/i;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    const-string v1, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    .line 155
    .line 156
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string v1, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    .line 163
    .line 164
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v0
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/n;->S:LW9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 6

    .line 1
    const-string v0, "newConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "context"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 37
    .line 38
    new-instance v3, LL0/c;

    .line 39
    .line 40
    invoke-direct {v3, v2, v0}, LL0/c;-><init>(FF)V

    .line 41
    .line 42
    .line 43
    iput-object v3, p0, Lu0/n;->d:LL0/c;

    .line 44
    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    const/16 v3, 0x1f

    .line 49
    .line 50
    if-lt v0, v3, :cond_0

    .line 51
    .line 52
    invoke-static {p1}, Le1/c;->a(Landroid/content/res/Configuration;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v4, v2

    .line 58
    :goto_0
    iget v5, p0, Lu0/n;->W:I

    .line 59
    .line 60
    if-eq v4, v5, :cond_2

    .line 61
    .line 62
    if-lt v0, v3, :cond_1

    .line 63
    .line 64
    invoke-static {p1}, Le1/c;->a(Landroid/content/res/Configuration;)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    :cond_1
    iput v2, p0, Lu0/n;->W:I

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lvf/a;->o(Landroid/content/Context;)LE0/f;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-direct {p0, v0}, Lu0/n;->setFontFamilyResolver(LE0/e;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object v0, p0, Lu0/n;->s:Ltf/l;

    .line 85
    .line 86
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final synthetic onCreate(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->c(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .line 1
    const-string v0, "outAttrs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lu0/n;->S:LW9/u;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method public final onDestroy(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lt0/K;->a:LX/u;

    .line 9
    .line 10
    iget-object v1, v0, LX/u;->g:LS8/b;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, LS8/b;->c()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, LX/u;->b()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lu0/n;->getViewTreeOwners()Lu0/j;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Lu0/j;->a:Landroidx/lifecycle/v;

    .line 27
    .line 28
    invoke-interface {v0}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v1, 0x1a

    .line 40
    .line 41
    if-lt v0, v1, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lu0/n;->t:La0/a;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    sget-object v1, La0/e;->a:La0/e;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, La0/e;->b(La0/a;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, Lu0/n;->P:LLb/f;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, Lu0/n;->Q:LLb/e;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lu0/n;->R:Lu0/i;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string p3, "Owner FocusChanged("

    .line 7
    .line 8
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const/16 p3, 0x29

    .line 15
    .line 16
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string p3, "Compose Focus"

    .line 24
    .line 25
    invoke-static {p3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Lu0/n;->e:Lb7/k;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p2, Lb7/k;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lc0/g;

    .line 35
    .line 36
    iget-object p2, p1, Lc0/g;->d:Lc0/r;

    .line 37
    .line 38
    sget-object p3, Lc0/r;->f:Lc0/r;

    .line 39
    .line 40
    if-ne p2, p3, :cond_0

    .line 41
    .line 42
    sget-object p2, Lc0/r;->a:Lc0/r;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lc0/g;->e0(Lc0/r;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void

    .line 48
    :cond_1
    iget-object p1, p2, Lb7/k;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lc0/g;

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    invoke-static {p1, p2}, Lxg/g;->q(Lc0/g;Z)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lu0/n;->B:LL0/a;

    .line 3
    .line 4
    invoke-virtual {p0}, Lu0/n;->w()V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lu0/n;->z:Lu0/F;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sub-int/2addr p4, p2

    .line 16
    sub-int/2addr p5, p3

    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lu0/n;->D:Lt0/z;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:onMeasure"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Lu0/n;->f(Lt0/t;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-static {p1}, Lu0/n;->b(I)Lef/k;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v1, p1, Lef/k;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object p1, p1, Lef/k;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p2}, Lu0/n;->b(I)Lef/k;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object v2, p2, Lef/k;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget-object p2, p2, Lef/k;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-static {v1, p1, v2, p2}, Lxg/g;->a(IIII)J

    .line 66
    .line 67
    .line 68
    move-result-wide p1

    .line 69
    iget-object v1, p0, Lu0/n;->B:LL0/a;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    const/4 v3, 0x1

    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    new-instance v1, LL0/a;

    .line 76
    .line 77
    invoke-direct {v1, p1, p2}, LL0/a;-><init>(J)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Lu0/n;->B:LL0/a;

    .line 81
    .line 82
    iput-boolean v2, p0, Lu0/n;->C:Z

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    iget-wide v4, v1, LL0/a;->a:J

    .line 86
    .line 87
    cmp-long v1, v4, p1

    .line 88
    .line 89
    if-nez v1, :cond_2

    .line 90
    .line 91
    move v2, v3

    .line 92
    :cond_2
    if-nez v2, :cond_3

    .line 93
    .line 94
    iput-boolean v3, p0, Lu0/n;->C:Z

    .line 95
    .line 96
    :cond_3
    :goto_1
    iget-object v1, v0, Lt0/z;->h:LL0/a;

    .line 97
    .line 98
    if-nez v1, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    iget-wide v1, v1, LL0/a;->a:J

    .line 102
    .line 103
    cmp-long v1, v1, p1

    .line 104
    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    :goto_2
    iget-boolean v1, v0, Lt0/z;->c:Z

    .line 109
    .line 110
    if-nez v1, :cond_7

    .line 111
    .line 112
    new-instance v1, LL0/a;

    .line 113
    .line 114
    invoke-direct {v1, p1, p2}, LL0/a;-><init>(J)V

    .line 115
    .line 116
    .line 117
    iput-object v1, v0, Lt0/z;->h:LL0/a;

    .line 118
    .line 119
    iget-object p1, v0, Lt0/z;->a:Lt0/t;

    .line 120
    .line 121
    iput-boolean v3, p1, Lt0/t;->K:Z

    .line 122
    .line 123
    iget-object p2, v0, Lt0/z;->b:LY2/B;

    .line 124
    .line 125
    invoke-virtual {p2, p1}, LY2/B;->h(Lt0/t;)V

    .line 126
    .line 127
    .line 128
    :goto_3
    iget-object p1, p0, Lu0/n;->l0:Lt0/p;

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Lt0/z;->c(Lt0/p;)Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iget-object p1, p1, Lt0/t;->y:Lt0/F;

    .line 138
    .line 139
    iget p1, p1, Lr0/t;->a:I

    .line 140
    .line 141
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    iget-object p2, p2, Lt0/t;->y:Lt0/F;

    .line 146
    .line 147
    iget p2, p2, Lr0/t;->b:I

    .line 148
    .line 149
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lu0/n;->z:Lu0/F;

    .line 153
    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    invoke-virtual {p0}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    iget-object p2, p2, Lt0/t;->y:Lt0/F;

    .line 165
    .line 166
    iget p2, p2, Lr0/t;->a:I

    .line 167
    .line 168
    const/high16 v0, 0x40000000    # 2.0f

    .line 169
    .line 170
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    iget-object v1, v1, Lt0/t;->y:Lt0/F;

    .line 179
    .line 180
    iget v1, v1, Lr0/t;->b:I

    .line 181
    .line 182
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    .line 188
    .line 189
    :cond_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_7
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 194
    .line 195
    const-string p2, "Failed requirement."

    .line 196
    .line 197
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 202
    .line 203
    .line 204
    throw p1
.end method

.method public final onPause(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 7

    .line 1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    if-lt p2, v0, :cond_2

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-object p2, p0, Lu0/n;->t:La0/a;

    .line 10
    .line 11
    if-eqz p2, :cond_2

    .line 12
    .line 13
    sget-object v0, La0/c;->a:La0/c;

    .line 14
    .line 15
    iget-object v1, p2, La0/a;->b:La0/f;

    .line 16
    .line 17
    iget-object v2, v1, La0/f;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0, p1, v2}, La0/c;->a(Landroid/view/ViewStructure;I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v1, v1, La0/f;->a:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    move-object v3, v1

    .line 66
    invoke-virtual {v0, p1, v2}, La0/c;->b(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v1, :cond_0

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    move-object v1, v3

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    sget-object v6, La0/d;->a:La0/d;

    .line 77
    .line 78
    invoke-virtual {v6, p1}, La0/d;->a(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v1, p1, v4}, La0/d;->g(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p2, La0/a;->a:Lu0/n;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    move v2, v4

    .line 99
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-virtual/range {v0 .. v5}, La0/c;->d(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x1

    .line 105
    invoke-virtual {v6, v1, p1}, La0/d;->h(Landroid/view/ViewStructure;I)V

    .line 106
    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    throw p1

    .line 110
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_2
    return-void
.end method

.method public final onResume(Landroidx/lifecycle/v;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lu0/V;->a()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0, p1}, Lu0/n;->setShowLayoutBounds(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lu0/n;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v0, LL0/i;->a:LL0/i;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p1, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, LL0/i;->b:LL0/i;

    .line 14
    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Lu0/n;->setLayoutDirection(LL0/i;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lu0/n;->e:Lb7/k;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iput-object v0, p1, Lb7/k;->d:Ljava/lang/Object;

    .line 24
    .line 25
    :cond_2
    return-void
.end method

.method public final synthetic onStart(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->e(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final synthetic onStop(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/n;->f:Lu0/y0;

    .line 2
    .line 3
    iget-object v0, v0, Lu0/y0;->a:LN/Y;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowFocusChanged(Z)V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lu0/V;->a()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0}, Lu0/n;->getShowLayoutBounds()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eq v0, p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lu0/n;->setShowLayoutBounds(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lu0/n;->e(Lt0/t;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lu0/n;->K:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lu0/n;->J:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iput-wide v0, p0, Lu0/n;->J:J

    .line 16
    .line 17
    iget-object v0, p0, Lu0/n;->m0:Lu0/G;

    .line 18
    .line 19
    iget-object v1, p0, Lu0/n;->H:[F

    .line 20
    .line 21
    invoke-interface {v0, p0, v1}, Lu0/G;->a(Landroid/view/View;[F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lu0/n;->I:[F

    .line 25
    .line 26
    invoke-static {v1, v0}, Lu0/Q;->h([F[F)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v1, p0

    .line 34
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Landroid/view/View;

    .line 40
    .line 41
    move-object v0, v1

    .line 42
    check-cast v0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object v0, p0, Lu0/n;->G:[I

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    aget v3, v0, v2

    .line 56
    .line 57
    int-to-float v3, v3

    .line 58
    const/4 v4, 0x1

    .line 59
    aget v5, v0, v4

    .line 60
    .line 61
    int-to-float v5, v5

    .line 62
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 63
    .line 64
    .line 65
    aget v1, v0, v2

    .line 66
    .line 67
    int-to-float v1, v1

    .line 68
    aget v0, v0, v4

    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    sub-float/2addr v3, v1

    .line 72
    sub-float/2addr v5, v0

    .line 73
    invoke-static {v3, v5}, LU8/v0;->f(FF)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    iput-wide v0, p0, Lu0/n;->L:J

    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public final q(Lt0/G;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/n;->A:Lu0/S;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lu0/s0;->m:Lu0/q0;

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lu0/n;->g0:Lu0/w0;

    .line 8
    .line 9
    iget-object v1, v0, Lu0/w0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, Lu0/w0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, LP/d;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2, v1}, LP/d;->k(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_1
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    iget-object v0, v0, Lu0/w0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/ref/ReferenceQueue;

    .line 33
    .line 34
    invoke-direct {v1, p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, LP/d;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final r(Ltf/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/n;->h0:LP/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/d;->f(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LP/d;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final s(Lt0/t;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iget-boolean v0, p0, Lu0/n;->C:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    :goto_0
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget v0, p1, Lt0/t;->O:I

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lu0/n;->getRoot()Lt0/t;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-ne p1, v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 59
    .line 60
    .line 61
    :cond_4
    return-void
.end method

.method public final setConfigurationChangeObserver(Ltf/l;)V
    .locals 1
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lu0/n;->s:Ltf/l;

    .line 7
    .line 8
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui_release(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lu0/n;->J:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(Ltf/l;)V
    .locals 1
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lu0/n;->getViewTreeOwners()Lu0/j;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iput-object p1, p0, Lu0/n;->O:Ltf/l;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lu0/n;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final t(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lu0/n;->p()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-wide v1, p0, Lu0/n;->L:J

    .line 9
    .line 10
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sub-float/2addr v0, v1

    .line 15
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-wide v1, p0, Lu0/n;->L:J

    .line 20
    .line 21
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    sub-float/2addr p1, p2

    .line 26
    iget-object p2, p0, Lu0/n;->I:[F

    .line 27
    .line 28
    invoke-static {v0, p1}, LU8/v0;->f(FF)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {v0, v1, p2}, Le0/z;->m(J[F)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    return-wide p1
.end method

.method public final u(Landroid/view/MotionEvent;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lu0/n;->q:Lp0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p0}, Lp0/c;->a(Landroid/view/MotionEvent;Lu0/n;)LY2/B;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lu0/n;->r:LM/y;

    .line 8
    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    iget-object v3, v1, LY2/B;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    move-object v5, v4

    .line 34
    check-cast v5, Lp0/m;

    .line 35
    .line 36
    iget-boolean v5, v5, Lp0/m;->e:Z

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    :goto_0
    check-cast v4, Lp0/m;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget-wide v3, v4, Lp0/m;->d:J

    .line 47
    .line 48
    iput-wide v3, p0, Lu0/n;->a:J

    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0, p1}, Lu0/n;->h(Landroid/view/MotionEvent;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {v2, v1, p0, v3}, LM/y;->g(LY2/B;Lu0/n;Z)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    const/4 v3, 0x5

    .line 65
    if-ne v2, v3, :cond_4

    .line 66
    .line 67
    :cond_3
    and-int/lit8 v2, v1, 0x1

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    :cond_4
    return v1

    .line 72
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iget-object v2, v0, Lp0/c;->c:Landroid/util/SparseBooleanArray;

    .line 81
    .line 82
    invoke-virtual {v2, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 83
    .line 84
    .line 85
    iget-object v0, v0, Lp0/c;->b:Landroid/util/SparseLongArray;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    .line 88
    .line 89
    .line 90
    return v1

    .line 91
    :cond_6
    invoke-virtual {v2}, LM/y;->h()V

    .line 92
    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    return p1
.end method

.method public final v(Landroid/view/MotionEvent;IJZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, -0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    const/4 v7, 0x6

    .line 17
    if-eq v2, v7, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/16 v2, 0x9

    .line 26
    .line 27
    if-eq v5, v2, :cond_2

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    if-eq v5, v2, :cond_2

    .line 32
    .line 33
    move v4, v6

    .line 34
    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ltz v4, :cond_3

    .line 39
    .line 40
    move v7, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move v7, v6

    .line 43
    :goto_1
    sub-int/2addr v2, v7

    .line 44
    if-nez v2, :cond_4

    .line 45
    .line 46
    return-void

    .line 47
    :cond_4
    new-array v7, v2, [Landroid/view/MotionEvent$PointerProperties;

    .line 48
    .line 49
    move v8, v6

    .line 50
    :goto_2
    if-ge v8, v2, :cond_5

    .line 51
    .line 52
    new-instance v9, Landroid/view/MotionEvent$PointerProperties;

    .line 53
    .line 54
    invoke-direct {v9}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 55
    .line 56
    .line 57
    aput-object v9, v7, v8

    .line 58
    .line 59
    add-int/lit8 v8, v8, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_5
    new-array v8, v2, [Landroid/view/MotionEvent$PointerCoords;

    .line 63
    .line 64
    move v9, v6

    .line 65
    :goto_3
    if-ge v9, v2, :cond_6

    .line 66
    .line 67
    new-instance v10, Landroid/view/MotionEvent$PointerCoords;

    .line 68
    .line 69
    invoke-direct {v10}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 70
    .line 71
    .line 72
    aput-object v10, v8, v9

    .line 73
    .line 74
    add-int/lit8 v9, v9, 0x1

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_6
    move v9, v6

    .line 78
    :goto_4
    if-ge v9, v2, :cond_9

    .line 79
    .line 80
    if-ltz v4, :cond_8

    .line 81
    .line 82
    if-ge v9, v4, :cond_7

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_7
    move v10, v3

    .line 86
    goto :goto_6

    .line 87
    :cond_8
    :goto_5
    move v10, v6

    .line 88
    :goto_6
    add-int/2addr v10, v9

    .line 89
    aget-object v11, v7, v9

    .line 90
    .line 91
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 92
    .line 93
    .line 94
    aget-object v11, v8, v9

    .line 95
    .line 96
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 97
    .line 98
    .line 99
    iget v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 100
    .line 101
    iget v12, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 102
    .line 103
    invoke-static {v10, v12}, LU8/v0;->f(FF)J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    invoke-virtual {v0, v12, v13}, Lu0/n;->j(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v12

    .line 111
    invoke-static {v12, v13}, Ld0/c;->b(J)F

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    iput v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 116
    .line 117
    invoke-static {v12, v13}, Ld0/c;->c(J)F

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    iput v10, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 122
    .line 123
    add-int/lit8 v9, v9, 0x1

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_9
    if-eqz p5, :cond_a

    .line 127
    .line 128
    :goto_7
    move v10, v6

    .line 129
    goto :goto_8

    .line 130
    :cond_a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    goto :goto_7

    .line 135
    :goto_8
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v11

    .line 139
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 140
    .line 141
    .line 142
    move-result-wide v13

    .line 143
    cmp-long v4, v11, v13

    .line 144
    .line 145
    if-nez v4, :cond_b

    .line 146
    .line 147
    move-wide/from16 v11, p3

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 151
    .line 152
    .line 153
    move-result-wide v11

    .line 154
    :goto_9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    move v6, v2

    .line 159
    move-wide v1, v11

    .line 160
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getFlags()I

    .line 181
    .line 182
    .line 183
    move-result v16

    .line 184
    move-wide/from16 v3, p3

    .line 185
    .line 186
    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-string v2, "event"

    .line 191
    .line 192
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iget-object v2, v0, Lu0/n;->q:Lp0/c;

    .line 196
    .line 197
    invoke-virtual {v2, v1, v0}, Lp0/c;->a(Landroid/view/MotionEvent;Lu0/n;)LY2/B;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object v3, v0, Lu0/n;->r:LM/y;

    .line 205
    .line 206
    const/4 v4, 0x1

    .line 207
    invoke-virtual {v3, v2, v0, v4}, LM/y;->g(LY2/B;Lu0/n;Z)I

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public final w()V
    .locals 9

    .line 1
    iget-object v0, p0, Lu0/n;->G:[I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lu0/n;->F:J

    .line 7
    .line 8
    sget v3, LL0/g;->c:I

    .line 9
    .line 10
    const/16 v3, 0x20

    .line 11
    .line 12
    shr-long v3, v1, v3

    .line 13
    .line 14
    long-to-int v3, v3

    .line 15
    const/4 v4, 0x0

    .line 16
    aget v5, v0, v4

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    if-ne v3, v5, :cond_0

    .line 20
    .line 21
    const-wide v7, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v1, v7

    .line 27
    long-to-int v1, v1

    .line 28
    aget v2, v0, v6

    .line 29
    .line 30
    if-eq v1, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    aget v0, v0, v6

    .line 33
    .line 34
    invoke-static {v5, v0}, LA6/h;->b(II)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iput-wide v0, p0, Lu0/n;->F:J

    .line 39
    .line 40
    move v4, v6

    .line 41
    :cond_1
    iget-object v0, p0, Lu0/n;->D:Lt0/z;

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Lt0/z;->a(Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
