package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* loaded from: classes4.dex */
public final class N4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        int i5 = C1098p5.f14473U + 25;
        C1098p5.f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return C1098p5.R0(ad2, str);
        }
        C1098p5.R0(ad2, str);
        throw null;
    }
}
