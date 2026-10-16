.class public final Lio/flutter/plugin/platform/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/g;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/flutter/plugin/platform/n;->a:I

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/flutter/plugin/platform/n;->a:I

    iput-object p1, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->setSize(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(I)V
    .locals 3

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 9
    .line 10
    iget-object v0, v0, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lio/flutter/plugin/platform/e;

    .line 17
    .line 18
    const-string v1, "PlatformViewsController2"

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, "Clearing focus on an unknown view with id: "

    .line 23
    .line 24
    invoke-static {p1, v0, v1}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {v0}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, "Clearing focus on a null view with id: "

    .line 35
    .line 36
    invoke-static {p1, v0, v1}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lio/flutter/plugin/platform/q;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->c(I)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const-string v2, "PlatformViewsController"

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object v0, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lio/flutter/plugin/platform/B;

    .line 67
    .line 68
    invoke-virtual {v0}, Lio/flutter/plugin/platform/B;->a()Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object v0, v0, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lio/flutter/plugin/platform/e;

    .line 80
    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    const-string v0, "Clearing focus on an unknown view with id: "

    .line 84
    .line 85
    invoke-static {p1, v0, v2}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-interface {v0}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_1
    if-nez v0, :cond_4

    .line 94
    .line 95
    const-string v0, "Clearing focus on a null view with id: "

    .line 96
    .line 97
    invoke-static {p1, v0, v2}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 102
    .line 103
    .line 104
    :goto_2
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ltc/d;)J
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    iget-object v4, v3, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v4, Lio/flutter/plugin/platform/q;

    .line 10
    .line 11
    invoke-static {v4, v0}, Lio/flutter/plugin/platform/q;->e(Lio/flutter/plugin/platform/q;Ltc/d;)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, Lio/flutter/plugin/platform/q;->n:Landroid/util/SparseArray;

    .line 15
    .line 16
    iget v6, v0, Ltc/d;->a:I

    .line 17
    .line 18
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    if-nez v7, :cond_e

    .line 23
    .line 24
    iget-object v7, v4, Lio/flutter/plugin/platform/q;->e:Lio/flutter/embedding/engine/renderer/k;

    .line 25
    .line 26
    if-eqz v7, :cond_d

    .line 27
    .line 28
    iget-object v7, v4, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 29
    .line 30
    if-eqz v7, :cond_c

    .line 31
    .line 32
    invoke-virtual {v4, v0, v2}, Lio/flutter/plugin/platform/q;->f(Ltc/d;Z)Lio/flutter/plugin/platform/e;

    .line 33
    .line 34
    .line 35
    move-result-object v12

    .line 36
    invoke-interface {v12}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    if-nez v8, :cond_b

    .line 45
    .line 46
    sget-object v8, Lio/flutter/plugin/platform/q;->w:[Ljava/lang/Class;

    .line 47
    .line 48
    new-instance v9, Lcom/unity3d/services/core/webview/b;

    .line 49
    .line 50
    const/16 v10, 0x12

    .line 51
    .line 52
    invoke-direct {v9, v8, v10}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v7, v9}, LS3/f;->P(Landroid/view/View;Lld/c;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-wide v8, v0, Ltc/d;->d:D

    .line 60
    .line 61
    iget-wide v10, v0, Ltc/d;->c:D

    .line 62
    .line 63
    if-nez v7, :cond_0

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_0
    const/4 v7, 0x2

    .line 68
    iget v13, v0, Ltc/d;->h:I

    .line 69
    .line 70
    if-ne v13, v7, :cond_1

    .line 71
    .line 72
    const/16 v0, 0x13

    .line 73
    .line 74
    invoke-static {v0}, Lio/flutter/plugin/platform/q;->h(I)V

    .line 75
    .line 76
    .line 77
    const-wide/16 v0, -0x2

    .line 78
    .line 79
    return-wide v0

    .line 80
    :cond_1
    iget-boolean v7, v4, Lio/flutter/plugin/platform/q;->u:Z

    .line 81
    .line 82
    if-nez v7, :cond_6

    .line 83
    .line 84
    const/16 v1, 0x14

    .line 85
    .line 86
    invoke-static {v1}, Lio/flutter/plugin/platform/q;->h(I)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v4, Lio/flutter/plugin/platform/q;->e:Lio/flutter/embedding/engine/renderer/k;

    .line 90
    .line 91
    invoke-static {v1}, Lio/flutter/plugin/platform/q;->l(Lio/flutter/embedding/engine/renderer/k;)Lio/flutter/plugin/platform/g;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-virtual {v4, v10, v11}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {v4, v8, v9}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    iget-object v9, v4, Lio/flutter/plugin/platform/q;->c:Landroid/app/Activity;

    .line 104
    .line 105
    new-instance v7, Lio/flutter/plugin/platform/l;

    .line 106
    .line 107
    invoke-direct {v7, v4, v0, v2}, Lio/flutter/plugin/platform/l;-><init>(Lio/flutter/plugin/platform/q;Ltc/d;I)V

    .line 108
    .line 109
    .line 110
    sget-object v2, Lio/flutter/plugin/platform/B;->i:Lio/flutter/plugin/platform/y;

    .line 111
    .line 112
    const/4 v2, 0x0

    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    if-nez v5, :cond_2

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    const-string v8, "display"

    .line 119
    .line 120
    invoke-virtual {v9, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    move-object v14, v8

    .line 125
    check-cast v14, Landroid/hardware/display/DisplayManager;

    .line 126
    .line 127
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-interface {v13, v1, v5}, Lio/flutter/plugin/platform/g;->a(II)V

    .line 136
    .line 137
    .line 138
    new-instance v10, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v11, "flutter-vd#"

    .line 141
    .line 142
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget v11, v0, Ltc/d;->a:I

    .line 146
    .line 147
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    iget v8, v8, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 155
    .line 156
    invoke-interface {v13}, Lio/flutter/plugin/platform/g;->getSurface()Landroid/view/Surface;

    .line 157
    .line 158
    .line 159
    move-result-object v19

    .line 160
    sget-object v21, Lio/flutter/plugin/platform/B;->i:Lio/flutter/plugin/platform/y;

    .line 161
    .line 162
    const/16 v22, 0x0

    .line 163
    .line 164
    const/16 v20, 0x0

    .line 165
    .line 166
    move/from16 v16, v1

    .line 167
    .line 168
    move/from16 v17, v5

    .line 169
    .line 170
    move/from16 v18, v8

    .line 171
    .line 172
    invoke-virtual/range {v14 .. v22}, Landroid/hardware/display/DisplayManager;->createVirtualDisplay(Ljava/lang/String;IIILandroid/view/Surface;ILandroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-nez v1, :cond_3

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_3
    new-instance v8, Lio/flutter/plugin/platform/B;

    .line 180
    .line 181
    iget-object v10, v4, Lio/flutter/plugin/platform/q;->h:Lio/flutter/plugin/platform/a;

    .line 182
    .line 183
    move-object v14, v7

    .line 184
    move v15, v11

    .line 185
    move-object v11, v1

    .line 186
    invoke-direct/range {v8 .. v15}, Lio/flutter/plugin/platform/B;-><init>(Landroid/app/Activity;Lio/flutter/plugin/platform/a;Landroid/hardware/display/VirtualDisplay;Lio/flutter/plugin/platform/e;Lio/flutter/plugin/platform/g;Lio/flutter/plugin/platform/l;I)V

    .line 187
    .line 188
    .line 189
    move-object v2, v8

    .line 190
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 191
    .line 192
    iget-object v0, v4, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    .line 193
    .line 194
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    invoke-interface {v12}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v1, v4, Lio/flutter/plugin/platform/q;->j:Ljava/util/HashMap;

    .line 206
    .line 207
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-interface {v13}, Lio/flutter/plugin/platform/g;->getId()J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    return-wide v0

    .line 219
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 220
    .line 221
    new-instance v2, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v4, "Failed creating virtual display for a "

    .line 224
    .line 225
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, v0, Ltc/d;->b:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v0, " with id: "

    .line 234
    .line 235
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v1

    .line 249
    :cond_6
    :goto_1
    const/16 v2, 0x17

    .line 250
    .line 251
    invoke-static {v2}, Lio/flutter/plugin/platform/q;->h(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v10, v11}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    invoke-virtual {v4, v8, v9}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    iget-boolean v8, v4, Lio/flutter/plugin/platform/q;->u:Z

    .line 263
    .line 264
    if-eqz v8, :cond_7

    .line 265
    .line 266
    new-instance v8, Lio/flutter/plugin/platform/i;

    .line 267
    .line 268
    iget-object v9, v4, Lio/flutter/plugin/platform/q;->c:Landroid/app/Activity;

    .line 269
    .line 270
    invoke-direct {v8, v9}, Lio/flutter/plugin/platform/i;-><init>(Landroid/app/Activity;)V

    .line 271
    .line 272
    .line 273
    const-wide/16 v9, -0x1

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_7
    iget-object v8, v4, Lio/flutter/plugin/platform/q;->e:Lio/flutter/embedding/engine/renderer/k;

    .line 277
    .line 278
    invoke-static {v8}, Lio/flutter/plugin/platform/q;->l(Lio/flutter/embedding/engine/renderer/k;)Lio/flutter/plugin/platform/g;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    new-instance v9, Lio/flutter/plugin/platform/i;

    .line 283
    .line 284
    iget-object v10, v4, Lio/flutter/plugin/platform/q;->c:Landroid/app/Activity;

    .line 285
    .line 286
    invoke-direct {v9, v10}, Lio/flutter/plugin/platform/i;-><init>(Landroid/app/Activity;)V

    .line 287
    .line 288
    .line 289
    iput-object v8, v9, Lio/flutter/plugin/platform/i;->f:Lio/flutter/plugin/platform/g;

    .line 290
    .line 291
    invoke-interface {v8}, Lio/flutter/plugin/platform/g;->getSurface()Landroid/view/Surface;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    if-eqz v10, :cond_8

    .line 296
    .line 297
    invoke-virtual {v10}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    :try_start_0
    sget-object v13, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 302
    .line 303
    invoke-virtual {v11, v1, v13}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    .line 305
    .line 306
    invoke-virtual {v10, v11}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 307
    .line 308
    .line 309
    goto :goto_2

    .line 310
    :catchall_0
    move-exception v0

    .line 311
    invoke-virtual {v10, v11}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 312
    .line 313
    .line 314
    throw v0

    .line 315
    :cond_8
    :goto_2
    invoke-interface {v8}, Lio/flutter/plugin/platform/g;->getId()J

    .line 316
    .line 317
    .line 318
    move-result-wide v10

    .line 319
    move-object v8, v9

    .line 320
    move-wide v9, v10

    .line 321
    :goto_3
    iget-object v11, v4, Lio/flutter/plugin/platform/q;->b:Lkc/a;

    .line 322
    .line 323
    invoke-virtual {v8, v11}, Lio/flutter/plugin/platform/i;->setTouchProcessor(Lkc/a;)V

    .line 324
    .line 325
    .line 326
    iget-object v11, v8, Lio/flutter/plugin/platform/i;->f:Lio/flutter/plugin/platform/g;

    .line 327
    .line 328
    if-eqz v11, :cond_9

    .line 329
    .line 330
    invoke-interface {v11, v2, v7}, Lio/flutter/plugin/platform/g;->a(II)V

    .line 331
    .line 332
    .line 333
    :cond_9
    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 334
    .line 335
    invoke-direct {v11, v2, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 336
    .line 337
    .line 338
    iget-wide v13, v0, Ltc/d;->e:D

    .line 339
    .line 340
    invoke-virtual {v4, v13, v14}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 341
    .line 342
    .line 343
    move-result v13

    .line 344
    iget-wide v14, v0, Ltc/d;->f:D

    .line 345
    .line 346
    invoke-virtual {v4, v14, v15}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 347
    .line 348
    .line 349
    move-result v14

    .line 350
    iput v13, v11, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 351
    .line 352
    iput v14, v11, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 353
    .line 354
    invoke-virtual {v8, v11}, Lio/flutter/plugin/platform/i;->setLayoutParams(Landroid/widget/FrameLayout$LayoutParams;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v12}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    new-instance v13, Landroid/widget/FrameLayout$LayoutParams;

    .line 362
    .line 363
    invoke-direct {v13, v2, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v11, v13}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 367
    .line 368
    .line 369
    const/4 v2, 0x4

    .line 370
    invoke-virtual {v11, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 374
    .line 375
    .line 376
    new-instance v2, Lio/flutter/plugin/platform/l;

    .line 377
    .line 378
    invoke-direct {v2, v4, v0, v1}, Lio/flutter/plugin/platform/l;-><init>(Lio/flutter/plugin/platform/q;Ltc/d;I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v8, v2}, Lio/flutter/plugin/platform/i;->setOnDescendantFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 382
    .line 383
    .line 384
    iget-object v0, v4, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 385
    .line 386
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v5, v6, v8}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    iget-object v0, v4, Lio/flutter/plugin/platform/q;->d:Lkc/r;

    .line 393
    .line 394
    if-nez v0, :cond_a

    .line 395
    .line 396
    return-wide v9

    .line 397
    :cond_a
    invoke-interface {v12, v0}, Lio/flutter/plugin/platform/e;->onFlutterViewAttached(Landroid/view/View;)V

    .line 398
    .line 399
    .line 400
    return-wide v9

    .line 401
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 402
    .line 403
    const-string v1, "The Android view returned from PlatformView#getView() was already added to a parent view."

    .line 404
    .line 405
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v0

    .line 409
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 410
    .line 411
    const-string v1, "Flutter view is null. This means the platform views controller doesn\'t have an attached view, view id: "

    .line 412
    .line 413
    invoke-static {v6, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    throw v0

    .line 421
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 422
    .line 423
    const-string v1, "Texture registry is null. This means that platform views controller was detached, view id: "

    .line 424
    .line 425
    invoke-static {v6, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v0

    .line 433
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 434
    .line 435
    const-string v1, "Trying to create an already created platform view, view id: "

    .line 436
    .line 437
    invoke-static {v6, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw v0
.end method

.method public d(LM2/d;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 4
    .line 5
    iget-object v1, v0, Lio/flutter/plugin/platform/p;->a:Lio/flutter/plugin/platform/n;

    .line 6
    .line 7
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v2, p1, LM2/d;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lio/flutter/plugin/platform/f;

    .line 20
    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    iget-object v2, p1, LM2/d;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Lio/flutter/plugin/platform/f;->getCreateArgsCodec()Luc/n;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3, v2}, Luc/n;->b(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    :goto_0
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->c:Landroid/app/Activity;

    .line 40
    .line 41
    iget v4, p1, LM2/d;->b:I

    .line 42
    .line 43
    invoke-virtual {v1, v3, v4, v2}, Lio/flutter/plugin/platform/f;->create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/e;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iget p1, p1, LM2/d;->c:I

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v0, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 59
    .line 60
    invoke-virtual {p1, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, v0, Lio/flutter/plugin/platform/p;->d:Lkc/r;

    .line 64
    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    invoke-interface {v1, p1}, Lio/flutter/plugin/platform/e;->onFlutterViewAttached(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v0, "PlatformView#getView() returned null, but an Android view reference was expected."

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v1, "Trying to create a platform view of unregistered type: "

    .line 85
    .line 86
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public e(I)V
    .locals 5

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 9
    .line 10
    iget-object v1, v0, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lio/flutter/plugin/platform/e;

    .line 17
    .line 18
    const-string v2, "PlatformViewsController2"

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const-string v0, "Disposing unknown platform view with id: "

    .line 23
    .line 24
    invoke-static {p1, v0, v2}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-interface {v1}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v3, v0, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 50
    .line 51
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-interface {v1}, Lio/flutter/plugin/platform/e;->dispose()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception v1

    .line 59
    const-string v3, "Disposing platform view threw an exception"

    .line 60
    .line 61
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object v0, v0, Lio/flutter/plugin/platform/p;->j:Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lpc/a;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lpc/a;->a()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Landroid/view/ViewGroup;

    .line 85
    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_1
    return-void

    .line 95
    :pswitch_0
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lio/flutter/plugin/platform/q;

    .line 98
    .line 99
    iget-object v1, v0, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lio/flutter/plugin/platform/e;

    .line 106
    .line 107
    const-string v2, "PlatformViewsController"

    .line 108
    .line 109
    if-nez v1, :cond_4

    .line 110
    .line 111
    const-string v0, "Disposing unknown platform view with id: "

    .line 112
    .line 113
    invoke-static {p1, v0, v2}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_4
    invoke-interface {v1}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    invoke-interface {v1}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    check-cast v4, Landroid/view/ViewGroup;

    .line 133
    .line 134
    if-eqz v4, :cond_5

    .line 135
    .line 136
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 140
    .line 141
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 142
    .line 143
    .line 144
    :try_start_1
    invoke-interface {v1}, Lio/flutter/plugin/platform/e;->dispose()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :catch_1
    move-exception v1

    .line 149
    const-string v3, "Disposing platform view threw an exception"

    .line 150
    .line 151
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 152
    .line 153
    .line 154
    :goto_2
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->c(I)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_7

    .line 159
    .line 160
    iget-object v1, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    .line 161
    .line 162
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Lio/flutter/plugin/platform/B;

    .line 171
    .line 172
    invoke-virtual {v2}, Lio/flutter/plugin/platform/B;->a()Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    if-eqz v3, :cond_6

    .line 177
    .line 178
    iget-object v0, v0, Lio/flutter/plugin/platform/q;->j:Ljava/util/HashMap;

    .line 179
    .line 180
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_6
    iget-object v0, v2, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 188
    .line 189
    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    .line 190
    .line 191
    .line 192
    iget-object v0, v2, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 193
    .line 194
    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->detachState()Lio/flutter/plugin/platform/v;

    .line 195
    .line 196
    .line 197
    iget-object v0, v2, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroid/hardware/display/VirtualDisplay;->release()V

    .line 200
    .line 201
    .line 202
    iget-object v0, v2, Lio/flutter/plugin/platform/B;->f:Lio/flutter/plugin/platform/g;

    .line 203
    .line 204
    invoke-interface {v0}, Lio/flutter/plugin/platform/g;->release()V

    .line 205
    .line 206
    .line 207
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_7
    iget-object v1, v0, Lio/flutter/plugin/platform/q;->n:Landroid/util/SparseArray;

    .line 216
    .line 217
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Lio/flutter/plugin/platform/i;

    .line 222
    .line 223
    if-eqz v2, :cond_b

    .line 224
    .line 225
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 226
    .line 227
    .line 228
    iget-object v0, v2, Lio/flutter/plugin/platform/i;->f:Lio/flutter/plugin/platform/g;

    .line 229
    .line 230
    const/4 v3, 0x0

    .line 231
    if-eqz v0, :cond_8

    .line 232
    .line 233
    invoke-interface {v0}, Lio/flutter/plugin/platform/g;->release()V

    .line 234
    .line 235
    .line 236
    iput-object v3, v2, Lio/flutter/plugin/platform/i;->f:Lio/flutter/plugin/platform/g;

    .line 237
    .line 238
    :cond_8
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_9

    .line 247
    .line 248
    iget-object v4, v2, Lio/flutter/plugin/platform/i;->g:Lio/flutter/plugin/platform/h;

    .line 249
    .line 250
    if-eqz v4, :cond_9

    .line 251
    .line 252
    iput-object v3, v2, Lio/flutter/plugin/platform/i;->g:Lio/flutter/plugin/platform/h;

    .line 253
    .line 254
    invoke-virtual {v0, v4}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 255
    .line 256
    .line 257
    :cond_9
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Landroid/view/ViewGroup;

    .line 262
    .line 263
    if-eqz v0, :cond_a

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 266
    .line 267
    .line 268
    :cond_a
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 269
    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_b
    iget-object v0, v0, Lio/flutter/plugin/platform/q;->l:Landroid/util/SparseArray;

    .line 273
    .line 274
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, Lpc/a;

    .line 279
    .line 280
    if-eqz v1, :cond_d

    .line 281
    .line 282
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Lpc/a;->a()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    check-cast v2, Landroid/view/ViewGroup;

    .line 293
    .line 294
    if-eqz v2, :cond_c

    .line 295
    .line 296
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 297
    .line 298
    .line 299
    :cond_c
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 300
    .line 301
    .line 302
    :cond_d
    :goto_3
    return-void

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ltc/b;)Ljava/lang/CharSequence;
    .locals 8

    .line 1
    const-string v0, "PlatformPlugin"

    .line 2
    .line 3
    const-string v1, "Clipboard item contains a Uri with scheme \'"

    .line 4
    .line 5
    iget-object v2, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LN2/j;

    .line 8
    .line 9
    iget-object v2, v2, LN2/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/app/Activity;

    .line 12
    .line 13
    const-string v3, "clipboard"

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroid/content/ClipboardManager;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    invoke-virtual {v3}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    if-eqz p1, :cond_3

    .line 37
    .line 38
    sget-object v4, Ltc/b;->a:Ltc/b;

    .line 39
    .line 40
    if-ne p1, v4, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    return-object v5

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :catch_1
    move-exception p1

    .line 47
    goto :goto_4

    .line 48
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 49
    invoke-virtual {v3, p1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 54
    .line 55
    .line 56
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    if-nez v3, :cond_7

    .line 58
    .line 59
    :try_start_1
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    const-string p1, "Clipboard item contained no textual content nor a URI to retrieve it from."

    .line 66
    .line 67
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    return-object v5

    .line 71
    :goto_2
    move-object v5, v3

    .line 72
    goto :goto_3

    .line 73
    :catch_2
    move-exception p1

    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const-string v7, "content"

    .line 80
    .line 81
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_5

    .line 86
    .line 87
    new-instance p1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, "\'that is unhandled."

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    return-object v5

    .line 108
    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v6, "text/*"

    .line 113
    .line 114
    invoke-virtual {v1, v4, v6, v5}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {p1, v2}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    :try_start_2
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :catch_3
    move-exception v1

    .line 129
    move-object v5, p1

    .line 130
    move-object p1, v1

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    return-object p1

    .line 133
    :cond_7
    return-object v3

    .line 134
    :goto_3
    const-string v1, "Failed to close AssetFileDescriptor while trying to read text from URI."

    .line 135
    .line 136
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :catch_4
    const-string p1, "Clipboard text was unable to be received from content URI."

    .line 141
    .line 142
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :goto_4
    const-string v1, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"

    .line 147
    .line 148
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 149
    .line 150
    .line 151
    :goto_5
    return-object v5
.end method

.method public g(IDD)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/platform/q;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->c(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, v0, Lio/flutter/plugin/platform/q;->n:Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lio/flutter/plugin/platform/i;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string p2, "Setting offset for unknown platform view with id: "

    .line 23
    .line 24
    const-string p3, "PlatformViewsController"

    .line 25
    .line 26
    invoke-static {p1, p2, p3}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-virtual {v0, p2, p3}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v0, p4, p5}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    check-cast p3, Landroid/widget/FrameLayout$LayoutParams;

    .line 43
    .line 44
    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 45
    .line 46
    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 47
    .line 48
    invoke-virtual {v1, p3}, Lio/flutter/plugin/platform/i;->setLayoutParams(Landroid/widget/FrameLayout$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getId()J
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->id()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->getSurface()Landroid/view/Surface;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public h(Ltc/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/platform/q;

    .line 4
    .line 5
    iget-object v1, v0, Lio/flutter/plugin/platform/q;->c:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 16
    .line 17
    iget v2, p1, Ltc/f;->a:I

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lio/flutter/plugin/platform/q;->c(I)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lio/flutter/plugin/platform/B;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v0, v1, p1, v3}, Lio/flutter/plugin/platform/q;->n(FLtc/f;Z)Landroid/view/MotionEvent;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, v2, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    iget-object v3, v0, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lio/flutter/plugin/platform/e;

    .line 58
    .line 59
    const-string v4, "PlatformViewsController"

    .line 60
    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    const-string p1, "Sending touch to an unknown view with id: "

    .line 64
    .line 65
    invoke-static {v2, p1, v4}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-interface {v3}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_3

    .line 74
    .line 75
    const-string p1, "Sending touch to a null view with id: "

    .line 76
    .line 77
    invoke-static {v2, p1, v4}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    const/4 v2, 0x0

    .line 82
    invoke-virtual {v0, v1, p1, v2}, Lio/flutter/plugin/platform/q;->n(FLtc/f;Z)Landroid/view/MotionEvent;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v3, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public i(Ltc/f;)V
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lio/flutter/plugin/platform/p;

    .line 8
    .line 9
    iget-object v3, v2, Lio/flutter/plugin/platform/p;->c:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 20
    .line 21
    iget-object v4, v2, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 22
    .line 23
    iget v5, v0, Ltc/f;->a:I

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lio/flutter/plugin/platform/e;

    .line 30
    .line 31
    const-string v6, "PlatformViewsController2"

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    const-string v0, "Sending touch to an unknown view with id: "

    .line 36
    .line 37
    invoke-static {v5, v0, v6}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-interface {v4}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    const-string v0, "Sending touch to a null view with id: "

    .line 48
    .line 49
    invoke-static {v5, v0, v6}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance v5, Lkc/A;

    .line 54
    .line 55
    iget-wide v6, v0, Ltc/f;->p:J

    .line 56
    .line 57
    invoke-direct {v5, v6, v7}, Lkc/A;-><init>(J)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v2, Lio/flutter/plugin/platform/p;->k:Lba/a;

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Lba/a;->I(Lkc/A;)Landroid/view/MotionEvent;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v5, v0, Ltc/f;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, Ljava/util/List;

    .line 69
    .line 70
    new-instance v6, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    const/4 v8, 0x1

    .line 84
    const/4 v9, 0x0

    .line 85
    if-eqz v7, :cond_2

    .line 86
    .line 87
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    check-cast v7, Ljava/util/List;

    .line 92
    .line 93
    new-instance v10, Landroid/view/MotionEvent$PointerCoords;

    .line 94
    .line 95
    invoke-direct {v10}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    check-cast v9, Ljava/lang/Double;

    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 105
    .line 106
    .line 107
    move-result-wide v11

    .line 108
    double-to-float v9, v11

    .line 109
    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->orientation:F

    .line 110
    .line 111
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    check-cast v8, Ljava/lang/Double;

    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 118
    .line 119
    .line 120
    move-result-wide v8

    .line 121
    double-to-float v8, v8

    .line 122
    iput v8, v10, Landroid/view/MotionEvent$PointerCoords;->pressure:F

    .line 123
    .line 124
    const/4 v8, 0x2

    .line 125
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    check-cast v8, Ljava/lang/Double;

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 132
    .line 133
    .line 134
    move-result-wide v8

    .line 135
    double-to-float v8, v8

    .line 136
    iput v8, v10, Landroid/view/MotionEvent$PointerCoords;->size:F

    .line 137
    .line 138
    const/4 v8, 0x3

    .line 139
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    check-cast v8, Ljava/lang/Double;

    .line 144
    .line 145
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 146
    .line 147
    .line 148
    move-result-wide v8

    .line 149
    float-to-double v11, v3

    .line 150
    mul-double/2addr v8, v11

    .line 151
    double-to-float v8, v8

    .line 152
    iput v8, v10, Landroid/view/MotionEvent$PointerCoords;->toolMajor:F

    .line 153
    .line 154
    const/4 v8, 0x4

    .line 155
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    check-cast v8, Ljava/lang/Double;

    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 162
    .line 163
    .line 164
    move-result-wide v8

    .line 165
    mul-double/2addr v8, v11

    .line 166
    double-to-float v8, v8

    .line 167
    iput v8, v10, Landroid/view/MotionEvent$PointerCoords;->toolMinor:F

    .line 168
    .line 169
    const/4 v8, 0x5

    .line 170
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    check-cast v8, Ljava/lang/Double;

    .line 175
    .line 176
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 177
    .line 178
    .line 179
    move-result-wide v8

    .line 180
    mul-double/2addr v8, v11

    .line 181
    double-to-float v8, v8

    .line 182
    iput v8, v10, Landroid/view/MotionEvent$PointerCoords;->touchMajor:F

    .line 183
    .line 184
    const/4 v8, 0x6

    .line 185
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    check-cast v8, Ljava/lang/Double;

    .line 190
    .line 191
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 192
    .line 193
    .line 194
    move-result-wide v8

    .line 195
    mul-double/2addr v8, v11

    .line 196
    double-to-float v8, v8

    .line 197
    iput v8, v10, Landroid/view/MotionEvent$PointerCoords;->touchMinor:F

    .line 198
    .line 199
    const/4 v8, 0x7

    .line 200
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    check-cast v8, Ljava/lang/Double;

    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 207
    .line 208
    .line 209
    move-result-wide v8

    .line 210
    mul-double/2addr v8, v11

    .line 211
    double-to-float v8, v8

    .line 212
    iput v8, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 213
    .line 214
    const/16 v8, 0x8

    .line 215
    .line 216
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    check-cast v7, Ljava/lang/Double;

    .line 221
    .line 222
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 223
    .line 224
    .line 225
    move-result-wide v7

    .line 226
    mul-double/2addr v7, v11

    .line 227
    double-to-float v7, v7

    .line 228
    iput v7, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 229
    .line 230
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_2
    iget v3, v0, Ltc/f;->e:I

    .line 236
    .line 237
    new-array v5, v3, [Landroid/view/MotionEvent$PointerCoords;

    .line 238
    .line 239
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    check-cast v5, [Landroid/view/MotionEvent$PointerCoords;

    .line 244
    .line 245
    if-eqz v2, :cond_4

    .line 246
    .line 247
    array-length v0, v5

    .line 248
    if-ge v0, v8, :cond_3

    .line 249
    .line 250
    goto/16 :goto_2

    .line 251
    .line 252
    :cond_3
    aget-object v0, v5, v9

    .line 253
    .line 254
    iget v0, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 255
    .line 256
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    sub-float/2addr v0, v3

    .line 261
    aget-object v3, v5, v9

    .line 262
    .line 263
    iget v3, v3, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 264
    .line 265
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    sub-float/2addr v3, v5

    .line 270
    invoke-virtual {v2, v0, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_2

    .line 274
    .line 275
    :cond_4
    iget-object v2, v0, Ltc/f;->f:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v2, Ljava/util/List;

    .line 278
    .line 279
    new-instance v6, Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    if-eqz v7, :cond_5

    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    check-cast v7, Ljava/util/List;

    .line 299
    .line 300
    new-instance v10, Landroid/view/MotionEvent$PointerProperties;

    .line 301
    .line 302
    invoke-direct {v10}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    check-cast v11, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    iput v11, v10, Landroid/view/MotionEvent$PointerProperties;->id:I

    .line 316
    .line 317
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    check-cast v7, Ljava/lang/Integer;

    .line 322
    .line 323
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result v7

    .line 327
    iput v7, v10, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    .line 328
    .line 329
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_1

    .line 333
    :cond_5
    new-array v2, v3, [Landroid/view/MotionEvent$PointerProperties;

    .line 334
    .line 335
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    move-object/from16 v16, v2

    .line 340
    .line 341
    check-cast v16, [Landroid/view/MotionEvent$PointerProperties;

    .line 342
    .line 343
    iget-object v2, v0, Ltc/f;->b:Ljava/lang/Number;

    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v10

    .line 349
    iget-object v2, v0, Ltc/f;->c:Ljava/lang/Number;

    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 352
    .line 353
    .line 354
    move-result-wide v12

    .line 355
    iget v2, v0, Ltc/f;->n:I

    .line 356
    .line 357
    iget v3, v0, Ltc/f;->o:I

    .line 358
    .line 359
    iget v14, v0, Ltc/f;->d:I

    .line 360
    .line 361
    iget v15, v0, Ltc/f;->e:I

    .line 362
    .line 363
    iget v6, v0, Ltc/f;->h:I

    .line 364
    .line 365
    iget v7, v0, Ltc/f;->i:I

    .line 366
    .line 367
    iget v8, v0, Ltc/f;->j:F

    .line 368
    .line 369
    iget v9, v0, Ltc/f;->k:F

    .line 370
    .line 371
    iget v1, v0, Ltc/f;->l:I

    .line 372
    .line 373
    iget v0, v0, Ltc/f;->m:I

    .line 374
    .line 375
    move/from16 v23, v0

    .line 376
    .line 377
    move/from16 v22, v1

    .line 378
    .line 379
    move/from16 v24, v2

    .line 380
    .line 381
    move/from16 v25, v3

    .line 382
    .line 383
    move-object/from16 v17, v5

    .line 384
    .line 385
    move/from16 v18, v6

    .line 386
    .line 387
    move/from16 v19, v7

    .line 388
    .line 389
    move/from16 v20, v8

    .line 390
    .line 391
    move/from16 v21, v9

    .line 392
    .line 393
    invoke-static/range {v10 .. v25}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    :goto_2
    invoke-virtual {v4, v2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 398
    .line 399
    .line 400
    return-void
.end method

.method public j(Ljava/lang/String;Lio/flutter/plugin/platform/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public k(Ltc/e;LKa/b;)V
    .locals 17

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
    iget-object v3, v0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lio/flutter/plugin/platform/q;

    .line 10
    .line 11
    iget-wide v4, v1, Ltc/e;->b:D

    .line 12
    .line 13
    invoke-virtual {v3, v4, v5}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-wide v4, v1, Ltc/e;->c:D

    .line 18
    .line 19
    invoke-virtual {v3, v4, v5}, Lio/flutter/plugin/platform/q;->o(D)I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    iget v1, v1, Ltc/e;->a:I

    .line 24
    .line 25
    invoke-virtual {v3, v1}, Lio/flutter/plugin/platform/q;->c(I)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_6

    .line 30
    .line 31
    invoke-virtual {v3}, Lio/flutter/plugin/platform/q;->j()F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v5, v3, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lio/flutter/plugin/platform/B;

    .line 46
    .line 47
    iget-object v3, v3, Lio/flutter/plugin/platform/q;->f:Lio/flutter/plugin/editing/i;

    .line 48
    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v5, v3, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 53
    .line 54
    iget v5, v5, LD9/n;->b:I

    .line 55
    .line 56
    const/4 v6, 0x3

    .line 57
    if-ne v5, v6, :cond_1

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    iput-boolean v5, v3, Lio/flutter/plugin/editing/i;->p:Z

    .line 61
    .line 62
    :cond_1
    iget-object v3, v1, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 63
    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {v3}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/e;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object v3, v1, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 74
    .line 75
    invoke-virtual {v3}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/e;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v3}, Lio/flutter/plugin/platform/e;->onInputConnectionLocked()V

    .line 80
    .line 81
    .line 82
    :cond_3
    :goto_0
    new-instance v3, Lio/flutter/plugin/platform/m;

    .line 83
    .line 84
    invoke-direct {v3, v0, v1, v4, v2}, Lio/flutter/plugin/platform/m;-><init>(Lio/flutter/plugin/platform/n;Lio/flutter/plugin/platform/B;FLKa/b;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v1, Lio/flutter/plugin/platform/B;->f:Lio/flutter/plugin/platform/g;

    .line 88
    .line 89
    invoke-interface {v2}, Lio/flutter/plugin/platform/g;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    iget-object v4, v1, Lio/flutter/plugin/platform/B;->f:Lio/flutter/plugin/platform/g;

    .line 94
    .line 95
    const-wide/16 v5, 0x0

    .line 96
    .line 97
    if-ne v8, v2, :cond_4

    .line 98
    .line 99
    invoke-interface {v4}, Lio/flutter/plugin/platform/g;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-ne v9, v2, :cond_4

    .line 104
    .line 105
    invoke-virtual {v1}, Lio/flutter/plugin/platform/B;->a()Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1, v3, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    const/16 v7, 0x1f

    .line 116
    .line 117
    if-lt v2, v7, :cond_5

    .line 118
    .line 119
    invoke-virtual {v1}, Lio/flutter/plugin/platform/B;->a()Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-interface {v4, v8, v9}, Lio/flutter/plugin/platform/g;->a(II)V

    .line 124
    .line 125
    .line 126
    iget-object v7, v1, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 127
    .line 128
    iget v10, v1, Lio/flutter/plugin/platform/B;->d:I

    .line 129
    .line 130
    invoke-virtual {v7, v8, v9, v10}, Landroid/hardware/display/VirtualDisplay;->resize(III)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v1, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 134
    .line 135
    invoke-interface {v4}, Lio/flutter/plugin/platform/g;->getSurface()Landroid/view/Surface;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v1, v4}, Landroid/hardware/display/VirtualDisplay;->setSurface(Landroid/view/Surface;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v3, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_5
    invoke-virtual {v1}, Lio/flutter/plugin/platform/B;->a()Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v2}, Landroid/view/View;->isFocused()Z

    .line 151
    .line 152
    .line 153
    move-result v16

    .line 154
    iget-object v2, v1, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 155
    .line 156
    invoke-virtual {v2}, Lio/flutter/plugin/platform/SingleViewPresentation;->detachState()Lio/flutter/plugin/platform/v;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v5, v1, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 161
    .line 162
    const/4 v6, 0x0

    .line 163
    invoke-virtual {v5, v6}, Landroid/hardware/display/VirtualDisplay;->setSurface(Landroid/view/Surface;)V

    .line 164
    .line 165
    .line 166
    iget-object v5, v1, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 167
    .line 168
    invoke-virtual {v5}, Landroid/hardware/display/VirtualDisplay;->release()V

    .line 169
    .line 170
    .line 171
    iget-object v5, v1, Lio/flutter/plugin/platform/B;->b:Landroid/app/Activity;

    .line 172
    .line 173
    const-string v6, "display"

    .line 174
    .line 175
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    move-object v6, v5

    .line 180
    check-cast v6, Landroid/hardware/display/DisplayManager;

    .line 181
    .line 182
    invoke-interface {v4, v8, v9}, Lio/flutter/plugin/platform/g;->a(II)V

    .line 183
    .line 184
    .line 185
    new-instance v5, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v7, "flutter-vd#"

    .line 188
    .line 189
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iget v7, v1, Lio/flutter/plugin/platform/B;->e:I

    .line 193
    .line 194
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-interface {v4}, Lio/flutter/plugin/platform/g;->getSurface()Landroid/view/Surface;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    sget-object v13, Lio/flutter/plugin/platform/B;->i:Lio/flutter/plugin/platform/y;

    .line 206
    .line 207
    const/4 v12, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    iget v10, v1, Lio/flutter/plugin/platform/B;->d:I

    .line 210
    .line 211
    invoke-virtual/range {v6 .. v14}, Landroid/hardware/display/DisplayManager;->createVirtualDisplay(Ljava/lang/String;IIILandroid/view/Surface;ILandroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    iput-object v4, v1, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 216
    .line 217
    invoke-virtual {v1}, Lio/flutter/plugin/platform/B;->a()Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    new-instance v5, LG3/i;

    .line 222
    .line 223
    const/4 v6, 0x1

    .line 224
    invoke-direct {v5, v4, v6, v3}, LG3/i;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v5}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 228
    .line 229
    .line 230
    new-instance v10, Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 231
    .line 232
    iget-object v3, v1, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 233
    .line 234
    invoke-virtual {v3}, Landroid/hardware/display/VirtualDisplay;->getDisplay()Landroid/view/Display;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    iget-object v15, v1, Lio/flutter/plugin/platform/B;->g:Lio/flutter/plugin/platform/l;

    .line 239
    .line 240
    iget-object v11, v1, Lio/flutter/plugin/platform/B;->b:Landroid/app/Activity;

    .line 241
    .line 242
    iget-object v13, v1, Lio/flutter/plugin/platform/B;->c:Lio/flutter/plugin/platform/a;

    .line 243
    .line 244
    move-object v14, v2

    .line 245
    invoke-direct/range {v10 .. v16}, Lio/flutter/plugin/platform/SingleViewPresentation;-><init>(Landroid/content/Context;Landroid/view/Display;Lio/flutter/plugin/platform/a;Lio/flutter/plugin/platform/v;Landroid/view/View$OnFocusChangeListener;Z)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    .line 249
    .line 250
    .line 251
    iget-object v2, v1, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 252
    .line 253
    invoke-virtual {v2}, Landroid/app/Dialog;->cancel()V

    .line 254
    .line 255
    .line 256
    iput-object v10, v1, Lio/flutter/plugin/platform/B;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    .line 257
    .line 258
    return-void

    .line 259
    :cond_6
    iget-object v4, v3, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 260
    .line 261
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    check-cast v4, Lio/flutter/plugin/platform/e;

    .line 266
    .line 267
    iget-object v5, v3, Lio/flutter/plugin/platform/q;->n:Landroid/util/SparseArray;

    .line 268
    .line 269
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    check-cast v5, Lio/flutter/plugin/platform/i;

    .line 274
    .line 275
    if-eqz v4, :cond_b

    .line 276
    .line 277
    if-nez v5, :cond_7

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_7
    invoke-virtual {v5}, Lio/flutter/plugin/platform/i;->getRenderTargetWidth()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-gt v8, v1, :cond_8

    .line 285
    .line 286
    invoke-virtual {v5}, Lio/flutter/plugin/platform/i;->getRenderTargetHeight()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-le v9, v1, :cond_9

    .line 291
    .line 292
    :cond_8
    iget-object v1, v5, Lio/flutter/plugin/platform/i;->f:Lio/flutter/plugin/platform/g;

    .line 293
    .line 294
    if-eqz v1, :cond_9

    .line 295
    .line 296
    invoke-interface {v1, v8, v9}, Lio/flutter/plugin/platform/g;->a(II)V

    .line 297
    .line 298
    .line 299
    :cond_9
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    iput v8, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 304
    .line 305
    iput v9, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 306
    .line 307
    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 308
    .line 309
    .line 310
    invoke-interface {v4}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-eqz v1, :cond_a

    .line 315
    .line 316
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    iput v8, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 321
    .line 322
    iput v9, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 323
    .line 324
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 325
    .line 326
    .line 327
    :cond_a
    invoke-virtual {v5}, Lio/flutter/plugin/platform/i;->getRenderTargetWidth()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    int-to-double v6, v1

    .line 332
    invoke-virtual {v3}, Lio/flutter/plugin/platform/q;->j()F

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    float-to-double v8, v1

    .line 337
    div-double/2addr v6, v8

    .line 338
    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    .line 339
    .line 340
    .line 341
    move-result-wide v6

    .line 342
    long-to-int v1, v6

    .line 343
    invoke-virtual {v5}, Lio/flutter/plugin/platform/i;->getRenderTargetHeight()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    int-to-double v4, v4

    .line 348
    invoke-virtual {v3}, Lio/flutter/plugin/platform/q;->j()F

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    float-to-double v6, v3

    .line 353
    div-double/2addr v4, v6

    .line 354
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 355
    .line 356
    .line 357
    move-result-wide v3

    .line 358
    long-to-int v3, v3

    .line 359
    iget-object v2, v2, LKa/b;->b:Ltc/g;

    .line 360
    .line 361
    new-instance v4, Ljava/util/HashMap;

    .line 362
    .line 363
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 364
    .line 365
    .line 366
    int-to-double v5, v1

    .line 367
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const-string v5, "width"

    .line 372
    .line 373
    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    int-to-double v5, v3

    .line 377
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    const-string v3, "height"

    .line 382
    .line 383
    invoke-virtual {v4, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :cond_b
    :goto_1
    const-string v2, "Resizing unknown platform view with id: "

    .line 391
    .line 392
    const-string v3, "PlatformViewsController"

    .line 393
    .line 394
    invoke-static {v1, v2, v3}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-void
.end method

.method public l(II)V
    .locals 4

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 9
    .line 10
    iget-object v0, v0, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lio/flutter/plugin/platform/e;

    .line 17
    .line 18
    const-string v1, "PlatformViewsController2"

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string p2, "Setting direction to an unknown view with id: "

    .line 23
    .line 24
    invoke-static {p1, p2, v1}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {v0}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string p2, "Setting direction to a null view with id: "

    .line 35
    .line 36
    invoke-static {p1, p2, v1}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_0
    if-eqz p2, :cond_3

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    if-ne p2, v0, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "Trying to set unknown direction value: "

    .line 53
    .line 54
    const-string v2, "(view id: "

    .line 55
    .line 56
    const-string v3, ")"

    .line 57
    .line 58
    invoke-static {v1, p2, v2, p1, v3}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_3
    :goto_1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lio/flutter/plugin/platform/q;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->c(I)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const-string v2, "PlatformViewsController"

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v0, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lio/flutter/plugin/platform/B;

    .line 89
    .line 90
    invoke-virtual {v0}, Lio/flutter/plugin/platform/B;->a()Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v0, v0, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lio/flutter/plugin/platform/e;

    .line 102
    .line 103
    if-nez v0, :cond_5

    .line 104
    .line 105
    const-string p2, "Setting direction to an unknown view with id: "

    .line 106
    .line 107
    invoke-static {p1, p2, v2}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    invoke-interface {v0}, Lio/flutter/plugin/platform/e;->getView()Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_2
    if-nez v0, :cond_6

    .line 116
    .line 117
    const-string p2, "Setting direction to a null view with id: "

    .line 118
    .line 119
    invoke-static {p1, p2, v2}, Lcb/a;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 124
    .line 125
    .line 126
    :goto_3
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN2/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x1706

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v1, 0x706

    .line 18
    .line 19
    :goto_0
    const/4 v2, 0x0

    .line 20
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v2, v3, :cond_3

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ltc/c;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eq v3, v4, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    and-int/lit16 v1, v1, -0x203

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    and-int/lit8 v1, v1, -0x5

    .line 46
    .line 47
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    iput v1, v0, LN2/j;->b:I

    .line 51
    .line 52
    invoke-virtual {v0}, LN2/j;->q()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public n(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN2/j;

    .line 4
    .line 5
    iget-object v0, v0, LN2/j;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1}, LA/f;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_4

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v1, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const/4 v2, 0x3

    .line 28
    if-eq p1, v1, :cond_2

    .line 29
    .line 30
    if-eq p1, v2, :cond_1

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    if-eq p1, v1, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const/4 p1, 0x6

    .line 41
    invoke-virtual {v0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-virtual {v0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    invoke-virtual {v0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    const/4 p1, 0x0

    .line 54
    invoke-virtual {v0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->release()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public scheduleFrame()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->scheduleFrame()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
