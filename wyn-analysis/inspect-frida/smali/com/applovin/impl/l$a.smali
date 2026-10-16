.class Lcom/applovin/impl/l$a;
.super Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/l;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/l;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onNativeAdClicked(Lcom/applovin/mediation/MaxAd;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/applovin/impl/l;->onAdClicked(Lcom/applovin/mediation/MaxAd;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onNativeAdLoadFailed(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/applovin/impl/l;->onAdLoadFailed(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onNativeAdLoaded(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/applovin/impl/l;->a(Lcom/applovin/impl/l;)Lcom/applovin/mediation/MaxAd;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/applovin/impl/l;->b(Lcom/applovin/impl/l;)Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/applovin/impl/l;->a(Lcom/applovin/impl/l;)Lcom/applovin/mediation/MaxAd;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->destroy(Lcom/applovin/mediation/MaxAd;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/applovin/impl/l;->a(Lcom/applovin/impl/l;Lcom/applovin/mediation/MaxAd;)Lcom/applovin/mediation/MaxAd;

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/applovin/impl/l;->b(Lcom/applovin/impl/l;)Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/applovin/impl/l;->c(Lcom/applovin/impl/l;)Lcom/applovin/mediation/nativeAds/MaxNativeAdView;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0, p2}, Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->render(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/applovin/impl/l$a;->a:Lcom/applovin/impl/l;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lcom/applovin/impl/l;->onAdLoaded(Lcom/applovin/mediation/MaxAd;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
