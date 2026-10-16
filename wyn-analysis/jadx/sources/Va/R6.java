package Va;

import com.yandex.mobile.ads.rewarded.Reward;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class R6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Reward reward = (Reward) arrayList.get(0);
        int i5 = C0957e7.f14122T + 75;
        C0957e7.f14121S = i5 % 128;
        int i10 = i5 % 2;
        int iJ0 = C0957e7.J0(reward);
        if (i10 != 0) {
            int i11 = 69 / 0;
        }
        int i12 = C0957e7.f14122T + 49;
        C0957e7.f14121S = i12 % 128;
        if (i12 % 2 == 0) {
            return Integer.valueOf(iJ0);
        }
        throw null;
    }
}
