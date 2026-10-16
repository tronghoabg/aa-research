package com.applovin.impl.mediation.ads;

import A7.AbstractC0279p0;
import R8.v;
import Va.M6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cb.AbstractC1593a;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.AbstractC1660s;
import com.applovin.impl.C1643j;
import com.applovin.impl.EnumC1641i;
import com.applovin.impl.b3;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.h8;
import com.applovin.impl.j5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o7;
import com.applovin.impl.r3;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, h8.a, C1643j.b {

    /* renamed from: A, reason: collision with root package name */
    private boolean f21999A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f22000B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f22001C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f22002D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f22003a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdView f22004b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22005c;

    /* renamed from: d, reason: collision with root package name */
    private final View f22006d;

    /* renamed from: e, reason: collision with root package name */
    private long f22007e;

    /* renamed from: f, reason: collision with root package name */
    private b3 f22008f;

    /* renamed from: g, reason: collision with root package name */
    private String f22009g;

    /* renamed from: h, reason: collision with root package name */
    private String f22010h;

    /* renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f22011i;

    /* renamed from: j, reason: collision with root package name */
    private final b f22012j;
    private final d k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.f f22013l;

    /* renamed from: m, reason: collision with root package name */
    private final g8 f22014m;

    /* renamed from: n, reason: collision with root package name */
    private final h8 f22015n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f22016o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f22017p;

    /* renamed from: q, reason: collision with root package name */
    private b3 f22018q;

    /* renamed from: r, reason: collision with root package name */
    private MaxAd f22019r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22020s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22021t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f22022u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f22023v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22024w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22025x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22026y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f22027z;

    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                o oVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar2, str2);
            }
            t2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
                return;
            }
            b3 b3Var = (b3) maxAd;
            b3Var.g(MaxAdViewImpl.this.f22009g);
            b3Var.f(MaxAdViewImpl.this.f22010h);
            if (b3Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(b3Var);
                onAdLoadFailed(b3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (b3Var.p0()) {
                long jK0 = b3Var.k0();
                MaxAdViewImpl.this.sdk.O();
                if (o.a()) {
                    o oVarO = MaxAdViewImpl.this.sdk.O();
                    String str = MaxAdViewImpl.this.tag;
                    StringBuilder sbU = M6.u(jK0, "Scheduling banner ad refresh ", " milliseconds from now for '");
                    sbU.append(MaxAdViewImpl.this.adUnitId);
                    sbU.append("'...");
                    oVarO.a(str, sbU.toString());
                }
                MaxAdViewImpl.this.f22013l.a(jK0);
                if (MaxAdViewImpl.this.f22013l.g() || MaxAdViewImpl.this.f22022u) {
                    o oVar2 = MaxAdViewImpl.this.logger;
                    if (o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f22013l.j();
                }
            }
            o oVar3 = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                o oVar4 = maxAdViewImpl3.logger;
                String str2 = maxAdViewImpl3.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar4, str2);
            }
            t2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(b3Var);
        }
    }

    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0014a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f22018q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f22019r)) {
                MaxAdViewImpl.this.f22019r = null;
                if ((MaxAdViewImpl.this.f22018q.q0() || MaxAdViewImpl.this.f22000B) && MaxAdViewImpl.this.f22020s) {
                    MaxAdViewImpl.this.f22020s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f22018q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(maxAd);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f22018q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f22018q)) {
                MaxAdViewImpl.this.f22019r = maxAd;
                if ((MaxAdViewImpl.this.f22018q.q0() || MaxAdViewImpl.this.f22000B) && !MaxAdViewImpl.this.f22013l.g()) {
                    MaxAdViewImpl.this.f22020s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f22018q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    AbstractC1593a.u(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                o oVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbW.append(MaxAdViewImpl.this.requestListener);
                oVar2.a(str2, sbW.toString());
            }
            t2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            t2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f22025x) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(r3.f22692M7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            o oVar2 = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f22005c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f22007e = Long.MAX_VALUE;
        this.f22016o = new Object();
        this.f22017p = new Object();
        this.f22018q = null;
        this.f22019r = null;
        this.f22023v = new AtomicBoolean();
        this.f22025x = false;
        this.f22003a = context.getApplicationContext();
        this.f22004b = maxAdView;
        this.f22006d = view;
        this.f22012j = new b();
        this.k = new d();
        this.f22013l = new com.applovin.impl.sdk.f(this.sdk, this);
        this.f22014m = new g8(maxAdView, this.sdk);
        this.f22015n = new h8(maxAdView, this.sdk, this);
        this.f22011i = maxAdViewConfiguration;
        this.sdk.j().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(r3.f22693N7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this, 0));
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f22009g;
    }

    public void loadAd() {
        loadAd(EnumC1641i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(r3.f22692M7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.C1643j.b
    public void onCreativeIdGenerated(String str, String str2) {
        b3 b3Var = this.f22018q;
        if (b3Var != null && b3Var.O().equalsIgnoreCase(str)) {
            this.f22018q.h(str2);
            t2.b(this.adReviewListener, str2, this.f22018q);
            return;
        }
        b3 b3Var2 = this.f22008f;
        if (b3Var2 == null || !b3Var2.O().equalsIgnoreCase(str)) {
            return;
        }
        this.f22008f.h(str2);
    }

    @Override // com.applovin.impl.h8.a
    public void onLogVisibilityImpression() {
        a(this.f22018q, this.f22014m.a(this.f22018q));
    }

    public void onWindowVisibilityChanged(int i5) {
        if (((Boolean) this.sdk.a(r3.f22689J7)).booleanValue() && this.f22013l.h()) {
            if (f8.b(i5)) {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f22013l.d();
            } else {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f22013l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f22018q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Setting custom data (", str, ") for Ad Unit ID (");
            sbW.append(this.adUnitId);
            sbW.append(") after an ad has been loaded already.");
            oVar.k(str2, sbW.toString());
        }
        o7.b(str, this.tag);
        this.f22010h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f22018q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Setting placement (", str, ") for Ad Unit ID (");
            sbW.append(this.adUnitId);
            sbW.append(") after an ad has been loaded already.");
            oVar.k(str2, sbW.toString());
        }
        this.f22009g = str;
    }

    public void setPublisherBackgroundColor(int i5) {
        this.f22007e = i5;
    }

    public void startAutoRefresh() {
        this.f22022u = false;
        if (!this.f22013l.g()) {
            if (o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f22013l.m();
        if (o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f22013l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f22018q == null) {
            if (this.f22026y || ((Boolean) this.sdk.a(r3.f22691L7)).booleanValue()) {
                this.f22022u = true;
                return;
            } else {
                o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f22013l.b() + "ms");
        }
        this.f22013l.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f22004b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        return AbstractC0279p0.p(sb2, a(), '}');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b3 b3Var) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.d(this, b3Var, 1));
    }

    private void e() {
        this.f22023v.set(false);
        if (this.f22008f != null) {
            i();
            return;
        }
        if (!b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(EnumC1641i.REFRESH);
        } else if (this.f22021t) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(EnumC1641i.REFRESH);
        } else {
            if (o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f22023v.set(true);
        }
    }

    private void f() {
        boolean z2;
        boolean z10;
        synchronized (this.f22017p) {
            try {
                z2 = false;
                this.f22023v.set(false);
                z10 = this.f22008f != null;
                if (!z10) {
                    if (b()) {
                        if (!this.f22021t) {
                            if (o.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f22023v.set(true);
                        } else if (o.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            i();
        } else if (z2) {
            loadAd(EnumC1641i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f22008f != null) {
            this.sdk.X().destroyAd(this.f22008f);
        }
        synchronized (this.f22016o) {
            this.f22025x = true;
        }
        this.f22013l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.f22005c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.f22005c);
        }
        super.destroy();
    }

    private void h() {
        b3 b3Var;
        MaxAdView maxAdView = this.f22004b;
        if (maxAdView != null) {
            AbstractC1660s.a(maxAdView, this.f22006d);
        }
        this.f22015n.b();
        synchronized (this.f22016o) {
            b3Var = this.f22018q;
        }
        MaxAd maxAd = this.f22019r;
        if (maxAd != null && maxAd.equals(b3Var)) {
            if (o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            t2.b(this.f22012j, maxAd);
        }
        if (b3Var != null) {
            this.sdk.X().destroyAd(b3Var);
        }
    }

    private void i() {
        if (o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f22008f + "...");
        }
        this.f22012j.onAdLoaded(this.f22008f);
        this.f22008f = null;
    }

    public void loadAd(EnumC1641i enumC1641i) {
        if (o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z2 = this.f22026y || ((Boolean) this.sdk.a(r3.f22691L7)).booleanValue();
        if (z2 && !this.f22013l.g() && this.f22013l.h()) {
            o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f22013l.b()) + " seconds.");
            return;
        }
        if (!z2) {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(enumC1641i, this.f22012j);
        } else if (this.f22008f != null) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f22024w) {
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f22023v.set(true);
        } else {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(enumC1641i, this.f22012j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b3 b3Var) {
        View viewY = b3Var.y();
        String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f22004b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (o.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(b3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, (MaxAd) b3Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, b3Var);
            return;
        }
        h();
        a((y2) b3Var);
        if (b3Var.j0()) {
            this.f22015n.a(b3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (b3Var.l0() != Long.MAX_VALUE) {
            this.f22006d.setBackgroundColor((int) b3Var.l0());
        } else {
            long j8 = this.f22007e;
            if (j8 != Long.MAX_VALUE) {
                this.f22006d.setBackgroundColor((int) j8);
            } else {
                this.f22006d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, b3Var);
        this.sdk.y().d(b3Var);
        c(b3Var);
        synchronized (this.f22016o) {
            this.f22018q = b3Var;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.X().processRawAdImpression(b3Var, this.f22012j);
        if (StringUtils.isValidString(this.f22018q.getAdReviewCreativeId())) {
            t2.a(this.adReviewListener, this.f22018q.getAdReviewCreativeId(), (MaxAd) this.f22018q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.d(this, b3Var, 0), b3Var.n0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(EnumC1641i.SEQUENTIAL_OR_PRECACHE, this.k);
    }

    private void d() {
        if (b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f22024w = true;
            this.sdk.r0().a((j5) new s6(this.sdk, "loadMaxAdForPrecacheRequest", new com.applovin.impl.mediation.ads.c(this, 1)), e6.b.MEDIATION);
        }
    }

    private void c(b3 b3Var) {
        int height = this.f22004b.getHeight();
        int width = this.f22004b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f22003a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f22003a, width);
            MaxAdFormat format = b3Var.getFormat();
            int height2 = (this.f22002D ? format.getAdaptiveSize(iPxToDp2, this.f22004b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), AbstractC1654o0.b(this.f22003a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sbH = v.h("\n**************************************************\n`MaxAdView` size ", iPxToDp2, "x", iPxToDp, " dp smaller than required ");
                sbH.append(this.f22002D ? "adaptive " : "");
                sbH.append("size: ");
                sbH.append(iMin);
                sbH.append("x");
                String strJ = AbstractC0279p0.j(height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n", sbH);
                if (o.a()) {
                    this.logger.b("AppLovinSdk", strJ);
                }
            }
        }
    }

    private void a(EnumC1641i enumC1641i, a.InterfaceC0014a interfaceC0014a) {
        if (a()) {
            boolean zC = o7.c(this.sdk);
            this.sdk.D().a(d2.f21291S0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new Ab.a(this, interfaceC0014a, enumC1641i, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0014a interfaceC0014a, EnumC1641i enumC1641i) {
        int adaptiveWidth;
        b3 b3Var = this.f22018q;
        if (b3Var != null) {
            long jA = this.f22014m.a(b3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f22018q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f22004b.getContext(), this.f22004b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f22004b.getContext(), this.f22004b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f22013l.g() || this.f22022u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f22027z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f22011i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            o.j(this.tag, N0.a.e("The requested adaptive ad view width (", adaptiveWidth, " dp) is different from the MaxAdView width (", iPxToDp, " dp)."));
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0014a + "...");
        }
        this.sdk.X().loadAd(this.adUnitId, this.f22005c, this.adFormat, enumC1641i, this.localExtraParameters, this.extraParameters, this.f22003a, interfaceC0014a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (o.a()) {
                AbstractC1593a.s("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f22026y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (o.a()) {
                AbstractC1593a.s("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f22027z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (o.a()) {
                AbstractC1593a.s("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f21999A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (o.a()) {
                AbstractC1593a.s("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f22000B = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (o.a()) {
                AbstractC1593a.s("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f22001C = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (o.a()) {
                AbstractC1593a.s("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            if (this.f22011i == null) {
                o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.f22002D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f22024w = false;
        synchronized (this.f22017p) {
            try {
                zCompareAndSet = this.f22023v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    b3 b3Var = (b3) maxAd;
                    this.f22008f = b3Var;
                    b3Var.g(this.f22009g);
                    this.f22008f.f(this.f22010h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zCompareAndSet) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f22012j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.f21999A) {
            return false;
        }
        return ((Boolean) this.sdk.a(r3.S7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        long jA = this.f22014m.a(b3Var);
        if (!b3Var.j0()) {
            a(b3Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (o.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(r3.f22684F7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f22022u && !this.f22013l.g()) {
            this.f22021t = true;
            this.f22024w = false;
            long jLongValue = ((Long) this.sdk.a(r3.f22682E7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.O();
                if (o.a()) {
                    o oVarO = this.sdk.O();
                    String str = this.tag;
                    StringBuilder sbU = M6.u(jLongValue, "Scheduling failed banner ad refresh ", " milliseconds from now for '");
                    sbU.append(this.adUnitId);
                    sbU.append("'...");
                    oVarO.a(str, sbU.toString());
                }
                this.f22013l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f22024w) {
            if (o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f22024w = false;
        }
        if (this.f22023v.get()) {
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(this.adUnitId);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, b3 b3Var) {
        int iO0 = b3Var.o0();
        int iM0 = b3Var.m0();
        int iDpToPx = iO0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iO0);
        int iDpToPx2 = iM0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iM0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (o.a()) {
                this.logger.a(this.tag, N0.a.e("Pinning ad view to MAX ad view with width: ", iDpToPx, " and height: ", iDpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i5 : f8.a(this.f22004b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i5);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(b3 b3Var, long j8) {
        if (o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(b3Var, j8, this.f22012j);
    }

    private void a(long j8) {
        if (o7.a(j8, ((Long) this.sdk.a(r3.f22697R7)).longValue()) && !this.f22001C) {
            if (o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j8) + ", undesired: " + Long.toBinaryString(j8));
            }
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f22021t = true;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f22021t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f22024w = false;
        if (this.f22023v.compareAndSet(true, false)) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f22012j.onAdLoaded(maxAd);
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        b3 b3Var = (b3) maxAd;
        this.f22008f = b3Var;
        b3Var.g(this.f22009g);
        this.f22008f.f(this.f22010h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z2;
        synchronized (this.f22016o) {
            z2 = this.f22025x;
        }
        return z2;
    }
}
