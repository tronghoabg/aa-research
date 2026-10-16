package Va;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.five_corp.ad.FiveAd;
import com.fyber.fairbid.internal.Constants;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class B1 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13227a;

    public /* synthetic */ B1(int i5) {
        this.f13227a = i5;
    }

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Object objE0;
        int iH0;
        switch (this.f13227a) {
            case 0:
                AppLovinInterstitialAdDialog appLovinInterstitialAdDialog = (AppLovinInterstitialAdDialog) arrayList.get(0);
                AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) arrayList.get(1);
                int i5 = E1.f13299T + 13;
                E1.f13300U = i5 % 128;
                int i10 = i5 % 2;
                E1.L0(appLovinInterstitialAdDialog, appLovinAdClickListener);
                if (i10 == 0) {
                    throw null;
                }
                E1.f13299T = (E1.f13300U + 25) % 128;
                return null;
            case 1:
                AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
                int i11 = E1.f13300U + 73;
                E1.f13299T = i11 % 128;
                if (i11 % 2 != 0) {
                    E1.D0(appLovinAd);
                    throw null;
                }
                boolean zD0 = E1.D0(appLovinAd);
                int i12 = E1.f13299T + 25;
                E1.f13300U = i12 % 128;
                if (i12 % 2 != 0) {
                    return Boolean.valueOf(zD0);
                }
                throw null;
            case 2:
                Context context = (Context) arrayList.get(0);
                int i13 = E1.f13299T + 85;
                E1.f13300U = i13 % 128;
                int i14 = i13 % 2;
                AppLovinBroadcastManager appLovinBroadcastManagerO0 = E1.O0(context);
                if (i14 == 0) {
                    int i15 = 71 / 0;
                }
                E1.f13300U = (E1.f13299T + 111) % 128;
                return appLovinBroadcastManagerO0;
            case 3:
                AppLovinAd appLovinAd2 = (AppLovinAd) arrayList.get(0);
                int i16 = E1.f13299T + 3;
                E1.f13300U = i16 % 128;
                int i17 = i16 % 2;
                boolean zC0 = E1.C0(appLovinAd2);
                if (i17 == 0) {
                    int i18 = 45 / 0;
                }
                int i19 = E1.f13300U + 19;
                E1.f13299T = i19 % 128;
                if (i19 % 2 == 0) {
                    return Boolean.valueOf(zC0);
                }
                throw null;
            case 4:
                AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) arrayList.get(0);
                E1.f13300U = (E1.f13299T + 33) % 128;
                Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
                E1.f13300U = (E1.f13299T + 101) % 128;
                return mainImageUri;
            case 5:
                AppLovinCommunicatorMessage appLovinCommunicatorMessage = (AppLovinCommunicatorMessage) arrayList.get(0);
                int i20 = E1.f13299T + 23;
                E1.f13300U = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = E1.f13299T + 67;
                    E1.f13300U = i21 % 128;
                    if (i21 % 2 != 0) {
                        return appLovinCommunicatorMessage.getMessageData();
                    }
                    appLovinCommunicatorMessage.getMessageData();
                    throw null;
                }
                int i22 = E1.f13299T + 67;
                E1.f13300U = i22 % 128;
                int i23 = i22 % 2;
                appLovinCommunicatorMessage.getMessageData();
                if (i23 != 0) {
                    throw null;
                }
                throw null;
            case 6:
                K1.f13473S = (K1.f13474T + 17) % 128;
                boolean zD02 = K1.D0();
                K1.f13474T = (K1.f13473S + 59) % 128;
                return Boolean.valueOf(zD02);
            case 7:
                int i24 = K1.f13473S + 55;
                K1.f13474T = i24 % 128;
                if (i24 % 2 == 0) {
                    objE0 = K1.E0();
                    int i25 = 36 / 0;
                } else {
                    objE0 = K1.E0();
                }
                int i26 = K1.f13474T + 105;
                K1.f13473S = i26 % 128;
                if (i26 % 2 == 0) {
                    return objE0;
                }
                throw null;
            case 8:
                K1.f13474T = (K1.f13473S + 97) % 128;
                Object objC0 = K1.C0();
                int i27 = K1.f13473S + 55;
                K1.f13474T = i27 % 128;
                if (i27 % 2 != 0) {
                    return objC0;
                }
                throw null;
            case 9:
                int i28 = K1.f13474T;
                int i29 = i28 + 61;
                K1.f13473S = i29 % 128;
                if (i29 % 2 != 0) {
                    K1.f13473S = (i28 + 101) % 128;
                    boolean z2 = K1.C0() instanceof J1;
                    K1.f13474T = (K1.f13473S + 33) % 128;
                    throw null;
                }
                K1.f13473S = (i28 + 101) % 128;
                boolean z10 = K1.C0() instanceof J1;
                int i30 = (K1.f13473S + 33) % 128;
                K1.f13474T = i30;
                K1.f13473S = (i30 + 47) % 128;
                return Boolean.valueOf(z10);
            case 10:
                PAGRewardItem pAGRewardItem = (PAGRewardItem) arrayList.get(0);
                int i31 = (C0991h2.f14241T + 119) % 128;
                C0991h2.f14242U = i31;
                C0991h2.f14241T = (i31 + 61) % 128;
                String rewardName = pAGRewardItem.getRewardName();
                C0991h2.f14242U = (C0991h2.f14241T + 9) % 128;
                return rewardName;
            case 11:
                C0991h2.f14242U = (C0991h2.f14241T + 75) % 128;
                int iC0 = C0991h2.C0();
                int i32 = C0991h2.f14242U + 47;
                C0991h2.f14241T = i32 % 128;
                if (i32 % 2 != 0) {
                    int i33 = 64 / 0;
                }
                return Integer.valueOf(iC0);
            case 12:
                PAGRewardItem pAGRewardItem2 = (PAGRewardItem) arrayList.get(0);
                C0991h2.f14241T = (C0991h2.f14242U + 37) % 128;
                int rewardAmount = pAGRewardItem2.getRewardAmount();
                C0991h2.f14241T = (C0991h2.f14242U + 63) % 128;
                return Integer.valueOf(rewardAmount);
            case 13:
                PangleAd pangleAd = (PangleAd) arrayList.get(0);
                int i34 = (C0991h2.f14241T + 119) % 128;
                C0991h2.f14242U = i34;
                int i35 = i34 + 1;
                C0991h2.f14241T = i35 % 128;
                if (i35 % 2 != 0) {
                    pangleAd.getMediaExtraInfo();
                    throw null;
                }
                Map<String, Object> mediaExtraInfo = pangleAd.getMediaExtraInfo();
                int i36 = C0991h2.f14242U + 53;
                int i37 = i36 % 128;
                C0991h2.f14241T = i37;
                if (i36 % 2 != 0) {
                    int i38 = 59 / 0;
                }
                C0991h2.f14242U = (i37 + 113) % 128;
                return mediaExtraInfo;
            case 14:
                PAGBannerAd pAGBannerAd = (PAGBannerAd) arrayList.get(0);
                PAGBannerAdInteractionListener pAGBannerAdInteractionListener = (PAGBannerAdInteractionListener) arrayList.get(1);
                int i39 = C0991h2.f14242U + 89;
                C0991h2.f14241T = i39 % 128;
                int i40 = i39 % 2;
                C0991h2.F0(pAGBannerAd, pAGBannerAdInteractionListener);
                if (i40 == 0) {
                    return null;
                }
                throw null;
            case 15:
                PAGBannerAd pAGBannerAd2 = (PAGBannerAd) arrayList.get(0);
                int i41 = (C0991h2.f14241T + 109) % 128;
                C0991h2.f14242U = i41;
                int i42 = i41 + 1;
                C0991h2.f14241T = i42 % 128;
                if (i42 % 2 != 0) {
                    pAGBannerAd2.getBannerView();
                    throw null;
                }
                View bannerView = pAGBannerAd2.getBannerView();
                int i43 = C0991h2.f14241T + 79;
                C0991h2.f14242U = i43 % 128;
                if (i43 % 2 != 0) {
                    return bannerView;
                }
                throw null;
            case 16:
                C1082o2.f14451U = (C1082o2.f14450T + 45) % 128;
                DynamicLoader dynamicLoaderC0 = C1082o2.C0();
                C1082o2.f14450T = (C1082o2.f14451U + 91) % 128;
                return dynamicLoaderC0;
            case 17:
                int i44 = C1082o2.f14451U + 25;
                C1082o2.f14450T = i44 % 128;
                if (i44 % 2 != 0) {
                    C1082o2.E0();
                    throw null;
                }
                String strE0 = C1082o2.E0();
                int i45 = C1082o2.f14450T + 17;
                C1082o2.f14451U = i45 % 128;
                if (i45 % 2 != 0) {
                    return strE0;
                }
                throw null;
            case 18:
                int i46 = C1082o2.f14450T + 55;
                C1082o2.f14451U = i46 % 128;
                if (i46 % 2 == 0) {
                    C1082o2.D0();
                    throw null;
                }
                String strD0 = C1082o2.D0();
                C1082o2.f14451U = (C1082o2.f14450T + 43) % 128;
                return strD0;
            case 19:
                String str = (String) arrayList.get(0);
                int i47 = C1185w2.f14725U + 33;
                C1185w2.f14724T = i47 % 128;
                if (i47 % 2 != 0) {
                    C1185w2.D0(str);
                    throw null;
                }
                Object objD0 = C1185w2.D0(str);
                C1185w2.f14725U = (C1185w2.f14724T + 11) % 128;
                return objD0;
            case 20:
                int i48 = C1185w2.f14724T + 65;
                C1185w2.f14725U = i48 % 128;
                if (i48 % 2 != 0) {
                    return C1185w2.C0();
                }
                C1185w2.C0();
                throw null;
            case 21:
                String str2 = (String) arrayList.get(0);
                H2.f13402S = (H2.f13403T + 55) % 128;
                Enum enumG0 = H2.G0(str2);
                int i49 = H2.f13403T + 119;
                H2.f13402S = i49 % 128;
                if (i49 % 2 != 0) {
                    int i50 = 12 / 0;
                }
                return enumG0;
            case 22:
                String str3 = (String) arrayList.get(0);
                int i51 = H2.f13402S + 101;
                H2.f13403T = i51 % 128;
                int i52 = i51 % 2;
                Enum enumD0 = H2.D0(str3);
                if (i52 == 0) {
                    int i53 = 62 / 0;
                }
                return enumD0;
            case 23:
                String str4 = (String) arrayList.get(0);
                H2.f13403T = (H2.f13402S + 59) % 128;
                Enum enumF0 = H2.F0(str4);
                H2.f13402S = (H2.f13403T + 33) % 128;
                return enumF0;
            case 24:
                String str5 = (String) arrayList.get(0);
                C0901a3.f13969S = (C0901a3.f13970T + 29) % 128;
                Constants.AdType adTypeM0 = C0901a3.M0(str5);
                C0901a3.f13969S = (C0901a3.f13970T + 111) % 128;
                return adTypeM0;
            case 25:
                C0901a3.f13969S = (C0901a3.f13970T + 57) % 128;
                boolean zK0 = C0901a3.K0();
                C0901a3.f13970T = (C0901a3.f13969S + 111) % 128;
                return Boolean.valueOf(zK0);
            case 26:
                int i54 = C0901a3.f13970T + 27;
                C0901a3.f13969S = i54 % 128;
                if (i54 % 2 == 0) {
                    return C0901a3.H0();
                }
                C0901a3.H0();
                throw null;
            case 27:
                C1044l3.f14349S = (C1044l3.f14350T + 65) % 128;
                FiveAd fiveAdC0 = C1044l3.C0();
                C1044l3.f14349S = (C1044l3.f14350T + 61) % 128;
                return fiveAdC0;
            case 28:
                String str6 = (String) arrayList.get(0);
                int i55 = K3.f13478U + 5;
                K3.f13477T = i55 % 128;
                int i56 = i55 % 2;
                Enum enumE0 = K3.E0(str6);
                if (i56 != 0) {
                    int i57 = 56 / 0;
                }
                return enumE0;
            default:
                int i58 = K3.f13477T + 15;
                K3.f13478U = i58 % 128;
                if (i58 % 2 == 0) {
                    iH0 = K3.H0();
                    int i59 = 92 / 0;
                } else {
                    iH0 = K3.H0();
                }
                return Integer.valueOf(iH0);
        }
    }
}
