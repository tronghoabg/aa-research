package Va;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import java.util.ArrayList;

/* renamed from: Va.d7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0944d7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        C0957e7.f14121S = (C0957e7.f14122T + 55) % 128;
        AdInfo adInfoK0 = C0957e7.K0(interstitialAd);
        C0957e7.f14121S = (C0957e7.f14122T + 99) % 128;
        return adInfoK0;
    }
}
