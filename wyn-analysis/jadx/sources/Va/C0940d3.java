package Va;

import com.five_corp.ad.FiveAdInterface;
import java.util.ArrayList;

/* renamed from: Va.d3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0940d3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        C1044l3.f14350T = (C1044l3.f14349S + 61) % 128;
        String strE0 = C1044l3.E0(fiveAdInterface);
        int i5 = C1044l3.f14350T + 65;
        C1044l3.f14349S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 58 / 0;
        }
        return strE0;
    }
}
