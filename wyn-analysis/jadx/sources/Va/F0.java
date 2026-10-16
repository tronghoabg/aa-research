package Va;

import com.google.android.gms.ads.reward.RewardItem;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class F0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13813U + 57;
        W0.f13812T = i5 % 128;
        int i10 = i5 % 2;
        return Integer.valueOf(((RewardItem) AbstractC1104pb.U(arrayList, 0, RewardItem.class)).getAmount());
    }
}
