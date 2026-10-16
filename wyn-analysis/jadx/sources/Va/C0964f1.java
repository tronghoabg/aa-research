package Va;

import com.amazon.aps.ads.ApsAd;
import java.util.ArrayList;

/* renamed from: Va.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0964f1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        C1196x1.f14761T = (C1196x1.f14762U + 15) % 128;
        String strD0 = C1196x1.D0(apsAd);
        int i5 = C1196x1.f14761T + 85;
        C1196x1.f14762U = i5 % 128;
        if (i5 % 2 != 0) {
            return strD0;
        }
        throw null;
    }
}
