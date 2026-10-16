package Va;

import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class J2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        InterstitialListener interstitialListener = (InterstitialListener) arrayList.get(0);
        int i5 = C0901a3.f13969S + 27;
        C0901a3.f13970T = i5 % 128;
        int i10 = i5 % 2;
        C0901a3.W0(interstitialListener);
        if (i10 == 0) {
            int i11 = 85 / 0;
        }
        int i12 = C0901a3.f13969S + 115;
        C0901a3.f13970T = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
