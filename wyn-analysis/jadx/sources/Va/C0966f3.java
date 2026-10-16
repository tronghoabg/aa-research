package Va;

import com.five_corp.ad.FiveAdConfig;
import java.util.ArrayList;

/* renamed from: Va.f3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0966f3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdConfig fiveAdConfig = (FiveAdConfig) arrayList.get(0);
        C1044l3.f14350T = (C1044l3.f14349S + 3) % 128;
        String strJ0 = C1044l3.J0(fiveAdConfig);
        int i5 = C1044l3.f14350T + 117;
        C1044l3.f14349S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 52 / 0;
        }
        return strJ0;
    }
}
