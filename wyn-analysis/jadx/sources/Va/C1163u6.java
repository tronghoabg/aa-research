package Va;

import com.tapjoy.TJPlacement;
import java.util.ArrayList;

/* renamed from: Va.u6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1163u6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        int i5 = C1225z6.f14838T + 93;
        C1225z6.f14837S = i5 % 128;
        if (i5 % 2 == 0) {
            return C1225z6.J0(tJPlacement);
        }
        C1225z6.J0(tJPlacement);
        throw null;
    }
}
