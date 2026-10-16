package Va;

import com.five_corp.ad.FiveAdInterface;
import java.util.ArrayList;

/* renamed from: Va.j3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1018j3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        C1044l3.f14350T = (C1044l3.f14349S + 109) % 128;
        String strF0 = C1044l3.F0(fiveAdInterface);
        int i5 = C1044l3.f14349S + 55;
        C1044l3.f14350T = i5 % 128;
        if (i5 % 2 != 0) {
            return strF0;
        }
        throw null;
    }
}
