package Va;

import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class U6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        RewardedAdEventListener rewardedAdEventListener = (RewardedAdEventListener) arrayList.get(1);
        C0957e7.f14121S = (C0957e7.f14122T + 33) % 128;
        C0957e7.M0(rewardedAd, rewardedAdEventListener);
        int i5 = C0957e7.f14122T + 73;
        C0957e7.f14121S = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
