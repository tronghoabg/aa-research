package Va;

import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class L2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        int i5 = C0901a3.f13970T + 31;
        C0901a3.f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            C0901a3.N0(impressionData);
            throw null;
        }
        PlacementType placementTypeN0 = C0901a3.N0(impressionData);
        int i10 = C0901a3.f13970T + 27;
        C0901a3.f13969S = i10 % 128;
        if (i10 % 2 == 0) {
            return placementTypeN0;
        }
        throw null;
    }
}
