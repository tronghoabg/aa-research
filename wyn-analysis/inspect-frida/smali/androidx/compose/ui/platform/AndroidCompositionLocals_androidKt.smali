.class public final Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "LN/f0;",
        "Landroidx/lifecycle/v;",
        "d",
        "LN/f0;",
        "getLocalLifecycleOwner",
        "()LN/f0;",
        "LocalLifecycleOwner",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:LN/D;

.field public static final b:LN/L0;

.field public static final c:LN/L0;

.field public static final d:LN/L0;

.field public static final e:LN/L0;

.field public static final f:LN/L0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LN/P;->c:LN/P;

    .line 2
    .line 3
    sget-object v1, Lu0/w;->j:Lu0/w;

    .line 4
    .line 5
    new-instance v2, LN/D;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, LN/D;-><init>(LN/A0;Ltf/a;)V

    .line 8
    .line 9
    .line 10
    sput-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LN/D;

    .line 11
    .line 12
    sget-object v0, Lu0/w;->k:Lu0/w;

    .line 13
    .line 14
    new-instance v1, LN/L0;

    .line 15
    .line 16
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LN/L0;

    .line 20
    .line 21
    sget-object v0, Lu0/w;->l:Lu0/w;

    .line 22
    .line 23
    new-instance v1, LN/L0;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:LN/L0;

    .line 29
    .line 30
    sget-object v0, Lu0/w;->m:Lu0/w;

    .line 31
    .line 32
    new-instance v1, LN/L0;

    .line 33
    .line 34
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:LN/L0;

    .line 38
    .line 39
    sget-object v0, Lu0/w;->n:Lu0/w;

    .line 40
    .line 41
    new-instance v1, LN/L0;

    .line 42
    .line 43
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 44
    .line 45
    .line 46
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:LN/L0;

    .line 47
    .line 48
    sget-object v0, Lu0/w;->o:Lu0/w;

    .line 49
    .line 50
    new-instance v1, LN/L0;

    .line 51
    .line 52
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 53
    .line 54
    .line 55
    sput-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LN/L0;

    .line 56
    .line 57
    return-void
.end method

.method public static final a(Lu0/n;LV/d;LN/o;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x1

    .line 11
    const-string v8, "content"

    .line 12
    .line 13
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v8, 0x5342453c

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v8}, LN/o;->N(I)LN/o;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    const v9, -0x1d58f75c

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v9}, LN/o;->M(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    sget-object v11, LN/k;->a:LN/P;

    .line 37
    .line 38
    if-ne v10, v11, :cond_0

    .line 39
    .line 40
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-virtual {v10}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    sget-object v12, LN/P;->c:LN/P;

    .line 49
    .line 50
    invoke-static {v10, v12}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-virtual {v2, v10}, LN/o;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {v2, v6}, LN/o;->p(Z)V

    .line 58
    .line 59
    .line 60
    check-cast v10, LN/V;

    .line 61
    .line 62
    const v12, 0x44faf204

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v12}, LN/o;->M(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v10}, LN/o;->e(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v13

    .line 76
    if-nez v12, :cond_1

    .line 77
    .line 78
    if-ne v13, v11, :cond_2

    .line 79
    .line 80
    :cond_1
    new-instance v13, LB/z;

    .line 81
    .line 82
    invoke-direct {v13, v10, v7}, LB/z;-><init>(LN/V;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v13}, LN/o;->U(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v2, v6}, LN/o;->p(Z)V

    .line 89
    .line 90
    .line 91
    check-cast v13, Ltf/l;

    .line 92
    .line 93
    invoke-virtual {v0, v13}, Lu0/n;->setConfigurationChangeObserver(Ltf/l;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v9}, LN/o;->M(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    const-string v13, "context"

    .line 104
    .line 105
    if-ne v12, v11, :cond_3

    .line 106
    .line 107
    new-instance v12, Lu0/D;

    .line 108
    .line 109
    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v12, v8}, Lu0/D;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v12}, LN/o;->U(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-virtual {v2, v6}, LN/o;->p(Z)V

    .line 119
    .line 120
    .line 121
    check-cast v12, Lu0/D;

    .line 122
    .line 123
    invoke-virtual {v0}, Lu0/n;->getViewTreeOwners()Lu0/j;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    if-eqz v14, :cond_f

    .line 128
    .line 129
    invoke-virtual {v2, v9}, LN/o;->M(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    move/from16 v16, v7

    .line 137
    .line 138
    iget-object v7, v14, Lu0/j;->b:Ln3/f;

    .line 139
    .line 140
    if-ne v15, v11, :cond_a

    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    if-eqz v15, :cond_9

    .line 147
    .line 148
    check-cast v15, Landroid/view/View;

    .line 149
    .line 150
    const/16 v17, 0x6

    .line 151
    .line 152
    const v4, 0x7f0a00b2

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    instance-of v9, v4, Ljava/lang/String;

    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    if-eqz v9, :cond_4

    .line 164
    .line 165
    check-cast v4, Ljava/lang/String;

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_4
    move-object/from16 v4, v18

    .line 169
    .line 170
    :goto_0
    if-nez v4, :cond_5

    .line 171
    .line 172
    invoke-virtual {v15}, Landroid/view/View;->getId()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    :cond_5
    const-string v9, "id"

    .line 181
    .line 182
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    new-instance v9, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const-class v15, LW/c;

    .line 191
    .line 192
    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const/16 v15, 0x3a

    .line 200
    .line 201
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-interface {v7}, Ln3/f;->getSavedStateRegistry()Ln3/d;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-virtual {v9, v4}, Ln3/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    if-eqz v15, :cond_7

    .line 220
    .line 221
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 222
    .line 223
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v15}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    move-object/from16 v21, v10

    .line 231
    .line 232
    const-string v10, "this.keySet()"

    .line 233
    .line 234
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    check-cast v5, Ljava/lang/Iterable;

    .line 238
    .line 239
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    if-eqz v10, :cond_8

    .line 248
    .line 249
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    check-cast v10, Ljava/lang/String;

    .line 254
    .line 255
    move-object/from16 v18, v5

    .line 256
    .line 257
    invoke-virtual {v15, v10}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    if-eqz v5, :cond_6

    .line 262
    .line 263
    move-object/from16 v22, v15

    .line 264
    .line 265
    const-string v15, "key"

    .line 266
    .line 267
    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v6, v10, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-object/from16 v5, v18

    .line 274
    .line 275
    move-object/from16 v15, v22

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 279
    .line 280
    const-string v1, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }"

    .line 281
    .line 282
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_7
    move-object/from16 v21, v10

    .line 287
    .line 288
    move-object/from16 v6, v18

    .line 289
    .line 290
    :cond_8
    sget-object v5, LW/f;->a:LN/L0;

    .line 291
    .line 292
    new-instance v5, LW/d;

    .line 293
    .line 294
    invoke-direct {v5, v6}, LW/d;-><init>(Ljava/util/LinkedHashMap;)V

    .line 295
    .line 296
    .line 297
    :try_start_0
    new-instance v6, Lj/g;

    .line 298
    .line 299
    const/4 v10, 0x2

    .line 300
    invoke-direct {v6, v5, v10}, Lj/g;-><init>(Ljava/lang/Object;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v9, v4, v6}, Ln3/d;->c(Ljava/lang/String;Ln3/c;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 304
    .line 305
    .line 306
    move/from16 v6, v16

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :catch_0
    const/4 v6, 0x0

    .line 310
    :goto_2
    new-instance v15, Lu0/O;

    .line 311
    .line 312
    new-instance v10, Lu0/P;

    .line 313
    .line 314
    invoke-direct {v10, v6, v9, v4}, Lu0/P;-><init>(ZLn3/d;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    invoke-direct {v15, v5, v10}, Lu0/O;-><init>(LW/d;Lu0/P;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v15}, LN/o;->U(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    const/4 v4, 0x0

    .line 324
    goto :goto_3

    .line 325
    :cond_9
    new-instance v0, Ljava/lang/NullPointerException;

    .line 326
    .line 327
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 328
    .line 329
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw v0

    .line 333
    :cond_a
    move-object/from16 v21, v10

    .line 334
    .line 335
    const/16 v17, 0x6

    .line 336
    .line 337
    move v4, v6

    .line 338
    :goto_3
    invoke-virtual {v2, v4}, LN/o;->p(Z)V

    .line 339
    .line 340
    .line 341
    check-cast v15, Lu0/O;

    .line 342
    .line 343
    sget-object v4, Lef/C;->a:Lef/C;

    .line 344
    .line 345
    new-instance v5, LB/F;

    .line 346
    .line 347
    const/16 v6, 0x13

    .line 348
    .line 349
    invoke-direct {v5, v15, v6}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 350
    .line 351
    .line 352
    invoke-static {v4, v5, v2}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-interface/range {v21 .. v21}, LN/K0;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    check-cast v4, Landroid/content/res/Configuration;

    .line 363
    .line 364
    const v5, -0x1cf65f46

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v5}, LN/o;->M(I)V

    .line 368
    .line 369
    .line 370
    const v5, -0x1d58f75c

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2, v5}, LN/o;->M(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    if-ne v5, v11, :cond_b

    .line 381
    .line 382
    new-instance v5, Lw0/c;

    .line 383
    .line 384
    invoke-direct {v5}, Lw0/c;-><init>()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :cond_b
    const/4 v6, 0x0

    .line 391
    invoke-virtual {v2, v6}, LN/o;->p(Z)V

    .line 392
    .line 393
    .line 394
    check-cast v5, Lw0/c;

    .line 395
    .line 396
    new-instance v6, Lkotlin/jvm/internal/G;

    .line 397
    .line 398
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 399
    .line 400
    .line 401
    const v9, -0x1d58f75c

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, v9}, LN/o;->M(I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    if-ne v10, v11, :cond_c

    .line 412
    .line 413
    invoke-virtual {v2, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    :goto_4
    const/4 v10, 0x0

    .line 417
    goto :goto_5

    .line 418
    :cond_c
    move-object v4, v10

    .line 419
    goto :goto_4

    .line 420
    :goto_5
    invoke-virtual {v2, v10}, LN/o;->p(Z)V

    .line 421
    .line 422
    .line 423
    iput-object v4, v6, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 424
    .line 425
    invoke-virtual {v2, v9}, LN/o;->M(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    if-ne v4, v11, :cond_d

    .line 433
    .line 434
    new-instance v4, Lu0/y;

    .line 435
    .line 436
    invoke-direct {v4, v6, v5}, Lu0/y;-><init>(Lkotlin/jvm/internal/G;Lw0/c;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    :cond_d
    invoke-virtual {v2, v10}, LN/o;->p(Z)V

    .line 443
    .line 444
    .line 445
    check-cast v4, Lu0/y;

    .line 446
    .line 447
    new-instance v6, LA/W;

    .line 448
    .line 449
    const/16 v9, 0x16

    .line 450
    .line 451
    invoke-direct {v6, v9, v8, v4}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    invoke-static {v5, v6, v2}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v10}, LN/o;->p(Z)V

    .line 458
    .line 459
    .line 460
    invoke-interface/range {v21 .. v21}, LN/K0;->getValue()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    check-cast v4, Landroid/content/res/Configuration;

    .line 465
    .line 466
    const-string v6, "configuration"

    .line 467
    .line 468
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LN/D;

    .line 472
    .line 473
    invoke-virtual {v6, v4}, LN/D;->a(Ljava/lang/Object;)LN/g0;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LN/L0;

    .line 478
    .line 479
    invoke-virtual {v6, v8}, LN/L0;->a(Ljava/lang/Object;)LN/g0;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    iget-object v8, v14, Lu0/j;->a:Landroidx/lifecycle/v;

    .line 484
    .line 485
    sget-object v9, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:LN/L0;

    .line 486
    .line 487
    invoke-virtual {v9, v8}, LN/L0;->a(Ljava/lang/Object;)LN/g0;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    sget-object v9, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:LN/L0;

    .line 492
    .line 493
    invoke-virtual {v9, v7}, LN/L0;->a(Ljava/lang/Object;)LN/g0;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    sget-object v9, LW/f;->a:LN/L0;

    .line 498
    .line 499
    invoke-virtual {v9, v15}, LN/L0;->a(Ljava/lang/Object;)LN/g0;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    invoke-virtual {v0}, Lu0/n;->getView()Landroid/view/View;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LN/L0;

    .line 508
    .line 509
    invoke-virtual {v11, v10}, LN/L0;->a(Ljava/lang/Object;)LN/g0;

    .line 510
    .line 511
    .line 512
    move-result-object v10

    .line 513
    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:LN/L0;

    .line 514
    .line 515
    invoke-virtual {v11, v5}, LN/L0;->a(Ljava/lang/Object;)LN/g0;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    const/4 v11, 0x7

    .line 520
    new-array v11, v11, [LN/g0;

    .line 521
    .line 522
    const/16 v19, 0x0

    .line 523
    .line 524
    aput-object v4, v11, v19

    .line 525
    .line 526
    aput-object v6, v11, v16

    .line 527
    .line 528
    const/16 v20, 0x2

    .line 529
    .line 530
    aput-object v8, v11, v20

    .line 531
    .line 532
    const/4 v4, 0x3

    .line 533
    aput-object v7, v11, v4

    .line 534
    .line 535
    const/4 v4, 0x4

    .line 536
    aput-object v9, v11, v4

    .line 537
    .line 538
    const/4 v4, 0x5

    .line 539
    aput-object v10, v11, v4

    .line 540
    .line 541
    aput-object v5, v11, v17

    .line 542
    .line 543
    new-instance v4, Lu0/x;

    .line 544
    .line 545
    invoke-direct {v4, v0, v12, v1, v3}, Lu0/x;-><init>(Lu0/n;Lu0/D;LV/d;I)V

    .line 546
    .line 547
    .line 548
    const v5, 0x57b729fc

    .line 549
    .line 550
    .line 551
    invoke-static {v2, v5, v4}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    const/16 v5, 0x38

    .line 556
    .line 557
    invoke-static {v11, v4, v2, v5}, LN/d;->a([LN/g0;LV/d;LN/o;I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2}, LN/o;->r()LN/i0;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    if-nez v2, :cond_e

    .line 565
    .line 566
    goto :goto_6

    .line 567
    :cond_e
    new-instance v4, LB/i;

    .line 568
    .line 569
    move/from16 v5, v17

    .line 570
    .line 571
    invoke-direct {v4, v0, v1, v3, v5}, LB/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 572
    .line 573
    .line 574
    iput-object v4, v2, LN/i0;->d:Ltf/p;

    .line 575
    .line 576
    :goto_6
    return-void

    .line 577
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 578
    .line 579
    const-string v1, "Called when the ViewTreeOwnersAvailability is not yet in Available state"

    .line 580
    .line 581
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    throw v0
.end method

.method public static final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CompositionLocal "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not present"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public static final getLocalLifecycleOwner()LN/f0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LN/f0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:LN/L0;

    .line 2
    .line 3
    return-object v0
.end method
