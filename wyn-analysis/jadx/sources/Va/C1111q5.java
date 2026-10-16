package Va;

import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import java.util.ArrayList;

/* renamed from: Va.q5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1111q5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        OguryInterstitialAd oguryInterstitialAd = (OguryInterstitialAd) arrayList.get(0);
        OguryInterstitialAdListener oguryInterstitialAdListener = (OguryInterstitialAdListener) arrayList.get(1);
        C1136s5.f14567S = (C1136s5.f14568T + 27) % 128;
        C1136s5.D0(oguryInterstitialAd, oguryInterstitialAdListener);
        int i5 = C1136s5.f14568T + 101;
        C1136s5.f14567S = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
