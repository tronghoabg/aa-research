package Va;

import com.fyber.FairBid;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class V2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        FairBid.AdsConfig adsConfig = (FairBid.AdsConfig) arrayList.get(0);
        C0901a3.f13969S = (C0901a3.f13970T + 47) % 128;
        String strV0 = C0901a3.V0(adsConfig);
        int i5 = C0901a3.f13970T + 65;
        C0901a3.f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 56 / 0;
        }
        return strV0;
    }
}
