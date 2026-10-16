package Va;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import java.util.ArrayList;

/* renamed from: Va.t3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1147t3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) arrayList.get(0);
        LevelPlayNativeAdListener levelPlayNativeAdListener = (LevelPlayNativeAdListener) arrayList.get(1);
        int i5 = C1186w3.f14728T + 117;
        C1186w3.f14729U = i5 % 128;
        int i10 = i5 % 2;
        C1186w3.I0(levelPlayNativeAd, levelPlayNativeAdListener);
        if (i10 == 0) {
            int i11 = 21 / 0;
        }
        int i12 = C1186w3.f14728T + 21;
        C1186w3.f14729U = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
