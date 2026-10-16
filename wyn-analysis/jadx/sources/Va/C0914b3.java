package Va;

import com.five_corp.ad.FiveAdCustomLayout;
import java.util.ArrayList;

/* renamed from: Va.b3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0914b3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdCustomLayout fiveAdCustomLayout = (FiveAdCustomLayout) arrayList.get(0);
        int i5 = C1044l3.f14350T + 61;
        C1044l3.f14349S = i5 % 128;
        if (i5 % 2 == 0) {
            return C1044l3.M0(fiveAdCustomLayout);
        }
        C1044l3.M0(fiveAdCustomLayout);
        throw null;
    }
}
