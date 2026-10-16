.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private final yo:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->oa()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->yo:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 6
    .line 7
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Landroid/view/MotionEvent;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 15
    .line 16
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ab(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/common/lw;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 23
    .line 24
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ab(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/common/lw;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/common/lw;->uef(Landroid/view/MotionEvent;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    :try_start_0
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const-wide/16 v4, -0x1

    .line 37
    .line 38
    const-wide/16 v6, 0x0

    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v3, :cond_9

    .line 43
    .line 44
    const/4 v10, 0x3

    .line 45
    if-eq v3, v9, :cond_2

    .line 46
    .line 47
    if-eq v3, v8, :cond_4

    .line 48
    .line 49
    if-eq v3, v10, :cond_3

    .line 50
    .line 51
    const/4 v10, -0x1

    .line 52
    :cond_2
    :goto_0
    move v12, v10

    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_3
    const/4 v10, 0x4

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    iget-object v11, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 66
    .line 67
    invoke-static {v11}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    sub-float/2addr v3, v11

    .line 72
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iget v11, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->yo:I

    .line 77
    .line 78
    int-to-float v11, v11

    .line 79
    cmpl-float v3, v3, v11

    .line 80
    .line 81
    if-gez v3, :cond_5

    .line 82
    .line 83
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 84
    .line 85
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oib(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    sub-float/2addr v10, v3

    .line 90
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iget v10, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->yo:I

    .line 95
    .line 96
    int-to-float v10, v10

    .line 97
    cmpl-float v3, v3, v10

    .line 98
    .line 99
    if-ltz v3, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto/16 :goto_7

    .line 104
    .line 105
    :cond_5
    :goto_1
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 106
    .line 107
    invoke-static {v3, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z

    .line 108
    .line 109
    .line 110
    :cond_6
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 111
    .line 112
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dhk(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    iget-object v12, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 121
    .line 122
    invoke-static {v12}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    sub-float/2addr v11, v12

    .line 127
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    add-float/2addr v10, v11

    .line 132
    invoke-static {v3, v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F

    .line 133
    .line 134
    .line 135
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 136
    .line 137
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->tpx(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    iget-object v12, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 146
    .line 147
    invoke-static {v12}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oib(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    sub-float/2addr v11, v12

    .line 152
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    add-float/2addr v10, v11

    .line 157
    invoke-static {v3, v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F

    .line 158
    .line 159
    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 161
    .line 162
    .line 163
    move-result-wide v10

    .line 164
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 165
    .line 166
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)J

    .line 167
    .line 168
    .line 169
    move-result-wide v12

    .line 170
    sub-long/2addr v10, v12

    .line 171
    const-wide/16 v12, 0xc8

    .line 172
    .line 173
    cmp-long v3, v10, v12

    .line 174
    .line 175
    if-lez v3, :cond_8

    .line 176
    .line 177
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 178
    .line 179
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dhk(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    const/high16 v10, 0x41000000    # 8.0f

    .line 184
    .line 185
    cmpl-float v3, v3, v10

    .line 186
    .line 187
    if-gtz v3, :cond_7

    .line 188
    .line 189
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 190
    .line 191
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->tpx(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    cmpl-float v3, v3, v10

    .line 196
    .line 197
    if-lez v3, :cond_8

    .line 198
    .line 199
    :cond_7
    move v12, v9

    .line 200
    goto :goto_2

    .line 201
    :cond_8
    move v12, v8

    .line 202
    goto :goto_2

    .line 203
    :cond_9
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 204
    .line 205
    invoke-static {v3, v9}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z

    .line 206
    .line 207
    .line 208
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 209
    .line 210
    new-instance v10, Landroid/util/SparseArray;

    .line 211
    .line 212
    invoke-direct {v10}, Landroid/util/SparseArray;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-static {v3, v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Landroid/util/SparseArray;)Landroid/util/SparseArray;

    .line 216
    .line 217
    .line 218
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 219
    .line 220
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    invoke-static {v3, v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F

    .line 225
    .line 226
    .line 227
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-static {v3, v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F

    .line 234
    .line 235
    .line 236
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 237
    .line 238
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 239
    .line 240
    .line 241
    move-result-wide v10

    .line 242
    invoke-static {v3, v10, v11}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    .line 244
    .line 245
    :try_start_1
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 246
    .line 247
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/cz/ivm;->getLandingPageClickBegin()J

    .line 252
    .line 253
    .line 254
    move-result-wide v10

    .line 255
    cmp-long v3, v10, v6

    .line 256
    .line 257
    if-lez v3, :cond_a

    .line 258
    .line 259
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 260
    .line 261
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)J

    .line 262
    .line 263
    .line 264
    move-result-wide v12

    .line 265
    cmp-long v3, v10, v12

    .line 266
    .line 267
    if-gez v3, :cond_a

    .line 268
    .line 269
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 270
    .line 271
    invoke-static {v3, v10, v11}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;J)J

    .line 272
    .line 273
    .line 274
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 275
    .line 276
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-virtual {v3, v4, v5}, Lcom/bytedance/sdk/component/cz/ivm;->setLandingPageClickBegin(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    .line 282
    .line 283
    :catch_0
    :cond_a
    :try_start_2
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 284
    .line 285
    const/high16 v10, -0x40800000    # -1.0f

    .line 286
    .line 287
    invoke-static {v3, v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F

    .line 288
    .line 289
    .line 290
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 291
    .line 292
    invoke-static {v3, v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F

    .line 293
    .line 294
    .line 295
    move v12, v2

    .line 296
    :goto_2
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 297
    .line 298
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->orq(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/util/SparseArray;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 303
    .line 304
    .line 305
    move-result v10

    .line 306
    new-instance v11, Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSize()F

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    float-to-double v13, v13

    .line 313
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPressure()F

    .line 314
    .line 315
    .line 316
    move-result v15

    .line 317
    move-wide/from16 v19, v6

    .line 318
    .line 319
    float-to-double v6, v15

    .line 320
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 321
    .line 322
    .line 323
    move-result-wide v17

    .line 324
    move-wide v15, v6

    .line 325
    invoke-direct/range {v11 .. v18}, Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;-><init>(IDDJ)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v10, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-ne v3, v9, :cond_b

    .line 336
    .line 337
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 338
    .line 339
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    iget-object v3, v3, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 344
    .line 345
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-eqz v3, :cond_b

    .line 350
    .line 351
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 352
    .line 353
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    iget-object v3, v3, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 358
    .line 359
    if-eqz v3, :cond_b

    .line 360
    .line 361
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 362
    .line 363
    new-instance v6, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3$1;

    .line 364
    .line 365
    invoke-direct {v6, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;)V

    .line 366
    .line 367
    .line 368
    invoke-static {v3, v6}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Ljava/lang/Runnable;)Z

    .line 369
    .line 370
    .line 371
    :cond_b
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-ne v3, v9, :cond_16

    .line 376
    .line 377
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getVisibility()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-nez v3, :cond_16

    .line 382
    .line 383
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getAlpha()F

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-virtual {v3}, Ljava/lang/Float;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-ne v3, v9, :cond_16

    .line 396
    .line 397
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 398
    .line 399
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gzw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    if-eqz v3, :cond_c

    .line 404
    .line 405
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 406
    .line 407
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-eqz v3, :cond_16

    .line 412
    .line 413
    :cond_c
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 414
    .line 415
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gsd(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    if-eqz v3, :cond_16

    .line 420
    .line 421
    new-instance v3, Lorg/json/JSONObject;

    .line 422
    .line 423
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 424
    .line 425
    .line 426
    const-string v6, "down_x"

    .line 427
    .line 428
    iget-object v7, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 429
    .line 430
    invoke-static {v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 431
    .line 432
    .line 433
    move-result v7

    .line 434
    float-to-double v10, v7

    .line 435
    invoke-virtual {v3, v6, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 436
    .line 437
    .line 438
    const-string v6, "down_y"

    .line 439
    .line 440
    iget-object v7, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 441
    .line 442
    invoke-static {v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oib(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    float-to-double v10, v7

    .line 447
    invoke-virtual {v3, v6, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 448
    .line 449
    .line 450
    const-string v6, "down_time"

    .line 451
    .line 452
    iget-object v7, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 453
    .line 454
    invoke-static {v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)J

    .line 455
    .line 456
    .line 457
    move-result-wide v10

    .line 458
    invoke-virtual {v3, v6, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 459
    .line 460
    .line 461
    const-string v6, "up_x"

    .line 462
    .line 463
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    float-to-double v10, v7

    .line 468
    invoke-virtual {v3, v6, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 469
    .line 470
    .line 471
    const-string v6, "up_y"

    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    float-to-double v10, v7

    .line 478
    invoke-virtual {v3, v6, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 479
    .line 480
    .line 481
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 482
    .line 483
    .line 484
    move-result-wide v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 485
    :try_start_3
    iget-object v10, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 486
    .line 487
    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    invoke-virtual {v10}, Lcom/bytedance/sdk/component/cz/ivm;->getLandingPageClickEnd()J

    .line 492
    .line 493
    .line 494
    move-result-wide v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 495
    cmp-long v12, v10, v19

    .line 496
    .line 497
    if-lez v12, :cond_d

    .line 498
    .line 499
    cmp-long v12, v10, v6

    .line 500
    .line 501
    if-gez v12, :cond_d

    .line 502
    .line 503
    :try_start_4
    iget-object v6, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 504
    .line 505
    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    invoke-virtual {v6, v4, v5}, Lcom/bytedance/sdk/component/cz/ivm;->setLandingPageClickEnd(J)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 510
    .line 511
    .line 512
    :catch_1
    move-wide v6, v10

    .line 513
    :catch_2
    :cond_d
    :try_start_5
    const-string v4, "up_time"

    .line 514
    .line 515
    invoke-virtual {v3, v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 516
    .line 517
    .line 518
    new-array v4, v8, [I

    .line 519
    .line 520
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 521
    .line 522
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    iget-object v6, v6, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->km:Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    .line 527
    .line 528
    const v7, 0x1f000011

    .line 529
    .line 530
    .line 531
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    invoke-static {v5, v6}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Landroid/view/View;)Landroid/view/View;

    .line 536
    .line 537
    .line 538
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 539
    .line 540
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rt(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    if-eqz v5, :cond_e

    .line 545
    .line 546
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 547
    .line 548
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rt(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    invoke-virtual {v5, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 553
    .line 554
    .line 555
    const-string v5, "button_x"

    .line 556
    .line 557
    aget v6, v4, v2

    .line 558
    .line 559
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 560
    .line 561
    .line 562
    const-string v5, "button_y"

    .line 563
    .line 564
    aget v4, v4, v9

    .line 565
    .line 566
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 567
    .line 568
    .line 569
    const-string v4, "button_width"

    .line 570
    .line 571
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 572
    .line 573
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rt(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 582
    .line 583
    .line 584
    const-string v4, "button_height"

    .line 585
    .line 586
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 587
    .line 588
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rt(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 593
    .line 594
    .line 595
    move-result v5

    .line 596
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 597
    .line 598
    .line 599
    :cond_e
    iget-object v4, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 600
    .line 601
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gr(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    if-eqz v4, :cond_f

    .line 606
    .line 607
    new-array v4, v8, [I

    .line 608
    .line 609
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 610
    .line 611
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gr(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    invoke-virtual {v5, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 616
    .line 617
    .line 618
    const-string v5, "ad_x"

    .line 619
    .line 620
    aget v6, v4, v2

    .line 621
    .line 622
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 623
    .line 624
    .line 625
    const-string v5, "ad_y"

    .line 626
    .line 627
    aget v4, v4, v9

    .line 628
    .line 629
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 630
    .line 631
    .line 632
    const-string v4, "width"

    .line 633
    .line 634
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 635
    .line 636
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gr(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 637
    .line 638
    .line 639
    move-result-object v5

    .line 640
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 645
    .line 646
    .line 647
    const-string v4, "height"

    .line 648
    .line 649
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 650
    .line 651
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gr(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 656
    .line 657
    .line 658
    move-result v5

    .line 659
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 660
    .line 661
    .line 662
    :cond_f
    const-string v4, "toolType"

    .line 663
    .line 664
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 665
    .line 666
    .line 667
    move-result v5

    .line 668
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 669
    .line 670
    .line 671
    const-string v4, "deviceId"

    .line 672
    .line 673
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 678
    .line 679
    .line 680
    const-string v4, "source"

    .line 681
    .line 682
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSource()I

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 687
    .line 688
    .line 689
    const-string v0, "ft"

    .line 690
    .line 691
    iget-object v4, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 692
    .line 693
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->orq(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/util/SparseArray;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/zjm;->uef()Z

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    if-eqz v5, :cond_10

    .line 706
    .line 707
    move v5, v9

    .line 708
    goto :goto_3

    .line 709
    :cond_10
    move v5, v8

    .line 710
    :goto_3
    invoke-static {v4, v5}, Lcom/bytedance/sdk/openadsdk/core/model/wrv;->uef(Landroid/util/SparseArray;I)Lorg/json/JSONObject;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 715
    .line 716
    .line 717
    const-string v0, "user_behavior_type"

    .line 718
    .line 719
    iget-object v4, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 720
    .line 721
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gsd(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    if-eqz v4, :cond_11

    .line 726
    .line 727
    move v4, v9

    .line 728
    goto :goto_4

    .line 729
    :cond_11
    move v4, v8

    .line 730
    :goto_4
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 731
    .line 732
    .line 733
    const-string v0, "click_scence"

    .line 734
    .line 735
    invoke-virtual {v3, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 736
    .line 737
    .line 738
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 739
    .line 740
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    if-eqz v0, :cond_12

    .line 745
    .line 746
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 747
    .line 748
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->uef(Lorg/json/JSONObject;)V

    .line 753
    .line 754
    .line 755
    :cond_12
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 756
    .line 757
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gzw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    if-nez v0, :cond_15

    .line 762
    .line 763
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 764
    .line 765
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->cz(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    if-eqz v0, :cond_13

    .line 770
    .line 771
    goto :goto_6

    .line 772
    :cond_13
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 773
    .line 774
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ue(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z

    .line 775
    .line 776
    .line 777
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 778
    const-string v4, "click"

    .line 779
    .line 780
    if-eqz v0, :cond_14

    .line 781
    .line 782
    :try_start_6
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 783
    .line 784
    const-string v5, "rewarded_video"

    .line 785
    .line 786
    invoke-static {v0, v5, v4, v3}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 787
    .line 788
    .line 789
    goto :goto_5

    .line 790
    :cond_14
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 791
    .line 792
    const-string v5, "fullscreen_interstitial_ad"

    .line 793
    .line 794
    invoke-static {v0, v5, v4, v3}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 795
    .line 796
    .line 797
    :goto_5
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 798
    .line 799
    invoke-static {v0, v9}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ivm(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 800
    .line 801
    .line 802
    goto :goto_8

    .line 803
    :cond_15
    :goto_6
    return v2

    .line 804
    :goto_7
    const-string v3, "TTAD.RFWVM"

    .line 805
    .line 806
    const-string v4, "TouchRecordTool onTouch error"

    .line 807
    .line 808
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 809
    .line 810
    .line 811
    :cond_16
    :goto_8
    return v2
.end method
