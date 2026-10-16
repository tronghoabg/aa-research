.class public final synthetic LDb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LDb/b;->a:I

    iput-boolean p5, p0, LDb/b;->c:Z

    iput-object p2, p0, LDb/b;->d:Ljava/lang/Object;

    iput-object p3, p0, LDb/b;->e:Ljava/lang/Object;

    iput-object p4, p0, LDb/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/impl/sdk/EventServiceImpl;Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, LDb/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDb/b;->d:Ljava/lang/Object;

    iput-object p2, p0, LDb/b;->b:Ljava/lang/Object;

    iput-object p3, p0, LDb/b;->e:Ljava/lang/Object;

    iput-boolean p4, p0, LDb/b;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ZI)V
    .locals 0

    .line 3
    iput p5, p0, LDb/b;->a:I

    iput-object p1, p0, LDb/b;->d:Ljava/lang/Object;

    iput-object p2, p0, LDb/b;->e:Ljava/lang/Object;

    iput-object p3, p0, LDb/b;->b:Ljava/lang/Object;

    iput-boolean p4, p0, LDb/b;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/String;Lcom/applovin/mediation/MaxError;I)V
    .locals 0

    .line 4
    iput p5, p0, LDb/b;->a:I

    iput-boolean p1, p0, LDb/b;->c:Z

    iput-object p2, p0, LDb/b;->d:Ljava/lang/Object;

    iput-object p3, p0, LDb/b;->b:Ljava/lang/Object;

    iput-object p4, p0, LDb/b;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, LDb/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 7
    .line 8
    const/16 v0, 0x19

    .line 9
    .line 10
    invoke-direct {v6, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LDb/b;->d:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, v0

    .line 16
    check-cast v2, Lkd/W;

    .line 17
    .line 18
    iget-object v1, v2, Lkd/W;->a:Lkd/r;

    .line 19
    .line 20
    iget-object v0, p0, LDb/b;->e:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v3, v0

    .line 23
    check-cast v3, Landroid/webkit/WebView;

    .line 24
    .line 25
    iget-object v0, p0, LDb/b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    check-cast v4, Ljava/lang/String;

    .line 29
    .line 30
    iget-boolean v5, p0, LDb/b;->c:Z

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v6}, Lkd/r;->a(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;ZLtf/l;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    new-instance v12, Lcom/moloco/sdk/internal/publisher/d;

    .line 37
    .line 38
    const/16 v0, 0x18

    .line 39
    .line 40
    invoke-direct {v12, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, LDb/b;->d:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v8, v0

    .line 46
    check-cast v8, Lkd/T;

    .line 47
    .line 48
    iget-object v7, v8, Lkd/T;->a:Lkd/r;

    .line 49
    .line 50
    iget-object v0, p0, LDb/b;->e:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v9, v0

    .line 53
    check-cast v9, Landroid/webkit/WebView;

    .line 54
    .line 55
    iget-object v0, p0, LDb/b;->b:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v10, v0

    .line 58
    check-cast v10, Ljava/lang/String;

    .line 59
    .line 60
    iget-boolean v11, p0, LDb/b;->c:Z

    .line 61
    .line 62
    invoke-virtual/range {v7 .. v12}, Lkd/r;->a(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;ZLtf/l;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    iget-object v0, p0, LDb/b;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lcom/applovin/mediation/MaxAd;

    .line 69
    .line 70
    iget-boolean v1, p0, LDb/b;->c:Z

    .line 71
    .line 72
    iget-object v2, p0, LDb/b;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lcom/applovin/mediation/MaxRewardedAdListener;

    .line 75
    .line 76
    iget-object v3, p0, LDb/b;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Lcom/applovin/mediation/MaxReward;

    .line 79
    .line 80
    invoke-static {v1, v2, v0, v3}, Lcom/applovin/impl/t2;->e(ZLcom/applovin/mediation/MaxRewardedAdListener;Lcom/applovin/mediation/MaxAd;Lcom/applovin/mediation/MaxReward;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_2
    iget-object v0, p0, LDb/b;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lcom/applovin/mediation/MaxAd;

    .line 87
    .line 88
    iget-object v1, p0, LDb/b;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lcom/applovin/mediation/MaxAd;

    .line 91
    .line 92
    iget-object v2, p0, LDb/b;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Lcom/applovin/mediation/MaxAdExpirationListener;

    .line 95
    .line 96
    iget-boolean v3, p0, LDb/b;->c:Z

    .line 97
    .line 98
    invoke-static {v3, v2, v0, v1}, Lcom/applovin/impl/t2;->L(ZLcom/applovin/mediation/MaxAdExpirationListener;Lcom/applovin/mediation/MaxAd;Lcom/applovin/mediation/MaxAd;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_3
    iget-object v0, p0, LDb/b;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/lang/String;

    .line 105
    .line 106
    iget-object v1, p0, LDb/b;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;

    .line 109
    .line 110
    iget-boolean v2, p0, LDb/b;->c:Z

    .line 111
    .line 112
    iget-object v3, p0, LDb/b;->e:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, Lcom/applovin/mediation/MaxError;

    .line 115
    .line 116
    invoke-static {v2, v1, v0, v3}, Lcom/applovin/impl/t2;->f(ZLcom/applovin/mediation/nativeAds/MaxNativeAdListener;Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_4
    iget-object v0, p0, LDb/b;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lcom/applovin/mediation/MaxAd;

    .line 123
    .line 124
    iget-object v1, p0, LDb/b;->d:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Lcom/applovin/mediation/MaxAdListener;

    .line 127
    .line 128
    iget-boolean v2, p0, LDb/b;->c:Z

    .line 129
    .line 130
    iget-object v3, p0, LDb/b;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Lcom/applovin/mediation/MaxError;

    .line 133
    .line 134
    invoke-static {v2, v1, v0, v3}, Lcom/applovin/impl/t2;->o(ZLcom/applovin/mediation/MaxAdListener;Lcom/applovin/mediation/MaxAd;Lcom/applovin/mediation/MaxError;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_5
    iget-object v0, p0, LDb/b;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lcom/applovin/mediation/MaxAd;

    .line 141
    .line 142
    iget-object v1, p0, LDb/b;->d:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;

    .line 145
    .line 146
    iget-boolean v2, p0, LDb/b;->c:Z

    .line 147
    .line 148
    iget-object v3, p0, LDb/b;->e:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v3, Lcom/applovin/mediation/nativeAds/MaxNativeAdView;

    .line 151
    .line 152
    invoke-static {v2, v1, v3, v0}, Lcom/applovin/impl/t2;->g(ZLcom/applovin/mediation/nativeAds/MaxNativeAdListener;Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_6
    iget-object v0, p0, LDb/b;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ljava/lang/String;

    .line 159
    .line 160
    iget-object v1, p0, LDb/b;->d:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, Lcom/applovin/mediation/MaxAdListener;

    .line 163
    .line 164
    iget-boolean v2, p0, LDb/b;->c:Z

    .line 165
    .line 166
    iget-object v3, p0, LDb/b;->e:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v3, Lcom/applovin/mediation/MaxError;

    .line 169
    .line 170
    invoke-static {v2, v1, v0, v3}, Lcom/applovin/impl/t2;->M(ZLcom/applovin/mediation/MaxAdListener;Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_7
    iget-object v0, p0, LDb/b;->d:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Lcom/applovin/impl/sdk/EventServiceImpl;

    .line 177
    .line 178
    iget-object v1, p0, LDb/b;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/lang/String;

    .line 181
    .line 182
    iget-object v2, p0, LDb/b;->e:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v2, Ljava/util/Map;

    .line 185
    .line 186
    iget-boolean v3, p0, LDb/b;->c:Z

    .line 187
    .line 188
    invoke-static {v0, v1, v2, v3}, Lcom/applovin/impl/sdk/EventServiceImpl;->a(Lcom/applovin/impl/sdk/EventServiceImpl;Ljava/lang/String;Ljava/util/Map;Z)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :pswitch_8
    iget-object v0, p0, LDb/b;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, LD6/o;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    const-string v1, "FirebaseCrashlytics"

    .line 200
    .line 201
    const/4 v2, 0x3

    .line 202
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_0

    .line 207
    .line 208
    const-string v2, "disk worker: log non-fatal event to persistence"

    .line 209
    .line 210
    const/4 v3, 0x0

    .line 211
    invoke-static {v1, v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 212
    .line 213
    .line 214
    :cond_0
    iget-object v0, v0, LD6/o;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, LX8/a;

    .line 217
    .line 218
    iget-object v1, p0, LDb/b;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, LU8/L0;

    .line 221
    .line 222
    iget-object v2, p0, LDb/b;->b:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v2, Ljava/lang/String;

    .line 225
    .line 226
    iget-boolean v3, p0, LDb/b;->c:Z

    .line 227
    .line 228
    invoke-virtual {v0, v1, v2, v3}, LX8/a;->d(LU8/L0;Ljava/lang/String;Z)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_9
    iget-object v0, p0, LDb/b;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Ljava/lang/String;

    .line 235
    .line 236
    iget-boolean v1, p0, LDb/b;->c:Z

    .line 237
    .line 238
    iget-object v2, p0, LDb/b;->d:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Lcom/vungle/ads/internal/network/r;

    .line 241
    .line 242
    iget-object v3, p0, LDb/b;->e:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v3, Lcom/vungle/ads/internal/network/q;

    .line 245
    .line 246
    invoke-static {v2, v3, v0, v1}, Lcom/vungle/ads/internal/network/r;->a(Lcom/vungle/ads/internal/network/r;Lcom/vungle/ads/internal/network/q;Ljava/lang/String;Z)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
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
