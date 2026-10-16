package Va;

import com.qq.e.ads.rewardvideo.RewardVideoAD;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class C6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardVideoAD rewardVideoAD = (RewardVideoAD) arrayList.get(0);
        int i5 = F6.f13333U + 39;
        F6.f13332T = i5 % 128;
        if (i5 % 2 == 0) {
            return F6.J0(rewardVideoAD);
        }
        F6.J0(rewardVideoAD);
        throw null;
    }
}
