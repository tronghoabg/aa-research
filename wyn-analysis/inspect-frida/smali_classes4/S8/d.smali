.class public final synthetic LS8/d;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LS8/d;->a:I

    invoke-direct/range {p0 .. p6}, Lkotlin/jvm/internal/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LS8/d;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;->b()V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lef/C;->a:Lef/C;

    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->setAdView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lef/C;->a:Lef/C;

    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_1
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->c()V

    .line 34
    .line 35
    .line 36
    sget-object v1, Lef/C;->a:Lef/C;

    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_2
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 47
    .line 48
    const/16 v7, 0xc

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    const-string v3, "SimplifiedExoPlayer"

    .line 52
    .line 53
    const-string v4, "Init exo player"

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->l:Ls6/C;

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    :cond_0
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    new-instance v3, LE5/r;

    .line 71
    .line 72
    iget-object v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->a:Landroid/content/Context;

    .line 73
    .line 74
    invoke-direct {v3, v4}, LE5/r;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    iget-boolean v4, v3, LE5/r;->s:Z

    .line 78
    .line 79
    const/4 v5, 0x1

    .line 80
    xor-int/2addr v4, v5

    .line 81
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 82
    .line 83
    .line 84
    iget-object v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->o:Landroid/os/Looper;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iput-object v4, v3, LE5/r;->g:Landroid/os/Looper;

    .line 90
    .line 91
    iget-boolean v4, v3, LE5/r;->s:Z

    .line 92
    .line 93
    xor-int/2addr v4, v5

    .line 94
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 95
    .line 96
    .line 97
    iput-boolean v5, v3, LE5/r;->q:Z

    .line 98
    .line 99
    iget-boolean v4, v3, LE5/r;->s:Z

    .line 100
    .line 101
    xor-int/2addr v4, v5

    .line 102
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 103
    .line 104
    .line 105
    iput-boolean v5, v3, LE5/r;->s:Z

    .line 106
    .line 107
    new-instance v4, LE5/I;

    .line 108
    .line 109
    invoke-direct {v4, v3}, LE5/I;-><init>(LE5/r;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Ls6/C;->setPlayer(LE5/w0;)V

    .line 113
    .line 114
    .line 115
    iput-object v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    invoke-virtual {v4, v3}, LE5/I;->I0(Z)V

    .line 119
    .line 120
    .line 121
    iget-object v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->s:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;

    .line 122
    .line 123
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v7, v4, LE5/I;->l:LK8/H;

    .line 127
    .line 128
    invoke-virtual {v7, v6}, LK8/H;->d(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-boolean v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->n:Z

    .line 132
    .line 133
    invoke-static {v4, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->b(LE5/I;Z)V

    .line 134
    .line 135
    .line 136
    iget-object v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->m:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v1, v4, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->a(LE5/I;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-wide v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->u:J

    .line 142
    .line 143
    invoke-virtual {v4}, LE5/I;->l0()I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v6, v7, v8, v3}, LE5/I;->E0(JIZ)V

    .line 151
    .line 152
    .line 153
    iget-boolean v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->r:Z

    .line 154
    .line 155
    if-eqz v6, :cond_1

    .line 156
    .line 157
    invoke-virtual {v4, v5}, LE5/I;->I0(Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {v4, v3}, LE5/I;->I0(Z)V

    .line 162
    .line 163
    .line 164
    :goto_0
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->g:LHf/x0;

    .line 165
    .line 166
    invoke-virtual {v3}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;

    .line 171
    .line 172
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_2

    .line 177
    .line 178
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;

    .line 179
    .line 180
    invoke-virtual {v4}, LE5/I;->r0()J

    .line 181
    .line 182
    .line 183
    move-result-wide v4

    .line 184
    invoke-direct {v3, v4, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;-><init>(J)V

    .line 185
    .line 186
    .line 187
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->f:LHf/x0;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    invoke-virtual {v1, v4, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    :cond_2
    iget-object v1, v2, Ls6/C;->d:Landroid/view/View;

    .line 197
    .line 198
    instance-of v2, v1, Landroid/opengl/GLSurfaceView;

    .line 199
    .line 200
    if-eqz v2, :cond_3

    .line 201
    .line 202
    check-cast v1, Landroid/opengl/GLSurfaceView;

    .line 203
    .line 204
    invoke-virtual {v1}, Landroid/opengl/GLSurfaceView;->onResume()V

    .line 205
    .line 206
    .line 207
    :cond_3
    :goto_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 208
    .line 209
    return-object v1

    .line 210
    :pswitch_3
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 213
    .line 214
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 215
    .line 216
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->d:LHf/x0;

    .line 217
    .line 218
    invoke-virtual {v1}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/D;

    .line 223
    .line 224
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;

    .line 225
    .line 226
    const-string v3, "position"

    .line 227
    .line 228
    if-eqz v2, :cond_4

    .line 229
    .line 230
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;

    .line 231
    .line 232
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 233
    .line 234
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 235
    .line 236
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 240
    .line 241
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;->d:Ljava/lang/String;

    .line 242
    .line 243
    if-eqz v3, :cond_8

    .line 244
    .line 245
    iget-object v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->j:LC8/i;

    .line 246
    .line 247
    invoke-virtual {v4, v2}, LC8/i;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 248
    .line 249
    .line 250
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/a;

    .line 251
    .line 252
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/e;)LEf/H0;

    .line 253
    .line 254
    .line 255
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 256
    .line 257
    invoke-interface {v1, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->a(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_4
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;

    .line 262
    .line 263
    if-eqz v2, :cond_5

    .line 264
    .line 265
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;

    .line 266
    .line 267
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 268
    .line 269
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 270
    .line 271
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    const/4 v3, 0x1

    .line 275
    invoke-virtual {v1, v3, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->b(ZLcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 276
    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_5
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/A;

    .line 280
    .line 281
    if-eqz v2, :cond_6

    .line 282
    .line 283
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 284
    .line 285
    const/4 v6, 0x0

    .line 286
    const/4 v7, 0x0

    .line 287
    const-string v4, "AdController"

    .line 288
    .line 289
    const-string v5, "Empty CTA DEC playlist item reached"

    .line 290
    .line 291
    const/16 v8, 0xc

    .line 292
    .line 293
    const/4 v9, 0x0

    .line 294
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_6
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/C;

    .line 299
    .line 300
    if-eqz v2, :cond_7

    .line 301
    .line 302
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 303
    .line 304
    const/4 v6, 0x0

    .line 305
    const/4 v7, 0x0

    .line 306
    const-string v4, "AdController"

    .line 307
    .line 308
    const-string v5, "Empty CTA Mraid playlist item reached"

    .line 309
    .line 310
    const/16 v8, 0xc

    .line 311
    .line 312
    const/4 v9, 0x0

    .line 313
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto :goto_2

    .line 317
    :cond_7
    if-nez v1, :cond_9

    .line 318
    .line 319
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const/4 v14, 0x0

    .line 323
    const-string v11, "AdController"

    .line 324
    .line 325
    const-string v12, "Empty CTA playlist item reached"

    .line 326
    .line 327
    const/16 v15, 0xc

    .line 328
    .line 329
    const/16 v16, 0x0

    .line 330
    .line 331
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_8
    :goto_2
    sget-object v1, Lef/C;->a:Lef/C;

    .line 335
    .line 336
    return-object v1

    .line 337
    :cond_9
    new-instance v1, LE5/Q;

    .line 338
    .line 339
    const/16 v2, 0x9

    .line 340
    .line 341
    const/4 v3, 0x0

    .line 342
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 343
    .line 344
    .line 345
    throw v1

    .line 346
    :pswitch_4
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 349
    .line 350
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 351
    .line 352
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->a()V

    .line 353
    .line 354
    .line 355
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 356
    .line 357
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/d;)LEf/H0;

    .line 358
    .line 359
    .line 360
    sget-object v1, Lef/C;->a:Lef/C;

    .line 361
    .line 362
    return-object v1

    .line 363
    :pswitch_5
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 366
    .line 367
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->s:LR8/a;

    .line 368
    .line 369
    iget-object v2, v1, LR8/a;->a:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v2, Ljava/lang/String;

    .line 372
    .line 373
    if-eqz v2, :cond_b

    .line 374
    .line 375
    iget-object v3, v1, LR8/a;->e:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;

    .line 378
    .line 379
    if-eqz v3, :cond_a

    .line 380
    .line 381
    invoke-virtual {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;->invoke()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    :cond_a
    iget-object v1, v1, LR8/a;->d:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 387
    .line 388
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;->a(Ljava/lang/String;)Z

    .line 389
    .line 390
    .line 391
    :cond_b
    sget-object v1, Lef/C;->a:Lef/C;

    .line 392
    .line 393
    return-object v1

    .line 394
    :pswitch_6
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 397
    .line 398
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->s:LR8/a;

    .line 399
    .line 400
    iget-object v1, v1, LR8/a;->f:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;

    .line 403
    .line 404
    if-eqz v1, :cond_c

    .line 405
    .line 406
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;->invoke()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    :cond_c
    sget-object v1, Lef/C;->a:Lef/C;

    .line 410
    .line 411
    return-object v1

    .line 412
    :pswitch_7
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;

    .line 415
    .line 416
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->j:LR8/a;

    .line 417
    .line 418
    iget-object v2, v1, LR8/a;->a:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v2, Ljava/lang/String;

    .line 421
    .line 422
    if-eqz v2, :cond_e

    .line 423
    .line 424
    iget-object v3, v1, LR8/a;->e:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;

    .line 427
    .line 428
    if-eqz v3, :cond_d

    .line 429
    .line 430
    invoke-virtual {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;->invoke()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    :cond_d
    iget-object v1, v1, LR8/a;->d:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 436
    .line 437
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;->a(Ljava/lang/String;)Z

    .line 438
    .line 439
    .line 440
    :cond_e
    sget-object v1, Lef/C;->a:Lef/C;

    .line 441
    .line 442
    return-object v1

    .line 443
    :pswitch_8
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;

    .line 446
    .line 447
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->j:LR8/a;

    .line 448
    .line 449
    iget-object v1, v1, LR8/a;->f:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;

    .line 452
    .line 453
    if-eqz v1, :cond_f

    .line 454
    .line 455
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;->invoke()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    :cond_f
    sget-object v1, Lef/C;->a:Lef/C;

    .line 459
    .line 460
    return-object v1

    .line 461
    :pswitch_9
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 464
    .line 465
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->f()V

    .line 466
    .line 467
    .line 468
    sget-object v1, Lef/C;->a:Lef/C;

    .line 469
    .line 470
    return-object v1

    .line 471
    :pswitch_a
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;

    .line 474
    .line 475
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;->d()V

    .line 476
    .line 477
    .line 478
    sget-object v1, Lef/C;->a:Lef/C;

    .line 479
    .line 480
    return-object v1

    .line 481
    :pswitch_b
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 484
    .line 485
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 486
    .line 487
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->f()V

    .line 488
    .line 489
    .line 490
    sget-object v1, Lef/C;->a:Lef/C;

    .line 491
    .line 492
    return-object v1

    .line 493
    :pswitch_c
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;

    .line 496
    .line 497
    invoke-static {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;->b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;)V

    .line 498
    .line 499
    .line 500
    sget-object v1, Lef/C;->a:Lef/C;

    .line 501
    .line 502
    return-object v1

    .line 503
    :pswitch_d
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 506
    .line 507
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/u;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/u;

    .line 511
    .line 512
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/r;

    .line 513
    .line 514
    const/4 v4, 0x0

    .line 515
    invoke-direct {v3, v1, v2, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/r;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/u;Ljf/c;)V

    .line 516
    .line 517
    .line 518
    const/4 v2, 0x3

    .line 519
    iget-object v5, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->b:LKd/a;

    .line 520
    .line 521
    invoke-static {v5, v4, v3, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 522
    .line 523
    .line 524
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 525
    .line 526
    if-eqz v1, :cond_10

    .line 527
    .line 528
    const-string v2, ""

    .line 529
    .line 530
    invoke-interface {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->d(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    :cond_10
    sget-object v1, Lef/C;->a:Lef/C;

    .line 534
    .line 535
    return-object v1

    .line 536
    :pswitch_e
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 539
    .line 540
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->j:LHf/x0;

    .line 541
    .line 542
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 543
    .line 544
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    const/4 v4, 0x0

    .line 548
    invoke-virtual {v2, v4, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 552
    .line 553
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->h:LHf/x0;

    .line 554
    .line 555
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1, v4, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    sget-object v1, Lef/C;->a:Lef/C;

    .line 562
    .line 563
    return-object v1

    .line 564
    :pswitch_f
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;

    .line 567
    .line 568
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;->h:LHf/x0;

    .line 569
    .line 570
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    const/4 v3, 0x0

    .line 576
    invoke-virtual {v1, v3, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    sget-object v1, Lef/C;->a:Lef/C;

    .line 580
    .line 581
    return-object v1

    .line 582
    :pswitch_10
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 585
    .line 586
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->o:LHf/x0;

    .line 587
    .line 588
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 589
    .line 590
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    const/4 v3, 0x0

    .line 594
    invoke-virtual {v1, v3, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    sget-object v1, Lef/C;->a:Lef/C;

    .line 598
    .line 599
    return-object v1

    .line 600
    :pswitch_11
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 603
    .line 604
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->destroy()V

    .line 605
    .line 606
    .line 607
    sget-object v1, Lef/C;->a:Lef/C;

    .line 608
    .line 609
    return-object v1

    .line 610
    :pswitch_12
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v1, Lcom/moloco/sdk/internal/publisher/nativead/c;

    .line 613
    .line 614
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/publisher/nativead/c;->handleGeneralAdClick()V

    .line 615
    .line 616
    .line 617
    sget-object v1, Lef/C;->a:Lef/C;

    .line 618
    .line 619
    return-object v1

    .line 620
    :pswitch_13
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v1, Landroidx/activity/w;

    .line 623
    .line 624
    invoke-virtual {v1}, Landroidx/activity/w;->d()V

    .line 625
    .line 626
    .line 627
    sget-object v1, Lef/C;->a:Lef/C;

    .line 628
    .line 629
    return-object v1

    .line 630
    :pswitch_14
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v1, Landroidx/activity/w;

    .line 633
    .line 634
    invoke-virtual {v1}, Landroidx/activity/w;->d()V

    .line 635
    .line 636
    .line 637
    sget-object v1, Lef/C;->a:Lef/C;

    .line 638
    .line 639
    return-object v1

    .line 640
    :pswitch_15
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v1, LS8/e;

    .line 643
    .line 644
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    invoke-virtual {v1}, Landroid/os/Looper;->isCurrentThread()Z

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    xor-int/lit8 v1, v1, 0x1

    .line 656
    .line 657
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    return-object v1

    .line 662
    :pswitch_16
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v1, LS8/e;

    .line 665
    .line 666
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    const-string v2, "threadName"

    .line 678
    .line 679
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    const/4 v2, 0x0

    .line 683
    const-string v3, "Firebase Blocking Thread #"

    .line 684
    .line 685
    invoke-static {v1, v3, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    return-object v1

    .line 694
    :pswitch_17
    iget-object v1, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v1, LS8/e;

    .line 697
    .line 698
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    const-string v2, "threadName"

    .line 710
    .line 711
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    const/4 v2, 0x0

    .line 715
    const-string v3, "Firebase Background Thread #"

    .line 716
    .line 717
    invoke-static {v1, v3, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 718
    .line 719
    .line 720
    move-result v1

    .line 721
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    return-object v1

    .line 726
    nop

    .line 727
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
