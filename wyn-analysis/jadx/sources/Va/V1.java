package Va;

import io.bidmachine.AdRequestParameters;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class V1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdRequestParameters adRequestParameters = (AdRequestParameters) arrayList.get(0);
        int i5 = C0939d2.f14094U + 75;
        C0939d2.f14093T = i5 % 128;
        if (i5 % 2 == 0) {
            return C0939d2.M0(adRequestParameters);
        }
        C0939d2.M0(adRequestParameters);
        throw null;
    }
}
