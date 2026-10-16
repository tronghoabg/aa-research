package Va;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class O3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        int i5 = Z3.f13894X + 111;
        Z3.f13893W = i5 % 128;
        if (i5 % 2 != 0) {
            Z3.F0(campaignEx);
            throw null;
        }
        String strF0 = Z3.F0(campaignEx);
        int i10 = Z3.f13893W + 1;
        Z3.f13894X = i10 % 128;
        if (i10 % 2 != 0) {
            return strF0;
        }
        throw null;
    }
}
