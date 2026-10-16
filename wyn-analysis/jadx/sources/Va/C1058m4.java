package Va;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: Va.m4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1058m4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        C1223z4.f14834W = (C1223z4.f14835X + 5) % 128;
        int iR0 = C1223z4.R0(campaignEx);
        int i5 = C1223z4.f14835X + 87;
        C1223z4.f14834W = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(iR0);
        }
        throw null;
    }
}
