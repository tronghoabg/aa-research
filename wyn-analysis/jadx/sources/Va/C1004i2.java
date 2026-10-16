package Va;

import com.facebook.ads.Ad;
import java.util.ArrayList;

/* renamed from: Va.i2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1004i2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        int i5 = C1082o2.f14451U + 105;
        C1082o2.f14450T = i5 % 128;
        if (i5 % 2 == 0) {
            return C1082o2.J0(ad2);
        }
        C1082o2.J0(ad2);
        throw null;
    }
}
