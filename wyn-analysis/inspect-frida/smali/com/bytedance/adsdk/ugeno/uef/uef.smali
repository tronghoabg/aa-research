.class public Lcom/bytedance/adsdk/ugeno/uef/uef;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field private bcc:Ljava/lang/String;

.field private cz:Lcom/bytedance/adsdk/ugeno/uef/oa;

.field private ivm:I

.field private lw:I

.field private moa:Landroid/content/Context;

.field private oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

.field private uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

.field private xs:Lcom/bytedance/adsdk/ugeno/uef/uef/uef;

.field private yo:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/adsdk/ugeno/oa/yo;Lcom/bytedance/adsdk/ugeno/uef/yo;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->ivm:I

    .line 6
    .line 7
    iput-object p2, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->moa:Landroid/content/Context;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public lw()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->bcc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Landroid/animation/ValueAnimator;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v1, :cond_a

    .line 6
    .line 7
    iget-object v3, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->oa()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    if-eqz v1, :cond_5

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_5

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_5

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/util/Map$Entry;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v5}, Lcom/bytedance/adsdk/ugeno/uef/lw;->uef(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/uef/lw;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v6}, Lcom/bytedance/adsdk/ugeno/uef/lw;->yo()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/4 v7, -0x1

    .line 70
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    sparse-switch v8, :sswitch_data_0

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :sswitch_0
    const-string v8, "point"

    .line 79
    .line 80
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-nez v6, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const/4 v7, 0x2

    .line 88
    goto :goto_1

    .line 89
    :sswitch_1
    const-string v8, "float"

    .line 90
    .line 91
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-nez v6, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const/4 v7, 0x1

    .line 99
    goto :goto_1

    .line 100
    :sswitch_2
    const-string v8, "int"

    .line 101
    .line 102
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-nez v6, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move v7, v0

    .line 110
    :goto_1
    packed-switch v7, :pswitch_data_0

    .line 111
    .line 112
    .line 113
    move-object v6, v2

    .line 114
    goto :goto_2

    .line 115
    :pswitch_0
    new-instance v6, Lcom/bytedance/adsdk/ugeno/uef/oa/moa;

    .line 116
    .line 117
    iget-object v7, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->moa:Landroid/content/Context;

    .line 118
    .line 119
    iget-object v8, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Ljava/util/Map;

    .line 126
    .line 127
    invoke-direct {v6, v7, v8, v5, v4}, Lcom/bytedance/adsdk/ugeno/uef/oa/moa;-><init>(Landroid/content/Context;Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/Map;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :pswitch_1
    new-instance v6, Lcom/bytedance/adsdk/ugeno/uef/oa/oa;

    .line 132
    .line 133
    iget-object v7, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->moa:Landroid/content/Context;

    .line 134
    .line 135
    iget-object v8, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 136
    .line 137
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Ljava/util/TreeMap;

    .line 142
    .line 143
    invoke-direct {v6, v7, v8, v5, v4}, Lcom/bytedance/adsdk/ugeno/uef/oa/oa;-><init>(Landroid/content/Context;Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :pswitch_2
    new-instance v6, Lcom/bytedance/adsdk/ugeno/uef/oa/yo;

    .line 148
    .line 149
    iget-object v7, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->moa:Landroid/content/Context;

    .line 150
    .line 151
    iget-object v8, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 152
    .line 153
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    check-cast v4, Ljava/util/TreeMap;

    .line 158
    .line 159
    invoke-direct {v6, v7, v8, v5, v4}, Lcom/bytedance/adsdk/ugeno/uef/oa/yo;-><init>(Landroid/content/Context;Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    if-eqz v6, :cond_1

    .line 163
    .line 164
    invoke-virtual {v6}, Lcom/bytedance/adsdk/ugeno/uef/oa/uef;->lw()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 169
    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_5
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 174
    .line 175
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->uef()Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-eqz v1, :cond_6

    .line 180
    .line 181
    iget-object v4, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 182
    .line 183
    invoke-static {v4, v1}, Lcom/bytedance/adsdk/ugeno/uef/uef/uef$uef;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Lorg/json/JSONObject;)Lcom/bytedance/adsdk/ugeno/uef/uef/uef;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->xs:Lcom/bytedance/adsdk/ugeno/uef/uef/uef;

    .line 188
    .line 189
    if-eqz v1, :cond_6

    .line 190
    .line 191
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->yo()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 196
    .line 197
    .line 198
    :cond_6
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->uef:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 199
    .line 200
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-nez v1, :cond_7

    .line 205
    .line 206
    return-object v2

    .line 207
    :cond_7
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 208
    .line 209
    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/uef/yo;->xs()Lcom/bytedance/adsdk/ugeno/uef/yo$uef;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    if-eqz v2, :cond_8

    .line 214
    .line 215
    new-instance v4, Lcom/bytedance/adsdk/ugeno/uef/uef$1;

    .line 216
    .line 217
    invoke-direct {v4, p0, v1, v2}, Lcom/bytedance/adsdk/ugeno/uef/uef$1;-><init>(Lcom/bytedance/adsdk/ugeno/uef/uef;Landroid/view/View;Lcom/bytedance/adsdk/ugeno/uef/yo$uef;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 221
    .line 222
    .line 223
    :cond_8
    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    .line 224
    .line 225
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, [Landroid/animation/PropertyValuesHolder;

    .line 230
    .line 231
    invoke-static {v1, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 236
    .line 237
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->moa()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-static {v1}, Lcom/bytedance/adsdk/ugeno/uef/moa;->uef(I)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->lw:I

    .line 246
    .line 247
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 248
    .line 249
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->yo()J

    .line 250
    .line 251
    .line 252
    move-result-wide v1

    .line 253
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 254
    .line 255
    .line 256
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->lw:I

    .line 257
    .line 258
    const/high16 v2, -0x80000000

    .line 259
    .line 260
    if-eq v1, v2, :cond_9

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 263
    .line 264
    .line 265
    :cond_9
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 266
    .line 267
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->zjm()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->ivm:I

    .line 272
    .line 273
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 274
    .line 275
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->cz()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    iput-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->bcc:Ljava/lang/String;

    .line 280
    .line 281
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 282
    .line 283
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->ivm()J

    .line 284
    .line 285
    .line 286
    move-result-wide v1

    .line 287
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 288
    .line 289
    .line 290
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 291
    .line 292
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->lw()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-static {v1}, Lcom/bytedance/adsdk/ugeno/uef/moa;->uef(Ljava/lang/String;)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 301
    .line 302
    .line 303
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/uef/yo;

    .line 304
    .line 305
    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/uef/yo;->bcc()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-static {v1}, Lcom/bytedance/adsdk/ugeno/uef/moa;->oa(Ljava/lang/String;)Landroid/view/animation/Interpolator;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 317
    .line 318
    .line 319
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->yo:Landroid/animation/ValueAnimator;

    .line 320
    .line 321
    return-object v0

    .line 322
    :cond_a
    :goto_3
    return-object v2

    .line 323
    :sswitch_data_0
    .sparse-switch
        0x197ef -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x65e5590 -> :sswitch_0
    .end sparse-switch

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public oa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->yo:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public oa(Landroid/graphics/Canvas;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->xs:Lcom/bytedance/adsdk/ugeno/uef/uef/uef;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/uef/oa;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/bytedance/adsdk/ugeno/uef/oa;->oa()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/uef/oa;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/bytedance/adsdk/ugeno/uef/oa;->uef()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public uef()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->yo:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->ivm:I

    if-eqz v1, :cond_0

    .line 3
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->lw:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public uef(II)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->xs:Lcom/bytedance/adsdk/ugeno/uef/uef/uef;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->uef(II)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/graphics/Canvas;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->xs:Lcom/bytedance/adsdk/ugeno/uef/uef/uef;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->uef(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/uef/oa;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/uef/oa;

    return-void
.end method

.method public yo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef;->yo:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
