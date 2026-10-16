package Va;

import com.smaato.sdk.interstitial.InterstitialAdBase;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class W5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialAdBase interstitialAdBase = (InterstitialAdBase) arrayList.get(0);
        int i5 = C0995h6.f14245T + 51;
        C0995h6.f14246U = i5 % 128;
        int i10 = i5 % 2;
        String strN1 = C0995h6.n1(interstitialAdBase);
        if (i10 == 0) {
            int i11 = 70 / 0;
        }
        C0995h6.f14245T = (C0995h6.f14246U + 5) % 128;
        return strN1;
    }
}
