package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.r4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1122r4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        int i5 = C1223z4.f14835X + 41;
        C1223z4.f14834W = i5 % 128;
        if (i5 % 2 != 0) {
            C1223z4.T0(campaignEx);
            throw null;
        }
        int iT0 = C1223z4.T0(campaignEx);
        C1223z4.f14834W = (C1223z4.f14835X + 95) % 128;
        return Integer.valueOf(iT0);
    }
}
