.class public final Lcom/moloco/sdk/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/moloco/sdk/internal/f;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/moloco/sdk/internal/f;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/moloco/sdk/internal/f;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/moloco/sdk/internal/f;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v6, p1

    .line 9
    .line 10
    check-cast v6, LN/o;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v1, v1, 0x3

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v6}, LN/o;->x()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v6}, LN/o;->I()V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 37
    .line 38
    iget-object v1, v0, Lcom/moloco/sdk/internal/f;->b:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;

    .line 42
    .line 43
    iget-object v1, v0, Lcom/moloco/sdk/internal/f;->c:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v3, v1

    .line 46
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 47
    .line 48
    iget-object v1, v0, Lcom/moloco/sdk/internal/f;->d:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v4, v1

    .line 51
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    invoke-static/range {v2 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->f(Landroid/app/Activity;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LN/o;I)V

    .line 55
    .line 56
    .line 57
    :goto_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 58
    .line 59
    return-object v1

    .line 60
    :pswitch_0
    move-object/from16 v10, p1

    .line 61
    .line 62
    check-cast v10, LN/o;

    .line 63
    .line 64
    move-object/from16 v1, p2

    .line 65
    .line 66
    check-cast v1, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    and-int/lit8 v1, v1, 0x3

    .line 73
    .line 74
    const/4 v2, 0x2

    .line 75
    if-ne v1, v2, :cond_3

    .line 76
    .line 77
    invoke-virtual {v10}, LN/o;->x()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-virtual {v10}, LN/o;->I()V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_3
    :goto_2
    iget-object v1, v0, Lcom/moloco/sdk/internal/f;->b:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v2, v1

    .line 92
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v3, "getIntent(...)"

    .line 99
    .line 100
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v3, "CLOSE_DELAY_SECONDS"

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    sget-object v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;

    .line 111
    .line 112
    const v3, -0x48477f63

    .line 113
    .line 114
    .line 115
    invoke-virtual {v10, v3}, LN/o;->M(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10, v13}, LN/o;->e(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-virtual {v10}, LN/o;->F()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    sget-object v6, LN/k;->a:LN/P;

    .line 127
    .line 128
    if-nez v3, :cond_4

    .line 129
    .line 130
    if-ne v5, v6, :cond_5

    .line 131
    .line 132
    :cond_4
    new-instance v11, LEf/p0;

    .line 133
    .line 134
    const-string v16, "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V"

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/4 v12, 0x1

    .line 139
    const-class v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;

    .line 140
    .line 141
    const-string v15, "onButtonRendered"

    .line 142
    .line 143
    const/16 v18, 0x4

    .line 144
    .line 145
    invoke-direct/range {v11 .. v18}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10, v11}, LN/o;->U(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object v5, v11

    .line 152
    :cond_5
    check-cast v5, Lkotlin/reflect/KFunction;

    .line 153
    .line 154
    invoke-virtual {v10, v4}, LN/o;->p(Z)V

    .line 155
    .line 156
    .line 157
    check-cast v5, Ltf/l;

    .line 158
    .line 159
    const v3, -0x484778cc

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10, v3}, LN/o;->M(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v10, v13}, LN/o;->e(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-virtual {v10}, LN/o;->F()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    if-nez v3, :cond_6

    .line 174
    .line 175
    if-ne v7, v6, :cond_7

    .line 176
    .line 177
    :cond_6
    new-instance v11, LS8/d;

    .line 178
    .line 179
    const-string v16, "dismiss()V"

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    const-class v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;

    .line 185
    .line 186
    const-string v15, "dismiss"

    .line 187
    .line 188
    const/16 v18, 0xb

    .line 189
    .line 190
    invoke-direct/range {v11 .. v18}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v11}, LN/o;->U(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object v7, v11

    .line 197
    :cond_7
    check-cast v7, Lkotlin/reflect/KFunction;

    .line 198
    .line 199
    invoke-virtual {v10, v4}, LN/o;->p(Z)V

    .line 200
    .line 201
    .line 202
    check-cast v7, Ltf/a;

    .line 203
    .line 204
    sget-object v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 205
    .line 206
    const v3, -0x484764f8

    .line 207
    .line 208
    .line 209
    invoke-virtual {v10, v3}, LN/o;->M(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v10}, LN/o;->F()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    if-ne v3, v6, :cond_8

    .line 217
    .line 218
    new-instance v3, Lcom/moloco/sdk/service_locator/h;

    .line 219
    .line 220
    const/16 v6, 0xf

    .line 221
    .line 222
    invoke-direct {v3, v6}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v10, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_8
    move-object v9, v3

    .line 229
    check-cast v9, Ltf/a;

    .line 230
    .line 231
    invoke-virtual {v10, v4}, LN/o;->p(Z)V

    .line 232
    .line 233
    .line 234
    iget-object v3, v0, Lcom/moloco/sdk/internal/f;->d:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 237
    .line 238
    const/high16 v11, 0xc00000

    .line 239
    .line 240
    iget-object v4, v0, Lcom/moloco/sdk/internal/f;->c:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;

    .line 243
    .line 244
    move-object v6, v7

    .line 245
    move-object v7, v3

    .line 246
    move-object v3, v4

    .line 247
    move v4, v1

    .line 248
    invoke-static/range {v2 .. v11}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/k;->a(Landroid/app/Activity;Landroid/webkit/WebView;ILtf/l;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/a;LN/o;I)V

    .line 249
    .line 250
    .line 251
    :goto_3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 252
    .line 253
    return-object v1

    .line 254
    :pswitch_1
    move-object/from16 v9, p1

    .line 255
    .line 256
    check-cast v9, LN/o;

    .line 257
    .line 258
    move-object/from16 v1, p2

    .line 259
    .line 260
    check-cast v1, Ljava/lang/Number;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 263
    .line 264
    .line 265
    const v1, -0x60dcb3f9

    .line 266
    .line 267
    .line 268
    invoke-virtual {v9, v1}, LN/o;->M(I)V

    .line 269
    .line 270
    .line 271
    iget-object v1, v0, Lcom/moloco/sdk/internal/f;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, Lcom/moloco/sdk/internal/ortb/model/h;

    .line 274
    .line 275
    iget v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 276
    .line 277
    int-to-float v2, v2

    .line 278
    invoke-static {v2, v2}, LA6/c;->b(FF)J

    .line 279
    .line 280
    .line 281
    move-result-wide v10

    .line 282
    iget-object v2, v0, Lcom/moloco/sdk/internal/f;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v2, Lcom/moloco/sdk/internal/ortb/model/Z;

    .line 285
    .line 286
    if-eqz v2, :cond_9

    .line 287
    .line 288
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/model/Z;->d:Le0/q;

    .line 289
    .line 290
    if-eqz v2, :cond_9

    .line 291
    .line 292
    iget-wide v2, v2, Le0/q;->a:J

    .line 293
    .line 294
    :goto_4
    move-wide v4, v2

    .line 295
    goto :goto_5

    .line 296
    :cond_9
    iget-wide v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->f:J

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :goto_5
    iget-object v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 300
    .line 301
    iget-object v3, v1, Lcom/moloco/sdk/internal/ortb/model/h;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 302
    .line 303
    invoke-static {v2, v3}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 304
    .line 305
    .line 306
    move-result-object v12

    .line 307
    iget v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->b:I

    .line 308
    .line 309
    int-to-float v2, v2

    .line 310
    new-instance v13, LE/F;

    .line 311
    .line 312
    invoke-direct {v13, v2, v2, v2, v2}, LE/F;-><init>(FFFF)V

    .line 313
    .line 314
    .line 315
    iget v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 316
    .line 317
    invoke-static {v2}, LFe/b;->E(I)J

    .line 318
    .line 319
    .line 320
    move-result-wide v2

    .line 321
    invoke-static {v2, v3}, LFe/b;->j(J)V

    .line 322
    .line 323
    .line 324
    const-wide v6, 0xff00000000L

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    and-long/2addr v6, v2

    .line 330
    invoke-static {v2, v3}, LL0/j;->c(J)F

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    const/4 v3, 0x2

    .line 335
    int-to-float v3, v3

    .line 336
    div-float/2addr v2, v3

    .line 337
    invoke-static {v6, v7, v2}, LFe/b;->M(JF)J

    .line 338
    .line 339
    .line 340
    move-result-wide v14

    .line 341
    const v2, 0x3ecccccd    # 0.4f

    .line 342
    .line 343
    .line 344
    invoke-static {v10, v11, v2}, LL0/f;->c(JF)J

    .line 345
    .line 346
    .line 347
    move-result-wide v2

    .line 348
    iget-object v1, v1, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    .line 349
    .line 350
    if-eqz v1, :cond_a

    .line 351
    .line 352
    iget-wide v6, v1, Le0/q;->a:J

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_a
    sget-wide v6, Lcom/moloco/sdk/internal/i;->b:J

    .line 356
    .line 357
    :goto_6
    iget-object v1, v0, Lcom/moloco/sdk/internal/f;->c:Ljava/lang/Object;

    .line 358
    .line 359
    move-object v8, v1

    .line 360
    check-cast v8, Lcom/moloco/sdk/internal/ortb/model/Z;

    .line 361
    .line 362
    move-wide/from16 v19, v6

    .line 363
    .line 364
    move-wide v6, v4

    .line 365
    move-wide/from16 v4, v19

    .line 366
    .line 367
    invoke-static/range {v2 .. v9}, Lcom/moloco/sdk/internal/i;->c(JJJLcom/moloco/sdk/internal/ortb/model/Z;LN/o;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    move-wide v4, v6

    .line 372
    iget-object v2, v0, Lcom/moloco/sdk/internal/f;->d:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v2, Lcom/moloco/sdk/internal/ortb/model/D;

    .line 375
    .line 376
    move-object v3, v13

    .line 377
    const/16 v13, 0x40

    .line 378
    .line 379
    move-wide v6, v10

    .line 380
    move-object v10, v1

    .line 381
    move-object v11, v2

    .line 382
    move-object v2, v12

    .line 383
    move-object v12, v9

    .line 384
    move-wide v8, v14

    .line 385
    invoke-static/range {v2 .. v13}, Lic/d;->d(LZ/d;LE/F;JJJLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;Lcom/moloco/sdk/internal/ortb/model/D;LN/o;I)LV/d;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    move-object v9, v12

    .line 390
    const/4 v2, 0x0

    .line 391
    invoke-virtual {v9, v2}, LN/o;->p(Z)V

    .line 392
    .line 393
    .line 394
    return-object v1

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
