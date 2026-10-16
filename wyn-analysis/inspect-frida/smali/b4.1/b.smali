.class public final Lb4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/g;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/net/Uri;

.field public final c:Lh4/l;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Lh4/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb4/b;->a:I

    iput-object p1, p0, Lb4/b;->b:Landroid/net/Uri;

    iput-object p2, p0, Lb4/b;->c:Lh4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 p1, 0x2

    .line 2
    const/4 v0, 0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lb4/b;->c:Lh4/l;

    .line 5
    .line 6
    iget-object v3, p0, Lb4/b;->b:Landroid/net/Uri;

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    iget v5, p0, Lb4/b;->a:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    const-string v6, "Invalid android.resource URI: "

    .line 19
    .line 20
    if-eqz v5, :cond_e

    .line 21
    .line 22
    invoke-static {v5}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-nez v7, :cond_0

    .line 27
    .line 28
    move-object v1, v5

    .line 29
    :cond_0
    if-eqz v1, :cond_e

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5}, Lff/o;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v5, :cond_d

    .line 42
    .line 43
    invoke-static {v5}, LBf/r;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-eqz v5, :cond_d

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget-object v5, v2, Lh4/l;->a:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v6, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    :goto_0
    new-instance v7, Landroid/util/TypedValue;

    .line 79
    .line 80
    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v3, v7, v0}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 84
    .line 85
    .line 86
    iget-object v7, v7, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 87
    .line 88
    const/4 v8, 0x6

    .line 89
    const/16 v9, 0x2f

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    invoke-static {v7, v9, v10, v8}, LBf/k;->B0(Ljava/lang/CharSequence;CII)I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    invoke-interface {v7, v8, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-static {v8, v7}, Lk4/e;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    const-string v8, "text/xml"

    .line 117
    .line 118
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_c

    .line 123
    .line 124
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const-string v7, "Invalid resource ID: "

    .line 133
    .line 134
    if-eqz v1, :cond_3

    .line 135
    .line 136
    invoke-static {v5, v3}, LFe/g;->B(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-eqz p1, :cond_2

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_2
    invoke-static {v3, v7}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :cond_3
    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    :goto_1
    if-eq v8, p1, :cond_4

    .line 166
    .line 167
    if-eq v8, v0, :cond_4

    .line 168
    .line 169
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    goto :goto_1

    .line 174
    :cond_4
    if-ne v8, p1, :cond_b

    .line 175
    .line 176
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 177
    .line 178
    const/16 v8, 0x18

    .line 179
    .line 180
    if-ge p1, v8, :cond_6

    .line 181
    .line 182
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    const-string v8, "vector"

    .line 187
    .line 188
    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-eqz v8, :cond_5

    .line 193
    .line 194
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    new-instance v7, Lu3/p;

    .line 203
    .line 204
    invoke-direct {v7}, Lu3/p;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7, v6, v1, p1, v3}, Lu3/p;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 208
    .line 209
    .line 210
    :goto_2
    move-object p1, v7

    .line 211
    goto :goto_3

    .line 212
    :cond_5
    const-string v8, "animated-vector"

    .line 213
    .line 214
    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-eqz p1, :cond_6

    .line 219
    .line 220
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    new-instance v7, Lu3/d;

    .line 229
    .line 230
    invoke-direct {v7, v5}, Lu3/d;-><init>(Landroid/content/Context;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v7, v6, v1, p1, v3}, Lu3/d;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_6
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    sget-object v1, La1/l;->a:Ljava/lang/ThreadLocal;

    .line 242
    .line 243
    invoke-virtual {v6, v3, p1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-eqz p1, :cond_a

    .line 248
    .line 249
    :goto_3
    instance-of v1, p1, Landroid/graphics/drawable/VectorDrawable;

    .line 250
    .line 251
    if-nez v1, :cond_8

    .line 252
    .line 253
    instance-of v1, p1, Lu3/p;

    .line 254
    .line 255
    if-eqz v1, :cond_7

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_7
    move v0, v10

    .line 259
    :cond_8
    :goto_4
    new-instance v1, Lb4/d;

    .line 260
    .line 261
    if-eqz v0, :cond_9

    .line 262
    .line 263
    iget-object v3, v2, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

    .line 264
    .line 265
    iget-object v6, v2, Lh4/l;->c:Li4/f;

    .line 266
    .line 267
    iget v7, v2, Lh4/l;->d:I

    .line 268
    .line 269
    iget-boolean v2, v2, Lh4/l;->e:Z

    .line 270
    .line 271
    invoke-static {p1, v3, v6, v7, v2}, Lvf/a;->l(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Li4/f;IZ)Landroid/graphics/Bitmap;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 280
    .line 281
    invoke-direct {v3, v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 282
    .line 283
    .line 284
    move-object p1, v3

    .line 285
    :cond_9
    invoke-direct {v1, p1, v0, v4}, Lb4/d;-><init>(Landroid/graphics/drawable/Drawable;ZI)V

    .line 286
    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_a
    invoke-static {v3, v7}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v0

    .line 303
    :cond_b
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 304
    .line 305
    const-string v0, "No start tag found."

    .line 306
    .line 307
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw p1

    .line 311
    :cond_c
    new-instance p1, Landroid/util/TypedValue;

    .line 312
    .line 313
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6, v3, p1}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    new-instance v1, Lb4/m;

    .line 321
    .line 322
    invoke-static {v0}, Lcg/b;->m(Ljava/io/InputStream;)Lcg/d;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v0}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    new-instance v2, LZ3/l;

    .line 331
    .line 332
    iget p1, p1, Landroid/util/TypedValue;->density:I

    .line 333
    .line 334
    invoke-direct {v2, p1}, LZ3/l;-><init>(I)V

    .line 335
    .line 336
    .line 337
    new-instance p1, LZ3/m;

    .line 338
    .line 339
    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 344
    .line 345
    .line 346
    invoke-direct {p1, v0, v3, v2}, LZ3/m;-><init>(Lcg/i;Ljava/io/File;LA6/c;)V

    .line 347
    .line 348
    .line 349
    invoke-direct {v1, p1, v7, v4}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 350
    .line 351
    .line 352
    :goto_5
    return-object v1

    .line 353
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 354
    .line 355
    invoke-static {v3, v6}, Lpd/f;->k(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw p1

    .line 363
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 364
    .line 365
    invoke-static {v3, v6}, Lpd/f;->k(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw p1

    .line 373
    :pswitch_0
    iget-object v5, v2, Lh4/l;->a:Landroid/content/Context;

    .line 374
    .line 375
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    const-string v7, "com.android.contacts"

    .line 384
    .line 385
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    const-string v7, "\'."

    .line 390
    .line 391
    if-eqz v6, :cond_11

    .line 392
    .line 393
    invoke-virtual {v3}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    const-string v8, "display_photo"

    .line 398
    .line 399
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-eqz v6, :cond_11

    .line 404
    .line 405
    const-string p1, "r"

    .line 406
    .line 407
    invoke-virtual {v5, v3, p1}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    if-eqz p1, :cond_f

    .line 412
    .line 413
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    :cond_f
    if-eqz v1, :cond_10

    .line 418
    .line 419
    goto/16 :goto_a

    .line 420
    .line 421
    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    const-string v0, "Unable to find a contact photo associated with \'"

    .line 424
    .line 425
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v0

    .line 448
    :cond_11
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 449
    .line 450
    const/16 v8, 0x1d

    .line 451
    .line 452
    if-lt v6, v8, :cond_18

    .line 453
    .line 454
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    const-string v8, "media"

    .line 459
    .line 460
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v6

    .line 464
    if-nez v6, :cond_12

    .line 465
    .line 466
    goto/16 :goto_9

    .line 467
    .line 468
    :cond_12
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    if-lt v8, v4, :cond_18

    .line 477
    .line 478
    add-int/lit8 v9, v8, -0x3

    .line 479
    .line 480
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v9

    .line 484
    const-string v10, "audio"

    .line 485
    .line 486
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    if-eqz v9, :cond_18

    .line 491
    .line 492
    sub-int/2addr v8, p1

    .line 493
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    const-string v6, "albums"

    .line 498
    .line 499
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result p1

    .line 503
    if-eqz p1, :cond_18

    .line 504
    .line 505
    iget-object p1, v2, Lh4/l;->c:Li4/f;

    .line 506
    .line 507
    iget-object v6, p1, Li4/f;->a:Lp7/b;

    .line 508
    .line 509
    instance-of v8, v6, Li4/a;

    .line 510
    .line 511
    if-eqz v8, :cond_13

    .line 512
    .line 513
    check-cast v6, Li4/a;

    .line 514
    .line 515
    goto :goto_6

    .line 516
    :cond_13
    move-object v6, v1

    .line 517
    :goto_6
    if-eqz v6, :cond_15

    .line 518
    .line 519
    iget-object p1, p1, Li4/f;->b:Lp7/b;

    .line 520
    .line 521
    instance-of v8, p1, Li4/a;

    .line 522
    .line 523
    if-eqz v8, :cond_14

    .line 524
    .line 525
    check-cast p1, Li4/a;

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_14
    move-object p1, v1

    .line 529
    :goto_7
    if-eqz p1, :cond_15

    .line 530
    .line 531
    new-instance v8, Landroid/os/Bundle;

    .line 532
    .line 533
    invoke-direct {v8, v0}, Landroid/os/Bundle;-><init>(I)V

    .line 534
    .line 535
    .line 536
    new-instance v0, Landroid/graphics/Point;

    .line 537
    .line 538
    iget v6, v6, Li4/a;->e:I

    .line 539
    .line 540
    iget p1, p1, Li4/a;->e:I

    .line 541
    .line 542
    invoke-direct {v0, v6, p1}, Landroid/graphics/Point;-><init>(II)V

    .line 543
    .line 544
    .line 545
    const-string p1, "android.content.extra.SIZE"

    .line 546
    .line 547
    invoke-virtual {v8, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 548
    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_15
    move-object v8, v1

    .line 552
    :goto_8
    invoke-static {v5, v3, v8}, LG5/d;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 553
    .line 554
    .line 555
    move-result-object p1

    .line 556
    if-eqz p1, :cond_16

    .line 557
    .line 558
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    :cond_16
    if-eqz v1, :cond_17

    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    const-string v0, "Unable to find a music thumbnail associated with \'"

    .line 568
    .line 569
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 583
    .line 584
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    throw v0

    .line 592
    :cond_18
    :goto_9
    invoke-virtual {v5, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    if-eqz v1, :cond_19

    .line 597
    .line 598
    :goto_a
    new-instance p1, Lb4/m;

    .line 599
    .line 600
    invoke-static {v1}, Lcg/b;->m(Ljava/io/InputStream;)Lcg/d;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-static {v0}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    new-instance v1, LZ3/a;

    .line 609
    .line 610
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 611
    .line 612
    .line 613
    new-instance v6, LZ3/m;

    .line 614
    .line 615
    sget-object v7, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 616
    .line 617
    iget-object v2, v2, Lh4/l;->a:Landroid/content/Context;

    .line 618
    .line 619
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 624
    .line 625
    .line 626
    invoke-direct {v6, v0, v2, v1}, LZ3/m;-><init>(Lcg/i;Ljava/io/File;LA6/c;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v5, v3}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-direct {p1, v6, v0, v4}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 634
    .line 635
    .line 636
    return-object p1

    .line 637
    :cond_19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 638
    .line 639
    const-string v0, "Unable to open \'"

    .line 640
    .line 641
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 655
    .line 656
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    throw v0

    .line 664
    :pswitch_1
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object p1

    .line 668
    check-cast p1, Ljava/lang/Iterable;

    .line 669
    .line 670
    invoke-static {p1}, Lff/o;->l0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 671
    .line 672
    .line 673
    move-result-object p1

    .line 674
    move-object v5, p1

    .line 675
    check-cast v5, Ljava/lang/Iterable;

    .line 676
    .line 677
    const/4 v8, 0x0

    .line 678
    const/4 v9, 0x0

    .line 679
    const-string v6, "/"

    .line 680
    .line 681
    const/4 v7, 0x0

    .line 682
    const/16 v10, 0x3e

    .line 683
    .line 684
    invoke-static/range {v5 .. v10}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object p1

    .line 688
    new-instance v0, Lb4/m;

    .line 689
    .line 690
    iget-object v1, v2, Lh4/l;->a:Landroid/content/Context;

    .line 691
    .line 692
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-static {v1}, Lcg/b;->m(Ljava/io/InputStream;)Lcg/d;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    invoke-static {v1}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    new-instance v3, LZ3/a;

    .line 709
    .line 710
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 711
    .line 712
    .line 713
    new-instance v5, LZ3/m;

    .line 714
    .line 715
    sget-object v6, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 716
    .line 717
    iget-object v2, v2, Lh4/l;->a:Landroid/content/Context;

    .line 718
    .line 719
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 724
    .line 725
    .line 726
    invoke-direct {v5, v1, v2, v3}, LZ3/m;-><init>(Lcg/i;Ljava/io/File;LA6/c;)V

    .line 727
    .line 728
    .line 729
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-static {v1, p1}, Lk4/e;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object p1

    .line 737
    invoke-direct {v0, v5, p1, v4}, Lb4/m;-><init>(LZ3/k;Ljava/lang/String;I)V

    .line 738
    .line 739
    .line 740
    return-object v0

    .line 741
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
