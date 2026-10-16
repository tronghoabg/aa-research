package Va;

import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.internal.Constants;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class K2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Constants.AdType adType = (Constants.AdType) arrayList.get(0);
        C0901a3.f13969S = (C0901a3.f13970T + 27) % 128;
        PlacementType placementTypeT0 = C0901a3.T0(adType);
        int i5 = C0901a3.f13969S + 41;
        C0901a3.f13970T = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 86 / 0;
        }
        return placementTypeT0;
    }
}
