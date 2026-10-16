package Va;

import com.mintegral.msdk.base.entity.CampaignEx;
import com.mintegral.msdk.reward.player.MTGRewardVideoActivity;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class T3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MTGRewardVideoActivity mTGRewardVideoActivity = (MTGRewardVideoActivity) arrayList.get(0);
        Z3.f13893W = (Z3.f13894X + 37) % 128;
        CampaignEx campaignExM0 = Z3.M0(mTGRewardVideoActivity);
        Z3.f13894X = (Z3.f13893W + 55) % 128;
        return campaignExM0;
    }
}
