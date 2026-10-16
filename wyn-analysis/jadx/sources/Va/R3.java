package Va;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class R3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        int i5 = Z3.f13894X + 95;
        Z3.f13893W = i5 % 128;
        int i10 = i5 % 2;
        int iJ0 = Z3.J0(campaignEx);
        if (i10 != 0) {
            int i11 = 19 / 0;
        }
        int i12 = Z3.f13894X + 9;
        Z3.f13893W = i12 % 128;
        if (i12 % 2 == 0) {
            return Integer.valueOf(iJ0);
        }
        throw null;
    }
}
