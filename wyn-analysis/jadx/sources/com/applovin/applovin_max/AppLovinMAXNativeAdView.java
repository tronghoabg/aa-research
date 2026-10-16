package com.applovin.applovin_max;

import S8.b;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.plugin.platform.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.AbstractC3256n;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4280q;

/* loaded from: classes.dex */
public class AppLovinMAXNativeAdView implements e, MaxAdRevenueListener {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private MaxNativeAdLoader adLoader;
    private final String adUnitId;
    private View advertiserView;
    private View bodyView;
    private View callToActionView;
    private final C4281r channel;
    private final Context context;
    private final String customData;
    private final Map<String, Object> extraParameters;
    private ImageView iconView;
    private final Map<String, Object> localExtraParameters;
    private RelativeLayout mediaViewContainer;
    private MaxAd nativeAd;
    private final FrameLayout nativeAdView;
    private FrameLayout optionsViewContainer;
    private final String placement;
    private final AppLovinSdk sdk;
    private View titleView;
    private final AtomicBoolean isLoading = new AtomicBoolean();
    private final List<View> clickableViews = new ArrayList();

    public class NativeAdListener extends MaxNativeAdListener {
        private NativeAdListener() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AppLovinMAXNativeAdView.this.sendEvent("OnNativeAdClickedEvent", maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AppLovinMAXNativeAdView.this.handleAdLoadFailed("Failed to load native ad for Ad Unit ID " + str + " with error: " + maxError, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            AppLovinMAX.d("Native ad loaded: " + maxAd);
            if (maxNativeAdView != null) {
                AppLovinMAXNativeAdView.this.handleAdLoadFailed("Native ad is of template type, failing ad load...", null);
                return;
            }
            AppLovinMAXNativeAdView.this.maybeDestroyCurrentAd();
            AppLovinMAXNativeAdView.this.nativeAd = maxAd;
            AppLovinMAXNativeAdView.this.sendAdLoadedReactNativeEventForAd(maxAd.getNativeAd());
        }
    }

    public AppLovinMAXNativeAdView(int i5, String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, InterfaceC4269f interfaceC4269f, AppLovinSdk appLovinSdk, Context context) {
        this.adUnitId = str;
        this.placement = str2;
        this.customData = str3;
        this.sdk = appLovinSdk;
        this.context = context;
        this.extraParameters = map;
        this.localExtraParameters = map2;
        C4281r c4281r = new C4281r(interfaceC4269f, AbstractC3256n.g(i5, "applovin_max/nativeadview_"));
        this.channel = c4281r;
        c4281r.b(new b(this, 24));
        this.nativeAdView = new FrameLayout(context);
        loadAd();
    }

    private void addAdvertiserView(C4278o c4278o, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getAdvertiser() == null) {
            return;
        }
        if (this.advertiserView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.advertiserView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.advertiserView.setTag(8);
        this.clickableViews.add(this.advertiserView);
        updateViewLayout(this.nativeAdView, this.advertiserView, getRect(c4278o));
    }

    private void addBodyView(C4278o c4278o, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getBody() == null) {
            return;
        }
        if (this.bodyView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.bodyView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.bodyView.setTag(4);
        this.clickableViews.add(this.bodyView);
        updateViewLayout(this.nativeAdView, this.bodyView, getRect(c4278o));
    }

    private void addCallToActionView(C4278o c4278o, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getCallToAction() == null) {
            return;
        }
        if (this.callToActionView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.callToActionView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.callToActionView.setTag(5);
        this.clickableViews.add(this.callToActionView);
        updateViewLayout(this.nativeAdView, this.callToActionView, getRect(c4278o));
    }

    private void addIconView(C4278o c4278o, MaxAd maxAd) {
        if (maxAd == null) {
            return;
        }
        MaxNativeAd.MaxNativeAdImage icon = maxAd.getNativeAd().getIcon();
        ImageView imageView = (ImageView) maxAd.getNativeAd().getIconView();
        if (icon == null && imageView == null) {
            ImageView imageView2 = this.iconView;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
                return;
            }
            return;
        }
        if (this.iconView == null) {
            ImageView imageView3 = new ImageView(this.context);
            this.iconView = imageView3;
            this.nativeAdView.addView(imageView3);
        }
        this.iconView.setTag(3);
        this.clickableViews.add(this.iconView);
        updateViewLayout(this.nativeAdView, this.iconView, getRect(c4278o));
        if (icon == null) {
            if (imageView != null) {
                this.iconView.setImageDrawable(imageView.getDrawable());
            }
        } else if (icon.getUri() != null) {
            AppLovinSdkUtils.setImageUrl(icon.getUri().toString(), this.iconView, this.sdk);
        } else if (icon.getDrawable() != null) {
            this.iconView.setImageDrawable(icon.getDrawable());
        }
    }

    private void addMediaView(C4278o c4278o, MaxAd maxAd) {
        View mediaView;
        if (maxAd == null || (mediaView = maxAd.getNativeAd().getMediaView()) == null) {
            return;
        }
        if (this.mediaViewContainer == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.context);
            this.mediaViewContainer = relativeLayout;
            relativeLayout.setId(2);
            this.nativeAdView.addView(this.mediaViewContainer);
        }
        this.mediaViewContainer.setTag(2);
        this.clickableViews.add(this.mediaViewContainer);
        Rect rect = getRect(c4278o);
        if (mediaView.getParent() == null) {
            this.mediaViewContainer.addView(mediaView, new RelativeLayout.LayoutParams(-1, -1));
        }
        updateViewLayout(this.nativeAdView, this.mediaViewContainer, rect);
    }

    private void addOptionsView(C4278o c4278o, MaxAd maxAd) {
        View optionsView;
        if (maxAd == null || (optionsView = maxAd.getNativeAd().getOptionsView()) == null) {
            return;
        }
        if (this.optionsViewContainer == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.optionsViewContainer = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        if (optionsView.getParent() == null) {
            this.optionsViewContainer.addView(optionsView);
            optionsView.getLayoutParams().height = -1;
            optionsView.getLayoutParams().width = -1;
        }
        updateViewLayout(this.nativeAdView, this.optionsViewContainer, getRect(c4278o));
    }

    private void addTitleView(C4278o c4278o, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getTitle() == null) {
            return;
        }
        if (this.titleView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.titleView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.titleView.setTag(1);
        this.clickableViews.add(this.titleView);
        updateViewLayout(this.nativeAdView, this.titleView, getRect(c4278o));
    }

    private Rect getRect(C4278o c4278o) {
        int iIntValue = ((Integer) c4278o.a("x")).intValue();
        int iIntValue2 = ((Integer) c4278o.a("y")).intValue();
        return new Rect(iIntValue, iIntValue2, ((Integer) c4278o.a("width")).intValue() + iIntValue, ((Integer) c4278o.a("height")).intValue() + iIntValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdLoadFailed(String str, MaxError maxError) {
        this.isLoading.set(false);
        AppLovinMAX.e(str);
        AppLovinMAX.getInstance().fireCallback("OnNativeAdLoadFailedEvent", AppLovinMAX.getInstance().getAdLoadFailedInfo(this.adUnitId, maxError), this.channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        if ("addTitleView".equals(c4278o.f46759a)) {
            MaxAd maxAd = this.nativeAd;
            if (maxAd != null) {
                addTitleView(c4278o, maxAd);
            }
            interfaceC4280q.a(null);
            return;
        }
        String str = c4278o.f46759a;
        if ("addAdvertiserView".equals(str)) {
            MaxAd maxAd2 = this.nativeAd;
            if (maxAd2 != null) {
                addAdvertiserView(c4278o, maxAd2);
            }
            interfaceC4280q.a(null);
            return;
        }
        if ("addBodyView".equals(str)) {
            MaxAd maxAd3 = this.nativeAd;
            if (maxAd3 != null) {
                addBodyView(c4278o, maxAd3);
            }
            interfaceC4280q.a(null);
            return;
        }
        if ("addCallToActionView".equals(str)) {
            MaxAd maxAd4 = this.nativeAd;
            if (maxAd4 != null) {
                addCallToActionView(c4278o, maxAd4);
            }
            interfaceC4280q.a(null);
            return;
        }
        if ("addIconView".equals(str)) {
            MaxAd maxAd5 = this.nativeAd;
            if (maxAd5 != null) {
                addIconView(c4278o, maxAd5);
            }
            interfaceC4280q.a(null);
            return;
        }
        if ("addOptionsView".equals(str)) {
            MaxAd maxAd6 = this.nativeAd;
            if (maxAd6 != null) {
                addOptionsView(c4278o, maxAd6);
            }
            interfaceC4280q.a(null);
            return;
        }
        if ("addMediaView".equals(str)) {
            MaxAd maxAd7 = this.nativeAd;
            if (maxAd7 != null) {
                addMediaView(c4278o, maxAd7);
            }
            interfaceC4280q.a(null);
            return;
        }
        if ("renderAd".equals(str)) {
            MaxAd maxAd8 = this.nativeAd;
            if (maxAd8 != null) {
                renderAd(maxAd8);
            }
            interfaceC4280q.a(null);
            return;
        }
        if (!"loadAd".equals(str)) {
            interfaceC4280q.c();
        } else {
            loadAd();
            interfaceC4280q.a(null);
        }
    }

    private void loadAd() {
        if (!this.isLoading.compareAndSet(false, true)) {
            AppLovinMAX.e("Ignoring request to load native ad for Ad Unit ID " + this.adUnitId + ", another ad load in progress");
            return;
        }
        AppLovinMAX.d("Loading a native ad for Ad Unit ID: " + this.adUnitId + "...");
        MaxNativeAdLoader maxNativeAdLoader = this.adLoader;
        if (maxNativeAdLoader == null || !this.adUnitId.equals(maxNativeAdLoader.getAdUnitId())) {
            MaxNativeAdLoader maxNativeAdLoader2 = new MaxNativeAdLoader(this.adUnitId, this.sdk, this.context);
            this.adLoader = maxNativeAdLoader2;
            maxNativeAdLoader2.setRevenueListener(this);
            this.adLoader.setNativeAdListener(new NativeAdListener());
        }
        this.adLoader.setPlacement(this.placement);
        this.adLoader.setCustomData(this.customData);
        Map<String, Object> map = this.extraParameters;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.adLoader.setExtraParameter(entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, Object> map2 = this.localExtraParameters;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                this.adLoader.setLocalExtraParameter(entry2.getKey(), entry2.getValue());
            }
        }
        this.adLoader.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeDestroyCurrentAd() {
        if (this.nativeAd != null) {
            RelativeLayout relativeLayout = this.mediaViewContainer;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            FrameLayout frameLayout = this.optionsViewContainer;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.adLoader.destroy(this.nativeAd);
            this.nativeAd = null;
        }
        this.clickableViews.clear();
    }

    private void renderAd(MaxAd maxAd) {
        MaxNativeAdLoader maxNativeAdLoader;
        if (maxAd == null || (maxNativeAdLoader = this.adLoader) == null) {
            AppLovinMAX.e("Attempting to render ad before ad has been loaded for Ad Unit ID " + this.adUnitId);
        } else {
            maxNativeAdLoader.a(this.clickableViews, this.nativeAdView, maxAd);
            this.adLoader.b(maxAd);
        }
        this.isLoading.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAdLoadedReactNativeEventForAd(MaxNativeAd maxNativeAd) {
        HashMap map = new HashMap(10);
        map.put("title", maxNativeAd.getTitle());
        map.put("advertiser", maxNativeAd.getAdvertiser());
        map.put("body", maxNativeAd.getBody());
        map.put("callToAction", maxNativeAd.getCallToAction());
        if (maxNativeAd.getStarRating() != null) {
            map.put("starRating", maxNativeAd.getStarRating());
        }
        if (maxNativeAd.getMediaContentAspectRatio() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            map.put("mediaContentAspectRatio", Float.valueOf(maxNativeAd.getMediaContentAspectRatio()));
        }
        map.put("isIconImageAvailable", Boolean.valueOf((maxNativeAd.getIcon() == null && maxNativeAd.getIconView() == null) ? false : true));
        map.put("isOptionsViewAvailable", Boolean.valueOf(maxNativeAd.getOptionsView() != null));
        map.put("isMediaViewAvailable", Boolean.valueOf(maxNativeAd.getMediaView() != null));
        Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(this.nativeAd);
        adInfo.put("nativeAd", map);
        AppLovinMAX.getInstance().fireCallback("OnNativeAdLoadedEvent", adInfo, this.channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, MaxAd maxAd) {
        AppLovinMAX.getInstance().fireCallback(str, maxAd, this.channel);
    }

    private void updateViewLayout(ViewGroup viewGroup, View view, Rect rect) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        viewGroup.updateViewLayout(view, layoutParams);
    }

    @Override // io.flutter.plugin.platform.e
    public void dispose() {
        maybeDestroyCurrentAd();
        View view = this.titleView;
        if (view != null) {
            this.nativeAdView.removeView(view);
        }
        View view2 = this.advertiserView;
        if (view2 != null) {
            this.nativeAdView.removeView(view2);
        }
        View view3 = this.bodyView;
        if (view3 != null) {
            this.nativeAdView.removeView(view3);
        }
        View view4 = this.callToActionView;
        if (view4 != null) {
            this.nativeAdView.removeView(view4);
        }
        ImageView imageView = this.iconView;
        if (imageView != null) {
            this.nativeAdView.removeView(imageView);
        }
        MaxNativeAdLoader maxNativeAdLoader = this.adLoader;
        if (maxNativeAdLoader != null) {
            maxNativeAdLoader.destroy();
            this.adLoader = null;
        }
        C4281r c4281r = this.channel;
        if (c4281r != null) {
            c4281r.b(null);
        }
    }

    @Override // io.flutter.plugin.platform.e
    public View getView() {
        return this.nativeAdView;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        sendEvent("OnNativeAdRevenuePaidEvent", maxAd);
    }

    @Override // io.flutter.plugin.platform.e
    public void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.e
    public void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.e
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.e
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }
}
