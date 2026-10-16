package Va;

import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class E6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        UnifiedInterstitialAD unifiedInterstitialAD = (UnifiedInterstitialAD) arrayList.get(0);
        int i5 = F6.f13333U + 37;
        F6.f13332T = i5 % 128;
        if (i5 % 2 == 0) {
            return F6.E0(unifiedInterstitialAD);
        }
        F6.E0(unifiedInterstitialAD);
        throw null;
    }
}
