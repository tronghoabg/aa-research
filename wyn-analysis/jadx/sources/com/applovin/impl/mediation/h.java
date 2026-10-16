package com.applovin.impl.mediation;

import A7.AbstractC0279p0;
import Va.M6;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1451o;
import com.applovin.impl.c3;
import com.applovin.impl.e5;
import com.applovin.impl.e6;
import com.applovin.impl.j5;
import com.applovin.impl.k3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.r3;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t4;
import com.applovin.impl.y2;
import com.applovin.impl.y4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22224b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22225c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22226d;

    /* renamed from: e, reason: collision with root package name */
    private final k3 f22227e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22228f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAdapter f22229g;

    /* renamed from: h, reason: collision with root package name */
    private String f22230h;

    /* renamed from: i, reason: collision with root package name */
    private y2 f22231i;

    /* renamed from: j, reason: collision with root package name */
    private View f22232j;
    private MaxNativeAd k;

    /* renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f22233l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f22234m;

    /* renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f22236o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f22240s;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f22223a = new Handler(Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    private final b f22235n = new b(this, null);

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f22237p = new AtomicBoolean(true);

    /* renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f22238q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f22239r = new AtomicBoolean(false);

    public class a implements MaxSignalCollectionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e5 f22241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t4 f22242b;

        public a(e5 e5Var, t4 t4Var) {
            this.f22241a = e5Var;
            this.f22242b = t4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f22241a.y() && TextUtils.isEmpty(str)) {
                this.f22242b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f22242b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f22242b.a(new MaxErrorImpl(str));
        }
    }

    public class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f22244a;

        private b() {
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        private void b(String str, Bundle bundle) {
            if (h.this.f22231i.w().compareAndSet(false, true)) {
                a(str, this.f22244a, new r(this, bundle, 2));
            }
        }

        private void c(String str, Bundle bundle) {
            if (!h.this.f22231i.w().get()) {
                h.this.f22239r.set(true);
                a(str, this.f22244a, new r(this, bundle, 0));
                return;
            }
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.b("MediationAdapterWrapper", h.this.f22228f + ": blocking ad loaded callback for " + h.this.f22231i + " since onAdHidden() has been called");
            }
            h.this.f22224b.t().a(h.this.f22231i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f22244a.a(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f22244a.a(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f22244a.a(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f22244a.c(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f22244a.c(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f22244a.e(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f22238q.compareAndSet(false, true)) {
                this.f22244a.f(h.this.f22231i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f22244a, new r(this, bundle, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f22244a, new t(this, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f22244a, new r(this, bundle, 9));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.f22232j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f22244a, new r(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f22244a, new r(this, bundle, 7));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": interstitial ad loaded with extra info: " + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f22244a, new r(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f22244a, new r(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.k("MediationAdapterWrapper", h.this.f22228f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.o unused = h.this.f22225c;
            if (com.applovin.impl.sdk.o.a()) {
                h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (h.this.f22231i instanceof c3) {
                c3 c3Var = (c3) h.this.f22231i;
                if (c3Var.m0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.o unused = h.this.f22225c;
                    if (com.applovin.impl.sdk.o.a()) {
                        h.this.f22225c.d("MediationAdapterWrapper", h.this.f22228f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f22244a, new u(this, c3Var, maxReward, bundle, 0));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f22244a.d(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f22244a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f22244a.a(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError) {
            if (h.this.f22231i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f22225c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f22225c.b("MediationAdapterWrapper", h.this.f22228f + ": blocking ad load failed callback for " + h.this.f22231i + " since onAdHidden() has been called");
                }
                h.this.f22224b.t().a(h.this.f22231i, str);
                return;
            }
            a(str, this.f22244a, new q(0, this, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f22238q.compareAndSet(false, true)) {
                this.f22244a.onAdLoadFailed(h.this.f22230h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (h.this.f22231i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f22225c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f22225c.b("MediationAdapterWrapper", h.this.f22228f + ": blocking ad displayed callback for " + h.this.f22231i + " since onAdHidden() has been called");
                }
                h.this.f22224b.t().a(h.this.f22231i, str);
                return;
            }
            if (!((Boolean) h.this.f22224b.a(r3.f22677B8)).booleanValue()) {
                if (h.this.f22231i.u().compareAndSet(false, true)) {
                    a(str, this.f22244a, new r(this, bundle, 6));
                    return;
                }
                return;
            }
            a(str, this.f22244a, new r(this, bundle, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, MaxError maxError, Bundle bundle) {
            if (h.this.f22231i.w().get()) {
                com.applovin.impl.sdk.o unused = h.this.f22225c;
                if (com.applovin.impl.sdk.o.a()) {
                    h.this.f22225c.b("MediationAdapterWrapper", h.this.f22228f + ": blocking ad display failed callback for " + h.this.f22231i + " since onAdHidden() has been called");
                }
                h.this.f22224b.t().a(h.this.f22231i, str);
                return;
            }
            a(str, this.f22244a, new s(this, maxError, bundle, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f22244a.a(h.this.f22231i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxReward maxReward, Bundle bundle) {
            this.f22244a.a(c3Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f22244a.a(h.this.f22231i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f22244a.onAdCollapsed(h.this.f22231i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            h.this.f22223a.post(new u(this, runnable, maxAdListener, str, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("MediationAdapterWrapper", N0.a.h("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                h.this.f22224b.D().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", h.this.f22227e.b()));
            }
        }
    }

    public static class c implements MaxAdapter.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f22246a;

        /* renamed from: b, reason: collision with root package name */
        private final k3 f22247b;

        /* renamed from: c, reason: collision with root package name */
        private final long f22248c;

        /* renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f22249d;

        public c(com.applovin.impl.sdk.k kVar, k3 k3Var, long j8, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f22246a = kVar;
            this.f22247b = k3Var;
            this.f22248c = j8;
            this.f22249d = onCompletionListener;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new s(this, initializationStatus, str, 1), this.f22247b.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f22246a.S().a(this.f22247b, SystemClock.elapsedRealtime() - this.f22248c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f22249d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    public class d extends j5 {

        /* renamed from: g, reason: collision with root package name */
        private final WeakReference f22250g;

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(y2 y2Var) {
            if (y2Var != null) {
                this.f21766a.Z().a(y2Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f22238q.get()) {
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, h.this.f22228f + " is timing out " + h.this.f22231i + "...");
            }
            b(h.this.f22231i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f22250g.get();
            if (bVar != null) {
                bVar.a(this.f21767b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f22224b);
            this.f22250g = new WeakReference(h.this.f22235n);
        }
    }

    public h(k3 k3Var, MaxAdapter maxAdapter, boolean z2, com.applovin.impl.sdk.k kVar) {
        if (k3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f22226d = k3Var.c();
        this.f22229g = maxAdapter;
        this.f22224b = kVar;
        this.f22225c = kVar.O();
        this.f22227e = k3Var;
        this.f22228f = maxAdapter.getClass().getSimpleName();
        this.f22240s = z2;
    }

    public String toString() {
        return wg.b.c(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f22228f, "'}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f22229g;
        if (maxAdapter != null) {
            this.f22229g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f22225c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f22228f + "' is already destroyed");
        }
        this.f22232j = null;
        this.k = null;
        this.f22233l = null;
        this.f22234m = null;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f22229g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f22226d, th);
            this.f22224b.D().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f22227e.b()));
            a("sdk_version");
            this.f22224b.T().a(this.f22227e.b(), "sdk_version", this.f22231i);
            return null;
        }
    }

    public boolean j() {
        return this.f22238q.get() && this.f22239r.get();
    }

    public boolean k() {
        return this.f22237p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f22229g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f22235n);
    }

    public MediationServiceImpl.b c() {
        return this.f22235n.f22244a;
    }

    public View d() {
        return this.f22232j;
    }

    public MaxNativeAd e() {
        return this.k;
    }

    public MaxNativeAdView f() {
        return this.f22233l;
    }

    public String g() {
        return this.f22226d;
    }

    public ViewGroup h() {
        return this.f22234m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f22229g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f22235n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f22229g).loadNativeAd(maxAdapterResponseParameters, activity, this.f22235n);
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        b(MobileAdsBridgeBase.initializeMethodName, new u(this, onCompletionListener, maxAdapterInitializationParameters, activity, 3));
    }

    public void b(y2 y2Var, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i5 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.o

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22282b;

                    {
                        this.f22282b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f22282b.a(activity);
                                break;
                            case 1:
                                this.f22282b.b(activity);
                                break;
                            default:
                                this.f22282b.c(activity);
                                break;
                        }
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i10 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.o

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22282b;

                    {
                        this.f22282b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f22282b.a(activity);
                                break;
                            case 1:
                                this.f22282b.b(activity);
                                break;
                            default:
                                this.f22282b.c(activity);
                                break;
                        }
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                final int i11 = 2;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.o

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22282b;

                    {
                        this.f22282b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f22282b.a(activity);
                                break;
                            case 1:
                                this.f22282b.b(activity);
                                break;
                            default:
                                this.f22282b.c(activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.o.a()) {
            this.f22225c.a("MediationAdapterWrapper", "Initializing " + this.f22228f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f22227e.r());
        }
        this.f22229g.initialize(maxAdapterInitializationParameters, activity, new c(this.f22224b, this.f22227e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.f22229g).showRewardedAd(this.f22236o, activity, this.f22235n);
    }

    public void a(String str, y2 y2Var) {
        this.f22230h = str;
        this.f22231i = y2Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f22233l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f22234m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.f22229g).showAppOpenAd(this.f22236o, activity, this.f22235n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, y2 y2Var, final Activity activity, MediationServiceImpl.b bVar) {
        Runnable uVar;
        if (y2Var != null) {
            if (!this.f22237p.get()) {
                String str2 = "Mediation adapter '" + this.f22228f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f22236o = maxAdapterResponseParameters;
            this.f22235n.a(bVar);
            MaxAdFormat format = y2Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                final int i5 = 0;
                uVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22285b;

                    {
                        this.f22285b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f22285b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f22285b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f22285b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f22285b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                final int i10 = 1;
                uVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22285b;

                    {
                        this.f22285b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f22285b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f22285b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f22285b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f22285b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                final int i11 = 2;
                uVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22285b;

                    {
                        this.f22285b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f22285b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f22285b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f22285b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f22285b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                final int i12 = 3;
                uVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22285b;

                    {
                        this.f22285b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f22285b.a(maxAdapterResponseParameters, activity);
                                break;
                            case 1:
                                this.f22285b.b(maxAdapterResponseParameters, activity);
                                break;
                            case 2:
                                this.f22285b.c(maxAdapterResponseParameters, activity);
                                break;
                            default:
                                this.f22285b.d(maxAdapterResponseParameters, activity);
                                break;
                        }
                    }
                };
            } else {
                if (format.isAdViewAd()) {
                    uVar = new u(this, maxAdapterResponseParameters, format, activity, 4);
                    a("load_ad", format, new s(this, y2Var, uVar, 3));
                    return;
                }
                throw new IllegalStateException("Failed to load " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a("load_ad", format, new s(this, y2Var, uVar, 3));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f22229g).showRewardedAd(this.f22236o, viewGroup, abstractC1451o, activity, this.f22235n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f22229g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f22226d, th);
            this.f22224b.D().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.f22227e.b()));
            a("adapter_version");
            this.f22224b.T().a(this.f22227e.b(), "adapter_version", this.f22231i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f22229g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f22235n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f22229g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f22235n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var, Runnable runnable) {
        a(this.f22227e, y2Var);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f22226d + " due to: " + th;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f22235n.a("load_ad", new MaxErrorImpl(-1, str));
            this.f22224b.D().a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.f22227e.b()));
            a("load_ad");
            this.f22224b.T().a(this.f22227e.b(), "load_ad", this.f22231i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.f22229g).showInterstitialAd(this.f22236o, activity, this.f22235n);
    }

    public void a(y2 y2Var, final ViewGroup viewGroup, final AbstractC1451o abstractC1451o, final Activity activity) {
        Runnable runnable;
        if (a(y2Var, activity)) {
            if (y2Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i5 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.n

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22277b;

                    {
                        this.f22277b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f22277b.a(viewGroup, abstractC1451o, activity);
                                break;
                            default:
                                this.f22277b.b(viewGroup, abstractC1451o, activity);
                                break;
                        }
                    }
                };
            } else if (y2Var.getFormat() == MaxAdFormat.REWARDED) {
                final int i10 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.n

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f22277b;

                    {
                        this.f22277b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f22277b.a(viewGroup, abstractC1451o, activity);
                                break;
                            default:
                                this.f22277b.b(viewGroup, abstractC1451o, activity);
                                break;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + y2Var + ": " + y2Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f22229g).showInterstitialAd(this.f22236o, viewGroup, abstractC1451o, activity, this.f22235n);
    }

    private boolean a(y2 y2Var, Activity activity) {
        if (y2Var != null) {
            if (y2Var.A() == null) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f22235n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (y2Var.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != y2Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f22237p.get()) {
                    String str = "Mediation adapter '" + this.f22228f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
                    this.f22235n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(wg.b.c(new StringBuilder("Mediation adapter '"), this.f22228f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(Runnable runnable, y2 y2Var) {
        a("show_ad", y2Var.getFormat(), new q(4, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f22226d + " due to: " + th;
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", str);
            this.f22235n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f22224b.D().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f22227e.b()));
            a("show_ad");
            this.f22224b.T().a(this.f22227e.b(), "show_ad", this.f22231i);
        }
    }

    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, e5 e5Var, Activity activity, t4 t4Var) {
        if (t4Var != null) {
            if (!this.f22237p.get()) {
                com.applovin.impl.sdk.o.h("MediationAdapterWrapper", "Mediation adapter '" + this.f22228f + "' is disabled. Signal collection ads with this adapter is disabled.");
                t4Var.a(new MaxErrorImpl(wg.b.c(new StringBuilder("The adapter ("), this.f22228f, ") is disabled")));
                return;
            }
            MaxAdapter maxAdapter = this.f22229g;
            if (maxAdapter instanceof MaxSignalProvider) {
                b("collect_signal", new Uc.d(this, (MaxSignalProvider) maxAdapter, maxAdapterSignalCollectionParameters, activity, e5Var, t4Var, 4));
                return;
            } else {
                t4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, wg.b.c(new StringBuilder("The adapter ("), this.f22228f, ") does not support signal collection")));
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, e5 e5Var, t4 t4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(e5Var, t4Var));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f22226d + " due to: " + th);
            com.applovin.impl.sdk.o.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            t4Var.a(maxErrorImpl);
            this.f22224b.D().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f22227e.b()));
            a("collect_signal");
            this.f22224b.T().a(this.f22227e.b(), "collect_signal", this.f22231i);
        }
        if (!t4Var.c() && e5Var.m() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f22225c.a("MediationAdapterWrapper", "Failing signal collection " + e5Var + " since it has 0 timeout");
            }
            t4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, wg.b.c(new StringBuilder("The adapter ("), this.f22228f, ") has 0 timeout")));
        }
    }

    public void a() {
        if (this.f22240s) {
            return;
        }
        b("destroy", new t(this, 1));
    }

    private void a(k3 k3Var, y2 y2Var) {
        a(new d(this, null), k3Var, y2Var);
    }

    private void a(j5 j5Var, k3 k3Var, y2 y2Var) {
        long jM = k3Var.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f22225c;
                StringBuilder sb2 = new StringBuilder("Non-positive timeout set for ");
                if (y2Var != null) {
                    k3Var = y2Var;
                }
                sb2.append(k3Var);
                sb2.append(", not scheduling a timeout");
                oVar.a("MediationAdapterWrapper", sb2.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar2 = this.f22225c;
            StringBuilder sbU = M6.u(jM, "Setting timeout ", "ms for ");
            if (y2Var != null) {
                k3Var = y2Var;
            }
            sbU.append(k3Var);
            oVar2.a("MediationAdapterWrapper", sbU.toString());
        }
        this.f22224b.r0().a(j5Var, e6.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f22225c.d("MediationAdapterWrapper", M6.t(new StringBuilder("Marking "), this.f22228f, " as disabled due to: ", str));
        }
        this.f22237p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        s sVar = new s(this, str, runnable, 2);
        if (a(str, maxAdFormat)) {
            this.f22223a.post(sVar);
            return;
        }
        StringBuilder sbQ = AbstractC0279p0.q(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sbQ.append(this.f22227e.c());
        s6 s6Var = new s6(this.f22224b, sbQ.toString(), sVar);
        if (((Boolean) this.f22224b.a(y4.f23743Z)).booleanValue()) {
            this.f22224b.r0().a(s6Var, this.f22227e);
        } else {
            this.f22224b.r0().a(s6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f22225c.a("MediationAdapterWrapper", this.f22228f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.o.a()) {
                this.f22225c.a("MediationAdapterWrapper", this.f22228f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Failed operation ", str, " for ");
            sbW.append(this.f22226d);
            com.applovin.impl.sdk.o.c("MediationAdapterWrapper", sbW.toString(), th);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.f22224b.T().a(this.f22227e.b(), str, this.f22231i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f22227e.b(), mapHashMap);
            this.f22224b.D().a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolZ;
        Boolean boolB0;
        Boolean boolA0;
        MaxAdapter maxAdapter = this.f22229g;
        if (maxAdapter == null) {
            return this.f22227e.r();
        }
        if (MobileAdsBridgeBase.initializeMethodName.equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            y2 y2Var = this.f22231i;
            if (y2Var != null && (boolA0 = y2Var.a0()) != null) {
                return boolA0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            y2 y2Var2 = this.f22231i;
            if (y2Var2 != null && (boolB0 = y2Var2.b0()) != null) {
                return boolB0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            y2 y2Var3 = this.f22231i;
            if (y2Var3 != null && (boolZ = y2Var3.Z()) != null) {
                return boolZ.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f22227e.r();
    }
}
