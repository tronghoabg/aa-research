package Va;

import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.model.ApsAdFormat;
import java.util.ArrayList;

/* renamed from: Va.c1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0925c1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        int i5 = C1196x1.f14762U + 91;
        C1196x1.f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            C1196x1.L0(apsAd);
            throw null;
        }
        ApsAdFormat apsAdFormatL0 = C1196x1.L0(apsAd);
        int i10 = C1196x1.f14761T + 105;
        C1196x1.f14762U = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
        }
        return apsAdFormatL0;
    }
}
