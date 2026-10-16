package com.vungle.ads;

import E5.Q;
import android.content.Context;
import android.os.Handler;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.j0;
import com.vungle.ads.internal.k0;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.y;
import ef.C2515C;
import ef.InterfaceC2519c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC2519c
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/BannerAd;", "Lcom/vungle/ads/BaseAd;", "Landroid/content/Context;", "context", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lcom/vungle/ads/VungleAdSize;", "adSize", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "Lcom/vungle/ads/BannerAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/BannerAdSize;)V", "getAdViewSize", "()Lcom/vungle/ads/VungleAdSize;", "Lcom/vungle/ads/internal/k0;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/k0;", "constructAdInternal", "Lef/C;", "finishAd", "()V", "Lcom/vungle/ads/BannerView;", "getBannerView", "()Lcom/vungle/ads/BannerView;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class BannerAd extends BaseAd {

    /* renamed from: s, reason: collision with root package name */
    public final VungleAdSize f32733s;

    /* renamed from: t, reason: collision with root package name */
    public BannerView f32734t;

    /* renamed from: u, reason: collision with root package name */
    public final j0 f32735u;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerAdSize.values().length];
            iArr[BannerAdSize.BANNER.ordinal()] = 1;
            iArr[BannerAdSize.BANNER_SHORT.ordinal()] = 2;
            iArr[BannerAdSize.BANNER_LEADERBOARD.ordinal()] = 3;
            iArr[BannerAdSize.VUNGLE_MREC.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.vungle.ads.BannerAd$finishAd$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements tf.a {
        public AnonymousClass1() {
            super(0);
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m308invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m308invoke() {
            BannerView bannerView = BannerAd.this.f32734t;
            if (bannerView != null) {
                bannerView.finishAdInternal(true);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.vungle.ads.BannerAd$getBannerView$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23751 extends AbstractC3343n implements tf.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VungleError f32746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23751(VungleError vungleError) {
            super(0);
            this.f32746b = vungleError;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m309invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m309invoke() {
            BaseAdListener adListener = BannerAd.this.getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(BannerAd.this, this.f32746b);
            }
        }
    }

    public BannerAd(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) throws Throwable {
        super(context, str, adConfig);
        this.f32733s = vungleAdSize;
        AnalyticsClient.INSTANCE.a(new m2(Sdk.SDKMetric.SDKMetricType.DEPRECATED_API_USED), getLogEntry(), "BannerAd is deprecated");
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.f32735u = ((k0) adInternal$vungle_ads_release).a(new b() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new BannerAd$adPlayCallback$1$onAdClick$1(this.f32736a));
                this.f32736a.getDisplayToClickMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 displayToClickMetric = this.f32736a.getDisplayToClickMetric();
                analyticsClient.a(displayToClickMetric, this.f32736a.getLogEntry(), displayToClickMetric.f33018b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@Nullable String id2) {
                Handler handler = y.f33878a;
                y.a(new BannerAd$adPlayCallback$1$onAdEnd$1(this.f32736a));
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new BannerAd$adPlayCallback$1$onAdImpression$1(this.f32736a));
                this.f32736a.getPresentToDisplayMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 presentToDisplayMetric = this.f32736a.getPresentToDisplayMetric();
                analyticsClient.a(presentToDisplayMetric, this.f32736a.getLogEntry(), presentToDisplayMetric.f33018b);
                this.f32736a.getDisplayToClickMetric().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@Nullable String id2) {
                Handler handler = y.f33878a;
                y.a(new BannerAd$adPlayCallback$1$onAdLeftApplication$1(this.f32736a));
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@Nullable String id2) {
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(@Nullable String id2) throws Throwable {
                j signalManager$vungle_ads_release = this.f32736a.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.f33664h.f33645f++;
                }
                this.f32736a.getAdInternal$vungle_ads_release().f33624l.d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 t1Var = this.f32736a.getAdInternal$vungle_ads_release().f33624l;
                analyticsClient.a(t1Var, this.f32736a.getLogEntry(), t1Var.f33018b);
                this.f32736a.getPresentToDisplayMetric().e();
                Handler handler = y.f33878a;
                y.a(new BannerAd$adPlayCallback$1$onAdStart$1(this.f32736a));
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(@NotNull VungleError error) throws Throwable {
                AbstractC3340k.e(error, "error");
                this.f32736a.getShowToFailMetric().d();
                AnalyticsClient.INSTANCE.a(this.f32736a.getShowToFailMetric(), this.f32736a.getLogEntry(), String.valueOf(error.getCode()));
                Handler handler = y.f33878a;
                y.a(new BannerAd$adPlayCallback$1$onFailure$1(this.f32736a, error));
            }
        });
    }

    public final void finishAd() {
        Handler handler = y.f33878a;
        y.a(new AnonymousClass1());
    }

    @NotNull
    public final VungleAdSize getAdViewSize() {
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize vungleAdSizeM = ((k0) adInternal$vungle_ads_release).m();
        return vungleAdSizeM == null ? this.f32733s : vungleAdSizeM;
    }

    @Nullable
    public final BannerView getBannerView() throws Throwable {
        i3 i3Var;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), 4);
        BannerView bannerView = this.f32734t;
        if (bannerView != null) {
            return bannerView;
        }
        getAdInternal$vungle_ads_release().k.e();
        VungleError vungleErrorA = getAdInternal$vungle_ads_release().a(true);
        if (vungleErrorA != null) {
            if (getAdInternal$vungle_ads_release().a(vungleErrorA.getCode())) {
                getAdInternal$vungle_ads_release().a(h.f33014g);
            }
            Handler handler = y.f33878a;
            y.a(new C23751(vungleErrorA));
            return null;
        }
        h0 h0Var = getAdInternal$vungle_ads_release().f33616c;
        if (h0Var == null || (i3Var = getAdInternal$vungle_ads_release().f33617d) == null) {
            return null;
        }
        getAdInternal$vungle_ads_release().a();
        try {
            try {
                this.f32734t = new BannerView(getContext(), i3Var, h0Var, getAdViewSize(), getAdConfig(), this.f32735u);
                getResponseToShowMetric().d();
                t1 responseToShowMetric = getResponseToShowMetric();
                analyticsClient.a(responseToShowMetric, getLogEntry(), responseToShowMetric.f33018b);
                getAdInternal$vungle_ads_release().k.d();
                t1 t1Var = getAdInternal$vungle_ads_release().k;
                analyticsClient.a(t1Var, getLogEntry(), t1Var.f33018b);
                getAdInternal$vungle_ads_release().f33624l.e();
                return this.f32734t;
            } catch (InstantiationException e7) {
                boolean z2 = u.f33874a;
                t.a("BannerAd", "Can not create banner view: " + e7.getMessage(), e7);
                getResponseToShowMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                t1 responseToShowMetric2 = getResponseToShowMetric();
                analyticsClient2.a(responseToShowMetric2, getLogEntry(), responseToShowMetric2.f33018b);
                return null;
            }
        } catch (Throwable th) {
            getResponseToShowMetric().d();
            AnalyticsClient analyticsClient3 = AnalyticsClient.INSTANCE;
            t1 responseToShowMetric3 = getResponseToShowMetric();
            analyticsClient3.a(responseToShowMetric3, getLogEntry(), responseToShowMetric3.f33018b);
            throw th;
        }
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public k0 constructAdInternal$vungle_ads_release(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        return new k0(context, this.f32733s);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAd(@NotNull Context context, @NotNull String placementId, @NotNull VungleAdSize adSize) {
        this(context, placementId, adSize, new AdConfig());
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adSize, "adSize");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC2519c
    public BannerAd(@NotNull Context context, @NotNull String placementId, @NotNull BannerAdSize adSize) {
        VungleAdSize vungleAdSize;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adSize, "adSize");
        VungleAdSize.Companion companion = VungleAdSize.INSTANCE;
        int i5 = WhenMappings.$EnumSwitchMapping$0[adSize.ordinal()];
        if (i5 == 1) {
            vungleAdSize = VungleAdSize.BANNER;
        } else if (i5 == 2) {
            vungleAdSize = VungleAdSize.BANNER_SHORT;
        } else if (i5 == 3) {
            vungleAdSize = VungleAdSize.BANNER_LEADERBOARD;
        } else if (i5 == 4) {
            vungleAdSize = VungleAdSize.MREC;
        } else {
            throw new Q((byte) 0, 9);
        }
        this(context, placementId, vungleAdSize, new AdConfig());
    }
}
