package Va;

import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class S6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialAdEventListener interstitialAdEventListener = (InterstitialAdEventListener) arrayList.get(1);
        C0957e7.f14121S = (C0957e7.f14122T + 105) % 128;
        C0957e7.I0(interstitialAd, interstitialAdEventListener);
        C0957e7.f14121S = (C0957e7.f14122T + 119) % 128;
        return null;
    }
}
