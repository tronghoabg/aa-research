package Va;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class T6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        int i5 = C0957e7.f14122T + 37;
        C0957e7.f14121S = i5 % 128;
        if (i5 % 2 != 0) {
            C0957e7.N0(rewardedAd);
            throw null;
        }
        AdInfo adInfoN0 = C0957e7.N0(rewardedAd);
        int i10 = C0957e7.f14122T + 99;
        C0957e7.f14121S = i10 % 128;
        if (i10 % 2 == 0) {
            return adInfoN0;
        }
        throw null;
    }
}
