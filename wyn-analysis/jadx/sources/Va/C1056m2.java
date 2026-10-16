package Va;

import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.ArrayList;

/* renamed from: Va.m2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1056m2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialAdListener interstitialAdListener = (InterstitialAdListener) arrayList.get(1);
        int i5 = C1082o2.f14451U + 45;
        C1082o2.f14450T = i5 % 128;
        int i10 = i5 % 2;
        C1082o2.K0(interstitialAd, interstitialAdListener);
        if (i10 == 0) {
            return null;
        }
        throw null;
    }
}
