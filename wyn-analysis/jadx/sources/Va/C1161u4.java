package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.u4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1161u4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        C1223z4.f14835X = (C1223z4.f14834W + 81) % 128;
        String strL0 = C1223z4.L0(campaignEx);
        int i5 = C1223z4.f14834W + 83;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return strL0;
        }
        throw null;
    }
}
