package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.t4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1148t4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        C1223z4.f14834W = (C1223z4.f14835X + 31) % 128;
        String strM0 = C1223z4.M0(campaignEx);
        int i5 = C1223z4.f14834W + 51;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 85 / 0;
        }
        return strM0;
    }
}
