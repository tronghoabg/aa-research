package com.bytedance.sdk.openadsdk.lw;

import android.text.TextUtils;
import com.bytedance.sdk.component.bcc.oa.yo;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.reward.bs;
import com.bytedance.sdk.openadsdk.component.reward.cz;
import com.bytedance.sdk.openadsdk.component.reward.ivm;
import com.bytedance.sdk.openadsdk.component.reward.xs;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm.bcc;
import com.bytedance.sdk.openadsdk.uef.oa.lw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.oa;

/* loaded from: classes3.dex */
public class uef implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.lw.uef.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.uef.uef.uef(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.uef.uef.uef(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.uef.uef.uef uefVar = new com.bytedance.sdk.openadsdk.uef.uef.uef(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.uef.uef.uef(new yo("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.lw.uef.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sy.moa().ab() && gb.pz()) {
                            uefVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.uef.uef.uef(uefVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iMoa = af.moa(sy.uef());
                            int iXs = af.xs(sy.uef());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iMoa || adSize.getWidth() <= 0 || height > iXs || height < 0) {
                                uefVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            uefVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            bcc.uef(sy.uef()).uef(adSlotBuild, 1, uefVar);
                        }
                    }
                }, uefVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.lw.uef.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.uef.uef.uef(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.uef.uef.uef(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.uef.yo.uef uefVar = new com.bytedance.sdk.openadsdk.uef.yo.uef(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.uef.uef.uef(new yo("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.lw.uef.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sy.moa().ab() && gb.pz()) {
                            uefVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.uef.uef.uef(uefVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            uefVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            if (oa.yo()) {
                                xs.uef(sy.uef()).uef(adSlotBuild, (AdSlot) new com.bytedance.sdk.openadsdk.component.yo.oa(uefVar));
                            } else {
                                ivm.uef(sy.uef()).uef(adSlotBuild, new com.bytedance.sdk.openadsdk.component.yo.oa(uefVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, uefVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.lw.uef.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.uef.uef.uef(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final lw lwVar = new lw(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.uef.uef.uef(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.uef.uef.uef(new yo("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.lw.uef.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sy.moa().ab() && gb.pz()) {
                            lwVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.uef.uef.uef(lwVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            lwVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.oa.uef.uef().uef(sy.uef(), adSlotBuild, lwVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, lwVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.lw.uef.1

            /* renamed from: oa, reason: collision with root package name */
            private int f25933oa;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.uef.uef.uef(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.uef.uef.uef(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.f25933oa = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.uef.moa.uef uefVar = new com.bytedance.sdk.openadsdk.uef.moa.uef(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.uef.uef.uef(new yo("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.lw.uef.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!sy.moa().ab() && gb.pz()) {
                                uefVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.uef.uef.uef(uefVar)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                uefVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                com.bytedance.sdk.openadsdk.component.xs.uef(sy.uef()).uef(adSlotBuild, uefVar, AnonymousClass1.this.f25933oa);
                            }
                        } catch (Throwable th) {
                            dhk.uef("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, uefVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.lw.uef.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.uef.uef.uef(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.uef.uef.uef(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.uef.lw.oa oaVar = new com.bytedance.sdk.openadsdk.uef.lw.oa(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.uef.uef.uef(new yo("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.lw.uef.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sy.moa().ab() && gb.pz()) {
                            oaVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.uef.uef.uef(oaVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            oaVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            if (oa.yo()) {
                                com.bytedance.sdk.openadsdk.component.reward.sy.uef(sy.uef()).uef(adSlotBuild, (AdSlot) new cz(oaVar));
                            } else {
                                bs.uef(sy.uef()).uef(adSlotBuild, new cz(oaVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, oaVar, adSlotBuild);
            }
        };
    }
}
