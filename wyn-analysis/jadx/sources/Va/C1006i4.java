package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.i4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1006i4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        C1223z4.f14834W = (C1223z4.f14835X + 99) % 128;
        String strQ0 = C1223z4.Q0(campaignEx);
        int i5 = C1223z4.f14834W + 125;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return strQ0;
        }
        throw null;
    }
}
