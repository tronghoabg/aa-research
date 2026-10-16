package Va;

import com.mbridge.msdk.out.RewardInfo;
import java.util.ArrayList;

/* renamed from: Va.j4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1019j4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardInfo rewardInfo = (RewardInfo) arrayList.get(0);
        int i5 = C1223z4.f14834W + 99;
        C1223z4.f14835X = i5 % 128;
        int i10 = i5 % 2;
        boolean zC1 = C1223z4.c1(rewardInfo);
        if (i10 == 0) {
            int i11 = 63 / 0;
        }
        C1223z4.f14835X = (C1223z4.f14834W + 51) % 128;
        return Boolean.valueOf(zC1);
    }
}
