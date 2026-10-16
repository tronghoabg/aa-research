.class public final LA/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LA/a;->i:I

    iput-object p1, p0, LA/a;->j:Ljava/lang/Object;

    iput-object p2, p0, LA/a;->k:Ljava/lang/Object;

    iput-object p3, p0, LA/a;->l:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "$this$layout"

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    iget-object v4, p0, LA/a;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, LA/a;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, p0, LA/a;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iget v7, p0, LA/a;->i:I

    .line 14
    .line 15
    packed-switch v7, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Le0/B;

    .line 19
    .line 20
    const-string v0, "$this$graphicsLayer"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v6, LN/K0;

    .line 26
    .line 27
    invoke-interface {v6}, LN/K0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p1, Le0/B;->c:F

    .line 38
    .line 39
    check-cast v5, LA/O;

    .line 40
    .line 41
    iget-object v0, v5, LA/O;->h:LN/Y;

    .line 42
    .line 43
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p1, Le0/B;->a:F

    .line 54
    .line 55
    iget-object v0, v5, LA/O;->h:LN/Y;

    .line 56
    .line 57
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iput v0, p1, Le0/B;->b:F

    .line 68
    .line 69
    check-cast v4, LA/O;

    .line 70
    .line 71
    iget-object v0, v4, LA/O;->h:LN/Y;

    .line 72
    .line 73
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Le0/J;

    .line 78
    .line 79
    iget-wide v0, v0, Le0/J;->a:J

    .line 80
    .line 81
    iput-wide v0, p1, Le0/B;->h:J

    .line 82
    .line 83
    return-object v3

    .line 84
    :pswitch_0
    check-cast p1, LN/C;

    .line 85
    .line 86
    check-cast v6, Landroidx/activity/w;

    .line 87
    .line 88
    check-cast v5, Landroidx/lifecycle/v;

    .line 89
    .line 90
    check-cast v4, Le/b;

    .line 91
    .line 92
    invoke-virtual {v6, v5, v4}, Landroidx/activity/w;->a(Landroidx/lifecycle/v;Landroidx/activity/o;)V

    .line 93
    .line 94
    .line 95
    new-instance p1, LA/X;

    .line 96
    .line 97
    const/4 v0, 0x4

    .line 98
    invoke-direct {p1, v4, v0}, LA/X;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_1
    check-cast p1, LN/C;

    .line 103
    .line 104
    const-string v0, "$this$DisposableEffect"

    .line 105
    .line 106
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, LA0/p;

    .line 110
    .line 111
    check-cast v4, Lt0/M;

    .line 112
    .line 113
    const/16 v0, 0xa

    .line 114
    .line 115
    invoke-direct {p1, v4, v0}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    check-cast v6, LW/c;

    .line 119
    .line 120
    check-cast v5, Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v6, v5, p1}, LW/c;->a(Ljava/lang/String;Ltf/a;)LG9/e;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance v0, LA/X;

    .line 127
    .line 128
    invoke-direct {v0, p1, v2}, LA/X;-><init>(Ljava/lang/Object;I)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_2
    check-cast p1, Lt0/I;

    .line 133
    .line 134
    const-string v0, "owner"

    .line 135
    .line 136
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    instance-of v0, p1, Lu0/n;

    .line 140
    .line 141
    if-eqz v0, :cond_0

    .line 142
    .line 143
    check-cast p1, Lu0/n;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    const/4 p1, 0x0

    .line 147
    :goto_0
    check-cast v6, LM0/o;

    .line 148
    .line 149
    if-eqz p1, :cond_1

    .line 150
    .line 151
    check-cast v5, Lt0/t;

    .line 152
    .line 153
    invoke-virtual {p1}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Lu0/F;->getHolderToLayoutNode()Ljava/util/HashMap;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Lu0/F;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    sget-object v0, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 183
    .line 184
    invoke-virtual {v6, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 185
    .line 186
    .line 187
    new-instance v0, Lu0/l;

    .line 188
    .line 189
    invoke-direct {v0, v5, p1, p1}, Lu0/l;-><init>(Lt0/t;Lu0/n;Lu0/n;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v6, v0}, Lk1/S;->m(Landroid/view/View;Lk1/b;)V

    .line 193
    .line 194
    .line 195
    :cond_1
    check-cast v4, Lkotlin/jvm/internal/G;

    .line 196
    .line 197
    iget-object p1, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 198
    .line 199
    if-eqz p1, :cond_2

    .line 200
    .line 201
    check-cast p1, Landroid/view/View;

    .line 202
    .line 203
    invoke-virtual {v6, p1}, LM0/i;->setView$ui_release(Landroid/view/View;)V

    .line 204
    .line 205
    .line 206
    :cond_2
    return-object v3

    .line 207
    :pswitch_3
    check-cast p1, Lr0/s;

    .line 208
    .line 209
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    check-cast v4, LE/G;

    .line 213
    .line 214
    iget-object p1, v4, LE/G;->b:LE/F;

    .line 215
    .line 216
    check-cast v5, Lt0/r;

    .line 217
    .line 218
    iget-object v1, v5, Lt0/r;->a:Lt0/t;

    .line 219
    .line 220
    iget-object v1, v1, Lt0/t;->p:LL0/i;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    const-string v2, "layoutDirection"

    .line 226
    .line 227
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    sget-object v2, LL0/i;->a:LL0/i;

    .line 231
    .line 232
    if-ne v1, v2, :cond_3

    .line 233
    .line 234
    iget p1, p1, LE/F;->a:F

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_3
    iget p1, p1, LE/F;->c:F

    .line 238
    .line 239
    :goto_1
    invoke-static {v5, p1}, LA7/p0;->a(LL0/b;F)I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    iget-object v1, v4, LE/G;->b:LE/F;

    .line 244
    .line 245
    iget v1, v1, LE/F;->b:F

    .line 246
    .line 247
    invoke-static {v5, v1}, LA7/p0;->a(LL0/b;F)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    check-cast v6, Lr0/t;

    .line 252
    .line 253
    invoke-static {v6, p1, v1, v0}, Lr0/s;->a(Lr0/t;IIF)V

    .line 254
    .line 255
    .line 256
    return-object v3

    .line 257
    :pswitch_4
    check-cast p1, Lr0/s;

    .line 258
    .line 259
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    check-cast v6, LE/E;

    .line 263
    .line 264
    iget-boolean v1, v6, LE/E;->f:Z

    .line 265
    .line 266
    check-cast v5, Lr0/t;

    .line 267
    .line 268
    iget v2, v6, LE/E;->c:F

    .line 269
    .line 270
    iget v6, v6, LE/E;->b:F

    .line 271
    .line 272
    check-cast v4, Lt0/r;

    .line 273
    .line 274
    if-eqz v1, :cond_4

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v4, v6}, LA7/p0;->a(LL0/b;F)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-static {v4, v2}, LA7/p0;->a(LL0/b;F)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-static {p1, v5, v0, v1}, Lr0/s;->c(Lr0/s;Lr0/t;II)V

    .line 288
    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-static {v4, v6}, LA7/p0;->a(LL0/b;F)I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    invoke-static {v4, v2}, LA7/p0;->a(LL0/b;F)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-static {v5, p1, v1, v0}, Lr0/s;->a(Lr0/t;IIF)V

    .line 303
    .line 304
    .line 305
    :goto_2
    return-object v3

    .line 306
    :pswitch_5
    check-cast p1, Lr0/s;

    .line 307
    .line 308
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    check-cast v6, LE/D;

    .line 312
    .line 313
    iget-boolean v1, v6, LE/D;->d:Z

    .line 314
    .line 315
    check-cast v5, Lr0/t;

    .line 316
    .line 317
    iget v2, v6, LE/D;->c:F

    .line 318
    .line 319
    iget v6, v6, LE/D;->b:F

    .line 320
    .line 321
    check-cast v4, Lt0/r;

    .line 322
    .line 323
    if-eqz v1, :cond_5

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-static {v4, v6}, LA7/p0;->a(LL0/b;F)I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    invoke-static {v4, v2}, LA7/p0;->a(LL0/b;F)I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    invoke-static {p1, v5, v0, v1}, Lr0/s;->c(Lr0/s;Lr0/t;II)V

    .line 337
    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-static {v4, v6}, LA7/p0;->a(LL0/b;F)I

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    invoke-static {v4, v2}, LA7/p0;->a(LL0/b;F)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-static {v5, p1, v1, v0}, Lr0/s;->a(Lr0/t;IIF)V

    .line 352
    .line 353
    .line 354
    :goto_3
    return-object v3

    .line 355
    :pswitch_6
    check-cast p1, LA/h;

    .line 356
    .line 357
    const-string v0, "$this$animate"

    .line 358
    .line 359
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    check-cast v6, LA/e;

    .line 363
    .line 364
    iget-object v0, v6, LA/e;->c:LA/j;

    .line 365
    .line 366
    invoke-static {p1, v0}, LA/t;->k(LA/h;LA/j;)V

    .line 367
    .line 368
    .line 369
    iget-object v0, p1, LA/h;->d:LN/Y;

    .line 370
    .line 371
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-static {v6, v1}, LA/e;->a(LA/e;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-nez v0, :cond_6

    .line 388
    .line 389
    iget-object v0, v6, LA/e;->c:LA/j;

    .line 390
    .line 391
    iget-object v0, v0, LA/j;->f:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, LN/Y;

    .line 394
    .line 395
    invoke-virtual {v0, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    check-cast v5, LA/j;

    .line 399
    .line 400
    iget-object v0, v5, LA/j;->f:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, LN/Y;

    .line 403
    .line 404
    invoke-virtual {v0, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 408
    .line 409
    iget-object v1, p1, LA/h;->h:LN/Y;

    .line 410
    .line 411
    invoke-virtual {v1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    iget-object p1, p1, LA/h;->c:Lkotlin/jvm/internal/n;

    .line 415
    .line 416
    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    check-cast v4, Lkotlin/jvm/internal/C;

    .line 420
    .line 421
    iput-boolean v2, v4, Lkotlin/jvm/internal/C;->a:Z

    .line 422
    .line 423
    :cond_6
    return-object v3

    .line 424
    nop

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
