package Va;

import com.smaato.sdk.interstitial.InterstitialAdBase;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class U5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialAdBase interstitialAdBase = (InterstitialAdBase) arrayList.get(0);
        C0995h6.f14246U = (C0995h6.f14245T + 1) % 128;
        String strO0 = C0995h6.O0(interstitialAdBase);
        int i5 = C0995h6.f14245T + 125;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return strO0;
        }
        throw null;
    }
}
