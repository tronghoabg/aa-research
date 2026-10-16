package Va;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import java.util.ArrayList;

/* renamed from: Va.h3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0992h3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        C1044l3.f14349S = (C1044l3.f14350T + 53) % 128;
        FiveAdListener fiveAdListenerD0 = C1044l3.D0(fiveAdInterface);
        int i5 = C1044l3.f14350T + 77;
        C1044l3.f14349S = i5 % 128;
        if (i5 % 2 == 0) {
            return fiveAdListenerD0;
        }
        throw null;
    }
}
