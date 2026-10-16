package Va;

import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdRequest;
import java.util.ArrayList;

/* renamed from: Va.t1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1145t1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        C1196x1.f14761T = (C1196x1.f14762U + 7) % 128;
        ApsAdRequest apsAdRequestS0 = C1196x1.S0(apsAd);
        int i5 = C1196x1.f14762U + 11;
        C1196x1.f14761T = i5 % 128;
        if (i5 % 2 == 0) {
            return apsAdRequestS0;
        }
        throw null;
    }
}
