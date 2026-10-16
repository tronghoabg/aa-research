package Va;

import com.amazon.aps.ads.ApsAd;
import java.util.ArrayList;

/* renamed from: Va.d1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0938d1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        int i5 = C1196x1.f14762U + 67;
        C1196x1.f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            C1196x1.Q0(apsAd);
            throw null;
        }
        String strQ0 = C1196x1.Q0(apsAd);
        int i10 = C1196x1.f14761T + 47;
        C1196x1.f14762U = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 23 / 0;
        }
        return strQ0;
    }
}
