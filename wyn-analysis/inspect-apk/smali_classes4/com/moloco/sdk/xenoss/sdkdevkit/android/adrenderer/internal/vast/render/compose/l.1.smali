.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

.field public final synthetic c:LN/V;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;LN/V;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->c:LN/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/p;

    .line 11
    .line 12
    const-string v2, "it"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 18
    .line 19
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/l;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    move-object v4, v1

    .line 24
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/l;

    .line 25
    .line 26
    iget-wide v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/l;->a:J

    .line 27
    .line 28
    long-to-int v4, v4

    .line 29
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    new-instance v6, Lef/k;

    .line 38
    .line 39
    invoke-direct {v6, v5, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    instance-of v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;

    .line 44
    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    move-object v4, v1

    .line 48
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;

    .line 49
    .line 50
    iget-wide v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;->a:J

    .line 51
    .line 52
    long-to-int v5, v5

    .line 53
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-wide v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;->b:J

    .line 58
    .line 59
    long-to-int v4, v6

    .line 60
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-instance v6, Lef/k;

    .line 65
    .line 66
    invoke-direct {v6, v5, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    instance-of v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;

    .line 71
    .line 72
    if-eqz v4, :cond_1e

    .line 73
    .line 74
    iget v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->A:I

    .line 75
    .line 76
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    move-object v5, v1

    .line 81
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;

    .line 82
    .line 83
    iget-wide v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;->a:J

    .line 84
    .line 85
    long-to-int v5, v5

    .line 86
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    new-instance v6, Lef/k;

    .line 91
    .line 92
    invoke-direct {v6, v4, v5}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    iget-object v4, v6, Lef/k;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    iget-object v5, v6, Lef/k;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    iput v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->A:I

    .line 112
    .line 113
    iget-boolean v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->z:Z

    .line 114
    .line 115
    const/16 v7, 0x64

    .line 116
    .line 117
    const/4 v8, 0x0

    .line 118
    if-nez v6, :cond_7

    .line 119
    .line 120
    instance-of v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;

    .line 121
    .line 122
    if-nez v6, :cond_7

    .line 123
    .line 124
    int-to-double v9, v4

    .line 125
    int-to-double v11, v5

    .line 126
    div-double/2addr v9, v11

    .line 127
    int-to-double v11, v7

    .line 128
    mul-double/2addr v9, v11

    .line 129
    iget-object v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;

    .line 130
    .line 131
    iget-object v11, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->n:Ljava/util/ArrayList;

    .line 132
    .line 133
    iget v12, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->o:I

    .line 134
    .line 135
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    invoke-virtual {v11, v12, v13}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    new-instance v12, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_2

    .line 157
    .line 158
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    move-object v14, v13

    .line 163
    check-cast v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;

    .line 164
    .line 165
    iget v14, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;->b:I

    .line 166
    .line 167
    int-to-double v14, v14

    .line 168
    cmpg-double v14, v14, v9

    .line 169
    .line 170
    if-gtz v14, :cond_2

    .line 171
    .line 172
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    new-instance v9, Ljava/util/ArrayList;

    .line 177
    .line 178
    const/16 v10, 0xa

    .line 179
    .line 180
    invoke-static {v12, v10}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-eqz v13, :cond_3

    .line 196
    .line 197
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;

    .line 202
    .line 203
    iget-object v13, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;->a:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    iget-object v13, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 214
    .line 215
    iget-object v14, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->h:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v13, v9, v8, v11, v14}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;->a(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget v9, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->o:I

    .line 221
    .line 222
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    add-int/2addr v11, v9

    .line 227
    iput v11, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->o:I

    .line 228
    .line 229
    iget-object v9, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->l:Ljava/util/ArrayList;

    .line 230
    .line 231
    iget v11, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->m:I

    .line 232
    .line 233
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    invoke-virtual {v9, v11, v12}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    new-instance v11, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    if-eqz v12, :cond_5

    .line 255
    .line 256
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    move-object v15, v12

    .line 261
    check-cast v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;

    .line 262
    .line 263
    iget-wide v7, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;->b:J

    .line 264
    .line 265
    move-object/from16 v16, v11

    .line 266
    .line 267
    int-to-long v10, v4

    .line 268
    cmp-long v7, v7, v10

    .line 269
    .line 270
    if-gtz v7, :cond_4

    .line 271
    .line 272
    move-object/from16 v7, v16

    .line 273
    .line 274
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-object v11, v7

    .line 278
    const/16 v7, 0x64

    .line 279
    .line 280
    const/4 v8, 0x0

    .line 281
    const/16 v10, 0xa

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_4
    move-object/from16 v7, v16

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_5
    move-object v7, v11

    .line 288
    :goto_4
    new-instance v8, Ljava/util/ArrayList;

    .line 289
    .line 290
    const/16 v15, 0xa

    .line 291
    .line 292
    invoke-static {v7, v15}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    if-eqz v10, :cond_6

    .line 308
    .line 309
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v10

    .line 313
    check-cast v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;

    .line 314
    .line 315
    iget-object v10, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;->a:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    const/4 v10, 0x0

    .line 326
    invoke-virtual {v13, v8, v10, v9, v14}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;->a(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    iget v8, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->m:I

    .line 330
    .line 331
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    add-int/2addr v7, v8

    .line 336
    iput v7, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->m:I

    .line 337
    .line 338
    :cond_7
    iget-object v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    if-eqz v3, :cond_a

    .line 342
    .line 343
    iput v5, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->n:I

    .line 344
    .line 345
    iget-object v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->m:LHf/x0;

    .line 346
    .line 347
    invoke-virtual {v3}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    check-cast v8, Ljava/lang/Boolean;

    .line 352
    .line 353
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 354
    .line 355
    .line 356
    move-result v8

    .line 357
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 358
    .line 359
    const/4 v10, 0x0

    .line 360
    invoke-virtual {v3, v10, v9}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    iget-boolean v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->z:Z

    .line 364
    .line 365
    if-nez v3, :cond_9

    .line 366
    .line 367
    if-nez v8, :cond_9

    .line 368
    .line 369
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/b;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/b;

    .line 370
    .line 371
    invoke-virtual {v2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/d;)V

    .line 372
    .line 373
    .line 374
    iget-object v3, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->e:Ljava/lang/String;

    .line 375
    .line 376
    if-eqz v3, :cond_8

    .line 377
    .line 378
    iget-object v8, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 379
    .line 380
    invoke-interface {v8, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->f(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    :cond_8
    iget-boolean v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->c:Z

    .line 384
    .line 385
    if-eqz v3, :cond_9

    .line 386
    .line 387
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 388
    .line 389
    invoke-virtual {v2, v7, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->b(ZLcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 390
    .line 391
    .line 392
    :cond_9
    iput-boolean v7, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->z:Z

    .line 393
    .line 394
    :cond_a
    int-to-double v8, v4

    .line 395
    int-to-double v10, v5

    .line 396
    div-double/2addr v8, v10

    .line 397
    const/16 v3, 0x64

    .line 398
    .line 399
    int-to-double v10, v3

    .line 400
    mul-double/2addr v8, v10

    .line 401
    iget-object v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->y:LR1/q;

    .line 402
    .line 403
    iget-object v10, v3, LR1/q;->f:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v10, LHf/x0;

    .line 406
    .line 407
    const/4 v11, 0x1

    .line 408
    if-lt v4, v5, :cond_b

    .line 409
    .line 410
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/c;

    .line 411
    .line 412
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    const/4 v12, 0x0

    .line 416
    invoke-virtual {v10, v12, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto/16 :goto_8

    .line 420
    .line 421
    :cond_b
    const/4 v12, 0x0

    .line 422
    iget-object v13, v3, LR1/q;->b:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;

    .line 425
    .line 426
    if-nez v13, :cond_c

    .line 427
    .line 428
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/e;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/e;

    .line 429
    .line 430
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v10, v12, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    goto/16 :goto_8

    .line 437
    .line 438
    :cond_c
    iget-object v10, v3, LR1/q;->e:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v10, LEf/H0;

    .line 441
    .line 442
    if-nez v10, :cond_15

    .line 443
    .line 444
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 445
    .line 446
    const/16 v21, 0xc

    .line 447
    .line 448
    const/16 v22, 0x0

    .line 449
    .line 450
    const-string v17, "LinearGoNextActionImpl"

    .line 451
    .line 452
    const-string v18, "Starting timer"

    .line 453
    .line 454
    const/16 v19, 0x0

    .line 455
    .line 456
    const/16 v20, 0x0

    .line 457
    .line 458
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    instance-of v10, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/w;

    .line 462
    .line 463
    if-eqz v10, :cond_13

    .line 464
    .line 465
    const/16 v21, 0xc

    .line 466
    .line 467
    const/16 v22, 0x0

    .line 468
    .line 469
    const-string v17, "LinearGoNextActionImpl"

    .line 470
    .line 471
    const-string v18, "Offset Percents detected"

    .line 472
    .line 473
    const/16 v19, 0x0

    .line 474
    .line 475
    const/16 v20, 0x0

    .line 476
    .line 477
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    new-instance v10, Lzf/g;

    .line 481
    .line 482
    double-to-int v8, v8

    .line 483
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/w;

    .line 484
    .line 485
    iget v9, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/w;->a:I

    .line 486
    .line 487
    invoke-direct {v10, v8, v9, v11}, Lzf/e;-><init>(III)V

    .line 488
    .line 489
    .line 490
    iget v9, v10, Lzf/e;->b:I

    .line 491
    .line 492
    sub-int/2addr v9, v8

    .line 493
    if-gez v9, :cond_d

    .line 494
    .line 495
    move v9, v7

    .line 496
    :cond_d
    mul-int/2addr v9, v5

    .line 497
    int-to-double v8, v9

    .line 498
    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    .line 499
    .line 500
    div-double/2addr v8, v12

    .line 501
    const/16 v10, 0x3e8

    .line 502
    .line 503
    int-to-double v12, v10

    .line 504
    div-double/2addr v8, v12

    .line 505
    const-wide/16 v12, 0x0

    .line 506
    .line 507
    cmpg-double v10, v8, v12

    .line 508
    .line 509
    if-gez v10, :cond_e

    .line 510
    .line 511
    move-wide v8, v12

    .line 512
    :cond_e
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    .line 513
    .line 514
    .line 515
    move-result v10

    .line 516
    if-eqz v10, :cond_f

    .line 517
    .line 518
    goto :goto_6

    .line 519
    :cond_f
    cmpg-double v10, v8, v12

    .line 520
    .line 521
    if-gtz v10, :cond_10

    .line 522
    .line 523
    :goto_6
    move v8, v7

    .line 524
    goto :goto_7

    .line 525
    :cond_10
    const-wide v12, 0x41efffffffe00000L    # 4.294967295E9

    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    cmpl-double v10, v8, v12

    .line 531
    .line 532
    if-ltz v10, :cond_11

    .line 533
    .line 534
    const/4 v8, -0x1

    .line 535
    goto :goto_7

    .line 536
    :cond_11
    const-wide v12, 0x41dfffffffc00000L    # 2.147483647E9

    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    cmpg-double v10, v8, v12

    .line 542
    .line 543
    if-gtz v10, :cond_12

    .line 544
    .line 545
    double-to-int v8, v8

    .line 546
    goto :goto_7

    .line 547
    :cond_12
    const v10, 0x7fffffff

    .line 548
    .line 549
    .line 550
    int-to-double v12, v10

    .line 551
    sub-double/2addr v8, v12

    .line 552
    double-to-int v8, v8

    .line 553
    add-int/2addr v8, v10

    .line 554
    :goto_7
    int-to-long v8, v8

    .line 555
    const-wide v12, 0xffffffffL

    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    and-long/2addr v8, v12

    .line 561
    invoke-virtual {v3, v8, v9}, LR1/q;->l(J)V

    .line 562
    .line 563
    .line 564
    goto :goto_8

    .line 565
    :cond_13
    instance-of v8, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;

    .line 566
    .line 567
    if-eqz v8, :cond_14

    .line 568
    .line 569
    const/16 v21, 0xc

    .line 570
    .line 571
    const/16 v22, 0x0

    .line 572
    .line 573
    const-string v17, "LinearGoNextActionImpl"

    .line 574
    .line 575
    const-string v18, "Offset Millis detected"

    .line 576
    .line 577
    const/16 v19, 0x0

    .line 578
    .line 579
    const/16 v20, 0x0

    .line 580
    .line 581
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;

    .line 585
    .line 586
    const-wide/16 v8, 0x3e8

    .line 587
    .line 588
    iget-wide v12, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;->a:J

    .line 589
    .line 590
    div-long/2addr v12, v8

    .line 591
    invoke-virtual {v3, v12, v13}, LR1/q;->l(J)V

    .line 592
    .line 593
    .line 594
    goto :goto_8

    .line 595
    :cond_14
    new-instance v1, LE5/Q;

    .line 596
    .line 597
    const/16 v2, 0x9

    .line 598
    .line 599
    const/4 v3, 0x0

    .line 600
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 601
    .line 602
    .line 603
    throw v1

    .line 604
    :cond_15
    :goto_8
    iget-object v3, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;

    .line 605
    .line 606
    if-nez v3, :cond_16

    .line 607
    .line 608
    goto/16 :goto_c

    .line 609
    .line 610
    :cond_16
    iget-object v6, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;

    .line 611
    .line 612
    instance-of v8, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/w;

    .line 613
    .line 614
    if-eqz v8, :cond_17

    .line 615
    .line 616
    div-int/lit8 v8, v5, 0x64

    .line 617
    .line 618
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/w;

    .line 619
    .line 620
    iget v6, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/w;->a:I

    .line 621
    .line 622
    mul-int/2addr v8, v6

    .line 623
    goto :goto_9

    .line 624
    :cond_17
    instance-of v8, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;

    .line 625
    .line 626
    if-eqz v8, :cond_18

    .line 627
    .line 628
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;

    .line 629
    .line 630
    iget-wide v8, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/x;->a:J

    .line 631
    .line 632
    long-to-int v8, v8

    .line 633
    goto :goto_9

    .line 634
    :cond_18
    move v8, v7

    .line 635
    :goto_9
    new-instance v6, Lzf/g;

    .line 636
    .line 637
    invoke-direct {v6, v7, v5, v11}, Lzf/e;-><init>(III)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v6}, Lzf/g;->isEmpty()Z

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    if-nez v5, :cond_1d

    .line 645
    .line 646
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 647
    .line 648
    .line 649
    move-result-object v5

    .line 650
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    if-ge v8, v5, :cond_19

    .line 655
    .line 656
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 661
    .line 662
    .line 663
    move-result v8

    .line 664
    goto :goto_a

    .line 665
    :cond_19
    iget v5, v6, Lzf/e;->b:I

    .line 666
    .line 667
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 668
    .line 669
    .line 670
    move-result-object v6

    .line 671
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 672
    .line 673
    .line 674
    move-result v6

    .line 675
    if-le v8, v6, :cond_1a

    .line 676
    .line 677
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 682
    .line 683
    .line 684
    move-result v8

    .line 685
    :cond_1a
    :goto_a
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->g:Ljava/lang/Long;

    .line 686
    .line 687
    if-nez v3, :cond_1b

    .line 688
    .line 689
    if-lt v4, v8, :cond_1c

    .line 690
    .line 691
    goto :goto_b

    .line 692
    :cond_1b
    int-to-long v5, v8

    .line 693
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 694
    .line 695
    .line 696
    move-result-wide v8

    .line 697
    add-long/2addr v8, v5

    .line 698
    int-to-long v3, v4

    .line 699
    cmp-long v5, v5, v3

    .line 700
    .line 701
    if-gtz v5, :cond_1c

    .line 702
    .line 703
    cmp-long v3, v3, v8

    .line 704
    .line 705
    if-gtz v3, :cond_1c

    .line 706
    .line 707
    :goto_b
    move v7, v11

    .line 708
    :cond_1c
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->t:LHf/x0;

    .line 713
    .line 714
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    const/4 v10, 0x0

    .line 718
    invoke-virtual {v2, v10, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    goto :goto_c

    .line 722
    :cond_1d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 723
    .line 724
    new-instance v2, Ljava/lang/StringBuilder;

    .line 725
    .line 726
    const-string v3, "Cannot coerce value to an empty range: "

    .line 727
    .line 728
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    const/16 v3, 0x2e

    .line 735
    .line 736
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    throw v1

    .line 747
    :cond_1e
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;

    .line 748
    .line 749
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    if-eqz v2, :cond_1f

    .line 754
    .line 755
    :goto_c
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->c:LN/V;

    .line 756
    .line 757
    invoke-interface {v2, v1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    sget-object v1, Lef/C;->a:Lef/C;

    .line 761
    .line 762
    return-object v1

    .line 763
    :cond_1f
    new-instance v1, LE5/Q;

    .line 764
    .line 765
    const/16 v2, 0x9

    .line 766
    .line 767
    const/4 v3, 0x0

    .line 768
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 769
    .line 770
    .line 771
    throw v1

    .line 772
    :pswitch_0
    move-object/from16 v1, p1

    .line 773
    .line 774
    check-cast v1, Ljava/lang/Boolean;

    .line 775
    .line 776
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 780
    .line 781
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->v:LHf/x0;

    .line 782
    .line 783
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    const/4 v3, 0x0

    .line 787
    invoke-virtual {v2, v3, v1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/l;->c:LN/V;

    .line 791
    .line 792
    invoke-interface {v2, v1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    sget-object v1, Lef/C;->a:Lef/C;

    .line 796
    .line 797
    return-object v1

    .line 798
    nop

    .line 799
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
