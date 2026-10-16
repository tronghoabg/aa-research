package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.x4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1199x4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        C1223z4.f14834W = (C1223z4.f14835X + 15) % 128;
        String strG0 = C1223z4.G0(campaignEx);
        C1223z4.f14835X = (C1223z4.f14834W + 81) % 128;
        return strG0;
    }
}
