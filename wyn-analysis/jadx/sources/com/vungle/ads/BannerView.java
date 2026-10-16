package com.vungle.ads;

import Fe.c;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.c1;
import com.vungle.ads.internal.f1;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.omsdk.d;
import com.vungle.ads.internal.omsdk.e;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.f;
import com.vungle.ads.internal.ui.view.h;
import com.vungle.ads.internal.ui.view.k;
import com.vungle.ads.internal.ui.z;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.EnumC2526j;
import ef.InterfaceC2519c;
import ef.InterfaceC2525i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC2519c
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006,²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/BannerView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/model/i3;", "placement", "Lcom/vungle/ads/internal/model/h0;", "advertisement", "Lcom/vungle/ads/VungleAdSize;", "adSize", "Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/internal/presenter/b;", "adPlayCallback", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/i3;Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;Lcom/vungle/ads/internal/presenter/b;)V", "", "isVisible", "Lef/C;", "setAdVisibility", "(Z)V", "isFinishedByApi", "finishAdInternal", "a", "Lcom/vungle/ads/internal/model/i3;", "getPlacement", "()Lcom/vungle/ads/internal/model/i3;", "b", "Lcom/vungle/ads/internal/model/h0;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/h0;", "Lcom/vungle/ads/internal/f1;", "l", "Lef/i;", "getImpressionTracker", "()Lcom/vungle/ads/internal/f1;", "impressionTracker", "Companion", "Lcom/vungle/ads/internal/executor/a;", "executors", "Lcom/vungle/ads/internal/omsdk/d;", "omTrackerFactory", "Lcom/vungle/ads/internal/platform/f;", "platform", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class BannerView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final i3 placement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final h0 advertisement;

    /* renamed from: c, reason: collision with root package name */
    public int f32753c;

    /* renamed from: d, reason: collision with root package name */
    public int f32754d;

    /* renamed from: e, reason: collision with root package name */
    public k f32755e;

    /* renamed from: f, reason: collision with root package name */
    public r f32756f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f32757g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32758h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f32759i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f32760j;
    public final AtomicBoolean k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC2525i impressionTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @NotNull i3 placement, @NotNull h0 advertisement, @NotNull VungleAdSize adSize, @NotNull AdConfig adConfig, @NotNull b adPlayCallback) throws InstantiationException {
        super(context);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placement, "placement");
        AbstractC3340k.e(advertisement, "advertisement");
        AbstractC3340k.e(adSize, "adSize");
        AbstractC3340k.e(adConfig, "adConfig");
        AbstractC3340k.e(adPlayCallback, "adPlayCallback");
        this.placement = placement;
        this.advertisement = advertisement;
        this.f32759i = new AtomicBoolean(false);
        this.f32760j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.impressionTracker = c.z(new BannerView$impressionTracker$2(context));
        this.f32754d = com.vungle.ads.internal.util.a0.a(context, adSize.getHeight());
        this.f32753c = com.vungle.ads.internal.util.a0.a(context, adSize.getWidth());
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(adPlayCallback, placement);
        try {
            k kVar = new k(context);
            this.f32755e = kVar;
            kVar.setCloseDelegate(new f() { // from class: com.vungle.ads.BannerView.1
                @Override // com.vungle.ads.internal.ui.view.f
                public void close() {
                    BannerView.this.finishAdInternal(false);
                }
            });
            kVar.setOnViewTouchListener(new h() { // from class: com.vungle.ads.BannerView.2
                @Override // com.vungle.ads.internal.ui.view.h
                public boolean onTouch(@Nullable MotionEvent event) {
                    r rVar = BannerView.this.f32756f;
                    if (rVar == null) {
                        return false;
                    }
                    rVar.a(event);
                    return false;
                }
            });
            EnumC2526j enumC2526j = EnumC2526j.f34667a;
            InterfaceC2525i interfaceC2525iY = c.y(enumC2526j, new BannerView$special$$inlined$inject$1(context));
            d dVarB = b(c.y(enumC2526j, new BannerView$special$$inlined$inject$2(context)));
            boolean zC = advertisement.C();
            dVarB.getClass();
            e eVarA = d.a(zC);
            InterfaceC2525i interfaceC2525iY2 = c.y(enumC2526j, new BannerView$special$$inlined$inject$3(context));
            z zVar = new z(advertisement, placement, ((com.vungle.ads.internal.executor.d) a(interfaceC2525iY)).f(), c(interfaceC2525iY2));
            zVar.a(eVarA);
            r rVar = new r(kVar, advertisement, placement, zVar, ((com.vungle.ads.internal.executor.d) a(interfaceC2525iY)).d(), eVarA, c(interfaceC2525iY2));
            rVar.a(aVar);
            this.f32756f = rVar;
            String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.f32757g = new a0(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e7) {
            aVar.a(new AdCantPlayWithoutWebView(null, 1, null).setLogEntry$vungle_ads_release(this.advertisement.q()).logError$vungle_ads_release(), this.placement.b());
            throw e7;
        }
    }

    public static final com.vungle.ads.internal.executor.a a(InterfaceC2525i interfaceC2525i) {
        return (com.vungle.ads.internal.executor.a) interfaceC2525i.getValue();
    }

    public static final void access$checkHardwareAcceleration(BannerView bannerView) {
        bannerView.getClass();
        boolean z2 = u.f33874a;
        StringBuilder sbA = l.a("hardwareAccelerated = ");
        sbA.append(bannerView.isHardwareAccelerated());
        t.c("BannerView", sbA.toString());
        if (bannerView.isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, bannerView.advertisement.f33184h, null, 10);
    }

    public static final void access$logViewVisibleOnPlay(BannerView bannerView) throws Throwable {
        long j8 = bannerView.k.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.f33080c = Long.valueOf(j8);
        AnalyticsClient.a(analyticsClient, m2Var, bannerView.advertisement.f33184h, 4);
        boolean z2 = u.f33874a;
        t.a("BannerView", "Log metric AD_VISIBILITY: " + j8);
    }

    public static final d b(InterfaceC2525i interfaceC2525i) {
        return (d) interfaceC2525i.getValue();
    }

    public static final com.vungle.ads.internal.platform.f c(InterfaceC2525i interfaceC2525i) {
        return (com.vungle.ads.internal.platform.f) interfaceC2525i.getValue();
    }

    private final f1 getImpressionTracker() {
        return (f1) this.impressionTracker.getValue();
    }

    private final void setAdVisibility(boolean isVisible) {
        r rVar;
        if (!this.f32758h || this.f32759i.get() || (rVar = this.f32756f) == null) {
            return;
        }
        rVar.f33543d.b(isVisible);
    }

    public final void finishAdInternal(boolean isFinishedByApi) {
        if (this.f32759i.get()) {
            return;
        }
        this.f32759i.set(true);
        int i5 = (isFinishedByApi ? 4 : 0) | 2;
        r rVar = this.f32756f;
        if (rVar != null) {
            boolean z2 = u.f33874a;
            t.a("MRAIDPresenter", "stop()");
            rVar.f33540a.b();
            rVar.f33543d.b(false);
        }
        r rVar2 = this.f32756f;
        if (rVar2 != null) {
            rVar2.a(i5);
        }
        getImpressionTracker().a();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e7) {
            boolean z10 = u.f33874a;
            t.a("BannerView", "Removing webView error: " + e7);
        }
    }

    @NotNull
    public final h0 getAdvertisement() {
        return this.advertisement;
    }

    @NotNull
    public final i3 getPlacement() {
        return this.placement;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z2 = u.f33874a;
        t.a("BannerView", "onAttachedToWindow()");
        if (!this.f32760j.getAndSet(true)) {
            r rVar = this.f32756f;
            if (rVar != null) {
                rVar.g();
            }
            getImpressionTracker().a(this, new c1() { // from class: com.vungle.ads.BannerView.onAttachedToWindow.1
                @Override // com.vungle.ads.internal.c1
                public void onImpression(@Nullable View view) throws Throwable {
                    boolean z10 = u.f33874a;
                    t.a("BannerView", "ImpressionTracker checked the banner view become visible.");
                    BannerView.this.f32758h = true;
                    BannerView.access$logViewVisibleOnPlay(BannerView.this);
                    BannerView.access$checkHardwareAcceleration(BannerView.this);
                    r rVar2 = BannerView.this.f32756f;
                    if (rVar2 != null) {
                        t.a("MRAIDPresenter", "start()");
                        rVar2.f33540a.d();
                        rVar2.f33543d.b(true);
                    }
                }

                @Override // com.vungle.ads.internal.c1
                public void onViewInvisible(@Nullable View view) throws Throwable {
                    if (BannerView.this.k.getAndSet(true)) {
                        return;
                    }
                    boolean z10 = u.f33874a;
                    t.a("BannerView", "ImpressionTracker checked the banner view invisible on play.");
                    AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                    m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                    m2Var.f33080c = 1L;
                    AnalyticsClient.a(analyticsClient, m2Var, BannerView.this.getAdvertisement().f33184h, 4);
                }
            });
        }
        k kVar = this.f32755e;
        if (kVar != null && !AbstractC3340k.a(kVar.getParent(), this)) {
            addView(this.f32755e, this.f32753c, this.f32754d);
            a0 a0Var = this.f32757g;
            if (a0Var != null) {
                addView(a0Var, this.f32753c, this.f32754d);
                a0 a0Var2 = this.f32757g;
                if (a0Var2 != null) {
                    a0Var2.bringToFront();
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f32754d;
            layoutParams.width = this.f32753c;
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        setAdVisibility(i5 == 0);
    }
}
