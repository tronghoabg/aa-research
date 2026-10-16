.class public final synthetic Lcom/applovin/impl/Z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/a;
.implements Lcom/moloco/sdk/publisher/MolocoBidTokenListener;
.implements Lg/b;
.implements Lcom/unity3d/services/ads/token/INativeTokenGeneratorListener;
.implements Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;
.implements LL8/e;
.implements LE5/g;
.implements Lf8/z;
.implements Ljg/a;
.implements Lk8/h;
.implements Ljg/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/applovin/impl/Z0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/applovin/impl/Z0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Llg/b;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const v0, 0x7fffffff

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    const-string v0, "Cannot read more than %,d into a byte array"

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :pswitch_0
    check-cast p1, Lf6/T;

    .line 34
    .line 35
    iget-object p1, p1, Lf6/T;->b:LI5/h;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/Z0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ll2/h;

    .line 7
    .line 8
    iget p1, p1, Ll2/h;->a:I

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_0
    check-cast p1, Lcom/applovin/impl/i5;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/applovin/impl/y2;->t(Lcom/applovin/impl/i5;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_1
    check-cast p1, Lcom/applovin/impl/i5;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/applovin/impl/y2;->y(Lcom/applovin/impl/i5;)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :pswitch_2
    check-cast p1, Lcom/applovin/impl/i5;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/applovin/impl/y2;->w(Lcom/applovin/impl/i5;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_3
    check-cast p1, Lcom/applovin/impl/i5;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/applovin/impl/y2;->v(Lcom/applovin/impl/i5;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroid/os/Bundle;)LE5/h;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x6

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v6, 0x2

    .line 9
    const/4 v7, 0x1

    .line 10
    const/16 v8, 0x24

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    move-object/from16 v10, p0

    .line 14
    .line 15
    iget v11, v10, Lcom/applovin/impl/Z0;->a:I

    .line 16
    .line 17
    packed-switch v11, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    :pswitch_0
    invoke-static {v9, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v11

    .line 24
    invoke-virtual {v0, v11}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    const/4 v12, 0x0

    .line 29
    if-eqz v11, :cond_0

    .line 30
    .line 31
    move-object v14, v11

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v14, v12

    .line 34
    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    invoke-virtual {v0, v11}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    check-cast v11, Landroid/text/Layout$Alignment;

    .line 43
    .line 44
    if-eqz v11, :cond_1

    .line 45
    .line 46
    move-object v15, v11

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v15, v12

    .line 49
    :goto_1
    invoke-static {v6, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Landroid/text/Layout$Alignment;

    .line 58
    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    move-object/from16 v16, v6

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move-object/from16 v16, v12

    .line 65
    .line 66
    :goto_2
    invoke-static {v5, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Landroid/graphics/Bitmap;

    .line 75
    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    move-object/from16 v17, v5

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move-object/from16 v17, v12

    .line 82
    .line 83
    :goto_3
    invoke-static {v4, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const v6, -0x800001

    .line 92
    .line 93
    .line 94
    const/high16 v11, -0x80000000

    .line 95
    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    invoke-static {v3, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_4

    .line 107
    .line 108
    invoke-static {v4, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-static {v3, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    move/from16 v19, v3

    .line 125
    .line 126
    move/from16 v18, v4

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_4
    move/from16 v18, v6

    .line 130
    .line 131
    move/from16 v19, v11

    .line 132
    .line 133
    :goto_4
    invoke-static {v2, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    invoke-static {v2, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    move/from16 v20, v2

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_5
    move/from16 v20, v11

    .line 155
    .line 156
    :goto_5
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    move/from16 v21, v1

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_6
    move/from16 v21, v6

    .line 178
    .line 179
    :goto_6
    const/16 v1, 0x8

    .line 180
    .line 181
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_7

    .line 190
    .line 191
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    move/from16 v22, v1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_7
    move/from16 v22, v11

    .line 203
    .line 204
    :goto_7
    const/16 v1, 0xa

    .line 205
    .line 206
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_8

    .line 215
    .line 216
    const/16 v2, 0x9

    .line 217
    .line 218
    invoke-static {v2, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_8

    .line 227
    .line 228
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    invoke-static {v2, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    move/from16 v24, v1

    .line 245
    .line 246
    move/from16 v23, v2

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_8
    move/from16 v24, v6

    .line 250
    .line 251
    move/from16 v23, v11

    .line 252
    .line 253
    :goto_8
    const/16 v1, 0xb

    .line 254
    .line 255
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_9

    .line 264
    .line 265
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    move/from16 v25, v1

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_9
    move/from16 v25, v6

    .line 277
    .line 278
    :goto_9
    const/16 v1, 0xc

    .line 279
    .line 280
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-eqz v2, :cond_a

    .line 289
    .line 290
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    :cond_a
    move/from16 v26, v6

    .line 299
    .line 300
    const/16 v1, 0xd

    .line 301
    .line 302
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-eqz v2, :cond_b

    .line 311
    .line 312
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    :goto_a
    move/from16 v28, v1

    .line 321
    .line 322
    goto :goto_b

    .line 323
    :cond_b
    const/high16 v1, -0x1000000

    .line 324
    .line 325
    move v7, v9

    .line 326
    goto :goto_a

    .line 327
    :goto_b
    const/16 v1, 0xe

    .line 328
    .line 329
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v0, v1, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-nez v1, :cond_c

    .line 338
    .line 339
    move/from16 v27, v9

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_c
    move/from16 v27, v7

    .line 343
    .line 344
    :goto_c
    const/16 v1, 0xf

    .line 345
    .line 346
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    if-eqz v2, :cond_d

    .line 355
    .line 356
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    :cond_d
    move/from16 v29, v11

    .line 365
    .line 366
    const/16 v1, 0x10

    .line 367
    .line 368
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_e

    .line 377
    .line 378
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    :goto_d
    move/from16 v30, v0

    .line 387
    .line 388
    goto :goto_e

    .line 389
    :cond_e
    const/4 v0, 0x0

    .line 390
    goto :goto_d

    .line 391
    :goto_e
    new-instance v13, Lh6/b;

    .line 392
    .line 393
    invoke-direct/range {v13 .. v30}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 394
    .line 395
    .line 396
    return-object v13

    .line 397
    :pswitch_1
    invoke-static {v9, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v11

    .line 401
    invoke-virtual {v0, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 402
    .line 403
    .line 404
    move-result-wide v13

    .line 405
    invoke-static {v7, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    const/4 v11, -0x1

    .line 410
    invoke-virtual {v0, v7, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 411
    .line 412
    .line 413
    move-result v15

    .line 414
    invoke-static {v1, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-virtual {v0, v1, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 419
    .line 420
    .line 421
    move-result v16

    .line 422
    invoke-static {v6, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-static {v5, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    invoke-static {v4, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    invoke-static {v3, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 451
    .line 452
    .line 453
    move-result-wide v20

    .line 454
    invoke-static {v2, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 459
    .line 460
    .line 461
    move-result v22

    .line 462
    new-instance v12, Lg6/a;

    .line 463
    .line 464
    if-nez v5, :cond_f

    .line 465
    .line 466
    new-array v5, v9, [I

    .line 467
    .line 468
    :cond_f
    move-object/from16 v17, v5

    .line 469
    .line 470
    new-array v0, v9, [Landroid/net/Uri;

    .line 471
    .line 472
    if-nez v1, :cond_10

    .line 473
    .line 474
    :goto_f
    move-object/from16 v18, v0

    .line 475
    .line 476
    goto :goto_10

    .line 477
    :cond_10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    check-cast v0, [Landroid/net/Uri;

    .line 482
    .line 483
    goto :goto_f

    .line 484
    :goto_10
    if-nez v4, :cond_11

    .line 485
    .line 486
    new-array v4, v9, [J

    .line 487
    .line 488
    :cond_11
    move-object/from16 v19, v4

    .line 489
    .line 490
    invoke-direct/range {v12 .. v22}, Lg6/a;-><init>(JII[I[Landroid/net/Uri;[JJZ)V

    .line 491
    .line 492
    .line 493
    return-object v12

    .line 494
    :pswitch_2
    invoke-static {v7, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    if-nez v1, :cond_12

    .line 503
    .line 504
    new-array v1, v9, [Lg6/a;

    .line 505
    .line 506
    move-object v12, v1

    .line 507
    goto :goto_12

    .line 508
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    new-array v2, v2, [Lg6/a;

    .line 513
    .line 514
    :goto_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    if-ge v9, v3, :cond_13

    .line 519
    .line 520
    sget-object v3, Lg6/a;->i:Lcom/applovin/impl/Z0;

    .line 521
    .line 522
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v11

    .line 526
    check-cast v11, Landroid/os/Bundle;

    .line 527
    .line 528
    invoke-virtual {v3, v11}, Lcom/applovin/impl/Z0;->e(Landroid/os/Bundle;)LE5/h;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    check-cast v3, Lg6/a;

    .line 533
    .line 534
    aput-object v3, v2, v9

    .line 535
    .line 536
    add-int/2addr v9, v7

    .line 537
    goto :goto_11

    .line 538
    :cond_13
    move-object v12, v2

    .line 539
    :goto_12
    invoke-static {v6, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    const-wide/16 v2, 0x0

    .line 544
    .line 545
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 546
    .line 547
    .line 548
    move-result-wide v13

    .line 549
    invoke-static {v5, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 559
    .line 560
    .line 561
    move-result-wide v15

    .line 562
    invoke-static {v4, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result v17

    .line 570
    new-instance v11, Lg6/b;

    .line 571
    .line 572
    invoke-direct/range {v11 .. v17}, Lg6/b;-><init>([Lg6/a;JJI)V

    .line 573
    .line 574
    .line 575
    return-object v11

    .line 576
    :pswitch_3
    invoke-static {v9, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    if-nez v0, :cond_14

    .line 585
    .line 586
    new-instance v0, Lf6/a0;

    .line 587
    .line 588
    new-array v1, v9, [Lf6/Z;

    .line 589
    .line 590
    invoke-direct {v0, v1}, Lf6/a0;-><init>([Lf6/Z;)V

    .line 591
    .line 592
    .line 593
    goto :goto_13

    .line 594
    :cond_14
    new-instance v1, Lf6/a0;

    .line 595
    .line 596
    sget-object v2, Lf6/Z;->f:Lcom/applovin/impl/Z0;

    .line 597
    .line 598
    invoke-static {v2, v0}, Lu6/a;->s(LE5/g;Ljava/util/ArrayList;)Ll8/e0;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    new-array v2, v9, [Lf6/Z;

    .line 603
    .line 604
    invoke-virtual {v0, v2}, Ll8/F;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    check-cast v0, [Lf6/Z;

    .line 609
    .line 610
    invoke-direct {v1, v0}, Lf6/a0;-><init>([Lf6/Z;)V

    .line 611
    .line 612
    .line 613
    move-object v0, v1

    .line 614
    :goto_13
    return-object v0

    .line 615
    :pswitch_4
    invoke-static {v9, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    if-nez v1, :cond_15

    .line 624
    .line 625
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 626
    .line 627
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 628
    .line 629
    goto :goto_14

    .line 630
    :cond_15
    sget-object v2, LE5/T;->H:LA5/f;

    .line 631
    .line 632
    invoke-static {v2, v1}, Lu6/a;->s(LE5/g;Ljava/util/ArrayList;)Ll8/e0;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    :goto_14
    invoke-static {v7, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    const-string v3, ""

    .line 641
    .line 642
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    new-instance v2, Lf6/Z;

    .line 647
    .line 648
    new-array v3, v9, [LE5/T;

    .line 649
    .line 650
    invoke-virtual {v1, v3}, Ll8/F;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    check-cast v1, [LE5/T;

    .line 655
    .line 656
    invoke-direct {v2, v0, v1}, Lf6/Z;-><init>(Ljava/lang/String;[LE5/T;)V

    .line 657
    .line 658
    .line 659
    return-object v2

    .line 660
    nop

    .line 661
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public invokeCallback(Lcom/unity3d/services/core/webview/bridge/Invocation;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/unity3d/services/core/webview/bridge/SharedInstances;->a(Lcom/unity3d/services/core/webview/bridge/Invocation;)V

    return-void
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/Z0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;->a(LC6/l;)Le9/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->b(LC6/l;)Lea/V;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->a(LC6/l;)Lea/v;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->c(LC6/l;)Lga/j;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->d(LC6/l;)Lea/H;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->e(LC6/l;)Lea/M;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->f(LC6/l;)Lea/n;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->a(LC6/l;)Lq5/g;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->b(LC6/l;)Lq5/g;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->c(LC6/l;)Lq5/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onActivityResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lg/a;

    invoke-static {p1}, Lcom/unity3d/ads/adplayer/FullScreenWebViewDisplay;->u(Lg/a;)V

    return-void
.end method

.method public onBidTokenResult(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/moloco/sdk/publisher/MolocoSamplesKt;->f(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)V

    return-void
.end method

.method public onReady(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/unity3d/services/ads/token/InMemoryTokenStorage;->a(Ljava/lang/String;)V

    return-void
.end method
