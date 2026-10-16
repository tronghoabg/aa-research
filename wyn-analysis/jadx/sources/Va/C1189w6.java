package Va;

import com.tapjoy.TJPlacementData;
import java.util.ArrayList;

/* renamed from: Va.w6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1189w6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TJPlacementData tJPlacementData = (TJPlacementData) arrayList.get(0);
        C1225z6.f14838T = (C1225z6.f14837S + 51) % 128;
        String strD0 = C1225z6.D0(tJPlacementData);
        int i5 = C1225z6.f14837S + 57;
        C1225z6.f14838T = i5 % 128;
        if (i5 % 2 != 0) {
            return strD0;
        }
        throw null;
    }
}
