package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.e4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0954e4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        int i5 = C1223z4.f14835X + 9;
        C1223z4.f14834W = i5 % 128;
        int i10 = i5 % 2;
        String strC0 = C1223z4.C0(campaignEx);
        if (i10 != 0) {
            int i11 = 27 / 0;
        }
        C1223z4.f14834W = (C1223z4.f14835X + 31) % 128;
        return strC0;
    }
}
