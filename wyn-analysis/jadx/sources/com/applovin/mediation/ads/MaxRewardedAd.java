package com.applovin.mediation.ads;

import A7.AbstractC0279p0;
import R8.v;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1451o;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f24082b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f24083c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f24084d = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxRewardedAdImpl f24085a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f24085a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, k.o());
    }

    public void destroy() {
        this.f24085a.logApiCall("destroy()");
        synchronized (f24083c) {
            f24082b.remove(this.f24085a.getAdUnitId());
        }
        this.f24085a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f24085a.logApiCall("getActivity()");
        return (Activity) f24084d.get();
    }

    public String getAdUnitId() {
        return this.f24085a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f24085a.isReady();
        this.f24085a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f24085a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f24085a.logApiCall("loadAd()");
        this.f24085a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f24085a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f24085a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f24085a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f24085a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f24085a.logApiCall(v.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f24085a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f24085a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f24085a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f24085a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f24085a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f24085a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f24085a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f24085a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f24085a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f24085a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f24084d = new WeakReference((Activity) context);
                }
                synchronized (f24083c) {
                    try {
                        Map map = f24082b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f24085a;
        StringBuilder sbR = AbstractC0279p0.r("showAd(placement=", str, ", customData=", str2, ", activity=");
        sbR.append(activity);
        sbR.append(")");
        maxRewardedAdImpl.logApiCall(sbR.toString());
        o7.b(str2, "MaxRewardedAd");
        this.f24085a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        showAd((String) null, viewGroup, abstractC1451o, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        showAd(str, null, viewGroup, abstractC1451o, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f24085a;
        StringBuilder sbR = AbstractC0279p0.r("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbR.append(viewGroup);
        sbR.append(", lifecycle=");
        sbR.append(abstractC1451o);
        sbR.append(", activity=");
        sbR.append(activity);
        sbR.append(")");
        maxRewardedAdImpl.logApiCall(sbR.toString());
        this.f24085a.showAd(str, str2, viewGroup, abstractC1451o, activity);
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
        this.f24085a.logApiCall(v.g("showAd(placement=", str, ", customData=", str2, ")"));
        o7.b(str2, "MaxRewardedAd");
        this.f24085a.showAd(str, str2, getActivity());
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
        MaxRewardedAdImpl maxRewardedAdImpl = this.f24085a;
        StringBuilder sbR = AbstractC0279p0.r("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbR.append(viewGroup);
        sbR.append(", lifecycle=");
        sbR.append(abstractC1451o);
        sbR.append(")");
        maxRewardedAdImpl.logApiCall(sbR.toString());
        this.f24085a.showAd(str, str2, viewGroup, abstractC1451o, getActivity());
    }
}
