package Va;

import com.google.android.gms.ads.reward.RewardItem;
import java.util.ArrayList;

/* renamed from: Va.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1157u0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 81) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, RewardItem.class);
        W0.f13813U = (W0.f13812T + 11) % 128;
        return ((RewardItem) objU).getType();
    }
}
