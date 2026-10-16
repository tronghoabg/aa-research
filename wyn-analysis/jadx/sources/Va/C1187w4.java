package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.w4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1187w4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        int i5 = C1223z4.f14834W + 33;
        C1223z4.f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            C1223z4.J0(campaignEx);
            throw null;
        }
        String strJ0 = C1223z4.J0(campaignEx);
        int i10 = C1223z4.f14834W + 33;
        C1223z4.f14835X = i10 % 128;
        if (i10 % 2 != 0) {
            return strJ0;
        }
        throw null;
    }
}
