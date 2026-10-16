package com.vungle.ads;

import Fe.c;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.vungle.internal.l;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.c1;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.f1;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.i0;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.omsdk.d;
import com.vungle.ads.internal.omsdk.e;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.presenter.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.f;
import com.vungle.ads.internal.ui.view.k;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.w;
import com.vungle.ads.internal.util.y;
import ef.C2515C;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u0011J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR\u0013\u00106\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR(\u0010:\u001a\u0004\u0018\u00010\u00052\b\u00107\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u0011R\u0014\u0010>\u001a\u00020;8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006F²\u0006\f\u0010A\u001a\u00020@8\nX\u008a\u0084\u0002²\u0006\f\u0010C\u001a\u00020B8\nX\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u00020D8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/VungleBannerView;", "Landroid/widget/RelativeLayout;", "Lcom/vungle/ads/VungleAdType;", "Landroid/content/Context;", "context", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "Lcom/vungle/ads/VungleAdSize;", "adSize", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "getAdViewSize", "()Lcom/vungle/ads/VungleAdSize;", "Lef/C;", "load", "()V", LegacyLoadUseCase.KEY_AD_MARKUP, "(Ljava/lang/String;)V", "Lcom/vungle/ads/VungleCSBData;", "csbData", "(Lcom/vungle/ads/VungleCSBData;)V", "finishAd", "", "isVisible", "setAdVisibility", "(Z)V", "a", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "b", "Lcom/vungle/ads/VungleAdSize;", "getAdSize", "Lcom/vungle/ads/BannerAdListener;", "d", "Lcom/vungle/ads/BannerAdListener;", "getAdListener", "()Lcom/vungle/ads/BannerAdListener;", "setAdListener", "(Lcom/vungle/ads/BannerAdListener;)V", "adListener", "Lcom/vungle/ads/internal/f1;", "q", "Lef/i;", "getImpressionTracker", "()Lcom/vungle/ads/internal/f1;", "impressionTracker", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adConfig", "getCreativeId", "creativeId", "getEventId", "eventId", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "getAdapterAdFormat", "setAdapterAdFormat", "adapterAdFormat", "Lcom/vungle/ads/internal/util/s;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/s;", "logEntry", "Companion", "Lcom/vungle/ads/internal/executor/a;", "executors", "Lcom/vungle/ads/internal/omsdk/d;", "omTrackerFactory", "Lcom/vungle/ads/internal/platform/f;", "platform", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class VungleBannerView extends RelativeLayout implements VungleAdType {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String placementId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final VungleAdSize adSize;

    /* renamed from: c, reason: collision with root package name */
    public final w f32830c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public BannerAdListener adListener;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f32832e;

    /* renamed from: f, reason: collision with root package name */
    public int f32833f;

    /* renamed from: g, reason: collision with root package name */
    public int f32834g;

    /* renamed from: h, reason: collision with root package name */
    public k f32835h;

    /* renamed from: i, reason: collision with root package name */
    public r f32836i;

    /* renamed from: j, reason: collision with root package name */
    public a0 f32837j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f32838l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f32839m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f32840n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f32841o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f32842p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC2525i impressionTracker;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32844r;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.vungle.ads.VungleBannerView$finishAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23771 extends AbstractC3343n implements tf.a {
        public C23771() {
            super(0);
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m325invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m325invoke() {
            VungleBannerView.access$finishAdInternal(VungleBannerView.this, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView(@NotNull Context context, @NotNull String placementId, @NotNull VungleAdSize adSize) {
        super(context);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
        AbstractC3340k.e(adSize, "adSize");
        this.placementId = placementId;
        this.adSize = adSize;
        this.f32830c = new w();
        i0 i0Var = new i0(context, placementId, adSize, new AdConfig());
        this.f32832e = i0Var;
        this.f32838l = new AtomicBoolean(false);
        this.f32839m = new AtomicBoolean(false);
        this.f32840n = new AtomicBoolean(false);
        this.f32841o = new AtomicBoolean(false);
        this.f32842p = new AtomicBoolean(false);
        this.impressionTracker = c.z(new VungleBannerView$impressionTracker$2(context));
        i0Var.setAdListener(new BannerAdListener() { // from class: com.vungle.ads.VungleBannerView.1
            @Override // com.vungle.ads.BaseAdListener
            public void onAdClicked(@NotNull BaseAd baseAd) {
                AbstractC3340k.e(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdEnd(@NotNull BaseAd baseAd) {
                AbstractC3340k.e(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
                AbstractC3340k.e(baseAd, "baseAd");
                AbstractC3340k.e(adError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
                AbstractC3340k.e(baseAd, "baseAd");
                AbstractC3340k.e(adError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(baseAd, adError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdImpression(@NotNull BaseAd baseAd) {
                AbstractC3340k.e(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLeftApplication(@NotNull BaseAd baseAd) {
                AbstractC3340k.e(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLoaded(@NotNull BaseAd baseAd) throws Throwable {
                AbstractC3340k.e(baseAd, "baseAd");
                VungleBannerView.access$onBannerAdLoaded(VungleBannerView.this, baseAd);
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdStart(@NotNull BaseAd baseAd) {
                AbstractC3340k.e(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(baseAd);
                }
            }
        });
    }

    public static final void access$checkHardwareAcceleration(VungleBannerView vungleBannerView) {
        vungleBannerView.getClass();
        boolean z2 = u.f33874a;
        StringBuilder sbA = l.a("hardwareAccelerated = ");
        sbA.append(vungleBannerView.isHardwareAccelerated());
        t.c("VungleBannerView", sbA.toString());
        if (vungleBannerView.isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, vungleBannerView.f32832e.getLogEntry(), null, 10);
    }

    public static final void access$finishAdInternal(VungleBannerView vungleBannerView, boolean z2) {
        if (vungleBannerView.f32838l.get()) {
            return;
        }
        vungleBannerView.f32838l.set(true);
        int i5 = (z2 ? 4 : 0) | 2;
        r rVar = vungleBannerView.f32836i;
        if (rVar != null) {
            boolean z10 = u.f33874a;
            t.a("MRAIDPresenter", "stop()");
            rVar.f33540a.b();
            rVar.f33543d.b(false);
        }
        r rVar2 = vungleBannerView.f32836i;
        if (rVar2 != null) {
            rVar2.a(i5);
        }
        vungleBannerView.getImpressionTracker().a();
        try {
            ViewParent parent = vungleBannerView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(vungleBannerView);
            }
            vungleBannerView.removeAllViews();
        } catch (Exception e7) {
            boolean z11 = u.f33874a;
            t.a("VungleBannerView", "Removing webView error: " + e7);
        }
    }

    public static final void access$logViewInvisibleOnPlay(VungleBannerView vungleBannerView) throws Throwable {
        if (vungleBannerView.f32842p.getAndSet(true)) {
            return;
        }
        boolean z2 = u.f33874a;
        StringBuilder sbA = l.a("ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. ");
        sbA.append(vungleBannerView.hashCode());
        t.a("VungleBannerView", sbA.toString());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.f33080c = 1L;
        AnalyticsClient.a(analyticsClient, m2Var, vungleBannerView.f32832e.getLogEntry(), 4);
    }

    public static final void access$logViewVisibleOnPlay(VungleBannerView vungleBannerView) throws Throwable {
        long j8 = vungleBannerView.f32842p.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.f33080c = Long.valueOf(j8);
        AnalyticsClient.a(analyticsClient, m2Var, vungleBannerView.f32832e.getLogEntry(), 4);
        boolean z2 = u.f33874a;
        t.a("VungleBannerView", "Log metric AD_VISIBILITY: " + j8);
    }

    public static final void access$onBannerAdLoaded(VungleBannerView vungleBannerView, BaseAd baseAd) throws Throwable {
        vungleBannerView.getClass();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), vungleBannerView.f32832e.getLogEntry(), 4);
        vungleBannerView.f32832e.getResponseToShowMetric().d();
        t1 responseToShowMetric = vungleBannerView.f32832e.getResponseToShowMetric();
        analyticsClient.a(responseToShowMetric, vungleBannerView.f32832e.getLogEntry(), responseToShowMetric.f33018b);
        vungleBannerView.f32832e.getAdInternal$vungle_ads_release().k.e();
        vungleBannerView.f32832e.getShowToCloseMetric().e();
        vungleBannerView.f32832e.getShowToFailMetric().e();
        VungleError vungleErrorA = vungleBannerView.f32832e.getAdInternal$vungle_ads_release().a(true);
        if (vungleErrorA != null) {
            if (vungleBannerView.f32832e.getAdInternal$vungle_ads_release().a(vungleErrorA.getCode())) {
                vungleBannerView.f32832e.getAdInternal$vungle_ads_release().a(h.f33014g);
            }
            BannerAdListener bannerAdListener = vungleBannerView.adListener;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToPlay(baseAd, vungleErrorA);
                return;
            }
            return;
        }
        h0 h0Var = vungleBannerView.f32832e.getAdInternal$vungle_ads_release().f33616c;
        i3 i3Var = vungleBannerView.f32832e.getAdInternal$vungle_ads_release().f33617d;
        if (h0Var == null || i3Var == null) {
            BannerAdListener bannerAdListener2 = vungleBannerView.adListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onAdFailedToPlay(baseAd, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(vungleBannerView.f32832e.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        vungleBannerView.f32832e.getAdInternal$vungle_ads_release().a();
        vungleBannerView.f32832e.getAdInternal$vungle_ads_release().k.d();
        t1 t1Var = vungleBannerView.f32832e.getAdInternal$vungle_ads_release().k;
        analyticsClient.a(t1Var, vungleBannerView.f32832e.getLogEntry(), t1Var.f33018b);
        vungleBannerView.f32832e.getAdInternal$vungle_ads_release().f33624l.e();
        try {
            vungleBannerView.a(h0Var, i3Var, vungleBannerView.getAdViewSize());
            vungleBannerView.f32840n.set(true);
            BannerAdListener bannerAdListener3 = vungleBannerView.adListener;
            if (bannerAdListener3 != null) {
                bannerAdListener3.onAdLoaded(baseAd);
            }
            vungleBannerView.a();
        } catch (InstantiationException unused) {
        }
    }

    private final f1 getImpressionTracker() {
        return (f1) this.impressionTracker.getValue();
    }

    public static /* synthetic */ void load$default(VungleBannerView vungleBannerView, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    private final void setAdVisibility(boolean isVisible) {
        r rVar;
        if (!this.k || this.f32838l.get() || (rVar = this.f32836i) == null) {
            return;
        }
        rVar.f33543d.b(isVisible);
    }

    public final void a() {
        if (this.f32838l.get()) {
            boolean z2 = u.f33874a;
            t.c("VungleBannerView", "renderAd() - destroyed");
            return;
        }
        if (!this.f32840n.get()) {
            boolean z10 = u.f33874a;
            t.a("VungleBannerView", "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.f32841o.get()) {
            boolean z11 = u.f33874a;
            t.a("VungleBannerView", "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.f32839m.getAndSet(true)) {
            r rVar = this.f32836i;
            if (rVar != null) {
                rVar.g();
            }
            getImpressionTracker().a(this, new c1() { // from class: com.vungle.ads.VungleBannerView$renderAd$1
                @Override // com.vungle.ads.internal.c1
                public void onImpression(@Nullable View view) throws Throwable {
                    boolean z12 = u.f33874a;
                    t.a("VungleBannerView", "ImpressionTracker checked the banner view become visible.");
                    this.f32851a.k = true;
                    VungleBannerView.access$logViewVisibleOnPlay(this.f32851a);
                    VungleBannerView.access$checkHardwareAcceleration(this.f32851a);
                    r rVar2 = this.f32851a.f32836i;
                    if (rVar2 != null) {
                        t.a("MRAIDPresenter", "start()");
                        rVar2.f33540a.d();
                        rVar2.f33543d.b(true);
                    }
                }

                @Override // com.vungle.ads.internal.c1
                public void onViewInvisible(@Nullable View view) throws Throwable {
                    VungleBannerView.access$logViewInvisibleOnPlay(this.f32851a);
                }
            });
        }
        k kVar = this.f32835h;
        if (kVar != null && !AbstractC3340k.a(kVar.getParent(), this)) {
            ViewParent parent = kVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(kVar);
            }
            addView(kVar, this.f32833f, this.f32834g);
        }
        a0 a0Var = this.f32837j;
        if (a0Var != null && !AbstractC3340k.a(a0Var.getParent(), this)) {
            ViewParent parent2 = a0Var.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(a0Var);
            }
            addView(a0Var, this.f32833f, this.f32834g);
            a0Var.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f32834g;
            layoutParams.width = this.f32833f;
            requestLayout();
        }
    }

    public final void finishAd() {
        Handler handler = y.f33878a;
        y.a(new C23771());
    }

    @NotNull
    public final AdConfig getAdConfig() {
        return this.f32832e.getAdConfig();
    }

    @Nullable
    public final BannerAdListener getAdListener() {
        return this.adListener;
    }

    @NotNull
    public final VungleAdSize getAdSize() {
        return this.adSize;
    }

    @NotNull
    public final VungleAdSize getAdViewSize() {
        return this.f32832e.getAdViewSize();
    }

    @Override // com.vungle.ads.VungleAdType
    @Nullable
    public String getAdapterAdFormat() {
        return this.f32832e.getAdapterAdFormat();
    }

    @Nullable
    public final String getCreativeId() {
        return this.f32832e.getCreativeId();
    }

    @Nullable
    public final String getEventId() {
        return this.f32832e.getEventId();
    }

    @NotNull
    public final s getLogEntry$vungle_ads_release() {
        return this.f32832e.getLogEntry();
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load() {
        this.f32832e.load();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z2 = u.f33874a;
        StringBuilder sbA = l.a("onAttachedToWindow(): ");
        sbA.append(hashCode());
        t.a("VungleBannerView", sbA.toString());
        this.f32841o.set(true);
        if (this.f32832e.getAdInternal$vungle_ads_release().f33617d != null) {
            try {
                if (!this.f32844r) {
                    getContext().registerReceiver(this.f32830c, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.f32844r = true;
                    t.a("VungleBannerView", "registerReceiver(): " + this.f32830c.hashCode());
                }
            } catch (Exception e7) {
                boolean z10 = u.f33874a;
                StringBuilder sbA2 = l.a("registerReceiver error: ");
                sbA2.append(e7.getLocalizedMessage());
                t.b("VungleBannerView", sbA2.toString());
            }
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        boolean z2 = u.f33874a;
        StringBuilder sbA = l.a("onDetachedFromWindow(): ");
        sbA.append(hashCode());
        t.a("VungleBannerView", sbA.toString());
        this.f32841o.set(false);
        if (this.f32832e.getAdInternal$vungle_ads_release().f33617d != null) {
            try {
                if (this.f32844r) {
                    getContext().unregisterReceiver(this.f32830c);
                    this.f32844r = false;
                }
            } catch (Exception e7) {
                boolean z10 = u.f33874a;
                StringBuilder sbA2 = l.a("unregisterReceiver error: ");
                sbA2.append(e7.getLocalizedMessage());
                t.b("VungleBannerView", sbA2.toString());
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        setAdVisibility(i5 == 0);
    }

    public final void setAdListener(@Nullable BannerAdListener bannerAdListener) {
        this.adListener = bannerAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(@Nullable String str) {
        this.f32832e.setAdapterAdFormat(str);
    }

    public final void load(@Nullable String adMarkup) {
        this.f32832e.load(adMarkup);
    }

    public final void load(@NotNull VungleCSBData csbData) {
        AbstractC3340k.e(csbData, "csbData");
        this.f32832e.load(csbData);
    }

    public final void a(h0 h0Var, i3 i3Var, VungleAdSize vungleAdSize) throws InstantiationException {
        Context context = getContext();
        AbstractC3340k.d(context, "context");
        this.f32834g = com.vungle.ads.internal.util.a0.a(context, vungleAdSize.getHeight());
        Context context2 = getContext();
        AbstractC3340k.d(context2, "context");
        this.f32833f = com.vungle.ads.internal.util.a0.a(context2, vungleAdSize.getWidth());
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(this.f32832e.a(), this.f32832e.getAdInternal$vungle_ads_release().f());
        try {
            Context context3 = getContext();
            AbstractC3340k.d(context3, "context");
            k kVar = new k(context3, h0Var.h());
            this.f32835h = kVar;
            kVar.setCloseDelegate(new f() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$1
                @Override // com.vungle.ads.internal.ui.view.f
                public void close() {
                    VungleBannerView.access$finishAdInternal(this.f32852a, false);
                }
            });
            kVar.setOnViewTouchListener(new com.vungle.ads.internal.ui.view.h() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$2
                @Override // com.vungle.ads.internal.ui.view.h
                public boolean onTouch(@Nullable MotionEvent event) {
                    r rVar = this.f32853a.f32836i;
                    if (rVar == null) {
                        return false;
                    }
                    rVar.a(event);
                    return false;
                }
            });
            Context context4 = getContext();
            AbstractC3340k.d(context4, "context");
            EnumC2526j enumC2526j = EnumC2526j.f34667a;
            InterfaceC2525i interfaceC2525iY = c.y(enumC2526j, new VungleBannerView$willPresentAdView$$inlined$inject$1(context4));
            Context context5 = getContext();
            AbstractC3340k.d(context5, "context");
            d dVar = (d) c.y(enumC2526j, new VungleBannerView$willPresentAdView$$inlined$inject$2(context5)).getValue();
            boolean zC = h0Var.C();
            dVar.getClass();
            e eVarA = d.a(zC);
            Context context6 = getContext();
            AbstractC3340k.d(context6, "context");
            InterfaceC2525i interfaceC2525iY2 = c.y(enumC2526j, new VungleBannerView$willPresentAdView$$inlined$inject$3(context6));
            j jVarF = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) interfaceC2525iY.getValue())).f();
            ReentrantLock reentrantLock = e0.f33519a;
            z zVarA = e0.a(h0Var, i3Var, jVarF, (com.vungle.ads.internal.platform.f) interfaceC2525iY2.getValue());
            this.f32830c.a(zVarA);
            zVarA.a(eVarA);
            r rVar = new r(kVar, h0Var, i3Var, zVarA, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) interfaceC2525iY.getValue())).d(), eVarA, (com.vungle.ads.internal.platform.f) interfaceC2525iY2.getValue());
            rVar.a(aVar);
            this.f32836i = rVar;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                AbstractC3340k.d(context7, "context");
                this.f32837j = new a0(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e7) {
            aVar.a(new AdCantPlayWithoutWebView(e7.getMessage()).setLogEntry$vungle_ads_release(this.f32832e.getLogEntry()).logError$vungle_ads_release(), this.placementId);
            throw e7;
        }
    }
}
