package Va;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdLoadListener;
import java.util.ArrayList;

/* renamed from: Va.g3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0979g3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) arrayList.get(1);
        int i5 = C1044l3.f14349S + 15;
        C1044l3.f14350T = i5 % 128;
        int i10 = i5 % 2;
        C1044l3.N0(fiveAdInterface, fiveAdLoadListener);
        if (i10 == 0) {
            int i11 = 13 / 0;
        }
        C1044l3.f14349S = (C1044l3.f14350T + 13) % 128;
        return null;
    }
}
