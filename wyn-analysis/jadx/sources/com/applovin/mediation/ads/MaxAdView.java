package com.applovin.mediation.ads;

import R8.v;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC1660s;
import com.applovin.impl.f8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f24076a;

    /* renamed from: b, reason: collision with root package name */
    private View f24077b;

    /* renamed from: c, reason: collision with root package name */
    private int f24078c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i5, Context context) {
        View view = new View(context.getApplicationContext());
        this.f24077b = view;
        view.setBackgroundColor(0);
        addView(this.f24077b);
        this.f24077b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f24078c = getVisibility();
        this.f24076a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f24077b, context);
        setGravity(i5);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f24076a.logApiCall("destroy()");
        this.f24076a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f24076a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f24076a.getAdUnitId();
    }

    public String getPlacement() {
        this.f24076a.logApiCall("getPlacement()");
        return this.f24076a.getPlacement();
    }

    public void loadAd() {
        this.f24076a.logApiCall("loadAd()");
        this.f24076a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        if (isInEditMode()) {
            return;
        }
        this.f24076a.logApiCall("onWindowVisibilityChanged(visibility=" + i5 + ")");
        if (this.f24076a != null && f8.a(this.f24078c, i5)) {
            this.f24076a.onWindowVisibilityChanged(i5);
        }
        this.f24078c = i5;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f24076a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f24076a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f24076a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f24077b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        this.f24076a.logApiCall("setBackgroundColor(color=" + i5 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f24076a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i5);
        }
        View view = this.f24077b;
        if (view != null) {
            view.setBackgroundColor(i5);
        }
    }

    public void setCustomData(String str) {
        this.f24076a.logApiCall("setCustomData(value=" + str + ")");
        this.f24076a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f24076a.logApiCall(v.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f24076a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f24076a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f24076a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f24076a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f24076a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f24076a.logApiCall("setPlacement(placement=" + str + ")");
        this.f24076a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f24076a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f24076a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f24076a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f24076a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f24076a.logApiCall("startAutoRefresh()");
        this.f24076a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f24076a.logApiCall("stopAutoRefresh()");
        this.f24076a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f24076a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, AbstractC1660s.a(k.o()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration) {
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        a(str, maxAdFormat, maxAdViewConfiguration, 49, k.o());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i5) {
        MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i5);
        String strA = AbstractC1660s.a(context, attributeSet, AppLovinAdView.NAMESPACE, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
        String strA2 = AbstractC1660s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strA2)) {
            maxAdFormatA = MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = AbstractC1660s.a(context);
        }
        MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(strA, maxAdFormat, null, attributeIntValue, context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i5 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i5, i10);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, AbstractC1660s.a(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        a(str, maxAdFormat, null, 49, context);
    }
}
