package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.s4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1135s4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        int i5 = C1223z4.f14834W + 119;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            C1223z4.O0(campaignEx);
            throw null;
        }
        String strO0 = C1223z4.O0(campaignEx);
        C1223z4.f14835X = (C1223z4.f14834W + 93) % 128;
        return strO0;
    }
}
