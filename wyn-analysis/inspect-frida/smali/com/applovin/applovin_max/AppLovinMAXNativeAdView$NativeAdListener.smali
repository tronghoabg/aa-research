.class Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;
.super Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "NativeAdListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;


# direct methods
.method private constructor <init>(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;->this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    invoke-direct {p0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;-><init>(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;)V

    return-void
.end method


# virtual methods
.method public onNativeAdClicked(Lcom/applovin/mediation/MaxAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;->this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 2
    .line 3
    const-string v1, "OnNativeAdClickedEvent"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->access$500(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Ljava/lang/String;Lcom/applovin/mediation/MaxAd;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onNativeAdLoadFailed(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;->this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Failed to load native ad for Ad Unit ID "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, " with error: "

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {v0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->access$100(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onNativeAdLoaded(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Native ad loaded: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/applovin/applovin_max/AppLovinMAX;->d(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;->this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 21
    .line 22
    const-string p2, "Native ad is of template type, failing ad load..."

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {p1, p2, v0}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->access$100(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;->this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->access$200(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;->this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 35
    .line 36
    invoke-static {p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->access$302(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Lcom/applovin/mediation/MaxAd;)Lcom/applovin/mediation/MaxAd;

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView$NativeAdListener;->this$0:Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;

    .line 40
    .line 41
    invoke-interface {p2}, Lcom/applovin/mediation/MaxAd;->getNativeAd()Lcom/applovin/mediation/nativeAds/MaxNativeAd;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p1, p2}, Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;->access$400(Lcom/applovin/applovin_max/AppLovinMAXNativeAdView;Lcom/applovin/mediation/nativeAds/MaxNativeAd;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
