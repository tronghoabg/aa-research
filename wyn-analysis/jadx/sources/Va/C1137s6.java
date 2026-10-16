package Va;

import com.tapjoy.TJPlacementData;
import java.util.ArrayList;

/* renamed from: Va.s6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1137s6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TJPlacementData tJPlacementData = (TJPlacementData) arrayList.get(0);
        C1225z6.f14838T = (C1225z6.f14837S + 19) % 128;
        String strK0 = C1225z6.K0(tJPlacementData);
        C1225z6.f14837S = (C1225z6.f14838T + 113) % 128;
        return strK0;
    }
}
