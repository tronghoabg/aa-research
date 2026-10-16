package Va;

import com.smaato.sdk.interstitial.InterstitialAdBase;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class X5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialAdBase interstitialAdBase = (InterstitialAdBase) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 123) % 128;
        String strH0 = C0995h6.H0(interstitialAdBase);
        int i5 = C0995h6.f14245T + 3;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return strH0;
        }
        throw null;
    }
}
