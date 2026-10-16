package Va;

import io.bidmachine.AdRequestParameters;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class X1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdRequestParameters adRequestParameters = (AdRequestParameters) arrayList.get(0);
        C0939d2.f14094U = (C0939d2.f14093T + 71) % 128;
        String strR0 = C0939d2.R0(adRequestParameters);
        int i5 = C0939d2.f14093T + 109;
        C0939d2.f14094U = i5 % 128;
        if (i5 % 2 != 0) {
            return strR0;
        }
        throw null;
    }
}
