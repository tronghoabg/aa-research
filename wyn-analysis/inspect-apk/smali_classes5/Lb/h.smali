.class public final synthetic LLb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LLb/h;->a:I

    iput-object p1, p0, LLb/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LLb/h;->b:Ljava/lang/Object;

    .line 3
    .line 4
    iget v2, p0, LLb/h;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v1, Ls6/y;

    .line 10
    .line 11
    invoke-virtual {v1}, Ls6/y;->g()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const v2, 0x7f0a010e

    .line 19
    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget-object p1, v1, Ls6/y;->q:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const v0, 0x7f0a010d

    .line 34
    .line 35
    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    iget-object p1, v1, Ls6/y;->r:Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :pswitch_0
    check-cast v1, Ls6/i;

    .line 45
    .line 46
    iget-object p1, v1, Ls6/i;->l:Ls6/t;

    .line 47
    .line 48
    iget-object v0, p1, Ls6/t;->h0:LE5/w0;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    check-cast v0, LE5/I;

    .line 53
    .line 54
    invoke-virtual {v0}, LE5/I;->v0()Lr6/f;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p1, Ls6/t;->h0:LE5/w0;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v2, Lr6/e;

    .line 64
    .line 65
    invoke-direct {v2, v0}, Lr6/e;-><init>(Lr6/f;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x3

    .line 69
    invoke-virtual {v2, v0}, Lr6/q;->a(I)V

    .line 70
    .line 71
    .line 72
    const/4 v0, -0x3

    .line 73
    iput v0, v2, Lr6/q;->u:I

    .line 74
    .line 75
    new-instance v0, Lr6/f;

    .line 76
    .line 77
    invoke-direct {v0, v2}, Lr6/f;-><init>(Lr6/e;)V

    .line 78
    .line 79
    .line 80
    check-cast v1, LE5/I;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, LE5/I;->K0(Lr6/r;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p1, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void

    .line 91
    :pswitch_1
    check-cast v1, Ls6/o;

    .line 92
    .line 93
    invoke-virtual {v1}, Landroidx/recyclerview/widget/m0;->getAdapterPosition()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    iget-object v1, v1, Ls6/o;->f:Ls6/t;

    .line 98
    .line 99
    iget-object v2, v1, Ls6/t;->z:Landroid/view/View;

    .line 100
    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object p1, v1, Ls6/t;->g:Ls6/m;

    .line 107
    .line 108
    invoke-virtual {v1, p1, v2}, Ls6/t;->d(Landroidx/recyclerview/widget/I;Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    if-ne p1, v0, :cond_4

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object p1, v1, Ls6/t;->i:Ls6/i;

    .line 118
    .line 119
    invoke-virtual {v1, p1, v2}, Ls6/t;->d(Landroidx/recyclerview/widget/I;Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    iget-object p1, v1, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 126
    .line 127
    .line 128
    :goto_1
    return-void

    .line 129
    :pswitch_2
    check-cast v1, Ls6/i;

    .line 130
    .line 131
    iget-object p1, v1, Ls6/i;->l:Ls6/t;

    .line 132
    .line 133
    iget-object v1, p1, Ls6/t;->h0:LE5/w0;

    .line 134
    .line 135
    if-nez v1, :cond_5

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    check-cast v1, LE5/I;

    .line 139
    .line 140
    invoke-virtual {v1}, LE5/I;->v0()Lr6/f;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v2, p1, Ls6/t;->h0:LE5/w0;

    .line 145
    .line 146
    sget v3, Lu6/v;->a:I

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance v3, Lr6/e;

    .line 152
    .line 153
    invoke-direct {v3, v1}, Lr6/e;-><init>(Lr6/f;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v0}, Lr6/q;->a(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v0}, Lr6/e;->e(I)V

    .line 160
    .line 161
    .line 162
    new-instance v1, Lr6/f;

    .line 163
    .line 164
    invoke-direct {v1, v3}, Lr6/f;-><init>(Lr6/e;)V

    .line 165
    .line 166
    .line 167
    check-cast v2, LE5/I;

    .line 168
    .line 169
    invoke-virtual {v2, v1}, LE5/I;->K0(Lr6/r;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const v2, 0x7f13008c

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iget-object v2, p1, Ls6/t;->f:Ls6/p;

    .line 184
    .line 185
    iget-object v2, v2, Ls6/p;->j:[Ljava/lang/String;

    .line 186
    .line 187
    aput-object v1, v2, v0

    .line 188
    .line 189
    iget-object p1, p1, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 192
    .line 193
    .line 194
    :goto_2
    return-void

    .line 195
    :pswitch_3
    check-cast v1, Ls6/t;

    .line 196
    .line 197
    invoke-static {v1}, Ls6/t;->a(Ls6/t;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_4
    check-cast v1, Lic/b;

    .line 202
    .line 203
    invoke-interface {v1}, Lic/b;->b()V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_5
    check-cast v1, Lic/a;

    .line 208
    .line 209
    if-eqz v1, :cond_6

    .line 210
    .line 211
    invoke-interface {v1}, Lic/a;->a()V

    .line 212
    .line 213
    .line 214
    :cond_6
    return-void

    .line 215
    :pswitch_6
    check-cast v1, Lf8/u;

    .line 216
    .line 217
    iget-object p1, v1, Lf8/u;->f:Landroid/widget/EditText;

    .line 218
    .line 219
    if-nez p1, :cond_7

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_7
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    iget-object v0, v1, Lf8/u;->f:Landroid/widget/EditText;

    .line 227
    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    .line 235
    .line 236
    if-eqz v0, :cond_8

    .line 237
    .line 238
    iget-object v0, v1, Lf8/u;->f:Landroid/widget/EditText;

    .line 239
    .line 240
    const/4 v2, 0x0

    .line 241
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_8
    iget-object v0, v1, Lf8/u;->f:Landroid/widget/EditText;

    .line 246
    .line 247
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 252
    .line 253
    .line 254
    :goto_3
    if-ltz p1, :cond_9

    .line 255
    .line 256
    iget-object v0, v1, Lf8/u;->f:Landroid/widget/EditText;

    .line 257
    .line 258
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 259
    .line 260
    .line 261
    :cond_9
    invoke-virtual {v1}, Lf8/n;->q()V

    .line 262
    .line 263
    .line 264
    :goto_4
    return-void

    .line 265
    :pswitch_7
    check-cast v1, Lf8/j;

    .line 266
    .line 267
    invoke-virtual {v1}, Lf8/j;->u()V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :pswitch_8
    check-cast v1, Lf8/d;

    .line 272
    .line 273
    iget-object p1, v1, Lf8/d;->i:Landroid/widget/EditText;

    .line 274
    .line 275
    if-nez p1, :cond_a

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_a
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-eqz p1, :cond_b

    .line 283
    .line 284
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 285
    .line 286
    .line 287
    :cond_b
    invoke-virtual {v1}, Lf8/n;->q()V

    .line 288
    .line 289
    .line 290
    :goto_5
    return-void

    .line 291
    :pswitch_9
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/h;

    .line 292
    .line 293
    iget-object p1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 294
    .line 295
    const-string v0, "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html"

    .line 296
    .line 297
    invoke-virtual {p1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;->a(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :pswitch_a
    check-cast v1, LS8/d;

    .line 302
    .line 303
    if-eqz v1, :cond_c

    .line 304
    .line 305
    invoke-virtual {v1}, LS8/d;->invoke()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    :cond_c
    return-void

    .line 309
    :pswitch_b
    check-cast v1, Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;

    .line 310
    .line 311
    invoke-static {v1, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;->b(Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_c
    check-cast v1, Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 316
    .line 317
    invoke-static {v1, p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdView;->b(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/view/View;)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :pswitch_d
    check-cast v1, Lcom/vungle/ads/internal/ui/view/n;

    .line 322
    .line 323
    invoke-static {v1, p1}, Lcom/vungle/ads/internal/ui/view/n;->a(Lcom/vungle/ads/internal/ui/view/n;Landroid/view/View;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
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
