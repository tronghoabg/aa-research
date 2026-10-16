.class public final synthetic Lcom/applovin/adview/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/applovin/adview/a;->a:I

    iput-object p1, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lcom/applovin/adview/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljb/e;

    .line 9
    .line 10
    iget-object v1, v0, Ljb/e;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Ljb/e;->l:Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lkb/d;

    .line 29
    .line 30
    iget-object v2, v2, Lkb/d;->a:Ljava/lang/Runnable;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    return-void

    .line 40
    :pswitch_0
    const/4 v0, 0x0

    .line 41
    iget-object v1, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lio/flutter/plugin/platform/q;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lio/flutter/plugin/platform/q;->i(Z)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_1
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Li2/c;

    .line 52
    .line 53
    invoke-virtual {v0}, Li2/c;->u()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_2
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Landroid/os/HandlerThread;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_3
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lf8/j;

    .line 68
    .line 69
    iget-object v1, v0, Lf8/j;->h:Landroid/widget/AutoCompleteTextView;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v0, v1}, Lf8/j;->t(Z)V

    .line 76
    .line 77
    .line 78
    iput-boolean v1, v0, Lf8/j;->m:Z

    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_4
    const/4 v0, 0x1

    .line 82
    iget-object v1, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lf8/d;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lf8/d;->t(Z)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_5
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, LWa/h;

    .line 93
    .line 94
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 95
    .line 96
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_6
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Leb/b;

    .line 103
    .line 104
    iget-object v0, v0, Leb/b;->f:Leb/c;

    .line 105
    .line 106
    invoke-virtual {v0}, Leb/c;->i0()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_2

    .line 111
    .line 112
    invoke-virtual {v0}, Leb/c;->r()V

    .line 113
    .line 114
    .line 115
    :cond_2
    return-void

    .line 116
    :pswitch_7
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, LN7/e;

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    iput-boolean v1, v0, LN7/e;->b:Z

    .line 122
    .line 123
    iget-object v1, v0, LN7/e;->e:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 126
    .line 127
    iget-object v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lt1/d;

    .line 128
    .line 129
    if-eqz v2, :cond_3

    .line 130
    .line 131
    invoke-virtual {v2}, Lt1/d;->f()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_3

    .line 136
    .line 137
    iget v1, v0, LN7/e;->c:I

    .line 138
    .line 139
    invoke-virtual {v0, v1}, LN7/e;->f(I)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_3
    iget v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 144
    .line 145
    const/4 v3, 0x2

    .line 146
    if-ne v2, v3, :cond_4

    .line 147
    .line 148
    iget v0, v0, LN7/e;->c:I

    .line 149
    .line 150
    invoke-virtual {v1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 151
    .line 152
    .line 153
    :cond_4
    :goto_2
    return-void

    .line 154
    :pswitch_8
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Ld2/e;

    .line 157
    .line 158
    iget-object v1, v0, Ld2/e;->a:Ljava/lang/Object;

    .line 159
    .line 160
    monitor-enter v1

    .line 161
    :try_start_0
    iget-boolean v2, v0, Ld2/e;->m:Z

    .line 162
    .line 163
    if-eqz v2, :cond_5

    .line 164
    .line 165
    monitor-exit v1

    .line 166
    goto :goto_3

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    goto :goto_4

    .line 169
    :cond_5
    iget-wide v2, v0, Ld2/e;->l:J

    .line 170
    .line 171
    const-wide/16 v4, 0x1

    .line 172
    .line 173
    sub-long/2addr v2, v4

    .line 174
    iput-wide v2, v0, Ld2/e;->l:J

    .line 175
    .line 176
    const-wide/16 v4, 0x0

    .line 177
    .line 178
    cmp-long v2, v2, v4

    .line 179
    .line 180
    if-lez v2, :cond_6

    .line 181
    .line 182
    monitor-exit v1

    .line 183
    goto :goto_3

    .line 184
    :cond_6
    if-gez v2, :cond_7

    .line 185
    .line 186
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v2}, Ld2/e;->b(Ljava/lang/IllegalStateException;)V

    .line 192
    .line 193
    .line 194
    monitor-exit v1

    .line 195
    goto :goto_3

    .line 196
    :cond_7
    invoke-virtual {v0}, Ld2/e;->a()V

    .line 197
    .line 198
    .line 199
    monitor-exit v1

    .line 200
    :goto_3
    return-void

    .line 201
    :goto_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    throw v0

    .line 203
    :pswitch_9
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Lcom/unity3d/ads/InitializationListener;

    .line 206
    .line 207
    invoke-static {v0}, Lcom/unity3d/services/core/properties/SdkProperties;->e(Lcom/unity3d/ads/InitializationListener;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_a
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Lcom/unity3d/services/banners/view/ScarBannerContainer;

    .line 214
    .line 215
    invoke-static {v0}, Lcom/unity3d/services/banners/view/ScarBannerContainer;->a(Lcom/unity3d/services/banners/view/ScarBannerContainer;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_b
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lcom/unity3d/services/banners/BannerView;

    .line 222
    .line 223
    invoke-static {v0}, Lcom/unity3d/services/banners/BannerView;->a(Lcom/unity3d/services/banners/BannerView;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_c
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Lcom/unity3d/services/ads/operation/show/ShowOperationState;

    .line 230
    .line 231
    invoke-static {v0}, Lcom/unity3d/services/ads/operation/show/ShowOperationState;->a(Lcom/unity3d/services/ads/operation/show/ShowOperationState;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_d
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;

    .line 238
    .line 239
    invoke-static {v0}, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;->c(Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_e
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Lcom/unity3d/ads/core/domain/InternalLoadListener;

    .line 246
    .line 247
    invoke-static {v0}, Lcom/unity3d/services/ads/UnityAdsImplementation;->b(Lcom/unity3d/ads/core/domain/InternalLoadListener;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_f
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    .line 254
    .line 255
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->a(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_10
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 262
    .line 263
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->a(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :pswitch_11
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->destroy()V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_12
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, LC6/l;

    .line 278
    .line 279
    iget-object v1, v0, LC6/l;->d:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v1, LKd/a;

    .line 282
    .line 283
    new-instance v2, Lcom/moloco/sdk/acm/eventprocessing/h;

    .line 284
    .line 285
    const/4 v3, 0x0

    .line 286
    invoke-direct {v2, v0, v3}, Lcom/moloco/sdk/acm/eventprocessing/h;-><init>(LC6/l;Ljf/c;)V

    .line 287
    .line 288
    .line 289
    const/4 v0, 0x3

    .line 290
    invoke-static {v1, v3, v2, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_13
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Lcom/google/android/material/timepicker/e;

    .line 297
    .line 298
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->m()V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_14
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;

    .line 305
    .line 306
    invoke-static {v0}, Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;->c(Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :pswitch_15
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, Lcom/applovin/mediation/nativeAds/MaxNativeAdView;

    .line 313
    .line 314
    invoke-static {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdView;->c(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_16
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Lcom/applovin/impl/sdk/network/b;

    .line 321
    .line 322
    invoke-static {v0}, Lcom/applovin/impl/sdk/network/b;->d(Lcom/applovin/impl/sdk/network/b;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :pswitch_17
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Lcom/applovin/impl/sdk/f;

    .line 329
    .line 330
    invoke-static {v0}, Lcom/applovin/impl/sdk/f;->a(Lcom/applovin/impl/sdk/f;)V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :pswitch_18
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v0, Lcom/applovin/impl/sdk/b;

    .line 337
    .line 338
    invoke-static {v0}, Lcom/applovin/impl/sdk/b;->a(Lcom/applovin/impl/sdk/b;)V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_19
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;

    .line 345
    .line 346
    invoke-static {v0}, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;->d(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_1a
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;

    .line 353
    .line 354
    invoke-static {v0}, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;->m(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_1b
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lcom/applovin/impl/communicator/CommunicatorMessageImpl;

    .line 361
    .line 362
    invoke-static {v0}, Lcom/applovin/impl/communicator/MessagingServiceImpl;->d(Lcom/applovin/impl/communicator/CommunicatorMessageImpl;)V

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :pswitch_1c
    iget-object v0, p0, Lcom/applovin/adview/a;->b:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Lcom/applovin/adview/AppLovinFullscreenActivity;

    .line 369
    .line 370
    invoke-static {v0}, Lcom/applovin/adview/AppLovinFullscreenActivity;->b(Lcom/applovin/adview/AppLovinFullscreenActivity;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    nop

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
