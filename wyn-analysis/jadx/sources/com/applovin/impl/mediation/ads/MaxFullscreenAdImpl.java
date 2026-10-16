package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1451o;
import cb.AbstractC1593a;
import com.applovin.impl.C1638g0;
import com.applovin.impl.C1643j;
import com.applovin.impl.EnumC1641i;
import com.applovin.impl.a5;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o7;
import com.applovin.impl.r3;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.C1662a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.y2;
import com.applovin.impl.y4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements C1662a.InterfaceC0019a, C1643j.b {

    /* renamed from: a, reason: collision with root package name */
    private final a f22031a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f22032b;

    /* renamed from: c, reason: collision with root package name */
    private final b f22033c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f22034d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f22035e;

    /* renamed from: f, reason: collision with root package name */
    private c3 f22036f;

    /* renamed from: g, reason: collision with root package name */
    private c f22037g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f22038h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f22039i;

    /* renamed from: j, reason: collision with root package name */
    private C1638g0 f22040j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22041l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22042m;

    /* renamed from: n, reason: collision with root package name */
    private String f22043n;

    /* renamed from: o, reason: collision with root package name */
    private String f22044o;

    /* renamed from: p, reason: collision with root package name */
    private String f22045p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference f22046q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference f22047r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f22048s;

    public interface a {
        Activity getActivity();
    }

    public class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0014a {
        public b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.this.d();
            final boolean z2 = MaxFullscreenAdImpl.this.f22042m;
            if (z2) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f21257A0, c3Var, CollectionUtils.hashMap("details", c3Var.n0()));
                MaxFullscreenAdImpl.this.f22042m = false;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22091a.a(maxAd, z2, c3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c3 c3Var = (c3) maxAd;
            if (MaxFullscreenAdImpl.this.f22042m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f21354z0, c3Var, CollectionUtils.hashMap("details", c3Var.n0()));
                MaxFullscreenAdImpl.this.f22042m = false;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(c3Var);
            MaxFullscreenAdImpl.this.b(c3Var);
            MaxFullscreenAdImpl.this.f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(r3.f22726u8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.r0().b(new s6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new h(3, this, c3Var)), e6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            t2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f22042m = false;
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(c.IDLE, new h(2, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new f(this, str, maxError, 0));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            c3 c3Var;
            synchronized (MaxFullscreenAdImpl.this.f22035e) {
                c3Var = MaxFullscreenAdImpl.this.f22036f;
            }
            MaxFullscreenAdImpl.this.sdk.H().a(MaxFullscreenAdImpl.this.adUnitId);
            c3 c3Var2 = (c3) maxAd;
            MaxFullscreenAdImpl.this.a(c3Var2);
            if (!MaxFullscreenAdImpl.this.f22038h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Ab.a(this, c3Var2, maxAd, 29));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f22039i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.g();
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            t2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbW.append(MaxFullscreenAdImpl.this.requestListener);
                oVar2.a(str2, sbW.toString());
            }
            t2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            t2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f22042m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c3Var.j(MaxFullscreenAdImpl.this.f22045p);
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f21352y0, c3Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f22045p));
                MaxFullscreenAdImpl.this.g();
                return;
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            t2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str2);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var) {
            if (c3Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(d2.f21341s0, c3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            t2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z2, c3 c3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z2 && c3Var.s0()) {
                if (MaxFullscreenAdImpl.this.b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new com.applovin.adview.a(this, 3));
                    return;
                }
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f21350x0, c3Var);
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(maxAd);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f22042m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f22035e = new Object();
        this.f22036f = null;
        this.f22037g = c.IDLE;
        this.f22038h = new AtomicBoolean();
        this.f22039i = new AtomicBoolean();
        this.f22046q = new WeakReference(null);
        this.f22047r = new WeakReference(null);
        this.f22048s = new WeakReference(null);
        this.f22031a = aVar;
        this.f22033c = createAdListenerWrapper();
        this.f22034d = new com.applovin.impl.mediation.b(kVar);
        this.f22032b = new WeakReference(context);
        kVar.j().a(this);
        o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new com.applovin.adview.a(this, 2));
    }

    public boolean isReady() {
        boolean z2;
        synchronized (this.f22035e) {
            try {
                c3 c3Var = this.f22036f;
                z2 = c3Var != null && c3Var.U() && this.f22037g == c.READY;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            this.sdk.H().c(this.adUnitId);
        }
        return z2;
    }

    public void loadAd() {
        loadAd(EnumC1641i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.C1662a.InterfaceC0019a
    public void onAdExpired(t1 t1Var) {
        if (o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f22038h.set(true);
        a aVar = this.f22031a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            e();
            this.f22033c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, EnumC1641i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f22033c);
        }
    }

    @Override // com.applovin.impl.C1643j.b
    public void onCreativeIdGenerated(String str, String str2) {
        c3 c3Var = this.f22036f;
        if (c3Var == null || !c3Var.O().equalsIgnoreCase(str)) {
            return;
        }
        this.f22036f.h(str2);
        t2.b(this.adReviewListener, str2, this.f22036f);
    }

    public void showAd(String str, String str2, Activity activity) {
        c3 c3Var;
        List listB = this.sdk.t0().b();
        if (!this.sdk.t0().d() || listB == null || (c3Var = this.f22036f) == null || listB.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.v0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Cb.a(this, str, str2, activity2, 14));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f22036f.c() + "> which is not in the list of selected ad networks " + listB;
        o.h(this.tag, str3);
        a(c.IDLE, new e(this, str3, 2));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f22031a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        c3 c3Var = this.f22036f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(c3Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            AbstractC1593a.u(sb2, this.adListener, oVar, str2);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c3 c3Var;
        if (this.f22038h.compareAndSet(true, false)) {
            synchronized (this.f22035e) {
                c3Var = this.f22036f;
                this.f22036f = null;
            }
            this.sdk.X().destroyAd(c3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Long l10 = (Long) this.sdk.a(y4.f23615I2);
        if (l10.longValue() <= 0) {
            return;
        }
        this.f22040j = C1638g0.a(l10.longValue(), true, this.sdk, new h(1, this, l10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activityV0 = (Activity) this.f22046q.get();
        if (activityV0 == null) {
            activityV0 = this.sdk.v0();
        }
        Activity activity = activityV0;
        if (this.f22041l) {
            showAd(this.f22043n, this.f22044o, (ViewGroup) this.f22047r.get(), (AbstractC1451o) this.f22048s.get(), activity);
        } else {
            showAd(this.f22043n, this.f22044o, activity);
        }
    }

    public void loadAd(EnumC1641i enumC1641i) {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f22037g == c.DESTROYED) {
            boolean zC = o7.c(this.sdk);
            this.sdk.D().a(d2.f21291S0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f22031a;
            a(c.LOADING, new Cb.a(this, aVar != null ? aVar.getActivity() : null, (Context) this.f22032b.get(), enumC1641i, 13));
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (o.a()) {
            o oVar = this.logger;
            String str = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
            sb2.append(this.f22036f);
            sb2.append("), listener=");
            AbstractC1593a.u(sb2, this.adListener, oVar, str);
        }
        t2.f(this.adListener, (MaxAd) this.f22036f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f22035e) {
            try {
                if (this.f22036f != null) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f22036f + "...");
                    }
                    this.sdk.X().destroyAd(this.f22036f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.j().b(this);
        this.f22034d.a();
        C1638g0 c1638g0 = this.f22040j;
        if (c1638g0 != null) {
            c1638g0.a();
            this.f22040j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (((Boolean) this.sdk.a(y4.f23607H2)).booleanValue()) {
            this.sdk.q0().b(a5.f20947R);
        }
        if (this.f22040j != null) {
            this.sdk.q0().b(a5.f20948S);
            this.f22040j.a();
            this.f22040j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, EnumC1641i enumC1641i) {
        Context context2;
        Context contextO = activity;
        if (activity != null) {
            context2 = contextO;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.v0() != null) {
                contextO = this.sdk.v0();
            } else {
                contextO = k.o();
            }
            context2 = contextO;
        }
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, enumC1641i, this.localExtraParameters, this.extraParameters, context2, this.f22033c);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        c3 c3Var;
        if (viewGroup != null && abstractC1451o != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(r3.f22717p8)).booleanValue()) {
                o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                t2.a(this.adListener, (MaxAd) this.f22036f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f22036f);
                return;
            }
            List listB = this.sdk.t0().b();
            if (this.sdk.t0().d() && listB != null && (c3Var = this.f22036f) != null && !listB.contains(c3Var.c())) {
                String str3 = "Attempting to show ad from <" + this.f22036f.c() + "> which is not in the list of selected ad networks " + listB;
                o.h(this.tag, str3);
                a(c.IDLE, new e(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.v0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Uc.d(this, str, str2, activity2, viewGroup, abstractC1451o));
                return;
            }
            return;
        }
        o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (o.a()) {
            o oVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(this.f22036f);
            sb2.append(", error=");
            sb2.append(maxErrorImpl2);
            sb2.append("), listener=");
            AbstractC1593a.u(sb2, this.adListener, oVar, str4);
        }
        t2.a(this.adListener, (MaxAd) this.f22036f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f22036f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f22041l = false;
        this.f22046q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f22036f, activity, this.localExtraParameters, this.extraParameters, this.f22033c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        if (((Boolean) this.sdk.a(y4.f23607H2)).booleanValue()) {
            List listB = y2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(f2.a(y2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(w3.a(y2Var, this.sdk)));
            this.sdk.q0().b(a5.f20947R, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, AbstractC1451o abstractC1451o) {
        a(str, str2);
        this.f22041l = true;
        this.f22046q = new WeakReference(activity);
        this.f22047r = new WeakReference(viewGroup);
        this.f22048s = new WeakReference(abstractC1451o);
        this.sdk.X().showFullscreenAd(this.f22036f, viewGroup, abstractC1451o, activity, this.localExtraParameters, this.extraParameters, this.f22033c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        c3 c3Var = this.f22036f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(c3Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            AbstractC1593a.u(sb2, this.adListener, oVar, str2);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f22037g == c.DESTROYED) {
            boolean zC = o7.c(this.sdk);
            this.sdk.D().a(d2.f21291S0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String strC = wg.b.c(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            o.h(this.tag, strC);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, strC);
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(x3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f22036f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f22036f);
            }
            return false;
        }
        Long l10 = (Long) this.sdk.a(r3.f22703a8);
        Long l11 = (Long) this.sdk.a(r3.f22698T7);
        if (l10.longValue() > 0 && (this.f22036f.getTimeToLiveMillis() < l11.longValue() || this.f22038h.get())) {
            this.f22039i.set(true);
            this.sdk.r0().a(new s6(this.sdk, "handleShowOnLoadTimeoutError", new e(this, str, 1)), e6.b.TIMEOUT, l10.longValue());
            return false;
        }
        if (o7.a(k.o()) != 0 && this.sdk.o0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!o7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(r3.f22716o8)).booleanValue()) {
                    o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (o.a()) {
                        o oVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb3.append(this.f22036f);
                        sb3.append(", error=");
                        sb3.append(maxErrorImpl2);
                        sb3.append("), listener=");
                        AbstractC1593a.u(sb3, this.adListener, oVar2, str3);
                    }
                    t2.a(this.adListener, (MaxAd) this.f22036f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f22036f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.H().d() && !this.sdk.H().c()) {
            return true;
        }
        o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (o.a()) {
            o oVar3 = this.logger;
            String str4 = this.tag;
            StringBuilder sb4 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb4.append(this.f22036f);
            sb4.append(", error=");
            sb4.append(maxErrorImpl3);
            sb4.append("), listener=");
            AbstractC1593a.u(sb4, this.adListener, oVar3, str4);
        }
        t2.a(this.adListener, (MaxAd) this.f22036f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f22036f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (this.sdk.R() != null) {
            return this.sdk.R().e(this.adUnitId);
        }
        return this.sdk.Q().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f22039i.compareAndSet(true, false)) {
            o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.H().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(x3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                AbstractC1593a.u(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f22036f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f22036f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f22034d.e(this.f22036f);
        this.f22036f.g(str);
        this.f22036f.f(str2);
        this.f22043n = str;
        this.f22044o = str2;
        this.f22045p = this.f22036f.getNetworkName();
        this.sdk.y().d(this.f22036f);
        if (o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f22036f + "...");
        }
        a((y2) this.f22036f);
    }

    private void a() {
        c3 c3Var;
        synchronized (this.f22035e) {
            c3Var = this.f22036f;
            this.f22036f = null;
        }
        this.sdk.X().destroyAd(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.k = l10.longValue() + this.k;
        this.sdk.q0().b(a5.f20948S, Long.valueOf(this.k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        if (this.sdk.f().a(c3Var, this)) {
            if (o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + c3Var);
            }
            this.f22036f = c3Var;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z2;
        c cVar2 = this.f22037g;
        synchronized (this.f22035e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar == c.LOADING || cVar == c.DESTROYED) {
                        z2 = true;
                    } else {
                        if (cVar == c.SHOWING) {
                            o.h(this.tag, "No ad is loading or loaded");
                        } else if (o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z2 = false;
                    }
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                o.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    o.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    o.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z2 = false;
                            }
                            z2 = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        o.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        o.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z2 = true;
                            } else if (cVar2 == c.DESTROYED) {
                                o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f22037g);
                            }
                            z2 = false;
                        }
                    }
                }
                if (z2) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f22037g + " to " + cVar + "...");
                    }
                    this.f22037g = cVar;
                } else if (o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.f22037g + " to " + cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((c3) maxAd);
        this.f22034d.a();
        a();
        this.sdk.a0().a((y2) maxAd);
    }
}
