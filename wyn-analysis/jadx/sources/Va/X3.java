package Va;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class X3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        int i5 = Z3.f13893W + 59;
        Z3.f13894X = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(Z3.I0(campaignEx));
        }
        Z3.I0(campaignEx);
        throw null;
    }
}
