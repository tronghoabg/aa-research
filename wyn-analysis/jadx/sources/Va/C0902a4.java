package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.a4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0902a4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        C1223z4.f14835X = (C1223z4.f14834W + 25) % 128;
        String strF0 = C1223z4.F0(campaignEx);
        int i5 = C1223z4.f14835X + 57;
        C1223z4.f14834W = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 9 / 0;
        }
        return strF0;
    }
}
