package com.applovin.mediation.adapters;

import D6.P0;
import D6.e1;
import H6.l;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbmp;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.AbstractC3256n;
import x6.AbstractC4480k;
import x6.C4470a;
import x6.C4474e;
import x6.C4476g;
import x6.C4477h;
import x6.C4481l;
import x6.EnumC4471b;
import x6.InterfaceC4482m;
import x6.t;
import z6.AbstractC4618a;
import z6.AbstractC4619b;

/* loaded from: classes.dex */
public class GoogleMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxAppOpenAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxNativeAdAdapter {
    private static final String ADAPTIVE_BANNER_TYPE_INLINE = "inline";
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private C4477h adView;
    private AbstractC4619b appOpenAd;
    private AppOpenAdListener appOpenAdListener;
    private I6.a interstitialAd;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private R6.c rewardedAd;
    private RewardedAdListener rewardedAdListener;

    public class AdViewListener extends AdListener {
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;

        public AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter.this.log(this.adFormat.getLabel() + " ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(C4481l c4481l) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(c4481l);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            AbstractC1593a.r(this.adFormat, sb2, " ad (");
            sb2.append(this.placementId);
            sb2.append(") failed to load with error code: ");
            sb2.append(maxError);
            googleMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            AbstractC1593a.r(this.adFormat, sb2, " ad shown: ");
            sb2.append(this.placementId);
            googleMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            AbstractC1593a.r(this.adFormat, sb2, " ad loaded: ");
            sb2.append(this.placementId);
            googleMediationAdapter.log(sb2.toString());
            Bundle bundle = new Bundle(3);
            t responseInfo = GoogleMediationAdapter.this.adView.getResponseInfo();
            String strB = responseInfo != null ? responseInfo.b() : null;
            if (AppLovinSdkUtils.isValidString(strB)) {
                bundle.putString("creative_id", strB);
            }
            AdSize adSize = GoogleMediationAdapter.this.adView.getAdSize();
            if (adSize != null) {
                bundle.putInt("ad_width", adSize.f26293a);
                bundle.putInt("ad_height", adSize.f26294b);
            }
            this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.adView, bundle);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter.this.log(this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdClicked();
        }
    }

    public class AppOpenAdListener extends AbstractC4480k {
        private final MaxAppOpenAdapterListener listener;
        private final String placementId;

        public AppOpenAdListener(String str, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.placementId = str;
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // x6.AbstractC4480k
        public void onAdClicked() {
            GoogleMediationAdapter.this.log("App open ad clicked: " + this.placementId);
            this.listener.onAppOpenAdClicked();
        }

        @Override // x6.AbstractC4480k
        public void onAdDismissedFullScreenContent() {
            GoogleMediationAdapter.this.log("App open ad hidden: " + this.placementId);
            this.listener.onAppOpenAdHidden();
        }

        @Override // x6.AbstractC4480k
        public void onAdFailedToShowFullScreenContent(C4470a c4470a) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, c4470a.a(), c4470a.f47721b);
            GoogleMediationAdapter.this.log("App open ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // x6.AbstractC4480k
        public void onAdImpression() {
            GoogleMediationAdapter.this.log("App open ad impression recorded: " + this.placementId);
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // x6.AbstractC4480k
        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter.this.log("App open ad shown: " + this.placementId);
        }
    }

    public static class AutoMeasuringMediaView extends MediaView {
        public AutoMeasuringMediaView(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$requestLayout$0() {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getLeft(), getTop(), getRight(), getBottom());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            requestLayout();
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            super.requestLayout();
            post(new a(this, 1));
        }
    }

    public class InterstitialAdListener extends AbstractC4480k {
        private final MaxInterstitialAdapterListener listener;
        private final String placementId;

        public InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.placementId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // x6.AbstractC4480k
        public void onAdClicked() {
            GoogleMediationAdapter.this.log("Interstitial ad clicked: " + this.placementId);
            this.listener.onInterstitialAdClicked();
        }

        @Override // x6.AbstractC4480k
        public void onAdDismissedFullScreenContent() {
            GoogleMediationAdapter.this.log("Interstitial ad hidden: " + this.placementId);
            this.listener.onInterstitialAdHidden();
        }

        @Override // x6.AbstractC4480k
        public void onAdFailedToShowFullScreenContent(C4470a c4470a) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, c4470a.a(), c4470a.f47721b);
            GoogleMediationAdapter.this.log("Interstitial ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // x6.AbstractC4480k
        public void onAdImpression() {
            GoogleMediationAdapter.this.log("Interstitial ad impression recorded: " + this.placementId);
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // x6.AbstractC4480k
        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter.this.log("Interstitial ad shown: " + this.placementId);
        }
    }

    public class MaxGoogleNativeAd extends MaxNativeAd {
        public MaxGoogleNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            MediaView mediaView;
            InterfaceC4482m mediaContent;
            NativeAd nativeAd = GoogleMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                GoogleMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            GoogleMediationAdapter.this.nativeAdView = new NativeAdView(viewGroup.getContext());
            if (viewGroup instanceof MaxNativeAdView) {
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                View mainView = maxNativeAdView.getMainView();
                maxNativeAdView.removeView(mainView);
                GoogleMediationAdapter.this.nativeAdView.addView(mainView);
                maxNativeAdView.addView(GoogleMediationAdapter.this.nativeAdView);
                GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
                GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                GoogleMediationAdapter.this.nativeAdView.setAdvertiserView(maxNativeAdView.getAdvertiserTextView());
                GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                View mediaView2 = getMediaView();
                if (mediaView2 instanceof MediaView) {
                    GoogleMediationAdapter.this.nativeAdView.setMediaView((MediaView) mediaView2);
                } else if (mediaView2 instanceof ImageView) {
                    GoogleMediationAdapter.this.nativeAdView.setImageView(mediaView2);
                }
                GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
            } else {
                View autoMeasuringMediaView = null;
                for (View view : list) {
                    Object tag = view.getTag();
                    if (tag != null) {
                        int iIntValue = ((Integer) tag).intValue();
                        if (iIntValue == 1) {
                            GoogleMediationAdapter.this.nativeAdView.setHeadlineView(view);
                        } else if (iIntValue == 3) {
                            GoogleMediationAdapter.this.nativeAdView.setIconView(view);
                        } else if (iIntValue == 4) {
                            GoogleMediationAdapter.this.nativeAdView.setBodyView(view);
                        } else if (iIntValue == 5) {
                            GoogleMediationAdapter.this.nativeAdView.setCallToActionView(view);
                        } else if (iIntValue == 8) {
                            GoogleMediationAdapter.this.nativeAdView.setAdvertiserView(view);
                        } else if (iIntValue == 2) {
                            autoMeasuringMediaView = getMediaView();
                        }
                    }
                }
                if (autoMeasuringMediaView != null) {
                    viewGroup = (ViewGroup) autoMeasuringMediaView.getParent();
                }
                if (viewGroup == null) {
                    return true;
                }
                boolean z2 = (viewGroup instanceof RelativeLayout) || (viewGroup instanceof FrameLayout);
                if (autoMeasuringMediaView != null) {
                    viewGroup.removeView(autoMeasuringMediaView);
                    if (!z2 && (autoMeasuringMediaView instanceof MediaView) && (mediaContent = (mediaView = (MediaView) autoMeasuringMediaView).getMediaContent()) != null && ((e1) mediaContent).a()) {
                        autoMeasuringMediaView = new AutoMeasuringMediaView(viewGroup.getContext());
                        mediaView.setMediaContent(nativeAd.getMediaContent());
                    }
                    GoogleMediationAdapter.this.nativeAdView.addView(autoMeasuringMediaView, new ViewGroup.LayoutParams(-1, -1));
                    if (autoMeasuringMediaView instanceof MediaView) {
                        GoogleMediationAdapter.this.nativeAdView.setMediaView((MediaView) autoMeasuringMediaView);
                    } else if (autoMeasuringMediaView instanceof ImageView) {
                        GoogleMediationAdapter.this.nativeAdView.setImageView((ImageView) autoMeasuringMediaView);
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    View view2 = new View(viewGroup.getContext());
                    GoogleMediationAdapter.this.nativeAdView.addView(view2, layoutParams);
                    GoogleMediationAdapter.this.nativeAdView.setStoreView(view2);
                }
                GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                if (z2) {
                    viewGroup.addView(GoogleMediationAdapter.this.nativeAdView, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    GoogleMediationAdapter.this.nativeAdView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 1073741824));
                    GoogleMediationAdapter.this.nativeAdView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                    viewGroup.addView(GoogleMediationAdapter.this.nativeAdView);
                }
            }
            return true;
        }
    }

    public class NativeAdListener extends AdListener implements com.google.android.gms.ads.nativead.d {
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter.this.log("Native ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(C4481l c4481l) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(c4481l);
            GoogleMediationAdapter.this.log("Native ad (" + this.placementId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter.this.log("Native ad opened");
        }

        @Override // com.google.android.gms.ads.nativead.d
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleMediationAdapter.this.log("Native ad loaded: " + this.placementId);
            GoogleMediationAdapter.this.nativeAd = nativeAd;
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(nativeAd.getHeadline())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.NativeAdListener.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void run() {
                        /*
                            Method dump skipped, instructions count: 268
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.GoogleMediationAdapter.NativeAdListener.AnonymousClass1.run():void");
                    }
                });
                return;
            }
            GoogleMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
        }
    }

    public class NativeAdViewListener extends AdListener implements com.google.android.gms.ads.nativead.d {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        public NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad closed");
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(C4481l c4481l) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(c4481l);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            AbstractC1593a.r(this.adFormat, sb2, " ad (");
            sb2.append(this.placementId);
            sb2.append(") failed to load with error: ");
            sb2.append(maxError);
            googleMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad shown");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.google.android.gms.ads.nativead.d
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            AbstractC1593a.r(this.adFormat, sb2, " ad loaded: ");
            sb2.append(this.placementId);
            googleMediationAdapter.log(sb2.toString());
            GoogleMediationAdapter.this.nativeAd = nativeAd;
            final Context context = GoogleMediationAdapter.this.getContext(this.activityRef.get());
            final MediaView mediaView = new MediaView(context);
            InterfaceC4482m mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null) {
                mediaView.setMediaContent(mediaContent);
            }
            com.google.android.gms.ads.nativead.c icon = nativeAd.getIcon();
            final MaxNativeAd maxNativeAdBuild = new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(nativeAd.getHeadline()).setBody(nativeAd.getBody()).setCallToAction(nativeAd.getCallToAction()).setIcon(icon != null ? icon.getDrawable() != null ? new MaxNativeAd.MaxNativeAdImage(icon.getDrawable()) : new MaxNativeAd.MaxNativeAdImage(icon.getUri()) : null).setMediaView(mediaView).build();
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAdBuild, BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters), context);
                    GoogleMediationAdapter.this.nativeAdView = new NativeAdView(context);
                    GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
                    GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                    GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                    GoogleMediationAdapter.this.nativeAdView.setMediaView(mediaView);
                    GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                    GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                    GoogleMediationAdapter.this.nativeAdView.addView(maxNativeAdView);
                    t responseInfo = nativeAd.getResponseInfo();
                    String strB = responseInfo != null ? responseInfo.b() : null;
                    if (!AppLovinSdkUtils.isValidString(strB)) {
                        NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                        nativeAdViewListener.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView);
                    } else {
                        Bundle bundle = new Bundle(1);
                        bundle.putString("creative_id", strB);
                        NativeAdViewListener nativeAdViewListener2 = NativeAdViewListener.this;
                        nativeAdViewListener2.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView, bundle);
                    }
                }
            });
        }
    }

    public class RewardedAdListener extends AbstractC4480k {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final String placementId;

        public RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.placementId = str;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // x6.AbstractC4480k
        public void onAdClicked() {
            GoogleMediationAdapter.this.log("Rewarded ad clicked: " + this.placementId);
            this.listener.onRewardedAdClicked();
        }

        @Override // x6.AbstractC4480k
        public void onAdDismissedFullScreenContent() {
            if (this.hasGrantedReward || GoogleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = GoogleMediationAdapter.this.getReward();
                GoogleMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            GoogleMediationAdapter.this.log("Rewarded ad hidden: " + this.placementId);
            this.listener.onRewardedAdHidden();
        }

        @Override // x6.AbstractC4480k
        public void onAdFailedToShowFullScreenContent(C4470a c4470a) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, c4470a.a(), c4470a.f47721b);
            GoogleMediationAdapter.this.log("Rewarded ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // x6.AbstractC4480k
        public void onAdImpression() {
            GoogleMediationAdapter.this.log("Rewarded ad impression recorded: " + this.placementId);
            this.listener.onRewardedAdDisplayed();
        }

        @Override // x6.AbstractC4480k
        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter.this.log("Rewarded ad shown: " + this.placementId);
        }
    }

    public GoogleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private C4476g createAdRequestWithParameters(boolean z2, MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters, Context context) {
        boolean zEqualsIgnoreCase;
        AdRequest$Builder adRequest$Builder = new AdRequest$Builder(14);
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        Bundle bundle = new Bundle(6);
        if (z2) {
            zEqualsIgnoreCase = "dv360".equalsIgnoreCase(BundleUtils.getString("bidder", "", serverParameters));
            bundle.putString("query_info_type", zEqualsIgnoreCase ? "requester_type_3" : "requester_type_2");
            if (maxAdFormat.isAdViewAd()) {
                Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner");
                if ((obj instanceof String) && "true".equalsIgnoreCase((String) obj)) {
                    AdSize adSize = toAdSize(maxAdFormat, true, maxAdapterParameters, context);
                    if (isInlineAdaptiveBanner(maxAdapterParameters)) {
                        int inlineAdaptiveBannerMaxHeight = getInlineAdaptiveBannerMaxHeight(maxAdapterParameters);
                        if (inlineAdaptiveBannerMaxHeight <= 0) {
                            inlineAdaptiveBannerMaxHeight = adSize.f26294b;
                        }
                        bundle.putInt("inlined_adaptive_banner_w", adSize.f26293a);
                        bundle.putInt("inlined_adaptive_banner_h", inlineAdaptiveBannerMaxHeight);
                    } else {
                        bundle.putInt("adaptive_banner_w", adSize.f26293a);
                        bundle.putInt("adaptive_banner_h", adSize.f26294b);
                    }
                }
            }
            if (maxAdapterParameters instanceof MaxAdapterResponseParameters) {
                String bidResponse = ((MaxAdapterResponseParameters) maxAdapterParameters).getBidResponse();
                if (AppLovinSdkUtils.isValidString(bidResponse)) {
                    ((P0) adRequest$Builder.f421a).f2355m = bidResponse;
                }
            }
        } else {
            zEqualsIgnoreCase = false;
        }
        adRequest$Builder.V(zEqualsIgnoreCase ? "applovin_dv360" : "applovin");
        String string = BundleUtils.getString("event_id", serverParameters);
        if (AppLovinSdkUtils.isValidString(string)) {
            bundle.putString("placement_req_id", string);
        }
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null && !boolHasUserConsent.booleanValue()) {
            bundle.putString("npa", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell == null || !boolIsDoNotSell.booleanValue()) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove("gad_rdp").apply();
        } else {
            bundle.putInt("rdp", 1);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("gad_rdp", 1).apply();
        }
        Map<String, Object> localExtraParameters = maxAdapterParameters.getLocalExtraParameters();
        Object obj2 = localExtraParameters.get("google_max_ad_content_rating");
        if (obj2 instanceof String) {
            bundle.putString("max_ad_content_rating", (String) obj2);
        }
        Object obj3 = localExtraParameters.get("google_content_url");
        if (obj3 instanceof String) {
            adRequest$Builder.T((String) obj3);
        }
        Object obj4 = localExtraParameters.get("google_neighbouring_content_url_strings");
        if (obj4 instanceof List) {
            try {
                adRequest$Builder.U((List) obj4);
            } catch (Throwable th) {
                e("Neighbouring content URL strings extra param needs to be of type List<String>.", th);
            }
        }
        adRequest$Builder.x(AdMobAdapter.class, bundle);
        return new C4476g(adRequest$Builder);
    }

    private int getAdChoicesPlacement(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        Object obj = localExtraParameters != null ? localExtraParameters.get("admob_ad_choices_placement") : null;
        if (isValidAdChoicesPlacement(obj)) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    private AdSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveBannerWidth = getAdaptiveBannerWidth(maxAdapterParameters, context);
        if (isInlineAdaptiveBanner(maxAdapterParameters)) {
            int inlineAdaptiveBannerMaxHeight = getInlineAdaptiveBannerMaxHeight(maxAdapterParameters);
            return inlineAdaptiveBannerMaxHeight > 0 ? AdSize.d(adaptiveBannerWidth, inlineAdaptiveBannerMaxHeight) : AdSize.b(context, adaptiveBannerWidth);
        }
        AdSize adSize = AdSize.f26288i;
        AdSize adSizeK = H6.f.k(context, adaptiveBannerWidth, 0);
        adSizeK.f26296d = true;
        return adSizeK;
    }

    private int getAdaptiveBannerWidth(MaxAdapterParameters maxAdapterParameters, Context context) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_width");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj != null) {
            e("Expected parameter \"adaptive_banner_width\" to be of type Integer, received: " + obj.getClass());
        }
        return AppLovinSdkUtils.pxToDp(context, getApplicationWindowWidth(context));
    }

    public static int getApplicationWindowWidth(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private int getInlineAdaptiveBannerMaxHeight(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("inline_adaptive_banner_max_height");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private boolean isAdaptiveAdFormat(MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters) {
        return (maxAdFormat == MaxAdFormat.MREC && isInlineAdaptiveBanner(maxAdapterParameters)) || maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER;
    }

    private boolean isInlineAdaptiveBanner(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_type");
        return (obj instanceof String) && ADAPTIVE_BANNER_TYPE_INLINE.equalsIgnoreCase((String) obj);
    }

    private boolean isValidAdChoicesPlacement(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        Integer num = (Integer) obj;
        return num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(MaxAdapter.OnCompletionListener onCompletionListener, InitializationStatus initializationStatus) {
        AdapterStatus adapterStatus = initializationStatus.getAdapterStatusMap().get("com.google.android.gms.ads.MobileAds");
        AdapterStatus.State initializationState = adapterStatus != null ? adapterStatus.getInitializationState() : null;
        log("Initialization complete with status " + initializationState);
        MaxAdapter.InitializationStatus initializationStatus2 = AdapterStatus.State.READY == initializationState ? MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS : MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
        status = initializationStatus2;
        onCompletionListener.onCompletion(initializationStatus2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showRewardedAd$1(String str, R6.b bVar) {
        log("Rewarded ad user earned reward: " + str);
        this.rewardedAdListener.hasGrantedReward = true;
    }

    private EnumC4471b toAdFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (maxAdapterSignalCollectionParameters.getServerParameters().getBoolean("is_native") || adFormat == MaxAdFormat.NATIVE) {
            return EnumC4471b.NATIVE;
        }
        if (adFormat.isAdViewAd()) {
            return EnumC4471b.BANNER;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return EnumC4471b.INTERSTITIAL;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return EnumC4471b.REWARDED;
        }
        if (adFormat == MaxAdFormat.APP_OPEN) {
            return EnumC4471b.APP_OPEN_AD;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + adFormat);
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat, boolean z2, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (z2 && isAdaptiveAdFormat(maxAdFormat, maxAdapterParameters)) {
            return getAdaptiveAdSize(maxAdapterParameters, context);
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.f26288i;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.f26289j;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.k;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(x6.C4470a r3) {
        /*
            int r0 = r3.a()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            if (r0 == 0) goto L21
            r2 = 1
            if (r0 == r2) goto L1e
            r2 = 2
            if (r0 == r2) goto L1b
            r2 = 3
            if (r0 == r2) goto L18
            switch(r0) {
                case 8: goto L15;
                case 9: goto L18;
                case 10: goto L1e;
                case 11: goto L15;
                default: goto L14;
            }
        L14:
            goto L23
        L15:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
            goto L23
        L18:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L23
        L1b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L23
        L1e:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.BAD_REQUEST
            goto L23
        L21:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
        L23:
            com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
            java.lang.String r3 = r3.f47721b
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.GoogleMediationAdapter.toMaxError(x6.a):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private static void updateMuteState(Bundle bundle) {
        if (bundle.containsKey("is_muted")) {
            MobileAds.setAppMuted(bundle.getBoolean("is_muted"));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        Context context = getContext(activity);
        Q6.a.a(context, toAdFormat(maxAdapterSignalCollectionParameters), createAdRequestWithParameters(true, maxAdapterSignalCollectionParameters.getAdFormat(), maxAdapterSignalCollectionParameters, context), new Q6.b() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.1
            @Override // Q6.b
            public void onFailure(String str) {
                GoogleMediationAdapter.this.log("Signal collection failed with error: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }

            @Override // Q6.b
            public void onSuccess(Q6.a aVar) {
                GoogleMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(aVar.f9884a.f2412a);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return "25.3.0.0";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return String.valueOf(MobileAds.getVersion());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        log("Initializing Google SDK...");
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        Context context = getContext(activity);
        MobileAds.disableMediationAdapterInitialization(context);
        if (!maxAdapterInitializationParameters.getServerParameters().getBoolean("init_without_callback", false)) {
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            MobileAds.initialize(context, new OnInitializationCompleteListener() { // from class: com.applovin.mediation.adapters.b
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    this.f24056a.lambda$initialize$0(onCompletionListener, initializationStatus);
                }
            });
        } else {
            status = MaxAdapter.InitializationStatus.DOES_NOT_APPLY;
            MobileAds.initialize(context);
            onCompletionListener.onCompletion(status, null);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        boolean z2 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append(z2 ? "native " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for placement id: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        Context context = getContext(activity);
        C4476g c4476gCreateAdRequestWithParameters = createAdRequestWithParameters(zIsValidString, maxAdFormat, maxAdapterResponseParameters, context);
        if (!z2) {
            C4477h c4477h = new C4477h(context);
            this.adView = c4477h;
            c4477h.setAdUnitId(thirdPartyAdPlacementId);
            this.adView.setAdListener(new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener));
            this.adView.setAdSize(toAdSize(maxAdFormat, maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false), maxAdapterResponseParameters, context));
            this.adView.b(c4476gCreateAdRequestWithParameters);
            return;
        }
        int adChoicesPlacement = getAdChoicesPlacement(maxAdapterResponseParameters);
        boolean z10 = maxAdFormat == MaxAdFormat.MREC;
        NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener);
        C4474e c4474e = new C4474e(context, thirdPartyAdPlacementId);
        try {
            c4474e.f47733b.zzj(new zzbma(4, false, -1, z10, adChoicesPlacement, null, false, 0, 0, false, 1 - 1));
        } catch (RemoteException e7) {
            l.g("Failed to specify native ad options", e7);
        }
        c4474e.b(nativeAdViewListener);
        c4474e.c(nativeAdViewListener);
        c4474e.a().a(c4476gCreateAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(AbstractC3256n.h(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "app open ad: ", thirdPartyAdPlacementId, "..."));
        updateMuteState(maxAdapterResponseParameters.getServerParameters());
        Context context = getContext(activity);
        AbstractC4619b.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.APP_OPEN, maxAdapterResponseParameters, context), new AbstractC4618a() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.3
            @Override // x6.AbstractC4473d
            public void onAdFailedToLoad(C4481l c4481l) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(c4481l);
                GoogleMediationAdapter.this.log("App open ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxAppOpenAdapterListener.onAppOpenAdLoadFailed(maxError);
            }

            @Override // x6.AbstractC4473d
            public void onAdLoaded(AbstractC4619b abstractC4619b) {
                GoogleMediationAdapter.this.log("App open ad loaded: " + thirdPartyAdPlacementId + "...");
                GoogleMediationAdapter.this.appOpenAd = abstractC4619b;
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.appOpenAdListener = googleMediationAdapter.new AppOpenAdListener(thirdPartyAdPlacementId, maxAppOpenAdapterListener);
                abstractC4619b.setFullScreenContentCallback(GoogleMediationAdapter.this.appOpenAdListener);
                t responseInfo = GoogleMediationAdapter.this.appOpenAd.getResponseInfo();
                String strB = responseInfo != null ? responseInfo.b() : null;
                if (!AppLovinSdkUtils.isValidString(strB)) {
                    maxAppOpenAdapterListener.onAppOpenAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", strB);
                maxAppOpenAdapterListener.onAppOpenAdLoaded(bundle);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(AbstractC3256n.h(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "interstitial ad: ", thirdPartyAdPlacementId, "..."));
        updateMuteState(maxAdapterResponseParameters.getServerParameters());
        Context context = getContext(activity);
        I6.a.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.INTERSTITIAL, maxAdapterResponseParameters, context), new I6.b() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.2
            @Override // x6.AbstractC4473d
            public void onAdFailedToLoad(C4481l c4481l) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(c4481l);
                GoogleMediationAdapter.this.log("Interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(maxError);
            }

            @Override // x6.AbstractC4473d
            public void onAdLoaded(I6.a aVar) {
                GoogleMediationAdapter.this.log("Interstitial ad loaded: " + thirdPartyAdPlacementId + "...");
                GoogleMediationAdapter.this.interstitialAd = aVar;
                GoogleMediationAdapter.this.interstitialAd.setFullScreenContentCallback(GoogleMediationAdapter.this.new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener));
                t responseInfo = GoogleMediationAdapter.this.interstitialAd.getResponseInfo();
                String strB = responseInfo != null ? responseInfo.b() : null;
                if (!AppLovinSdkUtils.isValidString(strB)) {
                    maxInterstitialAdapterListener.onInterstitialAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", strB);
                maxInterstitialAdapterListener.onInterstitialAdLoaded(bundle);
            }
        });
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        C4474e c4474e;
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(AbstractC3256n.h(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", " native ad for placement id: ", thirdPartyAdPlacementId, "..."));
        Context context = getContext(activity);
        C4476g c4476gCreateAdRequestWithParameters = createAdRequestWithParameters(zIsValidString, MaxAdFormat.NATIVE, maxAdapterResponseParameters, context);
        int adChoicesPlacement = getAdChoicesPlacement(maxAdapterResponseParameters);
        boolean zContains = BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters()).contains("medium");
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener);
        C4474e c4474e2 = new C4474e(context, thirdPartyAdPlacementId);
        try {
            c4474e = c4474e2;
        } catch (RemoteException e7) {
            e = e7;
            c4474e = c4474e2;
        }
        try {
            c4474e2.f47733b.zzj(new zzbma(4, false, -1, zContains, adChoicesPlacement, null, false, 0, 0, false, 1 - 1));
        } catch (RemoteException e10) {
            e = e10;
            l.g("Failed to specify native ad options", e);
            c4474e.b(nativeAdListener);
            c4474e.c(nativeAdListener);
            c4474e.a().a(c4476gCreateAdRequestWithParameters);
        }
        c4474e.b(nativeAdListener);
        c4474e.c(nativeAdListener);
        c4474e.a().a(c4476gCreateAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(AbstractC3256n.h(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "rewarded ad: ", thirdPartyAdPlacementId, "..."));
        updateMuteState(maxAdapterResponseParameters.getServerParameters());
        Context context = getContext(activity);
        R6.c.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.REWARDED, maxAdapterResponseParameters, context), new R6.d() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.4
            @Override // x6.AbstractC4473d
            public void onAdFailedToLoad(C4481l c4481l) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(c4481l);
                GoogleMediationAdapter.this.log("Rewarded ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(maxError);
            }

            @Override // x6.AbstractC4473d
            public void onAdLoaded(R6.c cVar) {
                GoogleMediationAdapter.this.log("Rewarded ad loaded: " + thirdPartyAdPlacementId + "...");
                GoogleMediationAdapter.this.rewardedAd = cVar;
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.rewardedAdListener = googleMediationAdapter.new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
                GoogleMediationAdapter.this.rewardedAd.setFullScreenContentCallback(GoogleMediationAdapter.this.rewardedAdListener);
                t responseInfo = GoogleMediationAdapter.this.rewardedAd.getResponseInfo();
                String strB = responseInfo != null ? responseInfo.b() : null;
                if (!AppLovinSdkUtils.isValidString(strB)) {
                    maxRewardedAdapterListener.onRewardedAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", strB);
                maxRewardedAdapterListener.onRewardedAdLoaded(bundle);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        log("Destroy called for adapter " + this);
        I6.a aVar = this.interstitialAd;
        if (aVar != null) {
            aVar.setFullScreenContentCallback(null);
            this.interstitialAd = null;
        }
        AbstractC4619b abstractC4619b = this.appOpenAd;
        if (abstractC4619b != null) {
            abstractC4619b.setFullScreenContentCallback(null);
            this.appOpenAd = null;
            this.appOpenAdListener = null;
        }
        R6.c cVar = this.rewardedAd;
        if (cVar != null) {
            cVar.setFullScreenContentCallback(null);
            this.rewardedAd = null;
            this.rewardedAdListener = null;
        }
        C4477h c4477h = this.adView;
        if (c4477h != null) {
            c4477h.a();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.nativeAd = null;
        }
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            zzbmp zzbmpVar = nativeAdView.f26336b;
            if (zzbmpVar != null) {
                try {
                    zzbmpVar.zze();
                } catch (RemoteException e7) {
                    l.d("Unable to destroy native ad view", e7);
                }
            }
            this.nativeAdView = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing app open ad: " + thirdPartyAdPlacementId + "...");
        AbstractC4619b abstractC4619b = this.appOpenAd;
        if (abstractC4619b != null) {
            abstractC4619b.show(activity);
            return;
        }
        log("App open ad failed to show: " + thirdPartyAdPlacementId);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad: " + thirdPartyAdPlacementId + "...");
        I6.a aVar = this.interstitialAd;
        if (aVar != null) {
            aVar.show(activity);
            return;
        }
        log("Interstitial ad failed to show: " + thirdPartyAdPlacementId);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad: " + thirdPartyAdPlacementId + "...");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show(activity, new aa.f(5, this, thirdPartyAdPlacementId));
            return;
        }
        log("Rewarded ad failed to show: " + thirdPartyAdPlacementId);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }
}
