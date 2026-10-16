package Va;

import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import java.util.ArrayList;

/* renamed from: Va.t5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1149t5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        PresageInterstitial presageInterstitial = (PresageInterstitial) arrayList.get(0);
        PresageInterstitialCallback presageInterstitialCallback = (PresageInterstitialCallback) arrayList.get(1);
        C1175v5.f14698U = (C1175v5.f14697T + 95) % 128;
        C1175v5.G0(presageInterstitial, presageInterstitialCallback);
        int i5 = C1175v5.f14698U + 13;
        C1175v5.f14697T = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
