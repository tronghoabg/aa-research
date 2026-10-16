package Va;

import com.mbridge.msdk.out.RewardInfo;
import java.util.ArrayList;

/* renamed from: Va.h4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0993h4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardInfo rewardInfo = (RewardInfo) arrayList.get(0);
        C1223z4.f14835X = (C1223z4.f14834W + 71) % 128;
        String strZ0 = C1223z4.Z0(rewardInfo);
        int i5 = C1223z4.f14834W + 23;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 95 / 0;
        }
        return strZ0;
    }
}
