package com.applovin.mediation.ads;

import A7.AbstractC0279p0;
import R8.v;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1451o;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference f24080b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f24081a;

    public MaxInterstitialAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f24081a.logApiCall("destroy()");
        this.f24081a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f24081a.logApiCall("getActivity()");
        return (Activity) f24080b.get();
    }

    public String getAdUnitId() {
        return this.f24081a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f24081a.isReady();
        this.f24081a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f24081a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f24081a.logApiCall("loadAd()");
        this.f24081a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f24081a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f24081a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f24081a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f24081a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f24081a.logApiCall(v.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f24081a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f24081a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f24081a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f24081a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f24081a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f24081a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f24081a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f24081a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f24081a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f24081a;
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f24080b = new WeakReference((Activity) context);
                }
                this.f24081a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f24081a;
        StringBuilder sbR = AbstractC0279p0.r("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbR.append(activity);
        sbR.append(")");
        maxFullscreenAdImpl.logApiCall(sbR.toString());
        o7.b(str2, "MaxInterstitialAd");
        this.f24081a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        showAd((String) null, viewGroup, abstractC1451o, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        showAd(str, null, viewGroup, abstractC1451o, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f24081a;
        StringBuilder sbR = AbstractC0279p0.r("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbR.append(viewGroup);
        sbR.append(", lifecycle=");
        sbR.append(abstractC1451o);
        sbR.append(", activity=");
        sbR.append(activity);
        sbR.append(")");
        maxFullscreenAdImpl.logApiCall(sbR.toString());
        this.f24081a.showAd(str, str2, viewGroup, abstractC1451o, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f24081a.logApiCall(v.g("showAd(placement=", str, ", customData=", str2, ")"));
        o7.b(str2, "MaxInterstitialAd");
        this.f24081a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, AbstractC1451o abstractC1451o) {
        showAd((String) null, viewGroup, abstractC1451o);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, AbstractC1451o abstractC1451o) {
        showAd(str, (String) null, viewGroup, abstractC1451o);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1451o abstractC1451o) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f24081a;
        StringBuilder sbR = AbstractC0279p0.r("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbR.append(viewGroup);
        sbR.append(", lifecycle=");
        sbR.append(abstractC1451o);
        sbR.append(")");
        maxFullscreenAdImpl.logApiCall(sbR.toString());
        this.f24081a.showAd(str, str2, viewGroup, abstractC1451o, getActivity());
    }
}
