.class public final LWa/f;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Landroid/content/Intent;

.field public final synthetic b:LWa/b;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Intent;LWa/b;Landroid/app/Activity;IZLjava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LWa/f;->a:Landroid/content/Intent;

    .line 2
    .line 3
    iput-object p2, p0, LWa/f;->b:LWa/b;

    .line 4
    .line 5
    iput-object p3, p0, LWa/f;->c:Landroid/app/Activity;

    .line 6
    .line 7
    iput p4, p0, LWa/f;->d:I

    .line 8
    .line 9
    iput-boolean p5, p0, LWa/f;->e:Z

    .line 10
    .line 11
    iput-object p6, p0, LWa/f;->f:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Llf/j;-><init>(ILjf/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 8

    .line 1
    new-instance v0, LWa/f;

    .line 2
    .line 3
    iget-boolean v5, p0, LWa/f;->e:Z

    .line 4
    .line 5
    iget-object v6, p0, LWa/f;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, LWa/f;->a:Landroid/content/Intent;

    .line 8
    .line 9
    iget-object v2, p0, LWa/f;->b:LWa/b;

    .line 10
    .line 11
    iget-object v3, p0, LWa/f;->c:Landroid/app/Activity;

    .line 12
    .line 13
    iget v4, p0, LWa/f;->d:I

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, LWa/f;-><init>(Landroid/content/Intent;LWa/b;Landroid/app/Activity;IZLjava/lang/String;Ljf/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LWa/f;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LWa/f;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LWa/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 5
    .line 6
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    const-string v3, "Unknown activity error, please fill an issue."

    .line 12
    .line 13
    const-string v4, "unknown_activity"

    .line 14
    .line 15
    iget-object v5, v0, LWa/f;->b:LWa/b;

    .line 16
    .line 17
    iget-object v6, v0, LWa/f;->a:Landroid/content/Intent;

    .line 18
    .line 19
    if-nez v6, :cond_0

    .line 20
    .line 21
    invoke-virtual {v5, v4, v3}, LWa/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    const/4 v9, 0x0

    .line 35
    iget v10, v0, LWa/f;->d:I

    .line 36
    .line 37
    iget-boolean v11, v0, LWa/f;->e:Z

    .line 38
    .line 39
    iget-object v12, v0, LWa/f;->c:Landroid/app/Activity;

    .line 40
    .line 41
    if-eqz v8, :cond_2

    .line 42
    .line 43
    invoke-virtual {v6}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/content/ClipData;->getItemCount()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    :goto_0
    if-ge v9, v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {v6}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v9}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v12, v4, v10}, LWa/g;->b(Landroid/app/Activity;Landroid/net/Uri;I)Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v12, v4, v11, v7}, LWa/g;->a(Landroid/app/Activity;Landroid/net/Uri;ZLjava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    add-int/2addr v9, v1

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-virtual {v5, v7}, LWa/b;->c(Ljava/io/Serializable;)V

    .line 84
    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_2
    invoke-virtual {v6}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    if-eqz v8, :cond_1a

    .line 92
    .line 93
    invoke-virtual {v6}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v12, v3, v10}, LWa/g;->b(Landroid/app/Activity;Landroid/net/Uri;I)Landroid/net/Uri;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    iget-object v4, v0, LWa/f;->f:Ljava/lang/String;

    .line 105
    .line 106
    const-string v6, "dir"

    .line 107
    .line 108
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    const-string v6, "unknown_path"

    .line 113
    .line 114
    if-eqz v4, :cond_18

    .line 115
    .line 116
    invoke-static {v3}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v3, v4}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-string v4, "buildDocumentUriUsingTree(...)"

    .line 125
    .line 126
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string v4, "con"

    .line 130
    .line 131
    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 135
    .line 136
    sget-object v8, Lff/v;->a:Lff/v;

    .line 137
    .line 138
    const/16 v7, 0xa

    .line 139
    .line 140
    const-string v10, "compile(...)"

    .line 141
    .line 142
    const/16 v11, 0x1e

    .line 143
    .line 144
    const/16 v13, 0x2f

    .line 145
    .line 146
    const-string v14, ":"

    .line 147
    .line 148
    if-ge v4, v11, :cond_a

    .line 149
    .line 150
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    const-string v11, "com.android.providers.downloads.documents"

    .line 155
    .line 156
    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_a

    .line 161
    .line 162
    invoke-static {v3}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    sget-object v11, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v11}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    invoke-virtual {v11}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    const-string v15, "downloads"

    .line 177
    .line 178
    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    if-eqz v15, :cond_3

    .line 183
    .line 184
    goto/16 :goto_7

    .line 185
    .line 186
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    const-string v15, "^ms[df]:.*"

    .line 190
    .line 191
    invoke-static {v15}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v15, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    invoke-virtual {v15}, Ljava/util/regex/Matcher;->matches()Z

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    if-eqz v15, :cond_4

    .line 207
    .line 208
    invoke-static {v12, v3}, LWa/g;->f(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    new-instance v3, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    goto/16 :goto_7

    .line 231
    .line 232
    :cond_4
    const-string v3, "raw:"

    .line 233
    .line 234
    invoke-static {v4, v3, v9}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_9

    .line 239
    .line 240
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-nez v10, :cond_5

    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    goto :goto_1

    .line 266
    :cond_5
    new-instance v10, Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .line 270
    .line 271
    move v7, v9

    .line 272
    :cond_6
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    invoke-virtual {v4, v7, v11}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->end()I

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    if-nez v11, :cond_6

    .line 296
    .line 297
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-virtual {v4, v7, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-object v3, v10

    .line 313
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-nez v4, :cond_8

    .line 318
    .line 319
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    invoke-interface {v3, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    :goto_2
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-eqz v7, :cond_8

    .line 332
    .line 333
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    check-cast v7, Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-nez v7, :cond_7

    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_7
    check-cast v3, Ljava/lang/Iterable;

    .line 347
    .line 348
    invoke-interface {v4}, Ljava/util/ListIterator;->nextIndex()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    add-int/2addr v4, v1

    .line 353
    invoke-static {v3, v4}, Lff/o;->N0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    :cond_8
    check-cast v8, Ljava/util/Collection;

    .line 358
    .line 359
    new-array v3, v9, [Ljava/lang/String;

    .line 360
    .line 361
    invoke-interface {v8, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    check-cast v3, [Ljava/lang/String;

    .line 366
    .line 367
    aget-object v11, v3, v1

    .line 368
    .line 369
    goto/16 :goto_7

    .line 370
    .line 371
    :cond_9
    const/4 v11, 0x0

    .line 372
    goto/16 :goto_7

    .line 373
    .line 374
    :cond_a
    invoke-static {v3}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    filled-new-array {v14}, [Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v11

    .line 385
    invoke-static {v4, v11}, LBf/k;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    if-le v11, v1, :cond_c

    .line 394
    .line 395
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v11

    .line 399
    check-cast v11, Ljava/lang/String;

    .line 400
    .line 401
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    check-cast v4, Ljava/lang/String;

    .line 406
    .line 407
    const-string v12, "primary"

    .line 408
    .line 409
    invoke-virtual {v12, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 410
    .line 411
    .line 412
    move-result v12

    .line 413
    if-eqz v12, :cond_b

    .line 414
    .line 415
    new-instance v11, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 418
    .line 419
    .line 420
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 421
    .line 422
    .line 423
    move-result-object v12

    .line 424
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    goto :goto_3

    .line 438
    :cond_b
    new-instance v12, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    const-string v15, "/storage/"

    .line 441
    .line 442
    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    goto :goto_3

    .line 459
    :cond_c
    new-instance v11, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 465
    .line 466
    .line 467
    move-result-object v12

    .line 468
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-static {v4}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    check-cast v4, Ljava/lang/String;

    .line 479
    .line 480
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    :goto_3
    sget-object v11, Ljava/io/File;->separator:Ljava/lang/String;

    .line 488
    .line 489
    const-string v13, "separator"

    .line 490
    .line 491
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v4, v11, v9}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 495
    .line 496
    .line 497
    move-result v11

    .line 498
    const-string v15, "substring(...)"

    .line 499
    .line 500
    if-eqz v11, :cond_d

    .line 501
    .line 502
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 503
    .line 504
    .line 505
    move-result v11

    .line 506
    sub-int/2addr v11, v1

    .line 507
    invoke-virtual {v4, v9, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    :cond_d
    invoke-static {v3}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 522
    .line 523
    .line 524
    move-result-object v11

    .line 525
    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v11, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 529
    .line 530
    .line 531
    move-result-object v10

    .line 532
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    .line 533
    .line 534
    .line 535
    move-result v11

    .line 536
    if-nez v11, :cond_e

    .line 537
    .line 538
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    goto :goto_4

    .line 547
    :cond_e
    new-instance v14, Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-direct {v14, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 550
    .line 551
    .line 552
    move v7, v9

    .line 553
    :cond_f
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->start()I

    .line 554
    .line 555
    .line 556
    move-result v11

    .line 557
    invoke-virtual {v3, v7, v11}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 558
    .line 559
    .line 560
    move-result-object v7

    .line 561
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v7

    .line 565
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->end()I

    .line 569
    .line 570
    .line 571
    move-result v7

    .line 572
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    .line 573
    .line 574
    .line 575
    move-result v11

    .line 576
    if-nez v11, :cond_f

    .line 577
    .line 578
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 579
    .line 580
    .line 581
    move-result v10

    .line 582
    invoke-virtual {v3, v7, v10}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-object v3, v14

    .line 594
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    if-nez v7, :cond_11

    .line 599
    .line 600
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 601
    .line 602
    .line 603
    move-result v7

    .line 604
    invoke-interface {v3, v7}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    :goto_5
    invoke-interface {v7}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 609
    .line 610
    .line 611
    move-result v10

    .line 612
    if-eqz v10, :cond_11

    .line 613
    .line 614
    invoke-interface {v7}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    check-cast v10, Ljava/lang/String;

    .line 619
    .line 620
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 621
    .line 622
    .line 623
    move-result v10

    .line 624
    if-nez v10, :cond_10

    .line 625
    .line 626
    goto :goto_5

    .line 627
    :cond_10
    check-cast v3, Ljava/lang/Iterable;

    .line 628
    .line 629
    invoke-interface {v7}, Ljava/util/ListIterator;->nextIndex()I

    .line 630
    .line 631
    .line 632
    move-result v7

    .line 633
    add-int/2addr v7, v1

    .line 634
    invoke-static {v3, v7}, Lff/o;->N0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v8

    .line 638
    :cond_11
    check-cast v8, Ljava/util/Collection;

    .line 639
    .line 640
    new-array v3, v9, [Ljava/lang/String;

    .line 641
    .line 642
    invoke-interface {v8, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    check-cast v3, [Ljava/lang/String;

    .line 647
    .line 648
    array-length v7, v3

    .line 649
    const/4 v8, 0x2

    .line 650
    if-lt v7, v8, :cond_12

    .line 651
    .line 652
    aget-object v3, v3, v1

    .line 653
    .line 654
    goto :goto_6

    .line 655
    :cond_12
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 656
    .line 657
    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    :goto_6
    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    invoke-static {v3, v7, v9}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 666
    .line 667
    .line 668
    move-result v8

    .line 669
    if-eqz v8, :cond_13

    .line 670
    .line 671
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 672
    .line 673
    .line 674
    move-result v8

    .line 675
    sub-int/2addr v8, v1

    .line 676
    invoke-virtual {v3, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    :cond_13
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    if-lez v1, :cond_14

    .line 688
    .line 689
    invoke-static {v4, v3, v9}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    if-eqz v1, :cond_15

    .line 694
    .line 695
    :cond_14
    move-object v11, v4

    .line 696
    goto :goto_7

    .line 697
    :cond_15
    invoke-static {v3, v7, v9}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-eqz v1, :cond_16

    .line 702
    .line 703
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v11

    .line 707
    goto :goto_7

    .line 708
    :cond_16
    invoke-static {v4, v7, v3}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v11

    .line 712
    :goto_7
    if-eqz v11, :cond_17

    .line 713
    .line 714
    invoke-virtual {v5, v11}, LWa/b;->c(Ljava/io/Serializable;)V

    .line 715
    .line 716
    .line 717
    return-object v2

    .line 718
    :cond_17
    const-string v1, "Failed to retrieve directory path."

    .line 719
    .line 720
    invoke-virtual {v5, v6, v1}, LWa/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    return-object v2

    .line 724
    :cond_18
    invoke-static {v12, v3, v11, v7}, LWa/g;->a(Landroid/app/Activity;Landroid/net/Uri;ZLjava/util/ArrayList;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    if-nez v1, :cond_19

    .line 732
    .line 733
    invoke-virtual {v5, v7}, LWa/b;->c(Ljava/io/Serializable;)V

    .line 734
    .line 735
    .line 736
    return-object v2

    .line 737
    :cond_19
    const-string v1, "Failed to retrieve path."

    .line 738
    .line 739
    invoke-virtual {v5, v6, v1}, LWa/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    return-object v2

    .line 743
    :cond_1a
    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 744
    .line 745
    .line 746
    move-result-object v8

    .line 747
    if-eqz v8, :cond_1f

    .line 748
    .line 749
    const-string v9, "selectedItems"

    .line 750
    .line 751
    invoke-virtual {v8, v9}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 752
    .line 753
    .line 754
    move-result v8

    .line 755
    if-ne v8, v1, :cond_1f

    .line 756
    .line 757
    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 765
    .line 766
    const/16 v4, 0x21

    .line 767
    .line 768
    if-lt v3, v4, :cond_1b

    .line 769
    .line 770
    invoke-static {v1}, LG6/T;->r(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    goto :goto_8

    .line 775
    :cond_1b
    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    :goto_8
    if-eqz v1, :cond_1e

    .line 780
    .line 781
    new-instance v3, Ljava/util/ArrayList;

    .line 782
    .line 783
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 784
    .line 785
    .line 786
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    :cond_1c
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 791
    .line 792
    .line 793
    move-result v4

    .line 794
    if-eqz v4, :cond_1d

    .line 795
    .line 796
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    instance-of v6, v4, Landroid/net/Uri;

    .line 801
    .line 802
    if-eqz v6, :cond_1c

    .line 803
    .line 804
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto :goto_9

    .line 808
    :cond_1d
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    if-eqz v3, :cond_1e

    .line 817
    .line 818
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    check-cast v3, Landroid/net/Uri;

    .line 823
    .line 824
    invoke-static {v12, v3, v11, v7}, LWa/g;->a(Landroid/app/Activity;Landroid/net/Uri;ZLjava/util/ArrayList;)V

    .line 825
    .line 826
    .line 827
    goto :goto_a

    .line 828
    :cond_1e
    invoke-virtual {v5, v7}, LWa/b;->c(Ljava/io/Serializable;)V

    .line 829
    .line 830
    .line 831
    return-object v2

    .line 832
    :cond_1f
    invoke-virtual {v5, v4, v3}, LWa/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    return-object v2
.end method
