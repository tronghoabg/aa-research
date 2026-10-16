package Va;

import com.google.android.gms.ads.reward.RewardedVideoAd;
import java.util.ArrayList;

/* renamed from: Va.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1002i0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13812T = (W0.f13813U + 121) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, RewardedVideoAd.class);
        int i5 = W0.f13812T + 103;
        W0.f13813U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 1 / 0;
        }
        return ((RewardedVideoAd) objU).getRewardedVideoAdListener();
    }
}
