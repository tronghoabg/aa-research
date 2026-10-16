package Va;

import android.net.Uri;
import com.amazon.device.ads.DTBFetchFactory;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.ArrayList;
import x6.C4477h;
import z6.AbstractC4619b;

/* loaded from: classes4.dex */
public final class J0 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13443a;

    public /* synthetic */ J0(int i5) {
        this.f13443a = i5;
    }

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        switch (this.f13443a) {
            case 0:
                W0.f13813U = (W0.f13812T + 63) % 128;
                Object objU = AbstractC1104pb.U(arrayList, 0, AbstractC4619b.class);
                int i5 = W0.f13812T + 85;
                W0.f13813U = i5 % 128;
                if (i5 % 2 != 0) {
                    return ((AbstractC4619b) objU).getResponseInfo();
                }
                throw null;
            case 1:
                W0.f13812T = (W0.f13813U + 83) % 128;
                Object objU2 = AbstractC1104pb.U(arrayList, 0, y6.c.class);
                int i10 = W0.f13812T + 119;
                W0.f13813U = i10 % 128;
                if (i10 % 2 != 0) {
                    return ((y6.c) objU2).getAdUnitId();
                }
                throw null;
            case 2:
                W0.f13813U = (W0.f13812T + 35) % 128;
                Object objU3 = AbstractC1104pb.U(arrayList, 0, NativeAdView.class);
                W0.f13812T = (W0.f13813U + 85) % 128;
                return ((NativeAdView) objU3).getCallToActionView();
            case 3:
                W0.f13812T = (W0.f13813U + 51) % 128;
                Object objU4 = AbstractC1104pb.U(arrayList, 0, y6.c.class);
                W0.f13813U = (W0.f13812T + 57) % 128;
                return ((y6.c) objU4).getAdListener();
            case 4:
                W0.f13813U = (W0.f13812T + 25) % 128;
                Object objU5 = AbstractC1104pb.U(arrayList, 0, NativeAdView.class);
                int i11 = W0.f13812T + 105;
                W0.f13813U = i11 % 128;
                if (i11 % 2 != 0) {
                    return ((NativeAdView) objU5).getBodyView();
                }
                throw null;
            case 5:
                W0.f13813U = (W0.f13812T + 79) % 128;
                Object objU6 = AbstractC1104pb.U(arrayList, 0, y6.c.class);
                int i12 = W0.f13812T + 11;
                W0.f13813U = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 49 / 0;
                }
                W0.f13813U = (W0.f13812T + 119) % 128;
                Object objU7 = AbstractC1104pb.U(arrayList, 1, AdListener.class);
                W0.f13813U = (W0.f13812T + 83) % 128;
                ((y6.c) objU6).setAdListener((AdListener) objU7);
                return null;
            case 6:
                W0.f13813U = (W0.f13812T + 23) % 128;
                Object objU8 = AbstractC1104pb.U(arrayList, 0, NativeAdView.class);
                int i14 = W0.f13813U + 79;
                W0.f13812T = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 57 / 0;
                }
                return ((NativeAdView) objU8).getAdvertiserView();
            case 7:
                W0.f13813U = (W0.f13812T + 51) % 128;
                Object objU9 = AbstractC1104pb.U(arrayList, 0, NativeAdView.class);
                W0.f13813U = (W0.f13812T + 55) % 128;
                return ((NativeAdView) objU9).getMediaView();
            case 8:
                int i16 = W0.f13812T + 37;
                W0.f13813U = i16 % 128;
                int i17 = i16 % 2;
                Object objU10 = AbstractC1104pb.U(arrayList, 0, NativeAdView.class);
                int i18 = W0.f13813U + 79;
                W0.f13812T = i18 % 128;
                if (i18 % 2 == 0) {
                    return ((NativeAdView) objU10).getIconView();
                }
                throw null;
            case 9:
                int i19 = W0.f13813U + 27;
                W0.f13812T = i19 % 128;
                int i20 = i19 % 2;
                return ((NativeAdView) AbstractC1104pb.U(arrayList, 0, NativeAdView.class)).getImageView();
            case 10:
                int i21 = W0.f13812T + 19;
                W0.f13813U = i21 % 128;
                Object objU11 = AbstractC1104pb.U(arrayList, i21 % 2 == 0 ? 1 : 0, NativeAdView.class);
                W0.f13813U = (W0.f13812T + 99) % 128;
                return ((NativeAdView) objU11).getHeadlineView();
            case 11:
                int i22 = W0.f13812T + 63;
                W0.f13813U = i22 % 128;
                int i23 = i22 % 2;
                Object objU12 = AbstractC1104pb.U(arrayList, 0, C4477h.class);
                int i24 = W0.f13813U + 47;
                W0.f13812T = i24 % 128;
                if (i24 % 2 == 0) {
                    return ((C4477h) objU12).getAdSize();
                }
                throw null;
            case 12:
                int i25 = W0.f13812T + 33;
                W0.f13813U = i25 % 128;
                int i26 = i25 % 2;
                Object objU13 = AbstractC1104pb.U(arrayList, 0, NativeAdView.class);
                W0.f13812T = (W0.f13813U + 125) % 128;
                return ((NativeAdView) objU13).getStoreView();
            case 13:
                int i27 = W0.f13812T + 125;
                W0.f13813U = i27 % 128;
                int i28 = i27 % 2;
                return ((C4477h) AbstractC1104pb.U(arrayList, 0, C4477h.class)).getAdUnitId();
            case 14:
                W0.f13812T = (W0.f13813U + 7) % 128;
                Object objU14 = AbstractC1104pb.U(arrayList, 0, NativeAdView.class);
                int i29 = W0.f13812T + 1;
                W0.f13813U = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 7 / 0;
                }
                return ((NativeAdView) objU14).getPriceView();
            case 15:
                int i31 = W0.f13812T + 109;
                W0.f13813U = i31 % 128;
                return ((NativeAdView) AbstractC1104pb.U(arrayList, i31 % 2 == 0 ? 1 : 0, NativeAdView.class)).getStarRatingView();
            case 16:
                int i32 = W0.f13812T + 67;
                W0.f13813U = i32 % 128;
                Object objU15 = AbstractC1104pb.U(arrayList, i32 % 2 == 0 ? 1 : 0, C4477h.class);
                W0.f13812T = (W0.f13813U + 95) % 128;
                return ((C4477h) objU15).getAdListener();
            case 17:
                W0.f13812T = (W0.f13813U + 95) % 128;
                Object objU16 = AbstractC1104pb.U(arrayList, 0, C4477h.class);
                int i33 = W0.f13813U + 123;
                int i34 = i33 % 128;
                W0.f13812T = i34;
                if (i33 % 2 != 0) {
                    int i35 = 58 / 0;
                }
                W0.f13813U = (i34 + 57) % 128;
                Object objU17 = AbstractC1104pb.U(arrayList, 1, AdListener.class);
                W0.f13812T = (W0.f13813U + 3) % 128;
                ((C4477h) objU16).setAdListener((AdListener) objU17);
                return null;
            case 18:
                C1196x1.f14762U = (C1196x1.f14761T + 121) % 128;
                DTBFetchFactory dTBFetchFactoryC0 = C1196x1.C0();
                int i36 = C1196x1.f14761T + 33;
                C1196x1.f14762U = i36 % 128;
                if (i36 % 2 != 0) {
                    return dTBFetchFactoryC0;
                }
                throw null;
            case 19:
                C1196x1.f14762U = (C1196x1.f14761T + 93) % 128;
                String strH0 = C1196x1.H0();
                C1196x1.f14762U = (C1196x1.f14761T + 49) % 128;
                return strH0;
            case 20:
                AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) arrayList.get(0);
                int i37 = E1.f13300U + 125;
                int i38 = i37 % 128;
                E1.f13299T = i38;
                if (i37 % 2 != 0) {
                    int i39 = i38 + 113;
                    E1.f13300U = i39 % 128;
                    int i40 = i39 % 2;
                    appLovinNativeAdImpl.getIconUri();
                    if (i40 != 0) {
                        throw null;
                    }
                    throw null;
                }
                int i41 = i38 + 113;
                E1.f13300U = i41 % 128;
                if (i41 % 2 == 0) {
                    appLovinNativeAdImpl.getIconUri();
                    throw null;
                }
                Uri iconUri = appLovinNativeAdImpl.getIconUri();
                int i42 = E1.f13299T + 59;
                E1.f13300U = i42 % 128;
                if (i42 % 2 == 0) {
                    int i43 = 81 / 0;
                }
                return iconUri;
            case 21:
                AppLovinNativeAdImpl appLovinNativeAdImpl2 = (AppLovinNativeAdImpl) arrayList.get(0);
                AppLovinNativeAdEventListener appLovinNativeAdEventListener = (AppLovinNativeAdEventListener) arrayList.get(1);
                int i44 = E1.f13299T + 77;
                int i45 = i44 % 128;
                E1.f13300U = i45;
                if (i44 % 2 == 0) {
                    E1.f13299T = (i45 + 95) % 128;
                    appLovinNativeAdImpl2.setEventListener(appLovinNativeAdEventListener);
                    E1.f13300U = (E1.f13299T + 57) % 128;
                    int i46 = 84 / 0;
                } else {
                    E1.f13299T = (i45 + 95) % 128;
                    appLovinNativeAdImpl2.setEventListener(appLovinNativeAdEventListener);
                    E1.f13300U = (E1.f13299T + 57) % 128;
                }
                E1.f13300U = (E1.f13299T + 55) % 128;
                return null;
            case 22:
                AppLovinInterstitialAdDialog appLovinInterstitialAdDialog = (AppLovinInterstitialAdDialog) arrayList.get(0);
                AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = (AppLovinAdVideoPlaybackListener) arrayList.get(1);
                int i47 = E1.f13299T + 61;
                E1.f13300U = i47 % 128;
                int i48 = i47 % 2;
                E1.P0(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
                if (i48 == 0) {
                    throw null;
                }
                int i49 = E1.f13299T + 83;
                E1.f13300U = i49 % 128;
                if (i49 % 2 != 0) {
                    return null;
                }
                throw null;
            case 23:
                AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
                E1.f13299T = (E1.f13300U + 53) % 128;
                AppLovinAdSize appLovinAdSizeF0 = E1.F0(appLovinAd);
                E1.f13300U = (E1.f13299T + 49) % 128;
                return appLovinAdSizeF0;
            case 24:
                AppLovinAd appLovinAd2 = (AppLovinAd) arrayList.get(0);
                E1.f13300U = (E1.f13299T + 25) % 128;
                long jG0 = E1.G0(appLovinAd2);
                int i50 = E1.f13300U + 55;
                E1.f13299T = i50 % 128;
                if (i50 % 2 != 0) {
                    int i51 = 66 / 0;
                }
                return Long.valueOf(jG0);
            case 25:
                AppLovinAd appLovinAd3 = (AppLovinAd) arrayList.get(0);
                int i52 = E1.f13300U + 25;
                E1.f13299T = i52 % 128;
                if (i52 % 2 == 0) {
                    return E1.H0(appLovinAd3);
                }
                E1.H0(appLovinAd3);
                throw null;
            case 26:
                AppLovinAd appLovinAd4 = (AppLovinAd) arrayList.get(0);
                int i53 = E1.f13299T + 79;
                E1.f13300U = i53 % 128;
                if (i53 % 2 == 0) {
                    int i54 = E1.f13299T + 45;
                    E1.f13300U = i54 % 128;
                    int i55 = i54 % 2;
                    appLovinAd4.getType();
                    if (i55 != 0) {
                        throw null;
                    }
                    throw null;
                }
                int i56 = E1.f13299T + 45;
                E1.f13300U = i56 % 128;
                if (i56 % 2 == 0) {
                    appLovinAd4.getType();
                    throw null;
                }
                AppLovinAdType type = appLovinAd4.getType();
                E1.f13299T = (E1.f13300U + 117) % 128;
                return type;
            case 27:
                AppLovinAd appLovinAd5 = (AppLovinAd) arrayList.get(0);
                int i57 = E1.f13300U + 87;
                E1.f13299T = i57 % 128;
                if (i57 % 2 != 0) {
                    E1.E0(appLovinAd5);
                    throw null;
                }
                boolean zE0 = E1.E0(appLovinAd5);
                int i58 = E1.f13299T + 89;
                E1.f13300U = i58 % 128;
                if (i58 % 2 != 0) {
                    return Boolean.valueOf(zE0);
                }
                throw null;
            case 28:
                AppLovinAdView appLovinAdView = (AppLovinAdView) arrayList.get(0);
                int i59 = E1.f13299T + 93;
                E1.f13300U = i59 % 128;
                if (i59 % 2 == 0) {
                    E1.N0(appLovinAdView);
                    throw null;
                }
                AdViewController adViewControllerN0 = E1.N0(appLovinAdView);
                int i60 = E1.f13300U + 85;
                E1.f13299T = i60 % 128;
                if (i60 % 2 == 0) {
                    return adViewControllerN0;
                }
                throw null;
            default:
                MaxAd maxAd = (MaxAd) arrayList.get(0);
                int i61 = E1.f13299T + 85;
                E1.f13300U = i61 % 128;
                int i62 = i61 % 2;
                String strI0 = E1.I0(maxAd);
                if (i62 == 0) {
                    int i63 = 57 / 0;
                }
                int i64 = E1.f13300U + 87;
                E1.f13299T = i64 % 128;
                if (i64 % 2 == 0) {
                    return strI0;
                }
                throw null;
        }
    }
}
