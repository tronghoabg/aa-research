package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.o4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1084o4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        C1223z4.f14834W = (C1223z4.f14835X + 85) % 128;
        String strS0 = C1223z4.S0(campaignEx);
        int i5 = C1223z4.f14835X + 45;
        C1223z4.f14834W = i5 % 128;
        if (i5 % 2 == 0) {
            return strS0;
        }
        throw null;
    }
}
