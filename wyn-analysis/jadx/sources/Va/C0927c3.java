package Va;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdViewEventListener;
import java.util.ArrayList;

/* renamed from: Va.c3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0927c3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) arrayList.get(1);
        C1044l3.f14350T = (C1044l3.f14349S + 1) % 128;
        C1044l3.K0(fiveAdInterface, fiveAdViewEventListener);
        int i5 = C1044l3.f14349S + 1;
        C1044l3.f14350T = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
