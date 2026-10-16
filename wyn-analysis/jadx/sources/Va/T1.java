package Va;

import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class T1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialListener interstitialListener = (InterstitialListener) arrayList.get(1);
        C0939d2.f14093T = (C0939d2.f14094U + 55) % 128;
        C0939d2.T0(interstitialAd, interstitialListener);
        C0939d2.f14094U = (C0939d2.f14093T + 119) % 128;
        return null;
    }
}
