package Va;

import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import java.util.ArrayList;

/* renamed from: Va.r5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1123r5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        OguryRewardedAd oguryRewardedAd = (OguryRewardedAd) arrayList.get(0);
        OguryRewardedAdListener oguryRewardedAdListener = (OguryRewardedAdListener) arrayList.get(1);
        int i5 = C1136s5.f14568T + 25;
        C1136s5.f14567S = i5 % 128;
        int i10 = i5 % 2;
        C1136s5.F0(oguryRewardedAd, oguryRewardedAdListener);
        if (i10 != 0) {
            throw null;
        }
        C1136s5.f14568T = (C1136s5.f14567S + 1) % 128;
        return null;
    }
}
