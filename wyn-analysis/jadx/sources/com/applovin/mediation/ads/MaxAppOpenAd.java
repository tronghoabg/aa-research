package com.applovin.mediation.ads;

import R8.v;
import android.content.Context;
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

/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f24079a;

    public MaxAppOpenAd(String str) {
        this(str, k.o());
    }

    public void destroy() {
        this.f24079a.logApiCall("destroy()");
        this.f24079a.destroy();
    }

    public String getAdUnitId() {
        return this.f24079a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f24079a.isReady();
        this.f24079a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f24079a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f24079a.logApiCall("loadAd()");
        this.f24079a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f24079a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f24079a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f24079a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f24079a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f24079a.logApiCall(v.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f24079a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f24079a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f24079a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f24079a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f24079a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f24079a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f24079a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f24079a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f24079a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f24079a;
    }

    @Deprecated
    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    @Deprecated
    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, k.o());
    }

    public void showAd(String str, String str2) {
        this.f24079a.logApiCall(v.g("showAd(placement=", str, ", customData=", str2, ")"));
        o7.b(str2, "MaxAppOpenAd");
        this.f24079a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f24079a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}
