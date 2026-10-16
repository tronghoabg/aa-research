package Va;

import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdRequest;
import java.util.ArrayList;

/* renamed from: Va.e1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0951e1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        C1196x1.f14761T = (C1196x1.f14762U + 79) % 128;
        ApsAdRequest apsAdRequestJ0 = C1196x1.J0(apsAd);
        C1196x1.f14762U = (C1196x1.f14761T + 99) % 128;
        return apsAdRequestJ0;
    }
}
