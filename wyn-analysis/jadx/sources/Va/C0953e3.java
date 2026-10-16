package Va;

import com.five_corp.ad.FiveAdInterface;
import java.util.ArrayList;

/* renamed from: Va.e3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0953e3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        int i5 = C1044l3.f14349S + 19;
        C1044l3.f14350T = i5 % 128;
        if (i5 % 2 != 0) {
            return C1044l3.G0(fiveAdInterface);
        }
        C1044l3.G0(fiveAdInterface);
        throw null;
    }
}
