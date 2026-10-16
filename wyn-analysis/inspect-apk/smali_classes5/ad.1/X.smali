.class public Lad/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;
.implements Luc/p;


# instance fields
.field public a:Lqc/a;

.field public b:LG9/e;

.field public c:Lad/a;

.field public d:Lad/b;

.field public e:Lcd/k;

.field public final f:Ljava/util/HashMap;

.field public final g:Lad/I;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lad/X;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Lad/I;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lad/I;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lad/X;->g:Lad/I;

    .line 18
    .line 19
    return-void
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p0
.end method


# virtual methods
.method public final onAttachedToActivity(Lrc/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/X;->b:LG9/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Lq/s1;

    .line 7
    .line 8
    iget-object v1, v1, Lq/s1;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/app/Activity;

    .line 11
    .line 12
    iput-object v1, v0, LG9/e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lad/X;->c:Lad/a;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Lq/s1;

    .line 20
    .line 21
    iget-object v1, v1, Lq/s1;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroid/app/Activity;

    .line 24
    .line 25
    iput-object v1, v0, Lad/a;->d:Landroid/content/Context;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lad/X;->e:Lcd/k;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Lq/s1;

    .line 32
    .line 33
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Landroid/app/Activity;

    .line 36
    .line 37
    iput-object p1, v0, Lcd/k;->d:Landroid/app/Activity;

    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lad/X;->a:Lqc/a;

    .line 2
    .line 3
    new-instance v0, Lad/a;

    .line 4
    .line 5
    iget-object v1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v2, LY1/t;

    .line 8
    .line 9
    invoke-direct {v2}, LY1/t;-><init>()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v4, 0x21

    .line 15
    .line 16
    if-lt v3, v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {}, LG6/T;->g()Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v3, v4, v5}, LG6/T;->e(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const/16 v5, 0x80

    .line 52
    .line 53
    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :goto_0
    iget-object v4, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 58
    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    const-string v5, "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iput-object v4, v2, LY1/t;->c:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 70
    .line 71
    const-string v4, "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION"

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iput-object v3, v2, LY1/t;->b:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    :catch_0
    :cond_1
    invoke-direct {v0, v1, v2}, Lad/a;-><init>(Landroid/content/Context;LY1/t;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lad/X;->c:Lad/a;

    .line 83
    .line 84
    new-instance v0, Luc/r;

    .line 85
    .line 86
    new-instance v1, Luc/x;

    .line 87
    .line 88
    iget-object v2, p0, Lad/X;->c:Lad/a;

    .line 89
    .line 90
    invoke-direct {v1, v2}, Luc/x;-><init>(Luc/w;)V

    .line 91
    .line 92
    .line 93
    const-string v2, "plugins.flutter.io/google_mobile_ads"

    .line 94
    .line 95
    iget-object v3, p1, Lqc/a;->c:Luc/f;

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-direct {v0, v3, v2, v1, v4}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, LG9/e;

    .line 105
    .line 106
    invoke-direct {v1, v0}, LG9/e;-><init>(Luc/r;)V

    .line 107
    .line 108
    .line 109
    iput-object v1, p0, Lad/X;->b:LG9/e;

    .line 110
    .line 111
    new-instance v0, Lad/Z;

    .line 112
    .line 113
    invoke-direct {v0, v1}, Lad/Z;-><init>(LG9/e;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p1, Lqc/a;->e:Lio/flutter/plugin/platform/n;

    .line 117
    .line 118
    const-string v2, "plugins.flutter.io/google_mobile_ads/ad_widget"

    .line 119
    .line 120
    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/platform/n;->j(Ljava/lang/String;Lio/flutter/plugin/platform/f;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Lad/b;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    new-instance v1, Luc/r;

    .line 129
    .line 130
    const-string v2, "plugins.flutter.io/google_mobile_ads/app_state_method"

    .line 131
    .line 132
    invoke-direct {v1, v3, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    .line 136
    .line 137
    .line 138
    new-instance v1, Luc/j;

    .line 139
    .line 140
    const-string v2, "plugins.flutter.io/google_mobile_ads/app_state_event"

    .line 141
    .line 142
    invoke-direct {v1, v3, v2}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v0}, Luc/j;->a(Luc/i;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Lad/X;->d:Lad/b;

    .line 149
    .line 150
    new-instance v0, Lcd/k;

    .line 151
    .line 152
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 153
    .line 154
    invoke-direct {v0, v3, p1}, Lcd/k;-><init>(Luc/f;Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    iput-object v0, p0, Lad/X;->e:Lcd/k;

    .line 158
    .line 159
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/X;->c:Lad/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lad/X;->a:Lqc/a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v1, Lqc/a;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object v1, v0, Lad/a;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lad/X;->b:LG9/e;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-object v1, v0, LG9/e;->b:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lad/X;->e:Lcd/k;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iput-object v1, v0, Lcd/k;->d:Landroid/app/Activity;

    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/X;->c:Lad/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lad/X;->a:Lqc/a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v1, Lqc/a;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object v1, v0, Lad/a;->d:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lad/X;->b:LG9/e;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-object v1, v0, LG9/e;->b:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lad/X;->e:Lcd/k;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iput-object v1, v0, Lcd/k;->d:Landroid/app/Activity;

    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lad/X;->d:Lad/b;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/lifecycle/J;->i:Landroidx/lifecycle/J;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/lifecycle/J;->f:Landroidx/lifecycle/x;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->c(Landroidx/lifecycle/u;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lad/X;->d:Lad/b;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v6, 0x0

    .line 1
    iget-object v7, v0, Lad/X;->b:LG9/e;

    const-string v8, "GoogleMobileAdsPlugin"

    if-eqz v7, :cond_57

    iget-object v9, v0, Lad/X;->a:Lqc/a;

    if-nez v9, :cond_0

    goto/16 :goto_18

    .line 2
    :cond_0
    iget-object v7, v7, LG9/e;->b:Ljava/lang/Object;

    check-cast v7, Landroid/app/Activity;

    if-eqz v7, :cond_1

    :goto_0
    move-object v10, v7

    goto :goto_1

    .line 3
    :cond_1
    iget-object v7, v9, Lqc/a;->a:Landroid/content/Context;

    goto :goto_0

    .line 4
    :goto_1
    iget-object v7, v1, Luc/o;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "FlutterRewardedAd"

    const-string v11, "InvalidRequest"

    const-string v12, "FlutterRIAd"

    const-string v13, "adManagerRequest"

    const-string v14, "A null or invalid ad request was provided."

    iget-object v15, v0, Lad/X;->g:Lad/I;

    const-string v4, "request"

    const-string v3, "adUnitId"

    const-string v5, "adId"

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v20

    sparse-switch v20, :sswitch_data_0

    :goto_2
    const/4 v2, -0x1

    goto/16 :goto_3

    :sswitch_0
    const-string v2, "loadRewardedInterstitialAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0x19

    goto/16 :goto_3

    :sswitch_1
    const-string v2, "setImmersiveMode"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    const/16 v2, 0x18

    goto/16 :goto_3

    :sswitch_2
    const-string v2, "MobileAds#initialize"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    const/16 v2, 0x17

    goto/16 :goto_3

    :sswitch_3
    const-string v2, "showAdWithoutView"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v2, 0x16

    goto/16 :goto_3

    :sswitch_4
    const-string v2, "MobileAds#openAdInspector"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    const/16 v2, 0x15

    goto/16 :goto_3

    :sswitch_5
    const-string v2, "MobileAds#disableMediationInitialization"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    const/16 v2, 0x14

    goto/16 :goto_3

    :sswitch_6
    const-string v2, "MobileAds#updateRequestConfiguration"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    const/16 v2, 0x13

    goto/16 :goto_3

    :sswitch_7
    const-string v2, "getAdSize"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_2

    :cond_9
    const/16 v2, 0x12

    goto/16 :goto_3

    :sswitch_8
    const-string v2, "disposeAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_2

    :cond_a
    const/16 v2, 0x11

    goto/16 :goto_3

    :sswitch_9
    const-string v2, "_init"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_2

    :cond_b
    const/16 v2, 0x10

    goto/16 :goto_3

    :sswitch_a
    const-string v2, "loadAdManagerBannerAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_2

    :cond_c
    const/16 v2, 0xf

    goto/16 :goto_3

    :sswitch_b
    const-string v2, "MobileAds#getVersionString"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_2

    :cond_d
    const/16 v2, 0xe

    goto/16 :goto_3

    :sswitch_c
    const-string v2, "MobileAds#setAppVolume"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_2

    :cond_e
    const/16 v2, 0xd

    goto/16 :goto_3

    :sswitch_d
    const-string v2, "loadBannerAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_2

    :cond_f
    const/16 v2, 0xc

    goto/16 :goto_3

    :sswitch_e
    const-string v2, "loadAdManagerInterstitialAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_2

    :cond_10
    const/16 v2, 0xb

    goto/16 :goto_3

    :sswitch_f
    const-string v2, "AdSize#getAnchoredAdaptiveBannerAdSize"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_2

    :cond_11
    const/16 v2, 0xa

    goto/16 :goto_3

    :sswitch_10
    const-string v2, "setServerSideVerificationOptions"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto/16 :goto_2

    :cond_12
    const/16 v2, 0x9

    goto/16 :goto_3

    :sswitch_11
    const-string v2, "loadNativeAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto/16 :goto_2

    :cond_13
    const/16 v2, 0x8

    goto/16 :goto_3

    :sswitch_12
    const-string v2, "loadFluidAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto/16 :goto_2

    :cond_14
    const/4 v2, 0x7

    goto :goto_3

    :sswitch_13
    const-string v2, "MobileAds#getRequestConfiguration"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto/16 :goto_2

    :cond_15
    const/4 v2, 0x6

    goto :goto_3

    :sswitch_14
    const-string v2, "loadRewardedAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto/16 :goto_2

    :cond_16
    const/4 v2, 0x5

    goto :goto_3

    :sswitch_15
    const-string v2, "MobileAds#registerWebView"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    goto/16 :goto_2

    :cond_17
    const/4 v2, 0x4

    goto :goto_3

    :sswitch_16
    const-string v2, "loadAppOpenAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto/16 :goto_2

    :cond_18
    const/4 v2, 0x3

    goto :goto_3

    :sswitch_17
    const-string v2, "MobileAds#setAppMuted"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_2

    :cond_19
    const/4 v2, 0x2

    goto :goto_3

    :sswitch_18
    const-string v2, "loadInterstitialAd"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto/16 :goto_2

    :cond_1a
    const/4 v2, 0x1

    goto :goto_3

    :sswitch_19
    const-string v2, "MobileAds#openDebugMenu"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto/16 :goto_2

    :cond_1b
    move v2, v6

    :goto_3
    packed-switch v2, :pswitch_data_0

    .line 5
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    invoke-virtual {v1}, Ltc/g;->c()V

    return-void

    .line 6
    :pswitch_0
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Ljava/lang/String;

    invoke-static/range {v24 .. v24}, Lad/X;->a(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Lad/q;

    .line 8
    invoke-virtual {v1, v13}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lad/l;

    if-eqz v25, :cond_1c

    .line 9
    new-instance v21, Lad/T;

    .line 10
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v22

    iget-object v2, v0, Lad/X;->b:LG9/e;

    .line 11
    invoke-static {v2}, Lad/X;->a(Ljava/lang/Object;)V

    new-instance v3, LJ4/c;

    invoke-direct {v3, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v23, v2

    move-object/from16 v26, v3

    invoke-direct/range {v21 .. v26}, Lad/T;-><init>(ILG9/e;Ljava/lang/String;Lad/q;LJ4/c;)V

    :goto_4
    move-object/from16 v2, v21

    goto :goto_5

    :cond_1c
    if-eqz v2, :cond_1f

    .line 12
    new-instance v21, Lad/T;

    .line 13
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v22

    iget-object v3, v0, Lad/X;->b:LG9/e;

    .line 14
    invoke-static {v3}, Lad/X;->a(Ljava/lang/Object;)V

    new-instance v4, LJ4/c;

    invoke-direct {v4, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v25, v2

    move-object/from16 v23, v3

    move-object/from16 v26, v4

    invoke-direct/range {v21 .. v26}, Lad/T;-><init>(ILG9/e;Ljava/lang/String;Lad/l;LJ4/c;)V

    goto :goto_4

    .line 15
    :goto_5
    iget-object v3, v0, Lad/X;->b:LG9/e;

    .line 16
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lad/X;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 17
    invoke-virtual {v3, v2, v1}, LG9/e;->F(Lad/i;I)V

    .line 18
    new-instance v1, Lad/S;

    invoke-direct {v1, v2}, Lad/S;-><init>(Lad/T;)V

    .line 19
    iget-object v3, v2, Lad/T;->c:Ljava/lang/String;

    iget-object v4, v2, Lad/T;->d:LJ4/c;

    iget-object v4, v4, LJ4/c;->a:Landroid/content/Context;

    iget-object v5, v2, Lad/T;->e:Lad/q;

    if-eqz v5, :cond_1d

    .line 20
    invoke-virtual {v5}, Lad/q;->a()Lx6/g;

    move-result-object v2

    .line 21
    invoke-static {v4, v3, v2, v1}, LS6/a;->load(Landroid/content/Context;Ljava/lang/String;Lx6/g;LS6/b;)V

    goto :goto_6

    .line 22
    :cond_1d
    iget-object v2, v2, Lad/T;->f:Lad/l;

    if-eqz v2, :cond_1e

    .line 23
    invoke-virtual {v2}, Lad/l;->c()Ly6/b;

    move-result-object v2

    .line 24
    invoke-static {v4, v3, v2, v1}, LS6/a;->load(Landroid/content/Context;Ljava/lang/String;Ly6/b;LS6/b;)V

    goto :goto_6

    .line 25
    :cond_1e
    invoke-static {v12, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    :goto_6
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    :cond_1f
    const/4 v2, 0x0

    .line 27
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    invoke-virtual {v1, v11, v14, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 28
    :pswitch_1
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    iget-object v2, v2, LG9/e;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    .line 30
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lad/i;

    .line 31
    check-cast v2, Lad/g;

    const-string v3, "immersiveModeEnabled"

    .line 32
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2, v1}, Lad/g;->c(Z)V

    .line 33
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 34
    :pswitch_2
    new-instance v1, Lad/W;

    move-object/from16 v2, p2

    check-cast v2, Ltc/g;

    invoke-direct {v1, v2}, Lad/W;-><init>(Ltc/g;)V

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, LL7/b;

    const/16 v4, 0xd

    invoke-direct {v3, v4, v10, v1}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 36
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    return-void

    .line 37
    :pswitch_3
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    iget-object v2, v2, LG9/e;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lad/i;

    .line 39
    check-cast v1, Lad/g;

    if-nez v1, :cond_20

    .line 40
    const-string v1, "Ad failed to show."

    move-object/from16 v2, p2

    check-cast v2, Ltc/g;

    const-string v3, "AdShowError"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_20
    const/4 v4, 0x0

    .line 41
    invoke-virtual {v1}, Lad/g;->d()V

    .line 42
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    invoke-virtual {v1, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 43
    :pswitch_4
    new-instance v1, La2/c;

    move-object/from16 v2, p2

    check-cast v2, Ltc/g;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, La2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {v10, v1}, Lcom/google/android/gms/ads/MobileAds;->openAdInspector(Landroid/content/Context;Lx6/p;)V

    return-void

    .line 45
    :pswitch_5
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    invoke-static {v10}, Lcom/google/android/gms/ads/MobileAds;->disableMediationAdapterInitialization(Landroid/content/Context;)V

    .line 47
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 48
    :pswitch_6
    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->getRequestConfiguration()Lx6/s;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    new-instance v3, Lrd/d;

    invoke-direct {v3}, Lrd/d;-><init>()V

    .line 50
    iget v4, v2, Lx6/s;->a:I

    .line 51
    invoke-virtual {v3, v4}, Lrd/d;->c(I)V

    iget v4, v2, Lx6/s;->b:I

    .line 52
    invoke-virtual {v3, v4}, Lrd/d;->d(I)V

    iget-object v4, v2, Lx6/s;->c:Ljava/lang/String;

    .line 53
    invoke-virtual {v3, v4}, Lrd/d;->b(Ljava/lang/String;)V

    iget-object v4, v2, Lx6/s;->d:Ljava/util/ArrayList;

    .line 54
    iget-object v5, v3, Lrd/d;->e:Ljava/lang/Object;

    move-object v10, v5

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    if-eqz v4, :cond_21

    .line 55
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 56
    :cond_21
    iget v2, v2, Lx6/s;->e:I

    iput v2, v3, Lrd/d;->c:I

    .line 57
    const-string v2, "maxAdContentRating"

    invoke-virtual {v1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 58
    const-string v4, "tagForChildDirectedTreatment"

    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 59
    const-string v5, "tagForUnderAgeOfConsent"

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 60
    const-string v6, "testDeviceIds"

    invoke-virtual {v1, v6}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v2, :cond_22

    .line 61
    invoke-virtual {v3, v2}, Lrd/d;->b(Ljava/lang/String;)V

    :cond_22
    if-eqz v4, :cond_23

    .line 62
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lrd/d;->c(I)V

    :cond_23
    if-eqz v5, :cond_24

    .line 63
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lrd/d;->d(I)V

    :cond_24
    if-eqz v1, :cond_25

    .line 64
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 65
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 66
    :cond_25
    new-instance v6, Lx6/s;

    iget v7, v3, Lrd/d;->a:I

    iget v8, v3, Lrd/d;->b:I

    iget-object v1, v3, Lrd/d;->d:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    iget v11, v3, Lrd/d;->c:I

    invoke-direct/range {v6 .. v11}, Lx6/s;-><init>(IILjava/lang/String;Ljava/util/ArrayList;I)V

    .line 67
    invoke-static {v6}, Lcom/google/android/gms/ads/MobileAds;->setRequestConfiguration(Lx6/s;)V

    .line 68
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 69
    :pswitch_7
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    iget-object v2, v2, LG9/e;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    .line 71
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lad/i;

    if-nez v1, :cond_26

    .line 72
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 73
    :cond_26
    instance-of v2, v1, Lad/C;

    if-eqz v2, :cond_29

    .line 74
    check-cast v1, Lad/C;

    .line 75
    iget-object v2, v1, Lad/C;->c:Lx6/h;

    if-eqz v2, :cond_28

    invoke-virtual {v2}, Lx6/j;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v2

    if-nez v2, :cond_27

    goto :goto_7

    .line 76
    :cond_27
    new-instance v2, Lad/w;

    iget-object v1, v1, Lad/C;->c:Lx6/h;

    invoke-virtual {v1}, Lx6/j;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v1

    invoke-direct {v2, v1}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    goto :goto_8

    :cond_28
    :goto_7
    const/4 v2, 0x0

    .line 77
    :goto_8
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 78
    :cond_29
    instance-of v2, v1, Lad/n;

    if-eqz v2, :cond_2c

    .line 79
    check-cast v1, Lad/n;

    .line 80
    iget-object v2, v1, Lad/n;->g:Ly6/c;

    if-eqz v2, :cond_2b

    invoke-virtual {v2}, Lx6/j;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v2

    if-nez v2, :cond_2a

    goto :goto_9

    .line 81
    :cond_2a
    new-instance v2, Lad/w;

    iget-object v1, v1, Lad/n;->g:Ly6/c;

    invoke-virtual {v1}, Lx6/j;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    move-result-object v1

    invoke-direct {v2, v1}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    goto :goto_a

    :cond_2b
    :goto_9
    const/4 v2, 0x0

    .line 82
    :goto_a
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 83
    :cond_2c
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected ad type for getAdSize: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "unexpected_ad_type"

    move-object/from16 v3, p2

    check-cast v3, Ltc/g;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 84
    :pswitch_8
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    iget-object v2, v2, LG9/e;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    .line 86
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2d

    goto :goto_b

    .line 87
    :cond_2d
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad/i;

    if-eqz v3, :cond_2e

    .line 88
    invoke-virtual {v3}, Lad/i;->a()V

    .line 89
    :cond_2e
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :goto_b
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 91
    :pswitch_9
    iget-object v1, v0, Lad/X;->b:LG9/e;

    .line 92
    iget-object v1, v1, LG9/e;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    .line 93
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2f
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_30

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 94
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2f

    .line 95
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad/i;

    invoke-virtual {v3}, Lad/i;->a()V

    goto :goto_c

    .line 96
    :cond_30
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 97
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 98
    :pswitch_a
    new-instance v2, Lad/n;

    .line 99
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, v0, Lad/X;->b:LG9/e;

    .line 100
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    const-string v3, "sizes"

    .line 101
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 102
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lad/l;

    .line 103
    new-instance v12, LE0/a;

    invoke-direct {v12, v10, v6}, LE0/a;-><init>(Landroid/content/Context;Z)V

    move-object v6, v2

    move-object v10, v3

    .line 104
    invoke-direct/range {v6 .. v12}, Lad/n;-><init>(ILG9/e;Ljava/lang/String;Ljava/util/List;Lad/l;LE0/a;)V

    .line 105
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v6, v1}, LG9/e;->F(Lad/i;I)V

    .line 106
    invoke-virtual {v6}, Lad/n;->c()V

    .line 107
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 108
    :pswitch_b
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->getVersion()Lx6/u;

    move-result-object v1

    invoke-virtual {v1}, Lx6/u;->toString()Ljava/lang/String;

    move-result-object v1

    .line 110
    move-object/from16 v2, p2

    check-cast v2, Ltc/g;

    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 111
    :pswitch_c
    const-string v2, "volume"

    invoke-virtual {v1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    double-to-float v1, v1

    .line 112
    invoke-static {v1}, Lcom/google/android/gms/ads/MobileAds;->setAppVolume(F)V

    .line 113
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 114
    :pswitch_d
    new-instance v11, Lad/C;

    .line 115
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v13, v0, Lad/X;->b:LG9/e;

    .line 116
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    .line 117
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lad/q;

    const-string v2, "size"

    .line 118
    invoke-virtual {v1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lad/w;

    .line 119
    new-instance v2, LE0/a;

    invoke-direct {v2, v10, v6}, LE0/a;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v17, v2

    .line 120
    invoke-direct/range {v11 .. v17}, Lad/C;-><init>(ILG9/e;Ljava/lang/String;Lad/q;Lad/w;LE0/a;)V

    move-object/from16 v2, v16

    .line 121
    iget-object v3, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v11, v1}, LG9/e;->F(Lad/i;I)V

    .line 122
    new-instance v1, Lx6/h;

    invoke-direct {v1, v10}, Lx6/h;-><init>(Landroid/content/Context;)V

    .line 123
    iput-object v1, v11, Lad/C;->c:Lx6/h;

    .line 124
    invoke-virtual {v1, v14}, Lx6/j;->setAdUnitId(Ljava/lang/String;)V

    .line 125
    iget-object v1, v11, Lad/C;->c:Lx6/h;

    iget-object v2, v2, Lad/w;->a:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v1, v2}, Lx6/j;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 126
    iget-object v1, v11, Lad/C;->c:Lx6/h;

    new-instance v2, LS3/e;

    const/16 v3, 0x1c

    invoke-direct {v2, v13, v6, v11, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lx6/j;->setOnPaidEventListener(Lx6/q;)V

    .line 127
    iget-object v1, v11, Lad/C;->c:Lx6/h;

    new-instance v2, Lad/D;

    invoke-direct {v2, v12, v13, v11}, Lad/D;-><init>(ILG9/e;Lad/k;)V

    invoke-virtual {v1, v2}, Lx6/j;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 128
    iget-object v1, v11, Lad/C;->c:Lx6/h;

    invoke-virtual {v15}, Lad/q;->a()Lx6/g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lx6/j;->b(Lx6/g;)V

    .line 129
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 130
    :pswitch_e
    new-instance v11, Lad/p;

    .line 131
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v13, v0, Lad/X;->b:LG9/e;

    .line 132
    invoke-static {v13}, Lad/X;->a(Ljava/lang/Object;)V

    .line 133
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Lad/X;->a(Ljava/lang/Object;)V

    .line 134
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lad/l;

    new-instance v2, LJ4/c;

    invoke-direct {v2, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v16}, Lad/p;-><init>(ILG9/e;Ljava/lang/String;Lad/l;LJ4/c;)V

    .line 135
    iget-object v2, v0, Lad/X;->b:LG9/e;

    .line 136
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lad/X;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 137
    invoke-virtual {v2, v11, v1}, LG9/e;->F(Lad/i;I)V

    .line 138
    invoke-virtual {v15}, Lad/l;->c()Ly6/b;

    move-result-object v1

    new-instance v2, Lad/o;

    invoke-direct {v2, v11}, Lad/o;-><init>(Lad/p;)V

    .line 139
    invoke-static {v10, v14, v1, v2}, Ly6/d;->load(Landroid/content/Context;Ljava/lang/String;Ly6/b;Ly6/e;)V

    .line 140
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 141
    :pswitch_f
    const-string v2, "orientation"

    .line 142
    invoke-virtual {v1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "width"

    .line 143
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v2, :cond_31

    .line 144
    sget-object v2, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 145
    invoke-static {v10, v1, v6}, LH6/f;->k(Landroid/content/Context;II)Lcom/google/android/gms/ads/AdSize;

    move-result-object v1

    const/4 v3, 0x1

    .line 146
    iput-boolean v3, v1, Lcom/google/android/gms/ads/AdSize;->d:Z

    goto :goto_d

    :cond_31
    const/4 v3, 0x1

    .line 147
    const-string v4, "portrait"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_32

    .line 148
    sget-object v2, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 149
    invoke-static {v10, v1, v3}, LH6/f;->k(Landroid/content/Context;II)Lcom/google/android/gms/ads/AdSize;

    move-result-object v1

    .line 150
    iput-boolean v3, v1, Lcom/google/android/gms/ads/AdSize;->d:Z

    goto :goto_d

    .line 151
    :cond_32
    const-string v4, "landscape"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_34

    .line 152
    sget-object v2, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    const/4 v2, 0x2

    .line 153
    invoke-static {v10, v1, v2}, LH6/f;->k(Landroid/content/Context;II)Lcom/google/android/gms/ads/AdSize;

    move-result-object v1

    .line 154
    iput-boolean v3, v1, Lcom/google/android/gms/ads/AdSize;->d:Z

    .line 155
    :goto_d
    sget-object v2, Lcom/google/android/gms/ads/AdSize;->n:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdSize;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    .line 156
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 157
    :cond_33
    iget v1, v1, Lcom/google/android/gms/ads/AdSize;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p2

    check-cast v2, Ltc/g;

    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 158
    :cond_34
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unexpected value for orientation: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 159
    :pswitch_10
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    iget-object v2, v2, LG9/e;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    .line 161
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lad/i;

    .line 162
    const-string v3, "serverSideVerificationOptions"

    .line 163
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lad/U;

    if-nez v2, :cond_35

    .line 164
    const-string v1, "Error - null ad in setServerSideVerificationOptions"

    invoke-static {v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_e

    .line 165
    :cond_35
    instance-of v3, v2, Lad/Q;

    if-eqz v3, :cond_37

    .line 166
    check-cast v2, Lad/Q;

    .line 167
    iget-object v2, v2, Lad/Q;->g:LR6/c;

    if-eqz v2, :cond_36

    .line 168
    invoke-virtual {v1}, Lad/U;->a()LR6/e;

    move-result-object v1

    invoke-virtual {v2, v1}, LR6/c;->setServerSideVerificationOptions(LR6/e;)V

    goto :goto_e

    .line 169
    :cond_36
    const-string v1, "RewardedAd is null in setServerSideVerificationOptions"

    invoke-static {v9, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_e

    .line 170
    :cond_37
    instance-of v3, v2, Lad/T;

    if-eqz v3, :cond_39

    .line 171
    check-cast v2, Lad/T;

    .line 172
    iget-object v2, v2, Lad/T;->g:LS6/a;

    if-eqz v2, :cond_38

    .line 173
    invoke-virtual {v1}, Lad/U;->a()LR6/e;

    move-result-object v1

    .line 174
    invoke-virtual {v2, v1}, LS6/a;->setServerSideVerificationOptions(LR6/e;)V

    goto :goto_e

    .line 175
    :cond_38
    const-string v1, "RewardedInterstitialAd is null in setServerSideVerificationOptions"

    invoke-static {v12, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_e

    .line 176
    :cond_39
    const-string v1, "Error - setServerSideVerificationOptions called on non-rewarded ad"

    invoke-static {v8, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    :goto_e
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 178
    :pswitch_11
    const-string v2, "factoryId"

    invoke-virtual {v1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 179
    iget-object v7, v0, Lad/X;->f:Ljava/util/HashMap;

    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_4d

    .line 180
    const-string v7, "nativeTemplateStyle"

    invoke-virtual {v1, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lbd/b;

    if-nez v8, :cond_3a

    .line 181
    const-string v1, "No NativeAdFactory with id: "

    .line 182
    const-string v3, " or nativeTemplateStyle"

    .line 183
    invoke-static {v1, v2, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 184
    const-string v2, "NativeAdError"

    move-object/from16 v3, p2

    check-cast v3, Ltc/g;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 185
    :cond_3a
    iget-object v12, v0, Lad/X;->b:LG9/e;

    .line 186
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 187
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad/q;

    .line 188
    invoke-virtual {v1, v13}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lad/l;

    const-string v8, "customOptions"

    .line 189
    invoke-virtual {v1, v8}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v16, v8

    check-cast v16, Ljava/util/Map;

    .line 190
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "nativeAdOptions"

    .line 191
    invoke-virtual {v1, v9}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v17, v9

    check-cast v17, Lad/M;

    new-instance v15, LJ4/c;

    invoke-direct {v15, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    .line 192
    invoke-virtual {v1, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v18, v6

    check-cast v18, Lbd/b;

    if-eqz v12, :cond_4c

    if-eqz v2, :cond_4b

    if-eqz v18, :cond_4a

    if-nez v3, :cond_3c

    if-eqz v4, :cond_3b

    goto :goto_f

    .line 193
    :cond_3b
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "adRequest or addManagerRequest must be non-null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3c
    :goto_f
    if-nez v3, :cond_3d

    .line 194
    new-instance v9, Lad/J;

    .line 195
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v11

    move-object v13, v2

    move-object v2, v14

    move-object v14, v4

    invoke-direct/range {v9 .. v18}, Lad/J;-><init>(Landroid/content/Context;ILG9/e;Ljava/lang/String;Lad/l;LJ4/c;Ljava/util/Map;Lad/M;Lbd/b;)V

    goto :goto_10

    :cond_3d
    move-object v13, v2

    move-object v2, v14

    .line 196
    new-instance v9, Lad/J;

    .line 197
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v11

    move-object v14, v3

    invoke-direct/range {v9 .. v18}, Lad/J;-><init>(Landroid/content/Context;ILG9/e;Ljava/lang/String;Lad/q;LJ4/c;Ljava/util/Map;Lad/M;Lbd/b;)V

    .line 198
    :goto_10
    iget-object v3, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v9, v1}, LG9/e;->F(Lad/i;I)V

    .line 199
    new-instance v1, Lad/L;

    invoke-direct {v1, v9}, Lad/L;-><init>(Lad/J;)V

    .line 200
    new-instance v3, Lad/K;

    .line 201
    iget v4, v9, Lad/i;->a:I

    iget-object v5, v9, Lad/J;->b:LG9/e;

    invoke-direct {v3, v4, v5}, Lad/j;-><init>(ILG9/e;)V

    .line 202
    iget-object v4, v9, Lad/J;->g:Lad/M;

    if-nez v4, :cond_3e

    .line 203
    new-instance v4, Lcom/google/android/gms/ads/nativead/f;

    invoke-direct {v4}, Lcom/google/android/gms/ads/nativead/f;-><init>()V

    .line 204
    new-instance v5, Lcom/google/android/gms/ads/nativead/g;

    invoke-direct {v5, v4}, Lcom/google/android/gms/ads/nativead/g;-><init>(Lcom/google/android/gms/ads/nativead/f;)V

    goto :goto_11

    .line 205
    :cond_3e
    new-instance v5, Lcom/google/android/gms/ads/nativead/f;

    invoke-direct {v5}, Lcom/google/android/gms/ads/nativead/f;-><init>()V

    .line 206
    iget-object v6, v4, Lad/M;->a:Ljava/lang/Integer;

    if-eqz v6, :cond_3f

    .line 207
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 208
    iput v6, v5, Lcom/google/android/gms/ads/nativead/f;->e:I

    .line 209
    :cond_3f
    iget-object v6, v4, Lad/M;->b:Ljava/lang/Integer;

    if-eqz v6, :cond_40

    .line 210
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 211
    iput v6, v5, Lcom/google/android/gms/ads/nativead/f;->b:I

    .line 212
    :cond_40
    iget-object v6, v4, Lad/M;->c:Lad/V;

    if-eqz v6, :cond_44

    .line 213
    new-instance v7, LE4/j;

    invoke-direct {v7}, LE4/j;-><init>()V

    .line 214
    iget-object v8, v6, Lad/V;->a:Ljava/lang/Boolean;

    if-eqz v8, :cond_41

    .line 215
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    .line 216
    iput-boolean v8, v7, LE4/j;->c:Z

    .line 217
    :cond_41
    iget-object v8, v6, Lad/V;->b:Ljava/lang/Boolean;

    if-eqz v8, :cond_42

    .line 218
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    .line 219
    iput-boolean v8, v7, LE4/j;->b:Z

    .line 220
    :cond_42
    iget-object v6, v6, Lad/V;->c:Ljava/lang/Boolean;

    if-eqz v6, :cond_43

    .line 221
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 222
    iput-boolean v6, v7, LE4/j;->a:Z

    .line 223
    :cond_43
    new-instance v6, Lx6/w;

    invoke-direct {v6, v7}, Lx6/w;-><init>(LE4/j;)V

    .line 224
    iput-object v6, v5, Lcom/google/android/gms/ads/nativead/f;->d:Lx6/w;

    .line 225
    :cond_44
    iget-object v6, v4, Lad/M;->d:Ljava/lang/Boolean;

    if-eqz v6, :cond_45

    .line 226
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 227
    iput-boolean v6, v5, Lcom/google/android/gms/ads/nativead/f;->f:Z

    .line 228
    :cond_45
    iget-object v6, v4, Lad/M;->e:Ljava/lang/Boolean;

    if-eqz v6, :cond_46

    .line 229
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 230
    iput-boolean v6, v5, Lcom/google/android/gms/ads/nativead/f;->c:Z

    .line 231
    :cond_46
    iget-object v4, v4, Lad/M;->f:Ljava/lang/Boolean;

    if-eqz v4, :cond_47

    .line 232
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 233
    iput-boolean v4, v5, Lcom/google/android/gms/ads/nativead/f;->a:Z

    .line 234
    :cond_47
    new-instance v4, Lcom/google/android/gms/ads/nativead/g;

    invoke-direct {v4, v5}, Lcom/google/android/gms/ads/nativead/g;-><init>(Lcom/google/android/gms/ads/nativead/f;)V

    move-object v5, v4

    .line 235
    :goto_11
    iget-object v4, v9, Lad/J;->d:LJ4/c;

    iget-object v6, v9, Lad/J;->e:Lad/q;

    iget-object v4, v4, LJ4/c;->a:Landroid/content/Context;

    iget-object v7, v9, Lad/J;->c:Ljava/lang/String;

    if-eqz v6, :cond_48

    .line 236
    invoke-virtual {v6}, Lad/q;->a()Lx6/g;

    move-result-object v2

    .line 237
    new-instance v6, Lx6/e;

    invoke-direct {v6, v4, v7}, Lx6/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 238
    invoke-virtual {v6, v1}, Lx6/e;->b(Lcom/google/android/gms/ads/nativead/d;)V

    .line 239
    invoke-virtual {v6, v5}, Lx6/e;->d(Lcom/google/android/gms/ads/nativead/g;)V

    .line 240
    invoke-virtual {v6, v3}, Lx6/e;->c(Lcom/google/android/gms/ads/AdListener;)V

    .line 241
    invoke-virtual {v6}, Lx6/e;->a()Lx6/f;

    move-result-object v1

    .line 242
    iget-object v2, v2, Lx6/g;->a:LD6/Q0;

    invoke-virtual {v1, v2}, Lx6/f;->b(LD6/Q0;)V

    goto :goto_12

    .line 243
    :cond_48
    iget-object v6, v9, Lad/J;->f:Lad/l;

    if-eqz v6, :cond_49

    .line 244
    invoke-virtual {v6}, Lad/l;->c()Ly6/b;

    move-result-object v2

    .line 245
    new-instance v6, Lx6/e;

    invoke-direct {v6, v4, v7}, Lx6/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 246
    invoke-virtual {v6, v1}, Lx6/e;->b(Lcom/google/android/gms/ads/nativead/d;)V

    .line 247
    invoke-virtual {v6, v5}, Lx6/e;->d(Lcom/google/android/gms/ads/nativead/g;)V

    .line 248
    invoke-virtual {v6, v3}, Lx6/e;->c(Lcom/google/android/gms/ads/AdListener;)V

    .line 249
    invoke-virtual {v6}, Lx6/e;->a()Lx6/f;

    move-result-object v1

    .line 250
    iget-object v2, v2, Lx6/g;->a:LD6/Q0;

    invoke-virtual {v1, v2}, Lx6/f;->b(LD6/Q0;)V

    goto :goto_12

    .line 251
    :cond_49
    const-string v1, "FlutterNativeAd"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    :goto_12
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 253
    :cond_4a
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "NativeAdFactory and nativeTemplateStyle cannot be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 254
    :cond_4b
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "AdUnitId cannot be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 255
    :cond_4c
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "AdInstanceManager cannot be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 256
    :cond_4d
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    .line 257
    :pswitch_12
    new-instance v21, Lad/c;

    .line 258
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v22

    iget-object v2, v0, Lad/X;->b:LG9/e;

    .line 259
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v24, v3

    check-cast v24, Ljava/lang/String;

    .line 260
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v26, v3

    check-cast v26, Lad/l;

    .line 261
    new-instance v3, LE0/a;

    invoke-direct {v3, v10, v6}, LE0/a;-><init>(Landroid/content/Context;Z)V

    .line 262
    new-instance v4, Lad/w;

    sget-object v6, Lcom/google/android/gms/ads/AdSize;->m:Lcom/google/android/gms/ads/AdSize;

    invoke-direct {v4, v6}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    .line 263
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v25

    move-object/from16 v23, v2

    move-object/from16 v27, v3

    .line 264
    invoke-direct/range {v21 .. v27}, Lad/n;-><init>(ILG9/e;Ljava/lang/String;Ljava/util/List;Lad/l;LE0/a;)V

    move-object/from16 v2, v21

    const/4 v3, -0x1

    .line 265
    iput v3, v2, Lad/c;->i:I

    .line 266
    iget-object v3, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v2, v1}, LG9/e;->F(Lad/i;I)V

    .line 267
    invoke-virtual {v2}, Lad/n;->c()V

    .line 268
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 269
    :pswitch_13
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->getRequestConfiguration()Lx6/s;

    move-result-object v1

    .line 271
    move-object/from16 v2, p2

    check-cast v2, Ltc/g;

    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_14
    move-object v2, v14

    .line 272
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Lad/X;->a(Ljava/lang/Object;)V

    .line 273
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Lad/q;

    .line 274
    invoke-virtual {v1, v13}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad/l;

    if-eqz v18, :cond_4e

    .line 275
    new-instance v14, Lad/Q;

    .line 276
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v3, v0, Lad/X;->b:LG9/e;

    .line 277
    invoke-static {v3}, Lad/X;->a(Ljava/lang/Object;)V

    new-instance v4, LJ4/c;

    invoke-direct {v4, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v16, v3

    move-object/from16 v19, v4

    invoke-direct/range {v14 .. v19}, Lad/Q;-><init>(ILG9/e;Ljava/lang/String;Lad/q;LJ4/c;)V

    goto :goto_13

    :cond_4e
    if-eqz v3, :cond_51

    .line 278
    new-instance v14, Lad/Q;

    .line 279
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v4, v0, Lad/X;->b:LG9/e;

    .line 280
    invoke-static {v4}, Lad/X;->a(Ljava/lang/Object;)V

    new-instance v7, LJ4/c;

    invoke-direct {v7, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v18, v3

    move-object/from16 v16, v4

    move-object/from16 v19, v7

    invoke-direct/range {v14 .. v19}, Lad/Q;-><init>(ILG9/e;Ljava/lang/String;Lad/l;LJ4/c;)V

    .line 281
    :goto_13
    iget-object v3, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lad/X;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v14, v1}, LG9/e;->F(Lad/i;I)V

    .line 282
    new-instance v1, Lad/O;

    invoke-direct {v1, v14}, Lad/O;-><init>(Lad/Q;)V

    .line 283
    iget-object v3, v14, Lad/Q;->c:Ljava/lang/String;

    iget-object v4, v14, Lad/Q;->d:LJ4/c;

    iget-object v4, v4, LJ4/c;->a:Landroid/content/Context;

    iget-object v5, v14, Lad/Q;->e:Lad/q;

    if-eqz v5, :cond_4f

    .line 284
    invoke-virtual {v5}, Lad/q;->a()Lx6/g;

    move-result-object v2

    .line 285
    invoke-static {v4, v3, v2, v1}, LR6/c;->load(Landroid/content/Context;Ljava/lang/String;Lx6/g;LR6/d;)V

    goto :goto_14

    .line 286
    :cond_4f
    iget-object v5, v14, Lad/Q;->f:Lad/l;

    if-eqz v5, :cond_50

    .line 287
    invoke-virtual {v5}, Lad/l;->c()Ly6/b;

    move-result-object v2

    .line 288
    invoke-static {v4, v3, v2, v1}, LR6/c;->load(Landroid/content/Context;Ljava/lang/String;Ly6/b;LR6/d;)V

    goto :goto_14

    .line 289
    :cond_50
    invoke-static {v9, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    :goto_14
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    :cond_51
    const/4 v4, 0x0

    .line 291
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    invoke-virtual {v1, v11, v2, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 292
    :pswitch_15
    const-string v2, "webViewId"

    invoke-virtual {v1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 293
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, v0, Lad/X;->a:Lqc/a;

    .line 294
    iget-object v2, v2, Lqc/a;->b:Llc/b;

    .line 295
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-long v3, v1

    .line 296
    iget-object v2, v2, Llc/b;->d:LK8/H;

    iget-object v2, v2, LK8/H;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    const-class v5, Lkd/X;

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqc/b;

    .line 297
    check-cast v2, Lkd/X;

    if-eqz v2, :cond_52

    .line 298
    iget-object v2, v2, Lkd/X;->b:LC8/i;

    .line 299
    iget-object v2, v2, LC8/i;->d:Ljava/lang/Object;

    check-cast v2, Lkd/d;

    if-eqz v2, :cond_52

    .line 300
    invoke-virtual {v2, v3, v4}, Lkd/d;->e(J)Ljava/lang/Object;

    move-result-object v2

    .line 301
    instance-of v3, v2, Landroid/webkit/WebView;

    if-eqz v3, :cond_52

    .line 302
    check-cast v2, Landroid/webkit/WebView;

    goto :goto_15

    :cond_52
    const/4 v2, 0x0

    :goto_15
    if-nez v2, :cond_53

    .line 303
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MobileAds.registerWebView unable to find webView with id: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FlutterMobileAdsWrapper"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_16

    .line 304
    :cond_53
    invoke-static {v2}, Lcom/google/android/gms/ads/MobileAds;->registerWebView(Landroid/webkit/WebView;)V

    .line 305
    :goto_16
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 306
    :pswitch_16
    new-instance v11, Lad/B;

    .line 307
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v2, v0, Lad/X;->b:LG9/e;

    .line 308
    invoke-static {v2}, Lad/X;->a(Ljava/lang/Object;)V

    .line 309
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Lad/X;->a(Ljava/lang/Object;)V

    .line 310
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lad/q;

    .line 311
    invoke-virtual {v1, v13}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Lad/l;

    new-instance v3, LJ4/c;

    invoke-direct {v3, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    move-object v13, v2

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v17}, Lad/B;-><init>(ILG9/e;Ljava/lang/String;Lad/q;Lad/l;LJ4/c;)V

    .line 312
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v11, v1}, LG9/e;->F(Lad/i;I)V

    if-eqz v15, :cond_54

    .line 313
    invoke-virtual {v15}, Lad/q;->a()Lx6/g;

    move-result-object v1

    new-instance v2, Lad/A;

    invoke-direct {v2, v11}, Lad/A;-><init>(Lad/B;)V

    .line 314
    invoke-static {v10, v14, v1, v2}, Lz6/b;->load(Landroid/content/Context;Ljava/lang/String;Lx6/g;Lz6/a;)V

    goto :goto_17

    :cond_54
    if-eqz v16, :cond_55

    .line 315
    invoke-virtual/range {v16 .. v16}, Lad/l;->c()Ly6/b;

    move-result-object v1

    new-instance v2, Lad/A;

    invoke-direct {v2, v11}, Lad/A;-><init>(Lad/B;)V

    .line 316
    invoke-static {v10, v14, v1, v2}, Lz6/b;->load(Landroid/content/Context;Ljava/lang/String;Lx6/g;Lz6/a;)V

    .line 317
    :cond_55
    :goto_17
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 318
    :pswitch_17
    const-string v2, "muted"

    invoke-virtual {v1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    invoke-static {v1}, Lcom/google/android/gms/ads/MobileAds;->setAppMuted(Z)V

    .line 320
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 321
    :pswitch_18
    new-instance v11, Lad/H;

    .line 322
    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v13, v0, Lad/X;->b:LG9/e;

    .line 323
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    .line 324
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lad/q;

    new-instance v2, LJ4/c;

    invoke-direct {v2, v10, v6}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v16}, Lad/H;-><init>(ILG9/e;Ljava/lang/String;Lad/q;LJ4/c;)V

    .line 325
    iget-object v2, v0, Lad/X;->b:LG9/e;

    invoke-virtual {v1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v11, v1}, LG9/e;->F(Lad/i;I)V

    if-eqz v13, :cond_56

    if-eqz v14, :cond_56

    if-eqz v15, :cond_56

    .line 326
    invoke-virtual {v15}, Lad/q;->a()Lx6/g;

    move-result-object v1

    new-instance v2, Lad/G;

    invoke-direct {v2, v11}, Lad/G;-><init>(Lad/H;)V

    .line 327
    invoke-static {v10, v14, v1, v2}, LI6/a;->load(Landroid/content/Context;Ljava/lang/String;Lx6/g;LI6/b;)V

    .line 328
    :cond_56
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_19
    const/4 v2, 0x0

    .line 329
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 330
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    invoke-static {v10, v1}, Lcom/google/android/gms/ads/MobileAds;->openDebugMenu(Landroid/content/Context;Ljava/lang/String;)V

    .line 332
    move-object/from16 v1, p2

    check-cast v1, Ltc/g;

    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    return-void

    .line 333
    :cond_57
    :goto_18
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "method call received before instanceManager initialized: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Luc/o;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x74cc200d -> :sswitch_19
        -0x73bda50b -> :sswitch_18
        -0x6cdd4229 -> :sswitch_17
        -0x699434b8 -> :sswitch_16
        -0x5cdc65ff -> :sswitch_15
        -0x5c523da9 -> :sswitch_14
        -0x53263dd8 -> :sswitch_13
        -0x4be76439 -> :sswitch_12
        -0x398c6e60 -> :sswitch_11
        -0x36c202d9 -> :sswitch_10
        -0x2dc7f84f -> :sswitch_f
        -0x28540aad -> :sswitch_e
        -0x2218b08b -> :sswitch_d
        -0x1fc757d2 -> :sswitch_c
        -0x1a08c958 -> :sswitch_b
        -0xa4c77ad -> :sswitch_a
        0x56c1def -> :sswitch_9
        0xef422a2 -> :sswitch_8
        0x1045b9ba -> :sswitch_7
        0x11316e25 -> :sswitch_6
        0x12d86e45 -> :sswitch_5
        0x3f6c8375 -> :sswitch_4
        0x50d09b6d -> :sswitch_3
        0x53a942a5 -> :sswitch_2
        0x630fa5bc -> :sswitch_1
        0x70385ca3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/X;->b:LG9/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Lq/s1;

    .line 7
    .line 8
    iget-object v1, v1, Lq/s1;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/app/Activity;

    .line 11
    .line 12
    iput-object v1, v0, LG9/e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lad/X;->c:Lad/a;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Lq/s1;

    .line 20
    .line 21
    iget-object v1, v1, Lq/s1;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroid/app/Activity;

    .line 24
    .line 25
    iput-object v1, v0, Lad/a;->d:Landroid/content/Context;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lad/X;->e:Lcd/k;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Lq/s1;

    .line 32
    .line 33
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Landroid/app/Activity;

    .line 36
    .line 37
    iput-object p1, v0, Lcd/k;->d:Landroid/app/Activity;

    .line 38
    .line 39
    :cond_2
    return-void
.end method
