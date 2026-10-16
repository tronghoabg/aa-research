package Va;

import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import java.util.ArrayList;

/* renamed from: Va.b2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0913b2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        RewardedListener rewardedListener = (RewardedListener) arrayList.get(1);
        int i5 = C0939d2.f14094U + 115;
        C0939d2.f14093T = i5 % 128;
        int i10 = i5 % 2;
        C0939d2.U0(rewardedAd, rewardedListener);
        if (i10 != 0) {
            throw null;
        }
        C0939d2.f14093T = (C0939d2.f14094U + 57) % 128;
        return null;
    }
}
