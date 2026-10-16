.class Lcom/bytedance/sdk/openadsdk/dz/uef$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(ILcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

.field final synthetic moa:Z

.field final synthetic oa:I

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/dz/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILjava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->oa:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->yo:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->moa:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/openadsdk/moa/cq;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;
    .locals 8

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/dz/uef$3$3;

    .line 2
    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v7, p1

    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/dz/uef$3$3;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef$3;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/cq;ZLcom/bytedance/sdk/component/cz/ivm;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v1, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, v1, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->yo:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->uef(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef;)Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef;)Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dz/uef;->oa()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-lt v0, v2, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef;)Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/ref/SoftReference;

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lcom/bytedance/sdk/component/cz/ivm;

    .line 59
    .line 60
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 73
    .line 74
    if-nez v2, :cond_0

    .line 75
    .line 76
    const-string v2, ""

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/cz/ivm;->getTag()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :goto_0
    invoke-static {v3, v0, v1, v4, v2}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef;IILcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 87
    .line 88
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/dz/uef;->oa(Lcom/bytedance/sdk/openadsdk/dz/uef;)Landroid/os/Handler;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->oa:I

    .line 99
    .line 100
    iput v2, v0, Landroid/os/Message;->what:I

    .line 101
    .line 102
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 103
    .line 104
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/dz/uef;->oa(Lcom/bytedance/sdk/openadsdk/dz/uef;)Landroid/os/Handler;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dz/uef;->yo()J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 113
    .line 114
    .line 115
    :cond_2
    new-instance v0, Ljava/lang/ref/SoftReference;

    .line 116
    .line 117
    new-instance v2, Lcom/bytedance/sdk/component/cz/ivm;

    .line 118
    .line 119
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    sget-object v4, Lcom/bytedance/sdk/component/cz/ivm$yo;->cq:Lcom/bytedance/sdk/component/cz/ivm$yo;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-direct {v2, v3, v5, v4}, Lcom/bytedance/sdk/component/cz/ivm;-><init>(Landroid/content/Context;ZLcom/bytedance/sdk/component/cz/ivm$yo;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Lcom/bytedance/sdk/component/cz/ivm;

    .line 137
    .line 138
    if-nez v2, :cond_3

    .line 139
    .line 140
    goto/16 :goto_3

    .line 141
    .line 142
    :cond_3
    const/4 v3, 0x2

    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-virtual {v2, v3, v4}, Lcom/bytedance/sdk/component/cz/ivm;->setLayerType(ILandroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    const/4 v6, 0x4

    .line 148
    invoke-static {v2, v6}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 149
    .line 150
    .line 151
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->yo:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v2, v6}, Lcom/bytedance/sdk/component/cz/ivm;->setTag(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setLandingPage(Z)V

    .line 157
    .line 158
    .line 159
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 160
    .line 161
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gr()Lcom/bytedance/sdk/openadsdk/core/model/oib;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    if-eqz v6, :cond_4

    .line 166
    .line 167
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/oib;->uef()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    goto :goto_1

    .line 172
    :cond_4
    const/4 v6, 0x3

    .line 173
    :goto_1
    if-ne v6, v3, :cond_7

    .line 174
    .line 175
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-static {v7}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/content/Context;)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 192
    .line 193
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cgg()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-ne v8, v1, :cond_5

    .line 198
    .line 199
    if-lt v6, v7, :cond_6

    .line 200
    .line 201
    invoke-virtual {v2, v5, v5, v7, v6}, Landroid/view/View;->layout(IIII)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_5
    if-ne v8, v3, :cond_8

    .line 206
    .line 207
    if-ge v6, v7, :cond_6

    .line 208
    .line 209
    invoke-virtual {v2, v5, v5, v7, v6}, Landroid/view/View;->layout(IIII)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_6
    invoke-virtual {v2, v5, v5, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_7
    if-ne v6, v1, :cond_8

    .line 218
    .line 219
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/ab;->uef()Lcom/bytedance/sdk/openadsdk/core/ab;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/ab;->lw()Lcom/bytedance/sdk/openadsdk/utils/uef;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    if-eqz v6, :cond_8

    .line 228
    .line 229
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/utils/uef;->oa()Landroid/app/Activity;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    if-eqz v7, :cond_8

    .line 234
    .line 235
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    new-instance v9, Lcom/bytedance/sdk/openadsdk/dz/uef$3$1;

    .line 240
    .line 241
    invoke-direct {v9, p0, v8, v2}, Lcom/bytedance/sdk/openadsdk/dz/uef$3$1;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef$3;ILcom/bytedance/sdk/component/cz/ivm;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v9}, Lcom/bytedance/sdk/openadsdk/utils/uef;->uef(Lcom/bytedance/sdk/component/adexpress/uef;)V

    .line 245
    .line 246
    .line 247
    const v6, 0x1020002

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    check-cast v6, Landroid/widget/FrameLayout;

    .line 255
    .line 256
    if-eqz v6, :cond_8

    .line 257
    .line 258
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 259
    .line 260
    .line 261
    :cond_8
    :goto_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/xs/oa;->uef()Lcom/bytedance/sdk/openadsdk/xs/oa;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/xs/oa;->oa()Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/xs/oa;->uef()Lcom/bytedance/sdk/openadsdk/xs/oa;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 274
    .line 275
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vup()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    invoke-virtual {v7, v6, v8}, Lcom/bytedance/sdk/openadsdk/xs/oa;->uef(Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    new-instance v7, Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 284
    .line 285
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 286
    .line 287
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-direct {v7, v8, v9}, Lcom/bytedance/sdk/openadsdk/moa/cq;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/webkit/WebView;)V

    .line 292
    .line 293
    .line 294
    if-lez v6, :cond_9

    .line 295
    .line 296
    move v5, v3

    .line 297
    :cond_9
    invoke-virtual {v7, v5}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v7, v1}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Z)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7, v1}, Lcom/bytedance/sdk/openadsdk/moa/cq;->oa(Z)Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 304
    .line 305
    .line 306
    invoke-direct {p0, v2, v7}, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef(Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/openadsdk/moa/cq;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 311
    .line 312
    .line 313
    new-instance v1, Lcom/bytedance/sdk/openadsdk/dz/uef$3$2;

    .line 314
    .line 315
    invoke-direct {v1, p0, v4, v7, v2}, Lcom/bytedance/sdk/openadsdk/dz/uef$3$2;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef$3;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/moa/cq;Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 319
    .line 320
    .line 321
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 322
    .line 323
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 324
    .line 325
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cc()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-static {v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef;Lcom/bytedance/sdk/component/cz/ivm;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 333
    .line 334
    .line 335
    move-result-wide v1

    .line 336
    const-wide/16 v3, 0x3e8

    .line 337
    .line 338
    div-long/2addr v1, v3

    .line 339
    long-to-double v1, v1

    .line 340
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 341
    .line 342
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jn()D

    .line 343
    .line 344
    .line 345
    move-result-wide v3

    .line 346
    sub-double/2addr v1, v3

    .line 347
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 356
    .line 357
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->yo:Ljava/lang/String;

    .line 358
    .line 359
    const-string v4, "web_start_pre_render"

    .line 360
    .line 361
    invoke-static {v2, v3, v1, v4}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;FLjava/lang/String;)V

    .line 362
    .line 363
    .line 364
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 365
    .line 366
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef;)Ljava/util/LinkedHashMap;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    if-eqz v1, :cond_a

    .line 371
    .line 372
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef;

    .line 373
    .line 374
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef;)Ljava/util/LinkedHashMap;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/dz/uef$3;->oa:I

    .line 379
    .line 380
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v1, v2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    :cond_a
    :goto_3
    return-void
.end method
