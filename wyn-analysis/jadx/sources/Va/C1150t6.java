package Va;

import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import java.util.ArrayList;

/* renamed from: Va.t6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1150t6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        int i5 = C1225z6.f14838T + 85;
        C1225z6.f14837S = i5 % 128;
        int i10 = i5 % 2;
        TJPlacementListener tJPlacementListenerF0 = C1225z6.F0(tJPlacement);
        if (i10 != 0) {
            int i11 = 72 / 0;
        }
        int i12 = C1225z6.f14837S + 83;
        C1225z6.f14838T = i12 % 128;
        if (i12 % 2 != 0) {
            return tJPlacementListenerF0;
        }
        throw null;
    }
}
