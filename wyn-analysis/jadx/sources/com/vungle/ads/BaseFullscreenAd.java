package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.b1;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.signals.m;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.y;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/BaseFullscreenAd;", "Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/FullscreenAd;", "Landroid/content/Context;", "context", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", LegacyLoadUseCase.KEY_AD_MARKUP, "Lef/C;", "load", "(Ljava/lang/String;)V", "Lcom/vungle/ads/internal/model/h0;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/h0;)V", "onAdLoaded", "play", "(Landroid/content/Context;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public abstract class BaseFullscreenAd extends BaseAd implements FullscreenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFullscreenAd(@NotNull Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        super(context, placementId, adConfig);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd, com.vungle.ads.Ad
    public void load(@Nullable String adMarkup) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().a(getCom.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID java.lang.String()));
        super.load(adMarkup);
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(@NotNull h0 advertisement) {
        AbstractC3340k.e(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        m signaledAd = getSignaledAd();
        if (signaledAd == null) {
            return;
        }
        signaledAd.a(System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.vungle.ads.BaseFullscreenAd$play$2] */
    @Override // com.vungle.ads.FullscreenAd
    public void play(@Nullable Context context) throws Throwable {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), 4);
        getResponseToShowMetric().d();
        AnalyticsClient.a(analyticsClient, getResponseToShowMetric(), getLogEntry());
        getShowToFailMetric().e();
        getShowToCloseMetric().e();
        m signaledAd = getSignaledAd();
        if (signaledAd != null) {
            signaledAd.f33677i = System.currentTimeMillis();
            signaledAd.f33674f = m.a(Long.valueOf(signaledAd.f33676h), signaledAd.f33677i);
            getSignalManager$vungle_ads_release().a(context, signaledAd);
        }
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.FullscreenAdInternal");
        ((b1) adInternal$vungle_ads_release).a(context, new b() { // from class: com.vungle.ads.BaseFullscreenAd.play.2
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new BaseFullscreenAd$play$2$onAdClick$1(BaseFullscreenAd.this));
                BaseFullscreenAd.this.getDisplayToClickMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 displayToClickMetric = BaseFullscreenAd.this.getDisplayToClickMetric();
                analyticsClient2.a(displayToClickMetric, BaseFullscreenAd.this.getLogEntry(), displayToClickMetric.f33018b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new BaseFullscreenAd$play$2$onAdEnd$1(BaseFullscreenAd.this));
                BaseFullscreenAd.this.getShowToCloseMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 showToCloseMetric = BaseFullscreenAd.this.getShowToCloseMetric();
                analyticsClient2.a(showToCloseMetric, BaseFullscreenAd.this.getLogEntry(), showToCloseMetric.f33018b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new BaseFullscreenAd$play$2$onAdImpression$1(BaseFullscreenAd.this));
                BaseFullscreenAd.this.getPresentToDisplayMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 presentToDisplayMetric = BaseFullscreenAd.this.getPresentToDisplayMetric();
                analyticsClient2.a(presentToDisplayMetric, BaseFullscreenAd.this.getLogEntry(), presentToDisplayMetric.f33018b);
                BaseFullscreenAd.this.getDisplayToClickMetric().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new BaseFullscreenAd$play$2$onAdLeftApplication$1(BaseFullscreenAd.this));
                AnalyticsClient.a(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getLeaveApplicationMetric(), BaseFullscreenAd.this.getLogEntry(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new BaseFullscreenAd$play$2$onAdRewarded$1(BaseFullscreenAd.this));
                AnalyticsClient.a(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getRewardedMetric(), BaseFullscreenAd.this.getLogEntry(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(@Nullable String id2) {
                j signalManager$vungle_ads_release = BaseFullscreenAd.this.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.f33664h.f33645f++;
                }
                BaseFullscreenAd.this.getPresentToDisplayMetric().e();
                Handler handler = y.f33878a;
                y.a(new BaseFullscreenAd$play$2$onAdStart$1(BaseFullscreenAd.this));
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(@NotNull VungleError error) throws Throwable {
                AbstractC3340k.e(error, "error");
                Handler handler = y.f33878a;
                y.a(new BaseFullscreenAd$play$2$onFailure$1(BaseFullscreenAd.this, error));
                BaseFullscreenAd.this.getShowToFailMetric().d();
                AnalyticsClient.INSTANCE.a(BaseFullscreenAd.this.getShowToFailMetric(), BaseFullscreenAd.this.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        });
    }
}
