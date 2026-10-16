package Va;

import com.mbridge.msdk.out.RewardInfo;
import java.util.ArrayList;

/* renamed from: Va.g4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0980g4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RewardInfo rewardInfo = (RewardInfo) arrayList.get(0);
        C1223z4.f14834W = (C1223z4.f14835X + 53) % 128;
        String strV0 = C1223z4.V0(rewardInfo);
        int i5 = C1223z4.f14834W + 125;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return strV0;
        }
        throw null;
    }
}
