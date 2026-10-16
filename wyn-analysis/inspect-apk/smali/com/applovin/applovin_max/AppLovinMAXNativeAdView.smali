.class public Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/e;
.implements Lcom/applovin/mediation/MaxAdRevenueListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;
    }
.end annotation


# static fields
.field private static final ADVERTISER_VIEW_TAG:I = 0x8

.field private static final BODY_VIEW_TAG:I = 0x4

.field private static final CALL_TO_ACTION_VIEW_TAG:I = 0x5

.field private static final ICON_VIEW_TAG:I = 0x3

.field private static final MEDIA_VIEW_CONTAINER_TAG:I = 0x2

.field private static final TITLE_LABEL_TAG:I = 0x1


# instance fields
.field private adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

.field private final adUnitId:Ljava/lang/String;

.field private advertiserView:Landroid/view/View;

.field private bodyView:Landroid/view/View;

.field private callToActionView:Landroid/view/View;

.field private final channel:Luc/r;

.field private final clickableViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final customData:Ljava/lang/String;

.field private final extraParameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private iconView:Landroid/widget/ImageView;

.field private final isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final localExtraParameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mediaViewContainer:Landroid/widget/RelativeLayout;

.field private nativeAd:Lcom/applovin/mediation/MaxAd;

.field private final nativeAdView:Landroid/widget/FrameLayout;

.field private optionsViewContainer:Landroid/widget/FrameLayout;

.field private final placement:Ljava/lang/String;

.field private final sdk:Lcom/applovin/sdk/AppLovinSdk;

.field private titleView:Landroid/view/View;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Luc/f;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Luc/f;",
            "Lcom/applovin/sdk/AppLovinSdk;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adUnitId:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p3, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->placement:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->customData:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p8, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->sdk:Lcom/applovin/sdk/AppLovinSdk;

    .line 25
    .line 26
    iput-object p9, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 27
    .line 28
    iput-object p5, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->extraParameters:Ljava/util/Map;

    .line 29
    .line 30
    iput-object p6, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->localExtraParameters:Ljava/util/Map;

    .line 31
    .line 32
    const-string p2, "applovin_max/nativeadview_"

    .line 33
    .line 34
    invoke-static {p1, p2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, Luc/r;

    .line 39
    .line 40
    invoke-direct {p2, p7, p1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->channel:Luc/r;

    .line 44
    .line 45
    new-instance p1, LS8/b;

    .line 46
    .line 47
    const/16 p3, 0x18

    .line 48
    .line 49
    invoke-direct {p1, p0, p3}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p1}, Luc/r;->b(Luc/p;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Landroid/widget/FrameLayout;

    .line 56
    .line 57
    invoke-direct {p1, p9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 61
    .line 62
    invoke-direct {p0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->loadAd()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static synthetic a(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Luc/o;Ltc/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->lambda$new$0(Luc/o;Luc/q;)V

    return-void
.end method

.method public static synthetic access$100(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->handleAdLoadFailed(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->maybeDestroyCurrentAd()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$302(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Lcom/applovin/mediation/MaxAd;)Lcom/applovin/mediation/MaxAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$400(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Lcom/applovin/mediation/nativeAds/MaxNativeAd;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->sendAdLoadedReactNativeEventForAd(Lcom/applovin/mediation/nativeAds/MaxNativeAd;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$500(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Ljava/lang/String;Lcom/applovin/mediation/MaxAd;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->sendEvent(Ljava/lang/String;Lcom/applovin/mediation/MaxAd;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private addAdvertiserView(Luc/o;Lcom/applovin/mediation/MaxAd;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getAdvertiser()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->advertiserView:Landroid/view/View;

    .line 16
    .line 17
    if-nez p2, :cond_2

    .line 18
    .line 19
    new-instance p2, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->advertiserView:Landroid/view/View;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->advertiserView:Landroid/view/View;

    .line 34
    .line 35
    const/16 v0, 0x8

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->advertiserView:Landroid/view/View;

    .line 47
    .line 48
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 52
    .line 53
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->advertiserView:Landroid/view/View;

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->getRect(Luc/o;)Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, p2, v0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private addBodyView(Luc/o;Lcom/applovin/mediation/MaxAd;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getBody()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->bodyView:Landroid/view/View;

    .line 16
    .line 17
    if-nez p2, :cond_2

    .line 18
    .line 19
    new-instance p2, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->bodyView:Landroid/view/View;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->bodyView:Landroid/view/View;

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->bodyView:Landroid/view/View;

    .line 46
    .line 47
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->bodyView:Landroid/view/View;

    .line 53
    .line 54
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->getRect(Luc/o;)Landroid/graphics/Rect;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {p0, p2, v0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private addCallToActionView(Luc/o;Lcom/applovin/mediation/MaxAd;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getCallToAction()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->callToActionView:Landroid/view/View;

    .line 16
    .line 17
    if-nez p2, :cond_2

    .line 18
    .line 19
    new-instance p2, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->callToActionView:Landroid/view/View;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->callToActionView:Landroid/view/View;

    .line 34
    .line 35
    const/4 v0, 0x5

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->callToActionView:Landroid/view/View;

    .line 46
    .line 47
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->callToActionView:Landroid/view/View;

    .line 53
    .line 54
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->getRect(Luc/o;)Landroid/graphics/Rect;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {p0, p2, v0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private addIconView(Luc/o;Lcom/applovin/mediation/MaxAd;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getIcon()Lcom/applovin/mediation/nativeAds/MaxNativeAd$MaxNativeAdImage;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getIconView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Landroid/widget/ImageView;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 28
    .line 29
    if-eqz p1, :cond_5

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    new-instance v1, Landroid/widget/ImageView;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 43
    .line 44
    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 48
    .line 49
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 67
    .line 68
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 72
    .line 73
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 74
    .line 75
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->getRect(Luc/o;)Landroid/graphics/Rect;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, v1, v2, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 80
    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAd$MaxNativeAdImage;->getUri()Landroid/net/Uri;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAd$MaxNativeAdImage;->getUri()Landroid/net/Uri;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 99
    .line 100
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->sdk:Lcom/applovin/sdk/AppLovinSdk;

    .line 101
    .line 102
    invoke-static {p1, p2, v0}, Lcom/applovin/sdk/AppLovinSdkUtils;->setImageUrl(Ljava/lang/String;Landroid/widget/ImageView;Lcom/applovin/sdk/AppLovinSdk;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAd$MaxNativeAdImage;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAd$MaxNativeAdImage;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_4
    if-eqz p2, :cond_5

    .line 123
    .line 124
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 125
    .line 126
    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_0
    return-void
.end method

.method private addMediaView(Luc/o;Lcom/applovin/mediation/MaxAd;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getMediaView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    new-instance v0, Landroid/widget/RelativeLayout;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 23
    .line 24
    invoke-direct {v0, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->getRect(Luc/o;)Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 66
    .line 67
    const/4 v1, -0x1

    .line 68
    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 72
    .line 73
    invoke-virtual {v1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 77
    .line 78
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 79
    .line 80
    invoke-direct {p0, p2, v0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method private addOptionsView(Luc/o;Lcom/applovin/mediation/MaxAd;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getOptionsView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->optionsViewContainer:Landroid/widget/FrameLayout;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    new-instance v0, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->optionsViewContainer:Landroid/widget/FrameLayout;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->optionsViewContainer:Landroid/widget/FrameLayout;

    .line 40
    .line 41
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v1, -0x1

    .line 49
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iput v1, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 56
    .line 57
    :cond_3
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 58
    .line 59
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->optionsViewContainer:Landroid/widget/FrameLayout;

    .line 60
    .line 61
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->getRect(Luc/o;)Landroid/graphics/Rect;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {p0, p2, v0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private addTitleView(Luc/o;Lcom/applovin/mediation/MaxAd;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getTitle()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->titleView:Landroid/view/View;

    .line 16
    .line 17
    if-nez p2, :cond_2

    .line 18
    .line 19
    new-instance p2, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->titleView:Landroid/view/View;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->titleView:Landroid/view/View;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->titleView:Landroid/view/View;

    .line 46
    .line 47
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->titleView:Landroid/view/View;

    .line 53
    .line 54
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->getRect(Luc/o;)Landroid/graphics/Rect;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {p0, p2, v0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private getRect(Luc/o;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    const-string v0, "x"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, "y"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const-string v2, "width"

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const-string v3, "height"

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    new-instance v3, Landroid/graphics/Rect;

    .line 50
    .line 51
    add-int/2addr v2, v0

    .line 52
    add-int/2addr p1, v1

    .line 53
    invoke-direct {v3, v0, v1, v2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 54
    .line 55
    .line 56
    return-object v3
.end method

.method private handleAdLoadFailed(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/applovin/applovin_max/AppLovinMAX;->e(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/applovin/applovin_max/AppLovinMAX;->getInstance()Lcom/applovin/applovin_max/AppLovinMAX;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adUnitId:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0, p2}, Lcom/applovin/applovin_max/AppLovinMAX;->getAdLoadFailedInfo(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lcom/applovin/applovin_max/AppLovinMAX;->getInstance()Lcom/applovin/applovin_max/AppLovinMAX;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string v0, "OnNativeAdLoadFailedEvent"

    .line 25
    .line 26
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->channel:Luc/r;

    .line 27
    .line 28
    invoke-virtual {p2, v0, p1, v1}, Lcom/applovin/applovin_max/AppLovinMAX;->fireCallback(Ljava/lang/String;Ljava/util/Map;Luc/r;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private synthetic lambda$new$0(Luc/o;Luc/q;)V
    .locals 3

    .line 1
    iget-object v0, p1, Luc/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "addTitleView"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->addTitleView(Luc/o;Lcom/applovin/mediation/MaxAd;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string v0, "addAdvertiserView"

    .line 24
    .line 25
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->addAdvertiserView(Luc/o;Lcom/applovin/mediation/MaxAd;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    const-string v0, "addBodyView"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-direct {p0, p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->addBodyView(Luc/o;Lcom/applovin/mediation/MaxAd;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    const-string v0, "addCallToActionView"

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_7

    .line 70
    .line 71
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-direct {p0, p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->addCallToActionView(Luc/o;Lcom/applovin/mediation/MaxAd;)V

    .line 76
    .line 77
    .line 78
    :cond_6
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_7
    const-string v0, "addIconView"

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_9

    .line 89
    .line 90
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 91
    .line 92
    if-eqz v0, :cond_8

    .line 93
    .line 94
    invoke-direct {p0, p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->addIconView(Luc/o;Lcom/applovin/mediation/MaxAd;)V

    .line 95
    .line 96
    .line 97
    :cond_8
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_9
    const-string v0, "addOptionsView"

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_b

    .line 108
    .line 109
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 110
    .line 111
    if-eqz v0, :cond_a

    .line 112
    .line 113
    invoke-direct {p0, p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->addOptionsView(Luc/o;Lcom/applovin/mediation/MaxAd;)V

    .line 114
    .line 115
    .line 116
    :cond_a
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_b
    const-string v0, "addMediaView"

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_d

    .line 127
    .line 128
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 129
    .line 130
    if-eqz v0, :cond_c

    .line 131
    .line 132
    invoke-direct {p0, p1, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->addMediaView(Luc/o;Lcom/applovin/mediation/MaxAd;)V

    .line 133
    .line 134
    .line 135
    :cond_c
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_d
    const-string p1, "renderAd"

    .line 140
    .line 141
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_f

    .line 146
    .line 147
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 148
    .line 149
    if-eqz p1, :cond_e

    .line 150
    .line 151
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->renderAd(Lcom/applovin/mediation/MaxAd;)V

    .line 152
    .line 153
    .line 154
    :cond_e
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_f
    const-string p1, "loadAd"

    .line 159
    .line 160
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_10

    .line 165
    .line 166
    invoke-direct {p0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->loadAd()V

    .line 167
    .line 168
    .line 169
    invoke-interface {p2, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_10
    invoke-interface {p2}, Luc/q;->c()V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method private loadAd()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Loading a native ad for Ad Unit ID: "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adUnitId:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "..."

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/applovin/applovin_max/AppLovinMAX;->d(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adUnitId:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->getAdUnitId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    :cond_0
    new-instance v0, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adUnitId:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->sdk:Lcom/applovin/sdk/AppLovinSdk;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->context:Landroid/content/Context;

    .line 58
    .line 59
    invoke-direct {v0, v1, v2, v3}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;-><init>(Ljava/lang/String;Lcom/applovin/sdk/AppLovinSdk;Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->setRevenueListener(Lcom/applovin/mediation/MaxAdRevenueListener;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 68
    .line 69
    new-instance v1, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-direct {v1, p0, v2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;-><init>(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$1;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->setNativeAdListener(Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->placement:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->setPlacement(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->customData:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->setCustomData(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->extraParameters:Ljava/util/Map;

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Ljava/util/Map$Entry;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Ljava/lang/String;

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v2, v3, v1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->setExtraParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->localExtraParameters:Ljava/util/Map;

    .line 135
    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_3

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/util/Map$Entry;

    .line 157
    .line 158
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 159
    .line 160
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Ljava/lang/String;

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v2, v3, v1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->setLocalExtraParameter(Ljava/lang/String;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->loadAd()V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v1, "Ignoring request to load native ad for Ad Unit ID "

    .line 183
    .line 184
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adUnitId:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v1, ", another ad load in progress"

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0}, Lcom/applovin/applovin_max/AppLovinMAX;->e(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method private maybeDestroyCurrentAd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->mediaViewContainer:Landroid/widget/RelativeLayout;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->optionsViewContainer:Landroid/widget/FrameLayout;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->destroy(Lcom/applovin/mediation/MaxAd;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 28
    .line 29
    :cond_2
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private renderAd(Lcom/applovin/mediation/MaxAd;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->clickableViews:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->a(Ljava/util/List;Landroid/view/ViewGroup;Lcom/applovin/mediation/MaxAd;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->b(Lcom/applovin/mediation/MaxAd;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v0, "Attempting to render ad before ad has been loaded for Ad Unit ID "

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adUnitId:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lcom/applovin/applovin_max/AppLovinMAX;->e(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private sendAdLoadedReactNativeEventForAd(Lcom/applovin/mediation/nativeAds/MaxNativeAd;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getTitle()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "title"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    const-string v1, "advertiser"

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getAdvertiser()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const-string v1, "body"

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getBody()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-string v1, "callToAction"

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getCallToAction()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getStarRating()Ljava/lang/Double;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    const-string v1, "starRating"

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getStarRating()Ljava/lang/Double;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getMediaContentAspectRatio()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/4 v2, 0x0

    .line 64
    cmpl-float v1, v1, v2

    .line 65
    .line 66
    if-lez v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getMediaContentAspectRatio()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "mediaContentAspectRatio"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getIcon()Lcom/applovin/mediation/nativeAds/MaxNativeAd$MaxNativeAdImage;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const/4 v2, 0x1

    .line 86
    const/4 v3, 0x0

    .line 87
    if-nez v1, :cond_3

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getIconView()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    move v1, v3

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    :goto_0
    move v1, v2

    .line 99
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v4, "isIconImageAvailable"

    .line 104
    .line 105
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getOptionsView()Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    move v1, v2

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    move v1, v3

    .line 117
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v4, "isOptionsViewAvailable"

    .line 122
    .line 123
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/applovin/mediation/nativeAds/MaxNativeAd;->getMediaView()Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    move v2, v3

    .line 134
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v1, "isMediaViewAvailable"

    .line 139
    .line 140
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/applovin/applovin_max/AppLovinMAX;->getInstance()Lcom/applovin/applovin_max/AppLovinMAX;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAd:Lcom/applovin/mediation/MaxAd;

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Lcom/applovin/applovin_max/AppLovinMAX;->getAdInfo(Lcom/applovin/mediation/MaxAd;)Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-string v1, "nativeAd"

    .line 154
    .line 155
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Lcom/applovin/applovin_max/AppLovinMAX;->getInstance()Lcom/applovin/applovin_max/AppLovinMAX;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v1, "OnNativeAdLoadedEvent"

    .line 163
    .line 164
    iget-object v2, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->channel:Luc/r;

    .line 165
    .line 166
    invoke-virtual {v0, v1, p1, v2}, Lcom/applovin/applovin_max/AppLovinMAX;->fireCallback(Ljava/lang/String;Ljava/util/Map;Luc/r;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method private sendEvent(Ljava/lang/String;Lcom/applovin/mediation/MaxAd;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/applovin/applovin_max/AppLovinMAX;->getInstance()Lcom/applovin/applovin_max/AppLovinMAX;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->channel:Luc/r;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, v1}, Lcom/applovin/applovin_max/AppLovinMAX;->fireCallback(Ljava/lang/String;Lcom/applovin/mediation/MaxAd;Luc/r;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private updateViewLayout(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 12
    .line 13
    .line 14
    iget v1, p3, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 17
    .line 18
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 19
    .line 20
    iput p3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->maybeDestroyCurrentAd()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->titleView:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->advertiserView:Landroid/view/View;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->bodyView:Landroid/view/View;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->callToActionView:Landroid/view/View;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->iconView:Landroid/widget/ImageView;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    iget-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->destroy()V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->adLoader:Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 58
    .line 59
    :cond_5
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->channel:Luc/r;

    .line 60
    .line 61
    if-eqz v0, :cond_6

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Luc/r;->b(Luc/p;)V

    .line 64
    .line 65
    .line 66
    :cond_6
    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->nativeAdView:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public onAdRevenuePaid(Lcom/applovin/mediation/MaxAd;)V
    .locals 1

    .line 1
    const-string v0, "OnNativeAdRevenuePaidEvent"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->sendEvent(Ljava/lang/String;Lcom/applovin/mediation/MaxAd;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onFlutterViewAttached(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onFlutterViewDetached()V
    .locals 0

    return-void
.end method

.method public bridge synthetic onInputConnectionLocked()V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic onInputConnectionUnlocked()V
    .locals 0

    .line 1
    return-void
.end method
